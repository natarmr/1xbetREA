package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tki0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34096a;
    public final /* synthetic */ xki0 b;

    public /* synthetic */ tki0(xki0 xki0Var, byte b) {
        this.f34096a = b;
        this.b = xki0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f34096a;
        yje yjeVar = null;
        xki0 xki0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = xki0.P1;
                i1w0 i1w0VarF = a4n0.f(xki0Var);
                nti ntiVar = xki0Var.K1;
                if (ntiVar != null) {
                    return new ry3(i1w0VarF, ntiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = xki0.P1;
                uki0 uki0Var = new uki0(1, xki0Var.H0(), imi0.class, "onItemClick", "onItemClick$impl(Lorg/xplatform/responsible_game/impl/domain/models/SessionTimeLimitEnum;)V", 0, (byte) 0);
                lki0 lki0Var = new lki0();
                lki0Var.d.b(new gbn(new d1i0((byte) 29), new gsh0(3, (byte) 4), new rai0(uki0Var, (byte) 5), ynh0.k));
                return lki0Var;
            default:
                iiy[] iiyVarArr3 = xki0.P1;
                imi0 imi0VarH0 = xki0Var.H0();
                p7m0 p7m0Var = imi0VarH0.l;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, gmi0.f11545a));
                sac.V(jiu0.a(imi0VarH0), new yli0(imi0VarH0, (byte) 1), null, null, new z8b0(imi0VarH0, yjeVar, (byte) 15), 14);
                return Unit.f46060a;
        }
    }
}
