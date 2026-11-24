package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class qb4 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28430a = 1;
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
    public final Serializable t;

    public qb4(ctf0 ctf0Var, u2b0 u2b0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(Boolean.valueOf(u2b0Var.f34938a));
        this.d = bkb.H(Boolean.valueOf(u2b0Var.b));
        this.e = bkb.H(Boolean.valueOf(u2b0Var.c));
        this.f = bkb.H(Boolean.valueOf(u2b0Var.d));
        this.g = bkb.H(Boolean.valueOf(u2b0Var.e));
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(u2b0Var.f));
        this.h = n0o0VarH;
        this.i = bkb.H(Boolean.valueOf(u2b0Var.h));
        this.j = bkb.H(Boolean.valueOf(u2b0Var.i));
        this.k = bkb.H(u2b0Var.j);
        this.l = bkb.H(u2b0Var.k);
        this.m = bkb.H(u2b0Var.l);
        final byte b2 = 0;
        this.n = bkb.G(b().d, new Function1(this) { // from class: a.y2b0
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:124:0x0344  */
            /* JADX WARN: Code duplicated, block: B:245:0x0676  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                n0o0 n0o0Var3;
                Iterator it;
                n0o0 n0o0Var4;
                Iterable iterableA;
                Iterable iterableC;
                vhc0 vhc0Var;
                boolean z;
                boolean z2;
                fkl fklVar;
                hml hmlVar;
                int i;
                char c;
                int i2;
                Iterable iterableJ;
                Iterator it2;
                char c2;
                Iterable iterableJ2;
                List list;
                int i3;
                String strA;
                int i4;
                n0o0 n0o0Var5;
                n0o0 n0o0Var6;
                int i5;
                pt0 pt0Var;
                mtr mtrVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                fkl fklVar2;
                byte b3 = b2;
                qb4 qb4Var = this.b;
                switch (b3) {
                    case 0:
                        ((List) obj).getClass();
                        if (((Boolean) ((fee) qb4Var.g.getValue()).c()).booleanValue()) {
                            return z2b0.e;
                        }
                        if (!qb4Var.d()) {
                            return z2b0.f43663a;
                        }
                        if (qb4Var.d() && qb4Var.f()) {
                            return z2b0.b;
                        }
                        if (qb4Var.d() && qb4Var.e()) {
                            return z2b0.c;
                        }
                        if (qb4Var.d() && qb4Var.g()) {
                            return z2b0.b;
                        }
                        return (!qb4Var.d() || qb4Var.f() || qb4Var.e() || qb4Var.g()) ? z2b0.f43663a : z2b0.d;
                    default:
                        n0o0 n0o0Var7 = qb4Var.i;
                        n0o0 n0o0Var8 = qb4Var.k;
                        n0o0 n0o0Var9 = qb4Var.c;
                        ctf0 ctf0Var2 = qb4Var.b;
                        List list2 = (List) obj;
                        ArrayList arrayListU = twn.u(list2);
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            df40 df40Var = (df40) it3.next();
                            if (df40Var != null) {
                                int i6 = 0;
                                if (df40Var instanceof ue40) {
                                    if (((ue40) df40Var).f35508a instanceof dyx) {
                                        if (((Boolean) qb4Var.h().c()).booleanValue()) {
                                            pz40 pz40Var = s6t0.f31722a;
                                            long j = hi0.T;
                                            String strA2 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                                            ckl cklVar = ckl.f4512a;
                                            fklVar2 = new fkl(j, m0xVar, null, strA2, null, dyb.g0(dkl.f6236a), 32);
                                        } else {
                                            pz40 pz40Var2 = s6t0.f31722a;
                                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                                            String strA3 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                                            ckl cklVar2 = ckl.f4512a;
                                            fklVar2 = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                                        }
                                        iterableC = kotlin.collections.a.c(new e2b0(ss5.f32709a, fklVar2));
                                    } else {
                                        iterableC = iun.f15405a;
                                    }
                                    n0o0Var = n0o0Var7;
                                    n0o0Var2 = n0o0Var8;
                                    n0o0Var4 = n0o0Var9;
                                    it = it3;
                                } else {
                                    if (df40Var instanceof pe40) {
                                        pe40 pe40Var = (pe40) df40Var;
                                        fyx fyxVar = pe40Var.b;
                                        w4t w4tVar = pe40Var.f26833a;
                                        cyx cyxVar = fyxVar instanceof cyx ? (cyx) fyxVar : null;
                                        if (cyxVar == null || (list = (List) cyxVar.f5198a) == null) {
                                            n0o0Var = n0o0Var7;
                                            n0o0Var2 = n0o0Var8;
                                            n0o0Var3 = n0o0Var9;
                                            iterableJ2 = iun.f15405a;
                                        } else {
                                            if (list.isEmpty()) {
                                                list = null;
                                            }
                                            if (list != null) {
                                                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                                                Iterator it4 = list.iterator();
                                                while (true) {
                                                    String strA4 = "";
                                                    if (it4.hasNext()) {
                                                        mlr mlrVar = (mlr) it4.next();
                                                        boolean zBooleanValue = ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue();
                                                        boolean zBooleanValue2 = ((Boolean) qb4Var.h().c()).booleanValue();
                                                        Set set = (Set) ((fee) n0o0Var8.getValue()).c();
                                                        Iterator it5 = it4;
                                                        long j2 = mlrVar.f22006a;
                                                        boolean z3 = mlrVar.k;
                                                        boolean zContains = set.contains(Long.valueOf(j2));
                                                        pt0 pt0Var3 = (pt0) qb4Var.a().b();
                                                        fl70 fl70Var = fza0.f10399a;
                                                        fza0 fza0VarH0 = aac.h0(w4tVar);
                                                        fl70Var.getClass();
                                                        int iB = fl70.b(fza0VarH0);
                                                        if (iB == R.string.exclusive_slots) {
                                                            i4 = 1194;
                                                        } else if (iB == R.string.aggregator_one_x_live) {
                                                            i4 = 1292;
                                                        } else if (iB == R.string.slots_popular) {
                                                            i4 = 1192;
                                                        } else {
                                                            i4 = iB == R.string.live_casino_popular ? 1293 : i6;
                                                        }
                                                        Integer numValueOf = Integer.valueOf(i4);
                                                        ctf0Var2.getClass();
                                                        pt0Var3.getClass();
                                                        int i7 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                                        boolean z4 = mlrVar.j;
                                                        if (z3) {
                                                            n0o0Var5 = n0o0Var7;
                                                            n0o0Var6 = n0o0Var8;
                                                            strA4 = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[i6], i6));
                                                        } else {
                                                            n0o0Var5 = n0o0Var7;
                                                            n0o0Var6 = n0o0Var8;
                                                            if (z4) {
                                                                strA4 = ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                                            }
                                                        }
                                                        String str = strA4;
                                                        n0o0 n0o0Var10 = n0o0Var9;
                                                        long j3 = mlrVar.f22006a;
                                                        String str2 = mlrVar.f;
                                                        String str3 = mlrVar.e;
                                                        if (zBooleanValue) {
                                                            i5 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                                                        } else {
                                                            i5 = 0;
                                                        }
                                                        mtr mtrVar2 = new mtr(i5, zContains);
                                                        n0x n0xVar = new n0x(mlrVar.g);
                                                        m0x m0xVar3 = new m0x(i7, null, 6);
                                                        if (str.length() == 0) {
                                                            murVar = lur.f20686a;
                                                            mtrVar = mtrVar2;
                                                        } else {
                                                            pt0 pt0Var4 = pt0.f27539a;
                                                            if ((pt0Var3 == pt0Var4 && z3) || (pt0Var3 == (pt0Var = pt0.c) && z3)) {
                                                                mtrVar = mtrVar2;
                                                            } else {
                                                                mtrVar = mtrVar2;
                                                                pt0 pt0Var5 = pt0.d;
                                                                if (pt0Var3 != pt0Var5 || !z3) {
                                                                    if ((pt0Var3 == pt0Var4 && z4) || ((pt0Var3 == pt0Var && z4) || (pt0Var3 == pt0Var5 && z4))) {
                                                                        d4d d4dVar = d4d.PRIMARY;
                                                                        uqo0Var = new eqo0();
                                                                    } else {
                                                                        pt0 pt0Var6 = pt0.b;
                                                                        if ((pt0Var3 == pt0Var6 && z3) || (pt0Var3 == (pt0Var2 = pt0.e) && z3)) {
                                                                            uqo0Var = kro0.f18776a;
                                                                        } else {
                                                                            uqo0Var = ((pt0Var3 == pt0Var6 && z4) || (pt0Var3 == pt0Var2 && z4)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                                        }
                                                                    }
                                                                }
                                                                murVar = new mur(str, uqo0Var);
                                                            }
                                                            d4d d4dVar2 = d4d.PRIMARY;
                                                            uqo0Var = new lro0();
                                                            murVar = new mur(str, uqo0Var);
                                                        }
                                                        arrayList.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                                        n0o0Var9 = n0o0Var10;
                                                        n0o0Var7 = n0o0Var5;
                                                        it4 = it5;
                                                        n0o0Var8 = n0o0Var6;
                                                        i6 = 0;
                                                    } else {
                                                        n0o0Var = n0o0Var7;
                                                        n0o0Var2 = n0o0Var8;
                                                        n0o0Var3 = n0o0Var9;
                                                        a4x a4xVarO0 = dyb.o0(arrayList);
                                                        if (a4xVarO0 != null) {
                                                            if (((Boolean) qb4Var.h().c()).booleanValue()) {
                                                                q4t q4tVar = w4tVar instanceof q4t ? (q4t) w4tVar : null;
                                                                String str4 = q4tVar != null ? q4tVar.b : null;
                                                                strA = str4 == null ? "" : str4;
                                                                i3 = 0;
                                                            } else {
                                                                fl70 fl70Var2 = fza0.f10399a;
                                                                fza0 fza0VarH1 = aac.h0(w4tVar);
                                                                fl70Var2.getClass();
                                                                int iB2 = fl70.b(fza0VarH1);
                                                                i3 = 0;
                                                                strA = ctf0Var2.b.a(iB2, Arrays.copyOf(new Object[0], 0));
                                                            }
                                                            iterableJ2 = q3d.j(new h2b0(new eqv(aac.g0(w4tVar), aac.h0(w4tVar)), new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var2.b.a(R.string.all, Arrays.copyOf(new Object[i3], i3))), null, 7166)), new g2b0(aac.h0(w4tVar), aac.g0(w4tVar), new zll((pt0) qb4Var.a().b(), new wll(o0s.f24443a), a4xVarO0)));
                                                        }
                                                    }
                                                }
                                            } else {
                                                n0o0Var = n0o0Var7;
                                                n0o0Var2 = n0o0Var8;
                                                n0o0Var3 = n0o0Var9;
                                            }
                                            iterableJ2 = iun.f15405a;
                                        }
                                        iterableC = iterableJ2;
                                        it = it3;
                                    } else {
                                        n0o0Var = n0o0Var7;
                                        n0o0Var2 = n0o0Var8;
                                        n0o0Var3 = n0o0Var9;
                                        obj2 = null;
                                        boolean z5 = true;
                                        if (df40Var instanceof ne40) {
                                            fyx fyxVar2 = ((ne40) df40Var).f23366a;
                                            if (fyxVar2 instanceof cyx) {
                                                List list3 = (List) ((cyx) fyxVar2).f5198a;
                                                int i8 = ((Boolean) qb4Var.h().c()).booleanValue() ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                                                h2b0 h2b0Var = new h2b0(dqv.f6532a, new hjm(ctf0Var2.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var2.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166));
                                                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                                                Iterator it6 = list3.iterator();
                                                while (it6.hasNext()) {
                                                    vh0 vh0Var = (vh0) it6.next();
                                                    int i9 = (int) vh0Var.f37408a;
                                                    String str5 = vh0Var.b;
                                                    Iterator it7 = it6;
                                                    StringBuilder sb = new StringBuilder(ujn.h);
                                                    String str6 = vh0Var.c;
                                                    if (str6.length() == 0) {
                                                        sb.setLength(0);
                                                        it2 = it3;
                                                    } else {
                                                        it2 = it3;
                                                        int i10 = 0;
                                                        if (StringsKt.O(str6, ujn.h, false)) {
                                                            sb.setLength(i10);
                                                            sb.append(str6);
                                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                                            i10 = 0;
                                                            sb.setLength(i10);
                                                            sb.append(str6);
                                                        } else {
                                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                                c2 = '/';
                                                            } else {
                                                                sb.append('/');
                                                                c2 = '/';
                                                            }
                                                            char[] cArr = new char[z5];
                                                            cArr[0] = c2;
                                                            sb.append(StringsKt.y0(str6, cArr));
                                                        }
                                                    }
                                                    arrayList2.add(new cvl(i9, new n0x(sb.toString()), Integer.valueOf(i8), str5));
                                                    it6 = it7;
                                                    it3 = it2;
                                                    z5 = true;
                                                }
                                                it = it3;
                                                iterableJ = q3d.j(h2b0Var, new f2b0(new zul(dyb.o0(arrayList2))));
                                            } else {
                                                iterableJ = iun.f15405a;
                                                it = it3;
                                            }
                                            iterableC = iterableJ;
                                        } else {
                                            it = it3;
                                            if (df40Var instanceof ve40) {
                                                fyx fyxVar3 = ((ve40) df40Var).f37265a;
                                                cyx cyxVar2 = fyxVar3 instanceof cyx ? (cyx) fyxVar3 : null;
                                                if (cyxVar2 == null || (vhc0Var = (vhc0) cyxVar2.f5198a) == null) {
                                                    n0o0Var4 = n0o0Var3;
                                                    iterableA = iun.f15405a;
                                                } else {
                                                    boolean z6 = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && vhc0Var.c.g;
                                                    boolean z7 = vhc0Var.f37423a.k || vhc0Var.b.k;
                                                    if (!z6 && !z7) {
                                                        vhc0Var = null;
                                                    }
                                                    if (vhc0Var != null) {
                                                        foc0 foc0Var = vhc0Var.c;
                                                        boolean z8 = foc0Var.g;
                                                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                                                        boolean zBooleanValue4 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                                                        boolean z9 = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && z8;
                                                        List listL0 = CollectionsKt.L0((Iterable) ((fee) n0o0Var2.getValue()).c());
                                                        listL0.getClass();
                                                        ctf0Var2.getClass();
                                                        lsm0 lsm0Var = ctf0Var2.b;
                                                        hjm hjmVar = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                                        kic0 kic0Var = vhc0Var.f37423a;
                                                        boolean z10 = kic0Var.k;
                                                        if (z9 && z8) {
                                                            pz40 pz40Var3 = s6t0.f31722a;
                                                            long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                                            StringBuilder sb2 = new StringBuilder(ujn.h);
                                                            String str7 = zBooleanValue3 ? foc0Var.b : foc0Var.c;
                                                            if (StringsKt.W(str7)) {
                                                                str7 = foc0Var.f9875a;
                                                            }
                                                            if (str7.length() == 0) {
                                                                sb2.setLength(0);
                                                                n0o0Var4 = n0o0Var3;
                                                                z = true;
                                                                i2 = 0;
                                                            } else {
                                                                n0o0Var4 = n0o0Var3;
                                                                if (StringsKt.O(str7, ujn.h, false)) {
                                                                    i = 0;
                                                                } else if (kotlin.text.c.x(str7, "https://", false)) {
                                                                    i = 0;
                                                                } else {
                                                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                                        c = '/';
                                                                    } else {
                                                                        c = '/';
                                                                        sb2.append('/');
                                                                    }
                                                                    z = true;
                                                                    i2 = 0;
                                                                    sb2.append(StringsKt.y0(str7, c));
                                                                }
                                                                z = true;
                                                                sb2.setLength(i);
                                                                sb2.append(str7);
                                                                i2 = i;
                                                            }
                                                            n0x n0xVar2 = new n0x(sb2.toString());
                                                            String str8 = foc0Var.f;
                                                            String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i2], i2));
                                                            ckl cklVar3 = ckl.f4512a;
                                                            fklVar = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str8, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                                            z2 = i2;
                                                        } else {
                                                            n0o0Var4 = n0o0Var3;
                                                            z = true;
                                                            z2 = 0;
                                                            fklVar = null;
                                                        }
                                                        kic0 kic0Var2 = vhc0Var.b;
                                                        boolean z11 = kic0Var2.k;
                                                        if (z10 != 0 || z11) {
                                                            hmlVar = new hml(z10 != 0 ? l8x.s0(kic0Var, zBooleanValue4, listL0, nw80.b, ctf0Var2) : l8x.s0(kic0Var2, zBooleanValue4, listL0, nw80.f24223a, ctf0Var2), (z10 && z11) ? l8x.s0(kic0Var2, zBooleanValue4, listL0, nw80.f24223a, ctf0Var2) : null);
                                                        } else {
                                                            hmlVar = null;
                                                        }
                                                        if (fklVar != null) {
                                                            z2 = z;
                                                        }
                                                        lc00 lc00VarB = kotlin.collections.a.b();
                                                        lc00VarB.add(new h2b0(gqv.f11752a, hjmVar));
                                                        if (fklVar != null) {
                                                            lc00VarB.add(new e2b0(ts5.f34445a, fklVar));
                                                        }
                                                        if (hmlVar != null) {
                                                            lc00VarB.add(new i2b0(z2, hmlVar));
                                                        }
                                                        iterableA = kotlin.collections.a.a(lc00VarB);
                                                    } else {
                                                        n0o0Var4 = n0o0Var3;
                                                        iterableA = iun.f15405a;
                                                    }
                                                }
                                                iterableC = iterableA;
                                            }
                                        }
                                    }
                                    n0o0Var4 = n0o0Var3;
                                }
                                w3d.u(arrayListU, iterableC);
                                n0o0Var9 = n0o0Var4;
                                n0o0Var7 = n0o0Var;
                                it3 = it;
                                n0o0Var8 = n0o0Var2;
                            } else {
                                obj2 = null;
                            }
                            t9f.b();
                            return obj2;
                        }
                        return arrayListU.isEmpty() ? iun.f15405a : arrayListU;
                }
            }
        });
        this.o = bkb.G(((fee) n0o0VarH.getValue()).d, new kma0((byte) 7));
        this.p = bkb.G(((fee) n0o0VarH.getValue()).d, new kma0((byte) 8));
        this.q = bkb.G(((fee) n0o0VarH.getValue()).d, new kma0((byte) 9));
        this.r = maz.b(new yw9(u2b0Var.g, new kma0((byte) 10), (byte) 20));
        this.s = bkb.G(b().d, new Function1(this) { // from class: a.y2b0
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:124:0x0344  */
            /* JADX WARN: Code duplicated, block: B:245:0x0676  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                n0o0 n0o0Var3;
                Iterator it;
                n0o0 n0o0Var4;
                Iterable iterableA;
                Iterable iterableC;
                vhc0 vhc0Var;
                boolean z;
                boolean z2;
                fkl fklVar;
                hml hmlVar;
                int i;
                char c;
                int i2;
                Iterable iterableJ;
                Iterator it2;
                char c2;
                Iterable iterableJ2;
                List list;
                int i3;
                String strA;
                int i4;
                n0o0 n0o0Var5;
                n0o0 n0o0Var6;
                int i5;
                pt0 pt0Var;
                mtr mtrVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                fkl fklVar2;
                byte b3 = b;
                qb4 qb4Var = this.b;
                switch (b3) {
                    case 0:
                        ((List) obj).getClass();
                        if (((Boolean) ((fee) qb4Var.g.getValue()).c()).booleanValue()) {
                            return z2b0.e;
                        }
                        if (!qb4Var.d()) {
                            return z2b0.f43663a;
                        }
                        if (qb4Var.d() && qb4Var.f()) {
                            return z2b0.b;
                        }
                        if (qb4Var.d() && qb4Var.e()) {
                            return z2b0.c;
                        }
                        if (qb4Var.d() && qb4Var.g()) {
                            return z2b0.b;
                        }
                        return (!qb4Var.d() || qb4Var.f() || qb4Var.e() || qb4Var.g()) ? z2b0.f43663a : z2b0.d;
                    default:
                        n0o0 n0o0Var7 = qb4Var.i;
                        n0o0 n0o0Var8 = qb4Var.k;
                        n0o0 n0o0Var9 = qb4Var.c;
                        ctf0 ctf0Var2 = qb4Var.b;
                        List list2 = (List) obj;
                        ArrayList arrayListU = twn.u(list2);
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            df40 df40Var = (df40) it3.next();
                            if (df40Var != null) {
                                int i6 = 0;
                                if (df40Var instanceof ue40) {
                                    if (((ue40) df40Var).f35508a instanceof dyx) {
                                        if (((Boolean) qb4Var.h().c()).booleanValue()) {
                                            pz40 pz40Var = s6t0.f31722a;
                                            long j = hi0.T;
                                            String strA2 = ctf0Var2.b.a(R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                                            m0x m0xVar = new m0x(R.drawable.popular_virtual_banner, null, 6);
                                            ckl cklVar = ckl.f4512a;
                                            fklVar2 = new fkl(j, m0xVar, null, strA2, null, dyb.g0(dkl.f6236a), 32);
                                        } else {
                                            pz40 pz40Var2 = s6t0.f31722a;
                                            long jM92getDarkPink0d7_KjU = StaticColors.INSTANCE.m92getDarkPink0d7_KjU();
                                            String strA3 = ctf0Var2.b.a(R.string.my_casino, Arrays.copyOf(new Object[0], 0));
                                            m0x m0xVar2 = new m0x(R.drawable.aggregator_popular_banner, null, 6);
                                            ckl cklVar2 = ckl.f4512a;
                                            fklVar2 = new fkl(jM92getDarkPink0d7_KjU, m0xVar2, null, strA3, null, dyb.g0(dkl.f6236a), 32);
                                        }
                                        iterableC = kotlin.collections.a.c(new e2b0(ss5.f32709a, fklVar2));
                                    } else {
                                        iterableC = iun.f15405a;
                                    }
                                    n0o0Var = n0o0Var7;
                                    n0o0Var2 = n0o0Var8;
                                    n0o0Var4 = n0o0Var9;
                                    it = it3;
                                } else {
                                    if (df40Var instanceof pe40) {
                                        pe40 pe40Var = (pe40) df40Var;
                                        fyx fyxVar = pe40Var.b;
                                        w4t w4tVar = pe40Var.f26833a;
                                        cyx cyxVar = fyxVar instanceof cyx ? (cyx) fyxVar : null;
                                        if (cyxVar == null || (list = (List) cyxVar.f5198a) == null) {
                                            n0o0Var = n0o0Var7;
                                            n0o0Var2 = n0o0Var8;
                                            n0o0Var3 = n0o0Var9;
                                            iterableJ2 = iun.f15405a;
                                        } else {
                                            if (list.isEmpty()) {
                                                list = null;
                                            }
                                            if (list != null) {
                                                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                                                Iterator it4 = list.iterator();
                                                while (true) {
                                                    String strA4 = "";
                                                    if (it4.hasNext()) {
                                                        mlr mlrVar = (mlr) it4.next();
                                                        boolean zBooleanValue = ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue();
                                                        boolean zBooleanValue2 = ((Boolean) qb4Var.h().c()).booleanValue();
                                                        Set set = (Set) ((fee) n0o0Var8.getValue()).c();
                                                        Iterator it5 = it4;
                                                        long j2 = mlrVar.f22006a;
                                                        boolean z3 = mlrVar.k;
                                                        boolean zContains = set.contains(Long.valueOf(j2));
                                                        pt0 pt0Var3 = (pt0) qb4Var.a().b();
                                                        fl70 fl70Var = fza0.f10399a;
                                                        fza0 fza0VarH0 = aac.h0(w4tVar);
                                                        fl70Var.getClass();
                                                        int iB = fl70.b(fza0VarH0);
                                                        if (iB == R.string.exclusive_slots) {
                                                            i4 = 1194;
                                                        } else if (iB == R.string.aggregator_one_x_live) {
                                                            i4 = 1292;
                                                        } else if (iB == R.string.slots_popular) {
                                                            i4 = 1192;
                                                        } else {
                                                            i4 = iB == R.string.live_casino_popular ? 1293 : i6;
                                                        }
                                                        Integer numValueOf = Integer.valueOf(i4);
                                                        ctf0Var2.getClass();
                                                        pt0Var3.getClass();
                                                        int i7 = zBooleanValue2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                                        boolean z4 = mlrVar.j;
                                                        if (z3) {
                                                            n0o0Var5 = n0o0Var7;
                                                            n0o0Var6 = n0o0Var8;
                                                            strA4 = ctf0Var2.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[i6], i6));
                                                        } else {
                                                            n0o0Var5 = n0o0Var7;
                                                            n0o0Var6 = n0o0Var8;
                                                            if (z4) {
                                                                strA4 = ctf0Var2.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                                            }
                                                        }
                                                        String str = strA4;
                                                        n0o0 n0o0Var10 = n0o0Var9;
                                                        long j3 = mlrVar.f22006a;
                                                        String str2 = mlrVar.f;
                                                        String str3 = mlrVar.e;
                                                        if (zBooleanValue) {
                                                            i5 = zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
                                                        } else {
                                                            i5 = 0;
                                                        }
                                                        mtr mtrVar2 = new mtr(i5, zContains);
                                                        n0x n0xVar = new n0x(mlrVar.g);
                                                        m0x m0xVar3 = new m0x(i7, null, 6);
                                                        if (str.length() == 0) {
                                                            murVar = lur.f20686a;
                                                            mtrVar = mtrVar2;
                                                        } else {
                                                            pt0 pt0Var4 = pt0.f27539a;
                                                            if ((pt0Var3 == pt0Var4 && z3) || (pt0Var3 == (pt0Var = pt0.c) && z3)) {
                                                                mtrVar = mtrVar2;
                                                            } else {
                                                                mtrVar = mtrVar2;
                                                                pt0 pt0Var5 = pt0.d;
                                                                if (pt0Var3 != pt0Var5 || !z3) {
                                                                    if ((pt0Var3 == pt0Var4 && z4) || ((pt0Var3 == pt0Var && z4) || (pt0Var3 == pt0Var5 && z4))) {
                                                                        d4d d4dVar = d4d.PRIMARY;
                                                                        uqo0Var = new eqo0();
                                                                    } else {
                                                                        pt0 pt0Var6 = pt0.b;
                                                                        if ((pt0Var3 == pt0Var6 && z3) || (pt0Var3 == (pt0Var2 = pt0.e) && z3)) {
                                                                            uqo0Var = kro0.f18776a;
                                                                        } else {
                                                                            uqo0Var = ((pt0Var3 == pt0Var6 && z4) || (pt0Var3 == pt0Var2 && z4)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                                                        }
                                                                    }
                                                                }
                                                                murVar = new mur(str, uqo0Var);
                                                            }
                                                            d4d d4dVar2 = d4d.PRIMARY;
                                                            uqo0Var = new lro0();
                                                            murVar = new mur(str, uqo0Var);
                                                        }
                                                        arrayList.add(new st0(j3, str2, str3, mtrVar, n0xVar, m0xVar3, numValueOf, murVar));
                                                        n0o0Var9 = n0o0Var10;
                                                        n0o0Var7 = n0o0Var5;
                                                        it4 = it5;
                                                        n0o0Var8 = n0o0Var6;
                                                        i6 = 0;
                                                    } else {
                                                        n0o0Var = n0o0Var7;
                                                        n0o0Var2 = n0o0Var8;
                                                        n0o0Var3 = n0o0Var9;
                                                        a4x a4xVarO0 = dyb.o0(arrayList);
                                                        if (a4xVarO0 != null) {
                                                            if (((Boolean) qb4Var.h().c()).booleanValue()) {
                                                                q4t q4tVar = w4tVar instanceof q4t ? (q4t) w4tVar : null;
                                                                String str4 = q4tVar != null ? q4tVar.b : null;
                                                                strA = str4 == null ? "" : str4;
                                                                i3 = 0;
                                                            } else {
                                                                fl70 fl70Var2 = fza0.f10399a;
                                                                fza0 fza0VarH1 = aac.h0(w4tVar);
                                                                fl70Var2.getClass();
                                                                int iB2 = fl70.b(fza0VarH1);
                                                                i3 = 0;
                                                                strA = ctf0Var2.b.a(iB2, Arrays.copyOf(new Object[0], 0));
                                                            }
                                                            iterableJ2 = q3d.j(new h2b0(new eqv(aac.g0(w4tVar), aac.h0(w4tVar)), new hjm(strA, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var2.b.a(R.string.all, Arrays.copyOf(new Object[i3], i3))), null, 7166)), new g2b0(aac.h0(w4tVar), aac.g0(w4tVar), new zll((pt0) qb4Var.a().b(), new wll(o0s.f24443a), a4xVarO0)));
                                                        }
                                                    }
                                                }
                                            } else {
                                                n0o0Var = n0o0Var7;
                                                n0o0Var2 = n0o0Var8;
                                                n0o0Var3 = n0o0Var9;
                                            }
                                            iterableJ2 = iun.f15405a;
                                        }
                                        iterableC = iterableJ2;
                                        it = it3;
                                    } else {
                                        n0o0Var = n0o0Var7;
                                        n0o0Var2 = n0o0Var8;
                                        n0o0Var3 = n0o0Var9;
                                        obj2 = null;
                                        boolean z5 = true;
                                        if (df40Var instanceof ne40) {
                                            fyx fyxVar2 = ((ne40) df40Var).f23366a;
                                            if (fyxVar2 instanceof cyx) {
                                                List list3 = (List) ((cyx) fyxVar2).f5198a;
                                                int i8 = ((Boolean) qb4Var.h().c()).booleanValue() ? R.drawable.category_virtual_placeholder : R.drawable.category_aggregator_placeholder;
                                                h2b0 h2b0Var = new h2b0(dqv.f6532a, new hjm(ctf0Var2.b.a(R.string.categories, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, new ue9(ctf0Var2.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166));
                                                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                                                Iterator it6 = list3.iterator();
                                                while (it6.hasNext()) {
                                                    vh0 vh0Var = (vh0) it6.next();
                                                    int i9 = (int) vh0Var.f37408a;
                                                    String str5 = vh0Var.b;
                                                    Iterator it7 = it6;
                                                    StringBuilder sb = new StringBuilder(ujn.h);
                                                    String str6 = vh0Var.c;
                                                    if (str6.length() == 0) {
                                                        sb.setLength(0);
                                                        it2 = it3;
                                                    } else {
                                                        it2 = it3;
                                                        int i10 = 0;
                                                        if (StringsKt.O(str6, ujn.h, false)) {
                                                            sb.setLength(i10);
                                                            sb.append(str6);
                                                        } else if (kotlin.text.c.x(str6, "https://", false)) {
                                                            i10 = 0;
                                                            sb.setLength(i10);
                                                            sb.append(str6);
                                                        } else {
                                                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                                c2 = '/';
                                                            } else {
                                                                sb.append('/');
                                                                c2 = '/';
                                                            }
                                                            char[] cArr = new char[z5];
                                                            cArr[0] = c2;
                                                            sb.append(StringsKt.y0(str6, cArr));
                                                        }
                                                    }
                                                    arrayList2.add(new cvl(i9, new n0x(sb.toString()), Integer.valueOf(i8), str5));
                                                    it6 = it7;
                                                    it3 = it2;
                                                    z5 = true;
                                                }
                                                it = it3;
                                                iterableJ = q3d.j(h2b0Var, new f2b0(new zul(dyb.o0(arrayList2))));
                                            } else {
                                                iterableJ = iun.f15405a;
                                                it = it3;
                                            }
                                            iterableC = iterableJ;
                                        } else {
                                            it = it3;
                                            if (df40Var instanceof ve40) {
                                                fyx fyxVar3 = ((ve40) df40Var).f37265a;
                                                cyx cyxVar2 = fyxVar3 instanceof cyx ? (cyx) fyxVar3 : null;
                                                if (cyxVar2 == null || (vhc0Var = (vhc0) cyxVar2.f5198a) == null) {
                                                    n0o0Var4 = n0o0Var3;
                                                    iterableA = iun.f15405a;
                                                } else {
                                                    boolean z6 = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && vhc0Var.c.g;
                                                    boolean z7 = vhc0Var.f37423a.k || vhc0Var.b.k;
                                                    if (!z6 && !z7) {
                                                        vhc0Var = null;
                                                    }
                                                    if (vhc0Var != null) {
                                                        foc0 foc0Var = vhc0Var.c;
                                                        boolean z8 = foc0Var.g;
                                                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                                                        boolean zBooleanValue4 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                                                        boolean z9 = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() && z8;
                                                        List listL0 = CollectionsKt.L0((Iterable) ((fee) n0o0Var2.getValue()).c());
                                                        listL0.getClass();
                                                        ctf0Var2.getClass();
                                                        lsm0 lsm0Var = ctf0Var2.b;
                                                        hjm hjmVar = new hjm(lsm0Var.a(R.string.selection_for_you, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                                                        kic0 kic0Var = vhc0Var.f37423a;
                                                        boolean z10 = kic0Var.k;
                                                        if (z9 && z8) {
                                                            pz40 pz40Var3 = s6t0.f31722a;
                                                            long jM95getGray0d7_KjU = StaticColors.INSTANCE.m95getGray0d7_KjU();
                                                            StringBuilder sb2 = new StringBuilder(ujn.h);
                                                            String str7 = zBooleanValue3 ? foc0Var.b : foc0Var.c;
                                                            if (StringsKt.W(str7)) {
                                                                str7 = foc0Var.f9875a;
                                                            }
                                                            if (str7.length() == 0) {
                                                                sb2.setLength(0);
                                                                n0o0Var4 = n0o0Var3;
                                                                z = true;
                                                                i2 = 0;
                                                            } else {
                                                                n0o0Var4 = n0o0Var3;
                                                                if (StringsKt.O(str7, ujn.h, false)) {
                                                                    i = 0;
                                                                } else if (kotlin.text.c.x(str7, "https://", false)) {
                                                                    i = 0;
                                                                } else {
                                                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                                                        c = '/';
                                                                    } else {
                                                                        c = '/';
                                                                        sb2.append('/');
                                                                    }
                                                                    z = true;
                                                                    i2 = 0;
                                                                    sb2.append(StringsKt.y0(str7, c));
                                                                }
                                                                z = true;
                                                                sb2.setLength(i);
                                                                sb2.append(str7);
                                                                i2 = i;
                                                            }
                                                            n0x n0xVar2 = new n0x(sb2.toString());
                                                            String str8 = foc0Var.f;
                                                            String strA5 = lsm0Var.a(R.string.casino_provider_of_the_month, Arrays.copyOf(new Object[i2], i2));
                                                            ckl cklVar3 = ckl.f4512a;
                                                            fklVar = new fkl(jM95getGray0d7_KjU, n0xVar2, null, str8, strA5, dyb.g0(dkl.f6236a, dkl.b), 32);
                                                            z2 = i2;
                                                        } else {
                                                            n0o0Var4 = n0o0Var3;
                                                            z = true;
                                                            z2 = 0;
                                                            fklVar = null;
                                                        }
                                                        kic0 kic0Var2 = vhc0Var.b;
                                                        boolean z11 = kic0Var2.k;
                                                        if (z10 != 0 || z11) {
                                                            hmlVar = new hml(z10 != 0 ? l8x.s0(kic0Var, zBooleanValue4, listL0, nw80.b, ctf0Var2) : l8x.s0(kic0Var2, zBooleanValue4, listL0, nw80.f24223a, ctf0Var2), (z10 && z11) ? l8x.s0(kic0Var2, zBooleanValue4, listL0, nw80.f24223a, ctf0Var2) : null);
                                                        } else {
                                                            hmlVar = null;
                                                        }
                                                        if (fklVar != null) {
                                                            z2 = z;
                                                        }
                                                        lc00 lc00VarB = kotlin.collections.a.b();
                                                        lc00VarB.add(new h2b0(gqv.f11752a, hjmVar));
                                                        if (fklVar != null) {
                                                            lc00VarB.add(new e2b0(ts5.f34445a, fklVar));
                                                        }
                                                        if (hmlVar != null) {
                                                            lc00VarB.add(new i2b0(z2, hmlVar));
                                                        }
                                                        iterableA = kotlin.collections.a.a(lc00VarB);
                                                    } else {
                                                        n0o0Var4 = n0o0Var3;
                                                        iterableA = iun.f15405a;
                                                    }
                                                }
                                                iterableC = iterableA;
                                            }
                                        }
                                    }
                                    n0o0Var4 = n0o0Var3;
                                }
                                w3d.u(arrayListU, iterableC);
                                n0o0Var9 = n0o0Var4;
                                n0o0Var7 = n0o0Var;
                                it3 = it;
                                n0o0Var8 = n0o0Var2;
                            } else {
                                obj2 = null;
                            }
                            t9f.b();
                            return obj2;
                        }
                        return arrayListU.isEmpty() ? iun.f15405a : arrayListU;
                }
            }
        });
        lc00 lc00VarB = kotlin.collections.a.b();
        ss5 ss5Var = ss5.f32709a;
        gkl gklVar = gkl.f11450a;
        lc00VarB.add(new e2b0(ss5Var, gklVar));
        fza0 fza0Var = fza0.c;
        lc00VarB.add(new h2b0(new eqv(0L, fza0Var), new ijm()));
        pt0 pt0Var = (pt0) a().b();
        o0s o0sVar = o0s.f24443a;
        lc00VarB.add(new g2b0(fza0Var, 0L, new aml(pt0Var, new wll(o0sVar), true)));
        lc00VarB.add(new h2b0(new eqv(0L, fza0Var), new ijm()));
        lc00VarB.add(new g2b0(fza0Var, 0L, new aml((pt0) a().b(), new wll(o0sVar), true)));
        lc00VarB.add(new h2b0(new eqv(0L, fza0Var), new ijm()));
        lc00VarB.add(new g2b0(fza0Var, 0L, new aml((pt0) a().b(), new wll(o0sVar), true)));
        if (!((Boolean) h().c()).booleanValue()) {
            lc00VarB.add(new h2b0(new eqv(0L, fza0Var), new ijm()));
            lc00VarB.add(new g2b0(fza0Var, 0L, new aml((pt0) a().b(), new wll(o0sVar), true)));
        }
        lc00VarB.add(new h2b0(dqv.f6532a, new ijm(new qjm())));
        lc00VarB.add(new f2b0(avl.f1531a));
        if (!((Boolean) h().c()).booleanValue()) {
            lc00VarB.add(new h2b0(gqv.f11752a, new ijm()));
            lc00VarB.add(new e2b0(ts5.f34445a, gklVar));
            lc00VarB.add(new i2b0(true, iml.f15031a));
        }
        this.t = kotlin.collections.a.a(lc00VarB);
    }

    public fee a() {
        return (fee) this.r.getValue();
    }

    public fee b() {
        return (fee) this.m.getValue();
    }

    public fee c() {
        return (fee) this.c.getValue();
    }

    public boolean d() {
        Iterable iterable = (Iterable) b().d.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!(((df40) obj) instanceof ue40)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fyx state = ((df40) it.next()).getState();
            if (state != null) {
                if (!(state instanceof ayx) && !(state instanceof zxx) && !(state instanceof dyx) && !(state instanceof cyx)) {
                    if ((state instanceof byx) || (state instanceof eyx)) {
                        return false;
                    }
                }
            }
            t9f.b();
            return false;
        }
        return true;
    }

    public boolean e() {
        Iterable iterable = (Iterable) b().d.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!(((df40) obj) instanceof ue40)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!(((df40) it.next()).getState() instanceof zxx)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        Iterable iterable = (Iterable) b().d.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!(((df40) obj) instanceof ue40)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!(((df40) it.next()).getState() instanceof ayx)) {
                return false;
            }
        }
        return true;
    }

    public boolean g() {
        Iterable iterable = (Iterable) b().d.getValue();
        ArrayList<df40> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!(((df40) obj) instanceof ue40)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (df40 df40Var : arrayList) {
            if (!(df40Var.getState() instanceof ayx) && !(df40Var.getState() instanceof zxx)) {
                return false;
            }
        }
        return true;
    }

    public fee h() {
        return (fee) this.e.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f28430a;
        Serializable serializable = this.t;
        n0o0 n0o0Var = this.p;
        n0o0 n0o0Var2 = this.q;
        n0o0 n0o0Var3 = this.o;
        n0o0 n0o0Var4 = this.s;
        n0o0 n0o0Var5 = this.n;
        n0o0 n0o0Var6 = this.l;
        n0o0 n0o0Var7 = this.j;
        n0o0 n0o0Var8 = this.i;
        n0o0 n0o0Var9 = this.k;
        n0o0 n0o0Var10 = this.h;
        n0o0 n0o0Var11 = this.g;
        n0o0 n0o0Var12 = this.f;
        n0o0 n0o0Var13 = this.d;
        switch (b) {
            case 0:
                mb4 mb4Var = (mb4) obj;
                mb4Var.getClass();
                c().d(mb4Var.m);
                n0o0 n0o0Var14 = this.e;
                ((fee) n0o0Var14.getValue()).d(Boolean.valueOf(mb4Var.f21489a));
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(mb4Var.n));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(mb4Var.b));
                ((fee) n0o0Var.getValue()).d(mb4Var.c);
                ((fee) n0o0Var10.getValue()).d(Boolean.valueOf(mb4Var.d));
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(mb4Var.i));
                ((fee) n0o0Var7.getValue()).d(mb4Var.j);
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(mb4Var.k));
                ((fee) n0o0Var2.getValue()).d(mb4Var.e);
                n0o0 n0o0Var15 = this.r;
                ((fee) n0o0Var15.getValue()).d(mb4Var.g);
                ((fee) n0o0Var4.getValue()).d(mb4Var.f);
                return new ob4(((Boolean) ((fee) n0o0Var10.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var14.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var6.getValue()).b()).booleanValue(), (List) ((fee) n0o0Var.getValue()).b(), (c6q0) ((fee) n0o0Var2.getValue()).b(), (c6q0) ((fee) n0o0Var4.getValue()).b(), (hnm) ((fee) n0o0Var15.getValue()).b(), (String) serializable, (wul) ((fee) n0o0Var3.getValue()).b(), (wul) ((fee) n0o0Var5.getValue()).b(), (wul) n0o0Var13.getValue(), (xa4) ((fee) this.m.getValue()).b());
            default:
                u2b0 u2b0Var = (u2b0) obj;
                u2b0Var.getClass();
                ((fee) this.c.getValue()).d(Boolean.valueOf(u2b0Var.f34938a));
                ((fee) n0o0Var13.getValue()).d(Boolean.valueOf(u2b0Var.b));
                h().d(Boolean.valueOf(u2b0Var.c));
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(u2b0Var.d));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(u2b0Var.e));
                ((fee) n0o0Var10.getValue()).d(Integer.valueOf(u2b0Var.f));
                ((fee) n0o0Var9.getValue()).d(u2b0Var.j);
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(u2b0Var.h));
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(u2b0Var.i));
                ((fee) n0o0Var6.getValue()).d(u2b0Var.k);
                b().d(u2b0Var.l);
                int iOrdinal = ((z2b0) ((fee) n0o0Var5.getValue()).b()).ordinal();
                if (iOrdinal == 0) {
                    return new v2b0(dyb.o0((lc00) serializable));
                }
                if (iOrdinal == 1) {
                    return new w2b0((mdm) ((fee) n0o0Var.getValue()).b());
                }
                if (iOrdinal != 2) {
                    return iOrdinal != 4 ? new v2b0(dyb.o0((Iterable) ((fee) n0o0Var4.getValue()).b())) : new w2b0((mdm) ((fee) n0o0Var3.getValue()).b());
                }
                return new w2b0((mdm) ((fee) n0o0Var2.getValue()).b());
        }
    }

    public qb4(mb4 mb4Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(mb4Var.m);
        this.t = ctf0Var.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
        this.d = maz.b(new a13(this, (byte) 24));
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(mb4Var.f21489a));
        this.e = n0o0VarH;
        this.f = bkb.H(Boolean.valueOf(mb4Var.n));
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(mb4Var.b));
        this.g = n0o0VarH2;
        this.h = bkb.H(Boolean.valueOf(mb4Var.d));
        this.i = bkb.H(Boolean.valueOf(mb4Var.i));
        this.j = bkb.H(mb4Var.j);
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(mb4Var.k));
        this.k = n0o0VarH3;
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new or3((byte) 15));
        this.m = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.pb4
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:109:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:112:0x02da  */
            /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:147:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:1: B:24:0x009e->B:148:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:? A[LOOP:4: B:114:0x02e1->B:158:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x006a  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:85:0x024f A[PHI: r11
  0x024f: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:97:0x0266, B:93:0x025f, B:88:0x0255, B:84:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                s7q0 s7q0Var;
                Iterator it;
                boolean z;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                s7q0 s7q0Var2;
                Iterator it2;
                boolean z2;
                byte b2 = b;
                Object obj2 = null;
                Object obj3 = null;
                qb4 qb4Var = this.b;
                switch (b2) {
                    case 0:
                        ctf0 ctf0Var2 = qb4Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new xa4(ctf0Var2.b.a(R.string.account_not_exist, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(ctf0Var2.b.a(R.string.offer_to_registration, Arrays.copyOf(new Object[0], 0))), true, false, false));
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(qul.e, oe9.f25112a, new ue9(qb4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!((cb4) qb4Var.c().c()).b) {
                            return null;
                        }
                        if (((cb4) qb4Var.c().c()).c || ((cb4) qb4Var.c().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 3:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var3 = qb4Var.b;
                        boolean z3 = ((cb4) qb4Var.c().c()).c;
                        boolean z4 = ((cb4) qb4Var.c().c()).d;
                        boolean zBooleanValue2 = ((Boolean) ((fee) qb4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue2) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue2) && !(!z3 && z4 && zBooleanValue2)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue2) && !(z3 && !z4 && zBooleanValue2)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA = ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list = (List) ((fee) qb4Var.j.getValue()).c();
                        list.getClass();
                        ctf0Var3.getClass();
                        String str = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof gh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var = new s7q0("");
                                }
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof gh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var = new s7q0("");
                        }
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof gh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                    case 4:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list2 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var4 = qb4Var.b;
                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.i.getValue()).c()).booleanValue();
                        list2.getClass();
                        ctf0Var4.getClass();
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str2 = id4Var.e;
                        String str3 = id4Var.b;
                        String strConcat = id4Var.c;
                        str2.getClass();
                        if (str2.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var4.b;
                        String strA2 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA2);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            String str4 = strConcat;
                            o0x m0xVar = (!zBooleanValue3 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string);
                            pz40 pz40Var = s6t0.f31722a;
                            ymmVar = new ymm(str4, m0xVar, strA2, new y3d(s6t0.b().f33626a.getSecondary60()), 16);
                        }
                        String str5 = id4Var.f14564a;
                        String strA3 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str3.getClass();
                        knm knmVar = new knm(str5, strA3, new bm90(str3), Integer.valueOf(id4Var.d), new yu90(str3));
                        Iterator it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                    default:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list3 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = qb4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str6 = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue4 ? o6q0.f24750a : i6q0.f14254a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj5 : list3) {
                            if (((lh4) obj5) instanceof hh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var2 = new s7q0("");
                                }
                                s7q0 s7q0Var3 = s7q0Var2;
                                String strA4 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list3.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof hh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var3, true, z2, a6q0Var, strA4, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var2 = new s7q0("");
                        }
                        s7q0 s7q0Var4 = s7q0Var2;
                        String strA5 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list3.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof hh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var4, true, z2, a6q0Var, strA5, null, false, 0, null, 261376);
                }
            }
        });
        final byte b2 = 1;
        this.n = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.pb4
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:109:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:112:0x02da  */
            /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:147:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:1: B:24:0x009e->B:148:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:? A[LOOP:4: B:114:0x02e1->B:158:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x006a  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:85:0x024f A[PHI: r11
  0x024f: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:97:0x0266, B:93:0x025f, B:88:0x0255, B:84:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                s7q0 s7q0Var;
                Iterator it;
                boolean z;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                s7q0 s7q0Var2;
                Iterator it2;
                boolean z2;
                byte b3 = b2;
                Object obj2 = null;
                Object obj3 = null;
                qb4 qb4Var = this.b;
                switch (b3) {
                    case 0:
                        ctf0 ctf0Var2 = qb4Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new xa4(ctf0Var2.b.a(R.string.account_not_exist, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(ctf0Var2.b.a(R.string.offer_to_registration, Arrays.copyOf(new Object[0], 0))), true, false, false));
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(qul.e, oe9.f25112a, new ue9(qb4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!((cb4) qb4Var.c().c()).b) {
                            return null;
                        }
                        if (((cb4) qb4Var.c().c()).c || ((cb4) qb4Var.c().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 3:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var3 = qb4Var.b;
                        boolean z3 = ((cb4) qb4Var.c().c()).c;
                        boolean z4 = ((cb4) qb4Var.c().c()).d;
                        boolean zBooleanValue2 = ((Boolean) ((fee) qb4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue2) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue2) && !(!z3 && z4 && zBooleanValue2)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue2) && !(z3 && !z4 && zBooleanValue2)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA = ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list = (List) ((fee) qb4Var.j.getValue()).c();
                        list.getClass();
                        ctf0Var3.getClass();
                        String str = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof gh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var = new s7q0("");
                                }
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof gh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var = new s7q0("");
                        }
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof gh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                    case 4:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list2 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var4 = qb4Var.b;
                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.i.getValue()).c()).booleanValue();
                        list2.getClass();
                        ctf0Var4.getClass();
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str2 = id4Var.e;
                        String str3 = id4Var.b;
                        String strConcat = id4Var.c;
                        str2.getClass();
                        if (str2.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var4.b;
                        String strA2 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA2);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            String str4 = strConcat;
                            o0x m0xVar = (!zBooleanValue3 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string);
                            pz40 pz40Var = s6t0.f31722a;
                            ymmVar = new ymm(str4, m0xVar, strA2, new y3d(s6t0.b().f33626a.getSecondary60()), 16);
                        }
                        String str5 = id4Var.f14564a;
                        String strA3 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str3.getClass();
                        knm knmVar = new knm(str5, strA3, new bm90(str3), Integer.valueOf(id4Var.d), new yu90(str3));
                        Iterator it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                    default:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list3 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = qb4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str6 = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue4 ? o6q0.f24750a : i6q0.f14254a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj5 : list3) {
                            if (((lh4) obj5) instanceof hh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var2 = new s7q0("");
                                }
                                s7q0 s7q0Var4 = s7q0Var2;
                                String strA5 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list3.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof hh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var4, true, z2, a6q0Var, strA5, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var2 = new s7q0("");
                        }
                        s7q0 s7q0Var5 = s7q0Var2;
                        String strA6 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list3.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof hh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var5, true, z2, a6q0Var, strA6, null, false, 0, null, 261376);
                }
            }
        });
        final byte b3 = 2;
        this.o = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.pb4
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:109:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:112:0x02da  */
            /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:147:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:1: B:24:0x009e->B:148:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:? A[LOOP:4: B:114:0x02e1->B:158:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x006a  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:85:0x024f A[PHI: r11
  0x024f: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:97:0x0266, B:93:0x025f, B:88:0x0255, B:84:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                s7q0 s7q0Var;
                Iterator it;
                boolean z;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                s7q0 s7q0Var2;
                Iterator it2;
                boolean z2;
                byte b4 = b3;
                Object obj2 = null;
                Object obj3 = null;
                qb4 qb4Var = this.b;
                switch (b4) {
                    case 0:
                        ctf0 ctf0Var2 = qb4Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new xa4(ctf0Var2.b.a(R.string.account_not_exist, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(ctf0Var2.b.a(R.string.offer_to_registration, Arrays.copyOf(new Object[0], 0))), true, false, false));
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(qul.e, oe9.f25112a, new ue9(qb4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!((cb4) qb4Var.c().c()).b) {
                            return null;
                        }
                        if (((cb4) qb4Var.c().c()).c || ((cb4) qb4Var.c().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 3:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var3 = qb4Var.b;
                        boolean z3 = ((cb4) qb4Var.c().c()).c;
                        boolean z4 = ((cb4) qb4Var.c().c()).d;
                        boolean zBooleanValue2 = ((Boolean) ((fee) qb4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue2) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue2) && !(!z3 && z4 && zBooleanValue2)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue2) && !(z3 && !z4 && zBooleanValue2)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA = ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list = (List) ((fee) qb4Var.j.getValue()).c();
                        list.getClass();
                        ctf0Var3.getClass();
                        String str = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof gh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var = new s7q0("");
                                }
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof gh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var = new s7q0("");
                        }
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof gh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                    case 4:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list2 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var4 = qb4Var.b;
                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.i.getValue()).c()).booleanValue();
                        list2.getClass();
                        ctf0Var4.getClass();
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str2 = id4Var.e;
                        String str3 = id4Var.b;
                        String strConcat = id4Var.c;
                        str2.getClass();
                        if (str2.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var4.b;
                        String strA2 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA2);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            String str4 = strConcat;
                            o0x m0xVar = (!zBooleanValue3 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string);
                            pz40 pz40Var = s6t0.f31722a;
                            ymmVar = new ymm(str4, m0xVar, strA2, new y3d(s6t0.b().f33626a.getSecondary60()), 16);
                        }
                        String str5 = id4Var.f14564a;
                        String strA3 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str3.getClass();
                        knm knmVar = new knm(str5, strA3, new bm90(str3), Integer.valueOf(id4Var.d), new yu90(str3));
                        Iterator it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                    default:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list3 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = qb4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str6 = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue4 ? o6q0.f24750a : i6q0.f14254a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj5 : list3) {
                            if (((lh4) obj5) instanceof hh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var2 = new s7q0("");
                                }
                                s7q0 s7q0Var5 = s7q0Var2;
                                String strA6 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list3.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof hh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var5, true, z2, a6q0Var, strA6, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var2 = new s7q0("");
                        }
                        s7q0 s7q0Var6 = s7q0Var2;
                        String strA7 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list3.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof hh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var6, true, z2, a6q0Var, strA7, null, false, 0, null, 261376);
                }
            }
        });
        this.p = maz.b(new yw9(mb4Var.c, new or3(this), (byte) 20));
        final byte b4 = 3;
        this.q = maz.b(new yw9(mb4Var.e, new Function1(this) { // from class: a.pb4
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:109:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:112:0x02da  */
            /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:147:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:1: B:24:0x009e->B:148:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:? A[LOOP:4: B:114:0x02e1->B:158:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x006a  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:85:0x024f A[PHI: r11
  0x024f: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:97:0x0266, B:93:0x025f, B:88:0x0255, B:84:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                s7q0 s7q0Var;
                Iterator it;
                boolean z;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                s7q0 s7q0Var2;
                Iterator it2;
                boolean z2;
                byte b5 = b4;
                Object obj2 = null;
                Object obj3 = null;
                qb4 qb4Var = this.b;
                switch (b5) {
                    case 0:
                        ctf0 ctf0Var2 = qb4Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new xa4(ctf0Var2.b.a(R.string.account_not_exist, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(ctf0Var2.b.a(R.string.offer_to_registration, Arrays.copyOf(new Object[0], 0))), true, false, false));
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(qul.e, oe9.f25112a, new ue9(qb4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!((cb4) qb4Var.c().c()).b) {
                            return null;
                        }
                        if (((cb4) qb4Var.c().c()).c || ((cb4) qb4Var.c().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 3:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var3 = qb4Var.b;
                        boolean z3 = ((cb4) qb4Var.c().c()).c;
                        boolean z4 = ((cb4) qb4Var.c().c()).d;
                        boolean zBooleanValue2 = ((Boolean) ((fee) qb4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue2) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue2) && !(!z3 && z4 && zBooleanValue2)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue2) && !(z3 && !z4 && zBooleanValue2)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA = ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list = (List) ((fee) qb4Var.j.getValue()).c();
                        list.getClass();
                        ctf0Var3.getClass();
                        String str = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof gh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var = new s7q0("");
                                }
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof gh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var = new s7q0("");
                        }
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof gh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                    case 4:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list2 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var4 = qb4Var.b;
                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.i.getValue()).c()).booleanValue();
                        list2.getClass();
                        ctf0Var4.getClass();
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str2 = id4Var.e;
                        String str3 = id4Var.b;
                        String strConcat = id4Var.c;
                        str2.getClass();
                        if (str2.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var4.b;
                        String strA2 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA2);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            String str4 = strConcat;
                            o0x m0xVar = (!zBooleanValue3 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string);
                            pz40 pz40Var = s6t0.f31722a;
                            ymmVar = new ymm(str4, m0xVar, strA2, new y3d(s6t0.b().f33626a.getSecondary60()), 16);
                        }
                        String str5 = id4Var.f14564a;
                        String strA3 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str3.getClass();
                        knm knmVar = new knm(str5, strA3, new bm90(str3), Integer.valueOf(id4Var.d), new yu90(str3));
                        Iterator it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                    default:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list3 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = qb4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str6 = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue4 ? o6q0.f24750a : i6q0.f14254a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj5 : list3) {
                            if (((lh4) obj5) instanceof hh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var2 = new s7q0("");
                                }
                                s7q0 s7q0Var6 = s7q0Var2;
                                String strA7 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list3.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof hh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var6, true, z2, a6q0Var, strA7, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var2 = new s7q0("");
                        }
                        s7q0 s7q0Var7 = s7q0Var2;
                        String strA8 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list3.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof hh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var7, true, z2, a6q0Var, strA8, null, false, 0, null, 261376);
                }
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.r = maz.b(new yw9(mb4Var.g, new Function1(this) { // from class: a.pb4
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:109:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:112:0x02da  */
            /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:147:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:1: B:24:0x009e->B:148:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:? A[LOOP:4: B:114:0x02e1->B:158:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x006a  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:85:0x024f A[PHI: r11
  0x024f: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:97:0x0266, B:93:0x025f, B:88:0x0255, B:84:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                s7q0 s7q0Var;
                Iterator it;
                boolean z;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                s7q0 s7q0Var2;
                Iterator it2;
                boolean z2;
                byte b6 = b5;
                Object obj2 = null;
                Object obj3 = null;
                qb4 qb4Var = this.b;
                switch (b6) {
                    case 0:
                        ctf0 ctf0Var2 = qb4Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new xa4(ctf0Var2.b.a(R.string.account_not_exist, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(ctf0Var2.b.a(R.string.offer_to_registration, Arrays.copyOf(new Object[0], 0))), true, false, false));
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(qul.e, oe9.f25112a, new ue9(qb4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!((cb4) qb4Var.c().c()).b) {
                            return null;
                        }
                        if (((cb4) qb4Var.c().c()).c || ((cb4) qb4Var.c().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 3:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var3 = qb4Var.b;
                        boolean z3 = ((cb4) qb4Var.c().c()).c;
                        boolean z4 = ((cb4) qb4Var.c().c()).d;
                        boolean zBooleanValue2 = ((Boolean) ((fee) qb4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue2) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue2) && !(!z3 && z4 && zBooleanValue2)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue2) && !(z3 && !z4 && zBooleanValue2)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA = ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list = (List) ((fee) qb4Var.j.getValue()).c();
                        list.getClass();
                        ctf0Var3.getClass();
                        String str = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof gh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var = new s7q0("");
                                }
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof gh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var = new s7q0("");
                        }
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof gh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                    case 4:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list2 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var4 = qb4Var.b;
                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.i.getValue()).c()).booleanValue();
                        list2.getClass();
                        ctf0Var4.getClass();
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str2 = id4Var.e;
                        String str3 = id4Var.b;
                        String strConcat = id4Var.c;
                        str2.getClass();
                        if (str2.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var4.b;
                        String strA2 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA2);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            String str4 = strConcat;
                            o0x m0xVar = (!zBooleanValue3 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string);
                            pz40 pz40Var = s6t0.f31722a;
                            ymmVar = new ymm(str4, m0xVar, strA2, new y3d(s6t0.b().f33626a.getSecondary60()), 16);
                        }
                        String str5 = id4Var.f14564a;
                        String strA3 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str3.getClass();
                        knm knmVar = new knm(str5, strA3, new bm90(str3), Integer.valueOf(id4Var.d), new yu90(str3));
                        Iterator it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                    default:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list3 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = qb4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str6 = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue4 ? o6q0.f24750a : i6q0.f14254a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj5 : list3) {
                            if (((lh4) obj5) instanceof hh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var2 = new s7q0("");
                                }
                                s7q0 s7q0Var7 = s7q0Var2;
                                String strA8 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list3.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof hh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var7, true, z2, a6q0Var, strA8, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var2 = new s7q0("");
                        }
                        s7q0 s7q0Var8 = s7q0Var2;
                        String strA9 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list3.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof hh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var8, true, z2, a6q0Var, strA9, null, false, 0, null, 261376);
                }
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.s = maz.b(new yw9(mb4Var.f, new Function1(this) { // from class: a.pb4
            public final /* synthetic */ qb4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:109:0x02ce  */
            /* JADX WARN: Code duplicated, block: B:112:0x02da  */
            /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:116:0x02e7  */
            /* JADX WARN: Code duplicated, block: B:147:0x00ae A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:148:? A[LOOP:1: B:24:0x009e->B:148:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:157:0x02f1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:? A[LOOP:4: B:114:0x02e1->B:158:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:17:0x006a  */
            /* JADX WARN: Code duplicated, block: B:19:0x007d  */
            /* JADX WARN: Code duplicated, block: B:22:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:85:0x024f A[PHI: r11
  0x024f: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:97:0x0266, B:93:0x025f, B:88:0x0255, B:84:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                s7q0 s7q0Var;
                Iterator it;
                boolean z;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                s7q0 s7q0Var2;
                Iterator it2;
                boolean z2;
                byte b7 = b6;
                Object obj2 = null;
                Object obj3 = null;
                qb4 qb4Var = this.b;
                switch (b7) {
                    case 0:
                        ctf0 ctf0Var2 = qb4Var.b;
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new xa4(ctf0Var2.b.a(R.string.account_not_exist, Arrays.copyOf(new Object[0], 0)), new wul(qul.e, oe9.c, new ue9(ctf0Var2.b.a(R.string.offer_to_registration, Arrays.copyOf(new Object[0], 0))), true, false, false));
                    case 1:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(qul.e, oe9.f25112a, new ue9(qb4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 2:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!((cb4) qb4Var.c().c()).b) {
                            return null;
                        }
                        if (((cb4) qb4Var.c().c()).c || ((cb4) qb4Var.c().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 3:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var3 = qb4Var.b;
                        boolean z3 = ((cb4) qb4Var.c().c()).c;
                        boolean z4 = ((cb4) qb4Var.c().c()).d;
                        boolean zBooleanValue2 = ((Boolean) ((fee) qb4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue2) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue2) && !(!z3 && z4 && zBooleanValue2)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue2) && !(z3 && !z4 && zBooleanValue2)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA = ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list = (List) ((fee) qb4Var.j.getValue()).c();
                        list.getClass();
                        ctf0Var3.getClass();
                        String str = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof gh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var = new s7q0("");
                                }
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof gh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var3.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var = new s7q0("");
                        }
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof gh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new c6q0(str, e6q0.f7299a, o6q0.f24750a, s7q0Var, true, z, y5q0Var, strA, null, false, 0, null, 261376);
                    case 4:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list2 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var4 = qb4Var.b;
                        boolean zBooleanValue3 = ((Boolean) ((fee) qb4Var.i.getValue()).c()).booleanValue();
                        list2.getClass();
                        ctf0Var4.getClass();
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str2 = id4Var.e;
                        String str3 = id4Var.b;
                        String strConcat = id4Var.c;
                        str2.getClass();
                        if (str2.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str2);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str2, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var4.b;
                        String strA2 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA2);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            String str4 = strConcat;
                            o0x m0xVar = (!zBooleanValue3 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string);
                            pz40 pz40Var = s6t0.f31722a;
                            ymmVar = new ymm(str4, m0xVar, strA2, new y3d(s6t0.b().f33626a.getSecondary60()), 16);
                        }
                        String str5 = id4Var.f14564a;
                        String strA3 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str3.getClass();
                        knm knmVar = new knm(str5, strA3, new bm90(str3), Integer.valueOf(id4Var.d), new yu90(str3));
                        Iterator it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new hnm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                    default:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list3 = (List) ((fee) qb4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = qb4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) qb4Var.f.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str6 = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue4 ? o6q0.f24750a : i6q0.f14254a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj5 : list3) {
                            if (((lh4) obj5) instanceof hh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    s7q0Var2 = new s7q0("");
                                }
                                s7q0 s7q0Var8 = s7q0Var2;
                                String strA9 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list3.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof hh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var8, true, z2, a6q0Var, strA9, null, false, 0, null, 261376);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var2 = new s7q0(ctf0Var5.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            s7q0Var2 = new s7q0("");
                        }
                        s7q0 s7q0Var9 = s7q0Var2;
                        String strA10 = ctf0Var5.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list3.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof hh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new c6q0(str6, e6q0.f7299a, p6q0Var, s7q0Var9, true, z2, a6q0Var, strA10, null, false, 0, null, 261376);
                }
            }
        }, (byte) 20));
    }
}
