package a;

import com.huawei.hms.android.HwBuildEx;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gzk extends bnn0 implements Function2 {
    public DatagramSocket i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jzk l;
    public final /* synthetic */ String m;
    public final /* synthetic */ short n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzk(jzk jzkVar, String str, short s, String str2, yje yjeVar) {
        super(2, yjeVar);
        this.l = jzkVar;
        this.m = str;
        this.n = s;
        this.o = str2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        gzk gzkVar = new gzk(this.l, this.m, this.n, this.o, yjeVar);
        gzkVar.k = obj;
        return gzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gzk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        DatagramSocket datagramSocket;
        vne vneVar = (vne) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            DatagramSocket datagramSocket2 = new DatagramSocket();
            jzk jzkVar = this.l;
            String str = this.m;
            short s = this.n;
            String str2 = this.o;
            try {
                datagramSocket2.setSoTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                zvw.R(vneVar.getCoroutineContext()).invokeOnCompletion(new e3j(datagramSocket2, (byte) 23));
                short s2 = s;
                byte[] bArrD = jzk.d(str, s2);
                datagramSocket2.send(new DatagramPacket(bArrD, bArrD.length, InetAddress.getByName(str2), 53));
                DatagramPacket datagramPacket = new DatagramPacket(new byte[512], 512);
                datagramSocket2.receive(datagramPacket);
                byte[] data = datagramPacket.getData();
                data.getClass();
                String strB = jzk.b(qx3.j(data, 0, datagramPacket.getLength()), s2);
                this.k = null;
                this.i = datagramSocket2;
                this.j = true;
                Serializable serializableF = jzkVar.f(strB, this);
                if (serializableF == wneVar) {
                    return wneVar;
                }
                obj = serializableF;
                datagramSocket = datagramSocket2;
            } catch (Throwable th2) {
                th = th2;
                datagramSocket = datagramSocket2;
                throw th;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            datagramSocket = this.i;
            try {
                z1x.P(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    bkb.E(datagramSocket, th);
                    throw th4;
                }
            }
        }
        Collection collection = (Collection) obj;
        bkb.E(datagramSocket, null);
        return collection;
    }
}
