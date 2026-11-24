package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class vk10 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vk10 f37554a = new vk10();
    public static final ewb0 b = x2x.j("LuckyWheelBonusType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : uk10.j) {
            if (((uk10) obj2).f35805a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        uk10 uk10Var = (uk10) obj;
        return uk10Var == null ? uk10.NOTHING : uk10Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uk10 uk10Var = (uk10) obj;
        uk10Var.getClass();
        String str = uk10Var.f35805a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
