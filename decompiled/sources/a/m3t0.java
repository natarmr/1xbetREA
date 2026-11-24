package a;

import android.net.Uri;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class m3t0 extends ex5 {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public m3t0() {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // a.jbj
    public final void close() {
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.j;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            o();
        }
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) throws l3t0 {
        DatagramSocket datagramSocket;
        Uri uri = mbjVar.f21512a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        p();
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                datagramSocket = this.i;
                this.h = datagramSocket;
            } else {
                DatagramSocket datagramSocket2 = new DatagramSocket(inetSocketAddress);
                this.h = datagramSocket2;
                datagramSocket = datagramSocket2;
            }
            datagramSocket.setSoTimeout(JosStatusCodes.RTN_CODE_COMMON_ERROR);
            this.k = true;
            q(mbjVar);
            return -1L;
        } catch (IOException e) {
            throw new l3t0(e, 2001);
        } catch (SecurityException e2) {
            throw new l3t0(e2, 2006);
        }
    }

    @Override // a.jbj
    public final Uri getUri() {
        return this.g;
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) throws l3t0 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.l;
        DatagramPacket datagramPacket = this.f;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.l = length;
                f(length);
            } catch (SocketTimeoutException e) {
                throw new l3t0(e, 2002);
            } catch (IOException e2) {
                throw new l3t0(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.l;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.e, length2 - i4, bArr, i, iMin);
        this.l -= iMin;
        return iMin;
    }
}
