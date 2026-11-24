package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class czk implements dzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o9c f5228a;

    public czk(o9c o9cVar) {
        o9cVar.getClass();
        this.f5228a = o9cVar;
    }

    public static /* synthetic */ czk copy$default(czk czkVar, o9c o9cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            o9cVar = czkVar.f5228a;
        }
        return czkVar.copy(o9cVar);
    }

    public final o9c component1() {
        return this.f5228a;
    }

    public final czk copy(o9c o9cVar) {
        o9cVar.getClass();
        return new czk(o9cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czk) && Intrinsics.d(this.f5228a, ((czk) obj).f5228a);
    }

    public final o9c getCheckedDomain() {
        return this.f5228a;
    }

    public int hashCode() {
        return this.f5228a.hashCode();
    }

    public String toString() {
        return "Success(checkedDomain=" + this.f5228a + Separators.RPAREN;
    }
}
