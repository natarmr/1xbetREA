package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nfg0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nfg0 f23435a = new nfg0();
    public static final ewb0 b = x2x.j("RouletteTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = mfg0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((mfg0) next).f21693a.equals(strZ));
        mfg0 mfg0Var = (mfg0) next;
        return mfg0Var == null ? mfg0.EUROPEAN : mfg0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mfg0 mfg0Var = (mfg0) obj;
        mfg0Var.getClass();
        String str = mfg0Var.f21693a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
