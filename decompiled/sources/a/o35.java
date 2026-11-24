package a;

/* JADX INFO: loaded from: classes.dex */
public final class o35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24566a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public o35(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f24566a = i;
        if (str == null) {
            hny.u("Null mediaType");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o35) {
            o35 o35Var = (o35) obj;
            if (this.f24566a == o35Var.f24566a && this.b.equals(o35Var.b) && this.c == o35Var.c && this.d == o35Var.d && this.e == o35Var.e && this.f == o35Var.f && this.g == o35Var.g && this.h == o35Var.h && this.i == o35Var.i && this.j == o35Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j ^ ((((((((((((((((((this.f24566a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.f24566a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", profile=");
        sb.append(this.g);
        sb.append(", bitDepth=");
        sb.append(this.h);
        sb.append(", chromaSubsampling=");
        sb.append(this.i);
        sb.append(", hdrFormat=");
        return rz4.j(this.j, "}", sb);
    }
}
