package okhttp3.internal.dns;

import a.e0g0;
import a.g0g0;
import a.j0g0;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/dns/_ExecuteDnsKt$execute$1", "Lokhttp3/Dns$Callback;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class _ExecuteDnsKt$execute$1 implements Dns.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46167a = new ArrayList();
    public final /* synthetic */ Dns.Call b;
    public final /* synthetic */ LinkedBlockingQueue c;

    public _ExecuteDnsKt$execute$1(Dns.Call call, LinkedBlockingQueue linkedBlockingQueue) {
        this.b = call;
        this.c = linkedBlockingQueue;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0024, please report this as an issue */
    public final void a(IOException iOException) {
        Object g0g0Var;
        ArrayList arrayList = this.f46167a;
        if (arrayList.isEmpty()) {
            e0g0 e0g0Var = j0g0.b;
            if (iOException == null) {
                iOException = new UnknownHostException("DNS returned no addresses for " + this.b.getG().f46093a);
            }
            g0g0Var = new g0g0(iOException);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Dns.Record) it.next()) instanceof Dns.Record.IpAddress) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = arrayList;
                }
            }
            e0g0 e0g0Var3 = j0g0.b;
            if (iOException == null) {
                iOException = new UnknownHostException("DNS returned no addresses for " + this.b.getG().f46093a);
            }
            g0g0Var = new g0g0(iOException);
        }
        this.c.put(new j0g0(g0g0Var));
    }
}
