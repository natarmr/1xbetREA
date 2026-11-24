package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class vip implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vip f37490a = new vip();
    public static final ewb0 b = x2x.j("FeedKindResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        uip uipVar;
        String strZ = rkjVar.z();
        Iterator it = uip.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            uipVar = (uip) next;
            if (uipVar.f35743a.equals(strZ)) {
                break;
            }
        } while (!uipVar.b.contains(strZ));
        uip uipVar2 = (uip) next;
        return uipVar2 == null ? uip.c : uipVar2;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uip uipVar = (uip) obj;
        uipVar.getClass();
        String str = uipVar.f35743a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
