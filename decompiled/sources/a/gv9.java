package a;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class gv9 extends jv9 implements oq8 {
    public final Object f;

    public gv9(Field field, Object obj) {
        super(field, false);
        this.f = obj;
    }

    @Override // a.jv9, a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        return ((Field) this.c).get(this.f);
    }
}
