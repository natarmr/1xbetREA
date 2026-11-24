package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zn0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44649a = 0;
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
    public final Object q;
    public final Object r;

    public zn0(ctf0 ctf0Var, ln0 ln0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(ln0Var.f20321a);
        this.d = bkb.H(ln0Var.c);
        this.e = bkb.H(Boolean.valueOf(ln0Var.b));
        Set set = ln0Var.k;
        this.f = bkb.H(set);
        this.g = maz.b(new yw9(ln0Var.d, new b5((byte) 27), (byte) 20));
        this.h = maz.b(new yw9(ln0Var.e, new b5((byte) 28), (byte) 20));
        this.i = maz.b(new yw9(ln0Var.g, new b5((byte) 29), (byte) 20));
        this.j = bkb.H(Boolean.valueOf(ln0Var.f));
        this.k = bkb.H(Integer.valueOf(ln0Var.i));
        this.l = bkb.H(ln0Var.j);
        un0 un0Var = ln0Var.m;
        this.m = bkb.H(un0Var);
        un0 un0Var2 = ln0Var.n;
        this.n = bkb.H(un0Var2);
        this.r = new imm(new ilm(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), new plm(ctf0Var.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))))), fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var)), false, null);
        this.o = bkb.G(c().d, new Function1(this) { // from class: a.yn0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                byte b2 = b;
                zn0 zn0Var = this.b;
                switch (b2) {
                    case 0:
                        n0o0 n0o0Var = zn0Var.g;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        fee feeVar = (fee) zn0Var.d.getValue();
                        ctf0 ctf0Var2 = zn0Var.b;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                                strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
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
                        String str = ql5Var != null ? ql5Var.f : null;
                        return new wdp((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str != null ? str : "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 1:
                        ((Pair) obj).getClass();
                        return zn0Var.a(yk0.FAVORITES, (un0) ((fee) zn0Var.m.getValue()).c());
                    default:
                        ((Pair) obj).getClass();
                        return zn0Var.a(yk0.VIEWED, (un0) ((fee) zn0Var.n.getValue()).c());
                }
            }
        });
        Pair pair = new Pair(un0Var, set);
        final byte b2 = 1;
        this.p = maz.b(new yw9(pair, new Function1(this) { // from class: a.yn0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                byte b3 = b2;
                zn0 zn0Var = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = zn0Var.g;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        fee feeVar = (fee) zn0Var.d.getValue();
                        ctf0 ctf0Var2 = zn0Var.b;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                                strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
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
                        String str = ql5Var != null ? ql5Var.f : null;
                        return new wdp((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str != null ? str : "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 1:
                        ((Pair) obj).getClass();
                        return zn0Var.a(yk0.FAVORITES, (un0) ((fee) zn0Var.m.getValue()).c());
                    default:
                        ((Pair) obj).getClass();
                        return zn0Var.a(yk0.VIEWED, (un0) ((fee) zn0Var.n.getValue()).c());
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.q = maz.b(new yw9(new Pair(un0Var2, set), new Function1(this) { // from class: a.yn0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                byte b4 = b3;
                zn0 zn0Var = this.b;
                switch (b4) {
                    case 0:
                        n0o0 n0o0Var = zn0Var.g;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        fee feeVar = (fee) zn0Var.d.getValue();
                        ctf0 ctf0Var2 = zn0Var.b;
                        ql5 ql5Var = (ql5) feeVar.c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((ijl) ((fee) n0o0Var.getValue()).b()) == ijl.b) {
                                strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
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
                        String str = ql5Var != null ? ql5Var.f : null;
                        return new wdp((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(strC, str != null ? str : "", ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                    case 1:
                        ((Pair) obj).getClass();
                        return zn0Var.a(yk0.FAVORITES, (un0) ((fee) zn0Var.m.getValue()).c());
                    default:
                        ((Pair) obj).getClass();
                        return zn0Var.a(yk0.VIEWED, (un0) ((fee) zn0Var.n.getValue()).c());
                }
            }
        }, (byte) 20));
    }

    public on0 a(yk0 yk0Var, un0 un0Var) {
        boolean zD = Intrinsics.d(un0Var, sn0.f32471a);
        n0o0 n0o0Var = this.k;
        n0o0 n0o0Var2 = this.i;
        n0o0 n0o0Var3 = this.j;
        o0s o0sVar = o0s.f24443a;
        if (zD) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new zl0(ju70.N(yk0Var, ((Boolean) c().c()).booleanValue(), ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue(), ((Number) ((fee) n0o0Var.getValue()).c()).intValue())));
            pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
            lc00 lc00VarB2 = kotlin.collections.a.b();
            int i = ao0.f1177a[pt0Var.ordinal()] == 1 ? 9 : 5;
            for (int i2 = 0; i2 < 5; i2++) {
                wll wllVar = new wll(o0sVar);
                lc00 lc00VarB3 = kotlin.collections.a.b();
                for (int i3 = 0; i3 < i; i3++) {
                    lc00VarB3.add(new fp1());
                }
                lc00VarB2.add(new xl0(new zll(pt0Var, wllVar, dyb.o0(kotlin.collections.a.a(lc00VarB3))), new ijm(), new j8b(0L, "", iun.f15405a, 0L, 0L, 0L)));
            }
            lc00VarB.addAll(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
            return new mn0(dyb.o0(kotlin.collections.a.a(lc00VarB)));
        }
        boolean z = un0Var instanceof pn0;
        n0o0 n0o0Var4 = this.l;
        n0o0 n0o0Var5 = this.f;
        int i4 = 10;
        if (!z) {
            if (!(un0Var instanceof rn0)) {
                if (Intrinsics.d(un0Var, qn0.f29010a) || Intrinsics.d(un0Var, tn0.f34216a)) {
                    return new mn0(lak0.c);
                }
                t9f.b();
                return null;
            }
            List<mlr> list = ((rn0) un0Var).f30764a;
            pt0 pt0Var2 = (pt0) ((fee) n0o0Var2.getValue()).b();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (mlr mlrVar : list) {
                mlr mlrVar2 = (mlr) ((Map) ((fee) n0o0Var4.getValue()).c()).get(Long.valueOf(mlrVar.f22006a));
                mlr mlrVar3 = mlrVar2 == null ? mlrVar : mlrVar2;
                arrayList.add(ccq0.Z(mlrVar3, this.b, ((Boolean) c().c()).booleanValue(), ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue(), ((Set) ((fee) n0o0Var5.getValue()).c()).contains(Long.valueOf(mlrVar3.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
            }
            return new nn0(new yl0(new zll(pt0Var2, xll.f41078a, dyb.o0(arrayList)), new j8b(0L, "", iun.f15405a, 0L, 0L, 0L)));
        }
        List list2 = ((pn0) un0Var).f27262a;
        lc00 lc00VarB4 = kotlin.collections.a.b();
        lc00VarB4.add(new zl0(ju70.N(yk0Var, ((Boolean) c().c()).booleanValue(), ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue(), ((Number) ((fee) n0o0Var.getValue()).c()).intValue())));
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            j8b j8bVar = (j8b) it.next();
            pt0 pt0Var3 = (pt0) ((fee) n0o0Var2.getValue()).b();
            boolean zBooleanValue = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) c().c()).booleanValue();
            Set set = (Set) ((fee) n0o0Var5.getValue()).c();
            Map map = (Map) ((fee) n0o0Var4.getValue()).c();
            j8bVar.getClass();
            pt0Var3.getClass();
            set.getClass();
            map.getClass();
            ctf0 ctf0Var = this.b;
            ctf0Var.getClass();
            List<mlr> listD0 = CollectionsKt.D0(j8bVar.c, i4);
            wll wllVar2 = new wll(o0sVar);
            Iterator it2 = it;
            n0o0 n0o0Var6 = n0o0Var2;
            n0o0 n0o0Var7 = n0o0Var3;
            ArrayList arrayList3 = new ArrayList(r3d.q(listD0, 10));
            for (mlr mlrVar4 : listD0) {
                o0s o0sVar2 = o0sVar;
                mlr mlrVar5 = (mlr) map.get(Long.valueOf(mlrVar4.f22006a));
                if (mlrVar5 != null) {
                    mlrVar4 = mlrVar5;
                }
                arrayList3.add(ccq0.Z(mlrVar4, ctf0Var, zBooleanValue2, zBooleanValue, set.contains(Long.valueOf(mlrVar4.f22006a)), pt0Var3, null));
                map = map;
                o0sVar = o0sVar2;
            }
            arrayList2.add(new xl0(new zll(pt0Var3, wllVar2, dyb.o0(arrayList3)), new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), j8bVar));
            it = it2;
            n0o0Var2 = n0o0Var6;
            n0o0Var3 = n0o0Var7;
            o0sVar = o0sVar;
            i4 = 10;
        }
        lc00VarB4.addAll(dyb.o0(arrayList2));
        return new mn0(dyb.o0(kotlin.collections.a.a(lc00VarB4)));
    }

    public fee b() {
        return (fee) this.c.getValue();
    }

    public fee c() {
        return (fee) this.e.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        un0 un0Var;
        byte b = this.f44649a;
        n0o0 n0o0Var = this.m;
        n0o0 n0o0Var2 = this.c;
        Object obj2 = this.q;
        n0o0 n0o0Var3 = this.e;
        Object obj3 = this.r;
        n0o0 n0o0Var4 = this.j;
        n0o0 n0o0Var5 = this.p;
        n0o0 n0o0Var6 = this.l;
        n0o0 n0o0Var7 = this.d;
        n0o0 n0o0Var8 = this.i;
        n0o0 n0o0Var9 = this.h;
        n0o0 n0o0Var10 = this.k;
        n0o0 n0o0Var11 = this.n;
        n0o0 n0o0Var12 = this.o;
        n0o0 n0o0Var13 = this.g;
        n0o0 n0o0Var14 = this.f;
        switch (b) {
            case 0:
                ln0 ln0Var = (ln0) obj;
                imm immVar = (imm) obj3;
                ln0Var.getClass();
                fee feeVar = (fee) n0o0Var2.getValue();
                yk0 yk0Var = ln0Var.f20321a;
                feeVar.d(yk0Var);
                ((fee) n0o0Var7.getValue()).d(ln0Var.c);
                c().d(Boolean.valueOf(ln0Var.b));
                ((fee) n0o0Var13.getValue()).d(ln0Var.d);
                ((fee) n0o0Var9.getValue()).d(ln0Var.e);
                ((fee) n0o0Var8.getValue()).d(ln0Var.g);
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(ln0Var.f));
                fee feeVar2 = (fee) n0o0Var14.getValue();
                Set set = ln0Var.k;
                feeVar2.d(set);
                ((fee) n0o0Var10.getValue()).d(Integer.valueOf(ln0Var.i));
                ((fee) n0o0Var6.getValue()).d(ln0Var.j);
                fee feeVar3 = (fee) n0o0Var.getValue();
                un0 un0Var2 = ln0Var.m;
                feeVar3.d(un0Var2);
                fee feeVar4 = (fee) n0o0Var11.getValue();
                un0 un0Var3 = ln0Var.n;
                feeVar4.d(un0Var3);
                ((fee) n0o0Var5.getValue()).d(new Pair(un0Var2, set));
                n0o0 n0o0Var15 = (n0o0) obj2;
                ((fee) n0o0Var15.getValue()).d(new Pair(un0Var3, set));
                int iOrdinal = ((yk0) ((fee) n0o0Var2.getValue()).c()).ordinal();
                if (iOrdinal == 0) {
                    un0Var = (un0) ((fee) n0o0Var.getValue()).c();
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    un0Var = (un0) ((fee) n0o0Var11.getValue()).c();
                }
                if (Intrinsics.d(un0Var, qn0.f29010a)) {
                    int iIntValue = ((Number) ((fee) n0o0Var10.getValue()).c()).intValue();
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar.getClass();
                    return new wn0(new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar, (wdp) ((fee) n0o0Var12.getValue()).b());
                }
                if (Intrinsics.d(un0Var, tn0.f34216a)) {
                    int iIntValue2 = ((Number) ((fee) n0o0Var10.getValue()).c()).intValue();
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.g;
                    xuzVar2.getClass();
                    return new wn0(new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar, (wdp) ((fee) n0o0Var12.getValue()).b());
                }
                wdp wdpVar = (wdp) ((fee) n0o0Var12.getValue()).b();
                ctf0 ctf0Var = this.b;
                String strA = ctf0Var.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0));
                bwh0 bwh0Var = bwh0.f3325a;
                i4 i4VarG0 = dyb.g0(new yvh0(strA, bwh0Var), new yvh0(ctf0Var.b.a(R.string.viewed_name, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                boolean z = yk0Var.f42763a;
                dxh0 dxh0Var = (dxh0) ((fee) n0o0Var9.getValue()).b();
                on0 on0Var = (on0) ((fee) n0o0Var5.getValue()).b();
                on0 on0Var2 = (on0) ((fee) n0o0Var15.getValue()).b();
                return new vn0(wdpVar, i4VarG0, z ? 1 : 0, (yk0) ((fee) n0o0Var2.getValue()).c(), dxh0Var, on0Var, on0Var2, (imm) obj3);
            case 1:
                sg20 sg20Var = (sg20) obj;
                sg20Var.getClass();
                fee feeVar5 = (fee) n0o0Var2.getValue();
                feeVar5.getClass();
                pz40 pz40VarA = feeVar5.a();
                ((ky6) feeVar5.a().getValue()).getClass();
                pz40VarA.setValue(sg20Var.b);
                fee feeVar6 = (fee) n0o0Var7.getValue();
                feeVar6.getClass();
                pz40 pz40VarA2 = feeVar6.a();
                ((ym5) feeVar6.a().getValue()).getClass();
                pz40VarA2.setValue(sg20Var.c);
                fee feeVar7 = (fee) n0o0Var3.getValue();
                feeVar7.getClass();
                pz40 pz40VarA3 = feeVar7.a();
                ((eo7) feeVar7.a().getValue()).getClass();
                pz40VarA3.setValue(sg20Var.d);
                fee feeVar8 = (fee) n0o0Var14.getValue();
                feeVar8.getClass();
                pz40 pz40VarA4 = feeVar8.a();
                ((qvj0) feeVar8.a().getValue()).getClass();
                pz40VarA4.setValue(sg20Var.e);
                fee feeVar9 = (fee) n0o0Var13.getValue();
                feeVar9.getClass();
                pz40 pz40VarA5 = feeVar9.a();
                ((ifc0) feeVar9.a().getValue()).getClass();
                pz40VarA5.setValue(sg20Var.f);
                fee feeVar10 = (fee) n0o0Var9.getValue();
                feeVar10.getClass();
                pz40 pz40VarA6 = feeVar10.a();
                ((Boolean) feeVar10.a().getValue()).getClass();
                pz40VarA6.setValue(Boolean.valueOf(sg20Var.h));
                fee feeVar11 = (fee) n0o0Var8.getValue();
                feeVar11.getClass();
                pz40 pz40VarA7 = feeVar11.a();
                ((Boolean) feeVar11.a().getValue()).getClass();
                pz40VarA7.setValue(Boolean.valueOf(sg20Var.j));
                return new d820((ug20) obj3, null, null, new zbr((y00) ((fee) n0o0Var6.getValue()).b(), (u820) ((fee) n0o0Var10.getValue()).b(), (wwh0) ((fee) n0o0Var.getValue()).b(), (gf6) ((fee) n0o0Var11.getValue()).b(), (bwj0) ((fee) n0o0Var12.getValue()).b(), (b7c0) ((fee) n0o0Var5.getValue()).b(), null, (mtl) ((fee) n0o0Var4.getValue()).b(), ((Boolean) ((fee) n0o0Var8.getValue()).c()).booleanValue()), 2);
            default:
                olb0 olb0Var = (olb0) obj;
                olb0Var.getClass();
                fee feeVarB = b();
                bib0 bib0Var = olb0Var.k;
                feeVarB.d(bib0Var);
                ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(olb0Var.e));
                ((fee) n0o0Var14.getValue()).d(olb0Var.f);
                ((fee) n0o0Var13.getValue()).d(olb0Var.f25444a);
                ((fee) n0o0Var12.getValue()).d(olb0Var.j);
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(bib0Var.f2652a));
                ((fee) n0o0Var10.getValue()).d(bib0Var.w);
                fee feeVar12 = (fee) n0o0Var9.getValue();
                boolean z2 = olb0Var.d;
                feeVar12.d(Boolean.valueOf(z2));
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(z2));
                ((fee) n0o0Var7.getValue()).d(olb0Var.b);
                ((fee) n0o0Var6.getValue()).d(olb0Var.c);
                ((fee) n0o0Var5.getValue()).d(olb0Var.l);
                Iterable iterable = (Iterable) ((fee) n0o0Var13.getValue()).b();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(vdx.e0((amb0) it.next()));
                }
                i4 i4VarR0 = dyb.r0(arrayList);
                int iIntValue3 = ((Number) ((fee) ((n0o0) obj2).getValue()).b()).intValue();
                ylb0 ylb0VarE0 = vdx.e0((amb0) ((fee) n0o0Var7.getValue()).c());
                boolean zBooleanValue = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                String str = (String) ((fee) n0o0Var14.getValue()).b();
                aoo0 aoo0Var = (aoo0) ((fee) n0o0Var10.getValue()).b();
                i4 i4Var = (i4) ((fee) n0o0Var4.getValue()).b();
                hdb0 hdb0Var = (hdb0) ((fee) n0o0Var12.getValue()).b();
                return new emb0(i4VarR0, iIntValue3, ylb0VarE0, zBooleanValue, str, aoo0Var, i4Var, (cmm) ((fee) n0o0Var11.getValue()).b(), (g1b0) ((fee) n0o0Var9.getValue()).b(), hdb0Var, (skb0) ((fee) n0o0Var5.getValue()).b());
        }
    }

    public zn0(sg20 sg20Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        ug20 ug20Var;
        final byte b = 1;
        ctf0Var.getClass();
        this.q = sg20Var;
        this.b = ctf0Var;
        int iOrdinal = sg20Var.g.ordinal();
        final byte b2 = 3;
        final byte b3 = 2;
        if (iOrdinal == 1) {
            ug20Var = ug20.b;
        } else if (iOrdinal == 2) {
            ug20Var = ug20.f35603a;
        } else if (iOrdinal != 3) {
            ug20Var = ug20.b;
        } else {
            ug20Var = ug20.c;
        }
        this.r = ug20Var;
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
        this.j = maz.b(new yw9((fee) n0o0VarH6.getValue(), new Function1(this) { // from class: a.wbr
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:59:0x021b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0224  */
            /* JADX WARN: Code duplicated, block: B:78:0x0240  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:83:0x025d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0265  */
            /* JADX WARN: Code duplicated, block: B:86:0x0267  */
            /* JADX WARN: Code duplicated, block: B:88:0x026d  */
            /* JADX WARN: Code duplicated, block: B:90:0x027c  */
            /* JADX WARN: Code duplicated, block: B:92:0x0280  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a7 A[LOOP:0: B:94:0x02a1->B:96:0x02a7, LOOP_END] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                double d;
                boolean z2;
                rln0 jln0Var;
                boolean z3;
                lx6 lx6Var;
                jwo0 jwo0Var;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                l85 l85Var;
                i4 i4VarR0;
                byte b5 = b4;
                zn0 zn0Var = this.b;
                switch (b5) {
                    case 0:
                        ((fee) obj).getClass();
                        eo7 eo7Var = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (eo7Var != null) {
                            if (eo7Var instanceof bo7) {
                                uw6 uw6Var = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b;
                                if (uw6Var.h) {
                                    double d3 = uw6Var.f36378a;
                                    z = d3 != -1.0d && uw6Var.d <= d3 && d3 <= 9.99999999999999E12d && uw6Var.m;
                                } else {
                                    z = uw6Var.i;
                                }
                            } else if (eo7Var instanceof yn7) {
                                z = ((ifc0) ((fee) zn0Var.g.getValue()).c()).e;
                            }
                            boolean z4 = z;
                            boolean zBooleanValue = ((Boolean) ((fee) zn0Var.i.getValue()).c()).booleanValue();
                            ctf0 ctf0Var2 = zn0Var.b;
                            if (zBooleanValue) {
                                return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z4, false, true), ybr.f42352a)));
                            }
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        ky6 ky6Var = (ky6) feeVar.c();
                        FinBetInfoModel finBetInfoModel = ((sg20) zn0Var.q).f32140a;
                        ky6Var.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        iur iurVar = ky6Var.b;
                        String strJ = pn40.j(iurVar.d, finBetInfoModel.g, false);
                        return new r820(new qy6(new vf40(new igs(iurVar.b, iurVar.f15410a, finBetInfoModel.k ? new z5q(strJ) : new a6q(strJ)), iurVar.c)), null);
                    case 2:
                        ((fee) obj).getClass();
                        u00 u00Var = new u00(zn0Var.b.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), false, null);
                        n0o0 n0o0Var = zn0Var.c;
                        return new y00(u00Var, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.f18089a, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.b);
                    case 3:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        ym5 ym5Var = (ym5) feeVar2.c();
                        ctf0 ctf0Var3 = zn0Var.b;
                        eo7 eo7Var2 = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (Intrinsics.d(eo7Var2, bo7.f2918a)) {
                            d = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b.f36378a;
                        } else {
                            if (!Intrinsics.d(eo7Var2, yn7.f42924a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        ym5Var.getClass();
                        ql5 ql5Var = ym5Var.c;
                        ctf0Var3.getClass();
                        String str = ql5Var.f;
                        double d4 = ql5Var.b;
                        pn40 pn40Var2 = pn40.f27267a;
                        return new gf6(null, i30.f14073a, new tw7(pn40.c(d4, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d4 == 0.0d || d > d4) && ql5Var.f28916a != 0 && ctf0Var3.i(), ym5Var.d));
                    case 4:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        qvj0 qvj0Var = (qvj0) feeVar3.c();
                        String str2 = ((ym5) ((fee) zn0Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = zn0Var.b;
                        qvj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        cx6 cx6Var = qvj0Var.f29389a;
                        lnb0 lnb0Var = qvj0Var.b;
                        uw6 uw6Var2 = cx6Var.b;
                        double d5 = uw6Var2.d;
                        double d6 = uw6Var2.f36378a;
                        boolean z5 = uw6Var2.k;
                        boolean z6 = uw6Var2.h;
                        lx6 lx6Var2 = z5 ? lx6.c : ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(cx6Var.f5109a);
                        lsm0 lsm0Var = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), uw6Var2.l, true, false);
                        if (!lnb0Var.f20336a || lx6Var2 == lx6.b) {
                            if (d6 < d5) {
                                String strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d5, str2, p3u0.c)));
                            } else if (d6 > 9.99999999999999E12d) {
                                z2 = true;
                                String strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(9.99999999999999E12d, str2, p3u0.c)));
                            } else {
                                z2 = true;
                                jln0Var = new jln0("");
                            }
                            boolean z7 = uw6Var2.j;
                            if (d6 > d5 || !z6) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (d6 < 9.99999999999999E12d || !z6) {
                                z2 = false;
                            }
                            nke nkeVar = new nke(z7, z7, z3, z2);
                            if (z5 && z6) {
                                lx6Var = ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                            } else {
                                lx6Var = lx6.c;
                            }
                            aw6 aw6Var = new aw6(sx6Var, jln0Var, nkeVar, lx6Var, null, str2);
                            jwo0Var = qvj0Var.c;
                            if (jwo0Var.f17262a) {
                                String str3 = jwo0Var.b;
                                String str4 = jwo0Var.c;
                                if (jwo0Var.d) {
                                    gmkVar = null;
                                } else {
                                    d2 = jwo0Var.e;
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
                                boolean z8 = jwo0Var.d;
                                List<mvo0> list = jwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list, 10));
                                for (mvo0 mvo0Var : list) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str3, str4, gmkVar, z8, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var, gxo0Var, null);
                        }
                        jln0Var = new nln0(lnb0Var.b, lnb0Var.c);
                        z2 = true;
                        boolean z9 = uw6Var2.j;
                        if (d6 > d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (d6 < 9.99999999999999E12d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nke nkeVar2 = new nke(z9, z9, z3, z2);
                        if (z5) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = lx6.c;
                        }
                        aw6 aw6Var2 = new aw6(sx6Var, jln0Var, nkeVar2, lx6Var, null, str2);
                        jwo0Var = qvj0Var.c;
                        if (jwo0Var.f17262a) {
                            gxo0Var = null;
                        } else {
                            String str5 = jwo0Var.b;
                            String str6 = jwo0Var.c;
                            if (jwo0Var.d) {
                                gmkVar = null;
                            } else {
                                d2 = jwo0Var.e;
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
                            boolean z10 = jwo0Var.d;
                            List<mvo0> list2 = jwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str5, str6, gmkVar, z10, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var2, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        ifc0 ifc0Var = (ifc0) feeVar4.c();
                        ctf0 ctf0Var5 = zn0Var.b;
                        ifc0Var.getClass();
                        ctf0Var5.getClass();
                        azc0 azc0Var = ifc0Var.f14680a;
                        bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                        int iOrdinal2 = ifc0Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            xyc0Var = xyc0.f41702a;
                        } else {
                            if (iOrdinal2 != 1) {
                                t9f.b();
                                return null;
                            }
                            xyc0Var = xyc0.b;
                        }
                        if (azc0Var.f) {
                            lsm0 lsm0Var2 = ctf0Var5.b;
                            l85Var = new l85(lsm0Var2.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            l85Var = null;
                        }
                        plc0 plc0Var = ifc0Var.c;
                        boolean z11 = plc0Var.h;
                        double d7 = plc0Var.f27176a;
                        String str7 = plc0Var.c;
                        if (z11) {
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i3 = cy7.f5159a;
                            pn40 pn40Var9 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d7, str7, p3u0Var)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), plc0Var.b, false), plc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(plc0Var.e, str7, p3u0Var)), true) : null, plc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((plc0Var.d - 1.0d) * d7, str7, p3u0Var)), true) : null}));
                        } else {
                            i4VarR0 = null;
                        }
                        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
                }
            }
        }, (byte) 20));
        this.k = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.wbr
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:59:0x021b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0224  */
            /* JADX WARN: Code duplicated, block: B:78:0x0240  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:83:0x025d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0265  */
            /* JADX WARN: Code duplicated, block: B:86:0x0267  */
            /* JADX WARN: Code duplicated, block: B:88:0x026d  */
            /* JADX WARN: Code duplicated, block: B:90:0x027c  */
            /* JADX WARN: Code duplicated, block: B:92:0x0280  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a7 A[LOOP:0: B:94:0x02a1->B:96:0x02a7, LOOP_END] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                double d;
                boolean z2;
                rln0 jln0Var;
                boolean z3;
                lx6 lx6Var;
                jwo0 jwo0Var;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                l85 l85Var;
                i4 i4VarR0;
                byte b5 = b;
                zn0 zn0Var = this.b;
                switch (b5) {
                    case 0:
                        ((fee) obj).getClass();
                        eo7 eo7Var = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (eo7Var != null) {
                            if (eo7Var instanceof bo7) {
                                uw6 uw6Var = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b;
                                if (uw6Var.h) {
                                    double d3 = uw6Var.f36378a;
                                    z = d3 != -1.0d && uw6Var.d <= d3 && d3 <= 9.99999999999999E12d && uw6Var.m;
                                } else {
                                    z = uw6Var.i;
                                }
                            } else if (eo7Var instanceof yn7) {
                                z = ((ifc0) ((fee) zn0Var.g.getValue()).c()).e;
                            }
                            boolean z4 = z;
                            boolean zBooleanValue = ((Boolean) ((fee) zn0Var.i.getValue()).c()).booleanValue();
                            ctf0 ctf0Var2 = zn0Var.b;
                            if (zBooleanValue) {
                                return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z4, false, true), ybr.f42352a)));
                            }
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        ky6 ky6Var = (ky6) feeVar.c();
                        FinBetInfoModel finBetInfoModel = ((sg20) zn0Var.q).f32140a;
                        ky6Var.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        iur iurVar = ky6Var.b;
                        String strJ = pn40.j(iurVar.d, finBetInfoModel.g, false);
                        return new r820(new qy6(new vf40(new igs(iurVar.b, iurVar.f15410a, finBetInfoModel.k ? new z5q(strJ) : new a6q(strJ)), iurVar.c)), null);
                    case 2:
                        ((fee) obj).getClass();
                        u00 u00Var = new u00(zn0Var.b.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), false, null);
                        n0o0 n0o0Var = zn0Var.c;
                        return new y00(u00Var, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.f18089a, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.b);
                    case 3:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        ym5 ym5Var = (ym5) feeVar2.c();
                        ctf0 ctf0Var3 = zn0Var.b;
                        eo7 eo7Var2 = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (Intrinsics.d(eo7Var2, bo7.f2918a)) {
                            d = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b.f36378a;
                        } else {
                            if (!Intrinsics.d(eo7Var2, yn7.f42924a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        ym5Var.getClass();
                        ql5 ql5Var = ym5Var.c;
                        ctf0Var3.getClass();
                        String str = ql5Var.f;
                        double d4 = ql5Var.b;
                        pn40 pn40Var2 = pn40.f27267a;
                        return new gf6(null, i30.f14073a, new tw7(pn40.c(d4, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d4 == 0.0d || d > d4) && ql5Var.f28916a != 0 && ctf0Var3.i(), ym5Var.d));
                    case 4:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        qvj0 qvj0Var = (qvj0) feeVar3.c();
                        String str2 = ((ym5) ((fee) zn0Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = zn0Var.b;
                        qvj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        cx6 cx6Var = qvj0Var.f29389a;
                        lnb0 lnb0Var = qvj0Var.b;
                        uw6 uw6Var2 = cx6Var.b;
                        double d5 = uw6Var2.d;
                        double d6 = uw6Var2.f36378a;
                        boolean z5 = uw6Var2.k;
                        boolean z6 = uw6Var2.h;
                        lx6 lx6Var2 = z5 ? lx6.c : ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(cx6Var.f5109a);
                        lsm0 lsm0Var = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), uw6Var2.l, true, false);
                        if (!lnb0Var.f20336a || lx6Var2 == lx6.b) {
                            if (d6 < d5) {
                                String strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d5, str2, p3u0.c)));
                            } else if (d6 > 9.99999999999999E12d) {
                                z2 = true;
                                String strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(9.99999999999999E12d, str2, p3u0.c)));
                            } else {
                                z2 = true;
                                jln0Var = new jln0("");
                            }
                            boolean z9 = uw6Var2.j;
                            if (d6 > d5 || !z6) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (d6 < 9.99999999999999E12d || !z6) {
                                z2 = false;
                            }
                            nke nkeVar2 = new nke(z9, z9, z3, z2);
                            if (z5 && z6) {
                                lx6Var = ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                            } else {
                                lx6Var = lx6.c;
                            }
                            aw6 aw6Var2 = new aw6(sx6Var, jln0Var, nkeVar2, lx6Var, null, str2);
                            jwo0Var = qvj0Var.c;
                            if (jwo0Var.f17262a) {
                                String str5 = jwo0Var.b;
                                String str6 = jwo0Var.c;
                                if (jwo0Var.d) {
                                    gmkVar = null;
                                } else {
                                    d2 = jwo0Var.e;
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
                                boolean z10 = jwo0Var.d;
                                List<mvo0> list2 = jwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list2, 10));
                                for (mvo0 mvo0Var : list2) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str5, str6, gmkVar, z10, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var2, gxo0Var, null);
                        }
                        jln0Var = new nln0(lnb0Var.b, lnb0Var.c);
                        z2 = true;
                        boolean z11 = uw6Var2.j;
                        if (d6 > d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (d6 < 9.99999999999999E12d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nke nkeVar3 = new nke(z11, z11, z3, z2);
                        if (z5) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = lx6.c;
                        }
                        aw6 aw6Var3 = new aw6(sx6Var, jln0Var, nkeVar3, lx6Var, null, str2);
                        jwo0Var = qvj0Var.c;
                        if (jwo0Var.f17262a) {
                            gxo0Var = null;
                        } else {
                            String str7 = jwo0Var.b;
                            String str8 = jwo0Var.c;
                            if (jwo0Var.d) {
                                gmkVar = null;
                            } else {
                                d2 = jwo0Var.e;
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
                            boolean z12 = jwo0Var.d;
                            List<mvo0> list3 = jwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list3, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str7, str8, gmkVar, z12, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var3, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        ifc0 ifc0Var = (ifc0) feeVar4.c();
                        ctf0 ctf0Var5 = zn0Var.b;
                        ifc0Var.getClass();
                        ctf0Var5.getClass();
                        azc0 azc0Var = ifc0Var.f14680a;
                        bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                        int iOrdinal2 = ifc0Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            xyc0Var = xyc0.f41702a;
                        } else {
                            if (iOrdinal2 != 1) {
                                t9f.b();
                                return null;
                            }
                            xyc0Var = xyc0.b;
                        }
                        if (azc0Var.f) {
                            lsm0 lsm0Var2 = ctf0Var5.b;
                            l85Var = new l85(lsm0Var2.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            l85Var = null;
                        }
                        plc0 plc0Var = ifc0Var.c;
                        boolean z13 = plc0Var.h;
                        double d7 = plc0Var.f27176a;
                        String str9 = plc0Var.c;
                        if (z13) {
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i3 = cy7.f5159a;
                            pn40 pn40Var11 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d7, str9, p3u0Var)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), plc0Var.b, false), plc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(plc0Var.e, str9, p3u0Var)), true) : null, plc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((plc0Var.d - 1.0d) * d7, str9, p3u0Var)), true) : null}));
                        } else {
                            i4VarR0 = null;
                        }
                        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
                }
            }
        }, (byte) 20));
        this.l = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.wbr
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:59:0x021b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0224  */
            /* JADX WARN: Code duplicated, block: B:78:0x0240  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:83:0x025d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0265  */
            /* JADX WARN: Code duplicated, block: B:86:0x0267  */
            /* JADX WARN: Code duplicated, block: B:88:0x026d  */
            /* JADX WARN: Code duplicated, block: B:90:0x027c  */
            /* JADX WARN: Code duplicated, block: B:92:0x0280  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a7 A[LOOP:0: B:94:0x02a1->B:96:0x02a7, LOOP_END] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                double d;
                boolean z2;
                rln0 jln0Var;
                boolean z3;
                lx6 lx6Var;
                jwo0 jwo0Var;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                l85 l85Var;
                i4 i4VarR0;
                byte b5 = b3;
                zn0 zn0Var = this.b;
                switch (b5) {
                    case 0:
                        ((fee) obj).getClass();
                        eo7 eo7Var = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (eo7Var != null) {
                            if (eo7Var instanceof bo7) {
                                uw6 uw6Var = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b;
                                if (uw6Var.h) {
                                    double d3 = uw6Var.f36378a;
                                    z = d3 != -1.0d && uw6Var.d <= d3 && d3 <= 9.99999999999999E12d && uw6Var.m;
                                } else {
                                    z = uw6Var.i;
                                }
                            } else if (eo7Var instanceof yn7) {
                                z = ((ifc0) ((fee) zn0Var.g.getValue()).c()).e;
                            }
                            boolean z4 = z;
                            boolean zBooleanValue = ((Boolean) ((fee) zn0Var.i.getValue()).c()).booleanValue();
                            ctf0 ctf0Var2 = zn0Var.b;
                            if (zBooleanValue) {
                                return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z4, false, true), ybr.f42352a)));
                            }
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        ky6 ky6Var = (ky6) feeVar.c();
                        FinBetInfoModel finBetInfoModel = ((sg20) zn0Var.q).f32140a;
                        ky6Var.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        iur iurVar = ky6Var.b;
                        String strJ = pn40.j(iurVar.d, finBetInfoModel.g, false);
                        return new r820(new qy6(new vf40(new igs(iurVar.b, iurVar.f15410a, finBetInfoModel.k ? new z5q(strJ) : new a6q(strJ)), iurVar.c)), null);
                    case 2:
                        ((fee) obj).getClass();
                        u00 u00Var = new u00(zn0Var.b.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), false, null);
                        n0o0 n0o0Var = zn0Var.c;
                        return new y00(u00Var, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.f18089a, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.b);
                    case 3:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        ym5 ym5Var = (ym5) feeVar2.c();
                        ctf0 ctf0Var3 = zn0Var.b;
                        eo7 eo7Var2 = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (Intrinsics.d(eo7Var2, bo7.f2918a)) {
                            d = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b.f36378a;
                        } else {
                            if (!Intrinsics.d(eo7Var2, yn7.f42924a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        ym5Var.getClass();
                        ql5 ql5Var = ym5Var.c;
                        ctf0Var3.getClass();
                        String str = ql5Var.f;
                        double d4 = ql5Var.b;
                        pn40 pn40Var2 = pn40.f27267a;
                        return new gf6(null, i30.f14073a, new tw7(pn40.c(d4, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d4 == 0.0d || d > d4) && ql5Var.f28916a != 0 && ctf0Var3.i(), ym5Var.d));
                    case 4:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        qvj0 qvj0Var = (qvj0) feeVar3.c();
                        String str2 = ((ym5) ((fee) zn0Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = zn0Var.b;
                        qvj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        cx6 cx6Var = qvj0Var.f29389a;
                        lnb0 lnb0Var = qvj0Var.b;
                        uw6 uw6Var2 = cx6Var.b;
                        double d5 = uw6Var2.d;
                        double d6 = uw6Var2.f36378a;
                        boolean z5 = uw6Var2.k;
                        boolean z6 = uw6Var2.h;
                        lx6 lx6Var2 = z5 ? lx6.c : ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(cx6Var.f5109a);
                        lsm0 lsm0Var = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), uw6Var2.l, true, false);
                        if (!lnb0Var.f20336a || lx6Var2 == lx6.b) {
                            if (d6 < d5) {
                                String strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d5, str2, p3u0.c)));
                            } else if (d6 > 9.99999999999999E12d) {
                                z2 = true;
                                String strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(9.99999999999999E12d, str2, p3u0.c)));
                            } else {
                                z2 = true;
                                jln0Var = new jln0("");
                            }
                            boolean z11 = uw6Var2.j;
                            if (d6 > d5 || !z6) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (d6 < 9.99999999999999E12d || !z6) {
                                z2 = false;
                            }
                            nke nkeVar3 = new nke(z11, z11, z3, z2);
                            if (z5 && z6) {
                                lx6Var = ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                            } else {
                                lx6Var = lx6.c;
                            }
                            aw6 aw6Var3 = new aw6(sx6Var, jln0Var, nkeVar3, lx6Var, null, str2);
                            jwo0Var = qvj0Var.c;
                            if (jwo0Var.f17262a) {
                                String str7 = jwo0Var.b;
                                String str8 = jwo0Var.c;
                                if (jwo0Var.d) {
                                    gmkVar = null;
                                } else {
                                    d2 = jwo0Var.e;
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
                                boolean z12 = jwo0Var.d;
                                List<mvo0> list3 = jwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list3, 10));
                                for (mvo0 mvo0Var : list3) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str7, str8, gmkVar, z12, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var3, gxo0Var, null);
                        }
                        jln0Var = new nln0(lnb0Var.b, lnb0Var.c);
                        z2 = true;
                        boolean z13 = uw6Var2.j;
                        if (d6 > d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (d6 < 9.99999999999999E12d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nke nkeVar4 = new nke(z13, z13, z3, z2);
                        if (z5) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = lx6.c;
                        }
                        aw6 aw6Var4 = new aw6(sx6Var, jln0Var, nkeVar4, lx6Var, null, str2);
                        jwo0Var = qvj0Var.c;
                        if (jwo0Var.f17262a) {
                            gxo0Var = null;
                        } else {
                            String str9 = jwo0Var.b;
                            String str10 = jwo0Var.c;
                            if (jwo0Var.d) {
                                gmkVar = null;
                            } else {
                                d2 = jwo0Var.e;
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
                            boolean z14 = jwo0Var.d;
                            List<mvo0> list4 = jwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list4, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str9, str10, gmkVar, z14, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var4, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        ifc0 ifc0Var = (ifc0) feeVar4.c();
                        ctf0 ctf0Var5 = zn0Var.b;
                        ifc0Var.getClass();
                        ctf0Var5.getClass();
                        azc0 azc0Var = ifc0Var.f14680a;
                        bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                        int iOrdinal2 = ifc0Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            xyc0Var = xyc0.f41702a;
                        } else {
                            if (iOrdinal2 != 1) {
                                t9f.b();
                                return null;
                            }
                            xyc0Var = xyc0.b;
                        }
                        if (azc0Var.f) {
                            lsm0 lsm0Var2 = ctf0Var5.b;
                            l85Var = new l85(lsm0Var2.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            l85Var = null;
                        }
                        plc0 plc0Var = ifc0Var.c;
                        boolean z15 = plc0Var.h;
                        double d7 = plc0Var.f27176a;
                        String str11 = plc0Var.c;
                        if (z15) {
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i3 = cy7.f5159a;
                            pn40 pn40Var13 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d7, str11, p3u0Var)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), plc0Var.b, false), plc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(plc0Var.e, str11, p3u0Var)), true) : null, plc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((plc0Var.d - 1.0d) * d7, str11, p3u0Var)), true) : null}));
                        } else {
                            i4VarR0 = null;
                        }
                        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
                }
            }
        }, (byte) 20));
        this.m = maz.b(new yw9((fee) n0o0VarH3.getValue(), new f5p(this, zvh0Var, (byte) 17), (byte) 20));
        this.n = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.wbr
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:59:0x021b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0224  */
            /* JADX WARN: Code duplicated, block: B:78:0x0240  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:83:0x025d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0265  */
            /* JADX WARN: Code duplicated, block: B:86:0x0267  */
            /* JADX WARN: Code duplicated, block: B:88:0x026d  */
            /* JADX WARN: Code duplicated, block: B:90:0x027c  */
            /* JADX WARN: Code duplicated, block: B:92:0x0280  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a7 A[LOOP:0: B:94:0x02a1->B:96:0x02a7, LOOP_END] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                double d;
                boolean z2;
                rln0 jln0Var;
                boolean z3;
                lx6 lx6Var;
                jwo0 jwo0Var;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                l85 l85Var;
                i4 i4VarR0;
                byte b5 = b2;
                zn0 zn0Var = this.b;
                switch (b5) {
                    case 0:
                        ((fee) obj).getClass();
                        eo7 eo7Var = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (eo7Var != null) {
                            if (eo7Var instanceof bo7) {
                                uw6 uw6Var = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b;
                                if (uw6Var.h) {
                                    double d3 = uw6Var.f36378a;
                                    z = d3 != -1.0d && uw6Var.d <= d3 && d3 <= 9.99999999999999E12d && uw6Var.m;
                                } else {
                                    z = uw6Var.i;
                                }
                            } else if (eo7Var instanceof yn7) {
                                z = ((ifc0) ((fee) zn0Var.g.getValue()).c()).e;
                            }
                            boolean z4 = z;
                            boolean zBooleanValue = ((Boolean) ((fee) zn0Var.i.getValue()).c()).booleanValue();
                            ctf0 ctf0Var2 = zn0Var.b;
                            if (zBooleanValue) {
                                return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z4, false, true), ybr.f42352a)));
                            }
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        ky6 ky6Var = (ky6) feeVar.c();
                        FinBetInfoModel finBetInfoModel = ((sg20) zn0Var.q).f32140a;
                        ky6Var.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        iur iurVar = ky6Var.b;
                        String strJ = pn40.j(iurVar.d, finBetInfoModel.g, false);
                        return new r820(new qy6(new vf40(new igs(iurVar.b, iurVar.f15410a, finBetInfoModel.k ? new z5q(strJ) : new a6q(strJ)), iurVar.c)), null);
                    case 2:
                        ((fee) obj).getClass();
                        u00 u00Var = new u00(zn0Var.b.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), false, null);
                        n0o0 n0o0Var = zn0Var.c;
                        return new y00(u00Var, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.f18089a, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.b);
                    case 3:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        ym5 ym5Var = (ym5) feeVar2.c();
                        ctf0 ctf0Var3 = zn0Var.b;
                        eo7 eo7Var2 = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (Intrinsics.d(eo7Var2, bo7.f2918a)) {
                            d = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b.f36378a;
                        } else {
                            if (!Intrinsics.d(eo7Var2, yn7.f42924a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        ym5Var.getClass();
                        ql5 ql5Var = ym5Var.c;
                        ctf0Var3.getClass();
                        String str = ql5Var.f;
                        double d4 = ql5Var.b;
                        pn40 pn40Var2 = pn40.f27267a;
                        return new gf6(null, i30.f14073a, new tw7(pn40.c(d4, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d4 == 0.0d || d > d4) && ql5Var.f28916a != 0 && ctf0Var3.i(), ym5Var.d));
                    case 4:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        qvj0 qvj0Var = (qvj0) feeVar3.c();
                        String str2 = ((ym5) ((fee) zn0Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = zn0Var.b;
                        qvj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        cx6 cx6Var = qvj0Var.f29389a;
                        lnb0 lnb0Var = qvj0Var.b;
                        uw6 uw6Var2 = cx6Var.b;
                        double d5 = uw6Var2.d;
                        double d6 = uw6Var2.f36378a;
                        boolean z5 = uw6Var2.k;
                        boolean z6 = uw6Var2.h;
                        lx6 lx6Var2 = z5 ? lx6.c : ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(cx6Var.f5109a);
                        lsm0 lsm0Var = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), uw6Var2.l, true, false);
                        if (!lnb0Var.f20336a || lx6Var2 == lx6.b) {
                            if (d6 < d5) {
                                String strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d5, str2, p3u0.c)));
                            } else if (d6 > 9.99999999999999E12d) {
                                z2 = true;
                                String strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(9.99999999999999E12d, str2, p3u0.c)));
                            } else {
                                z2 = true;
                                jln0Var = new jln0("");
                            }
                            boolean z13 = uw6Var2.j;
                            if (d6 > d5 || !z6) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (d6 < 9.99999999999999E12d || !z6) {
                                z2 = false;
                            }
                            nke nkeVar4 = new nke(z13, z13, z3, z2);
                            if (z5 && z6) {
                                lx6Var = ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                            } else {
                                lx6Var = lx6.c;
                            }
                            aw6 aw6Var4 = new aw6(sx6Var, jln0Var, nkeVar4, lx6Var, null, str2);
                            jwo0Var = qvj0Var.c;
                            if (jwo0Var.f17262a) {
                                String str9 = jwo0Var.b;
                                String str10 = jwo0Var.c;
                                if (jwo0Var.d) {
                                    gmkVar = null;
                                } else {
                                    d2 = jwo0Var.e;
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
                                boolean z14 = jwo0Var.d;
                                List<mvo0> list4 = jwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list4, 10));
                                for (mvo0 mvo0Var : list4) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str9, str10, gmkVar, z14, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var4, gxo0Var, null);
                        }
                        jln0Var = new nln0(lnb0Var.b, lnb0Var.c);
                        z2 = true;
                        boolean z15 = uw6Var2.j;
                        if (d6 > d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (d6 < 9.99999999999999E12d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nke nkeVar5 = new nke(z15, z15, z3, z2);
                        if (z5) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = lx6.c;
                        }
                        aw6 aw6Var5 = new aw6(sx6Var, jln0Var, nkeVar5, lx6Var, null, str2);
                        jwo0Var = qvj0Var.c;
                        if (jwo0Var.f17262a) {
                            gxo0Var = null;
                        } else {
                            String str11 = jwo0Var.b;
                            String str12 = jwo0Var.c;
                            if (jwo0Var.d) {
                                gmkVar = null;
                            } else {
                                d2 = jwo0Var.e;
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
                            boolean z16 = jwo0Var.d;
                            List<mvo0> list5 = jwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list5, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str11, str12, gmkVar, z16, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var5, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        ifc0 ifc0Var = (ifc0) feeVar4.c();
                        ctf0 ctf0Var5 = zn0Var.b;
                        ifc0Var.getClass();
                        ctf0Var5.getClass();
                        azc0 azc0Var = ifc0Var.f14680a;
                        bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                        int iOrdinal2 = ifc0Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            xyc0Var = xyc0.f41702a;
                        } else {
                            if (iOrdinal2 != 1) {
                                t9f.b();
                                return null;
                            }
                            xyc0Var = xyc0.b;
                        }
                        if (azc0Var.f) {
                            lsm0 lsm0Var2 = ctf0Var5.b;
                            l85Var = new l85(lsm0Var2.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            l85Var = null;
                        }
                        plc0 plc0Var = ifc0Var.c;
                        boolean z17 = plc0Var.h;
                        double d7 = plc0Var.f27176a;
                        String str13 = plc0Var.c;
                        if (z17) {
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i3 = cy7.f5159a;
                            pn40 pn40Var15 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d7, str13, p3u0Var)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), plc0Var.b, false), plc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(plc0Var.e, str13, p3u0Var)), true) : null, plc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((plc0Var.d - 1.0d) * d7, str13, p3u0Var)), true) : null}));
                        } else {
                            i4VarR0 = null;
                        }
                        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
                }
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.o = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.wbr
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:59:0x021b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0224  */
            /* JADX WARN: Code duplicated, block: B:78:0x0240  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:83:0x025d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0265  */
            /* JADX WARN: Code duplicated, block: B:86:0x0267  */
            /* JADX WARN: Code duplicated, block: B:88:0x026d  */
            /* JADX WARN: Code duplicated, block: B:90:0x027c  */
            /* JADX WARN: Code duplicated, block: B:92:0x0280  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a7 A[LOOP:0: B:94:0x02a1->B:96:0x02a7, LOOP_END] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                double d;
                boolean z2;
                rln0 jln0Var;
                boolean z3;
                lx6 lx6Var;
                jwo0 jwo0Var;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                l85 l85Var;
                i4 i4VarR0;
                byte b6 = b5;
                zn0 zn0Var = this.b;
                switch (b6) {
                    case 0:
                        ((fee) obj).getClass();
                        eo7 eo7Var = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (eo7Var != null) {
                            if (eo7Var instanceof bo7) {
                                uw6 uw6Var = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b;
                                if (uw6Var.h) {
                                    double d3 = uw6Var.f36378a;
                                    z = d3 != -1.0d && uw6Var.d <= d3 && d3 <= 9.99999999999999E12d && uw6Var.m;
                                } else {
                                    z = uw6Var.i;
                                }
                            } else if (eo7Var instanceof yn7) {
                                z = ((ifc0) ((fee) zn0Var.g.getValue()).c()).e;
                            }
                            boolean z4 = z;
                            boolean zBooleanValue = ((Boolean) ((fee) zn0Var.i.getValue()).c()).booleanValue();
                            ctf0 ctf0Var2 = zn0Var.b;
                            if (zBooleanValue) {
                                return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z4, false, true), ybr.f42352a)));
                            }
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        ky6 ky6Var = (ky6) feeVar.c();
                        FinBetInfoModel finBetInfoModel = ((sg20) zn0Var.q).f32140a;
                        ky6Var.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        iur iurVar = ky6Var.b;
                        String strJ = pn40.j(iurVar.d, finBetInfoModel.g, false);
                        return new r820(new qy6(new vf40(new igs(iurVar.b, iurVar.f15410a, finBetInfoModel.k ? new z5q(strJ) : new a6q(strJ)), iurVar.c)), null);
                    case 2:
                        ((fee) obj).getClass();
                        u00 u00Var = new u00(zn0Var.b.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), false, null);
                        n0o0 n0o0Var = zn0Var.c;
                        return new y00(u00Var, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.f18089a, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.b);
                    case 3:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        ym5 ym5Var = (ym5) feeVar2.c();
                        ctf0 ctf0Var3 = zn0Var.b;
                        eo7 eo7Var2 = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (Intrinsics.d(eo7Var2, bo7.f2918a)) {
                            d = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b.f36378a;
                        } else {
                            if (!Intrinsics.d(eo7Var2, yn7.f42924a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        ym5Var.getClass();
                        ql5 ql5Var = ym5Var.c;
                        ctf0Var3.getClass();
                        String str = ql5Var.f;
                        double d4 = ql5Var.b;
                        pn40 pn40Var2 = pn40.f27267a;
                        return new gf6(null, i30.f14073a, new tw7(pn40.c(d4, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d4 == 0.0d || d > d4) && ql5Var.f28916a != 0 && ctf0Var3.i(), ym5Var.d));
                    case 4:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        qvj0 qvj0Var = (qvj0) feeVar3.c();
                        String str2 = ((ym5) ((fee) zn0Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = zn0Var.b;
                        qvj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        cx6 cx6Var = qvj0Var.f29389a;
                        lnb0 lnb0Var = qvj0Var.b;
                        uw6 uw6Var2 = cx6Var.b;
                        double d5 = uw6Var2.d;
                        double d6 = uw6Var2.f36378a;
                        boolean z5 = uw6Var2.k;
                        boolean z6 = uw6Var2.h;
                        lx6 lx6Var2 = z5 ? lx6.c : ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(cx6Var.f5109a);
                        lsm0 lsm0Var = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), uw6Var2.l, true, false);
                        if (!lnb0Var.f20336a || lx6Var2 == lx6.b) {
                            if (d6 < d5) {
                                String strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d5, str2, p3u0.c)));
                            } else if (d6 > 9.99999999999999E12d) {
                                z2 = true;
                                String strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(9.99999999999999E12d, str2, p3u0.c)));
                            } else {
                                z2 = true;
                                jln0Var = new jln0("");
                            }
                            boolean z15 = uw6Var2.j;
                            if (d6 > d5 || !z6) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (d6 < 9.99999999999999E12d || !z6) {
                                z2 = false;
                            }
                            nke nkeVar5 = new nke(z15, z15, z3, z2);
                            if (z5 && z6) {
                                lx6Var = ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                            } else {
                                lx6Var = lx6.c;
                            }
                            aw6 aw6Var5 = new aw6(sx6Var, jln0Var, nkeVar5, lx6Var, null, str2);
                            jwo0Var = qvj0Var.c;
                            if (jwo0Var.f17262a) {
                                String str11 = jwo0Var.b;
                                String str12 = jwo0Var.c;
                                if (jwo0Var.d) {
                                    gmkVar = null;
                                } else {
                                    d2 = jwo0Var.e;
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
                                boolean z16 = jwo0Var.d;
                                List<mvo0> list5 = jwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list5, 10));
                                for (mvo0 mvo0Var : list5) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str11, str12, gmkVar, z16, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var5, gxo0Var, null);
                        }
                        jln0Var = new nln0(lnb0Var.b, lnb0Var.c);
                        z2 = true;
                        boolean z17 = uw6Var2.j;
                        if (d6 > d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (d6 < 9.99999999999999E12d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nke nkeVar6 = new nke(z17, z17, z3, z2);
                        if (z5) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = lx6.c;
                        }
                        aw6 aw6Var6 = new aw6(sx6Var, jln0Var, nkeVar6, lx6Var, null, str2);
                        jwo0Var = qvj0Var.c;
                        if (jwo0Var.f17262a) {
                            gxo0Var = null;
                        } else {
                            String str13 = jwo0Var.b;
                            String str14 = jwo0Var.c;
                            if (jwo0Var.d) {
                                gmkVar = null;
                            } else {
                                d2 = jwo0Var.e;
                                if (d2 > 0.0d) {
                                    pn40 pn40Var15 = pn40.f27267a;
                                    emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                } else if (d2 < 0.0d) {
                                    pn40 pn40Var16 = pn40.f27267a;
                                    emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                } else {
                                    gmkVar = null;
                                }
                                gmkVar = emkVar;
                            }
                            boolean z18 = jwo0Var.d;
                            List<mvo0> list6 = jwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list6, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str13, str14, gmkVar, z18, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var6, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        ifc0 ifc0Var = (ifc0) feeVar4.c();
                        ctf0 ctf0Var5 = zn0Var.b;
                        ifc0Var.getClass();
                        ctf0Var5.getClass();
                        azc0 azc0Var = ifc0Var.f14680a;
                        bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                        int iOrdinal2 = ifc0Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            xyc0Var = xyc0.f41702a;
                        } else {
                            if (iOrdinal2 != 1) {
                                t9f.b();
                                return null;
                            }
                            xyc0Var = xyc0.b;
                        }
                        if (azc0Var.f) {
                            lsm0 lsm0Var2 = ctf0Var5.b;
                            l85Var = new l85(lsm0Var2.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            l85Var = null;
                        }
                        plc0 plc0Var = ifc0Var.c;
                        boolean z19 = plc0Var.h;
                        double d7 = plc0Var.f27176a;
                        String str15 = plc0Var.c;
                        if (z19) {
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i3 = cy7.f5159a;
                            pn40 pn40Var17 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d7, str15, p3u0Var)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), plc0Var.b, false), plc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(plc0Var.e, str15, p3u0Var)), true) : null, plc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((plc0Var.d - 1.0d) * d7, str15, p3u0Var)), true) : null}));
                        } else {
                            i4VarR0 = null;
                        }
                        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
                }
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.p = maz.b(new yw9((fee) n0o0VarH5.getValue(), new Function1(this) { // from class: a.wbr
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:59:0x021b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0224  */
            /* JADX WARN: Code duplicated, block: B:78:0x0240  */
            /* JADX WARN: Code duplicated, block: B:81:0x025a  */
            /* JADX WARN: Code duplicated, block: B:83:0x025d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0265  */
            /* JADX WARN: Code duplicated, block: B:86:0x0267  */
            /* JADX WARN: Code duplicated, block: B:88:0x026d  */
            /* JADX WARN: Code duplicated, block: B:90:0x027c  */
            /* JADX WARN: Code duplicated, block: B:92:0x0280  */
            /* JADX WARN: Code duplicated, block: B:96:0x02a7 A[LOOP:0: B:94:0x02a1->B:96:0x02a7, LOOP_END] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                double d;
                boolean z2;
                rln0 jln0Var;
                boolean z3;
                lx6 lx6Var;
                jwo0 jwo0Var;
                double d2;
                gmk emkVar;
                gmk gmkVar;
                ArrayList arrayList;
                gxo0 gxo0Var;
                xyc0 xyc0Var;
                l85 l85Var;
                i4 i4VarR0;
                byte b7 = b6;
                zn0 zn0Var = this.b;
                switch (b7) {
                    case 0:
                        ((fee) obj).getClass();
                        eo7 eo7Var = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (eo7Var != null) {
                            if (eo7Var instanceof bo7) {
                                uw6 uw6Var = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b;
                                if (uw6Var.h) {
                                    double d3 = uw6Var.f36378a;
                                    z = d3 != -1.0d && uw6Var.d <= d3 && d3 <= 9.99999999999999E12d && uw6Var.m;
                                } else {
                                    z = uw6Var.i;
                                }
                            } else if (eo7Var instanceof yn7) {
                                z = ((ifc0) ((fee) zn0Var.g.getValue()).c()).e;
                            }
                            boolean z4 = z;
                            boolean zBooleanValue = ((Boolean) ((fee) zn0Var.i.getValue()).c()).booleanValue();
                            ctf0 ctf0Var2 = zn0Var.b;
                            if (zBooleanValue) {
                                return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var2.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z4, false, true), ybr.f42352a)));
                            }
                            nul nulVar = nul.e;
                            oe9 oe9Var = oe9.f25112a;
                            return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var2.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        ky6 ky6Var = (ky6) feeVar.c();
                        FinBetInfoModel finBetInfoModel = ((sg20) zn0Var.q).f32140a;
                        ky6Var.getClass();
                        pn40 pn40Var = pn40.f27267a;
                        iur iurVar = ky6Var.b;
                        String strJ = pn40.j(iurVar.d, finBetInfoModel.g, false);
                        return new r820(new qy6(new vf40(new igs(iurVar.b, iurVar.f15410a, finBetInfoModel.k ? new z5q(strJ) : new a6q(strJ)), iurVar.c)), null);
                    case 2:
                        ((fee) obj).getClass();
                        u00 u00Var = new u00(zn0Var.b.b.a(R.string.finance_bets, Arrays.copyOf(new Object[0], 0)), false, null);
                        n0o0 n0o0Var = zn0Var.c;
                        return new y00(u00Var, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.f18089a, ((ky6) ((fee) n0o0Var.getValue()).c()).f19093a.b);
                    case 3:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        ym5 ym5Var = (ym5) feeVar2.c();
                        ctf0 ctf0Var3 = zn0Var.b;
                        eo7 eo7Var2 = (eo7) ((fee) zn0Var.e.getValue()).c();
                        if (Intrinsics.d(eo7Var2, bo7.f2918a)) {
                            d = ((qvj0) ((fee) zn0Var.f.getValue()).c()).f29389a.b.f36378a;
                        } else {
                            if (!Intrinsics.d(eo7Var2, yn7.f42924a)) {
                                t9f.b();
                                return null;
                            }
                            d = 0.0d;
                        }
                        ym5Var.getClass();
                        ql5 ql5Var = ym5Var.c;
                        ctf0Var3.getClass();
                        String str = ql5Var.f;
                        double d4 = ql5Var.b;
                        pn40 pn40Var2 = pn40.f27267a;
                        return new gf6(null, i30.f14073a, new tw7(pn40.c(d4, p3u0.c), str, ctf0Var3.b.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), (d4 == 0.0d || d > d4) && ql5Var.f28916a != 0 && ctf0Var3.i(), ym5Var.d));
                    case 4:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        qvj0 qvj0Var = (qvj0) feeVar3.c();
                        String str2 = ((ym5) ((fee) zn0Var.d.getValue()).c()).c.f;
                        ctf0 ctf0Var4 = zn0Var.b;
                        qvj0Var.getClass();
                        str2.getClass();
                        ctf0Var4.getClass();
                        cx6 cx6Var = qvj0Var.f29389a;
                        lnb0 lnb0Var = qvj0Var.b;
                        uw6 uw6Var2 = cx6Var.b;
                        double d5 = uw6Var2.d;
                        double d6 = uw6Var2.f36378a;
                        boolean z5 = uw6Var2.k;
                        boolean z6 = uw6Var2.h;
                        lx6 lx6Var2 = z5 ? lx6.c : ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                        po7 po7Var = new po7(cx6Var.f5109a);
                        lsm0 lsm0Var = ctf0Var4.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), uw6Var2.l, true, false);
                        if (!lnb0Var.f20336a || lx6Var2 == lx6.b) {
                            if (d6 < d5) {
                                String strA = lsm0Var.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(strA, cy7.e(pn40.d(d5, str2, p3u0.c)));
                            } else if (d6 > 9.99999999999999E12d) {
                                z2 = true;
                                String strA2 = lsm0Var.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{""}, 1));
                                int i2 = cy7.f5159a;
                                pn40 pn40Var4 = pn40.f27267a;
                                jln0Var = new mln0(strA2, cy7.e(pn40.d(9.99999999999999E12d, str2, p3u0.c)));
                            } else {
                                z2 = true;
                                jln0Var = new jln0("");
                            }
                            boolean z17 = uw6Var2.j;
                            if (d6 > d5 || !z6) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (d6 < 9.99999999999999E12d || !z6) {
                                z2 = false;
                            }
                            nke nkeVar6 = new nke(z17, z17, z3, z2);
                            if (z5 && z6) {
                                lx6Var = ((d5 > d6 || d6 > 9.99999999999999E12d) && d6 != -1.0d) ? lx6.b : lx6.f20799a;
                            } else {
                                lx6Var = lx6.c;
                            }
                            aw6 aw6Var6 = new aw6(sx6Var, jln0Var, nkeVar6, lx6Var, null, str2);
                            jwo0Var = qvj0Var.c;
                            if (jwo0Var.f17262a) {
                                String str13 = jwo0Var.b;
                                String str14 = jwo0Var.c;
                                if (jwo0Var.d) {
                                    gmkVar = null;
                                } else {
                                    d2 = jwo0Var.e;
                                    if (d2 > 0.0d) {
                                        pn40 pn40Var15 = pn40.f27267a;
                                        emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                    } else if (d2 < 0.0d) {
                                        pn40 pn40Var16 = pn40.f27267a;
                                        emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                    } else {
                                        gmkVar = null;
                                    }
                                    gmkVar = emkVar;
                                }
                                boolean z18 = jwo0Var.d;
                                List<mvo0> list6 = jwo0Var.f;
                                arrayList = new ArrayList(r3d.q(list6, 10));
                                for (mvo0 mvo0Var : list6) {
                                    arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                                }
                                gxo0Var = new gxo0(str13, str14, gmkVar, z18, dyb.r0(arrayList));
                            } else {
                                gxo0Var = null;
                            }
                            return new bwj0(aw6Var6, gxo0Var, null);
                        }
                        jln0Var = new nln0(lnb0Var.b, lnb0Var.c);
                        z2 = true;
                        boolean z19 = uw6Var2.j;
                        if (d6 > d5) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (d6 < 9.99999999999999E12d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        nke nkeVar7 = new nke(z19, z19, z3, z2);
                        if (z5) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = lx6.c;
                        }
                        aw6 aw6Var7 = new aw6(sx6Var, jln0Var, nkeVar7, lx6Var, null, str2);
                        jwo0Var = qvj0Var.c;
                        if (jwo0Var.f17262a) {
                            gxo0Var = null;
                        } else {
                            String str15 = jwo0Var.b;
                            String str16 = jwo0Var.c;
                            if (jwo0Var.d) {
                                gmkVar = null;
                            } else {
                                d2 = jwo0Var.e;
                                if (d2 > 0.0d) {
                                    pn40 pn40Var17 = pn40.f27267a;
                                    emkVar = new fmk(pn40.c(d2, p3u0.c), str2);
                                } else if (d2 < 0.0d) {
                                    pn40 pn40Var18 = pn40.f27267a;
                                    emkVar = new emk(pn40.c(d2, p3u0.c), str2);
                                } else {
                                    gmkVar = null;
                                }
                                gmkVar = emkVar;
                            }
                            boolean z110 = jwo0Var.d;
                            List<mvo0> list7 = jwo0Var.f;
                            arrayList = new ArrayList(r3d.q(list7, 10));
                            while (r0.hasNext()) {
                                arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
                            }
                            gxo0Var = new gxo0(str15, str16, gmkVar, z110, dyb.r0(arrayList));
                        }
                        return new bwj0(aw6Var7, gxo0Var, null);
                    default:
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        ifc0 ifc0Var = (ifc0) feeVar4.c();
                        ctf0 ctf0Var5 = zn0Var.b;
                        ifc0Var.getClass();
                        ctf0Var5.getClass();
                        azc0 azc0Var = ifc0Var.f14680a;
                        bzc0 bzc0Var = new bzc0(azc0Var.f1710a, azc0Var.b, azc0Var.d, azc0Var.e);
                        int iOrdinal2 = ifc0Var.b.ordinal();
                        if (iOrdinal2 == 0) {
                            xyc0Var = xyc0.f41702a;
                        } else {
                            if (iOrdinal2 != 1) {
                                t9f.b();
                                return null;
                            }
                            xyc0Var = xyc0.b;
                        }
                        if (azc0Var.f) {
                            lsm0 lsm0Var2 = ctf0Var5.b;
                            l85Var = new l85(lsm0Var2.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            l85Var = null;
                        }
                        plc0 plc0Var = ifc0Var.c;
                        boolean z111 = plc0Var.h;
                        double d7 = plc0Var.f27176a;
                        String str17 = plc0Var.c;
                        if (z111) {
                            lsm0 lsm0Var3 = ctf0Var5.b;
                            String strA3 = lsm0Var3.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
                            int i3 = cy7.f5159a;
                            pn40 pn40Var19 = pn40.f27267a;
                            p3u0 p3u0Var = p3u0.c;
                            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA3, cy7.e(pn40.d(d7, str17, p3u0Var)), false), new nlc0(lsm0Var3.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), plc0Var.b, false), plc0Var.f ? new nlc0(lsm0Var3.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(plc0Var.e, str17, p3u0Var)), true) : null, plc0Var.g ? new nlc0(lsm0Var3.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((plc0Var.d - 1.0d) * d7, str17, p3u0Var)), true) : null}));
                        } else {
                            i4VarR0 = null;
                        }
                        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
                }
            }
        }, (byte) 20));
    }

    public zn0(olb0 olb0Var, ctf0 ctf0Var, qho qhoVar, kl5 kl5Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.r = qhoVar;
        bib0 bib0Var = olb0Var.k;
        this.c = bkb.H(bib0Var);
        n0o0 n0o0VarH = bkb.H(olb0Var.b);
        this.d = n0o0VarH;
        this.e = bkb.H(Boolean.valueOf(olb0Var.e));
        final byte b2 = 0;
        this.f = maz.b(new yw9(olb0Var.f, new Function1(this) { // from class: a.dmb0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x02ec  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bmm zlmVar;
                ee eeVar;
                int i;
                s4i s4iVar;
                byte b3 = b2;
                boolean z = false;
                zn0 zn0Var = this.b;
                switch (b3) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        return zn0Var.b.b.a(R.string.session_timer_title_v2, Arrays.copyOf(new Object[]{str}, 1));
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int iB = ((qho) zn0Var.r).b(zBooleanValue ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light);
                        String str2 = ((bib0) zn0Var.b().c()).d;
                        i1i i1iVar = str2.equals("logoLeft") ? g1i.f10513a : str2.equals("logoRight") ? h1i.f12284a : f1i.f8765a;
                        if (((bib0) zn0Var.b().c()).x) {
                            ((bib0) zn0Var.b().c()).getClass();
                            String str3 = zBooleanValue ? "logo_popular_new_dark" : "logo_popular_new_light";
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String strL = kng0.l("static/img/ImgDefault/graphic_elements/android/1357/", str3, ".png");
                            if (strL.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                                sb.setLength(0);
                                sb.append(strL);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strL, '/'));
                            }
                            zlmVar = new amm(sb.toString(), iB);
                        } else {
                            zlmVar = new zlm(iB);
                        }
                        boolean z2 = ((bib0) zn0Var.b().c()).b;
                        switch (((bib0) zn0Var.b().c()).c) {
                            case "quaternary":
                                eeVar = zd.f44189a;
                                break;
                            case "tertiary":
                                eeVar = de.f5922a;
                                break;
                            case "senary":
                                eeVar = ce.f4189a;
                                break;
                            case "secondary":
                                eeVar = be.f2424a;
                                break;
                            case "quinary":
                                eeVar = ae.f704a;
                                break;
                            default:
                                eeVar = yd.f42407a;
                                break;
                        }
                        return new cmm(i1iVar, zlmVar, z2, eeVar, ((Boolean) ((fee) zn0Var.i.getValue()).b()).booleanValue() ? new sd((String) ((fee) zn0Var.l.getValue()).b(), (String) ((fee) zn0Var.m.getValue()).b(), zn0Var.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))) : null);
                    case 2:
                        amb0 amb0Var = (amb0) obj;
                        amb0Var.getClass();
                        return Integer.valueOf(((List) ((fee) zn0Var.g.getValue()).c()).indexOf(amb0Var));
                    case 3:
                        ctf0 ctf0Var2 = zn0Var.b;
                        return new g1b0(!((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o, ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        if (((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o && ((bib0) zn0Var.b().c()).p) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        List<amb0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (amb0 amb0Var2 : list) {
                            qho qhoVar2 = (qho) zn0Var.r;
                            ctf0 ctf0Var3 = zn0Var.b;
                            boolean z3 = ((bib0) zn0Var.b().c()).q;
                            int iOrdinal = amb0Var2.ordinal();
                            if (iOrdinal == 0) {
                                i = R.drawable.ic_glyph_top;
                            } else if (iOrdinal == 1) {
                                i = R.drawable.ic_glyph_sport;
                            } else if (iOrdinal == 2) {
                                i = R.drawable.ic_glyph_cyber_gamepad;
                            } else if (iOrdinal == 3) {
                                i = z3 ? R.drawable.ic_glyph_virtual : R.drawable.ic_glyph_cards;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.drawable.ic_glyph_games;
                            }
                            int iB2 = qhoVar2.b(i);
                            int iOrdinal2 = amb0Var2.ordinal();
                            if (iOrdinal2 == 0) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 1) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 2) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 3) {
                                s4iVar = new s4i(((bib0) zn0Var.b().c()).q ? ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else {
                                if (iOrdinal2 != 4) {
                                    t9f.b();
                                    return null;
                                }
                                String strA = ((bib0) zn0Var.b().c()).v;
                                if (strA.length() == 0) {
                                    strA = ctf0Var3.b.a(R.string.top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                s4iVar = new s4i(strA, iB2, null, false, 12);
                            }
                            arrayList.add(s4iVar);
                        }
                        return dyb.r0(arrayList);
                }
            }
        }, (byte) 20));
        n0o0 n0o0VarB = maz.b(new yw9(olb0Var.f25444a, new peb0((byte) 12), (byte) 20));
        this.g = n0o0VarB;
        boolean z = olb0Var.d;
        final byte b3 = 3;
        this.h = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.dmb0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x02ec  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bmm zlmVar;
                ee eeVar;
                int i;
                s4i s4iVar;
                byte b4 = b3;
                boolean z2 = false;
                zn0 zn0Var = this.b;
                switch (b4) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        return zn0Var.b.b.a(R.string.session_timer_title_v2, Arrays.copyOf(new Object[]{str}, 1));
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int iB = ((qho) zn0Var.r).b(zBooleanValue ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light);
                        String str2 = ((bib0) zn0Var.b().c()).d;
                        i1i i1iVar = str2.equals("logoLeft") ? g1i.f10513a : str2.equals("logoRight") ? h1i.f12284a : f1i.f8765a;
                        if (((bib0) zn0Var.b().c()).x) {
                            ((bib0) zn0Var.b().c()).getClass();
                            String str3 = zBooleanValue ? "logo_popular_new_dark" : "logo_popular_new_light";
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String strL = kng0.l("static/img/ImgDefault/graphic_elements/android/1357/", str3, ".png");
                            if (strL.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                                sb.setLength(0);
                                sb.append(strL);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strL, '/'));
                            }
                            zlmVar = new amm(sb.toString(), iB);
                        } else {
                            zlmVar = new zlm(iB);
                        }
                        boolean z3 = ((bib0) zn0Var.b().c()).b;
                        switch (((bib0) zn0Var.b().c()).c) {
                            case "quaternary":
                                eeVar = zd.f44189a;
                                break;
                            case "tertiary":
                                eeVar = de.f5922a;
                                break;
                            case "senary":
                                eeVar = ce.f4189a;
                                break;
                            case "secondary":
                                eeVar = be.f2424a;
                                break;
                            case "quinary":
                                eeVar = ae.f704a;
                                break;
                            default:
                                eeVar = yd.f42407a;
                                break;
                        }
                        return new cmm(i1iVar, zlmVar, z3, eeVar, ((Boolean) ((fee) zn0Var.i.getValue()).b()).booleanValue() ? new sd((String) ((fee) zn0Var.l.getValue()).b(), (String) ((fee) zn0Var.m.getValue()).b(), zn0Var.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))) : null);
                    case 2:
                        amb0 amb0Var = (amb0) obj;
                        amb0Var.getClass();
                        return Integer.valueOf(((List) ((fee) zn0Var.g.getValue()).c()).indexOf(amb0Var));
                    case 3:
                        ctf0 ctf0Var2 = zn0Var.b;
                        return new g1b0(!((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o, ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        if (((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o && ((bib0) zn0Var.b().c()).p) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        List<amb0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (amb0 amb0Var2 : list) {
                            qho qhoVar2 = (qho) zn0Var.r;
                            ctf0 ctf0Var3 = zn0Var.b;
                            boolean z4 = ((bib0) zn0Var.b().c()).q;
                            int iOrdinal = amb0Var2.ordinal();
                            if (iOrdinal == 0) {
                                i = R.drawable.ic_glyph_top;
                            } else if (iOrdinal == 1) {
                                i = R.drawable.ic_glyph_sport;
                            } else if (iOrdinal == 2) {
                                i = R.drawable.ic_glyph_cyber_gamepad;
                            } else if (iOrdinal == 3) {
                                i = z4 ? R.drawable.ic_glyph_virtual : R.drawable.ic_glyph_cards;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.drawable.ic_glyph_games;
                            }
                            int iB2 = qhoVar2.b(i);
                            int iOrdinal2 = amb0Var2.ordinal();
                            if (iOrdinal2 == 0) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 1) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 2) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 3) {
                                s4iVar = new s4i(((bib0) zn0Var.b().c()).q ? ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else {
                                if (iOrdinal2 != 4) {
                                    t9f.b();
                                    return null;
                                }
                                String strA = ((bib0) zn0Var.b().c()).v;
                                if (strA.length() == 0) {
                                    strA = ctf0Var3.b.a(R.string.top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                s4iVar = new s4i(strA, iB2, null, false, 12);
                            }
                            arrayList.add(s4iVar);
                        }
                        return dyb.r0(arrayList);
                }
            }
        }, (byte) 20));
        final byte b4 = 4;
        this.i = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.dmb0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x02ec  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bmm zlmVar;
                ee eeVar;
                int i;
                s4i s4iVar;
                byte b5 = b4;
                boolean z2 = false;
                zn0 zn0Var = this.b;
                switch (b5) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        return zn0Var.b.b.a(R.string.session_timer_title_v2, Arrays.copyOf(new Object[]{str}, 1));
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int iB = ((qho) zn0Var.r).b(zBooleanValue ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light);
                        String str2 = ((bib0) zn0Var.b().c()).d;
                        i1i i1iVar = str2.equals("logoLeft") ? g1i.f10513a : str2.equals("logoRight") ? h1i.f12284a : f1i.f8765a;
                        if (((bib0) zn0Var.b().c()).x) {
                            ((bib0) zn0Var.b().c()).getClass();
                            String str3 = zBooleanValue ? "logo_popular_new_dark" : "logo_popular_new_light";
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String strL = kng0.l("static/img/ImgDefault/graphic_elements/android/1357/", str3, ".png");
                            if (strL.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                                sb.setLength(0);
                                sb.append(strL);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strL, '/'));
                            }
                            zlmVar = new amm(sb.toString(), iB);
                        } else {
                            zlmVar = new zlm(iB);
                        }
                        boolean z3 = ((bib0) zn0Var.b().c()).b;
                        switch (((bib0) zn0Var.b().c()).c) {
                            case "quaternary":
                                eeVar = zd.f44189a;
                                break;
                            case "tertiary":
                                eeVar = de.f5922a;
                                break;
                            case "senary":
                                eeVar = ce.f4189a;
                                break;
                            case "secondary":
                                eeVar = be.f2424a;
                                break;
                            case "quinary":
                                eeVar = ae.f704a;
                                break;
                            default:
                                eeVar = yd.f42407a;
                                break;
                        }
                        return new cmm(i1iVar, zlmVar, z3, eeVar, ((Boolean) ((fee) zn0Var.i.getValue()).b()).booleanValue() ? new sd((String) ((fee) zn0Var.l.getValue()).b(), (String) ((fee) zn0Var.m.getValue()).b(), zn0Var.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))) : null);
                    case 2:
                        amb0 amb0Var = (amb0) obj;
                        amb0Var.getClass();
                        return Integer.valueOf(((List) ((fee) zn0Var.g.getValue()).c()).indexOf(amb0Var));
                    case 3:
                        ctf0 ctf0Var2 = zn0Var.b;
                        return new g1b0(!((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o, ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        if (((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o && ((bib0) zn0Var.b().c()).p) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        List<amb0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (amb0 amb0Var2 : list) {
                            qho qhoVar2 = (qho) zn0Var.r;
                            ctf0 ctf0Var3 = zn0Var.b;
                            boolean z4 = ((bib0) zn0Var.b().c()).q;
                            int iOrdinal = amb0Var2.ordinal();
                            if (iOrdinal == 0) {
                                i = R.drawable.ic_glyph_top;
                            } else if (iOrdinal == 1) {
                                i = R.drawable.ic_glyph_sport;
                            } else if (iOrdinal == 2) {
                                i = R.drawable.ic_glyph_cyber_gamepad;
                            } else if (iOrdinal == 3) {
                                i = z4 ? R.drawable.ic_glyph_virtual : R.drawable.ic_glyph_cards;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.drawable.ic_glyph_games;
                            }
                            int iB2 = qhoVar2.b(i);
                            int iOrdinal2 = amb0Var2.ordinal();
                            if (iOrdinal2 == 0) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 1) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 2) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 3) {
                                s4iVar = new s4i(((bib0) zn0Var.b().c()).q ? ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else {
                                if (iOrdinal2 != 4) {
                                    t9f.b();
                                    return null;
                                }
                                String strA = ((bib0) zn0Var.b().c()).v;
                                if (strA.length() == 0) {
                                    strA = ctf0Var3.b.a(R.string.top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                s4iVar = new s4i(strA, iB2, null, false, 12);
                            }
                            arrayList.add(s4iVar);
                        }
                        return dyb.r0(arrayList);
                }
            }
        }, (byte) 20));
        final byte b5 = 5;
        this.j = bkb.G(((fee) n0o0VarB.getValue()).d, new Function1(this) { // from class: a.dmb0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x02ec  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bmm zlmVar;
                ee eeVar;
                int i;
                s4i s4iVar;
                byte b6 = b5;
                boolean z2 = false;
                zn0 zn0Var = this.b;
                switch (b6) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        return zn0Var.b.b.a(R.string.session_timer_title_v2, Arrays.copyOf(new Object[]{str}, 1));
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int iB = ((qho) zn0Var.r).b(zBooleanValue ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light);
                        String str2 = ((bib0) zn0Var.b().c()).d;
                        i1i i1iVar = str2.equals("logoLeft") ? g1i.f10513a : str2.equals("logoRight") ? h1i.f12284a : f1i.f8765a;
                        if (((bib0) zn0Var.b().c()).x) {
                            ((bib0) zn0Var.b().c()).getClass();
                            String str3 = zBooleanValue ? "logo_popular_new_dark" : "logo_popular_new_light";
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String strL = kng0.l("static/img/ImgDefault/graphic_elements/android/1357/", str3, ".png");
                            if (strL.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                                sb.setLength(0);
                                sb.append(strL);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strL, '/'));
                            }
                            zlmVar = new amm(sb.toString(), iB);
                        } else {
                            zlmVar = new zlm(iB);
                        }
                        boolean z3 = ((bib0) zn0Var.b().c()).b;
                        switch (((bib0) zn0Var.b().c()).c) {
                            case "quaternary":
                                eeVar = zd.f44189a;
                                break;
                            case "tertiary":
                                eeVar = de.f5922a;
                                break;
                            case "senary":
                                eeVar = ce.f4189a;
                                break;
                            case "secondary":
                                eeVar = be.f2424a;
                                break;
                            case "quinary":
                                eeVar = ae.f704a;
                                break;
                            default:
                                eeVar = yd.f42407a;
                                break;
                        }
                        return new cmm(i1iVar, zlmVar, z3, eeVar, ((Boolean) ((fee) zn0Var.i.getValue()).b()).booleanValue() ? new sd((String) ((fee) zn0Var.l.getValue()).b(), (String) ((fee) zn0Var.m.getValue()).b(), zn0Var.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))) : null);
                    case 2:
                        amb0 amb0Var = (amb0) obj;
                        amb0Var.getClass();
                        return Integer.valueOf(((List) ((fee) zn0Var.g.getValue()).c()).indexOf(amb0Var));
                    case 3:
                        ctf0 ctf0Var2 = zn0Var.b;
                        return new g1b0(!((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o, ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        if (((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o && ((bib0) zn0Var.b().c()).p) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        List<amb0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (amb0 amb0Var2 : list) {
                            qho qhoVar2 = (qho) zn0Var.r;
                            ctf0 ctf0Var3 = zn0Var.b;
                            boolean z4 = ((bib0) zn0Var.b().c()).q;
                            int iOrdinal = amb0Var2.ordinal();
                            if (iOrdinal == 0) {
                                i = R.drawable.ic_glyph_top;
                            } else if (iOrdinal == 1) {
                                i = R.drawable.ic_glyph_sport;
                            } else if (iOrdinal == 2) {
                                i = R.drawable.ic_glyph_cyber_gamepad;
                            } else if (iOrdinal == 3) {
                                i = z4 ? R.drawable.ic_glyph_virtual : R.drawable.ic_glyph_cards;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.drawable.ic_glyph_games;
                            }
                            int iB2 = qhoVar2.b(i);
                            int iOrdinal2 = amb0Var2.ordinal();
                            if (iOrdinal2 == 0) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 1) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 2) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 3) {
                                s4iVar = new s4i(((bib0) zn0Var.b().c()).q ? ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else {
                                if (iOrdinal2 != 4) {
                                    t9f.b();
                                    return null;
                                }
                                String strA = ((bib0) zn0Var.b().c()).v;
                                if (strA.length() == 0) {
                                    strA = ctf0Var3.b.a(R.string.top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                s4iVar = new s4i(strA, iB2, null, false, 12);
                            }
                            arrayList.add(s4iVar);
                        }
                        return dyb.r0(arrayList);
                }
            }
        });
        this.k = maz.b(new yw9(bib0Var.w, new peb0((byte) 13), (byte) 20));
        n0o0 n0o0VarB2 = maz.b(new yw9(olb0Var.c, new peb0((byte) 14), (byte) 20));
        this.l = n0o0VarB2;
        this.m = bkb.G(((fee) n0o0VarB2.getValue()).d, new peb0((byte) 15));
        final byte b6 = 1;
        this.n = maz.b(new yw9(Boolean.valueOf(bib0Var.f2652a), new Function1(this) { // from class: a.dmb0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x02ec  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bmm zlmVar;
                ee eeVar;
                int i;
                s4i s4iVar;
                byte b7 = b6;
                boolean z2 = false;
                zn0 zn0Var = this.b;
                switch (b7) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        return zn0Var.b.b.a(R.string.session_timer_title_v2, Arrays.copyOf(new Object[]{str}, 1));
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int iB = ((qho) zn0Var.r).b(zBooleanValue ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light);
                        String str2 = ((bib0) zn0Var.b().c()).d;
                        i1i i1iVar = str2.equals("logoLeft") ? g1i.f10513a : str2.equals("logoRight") ? h1i.f12284a : f1i.f8765a;
                        if (((bib0) zn0Var.b().c()).x) {
                            ((bib0) zn0Var.b().c()).getClass();
                            String str3 = zBooleanValue ? "logo_popular_new_dark" : "logo_popular_new_light";
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String strL = kng0.l("static/img/ImgDefault/graphic_elements/android/1357/", str3, ".png");
                            if (strL.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                                sb.setLength(0);
                                sb.append(strL);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strL, '/'));
                            }
                            zlmVar = new amm(sb.toString(), iB);
                        } else {
                            zlmVar = new zlm(iB);
                        }
                        boolean z3 = ((bib0) zn0Var.b().c()).b;
                        switch (((bib0) zn0Var.b().c()).c) {
                            case "quaternary":
                                eeVar = zd.f44189a;
                                break;
                            case "tertiary":
                                eeVar = de.f5922a;
                                break;
                            case "senary":
                                eeVar = ce.f4189a;
                                break;
                            case "secondary":
                                eeVar = be.f2424a;
                                break;
                            case "quinary":
                                eeVar = ae.f704a;
                                break;
                            default:
                                eeVar = yd.f42407a;
                                break;
                        }
                        return new cmm(i1iVar, zlmVar, z3, eeVar, ((Boolean) ((fee) zn0Var.i.getValue()).b()).booleanValue() ? new sd((String) ((fee) zn0Var.l.getValue()).b(), (String) ((fee) zn0Var.m.getValue()).b(), zn0Var.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))) : null);
                    case 2:
                        amb0 amb0Var = (amb0) obj;
                        amb0Var.getClass();
                        return Integer.valueOf(((List) ((fee) zn0Var.g.getValue()).c()).indexOf(amb0Var));
                    case 3:
                        ctf0 ctf0Var2 = zn0Var.b;
                        return new g1b0(!((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o, ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        if (((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o && ((bib0) zn0Var.b().c()).p) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        List<amb0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (amb0 amb0Var2 : list) {
                            qho qhoVar2 = (qho) zn0Var.r;
                            ctf0 ctf0Var3 = zn0Var.b;
                            boolean z4 = ((bib0) zn0Var.b().c()).q;
                            int iOrdinal = amb0Var2.ordinal();
                            if (iOrdinal == 0) {
                                i = R.drawable.ic_glyph_top;
                            } else if (iOrdinal == 1) {
                                i = R.drawable.ic_glyph_sport;
                            } else if (iOrdinal == 2) {
                                i = R.drawable.ic_glyph_cyber_gamepad;
                            } else if (iOrdinal == 3) {
                                i = z4 ? R.drawable.ic_glyph_virtual : R.drawable.ic_glyph_cards;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.drawable.ic_glyph_games;
                            }
                            int iB2 = qhoVar2.b(i);
                            int iOrdinal2 = amb0Var2.ordinal();
                            if (iOrdinal2 == 0) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 1) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 2) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 3) {
                                s4iVar = new s4i(((bib0) zn0Var.b().c()).q ? ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else {
                                if (iOrdinal2 != 4) {
                                    t9f.b();
                                    return null;
                                }
                                String strA = ((bib0) zn0Var.b().c()).v;
                                if (strA.length() == 0) {
                                    strA = ctf0Var3.b.a(R.string.top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                s4iVar = new s4i(strA, iB2, null, false, 12);
                            }
                            arrayList.add(s4iVar);
                        }
                        return dyb.r0(arrayList);
                }
            }
        }, (byte) 20));
        this.o = maz.b(new yw9(olb0Var.j, new peb0((byte) 10), (byte) 20));
        this.p = maz.b(new yw9(olb0Var.l, new peb0((byte) 11), (byte) 20));
        this.q = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.dmb0
            public final /* synthetic */ zn0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:119:0x02ec  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bmm zlmVar;
                ee eeVar;
                int i;
                s4i s4iVar;
                byte b7 = b;
                boolean z2 = false;
                zn0 zn0Var = this.b;
                switch (b7) {
                    case 0:
                        String str = (String) obj;
                        str.getClass();
                        return zn0Var.b.b.a(R.string.session_timer_title_v2, Arrays.copyOf(new Object[]{str}, 1));
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int iB = ((qho) zn0Var.r).b(zBooleanValue ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light);
                        String str2 = ((bib0) zn0Var.b().c()).d;
                        i1i i1iVar = str2.equals("logoLeft") ? g1i.f10513a : str2.equals("logoRight") ? h1i.f12284a : f1i.f8765a;
                        if (((bib0) zn0Var.b().c()).x) {
                            ((bib0) zn0Var.b().c()).getClass();
                            String str3 = zBooleanValue ? "logo_popular_new_dark" : "logo_popular_new_light";
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String strL = kng0.l("static/img/ImgDefault/graphic_elements/android/1357/", str3, ".png");
                            if (strL.length() == 0) {
                                sb.setLength(0);
                            } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                                sb.setLength(0);
                                sb.append(strL);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strL, '/'));
                            }
                            zlmVar = new amm(sb.toString(), iB);
                        } else {
                            zlmVar = new zlm(iB);
                        }
                        boolean z3 = ((bib0) zn0Var.b().c()).b;
                        switch (((bib0) zn0Var.b().c()).c) {
                            case "quaternary":
                                eeVar = zd.f44189a;
                                break;
                            case "tertiary":
                                eeVar = de.f5922a;
                                break;
                            case "senary":
                                eeVar = ce.f4189a;
                                break;
                            case "secondary":
                                eeVar = be.f2424a;
                                break;
                            case "quinary":
                                eeVar = ae.f704a;
                                break;
                            default:
                                eeVar = yd.f42407a;
                                break;
                        }
                        return new cmm(i1iVar, zlmVar, z3, eeVar, ((Boolean) ((fee) zn0Var.i.getValue()).b()).booleanValue() ? new sd((String) ((fee) zn0Var.l.getValue()).b(), (String) ((fee) zn0Var.m.getValue()).b(), zn0Var.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))) : null);
                    case 2:
                        amb0 amb0Var = (amb0) obj;
                        amb0Var.getClass();
                        return Integer.valueOf(((List) ((fee) zn0Var.g.getValue()).c()).indexOf(amb0Var));
                    case 3:
                        ctf0 ctf0Var2 = zn0Var.b;
                        return new g1b0(!((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o, ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                    case 4:
                        if (((Boolean) obj).booleanValue() && ((bib0) zn0Var.b().c()).o && ((bib0) zn0Var.b().c()).p) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    default:
                        List<amb0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (amb0 amb0Var2 : list) {
                            qho qhoVar2 = (qho) zn0Var.r;
                            ctf0 ctf0Var3 = zn0Var.b;
                            boolean z4 = ((bib0) zn0Var.b().c()).q;
                            int iOrdinal = amb0Var2.ordinal();
                            if (iOrdinal == 0) {
                                i = R.drawable.ic_glyph_top;
                            } else if (iOrdinal == 1) {
                                i = R.drawable.ic_glyph_sport;
                            } else if (iOrdinal == 2) {
                                i = R.drawable.ic_glyph_cyber_gamepad;
                            } else if (iOrdinal == 3) {
                                i = z4 ? R.drawable.ic_glyph_virtual : R.drawable.ic_glyph_cards;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.drawable.ic_glyph_games;
                            }
                            int iB2 = qhoVar2.b(i);
                            int iOrdinal2 = amb0Var2.ordinal();
                            if (iOrdinal2 == 0) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 1) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 2) {
                                s4iVar = new s4i(ctf0Var3.b.a(R.string.esports, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else if (iOrdinal2 == 3) {
                                s4iVar = new s4i(((bib0) zn0Var.b().c()).q ? ctf0Var3.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), iB2, null, false, 12);
                            } else {
                                if (iOrdinal2 != 4) {
                                    t9f.b();
                                    return null;
                                }
                                String strA = ((bib0) zn0Var.b().c()).v;
                                if (strA.length() == 0) {
                                    strA = ctf0Var3.b.a(R.string.top_games, Arrays.copyOf(new Object[0], 0));
                                }
                                s4iVar = new s4i(strA, iB2, null, false, 12);
                            }
                            arrayList.add(s4iVar);
                        }
                        return dyb.r0(arrayList);
                }
            }
        });
    }
}
