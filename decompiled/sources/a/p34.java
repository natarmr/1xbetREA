package a;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4x f26281a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public p34(b4x b4xVar) {
        this.f26281a = b4xVar;
        q34 q34Var = q34.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        return this.d && ((u34) this.b.get(a())).a() && !this.c[a()].hasRemaining();
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= a(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    u34 u34Var = (u34) arrayList.get(i);
                    if (!u34Var.a()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : u34.f34978a;
                        long jRemaining = byteBuffer2.remaining();
                        u34Var.d(byteBuffer2);
                        this.c[i] = u34Var.b();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < a()) {
                        ((u34) arrayList.get(i + 1)).e();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p34)) {
            return false;
        }
        b4x b4xVar = ((p34) obj).f26281a;
        b4x b4xVar2 = this.f26281a;
        if (b4xVar2.size() != b4xVar.size()) {
            return false;
        }
        for (int i = 0; i < b4xVar2.size(); i++) {
            if (b4xVar2.get(i) != b4xVar.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f26281a.hashCode();
    }
}
