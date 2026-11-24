package a;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c8z extends wjj implements go80 {
    public final /* synthetic */ byte d = 1;
    public final vjj e;
    public final vde0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8z(vjj vjjVar, p4 p4Var, g93 g93Var, g950 g950Var) {
        super(g93Var, g950Var);
        if (vjjVar == null) {
            k0(3);
            throw null;
        }
        if (g93Var == null) {
            k0(5);
            throw null;
        }
        if (g950Var == null) {
            k0(6);
            throw null;
        }
        this.e = vjjVar;
        this.f = p4Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void o1(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // a.kp9
    public final c8z F() {
        return null;
    }

    @Override // a.kp9
    public final boolean P() {
        return false;
    }

    @Override // a.xjj
    public final gmk0 b() {
        return gmk0.x0;
    }

    @Override // a.kp9
    public final wsy getReturnType() {
        return getType();
    }

    @Override // a.p4, a.vde0, a.b3u0
    public final wsy getType() {
        wsy type = p1().getType();
        if (type != null) {
            return type;
        }
        o1(6);
        throw null;
    }

    @Override // a.kp9
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o1(5);
        throw null;
    }

    @Override // a.akj, a.sq30
    public final tek getVisibility() {
        tek tekVar = uek.f;
        if (tekVar != null) {
            return tekVar;
        }
        o1(9);
        throw null;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.m(this, obj);
    }

    @Override // a.vjj
    public final vjj j() {
        byte b = this.d;
        vjj vjjVar = this.e;
        switch (b) {
            case 0:
                return (wm40) vjjVar;
            default:
                if (vjjVar != null) {
                    return vjjVar;
                }
                k0(8);
                throw null;
        }
    }

    @Override // a.kp9
    public final Collection k() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        o1(8);
        throw null;
    }

    public final vde0 p1() {
        byte b = this.d;
        vde0 vde0Var = this.f;
        switch (b) {
            case 0:
                return (k4x) vde0Var;
            default:
                p4 p4Var = (p4) vde0Var;
                if (p4Var != null) {
                    return p4Var;
                }
                k0(7);
                throw null;
        }
    }

    @Override // a.wen0
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public final c8z f(xzs0 xzs0Var) {
        if (xzs0Var == null) {
            o1(3);
            throw null;
        }
        if (!xzs0Var.f41769a.e()) {
            wsy wsyVarH = j() instanceof wm40 ? xzs0Var.h(getType(), t3u0.e) : xzs0Var.h(getType(), t3u0.c);
            if (wsyVarH == null) {
                return null;
            }
            if (wsyVarH != getType()) {
                return new c8z(j(), new rls0(wsyVarH), getAnnotations());
            }
        }
        return this;
    }

    @Override // a.wjj, a.p4
    public String toString() {
        switch (this.d) {
            case 0:
                return "class " + ((wm40) this.e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // a.kp9
    public final List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        o1(7);
        throw null;
    }

    @Override // a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final vjj o1() {
        return this;
    }

    @Override // a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final kp9 o1() {
        return this;
    }

    public c8z(wm40 wm40Var) {
        super(ujn.c, lxk0.d);
        this.e = wm40Var;
        this.f = new k4x(wm40Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c8z(vjj vjjVar, p4 p4Var, g93 g93Var) {
        this(vjjVar, p4Var, g93Var, lxk0.d);
        if (vjjVar == null) {
            k0(0);
            throw null;
        }
        if (g93Var != null) {
        } else {
            k0(2);
            throw null;
        }
    }
}
