package me.arasple.mc.trmenu.api.action.impl.hook.eco

import io.izzel.taboolib.internal.apache.lang3.math.NumberUtils
import me.arasple.mc.trmenu.api.action.base.Action
import me.arasple.mc.trmenu.modules.function.hook.HookInstance
import org.bukkit.entity.Player

/**
 * @author Arasple
 * @date 2020/3/8 21:24
 */
class ActionTakeMoney : Action("(take|remove|withdraw)(-)?(money|eco|coin)(s)?") {

    override fun onExecute(player: Player) = NumberUtils.toDouble(getContent(player), -1.0).let {
        if (it > 0) HookInstance.remove(player, it)
    }

}