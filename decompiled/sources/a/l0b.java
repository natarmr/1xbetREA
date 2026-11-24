package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19191a;
    public final a4x b;

    public l0b(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f19191a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0b)) {
            return false;
        }
        l0b l0bVar = (l0b) obj;
        return Intrinsics.d(this.f19191a, l0bVar.f19191a) && Intrinsics.d(this.b, l0bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19191a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("CashbackSectionUiState(title=", this.f19191a, ", cells=", this.b, Separators.RPAREN);
    }
}
