package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class f8v0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f8v0 f9128a = new f8v0();
    public static final ewb0 b = x2x.j("WeightClassResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = e8v0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((e8v0) next).f7392a.equals(strZ));
        e8v0 e8v0Var = (e8v0) next;
        return e8v0Var == null ? e8v0.UNKNOWN : e8v0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e8v0 e8v0Var = (e8v0) obj;
        e8v0Var.getClass();
        String str = e8v0Var.f7392a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
