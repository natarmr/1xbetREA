package a;

import android.gov.nist.core.Separators;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n0d0 extends b0d0 {
    public k3u0 n;
    public final n0d0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0d0(d0d0 d0d0Var, g93 g93Var, gm40 gm40Var, tek tekVar, boolean z, boolean z2, boolean z3, int i, n0d0 n0d0Var, gmk0 gmk0Var) {
        super(gm40Var, tekVar, d0d0Var, g93Var, g950.i("<set-" + d0d0Var.getName() + Separators.GREATER_THAN), z, z2, z3, i, gmk0Var);
        if (d0d0Var == null) {
            k0(0);
            throw null;
        }
        if (g93Var == null) {
            k0(1);
            throw null;
        }
        if (gm40Var == null) {
            k0(2);
            throw null;
        }
        if (tekVar == null) {
            k0(3);
            throw null;
        }
        if (i == 0) {
            k0(4);
            throw null;
        }
        if (gmk0Var == null) {
            k0(5);
            throw null;
        }
        this.o = n0d0Var != null ? n0d0Var : this;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = Payload.TYPE;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static k3u0 r1(n0d0 n0d0Var, wsy wsyVar, g93 g93Var) {
        if (wsyVar == null) {
            k0(8);
            throw null;
        }
        if (g93Var != null) {
            return new k3u0(n0d0Var, null, 0, g93Var, lxk0.g, wsyVar, false, false, false, null, gmk0.x0);
        }
        k0(9);
        throw null;
    }

    @Override // a.kp9
    public final wsy getReturnType() {
        int i = rek.f30339a;
        ym40 ym40VarC = oek.c(this);
        ym40VarC.getClass();
        return ym40VarC.c().x();
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.t(this, obj);
    }

    @Override // a.mp9, a.kp9
    public final Collection k() {
        return q1(false);
    }

    @Override // a.yjj
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public final n0d0 o1() {
        n0d0 n0d0Var = this.o;
        if (n0d0Var != null) {
            return n0d0Var;
        }
        k0(13);
        throw null;
    }

    @Override // a.kp9
    public final List z() {
        k3u0 k3u0Var = this.n;
        if (k3u0Var == null) {
            v4i0.e();
            return null;
        }
        List listSingletonList = Collections.singletonList(k3u0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        k0(11);
        throw null;
    }
}
