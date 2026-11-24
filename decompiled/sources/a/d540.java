package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class d540 {
    public static final c540 Companion = new c540();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5486a;

    public /* synthetic */ d540(int i, String str) {
        if (1 == (i & 1)) {
            this.f5486a = str;
        } else {
            m2x.I(i, 1, b540.f1983a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d540) && Intrinsics.d(this.f5486a, ((d540) obj).f5486a);
    }

    public final int hashCode() {
        return this.f5486a.hashCode();
    }

    public final String toString() {
        return kng0.l("MessageListRequest(messageIds=", this.f5486a, Separators.RPAREN);
    }

    public d540(String str) {
        this.f5486a = str;
    }
}
