package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h1w0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12304a;
    public final /* synthetic */ i1w0 b;

    public /* synthetic */ h1w0(i1w0 i1w0Var, byte b) {
        this.f12304a = b;
        this.b = i1w0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12304a;
        i1w0 i1w0Var = this.b;
        switch (b) {
            case 0:
                return new wu4(new h1w0(i1w0Var, (byte) 2), new gdv0((Object) i1w0Var, (byte) 8));
            case 1:
                return new mf50((wu4) i1w0Var.f.getValue());
            default:
                jmv0 jmv0Var = i1w0Var.d;
                boolean z = false;
                if (jmv0Var != null && ((Boolean) jmv0Var.invoke()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
