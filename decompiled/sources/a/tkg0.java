package a;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class tkg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ukg0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tkg0(ukg0 ukg0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ukg0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ukg0 ukg0Var = this.j;
        switch (b) {
            case 0:
                return new tkg0(ukg0Var, yjeVar, (byte) 0);
            default:
                return new tkg0(ukg0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((tkg0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws SocketException {
        byte b = this.i;
        ukg0 ukg0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                AtomicReference atomicReference = ukg0Var.f35826a;
                DatagramSocket datagramSocket = (DatagramSocket) atomicReference.get();
                if (datagramSocket != null && !datagramSocket.isClosed()) {
                    return Unit.f46060a;
                }
                DatagramSocket datagramSocket2 = new DatagramSocket();
                datagramSocket2.setSoTimeout(100);
                while (!atomicReference.compareAndSet(datagramSocket, datagramSocket2)) {
                    if (atomicReference.get() != datagramSocket) {
                        datagramSocket2.close();
                        return Unit.f46060a;
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                DatagramSocket datagramSocket3 = (DatagramSocket) ukg0Var.f35826a.get();
                if (datagramSocket3 != null) {
                    try {
                        byte[] bArr = ukg0Var.d;
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
                        datagramSocket3.receive(datagramPacket);
                        if (ukg0Var.a(datagramPacket)) {
                            byte[] data = datagramPacket.getData();
                            data.getClass();
                            return qx3.j(data, datagramPacket.getOffset(), datagramPacket.getOffset() + datagramPacket.getLength());
                        }
                    } catch (SocketTimeoutException | Exception unused) {
                    }
                }
                return null;
        }
    }
}
