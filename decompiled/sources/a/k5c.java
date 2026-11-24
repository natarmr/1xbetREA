package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class k5c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ l5c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5c(l5c l5cVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = l5cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l5c l5cVar = this.k;
        switch (b) {
            case 0:
                k5c k5cVar = new k5c(l5cVar, yjeVar, (byte) 0);
                k5cVar.j = obj;
                return k5cVar;
            default:
                k5c k5cVar2 = new k5c(l5cVar, yjeVar, (byte) 1);
                k5cVar2.j = obj;
                return k5cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k5c) create((h7c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k5c) create((i7c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                h7c h7cVar = (h7c) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = h7cVar instanceof d7c;
                l5c l5cVar = this.k;
                if (z) {
                    String str = ((d7c) h7cVar).f5588a;
                    kl5 kl5Var = l5c.W1;
                    wdk0 wdk0Var = l5cVar.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(pek0.f26859a, str, null, null, null, null, 124), l5cVar, null, null, false, null, 1020);
                } else if (h7cVar instanceof w6c) {
                    w6c w6cVar = (w6c) h7cVar;
                    String str2 = w6cVar.f38618a;
                    kl5 kl5Var2 = l5c.W1;
                    l5cVar.F().t0(i120.V(new Pair(str2, w6cVar.b)), str2);
                    v7c v7cVarI0 = l5cVar.I0();
                    i1w0 i1w0Var = v7cVarI0.c;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(iw20.f(v7cVarI0.q, nqh0.f23960a))), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (h7cVar instanceof a7c) {
                    String str3 = ((a7c) h7cVar).f360a;
                    kl5 kl5Var3 = l5c.W1;
                    DsTextField dsTextField = l5cVar.H0().f;
                    dsTextField.f(!(str3 == null || str3.length() == 0));
                    dsTextField.setErrorText(str3);
                } else if (h7cVar instanceof f7c) {
                    String str4 = ((f7c) h7cVar).f9054a;
                    kl5 kl5Var4 = l5c.W1;
                    ii iiVarG0 = l5cVar.G0();
                    String strH = l5cVar.H(R.string.error);
                    String strH2 = l5cVar.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str4, (CharSequence) strH2, (String) null, (String) null, "REQUEST_TOKEN_EXPIRED_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = l5cVar.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                } else if (h7cVar instanceof c7c) {
                    kl5 kl5Var5 = l5c.W1;
                    ii iiVarG1 = l5cVar.G0();
                    if (l5cVar.M1 == null) {
                        Intrinsics.h("logoutDialogFactory");
                        throw null;
                    }
                    String strH3 = l5cVar.H(R.string.attention);
                    String strH4 = l5cVar.H(R.string.close_the_activation_process_and_logout);
                    String strH5 = l5cVar.H(R.string.interrupt);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, l5cVar.H(R.string.cancel), (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1520);
                    tx00.l2.getClass();
                    tx00 tx00VarG = evz.g(dialogFields2, false, false, false);
                    androidx.fragment.app.e eVarC2 = l5cVar.C();
                    eVarC2.getClass();
                    iiVarG1.c(tx00VarG, eVarC2);
                } else if (h7cVar instanceof x6c) {
                    String str5 = ((x6c) h7cVar).f40357a;
                    kl5 kl5Var6 = l5c.W1;
                    ii iiVarG2 = l5cVar.G0();
                    String strH6 = l5cVar.H(R.string.caution);
                    String strH7 = l5cVar.H(R.string.interrupt);
                    strH7.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) str5, (CharSequence) strH7, l5cVar.H(R.string.cancel), (String) null, "REQUEST_PROCESS_INTERRUPTION_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC3 = l5cVar.C();
                    eVarC3.getClass();
                    iiVarG2.d(dialogFields3, eVarC3);
                } else if (h7cVar instanceof e7c) {
                    kl5 kl5Var7 = l5c.W1;
                    ii iiVarG3 = l5cVar.G0();
                    String strH8 = l5cVar.H(R.string.error);
                    String strH9 = l5cVar.H(R.string.request_error);
                    String strH10 = l5cVar.H(R.string.ok_new);
                    strH10.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC4 = l5cVar.C();
                    eVarC4.getClass();
                    iiVarG3.d(dialogFields4, eVarC4);
                } else if (h7cVar instanceof v6c) {
                    j120.Y(l5cVar);
                } else if (h7cVar instanceof y6c) {
                    kl5 kl5Var8 = l5c.W1;
                    ii iiVarG4 = l5cVar.G0();
                    String strH11 = l5cVar.H(R.string.consultant);
                    String strH12 = l5cVar.H(R.string.consultant_chat_with_operator_dialog_message);
                    String strH13 = l5cVar.H(R.string.consultant_chat_with_operator_dialog_positive_text);
                    strH13.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, l5cVar.H(R.string.cancel), (String) null, "REQUEST_CONSULTANT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = l5cVar.C();
                    eVarC5.getClass();
                    iiVarG4.d(dialogFields5, eVarC5);
                } else if (h7cVar instanceof g7c) {
                    kl5 kl5Var9 = l5c.W1;
                    l5cVar.H0().f.setText(((g7c) h7cVar).f10808a);
                } else if (h7cVar instanceof z6c) {
                    if (l5cVar.P1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    d7a d7aVar = ((z6c) h7cVar).f43859a;
                    String strH14 = l5cVar.H(R.string.confirmation);
                    strH14.getClass();
                    gl5.p(l5cVar, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH14);
                } else {
                    if (!Intrinsics.d(h7cVar, b7c.f2100a)) {
                        t9f.b();
                        return null;
                    }
                    kl5 kl5Var10 = l5c.W1;
                    ii iiVarG5 = l5cVar.G0();
                    String strH15 = l5cVar.H(R.string.error);
                    String strH16 = l5cVar.H(R.string.something_went_wrong);
                    String strH17 = l5cVar.H(R.string.ok_new);
                    strH17.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC6 = l5cVar.C();
                    eVarC6.getClass();
                    iiVarG5.d(dialogFields6, eVarC6);
                }
                return Unit.f46060a;
            default:
                i7c i7cVar = (i7c) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kl5 kl5Var11 = l5c.W1;
                l5c l5cVar2 = this.k;
                l5cVar2.H0().e.setVisibility(i7cVar.d ? 0 : 8);
                l5cVar2.H0().g.setVisibility(i7cVar.c ? 0 : 8);
                l5cVar2.H0().h.setText(i7cVar.f);
                DsNavigationBar dsNavigationBar = l5cVar2.H0().c;
                String strH18 = l5cVar2.H(i7cVar.b);
                strH18.getClass();
                dsNavigationBar.setTitle(strH18);
                l5cVar2.H0().d.setVisibility(i7cVar.n ? 0 : 8);
                u6c u6cVar = i7cVar.j;
                if (u6cVar.equals(s6c.f31696a)) {
                    l5cVar2.H0().i.setVisibility(8);
                } else {
                    if (!(u6cVar instanceof t6c)) {
                        t9f.b();
                        return null;
                    }
                    l5cVar2.H0().i.setVisibility(0);
                    l5cVar2.H0().i.setText(((t6c) u6cVar).f33411a);
                }
                if (!i7cVar.g.equals(i6c.f14232a)) {
                    t9f.b();
                    return null;
                }
                l5cVar2.H0().b.setFirstButtonVisibility(false);
                m6c m6cVar = i7cVar.h;
                if (m6cVar.equals(k6c.f17761a)) {
                    l5cVar2.H0().b.setSecondButtonVisibility(false);
                } else {
                    if (!(m6cVar instanceof l6c)) {
                        t9f.b();
                        return null;
                    }
                    l5cVar2.H0().b.setSecondButtonVisibility(true);
                    l6c l6cVar = (l6c) m6cVar;
                    l5cVar2.H0().b.setSecondButtonEnabled(l6cVar.b);
                    l5cVar2.H0().b.setSecondButtonStyle(R.style.DSButton_Large_Secondary);
                    l5cVar2.H0().b.setSecondButtonText(l6cVar.f19500a);
                    DsBottomBar.v(l5cVar2.H0().b, new yw9(l5cVar2, m6cVar, (byte) 11));
                }
                n6c n6cVar = i7cVar.i;
                l5cVar2.H0().b.setThirdButtonVisibility(true);
                l5cVar2.H0().b.setThirdButtonText(n6cVar.f22990a);
                l5cVar2.H0().b.setThirdButtonEnabled(n6cVar.b);
                DsBottomBar.w(l5cVar2.H0().b, new h5c(l5cVar2, (byte) 7));
                return Unit.f46060a;
        }
    }
}
