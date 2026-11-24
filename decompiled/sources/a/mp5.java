package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22162a;

    public /* synthetic */ mp5(String str) {
        this.f22162a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp5) {
            return Intrinsics.d(this.f22162a, ((mp5) obj).f22162a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22162a.hashCode();
    }

    public final String toString() {
        return kng0.l("Subtitle(value=", this.f22162a, Separators.RPAREN);
    }
}
