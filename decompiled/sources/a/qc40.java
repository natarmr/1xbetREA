package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28469a;
    public final float b;
    public final List c;

    public qc40(int i, float f, List list) {
        list.getClass();
        this.f28469a = i;
        this.b = f;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc40)) {
            return false;
        }
        qc40 qc40Var = (qc40) obj;
        return this.f28469a == qc40Var.f28469a && Float.compare(this.b, qc40Var.b) == 0 && Intrinsics.d(this.c, qc40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + defpackage.c.a(Integer.hashCode(this.f28469a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaHeroesSkillBuildModel(numberOfMatches=");
        sb.append(this.f28469a);
        sb.append(", winRate=");
        sb.append(this.b);
        sb.append(", skills=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
