package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class onm0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final onm0 f25554a = new onm0();
    public static final ewb0 b = x2x.j("StatusBonus", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : nnm0.i) {
            if (((nnm0) obj2).f23831a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        nnm0 nnm0Var = (nnm0) obj;
        return nnm0Var == null ? nnm0.UNKNOWN : nnm0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nnm0 nnm0Var = (nnm0) obj;
        nnm0Var.getClass();
        String str = nnm0Var.f23831a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
