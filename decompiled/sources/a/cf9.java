package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cf9 extends ff9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4249a;

    public cf9(String str) {
        str.getClass();
        this.f4249a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf9) && Intrinsics.d(this.f4249a, ((cf9) obj).f4249a);
    }

    @Override // a.ff9
    public final String getTitle() {
        return this.f4249a;
    }

    public final int hashCode() {
        return this.f4249a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendNotificationUiModel(title=", this.f4249a, Separators.RPAREN);
    }
}
