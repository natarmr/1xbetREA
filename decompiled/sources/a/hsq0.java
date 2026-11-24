package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hsq0 extends psq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13597a;

    public hsq0(String str) {
        uwx uwxVar = uwx.f36413a;
        str.getClass();
        this.f13597a = str;
    }

    @Override // a.psq0
    public final uwx c() {
        return uwx.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsq0) || !Intrinsics.d(this.f13597a, ((hsq0) obj).f13597a)) {
            return false;
        }
        uwx uwxVar = uwx.f36413a;
        return true;
    }

    @Override // a.psq0
    public final String getTitle() {
        return this.f13597a;
    }

    public final int hashCode() {
        return uwx.c.hashCode() + (this.f13597a.hashCode() * 31);
    }

    public final String toString() {
        return "ModuleInfo(title=" + this.f13597a + ", itemPosition=" + uwx.c + Separators.RPAREN;
    }
}
