package a;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s7b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31742a;
    public final /* synthetic */ xvm0 b;

    public /* synthetic */ s7b(xvm0 xvm0Var, byte b) {
        this.f31742a = b;
        this.b = xvm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31742a) {
            case 0:
                r6b r6bVar = (r6b) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(r6bVar.b);
                linkedHashMap.put(Long.valueOf(this.b.getId()), yw7.f43357a);
                return r6b.a(r6bVar, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 524285);
            case 1:
                oyg0 oyg0Var = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                oyg0Var.getClass();
                z2sVar.getClass();
                xvm0 xvm0Var = this.b;
                long id = xvm0Var.getId();
                q7x.F(oyg0Var, Long.valueOf(id), "KEY_SUB_GAME_ID");
                return z2s.a(z2sVar, 0L, null, null, false, 0L, id, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, xvm0Var, null, null, null, null, null, null, null, null, null, false, null, -33, 65527);
            default:
                xvm0 xvm0Var2 = this.b;
                long id2 = xvm0Var2.getId();
                q7x.F((oyg0) obj, Long.valueOf(id2), "KEY_SUB_GAME_ID");
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, id2, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, xvm0Var2, null, null, null, null, null, null, null, null, null, false, null, -33, 65527);
        }
    }
}
