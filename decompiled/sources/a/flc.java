package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class flc extends oer implements x4e {
    public final boolean f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flc(wm40 wm40Var, x4e x4eVar, g93 g93Var, boolean z, int i, gmk0 gmk0Var) {
        super(i, g93Var, wm40Var, x4eVar, lxk0.e, gmk0Var);
        if (wm40Var == null) {
            k0(0);
            throw null;
        }
        if (g93Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (gmk0Var == null) {
            k0(3);
            throw null;
        }
        this.f1 = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.yjj, a.vjj
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public final wm40 j() {
        wm40 wm40Var = (wm40) super.j();
        if (wm40Var != null) {
            return wm40Var;
        }
        k0(17);
        throw null;
    }

    @Override // a.yjj
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public final flc o1() {
        flc flcVar = (flc) super.o1();
        if (flcVar != null) {
            return flcVar;
        }
        k0(19);
        throw null;
    }

    public final void C1(List list, tek tekVar) {
        if (list == null) {
            k0(13);
            throw null;
        }
        if (tekVar != null) {
            D1(list, tekVar, j().M());
        } else {
            k0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void D1(List list, tek tekVar, List list2) {
        c8z c8zVarF0;
        List listP;
        if (list == null) {
            k0(10);
            throw null;
        }
        if (tekVar == null) {
            k0(11);
            throw null;
        }
        if (list2 == null) {
            k0(12);
            throw null;
        }
        wm40 wm40VarJ = j();
        if (wm40VarJ.i()) {
            vjj vjjVarJ = wm40VarJ.j();
            if (vjjVarJ instanceof wm40) {
                c8zVarF0 = ((wm40) vjjVarJ).f0();
            } else {
                c8zVarF0 = null;
            }
        } else {
            c8zVarF0 = null;
        }
        wm40 wm40VarJ2 = j();
        if (wm40VarJ2.p().isEmpty()) {
            listP = Collections.EMPTY_LIST;
            if (listP == null) {
                k0(16);
                throw null;
            }
        } else {
            listP = wm40VarJ2.p();
            if (listP == null) {
                k0(15);
                throw null;
            }
        }
        t1(null, c8zVarF0, listP, list2, list, null, gm40.b, tekVar);
    }

    @Override // a.oer, a.wen0
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public final flc f(xzs0 xzs0Var) {
        if (xzs0Var != null) {
            return (flc) super.f(xzs0Var);
        }
        k0(20);
        throw null;
    }

    @Override // a.oer, a.mp9
    public final void d0(Collection collection) {
        if (collection != null) {
            return;
        }
        k0(22);
        throw null;
    }

    @Override // a.oer, a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.p(this, obj);
    }

    @Override // a.oer, a.mp9, a.kp9
    public final Collection k() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        k0(21);
        throw null;
    }

    @Override // a.mp9
    public final mp9 s(vjj vjjVar, gm40 gm40Var, tek tekVar) {
        return (flc) p1(vjjVar, gm40Var, tekVar);
    }

    @Override // a.oer
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public flc q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        if (vjjVar == null) {
            k0(23);
            throw null;
        }
        if (i == 0) {
            k0(24);
            throw null;
        }
        if (g93Var == null) {
            k0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new flc((wm40) vjjVar, this, g93Var, this.f1, 1, gmk0Var);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(vjjVar);
        String strC = h97.C(i);
        sb.append("\nkind: ");
        sb.append(strC);
        throw new IllegalStateException(sb.toString());
    }

    public final wm40 z1() {
        wm40 wm40VarJ = j();
        if (wm40VarJ != null) {
            return wm40VarJ;
        }
        k0(18);
        throw null;
    }
}
