package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w53 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38566a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ vne d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ pz40 g;
    public final /* synthetic */ SnapshotStateList h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ i050 k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ cfq m;
    public final /* synthetic */ float n;
    public final /* synthetic */ rcq0 o;
    public final /* synthetic */ a4x p;

    public /* synthetic */ w53(boolean z, pz40 pz40Var, vne vneVar, boolean z2, Function2 function2, pz40 pz40Var2, SnapshotStateList snapshotStateList, int i, float f, i050 i050Var, t33 t33Var, cfq cfqVar, float f2, rcq0 rcq0Var, a4x a4xVar, byte b) {
        this.f38566a = b;
        this.b = z;
        this.c = pz40Var;
        this.d = vneVar;
        this.e = z2;
        this.f = function2;
        this.g = pz40Var2;
        this.h = snapshotStateList;
        this.i = i;
        this.j = f;
        this.k = i050Var;
        this.l = t33Var;
        this.m = cfqVar;
        this.n = f2;
        this.o = rcq0Var;
        this.p = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function2 function2;
        switch (this.f38566a) {
            case 0:
                dyb.Q(new w53(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (byte) 1));
                return Unit.f46060a;
            default:
                if (this.b) {
                    pz40 pz40Var = this.c;
                    if (pz40Var.getValue() == olx.f25479a) {
                        pz40Var.setValue(olx.c);
                        qjj.W(this.d, null, null, new f63(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, pz40Var, null), 3);
                    }
                }
                if (this.e && (function2 = this.f) != null) {
                    pz40 pz40Var2 = this.g;
                    function2.invoke(Long.valueOf(((vpl) pz40Var2.getValue()).f37811a), ((vpl) pz40Var2.getValue()).c);
                }
                return Boolean.TRUE;
        }
    }
}
