package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ner implements ler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vzs0 f23400a;
    public vjj b;
    public gm40 c;
    public tek d;
    public mer e;
    public int f;
    public List g;
    public final List h;
    public c8z i;
    public c8z j;
    public wsy k;
    public g950 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public List r;
    public g93 s;
    public boolean t;
    public final LinkedHashMap u;
    public Boolean v;
    public boolean w;
    public final /* synthetic */ oer x;

    public ner(oer oerVar, vzs0 vzs0Var, vjj vjjVar, gm40 gm40Var, tek tekVar, int i, List list, List list2, c8z c8zVar, wsy wsyVar) {
        if (vzs0Var == null) {
            c(0);
            throw null;
        }
        if (vjjVar == null) {
            c(1);
            throw null;
        }
        if (gm40Var == null) {
            c(2);
            throw null;
        }
        if (tekVar == null) {
            c(3);
            throw null;
        }
        if (i == 0) {
            c(4);
            throw null;
        }
        if (list == null) {
            c(5);
            throw null;
        }
        if (list2 == null) {
            c(6);
            throw null;
        }
        if (wsyVar == null) {
            c(7);
            throw null;
        }
        this.x = oerVar;
        this.e = null;
        this.j = oerVar.k;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = oerVar.t;
        this.r = null;
        this.s = null;
        this.t = oerVar.u;
        this.u = new LinkedHashMap();
        this.v = null;
        this.w = false;
        this.f23400a = vzs0Var;
        this.b = vjjVar;
        this.c = gm40Var;
        this.d = tekVar;
        this.f = i;
        this.g = list;
        this.h = list2;
        this.i = c8zVar;
        this.k = wsyVar;
        this.l = null;
    }

    public static /* synthetic */ void c(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 17:
                objArr[0] = "name";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = Payload.TYPE;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[1] = "setContextReceiverParameters";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[1] = "setOriginal";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[1] = "setSignatureChange";
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // a.ler
    public final ler a(List list) {
        if (list != null) {
            this.g = list;
            return this;
        }
        c(19);
        throw null;
    }

    @Override // a.ler
    public final ler b(c8z c8zVar) {
        this.j = c8zVar;
        return this;
    }

    @Override // a.ler
    public final mer build() {
        return this.x.r1(this);
    }

    @Override // a.ler
    public final ler d(int i) {
        if (i != 0) {
            this.f = i;
            return this;
        }
        c(14);
        throw null;
    }

    @Override // a.ler
    public final ler g() {
        this.t = true;
        return this;
    }

    @Override // a.ler
    public final ler h(vjj vjjVar) {
        this.b = vjjVar;
        return this;
    }

    @Override // a.ler
    public final ler i() {
        this.m = false;
        return this;
    }

    @Override // a.ler
    public final ler j() {
        this.q = true;
        return this;
    }

    @Override // a.ler
    public final ler k(tek tekVar) {
        if (tekVar != null) {
            this.d = tekVar;
            return this;
        }
        c(12);
        throw null;
    }

    @Override // a.ler
    public final ler l() {
        this.o = true;
        return this;
    }

    @Override // a.ler
    public final ler m() {
        this.u.put(u9y.i1, Boolean.TRUE);
        return this;
    }

    @Override // a.ler
    public final ler o(g93 g93Var) {
        if (g93Var != null) {
            this.s = g93Var;
            return this;
        }
        c(35);
        throw null;
    }

    @Override // a.ler
    public final ler p(iun iunVar) {
        if (iunVar != null) {
            this.r = iunVar;
            return this;
        }
        c(21);
        throw null;
    }

    @Override // a.ler
    public final ler q(g950 g950Var) {
        this.l = g950Var;
        return this;
    }

    @Override // a.ler
    public final ler r(gm40 gm40Var) {
        if (gm40Var != null) {
            this.c = gm40Var;
            return this;
        }
        c(10);
        throw null;
    }

    @Override // a.ler
    public final ler t(wsy wsyVar) {
        if (wsyVar != null) {
            this.k = wsyVar;
            return this;
        }
        c(23);
        throw null;
    }

    @Override // a.ler
    public final ler u() {
        this.n = true;
        return this;
    }
}
