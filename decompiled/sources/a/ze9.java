package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ze9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44240a;

    public ze9(String str) {
        str.getClass();
        this.f44240a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze9) && Intrinsics.d(this.f44240a, ((ze9) obj).f44240a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f44240a;
    }

    public final int hashCode() {
        return this.f44240a.hashCode();
    }

    public final String toString() {
        return kng0.l("CheckEmulatorUiModel(title=", this.f44240a, Separators.RPAREN);
    }
}
