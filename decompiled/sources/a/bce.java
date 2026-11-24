package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class bce extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dce k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bce(dce dceVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dceVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dce dceVar = this.k;
        switch (b) {
            case 0:
                bce bceVar = new bce(dceVar, yjeVar, (byte) 0);
                bceVar.j = obj;
                return bceVar;
            default:
                bce bceVar2 = new bce(dceVar, yjeVar, (byte) 1);
                bceVar2.j = obj;
                return bceVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bce) create((kce) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bce) create((wbe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                kce kceVar = (kce) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (kceVar != null) {
                    boolean z = kceVar instanceof jce;
                    dce dceVar = this.k;
                    if (z) {
                        kwd kwdVar = dce.Q1;
                        dceVar.G0().e.setVisibility(0);
                        dceVar.G0().c.setVisibility(8);
                        dceVar.G0().b.setVisibility(8);
                    } else if (kceVar instanceof ice) {
                        kwd kwdVar2 = dce.Q1;
                        dceVar.G0().e.setVisibility(8);
                        dceVar.G0().c.setVisibility(8);
                        dceVar.G0().b.setVisibility(0);
                        dceVar.G0().b.v(((ice) kceVar).f14533a);
                    } else if (kceVar instanceof hce) {
                        kwd kwdVar3 = dce.Q1;
                        dceVar.G0().e.setVisibility(8);
                        dceVar.G0().c.setVisibility(0);
                        dceVar.G0().b.setVisibility(8);
                        dceVar.G0().c.a(dceVar.P1.n(dceVar, dce.R1[1]).booleanValue() ? dceVar.G().getDimensionPixelOffset(R.dimen.space_16) : 0, ((hce) kceVar).f12819a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                wbe wbeVar = (wbe) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (wbeVar == null) {
                    t9f.b();
                    return null;
                }
                kwd kwdVar4 = dce.Q1;
                dce dceVar2 = this.k;
                wdk0 wdk0Var = dceVar2.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = dceVar2.H(R.string.intent_app_not_installed);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), dceVar2, null, null, false, null, 1020);
                return Unit.f46060a;
        }
    }
}
