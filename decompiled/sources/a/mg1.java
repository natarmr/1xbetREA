package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mg1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21720a;
    public final /* synthetic */ ng1 b;
    public final /* synthetic */ pf1 c;

    public /* synthetic */ mg1(pf1 pf1Var, ng1 ng1Var, byte b) {
        this.f21720a = b;
        this.c = pf1Var;
        this.b = ng1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ijl ijlVar;
        String strA;
        String strC;
        String str;
        tpl tplVar;
        tpl eplVar;
        all allVar;
        byte b = this.f21720a;
        String strQ = "";
        ng1 ng1Var = this.b;
        pf1 pf1Var = this.c;
        switch (b) {
            case 0:
                ((fee) obj).getClass();
                fee feeVar = (fee) ng1Var.j.getValue();
                ctf0 ctf0Var = ng1Var.b;
                if (!((Boolean) feeVar.c()).booleanValue()) {
                    return new yc(ctf0Var.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                }
                ql5 ql5Var = (ql5) ((fee) ng1Var.i.getValue()).c();
                int iOrdinal = pf1Var.H.ordinal();
                if (iOrdinal == 0) {
                    ijlVar = ijl.f14880a;
                } else if (iOrdinal == 1) {
                    ijlVar = ijl.b;
                } else if (iOrdinal == 2) {
                    ijlVar = ijl.c;
                } else if (iOrdinal == 3) {
                    ijlVar = ijl.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    ijlVar = ijl.e;
                }
                if (ql5Var != null) {
                    strA = ql5Var.j;
                    if (ijlVar == ijl.b) {
                        strA = ctf0Var.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                    } else if (strA.length() <= 0) {
                        strA = ql5Var.k;
                    }
                } else {
                    strA = null;
                }
                String str2 = strA == null ? "" : strA;
                if (ql5Var != null) {
                    double d = ql5Var.b;
                    pn40 pn40Var = pn40.f27267a;
                    strC = pn40.c(d, p3u0.c);
                } else {
                    strC = null;
                }
                String str3 = strC == null ? "" : strC;
                String str4 = ql5Var != null ? ql5Var.f : null;
                String str5 = str4 == null ? "" : str4;
                String strA2 = ctf0Var.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var = s6t0.f31722a;
                return new wc(ijlVar, new jjl(str3, str5, strA2, str2, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
            case 1:
                lq5 lq5Var = pf1Var.e;
                ((fee) obj).getClass();
                String strA3 = ng1Var.b.b.a(R.string.casino_promotions_title, Arrays.copyOf(new Object[0], 0));
                c6c0 c6c0Var = (c6c0) ((fee) ng1Var.c.getValue()).c();
                if (c6c0Var == null) {
                    return null;
                }
                if (!(c6c0Var instanceof x5c0)) {
                    if (c6c0Var instanceof b6c0) {
                        return new ag1(lak0.c, lq5Var, new ijm(), true);
                    }
                    return null;
                }
                a4x<lr5> a4xVar = ((x5c0) c6c0Var).f40309a;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                for (lr5 lr5Var : a4xVar) {
                    lr5Var.getClass();
                    int i = lr5Var.f20512a;
                    if (lq5Var.equals(gq5.f11714a) || lq5Var.equals(fq5.f9956a)) {
                        str = lr5Var.c;
                    } else if (lq5Var.equals(hq5.f13470a) || lq5Var.equals(iq5.f15191a) || lq5Var.equals(kq5.f18703a) || (lq5Var instanceof jq5)) {
                        str = lr5Var.b;
                    } else {
                        if (!lq5Var.equals(dq5.f6497a) && !lq5Var.equals(eq5.f8219a) && !lq5Var.equals(cq5.f4775a)) {
                            t9f.b();
                            return null;
                        }
                        str = lr5Var.d;
                    }
                    arrayList.add(new fr5(i, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                }
                return new ag1(dyb.o0(arrayList), lq5Var, new hjm(strA3, null, null, null, null, null, false, null, null, false, null, null, 8190), false);
            case 2:
                ((fee) obj).getClass();
                onl onlVar = pf1Var.i;
                int iOrdinal2 = onlVar.ordinal();
                if (iOrdinal2 == 2) {
                    List list = u0d.f34849a;
                    strQ = u0d.q(String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/aggregator_promocode/Small_Banner.webp", Arrays.copyOf(new Object[0], 0)));
                } else if (iOrdinal2 == 3) {
                    List list2 = u0d.f34849a;
                    strQ = u0d.q(String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/aggregator_promocode/Large_Banner.webp", Arrays.copyOf(new Object[0], 0)));
                }
                ctf0 ctf0Var2 = ng1Var.b;
                return new dg1(onlVar, new pnl(new n0x(strQ), ctf0Var2.b.a(R.string.promocode, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.check_and_activate, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.activate_promocode_summary_from_casino, Arrays.copyOf(new Object[0], 0))));
            case 3:
                qik0 qik0Var = pf1Var.h;
                ((fee) obj).getClass();
                ctf0 ctf0Var3 = ng1Var.b;
                String strA4 = ctf0Var3.b.a(R.string.social, Arrays.copyOf(new Object[0], 0));
                String strA5 = ctf0Var3.b.a(R.string.read_aggregator_social_networks, Arrays.copyOf(new Object[0], 0));
                vtc0 vtc0Var = (vtc0) ((fee) ng1Var.e.getValue()).c();
                if (!(vtc0Var instanceof rtc0)) {
                    if (!Intrinsics.d(vtc0Var, utc0.f36249a)) {
                        return null;
                    }
                    int iOrdinal3 = qik0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        tplVar = fpl.f9933a;
                    } else if (iOrdinal3 == 1) {
                        tplVar = rpl.f30892a;
                    } else if (iOrdinal3 == 2) {
                        tplVar = ipl.f15169a;
                    } else if (iOrdinal3 == 3) {
                        tplVar = lpl.f20447a;
                    } else {
                        if (iOrdinal3 != 4) {
                            t9f.b();
                            return null;
                        }
                        tplVar = opl.f25646a;
                    }
                    return new eg1(tplVar);
                }
                a4x<qtc0> a4xVar2 = ((rtc0) vtc0Var).f31072a;
                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar2, 10));
                for (qtc0 qtc0Var : a4xVar2) {
                    qtc0Var.getClass();
                    arrayList2.add(new bpl(qtc0Var.f29293a, qtc0Var.b, qtc0Var.c));
                }
                a4x a4xVarO0 = dyb.o0(arrayList2);
                int iOrdinal4 = qik0Var.ordinal();
                if (iOrdinal4 == 0) {
                    eplVar = new epl(a4xVarO0, strA4, strA5);
                } else if (iOrdinal4 == 1) {
                    eplVar = new qpl(a4xVarO0, strA4, strA5);
                } else if (iOrdinal4 == 2) {
                    eplVar = new hpl(a4xVarO0, strA4, strA5);
                } else if (iOrdinal4 == 3) {
                    eplVar = new kpl(a4xVarO0, strA4, strA5);
                } else {
                    if (iOrdinal4 != 4) {
                        t9f.b();
                        return null;
                    }
                    eplVar = new npl(a4xVarO0, strA4, strA5);
                }
                return new eg1(eplVar);
            case 4:
                ((fee) obj).getClass();
                me1 me1Var = pf1Var.g;
                String str6 = pf1Var.c;
                fee feeVar2 = (fee) ng1Var.f.getValue();
                ctf0 ctf0Var4 = ng1Var.b;
                klc0 klc0Var = (klc0) feeVar2.c();
                if (klc0Var instanceof elc0) {
                    n0x n0xVar = new n0x(ohs0.n(str6, o5n0.n(me1Var)));
                    qc0 qc0Var = qc0.f28463a;
                    lsm0 lsm0Var = ctf0Var4.b;
                    lsm0 lsm0Var2 = ctf0Var4.b;
                    String strA6 = lsm0Var.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var2 = pn40.f27267a;
                    elc0 elc0Var = (elc0) klc0Var;
                    return ng1.a(me1Var, n0xVar, qc0Var, strA6, pn40.d(elc0Var.f7989a, elc0Var.b, p3u0.c), lsm0Var2.a(R.string.active_bonus_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.bonuses_and_free_spins_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.go_to, Arrays.copyOf(new Object[0], 0)));
                }
                if (klc0Var instanceof glc0) {
                    n0x n0xVar2 = new n0x(ohs0.n(str6, o5n0.n(me1Var)));
                    qc0 qc0Var2 = qc0.b;
                    lsm0 lsm0Var3 = ctf0Var4.b;
                    lsm0 lsm0Var4 = ctf0Var4.b;
                    return ng1.a(me1Var, n0xVar2, qc0Var2, lsm0Var3.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0)), String.valueOf(((glc0) klc0Var).f11485a), lsm0Var4.a(R.string.available_bonuses_desc, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.bonuses_and_free_spins_title, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.go_to, Arrays.copyOf(new Object[0], 0)));
                }
                if (Intrinsics.d(klc0Var, ilc0.f14971a) || Intrinsics.d(klc0Var, jlc0.f16709a)) {
                    n0x n0xVar3 = new n0x(ohs0.n(str6, o5n0.n(me1Var)));
                    qc0 qc0Var3 = ((Boolean) ((fee) ng1Var.j.getValue()).c()).booleanValue() ? qc0.c : qc0.d;
                    me1 me1Var2 = me1.BUTTON;
                    int i2 = me1Var == me1Var2 ? R.string.gifts_title : R.string.bonuses_for_games_title;
                    lsm0 lsm0Var5 = ctf0Var4.b;
                    lsm0 lsm0Var6 = ctf0Var4.b;
                    return ng1.a(me1Var, n0xVar3, qc0Var3, lsm0Var5.a(i2, Arrays.copyOf(new Object[0], 0)), "", me1Var == me1Var2 ? lsm0Var6.a(R.string.bonuses_and_free_spins_title, Arrays.copyOf(new Object[0], 0)) : "", lsm0Var6.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.bonuses_and_free_spins_title, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.go_to, Arrays.copyOf(new Object[0], 0)));
                }
                if (!Intrinsics.d(klc0Var, hlc0.f13252a)) {
                    if (Intrinsics.d(klc0Var, flc0.f9730a)) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                int iOrdinal5 = me1Var.ordinal();
                if (iOrdinal5 == 0) {
                    allVar = skl.f32355a;
                } else if (iOrdinal5 == 1) {
                    allVar = ykl.f42795a;
                } else if (iOrdinal5 == 2) {
                    allVar = pkl.f27139a;
                } else if (iOrdinal5 == 3) {
                    allVar = vkl.f37579a;
                } else {
                    if (iOrdinal5 != 4) {
                        t9f.b();
                        return null;
                    }
                    allVar = mkl.f21949a;
                }
                return new cg1(allVar);
            default:
                ((fee) obj).getClass();
                ypl yplVar = pf1Var.d;
                fee feeVar3 = (fee) ng1Var.g.getValue();
                ctf0 ctf0Var5 = ng1Var.b;
                yuc0 yuc0Var = (yuc0) feeVar3.c();
                if (Intrinsics.d(yuc0Var, wuc0.f39786a)) {
                    if (pf1Var.j) {
                        return new fg1(yplVar, aql.f1301a);
                    }
                    return null;
                }
                if (!(yuc0Var instanceof uuc0)) {
                    return null;
                }
                a4x a4xVar3 = ((uuc0) yuc0Var).f36293a;
                if (a4xVar3.isEmpty()) {
                    return null;
                }
                String strA7 = ctf0Var5.b.a(R.string.tournaments, Arrays.copyOf(new Object[0], 0));
                String strA8 = ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar3, 10));
                Iterator<E> it = a4xVar3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(d5c.V((myr0) it.next(), yplVar, ctf0Var5, pf1Var.b));
                }
                return new fg1(yplVar, new zpl(dyb.o0(arrayList3), strA7, strA8));
        }
    }

    public /* synthetic */ mg1(ng1 ng1Var, pf1 pf1Var, byte b) {
        this.f21720a = b;
        this.b = ng1Var;
        this.c = pf1Var;
    }
}
