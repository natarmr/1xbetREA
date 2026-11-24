package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"La/u8e;", "", "La/e2f0;", "registrationRequest", "", "", "headers", "La/dx5;", "La/h2f0;", "c", "(La/e2f0;Ljava/util/Map;La/yje;)Ljava/lang/Object;", "projectId", "La/jji0;", "b", "(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;", RemoteMessageConst.Notification.URL, "Lokhttp3/MultipartBody$Part;", "file", "acceptHeader", "La/glu;", "a", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface u8e {
    @kg80
    @nx40
    Object a(@bot0 String str, @nq80 MultipartBody.Part part, @xpv("Accept") String str2, yje<? super dx5<glu>> yjeVar);

    @ofr("v2/most-required/internal")
    Object b(@nkd0("projectId") String str, @jrv Map<String, String> map, yje<? super dx5<jji0>> yjeVar);

    @kg80("v2/login/internal")
    Object c(@jb8 e2f0 e2f0Var, @jrv Map<String, String> map, yje<? super dx5<h2f0>> yjeVar);
}
