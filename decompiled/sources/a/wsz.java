package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class wsz implements wlu0, zul0, r460 {
    public static void i(androidx.fragment.app.e eVar) {
        eVar.getClass();
        i630.k2.getClass();
        String strJ = sre0.f32672a.b(i630.class).J();
        if (eVar.J(strJ) == null) {
            new i630().H0(eVar, strJ);
        }
    }

    @Override // a.wlu0
    public int a() {
        return R.id.view_tree_view_model_store_owner;
    }

    @Override // a.r460
    public int b() {
        return 8;
    }

    @Override // a.r460
    public boolean c(e7z e7zVar) {
        nai0 nai0VarX = e7zVar.x();
        boolean z = false;
        if (nai0VarX != null && nai0VarX.d) {
            z = true;
        }
        return !z;
    }

    @Override // a.r460
    public boolean d(raw rawVar, e7z e7zVar) {
        return false;
    }

    @Override // a.r460
    public boolean e(lm40 lm40Var) {
        return phu0.S(x0x.o(vcc.Z(lm40Var), false));
    }

    @Override // a.zul0
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // a.r460
    public void g(e7z e7zVar, long j, raw rawVar, int i, boolean z) {
        tzi tziVar = e7zVar.h1;
        s460 s460Var = (s460) tziVar.e;
        mb50 mb50Var = s460.w1;
        ((s460) tziVar.e).m1(s460.C1, s460Var.d1(j), rawVar, 1, z);
    }

    @Override // a.r460
    public boolean h(lm40 lm40Var) {
        return false;
    }
}
