package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J`\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La/l9s0;", "", "", "token", "", "whence", "lng", "ref", "country", "currencyId", "La/fk9;", "cachingTag", "La/dx5;", "La/fzr0;", "c", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;La/fk9;La/yje;)Ljava/lang/Object;", "ids", "La/v9s0;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface l9s0 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("TournamentClientsV2/GetTournamentsPersonalInfo")
    Object a(@xpv("X-Auth") String str, @nkd0("tournament_ids") String str2, @nkd0("whence") int i, @nkd0("lng") String str3, @doo0 fk9 fk9Var, yje<? super dx5<v9s0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("TournamentClientsV2/GetTournaments")
    Object c(@xpv("X-Auth") String str, @nkd0("whence") int i, @nkd0("lng") String str2, @nkd0("ref") int i2, @nkd0("country") int i3, @nkd0("currency_id") Integer num, @doo0 fk9 fk9Var, yje<? super dx5<fzr0>> yjeVar);
}
