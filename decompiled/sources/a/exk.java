package a;

/* JADX INFO: loaded from: classes2.dex */
public final class exk extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8581a;
    public final p78 b;

    public exk(byte b) {
        this.f8581a = b;
        switch (b) {
            case 1:
                this.b = new saq0();
                break;
            default:
                this.b = new dtw((byte) 1);
                break;
        }
    }

    @Override // a.a1
    public void a(CharSequence charSequence) {
        byte b = this.f8581a;
    }

    @Override // a.a1
    public boolean b(p78 p78Var) {
        switch (this.f8581a) {
            case 0:
                return true;
            default:
                return super.b(p78Var);
        }
    }

    @Override // a.a1
    public final p78 d() {
        byte b = this.f8581a;
        p78 p78Var = this.b;
        switch (b) {
            case 0:
                return (dtw) p78Var;
            default:
                return (saq0) p78Var;
        }
    }

    @Override // a.a1
    public boolean e() {
        switch (this.f8581a) {
            case 0:
                return true;
            default:
                return super.e();
        }
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        switch (this.f8581a) {
            case 0:
                return iyc.a(yxkVar.b);
            default:
                return null;
        }
    }

    private final void h(CharSequence charSequence) {
    }
}
