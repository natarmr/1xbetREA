package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class zda0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerTransfersScreenParams f44203a;
    public final j0g0 b;

    public zda0(PlayerTransfersScreenParams playerTransfersScreenParams, j0g0 j0g0Var) {
        this.f44203a = playerTransfersScreenParams;
        this.b = j0g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zda0)) {
            return false;
        }
        zda0 zda0Var = (zda0) obj;
        return this.f44203a.equals(zda0Var.f44203a) && Intrinsics.d(this.b, zda0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f44203a.hashCode() * 31;
        j0g0 j0g0Var = this.b;
        return iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a));
    }

    public final String toString() {
        return "PlayerTransfersStateModel(params=" + this.f44203a + ", playerTransferResult=" + this.b + Separators.RPAREN;
    }
}
