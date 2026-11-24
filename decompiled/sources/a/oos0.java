package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oos0 implements qos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25608a;

    public oos0(String str) {
        str.getClass();
        this.f25608a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oos0) && Intrinsics.d(this.f25608a, ((oos0) obj).f25608a);
    }

    public final int hashCode() {
        return this.f25608a.hashCode();
    }

    public final String toString() {
        return kng0.l("Media(mediaId=", this.f25608a, Separators.RPAREN);
    }
}
