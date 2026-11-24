package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class go20 extends io20 implements Iterator, khy {
    public final /* synthetic */ byte e;

    public go20(jo20 jo20Var, byte b) {
        this.e = b;
        jo20Var.getClass();
        this.d = jo20Var;
        this.b = -1;
        this.c = jo20Var.h;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.f15098a;
                jo20 jo20Var = (jo20) this.d;
                if (i >= jo20Var.f) {
                    itt0.a();
                    return null;
                }
                this.f15098a = i + 1;
                this.b = i;
                ho20 ho20Var = new ho20(jo20Var, i);
                c();
                return ho20Var;
            case 1:
                b();
                int i2 = this.f15098a;
                jo20 jo20Var2 = (jo20) this.d;
                if (i2 >= jo20Var2.f) {
                    itt0.a();
                    return null;
                }
                this.f15098a = i2 + 1;
                this.b = i2;
                Object obj = jo20Var2.f16838a[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.f15098a;
                jo20 jo20Var3 = (jo20) this.d;
                if (i3 >= jo20Var3.f) {
                    itt0.a();
                    return null;
                }
                this.f15098a = i3 + 1;
                this.b = i3;
                Object[] objArr = jo20Var3.b;
                objArr.getClass();
                Object obj2 = objArr[this.b];
                c();
                return obj2;
        }
    }
}
