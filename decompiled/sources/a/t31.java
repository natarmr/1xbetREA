package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001Jf\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011JR\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0015\u0010\u0016J\\\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"La/t31;", "", "", "token", "", "ref", "whence", "fcountry", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "", "incWins", "currency", "La/fk9;", "cachingTag", "La/dx5;", "La/t41;", "c", "(Ljava/lang/String;IIILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "", "campaignId", "La/q41;", "b", "(JIIILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "a", "(IIILjava/lang/String;ZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface t31 {
    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("JackpotsCasino/AvailableCampaigns")
    Object a(@nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("fcountry") int i3, @nkd0("lng") String str, @nkd0("incWins") boolean z, @nkd0("cur") String str2, @doo0 fk9 fk9Var, yje<? super dx5<t41>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("/JackpotsCasino/CurrentAmountJackpots")
    Object b(@nkd0("campaignId") long j, @nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("fcountry") int i3, @nkd0("cur") String str, @doo0 fk9 fk9Var, yje<? super dx5<q41>> yjeVar);

    @dtv({"Accept: application/vnd.xenvelop+json"})
    @ofr("JackpotsCasino/AvailableCampaignsByPlayer")
    Object c(@xpv("X-Auth") String str, @nkd0("ref") int i, @nkd0("whence") int i2, @nkd0("fcountry") int i3, @nkd0("lng") String str2, @nkd0("incWins") boolean z, @nkd0("cur") String str3, @doo0 fk9 fk9Var, yje<? super dx5<t41>> yjeVar);
}
