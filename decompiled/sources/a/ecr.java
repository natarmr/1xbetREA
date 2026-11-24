package a;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ecr implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7580a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;

    public ecr(a820 a820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        Set set = fcr.f9324a;
        jd5 jd5Var = a820Var.f404a;
        q4f q4fVar = a820Var.j;
        txe txeVar = a820Var.b;
        k00 k00Var = new k00(jd5Var, q4fVar, txeVar.f34694a, txeVar.b);
        final byte b2 = 0;
        this.c = maz.b(new yw9(k00Var, new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b3 = b2;
                ecr ecrVar = this.b;
                switch (b3) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z = true;
                        } else {
                            z = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z2 = df6Var.c;
                        ko7 ko7Var = df6Var.b;
                        boolean z3 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var, ko7Var, z3);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z2) && ql5Var.f28916a != 0 && ctf0Var4.i(), z3));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var.c;
                        String str2 = yvj0Var.b;
                        boolean z4 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z4), w9x.R(pvj0Var.d, str2, ctf0Var5, z4));
                    case 4:
                        y6c0 y6c0Var = (y6c0) obj;
                        y6c0Var.getClass();
                        return kcx.V(y6c0Var.f42092a, ecrVar.b, y6c0Var.b);
                    case 5:
                        ox4 ox4Var = (ox4) obj;
                        ox4Var.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var = ox4Var.f25993a;
                        boolean z5 = ox4Var.c;
                        yyc yycVar = hx4Var.b;
                        po7 po7Var = new po7(hx4Var.f13795a);
                        bx6 bx6Var2 = hx4Var.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z6 = tw6Var.n || z5;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z6 && bigDecimal2.compareTo(bigDecimal) > 0, !z6 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z6) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z6 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var.e, ox4Var.b, ox4Var.c), lvm0.p(hx4Var.d, ox4Var.b, z5));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z7 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z7 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        boolean z = a820Var.q;
        this.d = maz.b(new yw9(new ohp(txeVar, z), new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b3 = b;
                ecr ecrVar = this.b;
                switch (b3) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z2 = true;
                        } else {
                            z2 = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z2, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z3 = df6Var.c;
                        ko7 ko7Var = df6Var.b;
                        boolean z4 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var, ko7Var, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z3) && ql5Var.f28916a != 0 && ctf0Var4.i(), z4));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var.c;
                        String str2 = yvj0Var.b;
                        boolean z5 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z5), w9x.R(pvj0Var.d, str2, ctf0Var5, z5));
                    case 4:
                        y6c0 y6c0Var = (y6c0) obj;
                        y6c0Var.getClass();
                        return kcx.V(y6c0Var.f42092a, ecrVar.b, y6c0Var.b);
                    case 5:
                        ox4 ox4Var = (ox4) obj;
                        ox4Var.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var = ox4Var.f25993a;
                        boolean z6 = ox4Var.c;
                        yyc yycVar = hx4Var.b;
                        po7 po7Var = new po7(hx4Var.f13795a);
                        bx6 bx6Var2 = hx4Var.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z7 = tw6Var.n || z6;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z7 && bigDecimal2.compareTo(bigDecimal) > 0, !z7 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var.e, ox4Var.b, ox4Var.c), lvm0.p(hx4Var.d, ox4Var.b, z6));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z8 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z8 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        ko7 ko7Var = a820Var.c;
        dzc0 dzc0Var = a820Var.f;
        boolean z2 = dzc0Var.f;
        hx4 hx4Var = a820Var.g;
        this.e = maz.b(new yw9(new jwh0(ko7Var, z2, hx4Var.f), new f5p(this, zvh0Var, (byte) 20), (byte) 20));
        final byte b3 = 2;
        this.f = maz.b(new yw9(fcr.f(a820Var), new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z3;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b4 = b3;
                ecr ecrVar = this.b;
                switch (b4) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z3 = true;
                        } else {
                            z3 = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z3, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z4 = df6Var.c;
                        ko7 ko7Var2 = df6Var.b;
                        boolean z5 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var, ko7Var2, z5);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z4) && ql5Var.f28916a != 0 && ctf0Var4.i(), z5));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var.c;
                        String str2 = yvj0Var.b;
                        boolean z6 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z6), w9x.R(pvj0Var.d, str2, ctf0Var5, z6));
                    case 4:
                        y6c0 y6c0Var = (y6c0) obj;
                        y6c0Var.getClass();
                        return kcx.V(y6c0Var.f42092a, ecrVar.b, y6c0Var.b);
                    case 5:
                        ox4 ox4Var = (ox4) obj;
                        ox4Var.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var2 = ox4Var.f25993a;
                        boolean z7 = ox4Var.c;
                        yyc yycVar = hx4Var2.b;
                        po7 po7Var = new po7(hx4Var2.f13795a);
                        bx6 bx6Var2 = hx4Var2.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z8 = tw6Var.n || z7;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z8 && bigDecimal2.compareTo(bigDecimal) > 0, !z8 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z8) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z8 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var2.e, ox4Var.b, ox4Var.c), lvm0.p(hx4Var2.d, ox4Var.b, z7));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z9 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z9 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        pvj0 pvj0Var = a820Var.e;
        xm5 xm5Var = a820Var.d;
        final byte b4 = 3;
        this.g = maz.b(new yw9(new yvj0(pvj0Var, xm5Var.c.f, z), new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z3;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b5 = b4;
                ecr ecrVar = this.b;
                switch (b5) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z3 = true;
                        } else {
                            z3 = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z3, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var2 = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z4 = df6Var.c;
                        ko7 ko7Var2 = df6Var.b;
                        boolean z5 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var2, ko7Var2, z5);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z4) && ql5Var.f28916a != 0 && ctf0Var4.i(), z5));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var2 = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var2.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var2.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var2.c;
                        String str2 = yvj0Var.b;
                        boolean z6 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z6), w9x.R(pvj0Var2.d, str2, ctf0Var5, z6));
                    case 4:
                        y6c0 y6c0Var = (y6c0) obj;
                        y6c0Var.getClass();
                        return kcx.V(y6c0Var.f42092a, ecrVar.b, y6c0Var.b);
                    case 5:
                        ox4 ox4Var = (ox4) obj;
                        ox4Var.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var2 = ox4Var.f25993a;
                        boolean z7 = ox4Var.c;
                        yyc yycVar = hx4Var2.b;
                        po7 po7Var = new po7(hx4Var2.f13795a);
                        bx6 bx6Var2 = hx4Var2.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z8 = tw6Var.n || z7;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z8 && bigDecimal2.compareTo(bigDecimal) > 0, !z8 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z8) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z8 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var2.e, ox4Var.b, ox4Var.c), lvm0.p(hx4Var2.d, ox4Var.b, z7));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z9 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z9 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        y6c0 y6c0Var = new y6c0(dzc0Var, z);
        final byte b5 = 4;
        this.h = maz.b(new yw9(y6c0Var, new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z3;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b6 = b5;
                ecr ecrVar = this.b;
                switch (b6) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z3 = true;
                        } else {
                            z3 = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z3, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var2 = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z4 = df6Var.c;
                        ko7 ko7Var2 = df6Var.b;
                        boolean z5 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var2, ko7Var2, z5);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z4) && ql5Var.f28916a != 0 && ctf0Var4.i(), z5));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var2 = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var2.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var2.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var2.c;
                        String str2 = yvj0Var.b;
                        boolean z6 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z6), w9x.R(pvj0Var2.d, str2, ctf0Var5, z6));
                    case 4:
                        y6c0 y6c0Var2 = (y6c0) obj;
                        y6c0Var2.getClass();
                        return kcx.V(y6c0Var2.f42092a, ecrVar.b, y6c0Var2.b);
                    case 5:
                        ox4 ox4Var = (ox4) obj;
                        ox4Var.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var2 = ox4Var.f25993a;
                        boolean z7 = ox4Var.c;
                        yyc yycVar = hx4Var2.b;
                        po7 po7Var = new po7(hx4Var2.f13795a);
                        bx6 bx6Var2 = hx4Var2.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z8 = tw6Var.n || z7;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z8 && bigDecimal2.compareTo(bigDecimal) > 0, !z8 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z8) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z8 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var2.e, ox4Var.b, ox4Var.c), lvm0.p(hx4Var2.d, ox4Var.b, z7));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z9 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z9 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        ox4 ox4Var = new ox4(hx4Var, xm5Var.c.f, z);
        final byte b6 = 5;
        this.i = maz.b(new yw9(ox4Var, new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z3;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b7 = b6;
                ecr ecrVar = this.b;
                switch (b7) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z3 = true;
                        } else {
                            z3 = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z3, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var2 = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z4 = df6Var.c;
                        ko7 ko7Var2 = df6Var.b;
                        boolean z5 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var2, ko7Var2, z5);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z4) && ql5Var.f28916a != 0 && ctf0Var4.i(), z5));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var2 = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var2.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var2.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var2.c;
                        String str2 = yvj0Var.b;
                        boolean z6 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z6), w9x.R(pvj0Var2.d, str2, ctf0Var5, z6));
                    case 4:
                        y6c0 y6c0Var2 = (y6c0) obj;
                        y6c0Var2.getClass();
                        return kcx.V(y6c0Var2.f42092a, ecrVar.b, y6c0Var2.b);
                    case 5:
                        ox4 ox4Var2 = (ox4) obj;
                        ox4Var2.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var2 = ox4Var2.f25993a;
                        boolean z7 = ox4Var2.c;
                        yyc yycVar = hx4Var2.b;
                        po7 po7Var = new po7(hx4Var2.f13795a);
                        bx6 bx6Var2 = hx4Var2.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z8 = tw6Var.n || z7;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z8 && bigDecimal2.compareTo(bigDecimal) > 0, !z8 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z8) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z8 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var2.e, ox4Var2.b, ox4Var2.c), lvm0.p(hx4Var2.d, ox4Var2.b, z7));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z9 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z9 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        final byte b7 = 6;
        this.j = maz.b(new yw9(fcr.g(a820Var), new Function1(this) { // from class: a.bcr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z3;
                String strA;
                vtn vtnVar;
                lx6 lx6Var;
                byte b8 = b7;
                ecr ecrVar = this.b;
                switch (b8) {
                    case 0:
                        k00 k00Var2 = (k00) obj;
                        k00Var2.getClass();
                        ctf0 ctf0Var2 = ecrVar.b;
                        Set set2 = fcr.f9324a;
                        q4f q4fVar2 = k00Var2.b;
                        int iV = lgb.V(q4fVar2);
                        lsm0 lsm0Var = ctf0Var2.b;
                        lsm0 lsm0Var2 = ctf0Var2.b;
                        String strA2 = lsm0Var.a(iV, Arrays.copyOf(new Object[0], 0));
                        boolean zContains = fcr.f9324a.contains(q4fVar2);
                        long j = k00Var2.c;
                        if (zContains) {
                            strA = lsm0Var2.a(R.string.coupon_make_bet_events_and_blocks_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j), Integer.valueOf(k00Var2.d)}, 2));
                            z3 = true;
                        } else {
                            z3 = true;
                            strA = lsm0Var2.a(R.string.feeds_sport_events_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                        }
                        return new y00(new u00(strA2, z3, strA), "", k00Var2.f17439a.f16314a);
                    case 1:
                        ohp ohpVar = (ohp) obj;
                        ohpVar.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        return new o820(h8x.R(ohpVar.f25275a, ctf0Var3, ohpVar.b));
                    case 2:
                        df6 df6Var = (df6) obj;
                        df6Var.getClass();
                        xm5 xm5Var2 = df6Var.f5983a;
                        ctf0 ctf0Var4 = ecrVar.b;
                        boolean z4 = df6Var.c;
                        ko7 ko7Var2 = df6Var.b;
                        boolean z5 = df6Var.d;
                        ctf0Var4.getClass();
                        ql5 ql5Var = xm5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var3 = ctf0Var4.b;
                            vtnVar = new vtn(lsm0Var3.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarF0 = o2e.f0(xm5Var2, ko7Var2, z5);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarF0, new tw7(pn40.c(d, p3u0.c), str, ctf0Var4.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d == 0.0d || z4) && ql5Var.f28916a != 0 && ctf0Var4.i(), z5));
                    case 3:
                        yvj0 yvj0Var = (yvj0) obj;
                        yvj0Var.getClass();
                        ctf0 ctf0Var5 = ecrVar.b;
                        ctf0Var5.getClass();
                        pvj0 pvj0Var2 = yvj0Var.f43323a;
                        bx6 bx6Var = pvj0Var2.f27665a;
                        aw6 aw6VarJ0 = bsr0.j0(bx6Var.b, new po7(bx6Var.f3362a), ctf0Var5, pvj0Var2.b, yvj0Var.b, yvj0Var.c);
                        iwo0 iwo0Var = pvj0Var2.c;
                        String str2 = yvj0Var.b;
                        boolean z6 = yvj0Var.c;
                        return new bwj0(aw6VarJ0, lvm0.p(iwo0Var, str2, z6), w9x.R(pvj0Var2.d, str2, ctf0Var5, z6));
                    case 4:
                        y6c0 y6c0Var2 = (y6c0) obj;
                        y6c0Var2.getClass();
                        return kcx.V(y6c0Var2.f42092a, ecrVar.b, y6c0Var2.b);
                    case 5:
                        ox4 ox4Var2 = (ox4) obj;
                        ox4Var2.getClass();
                        ctf0 ctf0Var6 = ecrVar.b;
                        ctf0Var6.getClass();
                        hx4 hx4Var2 = ox4Var2.f25993a;
                        boolean z7 = ox4Var2.c;
                        yyc yycVar = hx4Var2.b;
                        po7 po7Var = new po7(hx4Var2.f13795a);
                        bx6 bx6Var2 = hx4Var2.c;
                        tw6 tw6Var = bx6Var2.b;
                        boolean z8 = tw6Var.n || z7;
                        BigDecimal bigDecimal = yycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = yycVar.f43459a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var6.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarX = bsr0.X(yycVar, ctf0Var6);
                        nke nkeVar = new nke(true, true, !z8 && bigDecimal2.compareTo(bigDecimal) > 0, !z8 && bigDecimal2.compareTo(yycVar.e) < 0);
                        if (z8) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z8 || bsr0.T(yycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarX, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), bsr0.j0(tw6Var, new po7(bx6Var2.f3362a), ctf0Var6, hx4Var2.e, ox4Var2.b, ox4Var2.c), lvm0.p(hx4Var2.d, ox4Var2.b, z7));
                    default:
                        fn8 fn8Var = (fn8) obj;
                        fn8Var.getClass();
                        boolean z9 = fn8Var.f9821a;
                        ctf0 ctf0Var7 = ecrVar.b;
                        return z9 ? fcr.e(ctf0Var7, fn8Var.b) : fcr.c(ctf0Var7);
                }
            }
        }, (byte) 20));
        this.k = maz.b(new yip(this, (byte) 16));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f7580a;
        n0o0 n0o0Var = this.j;
        n0o0 n0o0Var2 = this.i;
        n0o0 n0o0Var3 = this.h;
        n0o0 n0o0Var4 = this.g;
        n0o0 n0o0Var5 = this.f;
        n0o0 n0o0Var6 = this.k;
        n0o0 n0o0Var7 = this.e;
        n0o0 n0o0Var8 = this.d;
        n0o0 n0o0Var9 = this.c;
        switch (b) {
            case 0:
                b820 b820Var = (b820) obj;
                b820Var.getClass();
                an5 an5Var = b820Var.c;
                gx4 gx4Var = b820Var.f;
                boolean z = b820Var.l;
                ((fee) n0o0Var9.getValue()).d(b820Var.f2138a);
                fee feeVar = (fee) n0o0Var5.getValue();
                fo7 fo7Var = b820Var.b;
                czc0 czc0Var = b820Var.e;
                feeVar.d(new gwh0(fo7Var, czc0Var != null, gx4Var != null));
                ((fee) n0o0Var4.getValue()).d(jcb.e0(b820Var));
                ((fee) n0o0Var3.getValue()).d(new vvj0(b820Var.d, an5Var.c.f, z));
                ((fee) n0o0Var2.getValue()).d(new v6c0(czc0Var, z));
                ((fee) n0o0Var.getValue()).d(new lx4(gx4Var, an5Var.c.f, z));
                ((fee) n0o0Var6.getValue()).d(jcb.f0(b820Var));
                return new d820(ug20.c, null, null, new zbr((y00) ((fee) n0o0Var8.getValue()).b(), (u820) ((fee) n0o0Var7.getValue()).b(), (wwh0) ((fee) n0o0Var5.getValue()).b(), (gf6) ((fee) n0o0Var4.getValue()).b(), (bwj0) ((fee) n0o0Var3.getValue()).b(), (b7c0) ((fee) n0o0Var2.getValue()).b(), (rx4) ((fee) n0o0Var.getValue()).b(), (mtl) ((fee) n0o0Var6.getValue()).b(), b820Var.h));
            case 1:
                a820 a820Var = (a820) obj;
                a820Var.getClass();
                fee feeVar2 = (fee) n0o0Var9.getValue();
                Set set = fcr.f9324a;
                jd5 jd5Var = a820Var.f404a;
                q4f q4fVar = a820Var.j;
                txe txeVar = a820Var.b;
                feeVar2.d(new k00(jd5Var, q4fVar, txeVar.f34694a, txeVar.b));
                fee feeVar3 = (fee) n0o0Var8.getValue();
                boolean z2 = a820Var.q;
                feeVar3.d(new ohp(txeVar, z2));
                fee feeVar4 = (fee) n0o0Var7.getValue();
                ko7 ko7Var = a820Var.c;
                dzc0 dzc0Var = a820Var.f;
                boolean z3 = dzc0Var.f;
                hx4 hx4Var = a820Var.g;
                feeVar4.d(new jwh0(ko7Var, z3, hx4Var.f));
                ((fee) n0o0Var5.getValue()).d(fcr.f(a820Var));
                fee feeVar5 = (fee) n0o0Var4.getValue();
                pvj0 pvj0Var = a820Var.e;
                xm5 xm5Var = a820Var.d;
                feeVar5.d(new yvj0(pvj0Var, xm5Var.c.f, z2));
                ((fee) n0o0Var3.getValue()).d(new y6c0(dzc0Var, z2));
                ((fee) n0o0Var2.getValue()).d(new ox4(hx4Var, xm5Var.c.f, z2));
                ((fee) n0o0Var.getValue()).d(fcr.g(a820Var));
                return new d820(ug20.c, null, null, new zbr((y00) ((fee) n0o0Var9.getValue()).b(), (u820) ((fee) n0o0Var8.getValue()).b(), (wwh0) ((fee) n0o0Var7.getValue()).b(), (gf6) ((fee) n0o0Var5.getValue()).b(), (bwj0) ((fee) n0o0Var4.getValue()).b(), (b7c0) ((fee) n0o0Var3.getValue()).b(), (rx4) ((fee) n0o0Var2.getValue()).b(), (mtl) ((fee) n0o0Var.getValue()).b(), a820Var.i, a820Var.k, (wul) n0o0Var6.getValue()));
            default:
                cdk0 cdk0Var = (cdk0) obj;
                cdk0Var.getClass();
                fee feeVar6 = (fee) n0o0Var9.getValue();
                feeVar6.getClass();
                pz40 pz40VarA = feeVar6.a();
                ((String) feeVar6.a().getValue()).getClass();
                pz40VarA.setValue(cdk0Var.f4165a);
                fee feeVar7 = (fee) n0o0Var8.getValue();
                feeVar7.getClass();
                pz40 pz40VarA2 = feeVar7.a();
                ((String) feeVar7.a().getValue()).getClass();
                pz40VarA2.setValue(cdk0Var.c);
                fee feeVar8 = (fee) n0o0Var7.getValue();
                feeVar8.getClass();
                pz40 pz40VarA3 = feeVar8.a();
                ((String) feeVar8.a().getValue()).getClass();
                pz40VarA3.setValue(cdk0Var.b);
                fee feeVar9 = (fee) n0o0Var6.getValue();
                feeVar9.getClass();
                pz40 pz40VarA4 = feeVar9.a();
                ((String) feeVar9.a().getValue()).getClass();
                pz40VarA4.setValue(cdk0Var.d);
                fee feeVar10 = (fee) n0o0Var5.getValue();
                feeVar10.getClass();
                pz40 pz40VarA5 = feeVar10.a();
                ((Boolean) feeVar10.a().getValue()).getClass();
                pz40VarA5.setValue(Boolean.valueOf(cdk0Var.m));
                fee feeVar11 = (fee) n0o0Var4.getValue();
                feeVar11.getClass();
                pz40 pz40VarA6 = feeVar11.a();
                ((Boolean) feeVar11.a().getValue()).getClass();
                pz40VarA6.setValue(Boolean.valueOf(cdk0Var.l));
                fee feeVar12 = (fee) n0o0Var3.getValue();
                feeVar12.getClass();
                pz40 pz40VarA7 = feeVar12.a();
                ((xck0) feeVar12.a().getValue()).getClass();
                xck0 xck0Var = cdk0Var.n;
                pz40VarA7.setValue(xck0Var);
                fee feeVar13 = (fee) n0o0Var2.getValue();
                feeVar13.getClass();
                pz40 pz40VarA8 = feeVar13.a();
                ((Boolean) feeVar13.a().getValue()).getClass();
                pz40VarA8.setValue(Boolean.valueOf(cdk0Var.o));
                fee feeVar14 = (fee) n0o0Var.getValue();
                feeVar14.getClass();
                pz40 pz40VarA9 = feeVar14.a();
                ((xck0) feeVar14.a().getValue()).getClass();
                pz40VarA9.setValue(xck0Var);
                String str = (String) ((fee) n0o0Var9.getValue()).c();
                Object objC = ((fee) n0o0Var6.getValue()).c();
                if (((String) objC).length() <= 0) {
                    objC = null;
                }
                String str2 = (String) objC;
                g7n g7nVar = new g7n(new c6q0((String) ((fee) n0o0Var8.getValue()).c(), e6q0.f7299a, o6q0.f24750a, str2 != null ? new s7q0(str2) : r7q0.f29989a, true, str2 != null, new y5q0(3, null, null, 6), (String) ((fee) n0o0Var7.getValue()).c(), "", false, 0, null, 260352));
                boolean zBooleanValue = ((Boolean) ((fee) n0o0Var5.getValue()).c()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue();
                boolean z4 = ((fee) n0o0Var3.getValue()).c() instanceof vck0;
                String str3 = (String) ((fee) n0o0Var.getValue()).b();
                boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue();
                lul lulVar = lul.e;
                oe9 oe9Var = oe9.f25112a;
                ctf0 ctf0Var = this.b;
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                return new ddk0(str, g7nVar, zBooleanValue, zBooleanValue2, z4, str3, zBooleanValue3, new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), ((Boolean) ((fee) n0o0Var5.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue(), false), new wul(nul.e, oe9Var, new ue9(lsm0Var2.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, false), new wul(qul.e, oe9Var, new ue9(lsm0Var2.a(R.string.sms_code_resend_title, Arrays.copyOf(new Object[0], 0))), true, false, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ecr(b820 b820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        an5 an5Var = b820Var.c;
        gx4 gx4Var = b820Var.f;
        boolean z = b820Var.l;
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(b820Var.f2138a);
        this.c = n0o0VarH;
        this.d = bkb.G(((fee) n0o0VarH.getValue()).d, new rnp((byte) 28));
        pz40 pz40Var = ((fee) n0o0VarH.getValue()).d;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.e = bkb.G(pz40Var, new Function1(this) { // from class: a.ccr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vtn vtnVar;
                lx6 lx6Var;
                byte b = objArr;
                boolean z2 = false;
                ecr ecrVar = this.b;
                switch (b) {
                    case 0:
                        ly6 ly6Var = (ly6) obj;
                        ly6Var.getClass();
                        return g8x.X(ly6Var, ecrVar.b);
                    case 1:
                        af6 af6Var = (af6) obj;
                        af6Var.getClass();
                        an5 an5Var2 = af6Var.f763a;
                        ctf0 ctf0Var2 = ecrVar.b;
                        boolean z3 = af6Var.c;
                        fo7 fo7Var = af6Var.b;
                        boolean z4 = af6Var.d;
                        ctf0Var2.getClass();
                        ql5 ql5Var = an5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarT = y9a.T(an5Var2, str, fo7Var, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarT, new tw7(pn40.c(d, p3u0.c), str, ctf0Var2.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), z3 && ctf0Var2.i(), an5Var2.e));
                    case 2:
                        vvj0 vvj0Var = (vvj0) obj;
                        vvj0Var.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        rvj0 rvj0Var = vvj0Var.f38103a;
                        dx6 dx6Var = rvj0Var.f31171a;
                        aw6 aw6VarJ0 = ohq0.j0(dx6Var.b, new po7(dx6Var.f6832a), ctf0Var3, rvj0Var.b, vvj0Var.b, vvj0Var.c);
                        kwo0 kwo0Var = rvj0Var.c;
                        String str2 = vvj0Var.b;
                        boolean z5 = vvj0Var.c;
                        return new bwj0(aw6VarJ0, ltt0.t(kwo0Var, str2, z5), k9x.U(rvj0Var.d, ctf0Var3, z5));
                    case 3:
                        v6c0 v6c0Var = (v6c0) obj;
                        v6c0Var.getClass();
                        czc0 czc0Var = v6c0Var.f36871a;
                        if (czc0Var != null) {
                            return t9x.R(czc0Var, ecrVar.b, v6c0Var.b);
                        }
                        return null;
                    case 4:
                        lx4 lx4Var = (lx4) obj;
                        lx4Var.getClass();
                        ctf0 ctf0Var4 = ecrVar.b;
                        ctf0Var4.getClass();
                        gx4 gx4Var2 = lx4Var.f20797a;
                        boolean z6 = lx4Var.c;
                        if (gx4Var2 == null) {
                            return null;
                        }
                        dx6 dx6Var2 = gx4Var2.c;
                        vw6 vw6Var = dx6Var2.b;
                        xyc xycVar = gx4Var2.b;
                        po7 po7Var = new po7(gx4Var2.f12059a);
                        boolean z7 = vw6Var.n || z6;
                        BigDecimal bigDecimal = xycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var4.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarW = ohq0.W(xycVar, ctf0Var4);
                        boolean z8 = !z7 && bigDecimal2.compareTo(bigDecimal) > 0;
                        if (!z7 && bigDecimal2.compareTo(xycVar.e) < 0) {
                            z2 = true;
                        }
                        nke nkeVar = new nke(true, true, z8, z2);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || ohq0.V(xycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarW, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), ohq0.j0(vw6Var, new po7(dx6Var2.f6832a), ctf0Var4, gx4Var2.e, lx4Var.b, lx4Var.c), ltt0.t(gx4Var2.d, lx4Var.b, z6));
                    default:
                        en8 en8Var = (en8) obj;
                        en8Var.getClass();
                        boolean z9 = en8Var.f8080a;
                        ctf0 ctf0Var5 = ecrVar.b;
                        return z9 ? jcb.c0(ctf0Var5, en8Var.b) : jcb.Z(ctf0Var5);
                }
            }
        });
        fo7 fo7Var = b820Var.b;
        czc0 czc0Var = b820Var.e;
        final byte b = 1;
        this.f = maz.b(new yw9(new gwh0(fo7Var, czc0Var != null, gx4Var != null), new f5p(this, zvh0Var, (byte) 19), (byte) 20));
        this.g = maz.b(new yw9(jcb.e0(b820Var), new Function1(this) { // from class: a.ccr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vtn vtnVar;
                lx6 lx6Var;
                byte b2 = b;
                boolean z2 = false;
                ecr ecrVar = this.b;
                switch (b2) {
                    case 0:
                        ly6 ly6Var = (ly6) obj;
                        ly6Var.getClass();
                        return g8x.X(ly6Var, ecrVar.b);
                    case 1:
                        af6 af6Var = (af6) obj;
                        af6Var.getClass();
                        an5 an5Var2 = af6Var.f763a;
                        ctf0 ctf0Var2 = ecrVar.b;
                        boolean z3 = af6Var.c;
                        fo7 fo7Var2 = af6Var.b;
                        boolean z4 = af6Var.d;
                        ctf0Var2.getClass();
                        ql5 ql5Var = an5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarT = y9a.T(an5Var2, str, fo7Var2, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarT, new tw7(pn40.c(d, p3u0.c), str, ctf0Var2.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), z3 && ctf0Var2.i(), an5Var2.e));
                    case 2:
                        vvj0 vvj0Var = (vvj0) obj;
                        vvj0Var.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        rvj0 rvj0Var = vvj0Var.f38103a;
                        dx6 dx6Var = rvj0Var.f31171a;
                        aw6 aw6VarJ0 = ohq0.j0(dx6Var.b, new po7(dx6Var.f6832a), ctf0Var3, rvj0Var.b, vvj0Var.b, vvj0Var.c);
                        kwo0 kwo0Var = rvj0Var.c;
                        String str2 = vvj0Var.b;
                        boolean z5 = vvj0Var.c;
                        return new bwj0(aw6VarJ0, ltt0.t(kwo0Var, str2, z5), k9x.U(rvj0Var.d, ctf0Var3, z5));
                    case 3:
                        v6c0 v6c0Var = (v6c0) obj;
                        v6c0Var.getClass();
                        czc0 czc0Var2 = v6c0Var.f36871a;
                        if (czc0Var2 != null) {
                            return t9x.R(czc0Var2, ecrVar.b, v6c0Var.b);
                        }
                        return null;
                    case 4:
                        lx4 lx4Var = (lx4) obj;
                        lx4Var.getClass();
                        ctf0 ctf0Var4 = ecrVar.b;
                        ctf0Var4.getClass();
                        gx4 gx4Var2 = lx4Var.f20797a;
                        boolean z6 = lx4Var.c;
                        if (gx4Var2 == null) {
                            return null;
                        }
                        dx6 dx6Var2 = gx4Var2.c;
                        vw6 vw6Var = dx6Var2.b;
                        xyc xycVar = gx4Var2.b;
                        po7 po7Var = new po7(gx4Var2.f12059a);
                        boolean z7 = vw6Var.n || z6;
                        BigDecimal bigDecimal = xycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var4.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarW = ohq0.W(xycVar, ctf0Var4);
                        boolean z8 = !z7 && bigDecimal2.compareTo(bigDecimal) > 0;
                        if (!z7 && bigDecimal2.compareTo(xycVar.e) < 0) {
                            z2 = true;
                        }
                        nke nkeVar = new nke(true, true, z8, z2);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || ohq0.V(xycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarW, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), ohq0.j0(vw6Var, new po7(dx6Var2.f6832a), ctf0Var4, gx4Var2.e, lx4Var.b, lx4Var.c), ltt0.t(gx4Var2.d, lx4Var.b, z6));
                    default:
                        en8 en8Var = (en8) obj;
                        en8Var.getClass();
                        boolean z9 = en8Var.f8080a;
                        ctf0 ctf0Var5 = ecrVar.b;
                        return z9 ? jcb.c0(ctf0Var5, en8Var.b) : jcb.Z(ctf0Var5);
                }
            }
        }, (byte) 20));
        final byte b2 = 2;
        this.h = maz.b(new yw9(new vvj0(b820Var.d, an5Var.c.f, z), new Function1(this) { // from class: a.ccr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vtn vtnVar;
                lx6 lx6Var;
                byte b3 = b2;
                boolean z2 = false;
                ecr ecrVar = this.b;
                switch (b3) {
                    case 0:
                        ly6 ly6Var = (ly6) obj;
                        ly6Var.getClass();
                        return g8x.X(ly6Var, ecrVar.b);
                    case 1:
                        af6 af6Var = (af6) obj;
                        af6Var.getClass();
                        an5 an5Var2 = af6Var.f763a;
                        ctf0 ctf0Var2 = ecrVar.b;
                        boolean z3 = af6Var.c;
                        fo7 fo7Var2 = af6Var.b;
                        boolean z4 = af6Var.d;
                        ctf0Var2.getClass();
                        ql5 ql5Var = an5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarT = y9a.T(an5Var2, str, fo7Var2, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarT, new tw7(pn40.c(d, p3u0.c), str, ctf0Var2.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), z3 && ctf0Var2.i(), an5Var2.e));
                    case 2:
                        vvj0 vvj0Var = (vvj0) obj;
                        vvj0Var.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        rvj0 rvj0Var = vvj0Var.f38103a;
                        dx6 dx6Var = rvj0Var.f31171a;
                        aw6 aw6VarJ0 = ohq0.j0(dx6Var.b, new po7(dx6Var.f6832a), ctf0Var3, rvj0Var.b, vvj0Var.b, vvj0Var.c);
                        kwo0 kwo0Var = rvj0Var.c;
                        String str2 = vvj0Var.b;
                        boolean z5 = vvj0Var.c;
                        return new bwj0(aw6VarJ0, ltt0.t(kwo0Var, str2, z5), k9x.U(rvj0Var.d, ctf0Var3, z5));
                    case 3:
                        v6c0 v6c0Var = (v6c0) obj;
                        v6c0Var.getClass();
                        czc0 czc0Var2 = v6c0Var.f36871a;
                        if (czc0Var2 != null) {
                            return t9x.R(czc0Var2, ecrVar.b, v6c0Var.b);
                        }
                        return null;
                    case 4:
                        lx4 lx4Var = (lx4) obj;
                        lx4Var.getClass();
                        ctf0 ctf0Var4 = ecrVar.b;
                        ctf0Var4.getClass();
                        gx4 gx4Var2 = lx4Var.f20797a;
                        boolean z6 = lx4Var.c;
                        if (gx4Var2 == null) {
                            return null;
                        }
                        dx6 dx6Var2 = gx4Var2.c;
                        vw6 vw6Var = dx6Var2.b;
                        xyc xycVar = gx4Var2.b;
                        po7 po7Var = new po7(gx4Var2.f12059a);
                        boolean z7 = vw6Var.n || z6;
                        BigDecimal bigDecimal = xycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var4.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarW = ohq0.W(xycVar, ctf0Var4);
                        boolean z8 = !z7 && bigDecimal2.compareTo(bigDecimal) > 0;
                        if (!z7 && bigDecimal2.compareTo(xycVar.e) < 0) {
                            z2 = true;
                        }
                        nke nkeVar = new nke(true, true, z8, z2);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || ohq0.V(xycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarW, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), ohq0.j0(vw6Var, new po7(dx6Var2.f6832a), ctf0Var4, gx4Var2.e, lx4Var.b, lx4Var.c), ltt0.t(gx4Var2.d, lx4Var.b, z6));
                    default:
                        en8 en8Var = (en8) obj;
                        en8Var.getClass();
                        boolean z9 = en8Var.f8080a;
                        ctf0 ctf0Var5 = ecrVar.b;
                        return z9 ? jcb.c0(ctf0Var5, en8Var.b) : jcb.Z(ctf0Var5);
                }
            }
        }, (byte) 20));
        final byte b3 = 3;
        this.i = maz.b(new yw9(new v6c0(czc0Var, z), new Function1(this) { // from class: a.ccr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vtn vtnVar;
                lx6 lx6Var;
                byte b4 = b3;
                boolean z2 = false;
                ecr ecrVar = this.b;
                switch (b4) {
                    case 0:
                        ly6 ly6Var = (ly6) obj;
                        ly6Var.getClass();
                        return g8x.X(ly6Var, ecrVar.b);
                    case 1:
                        af6 af6Var = (af6) obj;
                        af6Var.getClass();
                        an5 an5Var2 = af6Var.f763a;
                        ctf0 ctf0Var2 = ecrVar.b;
                        boolean z3 = af6Var.c;
                        fo7 fo7Var2 = af6Var.b;
                        boolean z4 = af6Var.d;
                        ctf0Var2.getClass();
                        ql5 ql5Var = an5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarT = y9a.T(an5Var2, str, fo7Var2, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarT, new tw7(pn40.c(d, p3u0.c), str, ctf0Var2.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), z3 && ctf0Var2.i(), an5Var2.e));
                    case 2:
                        vvj0 vvj0Var = (vvj0) obj;
                        vvj0Var.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        rvj0 rvj0Var = vvj0Var.f38103a;
                        dx6 dx6Var = rvj0Var.f31171a;
                        aw6 aw6VarJ0 = ohq0.j0(dx6Var.b, new po7(dx6Var.f6832a), ctf0Var3, rvj0Var.b, vvj0Var.b, vvj0Var.c);
                        kwo0 kwo0Var = rvj0Var.c;
                        String str2 = vvj0Var.b;
                        boolean z5 = vvj0Var.c;
                        return new bwj0(aw6VarJ0, ltt0.t(kwo0Var, str2, z5), k9x.U(rvj0Var.d, ctf0Var3, z5));
                    case 3:
                        v6c0 v6c0Var = (v6c0) obj;
                        v6c0Var.getClass();
                        czc0 czc0Var2 = v6c0Var.f36871a;
                        if (czc0Var2 != null) {
                            return t9x.R(czc0Var2, ecrVar.b, v6c0Var.b);
                        }
                        return null;
                    case 4:
                        lx4 lx4Var = (lx4) obj;
                        lx4Var.getClass();
                        ctf0 ctf0Var4 = ecrVar.b;
                        ctf0Var4.getClass();
                        gx4 gx4Var2 = lx4Var.f20797a;
                        boolean z6 = lx4Var.c;
                        if (gx4Var2 == null) {
                            return null;
                        }
                        dx6 dx6Var2 = gx4Var2.c;
                        vw6 vw6Var = dx6Var2.b;
                        xyc xycVar = gx4Var2.b;
                        po7 po7Var = new po7(gx4Var2.f12059a);
                        boolean z7 = vw6Var.n || z6;
                        BigDecimal bigDecimal = xycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var4.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarW = ohq0.W(xycVar, ctf0Var4);
                        boolean z8 = !z7 && bigDecimal2.compareTo(bigDecimal) > 0;
                        if (!z7 && bigDecimal2.compareTo(xycVar.e) < 0) {
                            z2 = true;
                        }
                        nke nkeVar = new nke(true, true, z8, z2);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || ohq0.V(xycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarW, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), ohq0.j0(vw6Var, new po7(dx6Var2.f6832a), ctf0Var4, gx4Var2.e, lx4Var.b, lx4Var.c), ltt0.t(gx4Var2.d, lx4Var.b, z6));
                    default:
                        en8 en8Var = (en8) obj;
                        en8Var.getClass();
                        boolean z9 = en8Var.f8080a;
                        ctf0 ctf0Var5 = ecrVar.b;
                        return z9 ? jcb.c0(ctf0Var5, en8Var.b) : jcb.Z(ctf0Var5);
                }
            }
        }, (byte) 20));
        final byte b4 = 4;
        this.j = maz.b(new yw9(new lx4(gx4Var, an5Var.c.f, z), new Function1(this) { // from class: a.ccr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vtn vtnVar;
                lx6 lx6Var;
                byte b5 = b4;
                boolean z2 = false;
                ecr ecrVar = this.b;
                switch (b5) {
                    case 0:
                        ly6 ly6Var = (ly6) obj;
                        ly6Var.getClass();
                        return g8x.X(ly6Var, ecrVar.b);
                    case 1:
                        af6 af6Var = (af6) obj;
                        af6Var.getClass();
                        an5 an5Var2 = af6Var.f763a;
                        ctf0 ctf0Var2 = ecrVar.b;
                        boolean z3 = af6Var.c;
                        fo7 fo7Var2 = af6Var.b;
                        boolean z4 = af6Var.d;
                        ctf0Var2.getClass();
                        ql5 ql5Var = an5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarT = y9a.T(an5Var2, str, fo7Var2, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarT, new tw7(pn40.c(d, p3u0.c), str, ctf0Var2.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), z3 && ctf0Var2.i(), an5Var2.e));
                    case 2:
                        vvj0 vvj0Var = (vvj0) obj;
                        vvj0Var.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        rvj0 rvj0Var = vvj0Var.f38103a;
                        dx6 dx6Var = rvj0Var.f31171a;
                        aw6 aw6VarJ0 = ohq0.j0(dx6Var.b, new po7(dx6Var.f6832a), ctf0Var3, rvj0Var.b, vvj0Var.b, vvj0Var.c);
                        kwo0 kwo0Var = rvj0Var.c;
                        String str2 = vvj0Var.b;
                        boolean z5 = vvj0Var.c;
                        return new bwj0(aw6VarJ0, ltt0.t(kwo0Var, str2, z5), k9x.U(rvj0Var.d, ctf0Var3, z5));
                    case 3:
                        v6c0 v6c0Var = (v6c0) obj;
                        v6c0Var.getClass();
                        czc0 czc0Var2 = v6c0Var.f36871a;
                        if (czc0Var2 != null) {
                            return t9x.R(czc0Var2, ecrVar.b, v6c0Var.b);
                        }
                        return null;
                    case 4:
                        lx4 lx4Var = (lx4) obj;
                        lx4Var.getClass();
                        ctf0 ctf0Var4 = ecrVar.b;
                        ctf0Var4.getClass();
                        gx4 gx4Var2 = lx4Var.f20797a;
                        boolean z6 = lx4Var.c;
                        if (gx4Var2 == null) {
                            return null;
                        }
                        dx6 dx6Var2 = gx4Var2.c;
                        vw6 vw6Var = dx6Var2.b;
                        xyc xycVar = gx4Var2.b;
                        po7 po7Var = new po7(gx4Var2.f12059a);
                        boolean z7 = vw6Var.n || z6;
                        BigDecimal bigDecimal = xycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var4.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarW = ohq0.W(xycVar, ctf0Var4);
                        boolean z8 = !z7 && bigDecimal2.compareTo(bigDecimal) > 0;
                        if (!z7 && bigDecimal2.compareTo(xycVar.e) < 0) {
                            z2 = true;
                        }
                        nke nkeVar = new nke(true, true, z8, z2);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || ohq0.V(xycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarW, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), ohq0.j0(vw6Var, new po7(dx6Var2.f6832a), ctf0Var4, gx4Var2.e, lx4Var.b, lx4Var.c), ltt0.t(gx4Var2.d, lx4Var.b, z6));
                    default:
                        en8 en8Var = (en8) obj;
                        en8Var.getClass();
                        boolean z9 = en8Var.f8080a;
                        ctf0 ctf0Var5 = ecrVar.b;
                        return z9 ? jcb.c0(ctf0Var5, en8Var.b) : jcb.Z(ctf0Var5);
                }
            }
        }, (byte) 20));
        final byte b5 = 5;
        this.k = maz.b(new yw9(jcb.f0(b820Var), new Function1(this) { // from class: a.ccr
            public final /* synthetic */ ecr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vtn vtnVar;
                lx6 lx6Var;
                byte b6 = b5;
                boolean z2 = false;
                ecr ecrVar = this.b;
                switch (b6) {
                    case 0:
                        ly6 ly6Var = (ly6) obj;
                        ly6Var.getClass();
                        return g8x.X(ly6Var, ecrVar.b);
                    case 1:
                        af6 af6Var = (af6) obj;
                        af6Var.getClass();
                        an5 an5Var2 = af6Var.f763a;
                        ctf0 ctf0Var2 = ecrVar.b;
                        boolean z3 = af6Var.c;
                        fo7 fo7Var2 = af6Var.b;
                        boolean z4 = af6Var.d;
                        ctf0Var2.getClass();
                        ql5 ql5Var = an5Var2.c;
                        String str = ql5Var.f;
                        double d = ql5Var.b;
                        if (d == 0.0d) {
                            lsm0 lsm0Var = ctf0Var2.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            vtnVar = null;
                        }
                        x30 x30VarT = y9a.T(an5Var2, str, fo7Var2, z4);
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, x30VarT, new tw7(pn40.c(d, p3u0.c), str, ctf0Var2.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), z3 && ctf0Var2.i(), an5Var2.e));
                    case 2:
                        vvj0 vvj0Var = (vvj0) obj;
                        vvj0Var.getClass();
                        ctf0 ctf0Var3 = ecrVar.b;
                        ctf0Var3.getClass();
                        rvj0 rvj0Var = vvj0Var.f38103a;
                        dx6 dx6Var = rvj0Var.f31171a;
                        aw6 aw6VarJ0 = ohq0.j0(dx6Var.b, new po7(dx6Var.f6832a), ctf0Var3, rvj0Var.b, vvj0Var.b, vvj0Var.c);
                        kwo0 kwo0Var = rvj0Var.c;
                        String str2 = vvj0Var.b;
                        boolean z5 = vvj0Var.c;
                        return new bwj0(aw6VarJ0, ltt0.t(kwo0Var, str2, z5), k9x.U(rvj0Var.d, ctf0Var3, z5));
                    case 3:
                        v6c0 v6c0Var = (v6c0) obj;
                        v6c0Var.getClass();
                        czc0 czc0Var2 = v6c0Var.f36871a;
                        if (czc0Var2 != null) {
                            return t9x.R(czc0Var2, ecrVar.b, v6c0Var.b);
                        }
                        return null;
                    case 4:
                        lx4 lx4Var = (lx4) obj;
                        lx4Var.getClass();
                        ctf0 ctf0Var4 = ecrVar.b;
                        ctf0Var4.getClass();
                        gx4 gx4Var2 = lx4Var.f20797a;
                        boolean z6 = lx4Var.c;
                        if (gx4Var2 == null) {
                            return null;
                        }
                        dx6 dx6Var2 = gx4Var2.c;
                        vw6 vw6Var = dx6Var2.b;
                        xyc xycVar = gx4Var2.b;
                        po7 po7Var = new po7(gx4Var2.f12059a);
                        boolean z7 = vw6Var.n || z6;
                        BigDecimal bigDecimal = xycVar.d;
                        pn40 pn40Var2 = pn40.f27267a;
                        BigDecimal bigDecimal2 = xycVar.f41701a;
                        sx6 sx6Var = new sx6(po7Var, ctf0Var4.b.a(R.string.bet_enter_coefficient_v2, Arrays.copyOf(new Object[]{pn40.c(bigDecimal.doubleValue(), p3u0.c)}, 1)), false, false, false);
                        rln0 rln0VarW = ohq0.W(xycVar, ctf0Var4);
                        boolean z8 = !z7 && bigDecimal2.compareTo(bigDecimal) > 0;
                        if (!z7 && bigDecimal2.compareTo(xycVar.e) < 0) {
                            z2 = true;
                        }
                        nke nkeVar = new nke(true, true, z8, z2);
                        if (z7) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = (z7 || ohq0.V(xycVar)) ? lx6.b : lx6.f20799a;
                        }
                        return new rx4(new aw6(sx6Var, rln0VarW, nkeVar, lx6Var, new prm(0.0f, new jrm(new g8k0(6, "", null), new g8k0(6, "", null)), null, null, false, 118), ""), ohq0.j0(vw6Var, new po7(dx6Var2.f6832a), ctf0Var4, gx4Var2.e, lx4Var.b, lx4Var.c), ltt0.t(gx4Var2.d, lx4Var.b, z6));
                    default:
                        en8 en8Var = (en8) obj;
                        en8Var.getClass();
                        boolean z9 = en8Var.f8080a;
                        ctf0 ctf0Var5 = ecrVar.b;
                        return z9 ? jcb.c0(ctf0Var5, en8Var.b) : jcb.Z(ctf0Var5);
                }
            }
        }, (byte) 20));
    }

    public ecr(ctf0 ctf0Var, cdk0 cdk0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(cdk0Var.f4165a);
        this.d = bkb.H(cdk0Var.c);
        this.e = bkb.H(cdk0Var.b);
        this.f = bkb.H(Boolean.valueOf(cdk0Var.m));
        this.g = bkb.H(Boolean.valueOf(cdk0Var.l));
        xck0 xck0Var = cdk0Var.n;
        this.h = bkb.H(xck0Var);
        this.i = bkb.H(Boolean.valueOf(cdk0Var.o));
        this.j = maz.b(new yw9(xck0Var, new rai0(this, (byte) 20), (byte) 20));
        this.k = bkb.H(cdk0Var.d);
    }
}
