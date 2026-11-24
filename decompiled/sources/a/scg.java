package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class scg {
    public static final rcg Companion = new rcg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31984a;
    public final i3x b;

    public /* synthetic */ scg(int i, Long l, i3x i3xVar) {
        if ((i & 1) == 0) {
            this.f31984a = null;
        } else {
            this.f31984a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = i3xVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scg)) {
            return false;
        }
        scg scgVar = (scg) obj;
        return Intrinsics.d(this.f31984a, scgVar.f31984a) && Intrinsics.d(this.b, scgVar.b);
    }

    public final int hashCode() {
        Long l = this.f31984a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        i3x i3xVar = this.b;
        return iHashCode + (i3xVar != null ? i3xVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyberChampImagesResponse(feedId=" + this.f31984a + ", images=" + this.b + Separators.RPAREN;
    }
}
