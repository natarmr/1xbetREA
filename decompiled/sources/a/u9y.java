package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class u9y extends fyj0 implements o8y {
    public static final ifk h1 = new ifk();
    public static final ifk i1 = new ifk();
    public int f1;
    public final boolean g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9y(vjj vjjVar, fyj0 fyj0Var, g93 g93Var, g950 g950Var, int i, gmk0 gmk0Var, boolean z) {
        super(vjjVar, fyj0Var, g93Var, g950Var, i, gmk0Var);
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
        this.f1 = 0;
        this.g1 = z;
    }

    public static u9y D1(vjj vjjVar, j9z j9zVar, g950 g950Var, rog0 rog0Var, boolean z) {
        if (vjjVar == null) {
            k0(5);
            throw null;
        }
        if (g950Var != null) {
            return new u9y(vjjVar, null, j9zVar, g950Var, 1, rog0Var, z);
        }
        k0(7);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = Payload.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.fyj0
    public final fyj0 C1(c8z c8zVar, c8z c8zVar2, List list, List list2, List list3, wsy wsyVar, gm40 gm40Var, tek tekVar, Map map) {
        a5c a5cVar;
        if (list == null) {
            k0(9);
            throw null;
        }
        if (list2 == null) {
            k0(10);
            throw null;
        }
        if (list3 == null) {
            k0(11);
            throw null;
        }
        if (tekVar == null) {
            k0(12);
            throw null;
        }
        super.C1(c8zVar, c8zVar2, list, list2, list3, wsyVar, gm40Var, tekVar, map);
        for (p9c p9cVar : c180.f3563a) {
            Regex regex = p9cVar.b;
            g950 g950Var = p9cVar.f26599a;
            if (g950Var == null || Intrinsics.d(getName(), g950Var)) {
                if (regex != null) {
                    String strB = getName().b();
                    strB.getClass();
                    if (!regex.g(strB)) {
                        continue;
                    }
                }
                Collection collection = p9cVar.c;
                if (collection == null || collection.contains(getName())) {
                    for (eyb eybVar : p9cVar.e) {
                        if (eybVar.a(this) != null) {
                            a5cVar = new a5c(false);
                            this.n = a5cVar.f22447a;
                            return this;
                        }
                    }
                    a5cVar = ((String) p9cVar.d.invoke(this)) != null ? new a5c(false) : a5c.c;
                    this.n = a5cVar.f22447a;
                    return this;
                }
            }
        }
        a5cVar = a5c.b;
        this.n = a5cVar.f22447a;
        return this;
    }

    public final void E1(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.f1 = i;
    }

    @Override // a.oer, a.kp9
    public final boolean P() {
        return w6x.b(this.f1);
    }

    @Override // a.o8y
    public final o8y a0(wsy wsyVar, ArrayList arrayList, wsy wsyVar2, Pair pair) {
        if (wsyVar2 == null) {
            k0(20);
            throw null;
        }
        ArrayList arrayListO = pvm0.o(arrayList, z(), this);
        c8z c8zVarS = wsyVar == null ? null : obb.S(this, wsyVar, ujn.c);
        ner nerVarU1 = u1(xzs0.b);
        nerVarU1.g = arrayListO;
        nerVarU1.k = wsyVar2;
        nerVarU1.i = c8zVarS;
        nerVarU1.p = true;
        nerVarU1.o = true;
        u9y u9yVar = (u9y) nerVarU1.x.r1(nerVarU1);
        if (pair != null) {
            ifk ifkVar = (ifk) pair.f46059a;
            Object obj = pair.b;
            Map linkedHashMap = u9yVar.Z;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                u9yVar.Z = linkedHashMap;
            }
            linkedHashMap.put(ifkVar, obj);
        }
        if (u9yVar != null) {
            return u9yVar;
        }
        k0(21);
        throw null;
    }

    @Override // a.fyj0, a.oer
    public final oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        if (vjjVar == null) {
            k0(14);
            throw null;
        }
        if (i == 0) {
            k0(15);
            throw null;
        }
        if (g93Var == null) {
            k0(16);
            throw null;
        }
        fyj0 fyj0Var = (fyj0) merVar;
        if (g950Var == null) {
            g950Var = getName();
        }
        u9y u9yVar = new u9y(vjjVar, fyj0Var, g93Var, g950Var, i, gmk0Var, this.g1);
        int i2 = this.f1;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        u9yVar.E1(z, w6x.b(i2));
        return u9yVar;
    }
}
