package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes6.dex */
public final class gnc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hnc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnc0(hnc0 hnc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hnc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hnc0 hnc0Var = this.k;
        switch (b) {
            case 0:
                gnc0 gnc0Var = new gnc0(hnc0Var, yjeVar, (byte) 0);
                gnc0Var.j = obj;
                return gnc0Var;
            case 1:
                gnc0 gnc0Var2 = new gnc0(hnc0Var, yjeVar, (byte) 1);
                gnc0Var2.j = obj;
                return gnc0Var2;
            default:
                gnc0 gnc0Var3 = new gnc0(hnc0Var, yjeVar, (byte) 2);
                gnc0Var3.j = obj;
                return gnc0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gnc0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((gnc0) create((onc0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gnc0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ikr0 ikr0Var;
        byte b = this.i;
        hnc0 hnc0Var = this.k;
        switch (b) {
            case 0:
                String str = (String) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean zW = StringsKt.W(str);
                xi70 xi70Var = hnc0.R1;
                hnc0Var.G0().c.setEnabled(!zW);
                hnc0Var.G0().c.setAlpha(zW ? 0.38f : 1.0f);
                return Unit.f46060a;
            case 1:
                onc0 onc0Var = (onc0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(onc0Var, knc0.f18579a);
                hnc0 hnc0Var2 = this.k;
                if (zD) {
                    xi70 xi70Var2 = hnc0.R1;
                    Fragment fragment = hnc0Var2.y;
                    ikr0 ikr0Var2 = fragment instanceof ikr0 ? (ikr0) fragment : null;
                    if (ikr0Var2 != null) {
                        ikr0Var2.X0(false);
                    }
                    wdk0 wdk0Var = hnc0Var2.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    pek0 pek0Var = pek0.f26859a;
                    String strH = hnc0Var2.H(R.string.toto_promocode_not_found);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), hnc0Var2, null, null, false, null, 1020);
                } else if (onc0Var instanceof mnc0) {
                    mnc0 mnc0Var = (mnc0) onc0Var;
                    xi70 xi70Var3 = hnc0.R1;
                    Fragment fragment2 = hnc0Var2.y;
                    ikr0 ikr0Var3 = fragment2 instanceof ikr0 ? (ikr0) fragment2 : null;
                    if (ikr0Var3 != null) {
                        ikr0Var3.x0();
                    }
                    Fragment fragment3 = hnc0Var2.y;
                    ikr0 ikr0Var4 = fragment3 instanceof ikr0 ? (ikr0) fragment3 : null;
                    if (ikr0Var4 != null) {
                        ikr0Var4.X0(false);
                    }
                    wdk0 wdk0Var2 = hnc0Var2.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, mnc0Var.f22083a, null, null, null, null, 124), hnc0Var2, null, null, false, null, 1020);
                } else if (onc0Var instanceof lnc0) {
                    lnc0 lnc0Var = (lnc0) onc0Var;
                    xi70 xi70Var4 = hnc0.R1;
                    Fragment fragment4 = hnc0Var2.y;
                    ikr0 ikr0Var5 = fragment4 instanceof ikr0 ? (ikr0) fragment4 : null;
                    if (ikr0Var5 != null) {
                        ikr0Var5.X0(false);
                    }
                    wdk0 wdk0Var3 = hnc0Var2.M1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, lnc0Var.f20338a, hnc0Var2, null, hnc0Var2.G0().b, false, null, 1012);
                } else if (onc0Var instanceof nnc0) {
                    nnc0 nnc0Var = (nnc0) onc0Var;
                    xi70 xi70Var5 = hnc0.R1;
                    Fragment fragment5 = hnc0Var2.y;
                    ikr0 ikr0Var6 = fragment5 instanceof ikr0 ? (ikr0) fragment5 : null;
                    if (ikr0Var6 != null) {
                        ikr0Var6.X0(false);
                    }
                    lgn0 lgn0Var = hnc0Var2.N1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH2 = hnc0Var2.H(R.string.bet_processed_successfully);
                    strH2.getClass();
                    lgn0Var.c(new SuccessBetStringModel(strH2, null, null, null), new SuccessBetAlertModel(w6x.q(hnc0Var2.H(R.string.promo), ": ", nnc0Var.c), nnc0Var.b, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(nnc0Var.f23814a), "TOTO", iun.f15405a), hnc0Var2.p0().p0());
                    Fragment fragment6 = hnc0Var2.y;
                    ikr0Var = fragment6 instanceof ikr0 ? (ikr0) fragment6 : null;
                    if (ikr0Var != null) {
                        ikr0Var.x0();
                    }
                } else {
                    if (!(onc0Var instanceof jnc0)) {
                        t9f.b();
                        return null;
                    }
                    Fragment fragment7 = hnc0Var2.y;
                    ikr0Var = fragment7 instanceof ikr0 ? (ikr0) fragment7 : null;
                    if (ikr0Var != null) {
                        ikr0Var.X0(true);
                    }
                    xi70 xi70Var6 = hnc0.R1;
                    hnc0Var2.G0().c.setEnabled(false);
                    hnc0Var2.G0().c.setAlpha(0.38f);
                }
                return Unit.f46060a;
            default:
                String str2 = (String) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                xi70 xi70Var7 = hnc0.R1;
                hnc0Var.G0().d.setText(str2);
                return Unit.f46060a;
        }
    }
}
