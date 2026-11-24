package a;

/* JADX INFO: loaded from: classes3.dex */
public final class a7w0 implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f395a;
    public final n5d0 b;

    public /* synthetic */ a7w0(svs0 svs0Var, n5d0 n5d0Var, byte b) {
        this.f395a = b;
        this.b = n5d0Var;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f395a;
        n5d0 n5d0Var = this.b;
        switch (b) {
            case 0:
                i6a i6aVar = (i6a) n5d0Var.get();
                i6aVar.getClass();
                zjh0 secretLibSettingsRepository = i6aVar.getSecretLibSettingsRepository();
                x1x.y(secretLibSettingsRepository);
                return secretLibSettingsRepository;
            case 1:
                kii0 kii0Var = (kii0) n5d0Var.get();
                kii0Var.getClass();
                return (t4w0) ((lii0) kii0Var).f20108a.b(sre0.f32672a.b(t4w0.class));
            case 2:
                i6a i6aVar2 = (i6a) n5d0Var.get();
                i6aVar2.getClass();
                et2 et2VarA = i6aVar2.a();
                x1x.y(et2VarA);
                return et2VarA;
            case 3:
                j6w0 j6w0Var = (j6w0) n5d0Var.get();
                j6w0Var.getClass();
                return new y2w0(j6w0Var);
            case 4:
                j6w0 j6w0Var2 = (j6w0) n5d0Var.get();
                j6w0Var2.getClass();
                return new z4w0(j6w0Var2);
            case 5:
                j6w0 j6w0Var3 = (j6w0) n5d0Var.get();
                j6w0Var3.getClass();
                return new b5w0(j6w0Var3);
            default:
                i6a i6aVar3 = (i6a) n5d0Var.get();
                i6aVar3.getClass();
                bwt bwtVarE = i6aVar3.e();
                x1x.y(bwtVarE);
                return bwtVarE;
        }
    }
}
