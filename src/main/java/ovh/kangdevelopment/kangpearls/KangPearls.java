package ovh.kangdevelopment.kangpearls;

import ovh.kangdevelopment.kangpearls.api.event.PlayerPearlRefundEvent;
import ovh.kangdevelopment.kangpearls.handler.CooldownHandler;
import ovh.kangdevelopment.kangpearls.hook.Hook;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * Represents the KangPearls main class
 */
public class KangPearls {

    /**
     * Get the instance of KangPearls
     *
     * @return instance of KangPearls
     */
    public static KangPearls getInstance() {
        throw new IllegalPluginAccessException("KangPearls not found");
    }

    /**
     * Get current hook of a plugin with
     * cooldown system
     *
     * @see Hook
     * @return current hook
     */
    public Hook getHook() {
        throw new IllegalPluginAccessException("KangPearls not found");
    }

    /**
     * Set the current hook for KangPearls
     *
     * @param hook Hook to change
     */
    public void setHook(Hook hook) {
        throw new IllegalPluginAccessException("KangPearls not found");
    }

    /**
     * Get cooldown handler
     *
     * @see CooldownHandler
     * @return cooldown handler
     */
    public CooldownHandler getCooldownHandler() {
        throw new IllegalPluginAccessException("KangPearls not found");
    }

    /**
     * Refund an ender pearl to player
     * <p>
     *     Removes cooldown if there is any and it's enabled
     *     Returns an ender pearl if it's enabled
     *     Sends "return" message to player
     *     Executes "return" console command with %player% placeholder
     *     Calls {@link PlayerPearlRefundEvent} if it's been used any where
     *
     *     @see PlayerPearlRefundEvent
     * </p>
     *
     * @param player Player to refund the pearl to
     */
    public void refundPearl(Player player) {
        throw new IllegalPluginAccessException("KangPearls not found");
    }

    /**
     * Reloads config of KangPearls
     * <p>
     *     Reloads config options
     *     Reloads config comments and header
     * </p>
     */
    public void reloadConfig() {
        throw new IllegalPluginAccessException("KangPearls not found");
    }

}
