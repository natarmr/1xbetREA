package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class r9i0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t9i0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9i0(t9i0 t9i0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t9i0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        t9i0 t9i0Var = this.k;
        switch (b) {
            case 0:
                r9i0 r9i0Var = new r9i0(t9i0Var, yjeVar, (byte) 0);
                r9i0Var.j = obj;
                return r9i0Var;
            default:
                r9i0 r9i0Var2 = new r9i0(t9i0Var, yjeVar, (byte) 1);
                r9i0Var2.j = obj;
                return r9i0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r9i0) create((aai0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r9i0) create((x9i0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                aai0 aai0Var = (aai0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = aai0Var instanceof y9i0;
                t9i0 t9i0Var = this.k;
                if (z) {
                    short s = ((y9i0) aai0Var).f42248a.f9154a;
                    iiy[] iiyVarArr = t9i0.Q1;
                    b1r b1rVarG0 = t9i0Var.G0();
                    f9i0[] f9i0VarArr = f9i0.b;
                    if (s == 30) {
                        t9i0Var.I0(b1rVarG0.d.b);
                    } else if (s == 90) {
                        t9i0Var.I0(b1rVarG0.h.b);
                    } else if (s == 180) {
                        t9i0Var.I0(b1rVarG0.g.b);
                    } else if (s == 365) {
                        t9i0Var.I0(b1rVarG0.e.b);
                    } else {
                        t9i0Var.I0(b1rVarG0.c.b);
                    }
                    t9i0Var.G0().b.setEnabled(true);
                } else {
                    iiy[] iiyVarArr2 = t9i0.Q1;
                    t9i0Var.G0().b.setEnabled(false);
                }
                return Unit.f46060a;
            default:
                x9i0 x9i0Var = (x9i0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = x9i0Var instanceof v9i0;
                t9i0 t9i0Var2 = this.k;
                if (z2) {
                    String str = ((v9i0) x9i0Var).f37036a;
                    iiy[] iiyVarArr3 = t9i0.Q1;
                    ii iiVar = t9i0Var2.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = t9i0Var2.H(R.string.error);
                    String strH2 = t9i0Var2.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = t9i0Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    iiy[] iiyVarArr4 = t9i0.Q1;
                    wdk0 wdk0Var = t9i0Var2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH3 = t9i0Var2.H(R.string.something_went_wrong);
                    strH3.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH3, null, null, null, null, 124), t9i0Var2, null, null, false, null, 1020);
                }
                return Unit.f46060a;
        }
    }
}
