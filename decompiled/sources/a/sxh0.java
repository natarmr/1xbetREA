package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sxh0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sxh0 f32977a = new sxh0();
    public static final ewb0 b = x2x.j("SekaMatchStateTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = rxh0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((rxh0) next).f31265a.equals(strZ));
        rxh0 rxh0Var = (rxh0) next;
        return rxh0Var == null ? rxh0.WAIT_FIRST_CARD : rxh0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rxh0 rxh0Var = (rxh0) obj;
        rxh0Var.getClass();
        String str = rxh0Var.f31265a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
