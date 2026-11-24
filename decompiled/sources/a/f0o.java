package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f0o extends jlc {
    public final dmc g;
    public final e0o h;
    public final r660 i;
    public final g93 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0o(eu00 eu00Var, wm40 wm40Var, kzj0 kzj0Var, g950 g950Var, r660 r660Var, g93 g93Var, gmk0 gmk0Var) {
        super(eu00Var, wm40Var, g950Var, gmk0Var);
        if (eu00Var == null) {
            s0(6);
            throw null;
        }
        if (wm40Var == null) {
            s0(7);
            throw null;
        }
        if (kzj0Var == null) {
            s0(8);
            throw null;
        }
        if (r660Var == null) {
            s0(10);
            throw null;
        }
        this.j = g93Var;
        this.g = new dmc(this, Collections.EMPTY_LIST, Collections.singleton(kzj0Var), eu00Var);
        this.h = new e0o(this, eu00Var);
        this.i = r660Var;
    }

    public static /* synthetic */ void s0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static f0o u0(eu00 eu00Var, wm40 wm40Var, g950 g950Var, cu00 cu00Var, g93 g93Var, gmk0 gmk0Var) {
        if (eu00Var == null) {
            s0(0);
            throw null;
        }
        if (wm40Var == null) {
            s0(1);
            throw null;
        }
        if (cu00Var != null) {
            return new f0o(eu00Var, wm40Var, wm40Var.I(), g950Var, cu00Var, g93Var, gmk0Var);
        }
        s0(3);
        throw null;
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.wm40, a.goc
    public final List M() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(22);
        throw null;
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.wm40
    public final cr30 U() {
        return br30.b;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        g93 g93Var = this.j;
        if (g93Var != null) {
            return g93Var;
        }
        s0(21);
        throw null;
    }

    @Override // a.wm40, a.sq30
    public final tek getVisibility() {
        tek tekVar = uek.e;
        if (tekVar != null) {
            return tekVar;
        }
        s0(20);
        throw null;
    }

    @Override // a.foc
    public final iys0 h() {
        dmc dmcVar = this.g;
        if (dmcVar != null) {
            return dmcVar;
        }
        s0(17);
        throw null;
    }

    @Override // a.goc
    public final boolean i() {
        return false;
    }

    @Override // a.wm40
    public final boolean isInline() {
        return false;
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        e0o e0oVar = this.h;
        if (e0oVar != null) {
            return e0oVar;
        }
        s0(14);
        throw null;
    }

    @Override // a.wm40
    public final k2u0 n0() {
        return null;
    }

    @Override // a.wm40
    public final boolean o0() {
        return false;
    }

    @Override // a.wm40
    public final boolean p0() {
        return false;
    }

    @Override // a.wm40
    public final boolean q0() {
        return false;
    }

    @Override // a.wm40
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }
}
