package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class aa3 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aa3 f504a = new aa3();
    public static final ewb0 b = x2x.j("AnswerTypes", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        Iterator it = z93.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((z93) next).f43997a.equals(strM));
        z93 z93Var = (z93) next;
        if (z93Var != null) {
            return z93Var;
        }
        v4i0.n(kng0.k("Unknown AnswerTypes code: ", strM));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z93 z93Var = (z93) obj;
        z93Var.getClass();
        String str = z93Var.f43997a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
