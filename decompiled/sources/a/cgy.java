package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cgy extends ljt {
    public static final cgy g;
    public static final sfy h = new sfy((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f4337a;
    public List b;
    public List c;
    public int d;
    public byte e;
    public int f;

    static {
        cgy cgyVar = new cgy();
        g = cgyVar;
        List list = Collections.EMPTY_LIST;
        cgyVar.b = list;
        cgyVar.c = list;
    }

    public cgy(pyc pycVar, sso ssoVar) {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        List list = Collections.EMPTY_LIST;
        this.b = list;
        this.c = list;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = pycVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if ((i & 1) != 1) {
                                    this.b = new ArrayList();
                                    i |= 1;
                                }
                                this.b.add(pycVar.g(bgy.n, ssoVar));
                            } else if (iN == 40) {
                                if ((i & 2) != 2) {
                                    this.c = new ArrayList();
                                    i |= 2;
                                }
                                this.c.add(Integer.valueOf(pycVar.k()));
                            } else if (iN == 42) {
                                int iE = pycVar.e(pycVar.k());
                                if ((i & 2) != 2 && pycVar.c() > 0) {
                                    this.c = new ArrayList();
                                    i |= 2;
                                }
                                while (pycVar.c() > 0) {
                                    this.c.add(Integer.valueOf(pycVar.k()));
                                }
                                pycVar.d(iE);
                            } else if (!pycVar.q(iN, tycVarM)) {
                            }
                        }
                        z = true;
                    } catch (aox e) {
                        e.f1223a = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    aox aoxVar = new aox(e2.getMessage());
                    aoxVar.f1223a = this;
                    throw aoxVar;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.b = Collections.unmodifiableList(this.b);
                }
                if ((i & 2) == 2) {
                    this.c = Collections.unmodifiableList(this.c);
                }
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.f4337a = ng9Var.d();
                }
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
        }
        if ((i & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f4337a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.e = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        List list;
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iP = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            iP += tyc.p(1, (z3) this.b.get(i3));
        }
        int iO = 0;
        while (true) {
            int size = this.c.size();
            list = this.c;
            if (i2 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iO2 = iP + iO;
        if (!list.isEmpty()) {
            iO2 = iO2 + 1 + tyc.o(iO);
        }
        this.d = iO;
        int size2 = this.f4337a.size() + iO2;
        this.f = size2;
        return size2;
    }

    @Override // a.z3
    public final ajt e() {
        yfy yfyVar = new yfy();
        List list = Collections.EMPTY_LIST;
        yfyVar.c = list;
        yfyVar.d = list;
        return yfyVar;
    }

    @Override // a.z3
    public final ajt f() {
        yfy yfyVar = new yfy();
        List list = Collections.EMPTY_LIST;
        yfyVar.c = list;
        yfyVar.d = list;
        yfyVar.g(this);
        return yfyVar;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        for (int i = 0; i < this.b.size(); i++) {
            tycVar.l0(1, (z3) this.b.get(i));
        }
        if (this.c.size() > 0) {
            tycVar.s0(42);
            tycVar.s0(this.d);
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            tycVar.k0(((Integer) this.c.get(i2)).intValue());
        }
        tycVar.o0(this.f4337a);
    }

    public cgy() {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        this.f4337a = pg9.f26941a;
    }

    public cgy(yfy yfyVar) {
        this.d = -1;
        this.e = (byte) -1;
        this.f = -1;
        this.f4337a = yfyVar.f994a;
    }
}
