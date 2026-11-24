package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gdy implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gdy f11125a = new gdy();
    public static final fdy b = fdy.b;

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        fww.t(rkjVar);
        mrv.o0(jsm0.f17060a);
        return new edy((Map) mrv.N(ysm0.f43175a, qcy.f28507a).deserialize(rkjVar));
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        edy edyVar = (edy) obj;
        edyVar.getClass();
        fww.u(bwnVar);
        mrv.o0(jsm0.f17060a);
        mrv.N(ysm0.f43175a, qcy.f28507a).serialize(bwnVar, edyVar);
    }
}
