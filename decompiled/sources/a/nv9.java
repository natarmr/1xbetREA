package a;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nv9 extends sv9 {
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public nv9(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        super(field, cls, z2 ? new Type[]{field.getDeclaringClass(), field.getGenericType()} : new Type[]{field.getGenericType()});
        this.e = z;
        this.f = z2;
    }

    @Override // a.bv9
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        e(objArr);
        ((Field) this.c).set(this.f ? tx3.A(objArr) : null, tx3.O(objArr));
        return Unit.f46060a;
    }

    @Override // a.sv9
    public void e(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        if (this.e && tx3.O(objArr) == null) {
            jf4.o("null is not allowed as a value for this property.");
        }
    }
}
