package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hh70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13048a;
    public final /* synthetic */ mh70 b;

    public /* synthetic */ hh70(mh70 mh70Var, byte b) {
        this.f13048a = b;
        this.b = mh70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13048a;
        mh70 mh70Var = this.b;
        switch (b) {
            case 0:
                jh70 jh70Var = mh70.Q1;
                i1w0 i1w0VarF = a4n0.f(mh70Var);
                o6i o6iVar = mh70Var.L1;
                if (o6iVar != null) {
                    return new ry3(i1w0VarF, o6iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                mh70.G0(mh70Var);
                return Unit.f46060a;
        }
    }
}
