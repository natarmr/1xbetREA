package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class f0d0 extends s3u0 implements d0d0 {
    public tqp A;
    public final boolean g;
    public bu00 h;
    public Function0 i;
    public final gm40 j;
    public tek k;
    public Collection l;
    public final d0d0 m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public List t;
    public c8z u;
    public c8z v;
    public ArrayList w;
    public g0d0 x;
    public n0d0 y;
    public tqp z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0d0(vjj vjjVar, d0d0 d0d0Var, g93 g93Var, gm40 gm40Var, tek tekVar, boolean z, g950 g950Var, int i, gmk0 gmk0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(vjjVar, g93Var, g950Var, null, gmk0Var);
        if (vjjVar == null) {
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
        if (g950Var == null) {
            k0(4);
            throw null;
        }
        if (i == 0) {
            k0(5);
            throw null;
        }
        if (gmk0Var == null) {
            k0(6);
            throw null;
        }
        this.g = z;
        this.l = null;
        this.t = Collections.EMPTY_LIST;
        this.j = gm40Var;
        this.k = tekVar;
        this.m = d0d0Var == null ? this : d0d0Var;
        this.n = i;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = Payload.SOURCE;
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "originalSubstitutor";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[0] = "copyConfiguration";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[0] = "substitutor";
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    objArr[1] = "getVisibility";
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "substitute";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "doSubstitute";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static f0d0 q1(vjj vjjVar, gm40 gm40Var, tek tekVar, boolean z, g950 g950Var, int i, gmk0 gmk0Var) {
        f93 f93Var = ujn.c;
        if (vjjVar == null) {
            k0(7);
            throw null;
        }
        if (tekVar == null) {
            k0(10);
            throw null;
        }
        if (g950Var == null) {
            k0(11);
            throw null;
        }
        if (i == 0) {
            k0(12);
            throw null;
        }
        if (gmk0Var != null) {
            return new f0d0(vjjVar, null, f93Var, gm40Var, tekVar, z, g950Var, i, gmk0Var, false, false, false, false, false);
        }
        k0(13);
        throw null;
    }

    public static mer s1(xzs0 xzs0Var, b0d0 b0d0Var) {
        if (b0d0Var == null) {
            k0(31);
            throw null;
        }
        mer merVar = b0d0Var.m;
        if (merVar != null) {
            return merVar.f(xzs0Var);
        }
        return null;
    }

    @Override // a.kp9
    public final c8z C() {
        return this.u;
    }

    @Override // a.r3u0
    public final boolean E() {
        return this.g;
    }

    @Override // a.s3u0, a.kp9
    public final c8z F() {
        return this.v;
    }

    @Override // a.d0d0
    public final tqp G() {
        return this.A;
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.r3u0
    public boolean N() {
        return this.p;
    }

    @Override // a.sq30
    public final boolean Q() {
        return this.q;
    }

    @Override // a.r3u0
    public final r2e R() {
        bu00 bu00Var = this.h;
        if (bu00Var != null) {
            return (r2e) bu00Var.invoke();
        }
        return null;
    }

    @Override // a.d0d0
    public final tqp V() {
        return this.z;
    }

    @Override // a.s3u0, a.kp9
    public final List W() {
        List list = this.t;
        if (list != null) {
            return list;
        }
        k0(22);
        throw null;
    }

    @Override // a.r3u0
    public final boolean X() {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.d0d0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // a.yjj
    /* JADX INFO: renamed from: a */
    public final d0d0 o1() {
        d0d0 d0d0Var = this.m;
        ?? O1 = this;
        if (d0d0Var != this) {
            O1 = d0d0Var.o1();
        }
        if (O1 != 0) {
            return O1;
        }
        k0(38);
        throw null;
    }

    @Override // a.d0d0
    public final g0d0 d() {
        return this.x;
    }

    @Override // a.mp9
    public final void d0(Collection collection) {
        if (collection != null) {
            this.l = collection;
        } else {
            k0(40);
            throw null;
        }
    }

    @Override // a.d0d0
    public final n0d0 e() {
        return this.y;
    }

    @Override // a.wen0
    public final d0d0 f(xzs0 xzs0Var) {
        if (xzs0Var == null) {
            k0(27);
            throw null;
        }
        vzs0 vzs0Var = xzs0Var.f41769a;
        if (vzs0Var.e()) {
            return this;
        }
        e0d0 e0d0Var = new e0d0(this);
        e0d0Var.f = vzs0Var;
        e0d0Var.d = o1();
        return e0d0Var.a();
    }

    @Override // a.s3u0, a.kp9
    public final wsy getReturnType() {
        wsy type = getType();
        if (type != null) {
            return type;
        }
        k0(23);
        throw null;
    }

    @Override // a.s3u0, a.kp9
    public final List getTypeParameters() {
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            return arrayList;
        }
        e9d0.v(this, "typeParameters == null for ");
        return null;
    }

    @Override // a.akj, a.sq30
    public final tek getVisibility() {
        tek tekVar = this.k;
        if (tekVar != null) {
            return tekVar;
        }
        k0(25);
        throw null;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.f(this, obj);
    }

    @Override // a.sq30
    public boolean isExternal() {
        return this.r;
    }

    @Override // a.kp9
    public final Collection k() {
        Collection collection = this.l;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        k0(41);
        throw null;
    }

    @Override // a.mp9
    public final int l() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        k0(39);
        throw null;
    }

    @Override // a.sq30
    public final gm40 m() {
        gm40 gm40Var = this.j;
        if (gm40Var != null) {
            return gm40Var;
        }
        k0(24);
        throw null;
    }

    @Override // a.d0d0
    public final ArrayList o() {
        ArrayList arrayList = new ArrayList(2);
        g0d0 g0d0Var = this.x;
        if (g0d0Var != null) {
            arrayList.add(g0d0Var);
        }
        n0d0 n0d0Var = this.y;
        if (n0d0Var != null) {
            arrayList.add(n0d0Var);
        }
        return arrayList;
    }

    @Override // a.mp9
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public final f0d0 s(vjj vjjVar, gm40 gm40Var, tek tekVar) {
        e0d0 e0d0Var = new e0d0(this);
        e0d0Var.f6984a = vjjVar;
        e0d0Var.d = null;
        e0d0Var.b = gm40Var;
        if (tekVar != null) {
            e0d0Var.c = tekVar;
            e0d0Var.e = 2;
            e0d0Var.g = false;
            f0d0 f0d0VarA = e0d0Var.a();
            if (f0d0VarA != null) {
                return f0d0VarA;
            }
            k0(42);
            throw null;
        }
        Object[] objArr = new Object[3];
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = Payload.TYPE;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public f0d0 r1(vjj vjjVar, gm40 gm40Var, tek tekVar, d0d0 d0d0Var, int i, g950 g950Var) {
        if (vjjVar == null) {
            k0(32);
            throw null;
        }
        if (gm40Var == null) {
            k0(33);
            throw null;
        }
        if (tekVar == null) {
            k0(34);
            throw null;
        }
        if (i == 0) {
            k0(35);
            throw null;
        }
        if (g950Var == null) {
            k0(36);
            throw null;
        }
        return new f0d0(vjjVar, d0d0Var, getAnnotations(), gm40Var, tekVar, this.g, g950Var, i, gmk0.x0, this.o, N(), this.q, isExternal(), this.s);
    }

    public final void t1(g0d0 g0d0Var, n0d0 n0d0Var, tqp tqpVar, tqp tqpVar2) {
        this.x = g0d0Var;
        this.y = n0d0Var;
        this.z = tqpVar;
        this.A = tqpVar2;
    }

    @Override // a.kp9
    public Object u(ifk ifkVar) {
        throw null;
    }

    public final void u1(bu00 bu00Var, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.i = function0;
        if (bu00Var == null) {
            bu00Var = (bu00) function0.invoke();
        }
        this.h = bu00Var;
    }

    @Override // a.d0d0
    public final boolean v() {
        return this.s;
    }

    public final void w1(wsy wsyVar, List list, c8z c8zVar, c8z c8zVar2, List list2) {
        if (wsyVar == null) {
            k0(17);
            throw null;
        }
        if (list == null) {
            k0(18);
            throw null;
        }
        if (list2 == null) {
            k0(19);
            throw null;
        }
        this.f = wsyVar;
        this.w = new ArrayList(list);
        this.v = c8zVar2;
        this.u = c8zVar;
        this.t = list2;
    }

    public void v1(wsy wsyVar) {
    }
}
