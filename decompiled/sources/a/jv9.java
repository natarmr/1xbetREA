package a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jv9 extends sv9 {
    public final boolean e;

    public jv9(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            jdg0 jdg0Var = new jdg0(2);
            jdg0Var.a(method.getDeclaringClass());
            jdg0Var.b(typeArr);
            ArrayList arrayList = jdg0Var.b;
            typeArr = (Type[]) arrayList.toArray(new Type[arrayList.size()]);
        }
        super(method, genericReturnType, typeArr);
        this.e = genericReturnType.equals(Void.TYPE);
    }

    @Override // a.bv9
    public Object call(Object[] objArr) {
        objArr.getClass();
        e(objArr);
        return ((Field) this.c).get(this.e ? tx3.A(objArr) : null);
    }

    public Object g(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.e ? Unit.f46060a : ((Method) this.c).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jv9(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jv9(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? new Type[]{field.getDeclaringClass()} : new Type[0]);
        this.e = z;
    }
}
