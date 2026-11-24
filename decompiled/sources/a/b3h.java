package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class b3h implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3h f1904a = new b3h();
    public static final ewb0 b = x2x.j("CyberLolEventNumberResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = a3h.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((a3h) next).f171a.equals(strZ));
        a3h a3hVar = (a3h) next;
        return a3hVar == null ? a3h.UNKNOWN : a3hVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a3h a3hVar = (a3h) obj;
        a3hVar.getClass();
        String str = a3hVar.f171a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
