package a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class rv5 implements u34 {
    public q34 b;
    public q34 c;
    public q34 d;
    public q34 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public rv5() {
        ByteBuffer byteBuffer = u34.f34978a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        q34 q34Var = q34.e;
        this.d = q34Var;
        this.e = q34Var;
        this.b = q34Var;
        this.c = q34Var;
    }

    @Override // a.u34
    public boolean a() {
        return this.h && this.g == u34.f34978a;
    }

    @Override // a.u34
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = u34.f34978a;
        return byteBuffer;
    }

    @Override // a.u34
    public final void c(s34 s34Var) {
        this.g = u34.f34978a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // a.u34
    public final void e() {
        this.h = true;
        j();
    }

    @Override // a.u34
    public final q34 f(q34 q34Var) {
        this.d = q34Var;
        this.e = h(q34Var);
        return isActive() ? this.e : q34.e;
    }

    public q34 h(q34 q34Var) throws t34 {
        if (q34Var.c == 2) {
            return q34Var.f28032a == -1 ? q34.e : q34Var;
        }
        throw new t34(q34Var);
    }

    @Override // a.u34
    public boolean isActive() {
        return this.e != q34.e;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // a.u34
    public final void reset() {
        ByteBuffer byteBuffer = u34.f34978a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        q34 q34Var = q34.e;
        this.d = q34Var;
        this.e = q34Var;
        this.b = q34Var;
        this.c = q34Var;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
