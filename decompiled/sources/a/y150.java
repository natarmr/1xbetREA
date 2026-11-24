package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y150 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41839a;
    public final ozh b;

    public y150(String str, ozh ozhVar) {
        str.getClass();
        this.f41839a = str;
        this.b = ozhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y150)) {
            return false;
        }
        y150 y150Var = (y150) obj;
        return Intrinsics.d(this.f41839a, y150Var.f41839a) && this.b.equals(y150Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f41839a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41839a.hashCode() * 31);
    }

    public final String toString() {
        return "DailyTasksWidget(key=" + this.f41839a + ", model=" + this.b + Separators.RPAREN;
    }
}
