package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class af9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f767a;

    public af9(String str) {
        str.getClass();
        this.f767a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af9) && Intrinsics.d(this.f767a, ((af9) obj).f767a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f767a;
    }

    public final int hashCode() {
        return this.f767a.hashCode();
    }

    public final String toString() {
        return kng0.l("CheckPushServiceUiModel(title=", this.f767a, Separators.RPAREN);
    }
}
