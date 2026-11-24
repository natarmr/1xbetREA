package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class zyn0 extends i3t0 {
    public static final /* synthetic */ int u0 = 0;
    public final i1w0 A;
    public final boolean B;
    public final mne C;
    public final h0q0 D;
    public final fht0 E;
    public final rrd F;
    public final uii G;
    public final v88 H;
    public final sa10 I;
    public final j1q0 J;
    public final ctf0 K;
    public final mi9 L;
    public final mxt M;
    public final e41 N;
    public final cmt O;
    public final zwu P;
    public final mrt Q;
    public final nrt R;
    public final zlt0 S;
    public final nw20 T;
    public final phf0 U;
    public final zpu V;
    public final mi9 W;
    public final k7u X;
    public final ilt0 Y;
    public final bsc Z;
    public final m1e a0;
    public final duj b0;
    public final pmi0 c0;
    public final pru d0;
    public final r9u e0;
    public final bsc f0;
    public final fuj0 g0;
    public final p7m0 h0;
    public final n0o0 i0;
    public final n0o0 j0;
    public final n0o0 k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final vzg0 o;
    public boolean o0;
    public final s31 p;
    public bby p0;
    public final pzu q;
    public bby q0;
    public final yfu r;
    public bby r0;
    public final mxt s;
    public bby s0;
    public final z7u t;
    public bby t0;
    public final vyt u;
    public final m6m0 v;
    public final ali w;
    public final zri x;
    public final wyu y;
    public final z220 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyn0(vzg0 vzg0Var, s31 s31Var, pzu pzuVar, yfu yfuVar, mxt mxtVar, z7u z7uVar, vyt vytVar, m6m0 m6m0Var, ali aliVar, zri zriVar, wyu wyuVar, z220 z220Var, i1w0 i1w0Var, boolean z, mne mneVar, h0q0 h0q0Var, fht0 fht0Var, rrd rrdVar, uii uiiVar, v88 v88Var, sa10 sa10Var, j1q0 j1q0Var, ctf0 ctf0Var, mi9 mi9Var, mxt mxtVar2, e41 e41Var, cmt cmtVar, zwu zwuVar, mrt mrtVar, nrt nrtVar, zlt0 zlt0Var, nw20 nw20Var, phf0 phf0Var, zpu zpuVar, mi9 mi9Var2, k7u k7uVar, ilt0 ilt0Var, bsc bscVar, m1e m1eVar, duj dujVar, pmi0 pmi0Var, pru pruVar, r9u r9uVar, bsc bscVar2) {
        super(null, new a7n0((byte) 22), new h0j0(ctf0Var, (byte) 11), cvm0.p(mneVar.c, mneVar.f22085a), null);
        wyuVar.getClass();
        j1q0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = s31Var;
        this.q = pzuVar;
        this.r = yfuVar;
        this.s = mxtVar;
        this.t = z7uVar;
        this.u = vytVar;
        this.v = m6m0Var;
        this.w = aliVar;
        this.x = zriVar;
        this.y = wyuVar;
        this.z = z220Var;
        this.A = i1w0Var;
        this.B = z;
        this.C = mneVar;
        this.D = h0q0Var;
        this.E = fht0Var;
        this.F = rrdVar;
        this.G = uiiVar;
        this.H = v88Var;
        this.I = sa10Var;
        this.J = j1q0Var;
        this.K = ctf0Var;
        this.L = mi9Var;
        this.M = mxtVar2;
        this.N = e41Var;
        this.O = cmtVar;
        this.P = zwuVar;
        this.Q = mrtVar;
        this.R = nrtVar;
        this.S = zlt0Var;
        this.T = nw20Var;
        this.U = phf0Var;
        this.V = zpuVar;
        this.W = mi9Var2;
        this.X = k7uVar;
        this.Y = ilt0Var;
        this.Z = bscVar;
        this.a0 = m1eVar;
        this.b0 = dujVar;
        this.c0 = pmi0Var;
        this.d0 = pruVar;
        this.e0 = r9uVar;
        this.f0 = bscVar2;
        this.g0 = new fuj0((byte) 5);
        this.h0 = q7m0.a(new jsn0(-1.0d, 0L));
        this.i0 = maz.b(new yxn0(this, (byte) 1));
        this.j0 = maz.b(new yxn0(this, (byte) 2));
        this.k0 = maz.b(new yxn0(this, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        ayn0 ayn0Var;
        String str;
        if (zjeVar instanceof ayn0) {
            ayn0Var = (ayn0) zjeVar;
            int i = ayn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayn0Var.l = i - Integer.MIN_VALUE;
            } else {
                ayn0Var = new ayn0(this, zjeVar);
            }
        } else {
            ayn0Var = new ayn0(this, zjeVar);
        }
        Object objD0 = ayn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ayn0Var.l;
        if (i2 == 0) {
            z1x.P(objD0);
            pn40 pn40Var = pn40.f27267a;
            p7m0 p7m0Var = this.h0;
            String strC = pn40.c(((jsn0) p7m0Var.getValue()).f17062a, p3u0.c);
            long j = ((jsn0) p7m0Var.getValue()).b;
            ayn0Var.i = strC;
            ayn0Var.l = 1;
            ali aliVar = this.w;
            objD0 = qjj.d0(((mne) aliVar.d).b, new n1((Object) aliVar, j, (yje) null, (byte) 11), ayn0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
            str = strC;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ayn0Var.i;
            z1x.P(objD0);
        }
        return w6x.q(str, Separators.SP, ((xuf) objD0).f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0277  */
    /* JADX WARN: Code duplicated, block: B:103:0x028c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:86:0x020a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x0233  */
    /* JADX WARN: Code duplicated, block: B:98:0x0262  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [a.yje, java.lang.String, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0262 -> B:15:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object N(a.zje r36) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zyn0.N(a.zje):java.lang.Object");
    }

    public final void O(Throwable th, kka kkaVar, kka kkaVar2, bpn0 bpn0Var) {
        boolean z = th instanceof zhi0;
        ctf0 ctf0Var = this.K;
        hxn0 hxn0Var = hxn0.f13818a;
        if (!z) {
            G(new ixn0(ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0))));
            G(hxn0Var);
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        int errorCode = zhi0Var.c.getErrorCode();
        int iOrdinal = bpn0Var.ordinal();
        e41 e41Var = this.N;
        s31 s31Var = this.p;
        if (iOrdinal == 0) {
            aon0[] aon0VarArr = aon0.f1211a;
            s31Var.G(Integer.valueOf(errorCode), "swipe_right");
            e41Var.c(Integer.valueOf(errorCode), "swipe_right");
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        } else {
            aon0[] aon0VarArr2 = aon0.f1211a;
            s31Var.G(Integer.valueOf(errorCode), "check");
            e41Var.c(Integer.valueOf(errorCode), "check");
        }
        kuw kuwVar = zhi0Var.c;
        if (kuwVar == i2o.CoefficientChangeCode) {
            if (kkaVar.j.e > kkaVar2.j.e) {
                G(new jxn0(ctf0Var.b.a(R.string.bet_error_coef_down, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_snack_down));
            } else {
                G(new jxn0(ctf0Var.b.a(R.string.bet_error_coef_up, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_snack_up));
            }
            G(hxn0Var);
            return;
        }
        if (kuwVar == i2o.CoefficientTemporarilyBlocked || kuwVar == i2o.CoefficientBlockCode) {
            G(new jxn0(ctf0Var.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_snack_lock));
            S();
            return;
        }
        if (kuwVar == i2o.TryAgainLaterError) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            G(new ixn0(message));
            G(hxn0Var);
            return;
        }
        if (kuwVar == i2o.q) {
            G(mxn0.f22565a);
            G(hxn0Var);
        } else {
            G(new ixn0(ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0))));
            S();
        }
    }

    public final void P(boolean z) {
        v3c.N(this.q0);
        this.q0 = sac.V(jiu0.a(this), new zxn0(this, (byte) 1), null, this.C.f22085a, new xj1((diu0) this, z, (yje) null, (byte) 20), 10);
    }

    public final void Q() {
        v3c.N(this.r0);
        this.r0 = sac.V(jiu0.a(this), new zxn0(this, (byte) 2), null, this.C.f22085a, new gc1((Object) this, (yje) null, (byte) 23), 10);
    }

    public final void R() {
        Object value;
        if (((vxn0) D()).f) {
            return;
        }
        i1w0 i1w0Var = this.A;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(m6m0.i(this.v));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                break;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, null, false, false, false, false, false, false, null, null, null, null, null, false, false, false, null, 130943)));
    }

    public final void S() {
        v3c.N(this.s0);
        this.s0 = sac.V(jiu0.a(this), lyn0.f20871a, null, this.C.f22085a, new z8b0(this, null, (byte) 27), 10);
    }

    public final void T() {
        if (((vxn0) D()).p) {
            return;
        }
        G(new nxn0((ra10) this.j0.getValue(), true));
    }

    public final void U() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, null, false, false, false, true, false, false, null, null, null, null, null, false, false, false, null, 131023)));
        this.A.d(new zxn0(this, (byte) 0));
        this.p.f31532a.c("swipex_onboard_call");
        this.N.f7161a.a(xun.f41520a, 3123L);
    }

    public final void V() {
        v3c.N(this.p0);
        this.p0 = sac.V(jiu0.a(this), myn0.f22611a, null, this.C.f22085a, new wbl0(this, null, (byte) 5), 10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r1.m(r10, (a.ql5) r12, r5, r6) == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(a.zh7 r11, a.zje r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.syn0
            if (r0 == 0) goto L14
            r0 = r12
            a.syn0 r0 = (a.syn0) r0
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
            a.syn0 r0 = new a.syn0
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.l
            a.wne r0 = a.wne.f39444a
            int r1 = r6.n
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r12)
            goto L92
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r4
        L33:
            long r10 = r6.k
            long r7 = r6.j
            a.nw20 r1 = r6.i
            a.z1x.P(r12)
            goto L7c
        L3d:
            a.z1x.P(r12)
            a.zlt0 r12 = r10.S
            boolean r12 = r12.n()
            if (r12 != 0) goto L4b
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        L4b:
            java.lang.String r11 = r11.b
            java.lang.Long r11 = kotlin.text.StringsKt.t0(r11)
            if (r11 == 0) goto L92
            long r7 = r11.longValue()
            a.p7m0 r11 = r10.h0
            java.lang.Object r11 = r11.getValue()
            a.jsn0 r11 = (a.jsn0) r11
            long r11 = r11.b
            a.phf0 r1 = r10.U
            a.i89 r1 = r1.m()
            a.nw20 r10 = r10.T
            r6.i = r10
            r6.j = r7
            r6.k = r11
            r6.n = r3
            java.lang.Object r1 = a.ntb.K(r1, r6)
            if (r1 != r0) goto L78
            goto L91
        L78:
            r9 = r1
            r1 = r10
            r10 = r11
            r12 = r9
        L7c:
            a.ql5 r12 = (a.ql5) r12
            long[] r5 = new long[r3]
            r3 = 0
            r5[r3] = r7
            r6.i = r4
            r6.j = r7
            r6.n = r2
            r2 = r10
            r4 = r12
            java.lang.Object r10 = r1.m(r2, r4, r5, r6)
            if (r10 != r0) goto L92
        L91:
            return r0
        L92:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zyn0.W(a.zh7, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object X(boolean z, zje zjeVar) {
        vyn0 vyn0Var;
        boolean z2;
        Object value;
        if (zjeVar instanceof vyn0) {
            vyn0Var = (vyn0) zjeVar;
            int i = vyn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyn0Var.l = i - Integer.MIN_VALUE;
            } else {
                vyn0Var = new vyn0(this, zjeVar);
            }
        } else {
            vyn0Var = new vyn0(this, zjeVar);
        }
        Object obj = vyn0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = vyn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            vyn0Var.i = z;
            vyn0Var.l = 1;
            Object objN = N(vyn0Var);
            if (objN == obj2) {
                return obj2;
            }
            z2 = z;
            obj = objN;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = vyn0Var.i;
            z1x.P(obj);
            z2 = z3;
        }
        a4x a4xVar = (a4x) obj;
        if (!a4xVar.isEmpty() && !((vxn0) D()).b.isEmpty()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, vxn0.a((vxn0) value, dyb.o0(a4xVar), null, false, z2, false, false, false, false, null, null, null, null, null, false, false, false, null, 130854)));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r8 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(a.kka r6, boolean r7, a.zje r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof a.wyn0
            if (r0 == 0) goto L13
            r0 = r8
            a.wyn0 r0 = (a.wyn0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.wyn0 r0 = new a.wyn0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r8)
            goto L57
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r8)
            goto L49
        L35:
            a.z1x.P(r8)
            a.uoy r8 = r6.l
            a.uoy r2 = a.uoy.LIVE
            if (r8 != r2) goto L4c
            r0.k = r4
            a.fht0 r8 = r5.E
            java.lang.Object r8 = r8.m(r6, r7, r4, r0)
            if (r8 != r1) goto L49
            goto L56
        L49:
            a.kka r8 = (a.kka) r8
            goto L59
        L4c:
            r0.k = r3
            a.h0q0 r8 = r5.D
            java.lang.Object r8 = r8.u(r6, r7, r4, r0)
            if (r8 != r1) goto L57
        L56:
            return r1
        L57:
            a.kka r8 = (a.kka) r8
        L59:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            a.vzg0 r5 = r5.o
            java.lang.String r7 = "EVENT_CASH_KEY"
            r5.e(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zyn0.Y(a.kka, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:17:0x0042, B:37:0x00a4, B:39:0x00ac, B:27:0x007b, B:29:0x0081, B:31:0x0089, B:33:0x008d, B:40:0x00b1, B:41:0x00b4, B:42:0x00b5, B:26:0x006a), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:17:0x0042, B:37:0x00a4, B:39:0x00ac, B:27:0x007b, B:29:0x0081, B:31:0x0089, B:33:0x008d, B:40:0x00b1, B:41:0x00b4, B:42:0x00b5, B:26:0x006a), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:17:0x0042, B:37:0x00a4, B:39:0x00ac, B:27:0x007b, B:29:0x0081, B:31:0x0089, B:33:0x008d, B:40:0x00b1, B:41:0x00b4, B:42:0x00b5, B:26:0x006a), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00db: INVOKE (r11 I:a.i050), (r7 I:java.lang.Object) INTERFACE call: a.i050.c(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:220), block:B:48:0x00db */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a2 -> B:37:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00aa -> B:39:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Z(a.zje r15) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zyn0.Z(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[Catch: all -> 0x0125, TryCatch #1 {all -> 0x0125, blocks: (B:56:0x0129, B:28:0x00a1, B:30:0x00a7, B:32:0x00af, B:42:0x00de, B:57:0x0130, B:58:0x0135, B:59:0x0136), top: B:69:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00af A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #1 {all -> 0x0125, blocks: (B:56:0x0129, B:28:0x00a1, B:30:0x00a7, B:32:0x00af, B:42:0x00de, B:57:0x0130, B:58:0x0135, B:59:0x0136), top: B:69:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:44:0x00e7, B:46:0x00ed, B:49:0x00fb, B:26:0x008c), top: B:70:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d1 -> B:38:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e5 -> B:39:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0127 -> B:69:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a0(java.lang.Throwable r20, a.kka r21, a.bpn0 r22, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zyn0.a0(java.lang.Throwable, a.kka, a.bpn0, a.zje):java.lang.Object");
    }

    @Override // a.diu0
    public final void v() {
        ((yvn0) this.P.f45126a.d).g = 0L;
    }

    @Override // a.i3t0, a.k3t0
    public final gmq w() {
        yje yjeVar = null;
        return new dnq(new fnq(super.w(), new byn0(this, yjeVar, (byte) 0)), new sye0(this, yjeVar, (byte) 13), (byte) 0);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        gsn0 gsn0Var = (gsn0) obj;
        gsn0Var.getClass();
        super.x(gsn0Var);
        boolean z = gsn0Var instanceof qrn0;
        byte b = 2;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        yje yjeVar = null;
        if (z) {
            qrn0 qrn0Var = (qrn0) gsn0Var;
            if (qrn0Var.equals(mrn0.f22282a)) {
                sac.V(jiu0.a(this), iyn0.f15597a, null, null, new byn0(this, yjeVar, b), 14);
                return;
            }
            if (qrn0Var.equals(orn0.f25742a)) {
                E();
                return;
            }
            if (qrn0Var instanceof nrn0) {
                sac.V(jiu0.a(this), dyn0.f6902a, null, null, new lcl0((nrn0) qrn0Var, this, yjeVar, (byte) 11), 14);
                return;
            }
            if (!qrn0Var.equals(prn0.f27475a)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, vxn0.a((vxn0) value2, null, null, false, false, false, false, false, false, null, null, null, null, null, false, false, false, null, 98303)));
            return;
        }
        if (!(gsn0Var instanceof fsn0)) {
            t9f.b();
            return;
        }
        fsn0 fsn0Var = (fsn0) gsn0Var;
        boolean zEquals = fsn0Var.equals(srn0.f32687a);
        i1w0 i1w0Var = this.A;
        if (!zEquals) {
            byte b2 = 1;
            if (fsn0Var.equals(trn0.f34428a)) {
                sac.V(jiu0.a(this), jyn0.f17368a, null, null, new gyn0(this, yjeVar, b2), 14);
                return;
            }
            if (fsn0Var instanceof urn0) {
                if (((urn0) fsn0Var).f36173a) {
                    sac.V(jiu0.a(this), iyn0.f15597a, null, null, new byn0(this, yjeVar, b), 14);
                }
                S();
                return;
            }
            if (fsn0Var.equals(xrn0.f41378a)) {
                R();
                return;
            }
            boolean zEquals2 = fsn0Var.equals(yrn0.f43129a);
            e41 e41Var = this.N;
            s31 s31Var = this.p;
            if (zEquals2) {
                i8i.D("action", "later", s31Var.f31532a, "swipex_filter_recommend_popup_action");
                b1j.v("later", e41Var.f7161a, 3129L);
                return;
            }
            if (fsn0Var.equals(zrn0.f44864a)) {
                i8i.D("action", "filter", s31Var.f31532a, "swipex_filter_recommend_popup_action");
                b1j.v("filter", e41Var.f7161a, 3129L);
                return;
            }
            if (fsn0Var instanceof asn0) {
                int iOrdinal = ((asn0) fsn0Var).f1399a.ordinal();
                if (iOrdinal == 0) {
                    aon0[] aon0VarArr = aon0.f1211a;
                    s31Var.G(null, "swipe_left");
                    e41Var.c(null, "swipe_left");
                    return;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    aon0[] aon0VarArr2 = aon0.f1211a;
                    s31Var.G(null, "cross");
                    e41Var.c(null, "cross");
                    return;
                }
            }
            boolean z2 = fsn0Var instanceof dsn0;
            byte b3 = 4;
            mne mneVar = this.C;
            if (z2) {
                sac.V(jiu0.a(this), kyn0.f19114a, null, mneVar.f22085a, new wbl0(this, ((dsn0) fsn0Var).f6619a, yjeVar, b3), 10);
                return;
            }
            boolean zEquals3 = fsn0Var.equals(bsn0.f3139a);
            p7m0 p7m0Var2 = this.h0;
            v88 v88Var = this.H;
            cmt cmtVar = this.O;
            if (zEquals3) {
                s31Var.f31532a.a("deposit_call", wp20.b(new Pair("screen", "no_money_xswipe")));
                String strG = cmtVar.g();
                e41Var.getClass();
                e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p("no_money_xswipe", (byte) 0), new j1p(strG, (byte) 2)}), 3043L);
                v88Var.a(i1w0Var, true, ((jsn0) p7m0Var2.getValue()).b);
                return;
            }
            if (!(fsn0Var instanceof esn0)) {
                if (fsn0Var.equals(rrn0.f30993a)) {
                    if (((vxn0) D()).e || ((vxn0) D()).f) {
                        return;
                    }
                    s31Var.f31532a.a("deposit_call", wp20.b(new Pair("screen", "swipex")));
                    String strG2 = cmtVar.g();
                    e41Var.getClass();
                    e41Var.f7161a.a(tx3.l0(new k1p[]{new j1p("swipex", (byte) 0), new j1p(strG2, (byte) 2)}), 3043L);
                    v88Var.a(i1w0Var, true, ((jsn0) p7m0Var2.getValue()).b);
                    return;
                }
                if (fsn0Var.equals(csn0.f4899a)) {
                    return;
                }
                if (fsn0Var.equals(vrn0.f37908a)) {
                    sac.V(jiu0.a(this), null, null, mneVar.f22085a, new gyn0(this, null, (byte) 2), 11);
                    return;
                }
                if (!fsn0Var.equals(wrn0.f39652a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, vxn0.a((vxn0) value, null, null, false, false, false, false, false, false, null, null, null, null, null, false, false, false, null, 65535)));
                return;
            }
            int i = ((esn0) fsn0Var).f8338a;
            if (((vxn0) D()).b.isEmpty()) {
                return;
            }
            g5l0 g5l0Var = (g5l0) CollectionsKt.W(i, ((vxn0) D()).b);
            if (g5l0Var != null) {
                long j = g5l0Var.f10726a;
                h97.x("filter", Long.valueOf(j), s31Var.f31532a, "swipex_filter_game_call");
                e41Var.f7161a.a(cui0.b(new i1p((byte) 2, j)), 11372L);
                i1w0Var.d(new itn0(this, g5l0Var, (byte) 4));
                return;
            }
            h97.x("filter", 0L, s31Var.f31532a, "swipex_filter_game_call");
            h97.r(0L, e41Var.f7161a, 11372L);
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.h(m6m0.i(this.v));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (((vxn0) D()).f) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
