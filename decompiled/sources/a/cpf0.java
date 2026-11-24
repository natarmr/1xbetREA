package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cpf0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cpf0 f4743a = new cpf0();
    public static final ewb0 b = x2x.j("ResidentGameState", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = bpf0.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((bpf0) next).f2980a.equals(strM));
        bpf0 bpf0Var = (bpf0) next;
        if (bpf0Var != null) {
            return bpf0Var;
        }
        v4i0.n(kng0.k("Unknown ResidentGameState code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bpf0 bpf0Var = (bpf0) obj;
        bpf0Var.getClass();
        String str = bpf0Var.f2980a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
