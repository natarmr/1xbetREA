package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ac40 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ac40 f612a = new ac40();
    public static final ewb0 b = x2x.j("MetaHeroesPositionResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = zb40.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((zb40) next).f44097a.equals(strZ));
        zb40 zb40Var = (zb40) next;
        return zb40Var == null ? zb40.UNKNOWN : zb40Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zb40 zb40Var = (zb40) obj;
        zb40Var.getClass();
        String str = zb40Var.f44097a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
