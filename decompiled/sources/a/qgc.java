package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28677a;
    public final List b;

    public qgc(String str, List list) {
        list.getClass();
        this.f28677a = str;
        this.b = list;
    }

    public static qgc a(qgc qgcVar, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = qgcVar.f28677a;
        }
        if ((i & 2) != 0) {
            list = qgcVar.b;
        }
        qgcVar.getClass();
        list.getClass();
        return new qgc(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgc)) {
            return false;
        }
        qgc qgcVar = (qgc) obj;
        return this.f28677a.equals(qgcVar.f28677a) && Intrinsics.d(this.b, qgcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28677a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("State(searchQuery=", this.f28677a, ", languageList=", this.b, Separators.RPAREN);
    }
}
