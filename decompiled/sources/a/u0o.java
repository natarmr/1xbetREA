package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u0o implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f34863a;
    public final Enum b;
    public final ewb0 c;

    public u0o(Enum[] enumArr, Enum r2) {
        enumArr.getClass();
        this.f34863a = enumArr;
        this.b = r2;
        this.c = x2x.j("ErrorCodeEnumSerializer", zvb0.j);
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Object obj = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            v4i0.n("This serializer can be used only with JSON format");
            return null;
        }
        Integer intOrNull = StringsKt.toIntOrNull(ncy.j(icyVar.g()).b());
        for (Object obj2 : this.f34863a) {
            int errorCode = ((kuw) obj2).getErrorCode();
            if (intOrNull != null && errorCode == intOrNull.intValue()) {
                obj = obj2;
                break;
            }
        }
        return obj == null ? this.b : obj;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.c;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Object obj2 = (Enum) obj;
        obj2.getClass();
        bwnVar.B(((kuw) obj2).getErrorCode());
    }
}
