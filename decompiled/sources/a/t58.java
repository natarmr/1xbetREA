package a;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class t58 extends diu0 {
    public hy40 B;
    public hy40 C;
    public Executor b;
    public nnw0 c;
    public yzn0 d;
    public q58 e;
    public lo4 f;
    public t5a g;
    public so4 h;
    public so4 i;
    public String j;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public hy40 s;
    public hy40 t;
    public hy40 u;
    public hy40 v;
    public hy40 w;
    public hy40 x;
    public hy40 z;
    public byte k = 0;
    public boolean y = true;
    public int A = 0;

    public static void z(hy40 hy40Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            hy40Var.l(obj);
        } else {
            hy40Var.i(obj);
        }
    }

    public final void w(int i) {
        hy40 hy40Var = this.B;
        if (hy40Var == null) {
            hy40Var = new hy40();
            this.B = hy40Var;
        }
        z(hy40Var, Integer.valueOf(i));
    }

    public final void x(boolean z) {
        hy40 hy40Var = this.w;
        if (hy40Var == null) {
            hy40Var = new hy40();
            this.w = hy40Var;
        }
        z(hy40Var, Boolean.valueOf(z));
    }

    public final void y() {
        int i;
        yzn0 yzn0Var = this.d;
        q58 q58Var = this.e;
        if (yzn0Var == null) {
            i = 0;
        } else {
            i = q58Var != null ? 15 : 255;
        }
        this.r = i;
    }
}
