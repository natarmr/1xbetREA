package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class c7m0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c7m0 f3872a = new c7m0();
    public static final ewb0 b = x2x.j("StatTypeEnumModel", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : b7m0.d) {
            if (((b7m0) obj2).f2117a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        b7m0 b7m0Var = (b7m0) obj;
        return b7m0Var == null ? b7m0.UNKNOWN : b7m0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b7m0 b7m0Var = (b7m0) obj;
        b7m0Var.getClass();
        String str = b7m0Var.f2117a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
