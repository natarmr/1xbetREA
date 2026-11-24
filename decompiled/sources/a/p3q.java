package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p3q extends lm40 implements gpa0 {
    @Override // a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        woa0Var.getClass();
        if (xoa0Var == xoa0.f41207a) {
            List list = woa0Var.f39485a;
            if (list.size() <= 1) {
                return;
            }
            int size = list.size();
            for (int i = 1; i < size; i++) {
                ((dpa0) list.get(i)).a();
            }
        }
    }

    @Override // a.gpa0
    public final void n0() {
    }
}
