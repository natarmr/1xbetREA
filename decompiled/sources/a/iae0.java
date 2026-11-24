package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class iae0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iae0 f14435a = new iae0();
    public static final ewb0 b = x2x.j("ReactionType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = hae0.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((hae0) next).f12720a.equals(strZ));
        hae0 hae0Var = (hae0) next;
        return hae0Var == null ? hae0.ACTION_OPEN_APP : hae0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hae0 hae0Var = (hae0) obj;
        hae0Var.getClass();
        String str = hae0Var.f12720a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
