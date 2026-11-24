package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f40017a;
    public final boolean b;
    public final boolean c;

    public wzd(String str, boolean z, boolean z2) {
        str.getClass();
        this.f40017a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzd)) {
            return false;
        }
        wzd wzdVar = (wzd) obj;
        return Intrinsics.d(this.f40017a, wzdVar.f40017a) && this.b == wzdVar.b && this.c == wzdVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(twn.a(R.style.DSButton_Large_Secondary, this.f40017a.hashCode() * 31, 31), 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonModel(text=");
        sb.append((Object) this.f40017a);
        sb.append(", style=");
        sb.append(R.style.DSButton_Large_Secondary);
        sb.append(", visible=");
        return ohs0.p(", enable=", Separators.RPAREN, sb, this.b, this.c);
    }
}
