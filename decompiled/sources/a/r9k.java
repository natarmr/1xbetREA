package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r9k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30086a;
    public final /* synthetic */ w9k b;

    public /* synthetic */ r9k(w9k w9kVar, byte b) {
        this.f30086a = b;
        this.b = w9kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f30086a;
        yje yjeVar = null;
        w9k w9kVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = w9k.P1;
                i1w0 i1w0VarF = a4n0.f(w9kVar);
                ifi ifiVar = w9kVar.K1;
                if (ifiVar != null) {
                    return new ry3(i1w0VarF, ifiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = w9k.P1;
                y6h y6hVar = new y6h(1, w9kVar.H0(), iak.class, "onItemClick", "onItemClick$impl(Lorg/xplatform/responsible_game/impl/domain/models/DepositLimitEnum;)V", 0, (byte) 19);
                q9k q9kVar = new q9k();
                q9kVar.d.b(new gbn(new svj((byte) 8), new e9k(3, (byte) 1), new e3j(y6hVar, (byte) 12), zdh.n));
                return q9kVar;
            default:
                iiy[] iiyVarArr3 = w9k.P1;
                iak iakVarH0 = w9kVar.H0();
                p7m0 p7m0Var = iakVarH0.n;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, gak.f10970a));
                sac.V(jiu0.a(iakVarH0), new y9k(iakVarH0, (byte) 0), null, null, new ya(iakVarH0, yjeVar, (byte) 27), 14);
                return Unit.f46060a;
        }
    }
}
