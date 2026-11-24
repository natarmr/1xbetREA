package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class psq implements Comparable {
    public static final psq b;
    public static final psq c;
    public static final psq d;
    public static final psq e;
    public static final psq f;
    public static final psq g;
    public static final List h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27526a;

    static {
        psq psqVar = new psq(100);
        psq psqVar2 = new psq(Response.OK);
        psq psqVar3 = new psq(300);
        psq psqVar4 = new psq(Response.BAD_REQUEST);
        b = psqVar4;
        psq psqVar5 = new psq(500);
        c = psqVar5;
        psq psqVar6 = new psq(Response.BUSY_EVERYWHERE);
        d = psqVar6;
        psq psqVar7 = new psq(700);
        psq psqVar8 = new psq(800);
        psq psqVar9 = new psq(900);
        e = psqVar4;
        f = psqVar5;
        g = psqVar7;
        h = q3d.j(psqVar, psqVar2, psqVar3, psqVar4, psqVar5, psqVar6, psqVar7, psqVar8, psqVar9);
    }

    public psq(int i) {
        this.f27526a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        ycx.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(psq psqVar) {
        return Intrinsics.e(this.f27526a, psqVar.f27526a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof psq) {
            return this.f27526a == ((psq) obj).f27526a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27526a;
    }

    public final String toString() {
        return ua80.e(this.f27526a, "FontWeight(weight=", Separators.RPAREN);
    }
}
