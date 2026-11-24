package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.javax.sip.message.Response;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c21 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c21(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f3602a = b;
    }

    private final Object Q(Object obj) {
        PackageManager packageManager;
        nf1 nf1Var = (nf1) obj;
        nf1Var.getClass();
        je1 je1Var = (je1) this.receiver;
        hfk0 hfk0Var = je1.S1;
        je1Var.getClass();
        boolean zEquals = nf1Var.equals(jf1.f16402a);
        vc1 vc1Var = vc1.f37166a;
        if (zEquals) {
            qcc.c0(je1Var);
        } else if (nf1Var instanceof gf1) {
            try {
                Context contextD = je1Var.D();
                if (contextD != null && (packageManager = contextD.getPackageManager()) != null) {
                    packageManager.getPackageInfo("org.telegram.messenger", 0);
                }
                kxq kxqVarB = je1Var.B();
                if (kxqVarB != null) {
                    wdk0 wdk0Var = je1Var.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    String strH = je1Var.H(R.string.social_telegram);
                    strH.getClass();
                    n6x.i0(kxqVarB, wdk0Var, strH, "org.telegram.messenger", ((gf1) nf1Var).f11183a);
                }
            } catch (Exception unused) {
                je1Var.H0(((gf1) nf1Var).f11183a);
            }
        } else if (nf1Var.equals(hf1.f12951a)) {
            kxq kxqVarB2 = je1Var.B();
            if (kxqVarB2 != null && tdc.U(kxqVarB2.r())) {
                je1Var.G0().x(qd1.f28511a);
            }
        } else if (nf1Var instanceof kf1) {
            je1Var.H0(((kf1) nf1Var).f18177a);
        } else if (nf1Var instanceof mf1) {
            String str = ((mf1) nf1Var).f21675a;
            ii iiVar = je1Var.M1;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH2 = je1Var.H(R.string.error);
            String strH3 = je1Var.H(R.string.ok_new);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
            androidx.fragment.app.e eVarC = je1Var.C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
        } else if (nf1Var instanceof ef1) {
            ob0 ob0Var = ((ef1) nf1Var).f7701a;
            if (ob0Var instanceof mb0) {
                String str2 = ((mb0) ob0Var).f21481a;
                ynb ynbVar = je1Var.P1;
                if (ynbVar == null) {
                    Intrinsics.h("changeBalanceDialogProvider");
                    throw null;
                }
                bm5 bm5Var = bm5.e;
                androidx.fragment.app.e eVarC2 = je1Var.C();
                eVarC2.getClass();
                ynb.b(ynbVar, bm5Var, str2, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
            } else if (!ob0Var.equals(lb0.f19732a)) {
                if (!ob0Var.equals(nb0.f23215a)) {
                    t9f.b();
                    return null;
                }
                kxq kxqVarB3 = je1Var.B();
                if (kxqVarB3 != null) {
                    ii iiVar2 = je1Var.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String string = kxqVarB3.getString(R.string.attention);
                    String string2 = kxqVarB3.getString(R.string.selected_balance_unavailable_description);
                    String string3 = kxqVarB3.getString(R.string.ok);
                    string3.getClass();
                    iiVar2.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB3.r());
                }
            }
            je1Var.G0().x(vc1Var);
        } else if (nf1Var instanceof ff1) {
            wq5 wq5Var = ((ff1) nf1Var).f9430a;
            if (wq5Var instanceof tq5) {
                je1Var.G0().x(new gd1(((tq5) wq5Var).f34365a));
            } else if (wq5Var instanceof uq5) {
                uq5 uq5Var = (uq5) wq5Var;
                je1Var.G0().x(new hd1(uq5Var.f36102a, uq5Var.b));
            } else {
                if (!(wq5Var instanceof vq5)) {
                    t9f.b();
                    return null;
                }
                je1Var.G0().x(new nd1(((vq5) wq5Var).f37839a));
            }
        } else if (nf1Var instanceof lf1) {
            String str3 = ((lf1) nf1Var).f19930a;
            wdk0 wdk0Var2 = je1Var.N1;
            if (wdk0Var2 == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            wdk0.k(wdk0Var2, new xdk0(rek0.b, str3, null, null, null, null, 124), je1Var, null, null, false, null, 1020);
        } else {
            if (!nf1Var.equals(if1.f14663a)) {
                t9f.b();
                return null;
            }
            ii iiVar3 = je1Var.M1;
            if (iiVar3 == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH4 = je1Var.H(R.string.error);
            String strH5 = je1Var.H(R.string.game_not_available_now);
            String strH6 = je1Var.H(R.string.ok);
            strH6.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
            androidx.fragment.app.e eVarC3 = je1Var.C();
            eVarC3.getClass();
            iiVar3.d(dialogFields2, eVarC3);
        }
        je1Var.G0().x(vc1Var);
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m71 m71Var;
        byte b = 4;
        byte b2 = 0;
        byte b3 = 5;
        byte b4 = 1;
        byte b5 = 3;
        switch (this.f3602a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((n21) this.receiver).R(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((n21) this.receiver).R(th2);
                return Unit.f46060a;
            case 2:
                t81 t81Var = (t81) obj;
                t81Var.getClass();
                m71 m71Var2 = (m71) this.receiver;
                rek0 rek0Var = m71.e2;
                rek0 rek0Var2 = rek0.b;
                if (t81Var instanceof f81) {
                    wdk0.k(m71Var2.I0(), ((f81) t81Var).f9085a, m71Var2, null, null, false, null, 1020);
                    m71Var = m71Var2;
                } else {
                    m71Var = m71Var2;
                    if (t81Var instanceof s71) {
                        m71Var.G0(((s71) t81Var).f31728a);
                    } else if (t81Var instanceof e81) {
                        String str = ((e81) t81Var).f7352a;
                        ii iiVarH0 = m71Var.H0();
                        int i = h6s.f2;
                        String strH = m71Var.H(R.string.caution);
                        String strH2 = m71Var.H(R.string.ok_new);
                        strH2.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, m71Var.H(R.string.cancel), (String) null, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY", m71Var.H(R.string.game_is_not_finsihed_dont_show_again_text), (ActionDialogButtonStyle) null, n12.b, false, 1424);
                        h6s h6sVar = new h6s();
                        h6sVar.R0(dialogFields);
                        androidx.fragment.app.e eVarC = m71Var.C();
                        eVarC.getClass();
                        iiVarH0.c(h6sVar, eVarC);
                    } else if (t81Var instanceof i81) {
                        String str2 = ((i81) t81Var).f14320a;
                        ii iiVarH1 = m71Var.H0();
                        String strH3 = m71Var.H(R.string.error);
                        String strH4 = m71Var.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) str2, (CharSequence) strH4, (String) null, (String) null, "REQUEST_GAME_URL_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC2 = m71Var.C();
                        eVarC2.getClass();
                        iiVarH1.d(dialogFields2, eVarC2);
                    } else if (t81Var instanceof l81) {
                        String str3 = ((l81) t81Var).f19586a;
                        ii iiVarH2 = m71Var.H0();
                        String strH5 = m71Var.H(R.string.error);
                        String strH6 = m71Var.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH5, (CharSequence) str3, (CharSequence) strH6, (String) null, (String) null, "REQUEST_NICKNAME_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC3 = m71Var.C();
                        eVarC3.getClass();
                        iiVarH2.d(dialogFields3, eVarC3);
                    } else if (t81Var instanceof j81) {
                        String str4 = ((j81) t81Var).f16064a;
                        ii iiVarH3 = m71Var.H0();
                        String strH7 = m71Var.H(R.string.caution);
                        String strH8 = m71Var.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH7, (CharSequence) str4, (CharSequence) strH8, m71Var.H(R.string.cancel), (String) null, "REQUEST_CONVERT_BALANCE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC4 = m71Var.C();
                        eVarC4.getClass();
                        iiVarH3.d(dialogFields4, eVarC4);
                    } else if (t81Var instanceof r81) {
                        wdk0.k(m71Var.I0(), new xdk0(rek0Var2, ((r81) t81Var).f30003a, null, null, null, null, 124), m71Var, null, null, false, null, 1020);
                    } else if (t81Var instanceof t71) {
                        t71 t71Var = (t71) t81Var;
                        String str5 = t71Var.f33444a;
                        String str6 = t71Var.b;
                        String str7 = t71Var.c;
                        qog0 qog0Var = (qog0) m71Var.X1.getValue();
                        if (qog0Var != null) {
                            qog0Var.f29072a.add(new fu0(qog0Var, str5, m71Var, str7, str6, (byte) 1));
                            qog0Var.a();
                        }
                    } else {
                        m71Var.getClass();
                        if (t81Var instanceof w71) {
                            Iterator it = ((w71) t81Var).f38649a.iterator();
                            while (it.hasNext()) {
                                int iOrdinal = ((ju0) it.next()).ordinal();
                                if (iOrdinal == 0) {
                                    m71Var.C().f("SELECT_BALANCE_REQUEST_KEY");
                                    m71Var.C().u0("SELECT_BALANCE_REQUEST_KEY", m71Var, new j71(m71Var, b5));
                                } else if (iOrdinal == 1) {
                                    m71Var.C().f("CHANGE_BALANCE_REQUEST_KEY");
                                    m71Var.C().u0("CHANGE_BALANCE_REQUEST_KEY", m71Var, new j71(m71Var, b3));
                                } else if (iOrdinal == 4) {
                                    m71Var.C().f("PLAY_FOR_REAL_DIALOG_KEY");
                                    m71Var.C().u0("PLAY_FOR_REAL_DIALOG_KEY", m71Var, new j71(m71Var, b4));
                                } else if (iOrdinal == 5) {
                                    m71Var.C().f("GAME_NICKNAME_REQUEST_KEY");
                                    m71Var.C().u0("GAME_NICKNAME_REQUEST_KEY", m71Var, new j71(m71Var, b2));
                                }
                            }
                        } else if (t81Var.equals(m81.f21347a)) {
                            kxq kxqVarB = m71Var.B();
                            if (kxqVarB != null) {
                                if (tdc.U(kxqVarB.r())) {
                                    m71Var.C().f("PLAY_FOR_REAL_DIALOG_KEY");
                                    m71Var.C().u0("PLAY_FOR_REAL_DIALOG_KEY", m71Var, new j71(m71Var, b4));
                                    gfk0 gfk0Var = ea1.n2;
                                    androidx.fragment.app.e eVarC5 = m71Var.C();
                                    eVarC5.getClass();
                                    gfk0Var.getClass();
                                    if (eVarC5.J("AggregatorPlayForRealDialog") == null) {
                                        ea1 ea1Var = new ea1();
                                        ea1Var.k2.x(ea1Var, ea1.o2[0], "PLAY_FOR_REAL_DIALOG_KEY");
                                        ea1Var.H0(eVarC5, "AggregatorPlayForRealDialog");
                                    }
                                } else {
                                    m71Var.J0().x(m61.f21244a);
                                }
                            }
                        } else if (t81Var.equals(z71.f43895a)) {
                            m71Var.C().f("CHANGE_BALANCE_REQUEST_KEY");
                            m71Var.C().u0("CHANGE_BALANCE_REQUEST_KEY", m71Var, new j71(m71Var, b3));
                            ynb ynbVar = m71Var.c2;
                            if (ynbVar == null) {
                                Intrinsics.h("changeBalanceDialogProvider");
                                throw null;
                            }
                            bm5 bm5Var = bm5.e;
                            androidx.fragment.app.e eVarC6 = m71Var.C();
                            eVarC6.getClass();
                            ynb.b(ynbVar, bm5Var, null, eVarC6, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                        } else if (t81Var.equals(b81.f2135a)) {
                            m71Var.C().f("SELECT_BALANCE_REQUEST_KEY");
                            m71Var.C().u0("SELECT_BALANCE_REQUEST_KEY", m71Var, new j71(m71Var, b5));
                            ynb ynbVar2 = m71Var.c2;
                            if (ynbVar2 == null) {
                                Intrinsics.h("changeBalanceDialogProvider");
                                throw null;
                            }
                            bm5 bm5Var2 = bm5.e;
                            androidx.fragment.app.e eVarC7 = m71Var.C();
                            eVarC7.getClass();
                            ynb.b(ynbVar2, bm5Var2, null, eVarC7, false, "SELECT_BALANCE_REQUEST_KEY", 366);
                        } else if (t81Var.equals(p81.f26532a)) {
                            ii iiVarH4 = m71Var.H0();
                            ccq0.V(m71Var, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY", new pk9(new k71(m71Var, (byte) 6), (byte) 9));
                            androidx.fragment.app.e eVarC8 = m71Var.C();
                            eVarC8.getClass();
                            Context contextO0 = m71Var.o0();
                            String string = contextO0.getString(R.string.error);
                            String string2 = contextO0.getString(R.string.change_balance_message);
                            String string3 = contextO0.getString(R.string.ok);
                            string3.getClass();
                            iiVarH4.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), eVarC8);
                        } else if (t81Var.equals(o81.f24809a)) {
                            kxq kxqVarB2 = m71Var.B();
                            if (kxqVarB2 != null) {
                                kxq kxqVarB3 = m71Var.B();
                                yc3 yc3Var = kxqVarB3 instanceof yc3 ? (yc3) kxqVarB3 : null;
                                if (yc3Var != null) {
                                    ccq0.U(yc3Var, new k71(m71Var, (byte) 7));
                                }
                                ii iiVarH5 = m71Var.H0();
                                String string4 = kxqVarB2.getString(R.string.attention);
                                String string5 = kxqVarB2.getString(R.string.casino_guard_notify_description);
                                String string6 = kxqVarB2.getString(R.string.ok);
                                string6.getClass();
                                iiVarH5.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                            }
                        } else if (t81Var.equals(a81.f401a)) {
                            ii iiVarH6 = m71Var.H0();
                            ccq0.V(m71Var, "BONUS_BALANCE_ERROR_DIALOG_KEY", new h8a(new k71(m71Var, b3), (byte) 9));
                            androidx.fragment.app.e eVarC9 = m71Var.C();
                            eVarC9.getClass();
                            Context contextO1 = m71Var.o0();
                            String string7 = contextO1.getString(R.string.attention);
                            String string8 = contextO1.getString(R.string.casino_guard_description);
                            String string9 = contextO1.getString(R.string.ok);
                            string9.getClass();
                            iiVarH6.d(new DialogFields((CharSequence) string7, (CharSequence) string8, (CharSequence) string9, contextO1.getString(R.string.cancel), (String) null, "BONUS_BALANCE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488), eVarC9);
                        } else if (t81Var.equals(y71.f42127a)) {
                            ii iiVarH7 = m71Var.H0();
                            String strH9 = m71Var.H(R.string.error);
                            String strH10 = m71Var.H(R.string.change_balance_message);
                            String strH11 = m71Var.H(R.string.ok_new);
                            strH11.getClass();
                            DialogFields dialogFields5 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, m71Var.H(R.string.my_accounts_title), (String) null, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                            androidx.fragment.app.e eVarC10 = m71Var.C();
                            eVarC10.getClass();
                            iiVarH7.d(dialogFields5, eVarC10);
                        } else if (t81Var.equals(x71.f40390a)) {
                            wdk0 wdk0VarI0 = m71Var.I0();
                            String strH12 = m71Var.H(R.string.get_balance_list_error);
                            strH12.getClass();
                            wdk0.k(wdk0VarI0, new xdk0(rek0Var2, strH12, null, null, null, null, 124), m71Var, null, null, false, null, 1020);
                            m71Var.J0().x(q61.f28178a);
                        } else if (t81Var.equals(h81.f12603a)) {
                            ii iiVarH8 = m71Var.H0();
                            String strH13 = m71Var.H(R.string.error);
                            String strH14 = m71Var.H(R.string.line_live_error_response);
                            String strH15 = m71Var.H(R.string.ok_new);
                            strH15.getClass();
                            DialogFields dialogFields6 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, (String) null, (String) null, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                            androidx.fragment.app.e eVarC11 = m71Var.C();
                            eVarC11.getClass();
                            iiVarH8.d(dialogFields6, eVarC11);
                        } else if (t81Var instanceof n81) {
                            hfk0 hfk0Var = kv0.n2;
                            androidx.fragment.app.e eVarC12 = m71Var.C();
                            eVarC12.getClass();
                            hfk0Var.getClass();
                            hfk0.l(eVarC12);
                        } else if (t81Var.equals(g81.f10842a)) {
                            ii iiVarH9 = m71Var.H0();
                            String strH16 = m71Var.H(R.string.error);
                            String strH17 = m71Var.H(R.string.game_not_available_now);
                            String strH18 = m71Var.H(R.string.ok);
                            strH18.getClass();
                            DialogFields dialogFields7 = new DialogFields((CharSequence) strH16, (CharSequence) strH17, (CharSequence) strH18, (String) null, (String) null, "REQUEST_GAME_NOT_AVAILABLE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                            androidx.fragment.app.e eVarC13 = m71Var.C();
                            eVarC13.getClass();
                            iiVarH9.d(dialogFields7, eVarC13);
                        } else if (t81Var.equals(d81.f5621a)) {
                            ii iiVarH10 = m71Var.H0();
                            String strH19 = m71Var.H(R.string.error);
                            String strH20 = m71Var.H(R.string.casino_favorites_limit_error);
                            String strH21 = m71Var.H(R.string.ok_new);
                            strH21.getClass();
                            DialogFields dialogFields8 = new DialogFields((CharSequence) strH19, (CharSequence) strH20, (CharSequence) strH21, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC14 = m71Var.C();
                            eVarC14.getClass();
                            iiVarH10.d(dialogFields8, eVarC14);
                        } else if (t81Var instanceof c81) {
                            wdk0.k(m71Var.I0(), new xdk0(rek0Var2, ((c81) t81Var).f3890a, null, null, null, null, 124), m71Var, null, null, false, null, 1020);
                        } else if (t81Var.equals(q81.f28277a)) {
                            ii iiVarH11 = m71Var.H0();
                            String strH22 = m71Var.H(R.string.caution);
                            String strH23 = m71Var.H(R.string.something_went_wrong);
                            String strH24 = m71Var.H(R.string.ok_new);
                            strH24.getClass();
                            DialogFields dialogFields9 = new DialogFields((CharSequence) strH22, (CharSequence) strH23, (CharSequence) strH24, (String) null, (String) null, "ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                            androidx.fragment.app.e eVarC15 = m71Var.C();
                            eVarC15.getClass();
                            iiVarH11.d(dialogFields9, eVarC15);
                        } else if (t81Var.equals(k81.f17850a)) {
                            ii iiVarH12 = m71Var.H0();
                            String strH25 = m71Var.H(R.string.error);
                            String strH26 = m71Var.H(R.string.slot_not_available_now);
                            String strH27 = m71Var.H(R.string.ok_new);
                            strH27.getClass();
                            DialogFields dialogFields10 = new DialogFields((CharSequence) strH25, (CharSequence) strH26, (CharSequence) strH27, (String) null, (String) null, "REQUEST_NETWORK_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                            androidx.fragment.app.e eVarC16 = m71Var.C();
                            eVarC16.getClass();
                            iiVarH12.d(dialogFields10, eVarC16);
                        } else if (t81Var.equals(v71.f36900a)) {
                            kxq kxqVarN0 = m71Var.n0();
                            Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                            kxqVarN0.startActivityForResult(intentJ, 555);
                        } else if (t81Var.equals(u71.f35161a)) {
                            m71Var.n0().setRequestedOrientation(1);
                        } else if (t81Var.equals(s81.f31780a)) {
                            m71Var.n0().setRequestedOrientation(-1);
                        }
                    }
                }
                m71Var.J0().x(r61.f29913a);
                return Unit.f46060a;
            case 3:
                h71 h71Var = (h71) obj;
                h71Var.getClass();
                ((k3t0) this.receiver).x(h71Var);
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((n91) this.receiver).R(th3);
                return Unit.f46060a;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((n91) this.receiver).R(th4);
                return Unit.f46060a;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((n91) this.receiver).R(th5);
                return Unit.f46060a;
            case 7:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((n91) this.receiver).R(th6);
                return Unit.f46060a;
            case 8:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((n91) this.receiver).R(th7);
                return Unit.f46060a;
            case 9:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((n91) this.receiver).R(th8);
                return Unit.f46060a;
            case 10:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                n91 n91Var = (n91) this.receiver;
                n91Var.getClass();
                if (th9 instanceof lx50) {
                    ((u81) n91Var.D()).u.add(ju0.f);
                    n91Var.G(n81.f23066a);
                } else if (th9 instanceof cii0) {
                    String message = th9.getMessage();
                    n91Var.G(new i81(message != null ? message : ""));
                } else {
                    n91Var.R(th9);
                }
                return Unit.f46060a;
            case 11:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((n91) this.receiver).R(th10);
                return Unit.f46060a;
            case 12:
                fa1 fa1Var = (fa1) obj;
                fa1Var.getClass();
                ea1 ea1Var2 = (ea1) this.receiver;
                gfk0 gfk0Var2 = ea1.n2;
                vcc.f0(i120.V(new Pair("RESULT_PLAY_FOR_REAL_LISTENER_KEY", fa1Var.f9183a)), ea1Var2, ea1Var2.k2.n(ea1Var2, ea1.o2[0]));
                ea1Var2.y0();
                ea1Var2.P0().x(x91.f40488a);
                return Unit.f46060a;
            case 13:
                wb1 wb1Var = (wb1) obj;
                wb1Var.getClass();
                cb1 cb1Var = (cb1) this.receiver;
                rek0 rek0Var3 = cb1.e2;
                cb1Var.getClass();
                byte b6 = 2;
                if (wb1Var instanceof eb1) {
                    Iterator it2 = ((eb1) wb1Var).f7496a.iterator();
                    while (it2.hasNext()) {
                        int iOrdinal2 = ((ju0) it2.next()).ordinal();
                        if (iOrdinal2 == 0) {
                            cb1Var.C().f("SELECT_BALANCE_REQUEST_KEY");
                            cb1Var.C().u0("SELECT_BALANCE_REQUEST_KEY", cb1Var, new bb1(cb1Var, b6));
                        } else if (iOrdinal2 == 1) {
                            cb1Var.C().f("CHANGE_BALANCE_REQUEST_KEY");
                            cb1Var.C().u0("CHANGE_BALANCE_REQUEST_KEY", cb1Var, new bb1(cb1Var, b4));
                        } else if (iOrdinal2 == 2) {
                            cb1Var.C().f("SELECT_GAME_MODE_REQUEST_KEY");
                            cb1Var.C().u0("SELECT_GAME_MODE_REQUEST_KEY", cb1Var, new bb1(cb1Var, b5));
                        } else if (iOrdinal2 == 3) {
                            cb1Var.C().f("REQUEST_CODE_WALLET_DIALOG_KEY");
                            cb1Var.C().u0("REQUEST_CODE_WALLET_DIALOG_KEY", cb1Var, new bb1(cb1Var, b2));
                        } else if (iOrdinal2 == 5) {
                            cb1Var.C().f("GAME_NICKNAME_REQUEST_KEY");
                            cb1Var.C().u0("GAME_NICKNAME_REQUEST_KEY", cb1Var, new bb1(cb1Var, b));
                        }
                    }
                } else if (wb1Var instanceof lb1) {
                    String str8 = ((lb1) wb1Var).f19734a;
                    cb1Var.C().f("SELECT_GAME_MODE_REQUEST_KEY");
                    cb1Var.C().u0("SELECT_GAME_MODE_REQUEST_KEY", cb1Var, new bb1(cb1Var, b5));
                    j120.P(cb1Var, new mc((Object) str8, (Object) cb1Var, (byte) 13));
                } else if (wb1Var instanceof sb1) {
                    cb1Var.C().f("GAME_NICKNAME_REQUEST_KEY");
                    cb1Var.C().u0("GAME_NICKNAME_REQUEST_KEY", cb1Var, new bb1(cb1Var, b));
                    hfk0 hfk0Var2 = kv0.n2;
                    androidx.fragment.app.e eVarC17 = cb1Var.C();
                    eVarC17.getClass();
                    hfk0Var2.getClass();
                    hfk0.l(eVarC17);
                } else if (wb1Var instanceof kb1) {
                    String str9 = ((kb1) wb1Var).f17990a;
                    ii iiVarG0 = cb1Var.G0();
                    int i2 = h6s.f2;
                    String strH28 = cb1Var.H(R.string.caution);
                    String strH29 = cb1Var.H(R.string.ok_new);
                    strH29.getClass();
                    DialogFields dialogFields11 = new DialogFields((CharSequence) strH28, (CharSequence) str9, (CharSequence) strH29, cb1Var.H(R.string.cancel), (String) null, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY", cb1Var.H(R.string.game_is_not_finsihed_dont_show_again_text), (ActionDialogButtonStyle) null, n12.b, false, 1424);
                    h6s h6sVar2 = new h6s();
                    h6sVar2.R0(dialogFields11);
                    androidx.fragment.app.e eVarC18 = cb1Var.C();
                    eVarC18.getClass();
                    iiVarG0.c(h6sVar2, eVarC18);
                } else if (wb1Var instanceof pb1) {
                    String str10 = ((pb1) wb1Var).f26682a;
                    ii iiVarG1 = cb1Var.G0();
                    String strH30 = cb1Var.H(R.string.caution);
                    String strH31 = cb1Var.H(R.string.ok_new);
                    strH31.getClass();
                    DialogFields dialogFields12 = new DialogFields((CharSequence) strH30, (CharSequence) str10, (CharSequence) strH31, cb1Var.H(R.string.cancel), (String) null, "REQUEST_CONVERT_BALANCE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC19 = cb1Var.C();
                    eVarC19.getClass();
                    iiVarG1.d(dialogFields12, eVarC19);
                } else if (wb1Var instanceof tb1) {
                    tb1 tb1Var = (tb1) wb1Var;
                    long j = tb1Var.f33639a;
                    long j2 = tb1Var.b;
                    cb1Var.C().f("REQUEST_CODE_WALLET_DIALOG_KEY");
                    cb1Var.C().u0("REQUEST_CODE_WALLET_DIALOG_KEY", cb1Var, new bb1(cb1Var, b2));
                    sxs0 sxs0Var = ywu0.s2;
                    androidx.fragment.app.e eVarC20 = cb1Var.C();
                    eVarC20.getClass();
                    sxs0Var.getClass();
                    sxs0.c(eVarC20, true, j, j2, "REQUEST_CODE_WALLET_DIALOG_KEY");
                } else if (wb1Var instanceof hb1) {
                    String str11 = ((hb1) wb1Var).f12749a;
                    cb1Var.C().f("CHANGE_BALANCE_REQUEST_KEY");
                    cb1Var.C().u0("CHANGE_BALANCE_REQUEST_KEY", cb1Var, new bb1(cb1Var, b4));
                    ynb ynbVar3 = cb1Var.c2;
                    if (ynbVar3 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var3 = bm5.e;
                    androidx.fragment.app.e eVarC21 = cb1Var.C();
                    eVarC21.getClass();
                    ynb.b(ynbVar3, bm5Var3, str11, eVarC21, false, "CHANGE_BALANCE_REQUEST_KEY", Response.BUSY_HERE);
                } else if (wb1Var instanceof jb1) {
                    cb1Var.C().f("SELECT_BALANCE_REQUEST_KEY");
                    cb1Var.C().u0("SELECT_BALANCE_REQUEST_KEY", cb1Var, new bb1(cb1Var, b6));
                    ynb ynbVar4 = cb1Var.c2;
                    if (ynbVar4 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var4 = bm5.e;
                    androidx.fragment.app.e eVarC22 = cb1Var.C();
                    eVarC22.getClass();
                    ynb.b(ynbVar4, bm5Var4, null, eVarC22, false, "SELECT_BALANCE_REQUEST_KEY", 366);
                } else if (wb1Var instanceof vb1) {
                    ii iiVarG2 = cb1Var.G0();
                    ccq0.V(cb1Var, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY", new pk9(new ab1(cb1Var, (byte) 5), (byte) 9));
                    androidx.fragment.app.e eVarC23 = cb1Var.C();
                    eVarC23.getClass();
                    Context contextO2 = cb1Var.o0();
                    String string10 = contextO2.getString(R.string.error);
                    String string11 = contextO2.getString(R.string.change_balance_message);
                    String string12 = contextO2.getString(R.string.ok);
                    string12.getClass();
                    iiVarG2.d(new DialogFields((CharSequence) string10, (CharSequence) string11, (CharSequence) string12, (String) null, (String) null, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), eVarC23);
                } else if (wb1Var instanceof ub1) {
                    kxq kxqVarB4 = cb1Var.B();
                    if (kxqVarB4 != null) {
                        kxq kxqVarB5 = cb1Var.B();
                        yc3 yc3Var2 = kxqVarB5 instanceof yc3 ? (yc3) kxqVarB5 : null;
                        if (yc3Var2 != null) {
                            ccq0.U(yc3Var2, new ab1(cb1Var, (byte) 3));
                        }
                        ii iiVarG3 = cb1Var.G0();
                        String string13 = kxqVarB4.getString(R.string.attention);
                        String string14 = kxqVarB4.getString(R.string.casino_guard_notify_description);
                        String string15 = kxqVarB4.getString(R.string.ok);
                        string15.getClass();
                        iiVarG3.d(new DialogFields((CharSequence) string13, (CharSequence) string14, (CharSequence) string15, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB4.r());
                    }
                } else if (wb1Var instanceof ib1) {
                    kxq kxqVarB6 = cb1Var.B();
                    if (kxqVarB6 != null) {
                        kxq kxqVarB7 = cb1Var.B();
                        yc3 yc3Var3 = kxqVarB7 instanceof yc3 ? (yc3) kxqVarB7 : null;
                        if (yc3Var3 != null) {
                            ccq0.U(yc3Var3, new ab1(cb1Var, (byte) 3));
                        }
                        ii iiVarG4 = cb1Var.G0();
                        String string16 = kxqVarB6.getString(R.string.attention);
                        String string17 = kxqVarB6.getString(R.string.casino_guard_notify_description);
                        String string18 = kxqVarB6.getString(R.string.ok);
                        string18.getClass();
                        iiVarG4.d(new DialogFields((CharSequence) string16, (CharSequence) string17, (CharSequence) string18, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB6.r());
                    }
                } else if (wb1Var instanceof gb1) {
                    ii iiVarG5 = cb1Var.G0();
                    String strH32 = cb1Var.H(R.string.error);
                    String strH33 = cb1Var.H(R.string.change_balance_message);
                    String strH34 = cb1Var.H(R.string.ok_new);
                    strH34.getClass();
                    DialogFields dialogFields13 = new DialogFields((CharSequence) strH32, (CharSequence) strH33, (CharSequence) strH34, cb1Var.H(R.string.my_accounts_title), (String) null, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC24 = cb1Var.C();
                    eVarC24.getClass();
                    iiVarG5.d(dialogFields13, eVarC24);
                } else if (wb1Var instanceof fb1) {
                    wdk0 wdk0Var = cb1Var.b2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackBarManager");
                        throw null;
                    }
                    rek0 rek0Var4 = rek0.b;
                    String strH35 = cb1Var.H(R.string.get_balance_list_error);
                    strH35.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var4, strH35, null, null, null, null, 124), cb1Var, null, null, false, null, 1020);
                    cb1Var.H0().x(sa1.f31871a);
                } else if (wb1Var instanceof ob1) {
                    String str12 = ((ob1) wb1Var).f24954a;
                    ii iiVarG6 = cb1Var.G0();
                    String strH36 = cb1Var.H(R.string.error);
                    String strH37 = cb1Var.H(R.string.ok_new);
                    strH37.getClass();
                    DialogFields dialogFields14 = new DialogFields((CharSequence) strH36, (CharSequence) str12, (CharSequence) strH37, (String) null, (String) null, "REQUEST_GAME_URL_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC25 = cb1Var.C();
                    eVarC25.getClass();
                    iiVarG6.d(dialogFields14, eVarC25);
                } else if (wb1Var instanceof rb1) {
                    String str13 = ((rb1) wb1Var).f30160a;
                    ii iiVarG7 = cb1Var.G0();
                    String strH38 = cb1Var.H(R.string.error);
                    String strH39 = cb1Var.H(R.string.ok_new);
                    strH39.getClass();
                    DialogFields dialogFields15 = new DialogFields((CharSequence) strH38, (CharSequence) str13, (CharSequence) strH39, (String) null, (String) null, "REQUEST_NICKNAME_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC26 = cb1Var.C();
                    eVarC26.getClass();
                    iiVarG7.d(dialogFields15, eVarC26);
                } else if (wb1Var instanceof nb1) {
                    ii iiVarG8 = cb1Var.G0();
                    String strH40 = cb1Var.H(R.string.error);
                    String strH41 = cb1Var.H(R.string.line_live_error_response);
                    String strH42 = cb1Var.H(R.string.ok_new);
                    strH42.getClass();
                    DialogFields dialogFields16 = new DialogFields((CharSequence) strH40, (CharSequence) strH41, (CharSequence) strH42, (String) null, (String) null, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC27 = cb1Var.C();
                    eVarC27.getClass();
                    iiVarG8.d(dialogFields16, eVarC27);
                } else if (wb1Var instanceof mb1) {
                    ii iiVarG9 = cb1Var.G0();
                    String strH43 = cb1Var.H(R.string.error);
                    String strH44 = cb1Var.H(R.string.game_not_available_now);
                    String strH45 = cb1Var.H(R.string.ok);
                    strH45.getClass();
                    DialogFields dialogFields17 = new DialogFields((CharSequence) strH43, (CharSequence) strH44, (CharSequence) strH45, (String) null, (String) null, "REQUEST_GAME_NOT_AVAILABLE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC28 = cb1Var.C();
                    eVarC28.getClass();
                    iiVarG9.d(dialogFields17, eVarC28);
                } else if (wb1Var instanceof qb1) {
                    ii iiVarG10 = cb1Var.G0();
                    String strH46 = cb1Var.H(R.string.error);
                    String strH47 = cb1Var.H(R.string.slot_not_available_now);
                    String strH48 = cb1Var.H(R.string.ok_new);
                    strH48.getClass();
                    DialogFields dialogFields18 = new DialogFields((CharSequence) strH46, (CharSequence) strH47, (CharSequence) strH48, (String) null, (String) null, "REQUEST_NETWORK_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC29 = cb1Var.C();
                    eVarC29.getClass();
                    iiVarG10.d(dialogFields18, eVarC29);
                }
                cb1Var.H0().x(ta1.f33592a);
                return Unit.f46060a;
            case 14:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((kc1) this.receiver).P(th11);
                return Unit.f46060a;
            case 15:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((kc1) this.receiver).P(th12);
                return Unit.f46060a;
            case 16:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((kc1) this.receiver).P(th13);
                return Unit.f46060a;
            case 17:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((kc1) this.receiver).P(th14);
                return Unit.f46060a;
            case 18:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((kc1) this.receiver).P(th15);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((kc1) this.receiver).P(th16);
                return Unit.f46060a;
            case 20:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                kc1 kc1Var = (kc1) this.receiver;
                au0 au0Var = kc1Var.w;
                u58 u58Var = kc1Var.v;
                if (th17 instanceof lx50) {
                    u58Var.e(-7, ((xb1) kc1Var.D()).f40578a.f5778a);
                    au0Var.k((int) ((xb1) kc1Var.D()).f40578a.f5778a, -7);
                    kc1Var.U(((lx50) th17).g);
                    ((xb1) kc1Var.D()).j.add(ju0.f);
                    kc1Var.G(sb1.f31908a);
                } else if (th17 instanceof cii0) {
                    int i3 = ((cii0) th17).g;
                    u58Var.e(i3, ((xb1) kc1Var.D()).f40578a.f5778a);
                    au0Var.k((int) ((xb1) kc1Var.D()).f40578a.f5778a, i3);
                    String message2 = th17.getMessage();
                    kc1Var.G(new ob1(message2 != null ? message2 : ""));
                } else if (th17 instanceof ko) {
                    ony onyVar = (ony) kc1Var.x.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("GetActualDomain", ncy.c("Cannot to get current domain mirror"));
                    ((rny) onyVar).a("GetActualDomain", new tny("event", xp20.n(linkedHashMap)));
                    kc1Var.P(th17);
                } else {
                    kc1Var.P(th17);
                }
                return Unit.f46060a;
            case 21:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((kc1) this.receiver).P(th18);
                return Unit.f46060a;
            case 22:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((kc1) this.receiver).P(th19);
                return Unit.f46060a;
            case 23:
                ((xec0) obj).getClass();
                ae1 ae1Var = (ae1) this.receiver;
                gfk0 gfk0Var3 = ae1.n2;
                ae1Var.getClass();
                vcc.f0(i120.U(), ae1Var, "AGGREGATOR_PROMO_CODE_MESSAGE_REQUEST_KEY");
                ae1Var.y0();
                ((k3t0) ae1Var.m2.getValue()).x(tec0.f33814a);
                return Unit.f46060a;
            case 24:
                return Q(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ud1 ud1Var = (ud1) obj;
                ud1Var.getClass();
                ((k3t0) this.receiver).x(ud1Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                aj1 aj1Var = (aj1) obj;
                aj1Var.getClass();
                qi1 qi1Var = (qi1) this.receiver;
                pek0 pek0Var = qi1.P1;
                qi1Var.getClass();
                if (aj1Var instanceof yi1) {
                    j120.Y(qi1Var);
                } else {
                    if (!(aj1Var instanceof zi1)) {
                        t9f.b();
                        return null;
                    }
                    uzb0 uzb0Var = ((zi1) aj1Var).f44418a;
                    gle0 gle0Var = dlk0.m2;
                    androidx.fragment.app.e eVarF = qi1Var.F();
                    gle0Var.getClass();
                    gle0.h(eVarF, "SORT_RESULT_KEY", uzb0Var);
                }
                qi1Var.G0().x(uh1.f35652a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gi1 gi1Var = (gi1) obj;
                gi1Var.getClass();
                ((k3t0) this.receiver).x(gi1Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                a8d0 a8d0Var = (a8d0) obj;
                a8d0Var.getClass();
                ((bk1) this.receiver).x(a8d0Var);
                return Unit.f46060a;
            default:
                gk1 gk1Var = (gk1) obj;
                gk1Var.getClass();
                ((k3t0) this.receiver).x(gk1Var);
                return Unit.f46060a;
        }
    }
}
