package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;

/* JADX INFO: loaded from: classes3.dex */
public final class s9g extends bnn0 implements Function2 {
    public final /* synthetic */ kie0 A;
    public final /* synthetic */ Function1 B;
    public final /* synthetic */ List Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long f1;
    public CyberCalendarPeriodView i;
    public List j;
    public List k;
    public kie0 l;
    public Function1 m;
    public List n;
    public Iterator o;
    public Iterator p;
    public i9g q;
    public long r;
    public long s;
    public int t;
    public int u;
    public byte v;
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ CyberCalendarPeriodView x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9g(ArrayList arrayList, CyberCalendarPeriodView cyberCalendarPeriodView, ArrayList arrayList2, List list, kie0 kie0Var, Function1 function1, List list2, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.w = arrayList;
        this.x = cyberCalendarPeriodView;
        this.y = arrayList2;
        this.z = list;
        this.A = kie0Var;
        this.B = function1;
        this.Y = list2;
        this.Z = j;
        this.f1 = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new s9g(this.w, this.x, this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s9g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0184 A[EDGE_INSN: B:140:0x0184->B:40:0x0184 BREAK  A[LOOP:1: B:34:0x016f->B:141:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[LOOP:1: B:34:0x016f->B:141:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[LOOP:2: B:35:0x0171->B:142:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0177  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x02db -> B:121:0x02e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x031c -> B:122:0x0307). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00c0 -> B:16:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:140:0x0184
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s9g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
