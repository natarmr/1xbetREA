package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class tjb0 extends x2t0 {
    public static final /* synthetic */ int A = 0;
    public final u58 h;
    public final zg i;
    public final nv20 j;
    public final fvt0 k;
    public final vjp l;
    public final oeg0 m;
    public final ivn n;
    public final ctf0 o;
    public final qv2 p;
    public final gg5 q;
    public final eke0 r;
    public final y3v s;
    public final bn6 t;
    public final je u;
    public final vqc v;
    public final h3c w;
    public final rrc x;
    public final yo4 y;
    public final zr1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjb0(u58 u58Var, zg zgVar, nv20 nv20Var, fvt0 fvt0Var, vjp vjpVar, oeg0 oeg0Var, ivn ivnVar, ctf0 ctf0Var, qv2 qv2Var, gg5 gg5Var, eke0 eke0Var, y3v y3vVar, bn6 bn6Var, je jeVar, vqc vqcVar, h3c h3cVar, rrc rrcVar, yo4 yo4Var, zr1 zr1Var) {
        super(new npa0((byte) 16));
        oeg0Var.getClass();
        this.h = u58Var;
        this.i = zgVar;
        this.j = nv20Var;
        this.k = fvt0Var;
        this.l = vjpVar;
        this.m = oeg0Var;
        this.n = ivnVar;
        this.o = ctf0Var;
        this.p = qv2Var;
        this.q = gg5Var;
        this.r = eke0Var;
        this.s = y3vVar;
        this.t = bn6Var;
        this.u = jeVar;
        this.v = vqcVar;
        this.w = h3cVar;
        this.x = rrcVar;
        this.y = yo4Var;
        this.z = zr1Var;
    }

    public final void i() {
        int iOrdinal = ((e5l0) d()).e.ordinal();
        zg zgVar = this.i;
        if (iOrdinal == 0) {
            i8i.D("option", "champ_live", zgVar.f44322a, "popular_top_all_click");
        } else if (iOrdinal == 1) {
            i8i.D("option", "popular_live", zgVar.f44322a, "popular_top_all_click");
        } else if (iOrdinal == 2) {
            i8i.D("option", "popular_line", zgVar.f44322a, "popular_top_all_click");
        } else if (iOrdinal == 3) {
            i8i.D("option", "cybersport", zgVar.f44322a, "popular_top_all_click");
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            i8i.D("option", "champ_all", zgVar.f44322a, "popular_top_all_click");
        }
        this.q.t(((e5l0) d()).f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j, long j2, zje zjeVar) {
        njb0 njb0Var;
        if (zjeVar instanceof njb0) {
            njb0Var = (njb0) zjeVar;
            int i = njb0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                njb0Var.m = i - Integer.MIN_VALUE;
            } else {
                njb0Var = new njb0(this, zjeVar);
            }
        } else {
            njb0Var = new njb0(this, zjeVar);
        }
        Object objB = njb0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = njb0Var.m;
        if (i2 == 0) {
            z1x.P(objB);
            njb0Var.i = j;
            njb0Var.j = j2;
            njb0Var.m = 1;
            objB = this.w.b(j, njb0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = njb0Var.j;
            j = njb0Var.i;
            z1x.P(objB);
        }
        long j3 = j;
        long j4 = j2;
        if (!((Boolean) objB).booleanValue()) {
            return Unit.f46060a;
        }
        this.v.k(pzb.C(new qp7(j4, j3, (Object) this, (byte) 7)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object k(long j, long j2, long j3, zje zjeVar, boolean z) {
        ojb0 ojb0Var;
        long j4;
        boolean z2;
        long j5;
        long j6;
        if (zjeVar instanceof ojb0) {
            ojb0Var = (ojb0) zjeVar;
            int i = ojb0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojb0Var.o = i - Integer.MIN_VALUE;
            } else {
                ojb0Var = new ojb0(this, zjeVar);
            }
        } else {
            ojb0Var = new ojb0(this, zjeVar);
        }
        ojb0 ojb0Var2 = ojb0Var;
        Object obj = ojb0Var2.m;
        Object obj2 = wne.f39444a;
        int i2 = ojb0Var2.o;
        if (i2 == 0) {
            z1x.P(obj);
            ojb0Var2.i = j;
            ojb0Var2.j = j2;
            ojb0Var2.k = j3;
            ojb0Var2.l = z;
            ojb0Var2.o = 1;
            if (j(j, j3, ojb0Var2) == obj2) {
                return obj2;
            }
            j4 = j3;
            z2 = z;
            j5 = j2;
            j6 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = ojb0Var2.l;
            long j7 = ojb0Var2.k;
            long j8 = ojb0Var2.j;
            j6 = ojb0Var2.i;
            z1x.P(obj);
            z2 = z3;
            j4 = j7;
            j5 = j8;
        }
        this.t.d(j6, j5, j4, ((e5l0) d()).f7239a, z2);
        this.u.f(j6, j5, j4, ((e5l0) d()).f7239a, z2);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        if (m(r8, r3) == r4) goto L60;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.c5l0 r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tjb0.a(a.c5l0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011a, code lost:
    
        if (o(r4, r7) == r11) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r17, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tjb0.m(long, a.zje):java.lang.Object");
    }

    public final void n(int i, String str) {
        amb0 amb0Var = ((e5l0) d()).d;
        if (amb0Var != null) {
            int iOrdinal = amb0Var.ordinal();
            zr1 zr1Var = this.z;
            yo4 yo4Var = this.y;
            if (iOrdinal == 0) {
                yo4Var.p(i, "popular_new_top");
                y1p y1pVar = y1p.MAIN;
                zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("popular_new_top", (byte) 1)}), 3115L);
            } else if (iOrdinal == 1) {
                yo4Var.p(i, "popular_new_sport");
                y1p y1pVar2 = y1p.MAIN;
                zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p("popular_new_sport", (byte) 1)}), 3115L);
            }
        }
        i1w0 i1w0VarC = this.m.c();
        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
        k0w0VarI.h(this.s.h(i, str));
        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(rbb rbbVar, zje zjeVar) {
        rjb0 rjb0Var;
        rbb rbbVar2;
        ygs ygsVar;
        if (zjeVar instanceof rjb0) {
            rjb0Var = (rjb0) zjeVar;
            int i = rjb0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                rjb0Var.m = i - Integer.MIN_VALUE;
            } else {
                rjb0Var = new rjb0(this, zjeVar);
            }
        } else {
            rjb0Var = new rjb0(this, zjeVar);
        }
        Object obj = rjb0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = rjb0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            ygs ygsVar2 = (ygs) CollectionsKt.firstOrNull(rbbVar.p);
            if (ygsVar2 == null) {
                return Unit.f46060a;
            }
            long j = rbbVar.n;
            rjb0Var.i = rbbVar;
            rjb0Var.j = ygsVar2;
            rjb0Var.m = 1;
            Object objB = this.w.b(j, rjb0Var);
            if (objB == wneVar) {
                return wneVar;
            }
            rbbVar2 = rbbVar;
            ygsVar = ygsVar2;
            obj = objB;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ygs ygsVar3 = rjb0Var.j;
            rbb rbbVar3 = rjb0Var.i;
            z1x.P(obj);
            ygsVar = ygsVar3;
            rbbVar2 = rbbVar3;
        }
        this.m.c().d(new t13((Object) this, (Object) ygsVar, (Object) rbbVar2, ((Boolean) obj).booleanValue(), (byte) 19));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        if (r13 == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(a.rbb r13, a.zje r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof a.sjb0
            if (r0 == 0) goto L14
            r0 = r14
            a.sjb0 r0 = (a.sjb0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.sjb0 r0 = new a.sjb0
            r0.<init>(r12, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.i
            a.wne r0 = a.wne.f39444a
            int r1 = r6.k
            r2 = 2
            r7 = 1
            if (r1 == 0) goto L38
            if (r1 == r7) goto L28
            if (r1 != r2) goto L31
        L28:
            a.z1x.P(r14)     // Catch: java.lang.Throwable -> L2d
            goto La7
        L2d:
            r0 = move-exception
            r13 = r0
            goto L9d
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            r12 = 0
            return r12
        L38:
            a.z1x.P(r14)
            long r3 = r13.f30176a     // Catch: java.lang.Throwable -> L2d
            r14 = r2
            r4 = r3
            long r2 = r13.n     // Catch: java.lang.Throwable -> L2d
            java.util.List r1 = r13.p     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)     // Catch: java.lang.Throwable -> L2d
            a.ygs r1 = (a.ygs) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L4e
            long r8 = r1.B     // Catch: java.lang.Throwable -> L2d
            goto L50
        L4e:
            r8 = 0
        L50:
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L2d
            r8 = r4
            boolean r4 = r13.m     // Catch: java.lang.Throwable -> L2d
            boolean r13 = r13.l     // Catch: java.lang.Throwable -> L2d
            if (r13 == 0) goto L7c
            a.nv20 r13 = r12.j     // Catch: java.lang.Throwable -> L2d
            r6.k = r7     // Catch: java.lang.Throwable -> L2d
            r13.getClass()     // Catch: java.lang.Throwable -> L2d
            a.qgb r14 = new a.qgb     // Catch: java.lang.Throwable -> L2d
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L2d
            r14.<init>(r8, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r13 = r13.f24171a     // Catch: java.lang.Throwable -> L2d
            a.khf0 r13 = (a.khf0) r13     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r13 = r13.D(r14, r6)     // Catch: java.lang.Throwable -> L2d
            if (r13 != r0) goto L77
            goto L79
        L77:
            kotlin.Unit r13 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L2d
        L79:
            if (r13 != r0) goto La7
            goto L9c
        L7c:
            a.fvt0 r13 = r12.k     // Catch: java.lang.Throwable -> L2d
            r6.k = r14     // Catch: java.lang.Throwable -> L2d
            r13.getClass()     // Catch: java.lang.Throwable -> L2d
            a.qgb r5 = new a.qgb     // Catch: java.lang.Throwable -> L2d
            long r10 = r1.longValue()     // Catch: java.lang.Throwable -> L2d
            r5.<init>(r8, r10)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r13 = r13.f10231a     // Catch: java.lang.Throwable -> L2d
            r1 = r13
            a.nr r1 = (a.nr) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r13 = r1.u(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            if (r13 != r0) goto L98
            goto L9a
        L98:
            kotlin.Unit r13 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L2d
        L9a:
            if (r13 != r0) goto La7
        L9c:
            return r0
        L9d:
            a.mjb0 r14 = new a.mjb0
            r14.<init>(r12, r7)
            a.ivn r12 = r12.n
            r12.f(r13, r14)
        La7:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tjb0.p(a.rbb, a.zje):java.lang.Object");
    }
}
