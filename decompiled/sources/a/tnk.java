package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class tnk implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34239a;

    public tnk(String str) {
        this.f34239a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnk) && this.f34239a.equals(((tnk) obj).f34239a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.cybergames_discipline_placeholder) + (this.f34239a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.cybergames_discipline_placeholder, "Image(imageUrl=", this.f34239a, ", placeHolder=", Separators.RPAREN);
    }
}
