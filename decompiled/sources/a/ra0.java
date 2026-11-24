package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ra0 implements pe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30110a;

    public ra0(String str) {
        str.getClass();
        this.f30110a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra0) && Intrinsics.d(this.f30110a, ((ra0) obj).f30110a);
    }

    public final int hashCode() {
        return this.f30110a.hashCode() + twn.a(R.drawable.ic_glyph_plus_small, Long.hashCode(-1L) * 31, 31);
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_glyph_plus_small, "AggregatorActionCardUiModel(id=-1, iconRes=", ", label=", this.f30110a, Separators.RPAREN);
    }
}
