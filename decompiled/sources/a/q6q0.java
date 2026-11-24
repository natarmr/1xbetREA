package a;

import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q6q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28213a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q6q0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f28213a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28213a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                qe60 qe60Var = (qe60) obj5;
                a8q0 a8q0Var = (a8q0) obj4;
                djz djzVar = (djz) obj3;
                skk0 skk0Var = (skk0) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.a();
                a6a a6aVar = g7zVar.f10839a;
                float fL = ((fwf) obj6).c.l();
                if (fL != 0.0f) {
                    long j = a8q0Var.b;
                    int i = o9q0.c;
                    int iS = qe60Var.s((int) (j >> 32));
                    b9q0 b9q0VarD = djzVar.d();
                    jge0 jge0VarC = b9q0VarD != null ? b9q0VarD.f2224a.c(iS) : new jge0(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(g7zVar.w0(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = jge0VarC.f16474a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(jge0VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(jge0VarC.d)) & 4294967295L);
                    x5a x5aVar = a6aVar.f308a.c;
                    ucs0 ucs0VarD = a6aVar.d;
                    if (ucs0VarD == null) {
                        ucs0VarD = saj.D();
                        ucs0VarD.A(1);
                        a6aVar.d = ucs0VarD;
                    }
                    Paint paint = (Paint) ucs0VarD.c;
                    skk0Var.a(fL, a6aVar.d(), ucs0VarD);
                    if (!Intrinsics.d((a4d) ucs0VarD.e, null)) {
                        ucs0VarD.t(null);
                    }
                    if (ucs0VarD.b != 3) {
                        ucs0VarD.r(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        ucs0VarD.z(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (ucs0VarD.m() != 0) {
                        ucs0VarD.x(0);
                    }
                    if (ucs0VarD.n() != 0) {
                        ucs0VarD.y(0);
                    }
                    if (!Intrinsics.d((x03) ucs0VarD.f, null)) {
                        ucs0VarD.v(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        ucs0VarD.u(1);
                    }
                    x5aVar.b(jFloatToRawIntBits, jFloatToRawIntBits2, ucs0VarD);
                }
                break;
            default:
                pz40 pz40Var = (pz40) obj6;
                mie0 mie0Var = (mie0) obj5;
                vne vneVar = (vne) obj4;
                t33 t33Var = (t33) obj3;
                o6s0 o6s0Var = (o6s0) obj2;
                bby bbyVar = (bby) pz40Var.getValue();
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                pz40Var.setValue(null);
                mie0Var.f21842a = new j6u0();
                qjj.W(vneVar, null, null, new wbl0(t33Var, o6s0Var, null, (byte) 12), 3);
                break;
        }
        return Unit.f46060a;
    }
}
