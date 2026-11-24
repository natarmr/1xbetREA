package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1d f23437a;
    public final z8w0 b;

    public nfi(ddk ddkVar, a1d a1dVar, z8w0 z8w0Var) {
        this.f23437a = a1dVar;
        this.b = z8w0Var;
    }

    public final pxs0 a() {
        Object objC;
        azk domainResolverLogger = this.f23437a.getDomainResolverLogger();
        x1x.y(domainResolverLogger);
        jzk jzkVar = new jzk(this.b);
        kii0 serviceProvider = this.f23437a.getServiceProvider();
        x1x.y(serviceProvider);
        nk50 networkAvailableUtil = this.f23437a.getNetworkAvailableUtil();
        x1x.y(networkAvailableUtil);
        tiu localDnsUseCase = this.f23437a.getLocalDnsUseCase();
        x1x.y(localDnsUseCase);
        tre0 tre0Var = sre0.f32672a;
        sgy sgyVarB = tre0Var.b(vyk.class);
        lii0 lii0Var = (lii0) serviceProvider;
        azj0 azj0Var = lii0Var.b;
        synchronized (azj0Var) {
            objC = azj0Var.c(sgyVarB, azj0Var.a(true, 0L), "https://1xbet.com/");
        }
        return new pxs0(domainResolverLogger, jzkVar, (vyk) objC, (uyk) lii0Var.a(tre0Var.b(uyk.class)), networkAvailableUtil, localDnsUseCase);
    }

    public final wsb0 b() {
        wsb0 preferenceDataSource = this.f23437a.getPreferenceDataSource();
        x1x.y(preferenceDataSource);
        return preferenceDataSource;
    }

    public final c5k c() {
        a1d a1dVar = this.f23437a;
        kii0 serviceProvider = a1dVar.getServiceProvider();
        x1x.y(serviceProvider);
        b6w0 b6w0Var = new b6w0(serviceProvider);
        zjh0 secretLibSettingsRepository = a1dVar.getSecretLibSettingsRepository();
        x1x.y(secretLibSettingsRepository);
        return new c5k(b6w0Var, secretLibSettingsRepository);
    }

    public final ot10 d() {
        pxs0 pxs0VarA = a();
        a1d a1dVar = this.f23437a;
        azk domainResolverLogger = a1dVar.getDomainResolverLogger();
        x1x.y(domainResolverLogger);
        drm0 drm0Var = new drm0(b());
        zjh0 secretLibSettingsRepository = a1dVar.getSecretLibSettingsRepository();
        x1x.y(secretLibSettingsRepository);
        return new ot10(pxs0VarA, domainResolverLogger, drm0Var, this.b, secretLibSettingsRepository, b(), a1dVar.getDomainResolverConfig(), new nr00(new ilp0(b())), a1dVar.getKeys());
    }

    public final zri e() {
        return new zri(this.b, a(), (byte) 10);
    }
}
