package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ah9 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f862a;
    public int b;
    public Iterable c;

    public ah9(rew0 rew0Var) {
        this.f862a = (byte) 1;
        this.c = rew0Var;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f862a) {
            case 0:
                return this.b < ((bh9) this.c).e.size();
            default:
                return this.b < ((rew0) this.c).k();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f862a) {
            case 0:
                yg9 yg9Var = (yg9) ((bh9) this.c).e.get(this.b);
                this.b++;
                return yg9Var;
            default:
                rew0 rew0Var = (rew0) this.c;
                int i = this.b;
                int iK = rew0Var.k();
                int i2 = this.b;
                if (i < iK) {
                    this.b = i2 + 1;
                    return rew0Var.l(i2);
                }
                v4i0.o(b1j.h(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
                return null;
        }
    }

    public /* synthetic */ ah9() {
        this.f862a = (byte) 0;
    }
}
