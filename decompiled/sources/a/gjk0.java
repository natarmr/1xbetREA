package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gjk0 implements y0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11402a;
    public final boolean b;
    public final int c;

    public gjk0(lc00 lc00Var, boolean z, int i) {
        u0f0 u0f0Var = u0f0.f34852a;
        lc00Var.getClass();
        this.f11402a = lc00Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjk0)) {
            return false;
        }
        gjk0 gjk0Var = (gjk0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return Intrinsics.d(this.f11402a, gjk0Var.f11402a) && this.b == gjk0Var.b && this.c == gjk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(dw9.a(u0f0.j.hashCode() * 31, 31, this.f11402a), 31, this.b);
    }

    @Override // a.y0f0
    public final u0f0 q() {
        return u0f0.j;
    }

    public final String toString() {
        return "SocialSectionUiModel(registrationFieldType=" + u0f0.j + ", socials=" + this.f11402a + ", isError=" + this.b + ", columnCount=" + this.c + Separators.RPAREN;
    }
}
