package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class svw implements tvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32891a;

    public /* synthetic */ svw(int i) {
        this.f32891a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof svw) {
            return this.f32891a == ((svw) obj).f32891a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32891a);
    }

    public final String toString() {
        return ua80.e(this.f32891a, "ResourcesUiModel(image=", Separators.RPAREN);
    }
}
