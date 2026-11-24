package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ee8 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ee8 f7658a = new ee8();
    public static final ewb0 b = x2x.j("BonusEnabledType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : de8.d) {
            if (((de8) obj2).f5936a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        de8 de8Var = (de8) obj;
        return de8Var == null ? de8.NOTHING : de8Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        de8 de8Var = (de8) obj;
        de8Var.getClass();
        String str = de8Var.f5936a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
