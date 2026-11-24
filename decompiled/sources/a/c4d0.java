package a;

import android.javax.sip.message.Response;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c4d0 extends gjt {
    public static final c4d0 p;
    public static final sfy q = new sfy((byte) 24);
    public final pg9 b;
    public int c;
    public int d;
    public int e;
    public List f;
    public a4d0 g;
    public int h;
    public a4d0 i;
    public int j;
    public List k;
    public List l;
    public List m;
    public byte n;
    public int o;

    static {
        c4d0 c4d0Var = new c4d0();
        p = c4d0Var;
        c4d0Var.d = 6;
        c4d0Var.e = 0;
        List list = Collections.EMPTY_LIST;
        c4d0Var.f = list;
        a4d0 a4d0Var = a4d0.u;
        c4d0Var.g = a4d0Var;
        c4d0Var.h = 0;
        c4d0Var.i = a4d0Var;
        c4d0Var.j = 0;
        c4d0Var.k = list;
        c4d0Var.l = list;
        c4d0Var.m = list;
    }

    public c4d0(pyc pycVar, sso ssoVar) {
        this.n = (byte) -1;
        this.o = -1;
        this.d = 6;
        boolean z = false;
        this.e = 0;
        List list = Collections.EMPTY_LIST;
        this.f = list;
        a4d0 a4d0Var = a4d0.u;
        this.g = a4d0Var;
        this.h = 0;
        this.i = a4d0Var;
        this.j = 0;
        this.k = list;
        this.l = list;
        this.m = list;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    z3d0 z3d0VarT = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.c |= 1;
                            this.d = pycVar.k();
                            continue;
                        case 16:
                            this.c |= 2;
                            this.e = pycVar.k();
                            continue;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            if ((i & 4) != 4) {
                                this.f = new ArrayList();
                                i |= 4;
                            }
                            this.f.add(pycVar.g(f4d0.o, ssoVar));
                            continue;
                        case 34:
                            if ((this.c & 4) == 4) {
                                a4d0 a4d0Var2 = this.g;
                                a4d0Var2.getClass();
                                z3d0VarT = a4d0.t(a4d0Var2);
                            }
                            a4d0 a4d0Var3 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                            this.g = a4d0Var3;
                            if (z3d0VarT != null) {
                                z3d0VarT.i(a4d0Var3);
                                this.g = z3d0VarT.g();
                            }
                            this.c |= 4;
                            continue;
                        case 40:
                            this.c |= 8;
                            this.h = pycVar.k();
                            continue;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            if ((this.c & 16) == 16) {
                                a4d0 a4d0Var4 = this.i;
                                a4d0Var4.getClass();
                                z3d0VarT = a4d0.t(a4d0Var4);
                            }
                            a4d0 a4d0Var5 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                            this.i = a4d0Var5;
                            if (z3d0VarT != null) {
                                z3d0VarT.i(a4d0Var5);
                                this.i = z3d0VarT.g();
                            }
                            this.c |= 16;
                            continue;
                        case 56:
                            this.c |= 32;
                            this.j = pycVar.k();
                            continue;
                        case 66:
                            if ((i & 128) != 128) {
                                this.k = new ArrayList();
                                i |= 128;
                            }
                            this.k.add(pycVar.g(p2d0.h, ssoVar));
                            continue;
                        case 248:
                            if ((i & 256) != 256) {
                                this.l = new ArrayList();
                                i |= 256;
                            }
                            this.l.add(Integer.valueOf(pycVar.k()));
                            continue;
                        case 250:
                            int iE = pycVar.e(pycVar.k());
                            if ((i & 256) != 256 && pycVar.c() > 0) {
                                this.l = new ArrayList();
                                i |= 256;
                            }
                            while (pycVar.c() > 0) {
                                this.l.add(Integer.valueOf(pycVar.k()));
                            }
                            pycVar.d(iE);
                            continue;
                        case 258:
                            if ((i & 512) != 512) {
                                this.m = new ArrayList();
                                i |= 512;
                            }
                            this.m.add(pycVar.g(t2d0.h, ssoVar));
                            continue;
                        default:
                            if (!o(pycVar, tycVarM, ssoVar, iN)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (aox e) {
                    e.f1223a = this;
                    throw e;
                } catch (IOException e2) {
                    aox aoxVar = new aox(e2.getMessage());
                    aoxVar.f1223a = this;
                    throw aoxVar;
                }
            } catch (Throwable th) {
                if ((i & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                if ((i & 128) == 128) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if ((i & 256) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if ((i & 512) == 512) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.b = ng9Var.d();
                }
                n();
                throw th;
            }
        }
        if ((i & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((i & 128) == 128) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i & 256) == 256) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if ((i & 512) == 512) {
            this.m = Collections.unmodifiableList(this.m);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.b = ng9Var.d();
        }
        n();
    }

    @Override // a.e540
    public final z3 a() {
        return p;
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
        if ((this.c & 2) != 2) {
            this.n = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            if (!((f4d0) this.f.get(i)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.b()) {
            this.n = (byte) 0;
            return false;
        }
        if ((this.c & 16) == 16 && !this.i.b()) {
            this.n = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (!((p2d0) this.k.get(i2)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            if (!((t2d0) this.m.get(i3)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.n = (byte) 1;
            return true;
        }
        this.n = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        List list;
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 1) == 1 ? tyc.n(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iN += tyc.n(2, this.e);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            iN += tyc.p(3, (z3) this.f.get(i2));
        }
        if ((this.c & 4) == 4) {
            iN += tyc.p(4, this.g);
        }
        if ((this.c & 8) == 8) {
            iN += tyc.n(5, this.h);
        }
        if ((this.c & 16) == 16) {
            iN += tyc.p(6, this.i);
        }
        if ((this.c & 32) == 32) {
            iN += tyc.n(7, this.j);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            iN += tyc.p(8, (z3) this.k.get(i3));
        }
        int i4 = 0;
        int iO = 0;
        while (true) {
            int size = this.l.size();
            list = this.l;
            if (i4 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iN + iO;
        for (int i5 = 0; i5 < this.m.size(); i5++) {
            size2 += tyc.p(32, (z3) this.m.get(i5));
        }
        int size3 = this.b.size() + k() + size2;
        this.o = size3;
        return size3;
    }

    @Override // a.z3
    public final ajt e() {
        return b4d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        b4d0 b4d0VarH = b4d0.h();
        b4d0VarH.i(this);
        return b4d0VarH;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 1) == 1) {
            tycVar.j0(1, this.d);
        }
        if ((this.c & 2) == 2) {
            tycVar.j0(2, this.e);
        }
        for (int i = 0; i < this.f.size(); i++) {
            tycVar.l0(3, (z3) this.f.get(i));
        }
        if ((this.c & 4) == 4) {
            tycVar.l0(4, this.g);
        }
        if ((this.c & 8) == 8) {
            tycVar.j0(5, this.h);
        }
        if ((this.c & 16) == 16) {
            tycVar.l0(6, this.i);
        }
        if ((this.c & 32) == 32) {
            tycVar.j0(7, this.j);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            tycVar.l0(8, (z3) this.k.get(i2));
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            tycVar.j0(31, ((Integer) this.l.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            tycVar.l0(32, (z3) this.m.get(i4));
        }
        wtiVar.E(Response.OK, tycVar);
        tycVar.o0(this.b);
    }

    public c4d0() {
        this.n = (byte) -1;
        this.o = -1;
        this.b = pg9.f26941a;
    }

    public c4d0(b4d0 b4d0Var) {
        super(b4d0Var);
        this.n = (byte) -1;
        this.o = -1;
        this.b = b4d0Var.f994a;
    }
}
