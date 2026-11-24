package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0017\u0010\u0015J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001d\u0010\u0015¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"La/xlk;", "", "", "repoId", "keyPackId", "", "language", "", "lastUpd", "La/dx5;", "La/gos0;", "d", "(IILjava/lang/String;JLa/yje;)Ljava/lang/Object;", "", "La/wkl0;", "b", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "lastUpdate", "La/ox5;", "La/oio;", "e", "(JLjava/lang/String;La/yje;)Ljava/lang/Object;", "La/lio;", "c", "partner", "La/jvf;", "f", "(JLjava/lang/String;ILa/yje;)Ljava/lang/Object;", "La/mre;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface xlk {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/mb/GetGeoCountryFullInfo")
    Object a(@nkd0("lastUpdate") long j, @nkd0("lng") String str, yje<? super ox5<mre>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/Mb/Sports")
    Object b(@nkd0("lng") String str, yje<? super dx5<? extends List<wkl0>>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/mb/getEventsTypeSmallGroups")
    Object c(@nkd0("lastUpdate") long j, @nkd0("lng") String str, yje<? super ox5<lio>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("translate/v1/mobile/GetTranslationsOfKeys")
    Object d(@nkd0("repoId") int i, @nkd0("keyPackId") int i2, @nkd0("lng") String str, @nkd0("lastUpd") long j, yje<? super dx5<gos0>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/mb/getEventsTypeSmall")
    Object e(@nkd0("lastUpdate") long j, @nkd0("lng") String str, yje<? super ox5<oio>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("RestCoreService/v1/mb/getStaticCurrency")
    Object f(@nkd0("lastUpdate") long j, @nkd0("lng") String str, @nkd0("partner") int i, yje<? super ox5<jvf>> yjeVar);
}
