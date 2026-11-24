package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fg30 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fg30 f9473a = new fg30();
    public static final ewb0 b = x2x.j("MatchStatusResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : eg30.d) {
            if (((eg30) obj2).f7742a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        eg30 eg30Var = (eg30) obj;
        return eg30Var == null ? eg30.UNKNOWN : eg30Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eg30 eg30Var = (eg30) obj;
        eg30Var.getClass();
        String str = eg30Var.f7742a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
