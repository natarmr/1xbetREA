package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ce70 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ce70 f4198a = new ce70();
    public static final ewb0 b = x2x.j("OneXGamesWorkStatus", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = be70.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((be70) next).f2435a.equals(strM));
        be70 be70Var = (be70) next;
        if (be70Var != null) {
            return be70Var;
        }
        v4i0.n(kng0.k("Unknown WorkStatus code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        be70 be70Var = (be70) obj;
        be70Var.getClass();
        String str = be70Var.f2435a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
