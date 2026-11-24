package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class rh30 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph30 f30470a;
    public final /* synthetic */ sh30 b;

    public rh30(sh30 sh30Var, ph30 ph30Var) {
        this.b = sh30Var;
        this.f30470a = ph30Var;
    }

    public final void onBackCancelled() {
        if (this.b.f28719a != null) {
            this.f30470a.c();
        }
    }

    public final void onBackInvoked() {
        this.f30470a.d();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.f28719a != null) {
            this.f30470a.b(new pb5(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.f28719a != null) {
            this.f30470a.a(new pb5(backEvent));
        }
    }
}
