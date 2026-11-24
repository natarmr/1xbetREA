package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yjj extends wjj implements xjj {
    public final vjj d;
    public final gmk0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjj(vjj vjjVar, g93 g93Var, g950 g950Var, gmk0 gmk0Var) {
        super(g93Var, g950Var);
        if (vjjVar == null) {
            k0(0);
            throw null;
        }
        if (g93Var == null) {
            k0(1);
            throw null;
        }
        if (g950Var == null) {
            k0(2);
            throw null;
        }
        if (gmk0Var == null) {
            k0(3);
            throw null;
        }
        this.d = vjjVar;
        this.e = gmk0Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public gmk0 b() {
        gmk0 gmk0Var = this.e;
        if (gmk0Var != null) {
            return gmk0Var;
        }
        k0(6);
        throw null;
    }

    public vjj j() {
        vjj vjjVar = this.d;
        if (vjjVar != null) {
            return vjjVar;
        }
        k0(5);
        throw null;
    }

    @Override // a.wjj, a.vjj, a.kp9
    public xjj o1() {
        return this;
    }
}
