package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JJ\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"La/di8;", "", "", "partner", "countryId", "", "currencyId", "", "language", "La/q16;", "", "La/eg8;", "La/i2o;", "a", "(IIJLjava/lang/String;La/yje;)Ljava/lang/Object;", "auth", "La/s8v0;", "request", "", "b", "(Ljava/lang/String;La/s8v0;La/yje;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface di8 {
    @ofr("Account/v1/Bonus/GetRegisterBonuses")
    Object a(@nkd0("partner") int i, @nkd0("countryId") int i2, @nkd0("currencyId") long j, @nkd0("language") String str, yje<? super q16<? extends List<eg8>, ? extends i2o>> yjeVar);

    @kg80("Account/v2/Bonus/ChangeRegisterBonus")
    Object b(@xpv("X-Auth") String str, @jb8 s8v0 s8v0Var, yje<? super q16<Unit, ? extends i2o>> yjeVar);
}
