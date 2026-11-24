package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xx70 implements zx70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41643a;

    public final boolean equals(Object obj) {
        if (obj instanceof xx70) {
            return this.f41643a.equals(((xx70) obj).f41643a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41643a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnOpenTelegramBot(link=", this.f41643a, Separators.RPAREN);
    }
}
