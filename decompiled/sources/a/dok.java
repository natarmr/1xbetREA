package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class dok implements eok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6419a;
    public final String b;
    public final String c;
    public final i8m d;

    public dok(String str, String str2, String str3, i8m i8mVar) {
        str2.getClass();
        this.f6419a = str;
        this.b = str2;
        this.c = str3;
        this.d = i8mVar;
    }

    @Override // a.eok
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dok)) {
            return false;
        }
        dok dokVar = (dok) obj;
        return this.f6419a.equals(dokVar.f6419a) && Intrinsics.d(this.b, dokVar.b) && this.c.equals(dokVar.c) && this.d.equals(dokVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f6419a;
    }

    @Override // a.eok
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.f14346a.hashCode() + twn.a(R.drawable.discipline_block_placeholder, ua80.b(ua80.b(this.f6419a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("IconCollection(key=", this.f6419a, ", title=", this.b, ", image=");
        twn.w(R.drawable.discipline_block_placeholder, this.c, ", placeholderRes=", ", disciplines=", sbN);
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
