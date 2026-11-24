package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mjl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21900a;
    public final /* synthetic */ yjl b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ mjl(yjl yjlVar, Function1 function1, byte b) {
        this.f21900a = b;
        this.b = yjlVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21900a;
        Function1 function1 = this.c;
        yjl yjlVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Iterator<E> it = yjlVar.f42744a.iterator();
                    while (it.hasNext()) {
                        jeb.m(null, (bkl) it.next(), function1, fetVar, 0);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Iterator<E> it2 = yjlVar.f42744a.iterator();
                    while (it2.hasNext()) {
                        ny9.l(null, (bkl) it2.next(), function1, fetVar, 0);
                    }
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
