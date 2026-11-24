package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class jzv0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17433a;
    public final /* synthetic */ rzv0 b;

    public /* synthetic */ jzv0(rzv0 rzv0Var, byte b) {
        this.f17433a = b;
        this.b = rzv0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f17433a;
        rzv0 rzv0Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                nn60 nn60Var = rzv0Var.t;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    axq.t(((i8p) it.next()).f14350a, arrayList);
                }
                i3t0.B(rzv0Var, nn60Var, new en60[]{new xm60(arrayList)});
                p7m0 p7m0Var = rzv0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    rzv0Var.f.getClass();
                } while (!p7m0Var.m(value, bzv0.a((bzv0) value, null, new e9p(list), null, false, null, false, 61)));
                break;
            case 1:
                String str = (String) obj;
                oyg0 oyg0Var = rzv0Var.f;
                ocj ocjVar = rzv0Var.i;
                int i = rzv0.D;
                if (!rzv0Var.w.a().W1) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, bzv0.a((bzv0) value3, str, null, null, false, null, false, 62)));
                } else if (str.length() < 2) {
                    e3c.n(rzv0Var.z);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, bzv0.a((bzv0) value2, str, null, null, false, null, false, 6)));
                } else if (!((bzv0) rzv0Var.D()).d || !((bzv0) rzv0Var.D()).f3492a.equals(str) || ((bzv0) rzv0Var.D()).e == null || ((bzv0) rzv0Var.D()).f) {
                    rzv0Var.P(str);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    int i2 = rzv0.D;
                    rzv0Var.O();
                }
                break;
        }
        return Unit.f46060a;
    }
}
