package org.xplatform.aggregator.impl.core.data.models;

import a.ahi0;
import a.cld;
import a.ehi0;
import a.fi0;
import a.kng0;
import a.ugi0;
import a.ysm0;
import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;", "", "", CrashHianalyticsData.MESSAGE, "<init>", "(Ljava/lang/String;)V", "", "seen0", "La/ehi0;", "serializationConstructorMarker", "(ILjava/lang/String;La/ehi0;)V", "self", "La/cld;", "output", "La/ugi0;", "serialDesc", "", "write$Self$impl", "(Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;La/cld;La/ugi0;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/data/models/AggregatorClearRecentGamesResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", "Companion", "a/ei0", "a/fi0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AggregatorClearRecentGamesResponse {
    public static final int $stable = 0;
    public static final fi0 Companion = new fi0();
    private final String message;

    public /* synthetic */ AggregatorClearRecentGamesResponse(int i, String str, ehi0 ehi0Var) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ AggregatorClearRecentGamesResponse copy$default(AggregatorClearRecentGamesResponse aggregatorClearRecentGamesResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aggregatorClearRecentGamesResponse.message;
        }
        return aggregatorClearRecentGamesResponse.copy(str);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$impl(AggregatorClearRecentGamesResponse self, cld output, ugi0 serialDesc) {
        if (!output.u(serialDesc) && self.message == null) {
            return;
        }
        output.p(serialDesc, 0, ysm0.f43175a, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AggregatorClearRecentGamesResponse copy(String message) {
        return new AggregatorClearRecentGamesResponse(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AggregatorClearRecentGamesResponse) && Intrinsics.d(this.message, ((AggregatorClearRecentGamesResponse) other).message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return kng0.l("AggregatorClearRecentGamesResponse(message=", this.message, Separators.RPAREN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregatorClearRecentGamesResponse() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public AggregatorClearRecentGamesResponse(String str) {
        this.message = str;
    }

    public /* synthetic */ AggregatorClearRecentGamesResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
