package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rd80 implements ud80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30279a;
    public final String b;

    public rd80(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f30279a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd80)) {
            return false;
        }
        rd80 rd80Var = (rd80) obj;
        return Intrinsics.d(this.f30279a, rd80Var.f30279a) && Intrinsics.d(this.b, rd80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30279a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OutcomeHeaderUiModel(champName=", this.f30279a, ", champImageUrl=", this.b, Separators.RPAREN);
    }
}
