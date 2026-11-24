package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.responsible_game.impl.presentation.limits.deposit_limit.gambling_exam.models.DepositLimitScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r8k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30031a;
    public final /* synthetic */ u8k b;

    public /* synthetic */ r8k(u8k u8kVar, byte b) {
        this.f30031a = b;
        this.b = u8kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f30031a;
        u8k u8kVar = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = u8k.Q1;
                i1w0 i1w0VarF = a4n0.f(u8kVar);
                gfi gfiVar = u8kVar.K1;
                if (gfiVar != null) {
                    return new ry3(i1w0VarF, gfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kwd kwdVar2 = u8k.Q1;
                pak pakVar = (pak) u8kVar.N1.getValue();
                Integer intOrNull = StringsKt.toIntOrNull(String.valueOf(u8kVar.G0().c.getText()));
                int iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
                int i = ((DepositLimitScreenParams) u8kVar.P1.n(u8kVar, u8k.R1[1])).f46893a;
                p7m0 p7m0Var = pakVar.f;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.TRUE));
                sac.V(jiu0.a(pakVar), new e3j(pakVar, (byte) 13), new ucj(pakVar, (byte) 10), null, new oak(pakVar, iIntValue, i, null), 12);
                return Unit.f46060a;
        }
    }
}
