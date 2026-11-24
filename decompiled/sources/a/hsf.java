package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hsf implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hsf f13579a = new hsf();
    public static final ewb0 b = x2x.j("Cs2TeamRoleResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = gsf.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((gsf) next).f11827a.equals(strZ));
        gsf gsfVar = (gsf) next;
        if (gsfVar != null) {
            return gsfVar;
        }
        v4i0.n(kng0.k("Unknown Cs2TeamRoleResponse code: ", strZ));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gsf gsfVar = (gsf) obj;
        gsfVar.getClass();
        String str = gsfVar.f11827a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
