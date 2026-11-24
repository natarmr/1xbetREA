package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class us80 implements v6t0 {
    public final n0o0 A;
    public final n0o0 B;
    public final n0o0 C;
    public final n0o0 D;
    public final n0o0 E;
    public final n0o0 F;
    public final n0o0 G;
    public final n0o0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f36200a;
    public final n0o0 b;
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
    public final n0o0 v;
    public final n0o0 w;
    public final n0o0 x;
    public final n0o0 y;
    public final n0o0 z;

    public us80(ctf0 ctf0Var, rs80 rs80Var) {
        ctf0Var.getClass();
        this.f36200a = ctf0Var;
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(rs80Var.f31020a));
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(rs80Var.b));
        this.c = n0o0VarH2;
        this.d = bkb.H(Boolean.valueOf(rs80Var.c));
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(rs80Var.d));
        this.e = n0o0VarH3;
        this.f = bkb.H(Boolean.valueOf(rs80Var.f));
        this.g = bkb.H(Boolean.valueOf(rs80Var.g));
        this.h = bkb.H(Boolean.valueOf(rs80Var.e));
        n0o0 n0o0VarH4 = bkb.H(Integer.valueOf(rs80Var.h));
        this.i = n0o0VarH4;
        this.j = bkb.H(Boolean.valueOf(rs80Var.o));
        n0o0 n0o0VarH5 = bkb.H(rs80Var.q);
        this.k = n0o0VarH5;
        this.l = bkb.H(rs80Var.r);
        this.m = bkb.H(rs80Var.s);
        n0o0 n0o0VarH6 = bkb.H(rs80Var.t);
        this.n = n0o0VarH6;
        this.o = bkb.H(rs80Var.u);
        this.p = bkb.H(Long.valueOf(rs80Var.v));
        n0o0 n0o0VarH7 = bkb.H(rs80Var.w);
        this.q = n0o0VarH7;
        this.r = bkb.H(rs80Var.x);
        this.s = bkb.H(rs80Var.y);
        this.t = bkb.H(Boolean.valueOf(rs80Var.z));
        this.u = bkb.H(rs80Var.A);
        this.v = bkb.G(((fee) n0o0VarH4.getValue()).d, new r580((byte) 20));
        this.w = bkb.G(((fee) n0o0VarH4.getValue()).d, new r580((byte) 22));
        this.x = maz.b(new yw9(rs80Var.i, new r580((byte) 23), (byte) 20));
        this.y = maz.b(new yw9(rs80Var.j, new r580((byte) 24), (byte) 20));
        this.z = maz.b(new yw9(rs80Var.l, new r580((byte) 25), (byte) 20));
        this.A = maz.b(new yw9(rs80Var.k, new r580((byte) 26), (byte) 20));
        pz40 pz40Var = ((fee) n0o0VarH5.getValue()).d;
        final byte b = 5;
        this.B = bkb.G(pz40Var, new Function1(this) { // from class: a.ts80
            public final /* synthetic */ us80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                lxl lxlVar;
                byte b2 = b;
                int i = 1;
                us80 us80Var = this.b;
                switch (b2) {
                    case 0:
                        n0o0 n0o0Var = us80Var.y;
                        if (!((Boolean) obj).booleanValue()) {
                            return sq80.f32616a;
                        }
                        fee feeVar = (fee) us80Var.o.getValue();
                        ctf0 ctf0Var2 = us80Var.f36200a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new qq80((ijl) ((fee) n0o0Var.getValue()).b(), new jjl("", "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new pq80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 1:
                        pr80 pr80Var = (pr80) obj;
                        pr80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) us80Var.z.getValue()).b();
                        lq5Var.getClass();
                        if (!(pr80Var instanceof mr80)) {
                            if (pr80Var.equals(or80.f25724a)) {
                                return new sr80(lq5Var);
                            }
                            if (pr80Var.equals(nr80.f23989a)) {
                                return new rr80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((mr80) pr80Var).f22257a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            int i2 = lr5Var.f20512a;
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
                            arrayList.add(new fr5(i2, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new qr80(lq5Var, dyb.o0(arrayList));
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var2 = us80Var.A;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) us80Var.l.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, us80Var.f36200a, ((Boolean) ((fee) us80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) us80Var.j.getValue()).c()).booleanValue(), ((Set) ((fee) us80Var.m.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) us80Var.c.getValue()).c()).booleanValue()) {
                            return new ds80((mdm) ((fee) us80Var.w.getValue()).b());
                        }
                        return ((Boolean) ((fee) us80Var.d.getValue()).c()).booleanValue() ? new cs80((mdm) ((fee) us80Var.v.getValue()).b()) : new bs80((bml) ((fee) us80Var.E.getValue()).b());
                    case 4:
                        ctf0 ctf0Var3 = us80Var.f36200a;
                        wr80 wr80Var = (wr80) obj;
                        wr80Var.getClass();
                        int i3 = 3;
                        if (wr80Var instanceof vr80) {
                            return new op0(new gyl(null, null, 3));
                        }
                        List<FilterItemUi> list2 = ((ur80) wr80Var).f36152a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                        for (FilterItemUi filterItemUi : list2) {
                            mp0 mp0Var = (mp0) ((fee) us80Var.x.getValue()).b();
                            Long lT0 = StringsKt.t0(filterItemUi.getF46280a());
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String b3 = !Intrinsics.d(filterItemUi.getF46280a(), "0") ? filterItemUi.getB() : ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                            int iOrdinal = mp0Var.ordinal();
                            if (iOrdinal == 0) {
                                lxlVar = new lxl(jLongValue, (dyl) new xxl(b3), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == i) {
                                String d = filterItemUi.getD();
                                if (d == null) {
                                    d = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new ayl(b3, new n0x(d), null, 28), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == 2) {
                                String d2 = filterItemUi.getD();
                                if (d2 == null) {
                                    d2 = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d2), b3), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else {
                                if (iOrdinal != i3) {
                                    t9f.b();
                                    return null;
                                }
                                String d3 = filterItemUi.getD();
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d3 == null ? "" : d3), b3), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            }
                            arrayList3.add(lxlVar);
                            i = 1;
                            i3 = 3;
                        }
                        return new np0(new fyl(dyb.o0(arrayList3), null, null, null, null, 30), true, ctf0Var3.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0)), ((Boolean) ((fee) us80Var.t.getValue()).c()).booleanValue(), 0L, 96);
                    default:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        ctf0 ctf0Var4 = us80Var.f36200a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)));
                        String str3 = aggregatorScreenModel != null ? aggregatorScreenModel.f46283a : null;
                        return new imm(ilmVar, new plm(str3 != null ? str3 : "", fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var4)), false, null);
                }
            }
        });
        final byte b2 = 0;
        this.C = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.ts80
            public final /* synthetic */ us80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                lxl lxlVar;
                byte b3 = b2;
                int i = 1;
                us80 us80Var = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = us80Var.y;
                        if (!((Boolean) obj).booleanValue()) {
                            return sq80.f32616a;
                        }
                        fee feeVar = (fee) us80Var.o.getValue();
                        ctf0 ctf0Var2 = us80Var.f36200a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new qq80((ijl) ((fee) n0o0Var.getValue()).b(), new jjl("", "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new pq80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 1:
                        pr80 pr80Var = (pr80) obj;
                        pr80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) us80Var.z.getValue()).b();
                        lq5Var.getClass();
                        if (!(pr80Var instanceof mr80)) {
                            if (pr80Var.equals(or80.f25724a)) {
                                return new sr80(lq5Var);
                            }
                            if (pr80Var.equals(nr80.f23989a)) {
                                return new rr80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((mr80) pr80Var).f22257a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            int i2 = lr5Var.f20512a;
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
                            arrayList.add(new fr5(i2, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new qr80(lq5Var, dyb.o0(arrayList));
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var2 = us80Var.A;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) us80Var.l.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, us80Var.f36200a, ((Boolean) ((fee) us80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) us80Var.j.getValue()).c()).booleanValue(), ((Set) ((fee) us80Var.m.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) us80Var.c.getValue()).c()).booleanValue()) {
                            return new ds80((mdm) ((fee) us80Var.w.getValue()).b());
                        }
                        return ((Boolean) ((fee) us80Var.d.getValue()).c()).booleanValue() ? new cs80((mdm) ((fee) us80Var.v.getValue()).b()) : new bs80((bml) ((fee) us80Var.E.getValue()).b());
                    case 4:
                        ctf0 ctf0Var3 = us80Var.f36200a;
                        wr80 wr80Var = (wr80) obj;
                        wr80Var.getClass();
                        int i3 = 3;
                        if (wr80Var instanceof vr80) {
                            return new op0(new gyl(null, null, 3));
                        }
                        List<FilterItemUi> list2 = ((ur80) wr80Var).f36152a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                        for (FilterItemUi filterItemUi : list2) {
                            mp0 mp0Var = (mp0) ((fee) us80Var.x.getValue()).b();
                            Long lT0 = StringsKt.t0(filterItemUi.getF46280a());
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String b4 = !Intrinsics.d(filterItemUi.getF46280a(), "0") ? filterItemUi.getB() : ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                            int iOrdinal = mp0Var.ordinal();
                            if (iOrdinal == 0) {
                                lxlVar = new lxl(jLongValue, (dyl) new xxl(b4), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == i) {
                                String d = filterItemUi.getD();
                                if (d == null) {
                                    d = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new ayl(b4, new n0x(d), null, 28), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == 2) {
                                String d2 = filterItemUi.getD();
                                if (d2 == null) {
                                    d2 = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d2), b4), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else {
                                if (iOrdinal != i3) {
                                    t9f.b();
                                    return null;
                                }
                                String d3 = filterItemUi.getD();
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d3 == null ? "" : d3), b4), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            }
                            arrayList3.add(lxlVar);
                            i = 1;
                            i3 = 3;
                        }
                        return new np0(new fyl(dyb.o0(arrayList3), null, null, null, null, 30), true, ctf0Var3.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0)), ((Boolean) ((fee) us80Var.t.getValue()).c()).booleanValue(), 0L, 96);
                    default:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        ctf0 ctf0Var4 = us80Var.f36200a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)));
                        String str3 = aggregatorScreenModel != null ? aggregatorScreenModel.f46283a : null;
                        return new imm(ilmVar, new plm(str3 != null ? str3 : "", fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var4)), false, null);
                }
            }
        });
        final byte b3 = 1;
        this.D = bkb.G(((fee) n0o0VarH6.getValue()).d, new Function1(this) { // from class: a.ts80
            public final /* synthetic */ us80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                lxl lxlVar;
                byte b4 = b3;
                int i = 1;
                us80 us80Var = this.b;
                switch (b4) {
                    case 0:
                        n0o0 n0o0Var = us80Var.y;
                        if (!((Boolean) obj).booleanValue()) {
                            return sq80.f32616a;
                        }
                        fee feeVar = (fee) us80Var.o.getValue();
                        ctf0 ctf0Var2 = us80Var.f36200a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new qq80((ijl) ((fee) n0o0Var.getValue()).b(), new jjl("", "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new pq80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 1:
                        pr80 pr80Var = (pr80) obj;
                        pr80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) us80Var.z.getValue()).b();
                        lq5Var.getClass();
                        if (!(pr80Var instanceof mr80)) {
                            if (pr80Var.equals(or80.f25724a)) {
                                return new sr80(lq5Var);
                            }
                            if (pr80Var.equals(nr80.f23989a)) {
                                return new rr80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((mr80) pr80Var).f22257a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            int i2 = lr5Var.f20512a;
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
                            arrayList.add(new fr5(i2, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new qr80(lq5Var, dyb.o0(arrayList));
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var2 = us80Var.A;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) us80Var.l.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, us80Var.f36200a, ((Boolean) ((fee) us80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) us80Var.j.getValue()).c()).booleanValue(), ((Set) ((fee) us80Var.m.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) us80Var.c.getValue()).c()).booleanValue()) {
                            return new ds80((mdm) ((fee) us80Var.w.getValue()).b());
                        }
                        return ((Boolean) ((fee) us80Var.d.getValue()).c()).booleanValue() ? new cs80((mdm) ((fee) us80Var.v.getValue()).b()) : new bs80((bml) ((fee) us80Var.E.getValue()).b());
                    case 4:
                        ctf0 ctf0Var3 = us80Var.f36200a;
                        wr80 wr80Var = (wr80) obj;
                        wr80Var.getClass();
                        int i3 = 3;
                        if (wr80Var instanceof vr80) {
                            return new op0(new gyl(null, null, 3));
                        }
                        List<FilterItemUi> list2 = ((ur80) wr80Var).f36152a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                        for (FilterItemUi filterItemUi : list2) {
                            mp0 mp0Var = (mp0) ((fee) us80Var.x.getValue()).b();
                            Long lT0 = StringsKt.t0(filterItemUi.getF46280a());
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String b5 = !Intrinsics.d(filterItemUi.getF46280a(), "0") ? filterItemUi.getB() : ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                            int iOrdinal = mp0Var.ordinal();
                            if (iOrdinal == 0) {
                                lxlVar = new lxl(jLongValue, (dyl) new xxl(b5), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == i) {
                                String d = filterItemUi.getD();
                                if (d == null) {
                                    d = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new ayl(b5, new n0x(d), null, 28), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == 2) {
                                String d2 = filterItemUi.getD();
                                if (d2 == null) {
                                    d2 = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d2), b5), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else {
                                if (iOrdinal != i3) {
                                    t9f.b();
                                    return null;
                                }
                                String d3 = filterItemUi.getD();
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d3 == null ? "" : d3), b5), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            }
                            arrayList3.add(lxlVar);
                            i = 1;
                            i3 = 3;
                        }
                        return new np0(new fyl(dyb.o0(arrayList3), null, null, null, null, 30), true, ctf0Var3.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0)), ((Boolean) ((fee) us80Var.t.getValue()).c()).booleanValue(), 0L, 96);
                    default:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        ctf0 ctf0Var4 = us80Var.f36200a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)));
                        String str3 = aggregatorScreenModel != null ? aggregatorScreenModel.f46283a : null;
                        return new imm(ilmVar, new plm(str3 != null ? str3 : "", fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var4)), false, null);
                }
            }
        });
        final byte b4 = 2;
        this.E = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.ts80
            public final /* synthetic */ us80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                lxl lxlVar;
                byte b5 = b4;
                int i = 1;
                us80 us80Var = this.b;
                switch (b5) {
                    case 0:
                        n0o0 n0o0Var = us80Var.y;
                        if (!((Boolean) obj).booleanValue()) {
                            return sq80.f32616a;
                        }
                        fee feeVar = (fee) us80Var.o.getValue();
                        ctf0 ctf0Var2 = us80Var.f36200a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new qq80((ijl) ((fee) n0o0Var.getValue()).b(), new jjl("", "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new pq80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 1:
                        pr80 pr80Var = (pr80) obj;
                        pr80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) us80Var.z.getValue()).b();
                        lq5Var.getClass();
                        if (!(pr80Var instanceof mr80)) {
                            if (pr80Var.equals(or80.f25724a)) {
                                return new sr80(lq5Var);
                            }
                            if (pr80Var.equals(nr80.f23989a)) {
                                return new rr80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((mr80) pr80Var).f22257a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            int i2 = lr5Var.f20512a;
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
                            arrayList.add(new fr5(i2, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new qr80(lq5Var, dyb.o0(arrayList));
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var2 = us80Var.A;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) us80Var.l.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, us80Var.f36200a, ((Boolean) ((fee) us80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) us80Var.j.getValue()).c()).booleanValue(), ((Set) ((fee) us80Var.m.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) us80Var.c.getValue()).c()).booleanValue()) {
                            return new ds80((mdm) ((fee) us80Var.w.getValue()).b());
                        }
                        return ((Boolean) ((fee) us80Var.d.getValue()).c()).booleanValue() ? new cs80((mdm) ((fee) us80Var.v.getValue()).b()) : new bs80((bml) ((fee) us80Var.E.getValue()).b());
                    case 4:
                        ctf0 ctf0Var3 = us80Var.f36200a;
                        wr80 wr80Var = (wr80) obj;
                        wr80Var.getClass();
                        int i3 = 3;
                        if (wr80Var instanceof vr80) {
                            return new op0(new gyl(null, null, 3));
                        }
                        List<FilterItemUi> list2 = ((ur80) wr80Var).f36152a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                        for (FilterItemUi filterItemUi : list2) {
                            mp0 mp0Var = (mp0) ((fee) us80Var.x.getValue()).b();
                            Long lT0 = StringsKt.t0(filterItemUi.getF46280a());
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String b6 = !Intrinsics.d(filterItemUi.getF46280a(), "0") ? filterItemUi.getB() : ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                            int iOrdinal = mp0Var.ordinal();
                            if (iOrdinal == 0) {
                                lxlVar = new lxl(jLongValue, (dyl) new xxl(b6), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == i) {
                                String d = filterItemUi.getD();
                                if (d == null) {
                                    d = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new ayl(b6, new n0x(d), null, 28), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == 2) {
                                String d2 = filterItemUi.getD();
                                if (d2 == null) {
                                    d2 = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d2), b6), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else {
                                if (iOrdinal != i3) {
                                    t9f.b();
                                    return null;
                                }
                                String d3 = filterItemUi.getD();
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d3 == null ? "" : d3), b6), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            }
                            arrayList3.add(lxlVar);
                            i = 1;
                            i3 = 3;
                        }
                        return new np0(new fyl(dyb.o0(arrayList3), null, null, null, null, 30), true, ctf0Var3.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0)), ((Boolean) ((fee) us80Var.t.getValue()).c()).booleanValue(), 0L, 96);
                    default:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        ctf0 ctf0Var4 = us80Var.f36200a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)));
                        String str3 = aggregatorScreenModel != null ? aggregatorScreenModel.f46283a : null;
                        return new imm(ilmVar, new plm(str3 != null ? str3 : "", fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var4)), false, null);
                }
            }
        });
        pz40 pz40Var2 = ((fee) n0o0VarH2.getValue()).d;
        final byte b5 = 3;
        n0o0 n0o0VarG = bkb.G(pz40Var2, new Function1(this) { // from class: a.ts80
            public final /* synthetic */ us80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                lxl lxlVar;
                byte b6 = b5;
                int i = 1;
                us80 us80Var = this.b;
                switch (b6) {
                    case 0:
                        n0o0 n0o0Var = us80Var.y;
                        if (!((Boolean) obj).booleanValue()) {
                            return sq80.f32616a;
                        }
                        fee feeVar = (fee) us80Var.o.getValue();
                        ctf0 ctf0Var2 = us80Var.f36200a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new qq80((ijl) ((fee) n0o0Var.getValue()).b(), new jjl("", "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new pq80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 1:
                        pr80 pr80Var = (pr80) obj;
                        pr80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) us80Var.z.getValue()).b();
                        lq5Var.getClass();
                        if (!(pr80Var instanceof mr80)) {
                            if (pr80Var.equals(or80.f25724a)) {
                                return new sr80(lq5Var);
                            }
                            if (pr80Var.equals(nr80.f23989a)) {
                                return new rr80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((mr80) pr80Var).f22257a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            int i2 = lr5Var.f20512a;
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
                            arrayList.add(new fr5(i2, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new qr80(lq5Var, dyb.o0(arrayList));
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var2 = us80Var.A;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) us80Var.l.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, us80Var.f36200a, ((Boolean) ((fee) us80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) us80Var.j.getValue()).c()).booleanValue(), ((Set) ((fee) us80Var.m.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) us80Var.c.getValue()).c()).booleanValue()) {
                            return new ds80((mdm) ((fee) us80Var.w.getValue()).b());
                        }
                        return ((Boolean) ((fee) us80Var.d.getValue()).c()).booleanValue() ? new cs80((mdm) ((fee) us80Var.v.getValue()).b()) : new bs80((bml) ((fee) us80Var.E.getValue()).b());
                    case 4:
                        ctf0 ctf0Var3 = us80Var.f36200a;
                        wr80 wr80Var = (wr80) obj;
                        wr80Var.getClass();
                        int i3 = 3;
                        if (wr80Var instanceof vr80) {
                            return new op0(new gyl(null, null, 3));
                        }
                        List<FilterItemUi> list2 = ((ur80) wr80Var).f36152a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                        for (FilterItemUi filterItemUi : list2) {
                            mp0 mp0Var = (mp0) ((fee) us80Var.x.getValue()).b();
                            Long lT0 = StringsKt.t0(filterItemUi.getF46280a());
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String b7 = !Intrinsics.d(filterItemUi.getF46280a(), "0") ? filterItemUi.getB() : ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                            int iOrdinal = mp0Var.ordinal();
                            if (iOrdinal == 0) {
                                lxlVar = new lxl(jLongValue, (dyl) new xxl(b7), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == i) {
                                String d = filterItemUi.getD();
                                if (d == null) {
                                    d = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new ayl(b7, new n0x(d), null, 28), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == 2) {
                                String d2 = filterItemUi.getD();
                                if (d2 == null) {
                                    d2 = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d2), b7), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else {
                                if (iOrdinal != i3) {
                                    t9f.b();
                                    return null;
                                }
                                String d3 = filterItemUi.getD();
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d3 == null ? "" : d3), b7), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            }
                            arrayList3.add(lxlVar);
                            i = 1;
                            i3 = 3;
                        }
                        return new np0(new fyl(dyb.o0(arrayList3), null, null, null, null, 30), true, ctf0Var3.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0)), ((Boolean) ((fee) us80Var.t.getValue()).c()).booleanValue(), 0L, 96);
                    default:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        ctf0 ctf0Var4 = us80Var.f36200a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)));
                        String str3 = aggregatorScreenModel != null ? aggregatorScreenModel.f46283a : null;
                        return new imm(ilmVar, new plm(str3 != null ? str3 : "", fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var4)), false, null);
                }
            }
        });
        this.F = n0o0VarG;
        this.G = bkb.G(((fee) n0o0VarG.getValue()).e, new r580((byte) 21));
        final byte b6 = 4;
        this.H = bkb.G(((fee) n0o0VarH7.getValue()).d, new Function1(this) { // from class: a.ts80
            public final /* synthetic */ us80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                lxl lxlVar;
                byte b7 = b6;
                int i = 1;
                us80 us80Var = this.b;
                switch (b7) {
                    case 0:
                        n0o0 n0o0Var = us80Var.y;
                        if (!((Boolean) obj).booleanValue()) {
                            return sq80.f32616a;
                        }
                        fee feeVar = (fee) us80Var.o.getValue();
                        ctf0 ctf0Var2 = us80Var.f36200a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new qq80((ijl) ((fee) n0o0Var.getValue()).b(), new jjl("", "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new pq80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 1:
                        pr80 pr80Var = (pr80) obj;
                        pr80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) us80Var.z.getValue()).b();
                        lq5Var.getClass();
                        if (!(pr80Var instanceof mr80)) {
                            if (pr80Var.equals(or80.f25724a)) {
                                return new sr80(lq5Var);
                            }
                            if (pr80Var.equals(nr80.f23989a)) {
                                return new rr80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((mr80) pr80Var).f22257a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
                            int i2 = lr5Var.f20512a;
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
                            arrayList.add(new fr5(i2, new n0x(str), (n0x) null, lr5Var.e, lr5Var.f, (er5) null, 68));
                        }
                        return new qr80(lq5Var, dyb.o0(arrayList));
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var2 = us80Var.A;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) us80Var.l.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, us80Var.f36200a, ((Boolean) ((fee) us80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) us80Var.j.getValue()).c()).booleanValue(), ((Set) ((fee) us80Var.m.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) us80Var.c.getValue()).c()).booleanValue()) {
                            return new ds80((mdm) ((fee) us80Var.w.getValue()).b());
                        }
                        return ((Boolean) ((fee) us80Var.d.getValue()).c()).booleanValue() ? new cs80((mdm) ((fee) us80Var.v.getValue()).b()) : new bs80((bml) ((fee) us80Var.E.getValue()).b());
                    case 4:
                        ctf0 ctf0Var3 = us80Var.f36200a;
                        wr80 wr80Var = (wr80) obj;
                        wr80Var.getClass();
                        int i3 = 3;
                        if (wr80Var instanceof vr80) {
                            return new op0(new gyl(null, null, 3));
                        }
                        List<FilterItemUi> list2 = ((ur80) wr80Var).f36152a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                        for (FilterItemUi filterItemUi : list2) {
                            mp0 mp0Var = (mp0) ((fee) us80Var.x.getValue()).b();
                            Long lT0 = StringsKt.t0(filterItemUi.getF46280a());
                            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
                            String b8 = !Intrinsics.d(filterItemUi.getF46280a(), "0") ? filterItemUi.getB() : ctf0Var3.b.a(R.string.all, Arrays.copyOf(new Object[0], 0));
                            int iOrdinal = mp0Var.ordinal();
                            if (iOrdinal == 0) {
                                lxlVar = new lxl(jLongValue, (dyl) new xxl(b8), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == i) {
                                String d = filterItemUi.getD();
                                if (d == null) {
                                    d = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new ayl(b8, new n0x(d), null, 28), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else if (iOrdinal == 2) {
                                String d2 = filterItemUi.getD();
                                if (d2 == null) {
                                    d2 = "";
                                }
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d2), b8), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            } else {
                                if (iOrdinal != i3) {
                                    t9f.b();
                                    return null;
                                }
                                String d3 = filterItemUi.getD();
                                lxlVar = new lxl(jLongValue, (dyl) new zxl(28, new n0x(d3 == null ? "" : d3), b8), false, filterItemUi.getC() ? uxl.b : uxl.f36445a, (cwl) null, 104);
                            }
                            arrayList3.add(lxlVar);
                            i = 1;
                            i3 = 3;
                        }
                        return new np0(new fyl(dyb.o0(arrayList3), null, null, null, null, 30), true, ctf0Var3.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0)), ((Boolean) ((fee) us80Var.t.getValue()).c()).booleanValue(), 0L, 96);
                    default:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        ctf0 ctf0Var4 = us80Var.f36200a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)));
                        String str3 = aggregatorScreenModel != null ? aggregatorScreenModel.f46283a : null;
                        return new imm(ilmVar, new plm(str3 != null ? str3 : "", fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var4))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var4)), false, null);
                }
            }
        });
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        rs80 rs80Var = (rs80) obj;
        rs80Var.getClass();
        n0o0 n0o0Var = this.x;
        ((fee) n0o0Var.getValue()).d(rs80Var.i);
        ((fee) this.y.getValue()).d(rs80Var.j);
        ((fee) this.A.getValue()).d(rs80Var.k);
        ((fee) this.z.getValue()).d(rs80Var.l);
        ((fee) this.e.getValue()).d(Boolean.valueOf(rs80Var.d));
        ((fee) this.c.getValue()).d(Boolean.valueOf(rs80Var.b));
        ((fee) this.b.getValue()).d(Boolean.valueOf(rs80Var.f31020a));
        ((fee) this.d.getValue()).d(Boolean.valueOf(rs80Var.c));
        ((fee) this.f.getValue()).d(Boolean.valueOf(rs80Var.f));
        ((fee) this.g.getValue()).d(Boolean.valueOf(rs80Var.g));
        ((fee) this.h.getValue()).d(Boolean.valueOf(rs80Var.e));
        ((fee) this.i.getValue()).d(Integer.valueOf(rs80Var.h));
        ((fee) this.j.getValue()).d(Boolean.valueOf(rs80Var.o));
        ((fee) this.n.getValue()).d(rs80Var.t);
        ((fee) this.m.getValue()).d(rs80Var.s);
        ((fee) this.o.getValue()).d(rs80Var.u);
        ((fee) this.k.getValue()).d(rs80Var.q);
        ((fee) this.l.getValue()).d(rs80Var.r);
        ((fee) this.p.getValue()).d(Long.valueOf(rs80Var.v));
        ((fee) this.q.getValue()).d(rs80Var.w);
        ((fee) this.r.getValue()).d(rs80Var.x);
        ((fee) this.s.getValue()).d(rs80Var.y);
        ((fee) this.t.getValue()).d(Boolean.valueOf(rs80Var.z));
        ((fee) this.u.getValue()).d(rs80Var.A);
        return new ss80(((Boolean) ((fee) this.G.getValue()).b()).booleanValue(), (mp0) ((fee) n0o0Var.getValue()).b(), (pp0) ((fee) this.H.getValue()).b(), (imm) ((fee) this.B.getValue()).b(), (tq80) ((fee) this.C.getValue()).b(), (es80) ((fee) this.F.getValue()).b(), (tr80) ((fee) this.D.getValue()).b());
    }
}
