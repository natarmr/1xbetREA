package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wgg0 extends qzb {
    @Override // a.qzb
    public final void Z(gb10 gb10Var, float f, float f2) {
        float f3 = f2 * f;
        gb10Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        qkj0 qkj0Var = new qkj0(0.0f, 0.0f, f4, f4);
        qkj0Var.f = 180.0f;
        qkj0Var.g = 90.0f;
        ((ArrayList) gb10Var.f).add(qkj0Var);
        okj0 okj0Var = new okj0(qkj0Var);
        gb10Var.a(180.0f);
        ((ArrayList) gb10Var.g).add(okj0Var);
        gb10Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        gb10Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        gb10Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
