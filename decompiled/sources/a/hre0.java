package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hre0 implements pgy {
    public hre0() {
        maz.a(wez.f39042a, new lce0(this, (byte) 9));
    }

    public abstract dre0 c();

    public final boolean equals(Object obj) {
        if (!(obj instanceof hre0)) {
            return false;
        }
        hre0 hre0Var = (hre0) obj;
        return Intrinsics.d(c(), hre0Var.c()) && j() == hre0Var.j();
    }

    public boolean f() {
        return false;
    }

    public String getName() {
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(j()) + (c().hashCode() * 31);
    }

    public int j() {
        return 0;
    }

    public aiy n() {
        return aiy.d;
    }

    public abstract kiy p();

    public boolean q() {
        return false;
    }

    public final String toString() {
        String strX;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = n().ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter " + getName());
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            sb.append("parameter #" + j() + ' ' + getName());
        }
        sb.append(" of ");
        dre0 dre0VarC = c();
        if (dre0VarC instanceof iiy) {
            iiy iiyVar = (iiy) dre0VarC;
            StringBuilder sb2 = new StringBuilder();
            rv00.k(sb2, iiyVar);
            sb2.append(iiyVar instanceof uhy ? "var " : "val ");
            rv00.m(sb2, iiyVar);
            rv00.l(iiyVar.getName(), sb2);
            sb2.append(": ");
            sb2.append(rv00.z(iiyVar.getReturnType(), false));
            strX = sb2.toString();
        } else {
            if (!(dre0VarC instanceof jhy)) {
                udk.e(dre0VarC, "Illegal callable: ");
                return null;
            }
            strX = rv00.x((jhy) dre0VarC);
        }
        sb.append(strX);
        return sb.toString();
    }

    public boolean u() {
        return false;
    }
}
