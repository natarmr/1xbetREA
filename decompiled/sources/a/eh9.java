package a;

/* JADX INFO: loaded from: classes.dex */
public final class eh9 extends xg9 {
    public static eh9 i(String str) {
        eh9 eh9Var = new eh9(str.toCharArray());
        eh9Var.b = 0L;
        eh9Var.h(str.length() - 1);
        return eh9Var;
    }

    @Override // a.xg9
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof eh9) && c().equals(((eh9) obj).c())) {
            return true;
        }
        return super.equals(obj);
    }
}
