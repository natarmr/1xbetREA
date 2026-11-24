package a;

import android.os.Build;
import android.view.Window;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s1d implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31450a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public s1d(Window window, boolean z) {
        this.c = window;
        this.b = z;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws UnknownHostException {
        ycm0 ziv0Var;
        Object value;
        zhe zheVar;
        Object value2;
        byte b = this.f31450a;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Window window = (Window) obj2;
                if (window != null) {
                    boolean z2 = !z && zBooleanValue;
                    ani0 ani0Var = new ani0(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        ziv0Var = new bjv0(window, ani0Var);
                    } else if (i >= 30) {
                        ziv0Var = new ajv0(window, ani0Var);
                    } else {
                        ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                    }
                    ziv0Var.w(z2);
                }
                return Unit.f46060a;
            default:
                nqo nqoVar = (nqo) obj;
                tqo tqoVar = (tqo) obj2;
                oyg0 oyg0Var = tqoVar.f;
                ocj ocjVar = tqoVar.i;
                if (Intrinsics.d(nqoVar, lqo.f20495a)) {
                    throw new UnknownHostException();
                }
                if (!(nqoVar instanceof mqo)) {
                    t9f.b();
                    return null;
                }
                zhe zheVar2 = new zhe(((mqo) nqoVar).f22235a);
                if (z) {
                    gie gieVar = ((pqo) tqoVar.D()).h;
                    zhe zheVar3 = gieVar instanceof zhe ? (zhe) gieVar : null;
                    List list = zheVar3 != null ? zheVar3.f44389a : null;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    List list2 = list;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, pqo.a((pqo) value2, null, false, list2, null, zheVar2, null, null, null, 1887)));
                } else {
                    gie gieVar2 = ((pqo) tqoVar.D()).i;
                    zhe zheVar4 = gieVar2 instanceof zhe ? (zhe) gieVar2 : null;
                    List list3 = zheVar4 != null ? zheVar4.f44389a : null;
                    if (list3 == null) {
                        list3 = iun.f15405a;
                    }
                    List list4 = list3;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                        zheVar = zheVar2;
                        zheVar2 = zheVar;
                    } while (!p7m0Var2.m(value, pqo.a((pqo) value, null, false, null, list4, null, zheVar, null, null, 1727)));
                }
                int i2 = tqo.G;
                v3c.N(tqoVar.D);
                tqoVar.D = i3t0.K(tqoVar, null, null, new vnn((byte) 1, (yje) null, tqoVar, z), 3);
                tqoVar.N();
                return Unit.f46060a;
        }
    }

    public s1d(boolean z, tqo tqoVar) {
        this.b = z;
        this.c = tqoVar;
    }
}
