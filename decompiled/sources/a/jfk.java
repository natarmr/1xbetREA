package a;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jfk {
    public static final Set b = cui0.b(bry.CLASS);
    public static final Set c = tx3.l0(new bry[]{bry.FILE_FACADE, bry.MULTIFILE_CLASS_PART});
    public static final vd40 d;
    public static final vd40 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f6i f16431a;

    static {
        new vd40(new int[]{1, 1, 2}, false);
        d = new vd40(new int[]{1, 1, 11}, false);
        e = new vd40(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final qfk a(mg80 mg80Var, jre0 jre0Var) {
        String[] strArr;
        Pair pairI;
        jre0Var.getClass();
        cry cryVar = jre0Var.b;
        String[] strArr2 = (String[]) cryVar.e;
        if (strArr2 == null) {
            strArr2 = (String[]) cryVar.f;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!c.contains((bry) cryVar.c)) {
            strArr2 = null;
        }
        vd40 vd40Var = (vd40) cryVar.d;
        if (strArr2 != null && (strArr = (String[]) cryVar.g) != null) {
            try {
                try {
                    pairI = egy.i(strArr2, strArr);
                } catch (aox e2) {
                    throw new IllegalStateException("Could not read data from ".concat(jre0Var.a()), e2);
                }
            } catch (Throwable th) {
                ((lwf) c().c).getClass();
                vd40 vd40VarE = e();
                vd40VarE.getClass();
                vd40 vd40Var2 = vd40Var.f ? vd40.g : vd40.h;
                int i = vd40Var2.b;
                int i2 = vd40VarE.b;
                if (i > i2 || (i >= i2 && vd40Var2.c > vd40VarE.c)) {
                    vd40VarE = vd40Var2;
                }
                int i3 = vd40Var.c;
                int i4 = vd40Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = vd40VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > vd40VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                pairI = null;
            }
            if (pairI != null) {
                ify ifyVar = (ify) pairI.f46059a;
                m3d0 m3d0Var = (m3d0) pairI.b;
                d(jre0Var);
                kfy kfyVar = new kfy(jre0Var, m3d0Var, ifyVar, f(jre0Var), b(jre0Var));
                return new qfk(mg80Var, m3d0Var, ifyVar, vd40Var, kfyVar, c(), "scope for " + kfyVar + " in " + mg80Var, t55.j);
            }
        }
        return null;
    }

    public final gfk b(jre0 jre0Var) {
        ((lwf) c().c).getClass();
        int i = jre0Var.b.b;
        return ((i & 16) == 0 || (i & 32) != 0) ? gfk.f11210a : gfk.b;
    }

    public final f6i c() {
        f6i f6iVar = this.f16431a;
        if (f6iVar != null) {
            return f6iVar;
        }
        Intrinsics.h("components");
        throw null;
    }

    public final t4x d(jre0 jre0Var) {
        ((lwf) c().c).getClass();
        cry cryVar = jre0Var.b;
        vd40 vd40Var = (vd40) cryVar.d;
        vd40 vd40Var2 = (vd40) cryVar.d;
        vd40 vd40VarE = e();
        vd40VarE.getClass();
        vd40 vd40Var3 = vd40Var2.f ? vd40.g : vd40.h;
        int i = vd40Var3.b;
        int i2 = vd40VarE.b;
        if (i > i2 || (i >= i2 && vd40Var3.c > vd40VarE.c)) {
            vd40VarE = vd40Var3;
        }
        int i3 = vd40Var2.c;
        int i4 = vd40Var2.b;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = vd40VarE.b;
            if (i4 > i5 || (i4 >= i5 && i3 > vd40VarE.c)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        vd40 vd40Var4 = vd40.g;
        vd40 vd40VarE2 = e();
        vd40 vd40VarE3 = e();
        boolean z2 = vd40Var.f;
        vd40VarE3.getClass();
        vd40 vd40Var5 = z2 ? vd40Var4 : vd40.h;
        int i6 = vd40Var5.b;
        int i7 = vd40VarE3.b;
        return new t4x(vd40Var, vd40Var4, vd40VarE2, (i6 <= i7 && (i6 < i7 || vd40Var5.c <= vd40VarE3.c)) ? vd40VarE3 : vd40Var5, jre0Var.a());
    }

    public final vd40 e() {
        ((lwf) c().c).getClass();
        return vd40.g;
    }

    public final boolean f(jre0 jre0Var) {
        ((lwf) c().c).getClass();
        ((lwf) c().c).getClass();
        cry cryVar = jre0Var.b;
        return (cryVar.b & 2) != 0 && ((vd40) cryVar.d).equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final glc g(jre0 jre0Var) {
        String[] strArr;
        Pair pairF;
        cry cryVar = jre0Var.b;
        String[] strArr2 = (String[]) cryVar.e;
        if (strArr2 == null) {
            strArr2 = (String[]) cryVar.f;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!b.contains((bry) cryVar.c)) {
            strArr2 = null;
        }
        vd40 vd40Var = (vd40) cryVar.d;
        if (strArr2 != null && (strArr = (String[]) cryVar.g) != null) {
            try {
                try {
                    pairF = egy.f(strArr2, strArr);
                } catch (aox e2) {
                    throw new IllegalStateException("Could not read data from ".concat(jre0Var.a()), e2);
                }
            } catch (Throwable th) {
                ((lwf) c().c).getClass();
                vd40 vd40VarE = e();
                vd40VarE.getClass();
                vd40 vd40Var2 = vd40Var.f ? vd40.g : vd40.h;
                int i = vd40Var2.b;
                int i2 = vd40VarE.b;
                if (i > i2 || (i >= i2 && vd40Var2.c > vd40VarE.c)) {
                    vd40VarE = vd40Var2;
                }
                int i3 = vd40Var.c;
                int i4 = vd40Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = vd40VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > vd40VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                pairF = null;
            }
            if (pairF != null) {
                ify ifyVar = (ify) pairF.f46059a;
                s2d0 s2d0Var = (s2d0) pairF.b;
                d(jre0Var);
                return new glc(ifyVar, s2d0Var, vd40Var, new ory(jre0Var, new wrb0(f(jre0Var)), b(jre0Var)));
            }
        }
        return null;
    }
}
