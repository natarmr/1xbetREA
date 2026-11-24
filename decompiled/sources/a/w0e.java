package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w0e extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Throwable j;
    public final /* synthetic */ g1e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0e(Throwable th, g1e g1eVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = th;
        this.k = g1eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g1e g1eVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                return new w0e(th, g1eVar, yjeVar, (byte) 0);
            default:
                return new w0e(th, g1eVar, yjeVar, (byte) 1);
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
        return ((w0e) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        o0e o0eVar = o0e.f24420a;
        Throwable th = this.j;
        g1e g1eVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    g1eVar.C.f(o0eVar);
                } else if (th instanceof zhi0) {
                    kuw kuwVar = ((zhi0) th).c;
                    if (kuwVar == i2o.AuthCodeConfirmationLimit) {
                        ol60 ol60Var = g1eVar.C;
                        String message = th.getMessage();
                        ol60Var.f(new k0e(message != null ? message : ""));
                    } else if (kuwVar == i2o.TokenExpiredError) {
                        ol60 ol60Var2 = g1eVar.C;
                        String message2 = th.getMessage();
                        ol60Var2.f(new p0e(message2 != null ? message2 : ""));
                    } else if (kuwVar == i2o.OnlyOperatorCanEditParticipants) {
                        ol60 ol60Var3 = g1eVar.C;
                        String message3 = th.getMessage();
                        ol60Var3.f(new m0e(message3 != null ? message3 : ""));
                    } else {
                        g1eVar.E(th.getMessage());
                    }
                } else {
                    g1eVar.E(th.getMessage());
                    g1eVar.j.c("Login error: " + th.getMessage(), th);
                    g1eVar.C.f(b0e.f1762a);
                }
                break;
            default:
                ctf0 ctf0Var = g1eVar.n;
                ol60 ol60Var4 = g1eVar.C;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (th instanceof mu4) {
                    ol60Var4.f(new l0e(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                    i1w0 i1w0Var = g1eVar.c;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                            ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayList, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayList, 0);
                            while (true) {
                                paw pawVar2 = (paw) listIteratorP2;
                                if (pawVar2.hasNext()) {
                                    i1w0Var.a((oe50) pawVar2.next());
                                }
                            }
                        }
                    }
                } else if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    ol60Var4.f(o0eVar);
                } else if (th instanceof zhi0) {
                    if (th instanceof uoo) {
                        ol60Var4.f(new k0e(ctf0Var.b.a(R.string.expired_operation_time_connection, Arrays.copyOf(new Object[0], 0))));
                    } else {
                        g1eVar.E(th.getMessage());
                    }
                } else if (!(th instanceof SSLException)) {
                    g1eVar.e.b(th, new y0e(g1eVar, (byte) 1));
                }
                break;
        }
        return Unit.f46060a;
    }
}
