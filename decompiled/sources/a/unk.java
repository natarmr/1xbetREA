package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class unk implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35966a;

    public /* synthetic */ unk(String str) {
        this.f35966a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof unk) {
            return Intrinsics.d(this.f35966a, ((unk) obj).f35966a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35966a.hashCode();
    }

    public final String toString() {
        return kng0.l("Subtitle(value=", this.f35966a, Separators.RPAREN);
    }
}
