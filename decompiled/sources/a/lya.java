package a;

import android.net.Uri;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackMiniCardView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackView;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;
import org.xplatform.uikit.components.account_control.AmountCurrencyView;
import org.xplatform.uikit.components.chips.DsChips;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lya implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20853a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lya(Object obj, byte b) {
        this.f20853a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        long background;
        long jM125getWhite100d7_KjU;
        byte b = this.f20853a;
        byte b2 = 3;
        byte b3 = 9;
        byte b4 = 1;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                pz40 pz40Var = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                ctf0 ctf0Var = ((mya) obj2).b;
                return new bya(new imm(ilmVar, new plm(ctf0Var.b.a(R.string.games_choice, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null), new imm(new ilm(s6t0.b().f33626a.getSecondary()), new nlm(new hmm(2, str != null ? str : "", ctf0Var.b.a(R.string.search_by_games, Arrays.copyOf(new Object[0], 0)), true)), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
            case 1:
                ((CashbackMiniCardView) obj2).c = (String) obj;
                return Unit.f46060a;
            case 2:
                int i = CashbackView.c;
                ((View) obj).getClass();
                ((CashbackView) obj2).b.invoke();
                return Unit.f46060a;
            case 3:
                p3b p3bVar = (p3b) obj;
                p3bVar.getClass();
                Function1 function1 = ((n3b) obj2).g;
                if (function1 != null) {
                    function1.invoke(p3bVar);
                }
                return Unit.f46060a;
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                eke0 eke0Var = ((w5b) obj2).w;
                bhh0 bhh0Var = bhh0.c;
                eke0Var.getClass();
                k0w0Var.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                return Unit.f46060a;
            case 5:
                y7b y7bVar = (y7b) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = y7bVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    y7bVar.f.getClass();
                } while (!p7m0Var.m(value, r6b.a((r6b) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 507903)));
                return Unit.f46060a;
            case 6:
                z8b z8bVar = (z8b) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                float f = z8bVar.f43959a;
                uag0Var.w(f);
                uag0Var.y(f);
                uag0Var.b(z8bVar.b);
                return Unit.f46060a;
            case 7:
                String str2 = (String) obj;
                bj5 bj5Var = bib.X1;
                str2.getClass();
                ((bib) obj2).J0().x(new phb(str2));
                return Unit.f46060a;
            case 8:
                ((Integer) obj).getClass();
                yk5 yk5Var = cmb.O1;
                ((cmb) obj2).G0().x(xi2.f40922a);
                return Unit.f46060a;
            case 9:
                xnb xnbVar = (xnb) obj2;
                ql5 ql5Var = (ql5) obj;
                kj5 kj5Var = xnb.w2;
                ql5Var.getClass();
                if (!xnbVar.R()) {
                    vcc.f0(i120.V(new Pair("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5Var)), xnbVar, xnbVar.R0());
                    xnbVar.y0();
                }
                return Unit.f46060a;
            case 10:
                job jobVar = (job) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                yk5 yk5Var2 = job.o2;
                phf0 phf0Var = jobVar.g2;
                iiy[] iiyVarArr = job.p2;
                if (phf0Var.n(jobVar, iiyVarArr[0]).length() > 0) {
                    vcc.f0(i120.V(new Pair("RESULT_BLOCK_ID", num)), jobVar, phf0Var.n(jobVar, iiyVarArr[0]));
                }
                jobVar.x0();
                return Unit.f46060a;
            case 11:
                iqt0 iqt0Var = (iqt0) obj;
                gl5 gl5Var = xpb.S1;
                iqt0Var.getClass();
                ((xpb) obj2).H0().f.a(iqt0Var);
                return Unit.f46060a;
            case 12:
                iqt0 iqt0Var2 = (iqt0) obj;
                bj5 bj5Var2 = rqb.U1;
                iqt0Var2.getClass();
                ((rqb) obj2).H0().o.a(iqt0Var2);
                return Unit.f46060a;
            case 13:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((hrb) obj2).k.a(th);
                return Unit.f46060a;
            case 14:
                r0c r0cVar = (r0c) obj2;
                cl5 cl5Var = r0c.S1;
                ((View) obj).getClass();
                ii iiVar = r0cVar.M1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = r0cVar.H(R.string.consultant);
                String strH2 = r0cVar.H(R.string.consultant_chat_with_operator_dialog_message);
                String strH3 = r0cVar.H(R.string.consultant_chat_with_operator_dialog_positive_text);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, r0cVar.H(R.string.cancel), (String) null, "REQUEST_CONSULTANT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = r0cVar.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
            case 15:
                DsChips dsChips = (DsChips) obj;
                dsChips.getClass();
                dsChips.setChips(((rcc) obj2).f30231a);
                return Unit.f46060a;
            case 16:
                yhc yhcVar = (yhc) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                yhcVar.q.b(th2, new bna(yhcVar, (byte) 29));
                return Unit.f46060a;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                kj5 kj5Var2 = dic.n2;
                ((k3t0) ((dic) obj2).m2.getValue()).x(new aic(jLongValue));
                return Unit.f46060a;
            case 18:
                oic oicVar = (oic) obj2;
                hcz hczVar = (hcz) obj;
                yk5 yk5Var3 = oic.l2;
                hczVar.getClass();
                ArrayList arrayList = oicVar.P0().c;
                hczVar.f(arrayList.size(), null, new j13(arrayList, b3, z), new ugd(2039820996, true, new xe4(arrayList, oicVar, b2)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.f40887a.setOnClickListener(new q10((pw4) obj2, b3));
                return Unit.f46060a;
            case 20:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                dyb.O(((etc) cpVar2.u).c, new h6c((iz) obj2, cpVar2, b3));
                cpVar2.t(new rn5(cpVar2, b2));
                return Unit.f46060a;
            case 21:
                iwc iwcVar = (iwc) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                iwcVar.g.b(th3, new cnc(iwcVar, b4));
                return Unit.f46060a;
            case 22:
                Uri uri = (Uri) obj;
                kl5 kl5Var = ywc.W1;
                qxc qxcVarH0 = ((ywc) obj2).H0();
                String string = uri != null ? uri.toString() : null;
                String str3 = string != null ? string : "";
                if (kotlin.text.c.x(str3, "http", false) || kotlin.text.c.x(str3, "mailto", false) || kotlin.text.c.x(str3, "tel", false)) {
                    qxcVarH0.l.f(new hxc(str3));
                } else if (kotlin.text.c.x(str3, (String) qxcVarH0.k.getValue(), false)) {
                    qxcVarH0.j.a(str3);
                }
                return Unit.f46060a;
            case 23:
                float fFloatValue = ((Float) obj).floatValue();
                oyq0 state = ((nyq0) obj2).getState();
                state.c(state.c.l() + fFloatValue);
                return Unit.f46060a;
            case 24:
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                ((x2d) obj2).b(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                mbc mbcVar = ((m4d) obj2).c;
                if (mbcVar instanceof k4d) {
                    fhl.u(fhlVar, ((k4d) mbcVar).f17663a, 0L, 0L, 0.0f, null, null, 0, 126);
                } else {
                    if (!(mbcVar instanceof l4d)) {
                        t9f.b();
                        return null;
                    }
                    w03 w03VarA = z03.a();
                    w03VarA.f(0.0f, 0.0f);
                    w03VarA.e(0.0f, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
                    w03VarA.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
                    w03VarA.c();
                    l4d l4dVar = (l4d) mbcVar;
                    fhl.C0(fhlVar, w03VarA, l4dVar.f19399a, 0.0f, null, 60);
                    w03 w03VarA2 = z03.a();
                    w03VarA2.f(0.0f, 0.0f);
                    w03VarA2.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)), 0.0f);
                    w03VarA2.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
                    w03VarA2.c();
                    fhl.C0(fhlVar, w03VarA2, l4dVar.b, 0.0f, null, 60);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                jh5 jh5Var = (jh5) obj2;
                AmountCurrencyView amountCurrencyView = (AmountCurrencyView) obj;
                amountCurrencyView.getClass();
                if (jh5Var != null) {
                    pn40 pn40Var = pn40.f27267a;
                    amountCurrencyView.a(pn40.c(jh5Var.c, p3u0.c), jh5Var.d);
                    amountCurrencyView.invalidate();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gfd gfdVar = (gfd) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                gfdVar.o.b(th4, new cnc(gfdVar, (byte) 8));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                dc90 dc90Var = (dc90) ((nc90) obj2);
                if (dc90Var instanceof wb90) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    background = s6t0.b().f33626a.getPrimary20();
                } else {
                    if (!(dc90Var instanceof yb90)) {
                        t9f.b();
                        return null;
                    }
                    pz40 pz40Var3 = s6t0.f31722a;
                    background = s6t0.b().f33626a.getBackground();
                }
                fhl.E(fhlVar2, background, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            default:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar3.w0(8.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                cc90 cc90Var = (cc90) ((mc90) obj2);
                if (cc90Var instanceof xb90) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM125getWhite100d7_KjU = StaticColors.INSTANCE.m126getWhite200d7_KjU();
                } else {
                    if (!(cc90Var instanceof zb90)) {
                        t9f.b();
                        return null;
                    }
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
                }
                fhl.o0(fhlVar3, jM125getWhite100d7_KjU, 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
        }
    }
}
