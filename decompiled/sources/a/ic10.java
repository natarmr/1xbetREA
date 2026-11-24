package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0080\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"La/ic10;", "", "", "auth", "", "providerId", "limit", "", "lastItemId", "dateFrom", "dateTo", "gameCategory", "transactionType", "language", "actionId", "accountId", "La/qc10;", "a", "(Ljava/lang/String;IIJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ic10 {
    @ofr("/BetHistoryLotto/transaction-history/{providerId}")
    Object a(@xpv("X-Auth") String str, @z190("providerId") int i, @nkd0("limit") int i2, @nkd0("lastTransactionId") long j, @nkd0("fromTimestamp") long j2, @nkd0("toTimestamp") long j3, @nkd0("gameCategory") String str2, @nkd0("transactionType") String str3, @nkd0("lng") String str4, @nkd0("actionId") String str5, @nkd0("accountId") long j4, yje<? super qc10> yjeVar);
}
