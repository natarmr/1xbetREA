package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tdf {
    public static final rdf Companion = new rdf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m380 f33766a;

    public /* synthetic */ tdf(int i, m380 m380Var) {
        if ((i & 1) == 0) {
            this.f33766a = null;
        } else {
            this.f33766a = m380Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdf) && Intrinsics.d(this.f33766a, ((tdf) obj).f33766a);
    }

    public final int hashCode() {
        m380 m380Var = this.f33766a;
        if (m380Var == null) {
            return 0;
        }
        return m380Var.hashCode();
    }

    public final String toString() {
        return "CricketScoreResponse(wicketScore=" + this.f33766a + Separators.RPAREN;
    }
}
