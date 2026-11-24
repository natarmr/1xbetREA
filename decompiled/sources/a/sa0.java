package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Jl\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/sa0;", "", "", "auth", "appGuid", "", "timeFrom", "timeTo", "", "typeGame", "lastKnownId", "limit", "amountSort", "typeTransaction", "La/i31;", "a", "(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/Long;IIILa/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface sa0 {
    @ofr("BetStorage/GetHistoryBetMobile")
    Object a(@xpv("X-Auth") String str, @xpv("AppGuid") String str2, @nkd0("UnixTimeFrom") long j, @nkd0("UnixTimeTo") long j2, @nkd0("TypeGame") int i, @nkd0("LastKnownId") Long l, @nkd0("Limit") int i2, @nkd0("AmountSort") int i3, @nkd0("TypeTransaction") int i4, yje<? super i31> yjeVar);
}
