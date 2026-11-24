package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class c80 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c80 f3888a = new c80();
    public static final ewb0 b = x2x.j("AfricanRouletteBetTypeRequest", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : b80.d) {
            if (((b80) obj2).f2133a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        b80 b80Var = (b80) obj;
        return b80Var == null ? b80.UNKNOWN : b80Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b80 b80Var = (b80) obj;
        b80Var.getClass();
        String str = b80Var.f2133a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
