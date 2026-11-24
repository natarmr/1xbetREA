package a;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class mv9 extends nv9 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv9(Field field, boolean z, boolean z2, byte b) {
        super(field, z, z2);
        this.g = b;
    }

    @Override // a.nv9, a.sv9
    public void e(Object[] objArr) {
        switch (this.g) {
            case 1:
                objArr.getClass();
                super.e(objArr);
                f(tx3.B(objArr));
                break;
            default:
                super.e(objArr);
                break;
        }
    }
}
