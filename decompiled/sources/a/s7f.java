package a;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class s7f implements Comparator {
    public static final s7f b = new s7f(0);
    public static final s7f c = new s7f(1);
    public static final s7f d = new s7f(2);
    public static final s7f e = new s7f(3);
    public static final s7f f = new s7f(4);
    public static final s7f g = new s7f(5);
    public static final s7f h = new s7f(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31747a;

    public /* synthetic */ s7f(byte b2) {
        this.f31747a = b2;
    }

    public static int a(vjj vjjVar) {
        if (vjjVar == null) {
            oek.a(36);
            throw null;
        }
        int i = oek.f25126a;
        if (oek.m(vjjVar, slc.d)) {
            return 8;
        }
        if (vjjVar instanceof x4e) {
            return 7;
        }
        if (vjjVar instanceof d0d0) {
            return ((d0d0) vjjVar).F() == null ? 6 : 5;
        }
        if (vjjVar instanceof mer) {
            return ((mer) vjjVar).F() == null ? 4 : 3;
        }
        if (vjjVar instanceof wm40) {
            return 2;
        }
        return vjjVar instanceof tfk ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03df  */
    /* JADX WARN: Code duplicated, block: B:176:0x03f5  */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03fd, code lost:
    
        if (r8 == false) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s7f.compare(java.lang.Object, java.lang.Object):int");
    }
}
