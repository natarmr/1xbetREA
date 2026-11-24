package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ogv0 implements WildcardType, Type {
    public static final ngv0 c = new ngv0(null);
    public static final ogv0 d = new ogv0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f25237a;
    public final Type b;

    public ogv0(Type type, Type type2) {
        this.f25237a = type;
        this.b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.b;
        if (type != null) {
            return "? super " + f1t0.f0(type);
        }
        Type type2 = this.f25237a;
        if (type2 == null || Intrinsics.d(type2, Object.class)) {
            return Separators.QUESTION;
        }
        return "? extends " + f1t0.f0(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f25237a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
