package a;

/* JADX INFO: loaded from: classes.dex */
public final class lae0 extends jkd {
    public final /* synthetic */ byte b;
    public final /* synthetic */ onv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lae0(onv onvVar, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = onvVar;
    }

    @Override // a.jkd
    public final void i(String[] strArr) {
        byte b = this.b;
        onv onvVar = this.c;
        switch (b) {
            case 0:
                if (strArr == null) {
                    jf4.o("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((mae0) onvVar.f25567a).d = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    jf4.o("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((mae0) onvVar.f25567a).e = strArr;
                }
                break;
        }
    }
}
