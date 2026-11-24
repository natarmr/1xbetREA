package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sgc0 implements tgc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32154a;

    public sgc0(String str) {
        str.getClass();
        this.f32154a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgc0) && Intrinsics.d(this.f32154a, ((sgc0) obj).f32154a);
    }

    public final int hashCode() {
        return this.f32154a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateSubtitle(subtitle=", this.f32154a, Separators.RPAREN);
    }
}
