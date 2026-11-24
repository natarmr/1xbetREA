package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m8t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21385a;
    public final List b;
    public final boolean c;

    public m8t(List list, boolean z, boolean z2) {
        list.getClass();
        this.f21385a = z;
        this.b = list;
        this.c = z2;
    }

    public static m8t a(m8t m8tVar, boolean z, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = m8tVar.f21385a;
        }
        if ((i & 2) != 0) {
            list = m8tVar.b;
        }
        if ((i & 4) != 0) {
            z2 = m8tVar.c;
        }
        m8tVar.getClass();
        list.getClass();
        return new m8t(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8t)) {
            return false;
        }
        m8t m8tVar = (m8t) obj;
        return this.f21385a == m8tVar.f21385a && Intrinsics.d(this.b, m8tVar.b) && this.c == m8tVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dw9.a(Boolean.hashCode(this.f21385a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PuzzleDialogState(show=");
        sb.append(this.f21385a);
        sb.append(", puzzleList=");
        sb.append(this.b);
        sb.append(", puzzleExists=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
