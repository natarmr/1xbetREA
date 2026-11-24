package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sx20 implements ux20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f32953a;

    public sx20(jkm jkmVar) {
        jkmVar.getClass();
        this.f32953a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx20) && Intrinsics.d(this.f32953a, ((sx20) obj).f32953a);
    }

    public final int hashCode() {
        return this.f32953a.hashCode();
    }

    public final String toString() {
        return twn.o("ErrorWithTimer(lottieConfig=", this.f32953a, Separators.RPAREN);
    }
}
