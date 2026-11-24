package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class kee implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kee f18150a = new kee();
    public static final ewb0 b = x2x.j("ContentIconTypeResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : jee.d) {
            if (((jee) obj2).f16369a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        jee jeeVar = (jee) obj;
        return jeeVar == null ? jee.UNKNOWN : jeeVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jee jeeVar = (jee) obj;
        jeeVar.getClass();
        String str = jeeVar.f16369a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
