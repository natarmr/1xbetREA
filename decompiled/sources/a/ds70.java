package a;

import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J2\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"La/ds70;", "", "", FailedBinderCallBack.CALLER_ID, RemoteMessageConst.FROM, RemoteMessageConst.TO, "La/jpx;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/jte0;", "body", "La/mte0;", "a", "(La/jte0;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ds70 {
    @kg80("TelephonyFeedBack/RegisterCallUserFeedback")
    Object a(@jb8 jte0 jte0Var, yje<? super mte0> yjeVar);

    @ofr("TelephonyFeedBack/IsCallExist")
    Object b(@nkd0(FailedBinderCallBack.CALLER_ID) String str, @nkd0(RemoteMessageConst.FROM) String str2, @nkd0(RemoteMessageConst.TO) String str3, yje<? super jpx> yjeVar);
}
