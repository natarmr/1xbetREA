package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen$Companion$invoke$1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zxn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45169a;
    public final /* synthetic */ zyn0 b;

    public /* synthetic */ zxn0(zyn0 zyn0Var, byte b) {
        this.f45169a = b;
        this.b = zyn0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f45169a;
        zyn0 zyn0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zyn0Var.v.getClass();
                ypn0.h2.getClass();
                k0w0Var.l(new DialogScreen$Companion$invoke$1(ypn0.j2, new v4i0((byte) 9)));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                zyn0Var.l0 = true;
                sac.V(jiu0.a(zyn0Var), eyn0.f8635a, null, null, new byn0(zyn0Var, null, (byte) 1), 14);
                break;
            default:
                ((Throwable) obj).getClass();
                v3c.N(zyn0Var.p0);
                v3c.N(zyn0Var.r0);
                v3c.N(zyn0Var.q0);
                if (!((vxn0) zyn0Var.D()).h) {
                    zyn0Var.T();
                    p7m0 p7m0Var = zyn0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        zyn0Var.f.getClass();
                    } while (!p7m0Var.m(value, vxn0.a((vxn0) value, null, lak0.c, false, false, false, false, false, true, null, null, null, null, null, false, false, true, null, 98121)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
