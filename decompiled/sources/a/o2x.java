package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class o2x implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2x f24552a = new o2x();
    public static final ewb0 b = x2x.j("ImageVariant", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("Expected JSON decoder");
            return null;
        }
        String strM = hne.m(icyVar);
        if (StringsKt.W(strM)) {
            return jz60.f17395a;
        }
        Integer intOrNull = StringsKt.toIntOrNull(strM);
        return new kz60(intOrNull != null ? intOrNull.intValue() : 0);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lz60 lz60Var = (lz60) obj;
        lz60Var.getClass();
        if (lz60Var instanceof jz60) {
            bwnVar.E("");
        } else if (lz60Var instanceof kz60) {
            bwnVar.E(String.valueOf(((kz60) lz60Var).f19140a));
        } else {
            t9f.b();
        }
    }
}
