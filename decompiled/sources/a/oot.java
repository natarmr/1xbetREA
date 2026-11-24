package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class oot implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25609a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public oot(gmq[] gmqVarArr, boolean z, List list) {
        this.f25609a = (byte) 1;
        this.c = gmqVarArr;
        this.b = z;
        this.d = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        mot motVar;
        e5u e5uVar;
        f700 f700Var;
        byte b = this.f25609a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof mot) {
                    motVar = (mot) yjeVar;
                    int i = motVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        motVar.j = i - Integer.MIN_VALUE;
                    } else {
                        motVar = new mot(this, yjeVar);
                    }
                } else {
                    motVar = new mot(this, yjeVar);
                }
                Object obj3 = motVar.i;
                wne wneVar = wne.f39444a;
                int i2 = motVar.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    n7c n7cVar = new n7c(kmqVar, (zri) obj, z, b2);
                    motVar.j = 1;
                    if (((a1g) obj2).c(n7cVar, motVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof e5u) {
                    e5uVar = (e5u) yjeVar;
                    int i3 = e5uVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        e5uVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        e5uVar = new e5u(this, yjeVar);
                    }
                } else {
                    e5uVar = new e5u(this, yjeVar);
                }
                Object obj4 = e5uVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = e5uVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    gmq[] gmqVarArr = (gmq[]) obj2;
                    ti3 ti3Var = new ti3(gmqVarArr, (byte) 6);
                    xpp xppVar = new xpp((yje) null, z, (List) obj);
                    e5uVar.j = 1;
                    if (tdc.G(e5uVar, kmqVar, xppVar, ti3Var, gmqVarArr) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof f700) {
                    f700Var = (f700) yjeVar;
                    int i5 = f700Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        f700Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        f700Var = new f700(this, yjeVar);
                    }
                } else {
                    f700Var = new f700(this, yjeVar);
                }
                Object obj5 = f700Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = f700Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    n7c n7cVar2 = new n7c(kmqVar, (wdu) obj, z, (byte) 2);
                    f700Var.j = 1;
                    if (((utb) obj2).c(n7cVar2, f700Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ oot(gmq gmqVar, Object obj, boolean z, byte b) {
        this.f25609a = b;
        this.c = gmqVar;
        this.d = obj;
        this.b = z;
    }
}
