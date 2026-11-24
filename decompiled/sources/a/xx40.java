package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xx40 extends jlc {
    public final slc g;
    public gm40 h;
    public tek i;
    public dmc j;
    public ArrayList k;
    public final ArrayList l;
    public final eu00 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx40(nun nunVar, g950 g950Var, eu00 eu00Var) {
        super(eu00Var, nunVar, g950Var, gmk0.x0);
        slc slcVar = slc.b;
        if (g950Var == null) {
            s0(2);
            throw null;
        }
        if (eu00Var == null) {
            s0(4);
            throw null;
        }
        this.l = new ArrayList();
        this.m = eu00Var;
        this.g = slcVar;
    }

    public static /* synthetic */ void s0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.wm40, a.goc
    public final List M() {
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            return arrayList;
        }
        s0(15);
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

    @Override // a.wm40
    public final Collection g() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        s0(13);
        throw null;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return ujn.c;
    }

    @Override // a.wm40, a.sq30
    public final tek getVisibility() {
        tek tekVar = this.i;
        if (tekVar != null) {
            return tekVar;
        }
        s0(10);
        throw null;
    }

    @Override // a.foc
    public final iys0 h() {
        dmc dmcVar = this.j;
        if (dmcVar != null) {
            return dmcVar;
        }
        s0(11);
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

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        gm40 gm40Var = this.h;
        if (gm40Var != null) {
            return gm40Var;
        }
        s0(7);
        throw null;
    }

    @Override // a.wm40
    public final flc m0() {
        return null;
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
    public final slc r() {
        slc slcVar = this.g;
        if (slcVar != null) {
            return slcVar;
        }
        s0(8);
        throw null;
    }

    @Override // a.wm40
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        return wjj.n1(this);
    }
}
