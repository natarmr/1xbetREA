package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class dyu0 extends i3t0 {
    public static final /* synthetic */ int O = 0;
    public final lbu A;
    public final edu B;
    public final hsj C;
    public final roi0 D;
    public final qrt E;
    public final c5k F;
    public final ctf0 G;
    public final ih5 H;
    public final l7k I;
    public final cmt J;
    public bby K;
    public bby L;
    public bby M;
    public bby N;
    public final vzg0 o;
    public final i1w0 p;
    public final xrs q;
    public final iw20 r;
    public final nrt s;
    public final v88 t;
    public final cyh u;
    public final z4w0 v;
    public final mne w;
    public final ort x;
    public final duj y;
    public final x1u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyu0(vzg0 vzg0Var, i1w0 i1w0Var, xrs xrsVar, iw20 iw20Var, nrt nrtVar, v88 v88Var, cyh cyhVar, z4w0 z4w0Var, mne mneVar, ort ortVar, duj dujVar, x1u x1uVar, lbu lbuVar, edu eduVar, hsj hsjVar, roi0 roi0Var, qrt qrtVar, c5k c5kVar, ctf0 ctf0Var, ih5 ih5Var, l7k l7kVar, cmt cmtVar) {
        super(new ugu0(xrsVar, vzg0Var, (byte) 4), cvm0.p(mneVar.c, mneVar.f22085a), new uwu0(ctf0Var, (byte) 1), (yzn0) null);
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = xrsVar;
        this.r = iw20Var;
        this.s = nrtVar;
        this.t = v88Var;
        this.u = cyhVar;
        this.v = z4w0Var;
        this.w = mneVar;
        this.x = ortVar;
        this.y = dujVar;
        this.z = x1uVar;
        this.A = lbuVar;
        this.B = eduVar;
        this.C = hsjVar;
        this.D = roi0Var;
        this.E = qrtVar;
        this.F = c5kVar;
        this.G = ctf0Var;
        this.H = ih5Var;
        this.I = l7kVar;
        this.J = cmtVar;
        x(xvu0.f41580a);
    }

    public final void M(axu0 axu0Var) {
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            axu0 axu0Var2 = axu0Var;
            if (p7m0Var.m(value, txu0.a((txu0) value, null, false, axu0Var2, null, null, false, false, 0.0d, Response.SERVICE_UNAVAILABLE))) {
                break;
            } else {
                axu0Var = axu0Var2;
            }
        }
        if (StringsKt.W(((txu0) D()).b)) {
            return;
        }
        String str = ((txu0) D()).b;
        axu0 axu0Var3 = ((txu0) D()).d;
        e3c.n(this.N);
        this.N = I(this.w.b, new wxu0(this, (byte) 2), new em4(str, this, axu0Var3, null, (byte) 5));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object N(long j, zje zjeVar) {
        zxu0 zxu0Var;
        long j2;
        Object value;
        ig5 ig5Var;
        if (zjeVar instanceof zxu0) {
            zxu0Var = (zxu0) zjeVar;
            int i = zxu0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zxu0Var.m = i - Integer.MIN_VALUE;
            } else {
                zxu0Var = new zxu0(this, zjeVar);
            }
        } else {
            zxu0Var = new zxu0(this, zjeVar);
        }
        zxu0 zxu0Var2 = zxu0Var;
        Object objO = zxu0Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = zxu0Var2.m;
        xrs xrsVar = this.q;
        if (i2 == 0) {
            z1x.P(objO);
            long j3 = xrsVar.f41384a;
            zxu0Var2.i = j;
            zxu0Var2.m = 1;
            objO = this.C.o(j, j3, zxu0Var2);
            if (objO != wneVar) {
                j2 = j;
            }
            return wneVar;
        }
        if (i2 == 1) {
            long j4 = zxu0Var2.i;
            z1x.P(objO);
            j2 = j4;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ig5Var = zxu0Var2.j;
            z1x.P(objO);
        }
        vyu0 vyu0Var = (vyu0) objO;
        M(new axu0(true, ig5Var.f14719a, ig5Var.b, 0.0d, vyu0Var.b, vyu0Var.c));
        return Unit.f46060a;
        ig5 ig5Var2 = (ig5) objO;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, txu0.a((txu0) value, null, ig5Var2.c, null, null, null, false, false, 0.0d, 507)));
        long j5 = xrsVar.f41384a;
        zxu0Var2.j = ig5Var2;
        zxu0Var2.i = j2;
        zxu0Var2.m = 2;
        Object objJ = this.B.j(0.0d, j2, j5, zxu0Var2);
        if (objJ != wneVar) {
            ig5Var = ig5Var2;
            objO = objJ;
            vyu0 vyu0Var2 = (vyu0) objO;
            M(new axu0(true, ig5Var.f14719a, ig5Var.b, 0.0d, vyu0Var2.b, vyu0Var2.c));
            return Unit.f46060a;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object O(long j, zje zjeVar) {
        ayu0 ayu0Var;
        long j2;
        Object g0g0Var;
        Object value;
        ql5 ql5Var;
        Object objC;
        ql5 ql5Var2;
        if (zjeVar instanceof ayu0) {
            ayu0Var = (ayu0) zjeVar;
            int i = ayu0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayu0Var.m = i - Integer.MIN_VALUE;
            } else {
                ayu0Var = new ayu0(this, zjeVar);
            }
        } else {
            ayu0Var = new ayu0(this, zjeVar);
        }
        ayu0 ayu0Var2 = ayu0Var;
        Object objO = ayu0Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = ayu0Var2.m;
        xrs xrsVar = this.q;
        if (i2 == 0) {
            z1x.P(objO);
            try {
                e0g0 e0g0Var = j0g0.b;
                hsj hsjVar = this.C;
                long j3 = xrsVar.b;
                ayu0Var2.j = null;
                ayu0Var2.i = j;
                ayu0Var2.m = 1;
                objO = hsjVar.o(j3, j, ayu0Var2);
                if (objO != wneVar) {
                    j2 = j;
                }
            } catch (Throwable th) {
                th = th;
                j2 = j;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            return wneVar;
        }
        if (i2 == 1) {
            j2 = ayu0Var2.i;
            try {
                z1x.P(objO);
            } catch (Throwable th2) {
                th = th2;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 == 2) {
                j2 = ayu0Var2.i;
                z1x.P(objO);
                ql5Var = (ql5) objO;
                long j4 = xrsVar.b;
                long j5 = ql5Var.f28916a;
                ayu0Var2.j = ql5Var;
                ayu0Var2.i = j2;
                ayu0Var2.m = 3;
                objC = this.A.c(0.0d, j4, j5, ayu0Var2);
                if (objC != wneVar) {
                    ql5Var2 = ql5Var;
                    objO = objC;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var2 = ayu0Var2.j;
            z1x.P(objO);
        }
        vyu0 vyu0Var = (vyu0) objO;
        M(new axu0(true, ql5Var2.b, ql5Var2.f, 0.0d, vyu0Var.b, vyu0Var.c));
        return Unit.f46060a;
        g0g0Var = Boolean.valueOf(((ig5) objO).c);
        e0g0 e0g0Var4 = j0g0.b;
        Object obj = Boolean.TRUE;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, txu0.a((txu0) value, null, zBooleanValue, null, null, null, false, false, 0.0d, 507)));
        tl5 tl5Var = tl5.f34128a;
        ayu0Var2.j = null;
        ayu0Var2.i = j2;
        ayu0Var2.m = 2;
        objO = this.s.f24022a.g(j2, tl5Var, ayu0Var2);
        if (objO != wneVar) {
            ql5Var = (ql5) objO;
            long j6 = xrsVar.b;
            long j7 = ql5Var.f28916a;
            ayu0Var2.j = ql5Var;
            ayu0Var2.i = j2;
            ayu0Var2.m = 3;
            objC = this.A.c(0.0d, j6, j7, ayu0Var2);
            if (objC != wneVar) {
                ql5Var2 = ql5Var;
                objO = objC;
                vyu0 vyu0Var2 = (vyu0) objO;
                M(new axu0(true, ql5Var2.b, ql5Var2.f, 0.0d, vyu0Var2.b, vyu0Var2.c));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void x(ewu0 ewu0Var) {
        Object value;
        txu0 txu0Var;
        fwu0 fwu0Var;
        String str;
        ewu0Var.getClass();
        super.x(ewu0Var);
        byte b = 2;
        byte b2 = 1;
        yje yjeVar = null;
        if (ewu0Var.equals(xvu0.f41580a)) {
            i3t0.K(this, null, new las0(1, this.y, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), new yxu0(this, yjeVar, b), 1);
            return;
        }
        if (ewu0Var.equals(wvu0.f39857a)) {
            E();
            return;
        }
        boolean z = ewu0Var instanceof zvu0;
        mne mneVar = this.w;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            String str2 = ((zvu0) ewu0Var).f45074a;
            this.o.e("SUM_TEXT_STATE", str2);
            p7m0 p7m0Var = ocjVar.f25029a;
            while (true) {
                Object value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
                str = str2;
                if (p7m0Var.m(value2, txu0.a((txu0) value2, str, false, null, null, null, false, false, 0.0d, 509))) {
                    break;
                } else {
                    str2 = str;
                }
            }
            if (((txu0) D()).d.f1639a) {
                axu0 axu0Var = ((txu0) D()).d;
                e3c.n(this.N);
                this.N = I(mneVar.b, new wxu0(this, b), new em4(str, this, axu0Var, yjeVar, (byte) 5));
                return;
            }
            return;
        }
        boolean zEquals = ewu0Var.equals(yvu0.f43338a);
        xrs xrsVar = this.q;
        if (zEquals) {
            hwu0 hwu0Var = ((txu0) D()).e.b;
            hwu0 hwu0Var2 = hwu0.f13783a;
            byte b3 = 0;
            if (hwu0Var == hwu0Var2 && ((txu0) D()).c) {
                e3c.n(this.K);
                this.K = I(mneVar.b, new wxu0(this, b2), new yxu0(this, yjeVar, b3));
            } else if (((txu0) D()).e.b == hwu0Var2) {
                e3c.n(this.L);
                this.L = I(mneVar.b, new wxu0(this, b3), new fwk0(this, yjeVar, (byte) 7));
            } else {
                this.H.f(k7k.AggregatorWalletTransfer);
                y1p y1pVar = y1p.MAIN;
                this.I.b("aggregator_bottom_wallet", this.J.g());
                v88.b(this.t, this.p, xrsVar.f41384a, 2);
            }
            G(lxu0.f20833a);
            return;
        }
        if (ewu0Var instanceof bwu0) {
            this.v.a(((bwu0) ewu0Var).f3345a);
            return;
        }
        if (ewu0Var.equals(awu0.f1593a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                txu0Var = (txu0) value;
                oyg0Var.getClass();
                fwu0Var = txu0Var.e;
            } while (!p7m0Var2.m(value, txu0.a(txu0Var, null, false, null, new fwu0(fwu0Var.f10278a, fwu0Var.b, true), null, false, false, 0.0d, 431)));
            return;
        }
        if (ewu0Var instanceof cwu0) {
            String str3 = ((cwu0) ewu0Var).f5096a;
            if (((txu0) D()).i == 0.0d) {
                return;
            }
            G(xrsVar.c ? new qxu0(str3) : new rxu0(str3));
            return;
        }
        if (!(ewu0Var instanceof dwu0)) {
            t9f.b();
            return;
        }
        String str4 = ((dwu0) ewu0Var).f6817a;
        if (str4.length() > 0) {
            G(new pxu0(str4));
        }
    }

    public final void Q(String str, final double d, final double d2, final String str2, final double d3, axu0 axu0Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        H(new Function2() { // from class: a.xxu0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                txu0 txu0Var = (txu0) obj2;
                ((oyg0) obj).getClass();
                txu0Var.getClass();
                axu0 axu0Var2 = txu0Var.d;
                double d4 = d2;
                Double dValueOf = Double.valueOf(d4);
                if (d < axu0Var2.f) {
                    dValueOf = null;
                }
                double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
                boolean z = axu0Var2.f1639a;
                double d5 = axu0Var2.b;
                String str3 = axu0Var2.c;
                str3.getClass();
                String str4 = str2;
                str4.getClass();
                return txu0.a(txu0Var, null, false, new axu0(z, d5, str3, dDoubleValue, str4, d3), null, null, false, false, d4, 247);
            }
        });
        boolean zW = StringsKt.W(str);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zW) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, txu0.a((txu0) value4, null, false, null, new fwu0(gwu0.f12046a, hwu0.f13783a, false), null, false, false, 0.0d, 463)));
            return;
        }
        if (d > axu0Var.b) {
            double d4 = axu0Var.f;
            if (this.q.c) {
                H(new iwg0(d, d4, (byte) 1));
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, txu0.a((txu0) value3, null, false, null, new fwu0(gwu0.f12046a, hwu0.f13783a, false), cxu0.f5142a, false, false, 0.0d, 463)));
            return;
        }
        if (d >= d3) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, txu0.a((txu0) value, null, false, null, new fwu0(gwu0.f12046a, hwu0.f13783a, true), null, false, false, 0.0d, 463)));
            return;
        }
        String str3 = axu0Var.c;
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value2 = p7m0Var4.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var4.m(value2, txu0.a((txu0) value2, null, false, null, new fwu0(gwu0.f12046a, hwu0.f13783a, false), new bxu0(str3, d3), false, false, 0.0d, 463)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object R(String str, double d, axu0 axu0Var, zje zjeVar) {
        byu0 byu0Var;
        String str2;
        Object obj;
        axu0 axu0Var2;
        double d2;
        if (zjeVar instanceof byu0) {
            byu0Var = (byu0) zjeVar;
            int i = byu0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                byu0Var.n = i - Integer.MIN_VALUE;
            } else {
                byu0Var = new byu0(this, zjeVar);
            }
        } else {
            byu0Var = new byu0(this, zjeVar);
        }
        byu0 byu0Var2 = byu0Var;
        Object obj2 = byu0Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = byu0Var2.n;
        if (i2 == 0) {
            z1x.P(obj2);
            xrs xrsVar = this.q;
            long j = xrsVar.b;
            long j2 = xrsVar.f41384a;
            str2 = str;
            byu0Var2.i = str2;
            byu0Var2.j = axu0Var;
            byu0Var2.k = d;
            byu0Var2.n = 1;
            Object objC = this.A.c(d, j, j2, byu0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
            obj = objC;
            axu0Var2 = axu0Var;
            d2 = d;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = byu0Var2.k;
            axu0 axu0Var3 = byu0Var2.j;
            String str3 = byu0Var2.i;
            z1x.P(obj2);
            axu0Var2 = axu0Var3;
            obj = obj2;
            str2 = str3;
        }
        vyu0 vyu0Var = (vyu0) obj;
        Q(str2, d2, vyu0Var.f38268a, vyu0Var.b, vyu0Var.c, axu0Var2);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object S(String str, double d, axu0 axu0Var, zje zjeVar) {
        cyu0 cyu0Var;
        String str2;
        Object obj;
        axu0 axu0Var2;
        double d2;
        if (zjeVar instanceof cyu0) {
            cyu0Var = (cyu0) zjeVar;
            int i = cyu0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cyu0Var.n = i - Integer.MIN_VALUE;
            } else {
                cyu0Var = new cyu0(this, zjeVar);
            }
        } else {
            cyu0Var = new cyu0(this, zjeVar);
        }
        cyu0 cyu0Var2 = cyu0Var;
        Object obj2 = cyu0Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = cyu0Var2.n;
        if (i2 == 0) {
            z1x.P(obj2);
            xrs xrsVar = this.q;
            long j = xrsVar.b;
            long j2 = xrsVar.f41384a;
            str2 = str;
            cyu0Var2.i = str2;
            cyu0Var2.j = axu0Var;
            cyu0Var2.k = d;
            cyu0Var2.n = 1;
            Object objJ = this.B.j(d, j, j2, cyu0Var2);
            if (objJ == wneVar) {
                return wneVar;
            }
            obj = objJ;
            axu0Var2 = axu0Var;
            d2 = d;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = cyu0Var2.k;
            axu0 axu0Var3 = cyu0Var2.j;
            String str3 = cyu0Var2.i;
            z1x.P(obj2);
            axu0Var2 = axu0Var3;
            obj = obj2;
            str2 = str3;
        }
        vyu0 vyu0Var = (vyu0) obj;
        Q(str2, d2, vyu0Var.f38268a, vyu0Var.b, vyu0Var.c, axu0Var2);
        return Unit.f46060a;
    }
}
