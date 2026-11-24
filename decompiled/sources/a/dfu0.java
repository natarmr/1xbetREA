package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class dfu0 {
    public static final List b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6017a;

    static {
        wen.b.getClass();
        wen wenVar = new wen(0L);
        bfn bfnVar = bfn.SECONDS;
        b = q3d.j(wenVar, new wen(ibc.v0(1, bfnVar)), new wen(ibc.v0(2, bfnVar)), new wen(ibc.v0(4, bfnVar)), new wen(ibc.v0(8, bfnVar)), new wen(ibc.v0(15, bfnVar)));
    }

    public final long a() {
        Object obj;
        int i = this.f6017a;
        List list = b;
        if (i < 0 || i >= list.size()) {
            wen wenVar = (wen) CollectionsKt.d0(list);
            long j = wenVar.f39026a;
            obj = wenVar;
        } else {
            obj = list.get(i);
        }
        long j2 = ((wen) obj).f39026a;
        this.f6017a++;
        return j2;
    }
}
