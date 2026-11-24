package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m2d0 extends ljt {
    public static final m2d0 p;
    public static final sfy q = new sfy((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f21052a;
    public int b;
    public l2d0 c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int h;
    public int i;
    public p2d0 j;
    public List k;
    public int l;
    public int m;
    public byte n;
    public int o;

    static {
        m2d0 m2d0Var = new m2d0();
        p = m2d0Var;
        m2d0Var.j();
    }

    public m2d0(pyc pycVar, sso ssoVar) {
        o2d0 o2d0Var;
        this.n = (byte) -1;
        this.o = -1;
        j();
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        byte b = 0;
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = pycVar.k();
                            l2d0 l2d0VarB = l2d0.b(iK);
                            if (l2d0VarB == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK);
                            } else {
                                this.b |= 1;
                                this.c = l2d0VarB;
                                continue;
                            }
                            break;
                        case 16:
                            this.b |= 2;
                            long jL = pycVar.l();
                            this.d = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            this.b |= 4;
                            this.e = Float.intBitsToFloat(pycVar.i());
                            continue;
                        case 33:
                            this.b |= 8;
                            this.f = Double.longBitsToDouble(pycVar.j());
                            continue;
                        case 40:
                            this.b |= 16;
                            this.g = pycVar.k();
                            continue;
                        case 48:
                            this.b |= 32;
                            this.h = pycVar.k();
                            continue;
                        case 56:
                            this.b |= 64;
                            this.i = pycVar.k();
                            continue;
                        case 66:
                            if ((this.b & 128) == 128) {
                                p2d0 p2d0Var = this.j;
                                p2d0Var.getClass();
                                o2d0Var = new o2d0(b);
                                o2d0Var.d = Collections.EMPTY_LIST;
                                o2d0Var.h(p2d0Var);
                            } else {
                                o2d0Var = null;
                            }
                            p2d0 p2d0Var2 = (p2d0) pycVar.g(p2d0.h, ssoVar);
                            this.j = p2d0Var2;
                            if (o2d0Var != null) {
                                o2d0Var.h(p2d0Var2);
                                this.j = o2d0Var.f();
                            }
                            this.b |= 128;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.k = new ArrayList();
                                c = 256;
                            }
                            this.k.add(pycVar.g(q, ssoVar));
                            continue;
                        case 80:
                            this.b |= 512;
                            this.m = pycVar.k();
                            continue;
                        case 88:
                            this.b |= 256;
                            this.l = pycVar.k();
                            continue;
                        default:
                            if (!pycVar.q(iN, tycVarM)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 256) == 256) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f21052a = ng9Var.d();
                    }
                    throw th;
                }
            } catch (aox e) {
                e.f1223a = this;
                throw e;
            } catch (IOException e2) {
                aox aoxVar = new aox(e2.getMessage());
                aoxVar.f1223a = this;
                throw aoxVar;
            }
        }
        if ((c & 256) == 256) {
            this.k = Collections.unmodifiableList(this.k);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f21052a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 128) == 128 && !this.j.b()) {
            this.n = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!((m2d0) this.k.get(i)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        this.n = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int iM = (this.b & 1) == 1 ? tyc.m(1, this.c.f19303a) : 0;
        if ((this.b & 2) == 2) {
            long j = this.d;
            iM += tyc.s((j >> 63) ^ (j << 1)) + tyc.t(2);
        }
        if ((this.b & 4) == 4) {
            iM += tyc.t(3) + 4;
        }
        if ((this.b & 8) == 8) {
            iM += tyc.t(4) + 8;
        }
        if ((this.b & 16) == 16) {
            iM += tyc.n(5, this.g);
        }
        if ((this.b & 32) == 32) {
            iM += tyc.n(6, this.h);
        }
        if ((this.b & 64) == 64) {
            iM += tyc.n(7, this.i);
        }
        if ((this.b & 128) == 128) {
            iM += tyc.p(8, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            iM += tyc.p(9, (z3) this.k.get(i2));
        }
        if ((this.b & 512) == 512) {
            iM += tyc.n(10, this.m);
        }
        if ((this.b & 256) == 256) {
            iM += tyc.n(11, this.l);
        }
        int size = this.f21052a.size() + iM;
        this.o = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return k2d0.g();
    }

    @Override // a.z3
    public final ajt f() {
        k2d0 k2d0VarG = k2d0.g();
        k2d0VarG.h(this);
        return k2d0VarG;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.i0(1, this.c.f19303a);
        }
        if ((this.b & 2) == 2) {
            long j = this.d;
            tycVar.u0(2, 0);
            tycVar.t0((j >> 63) ^ (j << 1));
        }
        if ((this.b & 4) == 4) {
            float f = this.e;
            tycVar.u0(3, 5);
            tycVar.q0(Float.floatToRawIntBits(f));
        }
        if ((this.b & 8) == 8) {
            double d = this.f;
            tycVar.u0(4, 1);
            tycVar.r0(Double.doubleToRawLongBits(d));
        }
        if ((this.b & 16) == 16) {
            tycVar.j0(5, this.g);
        }
        if ((this.b & 32) == 32) {
            tycVar.j0(6, this.h);
        }
        if ((this.b & 64) == 64) {
            tycVar.j0(7, this.i);
        }
        if ((this.b & 128) == 128) {
            tycVar.l0(8, this.j);
        }
        for (int i = 0; i < this.k.size(); i++) {
            tycVar.l0(9, (z3) this.k.get(i));
        }
        if ((this.b & 512) == 512) {
            tycVar.j0(10, this.m);
        }
        if ((this.b & 256) == 256) {
            tycVar.j0(11, this.l);
        }
        tycVar.o0(this.f21052a);
    }

    public final void j() {
        this.c = l2d0.BYTE;
        this.d = 0L;
        this.e = 0.0f;
        this.f = 0.0d;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = p2d0.g;
        this.k = Collections.EMPTY_LIST;
        this.l = 0;
        this.m = 0;
    }

    public m2d0() {
        this.n = (byte) -1;
        this.o = -1;
        this.f21052a = pg9.f26941a;
    }

    public m2d0(k2d0 k2d0Var) {
        this.n = (byte) -1;
        this.o = -1;
        this.f21052a = k2d0Var.f994a;
    }
}
