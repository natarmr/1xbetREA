package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o7t implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7t f24803a = new o7t();
    public static final ewb0 b = x2x.j("GamesManiaFieldType", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : n7t.d) {
            if (((n7t) obj2).f23057a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        n7t n7tVar = (n7t) obj;
        return n7tVar == null ? n7t.UNKNOWN : n7tVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n7t n7tVar = (n7t) obj;
        n7tVar.getClass();
        String str = n7tVar.f23057a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
