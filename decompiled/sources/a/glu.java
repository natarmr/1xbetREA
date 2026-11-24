package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class glu {
    public static final flu Companion = new flu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11513a;

    public /* synthetic */ glu(int i, String str) {
        if ((i & 1) == 0) {
            this.f11513a = null;
        } else {
            this.f11513a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glu) && Intrinsics.d(this.f11513a, ((glu) obj).f11513a);
    }

    public final int hashCode() {
        String str = this.f11513a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("GetMediaIdResponse(mediaId=", this.f11513a, Separators.RPAREN);
    }
}
