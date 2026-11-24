package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wd9 implements zd9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38962a;

    public wd9(String str) {
        str.getClass();
        this.f38962a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd9) && Intrinsics.d(this.f38962a, ((wd9) obj).f38962a);
    }

    public final int hashCode() {
        return this.f38962a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowEmulator(message=", this.f38962a, Separators.RPAREN);
    }
}
