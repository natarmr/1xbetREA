package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32665a;
    public final String b;

    public sr90(String str, String str2) {
        str2.getClass();
        this.f32665a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr90)) {
            return false;
        }
        sr90 sr90Var = (sr90) obj;
        return this.f32665a.equals(sr90Var.f32665a) && Intrinsics.d(this.b, sr90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32665a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SearchFieldUiModel(value=", this.f32665a, ", hint=", this.b, Separators.RPAREN);
    }
}
