package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class kjr extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ljr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjr(ljr ljrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ljrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ljr ljrVar = this.k;
        switch (b) {
            case 0:
                kjr kjrVar = new kjr(ljrVar, yjeVar, (byte) 0);
                kjrVar.j = obj;
                return kjrVar;
            default:
                kjr kjrVar2 = new kjr(ljrVar, yjeVar, (byte) 1);
                kjrVar2.j = obj;
                return kjrVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kjr) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kjr) create((ukr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr = ljr.Q1;
                ((cjr) this.k.P1.getValue()).A(list);
                return Unit.f46060a;
            default:
                ukr ukrVar = (ukr) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ukrVar != null) {
                    boolean z = ukrVar instanceof tkr;
                    ljr ljrVar = this.k;
                    if (z) {
                        iiy[] iiyVarArr2 = ljr.Q1;
                        wdk0 wdk0Var = ljrVar.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH = ljrVar.H(R.string.something_went_wrong);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), ljrVar, null, null, false, null, 1020);
                    } else if (ukrVar instanceof rkr) {
                        String str = ((rkr) ukrVar).f30661a;
                        iiy[] iiyVarArr3 = ljr.Q1;
                        ljrVar.I0(str);
                    } else if (ukrVar instanceof skr) {
                        String str2 = ((skr) ukrVar).f32366a;
                        iiy[] iiyVarArr4 = ljr.Q1;
                        ljrVar.I0(str2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
