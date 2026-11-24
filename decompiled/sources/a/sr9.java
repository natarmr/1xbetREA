package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sr9 implements ur9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32664a;
    public final String b;
    public final int c;

    public sr9(int i, String str, String str2) {
        str.getClass();
        this.f32664a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr9)) {
            return false;
        }
        sr9 sr9Var = (sr9) obj;
        return Intrinsics.d(this.f32664a, sr9Var.f32664a) && this.b.equals(sr9Var.b) && this.c == sr9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f32664a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("Assessed(title=", this.f32664a, ", subtitle=", this.b, ", starRating="));
    }
}
