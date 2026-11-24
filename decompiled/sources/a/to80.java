package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class to80 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f34271a;
    public final Type b;
    public final Type[] c;

    public to80(Class cls, Type type, ArrayList arrayList) {
        this.f34271a = cls;
        this.b = type;
        this.c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.f34271a.equals(parameterizedType.getRawType()) && Intrinsics.d(this.b, parameterizedType.getOwnerType()) && Arrays.equals(this.c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f34271a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f34271a;
        Type type = this.b;
        if (type != null) {
            sb.append(f1t0.f0(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(f1t0.f0(cls));
        }
        Type[] typeArr = this.c;
        if (typeArr.length != 0) {
            tx3.K(typeArr, sb, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, "...", so80.f32534a);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f34271a.hashCode();
        Type type = this.b;
        return Arrays.hashCode(this.c) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
