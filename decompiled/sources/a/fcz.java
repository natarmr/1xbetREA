package a;

/* JADX INFO: loaded from: classes.dex */
public final class fcz extends sj9 implements pcz {
    public final abu p;

    public fcz(uwq uwqVar) {
        super(uwqVar, true);
        this.p = new abu();
    }

    @Override // a.pcz
    public final void a(jru jruVar, mcz mczVar) {
        abu abuVar = this.p;
        abuVar.b = mczVar;
        abuVar.c = jruVar;
        i(abuVar);
    }

    @Override // a.pcz
    public final void b(rbz rbzVar, int i) {
        int i2 = rbzVar.f30213a;
        if (i2 == -1) {
            i2 = 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            rbzVar.a(i + i3);
        }
    }

    @Override // a.pcz
    public final void c(jru jruVar, float f, mcz mczVar) {
        abu abuVar = this.p;
        abuVar.b = mczVar;
        abuVar.c = jruVar;
        h(abuVar, f);
    }
}
