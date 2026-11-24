package a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tg4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33891a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tg4(pru pruVar, bzt bztVar, rpt rptVar, pek pekVar, b8u b8uVar, epc epcVar, rpt rptVar2, n4u n4uVar) {
        this.f33891a = (byte) 0;
        this.b = pruVar;
        this.c = bztVar;
        this.d = rptVar;
        this.e = b8uVar;
        this.f = epcVar;
        this.g = rptVar2;
        this.h = n4uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v4, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33891a;
        byte b2 = 17;
        byte b3 = 22;
        byte b4 = 21;
        byte b5 = 2;
        byte b6 = 1;
        ?? E = 0;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                b8u b8uVar = (b8u) obj5;
                epc epcVar = (epc) obj4;
                rpt rptVar = (rpt) obj3;
                n4u n4uVar = (n4u) obj2;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                sff0 sff0VarA = ((pru) obj8).a();
                co4 co4Var = sff0VarA.N;
                v8d v8dVarA = ((bzt) obj7).f3488a.a();
                boolean z = ((xr) ((rpt) obj6).f30901a).i() == rl40.GMS;
                boolean zBooleanValue = ((Boolean) a8k0.H(vzg0Var, "KEY_LOGIN_BY_PHONE", Boolean.valueOf(co4Var.j || (co4Var.f && !co4Var.e && !co4Var.d)))).booleanValue();
                lc00 lc00VarO = pek.o(sff0VarA.k, co4Var);
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = lc00VarO.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        gd4 gd4Var = new gd4((String) a8k0.H(vzg0Var, "KEY_LOGIN", ""));
                        hd4 hd4Var = new hd4((String) a8k0.H(vzg0Var, "KEY_PASSWORD", ""));
                        id4 id4Var = new id4(((Number) a8k0.H(vzg0Var, "KEY_PHONE_MASK_MAX_LENGTH", 255)).intValue(), (String) a8k0.H(vzg0Var, "KEY_PHONE", ""), (String) a8k0.H(vzg0Var, "KEY_PHONE_MASK", ""), (String) a8k0.H(vzg0Var, "KEY_PHONE_CODE", ""), (String) a8k0.H(vzg0Var, "KEY_CODE_COUNTRY_IMAGE", ""));
                        iun iunVar = iun.f15405a;
                        boolean z2 = ((zte0) ((chf0) b8uVar.f2175a).b).f44955a.get();
                        boolean zBooleanValue2 = ((Boolean) a8k0.H(vzg0Var, "KEY_COUNTRY_ALLOWED", Boolean.TRUE)).booleanValue();
                        int iIntValue = ((Number) a8k0.H(vzg0Var, "KEY_SELECTED_COUNTRY_ID", 225)).intValue();
                        AuthDataErrorModel authDataErrorModel = (AuthDataErrorModel) a8k0.H(vzg0Var, "AUTHORIZATION_DATA_ERROR_KEY", null);
                        Boolean bool = Boolean.FALSE;
                        return new zf4(zBooleanValue, true, arrayList, false, gd4Var, hd4Var, id4Var, iIntValue, zBooleanValue2, iunVar, z2, authDataErrorModel, new pf4(sff0VarA.e0, co4Var.f, co4Var.d, co4Var.e, sff0VarA.T, sff0VarA.r.length() > 0, co4Var.m, co4Var.k, co4Var.l, sff0VarA.q1, sff0VarA.W0, epcVar.a().f13512a, v8dVarA.k, v8dVarA.m, rptVar.k(), co4Var.m, ((rpx) ((chf0) n4uVar.b).c).f30906a.get()), ((Boolean) a8k0.H(vzg0Var, "KEY_PASSWORD_RECOVER", bool)).booleanValue(), ((Boolean) a8k0.H(vzg0Var, "KEY_CONTENT_VISIBILITY_STATUS", bool)).booleanValue());
                    }
                    Object next = pawVar.next();
                    u54 u54Var = (u54) next;
                    t54 t54Var = u54Var instanceof t54 ? (t54) u54Var : null;
                    if (t54Var == null || t54Var.f33350a != 11 || z) {
                        arrayList.add(next);
                    }
                }
                break;
            case 1:
                b8u b8uVar2 = (b8u) obj5;
                epc epcVar2 = (epc) obj4;
                rpt rptVar2 = (rpt) obj3;
                vzg0 vzg0Var2 = (vzg0) obj;
                vzg0Var2.getClass();
                sff0 sff0VarA2 = ((pru) obj8).a();
                co4 co4Var2 = sff0VarA2.N;
                v8d v8dVarA2 = ((bzt) obj7).f3488a.a();
                ((n4u) obj2).e();
                boolean z3 = ((xr) ((rpt) obj6).f30901a).i() == rl40.GMS;
                boolean zBooleanValue3 = ((Boolean) a8k0.H(vzg0Var2, "KEY_LOGIN_BY_PHONE", Boolean.valueOf(co4Var2.j || (co4Var2.f && !co4Var2.e && !co4Var2.d)))).booleanValue();
                lc00 lc00VarO2 = pek.o(sff0VarA2.k, co4Var2);
                ArrayList arrayList2 = new ArrayList();
                ListIterator listIterator2 = lc00VarO2.listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        gd4 gd4Var2 = new gd4((String) a8k0.H(vzg0Var2, "KEY_LOGIN", ""));
                        hd4 hd4Var2 = new hd4((String) a8k0.H(vzg0Var2, "KEY_PASSWORD", ""));
                        id4 id4Var2 = new id4(((Number) a8k0.H(vzg0Var2, "KEY_PHONE_MASK_MAX_LENGTH", 255)).intValue(), (String) a8k0.H(vzg0Var2, "KEY_PHONE", ""), (String) a8k0.H(vzg0Var2, "KEY_PHONE_MASK", ""), (String) a8k0.H(vzg0Var2, "KEY_PHONE_CODE", ""), (String) a8k0.H(vzg0Var2, "KEY_CODE_COUNTRY_IMAGE", ""));
                        iun iunVar2 = iun.f15405a;
                        boolean z4 = ((zte0) ((chf0) b8uVar2.f2175a).b).f44955a.get();
                        return new tj4(zBooleanValue3, true, arrayList2, false, gd4Var2, hd4Var2, id4Var2, ((Number) a8k0.H(vzg0Var2, "KEY_SELECTED_COUNTRY_ID", 225)).intValue(), ((Boolean) a8k0.H(vzg0Var2, "KEY_COUNTRY_ALLOWED", Boolean.TRUE)).booleanValue(), iunVar2, z4, (AuthDataErrorModel) a8k0.H(vzg0Var2, "AUTHORIZATION_DATA_ERROR_KEY", null), new jj4(sff0VarA2.e0, co4Var2.f, co4Var2.d, co4Var2.e, sff0VarA2.T, sff0VarA2.r.length() > 0, co4Var2.m, co4Var2.k, co4Var2.l, sff0VarA2.q1, sff0VarA2.W0, epcVar2.a().f13512a, v8dVarA2.k, v8dVarA2.m, rptVar2.k(), co4Var2.m), "", ((Boolean) a8k0.H(vzg0Var2, "KEY_PASSWORD_RECOVER", Boolean.FALSE)).booleanValue());
                    }
                    Object next2 = pawVar2.next();
                    u54 u54Var2 = (u54) next2;
                    t54 t54Var2 = u54Var2 instanceof t54 ? (t54) u54Var2 : null;
                    if (t54Var2 == null || t54Var2.f33350a != 11 || z3) {
                        arrayList2.add(next2);
                    }
                }
                break;
            case 2:
                vne vneVar = (vne) obj8;
                Fragment fragment = (Fragment) obj7;
                qta0 qta0Var = (qta0) obj6;
                vq vqVar = (vq) obj5;
                pz40 pz40Var = (pz40) obj4;
                i3t0 i3t0Var = (i3t0) obj3;
                xcz xczVar = (xcz) obj2;
                gj6 gj6Var = (gj6) obj;
                gj6Var.getClass();
                if (gj6Var.equals(cj6.f4444a)) {
                    qjj.W(vneVar, null, null, new wi6(xczVar, E, (byte) 0), 3);
                } else if (gj6Var instanceof ej6) {
                    xuz xuzVar = vv20.m2;
                    androidx.fragment.app.e eVarC = fragment.C();
                    eVarC.getClass();
                    ej6 ej6Var = (ej6) gj6Var;
                    String str = ej6Var.f7891a;
                    String str2 = ej6Var.b;
                    xuzVar.getClass();
                    xuz.c(eVarC, str, str2);
                } else if (gj6Var.equals(fj6.f9621a)) {
                    androidx.fragment.app.e eVarC2 = fragment.C();
                    eVarC2.getClass();
                    qta0Var.getClass();
                    int i = nta0.m2;
                    if (eVarC2.J("PolybetRulesBottomSheetDialog") == null) {
                        new nta0().H0(eVarC2, "PolybetRulesBottomSheetDialog");
                    }
                } else if (gj6Var.equals(dj6.f6167a)) {
                    pz40Var.setValue(new mdk0(vqVar.b(fragment, null, null).f41290a));
                } else {
                    if (!(gj6Var instanceof bj6)) {
                        t9f.b();
                        return null;
                    }
                    bj6 bj6Var = (bj6) gj6Var;
                    yq yqVarA = vqVar.a(fragment, bj6Var.f2690a, null, null, null, ctc.f4929a, true, bj6Var.b, bj6Var.c, String.valueOf(bj6Var.d));
                    if (yqVarA instanceof xq) {
                        pz40Var.setValue(new mdk0(((xq) yqVarA).f41290a));
                    }
                }
                i3t0Var.x(ni6.f23567a);
                return Unit.f46060a;
            case 3:
                w6b w6bVar = (w6b) obj8;
                xcz xczVar2 = (xcz) obj7;
                ugd ugdVar = (ugd) obj6;
                ugd ugdVar2 = (ugd) obj5;
                ugd ugdVar3 = (ugd) obj4;
                ugd ugdVar4 = (ugd) obj3;
                ugd ugdVar5 = (ugd) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                rfk0 rfk0VarJ = vdx.J();
                E = rfk0VarJ != null ? rfk0VarJ.e() : 0;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    xczVar2.k(xczVar2.h(), xczVar2.i());
                    vdx.Y(rfk0VarJ, rfk0VarW, E);
                    a4x a4xVar = ((s6b) w6bVar).c;
                    hczVar.f(a4xVar.size(), new at7(new pua((byte) 13), a4xVar, (byte) 14), new wl0(a4xVar, (byte) 13), new ugd(2039820996, true, new l6b(a4xVar, ugdVar, ugdVar2, w6bVar, ugdVar3, ugdVar4, ugdVar5, (byte) 0)));
                    return Unit.f46060a;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, E);
                    throw th;
                }
            case 4:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ((rcu0) cpVar.u).b.setMakeBetClickListener(new wg(cpVar, (rer) obj8, (byte) 10));
                zre zreVar = new zre(cpVar, (byte) 0);
                a8z a8zVarA = maz.a(wez.b, new pg1(obj7, obj6, obj5, obj4, obj3, (Object) cpVar, obj2, (byte) 7));
                cpVar.x(new yw9(cpVar, a8zVarA, b4));
                cpVar.y(new yw9(cpVar, zreVar, b3));
                cpVar.t(new ft7(cpVar, zreVar, a8zVarA, cpVar, zreVar, a8zVarA));
                return Unit.f46060a;
            case 5:
                Function1 function1 = (Function1) obj2;
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                scu0 scu0Var = (scu0) cpVar2.u;
                scu0Var.b.setCancelButtonClickListener(new xb((Function1) obj8, cpVar2, (byte) 19));
                scu0Var.b.setAutoSubClickListener(new ejd((pw4) obj7, b2));
                DsSportCouponCard dsSportCouponCard = scu0Var.b;
                dsSportCouponCard.setOptionBetClickListener(new h6c((z6e) obj6, cpVar2, (byte) 29));
                dsSportCouponCard.setEachWayClickListener(new ejd((pw4) obj5, (byte) 18));
                View view = cpVar2.f40887a;
                view.setOnClickListener(new wg(obj4, (Object) cpVar2, (byte) 11));
                view.setOnLongClickListener(new g26((Function1) obj3, cpVar2, (byte) 1));
                cpVar2.x(new cp9(cpVar2, function1));
                cpVar2.t(new xg(cpVar2, cpVar2, function1, b5));
                return Unit.f46060a;
            case 6:
                o0x o0xVar = (o0x) obj6;
                o0x o0xVar2 = (o0x) obj5;
                Function1 function2 = (Function1) obj4;
                pz40 pz40Var2 = (pz40) obj3;
                pz40 pz40Var3 = (pz40) obj2;
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                if ((lz3Var instanceof iz3) && !Intrinsics.d(obj8, obj7)) {
                    pz40Var2.setValue(Boolean.TRUE);
                }
                pz40Var3.setValue(Boolean.valueOf(lz3Var instanceof kz3));
                if (((Boolean) pz40Var3.getValue()).booleanValue()) {
                    if (!((Boolean) pz40Var2.getValue()).booleanValue()) {
                        o0xVar = o0xVar2;
                    }
                    if (function2 != null) {
                        n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                        function2.invoke(n0xVar != null ? n0xVar.f22722a : null);
                    }
                }
                return Unit.f46060a;
            case 7:
                l7m0 l7m0Var = (l7m0) obj8;
                xcz xczVar3 = (xcz) obj7;
                ugd ugdVar6 = (ugd) obj6;
                ugd ugdVar7 = (ugd) obj5;
                ugd ugdVar8 = (ugd) obj4;
                ugd ugdVar9 = (ugd) obj3;
                ugd ugdVar10 = (ugd) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                rfk0 rfk0VarJ2 = vdx.J();
                Function1 function1E = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                try {
                    xczVar3.k(xczVar3.h(), xczVar3.i());
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E);
                    List list = (List) l7m0Var.getValue();
                    hczVar2.f(list.size(), new ygy(new ei20((byte) 15), list, (byte) 14), new bgz(list, (byte) 26), new ugd(2039820996, true, new l6b(list, ugdVar6, ugdVar7, l7m0Var, ugdVar8, ugdVar9, ugdVar10, (byte) 1)));
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E);
                    throw th2;
                }
            case 8:
                ctf0 ctf0Var = (ctf0) obj2;
                vzg0 vzg0Var3 = (vzg0) obj;
                vzg0Var3.getClass();
                sff0 sff0VarA3 = ((pru) obj8).a();
                boolean zA = ((iqt) obj7).f15225a.a();
                ((n4u) obj6).e();
                boolean z5 = sff0VarA3.T1;
                mum0 mum0Var = sff0VarA3.g;
                ay10 ay10Var = mum0Var.f;
                kg kgVarB = ((dmt) obj5).b();
                String str3 = sff0VarA3.d.f27973a.b;
                aeo0 aeo0Var = mum0Var.n;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                Set set = (Set) a8k0.H(vzg0Var3, "EXPANDED_SECTIONS", xun.f41520a);
                r040 r040Var = (r040) a8k0.H(vzg0Var3, "SELECTED_TAB", ((q040) obj4).f27878a);
                iun iunVar3 = iun.f15405a;
                int iB = ((qho) obj3).b(R.drawable.ic_glyph_circle_profile);
                String strA = sff0VarA3.Z1;
                if (strA.length() == 0) {
                    strA = ctf0Var.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                }
                return new d140(false, false, false, null, null, "", "", "", "", z5, false, false, "", ay10Var, kgVarB, zA, lunVar, set, r040Var, false, str3, aeo0Var, iunVar3, iunVar3, "", iB, strA, false);
            case 9:
                hdz hdzVar = (hdz) obj8;
                vne vneVar2 = (vne) obj7;
                pz40 pz40Var4 = (pz40) obj6;
                Function1 function3 = (Function1) obj5;
                pz40 pz40Var5 = (pz40) obj4;
                d9d0 d9d0Var = (d9d0) obj2;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.g(hczVar3, hdzVar.c(), null, null, new ugd(1974734287, true, new d2s(hdzVar, (Function1) obj3, b2)), 6);
                mva mvaVar = hdzVar.e().f12569a;
                if (mvaVar != null) {
                    if (mvaVar instanceof zo00) {
                        qjj.W(vneVar2, null, null, new ql80(d9d0Var, E, (byte) 0), 3);
                    } else if (mvaVar instanceof bp00) {
                        qjj.W(vneVar2, null, null, new ql80(d9d0Var, E, b6), 3);
                    } else if (mvaVar instanceof ap00) {
                        qjj.W(vneVar2, null, null, new ql80(d9d0Var, E, b5), 3);
                    }
                    mva mvaVar2 = hdzVar.e().c;
                    if (mvaVar2 instanceof zo00) {
                        pz40Var4.setValue(Boolean.FALSE);
                        function3.invoke(((zo00) mvaVar2).b);
                    } else if (Intrinsics.d(mvaVar2, ap00.b)) {
                        pz40Var5.setValue(Boolean.FALSE);
                        hcz.e(hczVar3, null, null, lv00.g, 3);
                    } else {
                        if (!(mvaVar2 instanceof bp00)) {
                            t9f.b();
                            return null;
                        }
                        if (hdzVar.c() != 0) {
                            Boolean bool2 = Boolean.FALSE;
                            pz40Var5.setValue(bool2);
                            pz40Var4.setValue(bool2);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 10:
                Function1 function4 = (Function1) obj6;
                Function1 function5 = (Function1) obj5;
                Function1 function6 = (Function1) obj2;
                Context context = (Context) obj;
                context.getClass();
                PaymentWebView paymentWebView = new PaymentWebView(context, null);
                ((pz40) obj8).setValue(null);
                ((Function1) obj7).invoke(paymentWebView);
                function4.getClass();
                function5.getClass();
                paymentWebView.m = function4;
                paymentWebView.n = function5;
                paymentWebView.k(new hs80(function6, (byte) 9), new qu80(function6, (byte) 21), new qu80(function6, (byte) 22), new qu80(function6, (byte) 23), new nc40(function6, (byte) 7), new qu80(function6, (byte) 19), new hs80(function6, (byte) 7), (Function1) obj4, (Function1) obj3);
                paymentWebView.setDownloadListener$impl(new ww0(function6, (byte) 2));
                return paymentWebView;
            default:
                iqt iqtVar = (iqt) obj3;
                n4u n4uVar2 = (n4u) obj2;
                vzg0 vzg0Var4 = (vzg0) obj;
                vzg0Var4.getClass();
                sff0 sff0VarA4 = ((pru) obj8).a();
                v8d v8dVarA3 = ((bzt) obj7).f3488a.a();
                boolean zA2 = ((c8c) obj6).a();
                boolean zJ = ((lbu) obj5).j();
                Set setL0 = tx3.l0(new amb0[]{amb0.AGGREGATOR, amb0.ONE_X_GAMES});
                List listB = ((jfu) obj4).b();
                if (zJ) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj9 : listB) {
                        if (!setL0.contains((amb0) obj9)) {
                            arrayList3.add(obj9);
                        }
                    }
                    listB = arrayList3;
                }
                amb0 amb0Var = (amb0) a8k0.H(vzg0Var4, "KEY_CURRENT_TAB", CollectionsKt.U(listB));
                boolean zA3 = iqtVar.f15225a.a();
                long jLongValue = ((Number) a8k0.H(vzg0Var4, "KEY_AUTH_OFFER_TIMER", 0L)).longValue();
                long jLongValue2 = ((Number) a8k0.H(vzg0Var4, "KEY_2FA_ALERT_TIMER", 0L)).longValue();
                boolean zBooleanValue4 = ((Boolean) a8k0.H(vzg0Var4, "MIN_AGE_DIALOG_SHOWED", Boolean.FALSE)).booleanValue();
                idb0 idb0Var = new idb0(false, false, false, false, false, false, false);
                rib0 rib0Var = sff0VarA4.L;
                boolean z6 = rib0Var.f30534a;
                boolean z7 = !zJ;
                boolean z8 = rib0Var.b;
                mum0 mum0Var2 = sff0VarA4.g;
                String str4 = mum0Var2.i.f12896a;
                String str5 = mum0Var2.j.f26988a;
                hl1 hl1Var = sff0VarA4.b;
                boolean z9 = hl1Var.C;
                boolean z10 = sff0VarA4.Z0;
                List list2 = sff0VarA4.o1;
                boolean z11 = sff0VarA4.M1;
                boolean z12 = sff0VarA4.P0;
                boolean z13 = sff0VarA4.c0;
                List list3 = listB;
                long j = sff0VarA4.a1;
                boolean z14 = sff0VarA4.f32117a.m;
                int i2 = sff0VarA4.N.n;
                boolean z15 = hl1Var.b;
                lxw lxwVar = v8dVarA3.p;
                boolean z16 = v8dVarA3.X;
                String str6 = sff0VarA4.d.f27973a.b;
                String str7 = mum0Var2.n.f739a;
                n4uVar2.e();
                return new olb0(list3, amb0Var, null, zA3, false, "", jLongValue, jLongValue2, zBooleanValue4, idb0Var, new bib0(false, z8, str4, str5, z10, list2, z11, z6, z12, z13, j, z14, i2, z15, z7, z6, z9, lxwVar, z16, false, zA2, str6, str7, sff0VarA4.T1), null, false);
        }
    }

    public /* synthetic */ tg4(pru pruVar, bzt bztVar, n4u n4uVar, rpt rptVar, pek pekVar, b8u b8uVar, epc epcVar, rpt rptVar2) {
        this.f33891a = (byte) 1;
        this.b = pruVar;
        this.c = bztVar;
        this.h = n4uVar;
        this.d = rptVar;
        this.e = b8uVar;
        this.f = epcVar;
        this.g = rptVar2;
    }

    public /* synthetic */ tg4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.f33891a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
