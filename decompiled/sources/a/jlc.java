package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jlc extends h1 {
    public final vjj e;
    public final gmk0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlc(eu00 eu00Var, vjj vjjVar, g950 g950Var, gmk0 gmk0Var) {
        super(eu00Var, g950Var);
        if (eu00Var == null) {
            s0(0);
            throw null;
        }
        if (vjjVar == null) {
            s0(1);
            throw null;
        }
        if (g950Var == null) {
            s0(2);
            throw null;
        }
        this.e = vjjVar;
        this.f = gmk0Var;
    }

    public static /* synthetic */ void s0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = Payload.SOURCE;
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.xjj
    public final gmk0 b() {
        gmk0 gmk0Var = this.f;
        if (gmk0Var != null) {
            return gmk0Var;
        }
        s0(5);
        throw null;
    }

    @Override // a.sq30
    public boolean isExternal() {
        return false;
    }

    @Override // a.vjj
    public final vjj j() {
        vjj vjjVar = this.e;
        if (vjjVar != null) {
            return vjjVar;
        }
        s0(4);
        throw null;
    }
}
