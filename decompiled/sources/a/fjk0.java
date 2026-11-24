package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fjk0 implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9645a;
    public final boolean b;
    public final int c;

    public fjk0(lc00 lc00Var, boolean z, int i) {
        u0f0 u0f0Var = u0f0.f34852a;
        lc00Var.getClass();
        this.f9645a = lc00Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjk0)) {
            return false;
        }
        fjk0 fjk0Var = (fjk0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f9645a, fjk0Var.f9645a) && this.b == fjk0Var.b && this.c == fjk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(dw9.a(u0f0.j.hashCode() * 31, 31, this.f9645a), 31, this.b);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.j;
    }

    public final String toString() {
        return "SocialSectionUiModel(registrationFieldType=" + u0f0.j + ", socials=" + this.f9645a + ", isError=" + this.b + ", columnCount=" + this.c + Separators.RPAREN;
    }
}
