package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class p8y extends flc implements o8y {
    public Boolean g1;
    public Boolean h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8y(wm40 wm40Var, p8y p8yVar, g93 g93Var, boolean z, int i, gmk0 gmk0Var) {
        super(wm40Var, p8yVar, g93Var, z, i, gmk0Var);
        if (wm40Var == null) {
            k0(0);
            throw null;
        }
        if (g93Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (gmk0Var == null) {
            k0(3);
            throw null;
        }
        this.g1 = null;
        this.h1 = null;
    }

    public static p8y F1(wm40 wm40Var, g93 g93Var, boolean z, rog0 rog0Var) {
        if (wm40Var != null) {
            return new p8y(wm40Var, null, g93Var, z, 1, rog0Var);
        }
        k0(4);
        throw null;
    }

    public static /* synthetic */ void k0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = Payload.SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final p8y G1(vjj vjjVar, mer merVar, int i, g93 g93Var, gmk0 gmk0Var) {
        if (vjjVar == null) {
            k0(7);
            throw null;
        }
        if (i == 0) {
            k0(8);
            throw null;
        }
        if (g93Var == null) {
            k0(9);
            throw null;
        }
        if (gmk0Var == null) {
            k0(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(vjjVar);
            String strC = h97.C(i);
            sb.append("\nkind: ");
            sb.append(strC);
            throw new IllegalStateException(sb.toString());
        }
        wm40 wm40Var = (wm40) vjjVar;
        p8y p8yVar = (p8y) merVar;
        if (i == 0) {
            k0(13);
            throw null;
        }
        p8y p8yVar2 = new p8y(wm40Var, p8yVar, g93Var, this.f1, i, gmk0Var);
        Boolean bool = this.g1;
        bool.getClass();
        p8yVar2.g1 = bool;
        Boolean bool2 = this.h1;
        bool2.getClass();
        p8yVar2.h1 = bool2;
        return p8yVar2;
    }

    @Override // a.oer, a.kp9
    public final boolean P() {
        return this.h1.booleanValue();
    }

    @Override // a.o8y
    public final o8y a0(wsy wsyVar, ArrayList arrayList, wsy wsyVar2, Pair pair) {
        if (wsyVar2 == null) {
            k0(17);
            throw null;
        }
        p8y p8yVarG1 = G1(j(), null, l(), getAnnotations(), b());
        p8yVarG1.t1(wsyVar != null ? obb.S(p8yVarG1, wsyVar, ujn.c) : null, this.k, iun.f15405a, getTypeParameters(), pvm0.o(arrayList, z(), p8yVarG1), wsyVar2, m(), getVisibility());
        if (pair != null) {
            ifk ifkVar = (ifk) pair.f46059a;
            Object obj = pair.b;
            Map linkedHashMap = p8yVarG1.Z;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                p8yVarG1.Z = linkedHashMap;
            }
            linkedHashMap.put(ifkVar, obj);
        }
        return p8yVarG1;
    }

    @Override // a.flc, a.oer
    public final /* bridge */ /* synthetic */ oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        return G1(vjjVar, merVar, i, g93Var, gmk0Var);
    }

    @Override // a.oer
    public final void v1(boolean z) {
        this.g1 = Boolean.valueOf(z);
    }

    @Override // a.oer
    public final void w1(boolean z) {
        this.h1 = Boolean.valueOf(z);
    }

    @Override // a.flc
    /* JADX INFO: renamed from: y1 */
    public final /* bridge */ /* synthetic */ flc q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        return G1(vjjVar, merVar, i, g93Var, gmk0Var);
    }
}
