package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ots f44977a;
    public final List b;

    public zts(ots otsVar, List list) {
        list.getClass();
        this.f44977a = otsVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zts)) {
            return false;
        }
        zts ztsVar = (zts) obj;
        return this.f44977a.equals(ztsVar.f44977a) && Intrinsics.d(this.b, ztsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44977a.hashCode() * 31);
    }

    public final String toString() {
        return "GameSubscriptionSettingsScreenModel(game=" + this.f44977a + ", periodSubscriptionSettingsModels=" + this.b + Separators.RPAREN;
    }
}
