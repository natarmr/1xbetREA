package a;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class a3 extends b3 implements RandomAccess {
    public final /* synthetic */ byte b = 0;
    public int c;
    public int d;
    public final List e;

    public a3(b3 b3Var, int i, int i2) {
        this.e = b3Var;
        this.c = i;
        x2 x2Var = b3.f1878a;
        int iB = b3Var.b();
        x2Var.getClass();
        x2.d(i, i2, iB);
        this.d = i2 - i;
    }

    @Override // a.u1
    public final int b() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.b;
        List list = this.e;
        switch (b) {
            case 0:
                x2 x2Var = b3.f1878a;
                int i2 = this.d;
                x2Var.getClass();
                x2.b(i, i2);
                return ((b3) list).get(this.c + i);
            default:
                x2 x2Var2 = b3.f1878a;
                int i3 = this.d;
                x2Var2.getClass();
                x2.b(i, i3);
                return ((ArrayList) list).get(this.c + i);
        }
    }

    @Override // a.b3, java.util.List
    public List subList(int i, int i2) {
        switch (this.b) {
            case 0:
                x2 x2Var = b3.f1878a;
                int i3 = this.d;
                x2Var.getClass();
                x2.d(i, i2, i3);
                b3 b3Var = (b3) this.e;
                int i4 = this.c;
                return new a3(b3Var, i + i4, i4 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public a3(ArrayList arrayList) {
        this.e = arrayList;
    }
}
