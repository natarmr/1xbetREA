package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sur implements tur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f32835a;

    public final boolean equals(Object obj) {
        if (obj instanceof sur) {
            return this.f32835a.equals(((sur) obj).f32835a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32835a.hashCode();
    }

    public final String toString() {
        return axq.i("Timer(value=", this.f32835a, Separators.RPAREN);
    }
}
