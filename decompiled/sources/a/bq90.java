package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bq90 implements cq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3017a;
    public final String b;

    public bq90(String str) {
        str.getClass();
        this.f3017a = str;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq90) && Intrinsics.d(this.f3017a, ((bq90) obj).f3017a);
    }

    @Override // a.cq90
    public final Object getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.f3017a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleUiModel(title=", this.f3017a, Separators.RPAREN);
    }
}
