package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class w4d0 implements dhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38538a;
    public final sg9 b;
    public final og9 c;
    public final eky d;
    public final af80 e;
    public final Integer f;

    public w4d0(String str, og9 og9Var, eky ekyVar, af80 af80Var, Integer num) {
        this.f38538a = str;
        this.b = utt0.b(str);
        this.c = og9Var;
        this.d = ekyVar;
        this.e = af80Var;
        this.f = num;
    }

    public static w4d0 a(String str, og9 og9Var, eky ekyVar, af80 af80Var, Integer num) throws GeneralSecurityException {
        if (af80Var == af80.RAW) {
            if (num != null) {
                hny.o("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            hny.o("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new w4d0(str, og9Var, ekyVar, af80Var, num);
    }
}
