package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class prf0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final prf0 f27463a = new prf0();
    public static final ewb0 b = x2x.j("ResidentSafeState", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = orf0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((orf0) next).f25734a.equals(strM));
        orf0 orf0Var = (orf0) next;
        if (orf0Var != null) {
            return orf0Var;
        }
        v4i0.n(kng0.k("Unknown ResidentSafeState code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        orf0 orf0Var = (orf0) obj;
        orf0Var.getClass();
        String str = orf0Var.f25734a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
