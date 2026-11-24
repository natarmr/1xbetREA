package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class xig extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final yk50 A;
    public final bqc B;
    public final bqc C;
    public final bqc D;
    public final vqc E;
    public bby F;
    public c4m0 G;
    public bby H;
    public bby I;
    public final sip o;
    public final CyberChampsMainParams p;
    public final ctf0 q;
    public final hzg r;
    public final m1e s;
    public final o3c t;
    public final oeg0 u;
    public final fvt0 v;
    public final nv20 w;
    public final ivn x;
    public final vsu y;
    public final lhf0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xig(sip sipVar, CyberChampsMainParams cyberChampsMainParams, ctf0 ctf0Var, mne mneVar, hzg hzgVar, m1e m1eVar, vzg0 vzg0Var, pru pruVar, lbu lbuVar, luu luuVar, o3c o3cVar, g2v g2vVar, oeg0 oeg0Var, fvt0 fvt0Var, nv20 nv20Var, ivn ivnVar, vsu vsuVar, lhf0 lhf0Var, yk50 yk50Var, bqc bqcVar, bqc bqcVar2, bqc bqcVar3, vqc vqcVar) {
        super(new ng0(pruVar, (Object) luuVar, (Object) lbuVar, (Object) cyberChampsMainParams, (Object) sipVar, (byte) 7), cvm0.p(mneVar.c, mneVar.f22085a), new o20(g2vVar, ctf0Var, (byte) 4), (yzn0) null);
        sipVar.getClass();
        cyberChampsMainParams.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        this.o = sipVar;
        this.p = cyberChampsMainParams;
        this.q = ctf0Var;
        this.r = hzgVar;
        this.s = m1eVar;
        this.t = o3cVar;
        this.u = oeg0Var;
        this.v = fvt0Var;
        this.w = nv20Var;
        this.x = ivnVar;
        this.y = vsuVar;
        this.z = lhf0Var;
        this.A = yk50Var;
        this.B = bqcVar;
        this.C = bqcVar2;
        this.D = bqcVar3;
        this.E = vqcVar;
    }

    public final void M() {
        c4m0 c4m0Var = this.G;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        this.G = i3t0.L(this, new fnq(i120.W(this.s.b()), new igb((Object) this, (yje) null, (byte) 23), (byte) 4), null, null, 3);
    }

    public final void N(eeb eebVar, long j) {
        long j2 = eebVar.i;
        if (j2 == 40) {
            j2 = eebVar.g;
        }
        String str = eebVar.b;
        byte b = this.p.f46548a.f46556a;
        k1g k1gVar = k1g.OPEN_REGULAR;
        ((uzg) this.r).f(str, j2, j, b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r5 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(a.npn r6, boolean r7, a.zje r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a.wig
            if (r0 == 0) goto L13
            r0 = r8
            a.wig r0 = (a.wig) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.wig r0 = new a.wig
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L26
            if (r2 != r3) goto L2c
        L26:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r6 = move-exception
            goto L4e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            a.z1x.P(r8)
            if (r7 != 0) goto L43
            a.fvt0 r7 = r5.v     // Catch: java.lang.Throwable -> L2a
            r0.k = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.w(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L59
            goto L4d
        L43:
            a.nv20 r7 = r5.w     // Catch: java.lang.Throwable -> L2a
            r0.k = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.c(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L59
        L4d:
            return r1
        L4e:
            a.hfg r7 = new a.hfg
            r8 = 5
            r7.<init>(r5, r8)
            a.ivn r5 = r5.x
            r5.f(r6, r7)
        L59:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xig.O(a.npn, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        jig jigVar = (jig) obj;
        jigVar.getClass();
        super.x(jigVar);
        if (jigVar.equals(hig.f13111a)) {
            M();
            return;
        }
        byte b = 1;
        ?? r4 = 0;
        Object obj2 = null;
        Object obj3 = null;
        if (jigVar instanceof dig) {
            long j = ((dig) jigVar).f6136a;
            mig migVar = ((sig) D()).h;
            if (migVar != null) {
                Object obj4 = migVar.f21844a;
                e0g0 e0g0Var = j0g0.b;
                if (obj4 instanceof g0g0) {
                    obj4 = null;
                }
                List list = (List) obj4;
                if (list != null) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((eeb) next).f7663a != j);
                    eeb eebVar = (eeb) next;
                    if (eebVar != null) {
                        boolean zContains = ((sig) D()).c.c.p.contains(Long.valueOf(j));
                        for (Object obj5 : ((sig) D()).d) {
                            lok0 lok0Var = (lok0) obj5;
                            if (lok0Var.f20396a == eebVar.l && lok0Var.t.contains(1)) {
                                obj2 = obj5;
                                break;
                            }
                        }
                        lok0 lok0Var2 = (lok0) obj2;
                        hzg hzgVar = this.r;
                        if (zContains) {
                            ((uzg) hzgVar).g();
                            return;
                        } else if (lok0Var2 != null) {
                            ((uzg) hzgVar).o(lok0Var2.f20396a, lok0Var2.b);
                            return;
                        } else {
                            N(eebVar, j);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = jigVar instanceof iig;
        byte b2 = 3;
        oeg0 oeg0Var = this.u;
        if (z) {
            iig iigVar = (iig) jigVar;
            int iOrdinal = iigVar.b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return;
                }
                i3t0.K(this, null, null, new uw(this, iigVar.f14827a, r4, (byte) 2), 3);
                return;
            }
            long j2 = iigVar.f14827a;
            mig migVar2 = ((sig) D()).h;
            if (migVar2 != null) {
                Object obj6 = migVar2.f21844a;
                e0g0 e0g0Var2 = j0g0.b;
                if (obj6 instanceof g0g0) {
                    obj6 = null;
                }
                List list2 = (List) obj6;
                if (list2 != null) {
                    for (Object obj7 : list2) {
                        if (((eeb) obj7).f7663a == j2) {
                            obj3 = obj7;
                            break;
                        }
                    }
                    eeb eebVar2 = (eeb) obj3;
                    if (eebVar2 != null) {
                        oeg0Var.c().d(new mz0((Object) this, j2, (Object) new npn(j2, eebVar2.i, Long.valueOf(eebVar2.g), (boolean) (this.o != sip.c ? (byte) 0 : (byte) 1)), (byte) 10));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (jigVar instanceof eig) {
            long j3 = ((eig) jigVar).f7858a;
            if (!((sig) D()).k) {
                i3t0.K(this, null, null, new uig(this, r4, b2), 3);
            }
            i3t0.K(this, null, null, new uw(this, j3, r4, (byte) 2), 3);
            return;
        }
        if (jigVar.equals(gig.f11344a)) {
            List list3 = ((sig) D()).l;
            if (list3.size() != 1) {
                oeg0Var.c().d(new v4f(this, CollectionsKt.L0(list3), (byte) 20));
                return;
            }
            long jLongValue = ((Number) CollectionsKt.U(list3)).longValue();
            mig migVar3 = ((sig) D()).h;
            if (migVar3 != null) {
                Object obj8 = migVar3.f21844a;
                e0g0 e0g0Var3 = j0g0.b;
                if (obj8 instanceof g0g0) {
                    obj8 = null;
                }
                List list4 = (List) obj8;
                if (list4 != null) {
                    for (Object obj9 : list4) {
                        if (((eeb) obj9).f7663a == jLongValue) {
                            r4 = obj9;
                            break;
                        }
                    }
                    eeb eebVar3 = (eeb) r4;
                    if (eebVar3 != null) {
                        N(eebVar3, jLongValue);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (jigVar.equals(fig.f9585a)) {
            i3t0.K(this, null, null, new uig(this, r4, (byte) 4), 3);
            return;
        }
        if (jigVar.equals(cig.f4412a)) {
            M();
            bby bbyVar = this.H;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            this.H = i3t0.K(this, null, null, new uig(this, r4, (byte) 2), 3);
            bby bbyVar2 = this.I;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            this.I = i3t0.K(this, null, null, new uig(this, r4, b), 3);
            return;
        }
        if (!jigVar.equals(big.f2658a)) {
            t9f.b();
            return;
        }
        bby bbyVar3 = this.F;
        if (bbyVar3 != null) {
            e3c.n(bbyVar3);
        }
        c4m0 c4m0Var = this.G;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        bby bbyVar4 = this.H;
        if (bbyVar4 != null) {
            e3c.n(bbyVar4);
        }
        bby bbyVar5 = this.I;
        if (bbyVar5 != null) {
            e3c.n(bbyVar5);
        }
    }
}
