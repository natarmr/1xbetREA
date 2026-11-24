package a;

import android.content.Intent;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class flx implements glx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f9758a;

    public flx(Intent intent) {
        this.f9758a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof flx) && this.f9758a.equals(((flx) obj).f9758a);
    }

    public final int hashCode() {
        return this.f9758a.hashCode();
    }

    public final String toString() {
        return "Object(intent=" + this.f9758a + Separators.RPAREN;
    }
}
