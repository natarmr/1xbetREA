package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class zzc implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzc f45246a = new zzc();
    public static final ewb0 b = x2x.j("CoeffBetStateResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = yzc.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((yzc) next).f43508a.equals(strM));
        yzc yzcVar = (yzc) next;
        if (yzcVar != null) {
            return yzcVar;
        }
        v4i0.n(kng0.k("Unknown CoeffBetStateResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yzc yzcVar = (yzc) obj;
        yzcVar.getClass();
        String str = yzcVar.f43508a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
