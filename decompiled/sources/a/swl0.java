package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class swl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32927a;
    public final String b;

    public swl0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f32927a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swl0)) {
            return false;
        }
        swl0 swl0Var = (swl0) obj;
        return Intrinsics.d(this.f32927a, swl0Var.f32927a) && Intrinsics.d(this.b, swl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32927a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StadiumInfoUiModel(title=", this.f32927a, ", value=", this.b, Separators.RPAREN);
    }
}
