package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qng0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29027a;
    public final String b;

    public qng0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f29027a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qng0)) {
            return false;
        }
        qng0 qng0Var = (qng0) obj;
        return Intrinsics.d(this.f29027a, qng0Var.f29027a) && Intrinsics.d(this.b, qng0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29027a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("RulesUiModel(descriptionFirstRule=", this.f29027a, ", descriptionSecondRule=", this.b, Separators.RPAREN);
    }
}
