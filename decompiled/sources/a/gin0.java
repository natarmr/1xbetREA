package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11357a;
    public final String b;
    public final String c;

    public gin0(String str, String str2, String str3) {
        str3.getClass();
        this.f11357a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gin0)) {
            return false;
        }
        gin0 gin0Var = (gin0) obj;
        return this.f11357a.equals(gin0Var.f11357a) && this.b.equals(gin0Var.b) && Intrinsics.d(this.c, gin0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f11357a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("SummarySectionUiModel(leftCount=", this.f11357a, ", rightCount=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
