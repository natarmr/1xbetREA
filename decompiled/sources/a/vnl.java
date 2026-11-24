package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vnl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37723a;
    public final /* synthetic */ List b;
    public final /* synthetic */ b0i c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ vnl(List list, b0i b0iVar, Function1 function1, Function2 function2, byte b) {
        this.f37723a = b;
        this.b = list;
        this.c = b0iVar;
        this.d = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37723a) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                j2l j2lVar = new j2l((byte) 16);
                List list = this.b;
                hczVar.f(list.size(), new vtf(j2lVar, list, (byte) 26), new bzh(list, (byte) 10), new ugd(2039820996, true, new ynl(list, this.c, this.d, this.e, (byte) 0)));
                break;
            default:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                j2l j2lVar2 = new j2l((byte) 17);
                List list2 = this.b;
                i8zVar.e(list2.size(), new vtf(j2lVar2, list2, (byte) 27), null, new bzh(list2, (byte) 11), new ugd(-1942245546, true, new ynl(list2, this.c, this.d, this.e, (byte) 1)));
                break;
        }
        return Unit.f46060a;
    }
}
