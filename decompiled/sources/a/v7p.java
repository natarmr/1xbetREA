package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v7p implements y7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36939a;

    public v7p(String str) {
        str.getClass();
        this.f36939a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7p) && Intrinsics.d(this.f36939a, ((v7p) obj).f36939a);
    }

    public final int hashCode() {
        return this.f36939a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneTeam(teamLabel=", this.f36939a, Separators.RPAREN);
    }
}
