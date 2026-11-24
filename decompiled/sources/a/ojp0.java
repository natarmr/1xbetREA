package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ojp0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25370a;
    public final int b;
    public final int c;

    public ojp0(int i, int i2, int i3) {
        this.f25370a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojp0)) {
            return false;
        }
        ojp0 ojp0Var = (ojp0) obj;
        return this.f25370a == ojp0Var.f25370a && this.b == ojp0Var.b && this.c == ojp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f25370a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("TeamSelectorModel(gameId=", this.f25370a, ", playerId=", ", teamId=", this.b));
    }
}
