package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class uvn implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uvn f36358a = new uvn();
    public static final ewb0 b = x2x.j("EnEventResultStateResponse", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : rvn.d) {
            if (((rvn) obj2).f31178a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        rvn rvnVar = (rvn) obj;
        return rvnVar == null ? rvn.NONE : rvnVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rvn rvnVar = (rvn) obj;
        rvnVar.getClass();
        String str = rvnVar.f31178a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
