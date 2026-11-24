package a;

/* JADX INFO: loaded from: classes2.dex */
public class qut0 extends put0 {
    public static final void b(int i, String str, String str2) {
        StringBuilder sbP = kng0.p(i, "Expected ", str2, " at index ", ", but was '");
        sbP.append(str.charAt(i));
        sbP.append('\'');
        throw new IllegalArgumentException(sbP.toString());
    }
}
