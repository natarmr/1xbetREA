package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class msf implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final msf f22317a = new msf();
    public static final ewb0 b = x2x.j("Cs2WinTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = lsf.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((lsf) next).f20576a.equals(strZ));
        lsf lsfVar = (lsf) next;
        return lsfVar == null ? lsf.TERRORIST_WIN : lsfVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lsf lsfVar = (lsf) obj;
        lsfVar.getClass();
        String str = lsfVar.f20576a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
