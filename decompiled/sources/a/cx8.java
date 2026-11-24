package a;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cx8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public boolean l;
    public /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx8(rv2 rv2Var, boolean z, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rv2Var;
        this.l = z;
        this.m = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new cx8((rv2) obj2, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new cx8((rv2) obj2, this.l, this.m, yjeVar, (byte) 1);
            default:
                cx8 cx8Var = new cx8((gkd) obj2, yjeVar);
                cx8Var.m = ((Number) obj).floatValue();
                return cx8Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cx8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cx8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cx8) create(Float.valueOf(((Number) obj).floatValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vtj vtjVar;
        qt2 qt2Var;
        vtj vtjVar2;
        qt2 qt2Var2;
        boolean z;
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                boolean z2 = this.l;
                rv2 rv2Var = (rv2) obj2;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (z2) {
                        pel pelVar = new pel();
                        qt2Var = qt2.b;
                        pelVar.a(qt2Var, 0.0f);
                        float[] fArr = pelVar.b;
                        ArrayList arrayList = pelVar.f26860a;
                        int size = arrayList.size();
                        nx3.a(size, fArr.length);
                        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                        fArrCopyOfRange.getClass();
                        vtjVar = new vtj(arrayList, fArrCopyOfRange);
                    } else {
                        float f = this.m;
                        pel pelVar2 = new pel();
                        pelVar2.a(qt2.f29279a, f);
                        qt2 qt2Var3 = qt2.b;
                        pelVar2.a(qt2Var3, 0.0f);
                        float[] fArr2 = pelVar2.b;
                        ArrayList arrayList2 = pelVar2.f26860a;
                        int size2 = arrayList2.size();
                        nx3.a(size2, fArr2.length);
                        float[] fArrCopyOfRange2 = Arrays.copyOfRange(fArr2, 0, size2);
                        fArrCopyOfRange2.getClass();
                        vtjVar = new vtj(arrayList2, fArrCopyOfRange2);
                        qt2Var = qt2Var3;
                    }
                    rv2Var.i(vtjVar, ((hgk0) rv2Var.c).getValue());
                    if (z2) {
                        this.j = true;
                        if (dv2.f(rv2Var, qt2Var, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                boolean z4 = this.l;
                rv2 rv2Var2 = (rv2) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (z4) {
                        pel pelVar3 = new pel();
                        qt2Var2 = qt2.b;
                        pelVar3.a(qt2Var2, 0.0f);
                        float[] fArr3 = pelVar3.b;
                        ArrayList arrayList3 = pelVar3.f26860a;
                        int size3 = arrayList3.size();
                        nx3.a(size3, fArr3.length);
                        float[] fArrCopyOfRange3 = Arrays.copyOfRange(fArr3, 0, size3);
                        fArrCopyOfRange3.getClass();
                        vtjVar2 = new vtj(arrayList3, fArrCopyOfRange3);
                    } else {
                        float f2 = this.m;
                        pel pelVar4 = new pel();
                        pelVar4.a(qt2.f29279a, f2);
                        qt2 qt2Var4 = qt2.b;
                        pelVar4.a(qt2Var4, 0.0f);
                        float[] fArr4 = pelVar4.b;
                        ArrayList arrayList4 = pelVar4.f26860a;
                        int size4 = arrayList4.size();
                        nx3.a(size4, fArr4.length);
                        float[] fArrCopyOfRange4 = Arrays.copyOfRange(fArr4, 0, size4);
                        fArrCopyOfRange4.getClass();
                        vtjVar2 = new vtj(arrayList4, fArrCopyOfRange4);
                        qt2Var2 = qt2Var4;
                    }
                    rv2Var2.i(vtjVar2, ((hgk0) rv2Var2.c).getValue());
                    if (z4) {
                        this.j = true;
                        if (dv2.f(rv2Var2, qt2Var2, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                gkd gkdVar = (gkd) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.l;
                if (!z6) {
                    z1x.P(obj);
                    float f3 = this.m;
                    Object objG = gkdVar.f11439a.d.f23193a.g(mai0.e);
                    Function2 function2 = (Function2) (objG != null ? objG : null);
                    if (function2 == null) {
                        throw cs0.g("Required value was null.");
                    }
                    boolean z7 = ((t9h0) gkdVar.f11439a.d.c(xai0.w)).c;
                    if (z7) {
                        f3 = -f3;
                    }
                    ne60 ne60Var = new ne60((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.j = z7;
                    this.l = true;
                    obj = function2.invoke(ne60Var, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                    z = z7;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.j;
                    z1x.P(obj);
                }
                long j = ((ne60) obj).f23370a;
                return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx8(gkd gkdVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.k = gkdVar;
    }
}
