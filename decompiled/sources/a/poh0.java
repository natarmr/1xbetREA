package a;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class poh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27330a;
    public final /* synthetic */ iph0 b;

    public /* synthetic */ poh0(iph0 iph0Var, byte b) {
        this.f27330a = b;
        this.b = iph0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27330a;
        iph0 iph0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                b1j.z(str, th);
                iph0Var.J.f(new woh0(rek0.b, str));
                p7m0 p7m0Var = iph0Var.D;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                break;
            case 1:
                b1j.z(str, th);
                if (!(th instanceof UnknownHostException) && !(th instanceof ConnectException) && !(th instanceof SocketException) && !(th instanceof SocketTimeoutException)) {
                    iph0Var.J.f(new woh0(rek0.b, str));
                }
                jkm jkmVarD = g2v.d(iph0Var.t, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new roh0(iph0Var, (byte) 2), 94);
                p7m0 p7m0Var2 = iph0Var.K;
                bph0 bph0Var = new bph0(jkmVarD);
                p7m0Var2.getClass();
                p7m0Var2.o(null, bph0Var);
                p7m0 p7m0Var3 = iph0Var.D;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool2);
                break;
            default:
                th.printStackTrace();
                iph0Var.J.f(new woh0(rek0.b, str));
                break;
        }
        return Unit.f46060a;
    }
}
