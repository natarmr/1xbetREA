package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vqe0 extends uqe0 implements hay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f37852a;

    public vqe0(Method method) {
        this.f37852a = method;
    }

    @Override // a.uqe0
    public final Member b() {
        return this.f37852a;
    }

    public final zqe0 f() {
        Type genericReturnType = this.f37852a.getGenericReturnType();
        genericReturnType.getClass();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new xqe0(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            return new gqe0(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new cre0((WildcardType) genericReturnType) : new oqe0(genericReturnType);
    }

    public final List g() {
        Method method = this.f37852a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        parameterAnnotations.getClass();
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // a.hay
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f37852a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new are0(typeVariable));
        }
        return arrayList;
    }
}
