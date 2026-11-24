package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final class pwc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwc(rwc rwcVar, int i, int i2, String str, String str2, String str3, yje yjeVar) {
        super(2, yjeVar);
        this.m = rwcVar;
        this.k = i;
        this.l = i2;
        this.n = str;
        this.o = str2;
        this.p = str3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                return new pwc((rwc) this.m, this.k, this.l, (String) this.n, (String) obj3, (String) obj2, yjeVar);
            case 1:
                return new pwc((SimpleDate) this.m, (Calendar) this.n, this.k, this.l, (kwj) obj3, (pz40) obj2, yjeVar);
            case 2:
                pwc pwcVar = new pwc((ArrayList) this.n, (cmt) obj3, (Set) obj2, this.k, this.l, yjeVar);
                pwcVar.m = obj;
                return pwcVar;
            default:
                return new pwc((Object[]) obj3, (j3t0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((pwc) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004c -> B:15:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pwc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwc(ArrayList arrayList, cmt cmtVar, Set set, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.n = arrayList;
        this.o = cmtVar;
        this.p = set;
        this.k = i;
        this.l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwc(SimpleDate simpleDate, Calendar calendar, int i, int i2, kwj kwjVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = simpleDate;
        this.n = calendar;
        this.k = i;
        this.l = i2;
        this.o = kwjVar;
        this.p = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwc(Object[] objArr, j3t0 j3t0Var, yje yjeVar) {
        super(2, yjeVar);
        this.o = objArr;
        this.p = j3t0Var;
    }
}
