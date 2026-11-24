package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d810 extends ou90 {
    public final /* synthetic */ byte b;
    public final Object c;

    public /* synthetic */ d810(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    @Override // a.ou90
    public float a(xlw xlwVar) {
        Function1 function1;
        int iH;
        eg80 snapshotObserver;
        int iH2;
        switch (this.b) {
            case 0:
                Function2 function2 = xlwVar.f41096a;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                c810 c810Var = (c810) this.c;
                if (c810Var.o) {
                    return Float.NaN;
                }
                mie0 mie0Var = new mie0();
                mie0Var.f21842a = c810Var;
                while (true) {
                    fp fpVar = ((c810) mie0Var.f21842a).q;
                    float f = (fpVar == null || (iH2 = tx3.H(xlwVar, (xlw[]) fpVar.c)) < 0) ? Float.NaN : ((float[]) fpVar.d)[iH2];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = mie0Var.f21842a;
                    if (!zIsNaN) {
                        ((c810) obj).x0(c810Var.L0(), xlwVar);
                        return xlwVar.a(f, ((c810) mie0Var.f21842a).I0(), c810Var.I0());
                    }
                    c810 c810Var2 = (c810) obj;
                    Function2 function3 = c810Var2.h;
                    if (function3 != null && (function1 = c810Var2.i) != null && ((Boolean) function1.invoke(xlwVar)).booleanValue()) {
                        c810 c810Var3 = (c810) mie0Var.f21842a;
                        hz40 hz40Var = c810Var3.k;
                        if (hz40Var == null) {
                            long[] jArr = u1h0.f34903a;
                            hz40Var = new hz40();
                            c810Var3.k = hz40Var;
                        }
                        Object objG = hz40Var.g(xlwVar);
                        if (objG == null) {
                            objG = new ru90(c810Var3.N0(), c810Var3, xlwVar);
                            hz40Var.n(xlwVar, objG);
                        }
                        ru90 ru90Var = (ru90) objG;
                        ru90Var.f31116a = c810Var3.N0();
                        cg80 cg80Var = c810Var.L0().o;
                        if (cg80Var != null && (snapshotObserver = cg80Var.getSnapshotObserver()) != null) {
                            snapshotObserver.f7752a.d(ru90Var, c810.t, new g8l(function3, mie0Var, xlwVar, (byte) 23));
                        }
                        ((c810) mie0Var.f21842a).x0(c810Var.L0(), xlwVar);
                        fp fpVar2 = ((c810) mie0Var.f21842a).q;
                        float f2 = (fpVar2 == null || (iH = tx3.H(xlwVar, (xlw[]) fpVar2.c)) < 0) ? Float.NaN : ((float[]) fpVar2.d)[iH];
                        if (!Float.isNaN(f2)) {
                            return xlwVar.a(f2, ((c810) mie0Var.f21842a).I0(), c810Var.I0());
                        }
                    }
                    c810 c810VarO0 = ((c810) mie0Var.f21842a).O0();
                    if (c810VarO0 == null) {
                        ((c810) mie0Var.f21842a).x0(c810Var.L0(), xlwVar);
                        return Float.NaN;
                    }
                    mie0Var.f21842a = c810VarO0;
                }
                break;
            default:
                return super.a(xlwVar);
        }
    }

    @Override // a.ou90
    public final k6z b() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((c810) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // a.ou90
    public final int c() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((c810) obj).e0();
            default:
                return ((AndroidComposeView) obj).getRoot().i1.p.f27604a;
        }
    }

    @Override // a.w6k
    public final float getDensity() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((c810) obj).getDensity();
            default:
                return ((AndroidComposeView) obj).getDensity().getDensity();
        }
    }

    @Override // a.w6k
    public final float v0() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((c810) obj).v0();
            default:
                return ((AndroidComposeView) obj).getDensity().v0();
        }
    }
}
