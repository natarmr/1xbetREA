package a;

/* JADX INFO: loaded from: classes3.dex */
public final class htt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu f13650a;
    public final k7u b;

    public htt(cu cuVar, k7u k7uVar) {
        k7uVar.getClass();
        this.f13650a = cuVar;
        this.b = k7uVar;
    }

    public final lhf0 a(long j, long j2, String str) {
        yje yjeVar = null;
        k7u k7uVar = this.b;
        cu cuVar = this.f13650a;
        if (str == null) {
            return new lhf0(new gst(), new u47((Object) cuVar, (Object) new vb7(k7uVar.f17841a.b().getId(), j, j2), yjeVar, (byte) 10));
        }
        return new lhf0(new gst(), new u47((Object) cuVar, (Object) new ub7(str, k7uVar.f17841a.b().getId(), j), yjeVar, (byte) 9));
    }
}
