package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dqq0 implements hqq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f6529a;

    public /* synthetic */ dqq0(a4x a4xVar) {
        this.f6529a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dqq0) {
            return this.f6529a.equals(((dqq0) obj).f6529a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6529a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f6529a, "Content(tirageUiItems=", Separators.RPAREN);
    }
}
