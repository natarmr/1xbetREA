package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class llc extends jlc {
    public final gm40 g;
    public final slc h;
    public final dmc i;
    public cr30 j;
    public Set k;
    public flc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llc(vjj vjjVar, g950 g950Var, gm40 gm40Var, slc slcVar, List list, eu00 eu00Var) {
        super(eu00Var, vjjVar, g950Var, gmk0.x0);
        if (vjjVar == null) {
            s0(0);
            throw null;
        }
        if (g950Var == null) {
            s0(1);
            throw null;
        }
        if (list == null) {
            s0(4);
            throw null;
        }
        if (eu00Var == null) {
            s0(6);
            throw null;
        }
        this.g = gm40Var;
        this.h = slcVar;
        this.i = new dmc(this, Collections.EMPTY_LIST, list, eu00Var);
    }

    public static /* synthetic */ void s0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.wm40
    public final Collection g() {
        Set set = this.k;
        if (set != null) {
            return set;
        }
        s0(11);
        throw null;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return ujn.c;
    }

    @Override // a.foc
    public final iys0 h() {
        dmc dmcVar = this.i;
        if (dmcVar != null) {
            return dmcVar;
        }
        s0(10);
        throw null;
    }

    @Override // a.goc
    public final boolean i() {
        return false;
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        cr30 cr30Var = this.j;
        if (cr30Var != null) {
            return cr30Var;
        }
        s0(13);
        throw null;
    }

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        gm40 gm40Var = this.g;
        if (gm40Var != null) {
            return gm40Var;
        }
        s0(16);
        throw null;
    }

    @Override // a.wm40
    public final flc m0() {
        return this.l;
    }

    @Override // a.wm40
    public final slc r() {
        slc slcVar = this.h;
        if (slcVar != null) {
            return slcVar;
        }
        s0(15);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    public final void u0(cr30 cr30Var, Set set, flc flcVar) {
        if (set == null) {
            s0(8);
            throw null;
        }
        this.j = cr30Var;
        this.k = set;
        this.l = flcVar;
    }
}
