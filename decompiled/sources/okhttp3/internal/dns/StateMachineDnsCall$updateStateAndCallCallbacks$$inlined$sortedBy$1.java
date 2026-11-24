package okhttp3.internal.dns;

import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class StateMachineDnsCall$updateStateAndCallCallbacks$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((ResourceRecord.Https) obj).c).compareTo(Integer.valueOf(((ResourceRecord.Https) obj2).c));
    }
}
