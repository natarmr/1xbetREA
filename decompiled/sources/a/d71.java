package a;

import android.content.Context;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class d71 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5573a;

    public d71(Context context) {
        this.f5573a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d71) && this.f5573a.equals(((d71) obj).f5573a);
    }

    public final int hashCode() {
        return this.f5573a.hashCode();
    }

    public final String toString() {
        return "OnStart(activityContext=" + this.f5573a + Separators.RPAREN;
    }
}
