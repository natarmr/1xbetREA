package a;

/* JADX INFO: loaded from: classes.dex */
public final class kae0 extends jkd {
    public final /* synthetic */ byte b;
    public final /* synthetic */ jw20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kae0(jw20 jw20Var, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = jw20Var;
    }

    @Override // a.jkd
    public final void i(String[] strArr) {
        byte b = this.b;
        jw20 jw20Var = this.c;
        switch (b) {
            case 0:
                if (strArr == null) {
                    jf4.o("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((mae0) jw20Var.b).d = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    jf4.o("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((mae0) jw20Var.b).e = strArr;
                }
                break;
        }
    }
}
