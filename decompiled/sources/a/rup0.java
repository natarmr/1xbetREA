package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rup0 implements sup0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31137a;

    public rup0(String str) {
        str.getClass();
        this.f31137a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rup0) && Intrinsics.d(this.f31137a, ((rup0) obj).f31137a);
    }

    public final int hashCode() {
        return this.f31137a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnOpenTelegramBot(link=", this.f31137a, Separators.RPAREN);
    }
}
