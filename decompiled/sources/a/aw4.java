package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class aw4 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aw4 f1555a = new aw4();
    public static final ewb0 b = x2x.j("AutoBetCancelStatusResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = yv4.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((yv4) next).f43301a.equals(strM));
        yv4 yv4Var = (yv4) next;
        if (yv4Var != null) {
            return yv4Var;
        }
        v4i0.n(kng0.k("Unknown AutoBetCancelStatusResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yv4 yv4Var = (yv4) obj;
        yv4Var.getClass();
        String str = yv4Var.f43301a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
