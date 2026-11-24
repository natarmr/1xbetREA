package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s5 extends r5 {
    public final gfk0 c;
    public final /* synthetic */ t5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t5 t5Var, eu00 eu00Var) {
        super(eu00Var);
        gfk0 gfk0Var = gfk0.c;
        if (eu00Var == null) {
            j(0);
            throw null;
        }
        this.d = t5Var;
        this.c = gfk0Var;
    }

    public static /* synthetic */ void j(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = Payload.TYPE;
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.r5
    public final Collection a() {
        List listQ1 = this.d.q1();
        if (listQ1 != null) {
            return listQ1;
        }
        j(1);
        throw null;
    }

    @Override // a.iys0
    public final ary c() {
        ary aryVarC = rek.i(this.d).c();
        if (aryVarC != null) {
            return aryVarC;
        }
        j(4);
        throw null;
    }

    @Override // a.r5
    public final gfk0 e() {
        gfk0 gfk0Var = this.c;
        if (gfk0Var != null) {
            return gfk0Var;
        }
        j(5);
        throw null;
    }

    @Override // a.iys0
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        j(2);
        throw null;
    }

    @Override // a.r5
    public final boolean h(foc focVar) {
        if (!(focVar instanceof hzs0)) {
            return false;
        }
        return gqw0.i1.H0(this.d, (hzs0) focVar, true, x0.p);
    }

    @Override // a.r5
    public final List i(List list) {
        if (list == null) {
            j(7);
            throw null;
        }
        List listP1 = this.d.p1(list);
        if (listP1 != null) {
            return listP1;
        }
        j(8);
        throw null;
    }

    @Override // a.iys0
    public final foc n() {
        return this.d;
    }

    @Override // a.iys0
    public final boolean p() {
        return true;
    }

    public final String toString() {
        return this.d.getName().f10896a;
    }
}
