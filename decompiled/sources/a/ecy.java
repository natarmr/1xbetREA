package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ecy implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7590a;

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        switch (this.f7590a) {
            case 0:
                throw new hwn("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                t960 t960Var = (t960) obj2;
                t960Var.a(g5d0.f, entry.getKey());
                t960Var.a(g5d0.g, entry.getValue());
                return;
            default:
                throw new hwn("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
