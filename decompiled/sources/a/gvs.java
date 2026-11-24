package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class gvs implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11990a;
    public final /* synthetic */ f3j b;

    public /* synthetic */ gvs(f3j f3jVar, byte b) {
        this.f11990a = b;
        this.b = f3jVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f11990a;
        f3j f3jVar = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p7m0 p7m0Var = (p7m0) f3jVar.q;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, yus.a((yus) value, 0L, null, 0L, false, 0L, null, null, null, false, false, false, false, zBooleanValue, false, false, 0L, null, false, 516095)));
                break;
            case 1:
                u5s u5sVar = (u5s) obj;
                p7m0 p7m0Var2 = (p7m0) f3jVar.q;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, yus.a((yus) value2, 0L, null, 0L, false, 0L, null, null, null, false, u5sVar instanceof s5s, false, false, false, false, false, 0L, null, false, 523775)));
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                p7m0 p7m0Var3 = (p7m0) f3jVar.q;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, yus.a((yus) value3, 0L, null, 0L, false, 0L, null, null, null, zBooleanValue2, false, false, false, false, false, false, 0L, null, false, 524031)));
                break;
        }
        return Unit.f46060a;
    }
}
