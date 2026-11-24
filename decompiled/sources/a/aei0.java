package a;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class aei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd60 f731a;

    public aei0(sd60 sd60Var) {
        this.f731a = sd60Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, Boolean bool, zje zjeVar) {
        zdi0 zdi0Var;
        Object objD;
        if (zjeVar instanceof zdi0) {
            zdi0Var = (zdi0) zjeVar;
            int i = zdi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdi0Var.k = i - Integer.MIN_VALUE;
            } else {
                zdi0Var = new zdi0(this, zjeVar);
            }
        } else {
            zdi0Var = new zdi0(this, zjeVar);
        }
        zdi0 zdi0Var2 = zdi0Var;
        Object obj = zdi0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = zdi0Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            String name = aei0.class.getName();
            uen uenVar = wen.b;
            long jW0 = ibc.w0(3L, bfn.SECONDS);
            List listJ = q3d.j(oqt0.class, SocketException.class, SocketTimeoutException.class, ConnectException.class, UnknownHostException.class);
            r7i0 r7i0Var = new r7i0(this, str, bool, (yje) null);
            zdi0Var2.k = 1;
            objD = j0x.D(4, jW0, zdi0Var2, name, listJ, r7i0Var);
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
        return Unit.f46060a;
    }
}
