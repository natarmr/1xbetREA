package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class atf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1430a;
    public final psq b;
    public final osq c;

    public atf0(int i, psq psqVar, osq osqVar) {
        this.f1430a = i;
        this.b = psqVar;
        this.c = osqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atf0)) {
            return false;
        }
        atf0 atf0Var = (atf0) obj;
        return this.f1430a == atf0Var.f1430a && Intrinsics.d(this.b, atf0Var.b) && this.c.equals(atf0Var.c);
    }

    public final int hashCode() {
        return this.c.f25794a.hashCode() + twn.a(0, twn.a(0, ((this.f1430a * 31) + this.b.f27526a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f1430a + ", weight=" + this.b + ", style=Normal, loadingStrategy=Blocking)";
    }
}
