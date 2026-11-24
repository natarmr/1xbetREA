package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cw7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5068a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ cw7(pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f5068a = b;
        this.b = pz40Var;
        this.c = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5068a;
        pz40 pz40Var = this.c;
        pz40 pz40Var2 = this.b;
        switch (b) {
            case 0:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var2.setValue(new daq0(a9q0Var.f491a.b.f42262a.b));
                pz40Var.setValue(Boolean.valueOf(a9q0Var.m(0)));
                return Unit.f46060a;
            case 1:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                pz40Var2.setValue(new daq0(a9q0Var2.f491a.b.f42262a.b));
                pz40Var.setValue(Boolean.valueOf(a9q0Var2.m(0)));
                return Unit.f46060a;
            case 2:
                a9q0 a9q0Var3 = (a9q0) obj;
                a9q0Var3.getClass();
                pz40Var2.setValue(new daq0(a9q0Var3.f491a.b.f42262a.b));
                pz40Var.setValue(Boolean.valueOf(a9q0Var3.m(0)));
                return Unit.f46060a;
            case 3:
                a9q0 a9q0Var4 = (a9q0) obj;
                a9q0Var4.getClass();
                pz40Var2.setValue(new daq0(a9q0Var4.f491a.b.f42262a.b));
                pz40Var.setValue(Boolean.valueOf(a9q0Var4.m(0)));
                return Unit.f46060a;
            case 4:
                a9q0 a9q0Var5 = (a9q0) obj;
                a9q0Var5.getClass();
                if (!((Boolean) pz40Var2.getValue()).booleanValue() && a9q0Var5.f()) {
                    pz40Var2.setValue(Boolean.TRUE);
                } else if (((Boolean) pz40Var2.getValue()).booleanValue() && !((Boolean) pz40Var.getValue()).booleanValue() && a9q0Var5.f()) {
                    pz40Var.setValue(Boolean.TRUE);
                } else if (((Boolean) pz40Var2.getValue()).booleanValue() && ((Boolean) pz40Var.getValue()).booleanValue() && a9q0Var5.b.f <= 1) {
                    pz40Var.setValue(Boolean.FALSE);
                }
                return Unit.f46060a;
            case 5:
                ((lwk) obj).getClass();
                return new pr0(pz40Var2, (Object) pz40Var, (byte) 9);
            case 6:
                ne60 ne60Var = (ne60) obj;
                Iterable iterable = (Iterable) pz40Var2.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((jge0) it.next()).a(ne60Var.f23370a)) {
                            ((Function0) pz40Var.getValue()).invoke();
                        }
                    }
                }
                return Unit.f46060a;
            case 7:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var2.setValue(lz3Var);
                if ((lz3Var instanceof iz3) && !((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                return Unit.f46060a;
            case 8:
                lz3 lz3Var2 = (lz3) obj;
                lz3Var2.getClass();
                pz40Var2.setValue(lz3Var2);
                if ((lz3Var2 instanceof iz3) && !((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                return Unit.f46060a;
            default:
                lz3 lz3Var3 = (lz3) obj;
                lz3Var3.getClass();
                pz40Var2.setValue(lz3Var3);
                if ((lz3Var3 instanceof iz3) && !((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                return Unit.f46060a;
        }
    }
}
