package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jn1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16792a;
    public final /* synthetic */ on1 b;

    public /* synthetic */ jn1(on1 on1Var, byte b) {
        this.f16792a = b;
        this.b = on1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16792a;
        on1 on1Var = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = on1.S1;
                ComponentCallbacks2 application = on1Var.n0().getApplication();
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
                        return is0.a(is0Var, ir1.c, null, on1Var.O1.n(on1Var, on1.U1[0]), on1.class.getSimpleName(), true, null, 34);
                    }
                }
                jf4.n(b1j.i(is0.class, "Cannot create dependency "));
                return null;
            case 1:
                p7i p7iVar = on1Var.K1;
                if (p7iVar != null) {
                    return new q0h0(p7iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                hfk0 hfk0Var2 = on1.S1;
                on1Var.G0().x(xm1.f41099a);
                return Unit.f46060a;
        }
    }
}
