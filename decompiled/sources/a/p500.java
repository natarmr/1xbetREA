package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class p500 {
    public static final int b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26381a;

    public /* synthetic */ p500(int i) {
        this.f26381a = i;
    }

    public static String a(int i) {
        String str;
        String str2;
        int i2 = i & 255;
        String str3 = "Invalid";
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i2 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i3 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        return axq.n(b1j.n("LineBreak(strategy=", str, ", strictness=", str2, ", wordBreak="), str3, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p500) {
            return this.f26381a == ((p500) obj).f26381a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26381a);
    }

    public final String toString() {
        return a(this.f26381a);
    }
}
