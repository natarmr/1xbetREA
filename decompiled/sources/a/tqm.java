package a;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tqm extends lm40 implements ehl {
    public final ucs0 o;
    public final ArrayList p;

    public tqm(List list) {
        list.getClass();
        ucs0 ucs0VarD = saj.D();
        ucs0VarD.s(y3d.f);
        this.o = ucs0VarD;
        this.p = new ArrayList(list);
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        a6a a6aVar = g7zVar.f10839a;
        x5a x5aVarI = a6aVar.b.i();
        for (sqm sqmVar : this.p) {
            Paint paintV = saj.V(this.o);
            float f = sqmVar.c;
            float f2 = sqmVar.e.f44172a;
            paintV.setShadowLayer(Math.max(0.0f, g7zVar.w0(f)) / 2.0f, g7zVar.w0(sqmVar.f32636a), g7zVar.w0(sqmVar.b), fbc.U(sqmVar.d));
            float f3 = -g7zVar.w0(0.0f);
            float f4 = -g7zVar.w0(0.0f);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() >> 32)) + g7zVar.w0(0.0f);
            float fW0 = g7zVar.w0(0.0f) + Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L));
            a6aVar.d();
            float fW1 = g7zVar.w0(f2);
            a6aVar.d();
            x5aVarI.d(f3, f4, fIntBitsToFloat, fW0, fW1, g7zVar.w0(f2), this.o);
        }
        g7zVar.a();
    }
}
