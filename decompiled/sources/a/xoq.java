package a;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xoq implements ee60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41233a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xoq(Object obj, byte b) {
        this.f41233a = b;
        this.b = obj;
    }

    @Override // a.ee60
    public final void a(Object obj) {
        HashMap map;
        byte b = this.f41233a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((hzb0) obj2).f(obj);
                return;
            default:
                cyu cyuVar = (cyu) obj2;
                yh00 yh00Var = (yh00) obj;
                synchronized (((HashMap) cyuVar.b)) {
                    map = new HashMap((HashMap) cyuVar.b);
                    break;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new llo(entry, yh00Var, (byte) 15));
                }
                return;
        }
    }
}
