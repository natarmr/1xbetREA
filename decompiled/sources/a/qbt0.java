package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qbt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f28454a;
    public final Object b;

    public qbt0(Date date, Object obj) {
        this.f28454a = date;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbt0)) {
            return false;
        }
        qbt0 qbt0Var = (qbt0) obj;
        if (!Intrinsics.d(this.f28454a, qbt0Var.f28454a)) {
            return false;
        }
        Object obj2 = qbt0Var.b;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.b, obj2);
    }

    public final int hashCode() {
        Date date = this.f28454a;
        return j0g0.b(this.b) + ((date == null ? 0 : date.hashCode()) * 31);
    }

    public final String toString() {
        return "UniversalChampResultsModel(selectedDate=" + this.f28454a + ", results=" + j0g0.d(this.b) + Separators.RPAREN;
    }
}
