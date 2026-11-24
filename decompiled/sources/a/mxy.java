package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mxy implements oxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22580a;
    public final d0t b;

    public mxy(long j, d0t d0tVar) {
        d0tVar.getClass();
        this.f22580a = j;
        this.b = d0tVar;
    }

    @Override // a.oxy
    public final long a() {
        return this.b.f5282a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxy)) {
            return false;
        }
        mxy mxyVar = (mxy) obj;
        return this.f22580a == mxyVar.f22580a && Intrinsics.d(this.b, mxyVar.b);
    }

    @Override // a.oxy
    public final long getDate() {
        return this.f22580a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f22580a) * 31);
    }

    public final String toString() {
        return "SportGame(date=" + this.f22580a + ", game=" + this.b + Separators.RPAREN;
    }
}
