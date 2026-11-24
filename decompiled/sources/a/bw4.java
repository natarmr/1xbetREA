package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class bw4 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bw4 f3308a = new bw4();
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
        Iterator it = zv4.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((zv4) next).f45038a.equals(strM));
        zv4 zv4Var = (zv4) next;
        if (zv4Var != null) {
            return zv4Var;
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
        zv4 zv4Var = (zv4) obj;
        zv4Var.getClass();
        String str = zv4Var.f45038a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
