package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2;

/* JADX INFO: loaded from: classes3.dex */
public final class pn10 extends i3t0 {
    public static final /* synthetic */ int e0 = 0;
    public final z4u A;
    public final gmt B;
    public final wsf0 C;
    public final je D;
    public final hs60 E;
    public final ih5 F;
    public final ipu G;
    public final lbu H;
    public final oct I;
    public final gle0 J;
    public final qa60 K;
    public final v88 L;
    public final l7k M;
    public final cmt N;
    public final fpx O;
    public final tni0 P;
    public final g9c Q;
    public final kyg0 R;
    public final ikt0 S;
    public final xcc T;
    public x9v0 U;
    public sxk0 V;
    public csr W;
    public boolean X;
    public bby Y;
    public bby Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public final c4m0 d0;
    public final i1w0 o;
    public final ctf0 p;
    public final mne q;
    public final y3v r;
    public final n660 s;
    public final gxu t;
    public final fq u;
    public final ycu v;
    public final ucu w;
    public final dcu x;
    public final yfu y;
    public final qqc z;

    public pn10(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, y3v y3vVar, n660 n660Var, gxu gxuVar, fq fqVar, ycu ycuVar, ucu ucuVar, dcu dcuVar, yfu yfuVar, qqc qqcVar, z4u z4uVar, gmt gmtVar, wsf0 wsf0Var, je jeVar, hs60 hs60Var, ih5 ih5Var, ipu ipuVar, lbu lbuVar, oct octVar, gle0 gle0Var, wni0 wni0Var, qa60 qa60Var, v88 v88Var, l7k l7kVar, cmt cmtVar, fpx fpxVar, tni0 tni0Var, g9c g9cVar, kyg0 kyg0Var, ikt0 ikt0Var, xcc xccVar, m1e m1eVar) {
        fqVar.getClass();
        ucuVar.getClass();
        dcuVar.getClass();
        qqcVar.getClass();
        gmtVar.getClass();
        ipuVar.getClass();
        wni0Var.getClass();
        qa60Var.getClass();
        fpxVar.getClass();
        tni0Var.getClass();
        g9cVar.getClass();
        xccVar.getClass();
        gf10 gf10Var = new gf10((byte) 8);
        v510 v510Var = new v510(ctf0Var, (byte) 3);
        rwj rwjVar = mneVar.f22085a;
        super(null, gf10Var, v510Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = i1w0Var;
        this.p = ctf0Var;
        this.q = mneVar;
        this.r = y3vVar;
        this.s = n660Var;
        this.t = gxuVar;
        this.u = fqVar;
        this.v = ycuVar;
        this.w = ucuVar;
        this.x = dcuVar;
        this.y = yfuVar;
        this.z = qqcVar;
        this.A = z4uVar;
        this.B = gmtVar;
        this.C = wsf0Var;
        this.D = jeVar;
        this.E = hs60Var;
        this.F = ih5Var;
        this.G = ipuVar;
        this.H = lbuVar;
        this.I = octVar;
        this.J = gle0Var;
        this.K = qa60Var;
        this.L = v88Var;
        this.M = l7kVar;
        this.N = cmtVar;
        this.O = fpxVar;
        this.P = tni0Var;
        this.Q = g9cVar;
        this.R = kyg0Var;
        this.S = ikt0Var;
        this.T = xccVar;
        byte b = 1;
        this.a0 = true;
        this.b0 = m1eVar.c();
        csr csrVar = (csr) vzg0Var.a("lucky_wheel_bonus");
        csrVar = csrVar == null ? csr.e : csrVar;
        boolean z = this.b0;
        wni0Var.a(csrVar);
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            boolean z2 = z;
            if (p7m0Var.m(value, tm10.a((tm10) value, null, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, z2, false, false, null, null, 4063231))) {
                break;
            } else {
                z = z2;
            }
        }
        yje yjeVar = null;
        sac.V(jiu0.a(this), new zm10(this, (byte) 2), new an10(this, (byte) 0), mneVar.b, new en10(this, yjeVar, (byte) 0), 8);
        i3t0.K(this, mneVar.c, null, new bu(this, yjeVar, (byte) 11), 2);
        sac.V(jiu0.a(this), new p610((byte) 13), null, mneVar.f22085a, new en10(this, yjeVar, b), 10);
        c4m0 c4m0Var = this.d0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.d0 = slb.U(new fnq(i120.W(m1eVar.b()), new en10(this, yjeVar, (byte) 4), (byte) 4), jiu0.a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ql5 ql5Var, zje zjeVar) {
        fn10 fn10Var;
        if (zjeVar instanceof fn10) {
            fn10Var = (fn10) zjeVar;
            int i = fn10Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fn10Var.l = i - Integer.MIN_VALUE;
            } else {
                fn10Var = new fn10(this, zjeVar);
            }
        } else {
            fn10Var = new fn10(this, zjeVar);
        }
        Object obj = fn10Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fn10Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            this.R.a(ql5Var.f28916a);
            wsf0 wsf0Var = this.C;
            ot otVarB = wsf0Var.b();
            bm5 bm5Var = bm5.d;
            otVarB.a(bm5Var, ql5Var);
            jyg0 jyg0VarQ = wsf0Var.q();
            jyg0VarQ.f17359a.z(bm5Var, ql5Var.f28916a);
            hle hleVar = new hle(ql5Var, false);
            fn10Var.i = ql5Var;
            fn10Var.l = 1;
            if (this.u.f(hleVar, fn10Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = fn10Var.i;
            z1x.P(obj);
        }
        ikt0 ikt0Var = this.S;
        ikt0Var.getClass();
        ql5Var.getClass();
        go10 go10Var = (go10) ikt0Var.f14945a;
        long j = ql5Var.f28916a;
        double d = ql5Var.b;
        go10Var.d = Long.valueOf(j);
        go10Var.e = Double.valueOf(d);
        a0();
        return Unit.f46060a;
    }

    public final void N() {
        i1w0 i1w0Var = this.o;
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

    public final void O(Throwable th) {
        if (!this.b0 || agc.M(th)) {
            return;
        }
        sac.V(jiu0.a(this), new p610((byte) 12), null, this.q.f22085a, new juy((Object) this, (Object) th, (yje) null, (byte) 27), 10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce A[PHI: r2 r3 r12 r13
  0x00ce: PHI (r2v8 boolean) = (r2v7 boolean), (r2v9 boolean) binds: [B:28:0x00a3, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r3v5 boolean) = (r3v3 boolean), (r3v7 boolean) binds: [B:28:0x00a3, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r12v4 boolean) = (r12v2 boolean), (r12v6 boolean) binds: [B:28:0x00a3, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r13v17 a.ql5) = (r13v10 a.ql5), (r13v19 a.ql5) binds: [B:28:0x00a3, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (M(r13, r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(boolean r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pn10.P(boolean, a.zje):java.lang.Object");
    }

    public final void Q(jo10 jo10Var, boolean z, boolean z2) {
        bby bbyVar = this.Z;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.Z = sac.V(jiu0.a(this), new bt8(z2, this, jo10Var, z), null, this.q.b, new mt00(this, jo10Var, null, b), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object R(boolean z, zje zjeVar) {
        hn10 hn10Var;
        if (zjeVar instanceof hn10) {
            hn10Var = (hn10) zjeVar;
            int i = hn10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn10Var.k = i - Integer.MIN_VALUE;
            } else {
                hn10Var = new hn10(this, zjeVar);
            }
        } else {
            hn10Var = new hn10(this, zjeVar);
        }
        Object obj = hn10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hn10Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            nk10 nk10VarC = this.y.c();
            ly5 ly5Var = new ly5(0.0d, z ? lnm0.d : lnm0.e, false, nk10VarC.b, 1.0d, esr.NOTHING, nk10VarC.f23661a);
            hn10Var.k = 1;
            if (this.u.f(ly5Var, hn10Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r5.f(a.my5.f22588a, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.in10
            if (r0 == 0) goto L13
            r0 = r6
            a.in10 r0 = (a.in10) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.in10 r0 = new a.in10
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            a.fq r5 = r5.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            a.z1x.P(r6)
            goto L50
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            a.z1x.P(r6)
            goto L45
        L37:
            a.z1x.P(r6)
            r0.k = r4
            a.yy5 r6 = a.yy5.f43451a
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L45
            goto L4f
        L45:
            r0.k = r3
            a.my5 r6 = a.my5.f22588a
            java.lang.Object r5 = r5.f(r6, r0)
            if (r5 != r1) goto L50
        L4f:
            return r1
        L50:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pn10.S(a.zje):java.lang.Object");
    }

    public final void T(final jo10 jo10Var, final boolean z) {
        long millis;
        this.c0 = z;
        final x9v0 x9v0Var = this.U;
        if (x9v0Var == null) {
            return;
        }
        long j = x9v0Var.b;
        int i = x9v0Var.f40528a;
        final boolean z2 = false;
        this.X = j == 0 && i > 0;
        ctf0 ctf0Var = this.p;
        String strA = (j != 0 || i <= 0) ? ctf0Var.b.a(R.string.lucky_wheel_spin_for_money, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.lucky_wheel_free_spin_with_count_new, Arrays.copyOf(new Object[]{1}, 1));
        if (i > 1 && j == 0 && jo10Var == jo10.f16836a) {
            z2 = true;
        }
        final String strA2 = ctf0Var.b.a(R.string.lucky_wheel_spin_all_v2, Arrays.copyOf(new Object[]{Integer.valueOf(Integer.min(i, 100))}, 1));
        final boolean z3 = j > 0;
        if (z3) {
            millis = TimeUnit.SECONDS.toMillis(j) + System.currentTimeMillis();
        } else {
            millis = ((tm10) D()).n;
        }
        final long j2 = millis;
        final String str = strA;
        H(new Function2() { // from class: a.bn10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                tm10 tm10Var = (tm10) obj2;
                ((oyg0) obj).getClass();
                tm10Var.getClass();
                jo10 jo10Var2 = jo10.f16836a;
                jo10 jo10Var3 = jo10Var;
                return tm10.a(tm10Var, jo10Var3 == jo10Var2 ? io10.b : tm10Var.f34172a, null, null, x9v0Var.d, null, null, false, jo10Var3, str, z2, strA2, z3, j2, jo10Var3 == jo10Var2 && z, null, null, false, false, jo10Var3 != jo10Var2 ? tm10Var.t : false, null, null, 3375110);
            }
        });
    }

    public final void U() {
        if (!this.b0 || ((tm10) D()).b()) {
            return;
        }
        sac.V(jiu0.a(this), new p610((byte) 15), null, this.q.b, new en10(this, null, (byte) 2), 10);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115 A[LOOP:0: B:41:0x00ff->B:46:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011c A[EDGE_INSN: B:72:0x011c->B:48:0x011c BREAK  A[LOOP:0: B:41:0x00ff->B:46:0x0115], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object V(long j, csr csrVar, boolean z, zje zjeVar) {
        ln10 ln10Var;
        long j2;
        csr csrVar2;
        boolean z2;
        csr csrVar3;
        String str;
        a570 a570Var;
        long j3;
        boolean zBooleanValue;
        Object objK;
        boolean z3;
        long j4;
        String str2;
        a570 a570Var2;
        boolean z4;
        long j5;
        Iterator it;
        boolean z5;
        Object next;
        pbv pbvVar;
        s470 s470Var;
        yvs yvsVar;
        boolean z6;
        jz60 jz60Var;
        boolean z7;
        String str3;
        String str4;
        long j6;
        jz60 jz60Var2;
        boolean z8;
        boolean z9;
        if (zjeVar instanceof ln10) {
            ln10Var = (ln10) zjeVar;
            int i = ln10Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln10Var.r = i - Integer.MIN_VALUE;
            } else {
                ln10Var = new ln10(this, zjeVar);
            }
        } else {
            ln10Var = new ln10(this, zjeVar);
        }
        ln10 ln10Var2 = ln10Var;
        Object obj = ln10Var2.p;
        Object obj2 = wne.f39444a;
        int i2 = ln10Var2.r;
        if (i2 == 0) {
            z1x.P(obj);
            ln10Var2.j = csrVar;
            ln10Var2.i = j;
            ln10Var2.n = z;
            ln10Var2.r = 1;
            Object objA = this.v.a(j, ln10Var2);
            if (objA != obj2) {
                j2 = j;
                csrVar2 = csrVar;
                z2 = z;
                obj = objA;
            }
            return obj2;
        }
        if (i2 == 1) {
            z2 = ln10Var2.n;
            j2 = ln10Var2.i;
            csrVar2 = ln10Var2.j;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                z2 = ln10Var2.n;
                j3 = ln10Var2.i;
                str = ln10Var2.l;
                a570Var = ln10Var2.k;
                csrVar3 = ln10Var2.j;
                z1x.P(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                ln10Var2.j = csrVar3;
                ln10Var2.k = a570Var;
                ln10Var2.l = str;
                ln10Var2.i = j3;
                ln10Var2.n = z2;
                ln10Var2.o = zBooleanValue;
                ln10Var2.r = 3;
                objK = lbu.k(this.H, 0, ln10Var2, 3);
                if (objK != obj2) {
                    z3 = z2;
                    j4 = j3;
                    str2 = str;
                    a570Var2 = a570Var;
                    z4 = zBooleanValue;
                    obj = objK;
                    j5 = j4;
                    it = ((Iterable) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z5 = z3;
                            next = null;
                            break;
                        }
                        next = it.next();
                        z5 = z3;
                        if (((pbv) next).f26728a == j5) {
                            break;
                            break;
                        }
                        z3 = z5;
                    }
                    pbvVar = (pbv) next;
                    if (pbvVar != null) {
                        hds hdsVar = pbvVar.n;
                    }
                    s470Var = s470.LUCKY_WHEEL;
                    qqc qqcVar = this.z;
                    qqcVar.getClass();
                    aws awsVar = qqcVar.f29160a;
                    awsVar.getClass();
                    yvsVar = awsVar.f1590a;
                    if (s470Var == yvsVar.f43335a) {
                        yvsVar.f43335a = s470.GAME_UNAVAILABLE;
                    }
                    if (a570Var2 != null) {
                        z6 = a570Var2 instanceof w470;
                        jz60Var = jz60.f17395a;
                        if (z6) {
                            ln10Var2.j = null;
                            ln10Var2.k = null;
                            ln10Var2.l = str2;
                            ln10Var2.m = jz60Var;
                            ln10Var2.i = j5;
                            z9 = z5;
                            ln10Var2.n = z9;
                            ln10Var2.o = z4;
                            ln10Var2.r = 4;
                            if (W(j5, ln10Var2, csrVar3) != obj2) {
                                j6 = j5;
                                jz60Var2 = jz60Var;
                                z8 = z9;
                                str4 = str2;
                            }
                        } else {
                            z7 = z5;
                            if (a570Var2 instanceof z470) {
                                ln10Var2.j = null;
                                ln10Var2.k = null;
                                ln10Var2.l = str2;
                                ln10Var2.m = jz60Var;
                                ln10Var2.i = j5;
                                ln10Var2.n = z7;
                                ln10Var2.o = z4;
                                ln10Var2.r = 5;
                                str3 = str2;
                                if (X(j5, csrVar3, z4, str3, ln10Var2) != obj2) {
                                    str4 = str3;
                                    j6 = j5;
                                    jz60Var2 = jz60Var;
                                    z8 = z7;
                                }
                            }
                        }
                    }
                    t9f.b();
                    return null;
                }
                return obj2;
            }
            if (i2 == 3) {
                boolean z10 = ln10Var2.o;
                boolean z11 = ln10Var2.n;
                long j7 = ln10Var2.i;
                String str5 = ln10Var2.l;
                a570Var2 = ln10Var2.k;
                csrVar3 = ln10Var2.j;
                z1x.P(obj);
                z4 = z10;
                j4 = j7;
                z3 = z11;
                str2 = str5;
                j5 = j4;
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = z3;
                        next = null;
                        break;
                    }
                    next = it.next();
                    z5 = z3;
                    if (((pbv) next).f26728a == j5) {
                        break;
                    }
                    z3 = z5;
                }
                pbvVar = (pbv) next;
                if (pbvVar != null) {
                    hds hdsVar2 = pbvVar.n;
                }
                s470Var = s470.LUCKY_WHEEL;
                qqc qqcVar2 = this.z;
                qqcVar2.getClass();
                aws awsVar2 = qqcVar2.f29160a;
                awsVar2.getClass();
                yvsVar = awsVar2.f1590a;
                if (s470Var == yvsVar.f43335a) {
                    yvsVar.f43335a = s470.GAME_UNAVAILABLE;
                }
                if (a570Var2 != null) {
                    z6 = a570Var2 instanceof w470;
                    jz60Var = jz60.f17395a;
                    if (z6) {
                        ln10Var2.j = null;
                        ln10Var2.k = null;
                        ln10Var2.l = str2;
                        ln10Var2.m = jz60Var;
                        ln10Var2.i = j5;
                        z9 = z5;
                        ln10Var2.n = z9;
                        ln10Var2.o = z4;
                        ln10Var2.r = 4;
                        if (W(j5, ln10Var2, csrVar3) != obj2) {
                            j6 = j5;
                            jz60Var2 = jz60Var;
                            z8 = z9;
                            str4 = str2;
                        }
                        return obj2;
                    }
                    z7 = z5;
                    if (a570Var2 instanceof z470) {
                        ln10Var2.j = null;
                        ln10Var2.k = null;
                        ln10Var2.l = str2;
                        ln10Var2.m = jz60Var;
                        ln10Var2.i = j5;
                        ln10Var2.n = z7;
                        ln10Var2.o = z4;
                        ln10Var2.r = 5;
                        str3 = str2;
                        if (X(j5, csrVar3, z4, str3, ln10Var2) != obj2) {
                            str4 = str3;
                            j6 = j5;
                            jz60Var2 = jz60Var;
                            z8 = z7;
                        }
                        return obj2;
                    }
                }
                t9f.b();
                return null;
            }
            if (i2 != 4 && i2 != 5) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z8 = ln10Var2.n;
            j6 = ln10Var2.i;
            jz60Var2 = ln10Var2.m;
            str4 = ln10Var2.l;
            z1x.P(obj);
        }
        int i3 = (int) j6;
        this.D.m(i3, z8, str4, jz60Var2);
        this.F.m(i3, z8, str4, jz60Var2);
        return Unit.f46060a;
        a570 a570Var3 = (a570) obj;
        String string = a570Var3 instanceof z470 ? UUID.randomUUID().toString() : "";
        string.getClass();
        ln10Var2.j = csrVar2;
        ln10Var2.k = a570Var3;
        ln10Var2.l = string;
        ln10Var2.i = j2;
        ln10Var2.n = z2;
        ln10Var2.r = 2;
        Object objA2 = this.x.a(j2, ln10Var2);
        if (objA2 != obj2) {
            long j8 = j2;
            csrVar3 = csrVar2;
            str = string;
            a570Var = a570Var3;
            obj = objA2;
            j3 = j8;
            zBooleanValue = ((Boolean) obj).booleanValue();
            ln10Var2.j = csrVar3;
            ln10Var2.k = a570Var;
            ln10Var2.l = str;
            ln10Var2.i = j3;
            ln10Var2.n = z2;
            ln10Var2.o = zBooleanValue;
            ln10Var2.r = 3;
            objK = lbu.k(this.H, 0, ln10Var2, 3);
            if (objK != obj2) {
                z3 = z2;
                j4 = j3;
                str2 = str;
                a570Var2 = a570Var;
                z4 = zBooleanValue;
                obj = objK;
                j5 = j4;
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = z3;
                        next = null;
                        break;
                    }
                    next = it.next();
                    z5 = z3;
                    if (((pbv) next).f26728a == j5) {
                        break;
                        break;
                    }
                    z3 = z5;
                }
                pbvVar = (pbv) next;
                if (pbvVar != null) {
                    hds hdsVar3 = pbvVar.n;
                }
                s470Var = s470.LUCKY_WHEEL;
                qqc qqcVar3 = this.z;
                qqcVar3.getClass();
                aws awsVar3 = qqcVar3.f29160a;
                awsVar3.getClass();
                yvsVar = awsVar3.f1590a;
                if (s470Var == yvsVar.f43335a) {
                    yvsVar.f43335a = s470.GAME_UNAVAILABLE;
                }
                if (a570Var2 != null) {
                    z6 = a570Var2 instanceof w470;
                    jz60Var = jz60.f17395a;
                    if (z6) {
                        ln10Var2.j = null;
                        ln10Var2.k = null;
                        ln10Var2.l = str2;
                        ln10Var2.m = jz60Var;
                        ln10Var2.i = j5;
                        z9 = z5;
                        ln10Var2.n = z9;
                        ln10Var2.o = z4;
                        ln10Var2.r = 4;
                        if (W(j5, ln10Var2, csrVar3) != obj2) {
                            j6 = j5;
                            jz60Var2 = jz60Var;
                            z8 = z9;
                            str4 = str2;
                            int i4 = (int) j6;
                            this.D.m(i4, z8, str4, jz60Var2);
                            this.F.m(i4, z8, str4, jz60Var2);
                            return Unit.f46060a;
                        }
                    } else {
                        z7 = z5;
                        if (a570Var2 instanceof z470) {
                            ln10Var2.j = null;
                            ln10Var2.k = null;
                            ln10Var2.l = str2;
                            ln10Var2.m = jz60Var;
                            ln10Var2.i = j5;
                            ln10Var2.n = z7;
                            ln10Var2.o = z4;
                            ln10Var2.r = 5;
                            str3 = str2;
                            if (X(j5, csrVar3, z4, str3, ln10Var2) != obj2) {
                                str4 = str3;
                                j6 = j5;
                                jz60Var2 = jz60Var;
                                z8 = z7;
                                int i5 = (int) j6;
                                this.D.m(i5, z8, str4, jz60Var2);
                                this.F.m(i5, z8, str4, jz60Var2);
                                return Unit.f46060a;
                            }
                        }
                    }
                }
                t9f.b();
                return null;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(long j, zje zjeVar, csr csrVar) {
        mn10 mn10Var;
        if (zjeVar instanceof mn10) {
            mn10Var = (mn10) zjeVar;
            int i = mn10Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mn10Var.m = i - Integer.MIN_VALUE;
            } else {
                mn10Var = new mn10(this, zjeVar);
            }
        } else {
            mn10Var = new mn10(this, zjeVar);
        }
        Object objA = mn10Var.k;
        wne wneVar = wne.f39444a;
        int i2 = mn10Var.m;
        if (i2 == 0) {
            z1x.P(objA);
            mn10Var.j = csrVar;
            mn10Var.i = j;
            mn10Var.m = 1;
            objA = this.w.a(j, mn10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = mn10Var.i;
            csrVar = mn10Var.j;
            z1x.P(objA);
        }
        FragmentScreen fragmentScreenA = this.I.a(j, csrVar, (String) objA);
        if (fragmentScreenA != null) {
            i1w0 i1w0Var = this.o;
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            c8d c8dVar = (c8d) k0w0VarI.h(fragmentScreenA).f14945a;
            bjk bjkVar = cfx0.o;
            c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(long j, csr csrVar, boolean z, String str, zje zjeVar) {
        nn10 nn10Var;
        WebGameScreenFactoryImpl$getWebGameScreen$2 webGameScreenFactoryImpl$getWebGameScreen$2B;
        if (zjeVar instanceof nn10) {
            nn10Var = (nn10) zjeVar;
            int i = nn10Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn10Var.l = i - Integer.MIN_VALUE;
            } else {
                nn10Var = new nn10(this, zjeVar);
            }
        } else {
            nn10Var = new nn10(this, zjeVar);
        }
        Object objA = nn10Var.j;
        wne wneVar = wne.f39444a;
        int i2 = nn10Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            webGameScreenFactoryImpl$getWebGameScreen$2B = this.I.b(j, csrVar, z, str);
            nn10Var.i = webGameScreenFactoryImpl$getWebGameScreen$2B;
            nn10Var.l = 1;
            objA = this.A.a(j, nn10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            webGameScreenFactoryImpl$getWebGameScreen$2B = nn10Var.i;
            z1x.P(objA);
        }
        boolean z2 = !((Boolean) objA).booleanValue();
        i1w0 i1w0Var = this.o;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        c8d c8dVar = (c8d) k0w0VarI.h(webGameScreenFactoryImpl$getWebGameScreen$2B).f14945a;
        bjk bjkVar = cfx0.o;
        c8dVar.f3908a = new v7d(z2, bjkVar, bjkVar);
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:32:0x0076->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(zje zjeVar) {
        on10 on10Var;
        ql5 ql5Var;
        Object objA;
        if (zjeVar instanceof on10) {
            on10Var = (on10) zjeVar;
            int i = on10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                on10Var.k = i - Integer.MIN_VALUE;
            } else {
                on10Var = new on10(this, zjeVar);
            }
        } else {
            on10Var = new on10(this, zjeVar);
        }
        Object objA2 = on10Var.i;
        Object obj = wne.f39444a;
        int i2 = on10Var.k;
        g9c g9cVar = this.Q;
        wsf0 wsf0Var = this.C;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objA2);
            nou nouVarE = ((g45) wsf0Var.b).E();
            on10Var.k = 1;
            objA2 = nouVarE.a(tl5.c, on10Var);
            if (objA2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z1x.P(objA2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    z1x.P(objA2);
                    return objA2;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA2);
        }
        for (Object obj3 : (Iterable) objA2) {
            if (!g9cVar.a((ql5) obj3)) {
                obj2 = obj3;
                break;
            }
        }
        ql5Var = (ql5) obj2;
        if (ql5Var == null) {
            return ql5Var;
        }
        nou nouVarE2 = ((g45) wsf0Var.b).E();
        on10Var.k = 3;
        objA = nouVarE2.a(tl5.c, on10Var);
        if (objA != obj) {
            return obj;
        }
        return objA;
        if (g9cVar.a((ql5) objA2)) {
            objA2 = null;
        }
        ql5 ql5Var2 = (ql5) objA2;
        if (ql5Var2 != null) {
            return ql5Var2;
        }
        urt urtVarG = wsf0Var.g();
        on10Var.k = 2;
        objA2 = urt.a(urtVarG, on10Var);
        if (objA2 != obj) {
            while (r9.hasNext()) {
                if (!g9cVar.a((ql5) obj3)) {
                    obj2 = obj3;
                    break;
                }
            }
            ql5Var = (ql5) obj2;
            if (ql5Var == null) {
                return ql5Var;
            }
            nou nouVarE3 = ((g45) wsf0Var.b).E();
            on10Var.k = 3;
            objA = nouVarE3.a(tl5.c, on10Var);
            if (objA != obj) {
                return objA;
            }
        }
        return obj;
    }

    public final void Z(int i, long j, csr csrVar) {
        int i2;
        final int i3;
        final boolean z = csrVar != null;
        esr esrVar = csrVar != null ? csrVar.f4905a.f3145a : esr.NOTHING;
        final boolean z2 = (esrVar == esr.FREE_SPIN || esrVar == esr.SPECIAL_BONUS || esrVar == esr.NOTHING) ? false : true;
        ctf0 ctf0Var = this.p;
        final String strA = csrVar != null ? csrVar.b : ctf0Var.b.a(R.string.game_try_again, Arrays.copyOf(new Object[0], 0));
        switch (esrVar.ordinal()) {
            case 0:
                i2 = R.drawable.ic_result_nothing;
                i3 = i2;
                break;
            case 1:
                i2 = R.drawable.ic_result_double_bonus;
                i3 = i2;
                break;
            case 2:
                i2 = R.drawable.ic_result_return_half;
                i3 = i2;
                break;
            case 3:
                i2 = R.drawable.ic_result_free_bet;
                i3 = i2;
                break;
            case 4:
                i2 = R.drawable.ic_result_free_spin;
                i3 = i2;
                break;
            case 5:
                i2 = R.drawable.ic_result_wild_free_bet;
                i3 = i2;
                break;
            case 6:
                i2 = R.drawable.ic_result_special_bonus;
                i3 = i2;
                break;
            default:
                i3 = 0;
                break;
        }
        int i4 = z ? R.string.win_title : R.string.game_bad_luck;
        boolean z3 = j == 0 && i > 0;
        final String strA2 = z3 ? ctf0Var.b.a(R.string.lucky_wheel_free_spin_with_count_new, Arrays.copyOf(new Object[]{1}, 1)) : ctf0Var.b.a(R.string.lucky_wheel_spin_for_money, Arrays.copyOf(new Object[0], 0));
        final String strA3 = ctf0Var.b.a(i4, Arrays.copyOf(new Object[0], 0));
        final long millis = TimeUnit.SECONDS.toMillis(j) + System.currentTimeMillis();
        final boolean z4 = z3;
        H(new Function2() { // from class: a.dn10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                tm10 tm10Var = (tm10) obj2;
                ((oyg0) obj).getClass();
                tm10Var.getClass();
                return tm10.a(tm10Var, io10.c, null, null, null, null, null, false, null, strA2, false, null, !z4, millis, false, new ho10(i3, strA3, strA, z, z2), null, false, false, false, null, null, 3362558);
            }
        });
    }

    public final void a0() {
        Object g0g0Var;
        ql5 ql5VarA = this.B.a();
        if (ql5VarA == null) {
            return;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Double.valueOf(this.y.c().b);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object objValueOf = Double.valueOf(ql5VarA.b);
        if (g0g0Var instanceof g0g0) {
            g0g0Var = objValueOf;
        }
        H(new cn10(((Number) g0g0Var).doubleValue(), ql5VarA));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        csr csrVar;
        esr esrVar;
        Object value2;
        Object value3;
        Object value4;
        csr csrVar2;
        Object value5;
        Object value6;
        Object value7;
        pn10 pn10Var = this;
        vl10 vl10Var = (vl10) obj;
        vl10Var.getClass();
        super.x(vl10Var);
        if (vl10Var.equals(bl10.f2775a)) {
            pn10Var.E();
            return;
        }
        boolean zEquals = vl10Var.equals(cl10.f4534a);
        byte b = 3;
        byte b2 = 0;
        yje yjeVar = null;
        mne mneVar = pn10Var.q;
        if (zEquals) {
            if (pn10Var.a0) {
                pn10Var.a0 = false;
                return;
            } else {
                sac.V(jiu0.a(pn10Var), new zm10(pn10Var, (byte) 5), null, mneVar.b, new en10(pn10Var, yjeVar, b), 10);
                return;
            }
        }
        if (vl10Var.equals(dl10.f6258a)) {
            if (((tm10) pn10Var.D()).b()) {
                return;
            }
            pn10Var.N();
            return;
        }
        byte b3 = 1;
        if (vl10Var.equals(ol10.f25432a)) {
            if (!pn10Var.b0 || ((tm10) pn10Var.D()).b()) {
                return;
            }
            sac.V(jiu0.a(pn10Var), new p610((byte) 14), null, mneVar.b, new z210(pn10Var, yjeVar, b3), 10);
            return;
        }
        if (vl10Var.equals(ll10.f20226a)) {
            pn10Var.U();
            return;
        }
        boolean zEquals2 = vl10Var.equals(sl10.f32377a);
        oyg0 oyg0Var = pn10Var.f;
        ocj ocjVar = pn10Var.i;
        hs60 hs60Var = pn10Var.E;
        je jeVar = pn10Var.D;
        if (zEquals2) {
            if (!pn10Var.b0 || ((tm10) pn10Var.D()).b()) {
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value7 = p7m0Var.getValue();
                value7.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value7, tm10.a((tm10) value7, null, null, null, null, null, null, false, jo10.c, null, false, null, false, 0L, false, null, null, false, true, false, null, null, 3386239)));
            jeVar.f16351a.a(xun.f41520a, 3014L);
            hs60Var.f13566a.c("games_promos_lucky_wheel");
            sac.V(jiu0.a(pn10Var), new zm10(pn10Var, (byte) 6), null, mneVar.b, new kn10(pn10Var, yjeVar, b3), 10);
            return;
        }
        if (vl10Var.equals(ql10.f28913a)) {
            if (!pn10Var.b0 || ((tm10) pn10Var.D()).b()) {
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value6 = p7m0Var2.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value6, tm10.a((tm10) value6, null, null, null, null, null, null, false, jo10.c, null, false, null, false, 0L, false, null, null, false, true, false, null, null, 3386239)));
            jeVar.f16351a.a(xun.f41520a, 3014L);
            hs60Var.f13566a.c("games_promos_lucky_wheel");
            sac.V(jiu0.a(pn10Var), new zm10(pn10Var, (byte) 8), null, mneVar.b, new kn10(pn10Var, yjeVar, b2), 10);
            return;
        }
        byte b4 = 7;
        if (vl10Var.equals(rl10.f30676a)) {
            x9v0 x9v0Var = pn10Var.U;
            if (x9v0Var == null) {
                return;
            }
            sac.V(jiu0.a(pn10Var), new zm10(pn10Var, b4), null, mneVar.b, new gd7(x9v0Var, pn10Var, yjeVar, b3), 10);
            return;
        }
        if (vl10Var.equals(pl10.f27160a)) {
            sxk0 sxk0Var = pn10Var.V;
            if (sxk0Var == null) {
                return;
            }
            sac.V(jiu0.a(pn10Var), new zm10(pn10Var, b2), null, mneVar.b, new d21(sxk0Var, pn10Var, yjeVar, b4), 10);
            return;
        }
        if (vl10Var.equals(hl10.f13234a)) {
            pn10Var.Q(jo10.f16836a, true, false);
            return;
        }
        if (vl10Var.equals(fl10.f9719a)) {
            pn10Var.G(mm10.f22017a);
            return;
        }
        boolean zEquals3 = vl10Var.equals(ml10.f21967a);
        rm10 rm10Var = rm10.f30724a;
        if (zEquals3) {
            csr csrVar3 = pn10Var.W;
            if (csrVar3 == null) {
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value8 = p7m0Var3.getValue();
                value8.getClass();
                oyg0Var.getClass();
                csrVar2 = csrVar3;
                if (p7m0Var3.m(value8, tm10.a((tm10) value8, null, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, false, false, false, csrVar2, null, 3145727))) {
                    break;
                } else {
                    csrVar3 = csrVar2;
                }
            }
            if (csrVar2.f4905a.f3145a.b()) {
                pn10Var.G(rm10Var);
                return;
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value5 = p7m0Var4.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value5, tm10.a((tm10) value5, io10.b, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, false, false, false, csr.e, ko10.c, 1015806)));
            pn10Var.Q(jo10.f16836a, true, false);
            sac.V(jiu0.a(pn10Var), new zm10(pn10Var, b), null, mneVar.b, new jn10(pn10Var, csrVar2, yjeVar, b3), 10);
            return;
        }
        if (vl10Var.equals(nl10.f23706a)) {
            if (((tm10) pn10Var.D()).f34172a != io10.c) {
                return;
            }
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value4 = p7m0Var5.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value4, tm10.a((tm10) value4, io10.b, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, false, false, false, null, null, 4161534)));
            pn10Var.Q(jo10.f16836a, true, false);
            return;
        }
        if (vl10Var.equals(kl10.f18464a)) {
            if (((tm10) pn10Var.D()).f34172a != io10.d) {
                return;
            }
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value3 = p7m0Var6.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value3, tm10.a((tm10) value3, io10.b, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, iun.f15405a, false, false, false, null, null, 4128766)));
            pn10Var.Q(jo10.f16836a, true, false);
            return;
        }
        if (vl10Var instanceof jl10) {
            csr csrVar4 = ((jl10) vl10Var).f16695a;
            bsr bsrVar = csrVar4.f4905a;
            p7m0 p7m0Var7 = ocjVar.f25029a;
            while (true) {
                Object value9 = p7m0Var7.getValue();
                value9.getClass();
                oyg0Var.getClass();
                csrVar = csrVar4;
                if (p7m0Var7.m(value9, tm10.a((tm10) value9, null, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, false, false, false, csrVar, null, 3145727))) {
                    break;
                } else {
                    csrVar4 = csrVar;
                }
            }
            if (bsrVar.f3145a.b()) {
                pn10Var.G(rm10Var);
                return;
            }
            if (!pn10Var.b0 || pn10Var.Y != null || (esrVar = bsrVar.f3145a) == esr.FREE_SPIN || esrVar == esr.SPECIAL_BONUS) {
                return;
            }
            p7m0 p7m0Var8 = ocjVar.f25029a;
            do {
                value2 = p7m0Var8.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var8.m(value2, tm10.a((tm10) value2, io10.b, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, iun.f15405a, false, false, false, csr.e, ko10.c, 983038)));
            pn10Var.Q(jo10.f16836a, true, false);
            pn10Var.Y = sac.V(jiu0.a(pn10Var), new zm10(pn10Var, (byte) 4), new an10(pn10Var, (byte) 1), mneVar.b, new jn10(pn10Var, csrVar, yjeVar, b2), 8);
            return;
        }
        if (vl10Var.equals(gl10.f11470a)) {
            pn10Var.N();
            return;
        }
        if (vl10Var.equals(el10.f7978a) || vl10Var.equals(tl10.f34124a)) {
            return;
        }
        if (vl10Var.equals(il10.f14955a)) {
            pn10Var.U();
            return;
        }
        if (!(vl10Var instanceof ul10)) {
            t9f.b();
            return;
        }
        long j = ((ul10) vl10Var).f35853a;
        int iOrdinal = ((tm10) pn10Var.D()).v.ordinal();
        if (iOrdinal == 0) {
            p7m0 p7m0Var9 = ocjVar.f25029a;
            while (true) {
                Object value10 = p7m0Var9.getValue();
                value10.getClass();
                oyg0Var.getClass();
                if (p7m0Var9.m(value10, tm10.a((tm10) value10, io10.b, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, null, false, false, false, null, null, 4161534))) {
                    break;
                } else {
                    pn10Var = this;
                }
            }
        } else if (iOrdinal == 1) {
            p7m0 p7m0Var10 = ocjVar.f25029a;
            do {
                value = p7m0Var10.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var10.m(value, tm10.a((tm10) value, io10.b, null, null, null, null, null, false, null, null, false, null, false, 0L, false, null, iun.f15405a, false, false, false, null, null, 4128766)));
        }
        pn10Var.Q(jo10.f16836a, true, false);
        sac.V(jiu0.a(pn10Var), new zm10(pn10Var, b3), null, mneVar.b, new ey((Object) pn10Var, j, yjeVar, (byte) 29), 10);
    }
}
