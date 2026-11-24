package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class w5j0 extends w46 {
    public final p7m0 A;
    public final p7m0 B;
    public bm5 C;
    public final khf0 b;
    public final trm0 c;
    public final zpu d;
    public final xfu e;
    public final j910 f;
    public final vpt g;
    public final upt h;
    public final k9u i;
    public final lbu j;
    public final pmi0 k;
    public final dzu l;
    public final lpc m;
    public final i1w0 n;
    public final pyu o;
    public final ljf0 p;
    public final ani0 q;
    public final eyg0 r;
    public final env s;
    public final fnv t;
    public final lef0 u;
    public final mne v;
    public final ctf0 w;
    public final c8c x;
    public final ugf0 y;
    public final q4u z;

    public w5j0(khf0 khf0Var, trm0 trm0Var, zpu zpuVar, xfu xfuVar, j910 j910Var, pru pruVar, vpt vptVar, upt uptVar, k9u k9uVar, lbu lbuVar, ani0 ani0Var, vyt vytVar, pmi0 pmi0Var, dnv dnvVar, czu czuVar, dzu dzuVar, dzu dzuVar2, lpc lpcVar, i1w0 i1w0Var, g2v g2vVar, env envVar, czu czuVar2, pyu pyuVar, fnv fnvVar, ljf0 ljf0Var, ani0 ani0Var2, eyg0 eyg0Var, env envVar2, fnv fnvVar2, lef0 lef0Var, mne mneVar, ctf0 ctf0Var, c8c c8cVar, pyu pyuVar2, ugf0 ugf0Var, q4u q4uVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        c8cVar.getClass();
        this.b = khf0Var;
        this.c = trm0Var;
        this.d = zpuVar;
        this.e = xfuVar;
        this.f = j910Var;
        this.g = vptVar;
        this.h = uptVar;
        this.i = k9uVar;
        this.j = lbuVar;
        this.k = pmi0Var;
        this.l = dzuVar2;
        this.m = lpcVar;
        this.n = i1w0Var;
        this.o = pyuVar;
        this.p = ljf0Var;
        this.q = ani0Var2;
        this.r = eyg0Var;
        this.s = envVar2;
        this.t = fnvVar2;
        this.u = lef0Var;
        this.v = mneVar;
        this.w = ctf0Var;
        this.x = c8cVar;
        this.y = ugf0Var;
        this.z = q4uVar;
        gm7 gm7Var = pruVar.a().f32117a.f12063a;
        this.A = q7m0.a(new b5j0(false, new i2j0(vytVar.a()), new l3j0(false, dnvVar.a(), czuVar.a()), new t3j0(gm7Var.i, ua80.x(czuVar2.f5240a.f25798a.f35876a, "dropOnScoreChange", false), ua80.x(envVar.f8113a.f25798a.f35876a, "fromLineToLive", false)), new d3j0(0.0d, pyuVar2.k()), new f4j0(0L, 0.0d, new e4j0(0.0d), new e4j0(0.0d), new e4j0(0.0d), dzuVar.a(), ""), new z1j0(ctf0Var.f(R.string.auto_max_desc, new Object[0]), ua80.x(((ost0) g2vVar.f10580a).f25798a.f35876a, "autoMaximum", false)), new x5j0(ctf0Var.f(R.string.vip_bet_terms_description, new Object[0]), gm7Var.h, ua80.x(fnvVar.f9856a.f25798a.f35876a, "vipBet", false)), ""));
        this.B = q7m0.a(c5j0.f3774a);
        I(true);
    }

    public final void A(ezc ezcVar) {
        J(new t2j0(ezcVar));
        pmi0 pmi0Var = this.k;
        pmi0Var.getClass();
        hm7 hm7Var = (hm7) pmi0Var.f27236a;
        hm7Var.getClass();
        ((vwb0) hm7Var.f13293a.b).f(ezcVar.f8665a, "bet_check_koef");
    }

    public final void B(h4j0 h4j0Var) {
        i5j0 i5j0Var = new i5j0(h4j0Var);
        p7m0 p7m0Var = this.B;
        p7m0Var.getClass();
        p7m0Var.o(null, i5j0Var);
    }

    public final void C(boolean z) {
        if (((b5j0) this.A.getValue()).h.b && z) {
            J(new r2j0(true));
            F(f5j0.f8964a);
        } else {
            J(new r2j0(z));
            ((ost0) this.p.f20148a).f25798a.f35876a.e("autoMaximum", z);
        }
    }

    public final void D(boolean z) {
        J(new y2j0(z));
        this.t.f9856a.f25798a.f35876a.e("subscribeOnBetUpdates", z);
        if (z) {
            boolean zA = this.x.a();
            boolean zA2 = this.g.a();
            if (!zA) {
                F(g5j0.f10722a);
            } else {
                if (zA2) {
                    return;
                }
                F(e5j0.f7237a);
            }
        }
    }

    public final void E(boolean z) {
        if (((b5j0) this.A.getValue()).g.f43624a && z) {
            J(new z2j0(true));
            F(h5j0.f12483a);
        } else {
            J(new z2j0(z));
            ((ost0) this.u.f19899a).f25798a.f35876a.e("vipBet", z);
        }
    }

    public final void F(j5j0 j5j0Var) {
        sac.V(jiu0.a(this), new wvi0((byte) 18), null, this.v.f22085a, new kbh0(this, j5j0Var, null, (byte) 4), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(a.bm5 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.v5j0
            if (r0 == 0) goto L13
            r0 = r8
            a.v5j0 r0 = (a.v5j0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.v5j0 r0 = new a.v5j0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            a.w5j0 r6 = r0.j
            a.z1x.P(r8)
            goto L61
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L33:
            a.bm5 r7 = r0.i
            a.z1x.P(r8)
            goto L49
        L39:
            a.z1x.P(r8)
            r0.i = r7
            r0.m = r5
            a.khf0 r8 = r6.b
            java.io.Serializable r8 = a.khf0.G(r8, r7, r0)
            if (r8 != r1) goto L49
            goto L60
        L49:
            a.ql5 r8 = (a.ql5) r8
            a.trm0 r2 = r6.c
            r2.l(r7, r8)
            r0.i = r3
            r0.j = r6
            r0.m = r4
            a.q4u r7 = r6.z
            a.etj r7 = r7.f28119a
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L61
        L60:
            return r1
        L61:
            a.c3j0 r8 = (a.c3j0) r8
            double r7 = r8.b
            r6.H(r7)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w5j0.G(a.bm5, a.zje):java.lang.Object");
    }

    public final void H(double d) {
        p7m0 p7m0Var;
        Object value;
        b5j0 b5j0Var;
        do {
            p7m0Var = this.A;
            value = p7m0Var.getValue();
            b5j0Var = (b5j0) value;
        } while (!p7m0Var.m(value, b5j0.a(b5j0Var, false, null, null, null, new d3j0(d, b5j0Var.e.b), null, null, null, null, 991)));
    }

    public final void I(boolean z) {
        while (true) {
            p7m0 p7m0Var = this.A;
            Object value = p7m0Var.getValue();
            boolean z2 = z;
            if (p7m0Var.m(value, b5j0.a((b5j0) value, z2, null, null, null, null, null, null, null, null, 1022))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void J(a3j0 a3j0Var) {
        p7m0 p7m0Var;
        Object value;
        b5j0 b5j0VarA;
        do {
            p7m0Var = this.A;
            value = p7m0Var.getValue();
            b5j0 b5j0Var = (b5j0) value;
            if (a3j0Var instanceof t2j0) {
                i2j0 i2j0Var = b5j0Var.b;
                b5j0VarA = b5j0.a(b5j0Var, false, new i2j0(((t2j0) a3j0Var).f33218a), null, null, null, null, null, null, null, 1019);
            } else if (a3j0Var instanceof y2j0) {
                b5j0VarA = b5j0.a(b5j0Var, false, null, l3j0.a(b5j0Var.c, ((y2j0) a3j0Var).f41907a, false, false, 6), null, null, null, null, null, null, 1015);
            } else if (a3j0Var instanceof s2j0) {
                b5j0VarA = b5j0.a(b5j0Var, false, null, l3j0.a(b5j0Var.c, false, ((s2j0) a3j0Var).f31503a, false, 5), null, null, null, null, null, null, 1015);
            } else if (a3j0Var instanceof q2j0) {
                b5j0VarA = b5j0.a(b5j0Var, false, null, l3j0.a(b5j0Var.c, false, false, ((q2j0) a3j0Var).f28001a, 3), null, null, null, null, null, null, 1015);
            } else if (a3j0Var instanceof v2j0) {
                b5j0VarA = b5j0.a(b5j0Var, false, null, null, t3j0.a(b5j0Var.d, ((v2j0) a3j0Var).f36686a, false, 5), null, null, null, null, null, 1007);
            } else if (a3j0Var instanceof u2j0) {
                b5j0VarA = b5j0.a(b5j0Var, false, null, null, t3j0.a(b5j0Var.d, false, ((u2j0) a3j0Var).f34949a, 3), null, null, null, null, null, 1007);
            } else if (a3j0Var instanceof w2j0) {
                d3j0 d3j0Var = b5j0Var.e;
                b5j0VarA = b5j0.a(b5j0Var, false, null, null, null, new d3j0(d3j0Var.f5405a, ((w2j0) a3j0Var).f38451a), null, null, null, null, 991);
            } else if (a3j0Var instanceof x2j0) {
                b5j0VarA = b5j0.a(b5j0Var, false, null, null, null, null, f4j0.a(b5j0Var.f, 0L, 0.0d, null, null, null, ((x2j0) a3j0Var).f40171a, null, 95), null, null, null, 959);
            } else if (a3j0Var instanceof r2j0) {
                z1j0 z1j0Var = b5j0Var.g;
                b5j0VarA = b5j0.a(b5j0Var, false, null, null, null, null, null, new z1j0(z1j0Var.b, ((r2j0) a3j0Var).f29737a), null, null, 895);
            } else {
                if (!(a3j0Var instanceof z2j0)) {
                    t9f.b();
                    return;
                }
                x5j0 x5j0Var = b5j0Var.h;
                boolean z = ((z2j0) a3j0Var).f43672a;
                b5j0VarA = b5j0.a(b5j0Var, false, null, null, null, null, null, null, new x5j0(x5j0Var.c, x5j0Var.f40321a, z), null, 767);
            }
        } while (!p7m0Var.m(value, b5j0VarA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(bm5 bm5Var, zje zjeVar) {
        n5j0 n5j0Var;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof n5j0) {
            n5j0Var = (n5j0) zjeVar;
            int i = n5j0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                n5j0Var.l = i - Integer.MIN_VALUE;
            } else {
                n5j0Var = new n5j0(this, zjeVar);
            }
        } else {
            n5j0Var = new n5j0(this, zjeVar);
        }
        Object objG = n5j0Var.j;
        Object obj = wne.f39444a;
        int i2 = n5j0Var.l;
        if (i2 == 0) {
            z1x.P(objG);
            n5j0Var.i = bm5Var;
            n5j0Var.l = 1;
            objG = khf0.G(this.b, bm5Var, n5j0Var);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bm5Var = n5j0Var.i;
            z1x.P(objG);
        }
        ql5 ql5Var = (ql5) objG;
        this.c.l(bm5Var, ql5Var);
        do {
            p7m0Var = this.A;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, b5j0.a((b5j0) value, false, null, null, null, null, null, null, null, ql5Var.f, 511)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x0120 A[LOOP:0: B:30:0x00ac->B:34:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x(bm5 bm5Var, zje zjeVar) {
        o5j0 o5j0Var;
        w5j0 w5j0Var;
        ql5 ql5Var;
        ql5 ql5Var2;
        double dDoubleValue;
        ql5 ql5Var3;
        w5j0 w5j0Var2;
        double d;
        hnd0 hnd0Var;
        p7m0 p7m0Var;
        Object value;
        b5j0 b5j0Var;
        f4j0 f4j0Var;
        long j;
        e4j0 e4j0Var;
        e4j0 e4j0Var2;
        e4j0 e4j0Var3;
        ctf0 ctf0Var;
        String str;
        hnd0 hnd0Var2;
        bm5 bm5Var2 = bm5Var;
        if (zjeVar instanceof o5j0) {
            o5j0Var = (o5j0) zjeVar;
            int i = o5j0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                o5j0Var.p = i - Integer.MIN_VALUE;
            } else {
                o5j0Var = new o5j0(this, zjeVar);
            }
        } else {
            o5j0Var = new o5j0(this, zjeVar);
        }
        Object objG = o5j0Var.n;
        wne wneVar = wne.f39444a;
        int i2 = o5j0Var.p;
        if (i2 == 0) {
            z1x.P(objG);
            o5j0Var.i = bm5Var2;
            o5j0Var.p = 1;
            objG = khf0.G(this.b, bm5Var2, o5j0Var);
            if (objG != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            bm5Var2 = o5j0Var.i;
            z1x.P(objG);
        } else {
            if (i2 == 2) {
                ql5Var2 = o5j0Var.l;
                w5j0Var = o5j0Var.k;
                ql5Var = o5j0Var.j;
                z1x.P(objG);
                dDoubleValue = ((Number) objG).doubleValue();
                long j2 = ql5Var.f28916a;
                o5j0Var.i = null;
                o5j0Var.j = null;
                o5j0Var.k = w5j0Var;
                o5j0Var.l = ql5Var2;
                o5j0Var.m = dDoubleValue;
                o5j0Var.p = 3;
                objG = this.j.d(j2, o5j0Var);
                if (objG != wneVar) {
                    ql5Var3 = ql5Var2;
                    w5j0Var2 = w5j0Var;
                    d = dDoubleValue;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d2 = o5j0Var.m;
            ql5Var3 = o5j0Var.l;
            w5j0Var2 = o5j0Var.k;
            z1x.P(objG);
            d = d2;
        }
        hnd0Var = (hnd0) objG;
        p7m0Var = w5j0Var2.A;
        while (true) {
            value = p7m0Var.getValue();
            b5j0Var = (b5j0) value;
            f4j0Var = b5j0Var.f;
            j = ql5Var3.f28916a;
            e4j0Var = new e4j0(hnd0Var.b);
            e4j0Var2 = new e4j0(hnd0Var.c);
            e4j0Var3 = new e4j0(hnd0Var.d);
            ctf0Var = w5j0Var2.w;
            str = ql5Var3.m;
            str.getClass();
            hnd0Var2 = hnd0Var;
            if (p7m0Var.m(value, b5j0.a(b5j0Var, false, null, null, null, null, f4j0.a(f4j0Var, j, d, e4j0Var, e4j0Var2, e4j0Var3, false, ctf0Var.f(R.string.bet_settings_bet_quick_description_v2, Separators.DOUBLE_QUOTE + str + Separators.DOUBLE_QUOTE), 32), null, null, null, 959))) {
                return Unit.f46060a;
            }
            hnd0Var = hnd0Var2;
        }
        ql5 ql5Var4 = (ql5) objG;
        this.c.l(bm5Var2, ql5Var4);
        long j3 = ql5Var4.e;
        o5j0Var.i = null;
        o5j0Var.j = ql5Var4;
        o5j0Var.k = this;
        o5j0Var.l = ql5Var4;
        o5j0Var.p = 2;
        Object objR = ((ovf) this.e.f40810a).f25922a.r(j3, o5j0Var);
        if (objR != wneVar) {
            w5j0Var = this;
            ql5Var = ql5Var4;
            objG = objR;
            ql5Var2 = ql5Var;
            dDoubleValue = ((Number) objG).doubleValue();
            long j4 = ql5Var.f28916a;
            o5j0Var.i = null;
            o5j0Var.j = null;
            o5j0Var.k = w5j0Var;
            o5j0Var.l = ql5Var2;
            o5j0Var.m = dDoubleValue;
            o5j0Var.p = 3;
            objG = this.j.d(j4, o5j0Var);
            if (objG != wneVar) {
                ql5Var3 = ql5Var2;
                w5j0Var2 = w5j0Var;
                d = dDoubleValue;
                hnd0Var = (hnd0) objG;
                p7m0Var = w5j0Var2.A;
                while (true) {
                    value = p7m0Var.getValue();
                    b5j0Var = (b5j0) value;
                    f4j0Var = b5j0Var.f;
                    j = ql5Var3.f28916a;
                    e4j0Var = new e4j0(hnd0Var.b);
                    e4j0Var2 = new e4j0(hnd0Var.c);
                    e4j0Var3 = new e4j0(hnd0Var.d);
                    ctf0Var = w5j0Var2.w;
                    str = ql5Var3.m;
                    str.getClass();
                    hnd0Var2 = hnd0Var;
                    if (p7m0Var.m(value, b5j0.a(b5j0Var, false, null, null, null, null, f4j0.a(f4j0Var, j, d, e4j0Var, e4j0Var2, e4j0Var3, false, ctf0Var.f(R.string.bet_settings_bet_quick_description_v2, Separators.DOUBLE_QUOTE + str + Separators.DOUBLE_QUOTE), 32), null, null, null, 959))) {
                        return Unit.f46060a;
                    }
                    hnd0Var = hnd0Var2;
                }
            }
        }
        return wneVar;
    }

    public final gx3 y() {
        b5j0 b5j0Var = (b5j0) this.A.getValue();
        ezc ezcVar = b5j0Var.b.f14050a;
        boolean z = ezcVar == ezc.CONFIRM_ANY_CHANGE;
        boolean z2 = ezcVar == ezc.ACCEPT_ANY_CHANGE;
        boolean z3 = ezcVar == ezc.ACCEPT_INCREASE;
        l3j0 l3j0Var = b5j0Var.c;
        boolean z4 = l3j0Var.f19359a;
        boolean z5 = l3j0Var.b;
        boolean z6 = l3j0Var.c;
        t3j0 t3j0Var = b5j0Var.d;
        boolean z7 = t3j0Var.f33271a;
        boolean z8 = z7 && t3j0Var.b;
        boolean z9 = z7 && t3j0Var.c;
        boolean z10 = b5j0Var.f.f;
        boolean z11 = b5j0Var.g.f43624a;
        x5j0 x5j0Var = b5j0Var.h;
        boolean z12 = x5j0Var.f40321a && x5j0Var.b;
        boolean z13 = b5j0Var.e.b;
        gx3 gx3Var = new gx3(0);
        gx3Var.put(wa20.f38809a, Boolean.valueOf(z));
        gx3Var.put(wa20.b, Boolean.valueOf(z2));
        gx3Var.put(wa20.c, Boolean.valueOf(z3));
        gx3Var.put(wa20.d, Boolean.valueOf(z4));
        gx3Var.put(wa20.e, Boolean.valueOf(z5));
        gx3Var.put(wa20.f, Boolean.valueOf(z8));
        gx3Var.put(wa20.g, Boolean.valueOf(z9));
        gx3Var.put(wa20.h, Boolean.valueOf(z10));
        gx3Var.put(wa20.i, Boolean.valueOf(z11));
        gx3Var.put(wa20.j, Boolean.valueOf(z12));
        gx3Var.put(wa20.k, Boolean.valueOf(z13));
        gx3Var.put(wa20.l, Boolean.valueOf(z6));
        return gx3Var;
    }

    public final void z(a5j0 a5j0Var) {
        boolean z = a5j0Var instanceof u4j0;
        yje yjeVar = null;
        mne mneVar = this.v;
        if (z) {
            bm5 bm5Var = ((u4j0) a5j0Var).f35052a;
            this.C = bm5Var;
            sac.V(jiu0.a(this), new wvi0((byte) 16), null, mneVar.f22085a, new zye0(this, bm5Var, yjeVar, (byte) 23), 10);
            return;
        }
        if (!(a5j0Var instanceof t4j0)) {
            boolean z2 = a5j0Var instanceof r4j0;
            fnv fnvVar = this.t;
            if (z2) {
                if (!this.g.a()) {
                    F(e5j0.f7237a);
                    return;
                } else {
                    J(new y2j0(true));
                    fnvVar.f9856a.f25798a.f35876a.e("subscribeOnBetUpdates", true);
                    return;
                }
            }
            if (a5j0Var instanceof z4j0) {
                boolean z3 = ((z4j0) a5j0Var).f43773a;
                this.h.a(z3);
                this.i.a(z3);
                J(new y2j0(z3));
                fnvVar.f9856a.f25798a.f35876a.e("subscribeOnBetUpdates", z3);
                return;
            }
            if (a5j0Var instanceof s4j0) {
                H(((s4j0) a5j0Var).f31609a);
                return;
            }
            boolean zEquals = a5j0Var.equals(p4j0.f26357a);
            lef0 lef0Var = this.u;
            ljf0 ljf0Var = this.p;
            if (zEquals) {
                J(new r2j0(true));
                ((ost0) ljf0Var.f20148a).f25798a.f35876a.e("autoMaximum", true);
                J(new z2j0(false));
                ((ost0) lef0Var.f19899a).f25798a.f35876a.e("vipBet", false);
                return;
            }
            if (a5j0Var.equals(q4j0.f28099a)) {
                J(new z2j0(true));
                ((ost0) lef0Var.f19899a).f25798a.f35876a.e("vipBet", true);
                J(new r2j0(false));
                ((ost0) ljf0Var.f20148a).f25798a.f35876a.e("autoMaximum", false);
                return;
            }
            boolean zEquals2 = a5j0Var.equals(v4j0.f36783a);
            j910 j910Var = this.f;
            zpu zpuVar = this.d;
            if (!zEquals2) {
                if (a5j0Var instanceof y4j0) {
                    sac.V(jiu0.a(this), new wvi0((byte) 17), null, mneVar.f22085a, new yng0(this, yjeVar, (byte) 15), 10);
                    return;
                }
                if (a5j0Var.equals(x4j0.f40267a)) {
                    ((kt2) zpuVar.b).a("push_permission_alert_click", xp20.f(new Pair("action", "settings"), new Pair("screen", "regular_bet")));
                    ((s1p) j910Var.b).a(tx3.l0(new k1p[]{new j1p("settings", (byte) 0), new j1p("regular_bet", (byte) 1)}), 3344L);
                    return;
                } else if (!a5j0Var.equals(w4j0.f38544a)) {
                    t9f.b();
                    return;
                } else {
                    ((kt2) zpuVar.b).a("push_permission_alert_click", xp20.f(new Pair("action", "cancel"), new Pair("screen", "regular_bet")));
                    ((s1p) j910Var.b).a(tx3.l0(new k1p[]{new j1p("cancel", (byte) 0), new j1p("regular_bet", (byte) 1)}), 3344L);
                    return;
                }
            }
            if (y().isEmpty()) {
                return;
            }
            gx3 gx3VarY = y();
            zpuVar.getClass();
            ArrayList arrayList = new ArrayList(gx3VarY.c);
            Iterator it = ((ax3) gx3VarY.entrySet()).iterator();
            while (true) {
                dx3 dx3Var = (dx3) it;
                if (!dx3Var.hasNext()) {
                    break;
                }
                dx3Var.next();
                arrayList.add(((wa20) dx3Var.getKey()).a(((Boolean) dx3Var.getValue()).booleanValue()));
            }
            LinkedHashSet linkedHashSetB0 = CollectionsKt.B0(arrayList, CollectionsKt.P0((List) zpuVar.c));
            if (!linkedHashSetB0.isEmpty()) {
                ((kt2) zpuVar.b).a("acc_settings_transactions_change", wp20.b(new Pair("option", linkedHashSetB0)));
            }
            gx3 gx3VarY2 = y();
            LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(gx3VarY2.c));
            for (Map.Entry entry : (ax3) gx3VarY2.entrySet()) {
                linkedHashMap.put(m8x.x0((wa20) entry.getKey()), entry.getValue());
            }
            j910Var.getClass();
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList2.add(((xa20) entry2.getKey()).a(((Boolean) entry2.getValue()).booleanValue()));
            }
            LinkedHashSet linkedHashSetB1 = CollectionsKt.B0(arrayList2, CollectionsKt.P0((List) j910Var.c));
            if (linkedHashSetB1.isEmpty()) {
                return;
            }
            s1p s1pVar = (s1p) j910Var.b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : linkedHashSetB1) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            b1j.v(CollectionsKt.b0(arrayList3, ", ", null, null, null, 62), s1pVar, 3285L);
            return;
        }
        i1w0 i1w0Var = this.n;
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
