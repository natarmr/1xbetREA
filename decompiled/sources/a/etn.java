package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class etn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8383a;

    public /* synthetic */ etn(int i) {
        this.f8383a = i;
    }

    public static String a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : ua80.e(i, "Invalid(value=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof etn) {
            return this.f8383a == ((etn) obj).f8383a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8383a);
    }

    public final String toString() {
        return a(this.f8383a);
    }
}
