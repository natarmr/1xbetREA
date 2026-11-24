package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d7k0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7k0 f5596a = new d7k0();
    public static final ewb0 b = x2x.j("SipTxtType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = c7k0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((c7k0) next).f3868a.equals(strZ));
        c7k0 c7k0Var = (c7k0) next;
        return c7k0Var == null ? c7k0.OTHER : c7k0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c7k0 c7k0Var = (c7k0) obj;
        c7k0Var.getClass();
        String str = c7k0Var.f3868a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
