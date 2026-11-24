package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class io20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15098a;
    public int b;
    public int c;
    public Object d;

    public io20() {
        if (bzs0.b == null) {
            bzs0.b = new bzs0((byte) 4);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((jo20) this.d).h == this.c) {
            return;
        }
        jf4.e();
    }

    public void c() {
        while (true) {
            int i = this.f15098a;
            jo20 jo20Var = (jo20) this.d;
            if (i >= jo20Var.f || jo20Var.c[i] >= 0) {
                return;
            } else {
                this.f15098a = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f15098a < ((jo20) this.d).f;
    }

    public void remove() {
        jo20 jo20Var = (jo20) this.d;
        b();
        if (this.b == -1) {
            jf4.n("Call next() before removing element from the iterator.");
            return;
        }
        jo20Var.d();
        jo20Var.m(this.b);
        this.b = -1;
        this.c = jo20Var.h;
    }
}
