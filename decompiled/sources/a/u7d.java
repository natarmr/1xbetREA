package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u7d implements w7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bjk f35179a;
    public final List b;

    public u7d(bjk bjkVar, List list) {
        bjkVar.getClass();
        list.getClass();
        this.f35179a = bjkVar;
        this.b = list;
    }

    @Override // a.w7d
    public final bjk a() {
        return this.f35179a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7d)) {
            return false;
        }
        u7d u7dVar = (u7d) obj;
        return Intrinsics.d(this.f35179a, u7dVar.f35179a) && Intrinsics.d(this.b, u7dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35179a.hashCode() * 31);
    }

    public final String toString() {
        return "Auth(authDialogParams=" + this.f35179a + ", onSuccessCommands=" + this.b + Separators.RPAREN;
    }
}
