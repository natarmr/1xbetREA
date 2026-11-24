package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class boq implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2947a;
    public final /* synthetic */ mie0 b;

    public /* synthetic */ boq(mie0 mie0Var, byte b) {
        this.f2947a = b;
        this.b = mie0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f2947a;
        mie0 mie0Var = this.b;
        switch (b) {
            case 0:
                mie0Var.f21842a = obj;
                throw new t(this);
            case 1:
                mie0Var.f21842a = obj;
                throw new t(this);
            default:
                mie0Var.f21842a = obj;
                return Unit.f46060a;
        }
    }
}
