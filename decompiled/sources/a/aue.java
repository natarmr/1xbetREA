package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aue implements cue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1474a;

    public aue(String str) {
        str.getClass();
        this.f1474a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aue) && Intrinsics.d(this.f1474a, ((aue) obj).f1474a);
    }

    public final int hashCode() {
        return this.f1474a.hashCode();
    }

    public final String toString() {
        return kng0.l("SingleTeam(teamName=", this.f1474a, Separators.RPAREN);
    }
}
