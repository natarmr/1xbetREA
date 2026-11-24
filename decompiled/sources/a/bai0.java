package a;

import android.content.Context;
import android.content.Intent;
import android.javax.sip.message.Response;
import android.text.Html;
import android.text.Spanned;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class bai0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bai0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new bai0((cai0) this.j, (x9i0) obj2, yjeVar, (byte) 0);
            case 1:
                return new bai0((jai0) this.j, (hai0) obj2, yjeVar, (byte) 1);
            case 2:
                return new bai0((ldi0) this.j, (e7a) obj2, yjeVar, (byte) 2);
            case 3:
                bai0 bai0Var = new bai0((ldi0) obj2, yjeVar, (byte) 3);
                bai0Var.j = obj;
                return bai0Var;
            case 4:
                bai0 bai0Var2 = new bai0((lli0) obj2, yjeVar, (byte) 4);
                bai0Var2.j = obj;
                return bai0Var2;
            case 5:
                bai0 bai0Var3 = new bai0((wli0) obj2, yjeVar, (byte) 5);
                bai0Var3.j = obj;
                return bai0Var3;
            case 6:
                return new bai0((imi0) this.j, (dmi0) obj2, yjeVar, (byte) 6);
            case 7:
                bai0 bai0Var4 = new bai0((lmi0) obj2, yjeVar, (byte) 7);
                bai0Var4.j = obj;
                return bai0Var4;
            case 8:
                bai0 bai0Var5 = new bai0((uri0) obj2, yjeVar, (byte) 8);
                bai0Var5.j = obj;
                return bai0Var5;
            case 9:
                return new bai0((xxi0) this.j, (e7a) obj2, yjeVar, (byte) 9);
            case 10:
                bai0 bai0Var6 = new bai0((t1j0) obj2, yjeVar, (byte) 10);
                bai0Var6.j = obj;
                return bai0Var6;
            case 11:
                bai0 bai0Var7 = new bai0((odj0) obj2, yjeVar, (byte) 11);
                bai0Var7.j = obj;
                return bai0Var7;
            case 12:
                return new bai0((odj0) this.j, (hkd0) obj2, yjeVar, (byte) 12);
            case 13:
                return new bai0((odj0) this.j, (e7a) obj2, yjeVar, (byte) 13);
            case 14:
                bai0 bai0Var8 = new bai0((org.xplatform.settings.impl.presentation.a) obj2, yjeVar, (byte) 14);
                bai0Var8.j = obj;
                return bai0Var8;
            case 15:
                return new bai0((org.xplatform.settings.impl.presentation.a) this.j, (o1j0) obj2, yjeVar, (byte) 15);
            case 16:
                return new bai0((org.xplatform.settings.impl.presentation.a) this.j, (e7a) obj2, yjeVar, (byte) 16);
            case 17:
                return new bai0((ngj0) this.j, (e7a) obj2, yjeVar, (byte) 17);
            case 18:
                bai0 bai0Var9 = new bai0((Set) obj2, yjeVar, (byte) 18);
                bai0Var9.j = obj;
                return bai0Var9;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new bai0((xxj0) this.j, (String) obj2, yjeVar, (byte) 19);
            case 20:
                return new bai0((xxj0) this.j, (ql5) obj2, yjeVar, (byte) 20);
            case 21:
                bai0 bai0Var10 = new bai0((wyj0) obj2, yjeVar, (byte) 21);
                bai0Var10.j = obj;
                return bai0Var10;
            case 22:
                bai0 bai0Var11 = new bai0((l2k0) obj2, yjeVar, (byte) 22);
                bai0Var11.j = obj;
                return bai0Var11;
            case 23:
                return new bai0((fdk0) this.j, (e7a) obj2, yjeVar, (byte) 23);
            case 24:
                bai0 bai0Var12 = new bai0((fdk0) obj2, yjeVar, (byte) 24);
                bai0Var12.j = obj;
                return bai0Var12;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new bai0((f3d) this.j, (cjv0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bai0 bai0Var13 = new bai0((tpk0) obj2, yjeVar, (byte) 26);
                bai0Var13.j = obj;
                return bai0Var13;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bai0 bai0Var14 = new bai0((ndl0) obj2, yjeVar, (byte) 27);
                bai0Var14.j = obj;
                return bai0Var14;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bai0 bai0Var15 = new bai0((xpl0) obj2, yjeVar, (byte) 28);
                bai0Var15.j = obj;
                return bai0Var15;
            default:
                return new bai0((w5z) this.j, (iuy) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((bai0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((bai0) create((rli0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((bai0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((bai0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((bai0) create((w190) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((bai0) create((o1j0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((bai0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((bai0) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((bai0) create((az40) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((bai0) create((rur0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((bai0) create((ik5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((bai0) create((pyu0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((bai0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((bai0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((bai0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((bai0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bai0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        StepInputUiModel stepInputUiModel;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        odl0 odl0Var;
        ArrayList arrayList;
        Set set;
        Object value7;
        a4x a4xVar;
        byte b = this.i;
        byte b2 = 3;
        boolean z = true;
        byte b3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((cai0) this.j).i.f((x9i0) obj2);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((jai0) this.j).j.f((hai0) obj2);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ldi0 ldi0Var = (ldi0) this.j;
                ldi0Var.I.f(new kci0((d7a) ((e7a) obj2), ldi0Var.p.b.a(R.string.confirmation, Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 3:
                Throwable th = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ((ldi0) obj2).C(th);
                return Unit.f46060a;
            case 4:
                lli0 lli0Var = (lli0) obj2;
                rli0 rli0Var = (rli0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (rli0Var != null) {
                    if (rli0Var instanceof oli0) {
                        cge0 cge0Var = lli0.P1;
                        ii iiVar = lli0Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = lli0Var.H(R.string.attention);
                        String strH2 = lli0Var.H(R.string.change_the_limit_question);
                        String strH3 = lli0Var.H(R.string.confirm);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, lli0Var.H(R.string.cancel), (String) null, "REQUEST_CONFIRMATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = lli0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (rli0Var instanceof pli0) {
                        String str = ((pli0) rli0Var).f27183a;
                        cge0 cge0Var2 = lli0.P1;
                        ii iiVar2 = lli0Var.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = lli0Var.H(R.string.attention);
                        String strH5 = lli0Var.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str, (CharSequence) strH5, (String) null, (String) null, "REQUEST_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC2 = lli0Var.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (rli0Var instanceof qli0) {
                        String str2 = ((qli0) rli0Var).f28936a;
                        cge0 cge0Var3 = lli0.P1;
                        ii iiVar3 = lli0Var.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = lli0Var.H(R.string.attention);
                        String strH7 = lli0Var.H(R.string.ok_new);
                        strH7.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) str2, (CharSequence) strH7, (String) null, (String) null, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC3 = lli0Var.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else if (rli0Var instanceof nli0) {
                        cge0 cge0Var4 = lli0.P1;
                        lli0Var.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                        lli0Var.G0().x(fli0.f9740a);
                    }
                    lli0Var.G0().x(zki0.f44535a);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 5:
                Throwable th2 = (Throwable) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ((wli0) obj2).q.b(th2, new d1i0((byte) 28));
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ((imi0) this.j).n.f((dmi0) obj2);
                return Unit.f46060a;
            case 7:
                Throwable th3 = (Throwable) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                th3.printStackTrace();
                lmi0 lmi0Var = (lmi0) obj2;
                if (((smi0) ((p7m0) lmi0Var.a()).getValue()).f32448a == umi0.b) {
                    lmi0Var.b();
                }
                return Unit.f46060a;
            case 8:
                w190 w190Var = (w190) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                uri0 uri0Var = (uri0) obj2;
                p7m0 p7m0Var = uri0Var.y;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.FALSE));
                uri0Var.w.f(dri0.f6561a);
                art artVar = uri0Var.s;
                String str3 = w190Var.f38388a;
                artVar.getClass();
                str3.getClass();
                if (str3.length() > 2) {
                    String str4 = w190Var.f38388a;
                    String str5 = w190Var.b;
                    hie0 hie0Var = new hie0();
                    hie0Var.f13108a = true;
                    v3c.N(uri0Var.A);
                    uri0Var.A = sac.i0(jiu0.a(uri0Var), uri0.class.getSimpleName(), 1, 0L, null, null, new kv(hie0Var, uri0Var, str4, str5, null, (byte) 19), null, uri0Var.r.b, new cri0(uri0Var, b3), null, Response.BUSY_EVERYWHERE);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                xxi0 xxi0Var = (xxi0) this.j;
                c1j0 c1j0Var = new c1j0((d7a) ((e7a) obj2));
                int i = xxi0.Y0;
                xxi0Var.G(c1j0Var);
                return Unit.f46060a;
            case 10:
                t1j0 t1j0Var = (t1j0) obj2;
                o1j0 o1j0Var = (o1j0) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(o1j0Var, n1j0.f22752a)) {
                    zie0 zie0Var = t1j0.Y1;
                    j120.Y(t1j0Var);
                    rqj0 rqj0Var = t1j0Var.K1;
                    if (rqj0Var == null) {
                        Intrinsics.h("shortCutManager");
                        throw null;
                    }
                    rqj0Var.b(true);
                    t1j0Var.I0().K();
                } else {
                    byte b4 = 17;
                    if (Intrinsics.d(o1j0Var, p0j0.f26154a)) {
                        zie0 zie0Var2 = t1j0.Y1;
                        qjj.W(x0x.Q(t1j0Var.u1), null, null, new z8b0(t1j0Var, objArr2 == true ? 1 : 0, b4), 3);
                    } else if (Intrinsics.d(o1j0Var, s0j0.f31411a)) {
                        zie0 zie0Var3 = t1j0.Y1;
                        ii iiVarG0 = t1j0Var.G0();
                        if (t1j0Var.N1 == null) {
                            Intrinsics.h("logoutDialogFactory");
                            throw null;
                        }
                        tx00 tx00VarA = ux00.a();
                        androidx.fragment.app.e eVarC4 = t1j0Var.C();
                        eVarC4.getClass();
                        iiVarG0.c(tx00VarA, eVarC4);
                        j120.g0(t1j0Var.o0(), i120.U());
                    } else if (Intrinsics.d(o1j0Var, e1j0.f7038a)) {
                        zie0 zie0Var4 = t1j0.Y1;
                        ii iiVarG1 = t1j0Var.G0();
                        if (t1j0Var.N1 == null) {
                            Intrinsics.h("logoutDialogFactory");
                            throw null;
                        }
                        String strH8 = t1j0Var.H(R.string.exit_dialog_title);
                        String strH9 = t1j0Var.H(R.string.exit_dialog_title);
                        strH9.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH8, (CharSequence) null, (CharSequence) strH9, t1j0Var.H(R.string.cancel), t1j0Var.H(R.string.exit_button_without_save), "REQUEST_SHOW_LOGOUT_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1474);
                        tx00.l2.getClass();
                        iiVarG1.c(evz.g(dialogFields4, false, true, true), t1j0Var.n0().r());
                    } else if (Intrinsics.d(o1j0Var, v0j0.f36583a)) {
                        zie0 zie0Var5 = t1j0.Y1;
                        org.xplatform.settings.impl.presentation.a aVarI0 = t1j0Var.I0();
                        aVarI0.k.d(new kej0(aVarI0, (byte) 12));
                    } else if (Intrinsics.d(o1j0Var, a1j0.f73a)) {
                        zie0 zie0Var6 = t1j0.Y1;
                        String strH10 = t1j0Var.H(R.string.authorization_error);
                        strH10.getClass();
                        String strH11 = t1j0Var.H(R.string.lose_message);
                        strH11.getClass();
                        t1j0Var.J0(strH10, strH11);
                    } else if (Intrinsics.d(o1j0Var, g1j0.f10515a)) {
                        zie0 zie0Var7 = t1j0.Y1;
                        String strH12 = t1j0Var.H(R.string.network_error);
                        strH12.getClass();
                        String strH13 = t1j0Var.H(R.string.check_connection);
                        strH13.getClass();
                        t1j0Var.J0(strH12, strH13);
                    } else if (Intrinsics.d(o1j0Var, h1j0.f12286a)) {
                        zie0 zie0Var8 = t1j0.Y1;
                        ii iiVarG2 = t1j0Var.G0();
                        String strH14 = t1j0Var.H(R.string.caution);
                        String strH15 = t1j0Var.H(R.string.payment_balance_error);
                        String strH16 = t1j0Var.H(R.string.ok_new);
                        strH16.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, t1j0Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC5 = t1j0Var.C();
                        eVarC5.getClass();
                        iiVarG2.d(dialogFields5, eVarC5);
                    } else if (Intrinsics.d(o1j0Var, l1j0.f19257a)) {
                        zie0 zie0Var9 = t1j0.Y1;
                        nh70 nh70Var = iz80.g2;
                        androidx.fragment.app.e eVarC6 = t1j0Var.C();
                        eVarC6.getClass();
                        nh70Var.getClass();
                        nh70.l(eVarC6);
                    } else if (o1j0Var instanceof m1j0) {
                        boolean z2 = ((m1j0) o1j0Var).f21011a;
                        zie0 zie0Var10 = t1j0.Y1;
                        ii iiVarG3 = t1j0Var.G0();
                        String strH17 = t1j0Var.H(R.string.caution);
                        String strH18 = t1j0Var.H(z2 ? R.string.open_official_site_description : R.string.open_working_mirror_description);
                        String strH19 = t1j0Var.H(R.string.open_app);
                        strH19.getClass();
                        DialogFields dialogFields6 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, t1j0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SITE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC7 = t1j0Var.C();
                        eVarC7.getClass();
                        iiVarG3.d(dialogFields6, eVarC7);
                    } else if (o1j0Var instanceof x0j0) {
                        String str6 = ((x0j0) o1j0Var).f40073a;
                        zie0 zie0Var11 = t1j0.Y1;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", str6);
                        intent.setType("text/plain");
                        t1j0Var.w0(Intent.createChooser(intent, null));
                    } else if (o1j0Var instanceof r0j0) {
                        zie0 zie0Var12 = t1j0.Y1;
                        Context contextD = t1j0Var.D();
                        if (contextD != null) {
                            contextD.startActivity(new Intent("android.settings.DATE_SETTINGS"));
                        }
                    } else if (o1j0Var instanceof o0j0) {
                        boolean z3 = ((o0j0) o1j0Var).f24428a;
                        zie0 zie0Var13 = t1j0.Y1;
                        qjj.W(x0x.Q(t1j0Var.u1), null, null, new a220((Object) t1j0Var, z3, (yje) (objArr == true ? 1 : 0), (byte) 23), 3);
                    } else if (o1j0Var instanceof i1j0) {
                        String str7 = ((i1j0) o1j0Var).f14001a;
                        zie0 zie0Var14 = t1j0.Y1;
                        ii iiVarG4 = t1j0Var.G0();
                        String strH20 = t1j0Var.H(R.string.error);
                        String strH21 = t1j0Var.H(R.string.ok_new);
                        strH21.getClass();
                        DialogFields dialogFields7 = new DialogFields((CharSequence) strH20, (CharSequence) str7, (CharSequence) strH21, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC8 = t1j0Var.C();
                        eVarC8.getClass();
                        iiVarG4.d(dialogFields7, eVarC8);
                    } else if (o1j0Var instanceof j1j0) {
                        String str8 = ((j1j0) o1j0Var).f15738a;
                        zie0 zie0Var15 = t1j0.Y1;
                        String strH22 = t1j0Var.H(R.string.authorization_error);
                        strH22.getClass();
                        t1j0Var.J0(strH22, str8);
                    } else if (o1j0Var instanceof f1j0) {
                        vvi0 vvi0Var = ((f1j0) o1j0Var).f8766a;
                        zie0 zie0Var16 = t1j0.Y1;
                        qgd qgdVar = t1j0Var.U1;
                        if (qgdVar == null) {
                            Intrinsics.h("settingsNavigator");
                            throw null;
                        }
                        kxq kxqVarN0 = t1j0Var.n0();
                        String strH23 = t1j0Var.H(R.string.access_only_for_authorized);
                        strH23.getClass();
                        x6h0 x6h0Var = new x6h0(t1j0Var, vvi0Var, b4);
                        Context contextO0 = t1j0Var.o0();
                        m5d.f(contextO0, R.attr.uikitPrimary, false, m5d.e(m5d.g(contextO0, R.attr.uikitTheme, 6), contextO0));
                        qgdVar.Y(kxqVarN0, strH23, x6h0Var);
                    } else if (o1j0Var instanceof c1j0) {
                        d7a d7aVar = ((c1j0) o1j0Var).f3574a;
                        zie0 zie0Var17 = t1j0.Y1;
                        if (t1j0Var.M1 == null) {
                            Intrinsics.h("captchaDialogDelegate");
                            throw null;
                        }
                        String strH24 = t1j0Var.H(R.string.settings);
                        strH24.getClass();
                        gl5.q(t1j0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH24);
                    } else if (o1j0Var instanceof q0j0) {
                        String str9 = ((q0j0) o1j0Var).f27902a;
                        zie0 zie0Var18 = t1j0.Y1;
                        wdk0 wdk0Var = t1j0Var.P1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(str9, 0);
                        spannedFromHtml.getClass();
                        String string = spannedFromHtml.toString();
                        String strH25 = t1j0Var.H(R.string.data_copied_to_clipboard);
                        strH25.getClass();
                        j120.M(t1j0Var, wdk0Var, "", string, strH25, null, null, null, 112);
                    } else if (o1j0Var instanceof u0j0) {
                        String str10 = ((u0j0) o1j0Var).f34857a;
                        zie0 zie0Var19 = t1j0.Y1;
                        vic.C(t1j0Var.o0(), str10);
                    } else if (Intrinsics.d(o1j0Var, w0j0.f38351a)) {
                        zie0 zie0Var20 = t1j0.Y1;
                        if (t1j0Var.V1 == null) {
                            Intrinsics.h("quickBetDialogNavigator");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC9 = t1j0Var.C();
                        eVarC9.getClass();
                        xi70.i(eVarC9);
                    } else if (Intrinsics.d(o1j0Var, y0j0.f41808a)) {
                        zie0 zie0Var21 = t1j0.Y1;
                        ii iiVarG5 = t1j0Var.G0();
                        String strH26 = t1j0Var.H(R.string.delete_account_warning_title);
                        String strH27 = t1j0Var.H(R.string.delete_account_warning_message);
                        String strH28 = t1j0Var.H(R.string.cancel);
                        strH28.getClass();
                        DialogFields dialogFields8 = new DialogFields((CharSequence) strH26, (CharSequence) strH27, (CharSequence) strH28, t1j0Var.H(R.string.remove), (String) null, "REQUEST_DELETE_ACCOUNT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC10 = t1j0Var.C();
                        eVarC10.getClass();
                        iiVarG5.d(dialogFields8, eVarC10);
                    } else if (Intrinsics.d(o1j0Var, b1j0.f1808a)) {
                        zie0 zie0Var22 = t1j0.Y1;
                        ii iiVarG6 = t1j0Var.G0();
                        String strH29 = t1j0Var.H(R.string.bonus_subscription_title);
                        String strH30 = t1j0Var.H(R.string.bonus_subscription_description);
                        String strH31 = t1j0Var.H(R.string.activate_bonus_subscription);
                        strH31.getClass();
                        DialogFields dialogFields9 = new DialogFields((CharSequence) strH29, (CharSequence) strH30, (CharSequence) strH31, t1j0Var.H(R.string.skip), (String) null, "REQUEST_SHOW_BONUSES", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC11 = t1j0Var.C();
                        eVarC11.getClass();
                        iiVarG6.d(dialogFields9, eVarC11);
                    } else if (Intrinsics.d(o1j0Var, t0j0.f33122a)) {
                        zie0 zie0Var23 = t1j0.Y1;
                        if (t1j0Var.B() != null && t1j0Var.W1 == null) {
                            Intrinsics.h("consentManager");
                            throw null;
                        }
                    } else if (Intrinsics.d(o1j0Var, d1j0.f5311a)) {
                        zie0 zie0Var24 = t1j0.Y1;
                        if (t1j0Var.O1 == null) {
                            Intrinsics.h("confirmChooseLanguageDialogFactory");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC12 = t1j0Var.C();
                        eVarC12.getClass();
                        nwd.g(eVarC12);
                    }
                }
                return Unit.f46060a;
            case 11:
                e7a e7aVar = (e7a) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                if (e7aVar instanceof d7a) {
                    fcj0 fcj0Var = new fcj0((d7a) e7aVar);
                    int i2 = odj0.V0;
                    ((odj0) obj2).G(fcj0Var);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                odj0 odj0Var = (odj0) this.j;
                hkd0 hkd0Var = (hkd0) obj2;
                int i3 = odj0.V0;
                i1w0 i1w0Var = odj0Var.z;
                swp0 swp0Var = new swp0(hkd0Var.b, hkd0Var.f13202a, false);
                String str11 = hkd0Var.e;
                if (str11.equals("Email")) {
                    i1w0Var.d(new huh0(odj0Var, swp0Var, (byte) 9));
                } else if (str11.equals("Sms")) {
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI.h(odj0Var.U.k(swp0Var, hkd0Var.f));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                odj0 odj0Var2 = (odj0) this.j;
                fcj0 fcj0Var2 = new fcj0((d7a) ((e7a) obj2));
                int i4 = odj0.V0;
                odj0Var2.G(fcj0Var2);
                return Unit.f46060a;
            case 14:
                e7a e7aVar2 = (e7a) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                if (e7aVar2 instanceof d7a) {
                    ((org.xplatform.settings.impl.presentation.a) obj2).G(new c1j0((d7a) e7aVar2), null);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ((org.xplatform.settings.impl.presentation.a) this.j).W0.f((o1j0) obj2);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ((org.xplatform.settings.impl.presentation.a) this.j).G(new c1j0((d7a) ((e7a) obj2)), null);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ngj0 ngj0Var = (ngj0) this.j;
                c1j0 c1j0Var2 = new c1j0((d7a) ((e7a) obj2));
                int i5 = ngj0.Y0;
                ngj0Var.G(c1j0Var2);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                Set setKeySet = ((az40) this.j).a().keySet();
                ArrayList arrayList2 = new ArrayList(r3d.q(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((zsb0) it.next()).f44898a);
                }
                Set set2 = (Set) obj2;
                if (set2 != yoj0.f42989a) {
                    Set set3 = set2;
                    if ((set3 instanceof Collection) && set3.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it2 = set3.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList2.contains((String) it2.next())) {
                            }
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                xxj0 xxj0Var = (xxj0) this.j;
                xxj0Var.V(new huh0(xxj0Var, (String) obj2, (byte) 18));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                xxj0 xxj0Var2 = (xxj0) this.j;
                p7m0 p7m0Var2 = xxj0Var2.C0;
                ql5 ql5Var = (ql5) obj2;
                do {
                    value2 = p7m0Var2.getValue();
                    stepInputUiModel = (StepInputUiModel) value2;
                } while (!p7m0Var2.m(value2, stepInputUiModel.o ? StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 114687) : StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, -1.0d, -1.0d, ql5Var.f, false, false, null, false, false, xxj0Var2.B(), false, true, false, 71616)));
                return Unit.f46060a;
            case 21:
                rur0 rur0Var = (rur0) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                ((wyj0) obj2).G.n(rur0Var);
                return Unit.f46060a;
            case 22:
                ik5 ik5Var = (ik5) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                l2k0 l2k0Var = (l2k0) obj2;
                bby bbyVar = l2k0Var.G;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var3 = l2k0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, f2k0.a((f2k0) value3, null, ik5Var, ygs0.f42601a, ui5.e, false, 0, 241)));
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                fdk0 fdk0Var = (fdk0) this.j;
                adk0 adk0Var = new adk0((d7a) ((e7a) obj2));
                int i6 = fdk0.y;
                fdk0Var.G(adk0Var);
                return Unit.f46060a;
            case 24:
                pyu0 pyu0Var = (pyu0) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                fdk0 fdk0Var2 = (fdk0) obj2;
                int i7 = fdk0.y;
                p7m0 p7m0Var4 = fdk0Var2.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, cdk0.a((cdk0) value4, null, null, pyu0Var.f27816a, false, false, null, false, 32703)));
                fdk0Var2.N();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                b3 = ((f3d) this.j).d() < 0.5f ? (byte) 1 : (byte) 0;
                cjv0 cjv0Var = (cjv0) obj2;
                if (cjv0Var != null) {
                    cjv0Var.b(b3 ^ 1);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                k92 k92Var = new k92(uaq0Var, b2);
                IntRange intRange = tpk0.Z;
                ((tpk0) obj2).H(k92Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Pair pair = (Pair) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                Object obj3 = pair.f46059a;
                Object obj4 = pair.b;
                boolean zIsEmpty = ((Collection) obj3).isEmpty();
                ndl0 ndl0Var = (ndl0) obj2;
                p7m0 p7m0Var5 = ndl0Var.n;
                if (zIsEmpty) {
                    do {
                        value5 = p7m0Var5.getValue();
                    } while (!p7m0Var5.m(value5, odl0.a((odl0) value5, true, false, false, false, false, false, null, null, null, null, null, ndl0Var.x(), 4076)));
                } else {
                    do {
                        value6 = p7m0Var5.getValue();
                        odl0Var = (odl0) value6;
                        Iterable iterable = (Iterable) obj3;
                        arrayList = new ArrayList(r3d.q(iterable, 10));
                        Iterator it3 = iterable.iterator();
                        while (it3.hasNext()) {
                            axq.t(((cok0) it3.next()).f4705a, arrayList);
                        }
                        set = (Set) obj4;
                    } while (!p7m0Var5.m(value6, odl0.a(odl0Var, false, !Intrinsics.d(CollectionsKt.P0(arrayList), obj4), false, true, false, false, null, (List) obj3, null, set, set, null, 13024)));
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                String str12 = (String) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                xpl0 xpl0Var = (xpl0) obj2;
                int i8 = xpl0.P;
                p7m0 p7m0Var6 = xpl0Var.i.f25029a;
                do {
                    value7 = p7m0Var6.getValue();
                    value7.getClass();
                } while (!p7m0Var6.m(value7, hpl0.a((hpl0) value7, false, false, null, str12, false, null, null, null, null, null, null, null, null, null, null, false, 262135)));
                v3c.N(xpl0Var.M);
                if (vtb.c0(str12)) {
                    dnf0 dnf0Var = ((hpl0) xpl0Var.D()).f;
                    zmf0 zmf0Var = dnf0Var instanceof zmf0 ? (zmf0) dnf0Var : null;
                    if (zmf0Var == null || (a4xVar = zmf0Var.f44624a) == null || !a4xVar.isEmpty()) {
                        xpl0Var.O(false);
                    } else {
                        xpl0Var.N(str12);
                    }
                } else {
                    xpl0Var.N(str12);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                ((q7d0) ((w5z) this.j).d).a().registerOnSharedPreferenceChangeListener((iuy) obj2);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bai0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
