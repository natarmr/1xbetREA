package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class x080 {
    public static final w080 Companion = new w080();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40060a;

    public /* synthetic */ x080(int i, Integer num) {
        if ((i & 1) == 0) {
            this.f40060a = null;
        } else {
            this.f40060a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x080) && Intrinsics.d(this.f40060a, ((x080) obj).f40060a);
    }

    public final int hashCode() {
        Integer num = this.f40060a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return h97.j(this.f40060a, "RequestPayload(operationType=", Separators.RPAREN);
    }

    public x080(Integer num) {
        this.f40060a = num;
    }
}
