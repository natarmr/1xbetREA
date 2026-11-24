package a;

import android.gov.nist.core.Separators;
import com.github.mikephil.charting.data.Entry;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class hu5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13663a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public hu5(List list) {
        this.f13663a = (byte) 8;
        list.getClass();
        this.e = list;
        fsv0 fsv0Var = (fsv0) CollectionsKt.firstOrNull(list);
        this.b = fsv0Var != null ? fsv0Var.b : 0;
        fsv0 fsv0Var2 = (fsv0) CollectionsKt.f0(list);
        this.c = fsv0Var2 != null ? fsv0Var2.b : 0;
        this.d = list.size();
    }

    public static final void A0(int i) throws zew0 {
        if ((i & 7) == 0) {
            return;
        }
        itt0.x("Failed to parse the message.");
    }

    public static void c0(int i) throws ynx {
        if ((i & 3) != 0) {
            throw ynx.g();
        }
    }

    public static void d0(int i) throws ynx {
        if ((i & 7) != 0) {
            throw ynx.g();
        }
    }

    public static final void z0(int i) throws zew0 {
        if ((i & 3) == 0) {
            return;
        }
        itt0.x("Failed to parse the message.");
    }

    public void A(bmx bmxVar) throws box {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iD = oycVar.D();
            if ((iD & 3) != 0) {
                throw new box("Failed to parse the message.");
            }
            int iD2 = oycVar.d() + iD;
            do {
                ((f5d0) bmxVar).add(Float.valueOf(oycVar.t()));
            } while (oycVar.d() < iD2);
            return;
        }
        if (i != 5) {
            throw box.b();
        }
        do {
            ((f5d0) bmxVar).add(Float.valueOf(oycVar.t()));
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void B(List list) throws ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof alq;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iD = oycVar.D();
                c0(iD);
                int iD2 = oycVar.d() + iD;
                do {
                    list.add(Float.valueOf(oycVar.t()));
                } while (oycVar.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw ynx.d();
            }
            do {
                list.add(Float.valueOf(oycVar.t()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        alq alqVar = (alq) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iD3 = oycVar.D();
            c0(iD3);
            int iD4 = oycVar.d() + iD3;
            do {
                alqVar.c(oycVar.t());
            } while (oycVar.d() < iD4);
            return;
        }
        if (i3 != 5) {
            throw ynx.d();
        }
        do {
            alqVar.c(oycVar.t());
            if (oycVar.e()) {
                return;
            } else {
                iC2 = oycVar.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public void B0(int i) throws qkw0 {
        if (((tdw0) this.e).s() != i) {
            throw qkw0.h();
        }
    }

    public void C(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Integer.valueOf(oycVar.u()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Integer.valueOf(oycVar.u()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void C0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Boolean.valueOf(tdw0Var.d0()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Boolean.valueOf(tdw0Var.d0()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public void D(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof tjx;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(oycVar.u()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Integer.valueOf(oycVar.u()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        tjx tjxVar = (tjx) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tjxVar.c(oycVar.u());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            tjxVar.c(oycVar.u());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void D0(mkw0 mkw0Var, dlw0 dlw0Var, dkw0 dkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b;
        if ((i & 7) != 3) {
            throw qkw0.a();
        }
        do {
            jkw0 jkw0VarZza = dlw0Var.zza();
            L0(jkw0VarZza, dlw0Var, dkw0Var);
            dlw0Var.b(jkw0VarZza);
            ((blw0) mkw0Var).add(jkw0VarZza);
            if (tdw0Var.b0() || this.d != 0) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == i);
        this.d = iF;
    }

    public void E(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Long.valueOf(oycVar.v()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Long.valueOf(oycVar.v()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void E0(mkw0 mkw0Var, boolean z) throws skw0 {
        String strW;
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        if ((this.b & 7) != 2) {
            throw qkw0.a();
        }
        do {
            if (z) {
                G0(2);
                strW = tdw0Var.Y();
            } else {
                G0(2);
                strW = tdw0Var.W();
            }
            ((blw0) mkw0Var).add(strW);
            if (tdw0Var.b0()) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public void F(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof x610;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(oycVar.v()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Long.valueOf(oycVar.v()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        x610 x610Var = (x610) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x610Var.c(oycVar.v());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            x610Var.c(oycVar.v());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public int F0() {
        int iM = this.d;
        if (iM != 0) {
            this.b = iM;
            this.d = 0;
        } else {
            iM = ((tdw0) this.e).m();
            this.b = iM;
        }
        if (iM == 0 || iM == this.c) {
            return Integer.MAX_VALUE;
        }
        return iM >>> 3;
    }

    public void G(bmx bmxVar) throws box {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iD = oycVar.D();
            if ((iD & 3) != 0) {
                throw new box("Failed to parse the message.");
            }
            int iD2 = oycVar.d() + iD;
            do {
                ((f5d0) bmxVar).add(Integer.valueOf(oycVar.w()));
            } while (oycVar.d() < iD2);
            return;
        }
        if (i != 5) {
            throw box.b();
        }
        do {
            ((f5d0) bmxVar).add(Integer.valueOf(oycVar.w()));
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void G0(int i) {
        if ((this.b & 7) != i) {
            throw qkw0.a();
        }
    }

    public void H(List list) throws ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof tjx;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iD = oycVar.D();
                c0(iD);
                int iD2 = oycVar.d() + iD;
                do {
                    list.add(Integer.valueOf(oycVar.w()));
                } while (oycVar.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw ynx.d();
            }
            do {
                list.add(Integer.valueOf(oycVar.w()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        tjx tjxVar = (tjx) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iD3 = oycVar.D();
            c0(iD3);
            int iD4 = oycVar.d() + iD3;
            do {
                tjxVar.c(oycVar.w());
            } while (oycVar.d() < iD4);
            return;
        }
        if (i3 != 5) {
            throw ynx.d();
        }
        do {
            tjxVar.c(oycVar.w());
            if (oycVar.e()) {
                return;
            } else {
                iC2 = oycVar.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public void H0(mkw0 mkw0Var) throws skw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        if ((this.b & 7) != 2) {
            throw qkw0.a();
        }
        do {
            ((blw0) mkw0Var).add(Z0());
            if (tdw0Var.b0()) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public void I(bmx bmxVar) throws box {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((f5d0) bmxVar).add(Long.valueOf(oycVar.x()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.D();
        if ((iD & 7) != 0) {
            throw new box("Failed to parse the message.");
        }
        int iD2 = oycVar.d() + iD;
        do {
            ((f5d0) bmxVar).add(Long.valueOf(oycVar.x()));
        } while (oycVar.d() < iD2);
    }

    public void I0(mkw0 mkw0Var, dlw0 dlw0Var, dkw0 dkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b;
        if ((i & 7) != 2) {
            throw qkw0.a();
        }
        do {
            jkw0 jkw0VarZza = dlw0Var.zza();
            N0(jkw0VarZza, dlw0Var, dkw0Var);
            dlw0Var.b(jkw0VarZza);
            ((blw0) mkw0Var).add(jkw0VarZza);
            if (tdw0Var.b0() || this.d != 0) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == i);
        this.d = iF;
    }

    public void J(List list) throws ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof x610;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(oycVar.x()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.D();
            d0(iD);
            int iD2 = oycVar.d() + iD;
            do {
                list.add(Long.valueOf(oycVar.x()));
            } while (oycVar.d() < iD2);
            return;
        }
        x610 x610Var = (x610) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                x610Var.c(oycVar.x());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD3 = oycVar.D();
        d0(iD3);
        int iD4 = oycVar.d() + iD3;
        do {
            x610Var.c(oycVar.x());
        } while (oycVar.d() < iD4);
    }

    public int J0() {
        int iF = this.d;
        if (iF != 0) {
            this.b = iF;
            this.d = 0;
        } else {
            iF = ((tdw0) this.e).F();
            this.b = iF;
        }
        if (iF == 0 || iF == this.c) {
            return Integer.MAX_VALUE;
        }
        return iF >>> 3;
    }

    public void K(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Integer.valueOf(oycVar.y()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Integer.valueOf(oycVar.y()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void K0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((blw0) mkw0Var).add(Double.valueOf(tdw0Var.l()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iH = tdw0Var.H();
        if ((iH & 7) != 0) {
            throw qkw0.g();
        }
        int iS = tdw0Var.s() + iH;
        do {
            ((blw0) mkw0Var).add(Double.valueOf(tdw0Var.l()));
        } while (tdw0Var.s() < iS);
    }

    public void L(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof tjx;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(oycVar.y()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Integer.valueOf(oycVar.y()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        tjx tjxVar = (tjx) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tjxVar.c(oycVar.y());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            tjxVar.c(oycVar.y());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void L0(Object obj, dlw0 dlw0Var, dkw0 dkw0Var) throws qkw0 {
        tdw0 tdw0Var = (tdw0) this.e;
        int i = tdw0Var.f33791a;
        int i2 = tdw0Var.b;
        if (i + i2 >= 100) {
            throw new qkw0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i3 = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        tdw0Var.b = i2 + 1;
        try {
            dlw0Var.d(obj, this, dkw0Var);
            if (this.b != this.c) {
                throw qkw0.g();
            }
            tdw0Var.b--;
            this.c = i3;
        } catch (Throwable th) {
            tdw0Var.b--;
            this.c = i3;
            throw th;
        }
    }

    public void M(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Long.valueOf(oycVar.z()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Long.valueOf(oycVar.z()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void M0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.w()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.w()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public void N(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof x610;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(oycVar.z()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Long.valueOf(oycVar.z()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        x610 x610Var = (x610) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x610Var.c(oycVar.z());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            x610Var.c(oycVar.z());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void N0(Object obj, dlw0 dlw0Var, dkw0 dkw0Var) throws qkw0 {
        tdw0 tdw0Var = (tdw0) this.e;
        int iH = tdw0Var.H();
        if (tdw0Var.f33791a + tdw0Var.b >= 100) {
            throw new qkw0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iQ = tdw0Var.q(iH);
        tdw0Var.f33791a++;
        dlw0Var.d(obj, this, dkw0Var);
        tdw0Var.t(0);
        tdw0Var.f33791a--;
        tdw0Var.x(iQ);
    }

    public void O(bmx bmxVar, boolean z) throws xnx, vnx {
        String strA;
        int iC;
        oyc oycVar = (oyc) this.e;
        if ((this.b & 7) != 2) {
            throw box.b();
        }
        do {
            if (z) {
                W(2);
                strA = oycVar.B();
            } else {
                W(2);
                strA = oycVar.A();
            }
            ((f5d0) bmxVar).add(strA);
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void O0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iH = tdw0Var.H();
            if ((iH & 3) != 0) {
                throw qkw0.g();
            }
            int iS = tdw0Var.s() + iH;
            do {
                ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.z()));
            } while (tdw0Var.s() < iS);
            return;
        }
        if (i != 5) {
            throw qkw0.a();
        }
        do {
            ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.z()));
            if (tdw0Var.b0()) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public void P(List list, boolean z) throws xnx, vnx {
        String strA;
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        if ((this.b & 7) != 2) {
            throw ynx.d();
        }
        if ((list instanceof rez) && !z) {
            rez rezVar = (rez) list;
            do {
                rezVar.f0(o());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        do {
            if (z) {
                W(2);
                strA = oycVar.B();
            } else {
                W(2);
                strA = oycVar.A();
            }
            list.add(strA);
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void P0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.I()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iH = tdw0Var.H();
        if ((iH & 7) != 0) {
            throw qkw0.g();
        }
        int iS = tdw0Var.s() + iH;
        do {
            ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.I()));
        } while (tdw0Var.s() < iS);
    }

    public void Q(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Integer.valueOf(oycVar.D()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Integer.valueOf(oycVar.D()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void Q0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iH = tdw0Var.H();
            if ((iH & 3) != 0) {
                throw qkw0.g();
            }
            int iS = tdw0Var.s() + iH;
            do {
                ((blw0) mkw0Var).add(Float.valueOf(tdw0Var.p()));
            } while (tdw0Var.s() < iS);
            return;
        }
        if (i != 5) {
            throw qkw0.a();
        }
        do {
            ((blw0) mkw0Var).add(Float.valueOf(tdw0Var.p()));
            if (tdw0Var.b0()) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public void R(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof tjx;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(oycVar.D()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Integer.valueOf(oycVar.D()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        tjx tjxVar = (tjx) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tjxVar.c(oycVar.D());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            tjxVar.c(oycVar.D());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void R0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.A()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.A()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public void S(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Long.valueOf(oycVar.E()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Long.valueOf(oycVar.E()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void S0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.K()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.K()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public void T(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof x610;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(oycVar.E()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Long.valueOf(oycVar.E()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        x610 x610Var = (x610) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x610Var.c(oycVar.E());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            x610Var.c(oycVar.E());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void T0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iH = tdw0Var.H();
            if ((iH & 3) != 0) {
                throw qkw0.g();
            }
            int iS = tdw0Var.s() + iH;
            do {
                ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.C()));
            } while (tdw0Var.s() < iS);
            return;
        }
        if (i != 5) {
            throw qkw0.a();
        }
        do {
            ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.C()));
            if (tdw0Var.b0()) {
                return;
            } else {
                iF = tdw0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public synchronized void U(dr8 dr8Var) {
        while (dr8Var != null) {
            o52[] o52VarArr = (o52[]) this.e;
            int i = this.d;
            this.d = i + 1;
            o52 o52Var = (o52) dr8Var.c;
            o52Var.getClass();
            o52VarArr[i] = o52Var;
            this.c--;
            dr8Var = (dr8) dr8Var.d;
            if (dr8Var == null || ((o52) dr8Var.c) == null) {
                dr8Var = null;
            }
        }
    }

    public void U0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.N()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iH = tdw0Var.H();
        if ((iH & 7) != 0) {
            throw qkw0.g();
        }
        int iS = tdw0Var.s() + iH;
        do {
            ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.N()));
        } while (tdw0Var.s() < iS);
    }

    public void V(int i) throws box, ynx {
        switch (this.f13663a) {
            case 2:
                if (((oyc) this.e).d() != i) {
                    throw ynx.h();
                }
                return;
            default:
                if (((oyc) this.e).d() != i) {
                    throw box.f();
                }
                return;
        }
    }

    public void V0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.E()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.E()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public void W(int i) throws xnx, vnx {
        switch (this.f13663a) {
            case 2:
                if ((this.b & 7) != i) {
                    throw ynx.d();
                }
                return;
            default:
                if ((this.b & 7) != i) {
                    throw box.b();
                }
                return;
        }
    }

    public void W0(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.P()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.P()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public void X(eu5 eu5Var, v500 v500Var) {
        ((s500) this.e).c.getClass();
        float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float lowestVisibleX = eu5Var.getLowestVisibleX();
        float highestVisibleX = eu5Var.getHighestVisibleX();
        Entry entryC = v500Var.c(lowestVisibleX, Float.NaN, 2);
        ArrayList arrayList = v500Var.o;
        Entry entryC2 = v500Var.c(highestVisibleX, Float.NaN, 1);
        this.b = entryC == null ? 0 : arrayList.indexOf(entryC);
        int iIndexOf = entryC2 != null ? arrayList.indexOf(entryC2) : 0;
        this.c = iIndexOf;
        this.d = (int) ((iIndexOf - this.b) * fMax);
    }

    public void X0(mkw0 mkw0Var) throws skw0 {
        E0(mkw0Var, false);
    }

    public synchronized void Y(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            b0();
        }
    }

    public void Y0(mkw0 mkw0Var) throws skw0 {
        E0(mkw0Var, true);
    }

    public lxv0 Z(float f, float f2, boolean z) {
        fsv0 fsv0Var;
        List listA0 = (List) this.e;
        if (z) {
            ArrayList arrayListQ0 = CollectionsKt.q0(kotlin.collections.a.c(new fsv0(jxv0.f17330a, 0)), listA0);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListQ0) {
                if (hashSet.add(Integer.valueOf(((fsv0) obj).b))) {
                    arrayList.add(obj);
                }
            }
            listA0 = CollectionsKt.A0(arrayList, new jzt0((byte) 3));
        }
        Object next = null;
        if (listA0.isEmpty()) {
            return null;
        }
        if (f2 < -400.0f) {
            for (Object obj2 : listA0) {
                if (((fsv0) obj2).b > f + 1.0f) {
                    next = obj2;
                    break;
                }
            }
            fsv0Var = (fsv0) next;
            if (fsv0Var == null) {
                fsv0Var = (fsv0) CollectionsKt.d0(listA0);
            }
        } else if (f2 > 400.0f) {
            ListIterator listIterator = listA0.listIterator(listA0.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((fsv0) objPrevious).b < f - 1.0f) {
                    next = objPrevious;
                    break;
                }
            }
            fsv0Var = (fsv0) next;
            if (fsv0Var == null) {
                fsv0Var = (fsv0) CollectionsKt.U(listA0);
            }
        } else {
            Iterator it = listA0.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float fAbs = Math.abs(((fsv0) next).b - f);
                    do {
                        Object next2 = it.next();
                        float fAbs2 = Math.abs(((fsv0) next2).b - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            next = next2;
                            fAbs = fAbs2;
                        }
                    } while (it.hasNext());
                }
            }
            fsv0Var = (fsv0) next;
            if (fsv0Var == null) {
                fsv0Var = (fsv0) CollectionsKt.U(listA0);
            }
        }
        return fsv0Var.f10084a;
    }

    public sjw0 Z0() {
        G0(2);
        return ((tdw0) this.e).U();
    }

    public void a(e2e e2eVar) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = e2eVar;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                itt0.k("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            qx3.e(0, i3, length, objArr, objArr2);
            qx3.e(i4, 0, this.b, (Object[]) this.e, objArr2);
            this.e = objArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }

    public boolean a0() {
        int i;
        oyc oycVar = (oyc) this.e;
        if (oycVar.e() || (i = this.b) == this.c) {
            return false;
        }
        return oycVar.F(i);
    }

    public void a1(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.H()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Integer.valueOf(tdw0Var.H()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public synchronized o52 b() {
        o52 o52Var;
        try {
            int i = this.c + 1;
            this.c = i;
            int i2 = this.d;
            if (i2 > 0) {
                o52[] o52VarArr = (o52[]) this.e;
                int i3 = i2 - 1;
                this.d = i3;
                o52Var = o52VarArr[i3];
                o52Var.getClass();
                ((o52[]) this.e)[this.d] = null;
            } else {
                o52 o52Var2 = new o52(new byte[65536], 0);
                o52[] o52VarArr2 = (o52[]) this.e;
                if (i > o52VarArr2.length) {
                    this.e = (o52[]) Arrays.copyOf(o52VarArr2, o52VarArr2.length * 2);
                }
                o52Var = o52Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return o52Var;
    }

    public synchronized void b0() {
        int iMax = Math.max(0, vtt0.g(this.b, 65536) - this.c);
        int i = this.d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((o52[]) this.e, iMax, i, (Object) null);
        this.d = iMax;
    }

    public qdw0 b1() {
        u0(2);
        return ((tdw0) this.e).O();
    }

    public t4i0 c(int i) {
        return new t4i0(pzw.J((a9q0) this.e, i), i, 1L);
    }

    public void c1(mkw0 mkw0Var) throws qkw0 {
        int iF;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.S()));
                if (tdw0Var.b0()) {
                    return;
                } else {
                    iF = tdw0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        if (i != 2) {
            throw qkw0.a();
        }
        int iS = tdw0Var.s() + tdw0Var.H();
        do {
            ((blw0) mkw0Var).add(Long.valueOf(tdw0Var.S()));
        } while (tdw0Var.s() < iS);
        B0(iS);
    }

    public int d() {
        return this.d - this.c;
    }

    public void d1(xew0 xew0Var) throws zew0 {
        int iM;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                xew0Var.add(Double.valueOf(tdw0Var.v()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        if (i != 2) {
            itt0.p();
            return;
        }
        int iR = tdw0Var.R();
        A0(iR);
        int iE = tdw0Var.e() + iR;
        do {
            xew0Var.add(Double.valueOf(tdw0Var.v()));
        } while (tdw0Var.e() < iE);
    }

    public int e() {
        switch (this.f13663a) {
            case 2:
                int iC = this.d;
                if (iC != 0) {
                    this.b = iC;
                    this.d = 0;
                } else {
                    iC = ((oyc) this.e).C();
                    this.b = iC;
                }
                if (iC == 0 || iC == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iC >>> 3;
            default:
                int iC2 = this.d;
                if (iC2 != 0) {
                    this.b = iC2;
                    this.d = 0;
                } else {
                    iC2 = ((oyc) this.e).C();
                    this.b = iC2;
                }
                if (iC2 == 0 || iC2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iC2 >>> 3;
        }
    }

    public void e0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof dfw0;
        int i = this.b;
        if (z) {
            dfw0 dfw0Var = (dfw0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    dfw0Var.f(tdw0Var.D());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                dfw0Var.f(tdw0Var.D());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Long.valueOf(tdw0Var.D()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Long.valueOf(tdw0Var.D()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void e1(xew0 xew0Var) throws zew0 {
        int iM;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iR = tdw0Var.R();
            z0(iR);
            int iE = tdw0Var.e() + iR;
            do {
                xew0Var.add(Float.valueOf(tdw0Var.y()));
            } while (tdw0Var.e() < iE);
            return;
        }
        if (i != 5) {
            itt0.p();
            return;
        }
        do {
            xew0Var.add(Float.valueOf(tdw0Var.y()));
            if (tdw0Var.d()) {
                return;
            } else {
                iM = tdw0Var.m();
            }
        } while (iM == this.b);
        this.d = iM;
    }

    public int f(int i) {
        return ((a180) this.e).c[this.c + i];
    }

    public void f0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof oew0;
        int i = this.b;
        if (z) {
            oew0 oew0Var = (oew0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    oew0Var.zzh(tdw0Var.E());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                oew0Var.zzh(tdw0Var.E());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Integer.valueOf(tdw0Var.E()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Integer.valueOf(tdw0Var.E()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void f1(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof dfw0;
        int i = this.b;
        if (z) {
            dfw0 dfw0Var = (dfw0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    dfw0Var.f(tdw0Var.B());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                dfw0Var.f(tdw0Var.B());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Long.valueOf(tdw0Var.B()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Long.valueOf(tdw0Var.B()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public Object g(int i) {
        return ((a180) this.e).e[this.d + i];
    }

    public void g0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof dfw0;
        int i = this.b;
        if (z) {
            dfw0 dfw0Var = (dfw0) xew0Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iR = tdw0Var.R();
                A0(iR);
                int iE = tdw0Var.e() + iR;
                do {
                    dfw0Var.f(tdw0Var.G());
                } while (tdw0Var.e() < iE);
                return;
            }
            do {
                dfw0Var.f(tdw0Var.G());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iR2 = tdw0Var.R();
                A0(iR2);
                int iE2 = tdw0Var.e() + iR2;
                do {
                    xew0Var.add(Long.valueOf(tdw0Var.G()));
                } while (tdw0Var.e() < iE2);
                return;
            }
            do {
                xew0Var.add(Long.valueOf(tdw0Var.G()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void h(Object obj, o2h0 o2h0Var, qso qsoVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            o2h0Var.g(obj, this, qsoVar);
            if (this.b != this.c) {
                throw ynx.g();
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public void h0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof oew0;
        int i = this.b;
        if (z) {
            oew0 oew0Var = (oew0) xew0Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iR = tdw0Var.R();
                z0(iR);
                int iE = tdw0Var.e() + iR;
                do {
                    oew0Var.zzh(tdw0Var.H());
                } while (tdw0Var.e() < iE);
                return;
            }
            if (i2 != 5) {
                itt0.p();
                return;
            }
            do {
                oew0Var.zzh(tdw0Var.H());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iR2 = tdw0Var.R();
                z0(iR2);
                int iE2 = tdw0Var.e() + iR2;
                do {
                    xew0Var.add(Integer.valueOf(tdw0Var.H()));
                } while (tdw0Var.e() < iE2);
                return;
            }
            if (i3 != 5) {
                itt0.p();
                return;
            }
            do {
                xew0Var.add(Integer.valueOf(tdw0Var.H()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void i(Object obj, q2h0 q2h0Var, tso tsoVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            q2h0Var.f(obj, this, tsoVar);
            if (this.b != this.c) {
                throw new box("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public void i0(xew0 xew0Var) throws zew0 {
        int iM;
        tdw0 tdw0Var = (tdw0) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                xew0Var.add(Boolean.valueOf(tdw0Var.J()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            this.d = iM;
            return;
        }
        if (i != 2) {
            itt0.p();
            return;
        }
        int iE = tdw0Var.e() + tdw0Var.R();
        do {
            xew0Var.add(Boolean.valueOf(tdw0Var.J()));
        } while (tdw0Var.e() < iE);
        y0(iE);
    }

    public void j(Object obj, o2h0 o2h0Var, qso qsoVar) throws ynx {
        oyc oycVar = (oyc) this.e;
        int iD = oycVar.D();
        if (oycVar.f26055a >= 100) {
            throw new ynx("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iK = oycVar.k(iD);
        oycVar.f26055a++;
        o2h0Var.g(obj, this, qsoVar);
        oycVar.a(0);
        oycVar.f26055a--;
        oycVar.j(iK);
    }

    public void j0(xew0 xew0Var, boolean z) throws yew0 {
        String strL;
        int iM;
        tdw0 tdw0Var = (tdw0) this.e;
        if ((this.b & 7) != 2) {
            itt0.p();
            return;
        }
        do {
            if (z) {
                u0(2);
                strL = tdw0Var.M();
            } else {
                u0(2);
                strL = tdw0Var.L();
            }
            xew0Var.add(strL);
            if (tdw0Var.d()) {
                return;
            } else {
                iM = tdw0Var.m();
            }
        } while (iM == this.b);
        this.d = iM;
    }

    public void k(Object obj, q2h0 q2h0Var, tso tsoVar) throws box {
        oyc oycVar = (oyc) this.e;
        int iD = oycVar.D();
        if (oycVar.f26055a >= 100) {
            throw new box("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = oycVar.k(iD);
        oycVar.f26055a++;
        q2h0Var.f(obj, this, tsoVar);
        oycVar.a(0);
        oycVar.f26055a--;
        oycVar.j(iK);
    }

    public void k0(xew0 xew0Var, egw0 egw0Var, bew0 bew0Var) throws zew0 {
        int iM;
        int i = this.b;
        if ((i & 7) != 2) {
            itt0.p();
            return;
        }
        do {
            mew0 mew0VarZza = egw0Var.zza();
            v0(mew0VarZza, egw0Var, bew0Var);
            egw0Var.h(mew0VarZza);
            xew0Var.add(mew0VarZza);
            tdw0 tdw0Var = (tdw0) this.e;
            if (tdw0Var.d() || this.d != 0) {
                return;
            } else {
                iM = tdw0Var.m();
            }
        } while (iM == i);
        this.d = iM;
    }

    public void l(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Boolean.valueOf(oycVar.m()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Boolean.valueOf(oycVar.m()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void l0(xew0 xew0Var, egw0 egw0Var, bew0 bew0Var) throws yew0 {
        int iM;
        int i = this.b;
        if ((i & 7) != 3) {
            itt0.p();
            return;
        }
        do {
            mew0 mew0VarZza = egw0Var.zza();
            w0(mew0VarZza, egw0Var, bew0Var);
            egw0Var.h(mew0VarZza);
            xew0Var.add(mew0VarZza);
            tdw0 tdw0Var = (tdw0) this.e;
            if (tdw0Var.d() || this.d != 0) {
                return;
            } else {
                iM = tdw0Var.m();
            }
        } while (iM == i);
        this.d = iM;
    }

    public void m(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof mm8;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(oycVar.m()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Boolean.valueOf(oycVar.m()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        mm8 mm8Var = (mm8) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                mm8Var.c(oycVar.m());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            mm8Var.c(oycVar.m());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void m0(xew0 xew0Var) throws yew0 {
        int iM;
        if ((this.b & 7) != 2) {
            itt0.p();
            return;
        }
        do {
            xew0Var.add(b1());
            tdw0 tdw0Var = (tdw0) this.e;
            if (tdw0Var.d()) {
                return;
            } else {
                iM = tdw0Var.m();
            }
        } while (iM == this.b);
        this.d = iM;
    }

    public mg9 n() throws xnx, vnx {
        W(2);
        return ((oyc) this.e).o();
    }

    public void n0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof oew0;
        int i = this.b;
        if (z) {
            oew0 oew0Var = (oew0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    oew0Var.zzh(tdw0Var.R());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                oew0Var.zzh(tdw0Var.R());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Integer.valueOf(tdw0Var.R()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Integer.valueOf(tdw0Var.R()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public og9 o() throws xnx, vnx {
        W(2);
        return ((oyc) this.e).n();
    }

    public void o0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof oew0;
        int i = this.b;
        if (z) {
            oew0 oew0Var = (oew0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    oew0Var.zzh(tdw0Var.T());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                oew0Var.zzh(tdw0Var.T());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Integer.valueOf(tdw0Var.T()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Integer.valueOf(tdw0Var.T()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void p(bmx bmxVar) throws xnx {
        int iC;
        oyc oycVar = (oyc) this.e;
        if ((this.b & 7) != 2) {
            throw box.b();
        }
        do {
            ((f5d0) bmxVar).add(n());
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void p0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof oew0;
        int i = this.b;
        if (z) {
            oew0 oew0Var = (oew0) xew0Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iR = tdw0Var.R();
                z0(iR);
                int iE = tdw0Var.e() + iR;
                do {
                    oew0Var.zzh(tdw0Var.V());
                } while (tdw0Var.e() < iE);
                return;
            }
            if (i2 != 5) {
                itt0.p();
                return;
            }
            do {
                oew0Var.zzh(tdw0Var.V());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iR2 = tdw0Var.R();
                z0(iR2);
                int iE2 = tdw0Var.e() + iR2;
                do {
                    xew0Var.add(Integer.valueOf(tdw0Var.V()));
                } while (tdw0Var.e() < iE2);
                return;
            }
            if (i3 != 5) {
                itt0.p();
                return;
            }
            do {
                xew0Var.add(Integer.valueOf(tdw0Var.V()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void q(List list) throws vnx {
        int iC;
        oyc oycVar = (oyc) this.e;
        if ((this.b & 7) != 2) {
            throw ynx.d();
        }
        do {
            list.add(o());
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void q0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof dfw0;
        int i = this.b;
        if (z) {
            dfw0 dfw0Var = (dfw0) xew0Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iR = tdw0Var.R();
                A0(iR);
                int iE = tdw0Var.e() + iR;
                do {
                    dfw0Var.f(tdw0Var.X());
                } while (tdw0Var.e() < iE);
                return;
            }
            do {
                dfw0Var.f(tdw0Var.X());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iR2 = tdw0Var.R();
                A0(iR2);
                int iE2 = tdw0Var.e() + iR2;
                do {
                    xew0Var.add(Long.valueOf(tdw0Var.X()));
                } while (tdw0Var.e() < iE2);
                return;
            }
            do {
                xew0Var.add(Long.valueOf(tdw0Var.X()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void r(bmx bmxVar) throws box {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((f5d0) bmxVar).add(Double.valueOf(oycVar.p()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.D();
        if ((iD & 7) != 0) {
            throw new box("Failed to parse the message.");
        }
        int iD2 = oycVar.d() + iD;
        do {
            ((f5d0) bmxVar).add(Double.valueOf(oycVar.p()));
        } while (oycVar.d() < iD2);
    }

    public void r0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof oew0;
        int i = this.b;
        if (z) {
            oew0 oew0Var = (oew0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    oew0Var.zzh(tdw0Var.Z());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                oew0Var.zzh(tdw0Var.Z());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Integer.valueOf(tdw0Var.Z()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Integer.valueOf(tdw0Var.Z()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void s(List list) throws ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof gbl;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(oycVar.p()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.D();
            d0(iD);
            int iD2 = oycVar.d() + iD;
            do {
                list.add(Double.valueOf(oycVar.p()));
            } while (oycVar.d() < iD2);
            return;
        }
        gbl gblVar = (gbl) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                gblVar.c(oycVar.p());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD3 = oycVar.D();
        d0(iD3);
        int iD4 = oycVar.d() + iD3;
        do {
            gblVar.c(oycVar.p());
        } while (oycVar.d() < iD4);
    }

    public void s0(xew0 xew0Var) throws zew0 {
        int iM;
        int iM2;
        tdw0 tdw0Var = (tdw0) this.e;
        boolean z = xew0Var instanceof dfw0;
        int i = this.b;
        if (z) {
            dfw0 dfw0Var = (dfw0) xew0Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    itt0.p();
                    return;
                }
                int iE = tdw0Var.e() + tdw0Var.R();
                do {
                    dfw0Var.f(tdw0Var.a0());
                } while (tdw0Var.e() < iE);
                y0(iE);
                return;
            }
            do {
                dfw0Var.f(tdw0Var.a0());
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM2 = tdw0Var.m();
                }
            } while (iM2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    itt0.p();
                    return;
                }
                int iE2 = tdw0Var.e() + tdw0Var.R();
                do {
                    xew0Var.add(Long.valueOf(tdw0Var.a0()));
                } while (tdw0Var.e() < iE2);
                y0(iE2);
                return;
            }
            do {
                xew0Var.add(Long.valueOf(tdw0Var.a0()));
                if (tdw0Var.d()) {
                    return;
                } else {
                    iM = tdw0Var.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.d = iM2;
    }

    public void t(bmx bmxVar) throws box, ynx {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((f5d0) bmxVar).add(Integer.valueOf(oycVar.q()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.d() + oycVar.D();
        do {
            ((f5d0) bmxVar).add(Integer.valueOf(oycVar.q()));
        } while (oycVar.d() < iD);
        V(iD);
    }

    public void t0(ifw0 ifw0Var, mpt0 mpt0Var, bew0 bew0Var) {
        int i;
        int i2;
        u0(2);
        tdw0 tdw0Var = (tdw0) this.e;
        int iA = tdw0Var.a(tdw0Var.R());
        Object obj = mpt0Var.d;
        Object objX0 = "";
        Object objX1 = obj;
        while (true) {
            try {
                int iF0 = F0();
                if (iF0 == Integer.MAX_VALUE || tdw0Var.d()) {
                    break;
                }
                boolean zU = false;
                if (iF0 == 1) {
                    objX0 = x0((ugw0) mpt0Var.b, null, null);
                } else if (iF0 != 2) {
                    try {
                        if (!((tdw0Var.d() || (i2 = this.b) == this.c) ? false : tdw0Var.u(i2))) {
                            throw new zew0("Unable to parse map entry.");
                        }
                    } catch (yew0 e) {
                        if (!tdw0Var.d() && (i = this.b) != this.c) {
                            zU = tdw0Var.u(i);
                        }
                        if (!zU) {
                            throw new zew0("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objX1 = x0((ugw0) mpt0Var.c, obj.getClass(), bew0Var);
                }
            } catch (Throwable th) {
                tdw0Var.b(iA);
                throw th;
            }
        }
        ifw0Var.put(objX0, objX1);
        tdw0Var.b(iA);
    }

    public String toString() {
        switch (this.f13663a) {
            case 5:
                return "";
            case 6:
            default:
                return super.toString();
            case 7:
                int i = this.b;
                a9q0 a9q0Var = (a9q0) this.e;
                xsf0 xsf0VarJ = pzw.J(a9q0Var, i);
                int i2 = this.c;
                xsf0 xsf0VarJ2 = pzw.J(a9q0Var, i2);
                int i3 = this.d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(xsf0VarJ);
                sb.append(Separators.COMMA);
                sb.append(i2);
                sb.append("-");
                sb.append(xsf0VarJ2);
                sb.append("), prevOffset=");
                return rz4.j(i3, Separators.RPAREN, sb);
        }
    }

    public void u(List list) throws box, ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof tjx;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(oycVar.q()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.d() + oycVar.D();
            do {
                list.add(Integer.valueOf(oycVar.q()));
            } while (oycVar.d() < iD);
            V(iD);
            return;
        }
        tjx tjxVar = (tjx) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                tjxVar.c(oycVar.q());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD2 = oycVar.d() + oycVar.D();
        do {
            tjxVar.c(oycVar.q());
        } while (oycVar.d() < iD2);
        V(iD2);
    }

    public void u0(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        itt0.p();
    }

    public Object v(fov0 fov0Var, Class cls, tso tsoVar) throws box, vnx {
        oyc oycVar = (oyc) this.e;
        switch (fov0Var.ordinal()) {
            case 0:
                W(1);
                return Double.valueOf(oycVar.p());
            case 1:
                W(5);
                return Float.valueOf(oycVar.t());
            case 2:
                W(0);
                return Long.valueOf(oycVar.v());
            case 3:
                W(0);
                return Long.valueOf(oycVar.E());
            case 4:
                W(0);
                return Integer.valueOf(oycVar.u());
            case 5:
                W(1);
                return Long.valueOf(oycVar.s());
            case 6:
                W(5);
                return Integer.valueOf(oycVar.r());
            case 7:
                W(0);
                return Boolean.valueOf(oycVar.m());
            case 8:
                W(2);
                return oycVar.B();
            case 9:
            default:
                jf4.o("unsupported field type.");
                return null;
            case 10:
                W(2);
                q2h0 q2h0VarA = c5d0.c.a(cls);
                mjt mjtVarD = q2h0VarA.d();
                k(mjtVarD, q2h0VarA, tsoVar);
                q2h0VarA.b(mjtVarD);
                return mjtVarD;
            case 11:
                return n();
            case 12:
                W(0);
                return Integer.valueOf(oycVar.D());
            case 13:
                W(0);
                return Integer.valueOf(oycVar.q());
            case 14:
                W(5);
                return Integer.valueOf(oycVar.w());
            case 15:
                W(1);
                return Long.valueOf(oycVar.x());
            case 16:
                W(0);
                return Integer.valueOf(oycVar.y());
            case 17:
                W(0);
                return Long.valueOf(oycVar.z());
        }
    }

    public void v0(Object obj, egw0 egw0Var, bew0 bew0Var) throws zew0 {
        tdw0 tdw0Var = (tdw0) this.e;
        int iR = tdw0Var.R();
        if (tdw0Var.f33791a + tdw0Var.b >= 100) {
            itt0.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iA = tdw0Var.a(iR);
        tdw0Var.f33791a++;
        egw0Var.e(obj, this, bew0Var);
        tdw0Var.r(0);
        tdw0Var.f33791a--;
        tdw0Var.b(iA);
    }

    public void w(bmx bmxVar) throws box {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iD = oycVar.D();
            if ((iD & 3) != 0) {
                throw new box("Failed to parse the message.");
            }
            int iD2 = oycVar.d() + iD;
            do {
                ((f5d0) bmxVar).add(Integer.valueOf(oycVar.r()));
            } while (oycVar.d() < iD2);
            return;
        }
        if (i != 5) {
            throw box.b();
        }
        do {
            ((f5d0) bmxVar).add(Integer.valueOf(oycVar.r()));
            if (oycVar.e()) {
                return;
            } else {
                iC = oycVar.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public void w0(Object obj, egw0 egw0Var, bew0 bew0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            egw0Var.e(obj, this, bew0Var);
            if (this.b != this.c) {
                throw new zew0("Failed to parse the message.");
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public void x(List list) throws ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof tjx;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iD = oycVar.D();
                c0(iD);
                int iD2 = oycVar.d() + iD;
                do {
                    list.add(Integer.valueOf(oycVar.r()));
                } while (oycVar.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw ynx.d();
            }
            do {
                list.add(Integer.valueOf(oycVar.r()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        tjx tjxVar = (tjx) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iD3 = oycVar.D();
            c0(iD3);
            int iD4 = oycVar.d() + iD3;
            do {
                tjxVar.c(oycVar.r());
            } while (oycVar.d() < iD4);
            return;
        }
        if (i3 != 5) {
            throw ynx.d();
        }
        do {
            tjxVar.c(oycVar.r());
            if (oycVar.e()) {
                return;
            } else {
                iC2 = oycVar.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public Object x0(ugw0 ugw0Var, Class cls, bew0 bew0Var) throws zew0 {
        tdw0 tdw0Var = (tdw0) this.e;
        ugw0 ugw0Var2 = ugw0.c;
        switch (ugw0Var.ordinal()) {
            case 0:
                u0(1);
                return Double.valueOf(tdw0Var.v());
            case 1:
                u0(5);
                return Float.valueOf(tdw0Var.y());
            case 2:
                u0(0);
                return Long.valueOf(tdw0Var.D());
            case 3:
                u0(0);
                return Long.valueOf(tdw0Var.B());
            case 4:
                u0(0);
                return Integer.valueOf(tdw0Var.E());
            case 5:
                u0(1);
                return Long.valueOf(tdw0Var.G());
            case 6:
                u0(5);
                return Integer.valueOf(tdw0Var.H());
            case 7:
                u0(0);
                return Boolean.valueOf(tdw0Var.J());
            case 8:
                u0(2);
                return tdw0Var.M();
            case 9:
            default:
                jf4.o("unsupported field type.");
                return null;
            case 10:
                u0(2);
                egw0 egw0VarA = agw0.c.a(cls);
                mew0 mew0VarZza = egw0VarA.zza();
                v0(mew0VarZza, egw0VarA, bew0Var);
                egw0VarA.h(mew0VarZza);
                return mew0VarZza;
            case 11:
                return b1();
            case 12:
                u0(0);
                return Integer.valueOf(tdw0Var.R());
            case 13:
                u0(0);
                return Integer.valueOf(tdw0Var.T());
            case 14:
                u0(5);
                return Integer.valueOf(tdw0Var.V());
            case 15:
                u0(1);
                return Long.valueOf(tdw0Var.X());
            case 16:
                u0(0);
                return Integer.valueOf(tdw0Var.Z());
            case 17:
                u0(0);
                return Long.valueOf(tdw0Var.a0());
        }
    }

    public void y(bmx bmxVar) throws box {
        int iC;
        oyc oycVar = (oyc) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((f5d0) bmxVar).add(Long.valueOf(oycVar.s()));
                if (oycVar.e()) {
                    return;
                } else {
                    iC = oycVar.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw box.b();
        }
        int iD = oycVar.D();
        if ((iD & 7) != 0) {
            throw new box("Failed to parse the message.");
        }
        int iD2 = oycVar.d() + iD;
        do {
            ((f5d0) bmxVar).add(Long.valueOf(oycVar.s()));
        } while (oycVar.d() < iD2);
    }

    public void y0(int i) throws zew0 {
        if (((tdw0) this.e).e() == i) {
            return;
        }
        itt0.x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public void z(List list) throws ynx {
        int iC;
        int iC2;
        oyc oycVar = (oyc) this.e;
        boolean z = list instanceof x610;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(oycVar.s()));
                    if (oycVar.e()) {
                        return;
                    } else {
                        iC = oycVar.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw ynx.d();
            }
            int iD = oycVar.D();
            d0(iD);
            int iD2 = oycVar.d() + iD;
            do {
                list.add(Long.valueOf(oycVar.s()));
            } while (oycVar.d() < iD2);
            return;
        }
        x610 x610Var = (x610) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                x610Var.c(oycVar.s());
                if (oycVar.e()) {
                    return;
                } else {
                    iC2 = oycVar.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw ynx.d();
        }
        int iD3 = oycVar.D();
        d0(iD3);
        int iD4 = oycVar.d() + iD3;
        do {
            x610Var.c(oycVar.s());
        } while (oycVar.d() < iD4);
    }

    public /* synthetic */ hu5(Object obj, byte b) {
        this.f13663a = b;
        this.e = obj;
    }

    public hu5(tdw0 tdw0Var) {
        this.f13663a = (byte) 9;
        this.d = 0;
        this.e = tdw0Var;
        tdw0Var.c = this;
    }

    public /* synthetic */ hu5(byte b) {
        this.f13663a = b;
    }

    public hu5(oyc oycVar, byte b) {
        this.f13663a = (byte) 3;
        this.d = 0;
        Charset charset = fmx.f9806a;
        this.e = oycVar;
        oycVar.b = this;
    }

    public hu5(oyc oycVar) {
        this.f13663a = (byte) 2;
        this.d = 0;
        cmx.a(oycVar, "input");
        this.e = oycVar;
        oycVar.b = this;
    }

    public hu5(tdw0 tdw0Var, byte b) {
        this.f13663a = (byte) 10;
        this.d = 0;
        byte[] bArr = lkw0.f20222a;
        if (tdw0Var != null) {
            this.e = tdw0Var;
            tdw0Var.c = this;
        } else {
            hny.u("input");
            throw null;
        }
    }

    public hu5(int i, int i2, int i3, a9q0 a9q0Var) {
        this.f13663a = (byte) 7;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = a9q0Var;
    }
}
