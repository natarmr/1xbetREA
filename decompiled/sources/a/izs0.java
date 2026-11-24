package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class izs0 extends t5 {
    public final ArrayList l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izs0(int i, g93 g93Var, vjj vjjVar, eu00 eu00Var, g950 g950Var, t3u0 t3u0Var, boolean z) {
        super(i, g93Var, vjjVar, eu00Var, g950Var, t3u0Var, z);
        if (vjjVar == null) {
            k0(19);
            throw null;
        }
        if (g93Var == null) {
            k0(20);
            throw null;
        }
        if (t3u0Var == null) {
            k0(21);
            throw null;
        }
        if (g950Var == null) {
            k0(22);
            throw null;
        }
        if (eu00Var == null) {
            k0(25);
            throw null;
        }
        this.l = new ArrayList(1);
        this.m = false;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = Payload.SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = "bound";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = Payload.TYPE;
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "<init>";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static izs0 r1(int i, g93 g93Var, vjj vjjVar, eu00 eu00Var, g950 g950Var, t3u0 t3u0Var, boolean z) {
        if (vjjVar == null) {
            k0(6);
            throw null;
        }
        if (g93Var == null) {
            k0(7);
            throw null;
        }
        if (t3u0Var == null) {
            k0(8);
            throw null;
        }
        if (g950Var == null) {
            k0(9);
            throw null;
        }
        if (eu00Var != null) {
            return new izs0(i, g93Var, vjjVar, eu00Var, g950Var, t3u0Var, z);
        }
        k0(11);
        throw null;
    }

    public static izs0 s1(h1 h1Var, t3u0 t3u0Var, g950 g950Var, int i, eu00 eu00Var) {
        f93 f93Var = ujn.c;
        if (eu00Var == null) {
            k0(4);
            throw null;
        }
        izs0 izs0VarR1 = r1(i, f93Var, h1Var, eu00Var, g950Var, t3u0Var, false);
        int i2 = rek.f30339a;
        ym40 ym40VarC = oek.c(h1Var);
        ym40VarC.getClass();
        kzj0 kzj0VarN = ym40VarC.c().n();
        if (izs0VarR1.m) {
            jf4.n("Type parameter descriptor is already initialized: ".concat(izs0VarR1.t1()));
            return null;
        }
        if (!bdx.k0(kzj0VarN)) {
            izs0VarR1.l.add(kzj0VarN);
        }
        if (izs0VarR1.m) {
            jf4.n("Type parameter descriptor is already initialized: ".concat(izs0VarR1.t1()));
            return null;
        }
        izs0VarR1.m = true;
        return izs0VarR1;
    }

    @Override // a.t5
    public final List q1() {
        if (!this.m) {
            jf4.n("Type parameter descriptor is not initialized: ".concat(t1()));
            return null;
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            return arrayList;
        }
        k0(28);
        throw null;
    }

    public final String t1() {
        return getName() + " declared in " + oek.f(j());
    }
}
