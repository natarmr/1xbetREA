package a;

/* JADX INFO: loaded from: classes.dex */
public final class m35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21096a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public m35(int i, int i2, int i3, int i4, int i5, String str) {
        this.f21096a = i;
        if (str == null) {
            hny.u("Null mediaType");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m35) {
            m35 m35Var = (m35) obj;
            if (this.f21096a == m35Var.f21096a && this.b.equals(m35Var.b) && this.c == m35Var.c && this.d == m35Var.d && this.e == m35Var.e && this.f == m35Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.f21096a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.f21096a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return rz4.j(this.f, "}", sb);
    }
}
