package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class eh70 extends w46 {
    public static final Regex C = new Regex("^[0-9]*[.]$");
    public static final double D = -1.0d;
    public final q99 A;
    public c4m0 B;
    public final yn00 b;
    public final fq c;
    public final xcc d;
    public final l1u e;
    public final k1u f;
    public final slu g;
    public final yku h;
    public final gmt i;
    public final itt j;
    public final r8u k;
    public final mne l;
    public final bpi0 m;
    public final qni0 n;
    public final lg60 o;
    public final vcu p;
    public final a6u q;
    public final t0u r;
    public final wsf0 s;
    public final k4v t;
    public final y5s u;
    public final ax5 v;
    public boolean w;
    public boolean x;
    public double y;
    public final p7m0 z;

    public eh70(i1w0 i1w0Var, yn00 yn00Var, fq fqVar, xcc xccVar, l1u l1uVar, k1u k1uVar, slu sluVar, yku ykuVar, gmt gmtVar, itt ittVar, r8u r8uVar, qa60 qa60Var, mne mneVar, bpi0 bpi0Var, qni0 qni0Var, lg60 lg60Var, vcu vcuVar, a6u a6uVar, t0u t0uVar, wsf0 wsf0Var, k4v k4vVar, y5s y5sVar) {
        i1w0Var.getClass();
        yn00Var.getClass();
        fqVar.getClass();
        xccVar.getClass();
        l1uVar.getClass();
        k1uVar.getClass();
        sluVar.getClass();
        ykuVar.getClass();
        gmtVar.getClass();
        ittVar.getClass();
        r8uVar.getClass();
        qa60Var.getClass();
        bpi0Var.getClass();
        qni0Var.getClass();
        lg60Var.getClass();
        vcuVar.getClass();
        t0uVar.getClass();
        k4vVar.getClass();
        y5sVar.getClass();
        this.b = yn00Var;
        this.c = fqVar;
        this.d = xccVar;
        this.e = l1uVar;
        this.f = k1uVar;
        this.g = sluVar;
        this.h = ykuVar;
        this.i = gmtVar;
        this.j = ittVar;
        this.k = r8uVar;
        this.l = mneVar;
        this.m = bpi0Var;
        this.n = qni0Var;
        this.o = lg60Var;
        this.p = vcuVar;
        this.q = a6uVar;
        this.r = t0uVar;
        this.s = wsf0Var;
        this.t = k4vVar;
        this.u = y5sVar;
        this.v = new ax5(this);
        this.z = q7m0.a(new tg70(true, 0.0d, 0.0d, "", 0.0d, false, false, false, false, true, false, true, false));
        this.A = vtb.d(0, null, null, 7);
        slb.U(new dnq(new fnq(qa60Var.a(), new vf20(2, this, eh70.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 27), (byte) 4), new pr60(3, null, (byte) 5), (byte) 1), jiu0.a(this));
        if (y5sVar.d) {
            F(sg70.c);
        } else if (y5sVar.e) {
            F(sg70.f32147a);
        } else {
            F(sg70.b);
        }
        if (this.w || r8uVar.a()) {
            return;
        }
        D(this, 0L, 7);
    }

    public static /* synthetic */ void D(eh70 eh70Var, long j, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        eh70Var.C(j, (i & 2) == 0, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable A(zje zjeVar) {
        zg70 zg70Var;
        if (zjeVar instanceof zg70) {
            zg70Var = (zg70) zjeVar;
            int i = zg70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zg70Var.k = i - Integer.MIN_VALUE;
            } else {
                zg70Var = new zg70(this, zjeVar);
            }
        } else {
            zg70Var = new zg70(this, zjeVar);
        }
        Object objB = zg70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zg70Var.k;
        wsf0 wsf0Var = this.s;
        if (i2 == 0) {
            z1x.P(objB);
            ahu ahuVarY = ((g45) wsf0Var.b).y();
            bm5 bm5Var = bm5.d;
            zg70Var.k = 1;
            objB = ahuVarY.b(bm5Var, zg70Var);
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
        ql5 ql5Var = (ql5) objB;
        wsf0Var.s().l(bm5.d, ql5Var);
        return ql5Var;
    }

    public final void B(Throwable th) {
        sac.V(jiu0.a(this), bh70.f2592a, null, this.l.f22085a, new ku60(this, th, null, (byte) 17), 10);
    }

    public final void C(long j, boolean z, boolean z2) {
        c4m0 c4m0Var;
        c4m0 c4m0Var2 = this.B;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.B) != null) {
            c4m0Var.cancel(null);
        }
        this.w = true;
        this.B = slb.U(new dnq(new fnq(new fnq(this.b.a(j, z2, this.u.f42064a.a()), new z210(this, yjeVar, (byte) 18)), new ch70(this, z, yjeVar, (byte) 0), (byte) 4), new gbv(this, yjeVar, (byte) 11), (byte) 0), d5c.S(d5c.S(jiu0.a(this), this.l.f22085a), this.v));
    }

    public final void E() {
        sac.V(jiu0.a(this), new cf70(1, this, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, this.l.b, new dh70(this, null), 10);
    }

    public final void F(sg70 sg70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 16), null, this.l.c, new ku60(this, sg70Var, null, (byte) 18), 10);
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), ug70.f35611a, null, this.l.f22085a, new ku60(this, zy5Var, null, (byte) 16), 10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[LOOP:0: B:49:0x00db->B:85:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x(String str, zje zjeVar) {
        vg70 vg70Var;
        ql5 ql5VarA;
        String str2;
        Object value;
        Double dI;
        double dDoubleValue;
        double dA;
        double dMin;
        boolean z;
        double d;
        boolean z2;
        double d2;
        Regex regex;
        Object value2;
        tg70 tg70Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object value3;
        Object value4;
        if (zjeVar instanceof vg70) {
            vg70Var = (vg70) zjeVar;
            int i = vg70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg70Var.l = i - Integer.MIN_VALUE;
            } else {
                vg70Var = new vg70(this, zjeVar);
            }
        } else {
            vg70Var = new vg70(this, zjeVar);
        }
        Object objA = vg70Var.j;
        Object obj = wne.f39444a;
        int i2 = vg70Var.l;
        p7m0 p7m0Var = this.z;
        if (i2 == 0) {
            z1x.P(objA);
            if (str.length() == 0) {
                y(true);
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, tg70.a((tg70) value, 0.0d, 0.0d, null, D, false, false, true, true, false, false, false, 7183)));
            } else {
                ql5VarA = this.i.a();
                if (ql5VarA == null) {
                    vg70Var.i = str;
                    vg70Var.l = 1;
                    objA = A(vg70Var);
                    if (objA == obj) {
                        return obj;
                    }
                    str2 = str;
                } else {
                    str2 = str;
                }
                dI = kotlin.text.b.i(str2);
                if (dI != null) {
                    dDoubleValue = dI.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                dA = this.e.a();
                k1u k1uVar = this.f;
                dMin = Math.min(k1uVar.a(), ql5VarA.b);
                if (dA <= dDoubleValue || dDoubleValue > k1uVar.a()) {
                    z = false;
                } else {
                    z = true;
                }
                d = ql5VarA.b;
                if (d >= dA || d == 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                d2 = ((tg70) p7m0Var.getValue()).e;
                regex = C;
                if (d2 == dDoubleValue) {
                    y(!z);
                    do {
                        value2 = p7m0Var.getValue();
                        tg70Var = (tg70) value2;
                        if (dDoubleValue == dA && !z2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (dDoubleValue == dMin && !z2) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (dDoubleValue < dMin || z2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dDoubleValue > dA || z2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } while (!p7m0Var.m(value2, tg70.a(tg70Var, 0.0d, 0.0d, null, dDoubleValue, z3, z4, z5, z6, z, regex.g(str2), false, 6159)));
                } else if (regex.g(str2)) {
                    do {
                        value4 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value4, tg70.a((tg70) value4, 0.0d, 0.0d, null, 0.0d, false, false, false, false, false, true, false, 7167)));
                } else {
                    y(!z);
                    do {
                        value3 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value3, tg70.a((tg70) value3, 0.0d, 0.0d, null, 0.0d, false, false, false, false, z, false, false, 7679)));
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = vg70Var.i;
        z1x.P(objA);
        ql5VarA = (ql5) objA;
        dI = kotlin.text.b.i(str2);
        if (dI != null) {
            dDoubleValue = dI.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        dA = this.e.a();
        k1u k1uVar2 = this.f;
        dMin = Math.min(k1uVar2.a(), ql5VarA.b);
        if (dA <= dDoubleValue) {
            z = false;
        } else {
            z = false;
        }
        d = ql5VarA.b;
        if (d >= dA) {
            z2 = true;
        } else {
            z2 = true;
        }
        d2 = ((tg70) p7m0Var.getValue()).e;
        regex = C;
        if (d2 == dDoubleValue) {
            y(!z);
            do {
                value2 = p7m0Var.getValue();
                tg70Var = (tg70) value2;
                if (dDoubleValue == dA) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dDoubleValue == dMin) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dDoubleValue < dMin) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dDoubleValue > dA) {
                    z6 = true;
                } else {
                    z6 = true;
                }
            } while (!p7m0Var.m(value2, tg70.a(tg70Var, 0.0d, 0.0d, null, dDoubleValue, z3, z4, z5, z6, z, regex.g(str2), false, 6159)));
        } else if (regex.g(str2)) {
            do {
                value4 = p7m0Var.getValue();
            } while (!p7m0Var.m(value4, tg70.a((tg70) value4, 0.0d, 0.0d, null, 0.0d, false, false, false, false, false, true, false, 7167)));
        } else {
            y(!z);
            do {
                value3 = p7m0Var.getValue();
            } while (!p7m0Var.m(value3, tg70.a((tg70) value3, 0.0d, 0.0d, null, 0.0d, false, false, false, false, z, false, false, 7679)));
        }
        return Unit.f46060a;
    }

    public final void y(boolean z) {
        if (z != this.x) {
            w(new hy5(z));
            this.x = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(double d, zje zjeVar) {
        yg70 yg70Var;
        Long l;
        double d2;
        long j;
        double d3;
        double d4;
        double dDoubleValue;
        if (zjeVar instanceof yg70) {
            yg70Var = (yg70) zjeVar;
            int i = yg70Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                yg70Var.o = i - Integer.MIN_VALUE;
            } else {
                yg70Var = new yg70(this, zjeVar);
            }
        } else {
            yg70Var = new yg70(this, zjeVar);
        }
        Object objA = yg70Var.m;
        wne wneVar = wne.f39444a;
        int i2 = yg70Var.o;
        if (i2 == 0) {
            z1x.P(objA);
            long jA = this.u.f42064a.a();
            ql5 ql5VarA = this.i.a();
            l = ql5VarA != null ? new Long(ql5VarA.f28916a) : null;
            yg70Var.l = l;
            yg70Var.i = d;
            yg70Var.k = jA;
            yg70Var.o = 1;
            objA = this.g.a(jA, yg70Var, l);
            if (objA != wneVar) {
                d2 = d;
                j = jA;
            }
            return wneVar;
        }
        if (i2 == 1) {
            j = yg70Var.k;
            d2 = yg70Var.i;
            l = yg70Var.l;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d4 = yg70Var.j;
            d3 = yg70Var.i;
            z1x.P(objA);
        }
        dDoubleValue = ((Number) objA).doubleValue();
        if (d3 >= d4) {
            if (d3 > dDoubleValue) {
                d4 = dDoubleValue;
            } else {
                d4 = d3;
            }
        }
        return new Double(d4);
        double dDoubleValue2 = ((Number) objA).doubleValue();
        yg70Var.l = null;
        yg70Var.i = d2;
        yg70Var.k = j;
        yg70Var.j = dDoubleValue2;
        yg70Var.o = 2;
        objA = this.h.a(j, yg70Var, l);
        if (objA != wneVar) {
            d3 = d2;
            d4 = dDoubleValue2;
            dDoubleValue = ((Number) objA).doubleValue();
            if (d3 >= d4) {
                if (d3 > dDoubleValue) {
                    d4 = dDoubleValue;
                } else {
                    d4 = d3;
                }
            }
            return new Double(d4);
        }
        return wneVar;
    }
}
