package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0001H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"La/tuk;", "", "", "code", "clientId", "redirectUri", "codeVerifier", "grantType", "contentType", "La/zuk;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "token", "tag", "La/cvk;", "b", "(Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface tuk {
    @kg80("https://discord.com/api/oauth2/token")
    @zvq
    Object a(@pqp("code") String str, @pqp(CommonConstant.ReqAccessTokenParam.CLIENT_ID) String str2, @pqp(CommonConstant.ReqAccessTokenParam.REDIRECT_URI) String str3, @pqp("code_verifier") String str4, @pqp("grant_type") String str5, @xpv("Content-Type") String str6, yje<? super zuk> yjeVar);

    @ofr("https://discord.com/api/users/@me")
    Object b(@xpv("Authorization") String str, @doo0 Object obj, yje<? super cvk> yjeVar);
}
