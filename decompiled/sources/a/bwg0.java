package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class bwg0 implements v6t0 {
    public final n0o0 A;
    public final n0o0 B;
    public final n0o0 C;
    public final n0o0 D;
    public final n0o0 E;
    public final n0o0 F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svg0 f3323a;
    public final ctf0 b;
    public final ocl c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;
    public final n0o0 w;
    public final n0o0 x;
    public final n0o0 y;
    public final n0o0 z;

    public bwg0(svg0 svg0Var, ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.f3323a = svg0Var;
        this.b = ctf0Var;
        this.c = oclVar;
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(svg0Var.l));
        this.d = n0o0VarH;
        xtg0 xtg0Var = svg0Var.o;
        n0o0 n0o0VarH2 = bkb.H(xtg0Var);
        this.e = n0o0VarH2;
        this.f = bkb.H(xtg0Var);
        n0o0 n0o0VarH3 = bkb.H(svg0Var.r);
        this.g = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(svg0Var.s);
        this.h = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(svg0Var.u);
        this.i = n0o0VarH5;
        n0o0 n0o0VarH6 = bkb.H(svg0Var.v);
        this.j = n0o0VarH6;
        n0o0 n0o0VarH7 = bkb.H(svg0Var.q);
        this.k = n0o0VarH7;
        n0o0 n0o0VarH8 = bkb.H(svg0Var.w);
        this.l = bkb.H(Float.valueOf(svg0Var.f32864a));
        this.m = bkb.H(Float.valueOf(svg0Var.c));
        this.n = bkb.H(Float.valueOf(svg0Var.b));
        n0o0 n0o0VarH9 = bkb.H(Double.valueOf(svg0Var.f));
        this.o = n0o0VarH9;
        n0o0 n0o0VarH10 = bkb.H(Double.valueOf(svg0Var.h));
        this.p = n0o0VarH10;
        n0o0 n0o0VarH11 = bkb.H(Double.valueOf(svg0Var.g));
        this.q = n0o0VarH11;
        this.r = bkb.H(Boolean.valueOf(svg0Var.k));
        this.s = bkb.H(svg0Var.p);
        this.t = maz.b(new yw9((fee) n0o0VarH.getValue(), new wtf0((byte) 28), (byte) 20));
        final byte b = 5;
        this.u = maz.b(new yw9((fee) n0o0VarH8.getValue(), new Function1(this) { // from class: a.zvg0
            public final /* synthetic */ bwg0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                tsv tsvVar;
                Object next;
                i4 i4VarB;
                i4 i4VarB2;
                byte b2 = b;
                wtg0 wtg0Var = wtg0.f39739a;
                bwg0 bwg0Var = this.b;
                switch (b2) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (!Intrinsics.d((xtg0) feeVar.c(), wtg0Var)) {
                            return lak0.c;
                        }
                        ctf0 ctf0Var2 = bwg0Var.b;
                        ctf0Var2.getClass();
                        return dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.sell, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.w));
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        boolean z = ((SaleScreenModel) feeVar2.c()).b;
                        ctf0 ctf0Var3 = bwg0Var.b;
                        return z ? ctf0Var3.b.a(R.string.auto_sell_settings, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.sell_settings, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        xtg0 xtg0Var2 = (xtg0) feeVar3.c();
                        if (Intrinsics.d(xtg0Var2, utg0.f36253a)) {
                            return new zie(ocl.b(bwg0Var.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (Intrinsics.d(xtg0Var2, vtg0.f38006a)) {
                            return dje.f6181a;
                        }
                        if (Intrinsics.d(xtg0Var2, wtg0Var)) {
                            return fje.f9636a;
                        }
                        t9f.b();
                        return null;
                    case 3:
                        ctf0 ctf0Var4 = bwg0Var.b;
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        a5w a5wVar = (a5w) feeVar4.c();
                        if (a5wVar == null) {
                            return wsv.f39710a;
                        }
                        ql5 ql5Var = (ql5) ((fee) bwg0Var.w.getValue()).b();
                        String str = ql5Var != null ? ql5Var.f : null;
                        String str2 = str != null ? str : "";
                        List list = bwg0Var.f3323a.t;
                        List list2 = (List) ((fee) bwg0Var.x.getValue()).b();
                        List list3 = (List) ((fee) bwg0Var.v.getValue()).b();
                        ctf0Var4.getClass();
                        list.getClass();
                        list2.getClass();
                        list3.getClass();
                        if (a5wVar instanceof kzv) {
                            kzv kzvVar = (kzv) a5wVar;
                            List list4 = kzvVar.Y;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Iterator it2 = it;
                                    if (((xco) next).f40655a != kzvVar.T) {
                                        it = it2;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            xco xcoVar = (xco) next;
                            boolean zA = i7u.c.a(list4, list3);
                            boolean zA2 = i7u.b.a(list4, list3);
                            tvw tvwVarA0 = lmc.a0(kzvVar);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var4.b;
                            String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var4.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kzvVar.f19169a}, 1));
                            i4 i4VarN = jwb.N(kzvVar, ctf0Var4, list, xcoVar != null ? xcoVar.e : false, zA, zA2, kzvVar.B);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (u1c.y(kzvVar)) {
                                lc00VarB.add(vcc.J(kzvVar, ctf0Var4));
                            }
                            j3w j3wVarS = feb.S(kzvVar, ctf0Var4, zA);
                            if (j3wVarS != null) {
                                lc00VarB.add(j3wVarS);
                            }
                            double d = kzvVar.L;
                            double d2 = kzvVar.f;
                            String strA2 = lsm0Var.a(d < d2 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                            pn40 pn40Var = pn40.f27267a;
                            double d3 = d2 - kzvVar.E;
                            p3u0 p3u0Var = p3u0.c;
                            String strC = pn40.c(d3, p3u0Var);
                            e3w e3wVar = e3w.f7156a;
                            String str3 = str2;
                            lc00VarB.add(new f3w("", strA2, strC, str3, e3wVar));
                            lc00VarB.add(new f3w("", lsm0Var.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(kzvVar.m, p3u0Var), str3, e3wVar));
                            tsvVar = new tsv(tvwVarA0, strG, strA, i4VarN, dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        } else {
                            lak0 lak0Var = lak0.c;
                            tsvVar = new tsv(qvw.f29409a, "", "", lak0Var, lak0Var);
                        }
                        int iOrdinal = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i4 i4VarR0 = dyb.r0(CollectionsKt.r0(tsvVar.e, new l3w(ctf0Var4.b.a(R.string.auto_sale_restriction, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.only_full_sale_for_bet, Arrays.copyOf(new Object[0], 0)), i8x.f14362a)));
                            String str4 = tsvVar.b;
                            str4.getClass();
                            String str5 = tsvVar.c;
                            str5.getClass();
                            a4x a4xVar = tsvVar.d;
                            a4xVar.getClass();
                            i4VarR0.getClass();
                            tsvVar = new tsv(tsvVar.f34481a, str4, str5, a4xVar, i4VarR0);
                        }
                        return new xsv(tsvVar);
                    case 4:
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        int iOrdinal2 = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                return lak0.c;
                            }
                            if (iOrdinal2 == 2) {
                                ytg0 ytg0Var = (ytg0) feeVar5.c();
                                return (ytg0Var == null || (i4VarB = bwg0Var.b(ytg0Var, false)) == null) ? lak0.c : i4VarB;
                            }
                            if (iOrdinal2 == 3) {
                                ytg0 ytg0Var2 = (ytg0) feeVar5.c();
                                return (ytg0Var2 == null || (i4VarB2 = bwg0Var.b(ytg0Var2, true)) == null) ? lak0.c : i4VarB2;
                            }
                            t9f.b();
                            return null;
                        }
                        ytg0 ytg0Var3 = (ytg0) feeVar5.c();
                        if (ytg0Var3 != null) {
                            ctf0 ctf0Var5 = bwg0Var.b;
                            ql5 ql5Var2 = (ql5) ((fee) bwg0Var.w.getValue()).b();
                            String str6 = ql5Var2 != null ? ql5Var2.f : null;
                            String str7 = str6 == null ? "" : str6;
                            cvg0 cvg0Var = new cvg0();
                            String strA3 = ctf0Var5.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0));
                            h8k0 h8k0Var = h8k0.f12630a;
                            pn40 pn40Var2 = pn40.f27267a;
                            p3u0 p3u0Var2 = p3u0.c;
                            i4 i4VarG0 = dyb.g0(cvg0Var, new j8k0(q3d.j(new f8k0(strA3, str7, h8k0Var, new g8k0(4, pn40.c(0.0d, p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.i), p3u0Var2), str7)), new f8k0(ctf0Var5.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str7, h8k0.b, new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.e), p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.d), p3u0Var2), str7)))));
                            if (i4VarG0 != null) {
                                return i4VarG0;
                            }
                        }
                        return lak0.c;
                    default:
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        boolean z2 = ((SaleScreenModel) feeVar6.c()).b;
                        ctf0 ctf0Var6 = bwg0Var.b;
                        return z2 ? ctf0Var6.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)) : ctf0Var6.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        fee feeVar = (fee) n0o0VarH6.getValue();
        final byte b2 = 0;
        this.v = maz.b(new yw9(feeVar, new awg0((byte) 0), (byte) 20));
        fee feeVar2 = (fee) n0o0VarH4.getValue();
        final byte b3 = 1;
        this.w = maz.b(new yw9(feeVar2, new awg0((byte) 1), (byte) 20));
        fee feeVar3 = (fee) n0o0VarH5.getValue();
        final byte b4 = 2;
        this.x = maz.b(new yw9(feeVar3, new awg0((byte) 2), (byte) 20));
        fee feeVar4 = (fee) n0o0VarH9.getValue();
        final byte b5 = 3;
        this.y = maz.b(new yw9(feeVar4, new awg0((byte) 3), (byte) 20));
        fee feeVar5 = (fee) n0o0VarH11.getValue();
        final byte b6 = 4;
        this.z = maz.b(new yw9(feeVar5, new awg0((byte) 4), (byte) 20));
        this.A = maz.b(new yw9((fee) n0o0VarH10.getValue(), new wtf0((byte) 29), (byte) 20));
        this.B = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.zvg0
            public final /* synthetic */ bwg0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                tsv tsvVar;
                Object next;
                i4 i4VarB;
                i4 i4VarB2;
                byte b7 = b2;
                wtg0 wtg0Var = wtg0.f39739a;
                bwg0 bwg0Var = this.b;
                switch (b7) {
                    case 0:
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        if (!Intrinsics.d((xtg0) feeVar6.c(), wtg0Var)) {
                            return lak0.c;
                        }
                        ctf0 ctf0Var2 = bwg0Var.b;
                        ctf0Var2.getClass();
                        return dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.sell, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.w));
                    case 1:
                        fee feeVar7 = (fee) obj;
                        feeVar7.getClass();
                        boolean z = ((SaleScreenModel) feeVar7.c()).b;
                        ctf0 ctf0Var3 = bwg0Var.b;
                        return z ? ctf0Var3.b.a(R.string.auto_sell_settings, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.sell_settings, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        fee feeVar8 = (fee) obj;
                        feeVar8.getClass();
                        xtg0 xtg0Var2 = (xtg0) feeVar8.c();
                        if (Intrinsics.d(xtg0Var2, utg0.f36253a)) {
                            return new zie(ocl.b(bwg0Var.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (Intrinsics.d(xtg0Var2, vtg0.f38006a)) {
                            return dje.f6181a;
                        }
                        if (Intrinsics.d(xtg0Var2, wtg0Var)) {
                            return fje.f9636a;
                        }
                        t9f.b();
                        return null;
                    case 3:
                        ctf0 ctf0Var4 = bwg0Var.b;
                        fee feeVar9 = (fee) obj;
                        feeVar9.getClass();
                        a5w a5wVar = (a5w) feeVar9.c();
                        if (a5wVar == null) {
                            return wsv.f39710a;
                        }
                        ql5 ql5Var = (ql5) ((fee) bwg0Var.w.getValue()).b();
                        String str = ql5Var != null ? ql5Var.f : null;
                        String str2 = str != null ? str : "";
                        List list = bwg0Var.f3323a.t;
                        List list2 = (List) ((fee) bwg0Var.x.getValue()).b();
                        List list3 = (List) ((fee) bwg0Var.v.getValue()).b();
                        ctf0Var4.getClass();
                        list.getClass();
                        list2.getClass();
                        list3.getClass();
                        if (a5wVar instanceof kzv) {
                            kzv kzvVar = (kzv) a5wVar;
                            List list4 = kzvVar.Y;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Iterator it2 = it;
                                    if (((xco) next).f40655a != kzvVar.T) {
                                        it = it2;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            xco xcoVar = (xco) next;
                            boolean zA = i7u.c.a(list4, list3);
                            boolean zA2 = i7u.b.a(list4, list3);
                            tvw tvwVarA0 = lmc.a0(kzvVar);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var4.b;
                            String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var4.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kzvVar.f19169a}, 1));
                            i4 i4VarN = jwb.N(kzvVar, ctf0Var4, list, xcoVar != null ? xcoVar.e : false, zA, zA2, kzvVar.B);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (u1c.y(kzvVar)) {
                                lc00VarB.add(vcc.J(kzvVar, ctf0Var4));
                            }
                            j3w j3wVarS = feb.S(kzvVar, ctf0Var4, zA);
                            if (j3wVarS != null) {
                                lc00VarB.add(j3wVarS);
                            }
                            double d = kzvVar.L;
                            double d2 = kzvVar.f;
                            String strA2 = lsm0Var.a(d < d2 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                            pn40 pn40Var = pn40.f27267a;
                            double d3 = d2 - kzvVar.E;
                            p3u0 p3u0Var = p3u0.c;
                            String strC = pn40.c(d3, p3u0Var);
                            e3w e3wVar = e3w.f7156a;
                            String str3 = str2;
                            lc00VarB.add(new f3w("", strA2, strC, str3, e3wVar));
                            lc00VarB.add(new f3w("", lsm0Var.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(kzvVar.m, p3u0Var), str3, e3wVar));
                            tsvVar = new tsv(tvwVarA0, strG, strA, i4VarN, dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        } else {
                            lak0 lak0Var = lak0.c;
                            tsvVar = new tsv(qvw.f29409a, "", "", lak0Var, lak0Var);
                        }
                        int iOrdinal = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i4 i4VarR0 = dyb.r0(CollectionsKt.r0(tsvVar.e, new l3w(ctf0Var4.b.a(R.string.auto_sale_restriction, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.only_full_sale_for_bet, Arrays.copyOf(new Object[0], 0)), i8x.f14362a)));
                            String str4 = tsvVar.b;
                            str4.getClass();
                            String str5 = tsvVar.c;
                            str5.getClass();
                            a4x a4xVar = tsvVar.d;
                            a4xVar.getClass();
                            i4VarR0.getClass();
                            tsvVar = new tsv(tsvVar.f34481a, str4, str5, a4xVar, i4VarR0);
                        }
                        return new xsv(tsvVar);
                    case 4:
                        fee feeVar10 = (fee) obj;
                        feeVar10.getClass();
                        int iOrdinal2 = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                return lak0.c;
                            }
                            if (iOrdinal2 == 2) {
                                ytg0 ytg0Var = (ytg0) feeVar10.c();
                                return (ytg0Var == null || (i4VarB = bwg0Var.b(ytg0Var, false)) == null) ? lak0.c : i4VarB;
                            }
                            if (iOrdinal2 == 3) {
                                ytg0 ytg0Var2 = (ytg0) feeVar10.c();
                                return (ytg0Var2 == null || (i4VarB2 = bwg0Var.b(ytg0Var2, true)) == null) ? lak0.c : i4VarB2;
                            }
                            t9f.b();
                            return null;
                        }
                        ytg0 ytg0Var3 = (ytg0) feeVar10.c();
                        if (ytg0Var3 != null) {
                            ctf0 ctf0Var5 = bwg0Var.b;
                            ql5 ql5Var2 = (ql5) ((fee) bwg0Var.w.getValue()).b();
                            String str6 = ql5Var2 != null ? ql5Var2.f : null;
                            String str7 = str6 == null ? "" : str6;
                            cvg0 cvg0Var = new cvg0();
                            String strA3 = ctf0Var5.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0));
                            h8k0 h8k0Var = h8k0.f12630a;
                            pn40 pn40Var2 = pn40.f27267a;
                            p3u0 p3u0Var2 = p3u0.c;
                            i4 i4VarG0 = dyb.g0(cvg0Var, new j8k0(q3d.j(new f8k0(strA3, str7, h8k0Var, new g8k0(4, pn40.c(0.0d, p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.i), p3u0Var2), str7)), new f8k0(ctf0Var5.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str7, h8k0.b, new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.e), p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.d), p3u0Var2), str7)))));
                            if (i4VarG0 != null) {
                                return i4VarG0;
                            }
                        }
                        return lak0.c;
                    default:
                        fee feeVar11 = (fee) obj;
                        feeVar11.getClass();
                        boolean z2 = ((SaleScreenModel) feeVar11.c()).b;
                        ctf0 ctf0Var6 = bwg0Var.b;
                        return z2 ? ctf0Var6.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)) : ctf0Var6.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        this.C = maz.b(new yw9((fee) n0o0VarH8.getValue(), new Function1(this) { // from class: a.zvg0
            public final /* synthetic */ bwg0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                tsv tsvVar;
                Object next;
                i4 i4VarB;
                i4 i4VarB2;
                byte b7 = b3;
                wtg0 wtg0Var = wtg0.f39739a;
                bwg0 bwg0Var = this.b;
                switch (b7) {
                    case 0:
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        if (!Intrinsics.d((xtg0) feeVar6.c(), wtg0Var)) {
                            return lak0.c;
                        }
                        ctf0 ctf0Var2 = bwg0Var.b;
                        ctf0Var2.getClass();
                        return dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.sell, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.w));
                    case 1:
                        fee feeVar7 = (fee) obj;
                        feeVar7.getClass();
                        boolean z = ((SaleScreenModel) feeVar7.c()).b;
                        ctf0 ctf0Var3 = bwg0Var.b;
                        return z ? ctf0Var3.b.a(R.string.auto_sell_settings, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.sell_settings, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        fee feeVar8 = (fee) obj;
                        feeVar8.getClass();
                        xtg0 xtg0Var2 = (xtg0) feeVar8.c();
                        if (Intrinsics.d(xtg0Var2, utg0.f36253a)) {
                            return new zie(ocl.b(bwg0Var.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (Intrinsics.d(xtg0Var2, vtg0.f38006a)) {
                            return dje.f6181a;
                        }
                        if (Intrinsics.d(xtg0Var2, wtg0Var)) {
                            return fje.f9636a;
                        }
                        t9f.b();
                        return null;
                    case 3:
                        ctf0 ctf0Var4 = bwg0Var.b;
                        fee feeVar9 = (fee) obj;
                        feeVar9.getClass();
                        a5w a5wVar = (a5w) feeVar9.c();
                        if (a5wVar == null) {
                            return wsv.f39710a;
                        }
                        ql5 ql5Var = (ql5) ((fee) bwg0Var.w.getValue()).b();
                        String str = ql5Var != null ? ql5Var.f : null;
                        String str2 = str != null ? str : "";
                        List list = bwg0Var.f3323a.t;
                        List list2 = (List) ((fee) bwg0Var.x.getValue()).b();
                        List list3 = (List) ((fee) bwg0Var.v.getValue()).b();
                        ctf0Var4.getClass();
                        list.getClass();
                        list2.getClass();
                        list3.getClass();
                        if (a5wVar instanceof kzv) {
                            kzv kzvVar = (kzv) a5wVar;
                            List list4 = kzvVar.Y;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Iterator it2 = it;
                                    if (((xco) next).f40655a != kzvVar.T) {
                                        it = it2;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            xco xcoVar = (xco) next;
                            boolean zA = i7u.c.a(list4, list3);
                            boolean zA2 = i7u.b.a(list4, list3);
                            tvw tvwVarA0 = lmc.a0(kzvVar);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var4.b;
                            String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var4.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kzvVar.f19169a}, 1));
                            i4 i4VarN = jwb.N(kzvVar, ctf0Var4, list, xcoVar != null ? xcoVar.e : false, zA, zA2, kzvVar.B);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (u1c.y(kzvVar)) {
                                lc00VarB.add(vcc.J(kzvVar, ctf0Var4));
                            }
                            j3w j3wVarS = feb.S(kzvVar, ctf0Var4, zA);
                            if (j3wVarS != null) {
                                lc00VarB.add(j3wVarS);
                            }
                            double d = kzvVar.L;
                            double d2 = kzvVar.f;
                            String strA2 = lsm0Var.a(d < d2 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                            pn40 pn40Var = pn40.f27267a;
                            double d3 = d2 - kzvVar.E;
                            p3u0 p3u0Var = p3u0.c;
                            String strC = pn40.c(d3, p3u0Var);
                            e3w e3wVar = e3w.f7156a;
                            String str3 = str2;
                            lc00VarB.add(new f3w("", strA2, strC, str3, e3wVar));
                            lc00VarB.add(new f3w("", lsm0Var.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(kzvVar.m, p3u0Var), str3, e3wVar));
                            tsvVar = new tsv(tvwVarA0, strG, strA, i4VarN, dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        } else {
                            lak0 lak0Var = lak0.c;
                            tsvVar = new tsv(qvw.f29409a, "", "", lak0Var, lak0Var);
                        }
                        int iOrdinal = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i4 i4VarR0 = dyb.r0(CollectionsKt.r0(tsvVar.e, new l3w(ctf0Var4.b.a(R.string.auto_sale_restriction, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.only_full_sale_for_bet, Arrays.copyOf(new Object[0], 0)), i8x.f14362a)));
                            String str4 = tsvVar.b;
                            str4.getClass();
                            String str5 = tsvVar.c;
                            str5.getClass();
                            a4x a4xVar = tsvVar.d;
                            a4xVar.getClass();
                            i4VarR0.getClass();
                            tsvVar = new tsv(tsvVar.f34481a, str4, str5, a4xVar, i4VarR0);
                        }
                        return new xsv(tsvVar);
                    case 4:
                        fee feeVar10 = (fee) obj;
                        feeVar10.getClass();
                        int iOrdinal2 = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                return lak0.c;
                            }
                            if (iOrdinal2 == 2) {
                                ytg0 ytg0Var = (ytg0) feeVar10.c();
                                return (ytg0Var == null || (i4VarB = bwg0Var.b(ytg0Var, false)) == null) ? lak0.c : i4VarB;
                            }
                            if (iOrdinal2 == 3) {
                                ytg0 ytg0Var2 = (ytg0) feeVar10.c();
                                return (ytg0Var2 == null || (i4VarB2 = bwg0Var.b(ytg0Var2, true)) == null) ? lak0.c : i4VarB2;
                            }
                            t9f.b();
                            return null;
                        }
                        ytg0 ytg0Var3 = (ytg0) feeVar10.c();
                        if (ytg0Var3 != null) {
                            ctf0 ctf0Var5 = bwg0Var.b;
                            ql5 ql5Var2 = (ql5) ((fee) bwg0Var.w.getValue()).b();
                            String str6 = ql5Var2 != null ? ql5Var2.f : null;
                            String str7 = str6 == null ? "" : str6;
                            cvg0 cvg0Var = new cvg0();
                            String strA3 = ctf0Var5.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0));
                            h8k0 h8k0Var = h8k0.f12630a;
                            pn40 pn40Var2 = pn40.f27267a;
                            p3u0 p3u0Var2 = p3u0.c;
                            i4 i4VarG0 = dyb.g0(cvg0Var, new j8k0(q3d.j(new f8k0(strA3, str7, h8k0Var, new g8k0(4, pn40.c(0.0d, p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.i), p3u0Var2), str7)), new f8k0(ctf0Var5.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str7, h8k0.b, new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.e), p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.d), p3u0Var2), str7)))));
                            if (i4VarG0 != null) {
                                return i4VarG0;
                            }
                        }
                        return lak0.c;
                    default:
                        fee feeVar11 = (fee) obj;
                        feeVar11.getClass();
                        boolean z2 = ((SaleScreenModel) feeVar11.c()).b;
                        ctf0 ctf0Var6 = bwg0Var.b;
                        return z2 ? ctf0Var6.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)) : ctf0Var6.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        this.D = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.zvg0
            public final /* synthetic */ bwg0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                tsv tsvVar;
                Object next;
                i4 i4VarB;
                i4 i4VarB2;
                byte b7 = b4;
                wtg0 wtg0Var = wtg0.f39739a;
                bwg0 bwg0Var = this.b;
                switch (b7) {
                    case 0:
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        if (!Intrinsics.d((xtg0) feeVar6.c(), wtg0Var)) {
                            return lak0.c;
                        }
                        ctf0 ctf0Var2 = bwg0Var.b;
                        ctf0Var2.getClass();
                        return dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.sell, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.w));
                    case 1:
                        fee feeVar7 = (fee) obj;
                        feeVar7.getClass();
                        boolean z = ((SaleScreenModel) feeVar7.c()).b;
                        ctf0 ctf0Var3 = bwg0Var.b;
                        return z ? ctf0Var3.b.a(R.string.auto_sell_settings, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.sell_settings, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        fee feeVar8 = (fee) obj;
                        feeVar8.getClass();
                        xtg0 xtg0Var2 = (xtg0) feeVar8.c();
                        if (Intrinsics.d(xtg0Var2, utg0.f36253a)) {
                            return new zie(ocl.b(bwg0Var.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (Intrinsics.d(xtg0Var2, vtg0.f38006a)) {
                            return dje.f6181a;
                        }
                        if (Intrinsics.d(xtg0Var2, wtg0Var)) {
                            return fje.f9636a;
                        }
                        t9f.b();
                        return null;
                    case 3:
                        ctf0 ctf0Var4 = bwg0Var.b;
                        fee feeVar9 = (fee) obj;
                        feeVar9.getClass();
                        a5w a5wVar = (a5w) feeVar9.c();
                        if (a5wVar == null) {
                            return wsv.f39710a;
                        }
                        ql5 ql5Var = (ql5) ((fee) bwg0Var.w.getValue()).b();
                        String str = ql5Var != null ? ql5Var.f : null;
                        String str2 = str != null ? str : "";
                        List list = bwg0Var.f3323a.t;
                        List list2 = (List) ((fee) bwg0Var.x.getValue()).b();
                        List list3 = (List) ((fee) bwg0Var.v.getValue()).b();
                        ctf0Var4.getClass();
                        list.getClass();
                        list2.getClass();
                        list3.getClass();
                        if (a5wVar instanceof kzv) {
                            kzv kzvVar = (kzv) a5wVar;
                            List list4 = kzvVar.Y;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Iterator it2 = it;
                                    if (((xco) next).f40655a != kzvVar.T) {
                                        it = it2;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            xco xcoVar = (xco) next;
                            boolean zA = i7u.c.a(list4, list3);
                            boolean zA2 = i7u.b.a(list4, list3);
                            tvw tvwVarA0 = lmc.a0(kzvVar);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var4.b;
                            String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var4.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kzvVar.f19169a}, 1));
                            i4 i4VarN = jwb.N(kzvVar, ctf0Var4, list, xcoVar != null ? xcoVar.e : false, zA, zA2, kzvVar.B);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (u1c.y(kzvVar)) {
                                lc00VarB.add(vcc.J(kzvVar, ctf0Var4));
                            }
                            j3w j3wVarS = feb.S(kzvVar, ctf0Var4, zA);
                            if (j3wVarS != null) {
                                lc00VarB.add(j3wVarS);
                            }
                            double d = kzvVar.L;
                            double d2 = kzvVar.f;
                            String strA2 = lsm0Var.a(d < d2 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                            pn40 pn40Var = pn40.f27267a;
                            double d3 = d2 - kzvVar.E;
                            p3u0 p3u0Var = p3u0.c;
                            String strC = pn40.c(d3, p3u0Var);
                            e3w e3wVar = e3w.f7156a;
                            String str3 = str2;
                            lc00VarB.add(new f3w("", strA2, strC, str3, e3wVar));
                            lc00VarB.add(new f3w("", lsm0Var.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(kzvVar.m, p3u0Var), str3, e3wVar));
                            tsvVar = new tsv(tvwVarA0, strG, strA, i4VarN, dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        } else {
                            lak0 lak0Var = lak0.c;
                            tsvVar = new tsv(qvw.f29409a, "", "", lak0Var, lak0Var);
                        }
                        int iOrdinal = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i4 i4VarR0 = dyb.r0(CollectionsKt.r0(tsvVar.e, new l3w(ctf0Var4.b.a(R.string.auto_sale_restriction, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.only_full_sale_for_bet, Arrays.copyOf(new Object[0], 0)), i8x.f14362a)));
                            String str4 = tsvVar.b;
                            str4.getClass();
                            String str5 = tsvVar.c;
                            str5.getClass();
                            a4x a4xVar = tsvVar.d;
                            a4xVar.getClass();
                            i4VarR0.getClass();
                            tsvVar = new tsv(tsvVar.f34481a, str4, str5, a4xVar, i4VarR0);
                        }
                        return new xsv(tsvVar);
                    case 4:
                        fee feeVar10 = (fee) obj;
                        feeVar10.getClass();
                        int iOrdinal2 = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                return lak0.c;
                            }
                            if (iOrdinal2 == 2) {
                                ytg0 ytg0Var = (ytg0) feeVar10.c();
                                return (ytg0Var == null || (i4VarB = bwg0Var.b(ytg0Var, false)) == null) ? lak0.c : i4VarB;
                            }
                            if (iOrdinal2 == 3) {
                                ytg0 ytg0Var2 = (ytg0) feeVar10.c();
                                return (ytg0Var2 == null || (i4VarB2 = bwg0Var.b(ytg0Var2, true)) == null) ? lak0.c : i4VarB2;
                            }
                            t9f.b();
                            return null;
                        }
                        ytg0 ytg0Var3 = (ytg0) feeVar10.c();
                        if (ytg0Var3 != null) {
                            ctf0 ctf0Var5 = bwg0Var.b;
                            ql5 ql5Var2 = (ql5) ((fee) bwg0Var.w.getValue()).b();
                            String str6 = ql5Var2 != null ? ql5Var2.f : null;
                            String str7 = str6 == null ? "" : str6;
                            cvg0 cvg0Var = new cvg0();
                            String strA3 = ctf0Var5.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0));
                            h8k0 h8k0Var = h8k0.f12630a;
                            pn40 pn40Var2 = pn40.f27267a;
                            p3u0 p3u0Var2 = p3u0.c;
                            i4 i4VarG0 = dyb.g0(cvg0Var, new j8k0(q3d.j(new f8k0(strA3, str7, h8k0Var, new g8k0(4, pn40.c(0.0d, p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.i), p3u0Var2), str7)), new f8k0(ctf0Var5.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str7, h8k0.b, new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.e), p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.d), p3u0Var2), str7)))));
                            if (i4VarG0 != null) {
                                return i4VarG0;
                            }
                        }
                        return lak0.c;
                    default:
                        fee feeVar11 = (fee) obj;
                        feeVar11.getClass();
                        boolean z2 = ((SaleScreenModel) feeVar11.c()).b;
                        ctf0 ctf0Var6 = bwg0Var.b;
                        return z2 ? ctf0Var6.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)) : ctf0Var6.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        this.E = maz.b(new yw9((fee) n0o0VarH3.getValue(), new Function1(this) { // from class: a.zvg0
            public final /* synthetic */ bwg0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                tsv tsvVar;
                Object next;
                i4 i4VarB;
                i4 i4VarB2;
                byte b7 = b5;
                wtg0 wtg0Var = wtg0.f39739a;
                bwg0 bwg0Var = this.b;
                switch (b7) {
                    case 0:
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        if (!Intrinsics.d((xtg0) feeVar6.c(), wtg0Var)) {
                            return lak0.c;
                        }
                        ctf0 ctf0Var2 = bwg0Var.b;
                        ctf0Var2.getClass();
                        return dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.sell, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.w));
                    case 1:
                        fee feeVar7 = (fee) obj;
                        feeVar7.getClass();
                        boolean z = ((SaleScreenModel) feeVar7.c()).b;
                        ctf0 ctf0Var3 = bwg0Var.b;
                        return z ? ctf0Var3.b.a(R.string.auto_sell_settings, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.sell_settings, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        fee feeVar8 = (fee) obj;
                        feeVar8.getClass();
                        xtg0 xtg0Var2 = (xtg0) feeVar8.c();
                        if (Intrinsics.d(xtg0Var2, utg0.f36253a)) {
                            return new zie(ocl.b(bwg0Var.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (Intrinsics.d(xtg0Var2, vtg0.f38006a)) {
                            return dje.f6181a;
                        }
                        if (Intrinsics.d(xtg0Var2, wtg0Var)) {
                            return fje.f9636a;
                        }
                        t9f.b();
                        return null;
                    case 3:
                        ctf0 ctf0Var4 = bwg0Var.b;
                        fee feeVar9 = (fee) obj;
                        feeVar9.getClass();
                        a5w a5wVar = (a5w) feeVar9.c();
                        if (a5wVar == null) {
                            return wsv.f39710a;
                        }
                        ql5 ql5Var = (ql5) ((fee) bwg0Var.w.getValue()).b();
                        String str = ql5Var != null ? ql5Var.f : null;
                        String str2 = str != null ? str : "";
                        List list = bwg0Var.f3323a.t;
                        List list2 = (List) ((fee) bwg0Var.x.getValue()).b();
                        List list3 = (List) ((fee) bwg0Var.v.getValue()).b();
                        ctf0Var4.getClass();
                        list.getClass();
                        list2.getClass();
                        list3.getClass();
                        if (a5wVar instanceof kzv) {
                            kzv kzvVar = (kzv) a5wVar;
                            List list4 = kzvVar.Y;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Iterator it2 = it;
                                    if (((xco) next).f40655a != kzvVar.T) {
                                        it = it2;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            xco xcoVar = (xco) next;
                            boolean zA = i7u.c.a(list4, list3);
                            boolean zA2 = i7u.b.a(list4, list3);
                            tvw tvwVarA0 = lmc.a0(kzvVar);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var4.b;
                            String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var4.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kzvVar.f19169a}, 1));
                            i4 i4VarN = jwb.N(kzvVar, ctf0Var4, list, xcoVar != null ? xcoVar.e : false, zA, zA2, kzvVar.B);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (u1c.y(kzvVar)) {
                                lc00VarB.add(vcc.J(kzvVar, ctf0Var4));
                            }
                            j3w j3wVarS = feb.S(kzvVar, ctf0Var4, zA);
                            if (j3wVarS != null) {
                                lc00VarB.add(j3wVarS);
                            }
                            double d = kzvVar.L;
                            double d2 = kzvVar.f;
                            String strA2 = lsm0Var.a(d < d2 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                            pn40 pn40Var = pn40.f27267a;
                            double d3 = d2 - kzvVar.E;
                            p3u0 p3u0Var = p3u0.c;
                            String strC = pn40.c(d3, p3u0Var);
                            e3w e3wVar = e3w.f7156a;
                            String str3 = str2;
                            lc00VarB.add(new f3w("", strA2, strC, str3, e3wVar));
                            lc00VarB.add(new f3w("", lsm0Var.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(kzvVar.m, p3u0Var), str3, e3wVar));
                            tsvVar = new tsv(tvwVarA0, strG, strA, i4VarN, dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        } else {
                            lak0 lak0Var = lak0.c;
                            tsvVar = new tsv(qvw.f29409a, "", "", lak0Var, lak0Var);
                        }
                        int iOrdinal = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i4 i4VarR0 = dyb.r0(CollectionsKt.r0(tsvVar.e, new l3w(ctf0Var4.b.a(R.string.auto_sale_restriction, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.only_full_sale_for_bet, Arrays.copyOf(new Object[0], 0)), i8x.f14362a)));
                            String str4 = tsvVar.b;
                            str4.getClass();
                            String str5 = tsvVar.c;
                            str5.getClass();
                            a4x a4xVar = tsvVar.d;
                            a4xVar.getClass();
                            i4VarR0.getClass();
                            tsvVar = new tsv(tsvVar.f34481a, str4, str5, a4xVar, i4VarR0);
                        }
                        return new xsv(tsvVar);
                    case 4:
                        fee feeVar10 = (fee) obj;
                        feeVar10.getClass();
                        int iOrdinal2 = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                return lak0.c;
                            }
                            if (iOrdinal2 == 2) {
                                ytg0 ytg0Var = (ytg0) feeVar10.c();
                                return (ytg0Var == null || (i4VarB = bwg0Var.b(ytg0Var, false)) == null) ? lak0.c : i4VarB;
                            }
                            if (iOrdinal2 == 3) {
                                ytg0 ytg0Var2 = (ytg0) feeVar10.c();
                                return (ytg0Var2 == null || (i4VarB2 = bwg0Var.b(ytg0Var2, true)) == null) ? lak0.c : i4VarB2;
                            }
                            t9f.b();
                            return null;
                        }
                        ytg0 ytg0Var3 = (ytg0) feeVar10.c();
                        if (ytg0Var3 != null) {
                            ctf0 ctf0Var5 = bwg0Var.b;
                            ql5 ql5Var2 = (ql5) ((fee) bwg0Var.w.getValue()).b();
                            String str6 = ql5Var2 != null ? ql5Var2.f : null;
                            String str7 = str6 == null ? "" : str6;
                            cvg0 cvg0Var = new cvg0();
                            String strA3 = ctf0Var5.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0));
                            h8k0 h8k0Var = h8k0.f12630a;
                            pn40 pn40Var2 = pn40.f27267a;
                            p3u0 p3u0Var2 = p3u0.c;
                            i4 i4VarG0 = dyb.g0(cvg0Var, new j8k0(q3d.j(new f8k0(strA3, str7, h8k0Var, new g8k0(4, pn40.c(0.0d, p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.i), p3u0Var2), str7)), new f8k0(ctf0Var5.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str7, h8k0.b, new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.e), p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.d), p3u0Var2), str7)))));
                            if (i4VarG0 != null) {
                                return i4VarG0;
                            }
                        }
                        return lak0.c;
                    default:
                        fee feeVar11 = (fee) obj;
                        feeVar11.getClass();
                        boolean z2 = ((SaleScreenModel) feeVar11.c()).b;
                        ctf0 ctf0Var6 = bwg0Var.b;
                        return z2 ? ctf0Var6.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)) : ctf0Var6.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        this.F = maz.b(new yw9((fee) n0o0VarH7.getValue(), new Function1(this) { // from class: a.zvg0
            public final /* synthetic */ bwg0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                tsv tsvVar;
                Object next;
                i4 i4VarB;
                i4 i4VarB2;
                byte b7 = b6;
                wtg0 wtg0Var = wtg0.f39739a;
                bwg0 bwg0Var = this.b;
                switch (b7) {
                    case 0:
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        if (!Intrinsics.d((xtg0) feeVar6.c(), wtg0Var)) {
                            return lak0.c;
                        }
                        ctf0 ctf0Var2 = bwg0Var.b;
                        ctf0Var2.getClass();
                        return dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.sell, Arrays.copyOf(new Object[0], 0))), true, false, true), sh00.w));
                    case 1:
                        fee feeVar7 = (fee) obj;
                        feeVar7.getClass();
                        boolean z = ((SaleScreenModel) feeVar7.c()).b;
                        ctf0 ctf0Var3 = bwg0Var.b;
                        return z ? ctf0Var3.b.a(R.string.auto_sell_settings, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.sell_settings, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        fee feeVar8 = (fee) obj;
                        feeVar8.getClass();
                        xtg0 xtg0Var2 = (xtg0) feeVar8.c();
                        if (Intrinsics.d(xtg0Var2, utg0.f36253a)) {
                            return new zie(ocl.b(bwg0Var.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (Intrinsics.d(xtg0Var2, vtg0.f38006a)) {
                            return dje.f6181a;
                        }
                        if (Intrinsics.d(xtg0Var2, wtg0Var)) {
                            return fje.f9636a;
                        }
                        t9f.b();
                        return null;
                    case 3:
                        ctf0 ctf0Var4 = bwg0Var.b;
                        fee feeVar9 = (fee) obj;
                        feeVar9.getClass();
                        a5w a5wVar = (a5w) feeVar9.c();
                        if (a5wVar == null) {
                            return wsv.f39710a;
                        }
                        ql5 ql5Var = (ql5) ((fee) bwg0Var.w.getValue()).b();
                        String str = ql5Var != null ? ql5Var.f : null;
                        String str2 = str != null ? str : "";
                        List list = bwg0Var.f3323a.t;
                        List list2 = (List) ((fee) bwg0Var.x.getValue()).b();
                        List list3 = (List) ((fee) bwg0Var.v.getValue()).b();
                        ctf0Var4.getClass();
                        list.getClass();
                        list2.getClass();
                        list3.getClass();
                        if (a5wVar instanceof kzv) {
                            kzv kzvVar = (kzv) a5wVar;
                            List list4 = kzvVar.Y;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    Iterator it2 = it;
                                    if (((xco) next).f40655a != kzvVar.T) {
                                        it = it2;
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            xco xcoVar = (xco) next;
                            boolean zA = i7u.c.a(list4, list3);
                            boolean zA2 = i7u.b.a(list4, list3);
                            tvw tvwVarA0 = lmc.a0(kzvVar);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var4.b;
                            String strG = rdj.g(new znq0(kzvVar.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var4.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kzvVar.f19169a}, 1));
                            i4 i4VarN = jwb.N(kzvVar, ctf0Var4, list, xcoVar != null ? xcoVar.e : false, zA, zA2, kzvVar.B);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (u1c.y(kzvVar)) {
                                lc00VarB.add(vcc.J(kzvVar, ctf0Var4));
                            }
                            j3w j3wVarS = feb.S(kzvVar, ctf0Var4, zA);
                            if (j3wVarS != null) {
                                lc00VarB.add(j3wVarS);
                            }
                            double d = kzvVar.L;
                            double d2 = kzvVar.f;
                            String strA2 = lsm0Var.a(d < d2 ? R.string.history_bet_rate_partially_sold : R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
                            pn40 pn40Var = pn40.f27267a;
                            double d3 = d2 - kzvVar.E;
                            p3u0 p3u0Var = p3u0.c;
                            String strC = pn40.c(d3, p3u0Var);
                            e3w e3wVar = e3w.f7156a;
                            String str3 = str2;
                            lc00VarB.add(new f3w("", strA2, strC, str3, e3wVar));
                            lc00VarB.add(new f3w("", lsm0Var.a(R.string.current_sum_with_colon, Arrays.copyOf(new Object[0], 0)), pn40.c(kzvVar.m, p3u0Var), str3, e3wVar));
                            tsvVar = new tsv(tvwVarA0, strG, strA, i4VarN, dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        } else {
                            lak0 lak0Var = lak0.c;
                            tsvVar = new tsv(qvw.f29409a, "", "", lak0Var, lak0Var);
                        }
                        int iOrdinal = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i4 i4VarR0 = dyb.r0(CollectionsKt.r0(tsvVar.e, new l3w(ctf0Var4.b.a(R.string.auto_sale_restriction, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.only_full_sale_for_bet, Arrays.copyOf(new Object[0], 0)), i8x.f14362a)));
                            String str4 = tsvVar.b;
                            str4.getClass();
                            String str5 = tsvVar.c;
                            str5.getClass();
                            a4x a4xVar = tsvVar.d;
                            a4xVar.getClass();
                            i4VarR0.getClass();
                            tsvVar = new tsv(tsvVar.f34481a, str4, str5, a4xVar, i4VarR0);
                        }
                        return new xsv(tsvVar);
                    case 4:
                        fee feeVar10 = (fee) obj;
                        feeVar10.getClass();
                        int iOrdinal2 = ((wvg0) ((fee) bwg0Var.s.getValue()).c()).ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                return lak0.c;
                            }
                            if (iOrdinal2 == 2) {
                                ytg0 ytg0Var = (ytg0) feeVar10.c();
                                return (ytg0Var == null || (i4VarB = bwg0Var.b(ytg0Var, false)) == null) ? lak0.c : i4VarB;
                            }
                            if (iOrdinal2 == 3) {
                                ytg0 ytg0Var2 = (ytg0) feeVar10.c();
                                return (ytg0Var2 == null || (i4VarB2 = bwg0Var.b(ytg0Var2, true)) == null) ? lak0.c : i4VarB2;
                            }
                            t9f.b();
                            return null;
                        }
                        ytg0 ytg0Var3 = (ytg0) feeVar10.c();
                        if (ytg0Var3 != null) {
                            ctf0 ctf0Var5 = bwg0Var.b;
                            ql5 ql5Var2 = (ql5) ((fee) bwg0Var.w.getValue()).b();
                            String str6 = ql5Var2 != null ? ql5Var2.f : null;
                            String str7 = str6 == null ? "" : str6;
                            cvg0 cvg0Var = new cvg0();
                            String strA3 = ctf0Var5.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0));
                            h8k0 h8k0Var = h8k0.f12630a;
                            pn40 pn40Var2 = pn40.f27267a;
                            p3u0 p3u0Var2 = p3u0.c;
                            i4 i4VarG0 = dyb.g0(cvg0Var, new j8k0(q3d.j(new f8k0(strA3, str7, h8k0Var, new g8k0(4, pn40.c(0.0d, p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.i), p3u0Var2), str7)), new f8k0(ctf0Var5.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str7, h8k0.b, new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.e), p3u0Var2), str7), new g8k0(4, pn40.c(bwg0Var.a(ytg0Var3.d), p3u0Var2), str7)))));
                            if (i4VarG0 != null) {
                                return i4VarG0;
                            }
                        }
                        return lak0.c;
                    default:
                        fee feeVar11 = (fee) obj;
                        feeVar11.getClass();
                        boolean z2 = ((SaleScreenModel) feeVar11.c()).b;
                        ctf0 ctf0Var6 = bwg0Var.b;
                        return z2 ? ctf0Var6.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)) : ctf0Var6.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
    }

    public final double a(double d) {
        return this.f3323a.m ? Math.floor(d) : d;
    }

    public final i4 b(ytg0 ytg0Var, boolean z) {
        ql5 ql5Var = (ql5) ((fee) this.w.getValue()).b();
        String str = ql5Var != null ? ql5Var.f : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        cvg0 cvg0Var = new cvg0();
        ctf0 ctf0Var = this.b;
        String strA = ctf0Var.b.a(R.string.history_bet_will_sold_at, Arrays.copyOf(new Object[0], 0));
        h8k0 h8k0Var = h8k0.c;
        pn40 pn40Var = pn40.f27267a;
        double dA = a(ytg0Var.f);
        p3u0 p3u0Var = p3u0.c;
        List listJ = q3d.j(new f8k0(strA, str2, h8k0Var, new g8k0(4, pn40.c(dA, p3u0Var), str2), new g8k0(4, pn40.c(a(ytg0Var.g), p3u0Var), str2)), new f8k0(ctf0Var.b.a(R.string.edit_coupon_new_sum_with_colon, Arrays.copyOf(new Object[0], 0)), str2, h8k0.f12630a, new g8k0(4, pn40.c(0.0d, p3u0Var), str2), new g8k0(4, pn40.c(a(ytg0Var.i), p3u0Var), str2)), new f8k0(ctf0Var.b.a(R.string.history_bill_will_credited_with_colon, Arrays.copyOf(new Object[0], 0)), str2, h8k0.b, new g8k0(4, pn40.c(a(ytg0Var.e), p3u0Var), str2), new g8k0(4, pn40.c(a(ytg0Var.d), p3u0Var), str2)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            f8k0 f8k0Var = (f8k0) obj;
            if (!z || f8k0Var.c == h8k0.c) {
                arrayList.add(obj);
            }
        }
        return dyb.g0(cvg0Var, new j8k0(arrayList));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        svg0 svg0Var = (svg0) obj;
        svg0Var.getClass();
        ((fee) this.d.getValue()).d(Boolean.valueOf(svg0Var.l));
        fee feeVar = (fee) this.e.getValue();
        xtg0 xtg0Var = svg0Var.o;
        feeVar.d(xtg0Var);
        ((fee) this.f.getValue()).d(xtg0Var);
        ((fee) this.g.getValue()).d(svg0Var.r);
        ((fee) this.h.getValue()).d(svg0Var.s);
        ((fee) this.i.getValue()).d(svg0Var.u);
        ((fee) this.j.getValue()).d(svg0Var.v);
        ((fee) this.k.getValue()).d(svg0Var.q);
        n0o0 n0o0Var = this.n;
        ((fee) n0o0Var.getValue()).d(Float.valueOf(svg0Var.b));
        n0o0 n0o0Var2 = this.l;
        ((fee) n0o0Var2.getValue()).d(Float.valueOf(svg0Var.f32864a));
        ((fee) this.o.getValue()).d(Double.valueOf(svg0Var.f));
        ((fee) this.q.getValue()).d(Double.valueOf(svg0Var.g));
        n0o0 n0o0Var3 = this.r;
        ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(svg0Var.k));
        ((fee) this.s.getValue()).d(svg0Var.p);
        n0o0 n0o0Var4 = this.m;
        ((fee) n0o0Var4.getValue()).d(Float.valueOf(svg0Var.c));
        ((fee) this.p.getValue()).d(Double.valueOf(svg0Var.h));
        zbk zbkVar = ((fee) this.t.getValue()).e;
        zbk zbkVar2 = ((fee) this.D.getValue()).e;
        zbk zbkVar3 = ((fee) this.B.getValue()).e;
        zbk zbkVar4 = ((fee) this.E.getValue()).e;
        zbk zbkVar5 = ((fee) this.F.getValue()).e;
        pz40 pz40Var = ((fee) n0o0Var2.getValue()).d;
        zbk zbkVar6 = ((fee) this.y.getValue()).e;
        return new yvg0(zbkVar, zbkVar2, zbkVar3, zbkVar5, zbkVar4, pz40Var, ((fee) n0o0Var4.getValue()).d, ((fee) this.z.getValue()).e, ((fee) n0o0Var.getValue()).d, zbkVar6, ((fee) n0o0Var3.getValue()).d, ((fee) this.A.getValue()).e, ((fee) this.u.getValue()).e, ((fee) this.C.getValue()).e);
    }
}
