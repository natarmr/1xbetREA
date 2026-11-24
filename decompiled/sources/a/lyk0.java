package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class lyk0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lyk0 f20866a = new lyk0();
    public static final ewb0 b = x2x.j("SpinAndWinGameStateResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = kyk0.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((kyk0) next).f19109a.equals(strM));
        kyk0 kyk0Var = (kyk0) next;
        if (kyk0Var != null) {
            return kyk0Var;
        }
        v4i0.n(kng0.k("Unknown SpinAndWinGameStateResponse code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kyk0 kyk0Var = (kyk0) obj;
        kyk0Var.getClass();
        String str = kyk0Var.f19109a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
