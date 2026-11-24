package a;

import android.gov.nist.core.Separators;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class o8f implements azk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tgk f24826a;
    public final knf0 b;
    public final bzt c;
    public final ort d;
    public final k050 e = new k050();
    public final k050 f = new k050();
    public final ArrayList g = new ArrayList();

    public o8f(tgk tgkVar, knf0 knf0Var, bzt bztVar, ort ortVar) {
        this.f24826a = tgkVar;
        this.b = knf0Var;
        this.c = bztVar;
        this.d = ortVar;
    }

    public static String a() {
        String str = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        str = str + networkInterfaceNextElement.getName() + Separators.SP + ((Inet4Address) inetAddressNextElement).getHostAddress() + " // ";
                    }
                }
            }
            return str;
        } catch (SocketException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        l8f l8fVar;
        k050 k050Var;
        if (zjeVar instanceof l8f) {
            l8fVar = (l8f) zjeVar;
            int i = l8fVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8fVar.l = i - Integer.MIN_VALUE;
            } else {
                l8fVar = new l8f(this, zjeVar);
            }
        } else {
            l8fVar = new l8f(this, zjeVar);
        }
        Object obj = l8fVar.j;
        wne wneVar = wne.f39444a;
        int i2 = l8fVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = this.f;
            l8fVar.i = k050Var;
            l8fVar.l = 1;
            if (k050Var.d(l8fVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = l8fVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
        }
        try {
            List listY0 = sj3.y0(this.g);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listY0) {
                if (((he70) obj2).f12908a.length() > 0) {
                    arrayList.add(obj2);
                }
            }
            return CollectionsKt.b0(arrayList, Separators.RETURN, null, null, new vzd((byte) 25), 30);
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar, String str, boolean z) {
        m8f m8fVar;
        k050 k050Var;
        if (zjeVar instanceof m8f) {
            m8fVar = (m8f) zjeVar;
            int i = m8fVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                m8fVar.m = i - Integer.MIN_VALUE;
            } else {
                m8fVar = new m8f(this, zjeVar);
            }
        } else {
            m8fVar = new m8f(this, zjeVar);
        }
        Object obj = m8fVar.k;
        wne wneVar = wne.f39444a;
        int i2 = m8fVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            m8fVar.i = str;
            k050Var = this.f;
            m8fVar.j = k050Var;
            m8fVar.m = 1;
            if (k050Var.d(m8fVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = m8fVar.j;
            String str2 = m8fVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            str = str2;
        }
        try {
            this.g.add(new he70(str));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(Throwable th, zje zjeVar) {
        n8f n8fVar;
        Throwable th2;
        k050 k050Var;
        Object g0g0Var;
        String message;
        ArrayList arrayList = this.g;
        knf0 knf0Var = this.b;
        if (zjeVar instanceof n8f) {
            n8fVar = (n8f) zjeVar;
            int i = n8fVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                n8fVar.m = i - Integer.MIN_VALUE;
            } else {
                n8fVar = new n8f(this, zjeVar);
            }
        } else {
            n8fVar = new n8f(this, zjeVar);
        }
        Object obj = n8fVar.k;
        wne wneVar = wne.f39444a;
        int i2 = n8fVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            th2 = th;
            n8fVar.i = th2;
            k050 k050Var2 = this.e;
            n8fVar.j = k050Var2;
            n8fVar.m = 1;
            if (k050Var2.d(n8fVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = n8fVar.j;
            Throwable th3 = n8fVar.i;
            z1x.P(obj);
            th2 = th3;
        }
        try {
            String[] strArr = new String[6];
            strArr[0] = "IP: ".concat(a());
            strArr[1] = "Network: ".concat(this.f24826a.f());
            strArr[2] = "Device ID: " + knf0Var.a();
            strArr[3] = "Lang: ".concat(knf0Var.c());
            strArr[4] = "Project: " + this.c.f3488a.a().f36976a + "_1";
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = "User ID: " + this.d.b();
            } catch (Throwable th4) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th4);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = "";
            }
            strArr[5] = g0g0Var;
            List listJ = q3d.j(strArr);
            ArrayList arrayList2 = new ArrayList(r3d.q(listJ, 10));
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                arrayList2.add(new he70((String) it.next()));
            }
            ArrayList arrayListQ0 = CollectionsKt.q0(sj3.y0(arrayList), arrayList2);
            ArrayList<he70> arrayList3 = new ArrayList();
            for (Object obj2 : arrayListQ0) {
                if (((he70) obj2).f12908a.length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            for (he70 he70Var : arrayList3) {
                arrayList4.add(he70Var.b + ": " + he70Var.f12908a);
            }
            tfq tfqVarA = tfq.a();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                tfqVarA.b((String) it2.next());
            }
            String strB0 = CollectionsKt.b0(arrayList4, Separators.RETURN, null, null, null, 62);
            tfq tfqVarA2 = tfq.a();
            if (th2 != null && (message = th2.getMessage()) != null) {
                strB0 = message;
            }
            tfqVarA2.c(new g2(strB0, (byte) 6));
            arrayList.clear();
            k050Var.c(null);
            return Unit.f46060a;
        } catch (Throwable th5) {
            k050Var.c(null);
            throw th5;
        }
    }
}
