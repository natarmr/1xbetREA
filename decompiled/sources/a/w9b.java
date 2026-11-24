package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w9b implements x9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38770a;
    public final e9b b;

    public w9b(String str, e9b e9bVar) {
        str.getClass();
        this.f38770a = str;
        this.b = e9bVar;
    }

    @Override // a.x9b
    public final int a() {
        return R.color.static_black_40;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9b)) {
            return false;
        }
        w9b w9bVar = (w9b) obj;
        return Intrinsics.d(this.f38770a, w9bVar.f38770a) && this.b.equals(w9bVar.b);
    }

    @Override // a.x9b
    public final e9b getType() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.static_black_40) + ((this.b.hashCode() + (this.f38770a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(value=");
        sb.append(this.f38770a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return rz4.j(R.color.static_black_40, Separators.RPAREN, sb);
    }
}
