package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bi80 extends xo implements Function0 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi80(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.h;
        Object obj = this.f41192a;
        switch (b) {
            case 0:
                di80.b((di80) obj);
                break;
            case 1:
                di80.b((di80) obj);
                break;
            default:
                pv40 pv40Var = (pv40) obj;
                LinkedHashMap linkedHashMap = pv40Var.f27647a;
                LinkedHashMap linkedHashMap2 = pv40Var.f27647a;
                pz40 pz40Var = pv40Var.d;
                if (((u950) xp20.d(linkedHashMap, ((hgk0) pz40Var).getValue())).f35267a.size() > 1) {
                    ((u950) xp20.d(linkedHashMap2, ((hgk0) pz40Var).getValue())).remove(q3d.i((u950) xp20.d(linkedHashMap2, ((hgk0) pz40Var).getValue())));
                }
                break;
        }
        return Unit.f46060a;
    }
}
