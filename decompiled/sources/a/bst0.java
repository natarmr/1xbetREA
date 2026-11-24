package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.main_menu.impl.navigation.MainMenuFragmentScreen;
import org.xplatform.settings.impl.navigation.SettingsScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bst0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3149a;
    public final /* synthetic */ daf b;

    public /* synthetic */ bst0(daf dafVar, byte b) {
        this.f3149a = b;
        this.b = dafVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3149a;
        daf dafVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new bst0(dafVar, (byte) 2));
                break;
            case 1:
                i1w0 i1w0Var2 = (i1w0) obj;
                i1w0Var2.getClass();
                i1w0Var2.d(new bst0(dafVar, (byte) 3));
                break;
            case 2:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new SettingsScreenFactoryImpl$getScreen$1((pmi0) dafVar.c, d6j0.c)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            default:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                zx10 zx10Var = (zx10) dafVar.e;
                r040 r040Var = r040.TOP;
                r9u r9uVar = (r9u) zx10Var.f45137a;
                ygp ygpVar = ygp.f;
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(new MainMenuFragmentScreen(r040Var, true, false, j1q0Var.f15748a.d(ygpVar))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
        }
        return Unit.f46060a;
    }
}
