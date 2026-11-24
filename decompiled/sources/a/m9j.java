package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m9j implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m9j f21411a = new m9j();
    public static final ewb0 b = x2x.j("DartsPlayerMoveResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = l9j.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((l9j) next).f19655a.equals(strZ));
        l9j l9jVar = (l9j) next;
        return l9jVar == null ? l9j.PAUSE : l9jVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l9j l9jVar = (l9j) obj;
        l9jVar.getClass();
        String str = l9jVar.f19655a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
