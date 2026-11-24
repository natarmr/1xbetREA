package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c7g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3860a;
    public final /* synthetic */ f7g b;

    public /* synthetic */ c7g(f7g f7gVar, byte b) {
        this.f3860a = b;
        this.b = f7gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3860a;
        f7g f7gVar = this.b;
        switch (b) {
            case 0:
                nwd nwdVar = f7g.o2;
                f7gVar.Q0().e.clearFocus();
                j120.Y(f7gVar);
                return Unit.f46060a;
            case 1:
                xdi xdiVar = f7gVar.g2;
                if (xdiVar != null) {
                    return new q0h0(xdiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                nwd nwdVar2 = f7g.o2;
                mhc mhcVar = new mhc(2, f7gVar.W0(), j7g.class, "onDisciplineItemClicked", "onDisciplineItemClicked(JZ)V", 0, (byte) 18);
                x6g x6gVar = new x6g(x6g.f);
                x6gVar.d.b(new gbn(new jyf((byte) 8), new pue(3, (byte) 9), new ejd(mhcVar, (byte) 27), fpd.v));
                return x6gVar;
        }
    }
}
