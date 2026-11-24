package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;
import org.xplatform.bet_history.transation_history.presentation.TransactionHistoryScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dwg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6797a;
    public final /* synthetic */ dxg0 b;

    public /* synthetic */ dwg0(dxg0 dxg0Var, byte b) {
        this.f6797a = b;
        this.b = dxg0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f6797a;
        final dxg0 dxg0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                if (th instanceof zhi0) {
                    dxg0Var.w.b(((zhi0) th).c.getErrorCode());
                }
                p7m0 p7m0Var = dxg0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dxg0Var.f.getClass();
                } while (!p7m0Var.m(value, svg0.a((svg0) value, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, null, null, null, null, null, 8386559)));
                dxg0Var.C.b(th, new j5d0(th, dxg0Var, (byte) 22));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                SaleScreenModel saleScreenModel = dxg0Var.o;
                k0w0Var.h(new TransactionHistoryScreen(saleScreenModel.f46405a, String.valueOf(saleScreenModel.c)));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                dxg0Var.H(new vtf0((byte) 28));
                duj dujVar = dxg0Var.C;
                boolean z = th2 instanceof SocketTimeoutException;
                if (z || (th2 instanceof UnknownHostException)) {
                    if (z || (th2 instanceof UnknownHostException)) {
                        dxg0Var.H(new vtf0((byte) 29));
                    } else {
                        final byte b2 = 1;
                        dujVar.b(th2, new Function2() { // from class: a.fwg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                byte b3 = b2;
                                dxg0 dxg0Var2 = dxg0Var;
                                Throwable th3 = (Throwable) obj2;
                                switch (b3) {
                                    case 0:
                                        String str = (String) obj3;
                                        th3.getClass();
                                        str.getClass();
                                        dxg0Var2.G(new pvg0(new xdk0(rek0.b, str, null, null, null, null, 124)));
                                        break;
                                    default:
                                        String str2 = (String) obj3;
                                        th3.getClass();
                                        str2.getClass();
                                        if ((th3 instanceof alx) || (th3 instanceof zhi0)) {
                                            dxg0Var2.G(new pvg0(new xdk0(rek0.b, "", str2, null, null, null, 120)));
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                } else if (th2 instanceof zhi0) {
                    final byte b3 = 0;
                    dujVar.b(th2, new Function2() { // from class: a.fwg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b4 = b3;
                            dxg0 dxg0Var2 = dxg0Var;
                            Throwable th3 = (Throwable) obj2;
                            switch (b4) {
                                case 0:
                                    String str = (String) obj3;
                                    th3.getClass();
                                    str.getClass();
                                    dxg0Var2.G(new pvg0(new xdk0(rek0.b, str, null, null, null, null, 124)));
                                    break;
                                default:
                                    String str2 = (String) obj3;
                                    th3.getClass();
                                    str2.getClass();
                                    if ((th3 instanceof alx) || (th3 instanceof zhi0)) {
                                        dxg0Var2.G(new pvg0(new xdk0(rek0.b, "", str2, null, null, null, 120)));
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    dxg0Var.M();
                } else {
                    dxg0Var.M();
                }
                break;
        }
        return Unit.f46060a;
    }
}
