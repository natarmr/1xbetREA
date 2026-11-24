package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fkq implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9705a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ fkq(Object obj, int i, int i2, Object obj2, int i3, int i4, byte b) {
        this.f9705a = b;
        this.b = obj;
        this.c = i;
        this.d = i2;
        this.e = obj2;
        this.f = i3;
        this.g = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9705a;
        int i = this.g;
        int i2 = this.f;
        Object obj2 = this.e;
        int i3 = this.d;
        int i4 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                mie0 mie0Var = (mie0) obj3;
                mie0 mie0Var2 = (mie0) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                pu90 pu90Var = (pu90) mie0Var.f21842a;
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, (i4 - i3) / 2, 0.0f);
                }
                pu90 pu90Var2 = (pu90) mie0Var2.f21842a;
                if (pu90Var2 != null) {
                    pu90 pu90Var3 = (pu90) mie0Var.f21842a;
                    ou90Var.m(pu90Var2, (pu90Var3 != null ? pu90Var3.e0() : 0) + i2, (i4 - i) / 2, 0.0f);
                }
                break;
            case 1:
                mie0 mie0Var3 = (mie0) obj3;
                mie0 mie0Var4 = (mie0) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                pu90 pu90Var4 = (pu90) mie0Var3.f21842a;
                if (pu90Var4 != null) {
                    ou90Var2.m(pu90Var4, 0, (i4 - i3) / 2, 0.0f);
                }
                pu90 pu90Var5 = (pu90) mie0Var4.f21842a;
                if (pu90Var5 != null) {
                    pu90 pu90Var6 = (pu90) mie0Var3.f21842a;
                    ou90Var2.m(pu90Var5, (pu90Var6 != null ? pu90Var6.e0() : 0) + i2, (i4 - i) / 2, 0.0f);
                }
                break;
            default:
                ou90 ou90Var3 = (ou90) obj;
                ou90Var3.getClass();
                ou90Var3.m((pu90) obj3, i4, i3, 0.0f);
                ou90Var3.m((pu90) obj2, i2, i, 0.0f);
                break;
        }
        return Unit.f46060a;
    }
}
