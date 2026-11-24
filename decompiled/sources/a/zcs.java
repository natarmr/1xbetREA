package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zcs implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zcs f44180a;
    private static final ugi0 descriptor;

    static {
        zcs zcsVar = new zcs();
        f44180a = zcsVar;
        scx scxVar = new scx("org.xplatform.betting.core.zip.data.mappers.GameId", zcsVar);
        scxVar.j("value", false);
        descriptor = scxVar;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        return new bds(rkjVar.y(descriptor).i());
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        long j = ((bds) obj).f2414a;
        bwn bwnVarA = bwnVar.A(descriptor);
        if (bwnVarA == null) {
            return;
        }
        bwnVarA.l(j);
    }
}
