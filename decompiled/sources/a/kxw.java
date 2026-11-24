package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class kxw implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kxw f19079a = new kxw();
    public static final ewb0 b = x2x.j("IdentificationFlowConfigEnum", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = jxw.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((jxw) next).f17331a.equals(strZ));
        jxw jxwVar = (jxw) next;
        return jxwVar == null ? jxw.NO_VERIFICATION : jxwVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jxw jxwVar = (jxw) obj;
        jxwVar.getClass();
        String str = jxwVar.f17331a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
