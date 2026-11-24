package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class io1 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f15095a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final long j;
    public final long k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;

    public io1(ctf0 ctf0Var, bo1 bo1Var) {
        ctf0Var.getClass();
        this.f15095a = ctf0Var;
        h9h0 h9h0Var = bo1Var.b;
        this.b = bkb.H(h9h0Var);
        String str = bo1Var.f2910a;
        this.c = bkb.H(str);
        this.d = bkb.H(bo1Var.j);
        this.e = bkb.H(Integer.valueOf(bo1Var.p));
        this.f = bkb.H(Boolean.valueOf(bo1Var.d));
        this.g = bkb.H(bo1Var.h);
        this.h = bkb.H(Boolean.valueOf(bo1Var.k));
        this.i = bkb.H(bo1Var.e);
        this.j = fbc.d(ctf0.b(R.attr.uikitBackgroundContent, ctf0Var));
        this.k = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var));
        final byte b = 0;
        this.l = maz.b(new yw9(str, new Function1(this) { // from class: a.go1
            public final /* synthetic */ io1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                h8h0 h8h0Var = h8h0.f12625a;
                l8h0 l8h0Var = l8h0.f19604a;
                io1 io1Var = this.b;
                switch (b2) {
                    case 0:
                        ((String) obj).getClass();
                        return new imm(new ilm(io1Var.k), new nlm(new hmm((String) ((fee) io1Var.c.getValue()).c(), (sfh0) qfh0.f28634a, (String) ((fee) io1Var.d.getValue()).c(), true)), fmm.f9790a, io1Var.j, true, null);
                    case 1:
                        h9h0 h9h0Var2 = (h9h0) obj;
                        h9h0Var2.getClass();
                        if (h9h0Var2.equals(l8h0Var)) {
                            int iIntValue = ((Number) io1Var.b().c()).intValue();
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (!h9h0Var2.equals(h8h0Var)) {
                            return null;
                        }
                        int iIntValue2 = ((Number) io1Var.b().c()).intValue();
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.statistic_empty_data, 0, 0, 0L, 0L, 990);
                    default:
                        n0o0 n0o0Var = io1Var.f;
                        h9h0 h9h0Var3 = (h9h0) obj;
                        h9h0Var3.getClass();
                        if (h9h0Var3.equals(r8h0.f30026a)) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            lc00VarB.add(new hn1(io1.a(((Number) io1Var.b().c()).intValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue())));
                            pt0 pt0VarG0 = x4d0.g0((ot0) ((fee) io1Var.g.getValue()).c());
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            int i = jo1.f16835a[pt0VarG0.ordinal()] == 1 ? 9 : 5;
                            for (int i2 = 0; i2 < 5; i2++) {
                                wll wllVar = new wll(o0s.f24443a);
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                for (int i3 = 0; i3 < i; i3++) {
                                    lc00VarB3.add(new fp1());
                                }
                                lc00VarB2.add(new gn1(new zll(pt0VarG0, wllVar, dyb.o0(kotlin.collections.a.a(lc00VarB3))), false, false, new ijm(), new j8b(0L, "", iun.f15405a, 0L, 0L, 0L)));
                            }
                            lc00VarB.addAll(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                            return dyb.o0(kotlin.collections.a.a(lc00VarB));
                        }
                        if (h9h0Var3 instanceof f8h0) {
                            lc00 lc00VarB4 = kotlin.collections.a.b();
                            lc00VarB4.add(new hn1(io1.a(((Number) io1Var.b().c()).intValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue())));
                            lc00VarB4.addAll(io1Var.c(((f8h0) h9h0Var3).f9104a, true));
                            return dyb.o0(kotlin.collections.a.a(lc00VarB4));
                        }
                        if (!(h9h0Var3 instanceof j8h0)) {
                            if (h9h0Var3 instanceof c9h0) {
                                return io1Var.c(((c9h0) h9h0Var3).f3963a, false);
                            }
                            if (h9h0Var3.equals(l8h0Var) || h9h0Var3.equals(h8h0Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        int iIntValue3 = ((Number) io1Var.b().c()).intValue();
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        lc00VarB5.add(new hn1(new mdm(xuz.a(pb10Var3, iIntValue3), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)));
                        lc00VarB5.addAll(io1Var.c(((j8h0) h9h0Var3).f16084a, true));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB5));
                }
            }
        }, (byte) 20));
        final byte b2 = 1;
        this.m = maz.b(new yw9(h9h0Var, new Function1(this) { // from class: a.go1
            public final /* synthetic */ io1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                h8h0 h8h0Var = h8h0.f12625a;
                l8h0 l8h0Var = l8h0.f19604a;
                io1 io1Var = this.b;
                switch (b3) {
                    case 0:
                        ((String) obj).getClass();
                        return new imm(new ilm(io1Var.k), new nlm(new hmm((String) ((fee) io1Var.c.getValue()).c(), (sfh0) qfh0.f28634a, (String) ((fee) io1Var.d.getValue()).c(), true)), fmm.f9790a, io1Var.j, true, null);
                    case 1:
                        h9h0 h9h0Var2 = (h9h0) obj;
                        h9h0Var2.getClass();
                        if (h9h0Var2.equals(l8h0Var)) {
                            int iIntValue = ((Number) io1Var.b().c()).intValue();
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (!h9h0Var2.equals(h8h0Var)) {
                            return null;
                        }
                        int iIntValue2 = ((Number) io1Var.b().c()).intValue();
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.statistic_empty_data, 0, 0, 0L, 0L, 990);
                    default:
                        n0o0 n0o0Var = io1Var.f;
                        h9h0 h9h0Var3 = (h9h0) obj;
                        h9h0Var3.getClass();
                        if (h9h0Var3.equals(r8h0.f30026a)) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            lc00VarB.add(new hn1(io1.a(((Number) io1Var.b().c()).intValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue())));
                            pt0 pt0VarG0 = x4d0.g0((ot0) ((fee) io1Var.g.getValue()).c());
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            int i = jo1.f16835a[pt0VarG0.ordinal()] == 1 ? 9 : 5;
                            for (int i2 = 0; i2 < 5; i2++) {
                                wll wllVar = new wll(o0s.f24443a);
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                for (int i3 = 0; i3 < i; i3++) {
                                    lc00VarB3.add(new fp1());
                                }
                                lc00VarB2.add(new gn1(new zll(pt0VarG0, wllVar, dyb.o0(kotlin.collections.a.a(lc00VarB3))), false, false, new ijm(), new j8b(0L, "", iun.f15405a, 0L, 0L, 0L)));
                            }
                            lc00VarB.addAll(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                            return dyb.o0(kotlin.collections.a.a(lc00VarB));
                        }
                        if (h9h0Var3 instanceof f8h0) {
                            lc00 lc00VarB4 = kotlin.collections.a.b();
                            lc00VarB4.add(new hn1(io1.a(((Number) io1Var.b().c()).intValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue())));
                            lc00VarB4.addAll(io1Var.c(((f8h0) h9h0Var3).f9104a, true));
                            return dyb.o0(kotlin.collections.a.a(lc00VarB4));
                        }
                        if (!(h9h0Var3 instanceof j8h0)) {
                            if (h9h0Var3 instanceof c9h0) {
                                return io1Var.c(((c9h0) h9h0Var3).f3963a, false);
                            }
                            if (h9h0Var3.equals(l8h0Var) || h9h0Var3.equals(h8h0Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        int iIntValue3 = ((Number) io1Var.b().c()).intValue();
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        lc00VarB5.add(new hn1(new mdm(xuz.a(pb10Var3, iIntValue3), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)));
                        lc00VarB5.addAll(io1Var.c(((j8h0) h9h0Var3).f16084a, true));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB5));
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.n = maz.b(new yw9(h9h0Var, new Function1(this) { // from class: a.go1
            public final /* synthetic */ io1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                h8h0 h8h0Var = h8h0.f12625a;
                l8h0 l8h0Var = l8h0.f19604a;
                io1 io1Var = this.b;
                switch (b4) {
                    case 0:
                        ((String) obj).getClass();
                        return new imm(new ilm(io1Var.k), new nlm(new hmm((String) ((fee) io1Var.c.getValue()).c(), (sfh0) qfh0.f28634a, (String) ((fee) io1Var.d.getValue()).c(), true)), fmm.f9790a, io1Var.j, true, null);
                    case 1:
                        h9h0 h9h0Var2 = (h9h0) obj;
                        h9h0Var2.getClass();
                        if (h9h0Var2.equals(l8h0Var)) {
                            int iIntValue = ((Number) io1Var.b().c()).intValue();
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.g;
                            xuzVar.getClass();
                            return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                        }
                        if (!h9h0Var2.equals(h8h0Var)) {
                            return null;
                        }
                        int iIntValue2 = ((Number) io1Var.b().c()).intValue();
                        xuz xuzVar2 = pb10.c;
                        pb10 pb10Var2 = pb10.g;
                        xuzVar2.getClass();
                        return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.statistic_empty_data, 0, 0, 0L, 0L, 990);
                    default:
                        n0o0 n0o0Var = io1Var.f;
                        h9h0 h9h0Var3 = (h9h0) obj;
                        h9h0Var3.getClass();
                        if (h9h0Var3.equals(r8h0.f30026a)) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            lc00VarB.add(new hn1(io1.a(((Number) io1Var.b().c()).intValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue())));
                            pt0 pt0VarG0 = x4d0.g0((ot0) ((fee) io1Var.g.getValue()).c());
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            int i = jo1.f16835a[pt0VarG0.ordinal()] == 1 ? 9 : 5;
                            for (int i2 = 0; i2 < 5; i2++) {
                                wll wllVar = new wll(o0s.f24443a);
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                for (int i3 = 0; i3 < i; i3++) {
                                    lc00VarB3.add(new fp1());
                                }
                                lc00VarB2.add(new gn1(new zll(pt0VarG0, wllVar, dyb.o0(kotlin.collections.a.a(lc00VarB3))), false, false, new ijm(), new j8b(0L, "", iun.f15405a, 0L, 0L, 0L)));
                            }
                            lc00VarB.addAll(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                            return dyb.o0(kotlin.collections.a.a(lc00VarB));
                        }
                        if (h9h0Var3 instanceof f8h0) {
                            lc00 lc00VarB4 = kotlin.collections.a.b();
                            lc00VarB4.add(new hn1(io1.a(((Number) io1Var.b().c()).intValue(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue())));
                            lc00VarB4.addAll(io1Var.c(((f8h0) h9h0Var3).f9104a, true));
                            return dyb.o0(kotlin.collections.a.a(lc00VarB4));
                        }
                        if (!(h9h0Var3 instanceof j8h0)) {
                            if (h9h0Var3 instanceof c9h0) {
                                return io1Var.c(((c9h0) h9h0Var3).f3963a, false);
                            }
                            if (h9h0Var3.equals(l8h0Var) || h9h0Var3.equals(h8h0Var)) {
                                return lak0.c;
                            }
                            t9f.b();
                            return null;
                        }
                        lc00 lc00VarB5 = kotlin.collections.a.b();
                        int iIntValue3 = ((Number) io1Var.b().c()).intValue();
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.e;
                        xuzVar3.getClass();
                        lc00VarB5.add(new hn1(new mdm(xuz.a(pb10Var3, iIntValue3), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)));
                        lc00VarB5.addAll(io1Var.c(((j8h0) h9h0Var3).f16084a, true));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB5));
                }
            }
        }, (byte) 20));
    }

    public static mdm a(int i, boolean z) {
        int iA;
        if (z) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.j;
            xuzVar.getClass();
            iA = xuz.a(pb10Var, i);
        } else {
            xuz xuzVar2 = pb10.c;
            pb10 pb10Var2 = pb10.i;
            xuzVar2.getClass();
            iA = xuz.a(pb10Var2, i);
        }
        return new mdm(iA, null, null, 0, 0, R.string.games_for_any_taste, 0, 0, 0L, 0L, 990);
    }

    public final fee b() {
        return (fee) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    public final a4x c(List list, boolean z) {
        boolean z2;
        ue9 ue9Var;
        Iterator it;
        boolean z3;
        boolean z4;
        boolean z5;
        String strA;
        ot0 ot0Var;
        n0x n0xVar;
        ot0 ot0Var2;
        sso0 uqo0Var;
        nur murVar;
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            j8b j8bVar = (j8b) it2.next();
            ot0 ot0Var3 = (ot0) ((fee) this.g.getValue()).c();
            boolean zBooleanValue = ((Boolean) ((fee) this.f.getValue()).c()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ((fee) this.h.getValue()).c()).booleanValue();
            List list2 = (List) ((fee) this.i.getValue()).c();
            j8bVar.getClass();
            List<mlr> list3 = j8bVar.c;
            ot0Var3.getClass();
            list2.getClass();
            ctf0 ctf0Var = this.f15095a;
            ctf0Var.getClass();
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, i));
            for (mlr mlrVar : list3) {
                if (list2.isEmpty()) {
                    it = it2;
                    z3 = false;
                    break;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        z3 = false;
                        break;
                    }
                    it = it2;
                    if (((mlr) it3.next()).f22006a == mlrVar.f22006a) {
                        z3 = true;
                        break;
                    }
                    it2 = it;
                }
                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                mlrVar.getClass();
                boolean z6 = mlrVar.k;
                int i2 = zBooleanValue ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                boolean z7 = mlrVar.j;
                if (z6) {
                    z4 = z6;
                    z5 = zBooleanValue2;
                    strA = ctf0Var.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                } else {
                    z4 = z6;
                    z5 = zBooleanValue2;
                    strA = z7 ? ctf0Var.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                }
                List list4 = list2;
                long j = mlrVar.f22006a;
                String str = mlrVar.f;
                String str2 = mlrVar.e;
                mtr mtrVar = new mtr(z5 ? z3 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z3);
                n0x n0xVar2 = new n0x(mlrVar.g);
                m0x m0xVar = new m0x(i2, null, 6);
                if (strA.length() == 0) {
                    murVar = lur.f20686a;
                    n0xVar = n0xVar2;
                } else {
                    ot0 ot0Var4 = ot0.BACKGROUND_L;
                    if ((ot0Var3 == ot0Var4 && z4) || (ot0Var3 == (ot0Var = ot0.GRADIENT) && z4)) {
                        n0xVar = n0xVar2;
                    } else {
                        n0xVar = n0xVar2;
                        ot0 ot0Var5 = ot0.TRANSPARENCY;
                        if (ot0Var3 != ot0Var5 || !z4) {
                            if ((ot0Var3 == ot0Var4 && z7) || ((ot0Var3 == ot0Var && z7) || (ot0Var3 == ot0Var5 && z7))) {
                                d4d d4dVar = d4d.PRIMARY;
                                uqo0Var = new eqo0();
                            } else {
                                ot0 ot0Var6 = ot0.BACKGROUND_S;
                                uqo0Var = ((ot0Var3 == ot0Var6 && z4) || (ot0Var3 == (ot0Var2 = ot0.HORIZONTAL_BACKGROUND) && z4)) ? kro0.f18776a : ((ot0Var3 == ot0Var6 && z7) || (ot0Var3 == ot0Var2 && z7)) ? dqo0.f6527a : new uqo0(d4d.BACKGROUND);
                            }
                        }
                        murVar = new mur(strA, uqo0Var);
                    }
                    d4d d4dVar2 = d4d.PRIMARY;
                    uqo0Var = new lro0();
                    murVar = new mur(strA, uqo0Var);
                }
                arrayList2.add(new st0(j, str, str2, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                it2 = it;
                zBooleanValue2 = z5;
                list2 = list4;
            }
            Iterator it4 = it2;
            if (z) {
                i = 10;
            } else {
                i = 10;
                if (list3.size() < 10) {
                    z2 = false;
                }
                zll zllVar = new zll(x4d0.g0(ot0Var3), new wll(o0s.f24443a), arrayList2);
                String str3 = j8bVar.b;
                if (z2) {
                    ue9Var = new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
                } else {
                    ue9Var = null;
                }
                arrayList.add(new gn1(zllVar, z, zBooleanValue, new hjm(str3, null, null, null, null, null, false, null, null, false, ue9Var, null, 7166), j8bVar));
                it2 = it4;
            }
            z2 = true;
            zll zllVar2 = new zll(x4d0.g0(ot0Var3), new wll(o0s.f24443a), arrayList2);
            String str4 = j8bVar.b;
            if (z2) {
                ue9Var = new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
            } else {
                ue9Var = null;
            }
            arrayList.add(new gn1(zllVar2, z, zBooleanValue, new hjm(str4, null, null, null, null, null, false, null, null, false, ue9Var, null, 7166), j8bVar));
            it2 = it4;
        }
        return dyb.o0(arrayList);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        bo1 bo1Var = (bo1) obj;
        bo1Var.getClass();
        n0o0 n0o0Var = this.b;
        fee feeVar = (fee) n0o0Var.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        ((h9h0) feeVar.a().getValue()).getClass();
        h9h0 h9h0Var = bo1Var.b;
        pz40VarA.setValue(h9h0Var);
        fee feeVar2 = (fee) this.c.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((String) feeVar2.a().getValue()).getClass();
        String str = bo1Var.f2910a;
        pz40VarA2.setValue(str);
        fee feeVar3 = (fee) this.d.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((String) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(bo1Var.j);
        fee feeVarB = b();
        feeVarB.getClass();
        pz40 pz40VarA4 = feeVarB.a();
        ((Integer) feeVarB.a().getValue()).getClass();
        pz40VarA4.setValue(Integer.valueOf(bo1Var.p));
        fee feeVar4 = (fee) this.f.getValue();
        feeVar4.getClass();
        pz40 pz40VarA5 = feeVar4.a();
        ((Boolean) feeVar4.a().getValue()).getClass();
        pz40VarA5.setValue(Boolean.valueOf(bo1Var.d));
        fee feeVar5 = (fee) this.g.getValue();
        feeVar5.getClass();
        pz40 pz40VarA6 = feeVar5.a();
        ((ot0) feeVar5.a().getValue()).getClass();
        pz40VarA6.setValue(bo1Var.h);
        fee feeVar6 = (fee) this.h.getValue();
        feeVar6.getClass();
        pz40 pz40VarA7 = feeVar6.a();
        ((Boolean) feeVar6.a().getValue()).getClass();
        pz40VarA7.setValue(Boolean.valueOf(bo1Var.k));
        fee feeVar7 = (fee) this.i.getValue();
        feeVar7.getClass();
        pz40 pz40VarA8 = feeVar7.a();
        ((List) feeVar7.a().getValue()).getClass();
        pz40VarA8.setValue(bo1Var.e);
        n0o0 n0o0Var2 = this.l;
        fee feeVar8 = (fee) n0o0Var2.getValue();
        feeVar8.getClass();
        pz40 pz40VarA9 = feeVar8.a();
        ((String) feeVar8.a().getValue()).getClass();
        pz40VarA9.setValue(str);
        n0o0 n0o0Var3 = this.n;
        fee feeVar9 = (fee) n0o0Var3.getValue();
        feeVar9.getClass();
        pz40 pz40VarA10 = feeVar9.a();
        ((h9h0) feeVar9.a().getValue()).getClass();
        pz40VarA10.setValue(h9h0Var);
        n0o0 n0o0Var4 = this.m;
        fee feeVar10 = (fee) n0o0Var4.getValue();
        feeVar10.getClass();
        pz40 pz40VarA11 = feeVar10.a();
        ((h9h0) feeVar10.a().getValue()).getClass();
        pz40VarA11.setValue(h9h0Var);
        imm immVar = (imm) ((fee) n0o0Var2.getValue()).b();
        h9h0 h9h0Var2 = (h9h0) ((fee) n0o0Var.getValue()).c();
        if (Intrinsics.d(h9h0Var2, r8h0.f30026a)) {
            return new eo1(immVar, (a4x) ((fee) n0o0Var3.getValue()).b());
        }
        if (Intrinsics.d(h9h0Var2, l8h0.f19604a)) {
            mdm mdmVar = (mdm) ((fee) n0o0Var4.getValue()).b();
            if (mdmVar == null) {
                int iIntValue = ((Number) b().c()).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                mdmVar = new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            }
            return new do1(mdmVar, immVar);
        }
        if (!Intrinsics.d(h9h0Var2, h8h0.f12625a)) {
            if ((h9h0Var2 instanceof f8h0) || (h9h0Var2 instanceof j8h0) || (h9h0Var2 instanceof c9h0)) {
                return new co1(immVar, (a4x) ((fee) n0o0Var3.getValue()).b());
            }
            t9f.b();
            return null;
        }
        mdm mdmVar2 = (mdm) ((fee) n0o0Var4.getValue()).b();
        if (mdmVar2 == null) {
            int iIntValue2 = ((Number) b().c()).intValue();
            xuz xuzVar2 = pb10.c;
            pb10 pb10Var2 = pb10.g;
            xuzVar2.getClass();
            mdmVar2 = new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.statistic_empty_data, 0, 0, 0L, 0L, 990);
        }
        return new do1(mdmVar2, immVar);
    }
}
