package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class wvn implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wvn f39845a = new wvn();
    public static final ewb0 b = x2x.j("EnEventResultState", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = lvn.k.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((lvn) next).f20722a.equals(strZ));
        lvn lvnVar = (lvn) next;
        return lvnVar == null ? lvn.NONE : lvnVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lvn lvnVar = (lvn) obj;
        lvnVar.getClass();
        String str = lvnVar.f20722a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
