package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bethistory.domain.model.GeneralBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class gbr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11027a;
    public final GeneralBetInfoModel b;

    public gbr(List list, GeneralBetInfoModel generalBetInfoModel) {
        list.getClass();
        generalBetInfoModel.getClass();
        this.f11027a = list;
        this.b = generalBetInfoModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbr)) {
            return false;
        }
        gbr gbrVar = (gbr) obj;
        return Intrinsics.d(this.f11027a, gbrVar.f11027a) && Intrinsics.d(this.b, gbrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11027a.hashCode() * 31);
    }

    public final String toString() {
        return "FullHistoryModel(history=" + this.f11027a + ", generalBetInfo=" + this.b + Separators.RPAREN;
    }
}
