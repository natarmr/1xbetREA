package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wcq0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wcq0 f38936a = new wcq0();
    public static final ewb0 b = x2x.j("ThrowFactorResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = vcq0.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((vcq0) next).f37199a.equals(strZ));
        vcq0 vcq0Var = (vcq0) next;
        return vcq0Var == null ? vcq0.UNKNOWN : vcq0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vcq0 vcq0Var = (vcq0) obj;
        vcq0Var.getClass();
        String str = vcq0Var.f37199a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
