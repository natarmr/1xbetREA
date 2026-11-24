package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ush0 implements fth0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36211a;
    public final int b;
    public final boolean c;

    public ush0(int i, int i2, boolean z) {
        this.f36211a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ush0)) {
            return false;
        }
        ush0 ush0Var = (ush0) obj;
        return this.f36211a == ush0Var.f36211a && this.b == ush0Var.b && this.c == ush0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(brm0.e(twn.a(this.b, twn.a(R.string.security_level_description, Integer.hashCode(this.f36211a) * 31, 31), 31), 31, this.c), 31, true);
    }

    public final String toString() {
        return ohs0.k(this.b, ", levelDescriptionVisible=", ", isFirst=true, isLast=true)", dw9.t("Level(title=", this.f36211a, ", description=", ", securityIconColor=", R.string.security_level_description), this.c);
    }
}
