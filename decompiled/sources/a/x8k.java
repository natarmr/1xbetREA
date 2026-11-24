package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x8k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40465a;
    public final /* synthetic */ c9k b;

    public /* synthetic */ x8k(c9k c9kVar, byte b) {
        this.f40465a = b;
        this.b = c9kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f40465a;
        c9k c9kVar = this.b;
        switch (b) {
            case 0:
                nwd nwdVar = c9k.Q1;
                i1w0 i1w0VarF = a4n0.f(c9kVar);
                hfi hfiVar = c9kVar.K1;
                if (hfiVar != null) {
                    return new ry3(i1w0VarF, hfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nwd nwdVar2 = c9k.Q1;
                y6h y6hVar = new y6h(1, c9kVar.H0(), p9k.class, "onItemClick", "onItemClick$impl(Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit_kz/DepositLimitKzEnum;)V", 0, (byte) 18);
                w8k w8kVar = new w8k();
                w8kVar.d.b(new gbn(new svj((byte) 7), new e9k(3, (byte) 0), new e3j(y6hVar, (byte) 11), zdh.m));
                return w8kVar;
            case 2:
                nwd nwdVar3 = c9k.Q1;
                p9k p9kVarH0 = c9kVar.H0();
                p7m0 p7m0Var = p9kVarH0.o;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, n9k.f23144a));
                sac.V(jiu0.a(p9kVarH0), new f9k(p9kVarH0, (byte) 0), null, null, new ya(p9kVarH0, null, (byte) 26), 14);
                return Unit.f46060a;
            default:
                nwd nwdVar4 = c9k.Q1;
                c9kVar.H0().x();
                return Unit.f46060a;
        }
    }
}
