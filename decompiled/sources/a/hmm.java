package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13315a;
    public final sfh0 b;
    public final String c;
    public final boolean d;

    public /* synthetic */ hmm(int i, String str, String str2, boolean z) {
        this((i & 1) != 0 ? "" : str, qfh0.f28634a, str2, (i & 8) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmm)) {
            return false;
        }
        hmm hmmVar = (hmm) obj;
        return Intrinsics.d(this.f13315a, hmmVar.f13315a) && Intrinsics.d(this.b, hmmVar.b) && Intrinsics.d(this.c, hmmVar.c) && this.d == hmmVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13315a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsNavigationBarSearchFieldUiModel(query=");
        sb.append(this.f13315a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", hint=");
        return defpackage.c.c(this.c, ", autoFocus=", Separators.RPAREN, sb, this.d);
    }

    public hmm(String str, sfh0 sfh0Var, String str2, boolean z) {
        str.getClass();
        this.f13315a = str;
        this.b = sfh0Var;
        this.c = str2;
        this.d = z;
    }
}
