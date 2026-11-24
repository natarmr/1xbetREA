package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kz70 extends mjq {
    public static final kz70 d = new kz70(0, 2, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        int i = ((nkx) hu5Var.g(0)).f23702a;
        List list = (List) hu5Var.g(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            bv3Var.h(i3, obj);
            bv3Var.d(i3, obj);
        }
    }
}
