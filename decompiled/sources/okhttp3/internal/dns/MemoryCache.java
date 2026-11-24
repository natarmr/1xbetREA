package okhttp3.internal.dns;

import a.wcd;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/dns/MemoryCache;", "", TokenNames.K, TokenNames.V, "NewestFirst", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MemoryCache<K, V> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002&\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00020\u0001j\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/dns/MemoryCache$NewestFirst;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "La/wcd;", "Lkotlin/Comparator;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NewestFirst implements Comparator<Pair<? extends wcd, ?>> {
        @Override // java.util.Comparator
        public final int compare(Pair<? extends wcd, ?> pair, Pair<? extends wcd, ?> pair2) {
            Pair<? extends wcd, ?> pair3 = pair;
            Pair<? extends wcd, ?> pair4 = pair2;
            pair3.getClass();
            pair4.getClass();
            return ((wcd) pair4.f46059a).h((wcd) pair3.f46059a);
        }
    }
}
