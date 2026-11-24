package a;

import java.io.IOException;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class okn0 implements qpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w7r f25413a;

    public okn0(w7r w7rVar) {
        w7rVar.getClass();
        this.f25413a = w7rVar;
    }

    @Override // a.qpg0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bln0 Z0(String str) {
        str.getClass();
        w7r w7rVar = this.f25413a;
        w7rVar.getClass();
        String string = StringsKt.u0(str).toString();
        if (string.length() >= 3) {
            String upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                zkn0 zkn0Var = new zkn0(w7rVar, str, (byte) 1);
                zkn0Var.e = new int[0];
                zkn0Var.f = new long[0];
                zkn0Var.g = new double[0];
                zkn0Var.h = new String[0];
                zkn0Var.i = new byte[0][];
                return zkn0Var;
            }
        }
        return new aln0(w7rVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25413a.close();
    }
}
