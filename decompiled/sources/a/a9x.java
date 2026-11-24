package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a9x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f497a;
    public final String b;

    public a9x(String str, String str2) {
        str2.getClass();
        this.f497a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9x)) {
            return false;
        }
        a9x a9xVar = (a9x) obj;
        return this.f497a.equals(a9xVar.f497a) && Intrinsics.d(this.b, a9xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f497a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("InfoItemUiModel(nameTitle=", this.f497a, ", textInfo=", this.b, Separators.RPAREN);
    }
}
