package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qen {
    public static final pen Companion = new pen();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28592a;
    public final String b;

    public /* synthetic */ qen(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f28592a = null;
        } else {
            this.f28592a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qen)) {
            return false;
        }
        qen qenVar = (qen) obj;
        return Intrinsics.d(this.f28592a, qenVar.f28592a) && Intrinsics.d(this.b, qenVar.b);
    }

    public final int hashCode() {
        String str = this.f28592a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("DurakPlayerStatusResponse(selectedPlayerStr=", this.f28592a, ", actionTypeStr=", this.b, Separators.RPAREN);
    }
}
