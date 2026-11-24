package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class xpv0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xpv0 f41285a = new xpv0();
    public static final ewb0 b = x2x.j("WorkStatusResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = uo60.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((uo60) next).f35997a.equals(strM));
        uo60 uo60Var = (uo60) next;
        if (uo60Var != null) {
            return uo60Var;
        }
        v4i0.n(kng0.k("Unknown WorkStatusResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uo60 uo60Var = (uo60) obj;
        uo60Var.getClass();
        String str = uo60Var.f35997a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
