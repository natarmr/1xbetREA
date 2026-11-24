package okhttp3.internal.ech;

import a.qg9;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ech/EchRetryPlan;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EchRetryPlan {
    public static final Regex c = new Regex("(\\..*)|(.*\\.)|((.*\\.)?[0-9]+)|((.*\\.)?0[xX][0-9a-fA-F]*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46168a;
    public final qg9 b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ech/EchRetryPlan$Companion;", "", "Lkotlin/text/Regex;", "INVALID_PUBLIC_NAME", "Lkotlin/text/Regex;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public EchRetryPlan(qg9 qg9Var, String str) {
        this.f46168a = str;
        this.b = qg9Var;
    }
}
