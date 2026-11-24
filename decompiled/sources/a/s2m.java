package a;

import android.gov.nist.core.Separators;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s2m implements t2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31508a;
    public final u6n b;
    public final String c;

    public s2m(u6n u6nVar, String str) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        str.getClass();
        this.f31508a = string;
        this.b = u6nVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2m)) {
            return false;
        }
        s2m s2mVar = (s2m) obj;
        return this.f31508a.equals(s2mVar.f31508a) && this.b.equals(s2mVar.b) && Intrinsics.d(this.c, s2mVar.c);
    }

    @Override // a.t2m
    public final String getId() {
        return this.f31508a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f31508a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogoLabel(id=");
        sb.append(this.f31508a);
        sb.append(", logoModel=");
        sb.append(this.b);
        sb.append(", label=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
