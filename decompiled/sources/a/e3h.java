package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e3h implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3h f7134a = new e3h();
    public static final ewb0 b = x2x.j("CyberLolEventTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = d3h.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((d3h) next).f5403a.equals(strZ));
        d3h d3hVar = (d3h) next;
        return d3hVar == null ? d3h.UNKNOWN : d3hVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d3h d3hVar = (d3h) obj;
        d3hVar.getClass();
        String str = d3hVar.f5403a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
