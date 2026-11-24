package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class ji70 extends w46 {
    public static final Regex y = new Regex("^[0-9]*[.]$");
    public static final double z = -1.0d;
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
    public final t0u q;
    public final wsf0 r;
    public final y5s s;
    public final ax5 t;
    public boolean u;
    public boolean v;
    public final p7m0 w;
    public c4m0 x;

    public ji70(i1w0 i1w0Var, yn00 yn00Var, fq fqVar, xcc xccVar, l1u l1uVar, k1u k1uVar, slu sluVar, yku ykuVar, gmt gmtVar, itt ittVar, r8u r8uVar, qa60 qa60Var, mne mneVar, bpi0 bpi0Var, qni0 qni0Var, lg60 lg60Var, vcu vcuVar, t0u t0uVar, wsf0 wsf0Var, y5s y5sVar) {
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
        this.q = t0uVar;
        this.r = wsf0Var;
        this.s = y5sVar;
        this.t = new ax5(this);
        this.w = q7m0.a(new bi70(true, 0.0d, 0.0d, "", 0.0d, false, false, false, false, true, false, true, false));
        slb.U(new dnq(new fnq(qa60Var.a(), new hi70(2, this, ji70.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 0), (byte) 4), new pr60(3, null, (byte) 7), (byte) 1), jiu0.a(this));
        if (this.u || r8uVar.a()) {
            return;
        }
        C(this, 0L, 3);
    }

    public static /* synthetic */ void C(ji70 ji70Var, long j, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        ji70Var.B((i & 2) == 0, j);
    }

    public final void A(Throwable th) {
        sac.V(jiu0.a(this), gi70.f11332a, null, this.l.f22085a, new ku60(this, th, null, (byte) 22), 10);
    }

    public final void B(boolean z2, long j) {
        c4m0 c4m0Var;
        c4m0 c4m0Var2 = this.x;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.x) != null) {
            c4m0Var.cancel(null);
        }
        this.u = true;
        this.x = slb.U(new dnq(new fnq(new fnq(this.b.a(j, true, this.s.f42064a.a()), new z210(this, yjeVar, (byte) 19)), new ch70(this, z2, yjeVar, b), (byte) 4), new gbv(this, yjeVar, (byte) 12), (byte) 0), d5c.S(d5c.S(jiu0.a(this), this.l.f22085a), this.t));
    }

    public final void D() {
        sac.V(jiu0.a(this), new cf70(1, this, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.l.b, new ii70(this, null), 10);
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
    public final Object w(String str, zje zjeVar) {
        di70 di70Var;
        ql5 ql5VarA;
        String str2;
        Object value;
        Double dI;
        double dDoubleValue;
        double dA;
        double dMin;
        boolean z2;
        double d;
        boolean z3;
        double d2;
        Regex regex;
        Object value2;
        bi70 bi70Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object value3;
        Object value4;
        if (zjeVar instanceof di70) {
            di70Var = (di70) zjeVar;
            int i = di70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                di70Var.l = i - Integer.MIN_VALUE;
            } else {
                di70Var = new di70(this, zjeVar);
            }
        } else {
            di70Var = new di70(this, zjeVar);
        }
        Object objZ = di70Var.j;
        Object obj = wne.f39444a;
        int i2 = di70Var.l;
        p7m0 p7m0Var = this.w;
        if (i2 == 0) {
            z1x.P(objZ);
            if (str.length() == 0) {
                x(true);
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, bi70.a((bi70) value, 0.0d, 0.0d, null, z, false, false, true, true, false, false, false, 7183)));
            } else {
                ql5VarA = this.i.a();
                if (ql5VarA == null) {
                    di70Var.i = str;
                    di70Var.l = 1;
                    objZ = z(di70Var);
                    if (objZ == obj) {
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
                    z2 = false;
                } else {
                    z2 = true;
                }
                d = ql5VarA.b;
                if (d >= dA || d == 0.0d) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d2 = ((bi70) p7m0Var.getValue()).e;
                regex = y;
                if (d2 == dDoubleValue) {
                    x(!z2);
                    do {
                        value2 = p7m0Var.getValue();
                        bi70Var = (bi70) value2;
                        if (dDoubleValue == dA && !z3) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (dDoubleValue == dMin && !z3) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (dDoubleValue < dMin || z3) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (dDoubleValue > dA || z3) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } while (!p7m0Var.m(value2, bi70.a(bi70Var, 0.0d, 0.0d, null, dDoubleValue, z4, z5, z6, z7, z2, regex.g(str2), false, 6159)));
                } else if (regex.g(str2)) {
                    do {
                        value4 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value4, bi70.a((bi70) value4, 0.0d, 0.0d, null, 0.0d, false, false, false, false, false, true, false, 7167)));
                } else {
                    x(!z2);
                    do {
                        value3 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value3, bi70.a((bi70) value3, 0.0d, 0.0d, null, 0.0d, false, false, false, false, z2, false, false, 7679)));
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = di70Var.i;
        z1x.P(objZ);
        ql5VarA = (ql5) objZ;
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
            z2 = false;
        } else {
            z2 = false;
        }
        d = ql5VarA.b;
        if (d >= dA) {
            z3 = true;
        } else {
            z3 = true;
        }
        d2 = ((bi70) p7m0Var.getValue()).e;
        regex = y;
        if (d2 == dDoubleValue) {
            x(!z2);
            do {
                value2 = p7m0Var.getValue();
                bi70Var = (bi70) value2;
                if (dDoubleValue == dA) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dDoubleValue == dMin) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (dDoubleValue < dMin) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dDoubleValue > dA) {
                    z7 = true;
                } else {
                    z7 = true;
                }
            } while (!p7m0Var.m(value2, bi70.a(bi70Var, 0.0d, 0.0d, null, dDoubleValue, z4, z5, z6, z7, z2, regex.g(str2), false, 6159)));
        } else if (regex.g(str2)) {
            do {
                value4 = p7m0Var.getValue();
            } while (!p7m0Var.m(value4, bi70.a((bi70) value4, 0.0d, 0.0d, null, 0.0d, false, false, false, false, false, true, false, 7167)));
        } else {
            x(!z2);
            do {
                value3 = p7m0Var.getValue();
            } while (!p7m0Var.m(value3, bi70.a((bi70) value3, 0.0d, 0.0d, null, 0.0d, false, false, false, false, z2, false, false, 7679)));
        }
        return Unit.f46060a;
    }

    public final void x(boolean z2) {
        if (z2 != this.v) {
            hy5 hy5Var = new hy5(z2);
            sac.V(jiu0.a(this), ci70.f4399a, null, this.l.f22085a, new ku60(this, hy5Var, null, (byte) 21), 10);
            this.v = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(double d, zje zjeVar) throws Throwable {
        ei70 ei70Var;
        Long l;
        double d2;
        long j;
        double d3;
        double d4;
        double dDoubleValue;
        if (zjeVar instanceof ei70) {
            ei70Var = (ei70) zjeVar;
            int i = ei70Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ei70Var.o = i - Integer.MIN_VALUE;
            } else {
                ei70Var = new ei70(this, zjeVar);
            }
        } else {
            ei70Var = new ei70(this, zjeVar);
        }
        Object objA = ei70Var.m;
        wne wneVar = wne.f39444a;
        int i2 = ei70Var.o;
        if (i2 == 0) {
            z1x.P(objA);
            ql5 ql5VarA = this.i.a();
            l = ql5VarA != null ? new Long(ql5VarA.f28916a) : null;
            long jA = this.s.f42064a.a();
            ei70Var.k = l;
            ei70Var.i = d;
            ei70Var.l = jA;
            ei70Var.o = 1;
            objA = this.g.a(jA, ei70Var, l);
            if (objA != wneVar) {
                d2 = d;
                j = jA;
            }
            return wneVar;
        }
        if (i2 == 1) {
            j = ei70Var.l;
            d2 = ei70Var.i;
            l = ei70Var.k;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d4 = ei70Var.j;
            d3 = ei70Var.i;
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
        ei70Var.k = null;
        ei70Var.i = d2;
        ei70Var.l = j;
        ei70Var.j = dDoubleValue2;
        ei70Var.o = 2;
        objA = this.h.a(j, ei70Var, l);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable z(zje zjeVar) {
        fi70 fi70Var;
        if (zjeVar instanceof fi70) {
            fi70Var = (fi70) zjeVar;
            int i = fi70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fi70Var.k = i - Integer.MIN_VALUE;
            } else {
                fi70Var = new fi70(this, zjeVar);
            }
        } else {
            fi70Var = new fi70(this, zjeVar);
        }
        Object objB = fi70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fi70Var.k;
        wsf0 wsf0Var = this.r;
        if (i2 == 0) {
            z1x.P(objB);
            ahu ahuVarY = ((g45) wsf0Var.b).y();
            bm5 bm5Var = bm5.d;
            fi70Var.k = 1;
            objB = ahuVarY.b(bm5Var, fi70Var);
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
}
