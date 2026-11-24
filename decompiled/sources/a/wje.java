package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class wje extends xje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f39259a;

    public wje(Function1 function1) {
        this.f39259a = function1;
    }

    @Override // a.xje
    public final jiy a(List list) {
        list.getClass();
        return (jiy) this.f39259a.invoke(list);
    }
}
