package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class q9j implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q9j f28350a = new q9j();
    public static final ewb0 b = x2x.j("DartsWinnerResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = p9j.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((p9j) next).f26608a.equals(strZ));
        p9j p9jVar = (p9j) next;
        return p9jVar == null ? p9j.UNKNOWN : p9jVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p9j p9jVar = (p9j) obj;
        p9jVar.getClass();
        String str = p9jVar.f26608a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
