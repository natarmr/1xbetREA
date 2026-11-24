package a;

import java.util.ArrayList;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class b6v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1e f2075a;
    public final r2u b;
    public final ouu c;
    public final rtu d;
    public final lbu e;
    public final v7i f;
    public final j3c g;
    public final ieu h;
    public final n0o0 i;

    public b6v(m1e m1eVar, r2u r2uVar, ouu ouuVar, rtu rtuVar, lbu lbuVar, v7i v7iVar, j3c j3cVar, pru pruVar, ieu ieuVar) {
        m1eVar.getClass();
        this.f2075a = m1eVar;
        this.b = r2uVar;
        this.c = ouuVar;
        this.d = rtuVar;
        this.e = lbuVar;
        this.f = v7iVar;
        this.g = j3cVar;
        this.h = ieuVar;
        this.i = maz.b(new b6u(pruVar, (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar) {
        r5v r5vVar;
        if (zjeVar instanceof r5v) {
            r5vVar = (r5v) zjeVar;
            int i2 = r5vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5vVar.l = i2 - Integer.MIN_VALUE;
            } else {
                r5vVar = new r5v(this, zjeVar);
            }
        } else {
            r5vVar = new r5v(this, zjeVar);
        }
        Object objA = r5vVar.j;
        wne wneVar = wne.f39444a;
        int i3 = r5vVar.l;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objA);
            boolean zU = kpb.u(sip.c);
            r5vVar.i = i;
            r5vVar.l = 1;
            objA = this.d.a(zU, 0, r5vVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = r5vVar.i;
            z1x.P(objA);
        }
        c3c0 c3c0Var = (c3c0) objA;
        CyberGamesPage.Virtual virtual = CyberGamesPage.Virtual.INSTANCE;
        long j = i;
        sip sipVar = sip.c;
        virtual.getClass();
        c3c0Var.getClass();
        lbu lbuVar = this.e;
        nru0 nru0Var = (nru0) lbuVar.b;
        jvn jvnVarB = ((uzc) lbuVar.c).b();
        lnf0 lnf0VarD = nru0Var.c.d();
        jo20 jo20Var = new jo20();
        qbt.a(jo20Var, jvnVarB);
        qbt.c(c3c0Var.f3668a, jo20Var);
        qbt.g(lnf0VarD.b, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.l(jo20Var);
        jo20Var.put("sportCategoryId", Long.valueOf(j));
        qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
        qbt.p(jo20Var);
        return new dnq(aoq.c(gfx.R(nru0Var.b.f16756a, kpb.v(sipVar), null, new xg0(nru0Var, virtual, jo20Var.b(), (yje) null), 252), new sot(yjeVar, (Object) this, (byte) 19)), new rl2(3, yjeVar, (byte) 29), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r13 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r12, a.zje r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof a.w5v
            if (r0 == 0) goto L14
            r0 = r13
            a.w5v r0 = (a.w5v) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.n = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.w5v r0 = new a.w5v
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.l
            a.wne r0 = a.wne.f39444a
            int r1 = r6.n
            r2 = 2
            r7 = 1
            r8 = 0
            r9 = 3
            if (r1 == 0) goto L4b
            if (r1 == r7) goto L41
            if (r1 == r2) goto L3a
            if (r1 != r9) goto L34
            a.rtu r11 = r6.j
            a.c3c0 r11 = (a.c3c0) r11
            a.z1x.P(r13)
            goto L94
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r8
        L3a:
            int r12 = r6.i
            a.z1x.P(r13)
            r2 = r12
            goto L7d
        L41:
            boolean r12 = r6.k
            int r1 = r6.i
            a.rtu r3 = r6.j
            a.z1x.P(r13)
            goto L6b
        L4b:
            a.z1x.P(r13)
            a.sip r13 = a.sip.c
            boolean r13 = a.kpb.u(r13)
            a.rtu r3 = r11.d
            r6.j = r3
            r6.i = r12
            r6.k = r13
            r6.n = r7
            a.ieu r1 = r11.h
            java.lang.Object r1 = r1.i(r6)
            if (r1 != r0) goto L67
            goto L93
        L67:
            r10 = r1
            r1 = r12
            r12 = r13
            r13 = r10
        L6b:
            a.elt r13 = (a.elt) r13
            int r13 = r13.e
            r6.j = r8
            r6.i = r1
            r6.n = r2
            java.lang.Object r13 = r3.a(r12, r13, r6)
            if (r13 != r0) goto L7c
            goto L93
        L7c:
            r2 = r1
        L7d:
            a.c3c0 r13 = (a.c3c0) r13
            a.sip r3 = a.sip.c
            org.xplatform.cyber.section.api.domain.entity.CyberGamesPage$Virtual r4 = org.xplatform.cyber.section.api.domain.entity.CyberGamesPage.Virtual.INSTANCE
            int r5 = r13.f3668a
            r6.j = r8
            r6.i = r2
            r6.n = r9
            a.ouu r1 = r11.c
            java.lang.Object r13 = r1.D(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L94
        L93:
            return r0
        L94:
            a.gmq r13 = (a.gmq) r13
            a.a1t r11 = new a.a1t
            r12 = 21
            r11.<init>(r13, r12)
            a.x5v r12 = new a.x5v
            r13 = 0
            r12.<init>(r9, r8, r13)
            a.dnq r13 = new a.dnq
            r13.<init>(r11, r12, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b6v.b(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ArrayList arrayList, int i, zje zjeVar) {
        z5v z5vVar;
        gmq vsg0Var;
        gmq gmqVar;
        if (zjeVar instanceof z5v) {
            z5vVar = (z5v) zjeVar;
            int i2 = z5vVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z5vVar.n = i2 - Integer.MIN_VALUE;
            } else {
                z5vVar = new z5v(this, zjeVar);
            }
        } else {
            z5vVar = new z5v(this, zjeVar);
        }
        Object objB = z5vVar.l;
        Object obj = wne.f39444a;
        int i3 = z5vVar.n;
        byte b = 2;
        byte b2 = 1;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objB);
            vsg0Var = new vsg0(new y5v(this, arrayList, null));
            z5vVar.i = vsg0Var;
            z5vVar.k = i;
            z5vVar.n = 1;
            objB = b(i, z5vVar);
            if (objB != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            i = z5vVar.k;
            vsg0Var = z5vVar.i;
            z1x.P(objB);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gmqVar = z5vVar.j;
            vsg0Var = z5vVar.i;
            z1x.P(objB);
        }
        return new dnq(dub.f0(vsg0Var, gmqVar, (gmq) objB, new ipt(4, yjeVar, b)), new x5v(3, yjeVar, b2), (byte) 1);
        gmq gmqVar2 = (gmq) objB;
        z5vVar.i = vsg0Var;
        z5vVar.j = gmqVar2;
        z5vVar.k = i;
        z5vVar.n = 2;
        Object objA = a(i, z5vVar);
        if (objA != obj) {
            objB = objA;
            gmqVar = gmqVar2;
            return new dnq(dub.f0(vsg0Var, gmqVar, (gmq) objB, new ipt(4, yjeVar, b)), new x5v(3, yjeVar, b2), (byte) 1);
        }
        return obj;
    }
}
