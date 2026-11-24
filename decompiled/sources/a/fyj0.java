package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class fyj0 extends oer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyj0(vjj vjjVar, fyj0 fyj0Var, g93 g93Var, g950 g950Var, int i, gmk0 gmk0Var) {
        super(i, g93Var, vjjVar, fyj0Var, g950Var, gmk0Var);
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
        if (i == 0) {
            k0(3);
            throw null;
        }
        if (gmk0Var != null) {
        } else {
            k0(4);
            throw null;
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = Payload.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static fyj0 z1(vjj vjjVar, g950 g950Var, int i, gmk0 gmk0Var) {
        f93 f93Var = ujn.c;
        if (g950Var == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (gmk0Var != null) {
            return new fyj0(vjjVar, null, f93Var, g950Var, i, gmk0Var);
        }
        k0(9);
        throw null;
    }

    @Override // a.yjj
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final fyj0 o1() {
        fyj0 fyj0Var = (fyj0) super.o1();
        if (fyj0Var != null) {
            return fyj0Var;
        }
        k0(24);
        throw null;
    }

    @Override // a.oer
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public final fyj0 t1(c8z c8zVar, c8z c8zVar2, List list, List list2, List list3, wsy wsyVar, gm40 gm40Var, tek tekVar) {
        if (list == null) {
            k0(14);
            throw null;
        }
        if (list2 == null) {
            k0(15);
            throw null;
        }
        if (list3 == null) {
            k0(16);
            throw null;
        }
        if (tekVar != null) {
            return C1(c8zVar, c8zVar2, list, list2, list3, wsyVar, gm40Var, tekVar, null);
        }
        k0(17);
        throw null;
    }

    public fyj0 C1(c8z c8zVar, c8z c8zVar2, List list, List list2, List list3, wsy wsyVar, gm40 gm40Var, tek tekVar, Map map) {
        if (list == null) {
            k0(19);
            throw null;
        }
        if (list2 == null) {
            k0(20);
            throw null;
        }
        if (list3 == null) {
            k0(21);
            throw null;
        }
        if (tekVar == null) {
            k0(22);
            throw null;
        }
        super.t1(c8zVar, c8zVar2, list, list2, list3, wsyVar, gm40Var, tekVar);
        if (map != null && !map.isEmpty()) {
            this.Z = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // a.oer, a.mer
    public ler g0() {
        return u1(xzs0.b);
    }

    @Override // a.oer
    public oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        if (vjjVar == null) {
            k0(25);
            throw null;
        }
        if (i == 0) {
            k0(26);
            throw null;
        }
        if (g93Var == null) {
            k0(27);
            throw null;
        }
        fyj0 fyj0Var = (fyj0) merVar;
        if (g950Var == null) {
            g950Var = getName();
        }
        return new fyj0(vjjVar, fyj0Var, g93Var, g950Var, i, gmk0Var);
    }

    @Override // a.mp9
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public fyj0 s(vjj vjjVar, gm40 gm40Var, tek tekVar) {
        return (fyj0) p1(vjjVar, gm40Var, tekVar);
    }
}
