package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ajg implements v7h0 {
    public static final zig Companion = new zig();
    public static final a8z[] b = {maz.a(wez.f39042a, new jcg(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f974a;

    public /* synthetic */ ajg(int i, sip sipVar) {
        if (1 == (i & 1)) {
            this.f974a = sipVar;
        } else {
            m2x.I(i, 1, yig.f42688a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajg) && this.f974a == ((ajg) obj).f974a;
    }

    public final int hashCode() {
        return this.f974a.hashCode();
    }

    public final String toString() {
        return "CyberChampsRoute(feedKind=" + this.f974a + Separators.RPAREN;
    }

    public ajg(sip sipVar) {
        this.f974a = sipVar;
    }
}
