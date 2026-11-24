package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2816a;
    public final /* synthetic */ dm0 b;

    public /* synthetic */ bm0(dm0 dm0Var, byte b) {
        this.f2816a = b;
        this.b = dm0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2816a;
        dm0 dm0Var = this.b;
        switch (b) {
            case 0:
                pek0 pek0Var = dm0.S1;
                fiu0 fiu0Var = dm0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                pek0 pek0Var2 = dm0.S1;
                ComponentCallbacks2 application = dm0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(is0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof is0)) {
                        ze3Var = null;
                    }
                    is0 is0Var = (is0) ze3Var;
                    if (is0Var != null) {
                        return is0.a(is0Var, ir1.c, null, null, dm0.class.getSimpleName(), true, (mdp) dm0Var.Q1.n(dm0Var, dm0.U1[1]), 6);
                    }
                }
                jf4.n(b1j.i(is0.class, "Cannot create dependency "));
                return null;
            default:
                pek0 pek0Var3 = dm0.S1;
                dm0Var.G0().x(dl0.f6256a);
                return Unit.f46060a;
        }
    }
}
