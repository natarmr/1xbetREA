package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ics implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ics f14549a = new ics();
    public static final ewb0 b = x2x.j("GameFlag", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : hcs.d) {
            if (((hcs) obj2).f12840a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        hcs hcsVar = (hcs) obj;
        return hcsVar == null ? hcs.NONE : hcsVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hcs hcsVar = (hcs) obj;
        hcsVar.getClass();
        String str = hcsVar.f12840a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
