package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tsv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tvw f34481a;
    public final String b;
    public final String c;
    public final a4x d;
    public final a4x e;

    public tsv(tvw tvwVar, String str, String str2, a4x a4xVar, a4x a4xVar2) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f34481a = tvwVar;
        this.b = str;
        this.c = str2;
        this.d = a4xVar;
        this.e = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsv)) {
            return false;
        }
        tsv tsvVar = (tsv) obj;
        return this.f34481a.equals(tsvVar.f34481a) && Intrinsics.d(this.b, tsvVar.b) && Intrinsics.d(this.c, tsvVar.c) && Intrinsics.d(this.d, tsvVar.d) && Intrinsics.d(this.e, tsvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, ua80.b(ua80.b(this.f34481a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderUiModel(iconBetUiModel=");
        sb.append(this.f34481a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", betNumber=");
        cs0.B(sb, this.c, ", tagList=", this.d, ", itemsDescriptionList=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
