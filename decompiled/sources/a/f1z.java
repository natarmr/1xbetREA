package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8790a;
    public final a4x b;

    public f1z(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f8790a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1z)) {
            return false;
        }
        f1z f1zVar = (f1z) obj;
        return Intrinsics.d(this.f8790a, f1zVar.f8790a) && Intrinsics.d(this.b, f1zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8790a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("SectionUiModel(header=", this.f8790a, ", lastGames=", this.b, Separators.RPAREN);
    }
}
