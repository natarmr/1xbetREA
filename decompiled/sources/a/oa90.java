package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oa90 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oa90 f24918a = new oa90();
    public static final ewb0 b = x2x.j("PaymentType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : na90.e) {
            if (((na90) obj2).f23180a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        na90 na90Var = (na90) obj;
        return na90Var == null ? na90.UNKNOWN : na90Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        na90 na90Var = (na90) obj;
        na90Var.getClass();
        String str = na90Var.f23180a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
