package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class byr implements eyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3432a;
    public final String b;
    public final String c;
    public final boolean d;

    public byr(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f3432a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byr)) {
            return false;
        }
        byr byrVar = (byr) obj;
        return this.f3432a == byrVar.f3432a && Intrinsics.d(this.b, byrVar.b) && this.c.equals(byrVar.c) && this.d == byrVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(R.drawable.no_photo_new, ua80.b(ua80.b(Long.hashCode(this.f3432a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f3432a, "TeamFirst(id=", ", title=", this.b);
        axq.s(R.drawable.no_photo_new, ", icon=", this.c, ", placeholderRes=", sbO);
        return f140.n(sbO, ", iconVisible=", this.d, Separators.RPAREN);
    }
}
