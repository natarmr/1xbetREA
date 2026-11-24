package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cbh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4061a;
    public final /* synthetic */ ujd b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ k3t0 d;

    public /* synthetic */ cbh(ujd ujdVar, Fragment fragment, gbh gbhVar, k3t0 k3t0Var) {
        this.f4061a = (byte) 1;
        this.b = ujdVar;
        this.c = fragment;
        this.d = k3t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4061a;
        k3t0 k3t0Var = this.d;
        Fragment fragment = this.c;
        ujd ujdVar = this.b;
        switch (b) {
            case 0:
                ((lwk) obj).getClass();
                ujdVar.c(fragment, new qq2(), new ebh(k3t0Var, (byte) 0));
                return new fbh(ujdVar, fragment, (byte) 0);
            case 1:
                sbh sbhVar = (sbh) obj;
                sbhVar.getClass();
                if (!(sbhVar instanceof sbh)) {
                    t9f.b();
                    return null;
                }
                ujdVar.b(fragment, sbhVar.f31933a);
                k3t0Var.x(jbh.f16240a);
                return Unit.f46060a;
            default:
                zdf0 zdf0Var = (zdf0) obj;
                zdf0Var.getClass();
                ujdVar.b(fragment, zdf0Var.f44211a);
                k3t0Var.x(rdf0.f30289a);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cbh(ujd ujdVar, Fragment fragment, k3t0 k3t0Var, byte b) {
        this.f4061a = b;
        this.b = ujdVar;
        this.c = fragment;
        this.d = k3t0Var;
    }
}
