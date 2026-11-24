package a;

import java.io.Closeable;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class q3x0 {
    public static final q3x0 c = new q3x0(e3x0.b, a3x0.y());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3x0 f28073a;
    public final a3x0 b;

    public q3x0(e3x0 e3x0Var, a3x0 a3x0Var) {
        e3x0Var.getClass();
        this.f28073a = e3x0Var;
        this.b = a3x0Var;
    }

    public static q3x0 a(tdw0 tdw0Var, boolean z) throws zew0 {
        e3x0 e3x0VarA;
        int iV = tdw0Var.V();
        if (iV > 1) {
            itt0.x(vqd.p(new StringBuilder(String.valueOf(iV).length() + 44), "Unsupported version: ", iV, ". Current version is: 1"));
            return null;
        }
        tdw0Var.V();
        int iA = tdw0Var.a(tdw0Var.R());
        bew0 bew0Var = bew0.b;
        int i = ldw0.f19874a;
        a3x0 a3x0VarX = a3x0.x(tdw0Var, bew0.c);
        tdw0Var.b(iA);
        zvj zvjVar = new zvj();
        Inflater inflater = (Inflater) zvjVar.b;
        try {
            if (z) {
                int iA2 = tdw0Var.a(tdw0Var.R());
                int iC = tdw0Var.c();
                try {
                    e3x0VarA = e3x0.a(tdw0.h(new InflaterInputStream(new e99(zvjVar, tdw0Var), inflater, iC < 0 ? 4096 : Math.min(iC, 4096)), 4096));
                    inflater.reset();
                    if (tdw0Var.c() != 0) {
                        throw new zew0("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    tdw0Var.b(iA2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(tdw0Var.Q());
                try {
                    e3x0VarA = e3x0.a(tdw0.h(new e99((Closeable) zvjVar, (byte) 2), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            zvjVar.close();
            return new q3x0(e3x0VarA, a3x0VarX);
        } catch (Throwable th3) {
            try {
                zvjVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
