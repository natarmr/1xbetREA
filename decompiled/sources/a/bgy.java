package a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bgy extends ljt {
    public static final bgy m;
    public static final sfy n = new sfy((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f2578a;
    public int b;
    public int c;
    public int d;
    public Object e;
    public agy f;
    public List g;
    public int h;
    public List i;
    public int j;
    public byte k;
    public int l;

    static {
        bgy bgyVar = new bgy();
        m = bgyVar;
        bgyVar.c = 1;
        bgyVar.d = 0;
        bgyVar.e = "";
        bgyVar.f = agy.NONE;
        List list = Collections.EMPTY_LIST;
        bgyVar.g = list;
        bgyVar.i = list;
    }

    public bgy(pyc pycVar) {
        this.h = -1;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.c = 1;
        boolean z = false;
        this.d = 0;
        this.e = "";
        agy agyVar = agy.NONE;
        this.f = agyVar;
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.i = list;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = pycVar.k();
                        } else if (iN == 16) {
                            this.b |= 2;
                            this.d = pycVar.k();
                        } else if (iN == 24) {
                            int iK = pycVar.k();
                            agy agyVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : agy.DESC_TO_CLASS_ID : agy.INTERNAL_TO_CLASS_ID : agyVar;
                            if (agyVar2 == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK);
                            } else {
                                this.b |= 8;
                                this.f = agyVar2;
                            }
                        } else if (iN == 32) {
                            if ((i & 16) != 16) {
                                this.g = new ArrayList();
                                i |= 16;
                            }
                            this.g.add(Integer.valueOf(pycVar.k()));
                        } else if (iN == 34) {
                            int iE = pycVar.e(pycVar.k());
                            if ((i & 16) != 16 && pycVar.c() > 0) {
                                this.g = new ArrayList();
                                i |= 16;
                            }
                            while (pycVar.c() > 0) {
                                this.g.add(Integer.valueOf(pycVar.k()));
                            }
                            pycVar.d(iE);
                        } else if (iN == 40) {
                            if ((i & 32) != 32) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            this.i.add(Integer.valueOf(pycVar.k()));
                        } else if (iN == 42) {
                            int iE2 = pycVar.e(pycVar.k());
                            if ((i & 32) != 32 && pycVar.c() > 0) {
                                this.i = new ArrayList();
                                i |= 32;
                            }
                            while (pycVar.c() > 0) {
                                this.i.add(Integer.valueOf(pycVar.k()));
                            }
                            pycVar.d(iE2);
                        } else if (iN == 50) {
                            nh00 nh00VarF = pycVar.f();
                            this.b |= 4;
                            this.e = nh00VarF;
                        } else if (!pycVar.q(iN, tycVarM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f2578a = ng9Var.d();
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
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if ((i & 32) == 32) {
            this.i = Collections.unmodifiableList(this.i);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f2578a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.k = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        List list;
        List list2;
        pg9 nh00Var;
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iN += tyc.n(2, this.d);
        }
        if ((this.b & 8) == 8) {
            iN += tyc.m(3, this.f.f848a);
        }
        int i2 = 0;
        int iO = 0;
        while (true) {
            int size = this.g.size();
            list = this.g;
            if (i2 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iO2 = iN + iO;
        if (!list.isEmpty()) {
            iO2 = iO2 + 1 + tyc.o(iO);
        }
        this.h = iO;
        int i3 = 0;
        int iO3 = 0;
        while (true) {
            int size2 = this.i.size();
            list2 = this.i;
            if (i3 >= size2) {
                break;
            }
            iO3 += tyc.o(((Integer) list2.get(i3)).intValue());
            i3++;
        }
        int size3 = iO2 + iO3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + tyc.o(iO3);
        }
        this.j = iO3;
        if ((this.b & 4) == 4) {
            Object obj = this.e;
            if (obj instanceof String) {
                try {
                    nh00Var = new nh00(((String) obj).getBytes("UTF-8"));
                    this.e = nh00Var;
                } catch (UnsupportedEncodingException e) {
                    e9d0.m("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                nh00Var = (pg9) obj;
            }
            size3 += nh00Var.size() + tyc.r(nh00Var.size()) + tyc.t(6);
        }
        int size4 = this.f2578a.size() + size3;
        this.l = size4;
        return size4;
    }

    @Override // a.z3
    public final ajt e() {
        return zfy.g();
    }

    @Override // a.z3
    public final ajt f() {
        zfy zfyVarG = zfy.g();
        zfyVarG.h(this);
        return zfyVarG;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        pg9 nh00Var;
        d();
        if ((this.b & 1) == 1) {
            tycVar.j0(1, this.c);
        }
        if ((this.b & 2) == 2) {
            tycVar.j0(2, this.d);
        }
        if ((this.b & 8) == 8) {
            tycVar.i0(3, this.f.f848a);
        }
        if (this.g.size() > 0) {
            tycVar.s0(34);
            tycVar.s0(this.h);
        }
        for (int i = 0; i < this.g.size(); i++) {
            tycVar.k0(((Integer) this.g.get(i)).intValue());
        }
        if (this.i.size() > 0) {
            tycVar.s0(42);
            tycVar.s0(this.j);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            tycVar.k0(((Integer) this.i.get(i2)).intValue());
        }
        if ((this.b & 4) == 4) {
            Object obj = this.e;
            if (obj instanceof String) {
                try {
                    nh00Var = new nh00(((String) obj).getBytes("UTF-8"));
                    this.e = nh00Var;
                } catch (UnsupportedEncodingException e) {
                    e9d0.m("UTF-8 not supported?", e);
                    return;
                }
            } else {
                nh00Var = (pg9) obj;
            }
            tycVar.u0(6, 2);
            tycVar.s0(nh00Var.size());
            tycVar.o0(nh00Var);
        }
        tycVar.o0(this.f2578a);
    }

    public bgy() {
        this.h = -1;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.f2578a = pg9.f26941a;
    }

    public bgy(zfy zfyVar) {
        this.h = -1;
        this.j = -1;
        this.k = (byte) -1;
        this.l = -1;
        this.f2578a = zfyVar.f994a;
    }
}
