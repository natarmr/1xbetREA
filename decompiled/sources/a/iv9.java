package a;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class iv9 extends jv9 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv9(Field field, boolean z, byte b) {
        super(field, z);
        this.f = b;
    }

    @Override // a.sv9
    public void e(Object[] objArr) {
        switch (this.f) {
            case 1:
                objArr.getClass();
                d(objArr.length);
                f(tx3.B(objArr));
                break;
            default:
                super.e(objArr);
                break;
        }
    }
}
