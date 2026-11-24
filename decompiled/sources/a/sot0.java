package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sot0 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ xot0 j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sot0(xot0 xot0Var, ArrayList arrayList, int i, int i2, int i3, yje yjeVar) {
        super(1, yjeVar);
        this.j = xot0Var;
        this.k = arrayList;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new sot0(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((sot0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        xot0 xot0Var;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControlImpl#issueSingleCaptureAsync");
            }
            odd oddVar = xot0.l;
            ArrayList arrayList = this.k;
            Iterator it = arrayList.iterator();
            loop0: while (true) {
                boolean zHasNext = it.hasNext();
                xot0Var = this.j;
                if (!zHasNext) {
                    break;
                }
                t7a t7aVar = (t7a) it.next();
                if (!Collections.unmodifiableList(t7aVar.f33457a).isEmpty()) {
                    List listUnmodifiableList = Collections.unmodifiableList(t7aVar.f33457a);
                    listUnmodifiableList.getClass();
                    Iterator it2 = listUnmodifiableList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((Map) xot0Var.c.f.getValue()).get((hzj) it2.next()) == null) {
                            }
                        }
                    }
                }
                xot0.n(arrayList.size(), "Capture request failed due to invalid surface");
                break loop0;
            }
            rot0 rot0VarO = xot0.o(xot0Var.k);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControl: Submitting still captures to capture pipeline");
            }
            f8a f8aVar = (f8a) xot0Var.h.getValue();
            onf0 onf0Var = rot0VarO.d;
            onf0Var.getClass();
            int i = onf0Var.f25544a;
            hx9 hx9VarC = rot0VarO.f30856a.c();
            this.i = true;
            obj = f8aVar.b(arrayList, i, hx9VarC, this.l, this.m, this.n, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return (List) obj;
    }
}
