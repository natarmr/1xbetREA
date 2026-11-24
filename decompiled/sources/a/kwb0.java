package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jo20 f18994a;

    static {
        jo20 jo20Var = new jo20();
        tre0 tre0Var = sre0.f32672a;
        sgy sgyVarB = tre0Var.b(String.class);
        mrv.o0(jsm0.f17060a);
        jo20Var.put(sgyVarB, ysm0.f43175a);
        sgy sgyVarB2 = tre0Var.b(Character.TYPE);
        qub.f29338a.getClass();
        jo20Var.put(sgyVarB2, pvb.f27654a);
        jo20Var.put(tre0Var.b(char[].class), kub.c);
        sgy sgyVarB3 = tre0Var.b(Double.TYPE);
        pbl.f26714a.getClass();
        jo20Var.put(sgyVarB3, tbl.f33669a);
        jo20Var.put(tre0Var.b(double[].class), hbl.c);
        sgy sgyVarB4 = tre0Var.b(Float.TYPE);
        flq.f9751a.getClass();
        jo20Var.put(sgyVarB4, klq.f18504a);
        jo20Var.put(tre0Var.b(float[].class), blq.c);
        sgy sgyVarB5 = tre0Var.b(Long.TYPE);
        c710.f3840a.getClass();
        jo20Var.put(sgyVarB5, s710.f31729a);
        jo20Var.put(tre0Var.b(long[].class), y610.c);
        sgy sgyVarB6 = tre0Var.b(h2t0.class);
        h2t0.b.getClass();
        jo20Var.put(sgyVarB6, l2t0.f19330a);
        sgy sgyVarB7 = tre0Var.b(Integer.TYPE);
        yjx.f42760a.getClass();
        jo20Var.put(sgyVarB7, okx.f25427a);
        jo20Var.put(tre0Var.b(int[].class), ujx.c);
        sgy sgyVarB8 = tre0Var.b(b2t0.class);
        b2t0.b.getClass();
        jo20Var.put(sgyVarB8, f2t0.f8830a);
        sgy sgyVarB9 = tre0Var.b(Short.TYPE);
        qqj0.f29169a.getClass();
        jo20Var.put(sgyVarB9, urj0.f36166a);
        jo20Var.put(tre0Var.b(short[].class), pqj0.c);
        sgy sgyVarB10 = tre0Var.b(q2t0.class);
        q2t0.b.getClass();
        jo20Var.put(sgyVarB10, u2t0.f34963a);
        sgy sgyVarB11 = tre0Var.b(Byte.TYPE);
        yf9.f42529a.getClass();
        jo20Var.put(sgyVarB11, ag9.f814a);
        jo20Var.put(tre0Var.b(byte[].class), vf9.c);
        sgy sgyVarB12 = tre0Var.b(p1t0.class);
        p1t0.b.getClass();
        jo20Var.put(sgyVarB12, t1t0.f33184a);
        sgy sgyVarB13 = tre0Var.b(Boolean.TYPE);
        rm8.f30733a.getClass();
        jo20Var.put(sgyVarB13, sm8.f32432a);
        jo20Var.put(tre0Var.b(boolean[].class), nm8.c);
        sgy sgyVarB14 = tre0Var.b(Unit.class);
        Unit.f46060a.getClass();
        jo20Var.put(sgyVarB14, b8t0.b);
        jo20Var.put(tre0Var.b(Void.class), x660.f40346a);
        try {
            sgy sgyVarB15 = tre0Var.b(wen.class);
            wen.b.getClass();
            jo20Var.put(sgyVarB15, afn.f786a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            jo20Var.put(sre0.f32672a.b(i2t0.class), k2t0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            jo20Var.put(sre0.f32672a.b(c2t0.class), e2t0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            jo20Var.put(sre0.f32672a.b(r2t0.class), t2t0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            jo20Var.put(sre0.f32672a.b(q1t0.class), s1t0.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            sgy sgyVarB16 = sre0.f32672a.b(nut0.class);
            nut0.c.getClass();
            jo20Var.put(sgyVarB16, rut0.f31142a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            sgy sgyVarB17 = sre0.f32672a.b(bjx.class);
            bjx bjxVar = bjx.c;
            jo20Var.put(sgyVarB17, gjx.f11420a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        f18994a = jo20Var.b();
    }

    public static final void a(String str) {
        for (jiy jiyVar : (mo20) f18994a.values()) {
            if (str.equals(jiyVar.getDescriptor().h())) {
                StringBuilder sbT = kng0.t("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbT.append(sre0.f32672a.b(jiyVar.getClass()).J());
                sbT.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                jf4.o(ntm0.c(sbT.toString()));
                return;
            }
        }
    }
}
