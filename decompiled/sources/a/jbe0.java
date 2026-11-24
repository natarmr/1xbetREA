package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jbe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r34 f16237a;
    public final y78 b;
    public final Object c = new Object();

    public jbe0(r34 r34Var, y78 y78Var) {
        this.f16237a = r34Var;
        this.b = y78Var;
    }

    public final kr30 a(jr30 jr30Var) {
        kr30 kr30Var;
        kr30 kr30Var2;
        synchronized (this.c) {
            try {
                obe0 obe0Var = (obe0) ((LinkedHashMap) ((dr8) this.f16237a.c).c).get(jr30Var);
                kr30Var = obe0Var != null ? new kr30(obe0Var.f24974a, obe0Var.b) : null;
                if (kr30Var == null) {
                    y78 y78Var = this.b;
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) y78Var.c).get(jr30Var);
                    if (arrayList == null) {
                        kr30Var = null;
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                kr30Var2 = null;
                                break;
                            }
                            rbe0 rbe0Var = (rbe0) arrayList.get(i);
                            dyw dywVar = (dyw) rbe0Var.f30181a.get();
                            kr30Var2 = dywVar != null ? new kr30(dywVar, rbe0Var.b) : null;
                            if (kr30Var2 != null) {
                                break;
                            }
                            i++;
                        }
                        y78Var.h();
                        kr30Var = kr30Var2;
                    }
                }
                if (kr30Var != null && !kr30Var.f18747a.l()) {
                    synchronized (this.c) {
                        dr8 dr8Var = (dr8) this.f16237a.c;
                        Object objRemove = ((LinkedHashMap) dr8Var.c).remove(jr30Var);
                        if (objRemove != null) {
                            dr8Var.b = dr8Var.l() - dr8Var.o(jr30Var, objRemove);
                            dr8Var.k(jr30Var, objRemove, null);
                        }
                        if (objRemove != null) {
                        }
                        if (((LinkedHashMap) this.b.c).remove(jr30Var) != null) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kr30Var;
    }

    public final void b(long j) {
        synchronized (this.c) {
            dr8 dr8Var = (dr8) this.f16237a.c;
            dr8Var.f6545a = j;
            dr8Var.q(j);
        }
    }
}
