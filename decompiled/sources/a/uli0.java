package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uli0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35874a;
    public final /* synthetic */ int b;

    public /* synthetic */ uli0(int i, byte b) {
        this.f35874a = b;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35874a;
        int i = this.b;
        switch (b) {
            case 0:
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                return new sli0(false, false, false, false, null, -1, ((Number) a8k0.H(vzg0Var, "SELECTED_VALUE_INDEX_KEY", -1)).intValue(), tlb.T(i));
            case 1:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, this.b, null, null, jd8.g, 6);
                return Unit.f46060a;
            case 2:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, this.b, null, null, rq8.i, 6);
                return Unit.f46060a;
            case 3:
                aqk0 aqk0Var = (aqk0) obj;
                boolean z = true;
                if (i == 0 && aqk0Var.f1300a == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.h(abi0Var, i == R.drawable.ic_glyph_favourite_active ? "Active" : "Inactive");
                return Unit.f46060a;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                return new SportScore(new tje(context, i), null, 6);
            case 6:
                vzg0 vzg0Var2 = (vzg0) obj;
                vzg0Var2.getClass();
                return new ikq0(false, false, false, false, null, -1, ((Number) a8k0.H(vzg0Var2, "SELECTED_VALUE_INDEX_KEY", -1)).intValue(), tlb.T(i));
            case 7:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                Canvas canvasB = vw2.b(fhlVar.A0().i());
                zcl zclVar = qmk.f28987a;
                float f = -fhlVar.w0(2.0f);
                float f2 = -fhlVar.w0(4.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                Paint paint = new Paint();
                paint.setColor(fbc.U(y3d.f));
                paint.setShadowLayer(fhlVar.w0(4.0f), -fhlVar.w0(2.0f), fhlVar.w0(2.0f), i);
                canvasB.drawRoundRect(f, f2, fIntBitsToFloat, fIntBitsToFloat2, 0.0f, 0.0f, paint);
                return Unit.f46060a;
            case 8:
                ((x8z) obj).getClass();
                return new pgv(q8x.e(i));
            default:
                ((x8z) obj).getClass();
                return new pgv(q8x.e(i));
        }
    }
}
