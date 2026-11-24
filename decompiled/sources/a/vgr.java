package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vgr extends mir {
    public static final ugr Companion = new ugr();
    public final boolean c;
    public final Integer d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgr(int i, Integer num, String str, String str2, boolean z) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, tgr.f33927a.getDescriptor());
            throw null;
        }
        this.c = z;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 8) == 0) {
            this.e = "GPWebAppSetFreezeAccount";
        } else {
            this.e = str2;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgr)) {
            return false;
        }
        vgr vgrVar = (vgr) obj;
        return this.c == vgrVar.c && Intrinsics.d(this.d, vgrVar.d) && Intrinsics.d(this.e, vgrVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.c) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GPWebAppSetFreezeAccount(freeze=");
        sb.append(this.c);
        sb.append(", accountId=");
        sb.append(this.d);
        sb.append(", eventName=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
