package a;

/* JADX INFO: loaded from: classes.dex */
public final class w35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38484a;
    public final String b;
    public final String c;
    public final String d;

    public w35(String str, String str2, String str3, String str4) {
        this.f38484a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w35)) {
            return false;
        }
        w35 w35Var = (w35) obj;
        return this.f38484a.equals(w35Var.f38484a) && this.b.equals(w35Var.b) && this.c.equals(w35Var.c) && this.d.equals(w35Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.f38484a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f38484a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return axq.n(sb, this.d, "}");
    }
}
