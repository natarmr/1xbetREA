package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class hh2 extends i3t0 {
    public static final /* synthetic */ int O = 0;
    public final w5z A;
    public final kd30 B;
    public final hjd C;
    public final g2g0 D;
    public final m1e E;
    public final svu F;
    public final mne G;
    public final i1w0 H;
    public final ctf0 I;
    public final duj J;
    public c4m0 K;
    public bby L;
    public bby M;
    public bby N;
    public final vzg0 o;
    public final pru p;
    public final r9u q;
    public final j3c r;
    public final lbu s;
    public final luu t;
    public final y78 u;
    public final g2v v;
    public final yzn0 w;
    public final o470 x;
    public final nhf0 y;
    public final vpt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public hh2(vzg0 vzg0Var, pru pruVar, r9u r9uVar, j3c j3cVar, lbu lbuVar, luu luuVar, y78 y78Var, g2v g2vVar, yzn0 yzn0Var, o470 o470Var, nhf0 nhf0Var, vpt vptVar, w5z w5zVar, kd30 kd30Var, hjd hjdVar, g2g0 g2g0Var, m1e m1eVar, svu svuVar, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, duj dujVar) {
        r9uVar.getClass();
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new wg2(vzg0Var, (byte) 0), g090VarP, new uc(ctf0Var, (byte) 22), (yzn0) null);
        this.o = vzg0Var;
        this.p = pruVar;
        this.q = r9uVar;
        this.r = j3cVar;
        this.s = lbuVar;
        this.t = luuVar;
        this.u = y78Var;
        this.v = g2vVar;
        this.w = yzn0Var;
        this.x = o470Var;
        this.y = nhf0Var;
        this.z = vptVar;
        this.A = w5zVar;
        this.B = kd30Var;
        this.C = hjdVar;
        this.D = g2g0Var;
        this.E = m1eVar;
        this.F = svuVar;
        this.G = mneVar;
        this.H = i1w0Var;
        this.I = ctf0Var;
        this.J = dujVar;
        i3t0.K(this, null, null, new za(this, yjeVar, (byte) 9), 3);
        i3t0.K(this, null, null, new bu(this, yjeVar, (byte) 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[PHI: r2 r6
  0x0088: PHI (r2v6 a.eat) = (r2v5 a.eat), (r2v7 a.eat) binds: [B:30:0x0077, B:35:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r6v3 a.eat) = (r6v2 a.eat), (r6v4 a.eat) binds: [B:30:0x0077, B:35:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (O(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (P(r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.xg2
            if (r0 == 0) goto L13
            r0 = r8
            a.xg2 r0 = (a.xg2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.xg2 r0 = new a.xg2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r8)
            goto L9d
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L35:
            a.eat r2 = r0.j
            a.eat r5 = r0.i
            a.z1x.P(r8)
            goto L87
        L3d:
            a.eat r2 = r0.j
            a.eat r6 = r0.i
            a.z1x.P(r8)
            goto L71
        L45:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.D()
            a.ug2 r8 = (a.ug2) r8
            a.hat r8 = r8.c
            boolean r2 = r8 instanceof a.eat
            if (r2 == 0) goto L58
            a.eat r8 = (a.eat) r8
            r2 = r8
            goto L59
        L58:
            r2 = r3
        L59:
            if (r2 == 0) goto L9d
            java.util.List r8 = r2.f7485a
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L70
            r0.i = r2
            r0.j = r2
            r0.m = r6
            java.lang.Object r8 = r7.O(r0)
            if (r8 != r1) goto L70
            goto L9c
        L70:
            r6 = r2
        L71:
            java.util.List r8 = r2.b
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L88
            r0.i = r6
            r0.j = r2
            r0.m = r5
            java.lang.Object r8 = r7.N(r0)
            if (r8 != r1) goto L86
            goto L9c
        L86:
            r5 = r6
        L87:
            r6 = r5
        L88:
            java.util.List r8 = r2.c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L9d
            r0.i = r6
            r0.j = r3
            r0.m = r4
            java.lang.Object r7 = r7.P(r0)
            if (r7 != r1) goto L9d
        L9c:
            return r1
        L9d:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hh2.M(a.zje):java.lang.Object");
    }

    public final Object N(zje zjeVar) throws n7p {
        Object objV = this.y.v(xvs.LINE, this.p.a().C0 ? new f9n0(this.z.a()) : g9n0.f10923a, zjeVar);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    public final Object O(zje zjeVar) throws n7p {
        Object objV = this.y.v(xvs.LIVE, this.p.a().C0 ? new f9n0(this.z.a()) : g9n0.f10923a, zjeVar);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    public final Object P(zje zjeVar) throws n7p {
        Object objV = this.y.v(xvs.COMPLETE, this.p.a().C0 ? new f9n0(this.z.a()) : g9n0.f10923a, zjeVar);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    public final dh2 Q(Throwable th) {
        Object value;
        boolean z = ((ug2) D()).g;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ug2.a((ug2) value, null, false, null, false, false, false, false, null, null, null, false, 1983)));
        hg2 hg2Var = ((ug2) D()).f35602a;
        return new dh2(i120.W(new fnq(this.B.M(z, hg2Var != null ? hg2Var.c : this.p.a().J1), new y32(this, null, (byte) 3), (byte) 4)), th, (byte) 0);
    }

    public final void R() {
        Object value;
        bby bbyVar = this.L;
        if (bbyVar == null || !bbyVar.isActive()) {
            if ((((ug2) D()).c instanceof dat) && ((ug2) D()).g) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, ug2.a((ug2) value, null, false, fat.f9225a, false, false, false, false, null, null, null, false, 2043)));
            }
            this.L = sac.V(jiu0.a(this), new ln1(1, this, hh2.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.G.b, new oa((Object) this, (yje) null, (byte) 12), 10);
        }
    }

    public final void S(Throwable th) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            th.getClass();
        } while (!p7m0Var.m(value, ug2.a((ug2) value, null, false, new dat(th), false, false, false, false, null, null, null, false, 2027)));
        this.J.b(th, new ma2((byte) 9));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        gg2 gg2Var = (gg2) obj;
        gg2Var.getClass();
        super.x(gg2Var);
        if (gg2Var.equals(qf2.f28608a)) {
            E();
            return;
        }
        boolean zEquals = gg2Var.equals(pf2.f26879a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (zEquals) {
            c4m0 c4m0Var = this.K;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.L;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.M;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            bby bbyVar3 = this.N;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value10 = p7m0Var.getValue();
                value10.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value10, ug2.a((ug2) value10, null, false, null, false, false, false, false, null, null, null, false, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
            return;
        }
        byte b = 1;
        if (gg2Var.equals(rf2.f30365a)) {
            c4m0 c4m0Var2 = this.K;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.K = slb.U(new dnq(new fnq(this.E.b(), new pa((Object) this, yjeVar, (byte) 23), (byte) 4), new fh2(this, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), this.G.f22085a));
            }
            v3c.N(this.M);
            v3c.N(this.N);
            this.M = i3t0.F(this, this.C, null, null, new ma2((byte) 7), 119);
            this.N = i3t0.F(this, this.D, null, null, new ma2((byte) 8), 119);
            return;
        }
        if (gg2Var instanceof sf2) {
            i3t0.A(this, this.C, ((sf2) gg2Var).f32098a, null, null, 6);
            return;
        }
        if (gg2Var instanceof tf2) {
            i3t0.A(this, this.C, ebc.n0(((tf2) gg2Var).f33847a), null, null, 6);
            return;
        }
        if (gg2Var instanceof eg2) {
            i3t0.A(this, this.D, q0x.U(((eg2) gg2Var).f7741a), null, null, 6);
            return;
        }
        if (gg2Var.equals(zf2.f44282a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value9 = p7m0Var2.getValue();
                value9.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value9, ug2.a((ug2) value9, null, false, null, false, false, true, true, null, null, null, false, 1951)));
            R();
            return;
        }
        if (gg2Var.equals(ag2.f808a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value8 = p7m0Var3.getValue();
                value8.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value8, ug2.a((ug2) value8, null, false, null, false, true, true, true, null, null, null, false, 1935)));
            v3c.N(this.L);
            R();
            return;
        }
        if (gg2Var.equals(fg2.f9471a)) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value7 = p7m0Var4.getValue();
                value7.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value7, ug2.a((ug2) value7, null, false, null, true, false, false, false, null, null, null, false, 2039)));
            return;
        }
        if (gg2Var.equals(cg2.f4292a)) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value6 = p7m0Var5.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value6, ug2.a((ug2) value6, null, false, null, false, false, false, false, null, null, null, false, 2039)));
            return;
        }
        if (!gg2Var.equals(vf2.f37311a)) {
            boolean z = gg2Var instanceof xf2;
            sg2 sg2Var = sg2.f32139a;
            if (z) {
                G(sg2Var);
                return;
            }
            if (gg2Var instanceof bg2) {
                int i = ((bg2) gg2Var).f2534a;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    G(sg2Var);
                    return;
                } else {
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var6.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var6.m(value4, ug2.a((ug2) value4, null, false, null, false, false, false, false, null, null, null, true, 1023)));
                    return;
                }
            }
            boolean z2 = gg2Var instanceof yf2;
            vzg0 vzg0Var = this.o;
            if (z2) {
                p7m0 p7m0Var7 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var7.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var7.m(value3, ug2.a((ug2) value3, null, false, null, false, false, false, false, null, ((yf2) gg2Var).f42521a, null, false, 1791)));
                vzg0Var.e("PENDING_DELETE_GAME_GROUPS", ((yf2) gg2Var).f42521a);
                G(rg2.f30412a);
                return;
            }
            if (gg2Var.equals(wf2.f39047a)) {
                List list = ((ug2) D()).i;
                p7m0 p7m0Var8 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var8.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var8.m(value2, ug2.a((ug2) value2, null, false, null, false, false, false, false, null, null, null, false, 1791)));
                vzg0Var.e("PENDING_DELETE_GAME_GROUPS", null);
                i3t0.K(this, null, null, new gh2(this, list, null), 3);
                return;
            }
            if (!(gg2Var instanceof dg2)) {
                if (gg2Var.equals(uf2.f35559a)) {
                    G(og2.f25196a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var9 = ocjVar.f25029a;
            do {
                value = p7m0Var9.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var9.m(value, ug2.a((ug2) value, null, false, null, false, false, false, false, null, null, ((dg2) gg2Var).f6028a, false, 1535)));
            return;
        }
        if (((ug2) D()).k) {
            p7m0 p7m0Var10 = ocjVar.f25029a;
            do {
                value5 = p7m0Var10.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var10.m(value5, ug2.a((ug2) value5, null, false, null, false, false, false, false, null, null, "", false, 511)));
            return;
        }
        i1w0 i1w0Var = this.H;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
