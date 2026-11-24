package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rpg implements x0a0, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqg f30885a;

    public rpg(vqg vqgVar) {
        this.f30885a = vqgVar;
    }

    @Override // a.x0a0
    public final void a(String str) {
        str.getClass();
        vqg vqgVar = this.f30885a;
        vqgVar.getClass();
        sac.V(jiu0.a(vqgVar), new vlf((byte) 21), null, null, new e9g(vqgVar, str, null, (byte) 6), 14);
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f30885a, vqg.class, "onSelectPlayer", "onSelectPlayer(Ljava/lang/String;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof x0a0) && (obj instanceof fer)) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
