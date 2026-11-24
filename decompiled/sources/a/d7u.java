package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class d7u implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5611a;
    public final /* synthetic */ i89 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d7u(i89 i89Var, Object obj, List list, List list2, boolean z, boolean z2, byte b) {
        this.f5611a = b;
        this.b = i89Var;
        this.g = obj;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        b7u b7uVar;
        agu aguVar;
        byte b = this.f5611a;
        Object obj = this.g;
        i89 i89Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof b7u) {
                    b7uVar = (b7u) yjeVar;
                    int i = b7uVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b7uVar.j = i - Integer.MIN_VALUE;
                    } else {
                        b7uVar = new b7u(this, yjeVar);
                    }
                } else {
                    b7uVar = new b7u(this, yjeVar);
                }
                Object obj2 = b7uVar.i;
                wne wneVar = wne.f39444a;
                int i2 = b7uVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    b3g b3gVar = new b3g(kmqVar, (f7u) obj, this.c, this.d, this.e, this.f, (byte) 1);
                    b7uVar.j = 1;
                    if (i89Var.c(b3gVar, b7uVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof agu) {
                    aguVar = (agu) yjeVar;
                    int i3 = aguVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aguVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        aguVar = new agu(this, yjeVar);
                    }
                } else {
                    aguVar = new agu(this, yjeVar);
                }
                Object obj3 = aguVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = aguVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    b3g b3gVar2 = new b3g(kmqVar, (dgu) obj, this.c, this.d, this.e, this.f, (byte) 2);
                    aguVar.j = 1;
                    if (i89Var.c(b3gVar2, aguVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
