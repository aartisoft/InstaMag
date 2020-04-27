package com.tac.github.instamag;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by tac on 9/3/17.
 */

public class AppApplication extends Application {
  @Override
  protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    MultiDex.install(this);
    
  }
}
