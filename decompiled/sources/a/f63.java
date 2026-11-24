package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f63 extends bnn0 implements Function2 {
    public float i;
    public float j;
    public float k;
    public i050 l;
    public Object m;
    public Object n;
    public Object o;
    public byte p;
    public final /* synthetic */ SnapshotStateList q;
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ i050 t;
    public final /* synthetic */ t33 u;
    public final /* synthetic */ cfq v;
    public final /* synthetic */ float w;
    public final /* synthetic */ rcq0 x;
    public final /* synthetic */ a4x y;
    public final /* synthetic */ pz40 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f63(SnapshotStateList snapshotStateList, int i, float f, i050 i050Var, t33 t33Var, cfq cfqVar, float f2, rcq0 rcq0Var, a4x a4xVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = snapshotStateList;
        this.r = i;
        this.s = f;
        this.t = i050Var;
        this.u = t33Var;
        this.v = cfqVar;
        this.w = f2;
        this.x = rcq0Var;
        this.y = a4xVar;
        this.z = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new f63(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f63) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x018f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0197 A[Catch: all -> 0x01b7, LOOP:0: B:55:0x0195->B:56:0x0197, LOOP_END, TryCatch #0 {all -> 0x01b7, blocks: (B:54:0x0191, B:56:0x0197, B:59:0x01ba), top: B:70:0x0191 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d5  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f;
        a4x a4xVar;
        float f2;
        float f3;
        float f4;
        rcq0 rcq0Var;
        i050 i050Var;
        SnapshotStateList snapshotStateList;
        t33 t33Var;
        pz40 pz40Var;
        t33 t33Var2;
        float f5;
        i050 i050Var2;
        int size;
        Float f6;
        pz40 pz40Var2;
        wne wneVar = wne.f39444a;
        byte b = this.p;
        t33 t33Var3 = this.u;
        i050 i050Var3 = this.t;
        SnapshotStateList snapshotStateList2 = this.q;
        try {
            if (b == 0) {
                f = 0.0f;
                z1x.P(obj);
                float fFloatValue = ((Number) snapshotStateList2.get(this.r)).floatValue();
                Float f7 = (Float) CollectionsKt.W(2, snapshotStateList2);
                float fFloatValue2 = f7 != null ? f7.floatValue() : 0.0f;
                float f8 = this.s;
                float f9 = fFloatValue < fFloatValue2 ? f8 : -f8;
                this.l = i050Var3;
                this.m = snapshotStateList2;
                rcq0 rcq0Var2 = this.x;
                this.n = rcq0Var2;
                a4xVar = this.y;
                this.o = a4xVar;
                this.i = f9;
                float f10 = this.w;
                this.j = f10;
                this.k = f8;
                this.p = (byte) 1;
                if (i050Var3.d(this) != wneVar) {
                    f2 = f10;
                    f3 = f8;
                    f4 = f9;
                    rcq0Var = rcq0Var2;
                    i050Var = i050Var3;
                    snapshotStateList = snapshotStateList2;
                }
                return wneVar;
            }
            if (b != 1) {
                if (b == 2) {
                    float f11 = this.i;
                    z1x.P(obj);
                    f4 = f11;
                    t33Var = t33Var3;
                    f = 0.0f;
                    this.l = i050Var3;
                    this.m = snapshotStateList2;
                    this.n = t33Var;
                    pz40Var = this.z;
                    this.o = pz40Var;
                    this.i = f4;
                    this.p = (byte) 3;
                    if (i050Var3.d(this) != wneVar) {
                        t33Var2 = t33Var;
                        f5 = f4;
                        size = snapshotStateList2.size();
                        for (int i = 0; i < size; i++) {
                            snapshotStateList2.set(i, new Float(((Number) snapshotStateList2.get(i)).floatValue() + ((Number) t33Var2.d()).floatValue()));
                        }
                        f6 = new Float(f);
                        this.l = i050Var3;
                        this.m = pz40Var;
                        this.n = null;
                        this.o = null;
                        this.i = f5;
                        this.p = (byte) 4;
                        if (t33Var2.f(this, f6) != wneVar) {
                            pz40Var2 = pz40Var;
                            i050Var2 = i050Var3;
                            pz40Var2.setValue(olx.f25479a);
                            i050Var2.c(null);
                            return Unit.f46060a;
                        }
                    }
                    return wneVar;
                }
                if (b != 3) {
                    if (b != 4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var2 = (pz40) this.m;
                    i050Var2 = this.l;
                    try {
                        z1x.P(obj);
                        pz40Var2.setValue(olx.f25479a);
                        i050Var2.c(null);
                        return Unit.f46060a;
                    } catch (Throwable th) {
                        th = th;
                        i050Var2.c(null);
                        throw th;
                    }
                }
                f5 = this.i;
                pz40Var = (pz40) this.o;
                t33Var2 = (t33) this.n;
                snapshotStateList2 = (SnapshotStateList) this.m;
                i050Var3 = this.l;
                z1x.P(obj);
                f = 0.0f;
                try {
                    size = snapshotStateList2.size();
                    while (i < size) {
                        snapshotStateList2.set(i, new Float(((Number) snapshotStateList2.get(i)).floatValue() + ((Number) t33Var2.d()).floatValue()));
                    }
                    f6 = new Float(f);
                    this.l = i050Var3;
                    this.m = pz40Var;
                    this.n = null;
                    this.o = null;
                    this.i = f5;
                    this.p = (byte) 4;
                    if (t33Var2.f(this, f6) != wneVar) {
                        pz40Var2 = pz40Var;
                        i050Var2 = i050Var3;
                        pz40Var2.setValue(olx.f25479a);
                        i050Var2.c(null);
                        return Unit.f46060a;
                    }
                    return wneVar;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var2 = i050Var3;
                    i050Var2.c(null);
                    throw th;
                }
            }
            f3 = this.k;
            f2 = this.j;
            float f12 = this.i;
            a4xVar = (a4x) this.o;
            rcq0 rcq0Var3 = (rcq0) this.n;
            f = 0.0f;
            snapshotStateList = (SnapshotStateList) this.m;
            i050Var = this.l;
            z1x.P(obj);
            f4 = f12;
            rcq0Var = rcq0Var3;
            if (f4 < f) {
                if (((Number) snapshotStateList.get(0)).floatValue() + f4 <= (f2 / 2.0f) - (3.0f * f3)) {
                    snapshotStateList.remove(0);
                    snapshotStateList.add(new Float(((Number) snapshotStateList.get(snapshotStateList.size() - 1)).floatValue() + f3));
                    int size2 = a4xVar.size();
                    cgk0 cgk0Var = rcq0Var.f30253a;
                    int iL = (cgk0Var.l() + 1) % size2;
                    if (iL < 0) {
                        iL += size2;
                    }
                    cgk0Var.m(iL);
                }
            } else if (((Number) snapshotStateList.get(q3d.i(snapshotStateList))).floatValue() + f4 >= (3.0f * f3) + (f2 / 2.0f)) {
                snapshotStateList.remove(snapshotStateList.size() - 1);
                snapshotStateList.add(0, new Float(((Number) snapshotStateList.get(0)).floatValue() - f3));
                int size3 = a4xVar.size();
                cgk0 cgk0Var2 = rcq0Var.f30253a;
                int iL2 = (cgk0Var2.l() - 1) % size3;
                if (iL2 < 0) {
                    iL2 += size3;
                }
                cgk0Var2.m(iL2);
            }
            i050Var.c(null);
            t33Var = t33Var3;
            Float f13 = new Float(f4);
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.i = f4;
            this.p = (byte) 2;
            if (t33.a(t33Var, f13, this.v, null, null, this, 12) != wneVar) {
                this.l = i050Var3;
                this.m = snapshotStateList2;
                this.n = t33Var;
                pz40Var = this.z;
                this.o = pz40Var;
                this.i = f4;
                this.p = (byte) 3;
                if (i050Var3.d(this) != wneVar) {
                    t33Var2 = t33Var;
                    f5 = f4;
                    size = snapshotStateList2.size();
                    while (i < size) {
                        snapshotStateList2.set(i, new Float(((Number) snapshotStateList2.get(i)).floatValue() + ((Number) t33Var2.d()).floatValue()));
                    }
                    f6 = new Float(f);
                    this.l = i050Var3;
                    this.m = pz40Var;
                    this.n = null;
                    this.o = null;
                    this.i = f5;
                    this.p = (byte) 4;
                    if (t33Var2.f(this, f6) != wneVar) {
                        pz40Var2 = pz40Var;
                        i050Var2 = i050Var3;
                        pz40Var2.setValue(olx.f25479a);
                        i050Var2.c(null);
                        return Unit.f46060a;
                    }
                }
            }
            return wneVar;
        } catch (Throwable th3) {
            i050Var.c(null);
            throw th3;
        }
    }
}
