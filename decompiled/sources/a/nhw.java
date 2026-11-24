package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nhw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23555a;

    public nhw(String str) {
        str.getClass();
        this.f23555a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhw) && Intrinsics.d(this.f23555a, ((nhw) obj).f23555a);
    }

    public final int hashCode() {
        return this.f23555a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPartnerTeamClick(teamName=", this.f23555a, Separators.RPAREN);
    }
}
