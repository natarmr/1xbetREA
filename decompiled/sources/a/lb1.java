package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19734a;

    public lb1(String str) {
        str.getClass();
        this.f19734a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lb1) && Intrinsics.d(this.f19734a, ((lb1) obj).f19734a);
    }

    public final int hashCode() {
        return this.f19734a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowGameModePicker(gameName=", this.f19734a, Separators.RPAREN);
    }
}
