package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fpf0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fpf0 f9926a = new fpf0();
    public static final ewb0 b = x2x.j("ResidentGameStatus", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = epf0.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((epf0) next).f8186a.equals(strM));
        epf0 epf0Var = (epf0) next;
        if (epf0Var != null) {
            return epf0Var;
        }
        v4i0.n(kng0.k("Unknown ResidentGameStatus code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        epf0 epf0Var = (epf0) obj;
        epf0Var.getClass();
        String str = epf0Var.f8186a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
