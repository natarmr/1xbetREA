package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class te1 extends m06 {
    public final knf0 b;
    public final n0o0 c;

    public te1(knf0 knf0Var, gii0 gii0Var) {
        knf0Var.getClass();
        gii0Var.getClass();
        this.b = knf0Var;
        this.c = maz.b(new zm(gii0Var, (byte) 5));
    }

    @Override // a.m06
    public final Object a(om80 om80Var) {
        int i;
        String str;
        int i2;
        om80Var.getClass();
        Integer num = om80Var.b;
        short s = om80Var.c.f7986a;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        mm80 mm80VarA = om80Var.a(iIntValue);
        goc0 goc0Var = mm80VarA != null ? (goc0) mm80VarA.b : null;
        mm80 mm80VarA2 = om80Var.a(iIntValue);
        goc0 goc0Var2 = mm80VarA2 != null ? (goc0) mm80VarA2.c : null;
        int i3 = 0;
        if (goc0Var != null) {
            i = goc0Var.f11624a;
        } else {
            i = goc0Var2 != null ? goc0Var2.f11624a : 0;
        }
        if (goc0Var != null) {
            str = goc0Var.b;
        } else {
            str = goc0Var2 != null ? goc0Var2.b : null;
            if (str == null) {
                str = "";
            }
        }
        if (goc0Var != null) {
            i2 = goc0Var.c;
        } else {
            i2 = goc0Var2 != null ? goc0Var2.c : 0;
        }
        if (goc0Var != null) {
            i3 = goc0Var.d + s;
        } else if (goc0Var2 != null) {
            i3 = goc0Var2.d - s;
        }
        return new goc0(i, i2, i3, str);
    }

    @Override // a.m06
    public final lm80 b(Throwable th) {
        return new lm80(th);
    }

    @Override // a.m06
    public final boolean d(Object obj, Object obj2) {
        return Intrinsics.d((goc0) obj, (goc0) obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:12|13|99|135|26|(2:139|28)(1:32)|33|(1:35)(1:37)|(1:39)|40|(2:42|43)(1:44)|45|46|137|47|(1:50)|98) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:139|28) */
    /* JADX WARN: Code duplicated, block: B:124:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:139:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[Catch: all -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008f, blocks: (B:28:0x008c, B:35:0x00b7, B:42:0x00c8), top: B:139:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[Catch: all -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008f, blocks: (B:28:0x008c, B:35:0x00b7, B:42:0x00c8), top: B:139:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x015a  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        r20 = r12;
        r12 = r1;
        r1 = r10;
        r10 = r4;
        r4 = r20;
        r20 = r11;
        r11 = r2;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011e, code lost:
    
        r12 = r1;
        r11 = r2;
        r2 = r8;
        r10 = r17;
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        r17 = r4;
        r19 = r10;
        r8 = r11;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0189, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L98;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0189 -> B:13:0x003f). Please report as a decompilation issue!!! */
    @Override // a.m06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(a.km80 r22, a.yje r23) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.te1.f(a.km80, a.yje):java.io.Serializable");
    }
}
