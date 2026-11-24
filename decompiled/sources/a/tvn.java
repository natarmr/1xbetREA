package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class tvn implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tvn f34608a = new tvn();
    public static final ewb0 b = x2x.j("EnEventResultStateResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = qvn.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((qvn) next).f29394a.equals(strM));
        qvn qvnVar = (qvn) next;
        if (qvnVar != null) {
            return qvnVar;
        }
        v4i0.n(kng0.k("Unknown EnEventResultStateResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qvn qvnVar = (qvn) obj;
        qvnVar.getClass();
        String str = qvnVar.f29394a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
