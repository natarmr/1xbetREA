package a;

import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.services.mobile_services.impl.workers.AuthenticatorPushWorker;

/* JADX INFO: loaded from: classes.dex */
public final class c43 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(tzi tziVar, j700 j700Var, zmb zmbVar, List list, List list2, Set set, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.k = tziVar;
        this.l = j700Var;
        this.m = zmbVar;
        this.n = list;
        this.o = list2;
        this.p = set;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                c43 c43Var = new c43(this.m, this.n, obj3, obj2, yjeVar, (byte) 0);
                c43Var.l = obj;
                return c43Var;
            case 1:
                return new c43((AuthenticatorPushWorker) this.k, (Intent) this.l, (String) this.m, (String) this.n, this.j, (String) obj3, (String) obj2, yjeVar);
            case 2:
                return new c43((diu0) this.l, this.m, this.n, obj3, obj2, yjeVar, (byte) 2);
            case 3:
                c43 c43Var2 = new c43((pz40) obj3, (agk0) this.k, (agk0) this.m, (t33) this.n, (pz40) obj2, yjeVar);
                c43Var2.l = obj;
                return c43Var2;
            case 4:
                c43 c43Var3 = new c43((og00) this.n, (zas0) obj3, (ppv0) obj2, yjeVar);
                c43Var3.l = obj;
                return c43Var3;
            case 5:
                c43 c43Var4 = new c43((lbf) obj3, (String) obj2, yjeVar);
                c43Var4.l = obj;
                return c43Var4;
            case 6:
                return new c43((tzi) this.k, (j700) this.l, (zmb) this.m, (List) this.n, (List) obj3, (Set) obj2, this.j, yjeVar);
            case 7:
                return new c43((diu0) this.l, this.m, this.n, obj3, obj2, yjeVar, (byte) 7);
            case 8:
                return new c43((w940) this.k, (String) this.l, (Intent) this.m, (String) this.n, (String) obj3, (k9h0) obj2, yjeVar);
            case 9:
                return new c43(this.m, this.n, obj3, obj2, yjeVar, (byte) 9);
            default:
                c43 c43Var5 = new c43((zii0) this.k, (spt0) this.m, (List) this.n, (Map) obj3, (b0a) obj2, yjeVar);
                c43Var5.l = obj;
                return c43Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((c43) create((h46) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c43) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:302:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:305:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:307:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:308:0x07ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v22, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r3v24, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x07ae -> B:303:0x07b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c43.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(lbf lbfVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.o = lbfVar;
        this.p = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(og00 og00Var, zas0 zas0Var, ppv0 ppv0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.n = og00Var;
        this.o = zas0Var;
        this.p = ppv0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(w940 w940Var, String str, Intent intent, String str2, String str3, k9h0 k9h0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.k = w940Var;
        this.l = str;
        this.m = intent;
        this.n = str2;
        this.o = str3;
        this.p = k9h0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(pz40 pz40Var, agk0 agk0Var, agk0 agk0Var2, t33 t33Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.o = pz40Var;
        this.k = agk0Var;
        this.m = agk0Var2;
        this.n = t33Var;
        this.p = pz40Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(zii0 zii0Var, spt0 spt0Var, List list, Map map, b0a b0aVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.k = zii0Var;
        this.m = spt0Var;
        this.n = list;
        this.o = map;
        this.p = b0aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c43(diu0 diu0Var, Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c43(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c43(AuthenticatorPushWorker authenticatorPushWorker, Intent intent, String str, String str2, boolean z, String str3, String str4, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = authenticatorPushWorker;
        this.l = intent;
        this.m = str;
        this.n = str2;
        this.j = z;
        this.o = str3;
        this.p = str4;
    }
}
