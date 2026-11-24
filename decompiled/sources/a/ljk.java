package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ljk implements pf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20156a;
    public final ob50 b;
    public final List c;
    public final List d;
    public final fjk e;
    public final rip f;
    public final List g;
    public final ugd h = new ugd(-1734138355, true, new kjk(this, (byte) 0));

    public ljk(Object obj, ob50 ob50Var, List list, List list2, fjk fjkVar, rip ripVar) {
        this.f20156a = obj;
        this.b = ob50Var;
        this.c = list;
        this.d = list2;
        this.e = fjkVar;
        this.f = ripVar;
        this.g = kotlin.collections.a.c(ob50Var);
    }

    @Override // a.y1h0
    public final List a() {
        return this.c;
    }

    @Override // a.pf80
    public final List b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ljk.class != obj.getClass()) {
            return false;
        }
        ljk ljkVar = (ljk) obj;
        return Intrinsics.d(this.f20156a, ljkVar.f20156a) && Intrinsics.d(this.c, ljkVar.c) && Intrinsics.d(this.d, ljkVar.d) && this.b.equals(ljkVar.b) && this.e.equals(ljkVar.e);
    }

    @Override // a.y1h0
    public final ugd getContent() {
        return this.h;
    }

    @Override // a.y1h0
    public final List getEntries() {
        return this.g;
    }

    @Override // a.y1h0
    public final Object getKey() {
        return this.f20156a;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + (this.b.hashCode() * 31) + (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.f20156a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogScene(key=");
        sb.append(this.f20156a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", previousEntries=");
        b1j.y(", overlaidEntries=", ", dialogProperties=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
