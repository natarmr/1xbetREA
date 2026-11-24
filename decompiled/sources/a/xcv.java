package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xcv implements zcv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40667a;

    public xcv(String str) {
        str.getClass();
        this.f40667a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xcv) && Intrinsics.d(this.f40667a, ((xcv) obj).f40667a);
    }

    public final int hashCode() {
        return this.f40667a.hashCode();
    }

    public final String toString() {
        return kng0.l("SeasonSelected(id=", this.f40667a, Separators.RPAREN);
    }
}
