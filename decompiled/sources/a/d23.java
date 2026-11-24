package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d23 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5337a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ v4q0 c;

    public /* synthetic */ d23(h23 h23Var, v4q0 v4q0Var, byte b) {
        this.f5337a = b;
        this.b = h23Var;
        this.c = v4q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5337a;
        byte b2 = 24;
        v4q0 v4q0Var = this.c;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                c23 c23Var = h23Var.f;
                a13 a13Var = new a13(v4q0Var, (byte) 3);
                mie0 mie0Var = new mie0();
                h23Var.e.d("dataBuilder", c23Var, new mc(mie0Var, a13Var, b2));
                Object obj = mie0Var.f21842a;
                if (obj != null) {
                    return (u4q0) obj;
                }
                Intrinsics.h("result");
                throw null;
            case 1:
                c23 c23Var2 = h23Var.g;
                d23 d23Var = new d23(h23Var, v4q0Var, (byte) 2);
                mie0 mie0Var2 = new mie0();
                h23Var.e.d("positioner", c23Var2, new mc(mie0Var2, d23Var, b2));
                Object obj2 = mie0Var2.f21842a;
                if (obj2 != null) {
                    return (jge0) obj2;
                }
                Intrinsics.h("result");
                throw null;
            default:
                Object objInvoke = h23Var.c.invoke();
                j6z j6zVar = (j6z) (((j6z) objInvoke).h() ? objInvoke : null);
                return j6zVar == null ? jge0.e : v4q0Var.y0(j6zVar).m(j6zVar.Y(0L));
        }
    }
}
