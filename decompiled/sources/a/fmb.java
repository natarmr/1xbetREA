package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fmb {
    public static final emb Companion = new emb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9771a;
    public final tzw b;

    public /* synthetic */ fmb(int i, Long l, tzw tzwVar) {
        if ((i & 1) == 0) {
            this.f9771a = null;
        } else {
            this.f9771a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = tzwVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmb)) {
            return false;
        }
        fmb fmbVar = (fmb) obj;
        return Intrinsics.d(this.f9771a, fmbVar.f9771a) && Intrinsics.d(this.b, fmbVar.b);
    }

    public final int hashCode() {
        Long l = this.f9771a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        tzw tzwVar = this.b;
        return iHashCode + (tzwVar != null ? tzwVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChampsImagesResponse(feedId=" + this.f9771a + ", images=" + this.b + Separators.RPAREN;
    }
}
