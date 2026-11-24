package a;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class t460 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ry40 f33304a;

    static {
        ry40 ry40Var = v960.f37020a;
        f33304a = new ry40();
    }

    public static final void a(lm40 lm40Var, int i, int i2) {
        if (!(lm40Var instanceof f3k)) {
            b(lm40Var, i & lm40Var.c, i2);
            return;
        }
        f3k f3kVar = (f3k) lm40Var;
        int i3 = f3kVar.o;
        b(lm40Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (lm40 lm40Var2 = f3kVar.p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
            a(lm40Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(lm40 lm40Var, int i, int i2) {
        if (i2 != 0 || lm40Var.O0()) {
            if ((i & 2) != 0 && (lm40Var instanceof v6z)) {
                n7x.I((v6z) lm40Var);
                if (i2 == 2) {
                    vcc.X(lm40Var, 2).t1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                vcc.Z(lm40Var).F();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                vcc.Z(lm40Var).V(false);
            }
            if ((i & 256) != 0 && (lm40Var instanceof t7v)) {
                if (i2 == 1) {
                    e7z e7zVarZ = vcc.Z(lm40Var);
                    e7zVarZ.b0(e7zVarZ.r1 + 1);
                } else if (i2 == 2) {
                    e7z e7zVarZ2 = vcc.Z(lm40Var);
                    e7zVarZ2.b0(e7zVarZ2.r1 - 1);
                }
                if (i2 != 2) {
                    e7z e7zVarZ3 = vcc.Z(lm40Var);
                    if (e7zVarZ3.r1 != 0 && !e7zVarZ3.q() && !e7zVarZ3.r() && !e7zVarZ3.q1) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) h7z.a(e7zVarZ3);
                        kd30 kd30Var = (kd30) androidComposeView.t1.f;
                        if (e7zVarZ3.r1 > 0) {
                            ((xz40) kd30Var.f18086a).b(e7zVarZ3);
                            e7zVarZ3.q1 = true;
                        }
                        androidComposeView.G(null);
                    }
                }
            }
            if ((i & 4) != 0 && (lm40Var instanceof ehl)) {
                vfc.J((ehl) lm40Var);
            }
            if ((i & 8) != 0 && (lm40Var instanceof qai0)) {
                vcc.Z(lm40Var).s = true;
            }
            if ((i & 64) != 0 && (lm40Var instanceof fp80)) {
                i7z i7zVar = vcc.Z((fp80) lm40Var).i1;
                i7zVar.p.r = true;
                i810 i810Var = i7zVar.q;
                if (i810Var != null) {
                    i810Var.x = true;
                }
            }
            if ((i & 2048) != 0 && (lm40Var instanceof bqq)) {
                bqq bqqVar = (bqq) lm40Var;
                n4a.b = null;
                bqqVar.n(n4a.f22890a);
                if (n4a.b != null) {
                    lm40 lm40Var2 = (lm40) bqqVar;
                    if (!lm40Var2.f20279a.n) {
                        xcx.b("visitChildren called on an unattached node");
                    }
                    xz40 xz40Var = new xz40(new lm40[16]);
                    lm40 lm40Var3 = lm40Var2.f20279a;
                    lm40 lm40Var4 = lm40Var3.f;
                    if (lm40Var4 == null) {
                        vcc.v(xz40Var, lm40Var3);
                    } else {
                        xz40Var.b(lm40Var4);
                    }
                    while (true) {
                        int i3 = xz40Var.c;
                        if (i3 == 0) {
                            break;
                        }
                        lm40 lm40VarV = (lm40) xz40Var.k(i3 - 1);
                        if ((lm40VarV.d & 1024) == 0) {
                            vcc.v(xz40Var, lm40VarV);
                        } else {
                            while (lm40VarV != null) {
                                if ((lm40VarV.c & 1024) != 0) {
                                    xz40 xz40Var2 = null;
                                    while (lm40VarV != null) {
                                        if (lm40VarV instanceof nqq) {
                                            nqq nqqVar = (nqq) lm40VarV;
                                            tpq tpqVar = ((ypq) vcc.a0(nqqVar).getFocusOwner()).d;
                                            if (tpqVar.c.a(nqqVar)) {
                                                tpqVar.a();
                                            }
                                        } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                            int i4 = 0;
                                            for (lm40 lm40Var5 = ((f3k) lm40VarV).p; lm40Var5 != null; lm40Var5 = lm40Var5.f) {
                                                if ((lm40Var5.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        lm40VarV = lm40Var5;
                                                    } else {
                                                        if (xz40Var2 == null) {
                                                            xz40Var2 = new xz40(new lm40[16]);
                                                        }
                                                        if (lm40VarV != null) {
                                                            xz40Var2.b(lm40VarV);
                                                            lm40VarV = null;
                                                        }
                                                        xz40Var2.b(lm40Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        lm40VarV = vcc.V(xz40Var2);
                                    }
                                    break;
                                }
                                lm40VarV = lm40VarV.f;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (lm40Var instanceof lpq)) {
                lpq lpqVar = (lpq) lm40Var;
                tpq tpqVar2 = ((ypq) vcc.a0(lpqVar).getFocusOwner()).d;
                if (tpqVar2.d.a(lpqVar)) {
                    tpqVar2.a();
                }
            }
            if ((i & 2097152) != 0 && (lm40Var instanceof h7x) && i2 == 2) {
                ((h7x) lm40Var).z0();
            }
        }
    }

    public static final void c(lm40 lm40Var) {
        if (!lm40Var.n) {
            xcx.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(lm40Var, -1, 0);
    }

    public static final int d(km40 km40Var) {
        int i = km40Var instanceof t6z ? 3 : 1;
        if (km40Var instanceof dhl) {
            i |= 4;
        }
        if (km40Var instanceof oai0) {
            i |= 8;
        }
        if (km40Var instanceof jpa0) {
            i |= 16;
        }
        if (km40Var instanceof sm40) {
            i |= 32;
        }
        if (km40Var instanceof ep80) {
            i |= 64;
        }
        return km40Var instanceof z29 ? 524288 | i : i;
    }

    public static final int e(lm40 lm40Var) {
        int i = lm40Var.c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = lm40Var.getClass();
        ry40 ry40Var = f33304a;
        int iD = ry40Var.d(cls);
        if (iD >= 0) {
            return ry40Var.c[iD];
        }
        int i2 = lm40Var instanceof v6z ? 3 : 1;
        if (lm40Var instanceof ehl) {
            i2 |= 4;
        }
        if (lm40Var instanceof qai0) {
            i2 |= 8;
        }
        if (lm40Var instanceof gpa0) {
            i2 |= 16;
        }
        if (lm40Var instanceof rm40) {
            i2 |= 32;
        }
        if (lm40Var instanceof fp80) {
            i2 |= 64;
        }
        if (lm40Var instanceof g6z) {
            i2 |= 4194432;
        } else if (lm40Var instanceof xj30) {
            i2 |= 128;
        }
        if (lm40Var instanceof t7v) {
            i2 |= 256;
        }
        if (lm40Var instanceof nqq) {
            i2 |= 1024;
        }
        if (lm40Var instanceof bqq) {
            i2 |= 2048;
        }
        if (lm40Var instanceof lpq) {
            i2 |= 4096;
        }
        if (lm40Var instanceof lky) {
            i2 |= 8192;
        }
        if (lm40Var instanceof ix2) {
            i2 |= 16384;
        }
        if (lm40Var instanceof vld) {
            i2 |= 32768;
        }
        if (lm40Var instanceof hps0) {
            i2 |= 262144;
        }
        if (lm40Var instanceof z29) {
            i2 |= 524288;
        }
        if (lm40Var instanceof nqq) {
            i2 |= 1048576;
        }
        if (lm40Var instanceof h7x) {
            i2 |= 2097152;
        }
        if (lm40Var instanceof taz) {
            i2 |= 8388608;
        }
        ry40Var.g(i2, cls);
        return i2;
    }

    public static final int f(lm40 lm40Var) {
        if (!(lm40Var instanceof f3k)) {
            return e(lm40Var);
        }
        f3k f3kVar = (f3k) lm40Var;
        int iF = f3kVar.o;
        for (lm40 lm40Var2 = f3kVar.p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
            iF |= f(lm40Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
