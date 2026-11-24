package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sr40 implements ur40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32658a;

    public sr40(String str) {
        str.getClass();
        this.f32658a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr40) && Intrinsics.d(this.f32658a, ((sr40) obj).f32658a);
    }

    public final int hashCode() {
        return this.f32658a.hashCode();
    }

    public final String toString() {
        return kng0.l("Header(title=", this.f32658a, Separators.RPAREN);
    }
}
