package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class w7e implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38668a;
    public final /* synthetic */ qoj0 b;
    public final /* synthetic */ g45 c;

    public /* synthetic */ w7e(qoj0 qoj0Var, g45 g45Var, byte b) {
        this.f38668a = b;
        this.b = qoj0Var;
        this.c = g45Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        u7e u7eVar;
        i8e i8eVar;
        o8e o8eVar;
        byte b = this.f38668a;
        g45 g45Var = this.c;
        qoj0 qoj0Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof u7e) {
                    u7eVar = (u7e) yjeVar;
                    int i = u7eVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u7eVar.j = i - Integer.MIN_VALUE;
                    } else {
                        u7eVar = new u7e(this, yjeVar);
                    }
                } else {
                    u7eVar = new u7e(this, yjeVar);
                }
                Object obj = u7eVar.i;
                wne wneVar = wne.f39444a;
                int i2 = u7eVar.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                osa osaVar = new osa(kmqVar, g45Var);
                u7eVar.j = 1;
                qoj0Var.c(osaVar, u7eVar);
                return wneVar;
            case 1:
                if (yjeVar instanceof i8e) {
                    i8eVar = (i8e) yjeVar;
                    int i3 = i8eVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        i8eVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        i8eVar = new i8e(this, yjeVar);
                    }
                } else {
                    i8eVar = new i8e(this, yjeVar);
                }
                Object obj2 = i8eVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = i8eVar.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        z1x.P(obj2);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                s7e s7eVar = new s7e(kmqVar, g45Var, b2);
                i8eVar.j = 1;
                qoj0Var.c(s7eVar, i8eVar);
                return wneVar2;
            default:
                if (yjeVar instanceof o8e) {
                    o8eVar = (o8e) yjeVar;
                    int i5 = o8eVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        o8eVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        o8eVar = new o8e(this, yjeVar);
                    }
                } else {
                    o8eVar = new o8e(this, yjeVar);
                }
                Object obj3 = o8eVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = o8eVar.j;
                if (i6 != 0) {
                    if (i6 == 1) {
                        z1x.P(obj3);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj3);
                s7e s7eVar2 = new s7e(kmqVar, g45Var, (byte) 2);
                o8eVar.j = 1;
                qoj0Var.c(s7eVar2, o8eVar);
                return wneVar3;
        }
    }
}
