package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final class blg implements qlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr2 f2793a;
    public final CyberGamesParentSectionModel b;

    public blg(lr2 lr2Var, CyberGamesParentSectionModel.FromMain fromMain) {
        fromMain.getClass();
        this.f2793a = lr2Var;
        this.b = fromMain;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blg) {
            blg blgVar = (blg) obj;
            if (this.f2793a == blgVar.f2793a && Intrinsics.d(this.b, blgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2793a.hashCode() * 31);
    }

    public final String toString() {
        return "Initialize(type=" + this.f2793a + ", section=" + this.b + Separators.RPAREN;
    }
}
