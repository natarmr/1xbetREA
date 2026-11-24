package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gfh0 implements hfh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f11208a;
    public final sah0 b;
    public final ygh0 c;

    public gfh0(i4 i4Var, sah0 sah0Var, ygh0 ygh0Var) {
        i4Var.getClass();
        sah0Var.getClass();
        this.f11208a = i4Var;
        this.b = sah0Var;
        this.c = ygh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfh0)) {
            return false;
        }
        gfh0 gfh0Var = (gfh0) obj;
        return Intrinsics.d(this.f11208a, gfh0Var.f11208a) && this.b == gfh0Var.b && this.c.equals(gfh0Var.c);
    }

    public final int hashCode() {
        return this.c.f42584a.hashCode() + ((this.b.hashCode() + (this.f11208a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UpcomingEvents(content=" + this.f11208a + ", scrollType=" + this.b + ", scrollModel=" + this.c + Separators.RPAREN;
    }
}
