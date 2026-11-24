package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class k9n implements m9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17922a;

    public k9n(String str) {
        str.getClass();
        this.f17922a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9n) && Intrinsics.d(this.f17922a, ((k9n) obj).f17922a);
    }

    @Override // a.m9n
    public final long getId() {
        return -1L;
    }

    public final int hashCode() {
        return this.f17922a.hashCode() + twn.a(R.drawable.ic_glyph_plus_small, Long.hashCode(-1L) * 31, 31);
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_glyph_plus_small, "Action(id=-1, iconRes=", ", label=", this.f17922a, Separators.RPAREN);
    }
}
