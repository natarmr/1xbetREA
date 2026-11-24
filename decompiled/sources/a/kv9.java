package a;

import java.lang.reflect.Field;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class kv9 extends nv9 implements oq8 {
    public final Object g;

    public kv9(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.g = obj;
    }

    @Override // a.nv9, a.bv9
    public final Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        e(objArr);
        ((Field) this.c).set(this.g, tx3.A(objArr));
        return Unit.f46060a;
    }
}
