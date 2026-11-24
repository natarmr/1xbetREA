package a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class ztt0 implements GenericArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f44980a;

    public ztt0(Type type) {
        this.f44980a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && ay3.O(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f44980a;
    }

    public final int hashCode() {
        return this.f44980a.hashCode();
    }

    public final String toString() {
        return ay3.f0(this.f44980a) + "[]";
    }
}
