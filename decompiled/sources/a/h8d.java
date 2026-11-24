package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h8d {
    public static final h8d b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12619a;

    static {
        j8d j8dVar = j8d.f16077a;
        b = new h8d("");
    }

    public h8d(String str) {
        j8d j8dVar = j8d.f16077a;
        str.getClass();
        this.f12619a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8d)) {
            return false;
        }
        j8d j8dVar = j8d.f16077a;
        return Intrinsics.d(this.f12619a, ((h8d) obj).f12619a);
    }

    public final int hashCode() {
        return this.f12619a.hashCode() + (j8d.f16077a.hashCode() * 31);
    }

    public final String toString() {
        return "CommandModel(commandType=" + j8d.f16077a + ", variantId=" + this.f12619a + Separators.RPAREN;
    }
}
