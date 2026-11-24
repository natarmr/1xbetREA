package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class e640 {
    public static final d640 Companion = new d640();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7263a;

    public /* synthetic */ e640(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f7263a = null;
        } else {
            this.f7263a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e640) && Intrinsics.d(this.f7263a, ((e640) obj).f7263a);
    }

    public final int hashCode() {
        Boolean bool = this.f7263a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "MessageReadResponse(result=" + this.f7263a + Separators.RPAREN;
    }
}
