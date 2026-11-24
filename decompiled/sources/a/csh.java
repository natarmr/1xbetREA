package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class csh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dsh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ csh(dsh dshVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dshVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dsh dshVar = this.k;
        switch (b) {
            case 0:
                csh cshVar = new csh(dshVar, yjeVar, (byte) 0);
                cshVar.j = obj;
                return cshVar;
            default:
                csh cshVar2 = new csh(dshVar, yjeVar, (byte) 1);
                cshVar2.j = obj;
                return cshVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((csh) create((och) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((csh) create((o5s0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dsh dshVar = this.k;
        switch (b) {
            case 0:
                yqc yqcVar = dshVar.Q1;
                och ochVar = (och) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (ochVar != null) {
                    if (ochVar instanceof mch) {
                        usd usdVar = dsh.V1;
                        mch mchVar = (mch) ochVar;
                        dshVar.G0().b.b(mchVar.f21551a, mchVar.b, new oye(0, dshVar.H0(), rsh.class, "setEndTimerState", "setEndTimerState()V", 0, (byte) 27));
                        dshVar.G0().b.setVisibility(0);
                        dshVar.G0().d.b.setVisibility(8);
                        x0x.O(dshVar.G0().d.b);
                        iun iunVar = iun.f15405a;
                        yqcVar.getClass();
                        iunVar.getClass();
                        xrh xrhVar = (xrh) yqcVar.b;
                        if (xrhVar != null) {
                            xrhVar.A(iunVar);
                        }
                    } else if (ochVar instanceof lch) {
                        usd usdVar2 = dsh.V1;
                        dshVar.G0().d.b.setVisibility(8);
                        x0x.O(dshVar.G0().d.b);
                        dshVar.G0().b.setVisibility(8);
                        List list = ((lch) ochVar).f19799a;
                        yqcVar.getClass();
                        list.getClass();
                        xrh xrhVar2 = (xrh) yqcVar.b;
                        if (xrhVar2 != null) {
                            xrhVar2.A(list);
                        }
                    } else if (ochVar instanceof nch) {
                        usd usdVar3 = dsh.V1;
                        dshVar.G0().d.b.setVisibility(0);
                        x0x.s(dshVar.G0().d.b);
                        dshVar.G0().b.setVisibility(8);
                        iun iunVar2 = iun.f15405a;
                        yqcVar.getClass();
                        iunVar2.getClass();
                        xrh xrhVar3 = (xrh) yqcVar.b;
                        if (xrhVar3 != null) {
                            xrhVar3.A(iunVar2);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                o5s0 o5s0Var = (o5s0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kxq kxqVarB = dshVar.B();
                if (kxqVarB != null) {
                    wdk0 wdk0Var = dshVar.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    n6x.F(kxqVarB, wdk0Var, o5s0Var.f24704a, o5s0Var.c, o5s0Var.d);
                }
                return Unit.f46060a;
        }
    }
}
