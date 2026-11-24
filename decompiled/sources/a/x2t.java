package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x2t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40186a;
    public final /* synthetic */ z2t b;

    public /* synthetic */ x2t(z2t z2tVar, byte b) {
        this.f40186a = b;
        this.b = z2tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40186a;
        z2t z2tVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = z2t.h2;
                i1w0 i1w0VarF = a4n0.f(z2tVar);
                z6i z6iVar = z2tVar.e2;
                if (z6iVar != null) {
                    return new ry3(i1w0VarF, z6iVar);
                }
                Intrinsics.h("gamesBetSettingsViewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = z2t.h2;
                z2tVar.V0().C(new g3t(gxo.f12086a));
                return Unit.f46060a;
            case 2:
                iiy[] iiyVarArr3 = z2t.h2;
                z2tVar.V0().C(new g3t(gxo.b));
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr4 = z2t.h2;
                z2tVar.V0().C(new g3t(gxo.c));
                return Unit.f46060a;
        }
    }
}
