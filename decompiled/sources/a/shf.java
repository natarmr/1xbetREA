package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class shf implements yhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32208a;
    public final String b;
    public final String c;
    public final boolean d;

    public shf(String str, String str2, String str3, boolean z) {
        brm0.B(str, str2, str3);
        this.f32208a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shf)) {
            return false;
        }
        shf shfVar = (shf) obj;
        return Intrinsics.d(this.f32208a, shfVar.f32208a) && Intrinsics.d(this.b, shfVar.b) && Intrinsics.d(this.c, shfVar.c) && this.d == shfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f32208a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", namesVisibility=", Separators.RPAREN, b1j.n("GameText(playerOneName=", this.f32208a, ", playerTwoName=", this.b, ", matchDescription="), this.d);
    }
}
