package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class slk0 implements l3q, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32404a;
    public final String b;
    public final String c;
    public final String d;

    public slk0(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f32404a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slk0)) {
            return false;
        }
        slk0 slk0Var = (slk0) obj;
        return Intrinsics.d(this.f32404a, slk0Var.f32404a) && Intrinsics.d(this.b, slk0Var.b) && Intrinsics.d(this.c, slk0Var.c) && Intrinsics.d(this.d, slk0Var.d);
    }

    @Override // a.l3q
    public final String getId() {
        return this.f32404a;
    }

    @Override // a.l3q
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f32404a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("SortingOptionModel(id=", this.f32404a, ", name=", this.b, ", attribute="), this.c, ", direction=", this.d, Separators.RPAREN);
    }
}
