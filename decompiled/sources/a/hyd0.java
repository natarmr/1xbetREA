package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hyd0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hyd0 f13854a = new hyd0();
    public static final ewb0 b = x2x.j("RainbowSixStatisticMapDraftTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = gyd0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((gyd0) next).f12122a.equals(strZ));
        gyd0 gyd0Var = (gyd0) next;
        return gyd0Var == null ? gyd0.UNKNOWN : gyd0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gyd0 gyd0Var = (gyd0) obj;
        gyd0Var.getClass();
        String str = gyd0Var.f12122a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
