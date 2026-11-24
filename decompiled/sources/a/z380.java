package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z380 implements b480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43708a;

    public z380(String str) {
        str.getClass();
        this.f43708a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z380) && Intrinsics.d(this.f43708a, ((z380) obj).f43708a);
    }

    public final int hashCode() {
        return this.f43708a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneOpponentUiModel(teamName=", this.f43708a, Separators.RPAREN);
    }
}
