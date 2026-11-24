package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class e6k {
    public static final a6k Companion = new a6k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6k f7288a;

    public /* synthetic */ e6k(int i, d6k d6kVar) {
        if ((i & 1) == 0) {
            this.f7288a = null;
        } else {
            this.f7288a = d6kVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6k) && Intrinsics.d(this.f7288a, ((e6k) obj).f7288a);
    }

    public final int hashCode() {
        d6k d6kVar = this.f7288a;
        if (d6kVar == null) {
            return 0;
        }
        return d6kVar.hashCode();
    }

    public final String toString() {
        return "DeleteRequestedCallbackRequestWithGuid(data=" + this.f7288a + Separators.RPAREN;
    }

    public e6k(d6k d6kVar) {
        this.f7288a = d6kVar;
    }
}
