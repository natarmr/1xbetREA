package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oik0 implements pik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25317a;

    public final boolean equals(Object obj) {
        if (obj instanceof oik0) {
            return this.f25317a.equals(((oik0) obj).f25317a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25317a.hashCode();
    }

    public final String toString() {
        return hne.o("SocialContent(socials=", Separators.RPAREN, this.f25317a);
    }
}
