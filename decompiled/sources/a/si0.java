package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class si0 implements ti0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32239a;

    public si0(String str) {
        str.getClass();
        this.f32239a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si0) && Intrinsics.d(this.f32239a, ((si0) obj).f32239a);
    }

    public final int hashCode() {
        return this.f32239a.hashCode();
    }

    public final String toString() {
        return kng0.l("Text(title=", this.f32239a, Separators.RPAREN);
    }
}
