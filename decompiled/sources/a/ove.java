package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ove extends x2t0 {
    public final /* synthetic */ byte h = 1;
    public final ctf0 i;
    public final gud j;
    public final xzp k;
    public final cr l;
    public final esg0 m;
    public final jtj n;
    public final pq o;
    public final npx p;
    public final ywq0 q;
    public final mii0 r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ove(lbu lbuVar, gud gudVar, cr crVar, xzp xzpVar, esg0 esg0Var, ywq0 ywq0Var, jtj jtjVar, pq pqVar, npx npxVar, mii0 mii0Var, vqc vqcVar, x20 x20Var, duj dujVar, ctf0 ctf0Var) {
        super(new yld((byte) 19));
        ctf0Var.getClass();
        this.s = lbuVar;
        this.j = gudVar;
        this.l = crVar;
        this.k = xzpVar;
        this.m = esg0Var;
        this.q = ywq0Var;
        this.n = jtjVar;
        this.o = pqVar;
        this.p = npxVar;
        this.r = mii0Var;
        this.t = vqcVar;
        this.u = x20Var;
        this.v = dujVar;
        this.i = ctf0Var;
    }

    @Override // a.j3t0
    public final /* bridge */ /* synthetic */ Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                return q((ive) obj, bnn0Var);
            default:
                return r((mbv0) obj, bnn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(int i, Integer num, long j, int i2, ctc ctcVar, zje zjeVar) {
        xav0 xav0Var;
        ctc ctcVar2;
        if (zjeVar instanceof xav0) {
            xav0Var = (xav0) zjeVar;
            int i3 = xav0Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xav0Var.l = i3 - Integer.MIN_VALUE;
            } else {
                xav0Var = new xav0(this, zjeVar);
            }
        } else {
            xav0Var = new xav0(this, zjeVar);
        }
        Object objF = xav0Var.j;
        wne wneVar = wne.f39444a;
        int i4 = xav0Var.l;
        if (i4 == 0) {
            z1x.P(objF);
            nms nmsVarL = l(num);
            m0k0 m0k0VarH0 = nmsVarL != null ? s0x.h0(nmsVarL, j, i2) : new m0k0(-1L, "", -1L, "", "", "", -1L, "", "", "", 0, "", -1, -1, "", "", 0, 0, "", "", "", "", -1L, false, -1L, -1L, false, -1L, -1L, "", false, false, false);
            seo seoVarK = k(i, num);
            if (seoVarK != null) {
                long j2 = seoVarK.i;
                reo reoVar = seoVarK.d;
                zxj0 zxj0Var = new zxj0(j2, reoVar.f30345a, seoVarK.m, reoVar.b, "", seoVarK.e, seoVarK.c, seoVarK.g, uoy.LINE, seoVarK.b, seoVarK.f32082a, false, yfa0.INSTANCE);
                gwe gweVar = gwe.DEFAULT;
                xav0Var.i = ctcVar;
                xav0Var.l = 1;
                objF = gud.f(this.j, m0k0VarH0, zxj0Var, gweVar, xav0Var);
                if (objF == wneVar) {
                    return wneVar;
                }
                ctcVar2 = ctcVar;
            }
            return Unit.f46060a;
        }
        if (i4 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ctcVar2 = xav0Var.i;
        z1x.P(objF);
        g(new sbv0((aud) objF, ctcVar2, ((vbv0) d()).b));
        return Unit.f46060a;
    }

    public void j(dao daoVar, m9s m9sVar) {
        long j = daoVar.c;
        long j2 = m9sVar.o;
        long j3 = m9sVar.p;
        mii0 mii0Var = this.r;
        if (j3 != 0) {
            mii0Var.K(j2, j, j3);
        } else {
            mii0Var.J(j2, j);
        }
        ((x20) this.u).g(j2, j, j3);
        long j4 = daoVar.c;
        String strZ = g1x.z(m9sVar, j4, this.i.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
        strZ.getClass();
        this.q.s(new yx6(m9sVar.o, m9sVar.f, j4, m9sVar.A, m9sVar.i, m9sVar.j, m9sVar.x, m9sVar.v, strZ, m9sVar.m, m9sVar.n), q8a.v0(daoVar));
    }

    public seo k(int i, Integer num) {
        Object next;
        Iterator it = ((vbv0) d()).d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f280 f280Var = (f280) next;
            if (f280Var.f8801a == i) {
                int i2 = f280Var.d.i;
                if (num != null && i2 == num.intValue()) {
                    break;
                }
            }
        }
        f280 f280Var2 = (f280) next;
        if (f280Var2 != null) {
            return f280Var2.d;
        }
        return null;
    }

    public nms l(Integer num) {
        Object next;
        Iterator it = ((vbv0) d()).c.iterator();
        while (it.hasNext()) {
            next = it.next();
            int i = ((nms) next).f23786a;
            if (num != null && i == num.intValue()) {
                return (nms) next;
            }
        }
        next = null;
        return (nms) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(m0k0 m0k0Var, zxj0 zxj0Var, m9s m9sVar, ms2 ms2Var, zje zjeVar) {
        jve jveVar;
        Object g0g0Var;
        if (zjeVar instanceof jve) {
            jveVar = (jve) zjeVar;
            int i = jveVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                jveVar.m = i - Integer.MIN_VALUE;
            } else {
                jveVar = new jve(this, zjeVar);
            }
        } else {
            jveVar = new jve(this, zjeVar);
        }
        Object objB = jveVar.k;
        wne wneVar = wne.f39444a;
        int i2 = jveVar.m;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                if (((lbu) this.s).j()) {
                    return Unit.f46060a;
                }
                e0g0 e0g0Var = j0g0.b;
                cr crVar = this.l;
                gwe gweVar = gwe.CYBER;
                jveVar.i = m9sVar;
                jveVar.j = ms2Var;
                jveVar.m = 1;
                objB = crVar.b(m0k0Var, zxj0Var, gweVar, hrs.f13547a, jveVar);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ms2Var = jveVar.j;
                m9sVar = jveVar.i;
                z1x.P(objB);
            }
            g0g0Var = (aud) objB;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        ms2 ms2Var2 = ms2Var;
        if (!(g0g0Var instanceof g0g0)) {
            g(new qve((aud) g0g0Var, ctc.b, ms2Var2, m9sVar.A, String.valueOf(m9sVar.f21426a)));
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            ((duj) this.v).b(thA, new bqd((byte) 13));
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            g(new wve(message));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(dao daoVar, m9s m9sVar, ms2 ms2Var, ctc ctcVar, zje zjeVar) {
        kve kveVar;
        Object g0g0Var;
        if (zjeVar instanceof kve) {
            kveVar = (kve) zjeVar;
            int i = kveVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kveVar.n = i - Integer.MIN_VALUE;
            } else {
                kveVar = new kve(this, zjeVar);
            }
        } else {
            kveVar = new kve(this, zjeVar);
        }
        Object objF = kveVar.l;
        wne wneVar = wne.f39444a;
        int i2 = kveVar.n;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                if (((lbu) this.s).j()) {
                    return Unit.f46060a;
                }
                String strZ = g1x.z(m9sVar, daoVar.c, this.i.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0)));
                e0g0 e0g0Var = j0g0.b;
                gud gudVar = this.j;
                m0k0 m0k0VarF = g1x.F(m9s.a(m9sVar, strZ, null, -17, 255), m9sVar.f21426a);
                zxj0 zxj0VarC0 = x9x.c0(daoVar);
                gwe gweVar = gwe.CYBER;
                kveVar.i = m9sVar;
                kveVar.j = ms2Var;
                kveVar.k = ctcVar;
                kveVar.n = 1;
                objF = gud.f(gudVar, m0k0VarF, zxj0VarC0, gweVar, kveVar);
                if (objF == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ctcVar = kveVar.k;
                ms2Var = kveVar.j;
                m9sVar = kveVar.i;
                z1x.P(objF);
            }
            g0g0Var = (aud) objF;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        ms2 ms2Var2 = ms2Var;
        ctc ctcVar2 = ctcVar;
        if (!(g0g0Var instanceof g0g0)) {
            aud audVar = (aud) g0g0Var;
            if ((audVar instanceof ttd) && (ms2Var2 instanceof lq2)) {
                ((vqc) this.t).k(pzb.C(new h6c(m9sVar, (lq2) ms2Var2, (byte) 28)));
            }
            g(new qve(audVar, ctcVar2, ms2Var2, m9sVar.A, String.valueOf(m9sVar.f21426a)));
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            ((duj) this.v).b(thA, new bqd((byte) 16));
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            g(new wve(message));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(zje zjeVar) {
        lve lveVar;
        Object g0g0Var;
        if (zjeVar instanceof lve) {
            lveVar = (lve) zjeVar;
            int i = lveVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lveVar.k = i - Integer.MIN_VALUE;
            } else {
                lveVar = new lve(this, zjeVar);
            }
        } else {
            lveVar = new lve(this, zjeVar);
        }
        Object obj = lveVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lveVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                esg0 esg0Var = this.m;
                lveVar.k = 1;
                if (esg0Var.Y(lveVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (!(g0g0Var instanceof g0g0)) {
            g(pve.f27658a);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            ((duj) this.v).b(thA, new bqd((byte) 14));
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            g(new wve(message));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(m0k0 m0k0Var, zxj0 zxj0Var, m9s m9sVar, ms2 ms2Var, zje zjeVar) {
        mve mveVar;
        Object g0g0Var;
        if (zjeVar instanceof mve) {
            mveVar = (mve) zjeVar;
            int i = mveVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                mveVar.n = i - Integer.MIN_VALUE;
            } else {
                mveVar = new mve(this, zjeVar);
            }
        } else {
            mveVar = new mve(this, zjeVar);
        }
        Object objN = mveVar.l;
        wne wneVar = wne.f39444a;
        int i2 = mveVar.n;
        try {
            if (i2 == 0) {
                z1x.P(objN);
                e0g0 e0g0Var = j0g0.b;
                xzp xzpVar = this.k;
                gwe gweVar = gwe.CYBER;
                mveVar.i = m0k0Var;
                mveVar.j = m9sVar;
                mveVar.k = ms2Var;
                mveVar.n = 1;
                objN = xzpVar.N(m0k0Var, zxj0Var, gweVar, mveVar);
                if (objN == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ms2Var = mveVar.k;
                m9sVar = mveVar.j;
                m0k0Var = mveVar.i;
                z1x.P(objN);
            }
            g0g0Var = (vtd) objN;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        ms2 ms2Var2 = ms2Var;
        if (!(g0g0Var instanceof g0g0)) {
            vtd vtdVar = (vtd) g0g0Var;
            if (ms2Var2 instanceof lq2) {
                ((vqc) this.t).k(pzb.C(new h6c(m0k0Var, (lq2) ms2Var2, (byte) 27)));
            }
            g(new qve(vtdVar, ctc.b, ms2Var2, m9sVar.A, String.valueOf(m9sVar.f21426a)));
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            ((duj) this.v).b(thA, new bqd((byte) 15));
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            g(new wve(message));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (n(r2, r3, r4, r5, r6) == r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (p(r2, r3, r4, r10, r6) == r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if (m(r2, r3, r4, r5, r6) == r0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017e, code lost:
    
        if (o(r6) == r0) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(a.ive r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ove.q(a.ive, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:102:0x0265  */
    /* JADX WARN: Code duplicated, block: B:103:0x0269  */
    /* JADX WARN: Code duplicated, block: B:111:0x0289  */
    /* JADX WARN: Code duplicated, block: B:113:0x029e  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a3 A[LOOP:5: B:76:0x01dd->B:114:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:128:0x0327  */
    /* JADX WARN: Code duplicated, block: B:130:0x0337  */
    /* JADX WARN: Code duplicated, block: B:132:0x033c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0343  */
    /* JADX WARN: Code duplicated, block: B:137:0x035e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0364  */
    /* JADX WARN: Code duplicated, block: B:142:0x036b  */
    /* JADX WARN: Code duplicated, block: B:143:0x036e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0383  */
    /* JADX WARN: Code duplicated, block: B:147:0x0385  */
    /* JADX WARN: Code duplicated, block: B:150:0x038b  */
    /* JADX WARN: Code duplicated, block: B:151:0x038e  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:170:0x03da  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:180:0x040d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0415  */
    /* JADX WARN: Code duplicated, block: B:187:0x0424  */
    /* JADX WARN: Code duplicated, block: B:194:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110 A[LOOP:3: B:50:0x010a->B:52:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x013e A[LOOP:4: B:54:0x0121->B:57:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0210  */
    /* JADX WARN: Code duplicated, block: B:81:0x0217  */
    /* JADX WARN: Code duplicated, block: B:83:0x0221  */
    /* JADX WARN: Code duplicated, block: B:84:0x022b  */
    /* JADX WARN: Code duplicated, block: B:86:0x022f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0236  */
    /* JADX WARN: Code duplicated, block: B:89:0x023a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x024f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0253  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03aa, code lost:
    
        if (r0 == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03d0, code lost:
    
        if (r0 == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03e9, code lost:
    
        if (v(r0, r2, r8) == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x041e, code lost:
    
        if (u(r8) == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        if (s(r2, r0, r8) == r9) goto L184;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(a.mbv0 r56, a.zje r57) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ove.r(a.mbv0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(m0k0 m0k0Var, zxj0 zxj0Var, zje zjeVar) {
        zav0 zav0Var;
        if (zjeVar instanceof zav0) {
            zav0Var = (zav0) zjeVar;
            int i = zav0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zav0Var.k = i - Integer.MIN_VALUE;
            } else {
                zav0Var = new zav0(this, zjeVar);
            }
        } else {
            zav0Var = new zav0(this, zjeVar);
        }
        Object objB = zav0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zav0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            gwe gweVar = gwe.DEFAULT;
            zav0Var.k = 1;
            objB = this.l.b(m0k0Var, zxj0Var, gweVar, hrs.f13547a, zav0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        g(new sbv0((aud) objB, ctc.b, ((vbv0) d()).b));
        return Unit.f46060a;
    }

    public void t(m0k0 m0k0Var, m97 m97Var) {
        long j = m0k0Var.f20959a;
        String str = m0k0Var.s;
        long j2 = m0k0Var.w;
        long j3 = m0k0Var.z;
        String str2 = m0k0Var.d;
        String str3 = m0k0Var.h;
        boolean z = m0k0Var.x;
        long j4 = m0k0Var.y;
        List listJ = q3d.j(m0k0Var.e, m0k0Var.f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            long j5 = j;
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
            j = j5;
        }
        long j6 = j;
        List listJ2 = q3d.j(m0k0Var.i, m0k0Var.j);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listJ2) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        this.q.s(new yx6(j6, str, j2, j3, str2, str3, z, j4, "", arrayList, arrayList2), y9a.U(m97Var));
        ouu ouuVar = (ouu) this.u;
        ((qe50) ouuVar.b).a(new za50(0, 7, 0L, 0L), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(zje zjeVar) {
        abv0 abv0Var;
        if (zjeVar instanceof abv0) {
            abv0Var = (abv0) zjeVar;
            int i = abv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                abv0Var.k = i - Integer.MIN_VALUE;
            } else {
                abv0Var = new abv0(this, zjeVar);
            }
        } else {
            abv0Var = new abv0(this, zjeVar);
        }
        Object obj = abv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = abv0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            abv0Var.k = 1;
            if (this.m.Y(abv0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        g(nbv0.f23261a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(m0k0 m0k0Var, zxj0 zxj0Var, zje zjeVar) {
        bbv0 bbv0Var;
        if (zjeVar instanceof bbv0) {
            bbv0Var = (bbv0) zjeVar;
            int i = bbv0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbv0Var.k = i - Integer.MIN_VALUE;
            } else {
                bbv0Var = new bbv0(this, zjeVar);
            }
        } else {
            bbv0Var = new bbv0(this, zjeVar);
        }
        Object objN = bbv0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bbv0Var.k;
        if (i2 == 0) {
            z1x.P(objN);
            gwe gweVar = gwe.DEFAULT;
            bbv0Var.k = 1;
            objN = this.k.N(m0k0Var, zxj0Var, gweVar, bbv0Var);
            if (objN == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objN);
        }
        g(new sbv0((vtd) objN, ctc.b, ((vbv0) d()).b));
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ove(ctf0 ctf0Var, gud gudVar, xzp xzpVar, cr crVar, esg0 esg0Var, pru pruVar, e1u e1uVar, jtj jtjVar, pq pqVar, npx npxVar, ywq0 ywq0Var, ouu ouuVar, mii0 mii0Var, x20 x20Var) {
        super(new y9v0((byte) 1));
        ctf0Var.getClass();
        this.i = ctf0Var;
        this.j = gudVar;
        this.k = xzpVar;
        this.l = crVar;
        this.m = esg0Var;
        this.s = pruVar;
        this.t = e1uVar;
        this.n = jtjVar;
        this.o = pqVar;
        this.p = npxVar;
        this.q = ywq0Var;
        this.u = ouuVar;
        this.r = mii0Var;
        this.v = x20Var;
    }
}
