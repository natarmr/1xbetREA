package a;

import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes.dex */
public final class xj9 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40977a = 0;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ kie0 c;

    public xj9(kmq kmqVar, kie0 kie0Var) {
        this.b = kmqVar;
        this.c = kie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        qoq qoqVar;
        switch (this.f40977a) {
            case 0:
                return b((IndexedValue) obj, yjeVar);
            default:
                if (yjeVar instanceof qoq) {
                    qoqVar = (qoq) yjeVar;
                    int i = qoqVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qoqVar.k = i - Integer.MIN_VALUE;
                    } else {
                        qoqVar = new qoq(this, yjeVar);
                    }
                } else {
                    qoqVar = new qoq(this, yjeVar);
                }
                Object obj2 = qoqVar.i;
                wne wneVar = wne.f39444a;
                int i2 = qoqVar.k;
                if (i2 == 0) {
                    z1x.P(obj2);
                    kie0 kie0Var = this.c;
                    int i3 = kie0Var.f18333a;
                    kie0Var.f18333a = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                    IndexedValue indexedValue = new IndexedValue(i3, obj);
                    qoqVar.k = 1;
                    if (this.b.a(indexedValue, qoqVar) == wneVar) {
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
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(IndexedValue indexedValue, yje yjeVar) {
        wj9 wj9Var;
        if (yjeVar instanceof wj9) {
            wj9Var = (wj9) yjeVar;
            int i = wj9Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj9Var.l = i - Integer.MIN_VALUE;
            } else {
                wj9Var = new wj9(this, yjeVar);
            }
        } else {
            wj9Var = new wj9(this, yjeVar);
        }
        Object obj = wj9Var.j;
        wne wneVar = wne.f39444a;
        int i2 = wj9Var.l;
        kie0 kie0Var = this.c;
        if (i2 == 0) {
            z1x.P(obj);
            indexedValue.getClass();
            if (indexedValue.f46061a > kie0Var.f18333a) {
                Object obj2 = indexedValue.b;
                wj9Var.i = indexedValue;
                wj9Var.l = 1;
                if (this.b.a(obj2, wj9Var) == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        indexedValue = wj9Var.i;
        z1x.P(obj);
        kie0Var.f18333a = indexedValue.f46061a;
        return Unit.f46060a;
    }

    public xj9(kie0 kie0Var, kmq kmqVar) {
        this.c = kie0Var;
        this.b = kmqVar;
    }
}
