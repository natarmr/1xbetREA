package a;

import android.gov.nist.core.Separators;
import android.javax.sip.ListeningPoint;
import android.javax.sip.SipFactory;
import android.javax.sip.SipProvider;
import android.javax.sip.SipStack;
import android.javax.sip.address.AddressFactory;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.message.MessageFactory;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class r6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29937a;
    public final k050 b;
    public SipStack c;
    public SipProvider d;
    public ListeningPoint e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final SipFactory h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;

    public r6k0(String str) {
        str.getClass();
        this.f29937a = str;
        this.b = new k050();
        this.f = new AtomicReference(null);
        this.g = new AtomicReference(null);
        SipFactory sipFactory = SipFactory.getInstance();
        sipFactory.getClass();
        this.h = sipFactory;
        final byte b = 0;
        this.i = maz.b(new Function0(this) { // from class: a.o6k0
            public final /* synthetic */ r6k0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                r6k0 r6k0Var = this.b;
                switch (b2) {
                    case 0:
                        return r6k0Var.h.createHeaderFactory();
                    case 1:
                        return r6k0Var.h.createMessageFactory();
                    default:
                        return r6k0Var.h.createAddressFactory();
                }
            }
        });
        final byte b2 = 1;
        this.j = maz.b(new Function0(this) { // from class: a.o6k0
            public final /* synthetic */ r6k0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                r6k0 r6k0Var = this.b;
                switch (b3) {
                    case 0:
                        return r6k0Var.h.createHeaderFactory();
                    case 1:
                        return r6k0Var.h.createMessageFactory();
                    default:
                        return r6k0Var.h.createAddressFactory();
                }
            }
        });
        final byte b3 = 2;
        this.k = maz.b(new Function0(this) { // from class: a.o6k0
            public final /* synthetic */ r6k0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                r6k0 r6k0Var = this.b;
                switch (b4) {
                    case 0:
                        return r6k0Var.h.createHeaderFactory();
                    case 1:
                        return r6k0Var.h.createMessageFactory();
                    default:
                        return r6k0Var.h.createAddressFactory();
                }
            }
        });
    }

    public static String b() {
        Object next;
        String hostAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return "127.0.0.1";
            }
            bkq bkqVar = new bkq(pgi0.k(pgi0.h(lgi0.b(new s3d(networkInterfaces)), new thj0((byte) 16)), new thj0((byte) 17)));
            while (true) {
                if (!bkqVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bkqVar.next();
                String hostAddress2 = ((InetAddress) next).getHostAddress();
                if (hostAddress2 != null && StringsKt.O(hostAddress2, Separators.DOT, false)) {
                    break;
                }
            }
            InetAddress inetAddress = (InetAddress) next;
            return (inetAddress == null || (hostAddress = inetAddress.getHostAddress()) == null) ? "127.0.0.1" : hostAddress;
        } catch (Exception unused) {
            return "127.0.0.1";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        p6k0 p6k0Var;
        k050 k050Var;
        if (zjeVar instanceof p6k0) {
            p6k0Var = (p6k0) zjeVar;
            int i = p6k0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6k0Var.l = i - Integer.MIN_VALUE;
            } else {
                p6k0Var = new p6k0(this, zjeVar);
            }
        } else {
            p6k0Var = new p6k0(this, zjeVar);
        }
        Object obj = p6k0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = p6k0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.b;
            p6k0Var.i = k050Var2;
            p6k0Var.l = 1;
            if (k050Var2.d(p6k0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = p6k0Var.i;
            z1x.P(obj);
        }
        try {
            this.d = null;
            this.e = null;
            this.f.set(null);
            this.g.set(null);
            try {
                SipStack sipStack = this.c;
                if (sipStack != null) {
                    sipStack.stop();
                }
            } catch (Exception unused) {
            }
            this.c = null;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public final AddressFactory c() {
        Object value = this.k.getValue();
        value.getClass();
        return (AddressFactory) value;
    }

    public final HeaderFactory d() {
        Object value = this.i.getValue();
        value.getClass();
        return (HeaderFactory) value;
    }

    public final MessageFactory e() {
        Object value = this.j.getValue();
        value.getClass();
        return (MessageFactory) value;
    }

    public final SipProvider f() {
        SipProvider sipProvider = this.d;
        if (sipProvider != null) {
            return sipProvider;
        }
        jf4.n("SipProvider not initialized. Call initSipStack() first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zje zjeVar) {
        q6k0 q6k0Var;
        k050 k050Var;
        if (zjeVar instanceof q6k0) {
            q6k0Var = (q6k0) zjeVar;
            int i = q6k0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6k0Var.l = i - Integer.MIN_VALUE;
            } else {
                q6k0Var = new q6k0(this, zjeVar);
            }
        } else {
            q6k0Var = new q6k0(this, zjeVar);
        }
        Object obj = q6k0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = q6k0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.b;
            q6k0Var.i = k050Var2;
            q6k0Var.l = 1;
            if (k050Var2.d(q6k0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = q6k0Var.i;
            z1x.P(obj);
        }
        try {
            h();
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public final void h() throws Exception {
        Exception e = null;
        this.d = null;
        this.e = null;
        this.f.set(null);
        this.g.set(null);
        try {
            SipStack sipStack = this.c;
            if (sipStack != null) {
                sipStack.stop();
            }
        } catch (Exception unused) {
        }
        this.c = null;
        SipFactory sipFactory = this.h;
        sipFactory.setPathName("android.gov.nist");
        Properties properties = new Properties();
        properties.setProperty("android.javax.sip.STACK_NAME", this.f29937a);
        properties.setProperty("android.gov.nist.javax.sip.TRACE_LEVEL", "0");
        properties.setProperty("android.gov.nist.javax.sip.SERVER_LOG", "");
        properties.setProperty("android.gov.nist.javax.sip.DEBUG_LOG", "");
        properties.setProperty("android.gov.nist.javax.sip.LOG_MESSAGE_CONTENT", "false");
        properties.setProperty("android.javax.sip.ROUTER_PATH", "android.gov.nist.javax.sip.stack.DefaultRouter");
        properties.setProperty("android.javax.sip.RETRANSMISSION_FILTER", "true");
        properties.setProperty("android.javax.sip.TIMER_T1", "500");
        properties.setProperty("android.javax.sip.TIMER_T2", "4000");
        properties.setProperty("android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_ACK", "false");
        SipStack sipStackCreateSipStack = sipFactory.createSipStack(properties);
        sipStackCreateSipStack.getClass();
        String strB = b();
        for (int i = 0; i < 5; i++) {
            try {
                DatagramSocket datagramSocket = new DatagramSocket(0);
                try {
                    int localPort = datagramSocket.getLocalPort();
                    datagramSocket.close();
                    ListeningPoint listeningPointCreateListeningPoint = sipStackCreateSipStack.createListeningPoint(strB, localPort, ListeningPoint.UDP);
                    listeningPointCreateListeningPoint.getClass();
                    this.c = sipStackCreateSipStack;
                    this.e = listeningPointCreateListeningPoint;
                    this.d = sipStackCreateSipStack.createSipProvider(listeningPointCreateListeningPoint);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(datagramSocket, th);
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
        jf4.n("Failed to bind SIP listening point");
    }

    public final int i() {
        ListeningPoint listeningPoint = this.e;
        if (listeningPoint != null) {
            return listeningPoint.getPort();
        }
        return 0;
    }
}
