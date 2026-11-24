package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class yy0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43446a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ yy0(pz40 pz40Var, byte b) {
        this.f43446a = b;
        this.b = pz40Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f43446a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ((Function1) pz40Var.getValue()).invoke(iy0.f15565a);
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    ((Function1) pz40Var.getValue()).invoke(en1.f8071a);
                }
                break;
            case 2:
                ((Function1) pz40Var.getValue()).invoke(obj);
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                pz40Var.setValue(bool);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                pz40Var.setValue(bool2);
                break;
            case 7:
                if (((nlx) obj) instanceof nel) {
                    float f = q4m.f28104a;
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
            case 8:
                if (((nlx) obj) instanceof nel) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                pz40Var.setValue(bool3);
                break;
        }
        return Unit.f46060a;
    }
}
