package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bh40 extends fhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2587a;
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    public bh40(String str, ArrayList arrayList) {
        String strM;
        str.getClass();
        if (arrayList.size() == 1) {
            strM = ua80.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strM = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(strM, null, arrayList, str);
    }

    public bh40(String str, bh40 bh40Var, List list, String str2) {
        super(str, bh40Var);
        this.f2587a = list;
        this.b = str2;
    }
}
