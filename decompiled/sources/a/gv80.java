package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class gv80 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f11965a;
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

    public gv80(ctf0 ctf0Var, yu80 yu80Var) {
        ctf0Var.getClass();
        this.f11965a = ctf0Var;
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(yu80Var.f43256a));
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(yu80Var.b));
        this.c = n0o0VarH2;
        this.d = bkb.H(Boolean.valueOf(yu80Var.c));
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(yu80Var.d));
        this.e = n0o0VarH3;
        this.f = bkb.H(Boolean.valueOf(yu80Var.e));
        n0o0 n0o0VarH4 = bkb.H(Integer.valueOf(yu80Var.f));
        this.g = n0o0VarH4;
        this.h = bkb.H(Boolean.valueOf(yu80Var.j));
        n0o0 n0o0VarH5 = bkb.H(yu80Var.l);
        this.i = n0o0VarH5;
        this.j = bkb.H(yu80Var.m);
        this.k = bkb.H(yu80Var.n);
        n0o0 n0o0VarH6 = bkb.H(yu80Var.o);
        this.l = n0o0VarH6;
        this.m = bkb.H(yu80Var.p);
        final byte b = 0;
        this.n = bkb.G(((fee) n0o0VarH4.getValue()).d, new ev80((byte) 0));
        final byte b2 = 2;
        this.o = bkb.G(((fee) n0o0VarH4.getValue()).d, new ev80((byte) 2));
        final byte b3 = 3;
        this.p = maz.b(new yw9(yu80Var.g, new ev80((byte) 3), (byte) 20));
        final byte b4 = 4;
        this.q = maz.b(new yw9(yu80Var.i, new ev80((byte) 4), (byte) 20));
        this.r = maz.b(new yw9(yu80Var.h, new ev80((byte) 5), (byte) 20));
        pz40 pz40Var = ((fee) n0o0VarH5.getValue()).d;
        final byte b5 = 1;
        this.s = bkb.G(pz40Var, new Function1(this) { // from class: a.fv80
            public final /* synthetic */ gv80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:74:0x0285  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                String str;
                byte b6 = b5;
                gv80 gv80Var = this.b;
                switch (b6) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) gv80Var.c.getValue()).c()).booleanValue()) {
                            return new bv80((mdm) ((fee) gv80Var.o.getValue()).b());
                        }
                        return ((Boolean) ((fee) gv80Var.d.getValue()).c()).booleanValue() ? new av80((mdm) ((fee) gv80Var.n.getValue()).b()) : new zu80((bml) ((fee) gv80Var.v.getValue()).b());
                    case 1:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        aggregatorScreenModel.getClass();
                        ctf0 ctf0Var2 = gv80Var.f11965a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)));
                        plm plmVar = new plm(aggregatorScreenModel.f46283a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a);
                        n0o0 n0o0Var = gv80Var.i;
                        if (((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d instanceof im1) {
                            tm1 tm1Var = ((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d;
                            tm1Var.getClass();
                            if (((im1) tm1Var).f15003a) {
                                dmmVar = fmm.f9790a;
                            } else {
                                dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                            }
                        } else {
                            dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                        }
                        return new imm(ilmVar, plmVar, dmmVar, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), false, null);
                    case 2:
                        n0o0 n0o0Var2 = gv80Var.p;
                        if (!((Boolean) obj).booleanValue()) {
                            return nt80.f24085a;
                        }
                        fee feeVar = (fee) gv80Var.m.getValue();
                        ctf0 ctf0Var3 = gv80Var.f11965a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new lt80((ijl) ((fee) n0o0Var2.getValue()).b(), new jjl("", "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var2.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var2.getValue()).b()) == ijl.b) {
                            strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new kt80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 3:
                        gu80 gu80Var = (gu80) obj;
                        gu80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) gv80Var.q.getValue()).b();
                        lq5Var.getClass();
                        if (!(gu80Var instanceof du80)) {
                            if (gu80Var.equals(fu80.f10151a)) {
                                return new ju80(lq5Var);
                            }
                            if (gu80Var.equals(eu80.f8408a)) {
                                return new iu80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((du80) gu80Var).f6689a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
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
                        return new hu80(lq5Var, dyb.o0(arrayList));
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var3 = gv80Var.r;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var3.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var3.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) gv80Var.j.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, gv80Var.f11965a, ((Boolean) ((fee) gv80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv80Var.h.getValue()).c()).booleanValue(), ((Set) ((fee) gv80Var.k.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var3.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                }
            }
        });
        this.t = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.fv80
            public final /* synthetic */ gv80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:74:0x0285  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                String str;
                byte b6 = b2;
                gv80 gv80Var = this.b;
                switch (b6) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) gv80Var.c.getValue()).c()).booleanValue()) {
                            return new bv80((mdm) ((fee) gv80Var.o.getValue()).b());
                        }
                        return ((Boolean) ((fee) gv80Var.d.getValue()).c()).booleanValue() ? new av80((mdm) ((fee) gv80Var.n.getValue()).b()) : new zu80((bml) ((fee) gv80Var.v.getValue()).b());
                    case 1:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        aggregatorScreenModel.getClass();
                        ctf0 ctf0Var2 = gv80Var.f11965a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)));
                        plm plmVar = new plm(aggregatorScreenModel.f46283a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a);
                        n0o0 n0o0Var = gv80Var.i;
                        if (((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d instanceof im1) {
                            tm1 tm1Var = ((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d;
                            tm1Var.getClass();
                            if (((im1) tm1Var).f15003a) {
                                dmmVar = fmm.f9790a;
                            } else {
                                dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                            }
                        } else {
                            dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                        }
                        return new imm(ilmVar, plmVar, dmmVar, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), false, null);
                    case 2:
                        n0o0 n0o0Var2 = gv80Var.p;
                        if (!((Boolean) obj).booleanValue()) {
                            return nt80.f24085a;
                        }
                        fee feeVar = (fee) gv80Var.m.getValue();
                        ctf0 ctf0Var3 = gv80Var.f11965a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new lt80((ijl) ((fee) n0o0Var2.getValue()).b(), new jjl("", "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var2.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var2.getValue()).b()) == ijl.b) {
                            strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new kt80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 3:
                        gu80 gu80Var = (gu80) obj;
                        gu80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) gv80Var.q.getValue()).b();
                        lq5Var.getClass();
                        if (!(gu80Var instanceof du80)) {
                            if (gu80Var.equals(fu80.f10151a)) {
                                return new ju80(lq5Var);
                            }
                            if (gu80Var.equals(eu80.f8408a)) {
                                return new iu80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((du80) gu80Var).f6689a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
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
                        return new hu80(lq5Var, dyb.o0(arrayList));
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var3 = gv80Var.r;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var3.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var3.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) gv80Var.j.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, gv80Var.f11965a, ((Boolean) ((fee) gv80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv80Var.h.getValue()).c()).booleanValue(), ((Set) ((fee) gv80Var.k.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var3.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                }
            }
        });
        this.u = bkb.G(((fee) n0o0VarH6.getValue()).d, new Function1(this) { // from class: a.fv80
            public final /* synthetic */ gv80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:74:0x0285  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                String str;
                byte b6 = b3;
                gv80 gv80Var = this.b;
                switch (b6) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) gv80Var.c.getValue()).c()).booleanValue()) {
                            return new bv80((mdm) ((fee) gv80Var.o.getValue()).b());
                        }
                        return ((Boolean) ((fee) gv80Var.d.getValue()).c()).booleanValue() ? new av80((mdm) ((fee) gv80Var.n.getValue()).b()) : new zu80((bml) ((fee) gv80Var.v.getValue()).b());
                    case 1:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        aggregatorScreenModel.getClass();
                        ctf0 ctf0Var2 = gv80Var.f11965a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)));
                        plm plmVar = new plm(aggregatorScreenModel.f46283a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a);
                        n0o0 n0o0Var = gv80Var.i;
                        if (((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d instanceof im1) {
                            tm1 tm1Var = ((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d;
                            tm1Var.getClass();
                            if (((im1) tm1Var).f15003a) {
                                dmmVar = fmm.f9790a;
                            } else {
                                dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                            }
                        } else {
                            dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                        }
                        return new imm(ilmVar, plmVar, dmmVar, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), false, null);
                    case 2:
                        n0o0 n0o0Var2 = gv80Var.p;
                        if (!((Boolean) obj).booleanValue()) {
                            return nt80.f24085a;
                        }
                        fee feeVar = (fee) gv80Var.m.getValue();
                        ctf0 ctf0Var3 = gv80Var.f11965a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new lt80((ijl) ((fee) n0o0Var2.getValue()).b(), new jjl("", "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var2.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var2.getValue()).b()) == ijl.b) {
                            strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new kt80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 3:
                        gu80 gu80Var = (gu80) obj;
                        gu80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) gv80Var.q.getValue()).b();
                        lq5Var.getClass();
                        if (!(gu80Var instanceof du80)) {
                            if (gu80Var.equals(fu80.f10151a)) {
                                return new ju80(lq5Var);
                            }
                            if (gu80Var.equals(eu80.f8408a)) {
                                return new iu80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((du80) gu80Var).f6689a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
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
                        return new hu80(lq5Var, dyb.o0(arrayList));
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var3 = gv80Var.r;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var3.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var3.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) gv80Var.j.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, gv80Var.f11965a, ((Boolean) ((fee) gv80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv80Var.h.getValue()).c()).booleanValue(), ((Set) ((fee) gv80Var.k.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var3.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                }
            }
        });
        this.v = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.fv80
            public final /* synthetic */ gv80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:74:0x0285  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                String str;
                byte b6 = b4;
                gv80 gv80Var = this.b;
                switch (b6) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) gv80Var.c.getValue()).c()).booleanValue()) {
                            return new bv80((mdm) ((fee) gv80Var.o.getValue()).b());
                        }
                        return ((Boolean) ((fee) gv80Var.d.getValue()).c()).booleanValue() ? new av80((mdm) ((fee) gv80Var.n.getValue()).b()) : new zu80((bml) ((fee) gv80Var.v.getValue()).b());
                    case 1:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        aggregatorScreenModel.getClass();
                        ctf0 ctf0Var2 = gv80Var.f11965a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)));
                        plm plmVar = new plm(aggregatorScreenModel.f46283a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a);
                        n0o0 n0o0Var = gv80Var.i;
                        if (((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d instanceof im1) {
                            tm1 tm1Var = ((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d;
                            tm1Var.getClass();
                            if (((im1) tm1Var).f15003a) {
                                dmmVar = fmm.f9790a;
                            } else {
                                dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                            }
                        } else {
                            dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                        }
                        return new imm(ilmVar, plmVar, dmmVar, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), false, null);
                    case 2:
                        n0o0 n0o0Var2 = gv80Var.p;
                        if (!((Boolean) obj).booleanValue()) {
                            return nt80.f24085a;
                        }
                        fee feeVar = (fee) gv80Var.m.getValue();
                        ctf0 ctf0Var3 = gv80Var.f11965a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new lt80((ijl) ((fee) n0o0Var2.getValue()).b(), new jjl("", "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var2.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var2.getValue()).b()) == ijl.b) {
                            strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new kt80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 3:
                        gu80 gu80Var = (gu80) obj;
                        gu80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) gv80Var.q.getValue()).b();
                        lq5Var.getClass();
                        if (!(gu80Var instanceof du80)) {
                            if (gu80Var.equals(fu80.f10151a)) {
                                return new ju80(lq5Var);
                            }
                            if (gu80Var.equals(eu80.f8408a)) {
                                return new iu80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((du80) gu80Var).f6689a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
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
                        return new hu80(lq5Var, dyb.o0(arrayList));
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var3 = gv80Var.r;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var3.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var3.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) gv80Var.j.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, gv80Var.f11965a, ((Boolean) ((fee) gv80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv80Var.h.getValue()).c()).booleanValue(), ((Set) ((fee) gv80Var.k.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var3.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                }
            }
        });
        n0o0 n0o0VarG = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.fv80
            public final /* synthetic */ gv80 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:74:0x0285  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                String str;
                byte b6 = b;
                gv80 gv80Var = this.b;
                switch (b6) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) gv80Var.c.getValue()).c()).booleanValue()) {
                            return new bv80((mdm) ((fee) gv80Var.o.getValue()).b());
                        }
                        return ((Boolean) ((fee) gv80Var.d.getValue()).c()).booleanValue() ? new av80((mdm) ((fee) gv80Var.n.getValue()).b()) : new zu80((bml) ((fee) gv80Var.v.getValue()).b());
                    case 1:
                        AggregatorScreenModel aggregatorScreenModel = (AggregatorScreenModel) obj;
                        aggregatorScreenModel.getClass();
                        ctf0 ctf0Var2 = gv80Var.f11965a;
                        ilm ilmVar = new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)));
                        plm plmVar = new plm(aggregatorScreenModel.f46283a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)), fa50.f9191a);
                        n0o0 n0o0Var = gv80Var.i;
                        if (((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d instanceof im1) {
                            tm1 tm1Var = ((AggregatorScreenModel) ((fee) n0o0Var.getValue()).c()).d;
                            tm1Var.getClass();
                            if (((im1) tm1Var).f15003a) {
                                dmmVar = fmm.f9790a;
                            } else {
                                dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                            }
                        } else {
                            dmmVar = new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var2)))));
                        }
                        return new imm(ilmVar, plmVar, dmmVar, fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var2)), false, null);
                    case 2:
                        n0o0 n0o0Var2 = gv80Var.p;
                        if (!((Boolean) obj).booleanValue()) {
                            return nt80.f24085a;
                        }
                        fee feeVar = (fee) gv80Var.m.getValue();
                        ctf0 ctf0Var3 = gv80Var.f11965a;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var == null) {
                            return new lt80((ijl) ((fee) n0o0Var2.getValue()).b(), new jjl("", "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), ""));
                        }
                        String strA = ql5Var.j;
                        ijl ijlVar = (ijl) ((fee) n0o0Var2.getValue()).b();
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(ql5Var.b, p3u0.c);
                        String str2 = ql5Var.f;
                        String strA2 = ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ijl) ((fee) n0o0Var2.getValue()).b()) == ijl.b) {
                            strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new kt80(ijlVar, new jjl(strC, str2, strA2, strA));
                    case 3:
                        gu80 gu80Var = (gu80) obj;
                        gu80Var.getClass();
                        lq5 lq5Var = (lq5) ((fee) gv80Var.q.getValue()).b();
                        lq5Var.getClass();
                        if (!(gu80Var instanceof du80)) {
                            if (gu80Var.equals(fu80.f10151a)) {
                                return new ju80(lq5Var);
                            }
                            if (gu80Var.equals(eu80.f8408a)) {
                                return new iu80(lq5Var);
                            }
                            t9f.b();
                            return null;
                        }
                        List<lr5> list = ((du80) gu80Var).f6689a;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (lr5 lr5Var : list) {
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
                        return new hu80(lq5Var, dyb.o0(arrayList));
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        n0o0 n0o0Var3 = gv80Var.r;
                        xll xllVar = xll.f41078a;
                        if (zBooleanValue) {
                            return new aml((pt0) ((fee) n0o0Var3.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var3.getValue()).b();
                        Iterable<mlr> iterable = (Iterable) ((fee) gv80Var.j.getValue()).c();
                        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                        for (mlr mlrVar : iterable) {
                            arrayList2.add(ccq0.Z(mlrVar, gv80Var.f11965a, ((Boolean) ((fee) gv80Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) gv80Var.h.getValue()).c()).booleanValue(), ((Set) ((fee) gv80Var.k.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var3.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                }
            }
        });
        this.w = n0o0VarG;
        this.x = bkb.G(((fee) n0o0VarG.getValue()).e, new ev80((byte) 1));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        yu80 yu80Var = (yu80) obj;
        yu80Var.getClass();
        ((fee) this.p.getValue()).d(yu80Var.g);
        ((fee) this.r.getValue()).d(yu80Var.h);
        ((fee) this.q.getValue()).d(yu80Var.i);
        ((fee) this.e.getValue()).d(Boolean.valueOf(yu80Var.d));
        ((fee) this.c.getValue()).d(Boolean.valueOf(yu80Var.b));
        ((fee) this.b.getValue()).d(Boolean.valueOf(yu80Var.f43256a));
        ((fee) this.d.getValue()).d(Boolean.valueOf(yu80Var.c));
        ((fee) this.f.getValue()).d(Boolean.valueOf(yu80Var.e));
        ((fee) this.g.getValue()).d(Integer.valueOf(yu80Var.f));
        ((fee) this.h.getValue()).d(Boolean.valueOf(yu80Var.j));
        ((fee) this.l.getValue()).d(yu80Var.o);
        ((fee) this.k.getValue()).d(yu80Var.n);
        ((fee) this.m.getValue()).d(yu80Var.p);
        ((fee) this.i.getValue()).d(yu80Var.l);
        ((fee) this.j.getValue()).d(yu80Var.m);
        return new dv80(((Boolean) ((fee) this.x.getValue()).b()).booleanValue(), (imm) ((fee) this.s.getValue()).b(), (ot80) ((fee) this.t.getValue()).b(), (cv80) ((fee) this.w.getValue()).b(), (ku80) ((fee) this.u.getValue()).b());
    }
}
