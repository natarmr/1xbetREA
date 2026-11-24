package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class uo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uo8 f35999a = new uo8();
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        u4d u4dVar = mpj0.f22183a;
        b = mpj0.d;
        c = 640.0f;
        d = 56.0f;
        e = 125.0f;
    }

    public final void a(mm40 mm40Var, float f, float f2, yjj0 yjj0Var, long j, fet fetVar, final int i) {
        final mm40 mm40Var2;
        final float f3;
        final float f4;
        final yjj0 yjj0Var2;
        final long j2;
        long jD;
        float f5;
        float f6;
        yjj0 yjj0Var3;
        mm40 mm40Var3;
        fetVar.g0(-1364277227);
        int i2 = i | 9654;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                float f7 = mpj0.c;
                float f8 = mpj0.b;
                cne cneVar = ((dlj0) fetVar.k(elj0.f8001a)).e;
                jD = v4d.d(mpj0.f22183a, fetVar);
                f5 = f7;
                f6 = f8;
                yjj0Var3 = cneVar;
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var;
                f5 = f;
                f6 = f2;
                yjj0Var3 = yjj0Var;
                jD = j;
            }
            fetVar.s();
            String strJ = jtt0.j(R.string.m3c_bottom_sheet_drag_handle_description, fetVar);
            uts0 uts0Var = tpj0.f34337a;
            mm40 mm40VarL = s5x0.L(mm40Var3, 0.0f, 22.0f, 1);
            boolean zG = fetVar.g(strJ);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ka6(strJ, b2);
                fetVar.o0(objP);
            }
            long j3 = jD;
            gmn0.a(pai0.a(mm40VarL, false, (Function1) objP), yjj0Var3, j3, 0L, 0.0f, 0.0f, null, u1c.M(-1039573072, new to8(f5, f6), fetVar), fetVar, 12582912, 120);
            yjj0Var2 = yjj0Var3;
            j2 = j3;
            mm40Var2 = mm40Var3;
            f3 = f5;
            f4 = f6;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f3 = f;
            f4 = f2;
            yjj0Var2 = yjj0Var;
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(mm40Var2, f3, f4, yjj0Var2, j2, i) { // from class: a.so8
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ yjj0 e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(196609);
                    this.f32533a.a(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }
}
