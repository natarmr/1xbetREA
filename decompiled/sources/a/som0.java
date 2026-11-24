package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class som0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32550a;
    public final String b;
    public final tom0 c;

    public som0(String str, String str2, tom0 tom0Var) {
        this.f32550a = str;
        this.b = str2;
        this.c = tom0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof som0)) {
            return false;
        }
        som0 som0Var = (som0) obj;
        return this.f32550a.equals(som0Var.f32550a) && this.b.equals(som0Var.b) && this.c.equals(som0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f32550a, this.b, this.c);
    }
}
