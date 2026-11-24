package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30033a;

    public r8l(String str) {
        str.getClass();
        this.f30033a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8l) && Intrinsics.d(this.f30033a, ((r8l) obj).f30033a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_dire_dot) + (this.f30033a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.dota_dire_dot, "DireSide(title=", this.f30033a, ", icon=", Separators.RPAREN);
    }
}
