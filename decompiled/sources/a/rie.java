package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class rie implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rie f30539a = new rie();
    public static final ewb0 b = x2x.j("ContentTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : qie.i) {
            if (((qie) obj2).f28787a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        qie qieVar = (qie) obj;
        return qieVar == null ? qie.UNKNOWN : qieVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qie qieVar = (qie) obj;
        qieVar.getClass();
        String str = qieVar.f28787a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
