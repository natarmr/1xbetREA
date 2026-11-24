package a;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19360a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l3k(Object obj, Object obj2, Object obj3, byte b) {
        this.f19360a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f19360a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return ((m3k) obj3).f21119a.submit(new a4e((Callable) obj2, (prc) obj, (byte) 23));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((ezb0) obj3).e;
                zpv0 zpv0VarZ = workDatabase.z();
                zpv0VarZ.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) kpb.h0(zpv0VarZ.f44780a, true, false, new tpv0(str, (byte) 2)));
                return workDatabase.y().e(str);
        }
    }
}
