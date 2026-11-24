package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wjj extends p4 implements vjj {
    public final g950 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjj(g93 g93Var, g950 g950Var) {
        super(g93Var);
        if (g93Var == null) {
            k0(0);
            throw null;
        }
        if (g950Var == null) {
            k0(1);
            throw null;
        }
        this.c = g950Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String n1(vjj vjjVar) {
        try {
            return iek.e.n(vjjVar) + "[" + vjjVar.getClass().getSimpleName() + Separators.AT + Integer.toHexString(System.identityHashCode(vjjVar)) + "]";
        } catch (Throwable unused) {
            return vjjVar.getClass().getSimpleName() + Separators.SP + vjjVar.getName();
        }
    }

    @Override // a.vjj
    public final g950 getName() {
        g950 g950Var = this.c;
        if (g950Var != null) {
            return g950Var;
        }
        k0(2);
        throw null;
    }

    @Override // a.p4
    public String toString() {
        return n1(this);
    }

    /* JADX INFO: renamed from: a */
    public vjj o1() {
        return this;
    }
}
