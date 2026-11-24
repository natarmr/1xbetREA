package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class eh00 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f7787a;
    public final ug20 b;
    public final n0o0 c;
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

    static {
        int i = c820.n;
    }

    public eh00(c820 c820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        ctf0Var.getClass();
        this.f7787a = ctf0Var;
        int iOrdinal = c820Var.l.ordinal();
        final byte b = 2;
        final byte b2 = 1;
        ug20 ug20Var = (iOrdinal == 1 || iOrdinal != 2) ? ug20.b : ug20.f35603a;
        this.b = ug20Var;
        n0o0 n0o0VarH = bkb.H(c820Var.f3892a);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(c820Var.c);
        this.d = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(c820Var.b);
        this.e = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(c820Var.d);
        this.f = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(c820Var.e);
        this.g = n0o0VarH5;
        this.h = bkb.H(Boolean.valueOf(c820Var.i));
        n0o0 n0o0VarH6 = bkb.H(Boolean.valueOf(c820Var.g));
        this.i = n0o0VarH6;
        this.j = bkb.H(Boolean.valueOf(c820Var.k));
        final byte b3 = 0;
        this.k = maz.b(new yw9((fee) n0o0VarH6.getValue(), new Function1(this) { // from class: a.dh00
            public final /* synthetic */ eh00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                double d;
                double d2;
                boolean z;
                String str;
                String strT;
                bxo0 zwo0Var;
                tn7 sn7Var;
                vyc0 vyc0Var;
                byte b4 = b3;
                eh00 eh00Var = this.b;
                switch (b4) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (((Boolean) feeVar.c()).booleanValue()) {
                            return null;
                        }
                        ctf0 ctf0Var2 = eh00Var.f7787a;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        g9x g9xVar = new g9x(lsm0Var.a(R.string.call_to_auth, Arrays.copyOf(new Object[0], 0)));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        return new yw00(g9xVar, new wul(nulVar, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(iul.e, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true));
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = eh00Var.f7787a;
                        go7 go7Var = (go7) ((fee) eh00Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var, do7.f6402a)) {
                            d = ((svj0) ((fee) eh00Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var, ao7.f1188a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ql5 ql5Var = bn5Var.c;
                        ctf0Var3.getClass();
                        String str2 = ql5Var.f;
                        double d3 = ql5Var.b;
                        g30 g30Var = new g30();
                        pn40 pn40Var = pn40.f27267a;
                        return new ef6(g30Var, new rw7(pn40.c(d3, p3u0.c), str2, (d3 == 0.0d || d > d3) && ql5Var.f28916a != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str3 = ((bn5) ((fee) eh00Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = eh00Var.f7787a;
                        boolean zBooleanValue = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str3.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var = ex6Var.b;
                        a8q0 a8q0Var = ex6Var.f8562a;
                        String strA = ctf0Var4.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = ww6Var.m;
                        boolean z3 = ww6Var.i;
                        mx6 mx6Var = new mx6(a8q0Var, strA, z2, true, false);
                        double d4 = ww6Var.f39872a;
                        double d5 = ww6Var.d;
                        double d6 = ww6Var.e;
                        if ((d5 > d4 || d4 > d6) && d4 != -1.0d) {
                            d2 = d4;
                            z = z3;
                            str = str3;
                            strT = d2 < d5 ? l8x.T(ctf0Var4, d5, str) : d2 > d6 ? l8x.S(ctf0Var4, d6, str) : "";
                        } else {
                            str = str3;
                            strT = l8x.R(false, d5, str3, d6);
                            z = z3;
                            d2 = d4;
                        }
                        oln0 oln0Var = new oln0(strT, false, false);
                        String str4 = nnb0Var.b;
                        String str5 = nnb0Var.c;
                        if (zBooleanValue) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        xnb0 xnb0Var = new xnb0(str4, str5, nnb0Var.f23813a);
                        boolean z4 = ww6Var.k;
                        double d7 = ww6Var.d;
                        boolean z5 = d2 > d7 && z && !zBooleanValue;
                        boolean z6 = z;
                        String str6 = str;
                        double d8 = ww6Var.e;
                        yv6 yv6Var = new yv6(mx6Var, oln0Var, xnb0Var, new jke(z4, z4, z5, d2 < d8 && z6 && !zBooleanValue), (ww6Var.l || zBooleanValue) ? fx6.c : ((d7 > d2 || d2 > d8) && d2 != -1.0d) ? fx6.b : fx6.f10293a, str6, true);
                        lwo0 lwo0Var = svj0Var.c;
                        boolean z7 = lwo0Var.f20774a;
                        double d9 = lwo0Var.d;
                        String str7 = lwo0Var.c;
                        boolean z8 = lwo0Var.b;
                        if (z8 || zBooleanValue) {
                            zwo0Var = xwo0.f41619a;
                        } else if (d9 == 0.0d) {
                            zwo0Var = null;
                        } else {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            zwo0Var = new zwo0(cy7.e(pn40.p(str6, d9)), d9 > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
                        }
                        String str8 = lwo0Var.e;
                        if (z8 || zBooleanValue) {
                            sn7Var = rn7.f30774a;
                        } else {
                            List<mvo0> list = lwo0Var.f;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (mvo0 mvo0Var : list) {
                                arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                            }
                            sn7Var = new sn7(dyb.r0(arrayList));
                        }
                        return new zvj0(yv6Var, new ixo0(z7, str7, zwo0Var, str8, sn7Var));
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var = (jfc0) feeVar4.c();
                        if (jfc0Var != null) {
                            ctf0 ctf0Var5 = eh00Var.f7787a;
                            boolean zBooleanValue2 = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var.f16419a;
                            zyc0 zyc0Var = new zyc0(azc0Var.f1710a, azc0Var.b, azc0Var.c, azc0Var.d, azc0Var.e, azc0Var.f);
                            if (zBooleanValue2) {
                                vyc0Var = vyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    vyc0Var = vyc0.f38241a;
                                } else if (iOrdinal2 == 1) {
                                    vyc0Var = vyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var.c;
                            double d10 = rlc0Var.f30690a;
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA2 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i2 = cy7.f5159a;
                            pn40 pn40Var3 = pn40.f27267a;
                            String str9 = rlc0Var.c;
                            p3u0 p3u0Var = p3u0.c;
                            tlc0 tlc0Var = new tlc0(dyb.r0(tx3.z(new llc0[]{new llc0(strA2, cy7.e(pn40.d(d10, str9, p3u0Var)), false), new llc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new llc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str9, p3u0Var)), true) : null, rlc0Var.g ? new llc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str9, p3u0Var)), true) : null})), rlc0Var.h);
                            boolean z9 = jfc0Var.d;
                            String strA3 = lsm0Var3.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
                            String strConcat = z9 ? Separators.RETURN.concat(lsm0Var3.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
                            if (strConcat == null) {
                                strConcat = "";
                            }
                            return new z6c0(zyc0Var, vyc0Var, tlc0Var, strA3.concat(strConcat));
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.l = maz.b(new yw9((fee) n0o0VarH.getValue(), new w800((byte) 5), (byte) 20));
        this.m = maz.b(new yw9((fee) n0o0VarH3.getValue(), new u400(this, zvh0Var, (byte) 10), (byte) 20));
        this.n = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.dh00
            public final /* synthetic */ eh00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                double d;
                double d2;
                boolean z;
                String str;
                String strT;
                bxo0 zwo0Var;
                tn7 sn7Var;
                vyc0 vyc0Var;
                byte b4 = b2;
                eh00 eh00Var = this.b;
                switch (b4) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (((Boolean) feeVar.c()).booleanValue()) {
                            return null;
                        }
                        ctf0 ctf0Var2 = eh00Var.f7787a;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        g9x g9xVar = new g9x(lsm0Var.a(R.string.call_to_auth, Arrays.copyOf(new Object[0], 0)));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        return new yw00(g9xVar, new wul(nulVar, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(iul.e, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true));
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = eh00Var.f7787a;
                        go7 go7Var = (go7) ((fee) eh00Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var, do7.f6402a)) {
                            d = ((svj0) ((fee) eh00Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var, ao7.f1188a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ql5 ql5Var = bn5Var.c;
                        ctf0Var3.getClass();
                        String str2 = ql5Var.f;
                        double d3 = ql5Var.b;
                        g30 g30Var = new g30();
                        pn40 pn40Var = pn40.f27267a;
                        return new ef6(g30Var, new rw7(pn40.c(d3, p3u0.c), str2, (d3 == 0.0d || d > d3) && ql5Var.f28916a != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str3 = ((bn5) ((fee) eh00Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = eh00Var.f7787a;
                        boolean zBooleanValue = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str3.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var = ex6Var.b;
                        a8q0 a8q0Var = ex6Var.f8562a;
                        String strA = ctf0Var4.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = ww6Var.m;
                        boolean z3 = ww6Var.i;
                        mx6 mx6Var = new mx6(a8q0Var, strA, z2, true, false);
                        double d4 = ww6Var.f39872a;
                        double d5 = ww6Var.d;
                        double d6 = ww6Var.e;
                        if ((d5 > d4 || d4 > d6) && d4 != -1.0d) {
                            d2 = d4;
                            z = z3;
                            str = str3;
                            strT = d2 < d5 ? l8x.T(ctf0Var4, d5, str) : d2 > d6 ? l8x.S(ctf0Var4, d6, str) : "";
                        } else {
                            str = str3;
                            strT = l8x.R(false, d5, str3, d6);
                            z = z3;
                            d2 = d4;
                        }
                        oln0 oln0Var = new oln0(strT, false, false);
                        String str4 = nnb0Var.b;
                        String str5 = nnb0Var.c;
                        if (zBooleanValue) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        xnb0 xnb0Var = new xnb0(str4, str5, nnb0Var.f23813a);
                        boolean z4 = ww6Var.k;
                        double d7 = ww6Var.d;
                        boolean z5 = d2 > d7 && z && !zBooleanValue;
                        boolean z6 = z;
                        String str6 = str;
                        double d8 = ww6Var.e;
                        yv6 yv6Var = new yv6(mx6Var, oln0Var, xnb0Var, new jke(z4, z4, z5, d2 < d8 && z6 && !zBooleanValue), (ww6Var.l || zBooleanValue) ? fx6.c : ((d7 > d2 || d2 > d8) && d2 != -1.0d) ? fx6.b : fx6.f10293a, str6, true);
                        lwo0 lwo0Var = svj0Var.c;
                        boolean z7 = lwo0Var.f20774a;
                        double d9 = lwo0Var.d;
                        String str7 = lwo0Var.c;
                        boolean z8 = lwo0Var.b;
                        if (z8 || zBooleanValue) {
                            zwo0Var = xwo0.f41619a;
                        } else if (d9 == 0.0d) {
                            zwo0Var = null;
                        } else {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            zwo0Var = new zwo0(cy7.e(pn40.p(str6, d9)), d9 > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
                        }
                        String str8 = lwo0Var.e;
                        if (z8 || zBooleanValue) {
                            sn7Var = rn7.f30774a;
                        } else {
                            List<mvo0> list = lwo0Var.f;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (mvo0 mvo0Var : list) {
                                arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                            }
                            sn7Var = new sn7(dyb.r0(arrayList));
                        }
                        return new zvj0(yv6Var, new ixo0(z7, str7, zwo0Var, str8, sn7Var));
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var = (jfc0) feeVar4.c();
                        if (jfc0Var != null) {
                            ctf0 ctf0Var5 = eh00Var.f7787a;
                            boolean zBooleanValue2 = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var.f16419a;
                            zyc0 zyc0Var = new zyc0(azc0Var.f1710a, azc0Var.b, azc0Var.c, azc0Var.d, azc0Var.e, azc0Var.f);
                            if (zBooleanValue2) {
                                vyc0Var = vyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    vyc0Var = vyc0.f38241a;
                                } else if (iOrdinal2 == 1) {
                                    vyc0Var = vyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var.c;
                            double d10 = rlc0Var.f30690a;
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA2 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i2 = cy7.f5159a;
                            pn40 pn40Var3 = pn40.f27267a;
                            String str9 = rlc0Var.c;
                            p3u0 p3u0Var = p3u0.c;
                            tlc0 tlc0Var = new tlc0(dyb.r0(tx3.z(new llc0[]{new llc0(strA2, cy7.e(pn40.d(d10, str9, p3u0Var)), false), new llc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new llc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str9, p3u0Var)), true) : null, rlc0Var.g ? new llc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str9, p3u0Var)), true) : null})), rlc0Var.h);
                            boolean z9 = jfc0Var.d;
                            String strA3 = lsm0Var3.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
                            String strConcat = z9 ? Separators.RETURN.concat(lsm0Var3.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
                            if (strConcat == null) {
                                strConcat = "";
                            }
                            return new z6c0(zyc0Var, vyc0Var, tlc0Var, strA3.concat(strConcat));
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.o = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.dh00
            public final /* synthetic */ eh00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                double d;
                double d2;
                boolean z;
                String str;
                String strT;
                bxo0 zwo0Var;
                tn7 sn7Var;
                vyc0 vyc0Var;
                byte b4 = b;
                eh00 eh00Var = this.b;
                switch (b4) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (((Boolean) feeVar.c()).booleanValue()) {
                            return null;
                        }
                        ctf0 ctf0Var2 = eh00Var.f7787a;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        g9x g9xVar = new g9x(lsm0Var.a(R.string.call_to_auth, Arrays.copyOf(new Object[0], 0)));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        return new yw00(g9xVar, new wul(nulVar, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(iul.e, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true));
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = eh00Var.f7787a;
                        go7 go7Var = (go7) ((fee) eh00Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var, do7.f6402a)) {
                            d = ((svj0) ((fee) eh00Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var, ao7.f1188a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ql5 ql5Var = bn5Var.c;
                        ctf0Var3.getClass();
                        String str2 = ql5Var.f;
                        double d3 = ql5Var.b;
                        g30 g30Var = new g30();
                        pn40 pn40Var = pn40.f27267a;
                        return new ef6(g30Var, new rw7(pn40.c(d3, p3u0.c), str2, (d3 == 0.0d || d > d3) && ql5Var.f28916a != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str3 = ((bn5) ((fee) eh00Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = eh00Var.f7787a;
                        boolean zBooleanValue = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str3.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var = ex6Var.b;
                        a8q0 a8q0Var = ex6Var.f8562a;
                        String strA = ctf0Var4.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = ww6Var.m;
                        boolean z3 = ww6Var.i;
                        mx6 mx6Var = new mx6(a8q0Var, strA, z2, true, false);
                        double d4 = ww6Var.f39872a;
                        double d5 = ww6Var.d;
                        double d6 = ww6Var.e;
                        if ((d5 > d4 || d4 > d6) && d4 != -1.0d) {
                            d2 = d4;
                            z = z3;
                            str = str3;
                            strT = d2 < d5 ? l8x.T(ctf0Var4, d5, str) : d2 > d6 ? l8x.S(ctf0Var4, d6, str) : "";
                        } else {
                            str = str3;
                            strT = l8x.R(false, d5, str3, d6);
                            z = z3;
                            d2 = d4;
                        }
                        oln0 oln0Var = new oln0(strT, false, false);
                        String str4 = nnb0Var.b;
                        String str5 = nnb0Var.c;
                        if (zBooleanValue) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        xnb0 xnb0Var = new xnb0(str4, str5, nnb0Var.f23813a);
                        boolean z4 = ww6Var.k;
                        double d7 = ww6Var.d;
                        boolean z5 = d2 > d7 && z && !zBooleanValue;
                        boolean z6 = z;
                        String str6 = str;
                        double d8 = ww6Var.e;
                        yv6 yv6Var = new yv6(mx6Var, oln0Var, xnb0Var, new jke(z4, z4, z5, d2 < d8 && z6 && !zBooleanValue), (ww6Var.l || zBooleanValue) ? fx6.c : ((d7 > d2 || d2 > d8) && d2 != -1.0d) ? fx6.b : fx6.f10293a, str6, true);
                        lwo0 lwo0Var = svj0Var.c;
                        boolean z7 = lwo0Var.f20774a;
                        double d9 = lwo0Var.d;
                        String str7 = lwo0Var.c;
                        boolean z8 = lwo0Var.b;
                        if (z8 || zBooleanValue) {
                            zwo0Var = xwo0.f41619a;
                        } else if (d9 == 0.0d) {
                            zwo0Var = null;
                        } else {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            zwo0Var = new zwo0(cy7.e(pn40.p(str6, d9)), d9 > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
                        }
                        String str8 = lwo0Var.e;
                        if (z8 || zBooleanValue) {
                            sn7Var = rn7.f30774a;
                        } else {
                            List<mvo0> list = lwo0Var.f;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (mvo0 mvo0Var : list) {
                                arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                            }
                            sn7Var = new sn7(dyb.r0(arrayList));
                        }
                        return new zvj0(yv6Var, new ixo0(z7, str7, zwo0Var, str8, sn7Var));
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var = (jfc0) feeVar4.c();
                        if (jfc0Var != null) {
                            ctf0 ctf0Var5 = eh00Var.f7787a;
                            boolean zBooleanValue2 = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var.f16419a;
                            zyc0 zyc0Var = new zyc0(azc0Var.f1710a, azc0Var.b, azc0Var.c, azc0Var.d, azc0Var.e, azc0Var.f);
                            if (zBooleanValue2) {
                                vyc0Var = vyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    vyc0Var = vyc0.f38241a;
                                } else if (iOrdinal2 == 1) {
                                    vyc0Var = vyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var.c;
                            double d10 = rlc0Var.f30690a;
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA2 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i2 = cy7.f5159a;
                            pn40 pn40Var3 = pn40.f27267a;
                            String str9 = rlc0Var.c;
                            p3u0 p3u0Var = p3u0.c;
                            tlc0 tlc0Var = new tlc0(dyb.r0(tx3.z(new llc0[]{new llc0(strA2, cy7.e(pn40.d(d10, str9, p3u0Var)), false), new llc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new llc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str9, p3u0Var)), true) : null, rlc0Var.g ? new llc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str9, p3u0Var)), true) : null})), rlc0Var.h);
                            boolean z9 = jfc0Var.d;
                            String strA3 = lsm0Var3.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
                            String strConcat = z9 ? Separators.RETURN.concat(lsm0Var3.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
                            if (strConcat == null) {
                                strConcat = "";
                            }
                            return new z6c0(zyc0Var, vyc0Var, tlc0Var, strA3.concat(strConcat));
                        }
                        return null;
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.p = maz.b(new yw9((fee) n0o0VarH5.getValue(), new Function1(this) { // from class: a.dh00
            public final /* synthetic */ eh00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                double d;
                double d2;
                boolean z;
                String str;
                String strT;
                bxo0 zwo0Var;
                tn7 sn7Var;
                vyc0 vyc0Var;
                byte b5 = b4;
                eh00 eh00Var = this.b;
                switch (b5) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (((Boolean) feeVar.c()).booleanValue()) {
                            return null;
                        }
                        ctf0 ctf0Var2 = eh00Var.f7787a;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        g9x g9xVar = new g9x(lsm0Var.a(R.string.call_to_auth, Arrays.copyOf(new Object[0], 0)));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        return new yw00(g9xVar, new wul(nulVar, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(iul.e, oe9Var, new ue9(lsm0Var2.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true));
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = eh00Var.f7787a;
                        go7 go7Var = (go7) ((fee) eh00Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var, do7.f6402a)) {
                            d = ((svj0) ((fee) eh00Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var, ao7.f1188a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ql5 ql5Var = bn5Var.c;
                        ctf0Var3.getClass();
                        String str2 = ql5Var.f;
                        double d3 = ql5Var.b;
                        g30 g30Var = new g30();
                        pn40 pn40Var = pn40.f27267a;
                        return new ef6(g30Var, new rw7(pn40.c(d3, p3u0.c), str2, (d3 == 0.0d || d > d3) && ql5Var.f28916a != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str3 = ((bn5) ((fee) eh00Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = eh00Var.f7787a;
                        boolean zBooleanValue = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str3.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var = ex6Var.b;
                        a8q0 a8q0Var = ex6Var.f8562a;
                        String strA = ctf0Var4.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = ww6Var.m;
                        boolean z3 = ww6Var.i;
                        mx6 mx6Var = new mx6(a8q0Var, strA, z2, true, false);
                        double d4 = ww6Var.f39872a;
                        double d5 = ww6Var.d;
                        double d6 = ww6Var.e;
                        if ((d5 > d4 || d4 > d6) && d4 != -1.0d) {
                            d2 = d4;
                            z = z3;
                            str = str3;
                            strT = d2 < d5 ? l8x.T(ctf0Var4, d5, str) : d2 > d6 ? l8x.S(ctf0Var4, d6, str) : "";
                        } else {
                            str = str3;
                            strT = l8x.R(false, d5, str3, d6);
                            z = z3;
                            d2 = d4;
                        }
                        oln0 oln0Var = new oln0(strT, false, false);
                        String str4 = nnb0Var.b;
                        String str5 = nnb0Var.c;
                        if (zBooleanValue) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        xnb0 xnb0Var = new xnb0(str4, str5, nnb0Var.f23813a);
                        boolean z4 = ww6Var.k;
                        double d7 = ww6Var.d;
                        boolean z5 = d2 > d7 && z && !zBooleanValue;
                        boolean z6 = z;
                        String str6 = str;
                        double d8 = ww6Var.e;
                        yv6 yv6Var = new yv6(mx6Var, oln0Var, xnb0Var, new jke(z4, z4, z5, d2 < d8 && z6 && !zBooleanValue), (ww6Var.l || zBooleanValue) ? fx6.c : ((d7 > d2 || d2 > d8) && d2 != -1.0d) ? fx6.b : fx6.f10293a, str6, true);
                        lwo0 lwo0Var = svj0Var.c;
                        boolean z7 = lwo0Var.f20774a;
                        double d9 = lwo0Var.d;
                        String str7 = lwo0Var.c;
                        boolean z8 = lwo0Var.b;
                        if (z8 || zBooleanValue) {
                            zwo0Var = xwo0.f41619a;
                        } else if (d9 == 0.0d) {
                            zwo0Var = null;
                        } else {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            zwo0Var = new zwo0(cy7.e(pn40.p(str6, d9)), d9 > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
                        }
                        String str8 = lwo0Var.e;
                        if (z8 || zBooleanValue) {
                            sn7Var = rn7.f30774a;
                        } else {
                            List<mvo0> list = lwo0Var.f;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (mvo0 mvo0Var : list) {
                                arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                            }
                            sn7Var = new sn7(dyb.r0(arrayList));
                        }
                        return new zvj0(yv6Var, new ixo0(z7, str7, zwo0Var, str8, sn7Var));
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var = (jfc0) feeVar4.c();
                        if (jfc0Var != null) {
                            ctf0 ctf0Var5 = eh00Var.f7787a;
                            boolean zBooleanValue2 = ((Boolean) ((fee) eh00Var.j.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var.f16419a;
                            zyc0 zyc0Var = new zyc0(azc0Var.f1710a, azc0Var.b, azc0Var.c, azc0Var.d, azc0Var.e, azc0Var.f);
                            if (zBooleanValue2) {
                                vyc0Var = vyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    vyc0Var = vyc0.f38241a;
                                } else if (iOrdinal2 == 1) {
                                    vyc0Var = vyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var.c;
                            double d10 = rlc0Var.f30690a;
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA2 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i2 = cy7.f5159a;
                            pn40 pn40Var3 = pn40.f27267a;
                            String str9 = rlc0Var.c;
                            p3u0 p3u0Var = p3u0.c;
                            tlc0 tlc0Var = new tlc0(dyb.r0(tx3.z(new llc0[]{new llc0(strA2, cy7.e(pn40.d(d10, str9, p3u0Var)), false), new llc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new llc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str9, p3u0Var)), true) : null, rlc0Var.g ? new llc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str9, p3u0Var)), true) : null})), rlc0Var.h);
                            boolean z9 = jfc0Var.d;
                            String strA3 = lsm0Var3.a(R.string.new_bet_promo_info_line, Arrays.copyOf(new Object[0], 0));
                            String strConcat = z9 ? Separators.RETURN.concat(lsm0Var3.a(R.string.bet_promo_balance_description, Arrays.copyOf(new Object[0], 0))) : null;
                            if (strConcat == null) {
                                strConcat = "";
                            }
                            return new z6c0(zyc0Var, vyc0Var, tlc0Var, strA3.concat(strConcat));
                        }
                        return null;
                }
            }
        }, (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        ue9 ue9Var;
        boolean z;
        boolean z2;
        c820 c820Var = (c820) obj;
        c820Var.getClass();
        fee feeVar = (fee) this.c.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        ((my6) feeVar.a().getValue()).getClass();
        pz40VarA.setValue(c820Var.f3892a);
        fee feeVar2 = (fee) this.d.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((bn5) feeVar2.a().getValue()).getClass();
        pz40VarA2.setValue(c820Var.c);
        fee feeVar3 = (fee) this.e.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((go7) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(c820Var.b);
        n0o0 n0o0Var = this.f;
        fee feeVar4 = (fee) n0o0Var.getValue();
        feeVar4.getClass();
        pz40 pz40VarA4 = feeVar4.a();
        ((svj0) feeVar4.a().getValue()).getClass();
        pz40VarA4.setValue(c820Var.d);
        fee feeVar5 = (fee) this.g.getValue();
        feeVar5.getClass();
        pz40 pz40VarA5 = feeVar5.a();
        pz40VarA5.setValue(c820Var.e);
        fee feeVar6 = (fee) this.h.getValue();
        feeVar6.getClass();
        pz40 pz40VarA6 = feeVar6.a();
        ((Boolean) feeVar6.a().getValue()).getClass();
        pz40VarA6.setValue(Boolean.valueOf(c820Var.i));
        fee feeVar7 = (fee) this.i.getValue();
        feeVar7.getClass();
        pz40 pz40VarA7 = feeVar7.a();
        ((Boolean) feeVar7.a().getValue()).getClass();
        pz40VarA7.setValue(Boolean.valueOf(c820Var.g));
        fee feeVar8 = (fee) this.j.getValue();
        feeVar8.getClass();
        pz40 pz40VarA8 = feeVar8.a();
        ((Boolean) feeVar8.a().getValue()).getClass();
        pz40VarA8.setValue(Boolean.valueOf(c820Var.k));
        p820 p820Var = new p820((wy6) ((fee) this.l.getValue()).b());
        uwh0 uwh0Var = (uwh0) ((fee) this.m.getValue()).b();
        ef6 ef6Var = (ef6) ((fee) this.n.getValue()).b();
        zvj0 zvj0Var = (zvj0) ((fee) this.o.getValue()).b();
        z6c0 z6c0Var = (z6c0) ((fee) this.p.getValue()).b();
        yw00 yw00Var = (yw00) ((fee) this.k.getValue()).b();
        iul iulVar = iul.e;
        oe9 oe9Var = oe9.f25112a;
        ue9 ue9Var2 = new ue9(this.f7787a.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
        ww6 ww6Var = ((svj0) ((fee) n0o0Var.getValue()).c()).f32870a.b;
        if (ww6Var.i) {
            double d = ww6Var.f39872a;
            if (d != -1.0d) {
                double d2 = ww6Var.d;
                ue9Var = ue9Var2;
                double d3 = ww6Var.e;
                if (d2 <= d && d <= d3) {
                    z = true;
                }
                return new d820(this.b, new gh00(p820Var, uwh0Var, ef6Var, zvj0Var, z6c0Var, null, yw00Var, 1.0f, null, new qn8(new wul(iulVar, oe9Var, ue9Var, z2, false, true), null), null), null, null, 8);
            }
            ue9Var = ue9Var2;
            z2 = false;
            return new d820(this.b, new gh00(p820Var, uwh0Var, ef6Var, zvj0Var, z6c0Var, null, yw00Var, 1.0f, null, new qn8(new wul(iulVar, oe9Var, ue9Var, z2, false, true), null), null), null, null, 8);
        }
        ue9Var = ue9Var2;
        z = ww6Var.j;
        z2 = z;
        return new d820(this.b, new gh00(p820Var, uwh0Var, ef6Var, zvj0Var, z6c0Var, null, yw00Var, 1.0f, null, new qn8(new wul(iulVar, oe9Var, ue9Var, z2, false, true), null), null), null, null, 8);
    }
}
