package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.chips.Chip;

/* JADX INFO: loaded from: classes6.dex */
public final class ufe implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35574a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public ufe(int i, kwj kwjVar, cgk0 cgk0Var) {
        this.b = i;
        this.c = kwjVar;
        this.d = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35574a;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Chip chip = (Chip) obj;
                chip.getClass();
                chip.setText(((beo0) obj3).f2461a);
                chip.setSelected(i == ((Number) ((cgk0) ((l7m0) obj2)).getValue()).intValue());
                break;
            case 1:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                if (i == ((kwj) obj3).k()) {
                    ((cgk0) obj2).m((int) (j6zVar.g() >> 32));
                }
                break;
            default:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                pz40 pz40Var = (pz40) obj3;
                pz40Var.setValue(Long.valueOf(((Number) pz40Var.getValue()).longValue() + 1));
                ((ngk0) obj2).put(Integer.valueOf(i), j6zVar2);
                break;
        }
        return Unit.f46060a;
    }

    public ufe(pz40 pz40Var, ngk0 ngk0Var, int i) {
        this.c = pz40Var;
        this.d = ngk0Var;
        this.b = i;
    }

    public ufe(beo0 beo0Var, int i, l7m0 l7m0Var) {
        this.c = beo0Var;
        this.b = i;
        this.d = l7m0Var;
    }
}
