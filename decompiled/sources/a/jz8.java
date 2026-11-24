package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class jz8 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jz8 f17397a = new jz8();
    public static final ewb0 b = x2x.j("BrandViewType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = iz8.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((iz8) next).f15624a.equals(strM));
        iz8 iz8Var = (iz8) next;
        if (iz8Var != null) {
            return iz8Var;
        }
        v4i0.n(kng0.k("Unknown BrandViewType code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iz8 iz8Var = (iz8) obj;
        iz8Var.getClass();
        String str = iz8Var.f15624a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
