package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class kn implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f18562a;
    public final g2v b;
    public final long c;
    public final n0o0 d;
    public final n0o0 e;

    public kn(ln lnVar, ctf0 ctf0Var, g2v g2vVar, long j) {
        ctf0Var.getClass();
        this.f18562a = ctf0Var;
        this.b = g2vVar;
        this.c = j;
        final byte b = 0;
        this.d = maz.b(new yw9(lnVar, new Function1(this) { // from class: a.jn
            public final /* synthetic */ kn b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0115  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                List list;
                byte b2 = b;
                int i = 0;
                kn knVar = this.b;
                switch (b2) {
                    case 0:
                        ln lnVar2 = (ln) obj;
                        lnVar2.getClass();
                        boolean z2 = lnVar2.c;
                        String str = lnVar2.d;
                        ctf0 ctf0Var2 = knVar.f18562a;
                        j0g0 j0g0Var = lnVar2.b;
                        boolean z3 = lnVar2.f20320a;
                        if (j0g0Var != null) {
                            Object obj2 = j0g0Var.f15681a;
                            boolean z4 = obj2 instanceof g0g0;
                            if (!(!z4)) {
                                z = false;
                            } else {
                                Collection collection = (Collection) (z4 ? null : obj2);
                                if (collection == null || collection.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        boolean z5 = !((j0g0Var == null && z3) || (j0g0Var != null && (j0g0Var.f15681a instanceof g0g0)) || ((z || j0g0Var == null) && !z3));
                        String strA = ctf0Var2.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0));
                        String strA2 = ctf0Var2.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                        if (z2) {
                            pz40 pz40Var = s6t0.f31722a;
                            return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new nlm(new hmm(10, str, strA2, false)), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                        }
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_search, z5, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
                    default:
                        ln lnVar3 = (ln) obj;
                        lnVar3.getClass();
                        j0g0 j0g0Var2 = lnVar3.b;
                        String str2 = lnVar3.d;
                        if (j0g0Var2 != null) {
                            Object obj3 = j0g0Var2.f15681a;
                            if (obj3 instanceof g0g0) {
                                obj3 = null;
                            }
                            list = (List) obj3;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            bm bmVar = (bm) obj4;
                            if (str2.length() == 0 || vqd.A(bmVar.b, Locale.ROOT, str2, false)) {
                                arrayList.add(obj4);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (Object obj5 : arrayList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar2 = (bm) obj5;
                            ctf0 ctf0Var3 = knVar.f18562a;
                            bmVar2.getClass();
                            ctf0Var3.getClass();
                            long j2 = bmVar2.f2815a;
                            String str3 = bmVar2.b;
                            b2l0 b2l0Var = new b2l0(str3, fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var3)));
                            t1l0 t1l0Var = new t1l0(p1l0.CIRCLE_GLOBE_ICON, new y3d(fbc.d(ctf0.b(R.attr.uikitSecondary60, ctf0Var3))), bmVar2.c, null, null, null, 248);
                            zcl zclVar = qmk.f28987a;
                            arrayList2.add(new fm(j2 + str3 + i, new zrm(b2l0Var, t1l0Var, (g3l0) null, (d4d) null, new l3l0(16.0f), 44)));
                            i = i2;
                        }
                        return arrayList2;
                }
            }
        }, (byte) 20));
        final byte b2 = 1;
        this.e = maz.b(new yw9(lnVar, new Function1(this) { // from class: a.jn
            public final /* synthetic */ kn b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x0115  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                List list;
                byte b3 = b2;
                int i = 0;
                kn knVar = this.b;
                switch (b3) {
                    case 0:
                        ln lnVar2 = (ln) obj;
                        lnVar2.getClass();
                        boolean z2 = lnVar2.c;
                        String str = lnVar2.d;
                        ctf0 ctf0Var2 = knVar.f18562a;
                        j0g0 j0g0Var = lnVar2.b;
                        boolean z3 = lnVar2.f20320a;
                        if (j0g0Var != null) {
                            Object obj2 = j0g0Var.f15681a;
                            boolean z4 = obj2 instanceof g0g0;
                            if (!(!z4)) {
                                z = false;
                            } else {
                                Collection collection = (Collection) (z4 ? null : obj2);
                                if (collection == null || collection.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        boolean z5 = !((j0g0Var == null && z3) || (j0g0Var != null && (j0g0Var.f15681a instanceof g0g0)) || ((z || j0g0Var == null) && !z3));
                        String strA = ctf0Var2.b.a(R.string.active_teams, Arrays.copyOf(new Object[0], 0));
                        String strA2 = ctf0Var2.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                        if (z2) {
                            pz40 pz40Var = s6t0.f31722a;
                            return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new nlm(new hmm(10, str, strA2, false)), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                        }
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_search, z5, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
                    default:
                        ln lnVar3 = (ln) obj;
                        lnVar3.getClass();
                        j0g0 j0g0Var2 = lnVar3.b;
                        String str2 = lnVar3.d;
                        if (j0g0Var2 != null) {
                            Object obj3 = j0g0Var2.f15681a;
                            if (obj3 instanceof g0g0) {
                                obj3 = null;
                            }
                            list = (List) obj3;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            bm bmVar = (bm) obj4;
                            if (str2.length() == 0 || vqd.A(bmVar.b, Locale.ROOT, str2, false)) {
                                arrayList.add(obj4);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        for (Object obj5 : arrayList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            bm bmVar2 = (bm) obj5;
                            ctf0 ctf0Var3 = knVar.f18562a;
                            bmVar2.getClass();
                            ctf0Var3.getClass();
                            long j2 = bmVar2.f2815a;
                            String str3 = bmVar2.b;
                            b2l0 b2l0Var = new b2l0(str3, fbc.d(ctf0.b(R.attr.uikitTextPrimary, ctf0Var3)));
                            t1l0 t1l0Var = new t1l0(p1l0.CIRCLE_GLOBE_ICON, new y3d(fbc.d(ctf0.b(R.attr.uikitSecondary60, ctf0Var3))), bmVar2.c, null, null, null, 248);
                            zcl zclVar = qmk.f28987a;
                            arrayList2.add(new fm(j2 + str3 + i, new zrm(b2l0Var, t1l0Var, (g3l0) null, (d4d) null, new l3l0(16.0f), 44)));
                            i = i2;
                        }
                        return arrayList2;
                }
            }
        }, (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        a4x a4xVarO0;
        vm umVar;
        ln lnVar = (ln) obj;
        lnVar.getClass();
        n0o0 n0o0Var = this.d;
        ((fee) n0o0Var.getValue()).d(lnVar);
        n0o0 n0o0Var2 = this.e;
        ((fee) n0o0Var2.getValue()).d(lnVar);
        j0g0 j0g0Var = lnVar.b;
        boolean z = lnVar.f20320a;
        boolean z2 = false;
        boolean z3 = j0g0Var == null && z;
        if (z3) {
            ArrayList arrayList = new ArrayList(12);
            for (int i = 0; i < 12; i++) {
                arrayList.add(new gm(twn.m(i, "ACTIVE_TEAMS_SHIMMER_KEY")));
            }
            a4xVarO0 = dyb.o0(arrayList);
        } else {
            a4xVarO0 = (j0g0Var == null || !((j0g0Var.f15681a instanceof g0g0) ^ true)) ? lak0.c : dyb.o0((Iterable) ((fee) n0o0Var2.getValue()).b());
        }
        a4x a4xVar = a4xVarO0;
        imm immVar = (imm) ((fee) n0o0Var.getValue()).b();
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            boolean z4 = obj2 instanceof g0g0;
            if (!z4) {
                if (z4) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                }
            }
        }
        g2v g2vVar = this.b;
        long j = this.c;
        if ((j0g0Var != null && (j0g0Var.f15681a instanceof g0g0)) || ((z2 || j0g0Var == null) && !z)) {
            umVar = new um(ozb.Q(j, g2vVar));
        } else if (z2) {
            umVar = new um(ozb.P(j, g2vVar));
        } else {
            umVar = (j0g0Var != null && ((j0g0Var.f15681a instanceof g0g0) ^ true) && ((List) ((fee) n0o0Var2.getValue()).b()).isEmpty()) ? new um(g2v.b(g2vVar, pb10.v, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)) : tm.f34171a;
        }
        return new nn(immVar, umVar, a4xVar, lnVar.d, z3);
    }
}
