package a;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ukg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f35826a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(null);
    public final byte[] d = new byte[2048];

    public static boolean c(DatagramPacket datagramPacket) {
        if (datagramPacket.getLength() <= 12) {
            return false;
        }
        byte[] data = datagramPacket.getData();
        data.getClass();
        int offset = datagramPacket.getOffset();
        if ((data[offset] & 192) != 128) {
            return false;
        }
        int i = data[offset + 1] & 127;
        return i == 0 || i == 3;
    }

    public final boolean a(DatagramPacket datagramPacket) {
        InetAddress address = datagramPacket.getAddress();
        if (address == null) {
            return false;
        }
        InetSocketAddress inetSocketAddress = new InetSocketAddress(address, datagramPacket.getPort());
        AtomicReference atomicReference = this.c;
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) atomicReference.get();
        if (Intrinsics.d(inetSocketAddress2, inetSocketAddress)) {
            return true;
        }
        AtomicReference atomicReference2 = this.b;
        if (inetSocketAddress2 != null) {
            if (!Intrinsics.d(inetSocketAddress2.getAddress(), address) || !c(datagramPacket)) {
                return false;
            }
            atomicReference.set(inetSocketAddress);
            atomicReference2.set(inetSocketAddress);
            return true;
        }
        if (!c(datagramPacket)) {
            return false;
        }
        while (!atomicReference.compareAndSet(null, inetSocketAddress)) {
            if (atomicReference.get() != null) {
                return Intrinsics.d(atomicReference.get(), inetSocketAddress);
            }
        }
        atomicReference2.set(inetSocketAddress);
        return true;
    }

    public final Object b(gc1 gc1Var) {
        rwj rwjVar = tvk.f34603a;
        Object objD0 = qjj.d0(dvj.c, new tkg0(this, null, (byte) 0), gc1Var);
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }
}
