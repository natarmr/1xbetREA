package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n4v0<T> implements o4v0 {
    public static final m4v0 Companion = new m4v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22916a;

    static {
        new zna0("org.xplatform.consultantchat.data.models.WebSocketRequest.PingRequest", null, 1).j("$type", true);
    }

    public /* synthetic */ n4v0(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f22916a = 6;
        } else {
            this.f22916a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4v0) && Intrinsics.d(this.f22916a, ((n4v0) obj).f22916a);
    }

    public final int hashCode() {
        Integer num = this.f22916a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f22916a, "PingRequest(type=", Separators.RPAREN);
    }
}
