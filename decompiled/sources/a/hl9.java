package a;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class hl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13246a = new LinkedHashMap();
    public final p7m0 b;
    public final p7m0 c;
    public final p7m0 d;
    public final LinkedHashMap e;
    public final ol60 f;

    public hl9() {
        iun iunVar = iun.f15405a;
        this.b = q7m0.a(new o4g(iunVar, iunVar));
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(new Date().getTime());
        this.c = q7m0.a(new c5g(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(5), yag.f42295a, false));
        this.d = q7m0.a(iunVar);
        this.e = new LinkedHashMap();
        this.f = new ol60(3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        el9 el9Var;
        if (zjeVar instanceof el9) {
            el9Var = (el9) zjeVar;
            int i = el9Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                el9Var.k = i - Integer.MIN_VALUE;
            } else {
                el9Var = new el9(this, zjeVar);
            }
        } else {
            el9Var = new el9(this, zjeVar);
        }
        Object obj = el9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = el9Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            this.f13246a.clear();
            iun iunVar = iun.f15405a;
            el9Var.k = 1;
            this.d.n(iunVar);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ol60 ol60Var = this.f;
        ol60Var.d.clear();
        ((LinkedBlockingDeque) ol60Var.e.getValue()).clear();
        return Unit.f46060a;
    }
}
