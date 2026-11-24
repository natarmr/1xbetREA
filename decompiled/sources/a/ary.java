package a;

import android.javax.sip.message.Response;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ary {
    public static final g950 e = g950.i("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zm40 f1366a;
    public final cu00 b;
    public final zt00 c;
    public final eu00 d;

    public ary(eu00 eu00Var) {
        this.d = eu00Var;
        eu00Var.b(new yqy(this, (byte) 0));
        byte b = 1;
        this.b = new cu00(eu00Var, new yqy(this, b));
        this.c = eu00Var.c(new c93(this, b));
    }

    public static boolean A(vjj vjjVar) {
        if (vjjVar != null) {
            return oek.i(vjjVar, ed9.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(wsy wsyVar, twq twqVar) {
        if (wsyVar == null) {
            a(97);
            throw null;
        }
        if (twqVar != null) {
            return J(wsyVar.S(), twqVar);
        }
        a(98);
        throw null;
    }

    public static boolean C(wsy wsyVar, twq twqVar) {
        if (twqVar != null) {
            return B(wsyVar, twqVar) && !wsyVar.U();
        }
        a(135);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(yjj yjjVar) {
        if (yjjVar.o1().getAnnotations().z0(i4m0.m)) {
            return true;
        }
        if (!(yjjVar instanceof d0d0)) {
            return false;
        }
        d0d0 d0d0Var = (d0d0) yjjVar;
        boolean zE = d0d0Var.E();
        g0d0 g0d0VarD = d0d0Var.d();
        n0d0 n0d0VarE = d0d0Var.e();
        if (g0d0VarD == null || !D(g0d0VarD)) {
            return false;
        }
        if (zE) {
            return n0d0VarE != null && D(n0d0VarE);
        }
        return true;
    }

    public static boolean E(wsy wsyVar, twq twqVar) {
        if (wsyVar == null) {
            a(105);
            throw null;
        }
        if (twqVar != null) {
            return !wsyVar.U() && B(wsyVar, twqVar);
        }
        a(106);
        throw null;
    }

    public static boolean F(wsy wsyVar) {
        if (wsyVar != null) {
            return B(wsyVar, i4m0.b) && !e0t0.e(wsyVar);
        }
        a(136);
        throw null;
    }

    public static boolean G(wsy wsyVar) {
        foc focVarN = wsyVar.S().n();
        return (focVarN == null || s(focVarN) == null) ? false : true;
    }

    public static boolean H(wsy wsyVar) {
        if (wsyVar == null) {
            a(94);
            throw null;
        }
        if (wsyVar.U()) {
            return false;
        }
        foc focVarN = wsyVar.S().n();
        return (focVarN instanceof wm40) && u((wm40) focVarN) != null;
    }

    public static boolean I(wsy wsyVar) {
        return E(wsyVar, i4m0.f);
    }

    public static boolean J(iys0 iys0Var, twq twqVar) {
        if (iys0Var == null) {
            a(101);
            throw null;
        }
        if (twqVar != null) {
            foc focVarN = iys0Var.n();
            return (focVarN instanceof wm40) && b((wm40) focVarN, twqVar);
        }
        a(102);
        throw null;
    }

    public static boolean K(vjj vjjVar) {
        while (vjjVar != null) {
            if (vjjVar instanceof mg80) {
                swq swqVar = ((ng80) ((mg80) vjjVar)).f;
                g950 g950Var = j4m0.k;
                swqVar.getClass();
                g950Var.getClass();
                return swqVar.f32934a.h(g950Var);
            }
            vjjVar = vjjVar.j();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case Response.TRYING /* 100 */:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = Payload.TYPE;
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            objArr[1] = "getKProperty0";
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            objArr[1] = "getKProperty1";
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            objArr[1] = "getKProperty2";
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case Response.TRYING /* 100 */:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(wm40 wm40Var, twq twqVar) {
        if (wm40Var == null) {
            a(103);
            throw null;
        }
        if (twqVar != null) {
            return wm40Var.getName().equals(twqVar.g()) && twqVar.equals(oek.f(wm40Var));
        }
        a(104);
        throw null;
    }

    public static iwb0 s(foc focVar) {
        if (i4m0.e0.contains(focVar.getName())) {
            return (iwb0) i4m0.g0.get(oek.f(focVar));
        }
        return null;
    }

    public static iwb0 u(wm40 wm40Var) {
        if (i4m0.d0.contains(wm40Var.getName())) {
            return (iwb0) i4m0.f0.get(oek.f(wm40Var));
        }
        return null;
    }

    public static boolean y(wsy wsyVar) {
        if (wsyVar != null) {
            return B(wsyVar, i4m0.f14153a);
        }
        a(139);
        throw null;
    }

    public static boolean z(wsy wsyVar) {
        if (wsyVar != null) {
            return B(wsyVar, i4m0.g);
        }
        a(88);
        throw null;
    }

    public final void c() {
        zm40 zm40Var;
        eu00 eu00Var;
        ed9 ed9Var;
        g950 g950Var = e;
        g950Var.getClass();
        eu00 eu00Var2 = this.d;
        zm40 zm40Var2 = new zm40(g950Var, eu00Var2, this, 48);
        this.f1366a = zm40Var2;
        cd9.f4150a.getClass();
        cd9 cd9Var = (cd9) bd9.b.getValue();
        zm40 zm40Var3 = this.f1366a;
        Iterable iterableM = m();
        qv90 qv90VarQ = q();
        fx fxVarD = d();
        dd9 dd9Var = (dd9) cd9Var;
        dd9Var.getClass();
        zm40Var3.getClass();
        iterableM.getClass();
        qv90VarQ.getClass();
        fxVarD.getClass();
        Set<swq> set = j4m0.r;
        li8 li8Var = new li8(1, dd9Var.b, gd9.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, (byte) 17);
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (swq swqVar : set) {
            zc9.m.getClass();
            InputStream inputStream = (InputStream) li8Var.invoke(zc9.a(swqVar));
            if (inputStream != null) {
                Pair pairP = h8x.P(inputStream);
                n3d0 n3d0Var = (n3d0) pairP.f46059a;
                ad9 ad9Var = (ad9) pairP.b;
                if (n3d0Var == null) {
                    throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ad9.f + ", actual " + ad9Var + ". Please update Kotlin");
                }
                zm40Var = zm40Var3;
                eu00Var = eu00Var2;
                ed9Var = new ed9(swqVar, eu00Var, zm40Var, n3d0Var, ad9Var);
            } else {
                zm40Var = zm40Var3;
                eu00Var = eu00Var2;
                ed9Var = null;
            }
            if (ed9Var != null) {
                arrayList.add(ed9Var);
            }
            eu00Var2 = eu00Var;
            zm40Var3 = zm40Var;
        }
        zm40 zm40Var4 = zm40Var3;
        eu00 eu00Var3 = eu00Var2;
        og80 og80Var = new og80(arrayList);
        n660 n660Var = new n660(eu00Var3, zm40Var4);
        cad cadVar = new cad((Object) og80Var, (byte) 14);
        zc9 zc9Var = zc9.m;
        f6i f6iVar = new f6i(eu00Var3, zm40Var4, cadVar, new chf0(zm40Var4, n660Var, zc9Var), og80Var, iterableM, n660Var, fxVarD, qv90VarQ, zc9Var.f44156a, null, new zie0(eu00Var3, iun.f15405a), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ed9) it.next()).q1(f6iVar);
        }
        zm40Var2.i = og80Var;
        zm40 zm40Var5 = this.f1366a;
        zm40Var5.getClass();
        List listG0 = tx3.g0(new zm40[]{zm40Var5});
        listG0.getClass();
        xun xunVar = xun.f41520a;
        xunVar.getClass();
        zm40Var5.h = new yuu(listG0, xunVar, iun.f15405a, xunVar);
    }

    public fx d() {
        return rv00.b;
    }

    public final kzj0 e() {
        kzj0 kzj0VarI = k("Any").I();
        if (kzj0VarI != null) {
            return kzj0VarI;
        }
        a(51);
        throw null;
    }

    public final wsy f(wsy wsyVar) {
        if (wsyVar == null) {
            a(68);
            throw null;
        }
        wsy wsyVarG = g(wsyVar);
        if (wsyVarG != null) {
            return wsyVarG;
        }
        e9d0.v(wsyVar, "not array: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final wsy g(wsy wsyVar) {
        qlc qlcVarF;
        qlc qlcVar;
        wm40 wm40VarV;
        kzj0 kzj0VarI;
        if (wsyVar == null) {
            a(70);
            throw null;
        }
        if (!z(wsyVar)) {
            tft0 tft0VarH = e0t0.h(wsyVar, false);
            wsy wsyVar2 = (wsy) ((zqy) this.b.invoke()).b.get(tft0VarH);
            if (wsyVar2 != null) {
                return wsyVar2;
            }
            int i = oek.f25126a;
            foc focVarN = tft0VarH.S().n();
            ym40 ym40VarD = focVarN == null ? null : oek.d(focVarN);
            if (ym40VarD != null) {
                foc focVarN2 = tft0VarH.S().n();
                if (focVarN2 == null) {
                    kzj0VarI = null;
                } else {
                    Set set = nft0.f23454a;
                    g950 name = focVarN2.getName();
                    name.getClass();
                    if (!nft0.d.contains(name) || (qlcVarF = rek.f(focVarN2)) == null || (qlcVar = (qlc) nft0.b.get(qlcVarF)) == null || (wm40VarV = obb.V(ym40VarD, qlcVar)) == null) {
                        kzj0VarI = null;
                    } else {
                        kzj0VarI = wm40VarV.I();
                    }
                }
                if (kzj0VarI != null) {
                    return kzj0VarI;
                }
            }
        } else if (wsyVar.J().size() == 1) {
            return ((pzs0) wsyVar.J().get(0)).b();
        }
        return null;
    }

    public final kzj0 h(wsy wsyVar) {
        t3u0 t3u0Var = t3u0.c;
        if (wsyVar != null) {
            return i(t3u0Var, wsyVar, ujn.c);
        }
        a(83);
        throw null;
    }

    public final kzj0 i(t3u0 t3u0Var, wsy wsyVar, g93 g93Var) {
        if (wsyVar != null) {
            return ucx.f0(gnm0.u(g93Var), k("Array"), Collections.singletonList(new q4m0(wsyVar, t3u0Var)));
        }
        a(79);
        throw null;
    }

    public final wm40 j(swq swqVar) {
        if (swqVar == null) {
            a(12);
            throw null;
        }
        zm40 zm40VarL = l();
        ux50 ux50Var = ux50.f36425a;
        wm40 wm40VarE0 = feb.e0(zm40VarL, swqVar);
        if (wm40VarE0 != null) {
            return wm40VarE0;
        }
        a(13);
        throw null;
    }

    public final wm40 k(String str) {
        if (str != null) {
            return (wm40) this.c.invoke(g950.e(str));
        }
        a(14);
        throw null;
    }

    public final zm40 l() {
        this.f1366a.getClass();
        zm40 zm40Var = this.f1366a;
        if (zm40Var != null) {
            return zm40Var;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new xc9(this.d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final kzj0 n() {
        kzj0 kzj0VarP = p();
        if (kzj0VarP != null) {
            return kzj0VarP;
        }
        a(53);
        throw null;
    }

    public final kzj0 o() {
        kzj0 kzj0VarI = k("Nothing").I();
        if (kzj0VarI != null) {
            return kzj0VarI;
        }
        a(49);
        throw null;
    }

    public final kzj0 p() {
        kzj0 kzj0VarN0 = e().k0(true);
        if (kzj0VarN0 != null) {
            return kzj0VarN0;
        }
        a(52);
        throw null;
    }

    public qv90 q() {
        return lwf.y;
    }

    public final kzj0 r(iwb0 iwb0Var) {
        if (iwb0Var == null) {
            a(73);
            throw null;
        }
        kzj0 kzj0Var = (kzj0) ((zqy) this.b.invoke()).f44829a.get(iwb0Var);
        if (kzj0Var != null) {
            return kzj0Var;
        }
        a(74);
        throw null;
    }

    public final kzj0 t(iwb0 iwb0Var) {
        if (iwb0Var == null) {
            a(54);
            throw null;
        }
        kzj0 kzj0VarI = k(iwb0Var.f15481a.b()).I();
        if (kzj0VarI != null) {
            return kzj0VarI;
        }
        a(55);
        throw null;
    }

    public final kzj0 v() {
        kzj0 kzj0VarI = k("String").I();
        if (kzj0VarI != null) {
            return kzj0VarI;
        }
        a(66);
        throw null;
    }

    public final wm40 w(int i) {
        return j(j4m0.f.a(g950.e(ver.d.b + i)));
    }

    public final kzj0 x() {
        kzj0 kzj0VarI = k("Unit").I();
        if (kzj0VarI != null) {
            return kzj0VarI;
        }
        a(65);
        throw null;
    }
}
