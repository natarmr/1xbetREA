package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e8o implements g8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7383a;
    public final ArrayList b;

    public e8o(String str, ArrayList arrayList) {
        str.getClass();
        this.f7383a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8o)) {
            return false;
        }
        e8o e8oVar = (e8o) obj;
        return Intrinsics.d(this.f7383a, e8oVar.f7383a) && this.b.equals(e8oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7383a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(id=" + this.f7383a + ", items=" + this.b + Separators.RPAREN;
    }
}
