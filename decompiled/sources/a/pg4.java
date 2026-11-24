package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class pg4 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26936a = 2;
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
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final Object v;
    public final Object w;
    public final Object x;

    public pg4(zht zhtVar, ctf0 ctf0Var, List list, ocl oclVar) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.v = list;
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(zhtVar.f));
        this.c = n0o0VarH;
        this.d = bkb.H(Boolean.valueOf(zhtVar.g));
        this.e = bkb.H(zhtVar.f44409a);
        n0o0 n0o0VarH2 = bkb.H(zhtVar.b);
        this.f = n0o0VarH2;
        this.g = bkb.H(Boolean.valueOf(zhtVar.c));
        this.h = bkb.H(zhtVar.h);
        this.i = bkb.H(zhtVar.i);
        this.j = bkb.H(zhtVar.d);
        this.k = bkb.H(zhtVar.e);
        final byte b2 = 0;
        lsm0 lsm0Var = ctf0Var.b;
        this.w = new ait(lsm0Var.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.wanted_sum, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.generate_coupon, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.assemble, Arrays.copyOf(new Object[0], 0)));
        this.x = ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        this.l = maz.b(new yw9(a(), new vls((byte) 17), (byte) 20));
        this.m = maz.b(new yw9(a(), new vls((byte) 18), (byte) 20));
        this.n = maz.b(new yw9(a(), new Function1(this) { // from class: a.hit
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                boolean z = false;
                pg4 pg4Var = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = pg4Var.m;
                        n0o0 n0o0Var2 = pg4Var.l;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (((Boolean) ((fee) pg4Var.g.getValue()).c()).booleanValue() && kotlin.text.b.i((String) ((fee) n0o0Var2.getValue()).b()) != null && kotlin.text.b.i((String) ((fee) n0o0Var.getValue()).b()) != null) {
                            Double dI = kotlin.text.b.i((String) ((fee) n0o0Var2.getValue()).b());
                            double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                            Double dI2 = kotlin.text.b.i(((zo80) feeVar.c()).f44708a);
                            if (dDoubleValue >= (dI2 != null ? dI2.doubleValue() : 0.0d)) {
                                Double dI3 = kotlin.text.b.i((String) ((fee) n0o0Var.getValue()).b());
                                double dDoubleValue2 = dI3 != null ? dI3.doubleValue() : 0.0d;
                                Double dI4 = kotlin.text.b.i((String) ((fee) n0o0Var2.getValue()).b());
                                if (dDoubleValue2 > (dI4 != null ? dI4.doubleValue() : 0.0d)) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        int i = ((zo80) feeVar2.c()).d.b;
                        ctf0 ctf0Var2 = pg4Var.b;
                        return i != 0 ? ctf0Var2.b.a(R.string.time_before_start, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.choise_time_before_start, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        this.o = maz.b(new yw9(a(), new vls((byte) 19), (byte) 20));
        this.p = maz.b(new yw9(a(), new vls((byte) 20), (byte) 20));
        this.q = maz.b(new yw9(a(), new vls((byte) 21), (byte) 20));
        this.r = maz.b(new yw9((fee) n0o0VarH2.getValue(), new vls((byte) 22), (byte) 20));
        this.s = maz.b(new yw9(a(), new Function1(this) { // from class: a.hit
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                boolean z = false;
                pg4 pg4Var = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = pg4Var.m;
                        n0o0 n0o0Var2 = pg4Var.l;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        if (((Boolean) ((fee) pg4Var.g.getValue()).c()).booleanValue() && kotlin.text.b.i((String) ((fee) n0o0Var2.getValue()).b()) != null && kotlin.text.b.i((String) ((fee) n0o0Var.getValue()).b()) != null) {
                            Double dI = kotlin.text.b.i((String) ((fee) n0o0Var2.getValue()).b());
                            double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                            Double dI2 = kotlin.text.b.i(((zo80) feeVar.c()).f44708a);
                            if (dDoubleValue >= (dI2 != null ? dI2.doubleValue() : 0.0d)) {
                                Double dI3 = kotlin.text.b.i((String) ((fee) n0o0Var.getValue()).b());
                                double dDoubleValue2 = dI3 != null ? dI3.doubleValue() : 0.0d;
                                Double dI4 = kotlin.text.b.i((String) ((fee) n0o0Var2.getValue()).b());
                                if (dDoubleValue2 > (dI4 != null ? dI4.doubleValue() : 0.0d)) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        int i = ((zo80) feeVar2.c()).d.b;
                        ctf0 ctf0Var2 = pg4Var.b;
                        return i != 0 ? ctf0Var2.b.a(R.string.time_before_start, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.choise_time_before_start, Arrays.copyOf(new Object[0], 0));
                }
            }
        }, (byte) 20));
        this.t = bkb.H(((fee) n0o0VarH.getValue()).d);
        this.u = maz.b(new yw9(((fee) n0o0VarH2.getValue()).d, new vls((byte) 23), (byte) 20));
    }

    public fee a() {
        return (fee) this.e.getValue();
    }

    public fee b() {
        return (fee) this.c.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        ahz ahzVarV;
        boolean z;
        byte b = this.f26936a;
        n0o0 n0o0Var = this.e;
        n0o0 n0o0Var2 = this.c;
        n0o0 n0o0Var3 = this.q;
        Object obj2 = this.w;
        Object obj3 = this.x;
        n0o0 n0o0Var4 = this.n;
        n0o0 n0o0Var5 = this.f;
        n0o0 n0o0Var6 = this.d;
        n0o0 n0o0Var7 = this.o;
        n0o0 n0o0Var8 = this.l;
        n0o0 n0o0Var9 = this.j;
        n0o0 n0o0Var10 = this.g;
        n0o0 n0o0Var11 = this.h;
        n0o0 n0o0Var12 = this.k;
        n0o0 n0o0Var13 = this.m;
        n0o0 n0o0Var14 = this.i;
        n0o0 n0o0Var15 = this.p;
        switch (b) {
            case 0:
                zf4 zf4Var = (zf4) obj;
                zf4Var.getClass();
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(zf4Var.o));
                fee feeVar = (fee) n0o0Var13.getValue();
                pf4 pf4Var = zf4Var.m;
                feeVar.d(Boolean.valueOf(pf4Var.p));
                b().d(pf4Var);
                ((fee) n0o0Var.getValue()).d(Boolean.valueOf(zf4Var.f44285a));
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(zf4Var.b));
                n0o0 n0o0Var16 = this.u;
                ((fee) n0o0Var16.getValue()).d(zf4Var.c);
                ((fee) n0o0Var10.getValue()).d(Boolean.valueOf(zf4Var.d));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(zf4Var.i));
                ((fee) n0o0Var14.getValue()).d(zf4Var.j);
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(zf4Var.k));
                n0o0 n0o0Var17 = (n0o0) this.v;
                ((fee) n0o0Var17.getValue()).d(zf4Var.e);
                n0o0 n0o0Var18 = (n0o0) obj2;
                ((fee) n0o0Var18.getValue()).d(zf4Var.g);
                n0o0 n0o0Var19 = (n0o0) obj3;
                ((fee) n0o0Var19.getValue()).d(zf4Var.f);
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(zf4Var.n));
                return new ng4(((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var15.getValue()).b()).booleanValue(), (List) ((fee) n0o0Var16.getValue()).b(), (s6q0) ((fee) n0o0Var17.getValue()).b(), (s6q0) ((fee) n0o0Var19.getValue()).b(), (inm) ((fee) n0o0Var18.getValue()).b(), (df4) n0o0Var6.getValue(), (wul) ((fee) this.s.getValue()).b(), (wul) ((fee) this.r.getValue()).b(), (wul) ((fee) n0o0Var7.getValue()).b(), (if4) ((fee) n0o0Var3.getValue()).b(), (ne4) ((fee) this.t.getValue()).b(), ((y3d) ((fee) n0o0Var4.getValue()).b()).f41946a);
            case 1:
                zht zhtVar = (zht) obj;
                zhtVar.getClass();
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(zhtVar.f));
                ((fee) n0o0Var6.getValue()).d(Boolean.valueOf(zhtVar.g));
                a().d(zhtVar.f44409a);
                ((fee) n0o0Var5.getValue()).d(zhtVar.b);
                ((fee) n0o0Var10.getValue()).d(Boolean.valueOf(zhtVar.c));
                ((fee) n0o0Var11.getValue()).d(zhtVar.h);
                ((fee) n0o0Var14.getValue()).d(zhtVar.i);
                ((fee) n0o0Var9.getValue()).d(zhtVar.d);
                ((fee) n0o0Var12.getValue()).d(zhtVar.e);
                return new git(((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var6.getValue()).c()).booleanValue(), (mdm) obj3, (String) ((fee) n0o0Var8.getValue()).b(), (String) ((fee) n0o0Var13.getValue()).b(), (String) ((fee) n0o0Var7.getValue()).b(), (String) ((fee) n0o0Var15.getValue()).b(), (String) ((fee) n0o0Var3.getValue()).b(), ((Boolean) ((fee) n0o0Var4.getValue()).b()).booleanValue(), ((Boolean) ((l7m0) ((fee) this.t.getValue()).c()).getValue()).booleanValue(), (List) ((fee) this.u.getValue()).b(), dyb.o0((Iterable) ((fee) n0o0Var11.getValue()).c()), dyb.o0((Iterable) ((fee) n0o0Var14.getValue()).c()), ((Boolean) ((fee) this.r.getValue()).b()).booleanValue(), ((List) this.v).isEmpty(), (String) ((fee) this.s.getValue()).b(), (yo80) ((fee) n0o0Var9.getValue()).c(), (yo80) ((fee) n0o0Var12.getValue()).c(), (ait) obj2);
            default:
                ihz ihzVar = (ihz) obj;
                ihzVar.getClass();
                fee feeVar2 = (fee) n0o0Var15.getValue();
                feeVar2.getClass();
                pz40 pz40VarA = feeVar2.a();
                ((ypl0) feeVar2.a().getValue()).getClass();
                pz40VarA.setValue(ihzVar.g);
                fee feeVar3 = (fee) n0o0Var14.getValue();
                feeVar3.getClass();
                pz40 pz40VarA2 = feeVar3.a();
                ((Long) feeVar3.a().getValue()).getClass();
                pz40VarA2.setValue(Long.valueOf(ihzVar.b));
                fee feeVar4 = (fee) n0o0Var13.getValue();
                feeVar4.getClass();
                pz40 pz40VarA3 = feeVar4.a();
                ((epe) feeVar4.a().getValue()).getClass();
                pz40VarA3.setValue(ihzVar.f);
                fee feeVar5 = (fee) n0o0Var12.getValue();
                feeVar5.getClass();
                pz40 pz40VarA4 = feeVar5.a();
                ((xhz) feeVar5.a().getValue()).getClass();
                xhz xhzVar = ihzVar.d;
                pz40VarA4.setValue(xhzVar);
                fee feeVar6 = (fee) n0o0Var11.getValue();
                feeVar6.getClass();
                pz40 pz40VarA5 = feeVar6.a();
                ((Integer) feeVar6.a().getValue()).getClass();
                pz40VarA5.setValue(Integer.valueOf(ihzVar.c));
                fee feeVar7 = (fee) n0o0Var2.getValue();
                feeVar7.getClass();
                pz40 pz40VarA6 = feeVar7.a();
                j0g0 j0g0Var = ihzVar.j;
                pz40VarA6.setValue(j0g0Var);
                fee feeVar8 = (fee) n0o0Var10.getValue();
                feeVar8.getClass();
                pz40 pz40VarA7 = feeVar8.a();
                ((Boolean) feeVar8.a().getValue()).getClass();
                boolean z2 = ihzVar.p;
                pz40VarA7.setValue(Boolean.valueOf(z2));
                fee feeVar9 = (fee) n0o0Var9.getValue();
                feeVar9.getClass();
                pz40 pz40VarA8 = feeVar9.a();
                ((Boolean) feeVar9.a().getValue()).getClass();
                boolean z3 = ihzVar.q;
                pz40VarA8.setValue(Boolean.valueOf(z3));
                fee feeVar10 = (fee) n0o0Var8.getValue();
                feeVar10.getClass();
                pz40 pz40VarA9 = feeVar10.a();
                ((qgz) feeVar10.a().getValue()).getClass();
                pz40VarA9.setValue(ihzVar.e);
                fee feeVar11 = (fee) n0o0Var7.getValue();
                feeVar11.getClass();
                pz40 pz40VarA10 = feeVar11.a();
                ((l2h) feeVar11.a().getValue()).getClass();
                pz40VarA10.setValue(ihzVar.i);
                fee feeVar12 = (fee) n0o0Var6.getValue();
                feeVar12.getClass();
                pz40 pz40VarA11 = feeVar12.a();
                j0g0 j0g0Var2 = ihzVar.l;
                pz40VarA11.setValue(j0g0Var2);
                fee feeVar13 = (fee) n0o0Var.getValue();
                feeVar13.getClass();
                pz40 pz40VarA12 = feeVar13.a();
                j0g0 j0g0Var3 = ihzVar.m;
                pz40VarA12.setValue(j0g0Var3);
                fee feeVar14 = (fee) n0o0Var5.getValue();
                feeVar14.getClass();
                pz40 pz40VarA13 = feeVar14.a();
                j0g0 j0g0Var4 = ihzVar.n;
                pz40VarA13.setValue(j0g0Var4);
                fee feeVar15 = (fee) n0o0Var4.getValue();
                feeVar15.getClass();
                pz40 pz40VarA14 = feeVar15.a();
                Pair pair = ihzVar.k;
                pz40VarA14.setValue(pair != null ? (List) pair.b : null);
                g2v g2vVar = (g2v) obj3;
                long j = ((ihz) obj2).f14803a.b;
                long jLongValue = ((Number) ((fee) n0o0Var14.getValue()).c()).longValue();
                mbz mbzVar = new mbz(this, ihzVar, (byte) 3);
                int iOrdinal = xhzVar.ordinal();
                boolean z4 = true;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        j0g0Var = j0g0Var4;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        j0g0Var = jLongValue == 46 ? j0g0Var3 : j0g0Var2;
                    }
                }
                boolean z5 = j0g0Var != null ? j0g0Var.f15681a instanceof g0g0 : false;
                ugz ugzVar = ugz.f35650a;
                if (j0g0Var != null) {
                    Object g0g0Var = j0g0Var.f15681a;
                    if (!(g0g0Var instanceof g0g0)) {
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            g0g0Var = new ahz(ugzVar, (a4x) mbzVar.invoke(), false);
                        } catch (Throwable th) {
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                    }
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = null;
                    }
                    ahzVarV = (ahz) g0g0Var;
                    break;
                } else {
                    ahzVarV = null;
                }
                if (z5) {
                    z = false;
                    ahzVarV = fww.v(g2vVar, j, jLongValue);
                } else {
                    z = false;
                    if (ahzVarV == null && z2) {
                        int i = zgz.f44366a[xhzVar.ordinal()];
                        p8m p8mVar = p8m.f26562a;
                        ahzVarV = i == 1 ? new ahz(ugzVar, dyb.g0(new ufz("LEADERBOARD_SKELETON_KEY_1", n2h.f22800a), new jhz("LEADERBOARD_SKELETON_KEY_2", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_3", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_4", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_5", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_6", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_7", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_8", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_9", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_10", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_KEY_11", 0L, "", false, p8mVar)), true) : new ahz(ugzVar, dyb.g0(new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_1", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_2", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_3", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_4", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_5", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_6", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_7", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_8", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_9", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_10", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_11", 0L, "", false, p8mVar), new jhz("LEADERBOARD_SKELETON_BY_TYPE_KEY_12", 0L, "", false, p8mVar)), true);
                    } else if (ahzVarV != null && ahzVarV.b.isEmpty()) {
                        ahzVarV = new ahz(new vgz(jLongValue, g2v.b(g2vVar, ozb.N(j, jLongValue), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)));
                    } else if (ahzVarV == null) {
                        ahzVarV = fww.v(g2vVar, j, jLongValue);
                    }
                }
                zbk zbkVar = ((fee) n0o0Var3.getValue()).e;
                boolean z6 = ihzVar.o;
                if (!z3 && (ahzVarV.f899a instanceof vgz)) {
                    z4 = z;
                }
                return new yhz(zbkVar, ahzVarV, z6, z4);
        }
    }

    public pg4(zf4 zf4Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        pf4 pf4Var = zf4Var.m;
        this.c = bkb.H(pf4Var);
        this.d = maz.b(new a13(this, (byte) 25));
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(zf4Var.f44285a));
        this.e = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(zf4Var.b));
        this.f = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(zf4Var.d));
        this.g = n0o0VarH3;
        this.h = bkb.H(Boolean.valueOf(zf4Var.i));
        this.i = bkb.H(zf4Var.j);
        n0o0 n0o0VarH4 = bkb.H(Boolean.valueOf(zf4Var.k));
        this.j = n0o0VarH4;
        this.k = bkb.H(Boolean.valueOf(zf4Var.n));
        n0o0 n0o0VarH5 = bkb.H(Boolean.valueOf(zf4Var.o));
        this.l = n0o0VarH5;
        this.m = bkb.H(Boolean.valueOf(pf4Var.p));
        this.n = bkb.G(b().d, i13.d);
        final byte b2 = 2;
        this.o = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.p = bkb.G(((fee) n0o0VarH.getValue()).d, new or3((byte) 24));
        pz40 pz40Var = ((fee) n0o0VarH4.getValue()).d;
        final byte b3 = 3;
        this.q = bkb.G(pz40Var, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b4 = 4;
        this.r = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b5 = 5;
        this.s = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b6 = 6;
        this.t = bkb.G(((fee) n0o0VarH5.getValue()).d, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.u = maz.b(new yw9(zf4Var.c, new or3((byte) 25), (byte) 20));
        final byte b7 = 7;
        this.v = maz.b(new yw9(zf4Var.e, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.w = maz.b(new yw9(zf4Var.g, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b8 = 1;
        this.x = maz.b(new yw9(zf4Var.f, new Function1(this) { // from class: a.og4
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x02cc  */
            /* JADX WARN: Code duplicated, block: B:13:0x0057 A[PHI: r11
  0x0057: PHI (r11v15 int) = (r11v14 int), (r11v14 int), (r11v13 int), (r11v13 int) binds: [B:25:0x006e, B:21:0x0067, B:16:0x005d, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:148:0x0402  */
            /* JADX WARN: Code duplicated, block: B:155:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:42:0x00d0->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x02d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:3: B:99:0x02c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:94:0x0299  */
            /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 java.lang.Object, still in use, count: 2, list:
                  (r8v18 java.lang.Object) from 0x00ad: PHI (r8 I:??) = (r8v15 java.lang.Object), (r8v18 java.lang.Object) binds: [B:34:0x00ac, B:151:0x00ad] A[DONT_GENERATE, DONT_INLINE]
                  (r8v18 java.lang.Object) from 0x00a5: CHECK_CAST (a.lh4) (r8v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 1066
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.og4.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00db  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    public pg4(ihz ihzVar, g2v g2vVar, ctf0 ctf0Var) {
        yyg yygVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        final byte b = 2;
        ctf0Var.getClass();
        this.w = ihzVar;
        this.x = g2vVar;
        this.b = ctf0Var;
        j0g0 j0g0Var = ihzVar.j;
        this.c = bkb.H(j0g0Var);
        j0g0 j0g0Var2 = ihzVar.l;
        this.d = bkb.H(j0g0Var2);
        j0g0 j0g0Var3 = ihzVar.m;
        this.e = bkb.H(j0g0Var3);
        j0g0 j0g0Var4 = ihzVar.n;
        this.f = bkb.H(j0g0Var4);
        this.g = bkb.H(Boolean.valueOf(ihzVar.p));
        this.h = bkb.H(Integer.valueOf(ihzVar.c));
        this.i = bkb.H(Long.valueOf(ihzVar.f14803a.f46564a));
        this.j = bkb.H(Boolean.valueOf(ihzVar.q));
        this.k = bkb.H(ihzVar.d);
        this.l = bkb.H(ihzVar.e);
        this.m = bkb.H(ihzVar.f);
        Pair pair = ihzVar.k;
        this.n = bkb.H(pair != null ? (List) pair.b : null);
        this.o = bkb.H(ihzVar.i);
        this.p = bkb.H(ihzVar.g);
        this.q = maz.b(new yw9(null, new caz(this, (byte) 2), (byte) 20));
        if (j0g0Var != null) {
            Object obj5 = j0g0Var.f15681a;
            yygVar = (yyg) (obj5 instanceof g0g0 ? null : obj5);
        } else {
            yygVar = null;
        }
        final byte b2 = 0;
        this.r = maz.b(new yw9(yygVar, new Function1(this) { // from class: a.zhz
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:110:0x02ca  */
            /* JADX WARN: Code duplicated, block: B:11:0x003c  */
            /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:144:0x0386  */
            /* JADX WARN: Code duplicated, block: B:145:0x0389  */
            /* JADX WARN: Code duplicated, block: B:25:0x0094  */
            /* JADX WARN: Code duplicated, block: B:42:0x0114  */
            /* JADX WARN: Code duplicated, block: B:56:0x0167  */
            /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:87:0x023c  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                Iterable iterable;
                boolean z;
                String str;
                String str2;
                Iterable iterable2;
                Iterable iterable3;
                Iterable iterable4;
                byte b3 = b2;
                String str3 = "%,d$";
                String str4 = "$%,d";
                String str5 = "%s/playerlogo/%s";
                pg4 pg4Var = this.b;
                boolean z2 = false;
                switch (b3) {
                    case 0:
                        j0g0 j0g0Var5 = (j0g0) ((fee) pg4Var.c.getValue()).d.getValue();
                        if (j0g0Var5 != null) {
                            Object obj7 = j0g0Var5.f15681a;
                            if (obj7 instanceof g0g0) {
                                obj7 = null;
                            }
                            yyg yygVar2 = (yyg) obj7;
                            if (yygVar2 != null) {
                                b0h b0hVar = yygVar2.b;
                                ctf0 ctf0Var2 = pg4Var.b;
                                l2h l2hVar = (l2h) ((fee) pg4Var.o.getValue()).c();
                                l2hVar.getClass();
                                ctf0Var2.getClass();
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA = lsm0Var.a(R.string.leader_board_total_awarded, Arrays.copyOf(new Object[0], 0));
                                long j = b0hVar.d;
                                long j2 = b0hVar.f1764a;
                                long j3 = b0hVar.b;
                                long j4 = b0hVar.c;
                                boolean z3 = b0hVar.f;
                                return new ufz("ANALYTICS_CARD_KEY", new m2h(new i2h(new tfz(strA, zvw.a0(j, z3 ? "$%,d" : "%,d$")), dyb.g0(Float.valueOf(j4), Float.valueOf(j3), Float.valueOf(j2)), new g2h(new h2h("1", lsm0Var.a(R.string.leader_board_online, Arrays.copyOf(new Object[0], 0)), zvw.a0(j4, z3 ? "$%,d" : "%,d$")), new h2h("2", lsm0Var.a(R.string.leader_board_offline, Arrays.copyOf(new Object[0], 0)), zvw.a0(j3, z3 ? "$%,d" : "%,d$")), new h2h("3", lsm0Var.a(R.string.leader_board_mixed, Arrays.copyOf(new Object[0], 0)), zvw.a0(j2, z3 ? "$%,d" : "%,d$")), lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0))), l2hVar)));
                            }
                        }
                        return null;
                    case 1:
                        ((List) obj6).getClass();
                        n0o0 n0o0Var = pg4Var.c;
                        j0g0 j0g0Var6 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var6 != null) {
                            Object obj8 = j0g0Var6.f15681a;
                            if (obj8 instanceof g0g0) {
                                obj8 = null;
                            }
                            yyg yygVar3 = (yyg) obj8;
                            if (yygVar3 == null || (iterable = yygVar3.f43464a) == null) {
                                iterable = iun.f15405a;
                            }
                        } else {
                            iterable = iun.f15405a;
                        }
                        j0g0 j0g0Var7 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var7 != null) {
                            Object obj9 = j0g0Var7.f15681a;
                            if (obj9 instanceof g0g0) {
                                obj9 = null;
                            }
                            yyg yygVar4 = (yyg) obj9;
                            if (yygVar4 == null || !yygVar4.d) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        iterable.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        Iterator it = iterable.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            vzg vzgVar = (vzg) next;
                            long j5 = vzgVar.f38297a;
                            String str6 = vzgVar.d;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(j5);
                            String string = sb.toString();
                            long j6 = i;
                            Iterator it2 = it;
                            String str7 = str3;
                            long j7 = j6 + vzgVar.f38297a;
                            String str8 = vzgVar.e;
                            String str9 = str4;
                            if (kotlin.text.c.x(str8, ujn.h, false)) {
                                str = str8;
                            } else {
                                if (str8.length() != 0) {
                                    List list = u0d.f34849a;
                                    if (!u0d.c(str8)) {
                                        str5 = str5;
                                        str = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : str5, Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                                    }
                                    w8m w8mVar = new w8m(str6, new n0x(str), v8m.f36992a);
                                    String strValueOf = String.valueOf(i2);
                                    long j8 = vzgVar.f;
                                    if (z) {
                                        str2 = str9;
                                    } else {
                                        str2 = str7;
                                    }
                                    String strReplace = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1)).replace(',', '.');
                                    strReplace.getClass();
                                    arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar, strValueOf, new r8m(strReplace)))));
                                    it = it2;
                                    str3 = str7;
                                    i = i2;
                                    str4 = str9;
                                    str5 = str5;
                                }
                                str = "";
                            }
                            w8m w8mVar2 = new w8m(str6, new n0x(str), v8m.f36992a);
                            String strValueOf2 = String.valueOf(i2);
                            long j9 = vzgVar.f;
                            if (z) {
                                str2 = str9;
                            } else {
                                str2 = str7;
                            }
                            String strReplace2 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j9)}, 1)).replace(',', '.');
                            strReplace2.getClass();
                            arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar2, strValueOf2, new r8m(strReplace2)))));
                            it = it2;
                            str3 = str7;
                            i = i2;
                            str4 = str9;
                            str5 = str5;
                        }
                        return arrayList;
                    case 2:
                        ((List) obj6).getClass();
                        j0g0 j0g0Var8 = (j0g0) ((fee) pg4Var.d.getValue()).d.getValue();
                        if (j0g0Var8 != null) {
                            Object obj10 = j0g0Var8.f15681a;
                            if (obj10 instanceof g0g0) {
                                obj10 = null;
                            }
                            iterable2 = (List) obj10;
                            if (iterable2 == null) {
                                iterable2 = iun.f15405a;
                            }
                        } else {
                            iterable2 = iun.f15405a;
                        }
                        iterable2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                        Iterator it3 = iterable2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fal falVar = (fal) next2;
                            String str10 = falVar.c;
                            String str11 = falVar.c;
                            String strI = f140.i(i3, str10);
                            long j10 = ((long) i3) + falVar.f9213a;
                            String str12 = falVar.b;
                            if (!kotlin.text.c.x(str12, ujn.h, false)) {
                                if (str12.length() == 0) {
                                    str12 = "";
                                } else {
                                    List list2 = u0d.f34849a;
                                    if (u0d.c(str12)) {
                                        str12 = "";
                                    } else {
                                        str12 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                                    }
                                }
                            }
                            o8m o8mVar = new o8m(new m8m(j10, new w8m(str11, new n0x(str12), v8m.f36992a), String.valueOf(i4), new r8m(String.valueOf(falVar.d))));
                            long j11 = falVar.f9213a;
                            arrayList2.add(new jhz(strI, j11, str11, j11 != 0, o8mVar));
                            it3 = it3;
                            i3 = i4;
                        }
                        return arrayList2;
                    case 3:
                        ((List) obj6).getClass();
                        j0g0 j0g0Var9 = (j0g0) ((fee) pg4Var.e.getValue()).d.getValue();
                        if (j0g0Var9 != null) {
                            Object obj11 = j0g0Var9.f15681a;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            iterable3 = (List) obj11;
                            if (iterable3 == null) {
                                iterable3 = iun.f15405a;
                            }
                        } else {
                            iterable3 = iun.f15405a;
                        }
                        iterable3.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                        Iterator it4 = iterable3.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            gyg gygVar = (gyg) next3;
                            String str13 = gygVar.b;
                            String str14 = gygVar.b;
                            String strI2 = f140.i(i5, str13);
                            long j12 = ((long) i5) + gygVar.f12127a;
                            String str15 = gygVar.c;
                            if (!kotlin.text.c.x(str15, ujn.h, false)) {
                                if (str15.length() == 0) {
                                    str15 = "";
                                } else {
                                    List list3 = u0d.f34849a;
                                    if (u0d.c(str15)) {
                                        str15 = "";
                                    } else {
                                        str15 = String.format(Locale.ENGLISH, StringsKt.O(str15, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str15}, 2));
                                    }
                                }
                            }
                            arrayList3.add(new jhz(strI2, gygVar.f12127a, str14, true, new o8m(new m8m(j12, new w8m(str14, new n0x(str15), v8m.f36992a), String.valueOf(i6), new r8m(String.valueOf(gygVar.e))))));
                            it4 = it4;
                            i5 = i6;
                        }
                        return arrayList3;
                    default:
                        ((List) obj6).getClass();
                        j0g0 j0g0Var10 = (j0g0) ((fee) pg4Var.f.getValue()).d.getValue();
                        if (j0g0Var10 != null) {
                            Object obj12 = j0g0Var10.f15681a;
                            if (obj12 instanceof g0g0) {
                                obj12 = null;
                            }
                            iterable4 = (List) obj12;
                            if (iterable4 == null) {
                                iterable4 = iun.f15405a;
                            }
                        } else {
                            iterable4 = iun.f15405a;
                        }
                        iterable4.getClass();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                        Iterator it5 = iterable4.iterator();
                        int i7 = 0;
                        while (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            v5l v5lVar = (v5l) next4;
                            String strI3 = f140.i(i7, v5lVar.c);
                            long j13 = ((long) i7) + v5lVar.e;
                            String str16 = v5lVar.c;
                            String str17 = v5lVar.d;
                            if (!kotlin.text.c.x(str17, ujn.h, z2)) {
                                if (str17.length() == 0) {
                                    str17 = "";
                                } else {
                                    List list4 = u0d.f34849a;
                                    if (u0d.c(str17)) {
                                        str17 = "";
                                    } else {
                                        str17 = String.format(Locale.ENGLISH, StringsKt.O(str17, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str17}, 2));
                                    }
                                }
                            }
                            arrayList4.add(new mgz(strI3, new o8m(new m8m(j13, new w8m(str16, new n0x(str17), v8m.b), String.valueOf(i8), new s8m(new n0x(v5lVar.g))))));
                            i7 = i8;
                            it5 = it5;
                            z2 = false;
                        }
                        return arrayList4;
                }
            }
        }, (byte) 20));
        if (j0g0Var != null) {
            Object obj6 = j0g0Var.f15681a;
            yyg yygVar2 = (yyg) (obj6 instanceof g0g0 ? null : obj6);
            obj = (yygVar2 == null || (obj = yygVar2.f43464a) == null) ? iun.f15405a : obj;
        }
        final byte b3 = 1;
        this.s = maz.b(new yw9(obj, new Function1(this) { // from class: a.zhz
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:110:0x02ca  */
            /* JADX WARN: Code duplicated, block: B:11:0x003c  */
            /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:144:0x0386  */
            /* JADX WARN: Code duplicated, block: B:145:0x0389  */
            /* JADX WARN: Code duplicated, block: B:25:0x0094  */
            /* JADX WARN: Code duplicated, block: B:42:0x0114  */
            /* JADX WARN: Code duplicated, block: B:56:0x0167  */
            /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:87:0x023c  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj7) {
                Iterable iterable;
                boolean z;
                String str;
                String str2;
                Iterable iterable2;
                Iterable iterable3;
                Iterable iterable4;
                byte b4 = b3;
                String str3 = "%,d$";
                String str4 = "$%,d";
                String str5 = "%s/playerlogo/%s";
                pg4 pg4Var = this.b;
                boolean z2 = false;
                switch (b4) {
                    case 0:
                        j0g0 j0g0Var5 = (j0g0) ((fee) pg4Var.c.getValue()).d.getValue();
                        if (j0g0Var5 != null) {
                            Object obj8 = j0g0Var5.f15681a;
                            if (obj8 instanceof g0g0) {
                                obj8 = null;
                            }
                            yyg yygVar3 = (yyg) obj8;
                            if (yygVar3 != null) {
                                b0h b0hVar = yygVar3.b;
                                ctf0 ctf0Var2 = pg4Var.b;
                                l2h l2hVar = (l2h) ((fee) pg4Var.o.getValue()).c();
                                l2hVar.getClass();
                                ctf0Var2.getClass();
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA = lsm0Var.a(R.string.leader_board_total_awarded, Arrays.copyOf(new Object[0], 0));
                                long j = b0hVar.d;
                                long j2 = b0hVar.f1764a;
                                long j3 = b0hVar.b;
                                long j4 = b0hVar.c;
                                boolean z3 = b0hVar.f;
                                return new ufz("ANALYTICS_CARD_KEY", new m2h(new i2h(new tfz(strA, zvw.a0(j, z3 ? "$%,d" : "%,d$")), dyb.g0(Float.valueOf(j4), Float.valueOf(j3), Float.valueOf(j2)), new g2h(new h2h("1", lsm0Var.a(R.string.leader_board_online, Arrays.copyOf(new Object[0], 0)), zvw.a0(j4, z3 ? "$%,d" : "%,d$")), new h2h("2", lsm0Var.a(R.string.leader_board_offline, Arrays.copyOf(new Object[0], 0)), zvw.a0(j3, z3 ? "$%,d" : "%,d$")), new h2h("3", lsm0Var.a(R.string.leader_board_mixed, Arrays.copyOf(new Object[0], 0)), zvw.a0(j2, z3 ? "$%,d" : "%,d$")), lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0))), l2hVar)));
                            }
                        }
                        return null;
                    case 1:
                        ((List) obj7).getClass();
                        n0o0 n0o0Var = pg4Var.c;
                        j0g0 j0g0Var6 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var6 != null) {
                            Object obj9 = j0g0Var6.f15681a;
                            if (obj9 instanceof g0g0) {
                                obj9 = null;
                            }
                            yyg yygVar4 = (yyg) obj9;
                            if (yygVar4 == null || (iterable = yygVar4.f43464a) == null) {
                                iterable = iun.f15405a;
                            }
                        } else {
                            iterable = iun.f15405a;
                        }
                        j0g0 j0g0Var7 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var7 != null) {
                            Object obj10 = j0g0Var7.f15681a;
                            if (obj10 instanceof g0g0) {
                                obj10 = null;
                            }
                            yyg yygVar5 = (yyg) obj10;
                            if (yygVar5 == null || !yygVar5.d) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        iterable.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        Iterator it = iterable.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            vzg vzgVar = (vzg) next;
                            long j5 = vzgVar.f38297a;
                            String str6 = vzgVar.d;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(j5);
                            String string = sb.toString();
                            long j6 = i;
                            Iterator it2 = it;
                            String str7 = str3;
                            long j7 = j6 + vzgVar.f38297a;
                            String str8 = vzgVar.e;
                            String str9 = str4;
                            if (kotlin.text.c.x(str8, ujn.h, false)) {
                                str = str8;
                            } else {
                                if (str8.length() != 0) {
                                    List list = u0d.f34849a;
                                    if (!u0d.c(str8)) {
                                        str5 = str5;
                                        str = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : str5, Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                                    }
                                    w8m w8mVar2 = new w8m(str6, new n0x(str), v8m.f36992a);
                                    String strValueOf2 = String.valueOf(i2);
                                    long j9 = vzgVar.f;
                                    if (z) {
                                        str2 = str9;
                                    } else {
                                        str2 = str7;
                                    }
                                    String strReplace2 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j9)}, 1)).replace(',', '.');
                                    strReplace2.getClass();
                                    arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar2, strValueOf2, new r8m(strReplace2)))));
                                    it = it2;
                                    str3 = str7;
                                    i = i2;
                                    str4 = str9;
                                    str5 = str5;
                                }
                                str = "";
                            }
                            w8m w8mVar3 = new w8m(str6, new n0x(str), v8m.f36992a);
                            String strValueOf3 = String.valueOf(i2);
                            long j10 = vzgVar.f;
                            if (z) {
                                str2 = str9;
                            } else {
                                str2 = str7;
                            }
                            String strReplace3 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1)).replace(',', '.');
                            strReplace3.getClass();
                            arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar3, strValueOf3, new r8m(strReplace3)))));
                            it = it2;
                            str3 = str7;
                            i = i2;
                            str4 = str9;
                            str5 = str5;
                        }
                        return arrayList;
                    case 2:
                        ((List) obj7).getClass();
                        j0g0 j0g0Var8 = (j0g0) ((fee) pg4Var.d.getValue()).d.getValue();
                        if (j0g0Var8 != null) {
                            Object obj11 = j0g0Var8.f15681a;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            iterable2 = (List) obj11;
                            if (iterable2 == null) {
                                iterable2 = iun.f15405a;
                            }
                        } else {
                            iterable2 = iun.f15405a;
                        }
                        iterable2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                        Iterator it3 = iterable2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fal falVar = (fal) next2;
                            String str10 = falVar.c;
                            String str11 = falVar.c;
                            String strI = f140.i(i3, str10);
                            long j11 = ((long) i3) + falVar.f9213a;
                            String str12 = falVar.b;
                            if (!kotlin.text.c.x(str12, ujn.h, false)) {
                                if (str12.length() == 0) {
                                    str12 = "";
                                } else {
                                    List list2 = u0d.f34849a;
                                    if (u0d.c(str12)) {
                                        str12 = "";
                                    } else {
                                        str12 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                                    }
                                }
                            }
                            o8m o8mVar = new o8m(new m8m(j11, new w8m(str11, new n0x(str12), v8m.f36992a), String.valueOf(i4), new r8m(String.valueOf(falVar.d))));
                            long j12 = falVar.f9213a;
                            arrayList2.add(new jhz(strI, j12, str11, j12 != 0, o8mVar));
                            it3 = it3;
                            i3 = i4;
                        }
                        return arrayList2;
                    case 3:
                        ((List) obj7).getClass();
                        j0g0 j0g0Var9 = (j0g0) ((fee) pg4Var.e.getValue()).d.getValue();
                        if (j0g0Var9 != null) {
                            Object obj12 = j0g0Var9.f15681a;
                            if (obj12 instanceof g0g0) {
                                obj12 = null;
                            }
                            iterable3 = (List) obj12;
                            if (iterable3 == null) {
                                iterable3 = iun.f15405a;
                            }
                        } else {
                            iterable3 = iun.f15405a;
                        }
                        iterable3.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                        Iterator it4 = iterable3.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            gyg gygVar = (gyg) next3;
                            String str13 = gygVar.b;
                            String str14 = gygVar.b;
                            String strI2 = f140.i(i5, str13);
                            long j13 = ((long) i5) + gygVar.f12127a;
                            String str15 = gygVar.c;
                            if (!kotlin.text.c.x(str15, ujn.h, false)) {
                                if (str15.length() == 0) {
                                    str15 = "";
                                } else {
                                    List list3 = u0d.f34849a;
                                    if (u0d.c(str15)) {
                                        str15 = "";
                                    } else {
                                        str15 = String.format(Locale.ENGLISH, StringsKt.O(str15, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str15}, 2));
                                    }
                                }
                            }
                            arrayList3.add(new jhz(strI2, gygVar.f12127a, str14, true, new o8m(new m8m(j13, new w8m(str14, new n0x(str15), v8m.f36992a), String.valueOf(i6), new r8m(String.valueOf(gygVar.e))))));
                            it4 = it4;
                            i5 = i6;
                        }
                        return arrayList3;
                    default:
                        ((List) obj7).getClass();
                        j0g0 j0g0Var10 = (j0g0) ((fee) pg4Var.f.getValue()).d.getValue();
                        if (j0g0Var10 != null) {
                            Object obj13 = j0g0Var10.f15681a;
                            if (obj13 instanceof g0g0) {
                                obj13 = null;
                            }
                            iterable4 = (List) obj13;
                            if (iterable4 == null) {
                                iterable4 = iun.f15405a;
                            }
                        } else {
                            iterable4 = iun.f15405a;
                        }
                        iterable4.getClass();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                        Iterator it5 = iterable4.iterator();
                        int i7 = 0;
                        while (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            v5l v5lVar = (v5l) next4;
                            String strI3 = f140.i(i7, v5lVar.c);
                            long j14 = ((long) i7) + v5lVar.e;
                            String str16 = v5lVar.c;
                            String str17 = v5lVar.d;
                            if (!kotlin.text.c.x(str17, ujn.h, z2)) {
                                if (str17.length() == 0) {
                                    str17 = "";
                                } else {
                                    List list4 = u0d.f34849a;
                                    if (u0d.c(str17)) {
                                        str17 = "";
                                    } else {
                                        str17 = String.format(Locale.ENGLISH, StringsKt.O(str17, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str17}, 2));
                                    }
                                }
                            }
                            arrayList4.add(new mgz(strI3, new o8m(new m8m(j14, new w8m(str16, new n0x(str17), v8m.b), String.valueOf(i8), new s8m(new n0x(v5lVar.g))))));
                            i7 = i8;
                            it5 = it5;
                            z2 = false;
                        }
                        return arrayList4;
                }
            }
        }, (byte) 20));
        if (j0g0Var2 != null) {
            Object obj7 = j0g0Var2.f15681a;
            obj2 = (List) (obj7 instanceof g0g0 ? null : obj7);
            obj2 = obj2 == null ? iun.f15405a : obj2;
        }
        this.t = maz.b(new yw9(obj2, new Function1(this) { // from class: a.zhz
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:110:0x02ca  */
            /* JADX WARN: Code duplicated, block: B:11:0x003c  */
            /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:144:0x0386  */
            /* JADX WARN: Code duplicated, block: B:145:0x0389  */
            /* JADX WARN: Code duplicated, block: B:25:0x0094  */
            /* JADX WARN: Code duplicated, block: B:42:0x0114  */
            /* JADX WARN: Code duplicated, block: B:56:0x0167  */
            /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:87:0x023c  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj8) {
                Iterable iterable;
                boolean z;
                String str;
                String str2;
                Iterable iterable2;
                Iterable iterable3;
                Iterable iterable4;
                byte b4 = b;
                String str3 = "%,d$";
                String str4 = "$%,d";
                String str5 = "%s/playerlogo/%s";
                pg4 pg4Var = this.b;
                boolean z2 = false;
                switch (b4) {
                    case 0:
                        j0g0 j0g0Var5 = (j0g0) ((fee) pg4Var.c.getValue()).d.getValue();
                        if (j0g0Var5 != null) {
                            Object obj9 = j0g0Var5.f15681a;
                            if (obj9 instanceof g0g0) {
                                obj9 = null;
                            }
                            yyg yygVar3 = (yyg) obj9;
                            if (yygVar3 != null) {
                                b0h b0hVar = yygVar3.b;
                                ctf0 ctf0Var2 = pg4Var.b;
                                l2h l2hVar = (l2h) ((fee) pg4Var.o.getValue()).c();
                                l2hVar.getClass();
                                ctf0Var2.getClass();
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA = lsm0Var.a(R.string.leader_board_total_awarded, Arrays.copyOf(new Object[0], 0));
                                long j = b0hVar.d;
                                long j2 = b0hVar.f1764a;
                                long j3 = b0hVar.b;
                                long j4 = b0hVar.c;
                                boolean z3 = b0hVar.f;
                                return new ufz("ANALYTICS_CARD_KEY", new m2h(new i2h(new tfz(strA, zvw.a0(j, z3 ? "$%,d" : "%,d$")), dyb.g0(Float.valueOf(j4), Float.valueOf(j3), Float.valueOf(j2)), new g2h(new h2h("1", lsm0Var.a(R.string.leader_board_online, Arrays.copyOf(new Object[0], 0)), zvw.a0(j4, z3 ? "$%,d" : "%,d$")), new h2h("2", lsm0Var.a(R.string.leader_board_offline, Arrays.copyOf(new Object[0], 0)), zvw.a0(j3, z3 ? "$%,d" : "%,d$")), new h2h("3", lsm0Var.a(R.string.leader_board_mixed, Arrays.copyOf(new Object[0], 0)), zvw.a0(j2, z3 ? "$%,d" : "%,d$")), lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0))), l2hVar)));
                            }
                        }
                        return null;
                    case 1:
                        ((List) obj8).getClass();
                        n0o0 n0o0Var = pg4Var.c;
                        j0g0 j0g0Var6 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var6 != null) {
                            Object obj10 = j0g0Var6.f15681a;
                            if (obj10 instanceof g0g0) {
                                obj10 = null;
                            }
                            yyg yygVar4 = (yyg) obj10;
                            if (yygVar4 == null || (iterable = yygVar4.f43464a) == null) {
                                iterable = iun.f15405a;
                            }
                        } else {
                            iterable = iun.f15405a;
                        }
                        j0g0 j0g0Var7 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var7 != null) {
                            Object obj11 = j0g0Var7.f15681a;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            yyg yygVar5 = (yyg) obj11;
                            if (yygVar5 == null || !yygVar5.d) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        iterable.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        Iterator it = iterable.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            vzg vzgVar = (vzg) next;
                            long j5 = vzgVar.f38297a;
                            String str6 = vzgVar.d;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(j5);
                            String string = sb.toString();
                            long j6 = i;
                            Iterator it2 = it;
                            String str7 = str3;
                            long j7 = j6 + vzgVar.f38297a;
                            String str8 = vzgVar.e;
                            String str9 = str4;
                            if (kotlin.text.c.x(str8, ujn.h, false)) {
                                str = str8;
                            } else {
                                if (str8.length() != 0) {
                                    List list = u0d.f34849a;
                                    if (!u0d.c(str8)) {
                                        str5 = str5;
                                        str = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : str5, Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                                    }
                                    w8m w8mVar3 = new w8m(str6, new n0x(str), v8m.f36992a);
                                    String strValueOf3 = String.valueOf(i2);
                                    long j10 = vzgVar.f;
                                    if (z) {
                                        str2 = str9;
                                    } else {
                                        str2 = str7;
                                    }
                                    String strReplace3 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1)).replace(',', '.');
                                    strReplace3.getClass();
                                    arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar3, strValueOf3, new r8m(strReplace3)))));
                                    it = it2;
                                    str3 = str7;
                                    i = i2;
                                    str4 = str9;
                                    str5 = str5;
                                }
                                str = "";
                            }
                            w8m w8mVar4 = new w8m(str6, new n0x(str), v8m.f36992a);
                            String strValueOf4 = String.valueOf(i2);
                            long j11 = vzgVar.f;
                            if (z) {
                                str2 = str9;
                            } else {
                                str2 = str7;
                            }
                            String strReplace4 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1)).replace(',', '.');
                            strReplace4.getClass();
                            arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar4, strValueOf4, new r8m(strReplace4)))));
                            it = it2;
                            str3 = str7;
                            i = i2;
                            str4 = str9;
                            str5 = str5;
                        }
                        return arrayList;
                    case 2:
                        ((List) obj8).getClass();
                        j0g0 j0g0Var8 = (j0g0) ((fee) pg4Var.d.getValue()).d.getValue();
                        if (j0g0Var8 != null) {
                            Object obj12 = j0g0Var8.f15681a;
                            if (obj12 instanceof g0g0) {
                                obj12 = null;
                            }
                            iterable2 = (List) obj12;
                            if (iterable2 == null) {
                                iterable2 = iun.f15405a;
                            }
                        } else {
                            iterable2 = iun.f15405a;
                        }
                        iterable2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                        Iterator it3 = iterable2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fal falVar = (fal) next2;
                            String str10 = falVar.c;
                            String str11 = falVar.c;
                            String strI = f140.i(i3, str10);
                            long j12 = ((long) i3) + falVar.f9213a;
                            String str12 = falVar.b;
                            if (!kotlin.text.c.x(str12, ujn.h, false)) {
                                if (str12.length() == 0) {
                                    str12 = "";
                                } else {
                                    List list2 = u0d.f34849a;
                                    if (u0d.c(str12)) {
                                        str12 = "";
                                    } else {
                                        str12 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                                    }
                                }
                            }
                            o8m o8mVar = new o8m(new m8m(j12, new w8m(str11, new n0x(str12), v8m.f36992a), String.valueOf(i4), new r8m(String.valueOf(falVar.d))));
                            long j13 = falVar.f9213a;
                            arrayList2.add(new jhz(strI, j13, str11, j13 != 0, o8mVar));
                            it3 = it3;
                            i3 = i4;
                        }
                        return arrayList2;
                    case 3:
                        ((List) obj8).getClass();
                        j0g0 j0g0Var9 = (j0g0) ((fee) pg4Var.e.getValue()).d.getValue();
                        if (j0g0Var9 != null) {
                            Object obj13 = j0g0Var9.f15681a;
                            if (obj13 instanceof g0g0) {
                                obj13 = null;
                            }
                            iterable3 = (List) obj13;
                            if (iterable3 == null) {
                                iterable3 = iun.f15405a;
                            }
                        } else {
                            iterable3 = iun.f15405a;
                        }
                        iterable3.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                        Iterator it4 = iterable3.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            gyg gygVar = (gyg) next3;
                            String str13 = gygVar.b;
                            String str14 = gygVar.b;
                            String strI2 = f140.i(i5, str13);
                            long j14 = ((long) i5) + gygVar.f12127a;
                            String str15 = gygVar.c;
                            if (!kotlin.text.c.x(str15, ujn.h, false)) {
                                if (str15.length() == 0) {
                                    str15 = "";
                                } else {
                                    List list3 = u0d.f34849a;
                                    if (u0d.c(str15)) {
                                        str15 = "";
                                    } else {
                                        str15 = String.format(Locale.ENGLISH, StringsKt.O(str15, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str15}, 2));
                                    }
                                }
                            }
                            arrayList3.add(new jhz(strI2, gygVar.f12127a, str14, true, new o8m(new m8m(j14, new w8m(str14, new n0x(str15), v8m.f36992a), String.valueOf(i6), new r8m(String.valueOf(gygVar.e))))));
                            it4 = it4;
                            i5 = i6;
                        }
                        return arrayList3;
                    default:
                        ((List) obj8).getClass();
                        j0g0 j0g0Var10 = (j0g0) ((fee) pg4Var.f.getValue()).d.getValue();
                        if (j0g0Var10 != null) {
                            Object obj14 = j0g0Var10.f15681a;
                            if (obj14 instanceof g0g0) {
                                obj14 = null;
                            }
                            iterable4 = (List) obj14;
                            if (iterable4 == null) {
                                iterable4 = iun.f15405a;
                            }
                        } else {
                            iterable4 = iun.f15405a;
                        }
                        iterable4.getClass();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                        Iterator it5 = iterable4.iterator();
                        int i7 = 0;
                        while (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            v5l v5lVar = (v5l) next4;
                            String strI3 = f140.i(i7, v5lVar.c);
                            long j15 = ((long) i7) + v5lVar.e;
                            String str16 = v5lVar.c;
                            String str17 = v5lVar.d;
                            if (!kotlin.text.c.x(str17, ujn.h, z2)) {
                                if (str17.length() == 0) {
                                    str17 = "";
                                } else {
                                    List list4 = u0d.f34849a;
                                    if (u0d.c(str17)) {
                                        str17 = "";
                                    } else {
                                        str17 = String.format(Locale.ENGLISH, StringsKt.O(str17, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str17}, 2));
                                    }
                                }
                            }
                            arrayList4.add(new mgz(strI3, new o8m(new m8m(j15, new w8m(str16, new n0x(str17), v8m.b), String.valueOf(i8), new s8m(new n0x(v5lVar.g))))));
                            i7 = i8;
                            it5 = it5;
                            z2 = false;
                        }
                        return arrayList4;
                }
            }
        }, (byte) 20));
        if (j0g0Var3 != null) {
            Object obj8 = j0g0Var3.f15681a;
            obj3 = (List) (obj8 instanceof g0g0 ? null : obj8);
            obj3 = obj3 == null ? iun.f15405a : obj3;
        }
        final byte b4 = 3;
        this.u = maz.b(new yw9(obj3, new Function1(this) { // from class: a.zhz
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:110:0x02ca  */
            /* JADX WARN: Code duplicated, block: B:11:0x003c  */
            /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:144:0x0386  */
            /* JADX WARN: Code duplicated, block: B:145:0x0389  */
            /* JADX WARN: Code duplicated, block: B:25:0x0094  */
            /* JADX WARN: Code duplicated, block: B:42:0x0114  */
            /* JADX WARN: Code duplicated, block: B:56:0x0167  */
            /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:87:0x023c  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj9) {
                Iterable iterable;
                boolean z;
                String str;
                String str2;
                Iterable iterable2;
                Iterable iterable3;
                Iterable iterable4;
                byte b5 = b4;
                String str3 = "%,d$";
                String str4 = "$%,d";
                String str5 = "%s/playerlogo/%s";
                pg4 pg4Var = this.b;
                boolean z2 = false;
                switch (b5) {
                    case 0:
                        j0g0 j0g0Var5 = (j0g0) ((fee) pg4Var.c.getValue()).d.getValue();
                        if (j0g0Var5 != null) {
                            Object obj10 = j0g0Var5.f15681a;
                            if (obj10 instanceof g0g0) {
                                obj10 = null;
                            }
                            yyg yygVar3 = (yyg) obj10;
                            if (yygVar3 != null) {
                                b0h b0hVar = yygVar3.b;
                                ctf0 ctf0Var2 = pg4Var.b;
                                l2h l2hVar = (l2h) ((fee) pg4Var.o.getValue()).c();
                                l2hVar.getClass();
                                ctf0Var2.getClass();
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA = lsm0Var.a(R.string.leader_board_total_awarded, Arrays.copyOf(new Object[0], 0));
                                long j = b0hVar.d;
                                long j2 = b0hVar.f1764a;
                                long j3 = b0hVar.b;
                                long j4 = b0hVar.c;
                                boolean z3 = b0hVar.f;
                                return new ufz("ANALYTICS_CARD_KEY", new m2h(new i2h(new tfz(strA, zvw.a0(j, z3 ? "$%,d" : "%,d$")), dyb.g0(Float.valueOf(j4), Float.valueOf(j3), Float.valueOf(j2)), new g2h(new h2h("1", lsm0Var.a(R.string.leader_board_online, Arrays.copyOf(new Object[0], 0)), zvw.a0(j4, z3 ? "$%,d" : "%,d$")), new h2h("2", lsm0Var.a(R.string.leader_board_offline, Arrays.copyOf(new Object[0], 0)), zvw.a0(j3, z3 ? "$%,d" : "%,d$")), new h2h("3", lsm0Var.a(R.string.leader_board_mixed, Arrays.copyOf(new Object[0], 0)), zvw.a0(j2, z3 ? "$%,d" : "%,d$")), lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0))), l2hVar)));
                            }
                        }
                        return null;
                    case 1:
                        ((List) obj9).getClass();
                        n0o0 n0o0Var = pg4Var.c;
                        j0g0 j0g0Var6 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var6 != null) {
                            Object obj11 = j0g0Var6.f15681a;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            yyg yygVar4 = (yyg) obj11;
                            if (yygVar4 == null || (iterable = yygVar4.f43464a) == null) {
                                iterable = iun.f15405a;
                            }
                        } else {
                            iterable = iun.f15405a;
                        }
                        j0g0 j0g0Var7 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var7 != null) {
                            Object obj12 = j0g0Var7.f15681a;
                            if (obj12 instanceof g0g0) {
                                obj12 = null;
                            }
                            yyg yygVar5 = (yyg) obj12;
                            if (yygVar5 == null || !yygVar5.d) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        iterable.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        Iterator it = iterable.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            vzg vzgVar = (vzg) next;
                            long j5 = vzgVar.f38297a;
                            String str6 = vzgVar.d;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(j5);
                            String string = sb.toString();
                            long j6 = i;
                            Iterator it2 = it;
                            String str7 = str3;
                            long j7 = j6 + vzgVar.f38297a;
                            String str8 = vzgVar.e;
                            String str9 = str4;
                            if (kotlin.text.c.x(str8, ujn.h, false)) {
                                str = str8;
                            } else {
                                if (str8.length() != 0) {
                                    List list = u0d.f34849a;
                                    if (!u0d.c(str8)) {
                                        str5 = str5;
                                        str = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : str5, Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                                    }
                                    w8m w8mVar4 = new w8m(str6, new n0x(str), v8m.f36992a);
                                    String strValueOf4 = String.valueOf(i2);
                                    long j11 = vzgVar.f;
                                    if (z) {
                                        str2 = str9;
                                    } else {
                                        str2 = str7;
                                    }
                                    String strReplace4 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1)).replace(',', '.');
                                    strReplace4.getClass();
                                    arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar4, strValueOf4, new r8m(strReplace4)))));
                                    it = it2;
                                    str3 = str7;
                                    i = i2;
                                    str4 = str9;
                                    str5 = str5;
                                }
                                str = "";
                            }
                            w8m w8mVar5 = new w8m(str6, new n0x(str), v8m.f36992a);
                            String strValueOf5 = String.valueOf(i2);
                            long j12 = vzgVar.f;
                            if (z) {
                                str2 = str9;
                            } else {
                                str2 = str7;
                            }
                            String strReplace5 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1)).replace(',', '.');
                            strReplace5.getClass();
                            arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar5, strValueOf5, new r8m(strReplace5)))));
                            it = it2;
                            str3 = str7;
                            i = i2;
                            str4 = str9;
                            str5 = str5;
                        }
                        return arrayList;
                    case 2:
                        ((List) obj9).getClass();
                        j0g0 j0g0Var8 = (j0g0) ((fee) pg4Var.d.getValue()).d.getValue();
                        if (j0g0Var8 != null) {
                            Object obj13 = j0g0Var8.f15681a;
                            if (obj13 instanceof g0g0) {
                                obj13 = null;
                            }
                            iterable2 = (List) obj13;
                            if (iterable2 == null) {
                                iterable2 = iun.f15405a;
                            }
                        } else {
                            iterable2 = iun.f15405a;
                        }
                        iterable2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                        Iterator it3 = iterable2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fal falVar = (fal) next2;
                            String str10 = falVar.c;
                            String str11 = falVar.c;
                            String strI = f140.i(i3, str10);
                            long j13 = ((long) i3) + falVar.f9213a;
                            String str12 = falVar.b;
                            if (!kotlin.text.c.x(str12, ujn.h, false)) {
                                if (str12.length() == 0) {
                                    str12 = "";
                                } else {
                                    List list2 = u0d.f34849a;
                                    if (u0d.c(str12)) {
                                        str12 = "";
                                    } else {
                                        str12 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                                    }
                                }
                            }
                            o8m o8mVar = new o8m(new m8m(j13, new w8m(str11, new n0x(str12), v8m.f36992a), String.valueOf(i4), new r8m(String.valueOf(falVar.d))));
                            long j14 = falVar.f9213a;
                            arrayList2.add(new jhz(strI, j14, str11, j14 != 0, o8mVar));
                            it3 = it3;
                            i3 = i4;
                        }
                        return arrayList2;
                    case 3:
                        ((List) obj9).getClass();
                        j0g0 j0g0Var9 = (j0g0) ((fee) pg4Var.e.getValue()).d.getValue();
                        if (j0g0Var9 != null) {
                            Object obj14 = j0g0Var9.f15681a;
                            if (obj14 instanceof g0g0) {
                                obj14 = null;
                            }
                            iterable3 = (List) obj14;
                            if (iterable3 == null) {
                                iterable3 = iun.f15405a;
                            }
                        } else {
                            iterable3 = iun.f15405a;
                        }
                        iterable3.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                        Iterator it4 = iterable3.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            gyg gygVar = (gyg) next3;
                            String str13 = gygVar.b;
                            String str14 = gygVar.b;
                            String strI2 = f140.i(i5, str13);
                            long j15 = ((long) i5) + gygVar.f12127a;
                            String str15 = gygVar.c;
                            if (!kotlin.text.c.x(str15, ujn.h, false)) {
                                if (str15.length() == 0) {
                                    str15 = "";
                                } else {
                                    List list3 = u0d.f34849a;
                                    if (u0d.c(str15)) {
                                        str15 = "";
                                    } else {
                                        str15 = String.format(Locale.ENGLISH, StringsKt.O(str15, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str15}, 2));
                                    }
                                }
                            }
                            arrayList3.add(new jhz(strI2, gygVar.f12127a, str14, true, new o8m(new m8m(j15, new w8m(str14, new n0x(str15), v8m.f36992a), String.valueOf(i6), new r8m(String.valueOf(gygVar.e))))));
                            it4 = it4;
                            i5 = i6;
                        }
                        return arrayList3;
                    default:
                        ((List) obj9).getClass();
                        j0g0 j0g0Var10 = (j0g0) ((fee) pg4Var.f.getValue()).d.getValue();
                        if (j0g0Var10 != null) {
                            Object obj15 = j0g0Var10.f15681a;
                            if (obj15 instanceof g0g0) {
                                obj15 = null;
                            }
                            iterable4 = (List) obj15;
                            if (iterable4 == null) {
                                iterable4 = iun.f15405a;
                            }
                        } else {
                            iterable4 = iun.f15405a;
                        }
                        iterable4.getClass();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                        Iterator it5 = iterable4.iterator();
                        int i7 = 0;
                        while (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            v5l v5lVar = (v5l) next4;
                            String strI3 = f140.i(i7, v5lVar.c);
                            long j16 = ((long) i7) + v5lVar.e;
                            String str16 = v5lVar.c;
                            String str17 = v5lVar.d;
                            if (!kotlin.text.c.x(str17, ujn.h, z2)) {
                                if (str17.length() == 0) {
                                    str17 = "";
                                } else {
                                    List list4 = u0d.f34849a;
                                    if (u0d.c(str17)) {
                                        str17 = "";
                                    } else {
                                        str17 = String.format(Locale.ENGLISH, StringsKt.O(str17, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str17}, 2));
                                    }
                                }
                            }
                            arrayList4.add(new mgz(strI3, new o8m(new m8m(j16, new w8m(str16, new n0x(str17), v8m.b), String.valueOf(i8), new s8m(new n0x(v5lVar.g))))));
                            i7 = i8;
                            it5 = it5;
                            z2 = false;
                        }
                        return arrayList4;
                }
            }
        }, (byte) 20));
        if (j0g0Var4 != null) {
            Object obj9 = j0g0Var4.f15681a;
            obj4 = (List) (obj9 instanceof g0g0 ? null : obj9);
            obj4 = obj4 == null ? iun.f15405a : obj4;
        }
        final byte b5 = 4;
        this.v = maz.b(new yw9(obj4, new Function1(this) { // from class: a.zhz
            public final /* synthetic */ pg4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:110:0x02ca  */
            /* JADX WARN: Code duplicated, block: B:11:0x003c  */
            /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:144:0x0386  */
            /* JADX WARN: Code duplicated, block: B:145:0x0389  */
            /* JADX WARN: Code duplicated, block: B:25:0x0094  */
            /* JADX WARN: Code duplicated, block: B:42:0x0114  */
            /* JADX WARN: Code duplicated, block: B:56:0x0167  */
            /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:87:0x023c  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj10) {
                Iterable iterable;
                boolean z;
                String str;
                String str2;
                Iterable iterable2;
                Iterable iterable3;
                Iterable iterable4;
                byte b6 = b5;
                String str3 = "%,d$";
                String str4 = "$%,d";
                String str5 = "%s/playerlogo/%s";
                pg4 pg4Var = this.b;
                boolean z2 = false;
                switch (b6) {
                    case 0:
                        j0g0 j0g0Var5 = (j0g0) ((fee) pg4Var.c.getValue()).d.getValue();
                        if (j0g0Var5 != null) {
                            Object obj11 = j0g0Var5.f15681a;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            yyg yygVar3 = (yyg) obj11;
                            if (yygVar3 != null) {
                                b0h b0hVar = yygVar3.b;
                                ctf0 ctf0Var2 = pg4Var.b;
                                l2h l2hVar = (l2h) ((fee) pg4Var.o.getValue()).c();
                                l2hVar.getClass();
                                ctf0Var2.getClass();
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA = lsm0Var.a(R.string.leader_board_total_awarded, Arrays.copyOf(new Object[0], 0));
                                long j = b0hVar.d;
                                long j2 = b0hVar.f1764a;
                                long j3 = b0hVar.b;
                                long j4 = b0hVar.c;
                                boolean z3 = b0hVar.f;
                                return new ufz("ANALYTICS_CARD_KEY", new m2h(new i2h(new tfz(strA, zvw.a0(j, z3 ? "$%,d" : "%,d$")), dyb.g0(Float.valueOf(j4), Float.valueOf(j3), Float.valueOf(j2)), new g2h(new h2h("1", lsm0Var.a(R.string.leader_board_online, Arrays.copyOf(new Object[0], 0)), zvw.a0(j4, z3 ? "$%,d" : "%,d$")), new h2h("2", lsm0Var.a(R.string.leader_board_offline, Arrays.copyOf(new Object[0], 0)), zvw.a0(j3, z3 ? "$%,d" : "%,d$")), new h2h("3", lsm0Var.a(R.string.leader_board_mixed, Arrays.copyOf(new Object[0], 0)), zvw.a0(j2, z3 ? "$%,d" : "%,d$")), lsm0Var.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0))), l2hVar)));
                            }
                        }
                        return null;
                    case 1:
                        ((List) obj10).getClass();
                        n0o0 n0o0Var = pg4Var.c;
                        j0g0 j0g0Var6 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var6 != null) {
                            Object obj12 = j0g0Var6.f15681a;
                            if (obj12 instanceof g0g0) {
                                obj12 = null;
                            }
                            yyg yygVar4 = (yyg) obj12;
                            if (yygVar4 == null || (iterable = yygVar4.f43464a) == null) {
                                iterable = iun.f15405a;
                            }
                        } else {
                            iterable = iun.f15405a;
                        }
                        j0g0 j0g0Var7 = (j0g0) ((fee) n0o0Var.getValue()).d.getValue();
                        if (j0g0Var7 != null) {
                            Object obj13 = j0g0Var7.f15681a;
                            if (obj13 instanceof g0g0) {
                                obj13 = null;
                            }
                            yyg yygVar5 = (yyg) obj13;
                            if (yygVar5 == null || !yygVar5.d) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        iterable.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                        Iterator it = iterable.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            vzg vzgVar = (vzg) next;
                            long j5 = vzgVar.f38297a;
                            String str6 = vzgVar.d;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            sb.append(j5);
                            String string = sb.toString();
                            long j6 = i;
                            Iterator it2 = it;
                            String str7 = str3;
                            long j7 = j6 + vzgVar.f38297a;
                            String str8 = vzgVar.e;
                            String str9 = str4;
                            if (kotlin.text.c.x(str8, ujn.h, false)) {
                                str = str8;
                            } else {
                                if (str8.length() != 0) {
                                    List list = u0d.f34849a;
                                    if (!u0d.c(str8)) {
                                        str5 = str5;
                                        str = String.format(Locale.ENGLISH, StringsKt.O(str8, "playerlogo/", true) ? "%s/%s" : str5, Arrays.copyOf(new Object[]{ujn.h, str8}, 2));
                                    }
                                    w8m w8mVar5 = new w8m(str6, new n0x(str), v8m.f36992a);
                                    String strValueOf5 = String.valueOf(i2);
                                    long j12 = vzgVar.f;
                                    if (z) {
                                        str2 = str9;
                                    } else {
                                        str2 = str7;
                                    }
                                    String strReplace5 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1)).replace(',', '.');
                                    strReplace5.getClass();
                                    arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar5, strValueOf5, new r8m(strReplace5)))));
                                    it = it2;
                                    str3 = str7;
                                    i = i2;
                                    str4 = str9;
                                    str5 = str5;
                                }
                                str = "";
                            }
                            w8m w8mVar6 = new w8m(str6, new n0x(str), v8m.f36992a);
                            String strValueOf6 = String.valueOf(i2);
                            long j13 = vzgVar.f;
                            if (z) {
                                str2 = str9;
                            } else {
                                str2 = str7;
                            }
                            String strReplace6 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Long.valueOf(j13)}, 1)).replace(',', '.');
                            strReplace6.getClass();
                            arrayList.add(new jhz(string, vzgVar.f38297a, str6, vzgVar.g, new o8m(new m8m(j7, w8mVar6, strValueOf6, new r8m(strReplace6)))));
                            it = it2;
                            str3 = str7;
                            i = i2;
                            str4 = str9;
                            str5 = str5;
                        }
                        return arrayList;
                    case 2:
                        ((List) obj10).getClass();
                        j0g0 j0g0Var8 = (j0g0) ((fee) pg4Var.d.getValue()).d.getValue();
                        if (j0g0Var8 != null) {
                            Object obj14 = j0g0Var8.f15681a;
                            if (obj14 instanceof g0g0) {
                                obj14 = null;
                            }
                            iterable2 = (List) obj14;
                            if (iterable2 == null) {
                                iterable2 = iun.f15405a;
                            }
                        } else {
                            iterable2 = iun.f15405a;
                        }
                        iterable2.getClass();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                        Iterator it3 = iterable2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fal falVar = (fal) next2;
                            String str10 = falVar.c;
                            String str11 = falVar.c;
                            String strI = f140.i(i3, str10);
                            long j14 = ((long) i3) + falVar.f9213a;
                            String str12 = falVar.b;
                            if (!kotlin.text.c.x(str12, ujn.h, false)) {
                                if (str12.length() == 0) {
                                    str12 = "";
                                } else {
                                    List list2 = u0d.f34849a;
                                    if (u0d.c(str12)) {
                                        str12 = "";
                                    } else {
                                        str12 = String.format(Locale.ENGLISH, StringsKt.O(str12, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str12}, 2));
                                    }
                                }
                            }
                            o8m o8mVar = new o8m(new m8m(j14, new w8m(str11, new n0x(str12), v8m.f36992a), String.valueOf(i4), new r8m(String.valueOf(falVar.d))));
                            long j15 = falVar.f9213a;
                            arrayList2.add(new jhz(strI, j15, str11, j15 != 0, o8mVar));
                            it3 = it3;
                            i3 = i4;
                        }
                        return arrayList2;
                    case 3:
                        ((List) obj10).getClass();
                        j0g0 j0g0Var9 = (j0g0) ((fee) pg4Var.e.getValue()).d.getValue();
                        if (j0g0Var9 != null) {
                            Object obj15 = j0g0Var9.f15681a;
                            if (obj15 instanceof g0g0) {
                                obj15 = null;
                            }
                            iterable3 = (List) obj15;
                            if (iterable3 == null) {
                                iterable3 = iun.f15405a;
                            }
                        } else {
                            iterable3 = iun.f15405a;
                        }
                        iterable3.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                        Iterator it4 = iterable3.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            Object next3 = it4.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            gyg gygVar = (gyg) next3;
                            String str13 = gygVar.b;
                            String str14 = gygVar.b;
                            String strI2 = f140.i(i5, str13);
                            long j16 = ((long) i5) + gygVar.f12127a;
                            String str15 = gygVar.c;
                            if (!kotlin.text.c.x(str15, ujn.h, false)) {
                                if (str15.length() == 0) {
                                    str15 = "";
                                } else {
                                    List list3 = u0d.f34849a;
                                    if (u0d.c(str15)) {
                                        str15 = "";
                                    } else {
                                        str15 = String.format(Locale.ENGLISH, StringsKt.O(str15, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str15}, 2));
                                    }
                                }
                            }
                            arrayList3.add(new jhz(strI2, gygVar.f12127a, str14, true, new o8m(new m8m(j16, new w8m(str14, new n0x(str15), v8m.f36992a), String.valueOf(i6), new r8m(String.valueOf(gygVar.e))))));
                            it4 = it4;
                            i5 = i6;
                        }
                        return arrayList3;
                    default:
                        ((List) obj10).getClass();
                        j0g0 j0g0Var10 = (j0g0) ((fee) pg4Var.f.getValue()).d.getValue();
                        if (j0g0Var10 != null) {
                            Object obj16 = j0g0Var10.f15681a;
                            if (obj16 instanceof g0g0) {
                                obj16 = null;
                            }
                            iterable4 = (List) obj16;
                            if (iterable4 == null) {
                                iterable4 = iun.f15405a;
                            }
                        } else {
                            iterable4 = iun.f15405a;
                        }
                        iterable4.getClass();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                        Iterator it5 = iterable4.iterator();
                        int i7 = 0;
                        while (it5.hasNext()) {
                            Object next4 = it5.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                q3d.p();
                                throw null;
                            }
                            v5l v5lVar = (v5l) next4;
                            String strI3 = f140.i(i7, v5lVar.c);
                            long j17 = ((long) i7) + v5lVar.e;
                            String str16 = v5lVar.c;
                            String str17 = v5lVar.d;
                            if (!kotlin.text.c.x(str17, ujn.h, z2)) {
                                if (str17.length() == 0) {
                                    str17 = "";
                                } else {
                                    List list4 = u0d.f34849a;
                                    if (u0d.c(str17)) {
                                        str17 = "";
                                    } else {
                                        str17 = String.format(Locale.ENGLISH, StringsKt.O(str17, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str17}, 2));
                                    }
                                }
                            }
                            arrayList4.add(new mgz(strI3, new o8m(new m8m(j17, new w8m(str16, new n0x(str17), v8m.b), String.valueOf(i8), new s8m(new n0x(v5lVar.g))))));
                            i7 = i8;
                            it5 = it5;
                            z2 = false;
                        }
                        return arrayList4;
                }
            }
        }, (byte) 20));
    }
}
