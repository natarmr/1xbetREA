package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class e0o extends dr30 {
    public final zt00 b;
    public final zt00 c;
    public final cu00 d;
    public final /* synthetic */ f0o e;

    public e0o(f0o f0oVar, eu00 eu00Var) {
        byte b = 0;
        if (eu00Var == null) {
            h(0);
            throw null;
        }
        this.e = f0oVar;
        this.b = eu00Var.c(new d0o(this, b));
        this.c = eu00Var.c(new d0o(this, (byte) 1));
        this.d = new cu00(eu00Var, new jfl(this, (byte) 7));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
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
        if (i != 3 && i != 7 && i != 9 && i != 12) {
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
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
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

    @Override // a.dr30, a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        if (g950Var != null) {
            return (Collection) this.b.invoke(g950Var);
        }
        h(5);
        throw null;
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        if (cekVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // a.dr30, a.cr30
    public final Set c() {
        Set set = (Set) this.e.i.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // a.dr30, a.cr30
    public final Set e() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // a.dr30, a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        if (g950Var != null) {
            return (Collection) this.c.invoke(g950Var);
        }
        h(1);
        throw null;
    }

    @Override // a.dr30, a.cr30
    public final Set g() {
        Set set = (Set) this.e.i.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final cr30 i() {
        cr30 cr30VarY = ((wsy) ((r5) this.e.h()).b().iterator().next()).y();
        if (cr30VarY != null) {
            return cr30VarY;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(g950 g950Var, Collection collection) {
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        sf80.c.h(g950Var, collection, Collections.EMPTY_SET, this.e, new bfk(linkedHashSet, (byte) 1));
        return linkedHashSet;
    }
}
