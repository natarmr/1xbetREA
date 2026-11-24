package a;

import android.content.Context;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ss0 implements vs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32704a;

    public ss0(Context context) {
        this.f32704a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss0) && this.f32704a.equals(((ss0) obj).f32704a);
    }

    public final int hashCode() {
        return this.f32704a.hashCode();
    }

    public final String toString() {
        return "OnStart(activityContext=" + this.f32704a + Separators.RPAREN;
    }
}
