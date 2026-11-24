package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dmc extends i1 {
    public final wm40 c;
    public final List d;
    public final Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmc(wm40 wm40Var, List list, Collection collection, eu00 eu00Var) {
        super(eu00Var);
        if (list == null) {
            j(1);
            throw null;
        }
        if (collection == null) {
            j(2);
            throw null;
        }
        if (eu00Var == null) {
            j(3);
            throw null;
        }
        this.c = wm40Var;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void j(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.r5
    public final Collection a() {
        Collection collection = this.e;
        if (collection != null) {
            return collection;
        }
        j(6);
        throw null;
    }

    @Override // a.iys0
    public final List getParameters() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        j(4);
        throw null;
    }

    @Override // a.iys0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final wm40 n() {
        wm40 wm40Var = this.c;
        if (wm40Var != null) {
            return wm40Var;
        }
        j(5);
        throw null;
    }

    @Override // a.iys0
    public final boolean p() {
        return true;
    }

    public final String toString() {
        return oek.f(this.c).f34663a;
    }
}
