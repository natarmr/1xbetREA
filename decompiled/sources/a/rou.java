package a;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3c0 f30857a;

    public rou(b3c0 b3c0Var, byte b) {
        b3c0Var.getClass();
        switch (b) {
            case 1:
                this.f30857a = b3c0Var;
                break;
            case 2:
                this.f30857a = b3c0Var;
                break;
            default:
                this.f30857a = b3c0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(boolean z, yje yjeVar) {
        qou qouVar;
        Object objD;
        if (yjeVar instanceof qou) {
            qouVar = (qou) yjeVar;
            int i = qouVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qouVar.k = i - Integer.MIN_VALUE;
            } else {
                qouVar = new qou(this, yjeVar);
            }
        } else {
            qouVar = new qou(this, yjeVar);
        }
        qou qouVar2 = qouVar;
        Object obj = qouVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = qouVar2.k;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            String name = rou.class.getName();
            uen uenVar = wen.b;
            long jW0 = ibc.w0(2L, bfn.SECONDS);
            List listJ = q3d.j(oqt0.class, SocketException.class, SocketTimeoutException.class, ConnectException.class, UnknownHostException.class);
            u88 u88Var = new u88((Object) this, z, yjeVar2, (byte) 20);
            qouVar2.k = 1;
            objD = j0x.D(10, jW0, qouVar2, name, listJ, u88Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = ((j0g0) obj).f15681a;
        }
        z1x.P(objD);
        return objD;
    }
}
