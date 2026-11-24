package a;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j7b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16031a;
    public final /* synthetic */ js20 b;

    public /* synthetic */ j7b(js20 js20Var, byte b) {
        this.f16031a = b;
        this.b = js20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16031a) {
            case 0:
                r6b r6bVar = (r6b) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(r6bVar.d);
                linkedHashMap.put(Long.valueOf(this.b.a()), iun.f15405a);
                return r6b.a(r6bVar, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, false, false, 524279);
            default:
                oyg0 oyg0Var = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                oyg0Var.getClass();
                z2sVar.getClass();
                Long lValueOf = null;
                js20 js20Var = this.b;
                if (js20Var != null) {
                    if (!(js20Var instanceof gs20) && !(js20Var instanceof hs20)) {
                        if (js20Var instanceof is20) {
                            lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                        }
                    }
                    Long l = lValueOf;
                    q7x.F(oyg0Var, l, "KEY_CATEGORY_ID");
                    return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, l, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, js20Var, null, null, null, null, null, null, null, null, false, null, -65, 65519);
                }
                t9f.b();
                return null;
        }
    }
}
