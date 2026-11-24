package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cck0 implements dck0 {
    public static final bck0 Companion = new bck0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4116a;

    public /* synthetic */ cck0(int i, String str) {
        if (1 == (i & 1)) {
            this.f4116a = str;
        } else {
            m2x.I(i, 1, ack0.f632a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cck0) && Intrinsics.d(this.f4116a, ((cck0) obj).f4116a);
    }

    public final int hashCode() {
        return this.f4116a.hashCode();
    }

    public final String toString() {
        return kng0.l("VoiceCallDataRequest(codeType=", this.f4116a, Separators.RPAREN);
    }

    public cck0(String str) {
        this.f4116a = str;
    }
}
