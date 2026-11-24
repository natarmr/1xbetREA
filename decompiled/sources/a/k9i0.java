package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class k9i0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m9i0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9i0(m9i0 m9i0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = m9i0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        m9i0 m9i0Var = this.k;
        switch (b) {
            case 0:
                k9i0 k9i0Var = new k9i0(m9i0Var, yjeVar, (byte) 0);
                k9i0Var.j = obj;
                return k9i0Var;
            default:
                k9i0 k9i0Var2 = new k9i0(m9i0Var, yjeVar, (byte) 1);
                k9i0Var2.j = obj;
                return k9i0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k9i0) create((iai0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k9i0) create((hai0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                iai0 iai0Var = (iai0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (iai0Var != null) {
                    g9i0 g9i0Var = iai0Var.f14440a;
                    byte b = g9i0Var.f10915a;
                    eke0 eke0Var = m9i0.S1;
                    m9i0 m9i0Var = this.k;
                    b1r b1rVarG0 = m9i0Var.G0();
                    zie0 zie0Var = g9i0.b;
                    if (b == 7) {
                        m9i0Var.I0(b1rVarG0.j.b);
                    } else if (b == 30) {
                        m9i0Var.I0(b1rVarG0.d.b);
                    } else if (b == 90) {
                        m9i0Var.I0(b1rVarG0.h.b);
                    } else {
                        m9i0Var.I0(b1rVarG0.c.b);
                    }
                    m9i0Var.K1 = g9i0Var;
                }
                return Unit.f46060a;
            default:
                hai0 hai0Var = (hai0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = hai0Var instanceof fai0;
                m9i0 m9i0Var2 = this.k;
                if (z) {
                    String str = ((fai0) hai0Var).f9209a;
                    eke0 eke0Var2 = m9i0.S1;
                    ii iiVar = m9i0Var2.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = m9i0Var2.H(R.string.error);
                    String strH2 = m9i0Var2.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = m9i0Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    eke0 eke0Var3 = m9i0.S1;
                    wdk0 wdk0Var = m9i0Var2.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH3 = m9i0Var2.H(R.string.something_went_wrong);
                    strH3.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH3, null, null, null, null, 124), m9i0Var2, null, null, false, null, 1020);
                }
                return Unit.f46060a;
        }
    }
}
