package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sqh implements wqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32629a;
    public final r0n b;
    public final String c;
    public final String d;

    public sqh(String str, r0n r0nVar, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f32629a = str;
        this.b = r0nVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqh)) {
            return false;
        }
        sqh sqhVar = (sqh) obj;
        return this.f32629a.equals(sqhVar.f32629a) && this.b.equals(sqhVar.b) && Intrinsics.d(this.c, sqhVar.c) && Intrinsics.d(this.d, sqhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f32629a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(opponentName=");
        sb.append(this.f32629a);
        sb.append(", timerOption=");
        sb.append(this.b);
        sb.append(", mainInfoLabel=");
        return ua80.m(sb, this.c, ", additionalInfoLabel=", this.d, Separators.RPAREN);
    }
}
