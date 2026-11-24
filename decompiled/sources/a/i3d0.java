package a;

import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i3d0 extends gjt {
    public static final i3d0 y;
    public static final sfy z = new sfy((byte) 15);
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
    public List p;
    public g4d0 q;
    public List r;
    public x2d0 s;
    public List t;
    public List u;
    public List v;
    public byte w;
    public int x;

    static {
        i3d0 i3d0Var = new i3d0();
        y = i3d0Var;
        i3d0Var.r();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:134:0x0339  */
    /* JADX WARN: Code duplicated, block: B:137:0x0345  */
    /* JADX WARN: Code duplicated, block: B:140:0x0351  */
    /* JADX WARN: Code duplicated, block: B:143:0x035d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0369  */
    /* JADX WARN: Code duplicated, block: B:149:0x0375  */
    /* JADX WARN: Code duplicated, block: B:152:0x0381  */
    /* JADX WARN: Code duplicated, block: B:155:0x038f  */
    /* JADX WARN: Code duplicated, block: B:158:0x039d  */
    /* JADX WARN: Multi-variable type inference failed */
    public i3d0(pyc pycVar, sso ssoVar) throws Throwable {
        int i;
        this.n = -1;
        this.w = (byte) -1;
        this.x = -1;
        r();
        ng9 ng9Var = new ng9();
        boolean z2 = true;
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            int i3 = 32768;
            int i4 = 131072;
            boolean z4 = z2;
            if (z3) {
                if ((i2 & 32) == 32) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if ((i2 & 2048) == 2048) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if ((i2 & 256) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if ((i2 & 512) == 512) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i2 & 65536) == 65536) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i2 & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if ((i2 & 8192) == 8192) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if ((i2 & 32768) == 32768) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i2 & 131072) == 131072) {
                    this.v = Collections.unmodifiableList(this.v);
                }
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.b = ng9Var.d();
                }
                n();
                return;
            }
            try {
                int iN = pycVar.n();
                Cloneable cloneableT = null;
                switch (iN) {
                    case 0:
                        z3 = z4;
                        z2 = z4;
                        break;
                    case 8:
                        this.c |= 2;
                        this.e = pycVar.k();
                        z2 = z4;
                        break;
                    case 16:
                        this.c |= 4;
                        this.f = pycVar.k();
                        z2 = z4;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        if ((this.c & 8) == 8) {
                            a4d0 a4d0Var = this.g;
                            a4d0Var.getClass();
                            cloneableT = a4d0.t(a4d0Var);
                        }
                        z3d0 z3d0Var = cloneableT;
                        a4d0 a4d0Var2 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                        this.g = a4d0Var2;
                        if (z3d0Var != 0) {
                            z3d0Var.i(a4d0Var2);
                            this.g = z3d0Var.g();
                        }
                        this.c |= 8;
                        z2 = z4;
                        break;
                    case 34:
                        if ((i2 & 32) != 32) {
                            this.i = new ArrayList();
                            i2 |= 32;
                        }
                        this.i.add(pycVar.g(f4d0.o, ssoVar));
                        z2 = z4;
                        break;
                    case 42:
                        if ((this.c & 32) == 32) {
                            a4d0 a4d0Var3 = this.j;
                            a4d0Var3.getClass();
                            cloneableT = a4d0.t(a4d0Var3);
                        }
                        z3d0 z3d0Var2 = cloneableT;
                        a4d0 a4d0Var4 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                        this.j = a4d0Var4;
                        if (z3d0Var2 != 0) {
                            z3d0Var2.i(a4d0Var4);
                            this.j = z3d0Var2.g();
                        }
                        this.c |= 32;
                        z2 = z4;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        if ((i2 & 2048) != 2048) {
                            this.p = new ArrayList();
                            i2 |= 2048;
                        }
                        this.p.add(pycVar.g(i4d0.o, ssoVar));
                        z2 = z4;
                        break;
                    case 56:
                        this.c |= 16;
                        this.h = pycVar.k();
                        z2 = z4;
                        break;
                    case 64:
                        this.c |= 64;
                        this.k = pycVar.k();
                        z2 = z4;
                        break;
                    case 72:
                        this.c |= 1;
                        this.d = pycVar.k();
                        z2 = z4;
                        break;
                    case 82:
                        if ((i2 & 256) != 256) {
                            this.l = new ArrayList();
                            i2 |= 256;
                        }
                        this.l.add(pycVar.g(a4d0.v, ssoVar));
                        z2 = z4;
                        break;
                    case 88:
                        if ((i2 & 512) != 512) {
                            this.m = new ArrayList();
                            i2 |= 512;
                        }
                        this.m.add(Integer.valueOf(pycVar.k()));
                        z2 = z4;
                        break;
                    case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                        int iE = pycVar.e(pycVar.k());
                        if ((i2 & 512) != 512 && pycVar.c() > 0) {
                            this.m = new ArrayList();
                            i2 |= 512;
                        }
                        while (pycVar.c() > 0) {
                            this.m.add(Integer.valueOf(pycVar.k()));
                        }
                        pycVar.d(iE);
                        z2 = z4;
                        break;
                    case 98:
                        if ((i2 & 65536) != 65536) {
                            this.u = new ArrayList();
                            i2 |= 65536;
                        }
                        this.u.add(pycVar.g(p2d0.h, ssoVar));
                        z2 = z4;
                        break;
                    case 106:
                        if ((i2 & 1024) != 1024) {
                            this.o = new ArrayList();
                            i2 |= 1024;
                        }
                        this.o.add(pycVar.g(i4d0.o, ssoVar));
                        z2 = z4;
                        break;
                    case 242:
                        if ((this.c & 128) == 128) {
                            g4d0 g4d0Var = this.q;
                            g4d0Var.getClass();
                            cloneableT = g4d0.j(g4d0Var);
                        }
                        o2d0 o2d0Var = cloneableT;
                        g4d0 g4d0Var2 = (g4d0) pycVar.g(g4d0.h, ssoVar);
                        this.q = g4d0Var2;
                        if (o2d0Var != 0) {
                            o2d0Var.i(g4d0Var2);
                            this.q = o2d0Var.g();
                        }
                        this.c |= 128;
                        z2 = z4;
                        break;
                    case 248:
                        if ((i2 & 8192) != 8192) {
                            this.r = new ArrayList();
                            i2 |= 8192;
                        }
                        this.r.add(Integer.valueOf(pycVar.k()));
                        z2 = z4;
                        break;
                    case 250:
                        i4 = 131072;
                        int iE2 = pycVar.e(pycVar.k());
                        if ((i2 & 8192) != 8192 && pycVar.c() > 0) {
                            this.r = new ArrayList();
                            i2 |= 8192;
                        }
                        while (pycVar.c() > 0) {
                            i = i3;
                            try {
                                try {
                                    this.r.add(Integer.valueOf(pycVar.k()));
                                    i3 = i;
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i2 & 32) == 32) {
                                        this.i = Collections.unmodifiableList(this.i);
                                    }
                                    if ((i2 & 2048) == 2048) {
                                        this.p = Collections.unmodifiableList(this.p);
                                    }
                                    if ((i2 & 256) == 256) {
                                        this.l = Collections.unmodifiableList(this.l);
                                    }
                                    if ((i2 & 512) == 512) {
                                        this.m = Collections.unmodifiableList(this.m);
                                    }
                                    if ((i2 & 65536) == 65536) {
                                        this.u = Collections.unmodifiableList(this.u);
                                    }
                                    if ((i2 & 1024) == 1024) {
                                        this.o = Collections.unmodifiableList(this.o);
                                    }
                                    if ((i2 & 8192) == 8192) {
                                        this.r = Collections.unmodifiableList(this.r);
                                    }
                                    if ((i2 & i) == i) {
                                        this.t = Collections.unmodifiableList(this.t);
                                    }
                                    if ((i2 & i4) == i4) {
                                        this.v = Collections.unmodifiableList(this.v);
                                    }
                                    try {
                                        tycVarM.c0();
                                        break;
                                    } catch (IOException unused2) {
                                    } finally {
                                        this.b = ng9Var.d();
                                    }
                                    n();
                                    throw th;
                                }
                            } catch (aox e) {
                                e = e;
                                e.f1223a = this;
                                throw e;
                            } catch (IOException e2) {
                                e = e2;
                                aox aoxVar = new aox(e.getMessage());
                                aoxVar.f1223a = this;
                                throw aoxVar;
                            }
                        }
                        pycVar.d(iE2);
                        z2 = z4;
                        break;
                    case 258:
                        if ((this.c & 256) == 256) {
                            x2d0 x2d0Var = this.s;
                            x2d0Var.getClass();
                            cloneableT = x2d0.j(x2d0Var);
                        }
                        w2d0 w2d0Var = cloneableT;
                        x2d0 x2d0Var2 = (x2d0) pycVar.g(x2d0.f, ssoVar);
                        this.s = x2d0Var2;
                        if (w2d0Var != 0) {
                            w2d0Var.j(x2d0Var2);
                            this.s = w2d0Var.f();
                        }
                        this.c |= 256;
                        z2 = z4;
                        break;
                    case 266:
                        if ((i2 & 32768) != 32768) {
                            this.t = new ArrayList();
                            i2 |= 32768;
                        }
                        this.t.add(pycVar.g(t2d0.h, ssoVar));
                        z2 = z4;
                        break;
                    case 274:
                        if ((i2 & 131072) != 131072) {
                            this.v = new ArrayList();
                            i2 |= 131072;
                        }
                        try {
                            try {
                                this.v.add(pycVar.g(p2d0.h, ssoVar));
                                z2 = z4;
                            } catch (aox e3) {
                                e = e3;
                                e.f1223a = this;
                                throw e;
                            } catch (IOException e4) {
                                e = e4;
                                aox aoxVar2 = new aox(e.getMessage());
                                aoxVar2.f1223a = this;
                                throw aoxVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                i = 32768;
                                if ((i2 & 32) == 32) {
                                    this.i = Collections.unmodifiableList(this.i);
                                }
                                if ((i2 & 2048) == 2048) {
                                    this.p = Collections.unmodifiableList(this.p);
                                }
                                if ((i2 & 256) == 256) {
                                    this.l = Collections.unmodifiableList(this.l);
                                }
                                if ((i2 & 512) == 512) {
                                    this.m = Collections.unmodifiableList(this.m);
                                }
                                if ((i2 & 65536) == 65536) {
                                    this.u = Collections.unmodifiableList(this.u);
                                }
                                if ((i2 & 1024) == 1024) {
                                    this.o = Collections.unmodifiableList(this.o);
                                }
                                if ((i2 & 8192) == 8192) {
                                    this.r = Collections.unmodifiableList(this.r);
                                }
                                if ((i2 & i) == i) {
                                    this.t = Collections.unmodifiableList(this.t);
                                }
                                if ((i2 & i4) == i4) {
                                    this.v = Collections.unmodifiableList(this.v);
                                }
                                tycVarM.c0();
                                n();
                                throw th;
                            }
                        } catch (aox e5) {
                            e = e5;
                        } catch (IOException e6) {
                            e = e6;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        break;
                    default:
                        if (!o(pycVar, tycVarM, ssoVar, iN)) {
                            z3 = z4;
                        }
                        z2 = z4;
                        break;
                }
            } catch (aox e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th4) {
                th = th4;
                i = 32768;
                i4 = 131072;
            }
        }
    }

    @Override // a.e540
    public final z3 a() {
        return y;
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 4) != 4) {
            this.w = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.g.b()) {
            this.w = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((f4d0) this.i.get(i2)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        if ((this.c & 32) == 32 && !this.j.b()) {
            this.w = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            if (!((a4d0) this.l.get(i3)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            if (!((i4d0) this.o.get(i4)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.p.size(); i5++) {
            if (!((i4d0) this.p.get(i5)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        if ((this.c & 128) == 128 && !this.q.b()) {
            this.w = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.s.b()) {
            this.w = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.t.size(); i6++) {
            if (!((t2d0) this.t.get(i6)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.u.size(); i7++) {
            if (!((p2d0) this.u.get(i7)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.v.size(); i8++) {
            if (!((p2d0) this.v.get(i8)).b()) {
                this.w = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.w = (byte) 1;
            return true;
        }
        this.w = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        List list;
        List list2;
        int i = this.x;
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
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            iN += tyc.p(6, (z3) this.p.get(i3));
        }
        if ((this.c & 16) == 16) {
            iN += tyc.n(7, this.h);
        }
        if ((this.c & 64) == 64) {
            iN += tyc.n(8, this.k);
        }
        if ((this.c & 1) == 1) {
            iN += tyc.n(9, this.d);
        }
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            iN += tyc.p(10, (z3) this.l.get(i4));
        }
        int i5 = 0;
        int iO = 0;
        while (true) {
            int size = this.m.size();
            list = this.m;
            if (i5 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i5)).intValue());
            i5++;
        }
        int iP = iN + iO;
        if (!list.isEmpty()) {
            iP = iP + 1 + tyc.o(iO);
        }
        this.n = iO;
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            iP += tyc.p(12, (z3) this.u.get(i6));
        }
        for (int i7 = 0; i7 < this.o.size(); i7++) {
            iP += tyc.p(13, (z3) this.o.get(i7));
        }
        if ((this.c & 128) == 128) {
            iP += tyc.p(30, this.q);
        }
        int i8 = 0;
        int iO2 = 0;
        while (true) {
            int size2 = this.r.size();
            list2 = this.r;
            if (i8 >= size2) {
                break;
            }
            iO2 += tyc.o(((Integer) list2.get(i8)).intValue());
            i8++;
        }
        int size3 = (list2.size() * 2) + iP + iO2;
        if ((this.c & 256) == 256) {
            size3 += tyc.p(32, this.s);
        }
        for (int i9 = 0; i9 < this.t.size(); i9++) {
            size3 += tyc.p(33, (z3) this.t.get(i9));
        }
        for (int i10 = 0; i10 < this.v.size(); i10++) {
            size3 += tyc.p(34, (z3) this.v.get(i10));
        }
        int size4 = this.b.size() + k() + size3;
        this.x = size4;
        return size4;
    }

    @Override // a.z3
    public final ajt e() {
        return h3d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        h3d0 h3d0VarH = h3d0.h();
        h3d0VarH.i(this);
        return h3d0VarH;
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
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            tycVar.l0(6, (z3) this.p.get(i2));
        }
        if ((this.c & 16) == 16) {
            tycVar.j0(7, this.h);
        }
        if ((this.c & 64) == 64) {
            tycVar.j0(8, this.k);
        }
        if ((this.c & 1) == 1) {
            tycVar.j0(9, this.d);
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            tycVar.l0(10, (z3) this.l.get(i3));
        }
        if (this.m.size() > 0) {
            tycVar.s0(90);
            tycVar.s0(this.n);
        }
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            tycVar.k0(((Integer) this.m.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            tycVar.l0(12, (z3) this.u.get(i5));
        }
        for (int i6 = 0; i6 < this.o.size(); i6++) {
            tycVar.l0(13, (z3) this.o.get(i6));
        }
        if ((this.c & 128) == 128) {
            tycVar.l0(30, this.q);
        }
        for (int i7 = 0; i7 < this.r.size(); i7++) {
            tycVar.j0(31, ((Integer) this.r.get(i7)).intValue());
        }
        if ((this.c & 256) == 256) {
            tycVar.l0(32, this.s);
        }
        for (int i8 = 0; i8 < this.t.size(); i8++) {
            tycVar.l0(33, (z3) this.t.get(i8));
        }
        for (int i9 = 0; i9 < this.v.size(); i9++) {
            tycVar.l0(34, (z3) this.v.get(i9));
        }
        wtiVar.E(19000, tycVar);
        tycVar.o0(this.b);
    }

    public final void r() {
        this.d = 6;
        this.e = 6;
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
        this.p = list;
        this.q = g4d0.g;
        this.r = list;
        this.s = x2d0.e;
        this.t = list;
        this.u = list;
        this.v = list;
    }

    public i3d0() {
        this.n = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.b = pg9.f26941a;
    }

    public i3d0(h3d0 h3d0Var) {
        super(h3d0Var);
        this.n = -1;
        this.w = (byte) -1;
        this.x = -1;
        this.b = h3d0Var.f994a;
    }
}
