package a;

import android.javax.sip.message.Response;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.TokenRestoreData;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.wallet.impl.presentation.dialogs.accountactions.params.AccountActionsScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33144a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t1(Object obj, byte b) {
        this.f33144a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x04a6  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Object value;
        byte b = this.f33144a;
        byte b2 = 9;
        byte b3 = 2;
        long j = -1;
        byte b4 = 12;
        byte b5 = 10;
        byte b6 = 0;
        byte b7 = 1;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return obj == ((u1) obj3) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ldy ldyVar = (ldy) obj3;
                mcy mcyVar = (mcy) obj;
                mcyVar.getClass();
                ldyVar.M(mcyVar, (String) CollectionsKt.d0(ldyVar.f19876a));
                return Unit.f46060a;
            case 2:
                h3 h3Var = (h3) obj3;
                Map.Entry entry = (Map.Entry) obj;
                d3 d3Var = h3.c;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == h3Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value2 = entry.getValue();
                sb.append(value2 != h3Var ? String.valueOf(value2) : "(this Map)");
                return sb.toString();
            case 3:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((prx) cpVar.u).f27488a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new k1((q9) obj3, cpVar, b2));
                cpVar.t(new j9(cpVar, (byte) 5));
                cpVar.z(new bb(cpVar, b6));
                return Unit.f46060a;
            case 4:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                DsMenuCell dsMenuCell2 = ((rrx) cpVar2.u).f31006a;
                dsMenuCell2.getClass();
                dyb.O(dsMenuCell2, new k1((q9) obj3, cpVar2, b5));
                cpVar2.t(new j9(cpVar2, (byte) 8));
                return Unit.f46060a;
            case 5:
                qc qcVar = (qc) obj3;
                rc rcVar = (rc) obj;
                hfk0 hfk0Var = qc.n2;
                rcVar.getClass();
                hc hcVar = rcVar.f30214a;
                long j2 = rcVar.b;
                int iOrdinal = hcVar.ordinal();
                if (iOrdinal == 0) {
                    str = "SELECT_ACTIVE_ACTION_KEY";
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    str = "SELECT_REMOVE_ACTION_KEY";
                }
                vcc.f0(i120.V(new Pair(str, Long.valueOf(j2))), qcVar, ((AccountActionsScreenParams) qcVar.m2.n(qcVar, qc.o2[0])).f47314a);
                qcVar.y0();
                ((k3t0) qcVar.l2.getValue()).x(ic.f14513a);
                return Unit.f46060a;
            case 6:
                qd qdVar = (qd) obj3;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zn00 zn00Var = qdVar.d;
                TokenRestoreData tokenRestoreData = qdVar.g.f25837a;
                TokenRestoreData tokenRestoreData2 = new TokenRestoreData(tokenRestoreData.f46941a, tokenRestoreData.b, tokenRestoreData.c);
                Iterable iterable = (Iterable) qdVar.j.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (obj4 instanceof ug) {
                        arrayList.add(obj4);
                    }
                }
                for (Object obj5 : arrayList) {
                    if (((ug) obj5).c) {
                        obj2 = obj5;
                        ug ugVar = (ug) obj2;
                        k0w0Var.k(zn00Var.J0(tokenRestoreData2, ugVar != null ? ugVar.f35599a : -1L, we50.d));
                        return Unit.f46060a;
                    }
                }
                ug ugVar2 = (ug) obj2;
                k0w0Var.k(zn00Var.J0(tokenRestoreData2, ugVar2 != null ? ugVar2.f35599a : -1L, we50.d));
                return Unit.f46060a;
            case 7:
                uf ufVar = (uf) obj3;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = ufVar.e;
                rf rfVar = new rf(sa10.b(ufVar.d, pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new nc(ufVar, b3), 16));
                p7m0Var.getClass();
                p7m0Var.o(null, rfVar);
                return Unit.f46060a;
            case 8:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                abi0Var.b(cbi0.b, Integer.valueOf(((dh) obj3).c));
                return Unit.f46060a;
            case 9:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                LinearLayout linearLayout = ((fux) cpVar3.u).f10187a;
                linearLayout.getClass();
                dyb.c0(linearLayout, new k1((du20) obj3, cpVar3, b4));
                cpVar3.t(new j9(cpVar3, b5));
                return Unit.f46060a;
            case 10:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                LinearLayout linearLayout2 = ((gux) cpVar4.u).f11952a;
                linearLayout2.getClass();
                dyb.c0(linearLayout2, new k1((du20) obj3, cpVar4, (byte) 13));
                cpVar4.t(new j9(cpVar4, (byte) 11));
                return Unit.f46060a;
            case 11:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                LinearLayout linearLayout3 = ((urx) cpVar5.u).f36183a;
                linearLayout3.getClass();
                dyb.O(linearLayout3, new k1((t0) obj3, cpVar5, (byte) 14));
                cpVar5.t(new ok(cpVar5, cpVar5, b6));
                return Unit.f46060a;
            case 12:
                cp cpVar6 = (cp) obj;
                cpVar6.getClass();
                ((tp10) cpVar6.u).f34310a.setOnClickListener(new wg((pf10) obj3, cpVar6, b7));
                cpVar6.t(new j9(cpVar6, b4));
                return Unit.f46060a;
            case 13:
                rm rmVar = (rm) obj;
                jdk0 jdk0Var = xm.Q1;
                rmVar.getClass();
                ((k3t0) ((xm) obj3).N1.getValue()).x(rmVar);
                return Unit.f46060a;
            case 14:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                mi70 mi70Var = ((mt) obj3).B;
                i38 i38Var = new i38(12);
                mi70Var.getClass();
                k0w0Var2.k(new BindPhoneNumberScreen(i38Var));
                return Unit.f46060a;
            case 15:
                gu guVar = (gu) obj3;
                guVar.q.invoke((s4q0) obj, mbc.R(guVar, dy2.b));
                return Unit.f46060a;
            case 16:
                ez ezVar = (ez) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                ezVar.s.b(th, new hhd((byte) 28));
                p7m0 p7m0Var2 = ezVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    ezVar.f.getClass();
                } while (!p7m0Var2.m(value, my.a((my) value, null, true, 10)));
                return Unit.f46060a;
            case 17:
                qek0 qek0Var = s10.Q1;
                ((View) obj).getClass();
                ((s10) obj3).H0().x();
                return Unit.f46060a;
            case 18:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.e(abi0Var2, String.valueOf(((fc0) obj3).c.a()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((oe0) obj3).p.b(th2, new g20(b2));
                return Unit.f46060a;
            case 20:
                dm0 dm0Var = (dm0) obj3;
                kn0 kn0Var = (kn0) obj;
                pek0 pek0Var = dm0.S1;
                kn0Var.getClass();
                if (kn0Var.equals(hn0.f13328a)) {
                    qcc.c0(dm0Var);
                } else if (kn0Var instanceof jn0) {
                    jn0 jn0Var = (jn0) kn0Var;
                    String str2 = jn0Var.f16790a;
                    String str3 = jn0Var.b;
                    String str4 = jn0Var.c;
                    ii iiVar = dm0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields = new DialogFields((CharSequence) str2, (CharSequence) str3, (CharSequence) str4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = dm0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (kn0Var instanceof in0) {
                    String str5 = ((in0) kn0Var).f15050a;
                    wdk0 wdk0Var = dm0Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str5, null, null, null, null, 124), dm0Var, null, null, false, null, 1020);
                } else {
                    if (!(kn0Var instanceof gn0)) {
                        t9f.b();
                        return null;
                    }
                    ob0 ob0Var = ((gn0) kn0Var).f11565a;
                    if (ob0Var instanceof mb0) {
                        String str6 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = dm0Var.L1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC2 = dm0Var.C();
                        eVarC2.getClass();
                        ynb.b(ynbVar, bm5Var, str6, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var.equals(lb0.f19732a)) {
                        kxq kxqVarB = dm0Var.B();
                        if (kxqVarB != null) {
                            ii iiVar2 = dm0Var.N1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = kxqVarB.getString(R.string.attention);
                            String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string3 = kxqVarB.getString(R.string.ok);
                            string3.getClass();
                            iiVar2.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else {
                        if (!ob0Var.equals(nb0.f23215a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = dm0Var.B();
                        if (kxqVarB2 != null) {
                            ii iiVar3 = dm0Var.N1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string4 = kxqVarB2.getString(R.string.attention);
                            String string5 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string6 = kxqVarB2.getString(R.string.ok);
                            string6.getClass();
                            iiVar3.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                }
                dm0Var.G0().x(zk0.f44505a);
                return Unit.f46060a;
            case 21:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 14, null, null, new ugd(1678671223, true, new fp0((mm40) obj3, b6)), 6);
                return Unit.f46060a;
            case 22:
                qek0 qek0Var2 = jq0.P1;
                ((eg60) obj).getClass();
                ((jq0) obj3).G0().x(tp0.f34308a);
                return Unit.f46060a;
            case 23:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                yai0.h(abi0Var3, ((st0) obj3).d.b ? "Active" : "Inactive");
                return Unit.f46060a;
            case 24:
                rek0 rek0Var = hu0.Y1;
                ((eg60) obj).getClass();
                ((hu0) obj3).G0().x(os0.f25760a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kv0 kv0Var = (kv0) obj3;
                x5q0 x5q0Var = (x5q0) obj;
                hfk0 hfk0Var2 = kv0.n2;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    kv0Var.P0().x(new fv0(((w5q0) x5q0Var).f38596a));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new wul(lul.e, oe9.f25112a, new ue9((String) ((ov0) obj3).e), ((Boolean) obj).booleanValue(), false, true);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qy0 qy0Var = (qy0) obj3;
                gz0 gz0Var = (gz0) obj;
                pek0 pek0Var2 = qy0.S1;
                gz0Var.getClass();
                if (gz0Var instanceof fz0) {
                    String str7 = ((fz0) gz0Var).f10384a;
                    ii iiVar4 = qy0Var.L1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = qy0Var.H(R.string.error);
                    String strH2 = qy0Var.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH, (CharSequence) str7, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC3 = qy0Var.C();
                    eVarC3.getClass();
                    iiVar4.d(dialogFields2, eVarC3);
                } else if (gz0Var instanceof dz0) {
                    View viewQ0 = qy0Var.q0();
                    j120.X(viewQ0);
                    viewQ0.requestFocus();
                } else {
                    if (!(gz0Var instanceof ez0)) {
                        t9f.b();
                        return null;
                    }
                    String str8 = ((ez0) gz0Var).f8648a;
                    wdk0 wdk0Var2 = qy0Var.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackBarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, str8, null, null, null, null, 124), qy0Var, null, null, false, null, 1020);
                }
                ((k3t0) qy0Var.Q1.getValue()).x(cy0.f5149a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                peg0 peg0Var = ((a01) obj3).o;
                s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                k0w0Var3.h(peg0Var.q(new hr1(j, (int) b3)));
                return Unit.f46060a;
            default:
                f240 f240Var = (f240) obj;
                rek0 rek0Var2 = q21.O1;
                f240Var.getClass();
                ((fho0) ((q21) obj3).M1.getValue()).F(f240Var);
                return Unit.f46060a;
        }
    }
}
