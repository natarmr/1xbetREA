package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gal0 implements pal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10973a;

    public /* synthetic */ gal0(String str) {
        this.f10973a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gal0) {
            return Intrinsics.d(this.f10973a, ((gal0) obj).f10973a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10973a.hashCode();
    }

    public final String toString() {
        return kng0.l("SingleTeam(name=", this.f10973a, Separators.RPAREN);
    }
}
