package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class qz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29559a;
    public final CyberGamesPage b;

    public qz10(String str, CyberGamesPage cyberGamesPage) {
        str.getClass();
        this.f29559a = str;
        this.b = cyberGamesPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz10)) {
            return false;
        }
        qz10 qz10Var = (qz10) obj;
        return Intrinsics.d(this.f29559a, qz10Var.f29559a) && this.b.equals(qz10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29559a.hashCode() * 31);
    }

    public final String toString() {
        return "MainSegmentedControlPageUiModel(title=" + this.f29559a + ", cyberGamesPage=" + this.b + Separators.RPAREN;
    }
}
