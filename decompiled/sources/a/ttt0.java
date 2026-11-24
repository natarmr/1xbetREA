package a;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ttt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34523a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static mny a(gny gnyVar) {
        jny jnyVarZ = mny.z();
        int iB = gnyVar.B();
        jnyVarZ.e();
        ((mny) jnyVarZ.b).A(iB);
        for (fny fnyVar : gnyVar.A()) {
            kny knyVarY = lny.y();
            String strZ = fnyVar.x().z();
            knyVarY.e();
            ((lny) knyVarY.b).C(strZ);
            zky zkyVarA = fnyVar.A();
            knyVarY.e();
            ((lny) knyVarY.b).B(zkyVarA);
            af80 af80VarZ = fnyVar.z();
            knyVarY.e();
            ((lny) knyVarY.b).A(af80VarZ);
            int iY = fnyVar.y();
            knyVarY.e();
            ((lny) knyVarY.b).z(iY);
            lny lnyVar = (lny) knyVarY.b();
            jnyVarZ.e();
            ((mny) jnyVarZ.b).x(lnyVar);
        }
        return (mny) jnyVarZ.b();
    }
}
