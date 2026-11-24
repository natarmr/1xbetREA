package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s3u0 extends yjj implements r3u0 {
    public wsy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3u0(vjj vjjVar, g93 g93Var, g950 g950Var, wsy wsyVar, gmk0 gmk0Var) {
        super(vjjVar, g93Var, g950Var, gmk0Var);
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
        this.f = wsyVar;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public c8z F() {
        return null;
    }

    @Override // a.kp9
    public boolean P() {
        return false;
    }

    public List W() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(9);
        throw null;
    }

    public wsy getReturnType() {
        wsy type = getType();
        if (type != null) {
            return type;
        }
        k0(10);
        throw null;
    }

    @Override // a.p4, a.vde0, a.b3u0
    public final wsy getType() {
        wsy wsyVar = this.f;
        if (wsyVar != null) {
            return wsyVar;
        }
        k0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(8);
        throw null;
    }

    @Override // a.kp9
    public final List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(6);
        throw null;
    }
}
