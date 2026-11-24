package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qda implements rda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f28525a;
    public final String b;
    public final j83 c;

    public qda(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f28525a = j83Var;
        this.b = str;
        this.c = j83Var2;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qda)) {
            return false;
        }
        qda qdaVar = (qda) obj;
        return this.f28525a.equals(qdaVar.f28525a) && Intrinsics.d(this.b, qdaVar.b) && this.c.equals(qdaVar.c);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28525a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SingleTeam(topInfo=" + ((Object) this.f28525a) + ", teamName=" + this.b + ", bottomInfo=" + ((Object) this.c) + Separators.RPAREN;
    }
}
