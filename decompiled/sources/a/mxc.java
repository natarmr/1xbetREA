package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mxc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qxc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxc(qxc qxcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qxcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qxc qxcVar = this.k;
        switch (b) {
            case 0:
                return new mxc(qxcVar, yjeVar, (byte) 0);
            default:
                mxc mxcVar = new mxc(qxcVar, yjeVar, (byte) 1);
                mxcVar.j = ((Boolean) obj).booleanValue();
                return mxcVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mxc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mxc) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        qxc qxcVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lyt lytVar = qxcVar.g;
                    mvc mvcVar = qxcVar.b;
                    this.j = true;
                    obj = lytVar.b(mvcVar, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    uvc uvcVar = (uvc) obj2;
                    if (uvcVar.h != bp5.DEEPLINK_TYPE || uvcVar.k.length() != 0) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    qxcVar.y();
                } else {
                    p7m0 p7m0Var = qxcVar.m;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, yvc.a((yvc) value, arrayList, 0, null, 0L, 28)));
                }
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = qxcVar.m;
                if (z2) {
                    qxcVar.w();
                } else {
                    List list = ((yvc) p7m0Var2.getValue()).f43311a;
                    boolean z3 = ((yvc) p7m0Var2.getValue()).b;
                    if (list.isEmpty() && z3) {
                        qxcVar.y();
                    }
                }
                return Unit.f46060a;
        }
    }
}
