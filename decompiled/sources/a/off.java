package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class off implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final off f25165a = new off();
    public static final ewb0 b = x2x.j("CrystalGameStatus", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = nff.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((nff) next).f23434a.equals(strM));
        nff nffVar = (nff) next;
        if (nffVar != null) {
            return nffVar;
        }
        v4i0.n(kng0.k("Unknown CrystalGameStatus code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nff nffVar = (nff) obj;
        nffVar.getClass();
        String str = nffVar.f23434a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
