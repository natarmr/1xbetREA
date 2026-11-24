package a;

import android.os.CountDownTimer;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$2;

/* JADX INFO: loaded from: classes3.dex */
public final class bo10 extends w46 {
    public final p7m0 A;
    public final p7m0 B;
    public final p7m0 C;
    public final p7m0 D;
    public final p7m0 E;
    public final ol60 F;
    public boolean G;
    public x9v0 H;
    public sxk0 I;
    public csr J;
    public CountDownTimer K;
    public csr L;
    public ko10 M;
    public boolean N;
    public final c4m0 O;
    public bby P;
    public c8h0 Q;
    public final i1w0 b;
    public final ctf0 c;
    public final mne d;
    public final xcc e;
    public final y3v f;
    public final n660 g;
    public final fq h;
    public final ycu i;
    public final ucu j;
    public final dcu k;
    public final gxu l;
    public final yfu m;
    public final z4u n;
    public final je o;
    public final hs60 p;
    public final ih5 q;
    public final ipu r;
    public final lbu s;
    public final oct t;
    public final p7m0 u;
    public final p7m0 v;
    public final p7m0 w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    public bo10(i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, xcc xccVar, y3v y3vVar, n660 n660Var, fq fqVar, ycu ycuVar, ucu ucuVar, dcu dcuVar, gxu gxuVar, yfu yfuVar, qqc qqcVar, m1e m1eVar, z4u z4uVar, bpi0 bpi0Var, je jeVar, hs60 hs60Var, dmt dmtVar, ih5 ih5Var, ipu ipuVar, lbu lbuVar, oct octVar) {
        i1w0Var.getClass();
        xccVar.getClass();
        fqVar.getClass();
        ucuVar.getClass();
        dcuVar.getClass();
        qqcVar.getClass();
        bpi0Var.getClass();
        ipuVar.getClass();
        this.b = i1w0Var;
        this.c = ctf0Var;
        this.d = mneVar;
        this.e = xccVar;
        this.f = y3vVar;
        this.g = n660Var;
        this.h = fqVar;
        this.i = ycuVar;
        this.j = ucuVar;
        this.k = dcuVar;
        this.l = gxuVar;
        this.m = yfuVar;
        this.n = z4uVar;
        this.o = jeVar;
        this.p = hs60Var;
        this.q = ih5Var;
        this.r = ipuVar;
        this.s = lbuVar;
        this.t = octVar;
        this.u = q7m0.a(Boolean.valueOf(dmtVar.f6335a.a().y0));
        this.v = q7m0.a(mav0.f);
        this.w = q7m0.a(gzk0.c);
        this.x = q7m0.a(rxk0.c);
        this.y = q7m0.a(snq0.c);
        this.z = q7m0.a(fqs.g);
        this.A = q7m0.a(fyb0.c);
        this.B = q7m0.a(Float.valueOf(0.0f));
        this.C = q7m0.a(Boolean.FALSE);
        Boolean bool = Boolean.TRUE;
        this.D = q7m0.a(bool);
        this.E = q7m0.a(bool);
        this.F = new ol60(3);
        this.L = csr.e;
        this.M = ko10.c;
        this.N = m1eVar.c();
        this.Q = c8h0.f3914a;
        yje yjeVar = null;
        sac.V(jiu0.a(this), new pf10(1, this, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.c, new fhq(this, bpi0Var, yjeVar, (byte) 21), 10);
        c4m0 c4m0Var = this.O;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.O = slb.U(new fnq(i120.W(m1eVar.b()), new slx(this, yjeVar, (byte) 27), (byte) 4), jiu0.a(this));
    }

    public final void A(c8h0 c8h0Var, boolean z) {
        sac.V(jiu0.a(this), new x9(z, (Object) this, (byte) 28), null, this.d.b, new mt00(this, c8h0Var, null, (byte) 2), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object B(boolean z, zje zjeVar) {
        tn10 tn10Var;
        if (zjeVar instanceof tn10) {
            tn10Var = (tn10) zjeVar;
            int i = tn10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn10Var.k = i - Integer.MIN_VALUE;
            } else {
                tn10Var = new tn10(this, zjeVar);
            }
        } else {
            tn10Var = new tn10(this, zjeVar);
        }
        Object obj = tn10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = tn10Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            nk10 nk10VarC = this.m.c();
            ly5 ly5Var = new ly5(0.0d, z ? lnm0.d : lnm0.e, false, nk10VarC.b, 1.0d, esr.NOTHING, nk10VarC.f23661a);
            tn10Var.k = 1;
            if (this.h.f(ly5Var, tn10Var) == wneVar) {
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
    public final java.lang.Object C(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.un10
            if (r0 == 0) goto L13
            r0 = r6
            a.un10 r0 = (a.un10) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.un10 r0 = new a.un10
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            a.fq r5 = r5.h
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
        throw new UnsupportedOperationException("Method not decompiled: a.bo10.C(a.zje):java.lang.Object");
    }

    public final void D(c8h0 c8h0Var, boolean z) {
        ctf0 ctf0Var;
        bo10 bo10Var = this;
        c8h0 c8h0Var2 = c8h0Var;
        bo10Var.Q = c8h0Var2;
        x9v0 x9v0Var = bo10Var.H;
        if (x9v0Var == null) {
            return;
        }
        int i = x9v0Var.f40528a;
        long j = x9v0Var.b;
        bo10Var.G = j == 0 && i > 0;
        while (true) {
            p7m0 p7m0Var = bo10Var.v;
            Object value = p7m0Var.getValue();
            if (p7m0Var.m(value, new mav0(true, x9v0Var.d, null, null, false))) {
                break;
            }
            bo10Var = this;
            c8h0Var2 = c8h0Var;
        }
        while (true) {
            p7m0 p7m0Var2 = bo10Var.w;
            Object value2 = p7m0Var2.getValue();
            ctf0Var = bo10Var.c;
            if (p7m0Var2.m(value2, new gzk0(c8h0Var2, (j != 0 || i <= 0) ? ctf0Var.f(R.string.lucky_wheel_spin_for_money, new Object[0]) : ctf0Var.f(R.string.lucky_wheel_free_spin_with_count_v2, 1)))) {
                break;
            }
            bo10Var = this;
            c8h0Var2 = c8h0Var;
        }
        while (true) {
            p7m0 p7m0Var3 = bo10Var.x;
            Object value3 = p7m0Var3.getValue();
            if (p7m0Var3.m(value3, new rxk0(ctf0Var.f(R.string.lucky_wheel_spin_all_v2, Integer.valueOf(Integer.min(i, 100))), i > 1 && j == 0 && c8h0Var2 == c8h0.f3914a))) {
                break;
            }
            bo10Var = this;
            c8h0Var2 = c8h0Var;
        }
        yje yjeVar = null;
        twn.A(c8h0Var2 == c8h0.f3914a && z, bo10Var.C, null);
        c8h0 c8h0Var3 = c8h0.b;
        twn.A(c8h0Var2 == c8h0Var3, bo10Var.E, null);
        Boolean boolValueOf = Boolean.valueOf(c8h0Var2 == c8h0Var3);
        p7m0 p7m0Var4 = bo10Var.D;
        p7m0Var4.getClass();
        p7m0Var4.o(null, boolValueOf);
        sac.V(jiu0.a(bo10Var), new pf10(1, this, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, bo10Var.d.c, new khx(this, x9v0Var, c8h0Var2, yjeVar, (byte) 8), 10);
    }

    public final void E() {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        p7m0 p7m0Var3;
        Object value3;
        if (this.N) {
            Boolean bool = Boolean.FALSE;
            p7m0 p7m0Var4 = this.D;
            p7m0Var4.getClass();
            yje yjeVar = null;
            p7m0Var4.o(null, bool);
            p7m0 p7m0Var5 = this.E;
            p7m0Var5.getClass();
            p7m0Var5.o(null, bool);
            do {
                p7m0Var = this.x;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, rxk0.a((rxk0) value)));
            do {
                p7m0Var2 = this.w;
                value2 = p7m0Var2.getValue();
                c8h0 c8h0Var = c8h0.f3914a;
            } while (!p7m0Var2.m(value2, gzk0.a((gzk0) value2)));
            Boolean bool2 = Boolean.FALSE;
            p7m0 p7m0Var6 = this.C;
            p7m0Var6.getClass();
            p7m0Var6.o(null, bool2);
            do {
                p7m0Var3 = this.y;
                value3 = p7m0Var3.getValue();
            } while (!p7m0Var3.m(value3, snq0.a((snq0) value3, c8h0.c, null, 2)));
            this.o.f16351a.a(xun.f41520a, 3014L);
            this.p.f13566a.c("games_promos_lucky_wheel");
            sac.V(jiu0.a(this), new qn10(this, (byte) 1), null, this.d.b, new vn10(this, yjeVar, (byte) 1), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object F(long j, csr csrVar, boolean z, zje zjeVar) {
        xn10 xn10Var;
        long j2;
        csr csrVar2;
        boolean z2;
        csr csrVar3;
        String str;
        a570 a570Var;
        long j3;
        Iterator it;
        Object next;
        pbv pbvVar;
        jz60 jz60Var;
        Object objA;
        lz60 lz60Var;
        boolean z3;
        String str2;
        long j4;
        a570 a570Var2;
        boolean zBooleanValue;
        String str3;
        String str4;
        long j5;
        boolean z4;
        lz60 lz60Var2;
        if (zjeVar instanceof xn10) {
            xn10Var = (xn10) zjeVar;
            int i = xn10Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn10Var.q = i - Integer.MIN_VALUE;
            } else {
                xn10Var = new xn10(this, zjeVar);
            }
        } else {
            xn10Var = new xn10(this, zjeVar);
        }
        xn10 xn10Var2 = xn10Var;
        Object obj = xn10Var2.o;
        Object obj2 = wne.f39444a;
        int i2 = xn10Var2.q;
        if (i2 == 0) {
            z1x.P(obj);
            xn10Var2.j = csrVar;
            xn10Var2.i = j;
            xn10Var2.n = z;
            xn10Var2.q = 1;
            Object objA2 = this.i.a(j, xn10Var2);
            if (objA2 != obj2) {
                j2 = j;
                csrVar2 = csrVar;
                z2 = z;
                obj = objA2;
            }
            return obj2;
        }
        if (i2 == 1) {
            z2 = xn10Var2.n;
            j2 = xn10Var2.i;
            csrVar2 = xn10Var2.j;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                z2 = xn10Var2.n;
                j3 = xn10Var2.i;
                str = xn10Var2.l;
                a570Var = xn10Var2.k;
                csrVar3 = xn10Var2.j;
                z1x.P(obj);
                it = ((Iterable) obj).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((pbv) next).f26728a != j3);
                pbvVar = (pbv) next;
                if (pbvVar != null) {
                    hds hdsVar = pbvVar.n;
                }
                xn10Var2.j = csrVar3;
                xn10Var2.k = a570Var;
                xn10Var2.l = str;
                jz60Var = jz60.f17395a;
                xn10Var2.m = jz60Var;
                xn10Var2.i = j3;
                xn10Var2.n = z2;
                xn10Var2.q = 3;
                objA = this.k.a(j3, xn10Var2);
                if (objA != obj2) {
                    lz60Var = jz60Var;
                    obj = objA;
                    z3 = z2;
                    a570 a570Var3 = a570Var;
                    str2 = str;
                    j4 = j3;
                    a570Var2 = a570Var3;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (a570Var2 != null) {
                        if (a570Var2 instanceof w470) {
                            xn10Var2.j = null;
                            xn10Var2.k = null;
                            xn10Var2.l = str2;
                            xn10Var2.m = lz60Var;
                            xn10Var2.i = j4;
                            xn10Var2.n = z3;
                            xn10Var2.q = 4;
                            if (G(j4, xn10Var2, csrVar3) != obj2) {
                                str4 = str2;
                                j5 = j4;
                                z4 = z3;
                                lz60Var2 = lz60Var;
                            }
                        } else if (a570Var2 instanceof z470) {
                            xn10Var2.j = null;
                            xn10Var2.k = null;
                            xn10Var2.l = str2;
                            xn10Var2.m = lz60Var;
                            xn10Var2.i = j4;
                            xn10Var2.n = z3;
                            xn10Var2.q = 5;
                            str3 = str2;
                            if (H(j4, csrVar3, zBooleanValue, str3, xn10Var2) != obj2) {
                                str4 = str3;
                                j5 = j4;
                                z4 = z3;
                                lz60Var2 = lz60Var;
                            }
                        }
                    }
                    t9f.b();
                    return null;
                }
                return obj2;
            }
            if (i2 == 3) {
                boolean z5 = xn10Var2.n;
                long j6 = xn10Var2.i;
                lz60 lz60Var3 = xn10Var2.m;
                str2 = xn10Var2.l;
                a570Var2 = xn10Var2.k;
                csrVar3 = xn10Var2.j;
                z1x.P(obj);
                z3 = z5;
                lz60Var = lz60Var3;
                j4 = j6;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (a570Var2 != null) {
                    if (a570Var2 instanceof w470) {
                        xn10Var2.j = null;
                        xn10Var2.k = null;
                        xn10Var2.l = str2;
                        xn10Var2.m = lz60Var;
                        xn10Var2.i = j4;
                        xn10Var2.n = z3;
                        xn10Var2.q = 4;
                        if (G(j4, xn10Var2, csrVar3) != obj2) {
                            str4 = str2;
                            j5 = j4;
                            z4 = z3;
                            lz60Var2 = lz60Var;
                        }
                        return obj2;
                    }
                    if (a570Var2 instanceof z470) {
                        xn10Var2.j = null;
                        xn10Var2.k = null;
                        xn10Var2.l = str2;
                        xn10Var2.m = lz60Var;
                        xn10Var2.i = j4;
                        xn10Var2.n = z3;
                        xn10Var2.q = 5;
                        str3 = str2;
                        if (H(j4, csrVar3, zBooleanValue, str3, xn10Var2) != obj2) {
                            str4 = str3;
                            j5 = j4;
                            z4 = z3;
                            lz60Var2 = lz60Var;
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
            z4 = xn10Var2.n;
            j5 = xn10Var2.i;
            lz60Var2 = xn10Var2.m;
            str4 = xn10Var2.l;
            z1x.P(obj);
        }
        int i3 = (int) j5;
        this.o.m(i3, z4, str4, lz60Var2);
        this.q.m(i3, z4, str4, lz60Var2);
        return Unit.f46060a;
        a570 a570Var4 = (a570) obj;
        String string = a570Var4 instanceof z470 ? UUID.randomUUID().toString() : "";
        string.getClass();
        xn10Var2.j = csrVar2;
        xn10Var2.k = a570Var4;
        xn10Var2.l = string;
        xn10Var2.i = j2;
        xn10Var2.n = z2;
        xn10Var2.q = 2;
        Object objK = lbu.k(this.s, 0, xn10Var2, 3);
        if (objK != obj2) {
            long j7 = j2;
            csrVar3 = csrVar2;
            str = string;
            a570Var = a570Var4;
            obj = objK;
            j3 = j7;
            it = ((Iterable) obj).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((pbv) next).f26728a != j3);
            pbvVar = (pbv) next;
            if (pbvVar != null) {
                hds hdsVar2 = pbvVar.n;
            }
            xn10Var2.j = csrVar3;
            xn10Var2.k = a570Var;
            xn10Var2.l = str;
            jz60Var = jz60.f17395a;
            xn10Var2.m = jz60Var;
            xn10Var2.i = j3;
            xn10Var2.n = z2;
            xn10Var2.q = 3;
            objA = this.k.a(j3, xn10Var2);
            if (objA != obj2) {
                lz60Var = jz60Var;
                obj = objA;
                z3 = z2;
                a570 a570Var5 = a570Var;
                str2 = str;
                j4 = j3;
                a570Var2 = a570Var5;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (a570Var2 != null) {
                    if (a570Var2 instanceof w470) {
                        xn10Var2.j = null;
                        xn10Var2.k = null;
                        xn10Var2.l = str2;
                        xn10Var2.m = lz60Var;
                        xn10Var2.i = j4;
                        xn10Var2.n = z3;
                        xn10Var2.q = 4;
                        if (G(j4, xn10Var2, csrVar3) != obj2) {
                            str4 = str2;
                            j5 = j4;
                            z4 = z3;
                            lz60Var2 = lz60Var;
                        }
                    } else if (a570Var2 instanceof z470) {
                        xn10Var2.j = null;
                        xn10Var2.k = null;
                        xn10Var2.l = str2;
                        xn10Var2.m = lz60Var;
                        xn10Var2.i = j4;
                        xn10Var2.n = z3;
                        xn10Var2.q = 5;
                        str3 = str2;
                        if (H(j4, csrVar3, zBooleanValue, str3, xn10Var2) != obj2) {
                            str4 = str3;
                            j5 = j4;
                            z4 = z3;
                            lz60Var2 = lz60Var;
                        }
                    }
                    int i4 = (int) j5;
                    this.o.m(i4, z4, str4, lz60Var2);
                    this.q.m(i4, z4, str4, lz60Var2);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(long j, zje zjeVar, csr csrVar) {
        yn10 yn10Var;
        if (zjeVar instanceof yn10) {
            yn10Var = (yn10) zjeVar;
            int i = yn10Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                yn10Var.m = i - Integer.MIN_VALUE;
            } else {
                yn10Var = new yn10(this, zjeVar);
            }
        } else {
            yn10Var = new yn10(this, zjeVar);
        }
        Object objA = yn10Var.k;
        wne wneVar = wne.f39444a;
        int i2 = yn10Var.m;
        if (i2 == 0) {
            z1x.P(objA);
            yn10Var.j = csrVar;
            yn10Var.i = j;
            yn10Var.m = 1;
            objA = this.j.a(j, yn10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = yn10Var.i;
            csrVar = yn10Var.j;
            z1x.P(objA);
        }
        FragmentScreen fragmentScreenA = this.t.a(j, csrVar, (String) objA);
        if (fragmentScreenA != null) {
            i1w0 i1w0Var = this.b;
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
    public final Object H(long j, csr csrVar, boolean z, String str, zje zjeVar) {
        zn10 zn10Var;
        WebGameScreenFactoryImpl$getWebGameScreen$2 webGameScreenFactoryImpl$getWebGameScreen$2B;
        if (zjeVar instanceof zn10) {
            zn10Var = (zn10) zjeVar;
            int i = zn10Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn10Var.l = i - Integer.MIN_VALUE;
            } else {
                zn10Var = new zn10(this, zjeVar);
            }
        } else {
            zn10Var = new zn10(this, zjeVar);
        }
        Object objA = zn10Var.j;
        wne wneVar = wne.f39444a;
        int i2 = zn10Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            webGameScreenFactoryImpl$getWebGameScreen$2B = this.t.b(j, csrVar, z, str);
            zn10Var.i = webGameScreenFactoryImpl$getWebGameScreen$2B;
            zn10Var.l = 1;
            objA = this.n.a(j, zn10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            webGameScreenFactoryImpl$getWebGameScreen$2B = zn10Var.i;
            z1x.P(objA);
        }
        boolean z2 = !((Boolean) objA).booleanValue();
        i1w0 i1w0Var = this.b;
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

    public final void I(csr csrVar) {
        String strF;
        p7m0 p7m0Var;
        Object value;
        int i = 0;
        boolean z = csrVar != null;
        esr esrVar = csrVar != null ? csrVar.f4905a.f3145a : esr.NOTHING;
        boolean z2 = (esrVar == esr.FREE_SPIN || esrVar == esr.SPECIAL_BONUS || esrVar == esr.NOTHING) ? false : true;
        if (csrVar != null) {
            strF = csrVar.b;
        } else {
            strF = this.c.f(R.string.game_try_again, new Object[0]);
        }
        String str = strF;
        switch (esrVar.ordinal()) {
            case 0:
                i = R.drawable.ic_result_nothing;
                break;
            case 1:
                i = R.drawable.ic_result_double_bonus;
                break;
            case 2:
                i = R.drawable.ic_result_return_half;
                break;
            case 3:
                i = R.drawable.ic_result_free_bet;
                break;
            case 4:
                i = R.drawable.ic_result_free_spin;
                break;
            case 5:
                i = R.drawable.ic_result_wild_free_bet;
                break;
            case 6:
                i = R.drawable.ic_result_special_bonus;
                break;
        }
        fqs fqsVar = new fqs(i, z ? R.string.win_title : R.string.game_bad_luck, z ? R.color.result_win_title_color : R.color.result_loose_title_color, str, true, z2);
        do {
            p7m0Var = this.z;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, fqsVar));
    }

    public final void w(Throwable th) {
        if (!this.N || agc.M(th)) {
            return;
        }
        sac.V(jiu0.a(this), sn10.f32472a, null, this.d.f22085a, new juy((Object) this, (Object) th, (yje) null, (byte) 28), 10);
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        p7m0 p7m0Var3;
        Object value3;
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0Var4 = this.C;
        p7m0Var4.getClass();
        p7m0Var4.o(null, bool);
        do {
            p7m0Var = this.w;
            value = p7m0Var.getValue();
            c8h0 c8h0Var = c8h0.f3914a;
        } while (!p7m0Var.m(value, gzk0.a((gzk0) value)));
        do {
            p7m0Var2 = this.x;
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, rxk0.a((rxk0) value2)));
        do {
            p7m0Var3 = this.y;
            value3 = p7m0Var3.getValue();
        } while (!p7m0Var3.m(value3, snq0.a((snq0) value3, c8h0.c, null, 2)));
        CountDownTimer countDownTimer = this.K;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.K = null;
    }

    public final void y() {
        p7m0 p7m0Var;
        Object value;
        iun iunVar;
        do {
            p7m0Var = this.A;
            value = p7m0Var.getValue();
            iunVar = iun.f15405a;
            ((fyb0) value).getClass();
            iunVar.getClass();
        } while (!p7m0Var.m(value, new fyb0(iunVar, false)));
    }

    public final void z() {
        p7m0 p7m0Var;
        Object value;
        fqs fqsVar;
        do {
            p7m0Var = this.z;
            value = p7m0Var.getValue();
            fqsVar = (fqs) value;
        } while (!p7m0Var.m(value, new fqs(fqsVar.b, fqsVar.c, fqsVar.d, fqsVar.e, false, fqsVar.f)));
    }
}
