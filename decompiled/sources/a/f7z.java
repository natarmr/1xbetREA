package a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f7z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b22 f9082a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public b22 h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public f7z(b22 b22Var, byte b) {
        this.j = b;
        this.f9082a = b22Var;
    }

    public final void a(w12 w12Var, int i, s460 s460Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jH = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        bg80 bg80Var = s460Var.u1;
                        if (bg80Var != null) {
                            gfv gfvVar = (gfv) bg80Var;
                            float[] fArrB = gfvVar.b();
                            if (!gfvVar.s) {
                                jH = ui30.b(jH, fArrB);
                            }
                        }
                        jH = x1x.H(jH, s460Var.g1);
                        break;
                    default:
                        e810 e810VarE1 = s460Var.e1();
                        e810VarE1.getClass();
                        long j = e810VarE1.v;
                        jH = ne60.f((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jH);
                        break;
                }
                s460Var = s460Var.w;
                s460Var.getClass();
                if (s460Var.equals(this.f9082a.H())) {
                    int iRound = Math.round(w12Var instanceof ykw ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (jH >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(w12Var)) {
                        int iIntValue = ((Number) xp20.d(map, w12Var)).intValue();
                        ykw ykwVar = z12.f43597a;
                        iRound = ((Number) w12Var.f38377a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(w12Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(s460Var).containsKey(w12Var));
            float fC = c(s460Var, w12Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(s460 s460Var) {
        switch (this.j) {
            case 0:
                return s460Var.N0().a();
            default:
                e810 e810VarE1 = s460Var.e1();
                e810VarE1.getClass();
                return e810VarE1.N0().a();
        }
    }

    public final int c(s460 s460Var, w12 w12Var) {
        switch (this.j) {
            case 0:
                return s460Var.c0(w12Var);
            default:
                e810 e810VarE1 = s460Var.e1();
                e810VarE1.getClass();
                return e810VarE1.c0(w12Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        b22 b22Var = this.f9082a;
        b22 b22VarC = b22Var.c();
        if (b22VarC == null) {
            return;
        }
        if (this.c) {
            b22VarC.a0();
        } else if (this.e || this.d) {
            b22VarC.requestLayout();
        }
        if (this.f) {
            b22Var.a0();
        }
        if (this.g) {
            b22Var.requestLayout();
        }
        b22VarC.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        m51 m51Var = new m51(this, (byte) 12);
        b22 b22Var = this.f9082a;
        b22Var.e(m51Var);
        map.putAll(b(b22Var.H()));
        this.b = false;
    }

    public final void h() {
        f7z f7zVarA;
        f7z f7zVarA2;
        boolean zD = d();
        b22 b22Var = this.f9082a;
        if (!zD) {
            b22 b22VarC = b22Var.c();
            if (b22VarC == null) {
                return;
            }
            b22Var = b22VarC.a().h;
            if (b22Var == null || !b22Var.a().d()) {
                b22 b22Var2 = this.h;
                if (b22Var2 == null || b22Var2.a().d()) {
                    return;
                }
                b22 b22VarC2 = b22Var2.c();
                if (b22VarC2 != null && (f7zVarA2 = b22VarC2.a()) != null) {
                    f7zVarA2.h();
                }
                b22 b22VarC3 = b22Var2.c();
                b22Var = (b22VarC3 == null || (f7zVarA = b22VarC3.a()) == null) ? null : f7zVarA.h;
            }
        }
        this.h = b22Var;
    }
}
