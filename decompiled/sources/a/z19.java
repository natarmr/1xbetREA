package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class z19 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43607a = 2;
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
    public final n0o0 l;
    public final n0o0 m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Serializable q;

    public z19(c820 c820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        int iOrdinal = c820Var.l.ordinal();
        final byte b2 = 3;
        final byte b3 = 1;
        this.q = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? ug20.b : ug20.c : ug20.f35603a : ug20.b;
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
        n0o0 n0o0VarH6 = bkb.H(Boolean.valueOf(c820Var.g));
        this.h = n0o0VarH6;
        this.i = bkb.H(Boolean.valueOf(c820Var.k));
        final byte b4 = 0;
        byte b5 = 20;
        this.j = maz.b(new yw9((fee) n0o0VarH6.getValue(), new Function1(this) { // from class: a.xbr
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
            /* JADX WARN: Code duplicated, block: B:112:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:115:0x02df  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
            /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
            /* JADX WARN: Code duplicated, block: B:126:0x0321 A[LOOP:0: B:124:0x031b->B:126:0x0321, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:160:0x044a  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                boolean z2;
                double d;
                rln0 jln0Var;
                rln0 nln0Var;
                lrm jrmVar;
                lrm jrmVar2;
                boolean z3;
                lwo0 lwo0Var;
                boolean z4;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                i4 i4VarR0;
                byte b6 = b4;
                ao7 ao7Var = ao7.f1188a;
                do7 do7Var = do7.f6402a;
                z19 z19Var = this.b;
                switch (b6) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (!((Boolean) feeVar.c()).booleanValue()) {
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        if (((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue()) {
                            z2 = false;
                        } else {
                            go7 go7Var = (go7) ((fee) z19Var.e.getValue()).c();
                            if (Intrinsics.d(go7Var, do7Var)) {
                                ww6 ww6Var = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b;
                                if (ww6Var.i) {
                                    double d3 = ww6Var.f39872a;
                                    if (d3 == -1.0d) {
                                        z2 = false;
                                    } else {
                                        double d4 = ww6Var.d;
                                        double d5 = ww6Var.e;
                                        if (d4 > d3 || d3 > d5) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    z = ww6Var.j;
                                    z2 = z;
                                }
                            } else {
                                if (!Intrinsics.d(go7Var, ao7Var)) {
                                    t9f.b();
                                    return null;
                                }
                                jfc0 jfc0Var = (jfc0) ((fee) z19Var.g.getValue()).c();
                                if (jfc0Var != null) {
                                    z = true;
                                    if (jfc0Var.e) {
                                        z2 = z;
                                    }
                                }
                                z2 = false;
                            }
                        }
                        return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z2, false, true), ybr.f42352a)));
                    case 1:
                        vtn vtnVar = null;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = z19Var.b;
                        go7 go7Var2 = (go7) ((fee) z19Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var2, do7Var)) {
                            d = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var2, ao7Var)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ctf0Var3.getClass();
                        ql5 ql5Var = bn5Var.c;
                        String str = ql5Var.f;
                        double d6 = ql5Var.b;
                        long j = ql5Var.f28916a;
                        if (d6 == 0.0d && j != 0) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        }
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, i30.f14073a, new tw7(pn40.c(d6, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d6 == 0.0d || d > d6) && j != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str2 = ((bn5) ((fee) z19Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = z19Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var2 = ex6Var.b;
                        boolean z5 = ww6Var2.l;
                        boolean z6 = ww6Var2.i;
                        double d7 = ww6Var2.d;
                        double d8 = ww6Var2.f39872a;
                        double d9 = ww6Var2.e;
                        lx6 lx6Var = (z5 || zBooleanValue) ? lx6.c : ((d7 > d8 || d8 > d9) && d8 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(ex6Var.f8562a);
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), ww6Var2.m, true, false);
                        if (!nnb0Var.f23813a || lx6Var == lx6.b) {
                            if (d8 < d7) {
                                String strA = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d7, str2, p3u0.c)));
                            } else if (d8 > d9) {
                                String strA2 = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(d9, str2, p3u0.c)));
                            } else {
                                jln0Var = new jln0("");
                            }
                            nln0Var = jln0Var;
                        } else {
                            String str3 = nnb0Var.b;
                            String str4 = nnb0Var.c;
                            if (zBooleanValue) {
                                str4 = null;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            nln0Var = new nln0(str3, str4);
                        }
                        nke nkeVar = new nke(false, false, d8 > d7 && z6 && !zBooleanValue, d8 < d9 && z6 && !zBooleanValue);
                        boolean z7 = d9 != -1.0d && d9 > d7;
                        float fFloatValue = Float.valueOf(z7 ? l1e0.c((float) (((d8 - d7) / (d9 - d7)) * 100.0d), 0.0f, 100.0f) : 0.0f).floatValue();
                        String str5 = ww6Var2.f;
                        if (!z5 && !zBooleanValue) {
                            if (z7) {
                                int i3 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                p3u0 p3u0Var = p3u0.c;
                                jrmVar2 = new jrm(new g8k0(6, cy7.e(pn40.d(d7, str5, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(d9, str5, p3u0Var)), null));
                            } else {
                                jrmVar = new jrm(new g8k0(6, "", null), new g8k0(6, "", null));
                            }
                            if (z7 || z5 || zBooleanValue) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            aw6 aw6Var = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                            lwo0Var = svj0Var.c;
                            if (lwo0Var.f20774a) {
                                if (!lwo0Var.b || zBooleanValue) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                String str6 = lwo0Var.c;
                                String str7 = lwo0Var.e;
                                if (z4) {
                                    gmkVar = null;
                                } else {
                                    d2 = lwo0Var.d;
                                    if (d2 > 0.0d) {
                                        pn40 pn40Var5 = pn40.f27267a;
                                        emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                    } else if (d2 < 0.0d) {
                                        pn40 pn40Var6 = pn40.f27267a;
                                        emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                    } else {
                                        gmkVar = null;
                                    }
                                    gmkVar = emkVar;
                                }
                                List<mvo0> list = lwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list, 10));
                                for (mvo0 mvo0Var : list) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str6, str7, gmkVar, z4, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var, gxo0Var, null);
                        }
                        jrmVar = krm.f18772a;
                        jrmVar2 = jrmVar;
                        if (z7) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        aw6 aw6Var2 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                        lwo0Var = svj0Var.c;
                        if (lwo0Var.f20774a) {
                            gxo0Var = null;
                        } else {
                            if (lwo0Var.b) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            String str8 = lwo0Var.c;
                            String str9 = lwo0Var.e;
                            if (z4) {
                                gmkVar = null;
                            } else {
                                d2 = lwo0Var.d;
                                if (d2 > 0.0d) {
                                    pn40 pn40Var7 = pn40.f27267a;
                                    emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                } else if (d2 < 0.0d) {
                                    pn40 pn40Var8 = pn40.f27267a;
                                    emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                } else {
                                    gmkVar = null;
                                }
                                gmkVar = emkVar;
                            }
                            List<mvo0> list2 = lwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str8, str9, gmkVar, z4, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var2, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var2 = (jfc0) feeVar4.c();
                        if (jfc0Var2 != null) {
                            ctf0 ctf0Var5 = z19Var.b;
                            boolean zBooleanValue2 = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var2.f16419a;
                            bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                            if (zBooleanValue2) {
                                xyc0Var = xyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var2.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    xyc0Var = xyc0.f41702a;
                                } else if (iOrdinal2 == 1) {
                                    xyc0Var = xyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var2.c;
                            boolean z8 = rlc0Var.h;
                            double d10 = rlc0Var.f30690a;
                            String str10 = rlc0Var.c;
                            if (z8) {
                                lsm0 lsm0Var3 = ctf0Var5.b;
                                String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                                int i4 = cy7.f5159a;
                                pn40 pn40Var9 = pn40.f27267a;
                                p3u0 p3u0Var2 = p3u0.c;
                                i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d10, str10, p3u0Var2)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str10, p3u0Var2)), true) : null, rlc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str10, p3u0Var2)), true) : null}));
                            } else {
                                i4VarR0 = null;
                            }
                            return new b7c0(bzc0Var, xyc0Var, null, i4VarR0);
                        }
                        return null;
                }
            }
        }, b5));
        this.k = maz.b(new yw9((fee) n0o0VarH.getValue(), new rnp((byte) 26), b5));
        this.l = maz.b(new yw9((fee) n0o0VarH.getValue(), new rnp((byte) 27), b5));
        this.m = maz.b(new yw9((fee) n0o0VarH3.getValue(), new f5p(this, zvh0Var, (byte) 18), b5));
        this.n = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.xbr
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
            /* JADX WARN: Code duplicated, block: B:112:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:115:0x02df  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
            /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
            /* JADX WARN: Code duplicated, block: B:126:0x0321 A[LOOP:0: B:124:0x031b->B:126:0x0321, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:160:0x044a  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                boolean z2;
                double d;
                rln0 jln0Var;
                rln0 nln0Var;
                lrm jrmVar;
                lrm jrmVar2;
                boolean z3;
                lwo0 lwo0Var;
                boolean z4;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                i4 i4VarR0;
                byte b6 = b3;
                ao7 ao7Var = ao7.f1188a;
                do7 do7Var = do7.f6402a;
                z19 z19Var = this.b;
                switch (b6) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (!((Boolean) feeVar.c()).booleanValue()) {
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        if (((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue()) {
                            z2 = false;
                        } else {
                            go7 go7Var = (go7) ((fee) z19Var.e.getValue()).c();
                            if (Intrinsics.d(go7Var, do7Var)) {
                                ww6 ww6Var = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b;
                                if (ww6Var.i) {
                                    double d3 = ww6Var.f39872a;
                                    if (d3 == -1.0d) {
                                        z2 = false;
                                    } else {
                                        double d4 = ww6Var.d;
                                        double d5 = ww6Var.e;
                                        if (d4 > d3 || d3 > d5) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    z = ww6Var.j;
                                    z2 = z;
                                }
                            } else {
                                if (!Intrinsics.d(go7Var, ao7Var)) {
                                    t9f.b();
                                    return null;
                                }
                                jfc0 jfc0Var = (jfc0) ((fee) z19Var.g.getValue()).c();
                                if (jfc0Var != null) {
                                    z = true;
                                    if (jfc0Var.e) {
                                        z2 = z;
                                    }
                                }
                                z2 = false;
                            }
                        }
                        return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z2, false, true), ybr.f42352a)));
                    case 1:
                        vtn vtnVar = null;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = z19Var.b;
                        go7 go7Var2 = (go7) ((fee) z19Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var2, do7Var)) {
                            d = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var2, ao7Var)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ctf0Var3.getClass();
                        ql5 ql5Var = bn5Var.c;
                        String str = ql5Var.f;
                        double d6 = ql5Var.b;
                        long j = ql5Var.f28916a;
                        if (d6 == 0.0d && j != 0) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        }
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, i30.f14073a, new tw7(pn40.c(d6, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d6 == 0.0d || d > d6) && j != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str2 = ((bn5) ((fee) z19Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = z19Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var2 = ex6Var.b;
                        boolean z5 = ww6Var2.l;
                        boolean z6 = ww6Var2.i;
                        double d7 = ww6Var2.d;
                        double d8 = ww6Var2.f39872a;
                        double d9 = ww6Var2.e;
                        lx6 lx6Var = (z5 || zBooleanValue) ? lx6.c : ((d7 > d8 || d8 > d9) && d8 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(ex6Var.f8562a);
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), ww6Var2.m, true, false);
                        if (!nnb0Var.f23813a || lx6Var == lx6.b) {
                            if (d8 < d7) {
                                String strA = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d7, str2, p3u0.c)));
                            } else if (d8 > d9) {
                                String strA2 = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(d9, str2, p3u0.c)));
                            } else {
                                jln0Var = new jln0("");
                            }
                            nln0Var = jln0Var;
                        } else {
                            String str3 = nnb0Var.b;
                            String str4 = nnb0Var.c;
                            if (zBooleanValue) {
                                str4 = null;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            nln0Var = new nln0(str3, str4);
                        }
                        nke nkeVar = new nke(false, false, d8 > d7 && z6 && !zBooleanValue, d8 < d9 && z6 && !zBooleanValue);
                        boolean z7 = d9 != -1.0d && d9 > d7;
                        float fFloatValue = Float.valueOf(z7 ? l1e0.c((float) (((d8 - d7) / (d9 - d7)) * 100.0d), 0.0f, 100.0f) : 0.0f).floatValue();
                        String str5 = ww6Var2.f;
                        if (!z5 && !zBooleanValue) {
                            if (z7) {
                                int i3 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                p3u0 p3u0Var = p3u0.c;
                                jrmVar2 = new jrm(new g8k0(6, cy7.e(pn40.d(d7, str5, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(d9, str5, p3u0Var)), null));
                            } else {
                                jrmVar = new jrm(new g8k0(6, "", null), new g8k0(6, "", null));
                            }
                            if (z7 || z5 || zBooleanValue) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            aw6 aw6Var2 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                            lwo0Var = svj0Var.c;
                            if (lwo0Var.f20774a) {
                                if (!lwo0Var.b || zBooleanValue) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                String str8 = lwo0Var.c;
                                String str9 = lwo0Var.e;
                                if (z4) {
                                    gmkVar = null;
                                } else {
                                    d2 = lwo0Var.d;
                                    if (d2 > 0.0d) {
                                        pn40 pn40Var7 = pn40.f27267a;
                                        emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                    } else if (d2 < 0.0d) {
                                        pn40 pn40Var8 = pn40.f27267a;
                                        emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                    } else {
                                        gmkVar = null;
                                    }
                                    gmkVar = emkVar;
                                }
                                List<mvo0> list2 = lwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list2, 10));
                                for (mvo0 mvo0Var : list2) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str8, str9, gmkVar, z4, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var2, gxo0Var, null);
                        }
                        jrmVar = krm.f18772a;
                        jrmVar2 = jrmVar;
                        if (z7) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        aw6 aw6Var3 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                        lwo0Var = svj0Var.c;
                        if (lwo0Var.f20774a) {
                            gxo0Var = null;
                        } else {
                            if (lwo0Var.b) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            String str10 = lwo0Var.c;
                            String str11 = lwo0Var.e;
                            if (z4) {
                                gmkVar = null;
                            } else {
                                d2 = lwo0Var.d;
                                if (d2 > 0.0d) {
                                    pn40 pn40Var9 = pn40.f27267a;
                                    emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                } else if (d2 < 0.0d) {
                                    pn40 pn40Var10 = pn40.f27267a;
                                    emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                } else {
                                    gmkVar = null;
                                }
                                gmkVar = emkVar;
                            }
                            List<mvo0> list3 = lwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list3, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str10, str11, gmkVar, z4, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var3, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var2 = (jfc0) feeVar4.c();
                        if (jfc0Var2 != null) {
                            ctf0 ctf0Var5 = z19Var.b;
                            boolean zBooleanValue2 = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var2.f16419a;
                            bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                            if (zBooleanValue2) {
                                xyc0Var = xyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var2.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    xyc0Var = xyc0.f41702a;
                                } else if (iOrdinal2 == 1) {
                                    xyc0Var = xyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var2.c;
                            boolean z8 = rlc0Var.h;
                            double d10 = rlc0Var.f30690a;
                            String str12 = rlc0Var.c;
                            if (z8) {
                                lsm0 lsm0Var3 = ctf0Var5.b;
                                String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                                int i4 = cy7.f5159a;
                                pn40 pn40Var11 = pn40.f27267a;
                                p3u0 p3u0Var2 = p3u0.c;
                                i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d10, str12, p3u0Var2)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str12, p3u0Var2)), true) : null, rlc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str12, p3u0Var2)), true) : null}));
                            } else {
                                i4VarR0 = null;
                            }
                            return new b7c0(bzc0Var, xyc0Var, null, i4VarR0);
                        }
                        return null;
                }
            }
        }, b5));
        this.o = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.xbr
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
            /* JADX WARN: Code duplicated, block: B:112:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:115:0x02df  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
            /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
            /* JADX WARN: Code duplicated, block: B:126:0x0321 A[LOOP:0: B:124:0x031b->B:126:0x0321, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:160:0x044a  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                boolean z2;
                double d;
                rln0 jln0Var;
                rln0 nln0Var;
                lrm jrmVar;
                lrm jrmVar2;
                boolean z3;
                lwo0 lwo0Var;
                boolean z4;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                i4 i4VarR0;
                byte b6 = b;
                ao7 ao7Var = ao7.f1188a;
                do7 do7Var = do7.f6402a;
                z19 z19Var = this.b;
                switch (b6) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (!((Boolean) feeVar.c()).booleanValue()) {
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        if (((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue()) {
                            z2 = false;
                        } else {
                            go7 go7Var = (go7) ((fee) z19Var.e.getValue()).c();
                            if (Intrinsics.d(go7Var, do7Var)) {
                                ww6 ww6Var = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b;
                                if (ww6Var.i) {
                                    double d3 = ww6Var.f39872a;
                                    if (d3 == -1.0d) {
                                        z2 = false;
                                    } else {
                                        double d4 = ww6Var.d;
                                        double d5 = ww6Var.e;
                                        if (d4 > d3 || d3 > d5) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    z = ww6Var.j;
                                    z2 = z;
                                }
                            } else {
                                if (!Intrinsics.d(go7Var, ao7Var)) {
                                    t9f.b();
                                    return null;
                                }
                                jfc0 jfc0Var = (jfc0) ((fee) z19Var.g.getValue()).c();
                                if (jfc0Var != null) {
                                    z = true;
                                    if (jfc0Var.e) {
                                        z2 = z;
                                    }
                                }
                                z2 = false;
                            }
                        }
                        return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z2, false, true), ybr.f42352a)));
                    case 1:
                        vtn vtnVar = null;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = z19Var.b;
                        go7 go7Var2 = (go7) ((fee) z19Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var2, do7Var)) {
                            d = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var2, ao7Var)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ctf0Var3.getClass();
                        ql5 ql5Var = bn5Var.c;
                        String str = ql5Var.f;
                        double d6 = ql5Var.b;
                        long j = ql5Var.f28916a;
                        if (d6 == 0.0d && j != 0) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        }
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, i30.f14073a, new tw7(pn40.c(d6, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d6 == 0.0d || d > d6) && j != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str2 = ((bn5) ((fee) z19Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = z19Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var2 = ex6Var.b;
                        boolean z5 = ww6Var2.l;
                        boolean z6 = ww6Var2.i;
                        double d7 = ww6Var2.d;
                        double d8 = ww6Var2.f39872a;
                        double d9 = ww6Var2.e;
                        lx6 lx6Var = (z5 || zBooleanValue) ? lx6.c : ((d7 > d8 || d8 > d9) && d8 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(ex6Var.f8562a);
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), ww6Var2.m, true, false);
                        if (!nnb0Var.f23813a || lx6Var == lx6.b) {
                            if (d8 < d7) {
                                String strA = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d7, str2, p3u0.c)));
                            } else if (d8 > d9) {
                                String strA2 = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(d9, str2, p3u0.c)));
                            } else {
                                jln0Var = new jln0("");
                            }
                            nln0Var = jln0Var;
                        } else {
                            String str3 = nnb0Var.b;
                            String str4 = nnb0Var.c;
                            if (zBooleanValue) {
                                str4 = null;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            nln0Var = new nln0(str3, str4);
                        }
                        nke nkeVar = new nke(false, false, d8 > d7 && z6 && !zBooleanValue, d8 < d9 && z6 && !zBooleanValue);
                        boolean z7 = d9 != -1.0d && d9 > d7;
                        float fFloatValue = Float.valueOf(z7 ? l1e0.c((float) (((d8 - d7) / (d9 - d7)) * 100.0d), 0.0f, 100.0f) : 0.0f).floatValue();
                        String str5 = ww6Var2.f;
                        if (!z5 && !zBooleanValue) {
                            if (z7) {
                                int i3 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                p3u0 p3u0Var = p3u0.c;
                                jrmVar2 = new jrm(new g8k0(6, cy7.e(pn40.d(d7, str5, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(d9, str5, p3u0Var)), null));
                            } else {
                                jrmVar = new jrm(new g8k0(6, "", null), new g8k0(6, "", null));
                            }
                            if (z7 || z5 || zBooleanValue) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            aw6 aw6Var3 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                            lwo0Var = svj0Var.c;
                            if (lwo0Var.f20774a) {
                                if (!lwo0Var.b || zBooleanValue) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                String str10 = lwo0Var.c;
                                String str11 = lwo0Var.e;
                                if (z4) {
                                    gmkVar = null;
                                } else {
                                    d2 = lwo0Var.d;
                                    if (d2 > 0.0d) {
                                        pn40 pn40Var9 = pn40.f27267a;
                                        emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                    } else if (d2 < 0.0d) {
                                        pn40 pn40Var10 = pn40.f27267a;
                                        emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                    } else {
                                        gmkVar = null;
                                    }
                                    gmkVar = emkVar;
                                }
                                List<mvo0> list3 = lwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mvo0 mvo0Var : list3) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str10, str11, gmkVar, z4, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var3, gxo0Var, null);
                        }
                        jrmVar = krm.f18772a;
                        jrmVar2 = jrmVar;
                        if (z7) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        aw6 aw6Var4 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                        lwo0Var = svj0Var.c;
                        if (lwo0Var.f20774a) {
                            gxo0Var = null;
                        } else {
                            if (lwo0Var.b) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            String str12 = lwo0Var.c;
                            String str13 = lwo0Var.e;
                            if (z4) {
                                gmkVar = null;
                            } else {
                                d2 = lwo0Var.d;
                                if (d2 > 0.0d) {
                                    pn40 pn40Var11 = pn40.f27267a;
                                    emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                } else if (d2 < 0.0d) {
                                    pn40 pn40Var12 = pn40.f27267a;
                                    emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                } else {
                                    gmkVar = null;
                                }
                                gmkVar = emkVar;
                            }
                            List<mvo0> list4 = lwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list4, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str12, str13, gmkVar, z4, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var4, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var2 = (jfc0) feeVar4.c();
                        if (jfc0Var2 != null) {
                            ctf0 ctf0Var5 = z19Var.b;
                            boolean zBooleanValue2 = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var2.f16419a;
                            bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                            if (zBooleanValue2) {
                                xyc0Var = xyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var2.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    xyc0Var = xyc0.f41702a;
                                } else if (iOrdinal2 == 1) {
                                    xyc0Var = xyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var2.c;
                            boolean z8 = rlc0Var.h;
                            double d10 = rlc0Var.f30690a;
                            String str14 = rlc0Var.c;
                            if (z8) {
                                lsm0 lsm0Var3 = ctf0Var5.b;
                                String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                                int i4 = cy7.f5159a;
                                pn40 pn40Var13 = pn40.f27267a;
                                p3u0 p3u0Var2 = p3u0.c;
                                i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d10, str14, p3u0Var2)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str14, p3u0Var2)), true) : null, rlc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str14, p3u0Var2)), true) : null}));
                            } else {
                                i4VarR0 = null;
                            }
                            return new b7c0(bzc0Var, xyc0Var, null, i4VarR0);
                        }
                        return null;
                }
            }
        }, b5));
        this.p = maz.b(new yw9((fee) n0o0VarH5.getValue(), new Function1(this) { // from class: a.xbr
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
            /* JADX WARN: Code duplicated, block: B:112:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:115:0x02df  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:118:0x02e8  */
            /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
            /* JADX WARN: Code duplicated, block: B:126:0x0321 A[LOOP:0: B:124:0x031b->B:126:0x0321, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:160:0x044a  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                boolean z2;
                double d;
                rln0 jln0Var;
                rln0 nln0Var;
                lrm jrmVar;
                lrm jrmVar2;
                boolean z3;
                lwo0 lwo0Var;
                boolean z4;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                i4 i4VarR0;
                byte b6 = b2;
                ao7 ao7Var = ao7.f1188a;
                do7 do7Var = do7.f6402a;
                z19 z19Var = this.b;
                switch (b6) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (!((Boolean) feeVar.c()).booleanValue()) {
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        if (((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue()) {
                            z2 = false;
                        } else {
                            go7 go7Var = (go7) ((fee) z19Var.e.getValue()).c();
                            if (Intrinsics.d(go7Var, do7Var)) {
                                ww6 ww6Var = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b;
                                if (ww6Var.i) {
                                    double d3 = ww6Var.f39872a;
                                    if (d3 == -1.0d) {
                                        z2 = false;
                                    } else {
                                        double d4 = ww6Var.d;
                                        double d5 = ww6Var.e;
                                        if (d4 > d3 || d3 > d5) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    z = ww6Var.j;
                                    z2 = z;
                                }
                            } else {
                                if (!Intrinsics.d(go7Var, ao7Var)) {
                                    t9f.b();
                                    return null;
                                }
                                jfc0 jfc0Var = (jfc0) ((fee) z19Var.g.getValue()).c();
                                if (jfc0Var != null) {
                                    z = true;
                                    if (jfc0Var.e) {
                                        z2 = z;
                                    }
                                }
                                z2 = false;
                            }
                        }
                        return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z2, false, true), ybr.f42352a)));
                    case 1:
                        vtn vtnVar = null;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        bn5 bn5Var = (bn5) feeVar2.c();
                        ctf0 ctf0Var3 = z19Var.b;
                        go7 go7Var2 = (go7) ((fee) z19Var.e.getValue()).c();
                        if (Intrinsics.d(go7Var2, do7Var)) {
                            d = ((svj0) ((fee) z19Var.f.getValue()).c()).f32870a.b.f39872a;
                        } else {
                            if (!Intrinsics.d(go7Var2, ao7Var)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        bn5Var.getClass();
                        ctf0Var3.getClass();
                        ql5 ql5Var = bn5Var.c;
                        String str = ql5Var.f;
                        double d6 = ql5Var.b;
                        long j = ql5Var.f28916a;
                        if (d6 == 0.0d && j != 0) {
                            lsm0 lsm0Var = ctf0Var3.b;
                            vtnVar = new vtn(lsm0Var.a(R.string.warning, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.verification_top_up_account, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        }
                        pn40 pn40Var = pn40.f27267a;
                        return new gf6(vtnVar, i30.f14073a, new tw7(pn40.c(d6, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d6 == 0.0d || d > d6) && j != 0 && ctf0Var3.i(), bn5Var.d));
                    case 2:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        svj0 svj0Var = (svj0) feeVar3.c();
                        String str2 = ((bn5) ((fee) z19Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = z19Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                        svj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        ex6 ex6Var = svj0Var.f32870a;
                        nnb0 nnb0Var = svj0Var.b;
                        ww6 ww6Var2 = ex6Var.b;
                        boolean z5 = ww6Var2.l;
                        boolean z6 = ww6Var2.i;
                        double d7 = ww6Var2.d;
                        double d8 = ww6Var2.f39872a;
                        double d9 = ww6Var2.e;
                        lx6 lx6Var = (z5 || zBooleanValue) ? lx6.c : ((d7 > d8 || d8 > d9) && d8 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(ex6Var.f8562a);
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var2.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), ww6Var2.m, true, false);
                        if (!nnb0Var.f23813a || lx6Var == lx6.b) {
                            if (d8 < d7) {
                                String strA = lsm0Var2.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var2 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d7, str2, p3u0.c)));
                            } else if (d8 > d9) {
                                String strA2 = lsm0Var2.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(d9, str2, p3u0.c)));
                            } else {
                                jln0Var = new jln0("");
                            }
                            nln0Var = jln0Var;
                        } else {
                            String str3 = nnb0Var.b;
                            String str4 = nnb0Var.c;
                            if (zBooleanValue) {
                                str4 = null;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            nln0Var = new nln0(str3, str4);
                        }
                        nke nkeVar = new nke(false, false, d8 > d7 && z6 && !zBooleanValue, d8 < d9 && z6 && !zBooleanValue);
                        boolean z7 = d9 != -1.0d && d9 > d7;
                        float fFloatValue = Float.valueOf(z7 ? l1e0.c((float) (((d8 - d7) / (d9 - d7)) * 100.0d), 0.0f, 100.0f) : 0.0f).floatValue();
                        String str5 = ww6Var2.f;
                        if (!z5 && !zBooleanValue) {
                            if (z7) {
                                int i3 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                p3u0 p3u0Var = p3u0.c;
                                jrmVar2 = new jrm(new g8k0(6, cy7.e(pn40.d(d7, str5, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(d9, str5, p3u0Var)), null));
                            } else {
                                jrmVar = new jrm(new g8k0(6, "", null), new g8k0(6, "", null));
                            }
                            if (z7 || z5 || zBooleanValue) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            aw6 aw6Var4 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                            lwo0Var = svj0Var.c;
                            if (lwo0Var.f20774a) {
                                if (!lwo0Var.b || zBooleanValue) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                String str12 = lwo0Var.c;
                                String str13 = lwo0Var.e;
                                if (z4) {
                                    gmkVar = null;
                                } else {
                                    d2 = lwo0Var.d;
                                    if (d2 > 0.0d) {
                                        pn40 pn40Var11 = pn40.f27267a;
                                        emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                    } else if (d2 < 0.0d) {
                                        pn40 pn40Var12 = pn40.f27267a;
                                        emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                    } else {
                                        gmkVar = null;
                                    }
                                    gmkVar = emkVar;
                                }
                                List<mvo0> list4 = lwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list4, 10));
                                for (mvo0 mvo0Var : list4) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str12, str13, gmkVar, z4, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var4, gxo0Var, null);
                        }
                        jrmVar = krm.f18772a;
                        jrmVar2 = jrmVar;
                        if (z7) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        aw6 aw6Var5 = new aw6(sx6Var, nln0Var, nkeVar, lx6Var, new prm(fFloatValue, jrmVar2, null, null, z3, 118), str2);
                        lwo0Var = svj0Var.c;
                        if (lwo0Var.f20774a) {
                            gxo0Var = null;
                        } else {
                            if (lwo0Var.b) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            String str14 = lwo0Var.c;
                            String str15 = lwo0Var.e;
                            if (z4) {
                                gmkVar = null;
                            } else {
                                d2 = lwo0Var.d;
                                if (d2 > 0.0d) {
                                    pn40 pn40Var13 = pn40.f27267a;
                                    emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                } else if (d2 < 0.0d) {
                                    pn40 pn40Var14 = pn40.f27267a;
                                    emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                } else {
                                    gmkVar = null;
                                }
                                gmkVar = emkVar;
                            }
                            List<mvo0> list5 = lwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list5, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str14, str15, gmkVar, z4, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var5, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        jfc0 jfc0Var2 = (jfc0) feeVar4.c();
                        if (jfc0Var2 != null) {
                            ctf0 ctf0Var5 = z19Var.b;
                            boolean zBooleanValue2 = ((Boolean) ((fee) z19Var.i.getValue()).c()).booleanValue();
                            ctf0Var5.getClass();
                            azc0 azc0Var = jfc0Var2.f16419a;
                            bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                            if (zBooleanValue2) {
                                xyc0Var = xyc0.b;
                            } else {
                                int iOrdinal2 = jfc0Var2.b.ordinal();
                                if (iOrdinal2 == 0) {
                                    xyc0Var = xyc0.f41702a;
                                } else if (iOrdinal2 == 1) {
                                    xyc0Var = xyc0.b;
                                } else {
                                    t9f.b();
                                }
                            }
                            rlc0 rlc0Var = jfc0Var2.c;
                            boolean z8 = rlc0Var.h;
                            double d10 = rlc0Var.f30690a;
                            String str16 = rlc0Var.c;
                            if (z8) {
                                lsm0 lsm0Var3 = ctf0Var5.b;
                                String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                                int i4 = cy7.f5159a;
                                pn40 pn40Var15 = pn40.f27267a;
                                p3u0 p3u0Var2 = p3u0.c;
                                i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d10, str16, p3u0Var2)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), rlc0Var.b, false), rlc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(rlc0Var.e, str16, p3u0Var2)), true) : null, rlc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((rlc0Var.d - 1.0d) * d10, str16, p3u0Var2)), true) : null}));
                            } else {
                                i4VarR0 = null;
                            }
                            return new b7c0(bzc0Var, xyc0Var, null, i4VarR0);
                        }
                        return null;
                }
            }
        }, b5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    public List a(mbp0 mbp0Var, boolean z) {
        e9p0 e9p0Var = mbp0Var.k;
        Object obj = null;
        if (z) {
            if (e9p0Var != null) {
                Object obj2 = e9p0Var.f7433a;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        } else {
            if (e9p0Var != null) {
                Object obj3 = e9p0Var.b;
                e0g0 e0g0Var2 = j0g0.b;
                obj = (List) (obj3 instanceof g0g0 ? null : obj3);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        }
        ?? r3 = obj;
        Map map = mbp0Var.d;
        y78 y78Var = (y78) this.p;
        boolean z2 = mbp0Var.i;
        sff0 sff0Var = mbp0Var.f;
        return dem0.l(z, r3, map, mbp0Var.j, y78Var, z2, sff0Var.J, this.b, sff0Var.g.y, ((mbp0) this.n).o);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        byte b = this.f43607a;
        Object obj2 = this.p;
        Serializable serializable = this.q;
        Object obj3 = this.o;
        Object obj4 = this.n;
        n0o0 n0o0Var = this.h;
        n0o0 n0o0Var2 = this.g;
        n0o0 n0o0Var3 = this.f;
        n0o0 n0o0Var4 = this.j;
        n0o0 n0o0Var5 = this.m;
        n0o0 n0o0Var6 = this.l;
        n0o0 n0o0Var7 = this.k;
        n0o0 n0o0Var8 = this.i;
        n0o0 n0o0Var9 = this.e;
        n0o0 n0o0Var10 = this.d;
        n0o0 n0o0Var11 = this.c;
        switch (b) {
            case 0:
                x19 x19Var = (x19) obj;
                x19Var.getClass();
                ((fee) n0o0Var7.getValue()).d(x19Var.f);
                fee feeVar = (fee) n0o0Var11.getValue();
                v19 v19Var = x19Var.c;
                feeVar.d(v19Var.e);
                fee feeVar2 = (fee) n0o0Var10.getValue();
                u19 u19Var = x19Var.b;
                feeVar2.d(u19Var.e);
                ((fee) n0o0Var9.getValue()).d(Integer.valueOf(x19Var.h));
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(x19Var.d));
                ((fee) n0o0Var8.getValue()).d(x19Var.e);
                n0o0 n0o0Var12 = (n0o0) obj4;
                fee feeVar3 = (fee) n0o0Var12.getValue();
                w19 w19Var = x19Var.f40110a;
                feeVar3.d(w19Var);
                ((fee) n0o0Var6.getValue()).d(u19Var);
                ((fee) n0o0Var5.getValue()).d(v19Var);
                imm immVar = (imm) ((fee) n0o0Var12.getValue()).b();
                b19 b19Var = (b19) ((fee) ((n0o0) obj3).getValue()).b();
                Object objB = ((fee) ((n0o0) obj2).getValue()).b();
                return new a29(immVar, b19Var, (c19) (w19Var.c.length() == 0 ? objB : null), (g19) ((fee) ((n0o0) serializable).getValue()).b());
            case 1:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                ((fee) n0o0Var11.getValue()).d(mbp0Var);
                ((fee) n0o0Var10.getValue()).d(mbp0Var);
                ((fee) n0o0Var9.getValue()).d(mbp0Var);
                ((fee) n0o0Var3.getValue()).d(mbp0Var);
                ((fee) n0o0Var2.getValue()).d(mbp0Var);
                ((fee) n0o0Var.getValue()).d(mbp0Var);
                fee feeVar4 = (fee) n0o0Var8.getValue();
                obp0 obp0Var = mbp0Var.l;
                feeVar4.d(obp0Var);
                fee feeVar5 = (fee) n0o0Var7.getValue();
                o9p0 o9p0Var = mbp0Var.c;
                feeVar5.d(o9p0Var);
                ((fee) n0o0Var4.getValue()).d(obp0Var);
                ((fee) n0o0Var6.getValue()).d(mbp0Var);
                ((fee) n0o0Var5.getValue()).d(o9p0Var);
                return new sbp0(((fee) n0o0Var11.getValue()).e, ((fee) n0o0Var10.getValue()).e, ((fee) n0o0Var9.getValue()).e);
            case 2:
                c820 c820Var = (c820) obj;
                c820Var.getClass();
                fee feeVar6 = (fee) n0o0Var11.getValue();
                feeVar6.getClass();
                pz40 pz40VarA = feeVar6.a();
                ((my6) feeVar6.a().getValue()).getClass();
                pz40VarA.setValue(c820Var.f3892a);
                fee feeVar7 = (fee) n0o0Var10.getValue();
                feeVar7.getClass();
                pz40 pz40VarA2 = feeVar7.a();
                ((bn5) feeVar7.a().getValue()).getClass();
                pz40VarA2.setValue(c820Var.c);
                fee feeVar8 = (fee) n0o0Var9.getValue();
                feeVar8.getClass();
                pz40 pz40VarA3 = feeVar8.a();
                ((go7) feeVar8.a().getValue()).getClass();
                pz40VarA3.setValue(c820Var.b);
                fee feeVar9 = (fee) n0o0Var3.getValue();
                feeVar9.getClass();
                pz40 pz40VarA4 = feeVar9.a();
                ((svj0) feeVar9.a().getValue()).getClass();
                pz40VarA4.setValue(c820Var.d);
                fee feeVar10 = (fee) n0o0Var2.getValue();
                feeVar10.getClass();
                pz40 pz40VarA5 = feeVar10.a();
                pz40VarA5.setValue(c820Var.e);
                fee feeVar11 = (fee) n0o0Var.getValue();
                feeVar11.getClass();
                pz40 pz40VarA6 = feeVar11.a();
                ((Boolean) feeVar11.a().getValue()).getClass();
                pz40VarA6.setValue(Boolean.valueOf(c820Var.g));
                fee feeVar12 = (fee) n0o0Var8.getValue();
                feeVar12.getClass();
                pz40 pz40VarA7 = feeVar12.a();
                ((Boolean) feeVar12.a().getValue()).getClass();
                pz40VarA7.setValue(Boolean.valueOf(c820Var.k));
                return new d820((ug20) serializable, null, null, new zbr((y00) ((fee) n0o0Var6.getValue()).b(), (u820) ((fee) n0o0Var7.getValue()).b(), (wwh0) ((fee) n0o0Var5.getValue()).b(), (gf6) ((fee) ((n0o0) obj4).getValue()).b(), (bwj0) ((fee) ((n0o0) obj3).getValue()).b(), (b7c0) ((fee) ((n0o0) obj2).getValue()).b(), null, (mtl) ((fee) n0o0Var4.getValue()).b(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()), 6);
            default:
                sg20 sg20Var = (sg20) obj;
                sg20Var.getClass();
                fee feeVar13 = (fee) n0o0Var11.getValue();
                feeVar13.getClass();
                pz40 pz40VarA8 = feeVar13.a();
                ((ky6) feeVar13.a().getValue()).getClass();
                pz40VarA8.setValue(sg20Var.b);
                fee feeVar14 = (fee) n0o0Var10.getValue();
                feeVar14.getClass();
                pz40 pz40VarA9 = feeVar14.a();
                ((ym5) feeVar14.a().getValue()).getClass();
                pz40VarA9.setValue(sg20Var.c);
                fee feeVar15 = (fee) n0o0Var9.getValue();
                feeVar15.getClass();
                pz40 pz40VarA10 = feeVar15.a();
                ((eo7) feeVar15.a().getValue()).getClass();
                eo7 eo7Var = sg20Var.d;
                pz40VarA10.setValue(eo7Var);
                fee feeVar16 = (fee) n0o0Var3.getValue();
                feeVar16.getClass();
                pz40 pz40VarA11 = feeVar16.a();
                ((qvj0) feeVar16.a().getValue()).getClass();
                qvj0 qvj0Var = sg20Var.e;
                pz40VarA11.setValue(qvj0Var);
                fee feeVar17 = (fee) n0o0Var2.getValue();
                feeVar17.getClass();
                pz40 pz40VarA12 = feeVar17.a();
                ((ifc0) feeVar17.a().getValue()).getClass();
                ifc0 ifc0Var = sg20Var.f;
                pz40VarA12.setValue(ifc0Var);
                fee feeVar18 = (fee) n0o0Var.getValue();
                feeVar18.getClass();
                pz40 pz40VarA13 = feeVar18.a();
                ((Boolean) feeVar18.a().getValue()).getClass();
                pz40VarA13.setValue(Boolean.valueOf(sg20Var.h));
                fee feeVar19 = (fee) n0o0Var8.getValue();
                feeVar19.getClass();
                pz40 pz40VarA14 = feeVar19.a();
                ((Boolean) feeVar19.a().getValue()).getClass();
                pz40VarA14.setValue(Boolean.valueOf(sg20Var.j));
                p820 p820Var = new p820((wy6) ((fee) n0o0Var7.getValue()).b());
                uwh0 uwh0Var = (uwh0) ((fee) n0o0Var6.getValue()).b();
                ef6 ef6Var = (ef6) ((fee) n0o0Var5.getValue()).b();
                zvj0 zvj0Var = (zvj0) ((fee) ((n0o0) obj4).getValue()).b();
                z6c0 z6c0Var = (z6c0) ((fee) ((n0o0) obj3).getValue()).b();
                yw00 yw00Var = (yw00) ((fee) n0o0Var4.getValue()).b();
                iul iulVar = iul.e;
                oe9 oe9Var = oe9.f25112a;
                ue9 ue9Var = new ue9(this.b.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                if (eo7Var.equals(bo7.f2918a)) {
                    uw6 uw6Var = qvj0Var.f29389a.b;
                    if (uw6Var.h) {
                        double d = uw6Var.f36378a;
                        if (d != -1.0d && uw6Var.d <= d && d <= 9.99999999999999E12d && uw6Var.m) {
                            z = true;
                        } else {
                            z2 = false;
                        }
                        return new d820((ug20) serializable, new gh00(p820Var, uwh0Var, ef6Var, zvj0Var, z6c0Var, null, yw00Var, 1.0f, null, new qn8(new wul(iulVar, oe9Var, ue9Var, z2, false, true), null), new lnd0("", new epd0("", "", "", "", null, false), false)), null, null, 8);
                    }
                    z = uw6Var.i;
                } else {
                    if (!eo7Var.equals(yn7.f42924a)) {
                        t9f.b();
                        return null;
                    }
                    z = ifc0Var.e;
                }
                z2 = z;
                return new d820((ug20) serializable, new gh00(p820Var, uwh0Var, ef6Var, zvj0Var, z6c0Var, null, yw00Var, 1.0f, null, new qn8(new wul(iulVar, oe9Var, ue9Var, z2, false, true), null), new lnd0("", new epd0("", "", "", "", null, false), false)), null, null, 8);
        }
    }

    public z19(mbp0 mbp0Var, ctf0 ctf0Var, g2v g2vVar, y78 y78Var, Locale locale) {
        final byte b = 1;
        ctf0Var.getClass();
        this.n = mbp0Var;
        this.b = ctf0Var;
        this.o = g2vVar;
        this.p = y78Var;
        this.q = locale;
        byte b2 = 20;
        this.c = maz.b(new yw9(mbp0Var, new n2l((byte) 17), b2));
        this.d = maz.b(new yw9(mbp0Var, new n2l((byte) 18), b2));
        final byte b3 = 2;
        this.e = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b4) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var = mbp0Var2.c;
                        List listM = o9p0Var != null ? ycm0.m(o9p0Var, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var2 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var2 != null ? o9p0Var2.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var = (obp0) obj;
                        if (obp0Var != null) {
                            Object obj3 = obp0Var.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj4 = obp0Var2.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        List list4 = o9p0Var3 != null ? o9p0Var3.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        final byte b4 = 3;
        this.f = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b5) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var = mbp0Var2.c;
                        List listM = o9p0Var != null ? ycm0.m(o9p0Var, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var2 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var2 != null ? o9p0Var2.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var = (obp0) obj;
                        if (obp0Var != null) {
                            Object obj3 = obp0Var.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj4 = obp0Var2.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        List list4 = o9p0Var3 != null ? o9p0Var3.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        final byte b5 = 4;
        this.g = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b6) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var = mbp0Var2.c;
                        List listM = o9p0Var != null ? ycm0.m(o9p0Var, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var2 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var2 != null ? o9p0Var2.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var = (obp0) obj;
                        if (obp0Var != null) {
                            Object obj3 = obp0Var.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj4 = obp0Var2.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        List list4 = o9p0Var3 != null ? o9p0Var3.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        final byte b6 = 5;
        this.h = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b7 = b6;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b7) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var = mbp0Var2.c;
                        List listM = o9p0Var != null ? ycm0.m(o9p0Var, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var2 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var2 != null ? o9p0Var2.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var = (obp0) obj;
                        if (obp0Var != null) {
                            Object obj3 = obp0Var.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj4 = obp0Var2.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        List list4 = o9p0Var3 != null ? o9p0Var3.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        obp0 obp0Var = mbp0Var.l;
        final byte b7 = 6;
        this.i = maz.b(new yw9(obp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b8 = b7;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b8) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var = mbp0Var2.c;
                        List listM = o9p0Var != null ? ycm0.m(o9p0Var, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var2 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var2 != null ? o9p0Var2.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj3 = obp0Var2.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var3 = (obp0) obj;
                        if (obp0Var3 != null) {
                            Object obj4 = obp0Var3.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        List list4 = o9p0Var3 != null ? o9p0Var3.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        final byte b8 = 7;
        this.j = maz.b(new yw9(obp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b9 = b8;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b9) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var = mbp0Var2.c;
                        List listM = o9p0Var != null ? ycm0.m(o9p0Var, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var2 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var2 != null ? o9p0Var2.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj3 = obp0Var2.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var3 = (obp0) obj;
                        if (obp0Var3 != null) {
                            Object obj4 = obp0Var3.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        List list4 = o9p0Var3 != null ? o9p0Var3.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        o9p0 o9p0Var = mbp0Var.c;
        final byte b9 = 8;
        this.k = maz.b(new yw9(o9p0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b10 = b9;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b10) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var2 = mbp0Var2.c;
                        List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var3 != null ? o9p0Var3.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj3 = obp0Var2.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var3 = (obp0) obj;
                        if (obp0Var3 != null) {
                            Object obj4 = obp0Var3.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var4 = (o9p0) obj;
                        List list4 = o9p0Var4 != null ? o9p0Var4.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        final byte b10 = 0;
        this.l = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b11 = b10;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b11) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var2 = mbp0Var2.c;
                        List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var3 != null ? o9p0Var3.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj3 = obp0Var2.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var3 = (obp0) obj;
                        if (obp0Var3 != null) {
                            Object obj4 = obp0Var3.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var4 = (o9p0) obj;
                        List list4 = o9p0Var4 != null ? o9p0Var4.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
        this.m = maz.b(new yw9(o9p0Var, new Function1(this) { // from class: a.bal
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b11 = b;
                List listJ = null;
                List listH = null;
                List list = null;
                z19 z19Var = this.b;
                switch (b11) {
                    case 0:
                        mbp0 mbp0Var2 = (mbp0) obj;
                        mbp0Var2.getClass();
                        o9p0 o9p0Var2 = mbp0Var2.c;
                        List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var2.n, z19Var.b) : null;
                        return listM == null ? iun.f15405a : listM;
                    case 1:
                        o9p0 o9p0Var3 = (o9p0) obj;
                        ctf0 ctf0Var2 = z19Var.b;
                        List list2 = o9p0Var3 != null ? o9p0Var3.i : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        return zcm0.g(ctf0Var2, list2);
                    case 2:
                        g2v g2vVar2 = (g2v) z19Var.o;
                        mbp0 mbp0Var3 = (mbp0) obj;
                        mbp0Var3.getClass();
                        fbp0 fbp0Var = mbp0Var3.h;
                        TeamDetailsParams teamDetailsParams = mbp0Var3.b;
                        if (!fbp0Var.equals(dbp0.c)) {
                            if (fbp0Var.equals(ebp0.c)) {
                                return gnm0.h(mbp0Var3.c, mbp0Var3.l, g2vVar2, mbp0Var3.f21520a, teamDetailsParams.f46569a, new ucj(z19Var, (byte) 22));
                            }
                            t9f.b();
                            return null;
                        }
                        e9p0 e9p0Var = mbp0Var3.k;
                        v5l0 v5l0Var = mbp0Var3.f.g.y;
                        boolean z = mbp0Var3.f21520a;
                        long j = teamDetailsParams.f46569a;
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.addAll((Collection) ((fee) z19Var.f.getValue()).b());
                        lc00VarB.addAll((Collection) ((fee) z19Var.g.getValue()).b());
                        return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) z19Var.h.getValue()).b(), lc00VarB));
                    case 3:
                        mbp0 mbp0Var4 = (mbp0) obj;
                        mbp0Var4.getClass();
                        return z19Var.a(mbp0Var4, true);
                    case 4:
                        mbp0 mbp0Var5 = (mbp0) obj;
                        mbp0Var5.getClass();
                        return z19Var.a(mbp0Var5, false);
                    case 5:
                        mbp0 mbp0Var6 = (mbp0) obj;
                        mbp0Var6.getClass();
                        e9p0 e9p0Var2 = mbp0Var6.k;
                        if (e9p0Var2 != null) {
                            Object obj2 = e9p0Var2.d;
                            e0g0 e0g0Var = j0g0.b;
                            list = (List) (obj2 instanceof g0g0 ? null : obj2);
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        return ghm0.o(list, mbp0Var6.m, z19Var.b, mbp0Var6.f.g.y, (Locale) z19Var.q, mbp0Var6.o);
                    case 6:
                        obp0 obp0Var2 = (obp0) obj;
                        if (obp0Var2 != null) {
                            Object obj3 = obp0Var2.f24993a;
                            iun iunVar = iun.f15405a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj3 instanceof g0g0) {
                                obj3 = iunVar;
                            }
                            listH = fem0.h((List) obj3, 1L, z19Var.b, true);
                        }
                        return listH == null ? iun.f15405a : listH;
                    case 7:
                        obp0 obp0Var3 = (obp0) obj;
                        if (obp0Var3 != null) {
                            Object obj4 = obp0Var3.b;
                            listJ = iun.f15405a;
                            e0g0 e0g0Var3 = j0g0.b;
                            if (obj4 instanceof g0g0) {
                                obj4 = listJ;
                            }
                            List<mcb0> list3 = (List) obj4;
                            ctf0 ctf0Var3 = z19Var.b;
                            list3.getClass();
                            ctf0Var3.getClass();
                            if (!list3.isEmpty()) {
                                lsm0 lsm0Var = ctf0Var3.b;
                                r9m r9mVar = new r9m(dyb.g0(lsm0Var.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var.a(R.string.the_international_hero, Arrays.copyOf(new Object[0], 0)));
                                ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mcb0 mcb0Var : list3) {
                                    n0x n0xVar = new n0x(mcb0Var.b);
                                    ut90 ut90Var = ut90.Rectangle;
                                    String str = mcb0Var.f21543a;
                                    ham hamVar = new ham(String.valueOf(mcb0Var.e));
                                    float f = mcb0Var.c;
                                    arrayList.add(new fam("", n0xVar, ut90Var, qt90.f29289a, str, dyb.g0(hamVar, new ham(f >= 0.0f ? ohs0.n(f % 1.0f == 0.0f ? String.valueOf((int) f) : StringsKt.w0(StringsKt.w0(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.'), Separators.PERCENT) : ""))));
                                }
                                listJ = q3d.j(new m9p0("HEADER_POPULAR_HEROES", new hjm(lsm0Var.a(R.string.popular_heroes, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)), new x9p0("POPULAR_HEROES", new jam(r9mVar, dyb.o0(arrayList), lsm0Var.a(R.string.display_all, Arrays.copyOf(new Object[0], 0)), 8)));
                            }
                        }
                        return listJ == null ? iun.f15405a : listJ;
                    default:
                        o9p0 o9p0Var4 = (o9p0) obj;
                        List list4 = o9p0Var4 != null ? o9p0Var4.j : null;
                        if (list4 == null) {
                            list4 = iun.f15405a;
                        }
                        return iom0.h(z19Var.b, list4);
                }
            }
        }, b2));
    }

    public z19(sg20 sg20Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        ug20 ug20Var;
        final byte b = 3;
        ctf0Var.getClass();
        this.p = sg20Var;
        this.b = ctf0Var;
        int iOrdinal = sg20Var.g.ordinal();
        final byte b2 = 2;
        final byte b3 = 1;
        if (iOrdinal == 1 || iOrdinal != 2) {
            ug20Var = ug20.b;
        } else {
            ug20Var = ug20.f35603a;
        }
        this.q = ug20Var;
        n0o0 n0o0VarH = bkb.H(sg20Var.b);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(sg20Var.c);
        this.d = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(sg20Var.d);
        this.e = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(sg20Var.e);
        this.f = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(sg20Var.f);
        this.g = n0o0VarH5;
        this.h = bkb.H(Boolean.valueOf(sg20Var.h));
        n0o0 n0o0VarH6 = bkb.H(Boolean.valueOf(sg20Var.j));
        this.i = n0o0VarH6;
        final byte b4 = 0;
        byte b5 = 20;
        this.j = maz.b(new yw9((fee) n0o0VarH6.getValue(), new Function1(this) { // from class: a.m700
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 730
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.m700.invoke(java.lang.Object):java.lang.Object");
            }
        }, b5));
        this.k = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.m700
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 730
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.m700.invoke(java.lang.Object):java.lang.Object");
            }
        }, b5));
        this.l = maz.b(new yw9((fee) n0o0VarH3.getValue(), new u400(this, zvh0Var, b3), b5));
        this.m = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.m700
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 730
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.m700.invoke(java.lang.Object):java.lang.Object");
            }
        }, b5));
        this.n = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.m700
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 730
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.m700.invoke(java.lang.Object):java.lang.Object");
            }
        }, b5));
        final byte b6 = 4;
        this.o = maz.b(new yw9((fee) n0o0VarH5.getValue(), new Function1(this) { // from class: a.m700
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 730
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.m700.invoke(java.lang.Object):java.lang.Object");
            }
        }, b5));
    }

    public z19(x19 x19Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        v19 v19Var = x19Var.c;
        byte b2 = 20;
        this.c = maz.b(new yw9(v19Var.e, new cp8((byte) 21), b2));
        u19 u19Var = x19Var.b;
        this.d = maz.b(new yw9(u19Var.e, new cp8((byte) 22), b2));
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(x19Var.h));
        this.e = n0o0VarH;
        this.f = bkb.G(((fee) n0o0VarH.getValue()).d, new cp8((byte) 23));
        this.g = bkb.G(((fee) n0o0VarH.getValue()).d, new cp8((byte) 24));
        this.h = bkb.G(((fee) n0o0VarH.getValue()).d, new cp8((byte) 25));
        this.i = bkb.H(x19Var.e);
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(x19Var.d));
        this.j = n0o0VarH2;
        this.k = maz.b(new yw9(x19Var.f, new cp8((byte) 26), b2));
        n0o0 n0o0VarH3 = bkb.H(u19Var);
        this.l = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(v19Var);
        this.m = n0o0VarH4;
        this.n = maz.b(new yw9(x19Var.f40110a, new Function1(this) { // from class: a.y19
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                String str;
                dol colVar;
                byte b3 = b;
                Object obj2 = null;
                z19 z19Var = this.b;
                switch (b3) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        w19 w19Var = (w19) obj;
                        w19Var.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        boolean z = w19Var.f38387a;
                        tlm nlmVar = z ? new nlm(new hmm(10, w19Var.b, ctf0Var2.b.a(R.string.search_providers, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var2.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                        ra50 ra50Var = ra50.f30118a;
                        return new imm(ilmVar, nlmVar, new dmm(z ? new ta50(new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary())) : new va50(new wkm(0, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        n0o0 n0o0Var = z19Var.k;
                        ctf0 ctf0Var3 = z19Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new a19(ctf0Var3.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var3.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) z19Var.i.getValue()).c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str2 = ql5Var != null ? ql5Var.f : null;
                        return new z09((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str2 != null ? str2 : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 2:
                        u19 u19Var2 = (u19) obj;
                        u19Var2.getClass();
                        n0o0 n0o0Var2 = z19Var.d;
                        lq5 lq5Var = (lq5) ((fee) n0o0Var2.getValue()).b();
                        Iterable<lr5> iterable = u19Var2.d;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = (lq5) ((fee) n0o0Var2.getValue()).b();
                            int i = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (Intrinsics.d(lq5Var2, gq5.f11714a) || Intrinsics.d(lq5Var2, fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (Intrinsics.d(lq5Var2, hq5.f13470a) || Intrinsics.d(lq5Var2, iq5.f15191a) || Intrinsics.d(lq5Var2, kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!Intrinsics.d(lq5Var2, dq5.f6497a) && !Intrinsics.d(lq5Var2, eq5.f8219a) && !Intrinsics.d(lq5Var2, cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                                sb.setLength(0);
                                sb.append(str);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(str, '/'));
                            }
                            arrayList.add(new fr5(i, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new c19(lq5Var, dyb.o0(arrayList), u19Var2.f34892a || !((v19) ((fee) z19Var.m.getValue()).c()).b);
                    default:
                        n0o0 n0o0Var3 = z19Var.c;
                        v19 v19Var2 = (v19) obj;
                        v19Var2.getClass();
                        String str3 = ((w19) ((fee) ((n0o0) z19Var.n).getValue()).c()).c;
                        boolean z2 = v19Var2.c;
                        List<s5d0> list = v19Var2.d;
                        boolean z3 = v19Var2.f36619a;
                        if (z2) {
                            return new f19((mdm) ((fee) z19Var.h.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() == 0) {
                            return new f19((mdm) ((fee) z19Var.g.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() > 0) {
                            return new f19((mdm) ((fee) z19Var.f.getValue()).b());
                        }
                        if (z3 || !((u19) ((fee) z19Var.l.getValue()).c()).b) {
                            colVar = new col(new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        } else {
                            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                            for (s5d0 s5d0Var : list) {
                                arrayList2.add(new eol(s5d0Var.f31650a, new n0x(s5d0Var.c), false, s5d0Var.b, String.valueOf(s5d0Var.h), z19Var.b.b.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                            }
                            colVar = new bol(dyb.o0(arrayList2), new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        }
                        return new e19(colVar);
                }
            }
        }, b2));
        pz40 pz40Var = ((fee) n0o0VarH2.getValue()).d;
        final byte b3 = 1;
        this.o = bkb.G(pz40Var, new Function1(this) { // from class: a.y19
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                String str;
                dol colVar;
                byte b4 = b3;
                Object obj2 = null;
                z19 z19Var = this.b;
                switch (b4) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        w19 w19Var = (w19) obj;
                        w19Var.getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        boolean z = w19Var.f38387a;
                        tlm nlmVar = z ? new nlm(new hmm(10, w19Var.b, ctf0Var2.b.a(R.string.search_providers, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var2.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                        ra50 ra50Var = ra50.f30118a;
                        return new imm(ilmVar, nlmVar, new dmm(z ? new ta50(new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary())) : new va50(new wkm(0, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        n0o0 n0o0Var = z19Var.k;
                        ctf0 ctf0Var3 = z19Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new a19(ctf0Var3.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var3.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) z19Var.i.getValue()).c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str2 = ql5Var != null ? ql5Var.f : null;
                        return new z09((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str2 != null ? str2 : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 2:
                        u19 u19Var2 = (u19) obj;
                        u19Var2.getClass();
                        n0o0 n0o0Var2 = z19Var.d;
                        lq5 lq5Var = (lq5) ((fee) n0o0Var2.getValue()).b();
                        Iterable<lr5> iterable = u19Var2.d;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = (lq5) ((fee) n0o0Var2.getValue()).b();
                            int i = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (Intrinsics.d(lq5Var2, gq5.f11714a) || Intrinsics.d(lq5Var2, fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (Intrinsics.d(lq5Var2, hq5.f13470a) || Intrinsics.d(lq5Var2, iq5.f15191a) || Intrinsics.d(lq5Var2, kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!Intrinsics.d(lq5Var2, dq5.f6497a) && !Intrinsics.d(lq5Var2, eq5.f8219a) && !Intrinsics.d(lq5Var2, cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                                sb.setLength(0);
                                sb.append(str);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(str, '/'));
                            }
                            arrayList.add(new fr5(i, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new c19(lq5Var, dyb.o0(arrayList), u19Var2.f34892a || !((v19) ((fee) z19Var.m.getValue()).c()).b);
                    default:
                        n0o0 n0o0Var3 = z19Var.c;
                        v19 v19Var2 = (v19) obj;
                        v19Var2.getClass();
                        String str3 = ((w19) ((fee) ((n0o0) z19Var.n).getValue()).c()).c;
                        boolean z2 = v19Var2.c;
                        List<s5d0> list = v19Var2.d;
                        boolean z3 = v19Var2.f36619a;
                        if (z2) {
                            return new f19((mdm) ((fee) z19Var.h.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() == 0) {
                            return new f19((mdm) ((fee) z19Var.g.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() > 0) {
                            return new f19((mdm) ((fee) z19Var.f.getValue()).b());
                        }
                        if (z3 || !((u19) ((fee) z19Var.l.getValue()).c()).b) {
                            colVar = new col(new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        } else {
                            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                            for (s5d0 s5d0Var : list) {
                                arrayList2.add(new eol(s5d0Var.f31650a, new n0x(s5d0Var.c), false, s5d0Var.b, String.valueOf(s5d0Var.h), z19Var.b.b.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                            }
                            colVar = new bol(dyb.o0(arrayList2), new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        }
                        return new e19(colVar);
                }
            }
        });
        pz40 pz40Var2 = ((fee) n0o0VarH3.getValue()).d;
        final byte b4 = 2;
        this.p = bkb.G(pz40Var2, new Function1(this) { // from class: a.y19
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                String str;
                dol colVar;
                byte b5 = b4;
                Object obj2 = null;
                z19 z19Var = this.b;
                switch (b5) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        w19 w19Var = (w19) obj;
                        w19Var.getClass();
                        pz40 pz40Var3 = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        boolean z = w19Var.f38387a;
                        tlm nlmVar = z ? new nlm(new hmm(10, w19Var.b, ctf0Var2.b.a(R.string.search_providers, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var2.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                        ra50 ra50Var = ra50.f30118a;
                        return new imm(ilmVar, nlmVar, new dmm(z ? new ta50(new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary())) : new va50(new wkm(0, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        n0o0 n0o0Var = z19Var.k;
                        ctf0 ctf0Var3 = z19Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new a19(ctf0Var3.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var3.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) z19Var.i.getValue()).c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str2 = ql5Var != null ? ql5Var.f : null;
                        return new z09((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str2 != null ? str2 : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 2:
                        u19 u19Var2 = (u19) obj;
                        u19Var2.getClass();
                        n0o0 n0o0Var2 = z19Var.d;
                        lq5 lq5Var = (lq5) ((fee) n0o0Var2.getValue()).b();
                        Iterable<lr5> iterable = u19Var2.d;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = (lq5) ((fee) n0o0Var2.getValue()).b();
                            int i = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (Intrinsics.d(lq5Var2, gq5.f11714a) || Intrinsics.d(lq5Var2, fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (Intrinsics.d(lq5Var2, hq5.f13470a) || Intrinsics.d(lq5Var2, iq5.f15191a) || Intrinsics.d(lq5Var2, kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!Intrinsics.d(lq5Var2, dq5.f6497a) && !Intrinsics.d(lq5Var2, eq5.f8219a) && !Intrinsics.d(lq5Var2, cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                                sb.setLength(0);
                                sb.append(str);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(str, '/'));
                            }
                            arrayList.add(new fr5(i, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new c19(lq5Var, dyb.o0(arrayList), u19Var2.f34892a || !((v19) ((fee) z19Var.m.getValue()).c()).b);
                    default:
                        n0o0 n0o0Var3 = z19Var.c;
                        v19 v19Var2 = (v19) obj;
                        v19Var2.getClass();
                        String str3 = ((w19) ((fee) ((n0o0) z19Var.n).getValue()).c()).c;
                        boolean z2 = v19Var2.c;
                        List<s5d0> list = v19Var2.d;
                        boolean z3 = v19Var2.f36619a;
                        if (z2) {
                            return new f19((mdm) ((fee) z19Var.h.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() == 0) {
                            return new f19((mdm) ((fee) z19Var.g.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() > 0) {
                            return new f19((mdm) ((fee) z19Var.f.getValue()).b());
                        }
                        if (z3 || !((u19) ((fee) z19Var.l.getValue()).c()).b) {
                            colVar = new col(new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        } else {
                            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                            for (s5d0 s5d0Var : list) {
                                arrayList2.add(new eol(s5d0Var.f31650a, new n0x(s5d0Var.c), false, s5d0Var.b, String.valueOf(s5d0Var.h), z19Var.b.b.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                            }
                            colVar = new bol(dyb.o0(arrayList2), new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        }
                        return new e19(colVar);
                }
            }
        });
        final byte b5 = 3;
        this.q = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.y19
            public final /* synthetic */ z19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                String str;
                dol colVar;
                byte b6 = b5;
                Object obj2 = null;
                z19 z19Var = this.b;
                switch (b6) {
                    case 0:
                        ctf0 ctf0Var2 = z19Var.b;
                        w19 w19Var = (w19) obj;
                        w19Var.getClass();
                        pz40 pz40Var3 = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        boolean z = w19Var.f38387a;
                        tlm nlmVar = z ? new nlm(new hmm(10, w19Var.b, ctf0Var2.b.a(R.string.search_providers, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var2.b.a(R.string.providers, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
                        ra50 ra50Var = ra50.f30118a;
                        return new imm(ilmVar, nlmVar, new dmm(z ? new ta50(new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary())) : new va50(new wkm(0, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), new wkm(1, R.drawable.ic_glyph_sort, true, ra50Var, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        n0o0 n0o0Var = z19Var.k;
                        ctf0 ctf0Var3 = z19Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new a19(ctf0Var3.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var3.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) z19Var.i.getValue()).c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str2 = ql5Var != null ? ql5Var.f : null;
                        return new z09((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str2 != null ? str2 : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 2:
                        u19 u19Var2 = (u19) obj;
                        u19Var2.getClass();
                        n0o0 n0o0Var2 = z19Var.d;
                        lq5 lq5Var = (lq5) ((fee) n0o0Var2.getValue()).b();
                        Iterable<lr5> iterable = u19Var2.d;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (lr5 lr5Var : iterable) {
                            lq5 lq5Var2 = (lq5) ((fee) n0o0Var2.getValue()).b();
                            int i = lr5Var.f20512a;
                            StringBuilder sb = new StringBuilder(ujn.h);
                            if (Intrinsics.d(lq5Var2, gq5.f11714a) || Intrinsics.d(lq5Var2, fq5.f9956a)) {
                                str = lr5Var.c;
                            } else if (Intrinsics.d(lq5Var2, hq5.f13470a) || Intrinsics.d(lq5Var2, iq5.f15191a) || Intrinsics.d(lq5Var2, kq5.f18703a) || (lq5Var2 instanceof jq5)) {
                                str = lr5Var.b;
                            } else {
                                if (!Intrinsics.d(lq5Var2, dq5.f6497a) && !Intrinsics.d(lq5Var2, eq5.f8219a) && !Intrinsics.d(lq5Var2, cq5.f4775a)) {
                                    t9f.b();
                                    return obj2;
                                }
                                str = lr5Var.d;
                            }
                            str.getClass();
                            if (str.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                                sb.setLength(0);
                                sb.append(str);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(str, '/'));
                            }
                            arrayList.add(new fr5(i, new n0x(sb.toString()), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                            obj2 = null;
                        }
                        return new c19(lq5Var, dyb.o0(arrayList), u19Var2.f34892a || !((v19) ((fee) z19Var.m.getValue()).c()).b);
                    default:
                        n0o0 n0o0Var3 = z19Var.c;
                        v19 v19Var2 = (v19) obj;
                        v19Var2.getClass();
                        String str3 = ((w19) ((fee) ((n0o0) z19Var.n).getValue()).c()).c;
                        boolean z2 = v19Var2.c;
                        List<s5d0> list = v19Var2.d;
                        boolean z3 = v19Var2.f36619a;
                        if (z2) {
                            return new f19((mdm) ((fee) z19Var.h.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() == 0) {
                            return new f19((mdm) ((fee) z19Var.g.getValue()).b());
                        }
                        if (!z3 && list.isEmpty() && str3.length() > 0) {
                            return new f19((mdm) ((fee) z19Var.f.getValue()).b());
                        }
                        if (z3 || !((u19) ((fee) z19Var.l.getValue()).c()).b) {
                            colVar = new col(new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        } else {
                            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                            for (s5d0 s5d0Var : list) {
                                arrayList2.add(new eol(s5d0Var.f31650a, new n0x(s5d0Var.c), false, s5d0Var.b, String.valueOf(s5d0Var.h), z19Var.b.b.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                            }
                            colVar = new bol(dyb.o0(arrayList2), new b0i(sh1.f32187a, (rh1) ((fee) n0o0Var3.getValue()).b()));
                        }
                        return new e19(colVar);
                }
            }
        });
    }
}
