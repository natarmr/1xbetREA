package a;

import android.util.Log;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ypm0 extends bnn0 implements Function2 {
    public xpm0 i;
    public Object j;
    public aqm0 k;
    public byte l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ odd p;
    public final /* synthetic */ aqm0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypm0(ArrayList arrayList, int i, int i2, odd oddVar, aqm0 aqm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = arrayList;
        this.n = i;
        this.o = i2;
        this.p = oddVar;
        this.q = aqm0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ypm0(this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ypm0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e A[PHI: r1
  0x009e: PHI (r1v2 a.xpm0) = (r1v1 a.xpm0), (r1v3 a.xpm0) binds: [B:14:0x0059, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00c0, please report this as an issue */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        xpm0 xpm0Var;
        pot0 pot0Var;
        Object objK;
        i050 i050Var;
        xpm0 xpm0Var2;
        Object objA;
        xpm0 xpm0Var3;
        pot0 pot0Var2;
        aqm0 aqm0Var;
        jzj jzjVar;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        aqm0 aqm0Var2 = this.q;
        if (b == 0) {
            z1x.P(obj);
            xpm0Var = new xpm0(this.m, this.n, this.o, this.p);
            pot0Var = aqm0Var2.d;
            if (pot0Var != null) {
                this.i = xpm0Var;
                this.j = pot0Var;
                this.l = (byte) 1;
                objK = pot0Var.k(this);
                if (objK != wneVar) {
                }
            } else {
                i050Var = aqm0Var2.c;
                this.i = xpm0Var;
                this.j = i050Var;
                this.k = aqm0Var2;
                this.l = (byte) 3;
                if (i050Var.d(this) != wneVar) {
                    xpm0Var2 = xpm0Var;
                    aqm0Var2.e.add(xpm0Var2);
                    i050Var.c(null);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + xpm0Var2 + " will be retried with a future UseCaseCamera");
                    }
                    return Unit.f46060a;
                }
            }
            return wneVar;
        }
        if (b != 1) {
            if (b == 2) {
                aqm0Var2 = this.k;
                pot0 pot0Var3 = (pot0) this.j;
                xpm0 xpm0Var4 = this.i;
                z1x.P(obj);
                xpm0Var3 = xpm0Var4;
                objA = obj;
                pot0Var2 = pot0Var3;
                aqm0Var = aqm0Var2;
                jzjVar = (jzj) objA;
                if (pot0Var2 != null) {
                    jf4.o("Required value was null.");
                    return null;
                }
                aqm0Var.getClass();
                jzjVar.invokeOnCompletion(new l0i0(aqm0Var, jzjVar, xpm0Var3, pot0Var2, (byte) 5));
                return Unit.f46060a;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aqm0Var2 = this.k;
            i050 i050Var2 = (i050) this.j;
            xpm0Var2 = this.i;
            z1x.P(obj);
            i050Var = i050Var2;
            try {
                aqm0Var2.e.add(xpm0Var2);
                i050Var.c(null);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + xpm0Var2 + " will be retried with a future UseCaseCamera");
                }
                return Unit.f46060a;
            } catch (Throwable th) {
                i050Var.c(null);
                throw th;
            }
        }
        pot0 pot0Var4 = (pot0) this.j;
        xpm0 xpm0Var5 = this.i;
        z1x.P(obj);
        pot0Var = pot0Var4;
        xpm0Var = xpm0Var5;
        objK = obj;
        if (!((Boolean) objK).booleanValue()) {
            i050Var = aqm0Var2.c;
            this.i = xpm0Var;
            this.j = i050Var;
            this.k = aqm0Var2;
            this.l = (byte) 3;
            if (i050Var.d(this) != wneVar) {
                xpm0Var2 = xpm0Var;
                aqm0Var2.e.add(xpm0Var2);
                i050Var.c(null);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + xpm0Var2 + " will be retried with a future UseCaseCamera");
                }
                return Unit.f46060a;
            }
        } else {
            if (pot0Var == null) {
                jf4.o("Required value was null.");
                return null;
            }
            this.i = xpm0Var;
            this.j = pot0Var;
            this.k = aqm0Var2;
            this.l = (byte) 2;
            objA = aqm0Var2.a(xpm0Var, pot0Var, this);
            if (objA != wneVar) {
                xpm0Var3 = xpm0Var;
                pot0Var2 = pot0Var;
                aqm0Var = aqm0Var2;
                jzjVar = (jzj) objA;
                if (pot0Var2 != null) {
                    jf4.o("Required value was null.");
                    return null;
                }
                aqm0Var.getClass();
                jzjVar.invokeOnCompletion(new l0i0(aqm0Var, jzjVar, xpm0Var3, pot0Var2, (byte) 5));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }
}
