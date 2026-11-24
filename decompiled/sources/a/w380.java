package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w380 implements y380 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wav0 f38489a;

    public final boolean equals(Object obj) {
        if (obj instanceof w380) {
            return this.f38489a.equals(((w380) obj).f38489a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38489a.hashCode();
    }

    public final String toString() {
        return "OnCardAction(action=" + this.f38489a + Separators.RPAREN;
    }
}
