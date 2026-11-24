package a;

import android.javax.sip.message.Response;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class sf80 {
    public static final List b = CollectionsKt.L0(ServiceLoader.load(uto.class, uto.class.getClassLoader()));
    public static final sf80 c;
    public static final fl70 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xsy f32105a;

    static {
        fl70 fl70Var = new fl70();
        d = fl70Var;
        c = new sf80(fl70Var);
    }

    public sf80(xsy xsyVar) {
        if (xsyVar != null) {
            this.f32105a = xsyVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
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
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 22:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case Response.TRYING /* 100 */:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case Response.TRYING /* 100 */:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    break;
                default:
                    switch (i) {
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
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

    public static boolean b(wsy wsyVar, wsy wsyVar2, gys0 gys0Var) {
        if (wsyVar == null) {
            a(44);
            throw null;
        }
        if (wsyVar2 == null) {
            a(45);
            throw null;
        }
        if (bdx.k0(wsyVar) && bdx.k0(wsyVar2)) {
            return true;
        }
        return m2a.l(gys0Var, wsyVar.j0(), wsyVar2.j0());
    }

    public static void c(mp9 mp9Var, LinkedHashSet linkedHashSet) {
        if (mp9Var == null) {
            a(17);
            throw null;
        }
        if (mp9Var.l() != 2) {
            linkedHashSet.add(mp9Var);
        } else {
            if (mp9Var.k().isEmpty()) {
                e9d0.v(mp9Var, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = mp9Var.k().iterator();
            while (it.hasNext()) {
                c((mp9) it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(kp9 kp9Var) {
        c8z c8zVarF = kp9Var.F();
        ArrayList arrayList = new ArrayList();
        if (c8zVarF != null) {
            arrayList.add(c8zVarF.getType());
        }
        Iterator it = kp9Var.z().iterator();
        while (it.hasNext()) {
            arrayList.add(((k3u0) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static void e(Collection collection, wm40 wm40Var, g8x g8xVar) {
        gm40 gm40Var;
        boolean z;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (wm40Var == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        if (wm40Var.Q() && wm40Var.m() != gm40.e && wm40Var.m() != gm40.c) {
                            z2 = true;
                        }
                        if (z3 && !z4) {
                            gm40Var = gm40.d;
                            break;
                        }
                        if (!z3 && z4) {
                            gm40 gm40VarM = z2 ? wm40Var.m() : gm40.e;
                            if (gm40VarM != null) {
                                gm40Var = gm40VarM;
                                break;
                            } else {
                                a(90);
                                throw null;
                            }
                        }
                        HashSet<mp9> hashSet = new HashSet();
                        for (mp9 mp9Var : collection) {
                            if (mp9Var == null) {
                                a(15);
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c(mp9Var, linkedHashSet);
                            hashSet.addAll(linkedHashSet);
                        }
                        if (!hashSet.isEmpty()) {
                            ym40 ym40VarI = rek.i((vjj) hashSet.iterator().next());
                            ym40VarI.getClass();
                            if (ym40VarI.h0(dty.f6674a) != null) {
                                hny.b();
                                return;
                            }
                        }
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : hashSet) {
                                Iterator it3 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        linkedHashSet2.add(obj);
                                        break;
                                    }
                                    kp9 kp9Var = (kp9) obj;
                                    kp9 kp9Var2 = (kp9) it3.next();
                                    if (!q(kp9Var, kp9Var2)) {
                                        if (q(kp9Var2, kp9Var)) {
                                            break;
                                        }
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        gm40 gm40VarM2 = wm40Var.m();
                        if (gm40VarM2 == null) {
                            a(92);
                            throw null;
                        }
                        gm40Var = gm40.e;
                        for (mp9 mp9Var2 : hashSet) {
                            gm40 gm40VarM3 = (z2 && mp9Var2.m() == gm40.e) ? gm40VarM2 : mp9Var2.m();
                            if (gm40VarM3.compareTo(gm40Var) < 0) {
                                gm40Var = gm40VarM3;
                            }
                        }
                        break;
                    }
                    mp9 mp9Var3 = (mp9) it2.next();
                    int iOrdinal = mp9Var3.m().ordinal();
                    if (iOrdinal == 0) {
                        gm40Var = gm40.b;
                        break;
                    } else if (iOrdinal == 1) {
                        e9d0.v(mp9Var3, "Member cannot have SEALED modality: ");
                        return;
                    } else if (iOrdinal == 2) {
                        z3 = true;
                    } else if (iOrdinal == 3) {
                        z4 = true;
                    }
                }
                mp9 mp9VarS = ((mp9) s(collection, new pnk0((byte) 20))).s(wm40Var, gm40Var, zIsEmpty ? uek.h : uek.g);
                g8xVar.V(mp9VarS, collection);
                g8xVar.t(mp9VarS);
                return;
            }
            Object next = it.next();
            mp9 mp9Var4 = (mp9) next;
            if (!uek.e(mp9Var4.getVisibility())) {
                if (wm40Var == null) {
                    uek.a(3);
                    throw null;
                }
                z = uek.c(uek.m, mp9Var4, wm40Var) == null;
            }
            if (z) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, Function1 function1, Function1 function2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        kp9 kp9Var = (kp9) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            kp9 kp9Var2 = (kp9) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(kp9Var, kp9Var2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static rf80 i(kp9 kp9Var, kp9 kp9Var2) {
        boolean z;
        rf80 rf80VarC;
        if (kp9Var == null) {
            a(38);
            throw null;
        }
        if (kp9Var2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = kp9Var instanceof mer;
        if ((z2 && !(kp9Var2 instanceof mer)) || (((z = kp9Var instanceof d0d0)) && !(kp9Var2 instanceof d0d0))) {
            return rf80.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            e9d0.i(kp9Var, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!kp9Var.getName().equals(kp9Var2.getName())) {
            return rf80.c("Name mismatch");
        }
        if ((kp9Var.F() == null) != (kp9Var2.F() == null)) {
            rf80VarC = rf80.c("Receiver presence mismatch");
        } else {
            rf80VarC = kp9Var.z().size() != kp9Var2.z().size() ? rf80.c("Value parameter number mismatch") : null;
        }
        if (rf80VarC != null) {
            return rf80VarC;
        }
        return null;
    }

    public static int j(kp9 kp9Var, kp9 kp9Var2) {
        sf80 sf80Var = c;
        int iB = sf80Var.l(kp9Var2, kp9Var, null).b();
        int iB2 = sf80Var.m(kp9Var, kp9Var2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(kp9 kp9Var, kp9 kp9Var2) {
        if (kp9Var == null) {
            a(65);
            throw null;
        }
        if (kp9Var2 == null) {
            a(66);
            throw null;
        }
        wsy returnType = kp9Var.getReturnType();
        wsy returnType2 = kp9Var2.getReturnType();
        if (p(kp9Var, kp9Var2)) {
            gys0 gys0VarF = c.f(kp9Var.getTypeParameters(), kp9Var2.getTypeParameters());
            if (kp9Var instanceof mer) {
                return o(kp9Var, returnType, kp9Var2, returnType2, gys0VarF);
            }
            if (!(kp9Var instanceof d0d0)) {
                ohq.k(kp9Var.getClass(), "Unexpected callable: ");
                return false;
            }
            d0d0 d0d0Var = (d0d0) kp9Var;
            d0d0 d0d0Var2 = (d0d0) kp9Var2;
            n0d0 n0d0VarE = d0d0Var.e();
            n0d0 n0d0VarE2 = d0d0Var2.e();
            if ((n0d0VarE == null || n0d0VarE2 == null) ? true : p(n0d0VarE, n0d0VarE2)) {
                if (d0d0Var.E() && d0d0Var2.E()) {
                    return m2a.l(gys0VarF, returnType.j0(), returnType2.j0());
                }
                if ((d0d0Var.E() || !d0d0Var2.E()) && o(kp9Var, returnType, kp9Var2, returnType2, gys0VarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(kp9 kp9Var, wsy wsyVar, kp9 kp9Var2, wsy wsyVar2, gys0 gys0Var) {
        if (kp9Var == null) {
            a(71);
            throw null;
        }
        if (wsyVar == null) {
            a(72);
            throw null;
        }
        if (kp9Var2 == null) {
            a(73);
            throw null;
        }
        if (wsyVar2 == null) {
            a(74);
            throw null;
        }
        tft0 tft0VarJ0 = wsyVar.j0();
        tft0 tft0VarJ1 = wsyVar2.j0();
        yzs0 yzs0Var = gys0Var.c;
        if (tft0VarJ0 == tft0VarJ1) {
            return true;
        }
        Function2 function2I0 = yzs0Var.i0();
        Boolean bool = function2I0 != null ? (Boolean) function2I0.invoke(tft0VarJ0, tft0VarJ1) : null;
        return bool != null ? bool.booleanValue() : m2a.b.j(gys0Var, yzs0Var, tft0VarJ0, tft0VarJ1);
    }

    public static boolean p(kp9 kp9Var, kp9 kp9Var2) {
        Integer numB = uek.b(kp9Var.getVisibility(), kp9Var2.getVisibility());
        return numB == null || numB.intValue() >= 0;
    }

    public static boolean q(kp9 kp9Var, kp9 kp9Var2) {
        gqw0 gqw0Var = gqw0.i1;
        if (kp9Var == null) {
            a(13);
            throw null;
        }
        if (kp9Var2 == null) {
            a(14);
            throw null;
        }
        if (!kp9Var.equals(kp9Var2) && gqw0Var.G0(kp9Var.o1(), kp9Var2.o1(), false)) {
            return true;
        }
        kp9 kp9VarO1 = kp9Var2.o1();
        int i = oek.f25126a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oek.b(kp9Var.o1(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (gqw0Var.G0(kp9VarO1, (kp9) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(mp9 mp9Var, Function1 function1) {
        tek tekVar;
        tek tekVarF;
        tek tekVar2;
        if (mp9Var == null) {
            a(105);
            throw null;
        }
        for (mp9 mp9Var2 : mp9Var.k()) {
            if (mp9Var2.getVisibility() == uek.g) {
                r(mp9Var2, function1);
            }
        }
        if (mp9Var.getVisibility() != uek.g) {
            return;
        }
        Collection<mp9> collectionK = mp9Var.k();
        if (collectionK == null) {
            a(107);
            throw null;
        }
        if (!collectionK.isEmpty()) {
            Iterator it = collectionK.iterator();
            loop3: while (true) {
                tekVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    tek visibility = ((mp9) it.next()).getVisibility();
                    if (tekVar != null) {
                        Integer numB = uek.b(visibility, tekVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    tekVar = visibility;
                }
            }
            if (tekVar == null) {
                tekVarF = null;
                break;
            }
            Iterator it2 = collectionK.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    tekVarF = tekVar;
                    break;
                }
                Integer numB2 = uek.b(tekVar, ((mp9) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    tekVarF = null;
                    break;
                }
            }
        } else {
            tekVarF = uek.k;
        }
        if (tekVarF == null) {
            tekVarF = null;
            break;
        }
        if (mp9Var.l() == 2) {
            for (mp9 mp9Var3 : collectionK) {
                if (mp9Var3.m() != gm40.e && !mp9Var3.getVisibility().equals(tekVarF)) {
                    tekVarF = null;
                    break;
                }
            }
        } else {
            tekVarF = uek.f(tekVarF.f33825a.m());
        }
        if (tekVarF == null) {
            if (function1 != null) {
                function1.invoke(mp9Var);
            }
            tekVar2 = uek.e;
        } else {
            tekVar2 = tekVarF;
        }
        if (mp9Var instanceof f0d0) {
            f0d0 f0d0Var = (f0d0) mp9Var;
            if (tekVar2 == null) {
                f0d0.k0(20);
                throw null;
            }
            f0d0Var.k = tekVar2;
            Iterator it3 = ((d0d0) mp9Var).o().iterator();
            while (it3.hasNext()) {
                r((b0d0) it3.next(), tekVarF == null ? null : function1);
            }
            return;
        }
        if (mp9Var instanceof oer) {
            oer oerVar = (oer) mp9Var;
            if (tekVar2 != null) {
                oerVar.m = tekVar2;
                return;
            } else {
                oer.k0(10);
                throw null;
            }
        }
        b0d0 b0d0Var = (b0d0) mp9Var;
        b0d0Var.l = tekVar2;
        if (tekVar2 != b0d0Var.p1().getVisibility()) {
            b0d0Var.f = false;
        }
    }

    public static Object s(Collection collection, Function1 function1) {
        Object next;
        wsy returnType;
        if (collection.size() == 1) {
            Object objT = CollectionsKt.T(collection);
            if (objT != null) {
                return objT;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(r3d.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object objT2 = CollectionsKt.T(collection);
        kp9 kp9Var = (kp9) function1.invoke(objT2);
        for (Object obj : collection) {
            kp9 kp9Var2 = (kp9) function1.invoke(obj);
            if (kp9Var2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(kp9Var2, (kp9) it2.next()));
            if (k(kp9Var2, kp9Var) && !k(kp9Var, kp9Var2)) {
                objT2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objT2 != null) {
                return objT2;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objT3 = CollectionsKt.T(arrayList);
            if (objT3 != null) {
                return objT3;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            returnType = ((kp9) function1.invoke(next)).getReturnType();
            returnType.getClass();
        } while (returnType.j0() instanceof kkq);
        if (next != null) {
            return next;
        }
        Object objT4 = CollectionsKt.T(arrayList);
        if (objT4 != null) {
            return objT4;
        }
        a(82);
        throw null;
    }

    public final gys0 f(List list, List list2) {
        cty ctyVar = cty.b0;
        bty btyVar = bty.g;
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        xsy xsyVar = this.f32105a;
        if (zIsEmpty) {
            return new gys0(true, true, true, new zn00((HashMap) null, xsyVar), btyVar, ctyVar);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((hzs0) list.get(i)).h(), ((hzs0) list2.get(i)).h());
        }
        return new gys0(true, true, true, new zn00(map, xsyVar), btyVar, ctyVar);
    }

    public final void h(g950 g950Var, Collection collection, Collection collection2, wm40 wm40Var, g8x g8xVar) {
        Integer numB;
        if (g950Var == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (wm40Var == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            mp9 mp9Var = (mp9) it.next();
            if (mp9Var == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            nbk0 nbk0Var = new nbk0();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                mp9 mp9Var2 = (mp9) it2.next();
                int iB = l(mp9Var2, mp9Var, wm40Var).b();
                boolean z = !uek.e(mp9Var2.getVisibility()) && uek.c(uek.m, mp9Var2, mp9Var) == null;
                int iE = hne.E(iB);
                if (iE == 0) {
                    if (z) {
                        nbk0Var.add(mp9Var2);
                    }
                    arrayList.add(mp9Var2);
                } else if (iE == 2) {
                    if (z) {
                        g8xVar.y(mp9Var2, mp9Var);
                    }
                    arrayList.add(mp9Var2);
                }
            }
            g8xVar.V(mp9Var, nbk0Var);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            vjj vjjVarJ = ((mp9) linkedHashSet.iterator().next()).j();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((mp9) it3.next()).j() != vjjVarJ) {
                        LinkedList<mp9> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            mp9 mp9Var3 = null;
                            for (mp9 mp9Var4 : linkedList) {
                                if (mp9Var3 == null || ((numB = uek.b(mp9Var3.getVisibility(), mp9Var4.getVisibility())) != null && numB.intValue() < 0)) {
                                    mp9Var3 = mp9Var4;
                                }
                            }
                            mp9Var3.getClass();
                            e(g(mp9Var3, linkedList, new pnk0((byte) 21), new m160(g8xVar, mp9Var3, (byte) 18)), wm40Var, g8xVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((mp9) it4.next()), wm40Var, g8xVar);
        }
    }

    public final rf80 l(kp9 kp9Var, kp9 kp9Var2, wm40 wm40Var) {
        if (kp9Var == null) {
            a(19);
            throw null;
        }
        if (kp9Var2 != null) {
            return m(kp9Var, kp9Var2, wm40Var, false);
        }
        a(20);
        throw null;
    }

    public final rf80 m(kp9 kp9Var, kp9 kp9Var2, wm40 wm40Var, boolean z) {
        if (kp9Var == null) {
            a(22);
            throw null;
        }
        if (kp9Var2 == null) {
            a(23);
            throw null;
        }
        rf80 rf80VarN = n(kp9Var, kp9Var2, z);
        boolean z2 = rf80VarN.b() == 1;
        List<uto> list = b;
        for (uto utoVar : list) {
            if (utoVar.b() != 1 && (!z2 || utoVar.b() != 2)) {
                int iE = hne.E(utoVar.a(kp9Var, kp9Var2, wm40Var));
                if (iE == 0) {
                    z2 = true;
                } else if (iE == 1) {
                    return rf80.c("External condition");
                }
            }
        }
        if (!z2) {
            return rf80VarN;
        }
        for (uto utoVar2 : list) {
            if (utoVar2.b() == 1) {
                int iE2 = hne.E(utoVar2.a(kp9Var, kp9Var2, wm40Var));
                if (iE2 == 0) {
                    throw new IllegalStateException("Contract violation in " + utoVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iE2 == 1) {
                    return rf80.c("External condition");
                }
            }
        }
        rf80 rf80Var = rf80.c;
        if (rf80Var != null) {
            return rf80Var;
        }
        rf80.a(0);
        throw null;
    }

    public final rf80 n(kp9 kp9Var, kp9 kp9Var2, boolean z) {
        boolean zBooleanValue;
        if (kp9Var == null) {
            a(28);
            throw null;
        }
        if (kp9Var2 == null) {
            a(29);
            throw null;
        }
        rf80 rf80VarI = i(kp9Var, kp9Var2);
        if (rf80VarI != null) {
            return rf80VarI;
        }
        ArrayList arrayListD = d(kp9Var);
        ArrayList arrayListD2 = d(kp9Var2);
        List typeParameters = kp9Var.getTypeParameters();
        List typeParameters2 = kp9Var2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!ysy.f43192a.a((wsy) arrayListD.get(i), (wsy) arrayListD2.get(i))) {
                    return rf80.c("Type parameter number mismatch");
                }
            }
            return new rf80(3, "Type parameter number mismatch");
        }
        gys0 gys0VarF = f(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            hzs0 hzs0Var = (hzs0) typeParameters.get(i2);
            hzs0 hzs0Var2 = (hzs0) typeParameters2.get(i2);
            if (hzs0Var == null) {
                a(47);
                throw null;
            }
            if (hzs0Var2 == null) {
                a(48);
                throw null;
            }
            List<wsy> upperBounds = hzs0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(hzs0Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (wsy wsyVar : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(wsyVar, (wsy) listIterator.next(), gys0VarF));
                    listIterator.remove();
                }
            }
            return rf80.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((wsy) arrayListD.get(i3), (wsy) arrayListD2.get(i3), gys0VarF)) {
                return rf80.c("Value parameter type mismatch");
            }
        }
        if ((kp9Var instanceof mer) && (kp9Var2 instanceof mer) && ((mer) kp9Var).isSuspend() != ((mer) kp9Var2).isSuspend()) {
            return new rf80(3, "Incompatible suspendability");
        }
        if (z) {
            wsy returnType = kp9Var.getReturnType();
            wsy returnType2 = kp9Var2.getReturnType();
            if (returnType != null && returnType2 != null && (!bdx.k0(returnType2) || !bdx.k0(returnType))) {
                tft0 tft0VarJ0 = returnType2.j0();
                tft0 tft0VarJ1 = returnType.j0();
                yzs0 yzs0Var = gys0VarF.c;
                if (tft0VarJ0 == tft0VarJ1) {
                    zBooleanValue = true;
                } else {
                    Function2 function2I0 = yzs0Var.i0();
                    Boolean bool = function2I0 != null ? (Boolean) function2I0.invoke(tft0VarJ0, tft0VarJ1) : null;
                    zBooleanValue = bool != null ? bool.booleanValue() : m2a.b.j(gys0VarF, yzs0Var, tft0VarJ0, tft0VarJ1);
                }
                if (!zBooleanValue) {
                    return new rf80(3, "Return type mismatch");
                }
            }
        }
        rf80 rf80Var = rf80.c;
        if (rf80Var != null) {
            return rf80Var;
        }
        rf80.a(0);
        throw null;
    }
}
