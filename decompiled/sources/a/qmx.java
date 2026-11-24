package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29007a;

    public qmx(String str) {
        this.f29007a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qmx) {
            return l8x.Z(this.f29007a, ((qmx) obj).f29007a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29007a});
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        dq00Var.a(this.f29007a, "token");
        return dq00Var.toString();
    }
}
