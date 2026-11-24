package a;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rag extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tag k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rag(tag tagVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tagVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                rag ragVar = new rag(this.k, yjeVar, (byte) 0);
                ragVar.j = obj;
                return ragVar;
            default:
                rag ragVar2 = new rag(this.k, yjeVar, (byte) 1);
                ragVar2.j = obj;
                return ragVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rag) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rag) create((c5g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tag tagVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                tagVar.h.o(null, Boolean.valueOf((list.isEmpty() || CollectionsKt.L0(CollectionsKt.O0(list)).containsAll(CollectionsKt.N(((ul9) tagVar.f.f384a).b().f24633a))) ? false : true));
                break;
            default:
                c5g c5gVar = (c5g) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Calendar calendar = Calendar.getInstance();
                calendar.set(c5gVar.f3770a, c5gVar.b, c5gVar.c);
                tagVar.i.o(null, new Date(calendar.getTimeInMillis()));
                break;
        }
        return Unit.f46060a;
    }
}
