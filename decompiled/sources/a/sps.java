package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sps {
    public static final rps Companion = new rps();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32600a;

    public /* synthetic */ sps(int i, String str) {
        if ((i & 1) == 0) {
            this.f32600a = null;
        } else {
            this.f32600a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sps) && Intrinsics.d(this.f32600a, ((sps) obj).f32600a);
    }

    public final int hashCode() {
        String str = this.f32600a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("LigaResponse(name=", this.f32600a, Separators.RPAREN);
    }
}
