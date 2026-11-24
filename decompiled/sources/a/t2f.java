package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t2f implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33212a = 1;
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

    public t2f(l2f l2fVar, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        String str = l2fVar.f19304a;
        this.c = bkb.H(str);
        this.d = bkb.H(Boolean.valueOf(l2fVar.b));
        boolean z = l2fVar.c;
        this.e = bkb.H(Boolean.valueOf(z));
        boolean z2 = l2fVar.d;
        this.f = bkb.H(Boolean.valueOf(z2));
        String str2 = l2fVar.e;
        this.g = bkb.H(str2);
        n0o0 n0o0VarH = bkb.H(l2fVar.f);
        this.h = n0o0VarH;
        this.i = bkb.H(Integer.valueOf(l2fVar.g));
        n0o0 n0o0VarH2 = bkb.H(l2fVar.h);
        this.j = n0o0VarH2;
        this.k = maz.b(new yw9(str, new vzd((byte) 19), (byte) 20));
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new vzd((byte) 20));
        this.m = bkb.G(((fee) n0o0VarH2.getValue()).d, new vzd((byte) 21));
        final byte b2 = 1;
        n0o0 n0o0VarH3 = bkb.H(new r2f(z, z2, str.length() > 0));
        this.n = n0o0VarH3;
        this.o = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.q2f
            public final /* synthetic */ t2f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                t2f t2fVar = this.b;
                switch (b3) {
                    case 0:
                        r2f r2fVar = (r2f) obj;
                        r2fVar.getClass();
                        boolean z3 = r2fVar.f29730a;
                        boolean z4 = r2fVar.b;
                        boolean z5 = r2fVar.c;
                        ctf0 ctf0Var2 = t2fVar.b;
                        String strA = ctf0Var2.b.a(R.string.scan, Arrays.copyOf(new Object[0], 0));
                        String strA2 = ctf0Var2.b.a(R.string.check, Arrays.copyOf(new Object[0], 0));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        itl itlVar = new itl(new wul(nulVar, oe9Var, new ue9(strA), true, false, true), rk.t);
                        itl itlVar2 = new itl(new wul(lul.e, oe9Var, new ue9(strA2), z5, false, true), rk.s);
                        return (!z3 || z4) ? new mtl(dyb.g0(itlVar2)) : new mtl(dyb.g0(itlVar, itlVar2));
                    case 1:
                        s2f s2fVar = (s2f) obj;
                        s2fVar.getClass();
                        String str3 = s2fVar.f31498a;
                        String str4 = s2fVar.b;
                        return new c6q0(str3, e6q0.f7299a, o6q0.f24750a, new s7q0(str4 == null ? "" : str4), true, str4 != null, new y5q0(3, null, null, 6), t2fVar.b.b.a(R.string.coupon_number_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, "0123456789-", 244992);
                    default:
                        ((Unit) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(t2fVar.b.b.a(R.string.scanner, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                }
            }
        });
        n0o0 n0o0VarH4 = bkb.H(new s2f(str, str2));
        this.p = n0o0VarH4;
        this.q = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.q2f
            public final /* synthetic */ t2f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                t2f t2fVar = this.b;
                switch (b3) {
                    case 0:
                        r2f r2fVar = (r2f) obj;
                        r2fVar.getClass();
                        boolean z3 = r2fVar.f29730a;
                        boolean z4 = r2fVar.b;
                        boolean z5 = r2fVar.c;
                        ctf0 ctf0Var2 = t2fVar.b;
                        String strA = ctf0Var2.b.a(R.string.scan, Arrays.copyOf(new Object[0], 0));
                        String strA2 = ctf0Var2.b.a(R.string.check, Arrays.copyOf(new Object[0], 0));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        itl itlVar = new itl(new wul(nulVar, oe9Var, new ue9(strA), true, false, true), rk.t);
                        itl itlVar2 = new itl(new wul(lul.e, oe9Var, new ue9(strA2), z5, false, true), rk.s);
                        return (!z3 || z4) ? new mtl(dyb.g0(itlVar2)) : new mtl(dyb.g0(itlVar, itlVar2));
                    case 1:
                        s2f s2fVar = (s2f) obj;
                        s2fVar.getClass();
                        String str3 = s2fVar.f31498a;
                        String str4 = s2fVar.b;
                        return new c6q0(str3, e6q0.f7299a, o6q0.f24750a, new s7q0(str4 == null ? "" : str4), true, str4 != null, new y5q0(3, null, null, 6), t2fVar.b.b.a(R.string.coupon_number_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, "0123456789-", 244992);
                    default:
                        ((Unit) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(t2fVar.b.b.a(R.string.scanner, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                }
            }
        });
        final byte b3 = 2;
        this.r = maz.b(new yw9(Unit.f46060a, new Function1(this) { // from class: a.q2f
            public final /* synthetic */ t2f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                t2f t2fVar = this.b;
                switch (b4) {
                    case 0:
                        r2f r2fVar = (r2f) obj;
                        r2fVar.getClass();
                        boolean z3 = r2fVar.f29730a;
                        boolean z4 = r2fVar.b;
                        boolean z5 = r2fVar.c;
                        ctf0 ctf0Var2 = t2fVar.b;
                        String strA = ctf0Var2.b.a(R.string.scan, Arrays.copyOf(new Object[0], 0));
                        String strA2 = ctf0Var2.b.a(R.string.check, Arrays.copyOf(new Object[0], 0));
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.f25112a;
                        itl itlVar = new itl(new wul(nulVar, oe9Var, new ue9(strA), true, false, true), rk.t);
                        itl itlVar2 = new itl(new wul(lul.e, oe9Var, new ue9(strA2), z5, false, true), rk.s);
                        return (!z3 || z4) ? new mtl(dyb.g0(itlVar2)) : new mtl(dyb.g0(itlVar, itlVar2));
                    case 1:
                        s2f s2fVar = (s2f) obj;
                        s2fVar.getClass();
                        String str3 = s2fVar.f31498a;
                        String str4 = s2fVar.b;
                        return new c6q0(str3, e6q0.f7299a, o6q0.f24750a, new s7q0(str4 == null ? "" : str4), true, str4 != null, new y5q0(3, null, null, 6), t2fVar.b.b.a(R.string.coupon_number_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, "0123456789-", 244992);
                    default:
                        ((Unit) obj).getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(t2fVar.b.b.a(R.string.scanner, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                }
            }
        }, (byte) 20));
    }

    public fee a() {
        return (fee) this.m.getValue();
    }

    public fee b() {
        return (fee) this.e.getValue();
    }

    public fee c() {
        return (fee) this.l.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        d4p b4pVar;
        imm immVar;
        byte b = this.f33212a;
        n0o0 n0o0Var = this.k;
        n0o0 n0o0Var2 = this.g;
        n0o0 n0o0Var3 = this.i;
        n0o0 n0o0Var4 = this.h;
        n0o0 n0o0Var5 = this.o;
        n0o0 n0o0Var6 = this.j;
        n0o0 n0o0Var7 = this.n;
        n0o0 n0o0Var8 = this.p;
        n0o0 n0o0Var9 = this.r;
        n0o0 n0o0Var10 = this.q;
        n0o0 n0o0Var11 = this.f;
        n0o0 n0o0Var12 = this.c;
        switch (b) {
            case 0:
                l2f l2fVar = (l2f) obj;
                l2fVar.getClass();
                fee feeVar = (fee) n0o0Var12.getValue();
                String str = l2fVar.f19304a;
                feeVar.d(str);
                n0o0 n0o0Var13 = this.e;
                fee feeVar2 = (fee) n0o0Var13.getValue();
                boolean z = l2fVar.c;
                feeVar2.d(Boolean.valueOf(z));
                n0o0 n0o0Var14 = this.d;
                ((fee) n0o0Var14.getValue()).d(Boolean.valueOf(l2fVar.b));
                fee feeVar3 = (fee) n0o0Var2.getValue();
                String str2 = l2fVar.e;
                feeVar3.d(str2);
                fee feeVar4 = (fee) n0o0Var11.getValue();
                boolean z2 = l2fVar.d;
                feeVar4.d(Boolean.valueOf(z2));
                ((fee) n0o0Var3.getValue()).d(Integer.valueOf(l2fVar.g));
                ((fee) n0o0Var4.getValue()).d(l2fVar.f);
                ((fee) n0o0Var6.getValue()).d(l2fVar.h);
                ((fee) n0o0Var.getValue()).d(str);
                ((fee) n0o0Var7.getValue()).d(new r2f(z, z2, str.length() > 0));
                ((fee) n0o0Var8.getValue()).d(new s2f(str, str2));
                return new p2f((String) ((fee) n0o0Var12.getValue()).c(), ((Boolean) ((fee) n0o0Var.getValue()).b()).booleanValue(), ((Boolean) ((fee) n0o0Var13.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var14.getValue()).c()).booleanValue(), (String) ((fee) n0o0Var2.getValue()).c(), (List) ((fee) this.l.getValue()).b(), ((Number) ((fee) n0o0Var3.getValue()).c()).intValue(), (dxh0) ((fee) this.m.getValue()).b(), (mtl) ((fee) n0o0Var5.getValue()).b(), (c6q0) ((fee) n0o0Var10.getValue()).b(), (imm) ((fee) n0o0Var9.getValue()).b());
            default:
                x4p x4pVar = (x4p) obj;
                x4pVar.getClass();
                fee feeVar5 = (fee) n0o0Var12.getValue();
                feeVar5.getClass();
                pz40 pz40VarA = feeVar5.a();
                pz40VarA.setValue(x4pVar.e);
                fee feeVarB = b();
                feeVarB.getClass();
                pz40 pz40VarA2 = feeVarB.a();
                ((List) feeVarB.a().getValue()).getClass();
                pz40VarA2.setValue(x4pVar.g);
                fee feeVar6 = (fee) n0o0Var11.getValue();
                feeVar6.getClass();
                pz40 pz40VarA3 = feeVar6.a();
                ((Boolean) feeVar6.a().getValue()).getClass();
                pz40VarA3.setValue(Boolean.valueOf(x4pVar.h));
                fee feeVar7 = (fee) n0o0Var10.getValue();
                feeVar7.getClass();
                pz40 pz40VarA4 = feeVar7.a();
                ((List) feeVar7.a().getValue()).getClass();
                List list = x4pVar.b;
                pz40VarA4.setValue(list);
                fee feeVar8 = (fee) n0o0Var9.getValue();
                feeVar8.getClass();
                pz40 pz40VarA5 = feeVar8.a();
                ((List) feeVar8.a().getValue()).getClass();
                pz40VarA5.setValue(list);
                fee feeVar9 = (fee) n0o0Var8.getValue();
                feeVar9.getClass();
                pz40 pz40VarA6 = feeVar9.a();
                ((List) feeVar9.a().getValue()).getClass();
                pz40VarA6.setValue(x4pVar.c);
                fee feeVar10 = (fee) n0o0Var7.getValue();
                feeVar10.getClass();
                pz40 pz40VarA7 = feeVar10.a();
                ((String) feeVar10.a().getValue()).getClass();
                pz40VarA7.setValue(x4pVar.f40278a);
                fee feeVar11 = (fee) n0o0Var6.getValue();
                feeVar11.getClass();
                pz40 pz40VarA8 = feeVar11.a();
                ((Boolean) feeVar11.a().getValue()).getClass();
                boolean z3 = x4pVar.k;
                pz40VarA8.setValue(Boolean.valueOf(z3));
                fee feeVar12 = (fee) n0o0Var5.getValue();
                feeVar12.getClass();
                pz40 pz40VarA9 = feeVar12.a();
                ((f4p) feeVar12.a().getValue()).getClass();
                pz40VarA9.setValue(x4pVar.d);
                fee feeVar13 = (fee) n0o0Var4.getValue();
                feeVar13.getClass();
                pz40 pz40VarA10 = feeVar13.a();
                ((Boolean) feeVar13.a().getValue()).getClass();
                pz40VarA10.setValue(Boolean.valueOf(x4pVar.i));
                fee feeVar14 = (fee) n0o0Var3.getValue();
                feeVar14.getClass();
                pz40 pz40VarA11 = feeVar14.a();
                ((Boolean) feeVar14.a().getValue()).getClass();
                pz40VarA11.setValue(Boolean.valueOf(x4pVar.j));
                fee feeVar15 = (fee) n0o0Var2.getValue();
                feeVar15.getClass();
                pz40 pz40VarA12 = feeVar15.a();
                ((v5l0) feeVar15.a().getValue()).getClass();
                pz40VarA12.setValue(x4pVar.l);
                fee feeVar16 = (fee) n0o0Var.getValue();
                feeVar16.getClass();
                pz40 pz40VarA13 = feeVar16.a();
                ((Boolean) feeVar16.a().getValue()).getClass();
                pz40VarA13.setValue(Boolean.valueOf(x4pVar.m));
                fee feeVarC = c();
                feeVarC.getClass();
                pz40 pz40VarA14 = feeVarC.a();
                ((Boolean) feeVarC.a().getValue()).getClass();
                pz40VarA14.setValue(Boolean.valueOf(x4pVar.n));
                mdm mdmVar = (mdm) ((fee) n0o0Var5.getValue()).b();
                ArrayList arrayListQ0 = CollectionsKt.q0((Collection) ((fee) n0o0Var9.getValue()).b(), (Iterable) ((fee) n0o0Var10.getValue()).b());
                if (((fee) n0o0Var5.getValue()).c() != f4p.f8926a && mdmVar != null) {
                    b4pVar = new a4p(mdmVar);
                } else if (!arrayListQ0.isEmpty()) {
                    b4pVar = new z3p(dyb.r0(arrayListQ0));
                } else if (((Collection) ((fee) n0o0Var8.getValue()).c()).isEmpty()) {
                    int i = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue() ? 4 : 2;
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(z4p.f43781a);
                    }
                    b4pVar = new b4p(dyb.o0(arrayList));
                } else {
                    b4pVar = new c4p(dyb.r0((Iterable) ((fee) n0o0Var8.getValue()).b()));
                }
                if (z3) {
                    imm immVar2 = (imm) ((fee) n0o0Var7.getValue()).b();
                    nlm nlmVar = new nlm(new hmm(11, (String) null, this.b.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false));
                    llm llmVar = immVar2.f15032a;
                    long j = immVar2.d;
                    boolean z4 = immVar2.e;
                    y3d y3dVar = immVar2.f;
                    llmVar.getClass();
                    immVar = new imm(llmVar, nlmVar, fmm.f9790a, j, z4, y3dVar);
                } else {
                    immVar = (imm) ((fee) n0o0Var7.getValue()).b();
                }
                return new y4p(immVar, ((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue(), b4pVar);
        }
    }

    public t2f(ctf0 ctf0Var, x4p x4pVar, final y78 y78Var, g2v g2vVar) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(x4pVar.e);
        this.d = bkb.H(x4pVar.f);
        this.e = bkb.H(x4pVar.g);
        this.f = bkb.H(Boolean.valueOf(x4pVar.h));
        this.g = bkb.H(x4pVar.l);
        this.h = bkb.H(Boolean.valueOf(x4pVar.i));
        this.i = bkb.H(Boolean.valueOf(x4pVar.j));
        this.j = bkb.H(Boolean.valueOf(x4pVar.k));
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(x4pVar.m));
        this.k = n0o0VarH;
        this.l = bkb.H(Boolean.valueOf(x4pVar.n));
        this.m = bkb.G(((fee) n0o0VarH.getValue()).d, new e4p((byte) 5));
        this.n = maz.b(new yw9(x4pVar.f40278a, new e4p((byte) 6), (byte) 20));
        final byte b2 = 0;
        this.o = maz.b(new yw9(x4pVar.d, new f5p(this, g2vVar, b2), (byte) 20));
        this.p = maz.b(new yw9(x4pVar.c, new Function1(this) { // from class: a.g5p
            public final /* synthetic */ t2f b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02f0  */
            /* JADX WARN: Code duplicated, block: B:101:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:104:0x0305  */
            /* JADX WARN: Code duplicated, block: B:105:0x0308  */
            /* JADX WARN: Code duplicated, block: B:108:0x033f  */
            /* JADX WARN: Code duplicated, block: B:111:0x034e  */
            /* JADX WARN: Code duplicated, block: B:112:0x0350  */
            /* JADX WARN: Code duplicated, block: B:117:0x0375 A[LOOP:9: B:115:0x036f->B:117:0x0375, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:119:0x0387  */
            /* JADX WARN: Code duplicated, block: B:120:0x0390  */
            /* JADX WARN: Code duplicated, block: B:122:0x0396  */
            /* JADX WARN: Code duplicated, block: B:123:0x039b  */
            /* JADX WARN: Code duplicated, block: B:126:0x03b5  */
            /* JADX WARN: Code duplicated, block: B:127:0x03b8  */
            /* JADX WARN: Code duplicated, block: B:129:0x03bc  */
            /* JADX WARN: Code duplicated, block: B:130:0x03bf  */
            /* JADX WARN: Code duplicated, block: B:132:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:133:0x03c6  */
            /* JADX WARN: Code duplicated, block: B:157:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:158:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:161:0x04e4  */
            /* JADX WARN: Code duplicated, block: B:162:0x04e7  */
            /* JADX WARN: Code duplicated, block: B:165:0x051f  */
            /* JADX WARN: Code duplicated, block: B:168:0x052e  */
            /* JADX WARN: Code duplicated, block: B:169:0x0530  */
            /* JADX WARN: Code duplicated, block: B:174:0x0555 A[LOOP:12: B:172:0x054f->B:174:0x0555, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:176:0x0567  */
            /* JADX WARN: Code duplicated, block: B:177:0x0570  */
            /* JADX WARN: Code duplicated, block: B:179:0x0576  */
            /* JADX WARN: Code duplicated, block: B:180:0x057b  */
            /* JADX WARN: Code duplicated, block: B:183:0x0595  */
            /* JADX WARN: Code duplicated, block: B:184:0x0598  */
            /* JADX WARN: Code duplicated, block: B:186:0x059c  */
            /* JADX WARN: Code duplicated, block: B:187:0x059f  */
            /* JADX WARN: Code duplicated, block: B:189:0x05a3  */
            /* JADX WARN: Code duplicated, block: B:190:0x05a6  */
            /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:36:0x0102  */
            /* JADX WARN: Code duplicated, block: B:37:0x0105  */
            /* JADX WARN: Code duplicated, block: B:40:0x013c  */
            /* JADX WARN: Code duplicated, block: B:43:0x014d  */
            /* JADX WARN: Code duplicated, block: B:44:0x0150  */
            /* JADX WARN: Code duplicated, block: B:49:0x0177 A[LOOP:4: B:47:0x0171->B:49:0x0177, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:51:0x0189  */
            /* JADX WARN: Code duplicated, block: B:52:0x018e  */
            /* JADX WARN: Code duplicated, block: B:54:0x0192  */
            /* JADX WARN: Code duplicated, block: B:55:0x0197  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:59:0x01b4  */
            /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:62:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:64:0x01bf  */
            /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v16 java.lang.Object, still in use, count: 2, list:
                  (r9v16 java.lang.Object) from 0x04ba: PHI (r9 I:??) = (r9v2 java.lang.Object), (r9v16 java.lang.Object) binds: [B:154:0x04b8, B:233:0x04ba] A[DONT_GENERATE, DONT_INLINE]
                  (r9v16 java.lang.Object) from 0x04af: CHECK_CAST (a.lok0) (r9v16 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r39) {
                /*
                    Method dump skipped, instruction units count: 1522
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g5p.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        List list = x4pVar.b;
        this.q = maz.b(new yw9(list, new Function1(this) { // from class: a.g5p
            public final /* synthetic */ t2f b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02f0  */
            /* JADX WARN: Code duplicated, block: B:101:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:104:0x0305  */
            /* JADX WARN: Code duplicated, block: B:105:0x0308  */
            /* JADX WARN: Code duplicated, block: B:108:0x033f  */
            /* JADX WARN: Code duplicated, block: B:111:0x034e  */
            /* JADX WARN: Code duplicated, block: B:112:0x0350  */
            /* JADX WARN: Code duplicated, block: B:117:0x0375 A[LOOP:9: B:115:0x036f->B:117:0x0375, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:119:0x0387  */
            /* JADX WARN: Code duplicated, block: B:120:0x0390  */
            /* JADX WARN: Code duplicated, block: B:122:0x0396  */
            /* JADX WARN: Code duplicated, block: B:123:0x039b  */
            /* JADX WARN: Code duplicated, block: B:126:0x03b5  */
            /* JADX WARN: Code duplicated, block: B:127:0x03b8  */
            /* JADX WARN: Code duplicated, block: B:129:0x03bc  */
            /* JADX WARN: Code duplicated, block: B:130:0x03bf  */
            /* JADX WARN: Code duplicated, block: B:132:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:133:0x03c6  */
            /* JADX WARN: Code duplicated, block: B:157:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:158:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:161:0x04e4  */
            /* JADX WARN: Code duplicated, block: B:162:0x04e7  */
            /* JADX WARN: Code duplicated, block: B:165:0x051f  */
            /* JADX WARN: Code duplicated, block: B:168:0x052e  */
            /* JADX WARN: Code duplicated, block: B:169:0x0530  */
            /* JADX WARN: Code duplicated, block: B:174:0x0555 A[LOOP:12: B:172:0x054f->B:174:0x0555, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:176:0x0567  */
            /* JADX WARN: Code duplicated, block: B:177:0x0570  */
            /* JADX WARN: Code duplicated, block: B:179:0x0576  */
            /* JADX WARN: Code duplicated, block: B:180:0x057b  */
            /* JADX WARN: Code duplicated, block: B:183:0x0595  */
            /* JADX WARN: Code duplicated, block: B:184:0x0598  */
            /* JADX WARN: Code duplicated, block: B:186:0x059c  */
            /* JADX WARN: Code duplicated, block: B:187:0x059f  */
            /* JADX WARN: Code duplicated, block: B:189:0x05a3  */
            /* JADX WARN: Code duplicated, block: B:190:0x05a6  */
            /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:36:0x0102  */
            /* JADX WARN: Code duplicated, block: B:37:0x0105  */
            /* JADX WARN: Code duplicated, block: B:40:0x013c  */
            /* JADX WARN: Code duplicated, block: B:43:0x014d  */
            /* JADX WARN: Code duplicated, block: B:44:0x0150  */
            /* JADX WARN: Code duplicated, block: B:49:0x0177 A[LOOP:4: B:47:0x0171->B:49:0x0177, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:51:0x0189  */
            /* JADX WARN: Code duplicated, block: B:52:0x018e  */
            /* JADX WARN: Code duplicated, block: B:54:0x0192  */
            /* JADX WARN: Code duplicated, block: B:55:0x0197  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:59:0x01b4  */
            /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:62:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:64:0x01bf  */
            /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v16 java.lang.Object, still in use, count: 2, list:
                  (r9v16 java.lang.Object) from 0x04ba: PHI (r9 I:??) = (r9v2 java.lang.Object), (r9v16 java.lang.Object) binds: [B:154:0x04b8, B:233:0x04ba] A[DONT_GENERATE, DONT_INLINE]
                  (r9v16 java.lang.Object) from 0x04af: CHECK_CAST (a.lok0) (r9v16 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r39) {
                /*
                    Method dump skipped, instruction units count: 1522
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g5p.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.r = maz.b(new yw9(list, new Function1(this) { // from class: a.g5p
            public final /* synthetic */ t2f b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x02f0  */
            /* JADX WARN: Code duplicated, block: B:101:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:104:0x0305  */
            /* JADX WARN: Code duplicated, block: B:105:0x0308  */
            /* JADX WARN: Code duplicated, block: B:108:0x033f  */
            /* JADX WARN: Code duplicated, block: B:111:0x034e  */
            /* JADX WARN: Code duplicated, block: B:112:0x0350  */
            /* JADX WARN: Code duplicated, block: B:117:0x0375 A[LOOP:9: B:115:0x036f->B:117:0x0375, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:119:0x0387  */
            /* JADX WARN: Code duplicated, block: B:120:0x0390  */
            /* JADX WARN: Code duplicated, block: B:122:0x0396  */
            /* JADX WARN: Code duplicated, block: B:123:0x039b  */
            /* JADX WARN: Code duplicated, block: B:126:0x03b5  */
            /* JADX WARN: Code duplicated, block: B:127:0x03b8  */
            /* JADX WARN: Code duplicated, block: B:129:0x03bc  */
            /* JADX WARN: Code duplicated, block: B:130:0x03bf  */
            /* JADX WARN: Code duplicated, block: B:132:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:133:0x03c6  */
            /* JADX WARN: Code duplicated, block: B:157:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:158:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:161:0x04e4  */
            /* JADX WARN: Code duplicated, block: B:162:0x04e7  */
            /* JADX WARN: Code duplicated, block: B:165:0x051f  */
            /* JADX WARN: Code duplicated, block: B:168:0x052e  */
            /* JADX WARN: Code duplicated, block: B:169:0x0530  */
            /* JADX WARN: Code duplicated, block: B:174:0x0555 A[LOOP:12: B:172:0x054f->B:174:0x0555, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:176:0x0567  */
            /* JADX WARN: Code duplicated, block: B:177:0x0570  */
            /* JADX WARN: Code duplicated, block: B:179:0x0576  */
            /* JADX WARN: Code duplicated, block: B:180:0x057b  */
            /* JADX WARN: Code duplicated, block: B:183:0x0595  */
            /* JADX WARN: Code duplicated, block: B:184:0x0598  */
            /* JADX WARN: Code duplicated, block: B:186:0x059c  */
            /* JADX WARN: Code duplicated, block: B:187:0x059f  */
            /* JADX WARN: Code duplicated, block: B:189:0x05a3  */
            /* JADX WARN: Code duplicated, block: B:190:0x05a6  */
            /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:36:0x0102  */
            /* JADX WARN: Code duplicated, block: B:37:0x0105  */
            /* JADX WARN: Code duplicated, block: B:40:0x013c  */
            /* JADX WARN: Code duplicated, block: B:43:0x014d  */
            /* JADX WARN: Code duplicated, block: B:44:0x0150  */
            /* JADX WARN: Code duplicated, block: B:49:0x0177 A[LOOP:4: B:47:0x0171->B:49:0x0177, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:51:0x0189  */
            /* JADX WARN: Code duplicated, block: B:52:0x018e  */
            /* JADX WARN: Code duplicated, block: B:54:0x0192  */
            /* JADX WARN: Code duplicated, block: B:55:0x0197  */
            /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:59:0x01b4  */
            /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:62:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:64:0x01bf  */
            /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v16 java.lang.Object, still in use, count: 2, list:
                  (r9v16 java.lang.Object) from 0x04ba: PHI (r9 I:??) = (r9v2 java.lang.Object), (r9v16 java.lang.Object) binds: [B:154:0x04b8, B:233:0x04ba] A[DONT_GENERATE, DONT_INLINE]
                  (r9v16 java.lang.Object) from 0x04af: CHECK_CAST (a.lok0) (r9v16 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r39) {
                /*
                    Method dump skipped, instruction units count: 1522
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g5p.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }
}
