package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25126a = 0;

    static {
        new swq("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "subClass";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 33:
                objArr[0] = "superClass";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case 32:
            case 45:
            case 66:
                objArr[0] = Payload.TYPE;
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = CommonConstant.ReqAccessTokenParam.SCOPE_LABEL;
                break;
            case 87:
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "isSubclass";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(kp9 kp9Var, LinkedHashSet linkedHashSet) {
        if (kp9Var == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(kp9Var)) {
            return;
        }
        Iterator it = kp9Var.o1().k().iterator();
        while (it.hasNext()) {
            kp9 kp9VarO1 = ((kp9) it.next()).o1();
            b(kp9VarO1, linkedHashSet);
            linkedHashSet.add(kp9VarO1);
        }
    }

    public static ym40 c(vjj vjjVar) {
        if (vjjVar == null) {
            a(21);
            throw null;
        }
        ym40 ym40VarD = d(vjjVar);
        if (ym40VarD != null) {
            return ym40VarD;
        }
        a(22);
        throw null;
    }

    public static ym40 d(vjj vjjVar) {
        if (vjjVar == null) {
            a(23);
            throw null;
        }
        while (vjjVar != null) {
            if (vjjVar instanceof ym40) {
                return (ym40) vjjVar;
            }
            if (vjjVar instanceof gdz) {
                return ((gdz) vjjVar).d;
            }
            vjjVar = vjjVar.j();
        }
        return null;
    }

    public static jdk0 e(vjj vjjVar) {
        jdk0 jdk0Var = jdk0.b;
        if (vjjVar == null) {
            a(81);
            throw null;
        }
        if (vjjVar instanceof n0d0) {
            vjjVar = ((n0d0) vjjVar).p1();
        }
        if (vjjVar instanceof xjj) {
            ((xjj) vjjVar).b().getClass();
        }
        return jdk0Var;
    }

    public static twq f(vjj vjjVar) {
        if (vjjVar != null) {
            swq swqVarG = g(vjjVar);
            return swqVarG != null ? swqVarG.f32934a : h(vjjVar);
        }
        a(2);
        throw null;
    }

    public static swq g(vjj vjjVar) {
        if (vjjVar == null) {
            a(5);
            throw null;
        }
        if ((vjjVar instanceof ym40) || f2o.f(vjjVar)) {
            return swq.c;
        }
        if (vjjVar instanceof gdz) {
            return ((gdz) vjjVar).e;
        }
        if (vjjVar instanceof mg80) {
            return ((ng80) ((mg80) vjjVar)).f;
        }
        return null;
    }

    public static twq h(vjj vjjVar) {
        if (vjjVar != null) {
            return f(vjjVar.j()).a(vjjVar.getName());
        }
        a(6);
        throw null;
    }

    public static vjj i(vjj vjjVar, Class cls, boolean z) {
        if (vjjVar == null) {
            return null;
        }
        if (z) {
            vjjVar = vjjVar.j();
        }
        while (vjjVar != null) {
            if (cls.isInstance(vjjVar)) {
                return vjjVar;
            }
            vjjVar = vjjVar.j();
        }
        return null;
    }

    public static wm40 j(wm40 wm40Var) {
        if (wm40Var == null) {
            a(44);
            throw null;
        }
        for (wsy wsyVar : wm40Var.h().b()) {
            if (wsyVar == null) {
                a(45);
                throw null;
            }
            iys0 iys0VarS = wsyVar.S();
            if (iys0VarS == null) {
                a(46);
                throw null;
            }
            wm40 wm40Var2 = (wm40) iys0VarS.n();
            if (wm40Var2 == null) {
                a(47);
                throw null;
            }
            if (wm40Var2.r() != slc.b) {
                return wm40Var2;
            }
        }
        return null;
    }

    public static boolean k(vjj vjjVar) {
        return m(vjjVar, slc.f32392a) && vjjVar.getName().equals(lxk0.f20818a);
    }

    public static boolean l(vjj vjjVar) {
        return m(vjjVar, slc.f) && ((wm40) vjjVar).o0();
    }

    public static boolean m(vjj vjjVar, slc slcVar) {
        return (vjjVar instanceof wm40) && ((wm40) vjjVar).r() == slcVar;
    }

    public static boolean n(vjj vjjVar) {
        if (vjjVar == null) {
            a(1);
            throw null;
        }
        while (vjjVar != null) {
            if (k(vjjVar) || ((vjjVar instanceof akj) && ((akj) vjjVar).getVisibility() == uek.f)) {
                return true;
            }
            vjjVar = vjjVar.j();
        }
        return false;
    }

    public static boolean o(wsy wsyVar, vjj vjjVar) {
        if (wsyVar == null) {
            a(30);
            throw null;
        }
        if (vjjVar == null) {
            a(31);
            throw null;
        }
        foc focVarN = wsyVar.S().n();
        if (focVarN == null) {
            return false;
        }
        vjj vjjVarO1 = focVarN.o1();
        return (vjjVarO1 instanceof foc) && (vjjVar instanceof foc) && ((foc) vjjVar).h().equals(((foc) vjjVarO1).h());
    }

    public static boolean p(vjj vjjVar) {
        return (m(vjjVar, slc.f32392a) || m(vjjVar, slc.b)) && ((wm40) vjjVar).m() == gm40.c;
    }

    public static boolean q(wsy wsyVar, vjj vjjVar) {
        if (wsyVar == null) {
            a(32);
            throw null;
        }
        if (vjjVar == null) {
            a(33);
            throw null;
        }
        if (o(wsyVar, vjjVar)) {
            return true;
        }
        Iterator it = wsyVar.S().b().iterator();
        while (it.hasNext()) {
            if (q((wsy) it.next(), vjjVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(vjj vjjVar) {
        return vjjVar != null && (vjjVar.j() instanceof mg80);
    }

    public static mp9 s(mp9 mp9Var) {
        if (mp9Var == null) {
            a(58);
            throw null;
        }
        while (mp9Var.l() == 2) {
            Collection collectionK = mp9Var.k();
            if (collectionK.isEmpty()) {
                e9d0.v(mp9Var, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            mp9Var = (mp9) collectionK.iterator().next();
        }
        return mp9Var;
    }
}
