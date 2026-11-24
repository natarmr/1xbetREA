package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2o f7005a = f2o.c(c2o.l, new String[0]);
    public static final a2o b = f2o.c(c2o.i, new String[0]);
    public static final d0t0 c = new d0t0("NO_EXPECTED_TYPE");
    public static final d0t0 d = new d0t0("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case 38:
            case 40:
            default:
                objArr[0] = Payload.TYPE;
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "getAllSupertypes";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "isNullableType";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "acceptsNullable";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "hasNullableSuperType";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[2] = "getClassDescriptor";
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(wsy wsyVar) {
        if (wsyVar == null) {
            a(28);
            throw null;
        }
        if (wsyVar.U()) {
            return true;
        }
        return (wsyVar.j0() instanceof kkq) && b(((kkq) wsyVar.j0()).c);
    }

    public static boolean c(wsy wsyVar, Function1 function1, nbk0 nbk0Var) {
        if (wsyVar == null) {
            return false;
        }
        tft0 tft0VarJ0 = wsyVar.j0();
        if (m(wsyVar)) {
            return ((Boolean) function1.invoke(tft0VarJ0)).booleanValue();
        }
        if (nbk0Var != null && nbk0Var.contains(wsyVar)) {
            return false;
        }
        if (((Boolean) function1.invoke(tft0VarJ0)).booleanValue()) {
            return true;
        }
        if (nbk0Var == null) {
            nbk0Var = new nbk0();
        }
        nbk0Var.add(wsyVar);
        kkq kkqVar = tft0VarJ0 instanceof kkq ? (kkq) tft0VarJ0 : null;
        if (kkqVar != null && (c(kkqVar.b, function1, nbk0Var) || c(kkqVar.c, function1, nbk0Var))) {
            return true;
        }
        if ((tft0VarJ0 instanceof szj) && c(((szj) tft0VarJ0).b, function1, nbk0Var)) {
            return true;
        }
        iys0 iys0VarS = wsyVar.S();
        if (iys0VarS instanceof xmx) {
            Iterator it = ((xmx) iys0VarS).b.iterator();
            while (it.hasNext()) {
                if (c((wsy) it.next(), function1, nbk0Var)) {
                    return true;
                }
            }
            return false;
        }
        for (pzs0 pzs0Var : wsyVar.J()) {
            if (!pzs0Var.c() && c(pzs0Var.b(), function1, nbk0Var)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new q4m0(((hzs0) it.next()).I()));
        }
        List listL0 = CollectionsKt.L0(arrayList);
        if (listL0 != null) {
            return listL0;
        }
        a(17);
        throw null;
    }

    public static boolean e(wsy wsyVar) throws wzs0 {
        if (wsyVar == null) {
            a(27);
            throw null;
        }
        if (!wsyVar.U() && (!(wsyVar.j0() instanceof kkq) || !e(((kkq) wsyVar.j0()).c))) {
            if (!(wsyVar.j0() instanceof szj)) {
                if (f(wsyVar)) {
                    if (!(wsyVar.S().n() instanceof wm40)) {
                        xzs0 xzs0VarD = xzs0.d(wsyVar);
                        Collection<wsy> collectionB = wsyVar.S().b();
                        ArrayList arrayList = new ArrayList(collectionB.size());
                        for (wsy wsyVar2 : collectionB) {
                            if (wsyVar2 == null) {
                                a(21);
                                throw null;
                            }
                            wsy wsyVarH = xzs0VarD.h(wsyVar2, t3u0.c);
                            wsy wsyVarI = wsyVarH != null ? i(wsyVarH, wsyVar.U()) : null;
                            if (wsyVarI != null) {
                                arrayList.add(wsyVarI);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((wsy) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                iys0 iys0VarS = wsyVar.S();
                if (iys0VarS instanceof xmx) {
                    Iterator it2 = ((xmx) iys0VarS).b.iterator();
                    while (it2.hasNext()) {
                        if (e((wsy) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(wsy wsyVar) {
        if (wsyVar == null) {
            a(60);
            throw null;
        }
        if ((wsyVar.S().n() instanceof hzs0 ? (hzs0) wsyVar.S().n() : null) != null) {
            return true;
        }
        wsyVar.S();
        return false;
    }

    public static tft0 g(wsy wsyVar) {
        if (wsyVar != null) {
            return h(wsyVar, true);
        }
        a(1);
        throw null;
    }

    public static tft0 h(wsy wsyVar, boolean z) {
        if (wsyVar == null) {
            a(3);
            throw null;
        }
        tft0 tft0VarK0 = wsyVar.j0().k0(z);
        if (tft0VarK0 != null) {
            return tft0VarK0;
        }
        a(4);
        throw null;
    }

    public static wsy i(wsy wsyVar, boolean z) {
        if (wsyVar != null) {
            return z ? h(wsyVar, true) : wsyVar;
        }
        a(8);
        throw null;
    }

    public static kzj0 j(kzj0 kzj0Var, boolean z) {
        if (kzj0Var == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return kzj0Var;
        }
        kzj0 kzj0VarN0 = kzj0Var.k0(true);
        if (kzj0VarN0 != null) {
            return kzj0VarN0;
        }
        a(6);
        throw null;
    }

    public static q4m0 k(hzs0 hzs0Var) {
        if (hzs0Var != null) {
            return new q4m0(hzs0Var);
        }
        a(45);
        throw null;
    }

    public static pzs0 l(hzs0 hzs0Var, fay fayVar) {
        if (hzs0Var != null) {
            return fayVar.f9231a == b0t0.f1776a ? new q4m0(d9x.U(hzs0Var)) : new q4m0(hzs0Var);
        }
        a(46);
        throw null;
    }

    public static boolean m(wsy wsyVar) {
        if (wsyVar != null) {
            return wsyVar == c || wsyVar == d;
        }
        a(0);
        throw null;
    }
}
