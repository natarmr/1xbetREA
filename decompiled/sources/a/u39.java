package a;

/* JADX INFO: loaded from: classes4.dex */
public final class u39 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34985a;
    public final /* synthetic */ pbz b;

    public /* synthetic */ u39(pbz pbzVar, byte b) {
        this.f34985a = b;
        this.b = pbzVar;
    }

    @Override // a.kwk
    public final void a() {
        byte b = this.f34985a;
        pbz pbzVar = this.b;
        switch (b) {
            case 0:
                if (pbzVar != null) {
                    pbzVar.b();
                }
                break;
            case 1:
                if (pbzVar != null) {
                    pbzVar.b();
                }
                break;
            default:
                pbzVar.f = true;
                pbzVar.d = 0;
                pbzVar.b.f28462a.remove(pbzVar);
                pbz pbzVar2 = pbzVar.e;
                if (pbzVar2 != null) {
                    pbzVar2.b();
                }
                pbzVar.e = null;
                break;
        }
    }
}
