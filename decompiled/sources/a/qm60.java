package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qm60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28968a;
    public final /* synthetic */ FragmentScreen b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qm60(FragmentScreen fragmentScreen, boolean z, byte b) {
        this.f28968a = b;
        this.b = fragmentScreen;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28968a;
        boolean z = this.c;
        FragmentScreen fragmentScreen = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(fragmentScreen).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(!z, bjkVar, bjkVar);
                break;
            default:
                k0w0Var.getClass();
                c8d c8dVar2 = (c8d) k0w0Var.h(fragmentScreen).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(!z, bjkVar2, bjkVar2);
                break;
        }
        return Unit.f46060a;
    }
}
