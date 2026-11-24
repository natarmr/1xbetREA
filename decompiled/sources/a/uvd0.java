package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class uvd0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uvd0 f36344a = new uvd0();
    public static final ewb0 b = x2x.j("RainbowGameStatisticMainStatRoleResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = tvd0.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((tvd0) next).f34594a.equals(strZ));
        tvd0 tvd0Var = (tvd0) next;
        if (tvd0Var != null) {
            return tvd0Var;
        }
        v4i0.n(kng0.k("Unknown RainbowGameStatisticMainStatRoleResponse code: ", strZ));
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tvd0 tvd0Var = (tvd0) obj;
        tvd0Var.getClass();
        String str = tvd0Var.f34594a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
