package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gfl0 implements hfl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11212a;

    public gfl0(int i) {
        this.f11212a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfl0) && this.f11212a == ((gfl0) obj).f11212a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.attr.uikitSecondary) + (Integer.hashCode(this.f11212a) * 31);
    }

    public final String toString() {
        return ohs0.m("ResourcesUiModel(image=", this.f11212a, ", colorFilter=", Separators.RPAREN, R.attr.uikitSecondary);
    }
}
