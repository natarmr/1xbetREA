package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k9j0 implements l9j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17918a;

    public /* synthetic */ k9j0(String str) {
        this.f17918a = str;
    }

    public static String a(String str) {
        return kng0.l("EndText(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k9j0) {
            return Intrinsics.d(this.f17918a, ((k9j0) obj).f17918a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17918a.hashCode();
    }

    public final String toString() {
        return a(this.f17918a);
    }
}
