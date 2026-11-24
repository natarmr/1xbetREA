package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tgt0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f33930a;

    public tgt0(mdm mdmVar) {
        this.f33930a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgt0) && this.f33930a.equals(((tgt0) obj).f33930a);
    }

    public final int hashCode() {
        return this.f33930a.hashCode();
    }

    public final String toString() {
        return b1j.j("UpcomingEventsUiModel(config=", this.f33930a, Separators.RPAREN);
    }
}
