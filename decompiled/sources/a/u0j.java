package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u0j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34856a;
    public final /* synthetic */ v0j b;

    public /* synthetic */ u0j(v0j v0jVar, byte b) {
        this.f34856a = b;
        this.b = v0jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34856a;
        v0j v0jVar = this.b;
        switch (b) {
            case 0:
                nwd nwdVar = v0j.p2;
                fiu0 fiu0Var = v0jVar.n2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nwd nwdVar2 = v0j.p2;
                fxb.D(ivb0.b, new u0j(v0jVar, (byte) 3)).a();
                return Unit.f46060a;
            case 2:
                nwd nwdVar3 = v0j.p2;
                fxb.D(ivb0.b, new u0j(v0jVar, (byte) 4)).a();
                return Unit.f46060a;
            case 3:
                nwd nwdVar4 = v0j.p2;
                v0jVar.P0().x(s0j.f31410a);
                return Unit.f46060a;
            default:
                nwd nwdVar5 = v0j.p2;
                v0jVar.P0().x(r0j.f29632a);
                return Unit.f46060a;
        }
    }
}
