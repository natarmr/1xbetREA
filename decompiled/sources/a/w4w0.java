package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lorg/xplatform/domain/resolver/impl/data/datasource/network/DomainMirrorService;", "", "La/k85;", "getAvailableMirrors", "(La/yje;)Ljava/lang/Object;", "", ParameterNames.COOKIE, "Lokhttp3/RequestBody;", "hostsRequest", Payload.TYPE, "", "sendHostsStatus", "(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/lang/String;La/yje;)Ljava/lang/Object;", RemoteMessageConst.Notification.URL, "La/jtf0;", "check", "(Ljava/lang/String;La/yje;)Ljava/lang/Object;", "org.xplatform.secret.resolver:impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface w4w0 {
    @ofr
    Object a(@bot0 String str, yje<? super jtf0<Unit>> yjeVar);

    @ofr("/checker/redirect/stat/run/")
    Object b(yje<? super k85> yjeVar);

    @kg80("/checker/redirect/stat/")
    Object c(@xpv(ParameterNames.COOKIE) String str, @jb8 RequestBody requestBody, @xpv("Content-Type") String str2, yje<? super Unit> yjeVar);
}
