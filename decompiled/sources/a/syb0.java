package a;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class syb0 extends qtn {
    final /* synthetic */ tyb0 this$0;

    public static final class a extends qtn {
        final /* synthetic */ tyb0 this$0;

        public a(tyb0 tyb0Var) {
            this.this$0 = tyb0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            tyb0 tyb0Var = this.this$0;
            int i = tyb0Var.f34745a + 1;
            tyb0Var.f34745a = i;
            if (i == 1 && tyb0Var.d) {
                tyb0Var.f.d(kkz.ON_START);
                tyb0Var.d = false;
            }
        }
    }

    public syb0(tyb0 tyb0Var) {
        this.this$0 = tyb0Var;
    }

    @Override // a.qtn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = ylf0.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((ylf0) fragmentFindFragmentByTag).f42838a = this.this$0.h;
        }
    }

    @Override // a.qtn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        tyb0 tyb0Var = this.this$0;
        int i = tyb0Var.b - 1;
        tyb0Var.b = i;
        if (i == 0) {
            Handler handler = tyb0Var.e;
            handler.getClass();
            handler.postDelayed(tyb0Var.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        sf3.v(activity, new a(this.this$0));
    }

    @Override // a.qtn, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        tyb0 tyb0Var = this.this$0;
        int i = tyb0Var.f34745a - 1;
        tyb0Var.f34745a = i;
        if (i == 0 && tyb0Var.c) {
            tyb0Var.f.d(kkz.ON_STOP);
            tyb0Var.d = true;
        }
    }
}
