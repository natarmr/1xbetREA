package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nuf implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nuf f24143a = new nuf();
    public static final ewb0 b = x2x.j("CupisVerificationState", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        for (Object obj2 : muf.d) {
            if (((muf) obj2).f22410a.equals(strM)) {
                obj = obj2;
                break;
            }
        }
        muf mufVar = (muf) obj;
        return mufVar == null ? muf.UNKNOWN : mufVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        muf mufVar = (muf) obj;
        mufVar.getClass();
        String str = mufVar.f22410a;
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            bwnVar.B(intOrNull.intValue());
        } else {
            bwnVar.E(str);
        }
    }
}
