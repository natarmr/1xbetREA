package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class mmh implements omh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22037a;

    public mmh(String str) {
        this.f22037a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmh) && this.f22037a.equals(((mmh) obj).f22037a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_cyber_gamepad) + (this.f22037a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_cyber_gamepad, "Available(imageUrl=", this.f22037a, ", placeholderRes=", Separators.RPAREN);
    }
}
