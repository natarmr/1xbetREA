package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0d0 extends yjj implements mer {
    public boolean f;
    public final boolean g;
    public final gm40 h;
    public final d0d0 i;
    public final boolean j;
    public final int k;
    public tek l;
    public mer m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0d0(gm40 gm40Var, tek tekVar, d0d0 d0d0Var, g93 g93Var, g950 g950Var, boolean z, boolean z2, boolean z3, int i, gmk0 gmk0Var) {
        super(d0d0Var.j(), g93Var, g950Var, gmk0Var);
        if (gm40Var == null) {
            k0(0);
            throw null;
        }
        if (tekVar == null) {
            k0(1);
            throw null;
        }
        if (d0d0Var == null) {
            k0(2);
            throw null;
        }
        if (g93Var == null) {
            k0(3);
            throw null;
        }
        if (gmk0Var == null) {
            k0(5);
            throw null;
        }
        this.m = null;
        this.h = gm40Var;
        this.l = tekVar;
        this.i = d0d0Var;
        this.f = z;
        this.g = z2;
        this.j = z3;
        this.k = i;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // a.kp9
    public final c8z C() {
        return p1().C();
    }

    @Override // a.kp9
    public final c8z F() {
        return p1().F();
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.kp9
    public final boolean P() {
        return false;
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.mer
    public final mer T() {
        return this.m;
    }

    @Override // a.kp9
    public final List W() {
        List listW = p1().W();
        if (listW != null) {
            return listW;
        }
        k0(14);
        throw null;
    }

    @Override // a.mer
    public final boolean b0() {
        return false;
    }

    @Override // a.mp9
    public final void d0(Collection collection) {
        if (collection != null) {
            return;
        }
        k0(16);
        throw null;
    }

    @Override // a.mer
    public final boolean e0() {
        return false;
    }

    @Override // a.mer, a.wen0
    public final mer f(xzs0 xzs0Var) {
        if (xzs0Var != null) {
            return this;
        }
        k0(7);
        throw null;
    }

    @Override // a.kp9
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(9);
        throw null;
    }

    @Override // a.akj, a.sq30
    public final tek getVisibility() {
        tek tekVar = this.l;
        if (tekVar != null) {
            return tekVar;
        }
        k0(11);
        throw null;
    }

    @Override // a.sq30
    public final boolean isExternal() {
        return this.g;
    }

    @Override // a.mer
    public final boolean isInfix() {
        return false;
    }

    @Override // a.mer
    public final boolean isInline() {
        return this.j;
    }

    @Override // a.mer
    public final boolean isOperator() {
        return false;
    }

    @Override // a.mer
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.mp9
    public final int l() {
        int i = this.k;
        if (i != 0) {
            return i;
        }
        k0(6);
        throw null;
    }

    @Override // a.sq30
    public final gm40 m() {
        gm40 gm40Var = this.h;
        if (gm40Var != null) {
            return gm40Var;
        }
        k0(10);
        throw null;
    }

    public final d0d0 p1() {
        d0d0 d0d0Var = this.i;
        if (d0d0Var != null) {
            return d0d0Var;
        }
        k0(13);
        throw null;
    }

    public final ArrayList q1(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (d0d0 d0d0Var : p1().k()) {
            mer merVarD = z ? d0d0Var.d() : d0d0Var.e();
            if (merVarD != null) {
                arrayList.add(merVarD);
            }
        }
        return arrayList;
    }

    @Override // a.mp9
    public final mp9 s(vjj vjjVar, gm40 gm40Var, tek tekVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // a.kp9
    public final Object u(ifk ifkVar) {
        return null;
    }

    @Override // a.mer
    public final boolean w() {
        return false;
    }

    @Override // a.wen0
    public final /* bridge */ /* synthetic */ xjj f(xzs0 xzs0Var) {
        f(xzs0Var);
        return this;
    }
}
