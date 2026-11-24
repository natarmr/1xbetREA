package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class dmz {
    public static final ylz Companion = new ylz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6341a;
    public final String b;

    public /* synthetic */ dmz(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f6341a = null;
        } else {
            this.f6341a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmz)) {
            return false;
        }
        dmz dmzVar = (dmz) obj;
        return Intrinsics.d(this.f6341a, dmzVar.f6341a) && Intrinsics.d(this.b, dmzVar.b);
    }

    public final int hashCode() {
        Long l = this.f6341a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f6341a, "LigaResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
