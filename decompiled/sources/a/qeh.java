package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qeh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28583a;
    public final ieh b;

    public qeh(List list, ieh iehVar) {
        list.getClass();
        this.f28583a = list;
        this.b = iehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeh)) {
            return false;
        }
        qeh qehVar = (qeh) obj;
        return Intrinsics.d(this.f28583a, qehVar.f28583a) && this.b.equals(qehVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28583a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberStageTableInfoModel(groups=" + this.f28583a + ", table=" + this.b + Separators.RPAREN;
    }
}
