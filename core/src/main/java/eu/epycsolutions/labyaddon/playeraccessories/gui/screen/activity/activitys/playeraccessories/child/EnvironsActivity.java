package eu.epycsolutions.labyaddon.playeraccessories.gui.screen.activity.activitys.playeraccessories.child;

import net.labymod.api.client.gui.screen.Parent;
import net.labymod.api.client.gui.screen.activity.Activity;
import net.labymod.api.client.gui.screen.activity.AutoActivity;
import net.labymod.api.client.gui.screen.activity.Link;
import net.labymod.api.client.gui.screen.activity.Links;

@AutoActivity
@Links({ @Link("activity/environs/environs.lss"), @Link("activity/sidebar-activity.lss") })
public class EnvironsActivity extends Activity {

  @Override
  public void initialize(Parent parent) {
    super.initialize(parent);
  }
}