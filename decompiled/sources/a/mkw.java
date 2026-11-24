package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class mkw implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21963a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final Object g;
    public final Object h;
    public final Object i;

    public mkw(ctf0 ctf0Var, xb70 xb70Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(xb70Var.c);
        this.d = bkb.H(Boolean.valueOf(xb70Var.n.f9194a));
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        this.g = new r2v0(new y3d(staticColors.m73getBlack400d7_KjU()), new y3d(staticColors.m73getBlack400d7_KjU()), new y3d(staticColors.m123getWhite0d7_KjU()));
        this.e = maz.b(new yw9(new ia70(false, false, csr.e, false, false, false, false), new wk60((byte) 5), (byte) 20));
        final byte b = 0;
        this.f = maz.b(new yw9(new y870(false, new ql5(0L, 0.0d, false, false, 0L, "", "", 0, txs0.b, "", "", false, ""), 0, false, false, false, false, false), new Function1(this) { // from class: a.dc70
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                mkw mkwVar = this.b;
                switch (b2) {
                    case 0:
                        y870 y870Var = (y870) obj;
                        y870Var.getClass();
                        boolean z = y870Var.f42183a;
                        ql5 ql5Var = y870Var.b;
                        boolean z2 = y870Var.e;
                        boolean z3 = (z || y870Var.d || !y870Var.f || !z2 || y870Var.h) ? false : true;
                        long j = ql5Var.f28916a;
                        boolean z4 = j != 0 && z2;
                        boolean z5 = y870Var.g && y870Var.c > 1 && j != -2;
                        pn40 pn40Var = pn40.f27267a;
                        return new a970(z3, z4, z5, new sd(pn40.c(ql5Var.b, p3u0.c), ql5Var.f, mkwVar.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))), (r2v0) mkwVar.g);
                    default:
                        zb70 zb70Var = (zb70) obj;
                        zb70Var.getClass();
                        boolean z6 = zb70Var.f44101a;
                        String strA = mkwVar.b.b.a(R.string.federal_tax_legislation_info, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var2 = s6t0.f31722a;
                        StaticColors staticColors2 = StaticColors.INSTANCE;
                        return new yb70(staticColors2.m131getWhite800d7_KjU(), staticColors2.m123getWhite0d7_KjU(), staticColors2.m126getWhite200d7_KjU(), staticColors2.m76getBlack700d7_KjU(), strA, z6);
                }
            }
        }, (byte) 20));
        this.h = maz.b(new yw9(new ha70(false, false, false, true, false), new wk60((byte) 6), (byte) 20));
        final byte b2 = 1;
        this.i = maz.b(new yw9(new zb70(false), new Function1(this) { // from class: a.dc70
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                mkw mkwVar = this.b;
                switch (b3) {
                    case 0:
                        y870 y870Var = (y870) obj;
                        y870Var.getClass();
                        boolean z = y870Var.f42183a;
                        ql5 ql5Var = y870Var.b;
                        boolean z2 = y870Var.e;
                        boolean z3 = (z || y870Var.d || !y870Var.f || !z2 || y870Var.h) ? false : true;
                        long j = ql5Var.f28916a;
                        boolean z4 = j != 0 && z2;
                        boolean z5 = y870Var.g && y870Var.c > 1 && j != -2;
                        pn40 pn40Var = pn40.f27267a;
                        return new a970(z3, z4, z5, new sd(pn40.c(ql5Var.b, p3u0.c), ql5Var.f, mkwVar.b.b.a(R.string.replenish, Arrays.copyOf(new Object[0], 0))), (r2v0) mkwVar.g);
                    default:
                        zb70 zb70Var = (zb70) obj;
                        zb70Var.getClass();
                        boolean z6 = zb70Var.f44101a;
                        String strA = mkwVar.b.b.a(R.string.federal_tax_legislation_info, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var2 = s6t0.f31722a;
                        StaticColors staticColors2 = StaticColors.INSTANCE;
                        return new yb70(staticColors2.m131getWhite800d7_KjU(), staticColors2.m123getWhite0d7_KjU(), staticColors2.m126getWhite200d7_KjU(), staticColors2.m76getBlack700d7_KjU(), strA, z6);
                }
            }
        }, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0330  */
    /* JADX WARN: Code duplicated, block: B:63:0x033a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0342  */
    /* JADX WARN: Code duplicated, block: B:68:0x0345  */
    /* JADX WARN: Code duplicated, block: B:71:0x0389  */
    /* JADX WARN: Code duplicated, block: B:74:0x0396  */
    /* JADX WARN: Code duplicated, block: B:75:0x03bf  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        Object obj2;
        boolean z;
        lc00 lc00VarB;
        List list;
        lc00 lc00VarA;
        ijw ijwVar;
        byte b = this.f21963a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        n0o0 n0o0Var = this.f;
        n0o0 n0o0Var2 = this.e;
        n0o0 n0o0Var3 = this.d;
        n0o0 n0o0Var4 = this.c;
        switch (b) {
            case 0:
                yjw yjwVar = (yjw) obj;
                yjwVar.getClass();
                cjw cjwVar = (cjw) ((fee) n0o0Var4.getValue()).b();
                zbk zbkVar = ((fee) n0o0Var3.getValue()).e;
                g2v g2vVar = (g2v) obj4;
                viw viwVar = yjwVar.h;
                if (viwVar == null && !yjwVar.g) {
                    ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                } else if (viwVar == null) {
                    ijwVar = new ijw(new fjw(g2v.b(g2vVar, pb10.q, null, null, 0, 0, 0, 0, 0, 0L, 0L, 1022)));
                } else {
                    Object obj5 = viwVar.f37502a;
                    Object obj6 = viwVar.b;
                    e0g0 e0g0Var = j0g0.b;
                    boolean z2 = obj5 instanceof g0g0;
                    if (z2 && (obj6 instanceof g0g0)) {
                        ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                    } else {
                        if (z2) {
                            obj5 = null;
                        }
                        Iterable iterable = (List) obj5;
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            w3d.u(arrayList, ((tiw) it.next()).f34025a);
                        }
                        if (arrayList.isEmpty() && (obj6 instanceof g0g0)) {
                            ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                        } else if (z2) {
                            if (obj6 instanceof g0g0) {
                                obj6 = null;
                            }
                            Iterable iterable2 = (List) obj6;
                            if (iterable2 == null) {
                                iterable2 = iun.f15405a;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = iterable2.iterator();
                            while (it2.hasNext()) {
                                w3d.u(arrayList2, ((tiw) it2.next()).f34025a);
                            }
                            if (arrayList2.isEmpty()) {
                                ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                            } else {
                                obj2 = viwVar.d.f15681a;
                                if (obj2 instanceof g0g0) {
                                    ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                                } else {
                                    z = obj2 instanceof g0g0;
                                    if (!z) {
                                        if (z) {
                                            obj2 = null;
                                        }
                                        if (obj2 == null) {
                                            ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                                        }
                                    }
                                    ((fee) n0o0Var3.getValue()).d(viwVar);
                                    ((fee) n0o0Var.getValue()).d(viwVar);
                                    lc00VarB = kotlin.collections.a.b();
                                    lc00VarB.add((p6t0) ((fee) n0o0Var2.getValue()).b());
                                    list = (List) ((fee) n0o0Var.getValue()).b();
                                    if (list != null) {
                                        lc00VarB.addAll(list);
                                    }
                                    lc00VarA = kotlin.collections.a.a(lc00VarB);
                                    if (lc00VarA.isEmpty()) {
                                        ijwVar = new ijw(new ejw(g2v.b(g2vVar, pb10.r, null, ldm.b, 0, 0, R.string.currently_no_events, 0, R.string.try_again_text, 10000L, 0L, 602)));
                                    } else {
                                        ijwVar = new ijw(djw.f6206a, dyb.o0(lc00VarA));
                                    }
                                }
                            }
                        } else {
                            obj2 = viwVar.d.f15681a;
                            if (obj2 instanceof g0g0) {
                                ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                            } else {
                                z = obj2 instanceof g0g0;
                                if (!z) {
                                    if (z) {
                                        obj2 = null;
                                    }
                                    if (obj2 == null) {
                                        ijwVar = new ijw(new ejw(yyw.N(g2vVar, ldm.b)));
                                    }
                                }
                                ((fee) n0o0Var3.getValue()).d(viwVar);
                                ((fee) n0o0Var.getValue()).d(viwVar);
                                lc00VarB = kotlin.collections.a.b();
                                lc00VarB.add((p6t0) ((fee) n0o0Var2.getValue()).b());
                                list = (List) ((fee) n0o0Var.getValue()).b();
                                if (list != null) {
                                    lc00VarB.addAll(list);
                                }
                                lc00VarA = kotlin.collections.a.a(lc00VarB);
                                if (lc00VarA.isEmpty()) {
                                    ijwVar = new ijw(new ejw(g2v.b(g2vVar, pb10.r, null, ldm.b, 0, 0, R.string.currently_no_events, 0, R.string.try_again_text, 10000L, 0L, 602)));
                                } else {
                                    ijwVar = new ijw(djw.f6206a, dyb.o0(lc00VarA));
                                }
                            }
                        }
                    }
                }
                return new jkw(cjwVar, zbkVar, ijwVar);
            case 1:
                n0o0 n0o0Var5 = (n0o0) obj3;
                n0o0 n0o0Var6 = (n0o0) obj4;
                n0o0 n0o0Var7 = (n0o0) this.g;
                b820 b820Var = (b820) obj;
                b820Var.getClass();
                gx4 gx4Var = b820Var.f;
                boolean z3 = b820Var.l;
                an5 an5Var = b820Var.c;
                ((fee) n0o0Var4.getValue()).d(b820Var.f2138a);
                fee feeVar = (fee) n0o0Var3.getValue();
                fo7 fo7Var = b820Var.b;
                czc0 czc0Var = b820Var.e;
                feeVar.d(new iwh0(fo7Var, czc0Var != null, gx4Var != null));
                ((fee) n0o0Var2.getValue()).d(new cf6(an5Var, x9x.L(b820Var), fo7Var, b820Var.l));
                ((fee) n0o0Var.getValue()).d(new xvj0(b820Var.d, an5Var.c.f, z3));
                ((fee) n0o0Var7.getValue()).d(new x6c0(czc0Var, z3));
                ((fee) n0o0Var6.getValue()).d(new nx4(gx4Var, an5Var.c.f, z3));
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(b820Var.h));
                return new d820(ug20.b, null, new jp30((t820) ((fee) n0o0Var4.getValue()).b(), (vwh0) ((fee) n0o0Var3.getValue()).b(), (ff6) ((fee) n0o0Var2.getValue()).b(), (awj0) ((fee) n0o0Var.getValue()).b(), (a7c0) ((fee) n0o0Var7.getValue()).b(), (qx4) ((fee) n0o0Var6.getValue()).b(), (xw00) ((fee) n0o0Var5.getValue()).b(), 1.0f, null), null);
            default:
                n0o0 n0o0Var8 = (n0o0) obj3;
                xb70 xb70Var = (xb70) obj;
                xb70Var.getClass();
                fee feeVar2 = (fee) n0o0Var4.getValue();
                c5v0 c5v0Var = xb70Var.c;
                feeVar2.d(c5v0Var);
                fee feeVar3 = (fee) n0o0Var3.getValue();
                fa70 fa70Var = xb70Var.n;
                feeVar3.d(Boolean.valueOf(fa70Var.f9194a));
                fee feeVar4 = (fee) n0o0Var2.getValue();
                c970 c970Var = xb70Var.p;
                boolean z4 = c970Var.f3949a;
                f970 f970Var = xb70Var.o;
                feeVar4.d(new ia70(z4, f970Var.f9142a, c970Var.b, xb70Var.g, fa70Var.d, fa70Var.c, f970Var.b));
                fee feeVar5 = (fee) n0o0Var.getValue();
                z870 z870Var = xb70Var.q;
                feeVar5.d(new y870(z870Var.d, z870Var.e, z870Var.f43953a, fa70Var.d, fa70Var.c, xb70Var.g, xb70Var.h, z870Var.f));
                n0o0 n0o0Var9 = (n0o0) obj4;
                ((fee) n0o0Var9.getValue()).d(new ha70((c5v0Var != null ? c5v0Var.d : null) != null, fa70Var.b, xb70Var.j, xb70Var.g, xb70Var.m));
                ((fee) n0o0Var8.getValue()).d(new zb70(xb70Var.k));
                pz40 pz40Var = s6t0.f31722a;
                return new cc70(s6t0.b().f33626a.getBackgroundContent(), ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue(), new ac70(s6t0.b().f33626a.getBackgroundContent(), (imm) ((fee) n0o0Var2.getValue()).b(), (a970) ((fee) n0o0Var.getValue()).b()), (c5v0) ((fee) n0o0Var4.getValue()).c(), s6t0.b().f33626a.getBackground(), (bc70) ((fee) n0o0Var9.getValue()).b(), (yb70) ((fee) n0o0Var8.getValue()).b());
        }
    }

    public mkw(yjw yjwVar, g2v g2vVar, ctf0 ctf0Var, y78 y78Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.g = yjwVar;
        this.h = g2vVar;
        this.b = ctf0Var;
        this.i = y78Var;
        this.c = maz.b(new yw9(Boolean.valueOf(yjwVar.d), new h7w((byte) 5), (byte) 20));
        viw viwVar = yjwVar.h;
        this.d = maz.b(new yw9(viwVar, new Function1(this) { // from class: a.lkw
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:192:0x046d A[LOOP:10: B:190:0x0467->B:192:0x046d, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:194:0x047f  */
            /* JADX WARN: Code duplicated, block: B:195:0x0484  */
            /* JADX WARN: Code duplicated, block: B:197:0x0488  */
            /* JADX WARN: Code duplicated, block: B:198:0x048d  */
            /* JADX WARN: Code duplicated, block: B:201:0x0497  */
            /* JADX WARN: Code duplicated, block: B:206:0x04a2  */
            /* JADX WARN: Code duplicated, block: B:209:0x04ac  */
            /* JADX WARN: Code duplicated, block: B:214:0x04bf  */
            /* JADX WARN: Code duplicated, block: B:215:0x04c2  */
            /* JADX WARN: Code duplicated, block: B:217:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:218:0x04c9  */
            /* JADX WARN: Code duplicated, block: B:221:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:223:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:225:0x04ec  */
            /* JADX WARN: Code duplicated, block: B:226:0x04f2  */
            /* JADX WARN: Code duplicated, block: B:253:0x04bb A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v15 java.lang.Object, still in use, count: 2, list:
                  (r10v15 java.lang.Object) from 0x0450: PHI (r10 I:??) = (r10v7 java.lang.Object), (r10v15 java.lang.Object) binds: [B:188:0x044e, B:250:0x0450] A[DONT_GENERATE, DONT_INLINE]
                  (r10v15 java.lang.Object) from 0x0445: CHECK_CAST (a.lok0) (r10v15 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r54) {
                /*
                    Method dump skipped, instruction units count: 1308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lkw.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.e = maz.b(new yw9(null, new w0(this, (byte) 24), (byte) 20));
        final byte b2 = 1;
        this.f = maz.b(new yw9(viwVar, new Function1(this) { // from class: a.lkw
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:192:0x046d A[LOOP:10: B:190:0x0467->B:192:0x046d, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:194:0x047f  */
            /* JADX WARN: Code duplicated, block: B:195:0x0484  */
            /* JADX WARN: Code duplicated, block: B:197:0x0488  */
            /* JADX WARN: Code duplicated, block: B:198:0x048d  */
            /* JADX WARN: Code duplicated, block: B:201:0x0497  */
            /* JADX WARN: Code duplicated, block: B:206:0x04a2  */
            /* JADX WARN: Code duplicated, block: B:209:0x04ac  */
            /* JADX WARN: Code duplicated, block: B:214:0x04bf  */
            /* JADX WARN: Code duplicated, block: B:215:0x04c2  */
            /* JADX WARN: Code duplicated, block: B:217:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:218:0x04c9  */
            /* JADX WARN: Code duplicated, block: B:221:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:223:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:225:0x04ec  */
            /* JADX WARN: Code duplicated, block: B:226:0x04f2  */
            /* JADX WARN: Code duplicated, block: B:253:0x04bb A[SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v15 java.lang.Object, still in use, count: 2, list:
                  (r10v15 java.lang.Object) from 0x0450: PHI (r10 I:??) = (r10v7 java.lang.Object), (r10v15 java.lang.Object) binds: [B:188:0x044e, B:250:0x0450] A[DONT_GENERATE, DONT_INLINE]
                  (r10v15 java.lang.Object) from 0x0445: CHECK_CAST (a.lok0) (r10v15 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r54) {
                /*
                    Method dump skipped, instruction units count: 1308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.lkw.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mkw(b820 b820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        final byte b = 1;
        gx4 gx4Var = b820Var.f;
        boolean z = b820Var.l;
        an5 an5Var = b820Var.c;
        ctf0Var.getClass();
        this.b = ctf0Var;
        ly6 ly6Var = b820Var.f2138a;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.c = maz.b(new yw9(ly6Var, new Function1(this) { // from class: a.kp30
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = objArr;
                mkw mkwVar = this.b;
                switch (b2) {
                    case 0:
                        ly6 ly6Var2 = (ly6) obj;
                        ly6Var2.getClass();
                        return new q820(y0x0.M(ly6Var2, mkwVar.b));
                    case 1:
                        cf6 cf6Var = (cf6) obj;
                        cf6Var.getClass();
                        return j2e.V(cf6Var.f4244a, mkwVar.b, cf6Var.b, cf6Var.c, cf6Var.d);
                    case 2:
                        xvj0 xvj0Var = (xvj0) obj;
                        xvj0Var.getClass();
                        return t9x.S(xvj0Var.f41563a, xvj0Var.b, mkwVar.b, xvj0Var.c);
                    case 3:
                        x6c0 x6c0Var = (x6c0) obj;
                        x6c0Var.getClass();
                        czc0 czc0Var = x6c0Var.f40358a;
                        if (czc0Var != null) {
                            return x9x.a0(czc0Var, mkwVar.b, x6c0Var.b);
                        }
                        return null;
                    case 4:
                        nx4 nx4Var = (nx4) obj;
                        nx4Var.getClass();
                        gx4 gx4Var2 = nx4Var.f24264a;
                        if (gx4Var2 != null) {
                            return aad.e0(gx4Var2, mkwVar.b, gx4Var2.e, nx4Var.b, nx4Var.c);
                        }
                        return null;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return x9x.E(mkwVar.b);
                }
            }
        }, (byte) 20));
        fo7 fo7Var = b820Var.b;
        czc0 czc0Var = b820Var.e;
        this.d = maz.b(new yw9(new iwh0(fo7Var, czc0Var != null, gx4Var != null), new bw20(this, zvh0Var, (byte) 9), (byte) 20));
        this.e = maz.b(new yw9(new cf6(an5Var, x9x.L(b820Var), fo7Var, b820Var.l), new Function1(this) { // from class: a.kp30
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                mkw mkwVar = this.b;
                switch (b2) {
                    case 0:
                        ly6 ly6Var2 = (ly6) obj;
                        ly6Var2.getClass();
                        return new q820(y0x0.M(ly6Var2, mkwVar.b));
                    case 1:
                        cf6 cf6Var = (cf6) obj;
                        cf6Var.getClass();
                        return j2e.V(cf6Var.f4244a, mkwVar.b, cf6Var.b, cf6Var.c, cf6Var.d);
                    case 2:
                        xvj0 xvj0Var = (xvj0) obj;
                        xvj0Var.getClass();
                        return t9x.S(xvj0Var.f41563a, xvj0Var.b, mkwVar.b, xvj0Var.c);
                    case 3:
                        x6c0 x6c0Var = (x6c0) obj;
                        x6c0Var.getClass();
                        czc0 czc0Var2 = x6c0Var.f40358a;
                        if (czc0Var2 != null) {
                            return x9x.a0(czc0Var2, mkwVar.b, x6c0Var.b);
                        }
                        return null;
                    case 4:
                        nx4 nx4Var = (nx4) obj;
                        nx4Var.getClass();
                        gx4 gx4Var2 = nx4Var.f24264a;
                        if (gx4Var2 != null) {
                            return aad.e0(gx4Var2, mkwVar.b, gx4Var2.e, nx4Var.b, nx4Var.c);
                        }
                        return null;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return x9x.E(mkwVar.b);
                }
            }
        }, (byte) 20));
        final byte b2 = 2;
        this.f = maz.b(new yw9(new xvj0(b820Var.d, an5Var.c.f, z), new Function1(this) { // from class: a.kp30
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                mkw mkwVar = this.b;
                switch (b3) {
                    case 0:
                        ly6 ly6Var2 = (ly6) obj;
                        ly6Var2.getClass();
                        return new q820(y0x0.M(ly6Var2, mkwVar.b));
                    case 1:
                        cf6 cf6Var = (cf6) obj;
                        cf6Var.getClass();
                        return j2e.V(cf6Var.f4244a, mkwVar.b, cf6Var.b, cf6Var.c, cf6Var.d);
                    case 2:
                        xvj0 xvj0Var = (xvj0) obj;
                        xvj0Var.getClass();
                        return t9x.S(xvj0Var.f41563a, xvj0Var.b, mkwVar.b, xvj0Var.c);
                    case 3:
                        x6c0 x6c0Var = (x6c0) obj;
                        x6c0Var.getClass();
                        czc0 czc0Var2 = x6c0Var.f40358a;
                        if (czc0Var2 != null) {
                            return x9x.a0(czc0Var2, mkwVar.b, x6c0Var.b);
                        }
                        return null;
                    case 4:
                        nx4 nx4Var = (nx4) obj;
                        nx4Var.getClass();
                        gx4 gx4Var2 = nx4Var.f24264a;
                        if (gx4Var2 != null) {
                            return aad.e0(gx4Var2, mkwVar.b, gx4Var2.e, nx4Var.b, nx4Var.c);
                        }
                        return null;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return x9x.E(mkwVar.b);
                }
            }
        }, (byte) 20));
        final byte b3 = 3;
        this.g = maz.b(new yw9(new x6c0(czc0Var, z), new Function1(this) { // from class: a.kp30
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                mkw mkwVar = this.b;
                switch (b4) {
                    case 0:
                        ly6 ly6Var2 = (ly6) obj;
                        ly6Var2.getClass();
                        return new q820(y0x0.M(ly6Var2, mkwVar.b));
                    case 1:
                        cf6 cf6Var = (cf6) obj;
                        cf6Var.getClass();
                        return j2e.V(cf6Var.f4244a, mkwVar.b, cf6Var.b, cf6Var.c, cf6Var.d);
                    case 2:
                        xvj0 xvj0Var = (xvj0) obj;
                        xvj0Var.getClass();
                        return t9x.S(xvj0Var.f41563a, xvj0Var.b, mkwVar.b, xvj0Var.c);
                    case 3:
                        x6c0 x6c0Var = (x6c0) obj;
                        x6c0Var.getClass();
                        czc0 czc0Var2 = x6c0Var.f40358a;
                        if (czc0Var2 != null) {
                            return x9x.a0(czc0Var2, mkwVar.b, x6c0Var.b);
                        }
                        return null;
                    case 4:
                        nx4 nx4Var = (nx4) obj;
                        nx4Var.getClass();
                        gx4 gx4Var2 = nx4Var.f24264a;
                        if (gx4Var2 != null) {
                            return aad.e0(gx4Var2, mkwVar.b, gx4Var2.e, nx4Var.b, nx4Var.c);
                        }
                        return null;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return x9x.E(mkwVar.b);
                }
            }
        }, (byte) 20));
        final byte b4 = 4;
        this.h = maz.b(new yw9(new nx4(gx4Var, an5Var.c.f, z), new Function1(this) { // from class: a.kp30
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                mkw mkwVar = this.b;
                switch (b5) {
                    case 0:
                        ly6 ly6Var2 = (ly6) obj;
                        ly6Var2.getClass();
                        return new q820(y0x0.M(ly6Var2, mkwVar.b));
                    case 1:
                        cf6 cf6Var = (cf6) obj;
                        cf6Var.getClass();
                        return j2e.V(cf6Var.f4244a, mkwVar.b, cf6Var.b, cf6Var.c, cf6Var.d);
                    case 2:
                        xvj0 xvj0Var = (xvj0) obj;
                        xvj0Var.getClass();
                        return t9x.S(xvj0Var.f41563a, xvj0Var.b, mkwVar.b, xvj0Var.c);
                    case 3:
                        x6c0 x6c0Var = (x6c0) obj;
                        x6c0Var.getClass();
                        czc0 czc0Var2 = x6c0Var.f40358a;
                        if (czc0Var2 != null) {
                            return x9x.a0(czc0Var2, mkwVar.b, x6c0Var.b);
                        }
                        return null;
                    case 4:
                        nx4 nx4Var = (nx4) obj;
                        nx4Var.getClass();
                        gx4 gx4Var2 = nx4Var.f24264a;
                        if (gx4Var2 != null) {
                            return aad.e0(gx4Var2, mkwVar.b, gx4Var2.e, nx4Var.b, nx4Var.c);
                        }
                        return null;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return x9x.E(mkwVar.b);
                }
            }
        }, (byte) 20));
        final byte b5 = 5;
        this.i = maz.b(new yw9(Boolean.valueOf(b820Var.h), new Function1(this) { // from class: a.kp30
            public final /* synthetic */ mkw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                mkw mkwVar = this.b;
                switch (b6) {
                    case 0:
                        ly6 ly6Var2 = (ly6) obj;
                        ly6Var2.getClass();
                        return new q820(y0x0.M(ly6Var2, mkwVar.b));
                    case 1:
                        cf6 cf6Var = (cf6) obj;
                        cf6Var.getClass();
                        return j2e.V(cf6Var.f4244a, mkwVar.b, cf6Var.b, cf6Var.c, cf6Var.d);
                    case 2:
                        xvj0 xvj0Var = (xvj0) obj;
                        xvj0Var.getClass();
                        return t9x.S(xvj0Var.f41563a, xvj0Var.b, mkwVar.b, xvj0Var.c);
                    case 3:
                        x6c0 x6c0Var = (x6c0) obj;
                        x6c0Var.getClass();
                        czc0 czc0Var2 = x6c0Var.f40358a;
                        if (czc0Var2 != null) {
                            return x9x.a0(czc0Var2, mkwVar.b, x6c0Var.b);
                        }
                        return null;
                    case 4:
                        nx4 nx4Var = (nx4) obj;
                        nx4Var.getClass();
                        gx4 gx4Var2 = nx4Var.f24264a;
                        if (gx4Var2 != null) {
                            return aad.e0(gx4Var2, mkwVar.b, gx4Var2.e, nx4Var.b, nx4Var.c);
                        }
                        return null;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return x9x.E(mkwVar.b);
                }
            }
        }, (byte) 20));
    }
}
