package a;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class mot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpt0 f22148a;
    public final tpt0 b;
    public final pot0 c;
    public final o5d0 d;
    public final o5d0 e;
    public final o5d0 f;
    public final int g;
    public final x04 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;

    public mot0(kpt0 kpt0Var, tpt0 tpt0Var, pot0 pot0Var, o5d0 o5d0Var, o5d0 o5d0Var2, o5d0 o5d0Var3) {
        kpt0Var.getClass();
        tpt0Var.getClass();
        pot0Var.getClass();
        o5d0Var.getClass();
        o5d0Var2.getClass();
        o5d0Var3.getClass();
        this.f22148a = kpt0Var;
        this.b = tpt0Var;
        this.c = pot0Var;
        this.d = o5d0Var;
        this.e = o5d0Var2;
        this.f = o5d0Var3;
        z04 z04Var = not0.f23882a;
        z04Var.getClass();
        this.g = z04.b.incrementAndGet(z04Var);
        final byte b = 0;
        this.h = o2e.X(false);
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.i = maz.b(new Function0(this) { // from class: a.kot0
            public final /* synthetic */ mot0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                mot0 mot0Var = this.b;
                switch (b2) {
                    case 0:
                        return (spt0) mot0Var.d.get();
                    case 1:
                        return (zii0) mot0Var.e.get();
                    default:
                        return (f8a) mot0Var.f.get();
                }
            }
        });
        final byte b2 = 1;
        this.j = maz.b(new Function0(this) { // from class: a.kot0
            public final /* synthetic */ mot0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                mot0 mot0Var = this.b;
                switch (b3) {
                    case 0:
                        return (spt0) mot0Var.d.get();
                    case 1:
                        return (zii0) mot0Var.e.get();
                    default:
                        return (f8a) mot0Var.f.get();
                }
            }
        });
        final byte b3 = 2;
        this.k = maz.b(new Function0(this) { // from class: a.kot0
            public final /* synthetic */ mot0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                mot0 mot0Var = this.b;
                switch (b4) {
                    case 0:
                        return (spt0) mot0Var.d.get();
                    case 1:
                        return (zii0) mot0Var.e.get();
                    default:
                        return (f8a) mot0Var.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
