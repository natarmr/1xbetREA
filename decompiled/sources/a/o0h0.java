package a;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class o0h0 implements chi0 {
    public static final n0h0 Companion = new n0h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f24424a;

    public /* synthetic */ o0h0(int i, Bundle bundle) {
        if (1 == (i & 1)) {
            this.f24424a = bundle;
        } else {
            m2x.I(i, 1, m0h0.f20954a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0h0) && Intrinsics.d(this.f24424a, ((o0h0) obj).f24424a);
    }

    public final int hashCode() {
        return this.f24424a.hashCode();
    }

    public final String toString() {
        return "SavedStateValue(value=" + this.f24424a + ')';
    }

    public o0h0(Bundle bundle) {
        this.f24424a = bundle;
    }
}
