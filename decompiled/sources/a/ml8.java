package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ml8 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f21976a;
    public final ocl b;
    public final long c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final gjl g;
    public final zfi0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final mdm k;
    public final long l;

    public ml8(ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.f21976a = ctf0Var;
        this.b = oclVar;
        pz40 pz40Var = s6t0.f31722a;
        this.c = s6t0.b().f33626a.getBackground();
        u3t u3tVar = u3t.f35014a;
        final byte b = 0;
        this.d = maz.b(new yw9(new lwq0(u3tVar), new Function1(this) { // from class: a.ll8
            public final /* synthetic */ ml8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v25, types: [a.lc00] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i;
                int i2;
                ?? arrayList;
                byte b2 = b;
                int i3 = 1;
                ml8 ml8Var = this.b;
                switch (b2) {
                    case 0:
                        lwq0 lwq0Var = (lwq0) obj;
                        lwq0Var.getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ml8Var.f21976a.b.a(R.string.bonuses_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), !(lwq0Var.f20777a instanceof u3t), null);
                    case 1:
                        rl5 rl5Var = (rl5) obj;
                        rl5Var.getClass();
                        ql5 ql5Var = rl5Var.f30680a;
                        double d = ql5Var.b;
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = ql5Var.f;
                        String strA = ql5Var.j;
                        ctf0 ctf0Var2 = ml8Var.f21976a;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (rl5Var.b == kg.SECONDARY) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new jjl(strC, str, strA2, strA);
                    case 2:
                        ctf0 ctf0Var3 = ml8Var.f21976a;
                        mcc mccVar = (mcc) obj;
                        mccVar.getClass();
                        Throwable th = null;
                        if (mccVar.f21544a) {
                            zcl zclVar = qmk.f28987a;
                            float f = xfn.b(ctf0Var3.j()).e;
                            return new gyl(null, new lh80(f, 8.0f, f, 8.0f), 1);
                        }
                        lh80 lh80VarT = s5x0.t(xfn.b(ctf0Var3.j()).e, 0.0f, 2);
                        List list = mccVar.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((je8) obj2) != je8.WILD_FREE_BET || mccVar.d) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        int i4 = 0;
                        for (Object obj3 : arrayList2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th2 = th;
                                q3d.p();
                                throw th2;
                            }
                            je8 je8Var = (je8) obj3;
                            long j = i4;
                            int iOrdinal = je8Var.ordinal();
                            if (iOrdinal != 0) {
                                i = i3;
                                if (iOrdinal == i3) {
                                    i2 = R.string.promo_filter_free_bet;
                                } else if (iOrdinal == 2) {
                                    i2 = R.string.promo_filter_raise_bet;
                                } else if (iOrdinal == 3) {
                                    i2 = R.string.promo_filter_back_bet;
                                } else {
                                    if (iOrdinal != 4) {
                                        t9f.b();
                                        return th;
                                    }
                                    i2 = R.string.promo_filter_wild_free_bet;
                                }
                            } else {
                                i = i3;
                                i2 = R.string.filter_all;
                            }
                            Throwable th3 = th;
                            arrayList3.add(new lxl(j, (dyl) new xxl(ctf0Var3.b.a(i2, Arrays.copyOf(new Object[0], 0))), false, je8Var == mccVar.c ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            th = th3;
                            i4 = i5;
                            i3 = i;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, lh80VarT, null, 22);
                    default:
                        ctf0 ctf0Var4 = ml8Var.f21976a;
                        vaj vajVar = (vaj) obj;
                        vajVar.getClass();
                        boolean z = vajVar.f37090a;
                        List list2 = vajVar.b;
                        w3t w3tVar = vajVar.d;
                        if (z) {
                            arrayList = new ArrayList(6);
                            for (int i6 = 0; i6 < 6; i6++) {
                                arrayList.add(w3tVar instanceof u3t ? new fh8(kan.f17973a, csr.e) : new gh8(han.f12731a, csr.e));
                            }
                        } else if (list2.isEmpty()) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (!(w3tVar instanceof u3t) && !vajVar.e) {
                                i3 = 0;
                            }
                            lc00VarB.add(new dh8(ocl.b(ml8Var.b, pb10.h, null, 0, i3 != 0 ? R.string.one_x_bonuses_empty_bonus_title : R.string.one_x_bonuses_bonus_not_allowed_title, i3 != 0 ? R.string.bonuses_game_placeholder : R.string.bonuses_not_allowed_game_placeholder_description, 0, 0L, 0L, 974)));
                            List list3 = vajVar.c;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(ntr.u0((qf8) it.next(), w3tVar, ctf0Var4));
                            }
                            lc00VarB.addAll(arrayList4);
                            arrayList = kotlin.collections.a.a(lc00VarB);
                        } else {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(ntr.u0((tf8) it2.next(), w3tVar, ctf0Var4));
                            }
                        }
                        return dyb.o0(arrayList);
                }
            }
        }, (byte) 20));
        kg kgVar = kg.PRIMARY;
        this.e = maz.b(new yw9(kgVar, new nk7((byte) 20), (byte) 20));
        final byte b2 = 1;
        this.f = maz.b(new yw9(new rl5(new ql5(-1L, 0.0d, false, false, 0L, "", "", 0, txs0.d, "", "", false, ""), kgVar), new Function1(this) { // from class: a.ll8
            public final /* synthetic */ ml8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v25, types: [a.lc00] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i;
                int i2;
                ?? arrayList;
                byte b3 = b2;
                int i3 = 1;
                ml8 ml8Var = this.b;
                switch (b3) {
                    case 0:
                        lwq0 lwq0Var = (lwq0) obj;
                        lwq0Var.getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ml8Var.f21976a.b.a(R.string.bonuses_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), !(lwq0Var.f20777a instanceof u3t), null);
                    case 1:
                        rl5 rl5Var = (rl5) obj;
                        rl5Var.getClass();
                        ql5 ql5Var = rl5Var.f30680a;
                        double d = ql5Var.b;
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = ql5Var.f;
                        String strA = ql5Var.j;
                        ctf0 ctf0Var2 = ml8Var.f21976a;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (rl5Var.b == kg.SECONDARY) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new jjl(strC, str, strA2, strA);
                    case 2:
                        ctf0 ctf0Var3 = ml8Var.f21976a;
                        mcc mccVar = (mcc) obj;
                        mccVar.getClass();
                        Throwable th = null;
                        if (mccVar.f21544a) {
                            zcl zclVar = qmk.f28987a;
                            float f = xfn.b(ctf0Var3.j()).e;
                            return new gyl(null, new lh80(f, 8.0f, f, 8.0f), 1);
                        }
                        lh80 lh80VarT = s5x0.t(xfn.b(ctf0Var3.j()).e, 0.0f, 2);
                        List list = mccVar.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((je8) obj2) != je8.WILD_FREE_BET || mccVar.d) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        int i4 = 0;
                        for (Object obj3 : arrayList2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th2 = th;
                                q3d.p();
                                throw th2;
                            }
                            je8 je8Var = (je8) obj3;
                            long j = i4;
                            int iOrdinal = je8Var.ordinal();
                            if (iOrdinal != 0) {
                                i = i3;
                                if (iOrdinal == i3) {
                                    i2 = R.string.promo_filter_free_bet;
                                } else if (iOrdinal == 2) {
                                    i2 = R.string.promo_filter_raise_bet;
                                } else if (iOrdinal == 3) {
                                    i2 = R.string.promo_filter_back_bet;
                                } else {
                                    if (iOrdinal != 4) {
                                        t9f.b();
                                        return th;
                                    }
                                    i2 = R.string.promo_filter_wild_free_bet;
                                }
                            } else {
                                i = i3;
                                i2 = R.string.filter_all;
                            }
                            Throwable th3 = th;
                            arrayList3.add(new lxl(j, (dyl) new xxl(ctf0Var3.b.a(i2, Arrays.copyOf(new Object[0], 0))), false, je8Var == mccVar.c ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            th = th3;
                            i4 = i5;
                            i3 = i;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, lh80VarT, null, 22);
                    default:
                        ctf0 ctf0Var4 = ml8Var.f21976a;
                        vaj vajVar = (vaj) obj;
                        vajVar.getClass();
                        boolean z = vajVar.f37090a;
                        List list2 = vajVar.b;
                        w3t w3tVar = vajVar.d;
                        if (z) {
                            arrayList = new ArrayList(6);
                            for (int i6 = 0; i6 < 6; i6++) {
                                arrayList.add(w3tVar instanceof u3t ? new fh8(kan.f17973a, csr.e) : new gh8(han.f12731a, csr.e));
                            }
                        } else if (list2.isEmpty()) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (!(w3tVar instanceof u3t) && !vajVar.e) {
                                i3 = 0;
                            }
                            lc00VarB.add(new dh8(ocl.b(ml8Var.b, pb10.h, null, 0, i3 != 0 ? R.string.one_x_bonuses_empty_bonus_title : R.string.one_x_bonuses_bonus_not_allowed_title, i3 != 0 ? R.string.bonuses_game_placeholder : R.string.bonuses_not_allowed_game_placeholder_description, 0, 0L, 0L, 974)));
                            List list3 = vajVar.c;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(ntr.u0((qf8) it.next(), w3tVar, ctf0Var4));
                            }
                            lc00VarB.addAll(arrayList4);
                            arrayList = kotlin.collections.a.a(lc00VarB);
                        } else {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(ntr.u0((tf8) it2.next(), w3tVar, ctf0Var4));
                            }
                        }
                        return dyb.o0(arrayList);
                }
            }
        }, (byte) 20));
        this.g = gjl.f11403a;
        this.h = zfi0.f44303a;
        iun iunVar = iun.f15405a;
        final byte b3 = 2;
        this.i = maz.b(new yw9(new mcc(true, iunVar, je8.ALL, false), new Function1(this) { // from class: a.ll8
            public final /* synthetic */ ml8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v25, types: [a.lc00] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i;
                int i2;
                ?? arrayList;
                byte b4 = b3;
                int i3 = 1;
                ml8 ml8Var = this.b;
                switch (b4) {
                    case 0:
                        lwq0 lwq0Var = (lwq0) obj;
                        lwq0Var.getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ml8Var.f21976a.b.a(R.string.bonuses_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), !(lwq0Var.f20777a instanceof u3t), null);
                    case 1:
                        rl5 rl5Var = (rl5) obj;
                        rl5Var.getClass();
                        ql5 ql5Var = rl5Var.f30680a;
                        double d = ql5Var.b;
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = ql5Var.f;
                        String strA = ql5Var.j;
                        ctf0 ctf0Var2 = ml8Var.f21976a;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (rl5Var.b == kg.SECONDARY) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new jjl(strC, str, strA2, strA);
                    case 2:
                        ctf0 ctf0Var3 = ml8Var.f21976a;
                        mcc mccVar = (mcc) obj;
                        mccVar.getClass();
                        Throwable th = null;
                        if (mccVar.f21544a) {
                            zcl zclVar = qmk.f28987a;
                            float f = xfn.b(ctf0Var3.j()).e;
                            return new gyl(null, new lh80(f, 8.0f, f, 8.0f), 1);
                        }
                        lh80 lh80VarT = s5x0.t(xfn.b(ctf0Var3.j()).e, 0.0f, 2);
                        List list = mccVar.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((je8) obj2) != je8.WILD_FREE_BET || mccVar.d) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        int i4 = 0;
                        for (Object obj3 : arrayList2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th2 = th;
                                q3d.p();
                                throw th2;
                            }
                            je8 je8Var = (je8) obj3;
                            long j = i4;
                            int iOrdinal = je8Var.ordinal();
                            if (iOrdinal != 0) {
                                i = i3;
                                if (iOrdinal == i3) {
                                    i2 = R.string.promo_filter_free_bet;
                                } else if (iOrdinal == 2) {
                                    i2 = R.string.promo_filter_raise_bet;
                                } else if (iOrdinal == 3) {
                                    i2 = R.string.promo_filter_back_bet;
                                } else {
                                    if (iOrdinal != 4) {
                                        t9f.b();
                                        return th;
                                    }
                                    i2 = R.string.promo_filter_wild_free_bet;
                                }
                            } else {
                                i = i3;
                                i2 = R.string.filter_all;
                            }
                            Throwable th3 = th;
                            arrayList3.add(new lxl(j, (dyl) new xxl(ctf0Var3.b.a(i2, Arrays.copyOf(new Object[0], 0))), false, je8Var == mccVar.c ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            th = th3;
                            i4 = i5;
                            i3 = i;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, lh80VarT, null, 22);
                    default:
                        ctf0 ctf0Var4 = ml8Var.f21976a;
                        vaj vajVar = (vaj) obj;
                        vajVar.getClass();
                        boolean z = vajVar.f37090a;
                        List list2 = vajVar.b;
                        w3t w3tVar = vajVar.d;
                        if (z) {
                            arrayList = new ArrayList(6);
                            for (int i6 = 0; i6 < 6; i6++) {
                                arrayList.add(w3tVar instanceof u3t ? new fh8(kan.f17973a, csr.e) : new gh8(han.f12731a, csr.e));
                            }
                        } else if (list2.isEmpty()) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (!(w3tVar instanceof u3t) && !vajVar.e) {
                                i3 = 0;
                            }
                            lc00VarB.add(new dh8(ocl.b(ml8Var.b, pb10.h, null, 0, i3 != 0 ? R.string.one_x_bonuses_empty_bonus_title : R.string.one_x_bonuses_bonus_not_allowed_title, i3 != 0 ? R.string.bonuses_game_placeholder : R.string.bonuses_not_allowed_game_placeholder_description, 0, 0L, 0L, 974)));
                            List list3 = vajVar.c;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(ntr.u0((qf8) it.next(), w3tVar, ctf0Var4));
                            }
                            lc00VarB.addAll(arrayList4);
                            arrayList = kotlin.collections.a.a(lc00VarB);
                        } else {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(ntr.u0((tf8) it2.next(), w3tVar, ctf0Var4));
                            }
                        }
                        return dyb.o0(arrayList);
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.j = maz.b(new yw9(new vaj(true, iunVar, iunVar, u3tVar, false, false), new Function1(this) { // from class: a.ll8
            public final /* synthetic */ ml8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v25, types: [a.lc00] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i;
                int i2;
                ?? arrayList;
                byte b5 = b4;
                int i3 = 1;
                ml8 ml8Var = this.b;
                switch (b5) {
                    case 0:
                        lwq0 lwq0Var = (lwq0) obj;
                        lwq0Var.getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ml8Var.f21976a.b.a(R.string.bonuses_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), !(lwq0Var.f20777a instanceof u3t), null);
                    case 1:
                        rl5 rl5Var = (rl5) obj;
                        rl5Var.getClass();
                        ql5 ql5Var = rl5Var.f30680a;
                        double d = ql5Var.b;
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = ql5Var.f;
                        String strA = ql5Var.j;
                        ctf0 ctf0Var2 = ml8Var.f21976a;
                        String strA2 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (rl5Var.b == kg.SECONDARY) {
                            strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                        } else if (strA.length() <= 0) {
                            strA = ql5Var.k;
                        }
                        return new jjl(strC, str, strA2, strA);
                    case 2:
                        ctf0 ctf0Var3 = ml8Var.f21976a;
                        mcc mccVar = (mcc) obj;
                        mccVar.getClass();
                        Throwable th = null;
                        if (mccVar.f21544a) {
                            zcl zclVar = qmk.f28987a;
                            float f = xfn.b(ctf0Var3.j()).e;
                            return new gyl(null, new lh80(f, 8.0f, f, 8.0f), 1);
                        }
                        lh80 lh80VarT = s5x0.t(xfn.b(ctf0Var3.j()).e, 0.0f, 2);
                        List list = mccVar.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (((je8) obj2) != je8.WILD_FREE_BET || mccVar.d) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        int i4 = 0;
                        for (Object obj3 : arrayList2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th2 = th;
                                q3d.p();
                                throw th2;
                            }
                            je8 je8Var = (je8) obj3;
                            long j = i4;
                            int iOrdinal = je8Var.ordinal();
                            if (iOrdinal != 0) {
                                i = i3;
                                if (iOrdinal == i3) {
                                    i2 = R.string.promo_filter_free_bet;
                                } else if (iOrdinal == 2) {
                                    i2 = R.string.promo_filter_raise_bet;
                                } else if (iOrdinal == 3) {
                                    i2 = R.string.promo_filter_back_bet;
                                } else {
                                    if (iOrdinal != 4) {
                                        t9f.b();
                                        return th;
                                    }
                                    i2 = R.string.promo_filter_wild_free_bet;
                                }
                            } else {
                                i = i3;
                                i2 = R.string.filter_all;
                            }
                            Throwable th3 = th;
                            arrayList3.add(new lxl(j, (dyl) new xxl(ctf0Var3.b.a(i2, Arrays.copyOf(new Object[0], 0))), false, je8Var == mccVar.c ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            th = th3;
                            i4 = i5;
                            i3 = i;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, lh80VarT, null, 22);
                    default:
                        ctf0 ctf0Var4 = ml8Var.f21976a;
                        vaj vajVar = (vaj) obj;
                        vajVar.getClass();
                        boolean z = vajVar.f37090a;
                        List list2 = vajVar.b;
                        w3t w3tVar = vajVar.d;
                        if (z) {
                            arrayList = new ArrayList(6);
                            for (int i6 = 0; i6 < 6; i6++) {
                                arrayList.add(w3tVar instanceof u3t ? new fh8(kan.f17973a, csr.e) : new gh8(han.f12731a, csr.e));
                            }
                        } else if (list2.isEmpty()) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (!(w3tVar instanceof u3t) && !vajVar.e) {
                                i3 = 0;
                            }
                            lc00VarB.add(new dh8(ocl.b(ml8Var.b, pb10.h, null, 0, i3 != 0 ? R.string.one_x_bonuses_empty_bonus_title : R.string.one_x_bonuses_bonus_not_allowed_title, i3 != 0 ? R.string.bonuses_game_placeholder : R.string.bonuses_not_allowed_game_placeholder_description, 0, 0L, 0L, 974)));
                            List list3 = vajVar.c;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(ntr.u0((qf8) it.next(), w3tVar, ctf0Var4));
                            }
                            lc00VarB.addAll(arrayList4);
                            arrayList = kotlin.collections.a.a(lc00VarB);
                        } else {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(ntr.u0((tf8) it2.next(), w3tVar, ctf0Var4));
                            }
                        }
                        return dyb.o0(arrayList);
                }
            }
        }, (byte) 20));
        this.k = ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        this.l = s6t0.b().f33626a.getBackgroundContent();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        kl8 kl8Var = (kl8) obj;
        kl8Var.getClass();
        n0o0 n0o0Var = this.d;
        fee feeVar = (fee) n0o0Var.getValue();
        kg kgVar = kl8Var.n;
        boolean z = kl8Var.f;
        w3t w3tVar = kl8Var.c;
        feeVar.d(new lwq0(w3tVar));
        n0o0 n0o0Var2 = this.j;
        ((fee) n0o0Var2.getValue()).d(new vaj(kl8Var.f, kl8Var.i, kl8Var.k, w3tVar, kl8Var.j, kl8Var.p));
        boolean z2 = w3tVar instanceof u3t;
        n0o0 n0o0Var3 = this.i;
        n0o0 n0o0Var4 = this.f;
        n0o0 n0o0Var5 = this.e;
        if (z2) {
            ((fee) n0o0Var5.getValue()).d(kgVar);
            ((fee) n0o0Var4.getValue()).d(new rl5(kl8Var.l, kgVar));
            ((fee) n0o0Var3.getValue()).d(new mcc(z, kl8Var.h, kl8Var.d, kl8Var.p));
        }
        if (kl8Var.o && !z) {
            return new ul8(this.c, (imm) ((fee) n0o0Var.getValue()).b(), z2, (ijl) ((fee) n0o0Var5.getValue()).b(), (jjl) ((fee) n0o0Var4.getValue()).b(), this.g, this.h, this.l, z2, this.k);
        }
        return new tl8(this.c, (imm) ((fee) n0o0Var.getValue()).b(), z2, (ijl) ((fee) n0o0Var5.getValue()).b(), (jjl) ((fee) n0o0Var4.getValue()).b(), this.g, this.h, this.l, z2, kl8Var.g, (hyl) ((fee) n0o0Var3.getValue()).b(), z2, !z, (a4x) ((fee) n0o0Var2.getValue()).b());
    }
}
