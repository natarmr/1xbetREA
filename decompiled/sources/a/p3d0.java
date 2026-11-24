package a;

import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.header.WarningHeader;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p3d0 extends gjt {
    public static final p3d0 f1;
    public static final sfy g1 = new sfy((byte) 18);
    public x2d0 A;
    public x2d0 B;
    public byte Y;
    public int Z;
    public final pg9 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public a4d0 g;
    public int h;
    public List i;
    public a4d0 j;
    public int k;
    public List l;
    public List m;
    public int n;
    public List o;
    public i4d0 p;
    public int q;
    public int r;
    public List s;
    public List t;
    public List u;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    static {
        p3d0 p3d0Var = new p3d0();
        f1 = p3d0Var;
        p3d0Var.r();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    public p3d0(pyc pycVar, sso ssoVar) throws Throwable {
        h4d0 h4d0VarH;
        this.n = -1;
        this.Y = (byte) -1;
        this.Z = -1;
        r();
        ng9 ng9VarJ = pg9.j();
        boolean z = true;
        tyc tycVarM = tyc.M(ng9VarJ, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i & 256) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if ((i & 512) == 512) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i & 65536) == 65536) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i & 131072) == 131072) {
                    this.v = Collections.unmodifiableList(this.v);
                }
                if ((i & 262144) == 262144) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                if ((i & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if ((i & 16384) == 16384) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if ((i & 32768) == 32768) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i & 524288) == 524288) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if ((i & 1048576) == 1048576) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if ((i & 2097152) == 2097152) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                try {
                    tycVarM.A();
                } catch (IOException unused) {
                } finally {
                    this.b = ng9VarJ.d();
                }
                n();
                return;
            }
            try {
                try {
                    int iN = pycVar.n();
                    Cloneable cloneableJ = null;
                    switch (iN) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.c |= 2;
                            this.e = pycVar.k();
                            z = z3;
                            break;
                        case 16:
                            this.c |= 4;
                            this.f = pycVar.k();
                            z = z3;
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            if ((this.c & 8) == 8) {
                                a4d0 a4d0Var = this.g;
                                a4d0Var.getClass();
                                cloneableJ = a4d0.t(a4d0Var);
                            }
                            z3d0 z3d0Var = cloneableJ;
                            a4d0 a4d0Var2 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                            this.g = a4d0Var2;
                            if (z3d0Var != 0) {
                                z3d0Var.i(a4d0Var2);
                                this.g = z3d0Var.g();
                            }
                            this.c |= 8;
                            z = z3;
                            break;
                        case 34:
                            if ((i & 32) != 32) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            this.i.add(pycVar.g(f4d0.o, ssoVar));
                            z = z3;
                            break;
                        case 42:
                            if ((this.c & 32) == 32) {
                                a4d0 a4d0Var3 = this.j;
                                a4d0Var3.getClass();
                                cloneableJ = a4d0.t(a4d0Var3);
                            }
                            z3d0 z3d0Var2 = cloneableJ;
                            a4d0 a4d0Var4 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                            this.j = a4d0Var4;
                            if (z3d0Var2 != 0) {
                                z3d0Var2.i(a4d0Var4);
                                this.j = z3d0Var2.g();
                            }
                            this.c |= 32;
                            z = z3;
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            if ((this.c & 128) == 128) {
                                i4d0 i4d0Var = this.p;
                                i4d0Var.getClass();
                                h4d0VarH = h4d0.h();
                                h4d0VarH.i(i4d0Var);
                            } else {
                                h4d0VarH = null;
                            }
                            i4d0 i4d0Var2 = (i4d0) pycVar.g(i4d0.o, ssoVar);
                            this.p = i4d0Var2;
                            if (h4d0VarH != null) {
                                h4d0VarH.i(i4d0Var2);
                                this.p = h4d0VarH.g();
                            }
                            this.c |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.c |= 256;
                            this.q = pycVar.k();
                            z = z3;
                            break;
                        case 64:
                            this.c |= 512;
                            this.r = pycVar.k();
                            z = z3;
                            break;
                        case 72:
                            this.c |= 16;
                            this.h = pycVar.k();
                            z = z3;
                            break;
                        case 80:
                            this.c |= 64;
                            this.k = pycVar.k();
                            z = z3;
                            break;
                        case 88:
                            this.c |= 1;
                            this.d = pycVar.k();
                            z = z3;
                            break;
                        case 98:
                            if ((i & 256) != 256) {
                                this.l = new ArrayList();
                                i |= 256;
                            }
                            this.l.add(pycVar.g(a4d0.v, ssoVar));
                            z = z3;
                            break;
                        case 104:
                            if ((i & 512) != 512) {
                                this.m = new ArrayList();
                                i |= 512;
                            }
                            this.m.add(Integer.valueOf(pycVar.k()));
                            z = z3;
                            break;
                        case 106:
                            int iE = pycVar.e(pycVar.k());
                            if ((i & 512) != 512 && pycVar.c() > 0) {
                                this.m = new ArrayList();
                                i |= 512;
                            }
                            while (pycVar.c() > 0) {
                                this.m.add(Integer.valueOf(pycVar.k()));
                            }
                            pycVar.d(iE);
                            z = z3;
                            break;
                        case 114:
                            if ((i & 65536) != 65536) {
                                this.u = new ArrayList();
                                i |= 65536;
                            }
                            this.u.add(pycVar.g(p2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 122:
                            if ((i & 131072) != 131072) {
                                this.v = new ArrayList();
                                i |= 131072;
                            }
                            this.v.add(pycVar.g(p2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 130:
                            if ((i & 262144) != 262144) {
                                this.w = new ArrayList();
                                i |= 262144;
                            }
                            this.w.add(pycVar.g(p2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 138:
                            if ((i & 1024) != 1024) {
                                this.o = new ArrayList();
                                i |= 1024;
                            }
                            this.o.add(pycVar.g(i4d0.o, ssoVar));
                            z = z3;
                            break;
                        case 248:
                            if ((i & 16384) != 16384) {
                                this.s = new ArrayList();
                                i |= 16384;
                            }
                            this.s.add(Integer.valueOf(pycVar.k()));
                            z = z3;
                            break;
                        case 250:
                            int iE2 = pycVar.e(pycVar.k());
                            if ((i & 16384) != 16384 && pycVar.c() > 0) {
                                this.s = new ArrayList();
                                i |= 16384;
                            }
                            while (pycVar.c() > 0) {
                                this.s.add(Integer.valueOf(pycVar.k()));
                            }
                            pycVar.d(iE2);
                            z = z3;
                            break;
                        case 258:
                            if ((i & 32768) != 32768) {
                                this.t = new ArrayList();
                                i |= 32768;
                            }
                            this.t.add(pycVar.g(t2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 266:
                            if ((i & 524288) != 524288) {
                                this.x = new ArrayList();
                                i |= 524288;
                            }
                            this.x.add(pycVar.g(p2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 274:
                            if ((i & 1048576) != 1048576) {
                                this.y = new ArrayList();
                                i |= 1048576;
                            }
                            this.y.add(pycVar.g(p2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 282:
                            if ((i & 2097152) != 2097152) {
                                this.z = new ArrayList();
                                i |= 2097152;
                            }
                            this.z.add(pycVar.g(p2d0.h, ssoVar));
                            z = z3;
                            break;
                        case 322:
                            if ((this.c & 1024) == 1024) {
                                x2d0 x2d0Var = this.A;
                                x2d0Var.getClass();
                                cloneableJ = x2d0.j(x2d0Var);
                            }
                            w2d0 w2d0Var = cloneableJ;
                            x2d0 x2d0Var2 = (x2d0) pycVar.g(x2d0.f, ssoVar);
                            this.A = x2d0Var2;
                            if (w2d0Var != 0) {
                                w2d0Var.j(x2d0Var2);
                                this.A = w2d0Var.f();
                            }
                            this.c |= 1024;
                            z = z3;
                            break;
                        case WarningHeader.MULTICAST_NOT_AVAILABLE /* 330 */:
                            try {
                                if ((this.c & 2048) == 2048) {
                                    x2d0 x2d0Var3 = this.B;
                                    x2d0Var3.getClass();
                                    cloneableJ = x2d0.j(x2d0Var3);
                                }
                                w2d0 w2d0Var2 = cloneableJ;
                                x2d0 x2d0Var4 = (x2d0) pycVar.g(x2d0.f, ssoVar);
                                this.B = x2d0Var4;
                                if (w2d0Var2 != 0) {
                                    w2d0Var2.j(x2d0Var4);
                                    this.B = w2d0Var2.f();
                                }
                                this.c |= 2048;
                                z = z3;
                            } catch (aox e) {
                                e = e;
                                e.f1223a = this;
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                aox aoxVar = new aox(e.getMessage());
                                aoxVar.f1223a = this;
                                throw aoxVar;
                            } catch (Throwable th) {
                                th = th;
                                if ((i & 32) == 32) {
                                    this.i = Collections.unmodifiableList(this.i);
                                }
                                if ((i & 256) == 256) {
                                    this.l = Collections.unmodifiableList(this.l);
                                }
                                if ((i & 512) == 512) {
                                    this.m = Collections.unmodifiableList(this.m);
                                }
                                if ((i & 65536) == 65536) {
                                    this.u = Collections.unmodifiableList(this.u);
                                }
                                if ((i & 131072) == 131072) {
                                    this.v = Collections.unmodifiableList(this.v);
                                }
                                if ((i & 262144) == 262144) {
                                    this.w = Collections.unmodifiableList(this.w);
                                }
                                if ((i & 1024) == 1024) {
                                    this.o = Collections.unmodifiableList(this.o);
                                }
                                if ((i & 16384) == 16384) {
                                    this.s = Collections.unmodifiableList(this.s);
                                }
                                if ((i & 32768) == 32768) {
                                    this.t = Collections.unmodifiableList(this.t);
                                }
                                if ((i & 524288) == 524288) {
                                    this.x = Collections.unmodifiableList(this.x);
                                }
                                if ((i & 1048576) == 1048576) {
                                    this.y = Collections.unmodifiableList(this.y);
                                }
                                if ((i & 2097152) == 2097152) {
                                    this.z = Collections.unmodifiableList(this.z);
                                }
                                try {
                                    tycVarM.A();
                                    break;
                                } catch (IOException unused2) {
                                } finally {
                                    this.b = ng9VarJ.d();
                                }
                                n();
                                throw th;
                            }
                            break;
                        default:
                            if (!o(pycVar, tycVarM, ssoVar, iN)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (aox e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        }
    }

    @Override // a.e540
    public final z3 a() {
        return f1;
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.Y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 4) != 4) {
            this.Y = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.g.b()) {
            this.Y = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((f4d0) this.i.get(i2)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        if ((this.c & 32) == 32 && !this.j.b()) {
            this.Y = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            if (!((a4d0) this.l.get(i3)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            if (!((i4d0) this.o.get(i4)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        if ((this.c & 128) == 128 && !this.p.b()) {
            this.Y = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.t.size(); i5++) {
            if (!((t2d0) this.t.get(i5)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            if (!((p2d0) this.u.get(i6)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.v.size(); i7++) {
            if (!((p2d0) this.v.get(i7)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.w.size(); i8++) {
            if (!((p2d0) this.w.get(i8)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            if (!((p2d0) this.x.get(i9)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.y.size(); i10++) {
            if (!((p2d0) this.y.get(i10)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.z.size(); i11++) {
            if (!((p2d0) this.z.get(i11)).b()) {
                this.Y = (byte) 0;
                return false;
            }
        }
        if ((this.c & 1024) == 1024 && !this.A.b()) {
            this.Y = (byte) 0;
            return false;
        }
        if ((this.c & 2048) == 2048 && !this.B.b()) {
            this.Y = (byte) 0;
            return false;
        }
        if (j()) {
            this.Y = (byte) 1;
            return true;
        }
        this.Y = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        List list;
        List list2;
        int i = this.Z;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 2) == 2 ? tyc.n(1, this.e) : 0;
        if ((this.c & 4) == 4) {
            iN += tyc.n(2, this.f);
        }
        if ((this.c & 8) == 8) {
            iN += tyc.p(3, this.g);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            iN += tyc.p(4, (z3) this.i.get(i2));
        }
        if ((this.c & 32) == 32) {
            iN += tyc.p(5, this.j);
        }
        if ((this.c & 128) == 128) {
            iN += tyc.p(6, this.p);
        }
        if ((this.c & 256) == 256) {
            iN += tyc.n(7, this.q);
        }
        if ((this.c & 512) == 512) {
            iN += tyc.n(8, this.r);
        }
        if ((this.c & 16) == 16) {
            iN += tyc.n(9, this.h);
        }
        if ((this.c & 64) == 64) {
            iN += tyc.n(10, this.k);
        }
        if ((this.c & 1) == 1) {
            iN += tyc.n(11, this.d);
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            iN += tyc.p(12, (z3) this.l.get(i3));
        }
        int i4 = 0;
        int iO = 0;
        while (true) {
            int size = this.m.size();
            list = this.m;
            if (i4 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int iP = iN + iO;
        if (!list.isEmpty()) {
            iP = iP + 1 + tyc.o(iO);
        }
        this.n = iO;
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            iP += tyc.p(14, (z3) this.u.get(i5));
        }
        for (int i6 = 0; i6 < this.v.size(); i6++) {
            iP += tyc.p(15, (z3) this.v.get(i6));
        }
        for (int i7 = 0; i7 < this.w.size(); i7++) {
            iP += tyc.p(16, (z3) this.w.get(i7));
        }
        for (int i8 = 0; i8 < this.o.size(); i8++) {
            iP += tyc.p(17, (z3) this.o.get(i8));
        }
        int i9 = 0;
        int iO2 = 0;
        while (true) {
            int size2 = this.s.size();
            list2 = this.s;
            if (i9 >= size2) {
                break;
            }
            iO2 += tyc.o(((Integer) list2.get(i9)).intValue());
            i9++;
        }
        int size3 = (list2.size() * 2) + iP + iO2;
        for (int i10 = 0; i10 < this.t.size(); i10++) {
            size3 += tyc.p(32, (z3) this.t.get(i10));
        }
        for (int i11 = 0; i11 < this.x.size(); i11++) {
            size3 += tyc.p(33, (z3) this.x.get(i11));
        }
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            size3 += tyc.p(34, (z3) this.y.get(i12));
        }
        for (int i13 = 0; i13 < this.z.size(); i13++) {
            size3 += tyc.p(35, (z3) this.z.get(i13));
        }
        if ((this.c & 1024) == 1024) {
            size3 += tyc.p(40, this.A);
        }
        if ((this.c & 2048) == 2048) {
            size3 += tyc.p(41, this.B);
        }
        int size4 = this.b.size() + k() + size3;
        this.Z = size4;
        return size4;
    }

    @Override // a.z3
    public final ajt e() {
        return o3d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        o3d0 o3d0VarH = o3d0.h();
        o3d0VarH.i(this);
        return o3d0VarH;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 2) == 2) {
            tycVar.j0(1, this.e);
        }
        if ((this.c & 4) == 4) {
            tycVar.j0(2, this.f);
        }
        if ((this.c & 8) == 8) {
            tycVar.l0(3, this.g);
        }
        for (int i = 0; i < this.i.size(); i++) {
            tycVar.l0(4, (z3) this.i.get(i));
        }
        if ((this.c & 32) == 32) {
            tycVar.l0(5, this.j);
        }
        if ((this.c & 128) == 128) {
            tycVar.l0(6, this.p);
        }
        if ((this.c & 256) == 256) {
            tycVar.j0(7, this.q);
        }
        if ((this.c & 512) == 512) {
            tycVar.j0(8, this.r);
        }
        if ((this.c & 16) == 16) {
            tycVar.j0(9, this.h);
        }
        if ((this.c & 64) == 64) {
            tycVar.j0(10, this.k);
        }
        if ((this.c & 1) == 1) {
            tycVar.j0(11, this.d);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            tycVar.l0(12, (z3) this.l.get(i2));
        }
        if (this.m.size() > 0) {
            tycVar.s0(106);
            tycVar.s0(this.n);
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            tycVar.k0(((Integer) this.m.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            tycVar.l0(14, (z3) this.u.get(i4));
        }
        for (int i5 = 0; i5 < this.v.size(); i5++) {
            tycVar.l0(15, (z3) this.v.get(i5));
        }
        for (int i6 = 0; i6 < this.w.size(); i6++) {
            tycVar.l0(16, (z3) this.w.get(i6));
        }
        for (int i7 = 0; i7 < this.o.size(); i7++) {
            tycVar.l0(17, (z3) this.o.get(i7));
        }
        for (int i8 = 0; i8 < this.s.size(); i8++) {
            tycVar.j0(31, ((Integer) this.s.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.t.size(); i9++) {
            tycVar.l0(32, (z3) this.t.get(i9));
        }
        for (int i10 = 0; i10 < this.x.size(); i10++) {
            tycVar.l0(33, (z3) this.x.get(i10));
        }
        for (int i11 = 0; i11 < this.y.size(); i11++) {
            tycVar.l0(34, (z3) this.y.get(i11));
        }
        for (int i12 = 0; i12 < this.z.size(); i12++) {
            tycVar.l0(35, (z3) this.z.get(i12));
        }
        if ((this.c & 1024) == 1024) {
            tycVar.l0(40, this.A);
        }
        if ((this.c & 2048) == 2048) {
            tycVar.l0(41, this.B);
        }
        wtiVar.E(19000, tycVar);
        tycVar.o0(this.b);
    }

    public final void r() {
        this.d = 518;
        this.e = TokenTypes.ACK;
        this.f = 0;
        a4d0 a4d0Var = a4d0.u;
        this.g = a4d0Var;
        this.h = 0;
        List list = Collections.EMPTY_LIST;
        this.i = list;
        this.j = a4d0Var;
        this.k = 0;
        this.l = list;
        this.m = list;
        this.o = list;
        this.p = i4d0.n;
        this.q = 0;
        this.r = 0;
        this.s = list;
        this.t = list;
        this.u = list;
        this.v = list;
        this.w = list;
        this.x = list;
        this.y = list;
        this.z = list;
        x2d0 x2d0Var = x2d0.e;
        this.A = x2d0Var;
        this.B = x2d0Var;
    }

    public p3d0() {
        this.n = -1;
        this.Y = (byte) -1;
        this.Z = -1;
        this.b = pg9.f26941a;
    }

    public p3d0(o3d0 o3d0Var) {
        super(o3d0Var);
        this.n = -1;
        this.Y = (byte) -1;
        this.Z = -1;
        this.b = o3d0Var.f994a;
    }
}
