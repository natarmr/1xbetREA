package a;

import android.widget.Button;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class arb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ crb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ arb0(crb0 crb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = crb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        crb0 crb0Var = this.k;
        switch (b) {
            case 0:
                arb0 arb0Var = new arb0(crb0Var, yjeVar, (byte) 0);
                arb0Var.j = obj;
                return arb0Var;
            default:
                arb0 arb0Var2 = new arb0(crb0Var, yjeVar, (byte) 1);
                arb0Var2.j = obj;
                return arb0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((arb0) create((pa20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((arb0) create((nrb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strH;
        String strH2;
        String strH3;
        switch (this.i) {
            case 0:
                pa20 pa20Var = (pa20) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (pa20Var != null) {
                    boolean z = pa20Var instanceof na20;
                    crb0 crb0Var = this.k;
                    if (z) {
                        jh70 jh70Var = crb0.S1;
                        orb0 orb0VarH0 = crb0Var.H0();
                        p7m0 p7m0Var = orb0VarH0.o;
                        lrb0 lrb0Var = new lrb0(true);
                        p7m0Var.getClass();
                        p7m0Var.o(null, lrb0Var);
                        orb0VarH0.w();
                        wdk0 wdk0Var = crb0Var.Q1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(rek0.b, ((na20) pa20Var).c, null, null, null, null, 124), crb0Var, null, null, false, null, 1020);
                        Button button = crb0Var.G0().b;
                        button.setEnabled(false);
                        button.setText(crb0Var.H(R.string.powerbet));
                    } else if (pa20Var instanceof oa20) {
                        wdk0 wdk0Var2 = crb0Var.Q1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        qek0 qek0Var = qek0.f28589a;
                        String strH4 = crb0Var.H(R.string.success);
                        strH4.getClass();
                        wdk0.k(wdk0Var2, new xdk0(qek0Var, strH4, null, null, null, null, 124), crb0Var, null, null, false, null, 1020);
                        orb0 orb0VarH1 = crb0Var.H0();
                        pmi0.i(orb0VarH1.m);
                        orb0VarH1.d.d(new irb0(orb0VarH1, (byte) 1));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                nrb0 nrb0Var = (nrb0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (nrb0Var != null) {
                    boolean z2 = nrb0Var instanceof lrb0;
                    crb0 crb0Var2 = this.k;
                    if (z2) {
                        boolean z3 = ((lrb0) nrb0Var).f20523a;
                        jh70 jh70Var2 = crb0.S1;
                        crb0Var2.K0(true, z3, false);
                    } else if (nrb0Var instanceof mrb0) {
                        jh70 jh70Var3 = crb0.S1;
                        crb0Var2.K0(false, true, false);
                        a3r a3rVarG0 = crb0Var2.G0();
                        hrb0 hrb0Var = ((mrb0) nrb0Var).f22262a;
                        crb0Var2.I0(a3rVarG0, hrb0Var);
                        Button button2 = a3rVarG0.b;
                        crb0.J0(a3rVarG0, hrb0Var);
                        frb0 frb0Var = hrb0Var.k;
                        a3rVarG0.s.setText(frb0Var.f10011a);
                        a3rVarG0.j.setText(frb0Var.b);
                        TextView textView = a3rVarG0.u;
                        pn40 pn40Var = pn40.f27267a;
                        double d = frb0Var.c;
                        String str = hrb0Var.i;
                        p3u0 p3u0Var = p3u0.c;
                        textView.setText(pn40.d(d, str, p3u0Var));
                        a3rVarG0.p.setText(pn40.d(frb0Var.d, str, p3u0Var));
                        button2.setText(crb0Var2.I(R.string.history_powerbet_for_v2, pn40.d(hrb0Var.k.d, hrb0Var.i, p3u0Var)));
                        button2.setEnabled(true);
                    } else if (nrb0Var instanceof krb0) {
                        krb0 krb0Var = (krb0) nrb0Var;
                        hrb0 hrb0Var2 = krb0Var.f18756a;
                        frb0 frb0Var2 = hrb0Var2.k;
                        boolean z4 = krb0Var.b;
                        jh70 jh70Var4 = crb0.S1;
                        if (z4) {
                            crb0Var2.K0(false, false, false);
                            ii iiVar = crb0Var2.P1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH5 = crb0Var2.H(R.string.error);
                            String strH6 = frb0Var2.f10011a;
                            if (strH6.length() == 0) {
                                strH6 = crb0Var2.H(R.string.error_something_went_wrong);
                                strH6.getClass();
                            }
                            String strH7 = crb0Var2.H(R.string.ok);
                            strH7.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, "ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                            androidx.fragment.app.e eVarC = crb0Var2.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        } else {
                            a3r a3rVarG1 = crb0Var2.G0();
                            crb0Var2.K0(false, true, false);
                            crb0Var2.I0(a3rVarG1, hrb0Var2);
                            Button button3 = a3rVarG1.b;
                            crb0.J0(a3rVarG1, hrb0Var2);
                            TextView textView2 = a3rVarG1.s;
                            String strH8 = frb0Var2.f10011a;
                            if (strH8.length() == 0) {
                                strH = crb0Var2.H(R.string.error_something_went_wrong);
                                strH.getClass();
                            } else {
                                strH = strH8;
                            }
                            textView2.setText(strH);
                            TextView textView3 = a3rVarG1.j;
                            if (strH8.length() == 0) {
                                strH2 = crb0Var2.H(R.string.error_something_went_wrong);
                                strH2.getClass();
                            } else {
                                strH2 = strH8;
                            }
                            textView3.setText(strH2);
                            TextView textView4 = a3rVarG1.u;
                            if (strH8.length() == 0) {
                                strH3 = crb0Var2.H(R.string.error_something_went_wrong);
                                strH3.getClass();
                            } else {
                                strH3 = strH8;
                            }
                            textView4.setText(strH3);
                            TextView textView5 = a3rVarG1.p;
                            if (strH8.length() == 0) {
                                strH8 = crb0Var2.H(R.string.error_something_went_wrong);
                                strH8.getClass();
                            }
                            textView5.setText(strH8);
                            button3.setEnabled(false);
                            button3.setText(crb0Var2.H(R.string.powerbet));
                        }
                    } else if (nrb0Var instanceof jrb0) {
                        ra10 ra10Var = ((jrb0) nrb0Var).f16996a;
                        jh70 jh70Var5 = crb0.S1;
                        crb0Var2.G0().c.v(ra10Var);
                        crb0Var2.K0(false, false, true);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
