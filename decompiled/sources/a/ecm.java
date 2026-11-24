package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ecm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7573a;

    public ecm(String str) {
        str.getClass();
        this.f7573a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecm) && Intrinsics.d(this.f7573a, ((ecm) obj).f7573a);
    }

    public final int hashCode() {
        return this.f7573a.hashCode();
    }

    public final String toString() {
        return kng0.l("DsCyberTopInfoTitleUiModel(title=", this.f7573a, Separators.RPAREN);
    }
}
