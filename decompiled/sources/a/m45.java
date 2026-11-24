package a;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class m45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f21151a;
    public final int b;
    public final int c;

    public m45(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            hny.u("Null eglSurface");
            throw null;
        }
        this.f21151a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m45) {
            m45 m45Var = (m45) obj;
            if (this.f21151a.equals(m45Var.f21151a) && this.b == m45Var.b && this.c == m45Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.f21151a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.f21151a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return rz4.j(this.c, "}", sb);
    }
}
