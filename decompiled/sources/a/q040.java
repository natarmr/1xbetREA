package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class q040 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f27878a;
    public final boolean b;
    public final boolean c;

    public q040(r040 r040Var, boolean z, boolean z2) {
        this.f27878a = r040Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q040)) {
            return false;
        }
        q040 q040Var = (q040) obj;
        return this.f27878a == q040Var.f27878a && this.b == q040Var.b && this.c == q040Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f27878a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuScreenSettings(currentMenuSectionType=");
        sb.append(this.f27878a);
        sb.append(", showChangeAccountDialog=");
        sb.append(this.b);
        sb.append(", openTgBot=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
