package a;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class pa80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26643a;
    public final Object b;
    public final Object c;

    public pa80(androidx.recyclerview.widget.b bVar) {
        this.f26643a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = bVar;
    }

    public static pa80 b(androidx.recyclerview.widget.b bVar, int i) {
        if (i == 0) {
            return new oa80(bVar, (byte) 0);
        }
        byte b = 1;
        if (i == 1) {
            return new oa80(bVar, b);
        }
        jf4.o("invalid orientation");
        return null;
    }

    public void a(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void c(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f26643a) {
            return 0;
        }
        return n() - this.f26643a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void t(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void u(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public void v(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public t40 w(qpg0 qpg0Var) {
        qpg0Var.getClass();
        throw new IllegalStateException("NOP delegate should never be called");
    }

    public pa80(int i, String str, String str2) {
        this.f26643a = i;
        this.b = str;
        this.c = str2;
    }
}
