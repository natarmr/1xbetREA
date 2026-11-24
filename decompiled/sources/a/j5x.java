package a;

import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class j5x implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5x f15955a = new j5x();
    public static final ewb0 b = x2x.j("IndianPokerMatchStateTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object next;
        String strZ = rkjVar.z();
        Iterator it = i5x.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((i5x) next).f14215a.equals(strZ));
        i5x i5xVar = (i5x) next;
        return i5xVar == null ? i5x.WAIT_FIRST_CARD : i5xVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i5x i5xVar = (i5x) obj;
        i5xVar.getClass();
        String str = i5xVar.f14215a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
