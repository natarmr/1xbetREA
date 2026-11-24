package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018JJ\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0015¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"La/s840;", "", "", "auth", "language", "", "timeZone", "acceptHeader", "La/dx5;", "", "La/m640;", "d", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;La/yje;)Ljava/lang/Object;", "", "supportedTypes", "c", "(Ljava/lang/String;JLjava/lang/String;La/yje;)Ljava/lang/Object;", "La/d540;", "request", "La/e640;", "a", "(Ljava/lang/String;La/d540;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/c840;", "b", "(Ljava/lang/String;DLjava/lang/String;La/yje;)Ljava/lang/Object;", "", "supportedPopUpTypes", "e", "(Ljava/lang/String;DJLjava/lang/Integer;Ljava/lang/String;La/yje;)Ljava/lang/Object;", "La/y340;", "f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface s840 {
    @kg80("MesCore/v1/Mobile/ReadMessage")
    Object a(@xpv("X-Auth") String str, @jb8 d540 d540Var, @xpv("Accept") String str2, yje<? super dx5<e640>> yjeVar);

    @ofr("MesCore/v1/Mobile/GetCountMessages")
    Object b(@xpv("X-Auth") String str, @nkd0("tz") double d, @xpv("Accept") String str2, yje<? super dx5<c840>> yjeVar);

    @ofr("MesCore/v2/Mobile/GetMessages")
    Object c(@xpv("X-Auth") String str, @nkd0("supportedTypes") long j, @xpv("Accept") String str2, yje<? super dx5<? extends List<m640>>> yjeVar);

    @ofr("MesCore/v1/Mobile/GetMessages")
    Object d(@xpv("X-Auth") String str, @nkd0("lng") String str2, @nkd0("tz") double d, @xpv("Accept") String str3, yje<? super dx5<? extends List<m640>>> yjeVar);

    @ofr("MesCore/v2/Mobile/GetCountMessages")
    Object e(@xpv("X-Auth") String str, @nkd0("tz") double d, @nkd0("supportedTypes") long j, @nkd0("supportedPopUpTypes") Integer num, @xpv("Accept") String str2, yje<? super dx5<c840>> yjeVar);

    @kg80("MesCore/v1/Mobile/DelMessage")
    Object f(@xpv("X-Auth") String str, @jb8 d540 d540Var, @xpv("Accept") String str2, yje<? super dx5<y340>> yjeVar);
}
