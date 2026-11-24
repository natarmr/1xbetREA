package a;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4677a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ co(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f4677a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        byte b = this.f4677a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                yfd yfdVar = (yfd) obj4;
                LinkedHashMap linkedHashMap = yfdVar.e;
                String str = (String) obj3;
                wn wnVar = (wn) obj2;
                bsr0 bsr0Var = (bsr0) obj;
                if (kkz.ON_START == kkzVar) {
                    Bundle bundle = yfdVar.g;
                    LinkedHashMap linkedHashMap2 = yfdVar.f;
                    linkedHashMap.put(str, new eo(wnVar, bsr0Var));
                    if (linkedHashMap2.containsKey(str)) {
                        Object obj5 = linkedHashMap2.get(str);
                        linkedHashMap2.remove(str);
                        wnVar.a(obj5);
                    }
                    ActivityResult activityResult = (ActivityResult) knx.P(bundle, str, ActivityResult.class);
                    if (activityResult != null) {
                        bundle.remove(str);
                        wnVar.a(bsr0Var.i0(activityResult.f45280a, activityResult.b));
                    }
                } else if (kkz.ON_STOP == kkzVar) {
                    linkedHashMap.remove(str);
                } else if (kkz.ON_DESTROY == kkzVar) {
                    yfdVar.f(str);
                }
                break;
            default:
                nac0 nac0Var = (nac0) obj4;
                cqq cqqVar = (cqq) obj3;
                pkk0 pkk0Var = (pkk0) obj2;
                pz40 pz40Var = (pz40) obj;
                if (kkzVar == kkz.ON_RESUME && ((Boolean) pz40Var.getValue()).booleanValue() && nac0Var.c) {
                    cqq.a(cqqVar);
                    if (pkk0Var != null) {
                        ((r3k) pkk0Var).b();
                    }
                    break;
                }
                break;
        }
    }
}
