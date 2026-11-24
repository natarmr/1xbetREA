package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class bg60 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ag60 f2540a;

    public bg60(ag60 ag60Var) {
        this.f2540a = ag60Var;
    }

    public final void onBackCancelled() {
        ag60 ag60Var = this.f2540a;
        ye50 ye50Var = ag60Var.f7705a;
        if (ye50Var == null) {
            return;
        }
        if (!ag60Var.b) {
            ye50Var.e(ag60Var, null);
        }
        ye50Var.d();
        if (ye50Var.i()) {
            ff50 ff50Var = ye50Var.e;
            ff50Var.getClass();
            if (ag60Var.equals(ff50Var.h) && -1 == ff50Var.g) {
                af50 af50VarC = ff50Var.f;
                if (af50VarC == null) {
                    af50VarC = ff50Var.c(-1);
                }
                ff50Var.f = null;
                ff50Var.g = 0;
                ff50Var.h = null;
                hf50 hf50Var = hf50.f12957a;
                if (af50VarC != null) {
                    af50VarC.d = hf50Var;
                    af50VarC.c();
                }
                ff50Var.f9435a.o(null, hf50Var);
            }
        }
        ag60Var.b = false;
    }

    public final void onBackInvoked() {
        this.f2540a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        xe50 xe50VarB0 = xww.b0(backEvent);
        ag60 ag60Var = this.f2540a;
        ye50 ye50Var = ag60Var.f7705a;
        if (ye50Var != null && ag60Var.b) {
            ye50Var.d();
            if (ye50Var.i()) {
                ff50 ff50Var = ye50Var.e;
                ff50Var.getClass();
                if (ag60Var.equals(ff50Var.h) && -1 == ff50Var.g) {
                    af50 af50VarC = ff50Var.f;
                    if (af50VarC == null) {
                        af50VarC = ff50Var.c(-1);
                    }
                    if (af50VarC != null) {
                        af50VarC.d = new if50(xe50VarB0, -1);
                        af50VarC.e(xe50VarB0);
                    }
                    ff50Var.f9435a.o(null, new if50(xe50VarB0, -1));
                }
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        xe50 xe50VarB0 = xww.b0(backEvent);
        ag60 ag60Var = this.f2540a;
        ye50 ye50Var = ag60Var.f7705a;
        if (ye50Var == null || ag60Var.b) {
            return;
        }
        ye50Var.e(ag60Var, xe50VarB0);
        ag60Var.b = true;
    }
}
