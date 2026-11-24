package a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ujt implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f35800a;

    public ujt(Type type) {
        type.getClass();
        this.f35800a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.d(this.f35800a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f35800a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return f1t0.f0(this.f35800a) + "[]";
    }

    public final int hashCode() {
        return this.f35800a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
