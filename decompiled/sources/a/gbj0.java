package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gbj0 implements kbj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hej0 f11017a;

    public final boolean equals(Object obj) {
        if (obj instanceof gbj0) {
            return Intrinsics.d(this.f11017a, ((gbj0) obj).f11017a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11017a.hashCode();
    }

    public final String toString() {
        return "OnSettingsItemClick(settingsUiModel=" + this.f11017a + Separators.RPAREN;
    }
}
