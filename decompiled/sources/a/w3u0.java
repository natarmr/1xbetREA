package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w3u0 extends v0 {
    public static wgv z(hwt0 hwt0Var) {
        if (hwt0Var instanceof wgv) {
            return (wgv) hwt0Var;
        }
        jf4.n("Cannot only insert VNode into Group");
        return null;
    }

    @Override // a.bv3
    public final void a(int i, int i2, int i3) {
        wgv wgvVarZ = z((hwt0) this.c);
        ArrayList arrayList = wgvVarZ.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                hwt0 hwt0Var = (hwt0) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, hwt0Var);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                hwt0 hwt0Var2 = (hwt0) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, hwt0Var2);
                i4++;
            }
        }
        wgvVarZ.c();
    }

    @Override // a.bv3
    public final void b(int i, int i2) {
        z((hwt0) this.c).h(i, i2);
    }

    @Override // a.bv3
    public final void d(int i, Object obj) {
    }

    @Override // a.bv3
    public final void h(int i, Object obj) {
        z((hwt0) this.c).e(i, (hwt0) obj);
    }

    @Override // a.v0
    public final void u() {
        wgv wgvVarZ = z((hwt0) this.b);
        wgvVarZ.h(0, wgvVarZ.c.size());
    }
}
