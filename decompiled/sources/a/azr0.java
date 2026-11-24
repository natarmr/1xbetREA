package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class azr0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azr0 f1734a = new azr0();
    public static final ewb0 b = x2x.j("CounterTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = zyr0.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((zyr0) next).f45219a.equals(strM));
        zyr0 zyr0Var = (zyr0) next;
        if (zyr0Var != null) {
            return zyr0Var;
        }
        v4i0.n(kng0.k("Unknown CounterTypeResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zyr0 zyr0Var = (zyr0) obj;
        zyr0Var.getClass();
        String str = zyr0Var.f45219a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
