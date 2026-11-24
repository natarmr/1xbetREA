package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class but0 implements WildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3251a;
    public final Type b;

    public but0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            e9d0.o();
            throw null;
        }
        if (typeArr.length != 1) {
            e9d0.o();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            ay3.K(typeArr[0]);
            this.b = null;
            this.f3251a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        ay3.K(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            e9d0.o();
            throw null;
        }
        this.b = typeArr2[0];
        this.f3251a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && ay3.O(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : ay3.n;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f3251a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (this.f3251a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + ay3.f0(type);
        }
        Type type2 = this.f3251a;
        if (type2 == Object.class) {
            return Separators.QUESTION;
        }
        return "? extends " + ay3.f0(type2);
    }
}
