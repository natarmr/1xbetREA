package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vvo implements wvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38110a;
    public final jvo b;
    public final boolean c;

    public vvo(List list, jvo jvoVar, boolean z) {
        list.getClass();
        this.f38110a = list;
        this.b = jvoVar;
        this.c = z;
    }

    @Override // a.wvo
    public final boolean a() {
        return this.c;
    }

    @Override // a.wvo
    public final jvo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvo)) {
            return false;
        }
        vvo vvoVar = (vvo) obj;
        return Intrinsics.d(this.f38110a, vvoVar.f38110a) && this.b.equals(vvoVar.b) && this.c == vvoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f38110a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(facts=");
        sb.append(this.f38110a);
        sb.append(", headerUiState=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
