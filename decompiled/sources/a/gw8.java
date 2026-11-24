package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class gw8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k050 f12014a = new k050();
    public final k050 b = new k050();
    public List c = iun.f15405a;
    public AggregatorSortingOptionModel d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        aw8 aw8Var;
        k050 k050Var;
        if (zjeVar instanceof aw8) {
            aw8Var = (aw8) zjeVar;
            int i = aw8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw8Var.l = i - Integer.MIN_VALUE;
            } else {
                aw8Var = new aw8(this, zjeVar);
            }
        } else {
            aw8Var = new aw8(this, zjeVar);
        }
        Object obj = aw8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = aw8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.f12014a;
            aw8Var.i = k050Var2;
            aw8Var.l = 1;
            if (k050Var2.d(aw8Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = aw8Var.i;
            z1x.P(obj);
        }
        try {
            this.c = iun.f15405a;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        bw8 bw8Var;
        k050 k050Var;
        if (zjeVar instanceof bw8) {
            bw8Var = (bw8) zjeVar;
            int i = bw8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bw8Var.l = i - Integer.MIN_VALUE;
            } else {
                bw8Var = new bw8(this, zjeVar);
            }
        } else {
            bw8Var = new bw8(this, zjeVar);
        }
        Object obj = bw8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = bw8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.b;
            bw8Var.i = k050Var2;
            bw8Var.l = 1;
            if (k050Var2.d(bw8Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = bw8Var.i;
            z1x.P(obj);
        }
        try {
            this.d = null;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar) {
        cw8 cw8Var;
        k050 k050Var;
        if (zjeVar instanceof cw8) {
            cw8Var = (cw8) zjeVar;
            int i = cw8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cw8Var.l = i - Integer.MIN_VALUE;
            } else {
                cw8Var = new cw8(this, zjeVar);
            }
        } else {
            cw8Var = new cw8(this, zjeVar);
        }
        Object obj = cw8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = cw8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.f12014a;
            cw8Var.i = k050Var2;
            cw8Var.l = 1;
            if (k050Var2.d(cw8Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = cw8Var.i;
            z1x.P(obj);
        }
        try {
            return this.c;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zje zjeVar) {
        dw8 dw8Var;
        k050 k050Var;
        if (zjeVar instanceof dw8) {
            dw8Var = (dw8) zjeVar;
            int i = dw8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw8Var.l = i - Integer.MIN_VALUE;
            } else {
                dw8Var = new dw8(this, zjeVar);
            }
        } else {
            dw8Var = new dw8(this, zjeVar);
        }
        Object obj = dw8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = dw8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.b;
            dw8Var.i = k050Var2;
            dw8Var.l = 1;
            if (k050Var2.d(dw8Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = dw8Var.i;
            z1x.P(obj);
        }
        try {
            return this.d;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, zje zjeVar) {
        ew8 ew8Var;
        k050 k050Var;
        if (zjeVar instanceof ew8) {
            ew8Var = (ew8) zjeVar;
            int i = ew8Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ew8Var.m = i - Integer.MIN_VALUE;
            } else {
                ew8Var = new ew8(this, zjeVar);
            }
        } else {
            ew8Var = new ew8(this, zjeVar);
        }
        Object obj = ew8Var.k;
        wne wneVar = wne.f39444a;
        int i2 = ew8Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            ew8Var.i = list;
            k050Var = this.f12014a;
            ew8Var.j = k050Var;
            ew8Var.m = 1;
            if (k050Var.d(ew8Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = ew8Var.j;
            List list2 = ew8Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            this.c = list;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(AggregatorSortingOptionModel aggregatorSortingOptionModel, zje zjeVar) {
        fw8 fw8Var;
        k050 k050Var;
        if (zjeVar instanceof fw8) {
            fw8Var = (fw8) zjeVar;
            int i = fw8Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw8Var.m = i - Integer.MIN_VALUE;
            } else {
                fw8Var = new fw8(this, zjeVar);
            }
        } else {
            fw8Var = new fw8(this, zjeVar);
        }
        Object obj = fw8Var.k;
        wne wneVar = wne.f39444a;
        int i2 = fw8Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            fw8Var.i = aggregatorSortingOptionModel;
            k050Var = this.b;
            fw8Var.j = k050Var;
            fw8Var.m = 1;
            if (k050Var.d(fw8Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = fw8Var.j;
            AggregatorSortingOptionModel aggregatorSortingOptionModel2 = fw8Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            aggregatorSortingOptionModel = aggregatorSortingOptionModel2;
        }
        try {
            this.d = aggregatorSortingOptionModel;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }
}
