package a;

import android.gov.nist.core.Separators;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g0d0 extends b0d0 {
    public wsy n;
    public final g0d0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0d0(d0d0 d0d0Var, g93 g93Var, gm40 gm40Var, tek tekVar, boolean z, boolean z2, boolean z3, int i, g0d0 g0d0Var, gmk0 gmk0Var) {
        super(gm40Var, tekVar, d0d0Var, g93Var, g950.i("<get-" + d0d0Var.getName() + Separators.GREATER_THAN), z, z2, z3, i, gmk0Var);
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
        this.o = g0d0Var != null ? g0d0Var : this;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.kp9
    public final wsy getReturnType() {
        return this.n;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.s(this, obj);
    }

    @Override // a.mp9, a.kp9
    public final Collection k() {
        return q1(true);
    }

    @Override // a.yjj
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public final g0d0 o1() {
        g0d0 g0d0Var = this.o;
        if (g0d0Var != null) {
            return g0d0Var;
        }
        k0(8);
        throw null;
    }

    public final void s1(wsy wsyVar) {
        if (wsyVar == null) {
            wsyVar = p1().getType();
        }
        this.n = wsyVar;
    }

    @Override // a.kp9
    public final List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k0(7);
        throw null;
    }
}
