package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ljq extends mjq {
    public final vlx[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ljq(int i, vlx[] vlxVarArr) {
        if (vlxVarArr == null) {
            jf4.o("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = vlxVarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            hny.w(vlxVarArr.getClass(), "Empty enum: ");
            throw null;
        }
        super(i, i2, (byte) 0);
        this.d = vlxVarArr;
    }

    @Override // a.mjq
    public final Object e(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (vlx vlxVar : this.d) {
            if (vlxVar.a() == i4) {
                return vlxVar;
            }
        }
        return null;
    }
}
