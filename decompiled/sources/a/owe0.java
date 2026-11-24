package a;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class owe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public String j;
    public int k;
    public byte l;
    public final /* synthetic */ xcz m;
    public final /* synthetic */ Map n;
    public final /* synthetic */ pz40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owe0(xcz xczVar, Map map, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = xczVar;
        this.n = map;
        this.o = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new owe0(this.m, this.n, this.o, yjeVar, (byte) 0);
            default:
                return new owe0(this.m, this.n, this.o, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((owe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        String key;
        int i;
        cqq cqqVar;
        String str;
        cqq cqqVar2;
        Object next2;
        String key2;
        int i2;
        cqq cqqVar3;
        String str2;
        cqq cqqVar4;
        byte b = this.i;
        pz40 pz40Var = this.o;
        Map map = this.n;
        xcz xczVar = this.m;
        Object obj2 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                byte b2 = this.l;
                if (b2 != 0) {
                    if (b2 == 1) {
                        i = this.k;
                        String str3 = this.j;
                        z1x.P(obj);
                        key = str3;
                    } else {
                        if (b2 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = this.j;
                        z1x.P(obj);
                    }
                    cqqVar2 = (cqq) map.get(str);
                    if (cqqVar2 != null) {
                        cqq.a(cqqVar2);
                    }
                    return Unit.f46060a;
                }
                z1x.P(obj);
                Iterator<E> it = ((a4x) pz40Var.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        y0f0 y0f0Var = (y0f0) next;
                        if (!(y0f0Var instanceof sqq) || !((sqq) y0f0Var).c()) {
                        }
                    } else {
                        next = null;
                    }
                }
                y0f0 y0f0Var2 = (y0f0) next;
                key = y0f0Var2 != null ? y0f0Var2.getKey() : null;
                Iterator it2 = ((a4x) pz40Var.getValue()).iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (Intrinsics.d(((y0f0) it2.next()).getKey(), key)) {
                        i = i3;
                    } else {
                        i3++;
                    }
                }
                if (i == -1) {
                    return Unit.f46060a;
                }
                for (Object obj3 : xczVar.j().l) {
                    if (((ncz) obj3).l.equals(key)) {
                        obj2 = obj3;
                        if (((ncz) obj2) != null) {
                            this.j = key;
                            this.k = i;
                            this.l = (byte) 1;
                            if (xczVar.f(i, 0, this) != wneVar) {
                            }
                            return wneVar;
                        }
                        cqqVar = (cqq) map.get(key);
                        if (cqqVar != null) {
                            cqq.a(cqqVar);
                        }
                        return Unit.f46060a;
                    }
                }
                if (((ncz) obj2) != null) {
                    this.j = key;
                    this.k = i;
                    this.l = (byte) 1;
                    if (xczVar.f(i, 0, this) != wneVar) {
                    }
                    return wneVar;
                }
                cqqVar = (cqq) map.get(key);
                if (cqqVar != null) {
                    cqq.a(cqqVar);
                }
                return Unit.f46060a;
                this.j = key;
                this.k = i;
                this.l = (byte) 2;
                if (imv.b(this) != wneVar) {
                    str = key;
                    cqqVar2 = (cqq) map.get(str);
                    if (cqqVar2 != null) {
                        cqq.a(cqqVar2);
                    }
                    return Unit.f46060a;
                }
                return wneVar;
            default:
                wne wneVar2 = wne.f39444a;
                byte b3 = this.l;
                if (b3 != 0) {
                    if (b3 == 1) {
                        i2 = this.k;
                        String str4 = this.j;
                        z1x.P(obj);
                        key2 = str4;
                    } else {
                        if (b3 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = this.j;
                        z1x.P(obj);
                    }
                    cqqVar4 = (cqq) map.get(str2);
                    if (cqqVar4 != null) {
                        cqq.a(cqqVar4);
                    }
                    return Unit.f46060a;
                }
                z1x.P(obj);
                Iterator<E> it3 = ((a4x) pz40Var.getValue()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        x0f0 x0f0Var = (x0f0) next2;
                        if (!(x0f0Var instanceof rqq) || !((rqq) x0f0Var).c()) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                x0f0 x0f0Var2 = (x0f0) next2;
                key2 = x0f0Var2 != null ? x0f0Var2.getKey() : null;
                Iterator it4 = ((a4x) pz40Var.getValue()).iterator();
                int i4 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i2 = -1;
                    } else if (Intrinsics.d(((x0f0) it4.next()).getKey(), key2)) {
                        i2 = i4;
                    } else {
                        i4++;
                    }
                }
                if (i2 == -1) {
                    return Unit.f46060a;
                }
                for (Object obj4 : xczVar.j().l) {
                    if (((ncz) obj4).l.equals(key2)) {
                        obj2 = obj4;
                        if (((ncz) obj2) != null) {
                            this.j = key2;
                            this.k = i2;
                            this.l = (byte) 1;
                            if (xczVar.f(i2, 0, this) != wneVar2) {
                            }
                            return wneVar2;
                        }
                        cqqVar3 = (cqq) map.get(key2);
                        if (cqqVar3 != null) {
                            cqq.a(cqqVar3);
                        }
                        return Unit.f46060a;
                    }
                }
                if (((ncz) obj2) != null) {
                    this.j = key2;
                    this.k = i2;
                    this.l = (byte) 1;
                    if (xczVar.f(i2, 0, this) != wneVar2) {
                    }
                    return wneVar2;
                }
                cqqVar3 = (cqq) map.get(key2);
                if (cqqVar3 != null) {
                    cqq.a(cqqVar3);
                }
                return Unit.f46060a;
                this.j = key2;
                this.k = i2;
                this.l = (byte) 2;
                if (imv.b(this) != wneVar2) {
                    str2 = key2;
                    cqqVar4 = (cqq) map.get(str2);
                    if (cqqVar4 != null) {
                        cqq.a(cqqVar4);
                    }
                    return Unit.f46060a;
                }
                return wneVar2;
        }
    }
}
