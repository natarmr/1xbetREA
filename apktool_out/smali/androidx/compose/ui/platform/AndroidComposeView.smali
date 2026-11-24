.class public final Landroidx/compose/ui/platform/AndroidComposeView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements La/cg80;
.implements La/sv90;
.implements La/leg0;
.implements La/vi30;
.implements La/qvj;
.implements La/nd80;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;
.implements La/upq;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ce\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00082\u00020\t2\u00020\n2\u00020\u000b2\u00020\u0004:\u0006\u00cc\u0002\u00cd\u0002\u00ce\u0002J\u000f\u0010\r\u001a\u00020\u000cH\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u000c\u00a2\u0006\u0004\u0008\"\u0010#R+\u0010+\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R*\u00105\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008-\u0010.\u0012\u0004\u00083\u00104\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R$\u0010=\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R$\u0010D\u001a\u00020>2\u0006\u0010?\u001a\u00020>8\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR+\u0010K\u001a\u00020E2\u0006\u0010$\u001a\u00020E8V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008F\u0010&\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\u001a\u0010Q\u001a\u00020L8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010PR\"\u0010Y\u001a\u00020R8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^R+\u0010b\u001a\u00020`2\u0006\u0010$\u001a\u00020`8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008a\u0010&\u001a\u0004\u0008b\u0010c\"\u0004\u0008d\u0010eR\u001b\u0010i\u001a\u00020`8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008f\u0010g\u001a\u0004\u0008h\u0010cR\u0017\u0010o\u001a\u00020j8\u0006\u00a2\u0006\u000c\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010nR \u0010v\u001a\u00020p8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u0012\u0004\u0008u\u00104\u001a\u0004\u0008s\u0010tR \u0010|\u001a\u0008\u0012\u0004\u0012\u00020p0w8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008x\u0010y\u001a\u0004\u0008z\u0010{R\u001d\u0010\u0082\u0001\u001a\u00020}8\u0016X\u0096\u0004\u00a2\u0006\u000e\n\u0004\u0008~\u0010\u007f\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001R \u0010\u0088\u0001\u001a\u00030\u0083\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001\"\u0006\u0008\u008e\u0001\u0010\u008f\u0001R \u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R3\u0010\u00a3\u0001\u001a\u00030\u009d\u00012\u0007\u0010$\u001a\u00030\u009d\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u009e\u0001\u0010&\u001a\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\"\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R \u0010\u00a8\u0001\u001a\u00030\u00a4\u00018VX\u0096\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u00a5\u0001\u0010g\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\"\u0010\u00ae\u0001\u001a\u0005\u0018\u00010\u00a9\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\"\u0010\u00b4\u0001\u001a\u0005\u0018\u00010\u00af\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001R \u0010\u00ba\u0001\u001a\u00030\u00b5\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001\u001a\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001R\'\u0010\u00bf\u0001\u001a\u00020`8V@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001\u001a\u0005\u0008\u00bd\u0001\u0010c\"\u0005\u0008\u00be\u0001\u0010eR/\u0010\u00c6\u0001\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e\u00a2\u0006\u001e\n\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001\u0012\u0005\u0008\u00c5\u0001\u00104\u001a\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001\"\u0005\u0008\u00c4\u0001\u0010\u0016R \u0010\u00cb\u0001\u001a\u00030\u00c7\u00018VX\u0096\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u00c8\u0001\u0010&\u001a\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001R3\u0010\u00d2\u0001\u001a\u00030\u00cc\u00012\u0007\u0010$\u001a\u00030\u00cc\u00018V@RX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u00cd\u0001\u0010&\u001a\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001\"\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R \u0010\u00d8\u0001\u001a\u00030\u00d3\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001\u001a\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001RD\u0010\u00e2\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00da\u0001\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00140\u00d9\u00018\u0000@\u0000X\u0081\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00db\u0001\u0010\u00dc\u0001\u0012\u0005\u0008\u00e1\u0001\u00104\u001a\u0006\u0008\u00dd\u0001\u0010\u00de\u0001\"\u0006\u0008\u00df\u0001\u0010\u00e0\u0001R\'\u0010\u00e6\u0001\u001a\u00020`8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00e3\u0001\u0010\u00bc\u0001\u001a\u0005\u0008\u00e4\u0001\u0010c\"\u0005\u0008\u00e5\u0001\u0010eR \u0010\u00ec\u0001\u001a\u00030\u00e7\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001\u001a\u0006\u0008\u00ea\u0001\u0010\u00eb\u0001R\'\u0010\u00ef\u0001\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u00ed\u0001\u0010(\"\u0005\u0008\u00ee\u0001\u0010*R\u0018\u0010\u00f3\u0001\u001a\u00030\u00f0\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001R\u0017\u0010\u00f6\u0001\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001R\u0015\u0010\u00fa\u0001\u001a\u00030\u00f7\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00f8\u0001\u0010\u00f9\u0001R\u001f\u0010\u00ff\u0001\u001a\u00030\u00fb\u00018VX\u0096\u0004\u00a2\u0006\u000f\u0012\u0005\u0008\u00fe\u0001\u00104\u001a\u0006\u0008\u00fc\u0001\u0010\u00fd\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0084\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0085\u0002\u0010\u0086\u0002R*\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0088\u0002\u0010\u0089\u0002\u001a\u0006\u0008\u008a\u0002\u0010\u008b\u0002\"\u0005\u0008\u008c\u0002\u0010\u001aR\u0018\u0010\u0090\u0002\u001a\u00030\u008d\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0002\u0010\u0093\u0002R\u0018\u0010\u0098\u0002\u001a\u00030\u0095\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0096\u0002\u0010\u0097\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009a\u0002\u0010\u009b\u0002R\u0017\u0010\u009e\u0002\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009d\u0002\u0010\u00c3\u0001R\u0016\u0010\u00a0\u0002\u001a\u00020`8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009f\u0002\u0010cR\u001f\u0010\u00a5\u0002\u001a\u00030\u00a1\u00028VX\u0097\u0004\u00a2\u0006\u000f\u0012\u0005\u0008\u00a4\u0002\u00104\u001a\u0006\u0008\u00a2\u0002\u0010\u00a3\u0002R\u0018\u0010\u00a9\u0002\u001a\u00030\u00a6\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a7\u0002\u0010\u00a8\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030\u00aa\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ab\u0002\u0010\u00ac\u0002R\u001f\u0010\u00b2\u0002\u001a\u00030\u00ae\u00028VX\u0097\u0004\u00a2\u0006\u000f\u0012\u0005\u0008\u00b1\u0002\u00104\u001a\u0006\u0008\u00af\u0002\u0010\u00b0\u0002R\u0018\u0010\u00b6\u0002\u001a\u00030\u00b3\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b4\u0002\u0010\u00b5\u0002R\u0018\u0010\u00ba\u0002\u001a\u00030\u00b7\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b8\u0002\u0010\u00b9\u0002R\u0018\u0010\u00be\u0002\u001a\u00030\u00bb\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00bc\u0002\u0010\u00bd\u0002R\u0013\u0010\u00c0\u0002\u001a\u00020`8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00bf\u0002\u0010cR\u0019\u0010\u00c3\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c1\u0002\u0010\u00c2\u0002R\u0018\u0010\u00c7\u0002\u001a\u00030\u00c4\u00028BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c5\u0002\u0010\u00c6\u0002R\u0018\u0010\u00cb\u0002\u001a\u00030\u00c8\u00028BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c9\u0002\u0010\u00ca\u0002\u00a8\u0006\u00cf\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "Landroid/view/ViewGroup;",
        "La/cg80;",
        "La/sv90;",
        "",
        "La/vi30;",
        "La/qvj;",
        "La/nd80;",
        "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;",
        "Landroid/view/ViewTreeObserver$OnScrollChangedListener;",
        "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;",
        "La/upq;",
        "",
        "getImportantForAutofill",
        "()I",
        "La/jge0;",
        "getEmbeddedViewFocusRect",
        "()La/jge0;",
        "",
        "intervalMillis",
        "",
        "setAccessibilityEventBatchIntervalMillis",
        "(J)V",
        "La/keg0;",
        "handler",
        "setUncaughtExceptionHandler",
        "(La/keg0;)V",
        "Lkotlin/Function1;",
        "La/skd;",
        "callback",
        "setOnReadyForComposition",
        "(Lkotlin/jvm/functions/Function1;)V",
        "accessibilityId",
        "Landroid/view/View;",
        "findViewByAccessibilityIdTraversal",
        "(I)Landroid/view/View;",
        "<set-?>",
        "a",
        "La/pz40;",
        "get_composeViewContext",
        "()La/skd;",
        "set_composeViewContext",
        "(La/skd;)V",
        "_composeViewContext",
        "La/v6x;",
        "d",
        "La/v6x;",
        "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui",
        "()La/v6x;",
        "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui",
        "(La/v6x;)V",
        "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations",
        "()V",
        "primaryDirectionalMotionAxisOverride",
        "La/jlz;",
        "e",
        "La/jlz;",
        "getFrameEndScheduler$ui",
        "()La/jlz;",
        "setFrameEndScheduler$ui",
        "(La/jlz;)V",
        "frameEndScheduler",
        "La/v9g0;",
        "value",
        "h",
        "La/v9g0;",
        "getRetainedValuesStore",
        "()La/v9g0;",
        "retainedValuesStore",
        "La/w6k;",
        "k",
        "getDensity",
        "()La/w6k;",
        "setDensity",
        "(La/w6k;)V",
        "density",
        "La/wpq;",
        "m",
        "La/wpq;",
        "getFocusOwner",
        "()La/wpq;",
        "focusOwner",
        "Lkotlin/coroutines/CoroutineContext;",
        "n",
        "Lkotlin/coroutines/CoroutineContext;",
        "getCoroutineContext",
        "()Lkotlin/coroutines/CoroutineContext;",
        "setCoroutineContext",
        "(Lkotlin/coroutines/CoroutineContext;)V",
        "coroutineContext",
        "La/wy2;",
        "o",
        "La/wy2;",
        "getDragAndDropManager",
        "()La/wy2;",
        "dragAndDropManager",
        "",
        "p",
        "isAttached",
        "()Z",
        "setAttached",
        "(Z)V",
        "q",
        "La/l7m0;",
        "getDerivedIsAttached",
        "derivedIsAttached",
        "La/xfx;",
        "r",
        "La/xfx;",
        "getInsetsListener",
        "()La/xfx;",
        "insetsListener",
        "La/e7z;",
        "s",
        "La/e7z;",
        "getRoot",
        "()La/e7z;",
        "getRoot$annotations",
        "root",
        "La/ey40;",
        "t",
        "La/ey40;",
        "getLayoutNodes",
        "()La/ey40;",
        "layoutNodes",
        "La/oge0;",
        "u",
        "La/oge0;",
        "getRectManager",
        "()La/oge0;",
        "rectManager",
        "La/wai0;",
        "v",
        "La/wai0;",
        "getSemanticsOwner",
        "()La/wai0;",
        "semanticsOwner",
        "La/iy2;",
        "x",
        "La/iy2;",
        "getContentCaptureManager$ui",
        "()La/iy2;",
        "setContentCaptureManager$ui",
        "(La/iy2;)V",
        "contentCaptureManager",
        "La/afv;",
        "y",
        "La/afv;",
        "getGraphicsContext",
        "()La/afv;",
        "graphicsContext",
        "La/w55;",
        "z",
        "La/w55;",
        "getAutofillTree",
        "()La/w55;",
        "autofillTree",
        "Landroid/content/res/Configuration;",
        "j1",
        "getConfiguration",
        "()Landroid/content/res/Configuration;",
        "setConfiguration",
        "(Landroid/content/res/Configuration;)V",
        "configuration",
        "La/rs00;",
        "k1",
        "getLocaleList",
        "()La/rs00;",
        "localeList",
        "La/iw2;",
        "l1",
        "La/iw2;",
        "getAutofill",
        "()La/iw2;",
        "autofill",
        "La/jw2;",
        "m1",
        "La/jw2;",
        "getAutofillManager",
        "()La/jw2;",
        "autofillManager",
        "La/eg80;",
        "o1",
        "La/eg80;",
        "getSnapshotObserver",
        "()La/eg80;",
        "snapshotObserver",
        "p1",
        "Z",
        "getShowLayoutBounds",
        "setShowLayoutBounds",
        "showLayoutBounds",
        "A1",
        "J",
        "getLastMatrixRecalculationAnimationTime$ui",
        "()J",
        "setLastMatrixRecalculationAnimationTime$ui",
        "getLastMatrixRecalculationAnimationTime$ui$annotations",
        "lastMatrixRecalculationAnimationTime",
        "La/mrq;",
        "I1",
        "getFontFamilyResolver",
        "()La/mrq;",
        "fontFamilyResolver",
        "La/k6z;",
        "J1",
        "getLayoutDirection",
        "()La/k6z;",
        "setLayoutDirection",
        "(La/k6z;)V",
        "layoutDirection",
        "La/qm40;",
        "L1",
        "La/qm40;",
        "getModifierLocalManager",
        "()La/qm40;",
        "modifierLocalManager",
        "Lkotlin/Function2;",
        "La/jpq;",
        "Z1",
        "Lkotlin/jvm/functions/Function2;",
        "getPlayNavigationSoundEffect$ui",
        "()Lkotlin/jvm/functions/Function2;",
        "setPlayNavigationSoundEffect$ui",
        "(Lkotlin/jvm/functions/Function2;)V",
        "getPlayNavigationSoundEffect$ui$annotations",
        "playNavigationSoundEffect",
        "e2",
        "getComposeViewContextIncrementedDuringInit$ui",
        "setComposeViewContextIncrementedDuringInit$ui",
        "composeViewContextIncrementedDuringInit",
        "La/cpa0;",
        "i2",
        "La/cpa0;",
        "getPointerIconService",
        "()La/cpa0;",
        "pointerIconService",
        "getComposeViewContext",
        "setComposeViewContext",
        "composeViewContext",
        "La/g7z;",
        "getSharedDrawScope",
        "()La/g7z;",
        "sharedDrawScope",
        "getView",
        "()Landroid/view/View;",
        "view",
        "La/owk;",
        "getSavedStateRegistry",
        "()La/owk;",
        "savedStateRegistry",
        "La/rhv0;",
        "getWindowInfo",
        "()La/rhv0;",
        "getWindowInfo$annotations",
        "windowInfo",
        "La/wgu0;",
        "getViewConfiguration",
        "()La/wgu0;",
        "viewConfiguration",
        "La/leg0;",
        "getRootForTest",
        "()La/leg0;",
        "rootForTest",
        "uncaughtExceptionHandler",
        "La/keg0;",
        "getUncaughtExceptionHandler$ui",
        "()La/keg0;",
        "setUncaughtExceptionHandler$ui",
        "La/w6;",
        "getAccessibilityManager",
        "()La/w6;",
        "accessibilityManager",
        "La/kuc;",
        "getClipboardManager",
        "()La/kuc;",
        "clipboardManager",
        "La/iuc;",
        "getClipboard",
        "()La/iuc;",
        "clipboard",
        "La/p33;",
        "getAndroidViewsHandler$ui",
        "()La/p33;",
        "androidViewsHandler",
        "getMeasureIteration",
        "measureIteration",
        "getHasPendingMeasureOrLayout",
        "hasPendingMeasureOrLayout",
        "La/o8q0;",
        "getTextInputService",
        "()La/o8q0;",
        "getTextInputService$annotations",
        "textInputService",
        "La/pkk0;",
        "getSoftwareKeyboardController",
        "()La/pkk0;",
        "softwareKeyboardController",
        "La/ou90;",
        "getPlacementScope",
        "()La/ou90;",
        "placementScope",
        "La/hrq;",
        "getFontLoader",
        "()La/hrq;",
        "getFontLoader$annotations",
        "fontLoader",
        "La/omv;",
        "getHapticFeedBack",
        "()La/omv;",
        "hapticFeedBack",
        "La/bfx;",
        "getInputModeManager",
        "()La/bfx;",
        "inputModeManager",
        "La/aaq0;",
        "getTextToolbar",
        "()La/aaq0;",
        "textToolbar",
        "getScrollCaptureInProgress",
        "scrollCaptureInProgress",
        "getOutOfFrameExecutor",
        "()Landroidx/compose/ui/platform/AndroidComposeView;",
        "outOfFrameExecutor",
        "La/b6a;",
        "getCanvasHolder",
        "()La/b6a;",
        "canvasHolder",
        "La/q8q0;",
        "getLegacyTextInputServiceAndroid",
        "()La/q8q0;",
        "legacyTextInputServiceAndroid",
        "a/f42",
        "a/uc9",
        "a/ix2",
        "ui"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static j2:Ljava/lang/Class;

.field public static k2:Ljava/lang/reflect/Method;

.field public static l2:Ljava/lang/reflect/Method;

.field public static final m2:La/vy40;

.field public static n2:La/d12;

.field public static o2:Ljava/lang/reflect/Method;

.field public static p2:Ljava/lang/reflect/Method;


# instance fields
.field public final A:La/vy40;

.field public A1:J

.field public B:La/vy40;

.field public B1:Z

.field public C1:J

.field public D1:Lkotlin/jvm/functions/Function1;

.field public E1:La/q8q0;

.field public F1:La/o8q0;

.field public final G1:Ljava/util/concurrent/atomic/AtomicReference;

.field public H1:La/r3k;

.field public final I1:La/pz40;

.field public final J1:La/pz40;

.field public K1:La/bfx;

.field public final L1:La/qm40;

.field public M1:La/k23;

.field public N1:Landroid/view/MotionEvent;

.field public O1:J

.field public final P1:La/fck0;

.field public final Q1:La/vy40;

.field public R1:F

.field public S1:F

.field public U1:F

.field public V1:F

.field public final W1:La/mx2;

.field public final X1:La/gx2;

.field public Y1:Z

.field public Z1:Lkotlin/jvm/functions/Function2;

.field public final a:La/pz40;

.field public final a2:La/qo8;

.field public b:J

.field public final b2:La/bx2;

.field public final c:Z

.field public final c2:La/bx2;

.field public d:La/v6x;

.field public d2:Z

.field public e:La/jlz;

.field public e2:Z

.field public f:La/klz;

.field public f1:Z

.field public f2:Z

.field public g:La/owk;

.field public g1:Z

.field public final g2:La/u9h0;

.field public h:La/v9g0;

.field public final h1:La/ns40;

.field public h2:Landroid/view/View;

.field public final i:La/xw3;

.field public final i1:La/td9;

.field public final i2:La/lx2;

.field public final j:La/gx2;

.field public final j1:La/pz40;

.field public final k:La/pz40;

.field public final k1:La/zbk;

.field public final l:Landroid/view/View;

.field public final l1:La/iw2;

.field public final m:La/ypq;

.field public final m1:La/jw2;

.field public n:Lkotlin/coroutines/CoroutineContext;

.field public n1:Z

.field public final o:La/wy2;

.field public final o1:La/eg80;

.field public final p:La/pz40;

.field public p1:Z

.field public final q:La/zbk;

.field public q1:La/p33;

.field public final r:La/xfx;

.field public r1:La/p4e;

.field public final s:La/e7z;

.field public s1:Z

.field public final t:La/ey40;

.field public final t1:La/h7k;

.field public final u:La/oge0;

.field public u1:J

.field public final v:La/wai0;

.field public final v1:[I

.field public final w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

.field public final w1:[F

.field public x:La/iy2;

.field public final x1:Landroid/graphics/Matrix;

.field public final y:La/rz2;

.field public final y1:[F

.field public final z:La/w55;

.field public final z1:[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/vy40;

    .line 2
    .line 3
    invoke-direct {v0}, La/vy40;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->m2:La/vy40;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/skd;)V
    .locals 15

    .line 1
    move-object/from16 v8, p1

    .line 2
    .line 3
    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a:La/pz40;

    .line 11
    .line 12
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    iput-boolean v9, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c:Z

    .line 21
    .line 22
    sget-object v0, La/rv00;->p:La/rv00;

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:La/v9g0;

    .line 25
    .line 26
    new-instance v0, La/xw3;

    .line 27
    .line 28
    invoke-direct {v0}, La/xw3;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i:La/xw3;

    .line 32
    .line 33
    new-instance v0, La/gx2;

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    invoke-direct {v0, p0, v10}, La/gx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j:La/gx2;

    .line 40
    .line 41
    invoke-static {v8}, La/q8a;->e(Landroid/content/Context;)La/a7k;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/ujn;->A:La/ujn;

    .line 46
    .line 47
    invoke-static {v0, v1}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k:La/pz40;

    .line 52
    .line 53
    new-instance v0, La/ypq;

    .line 54
    .line 55
    invoke-direct {v0, p0, p0}, La/ypq;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->m:La/ypq;

    .line 59
    .line 60
    invoke-virtual/range {p2 .. p2}, La/skd;->c()La/nld;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, La/nld;->k()Lkotlin/coroutines/CoroutineContext;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n:Lkotlin/coroutines/CoroutineContext;

    .line 69
    .line 70
    new-instance v0, La/wy2;

    .line 71
    .line 72
    new-instance v1, La/kx2;

    .line 73
    .line 74
    invoke-direct {v0}, La/wy2;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:La/wy2;

    .line 78
    .line 79
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p:La/pz40;

    .line 86
    .line 87
    new-instance v0, La/bx2;

    .line 88
    .line 89
    const/4 v11, 0x2

    .line 90
    invoke-direct {v0, p0, v11}, La/bx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:La/zbk;

    .line 98
    .line 99
    new-instance v0, La/xfx;

    .line 100
    .line 101
    invoke-direct {v0}, La/xfx;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:La/xfx;

    .line 105
    .line 106
    new-instance v0, La/e7z;

    .line 107
    .line 108
    const/4 v12, 0x3

    .line 109
    invoke-direct {v0, v12}, La/e7z;-><init>(I)V

    .line 110
    .line 111
    .line 112
    sget-object v1, La/neg0;->c:La/neg0;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, La/e7z;->d0(La/tj30;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()La/w6k;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, La/e7z;->a0(La/w6k;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewConfiguration()La/wgu0;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, La/e7z;->f0(La/wgu0;)V

    .line 129
    .line 130
    .line 131
    new-instance v1, La/nx2;

    .line 132
    .line 133
    invoke-direct {v1, p0}, La/nx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, La/ypq;

    .line 141
    .line 142
    iget-object v3, v3, La/ypq;->e:La/xpq;

    .line 143
    .line 144
    invoke-interface {v1, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()La/wy2;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    iget-object v3, v3, La/wy2;->c:La/vy2;

    .line 153
    .line 154
    invoke-interface {v1, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, La/e7z;->e0(La/mm40;)V

    .line 159
    .line 160
    .line 161
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s:La/e7z;

    .line 162
    .line 163
    sget-object v0, La/hkx;->a:La/ey40;

    .line 164
    .line 165
    new-instance v0, La/ey40;

    .line 166
    .line 167
    invoke-direct {v0}, La/ey40;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t:La/ey40;

    .line 171
    .line 172
    new-instance v0, La/oge0;

    .line 173
    .line 174
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-direct {v0, v1, p0}, La/oge0;-><init>(La/ey40;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 179
    .line 180
    .line 181
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u:La/oge0;

    .line 182
    .line 183
    new-instance v0, La/wai0;

    .line 184
    .line 185
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    new-instance v3, La/vun;

    .line 190
    .line 191
    invoke-direct {v3}, La/lm40;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v0, v1, v3, v4}, La/wai0;-><init>(La/e7z;La/vun;La/ey40;)V

    .line 199
    .line 200
    .line 201
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v:La/wai0;

    .line 202
    .line 203
    new-instance v13, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 204
    .line 205
    invoke-direct {v13, p0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 206
    .line 207
    .line 208
    iput-object v13, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 209
    .line 210
    new-instance v14, La/iy2;

    .line 211
    .line 212
    new-instance v0, La/f8;

    .line 213
    .line 214
    const/4 v6, 0x1

    .line 215
    const/16 v7, 0x8

    .line 216
    .line 217
    const/4 v1, 0x0

    .line 218
    const-class v3, La/cy2;

    .line 219
    .line 220
    const-string v4, "getContentCaptureSessionCompat"

    .line 221
    .line 222
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"

    .line 223
    .line 224
    move-object v2, p0

    .line 225
    invoke-direct/range {v0 .. v7}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v14, p0, v0}, La/iy2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;La/f8;)V

    .line 229
    .line 230
    .line 231
    iput-object v14, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 232
    .line 233
    new-instance v0, La/rz2;

    .line 234
    .line 235
    invoke-direct {v0, p0}, La/rz2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 236
    .line 237
    .line 238
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y:La/rz2;

    .line 239
    .line 240
    new-instance v0, La/w55;

    .line 241
    .line 242
    invoke-direct {v0}, La/w55;-><init>()V

    .line 243
    .line 244
    .line 245
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z:La/w55;

    .line 246
    .line 247
    new-instance v0, La/vy40;

    .line 248
    .line 249
    invoke-direct {v0}, La/vy40;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A:La/vy40;

    .line 253
    .line 254
    new-instance v0, La/ns40;

    .line 255
    .line 256
    invoke-direct {v0}, La/ns40;-><init>()V

    .line 257
    .line 258
    .line 259
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:La/ns40;

    .line 260
    .line 261
    new-instance v0, La/td9;

    .line 262
    .line 263
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 268
    .line 269
    .line 270
    iput-object v1, v0, La/td9;->b:Ljava/lang/Object;

    .line 271
    .line 272
    new-instance v3, La/oaw;

    .line 273
    .line 274
    iget-object v1, v1, La/e7z;->h1:La/tzi;

    .line 275
    .line 276
    iget-object v1, v1, La/tzi;->d:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v1, La/rdx;

    .line 279
    .line 280
    invoke-direct {v3, v1}, La/oaw;-><init>(La/j6z;)V

    .line 281
    .line 282
    .line 283
    iput-object v3, v0, La/td9;->c:Ljava/lang/Object;

    .line 284
    .line 285
    new-instance v1, La/pv00;

    .line 286
    .line 287
    const/16 v3, 0xd

    .line 288
    .line 289
    invoke-direct {v1, v3}, La/pv00;-><init>(B)V

    .line 290
    .line 291
    .line 292
    iput-object v1, v0, La/td9;->d:Ljava/lang/Object;

    .line 293
    .line 294
    new-instance v1, La/raw;

    .line 295
    .line 296
    invoke-direct {v1}, La/raw;-><init>()V

    .line 297
    .line 298
    .line 299
    iput-object v1, v0, La/td9;->e:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i1:La/td9;

    .line 302
    .line 303
    new-instance v0, Landroid/content/res/Configuration;

    .line 304
    .line 305
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j1:La/pz40;

    .line 321
    .line 322
    new-instance v0, La/bx2;

    .line 323
    .line 324
    invoke-direct {v0, p0, v12}, La/bx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 325
    .line 326
    .line 327
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k1:La/zbk;

    .line 332
    .line 333
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    const/4 v6, 0x0

    .line 338
    if-eqz v0, :cond_0

    .line 339
    .line 340
    new-instance v0, La/iw2;

    .line 341
    .line 342
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillTree()La/w55;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-direct {v0, p0, v1}, La/iw2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;La/w55;)V

    .line 347
    .line 348
    .line 349
    goto :goto_0

    .line 350
    :cond_0
    move-object v0, v6

    .line 351
    :goto_0
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l1:La/iw2;

    .line 352
    .line 353
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_1

    .line 358
    .line 359
    new-instance v0, La/jw2;

    .line 360
    .line 361
    new-instance v1, La/j910;

    .line 362
    .line 363
    invoke-direct {v1, v8}, La/j910;-><init>(Landroid/content/Context;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()La/wai0;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    move-object v3, p0

    .line 379
    invoke-direct/range {v0 .. v5}, La/jw2;-><init>(La/j910;La/wai0;Landroidx/compose/ui/platform/AndroidComposeView;La/oge0;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    goto :goto_1

    .line 383
    :cond_1
    move-object v0, v6

    .line 384
    :goto_1
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->m1:La/jw2;

    .line 385
    .line 386
    new-instance v0, La/eg80;

    .line 387
    .line 388
    new-instance v1, La/ax2;

    .line 389
    .line 390
    invoke-direct {v1, p0, v9}, La/ax2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 391
    .line 392
    .line 393
    invoke-direct {v0, v1}, La/eg80;-><init>(La/ax2;)V

    .line 394
    .line 395
    .line 396
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o1:La/eg80;

    .line 397
    .line 398
    new-instance v0, La/h7k;

    .line 399
    .line 400
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-direct {v0, v1}, La/h7k;-><init>(La/e7z;)V

    .line 405
    .line 406
    .line 407
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 408
    .line 409
    const-wide v0, 0x7fffffff7fffffffL

    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u1:J

    .line 415
    .line 416
    filled-new-array {v10, v10}, [I

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v1:[I

    .line 421
    .line 422
    invoke-static {}, La/ui30;->a()[F

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w1:[F

    .line 427
    .line 428
    new-instance v0, Landroid/graphics/Matrix;

    .line 429
    .line 430
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 431
    .line 432
    .line 433
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x1:Landroid/graphics/Matrix;

    .line 434
    .line 435
    invoke-static {}, La/ui30;->a()[F

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 440
    .line 441
    invoke-static {}, La/ui30;->a()[F

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z1:[F

    .line 446
    .line 447
    const-wide/16 v0, -0x1

    .line 448
    .line 449
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 450
    .line 451
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 457
    .line 458
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 459
    .line 460
    invoke-direct {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G1:Ljava/util/concurrent/atomic/AtomicReference;

    .line 464
    .line 465
    move-object/from16 v0, p2

    .line 466
    .line 467
    iget-object v0, v0, La/skd;->p:La/pz40;

    .line 468
    .line 469
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I1:La/pz40;

    .line 470
    .line 471
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    sget-object v1, La/spq;->a:[I

    .line 484
    .line 485
    if-eqz v0, :cond_3

    .line 486
    .line 487
    if-eq v0, v9, :cond_2

    .line 488
    .line 489
    move-object v0, v6

    .line 490
    goto :goto_2

    .line 491
    :cond_2
    sget-object v0, La/k6z;->b:La/k6z;

    .line 492
    .line 493
    goto :goto_2

    .line 494
    :cond_3
    sget-object v0, La/k6z;->a:La/k6z;

    .line 495
    .line 496
    :goto_2
    if-nez v0, :cond_4

    .line 497
    .line 498
    sget-object v0, La/k6z;->a:La/k6z;

    .line 499
    .line 500
    :cond_4
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:La/pz40;

    .line 505
    .line 506
    new-instance v0, La/qm40;

    .line 507
    .line 508
    invoke-direct {v0, p0}, La/qm40;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 509
    .line 510
    .line 511
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L1:La/qm40;

    .line 512
    .line 513
    new-instance v0, La/fck0;

    .line 514
    .line 515
    const/16 v1, 0x11

    .line 516
    .line 517
    invoke-direct {v0, v1}, La/fck0;-><init>(B)V

    .line 518
    .line 519
    .line 520
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P1:La/fck0;

    .line 521
    .line 522
    new-instance v0, La/vy40;

    .line 523
    .line 524
    invoke-direct {v0}, La/vy40;-><init>()V

    .line 525
    .line 526
    .line 527
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q1:La/vy40;

    .line 528
    .line 529
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 530
    .line 531
    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 532
    .line 533
    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 534
    .line 535
    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U1:F

    .line 536
    .line 537
    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V1:F

    .line 538
    .line 539
    new-instance v0, La/mx2;

    .line 540
    .line 541
    invoke-direct {v0, p0, v10}, La/mx2;-><init>(Ljava/lang/Object;B)V

    .line 542
    .line 543
    .line 544
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W1:La/mx2;

    .line 545
    .line 546
    new-instance v0, La/gx2;

    .line 547
    .line 548
    invoke-direct {v0, p0, v9}, La/gx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 549
    .line 550
    .line 551
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X1:La/gx2;

    .line 552
    .line 553
    new-instance v0, La/f42;

    .line 554
    .line 555
    invoke-direct {v0, p0, v9}, La/f42;-><init>(Ljava/lang/Object;B)V

    .line 556
    .line 557
    .line 558
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Z1:Lkotlin/jvm/functions/Function2;

    .line 559
    .line 560
    new-instance v0, La/qo8;

    .line 561
    .line 562
    new-instance v1, La/ax2;

    .line 563
    .line 564
    invoke-direct {v1, p0, v11}, La/ax2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 565
    .line 566
    .line 567
    invoke-direct {v0, v8, v1}, La/qo8;-><init>(Landroid/content/Context;La/ax2;)V

    .line 568
    .line 569
    .line 570
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a2:La/qo8;

    .line 571
    .line 572
    new-instance v0, La/bx2;

    .line 573
    .line 574
    const/4 v1, 0x4

    .line 575
    invoke-direct {v0, p0, v1}, La/bx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 576
    .line 577
    .line 578
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b2:La/bx2;

    .line 579
    .line 580
    new-instance v0, La/bx2;

    .line 581
    .line 582
    invoke-direct {v0, p0, v10}, La/bx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 583
    .line 584
    .line 585
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c2:La/bx2;

    .line 586
    .line 587
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 588
    .line 589
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {p0, v10}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {p0, v9}, Landroid/view/View;->setFocusable(Z)V

    .line 596
    .line 597
    .line 598
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 599
    .line 600
    const/16 v1, 0x1a

    .line 601
    .line 602
    if-lt v0, v1, :cond_5

    .line 603
    .line 604
    sget-object v1, La/by2;->a:La/by2;

    .line 605
    .line 606
    invoke-virtual {v1, p0, v9, v10}, La/by2;->a(Landroid/view/View;IZ)V

    .line 607
    .line 608
    .line 609
    :cond_5
    invoke-virtual {p0, v9}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 613
    .line 614
    .line 615
    invoke-static {p0, v13}, La/rgu0;->o(Landroid/view/View;La/p6;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()La/wy2;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    .line 623
    .line 624
    .line 625
    const/16 v1, 0x1d

    .line 626
    .line 627
    if-lt v0, v1, :cond_6

    .line 628
    .line 629
    sget-object v1, La/wx2;->a:La/wx2;

    .line 630
    .line 631
    invoke-virtual {v1, p0}, La/wx2;->a(Landroid/view/View;)V

    .line 632
    .line 633
    .line 634
    :cond_6
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->m()Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-eqz v1, :cond_7

    .line 639
    .line 640
    new-instance v1, Landroid/view/View;

    .line 641
    .line 642
    invoke-direct {v1, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 643
    .line 644
    .line 645
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 646
    .line 647
    invoke-direct {v3, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 651
    .line 652
    .line 653
    const v3, 0x7f0a06fe

    .line 654
    .line 655
    .line 656
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 657
    .line 658
    invoke-virtual {v1, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l:Landroid/view/View;

    .line 662
    .line 663
    const/4 v3, -0x1

    .line 664
    invoke-virtual {p0, v1, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    .line 665
    .line 666
    .line 667
    :cond_7
    const/16 v1, 0x1f

    .line 668
    .line 669
    if-lt v0, v1, :cond_8

    .line 670
    .line 671
    new-instance v6, La/u9h0;

    .line 672
    .line 673
    invoke-direct {v6}, La/u9h0;-><init>()V

    .line 674
    .line 675
    .line 676
    :cond_8
    iput-object v6, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g2:La/u9h0;

    .line 677
    .line 678
    new-instance v0, La/lx2;

    .line 679
    .line 680
    invoke-direct {v0, p0}, La/lx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 681
    .line 682
    .line 683
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i2:La/lx2;

    .line 684
    .line 685
    return-void
.end method

.method public static c()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static d(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    instance-of v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->v()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->d(Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public static e(I)J
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/high16 v1, 0x40000000    # 2.0f

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    int-to-long v0, p0

    .line 20
    sget-object p0, La/h2t0;->b:La/g2t0;

    .line 21
    .line 22
    const/16 p0, 0x20

    .line 23
    .line 24
    shl-long v2, v0, p0

    .line 25
    .line 26
    or-long/2addr v0, v2

    .line 27
    return-wide v0

    .line 28
    :cond_0
    invoke-static {}, La/v4i0;->e()V

    .line 29
    .line 30
    .line 31
    const-wide/16 v0, 0x0

    .line 32
    .line 33
    return-wide v0

    .line 34
    :cond_1
    sget-object p0, La/h2t0;->b:La/g2t0;

    .line 35
    .line 36
    const-wide/32 v0, 0x7fffffff

    .line 37
    .line 38
    .line 39
    return-wide v0

    .line 40
    :cond_2
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 41
    .line 42
    int-to-long v0, p0

    .line 43
    return-wide v0
.end method

.method public static final g(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final getCanvasHolder()La/b6a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->u:La/b6a;

    .line 6
    .line 7
    return-object p0
.end method

.method private final getDerivedIsAttached()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime La/lbk;
    .end annotation

    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui$annotations()V
    .locals 0

    return-void
.end method

.method private final getLegacyTextInputServiceAndroid()La/q8q0;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E1:La/q8q0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/q8q0;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, La/ex2;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, v3}, La/ex2;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, p0, v2}, La/q8q0;-><init>(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;La/ex2;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E1:La/q8q0;

    .line 21
    .line 22
    :cond_0
    return-object v0
.end method

.method public static synthetic getPlayNavigationSoundEffect$ui$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRoot$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTextInputService$annotations()V
    .locals 0
    .annotation runtime La/lbk;
    .end annotation

    return-void
.end method

.method public static synthetic getWindowInfo$annotations()V
    .locals 0

    return-void
.end method

.method private final get_composeViewContext()La/skd;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/skd;

    .line 10
    .line 11
    return-object p0
.end method

.method public static j(La/e7z;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/e7z;->E()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/e7z;->A()La/xz40;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    iget p0, p0, La/xz40;->c:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, p0, :cond_0

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    check-cast v2, La/e7z;

    .line 18
    .line 19
    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->j(La/e7z;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public static m()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static n(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x7fffffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 16
    .line 17
    if-ge v0, v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/2addr v0, v1

    .line 28
    if-ge v0, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/2addr v0, v1

    .line 39
    if-ge v0, v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    and-int/2addr v0, v1

    .line 50
    if-ge v0, v4, :cond_0

    .line 51
    .line 52
    move v0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v0, v3

    .line 55
    :goto_0
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    move v6, v3

    .line 62
    :goto_1
    if-ge v6, v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getX(I)F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    and-int/2addr v0, v1

    .line 73
    if-ge v0, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getY(I)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    and-int/2addr v0, v1

    .line 84
    if-ge v0, v4, :cond_2

    .line 85
    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v7, 0x1d

    .line 89
    .line 90
    if-lt v0, v7, :cond_1

    .line 91
    .line 92
    sget-object v0, La/os40;->a:La/os40;

    .line 93
    .line 94
    invoke-virtual {v0, p0, v6}, La/os40;->a(Landroid/view/MotionEvent;I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_1
    move v0, v2

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    :goto_2
    move v0, v3

    .line 104
    :goto_3
    if-nez v0, :cond_3

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    return v0
.end method

.method private final setAttached(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p:La/pz40;

    .line 6
    .line 7
    check-cast p0, La/hgk0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private setDensity(La/w6k;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private setLayoutDirection(La/k6z;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final set_composeViewContext(La/skd;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/ViewStructure;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v2, v0, La/jw2;->b:La/wai0;

    .line 9
    .line 10
    iget-object v2, v2, La/wai0;->a:La/e7z;

    .line 11
    .line 12
    iget-object v3, v0, La/jw2;->g:Landroid/view/autofill/AutofillId;

    .line 13
    .line 14
    iget-object v4, v0, La/jw2;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, v0, La/jw2;->d:La/oge0;

    .line 17
    .line 18
    invoke-static {p1, v2, v3, v4, v5}, La/wdx;->c0(Landroid/view/ViewStructure;La/e7z;Landroid/view/autofill/AutofillId;Ljava/lang/String;La/oge0;)V

    .line 19
    .line 20
    .line 21
    sget-object v3, La/w960;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v3, La/vy40;

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v6}, La/vy40;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v2}, La/vy40;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, p1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, La/vy40;->j()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    iget v2, v3, La/vy40;->b:I

    .line 42
    .line 43
    sub-int/2addr v2, v1

    .line 44
    invoke-virtual {v3, v2}, La/vy40;->l(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    check-cast v2, Landroid/view/ViewStructure;

    .line 52
    .line 53
    iget v6, v3, La/vy40;->b:I

    .line 54
    .line 55
    sub-int/2addr v6, v1

    .line 56
    invoke-virtual {v3, v6}, La/vy40;->l(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v6, La/e7z;

    .line 64
    .line 65
    invoke-virtual {v6}, La/e7z;->o()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, La/ty40;

    .line 70
    .line 71
    iget-object v7, v6, La/ty40;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v7, La/xz40;

    .line 74
    .line 75
    iget v7, v7, La/xz40;->c:I

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    :goto_0
    if-ge v8, v7, :cond_0

    .line 79
    .line 80
    invoke-virtual {v6, v8}, La/ty40;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    check-cast v9, La/e7z;

    .line 85
    .line 86
    iget-boolean v10, v9, La/e7z;->s1:Z

    .line 87
    .line 88
    if-nez v10, :cond_4

    .line 89
    .line 90
    invoke-virtual {v9}, La/e7z;->I()Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-eqz v10, :cond_4

    .line 95
    .line 96
    invoke-virtual {v9}, La/e7z;->J()Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-nez v10, :cond_1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {v9}, La/e7z;->x()La/nai0;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    if-eqz v10, :cond_3

    .line 108
    .line 109
    iget-object v10, v10, La/nai0;->a:La/hz40;

    .line 110
    .line 111
    sget-object v11, La/mai0;->g:La/zai0;

    .line 112
    .line 113
    invoke-virtual {v10, v11}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-nez v11, :cond_2

    .line 118
    .line 119
    sget-object v11, La/mai0;->h:La/zai0;

    .line 120
    .line 121
    invoke-virtual {v10, v11}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-nez v11, :cond_2

    .line 126
    .line 127
    sget-object v11, La/xai0;->r:La/zai0;

    .line 128
    .line 129
    invoke-virtual {v10, v11}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-nez v11, :cond_2

    .line 134
    .line 135
    sget-object v11, La/xai0;->s:La/zai0;

    .line 136
    .line 137
    invoke-virtual {v10, v11}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_2

    .line 142
    .line 143
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 144
    .line 145
    const/16 v12, 0x22

    .line 146
    .line 147
    if-lt v11, v12, :cond_3

    .line 148
    .line 149
    sget-object v11, La/epv0;->n:La/zai0;

    .line 150
    .line 151
    invoke-virtual {v10, v11}, La/hz40;->b(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-eqz v10, :cond_3

    .line 156
    .line 157
    :cond_2
    invoke-virtual {v2, v1}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    invoke-virtual {v2, v10}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    iget-object v11, v0, La/jw2;->g:Landroid/view/autofill/AutofillId;

    .line 166
    .line 167
    invoke-static {v10, v9, v11, v4, v5}, La/wdx;->c0(Landroid/view/ViewStructure;La/e7z;Landroid/view/autofill/AutofillId;Ljava/lang/String;La/oge0;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v9}, La/vy40;->a(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v10}, La/vy40;->a(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {v3, v9}, La/vy40;->a(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v2}, La/vy40;->a(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_4
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofill()La/iw2;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-eqz p0, :cond_9

    .line 191
    .line 192
    iget-object v0, p0, La/iw2;->b:La/w55;

    .line 193
    .line 194
    iget-object v2, v0, La/w55;->a:Ljava/util/LinkedHashMap;

    .line 195
    .line 196
    iget-object v0, v0, La/w55;->a:Ljava/util/LinkedHashMap;

    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_6

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_6
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->addChildCount(I)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-nez v3, :cond_7

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Ljava/util/Map$Entry;

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-eqz v0, :cond_8

    .line 249
    .line 250
    invoke-static {}, La/hny;->b()V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_8
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    iget-object v0, p0, La/iw2;->c:Landroid/view/autofill/AutofillId;

    .line 259
    .line 260
    invoke-static {p1, v0, v3}, La/y24;->m(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 261
    .line 262
    .line 263
    iget-object p0, p0, La/iw2;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 264
    .line 265
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    const/4 v0, 0x0

    .line 274
    invoke-virtual {p1, v3, p0, v0, v0}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-static {p1, v1}, La/y24;->l(Landroid/view/ViewStructure;I)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_9
    :goto_2
    return-void
.end method

.method public final B()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B1:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->D()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v1, p0

    .line 25
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v1, v0

    .line 30
    check-cast v1, Landroid/view/View;

    .line 31
    .line 32
    move-object v0, v1

    .line 33
    check-cast v0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v1:[I

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    aget v3, v0, v2

    .line 47
    .line 48
    int-to-float v3, v3

    .line 49
    const/4 v4, 0x1

    .line 50
    aget v5, v0, v4

    .line 51
    .line 52
    int-to-float v5, v5

    .line 53
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 54
    .line 55
    .line 56
    aget v1, v0, v2

    .line 57
    .line 58
    int-to-float v1, v1

    .line 59
    aget v0, v0, v4

    .line 60
    .line 61
    int-to-float v0, v0

    .line 62
    sub-float/2addr v3, v1

    .line 63
    sub-float/2addr v5, v0

    .line 64
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-long v0, v0

    .line 69
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    int-to-long v2, v2

    .line 74
    const/16 v4, 0x20

    .line 75
    .line 76
    shl-long/2addr v0, v4

    .line 77
    const-wide v4, 0xffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    and-long/2addr v2, v4

    .line 83
    or-long/2addr v0, v2

    .line 84
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 85
    .line 86
    :cond_1
    return-void
.end method

.method public final C(Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->D()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-long v2, v0

    .line 23
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v0, v0

    .line 28
    const/16 v4, 0x20

    .line 29
    .line 30
    shl-long/2addr v2, v4

    .line 31
    const-wide v5, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v0, v5

    .line 37
    or-long/2addr v0, v2

    .line 38
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/ui30;->b(J[F)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    shr-long v7, v0, v4

    .line 49
    .line 50
    long-to-int v3, v7

    .line 51
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-float/2addr v2, v3

    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    and-long/2addr v0, v5

    .line 61
    long-to-int v0, v0

    .line 62
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sub-float/2addr p1, v0

    .line 67
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v0, v0

    .line 72
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    int-to-long v2, p1

    .line 77
    shl-long/2addr v0, v4

    .line 78
    and-long/2addr v2, v5

    .line 79
    or-long/2addr v0, v2

    .line 80
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 81
    .line 82
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v1:[I

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, La/jk9;->a:La/jk9;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x1:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v0, p0, v2, v1, v3}, La/jk9;->a(Landroid/view/View;[FLandroid/graphics/Matrix;[I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v2}, La/ui30;->d([F)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w1:[F

    .line 23
    .line 24
    invoke-static {p0, v2, v0, v3}, La/ro4;->l0(Landroid/view/View;[F[F[I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z1:[F

    .line 28
    .line 29
    invoke-static {v2, p0}, La/d7x;->C([F[F)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final E()Z
    .locals 2

    .line 1
    sget-boolean v0, La/ebc;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/16 v0, 0x82

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-super {p0, v0, v1}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public final F(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i:La/xw3;

    .line 2
    .line 3
    invoke-virtual {v0}, La/xw3;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, p1}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j:La/gx2;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "schedule is called when outOfFrameExecutor is not available (view is detached)"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final G(La/e7z;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, La/e7z;->s()La/c7z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, La/c7z;->a:La/c7z;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s1:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, La/e7z;->h1:La/tzi;

    .line 36
    .line 37
    iget-object v0, v0, La/tzi;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/rdx;

    .line 40
    .line 41
    iget-wide v0, v0, La/pu90;->d:J

    .line 42
    .line 43
    invoke-static {v0, v1}, La/p4e;->g(J)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-static {v0, v1}, La/p4e;->f(J)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 89
    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public final H(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    shr-long v1, p1, v0

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 14
    .line 15
    shr-long/2addr v2, v0

    .line 16
    long-to-int v2, v2

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float/2addr v1, v2

    .line 22
    const-wide v2, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p1, v2

    .line 28
    long-to-int p1, p1

    .line 29
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-wide v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 34
    .line 35
    and-long/2addr v4, v2

    .line 36
    long-to-int p2, v4

    .line 37
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-float/2addr p1, p2

    .line 42
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    int-to-long v4, p2

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-long p1, p1

    .line 52
    shl-long v0, v4, v0

    .line 53
    .line 54
    and-long/2addr p1, v2

    .line 55
    or-long/2addr p1, v0

    .line 56
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z1:[F

    .line 57
    .line 58
    invoke-static {p1, p2, p0}, La/ui30;->b(J[F)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0
.end method

.method public final I(Landroid/view/MotionEvent;)I
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d2:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d2:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/skd;->t:La/yez;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sget-object v2, La/shv0;->a:La/pz40;

    .line 19
    .line 20
    new-instance v3, La/kpa0;

    .line 21
    .line 22
    invoke-direct {v3, v0}, La/kpa0;-><init>(I)V

    .line 23
    .line 24
    .line 25
    check-cast v2, La/hgk0;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:La/ns40;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p0}, La/ns40;->c(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)La/zn00;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i1:La/td9;

    .line 41
    .line 42
    if-eqz v2, :cond_9

    .line 43
    .line 44
    iget-object v1, v2, La/zn00;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    add-int/lit8 v5, v5, -0x1

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x5

    .line 56
    if-ltz v5, :cond_3

    .line 57
    .line 58
    :goto_0
    add-int/lit8 v8, v5, -0x1

    .line 59
    .line 60
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    move-object v9, v5

    .line 65
    check-cast v9, La/fpa0;

    .line 66
    .line 67
    iget-boolean v9, v9, La/fpa0;->e:Z

    .line 68
    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    if-ne v3, v7, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    if-gez v8, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move v5, v8

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    :goto_1
    move-object v5, v6

    .line 82
    :cond_4
    :goto_2
    check-cast v5, La/fpa0;

    .line 83
    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    iget-wide v8, v5, La/fpa0;->d:J

    .line 87
    .line 88
    iput-wide v8, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    .line 89
    .line 90
    :cond_5
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->o(Landroid/view/MotionEvent;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {v4, v2, p0, v1}, La/td9;->f(La/zn00;Landroidx/compose/ui/platform/AndroidComposeView;Z)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    iput-object v6, v2, La/zn00;->b:Ljava/lang/Object;

    .line 99
    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    if-ne v3, v7, :cond_7

    .line 103
    .line 104
    :cond_6
    and-int/lit8 v1, p0, 0x1

    .line 105
    .line 106
    if-eqz v1, :cond_8

    .line 107
    .line 108
    :cond_7
    return p0

    .line 109
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iget-object v1, v0, La/ns40;->c:Landroid/util/SparseBooleanArray;

    .line 118
    .line 119
    invoke-virtual {v1, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v0, La/ns40;->b:Landroid/util/SparseLongArray;

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    .line 125
    .line 126
    .line 127
    return p0

    .line 128
    :cond_9
    iget-boolean p0, v4, La/td9;->a:Z

    .line 129
    .line 130
    if-nez p0, :cond_a

    .line 131
    .line 132
    iget-object p0, v4, La/td9;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, La/pv00;

    .line 135
    .line 136
    iget-object p0, p0, La/pv00;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, La/u710;

    .line 139
    .line 140
    invoke-virtual {p0}, La/u710;->a()V

    .line 141
    .line 142
    .line 143
    iget-object p0, v4, La/td9;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, La/oaw;

    .line 146
    .line 147
    invoke-virtual {p0}, La/oaw;->c()V

    .line 148
    .line 149
    .line 150
    :cond_a
    return v1
.end method

.method public final J(Landroid/view/MotionEvent;IJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eq v2, v6, :cond_1

    .line 14
    .line 15
    const/4 v7, 0x6

    .line 16
    if-eq v2, v7, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/16 v2, 0x9

    .line 25
    .line 26
    if-eq v5, v2, :cond_2

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    if-eq v5, v2, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ltz v3, :cond_3

    .line 38
    .line 39
    move v7, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/4 v7, 0x0

    .line 42
    :goto_1
    sub-int/2addr v2, v7

    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    new-array v7, v2, [Landroid/view/MotionEvent$PointerProperties;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    :goto_2
    if-ge v8, v2, :cond_5

    .line 50
    .line 51
    new-instance v9, Landroid/view/MotionEvent$PointerProperties;

    .line 52
    .line 53
    invoke-direct {v9}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 54
    .line 55
    .line 56
    aput-object v9, v7, v8

    .line 57
    .line 58
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    new-array v8, v2, [Landroid/view/MotionEvent$PointerCoords;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    :goto_3
    if-ge v9, v2, :cond_6

    .line 65
    .line 66
    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    .line 67
    .line 68
    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 69
    .line 70
    .line 71
    aput-object v10, v8, v9

    .line 72
    .line 73
    add-int/lit8 v9, v9, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    const/4 v9, 0x0

    .line 77
    :goto_4
    if-ge v9, v2, :cond_8

    .line 78
    .line 79
    if-ltz v3, :cond_7

    .line 80
    .line 81
    if-gt v3, v9, :cond_7

    .line 82
    .line 83
    move v10, v6

    .line 84
    goto :goto_5

    .line 85
    :cond_7
    const/4 v10, 0x0

    .line 86
    :goto_5
    add-int/2addr v10, v9

    .line 87
    aget-object v11, v7, v9

    .line 88
    .line 89
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 90
    .line 91
    .line 92
    aget-object v11, v8, v9

    .line 93
    .line 94
    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 95
    .line 96
    .line 97
    iget v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 98
    .line 99
    iget v12, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 100
    .line 101
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    int-to-long v13, v10

    .line 106
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    int-to-long v4, v10

    .line 111
    const/16 v10, 0x20

    .line 112
    .line 113
    shl-long/2addr v13, v10

    .line 114
    const-wide v15, 0xffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    and-long/2addr v4, v15

    .line 120
    or-long/2addr v4, v13

    .line 121
    invoke-virtual {v0, v4, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->r(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v4

    .line 125
    shr-long v13, v4, v10

    .line 126
    .line 127
    long-to-int v10, v13

    .line 128
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 133
    .line 134
    and-long/2addr v4, v15

    .line 135
    long-to-int v4, v4

    .line 136
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    iput v4, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 141
    .line 142
    add-int/lit8 v9, v9, 0x1

    .line 143
    .line 144
    move/from16 v5, p2

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_8
    if-eqz p5, :cond_9

    .line 148
    .line 149
    const/4 v10, 0x0

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    move v10, v4

    .line 156
    :goto_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 161
    .line 162
    .line 163
    move-result-wide v11

    .line 164
    cmp-long v3, v3, v11

    .line 165
    .line 166
    if-nez v3, :cond_a

    .line 167
    .line 168
    move-wide/from16 v3, p3

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 172
    .line 173
    .line 174
    move-result-wide v3

    .line 175
    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getXPrecision()F

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getYPrecision()F

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    .line 192
    .line 193
    .line 194
    move-result v14

    .line 195
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getFlags()I

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    move/from16 v5, p2

    .line 204
    .line 205
    move v6, v2

    .line 206
    move-wide v1, v3

    .line 207
    move-wide/from16 v3, p3

    .line 208
    .line 209
    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:La/ns40;

    .line 214
    .line 215
    invoke-virtual {v2, v1, v0}, La/ns40;->c(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)La/zn00;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->i1:La/td9;

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    invoke-virtual {v3, v2, v0, v4}, La/td9;->f(La/zn00;Landroidx/compose/ui/platform/AndroidComposeView;Z)I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final K(Lkotlin/jvm/functions/Function2;La/zje;)V
    .locals 8

    .line 1
    instance-of v0, p2, La/ox2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ox2;

    .line 7
    .line 8
    iget v1, v0, La/ox2;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ox2;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ox2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ox2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ox2;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ox2;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v6, La/ax2;

    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-direct {v6, p0, p2}, La/ax2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 53
    .line 54
    .line 55
    iput v3, v0, La/ox2;->k:I

    .line 56
    .line 57
    new-instance v2, La/pnd0;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    const/16 v3, 0xb

    .line 61
    .line 62
    iget-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G1:Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    .line 64
    move-object v7, p1

    .line 65
    invoke-direct/range {v2 .. v7}, La/pnd0;-><init>(BLa/yje;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v2}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v1, :cond_3

    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    :goto_1
    invoke-static {}, La/csj;->b()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final L(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getConfiguration()Landroid/content/res/Configuration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    new-instance v1, Landroid/content/res/Configuration;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->setConfiguration(Landroid/content/res/Configuration;)V

    .line 17
    .line 18
    .line 19
    iget v1, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 20
    .line 21
    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 22
    .line 23
    cmpg-float v1, v1, v2

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget v0, v0, Landroid/content/res/Configuration;->densityDpi:I

    .line 28
    .line 29
    iget p1, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 30
    .line 31
    if-eq v0, p1, :cond_1

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, La/q8a;->e(Landroid/content/Context;)La/a7k;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setDensity(La/w6k;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final M()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->v1:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6
    .line 7
    .line 8
    iget-wide v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->u1:J

    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    shr-long v5, v2, v4

    .line 13
    .line 14
    long-to-int v5, v5

    .line 15
    const-wide v6, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v2, v6

    .line 21
    long-to-int v2, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    aget v8, v1, v3

    .line 24
    .line 25
    const/4 v9, 0x1

    .line 26
    if-ne v5, v8, :cond_0

    .line 27
    .line 28
    aget v10, v1, v9

    .line 29
    .line 30
    if-ne v2, v10, :cond_0

    .line 31
    .line 32
    iget-wide v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 33
    .line 34
    const-wide/16 v12, 0x0

    .line 35
    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-gez v10, :cond_2

    .line 39
    .line 40
    :cond_0
    aget v1, v1, v9

    .line 41
    .line 42
    int-to-long v10, v8

    .line 43
    shl-long/2addr v10, v4

    .line 44
    int-to-long v12, v1

    .line 45
    and-long/2addr v6, v12

    .line 46
    or-long/2addr v6, v10

    .line 47
    iput-wide v6, v0, Landroidx/compose/ui/platform/AndroidComposeView;->u1:J

    .line 48
    .line 49
    const v1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v5, v1, :cond_2

    .line 53
    .line 54
    if-eq v2, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, La/e7z;->A()La/xz40;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, v1, La/xz40;->a:[Ljava/lang/Object;

    .line 65
    .line 66
    iget v1, v1, La/xz40;->c:I

    .line 67
    .line 68
    move v4, v3

    .line 69
    :goto_0
    if-ge v4, v1, :cond_1

    .line 70
    .line 71
    aget-object v5, v2, v4

    .line 72
    .line 73
    check-cast v5, La/e7z;

    .line 74
    .line 75
    iget-object v5, v5, La/e7z;->i1:La/i7z;

    .line 76
    .line 77
    iget-object v5, v5, La/i7z;->p:La/sj30;

    .line 78
    .line 79
    invoke-virtual {v5}, La/sj30;->N0()V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v1, v9

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v1, v3

    .line 88
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()V

    .line 89
    .line 90
    .line 91
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->h2:Landroid/view/View;

    .line 92
    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iput-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->h2:Landroid/view/View;

    .line 100
    .line 101
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-wide v11, v0, Landroidx/compose/ui/platform/AndroidComposeView;->u1:J

    .line 106
    .line 107
    iget-wide v5, v0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 108
    .line 109
    invoke-static {v5, v6}, La/x1x;->J(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v13

    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v16

    .line 117
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v17

    .line 121
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 125
    .line 126
    array-length v5, v2

    .line 127
    const/16 v6, 0x10

    .line 128
    .line 129
    const/4 v7, 0x2

    .line 130
    if-ge v5, v6, :cond_4

    .line 131
    .line 132
    move v5, v3

    .line 133
    goto/16 :goto_f

    .line 134
    .line 135
    :cond_4
    aget v5, v2, v3

    .line 136
    .line 137
    const/high16 v6, 0x3f800000    # 1.0f

    .line 138
    .line 139
    cmpg-float v5, v5, v6

    .line 140
    .line 141
    if-nez v5, :cond_5

    .line 142
    .line 143
    move v5, v9

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    move v5, v3

    .line 146
    :goto_2
    aget v8, v2, v9

    .line 147
    .line 148
    const/4 v10, 0x0

    .line 149
    cmpg-float v8, v8, v10

    .line 150
    .line 151
    if-nez v8, :cond_6

    .line 152
    .line 153
    move v8, v9

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move v8, v3

    .line 156
    :goto_3
    and-int/2addr v5, v8

    .line 157
    aget v8, v2, v7

    .line 158
    .line 159
    cmpg-float v8, v8, v10

    .line 160
    .line 161
    if-nez v8, :cond_7

    .line 162
    .line 163
    move v8, v9

    .line 164
    goto :goto_4

    .line 165
    :cond_7
    move v8, v3

    .line 166
    :goto_4
    and-int/2addr v5, v8

    .line 167
    const/4 v8, 0x4

    .line 168
    aget v8, v2, v8

    .line 169
    .line 170
    cmpg-float v8, v8, v10

    .line 171
    .line 172
    if-nez v8, :cond_8

    .line 173
    .line 174
    move v8, v9

    .line 175
    goto :goto_5

    .line 176
    :cond_8
    move v8, v3

    .line 177
    :goto_5
    and-int/2addr v5, v8

    .line 178
    const/4 v8, 0x5

    .line 179
    aget v8, v2, v8

    .line 180
    .line 181
    cmpg-float v8, v8, v6

    .line 182
    .line 183
    if-nez v8, :cond_9

    .line 184
    .line 185
    move v8, v9

    .line 186
    goto :goto_6

    .line 187
    :cond_9
    move v8, v3

    .line 188
    :goto_6
    and-int/2addr v5, v8

    .line 189
    const/4 v8, 0x6

    .line 190
    aget v8, v2, v8

    .line 191
    .line 192
    cmpg-float v8, v8, v10

    .line 193
    .line 194
    if-nez v8, :cond_a

    .line 195
    .line 196
    move v8, v9

    .line 197
    goto :goto_7

    .line 198
    :cond_a
    move v8, v3

    .line 199
    :goto_7
    and-int/2addr v5, v8

    .line 200
    const/16 v8, 0x8

    .line 201
    .line 202
    aget v8, v2, v8

    .line 203
    .line 204
    cmpg-float v8, v8, v10

    .line 205
    .line 206
    if-nez v8, :cond_b

    .line 207
    .line 208
    move v8, v9

    .line 209
    goto :goto_8

    .line 210
    :cond_b
    move v8, v3

    .line 211
    :goto_8
    and-int/2addr v5, v8

    .line 212
    const/16 v8, 0x9

    .line 213
    .line 214
    aget v8, v2, v8

    .line 215
    .line 216
    cmpg-float v8, v8, v10

    .line 217
    .line 218
    if-nez v8, :cond_c

    .line 219
    .line 220
    move v8, v9

    .line 221
    goto :goto_9

    .line 222
    :cond_c
    move v8, v3

    .line 223
    :goto_9
    and-int/2addr v5, v8

    .line 224
    const/16 v8, 0xa

    .line 225
    .line 226
    aget v8, v2, v8

    .line 227
    .line 228
    cmpg-float v8, v8, v6

    .line 229
    .line 230
    if-nez v8, :cond_d

    .line 231
    .line 232
    move v8, v9

    .line 233
    goto :goto_a

    .line 234
    :cond_d
    move v8, v3

    .line 235
    :goto_a
    and-int/2addr v5, v8

    .line 236
    const/16 v8, 0xc

    .line 237
    .line 238
    aget v8, v2, v8

    .line 239
    .line 240
    cmpg-float v8, v8, v10

    .line 241
    .line 242
    if-nez v8, :cond_e

    .line 243
    .line 244
    move v8, v9

    .line 245
    goto :goto_b

    .line 246
    :cond_e
    move v8, v3

    .line 247
    :goto_b
    const/16 v15, 0xd

    .line 248
    .line 249
    aget v15, v2, v15

    .line 250
    .line 251
    cmpg-float v15, v15, v10

    .line 252
    .line 253
    if-nez v15, :cond_f

    .line 254
    .line 255
    move v15, v9

    .line 256
    goto :goto_c

    .line 257
    :cond_f
    move v15, v3

    .line 258
    :goto_c
    and-int/2addr v8, v15

    .line 259
    const/16 v15, 0xe

    .line 260
    .line 261
    aget v15, v2, v15

    .line 262
    .line 263
    cmpg-float v10, v15, v10

    .line 264
    .line 265
    if-nez v10, :cond_10

    .line 266
    .line 267
    move v10, v9

    .line 268
    goto :goto_d

    .line 269
    :cond_10
    move v10, v3

    .line 270
    :goto_d
    and-int/2addr v8, v10

    .line 271
    const/16 v10, 0xf

    .line 272
    .line 273
    aget v10, v2, v10

    .line 274
    .line 275
    cmpg-float v6, v10, v6

    .line 276
    .line 277
    if-nez v6, :cond_11

    .line 278
    .line 279
    move v6, v9

    .line 280
    goto :goto_e

    .line 281
    :cond_11
    move v6, v3

    .line 282
    :goto_e
    and-int/2addr v6, v8

    .line 283
    shl-int/2addr v5, v9

    .line 284
    or-int/2addr v5, v6

    .line 285
    :goto_f
    iget-object v10, v4, La/oge0;->d:La/vn00;

    .line 286
    .line 287
    and-int/2addr v5, v7

    .line 288
    if-nez v5, :cond_12

    .line 289
    .line 290
    :goto_10
    move-object v15, v2

    .line 291
    goto :goto_11

    .line 292
    :cond_12
    const/4 v2, 0x0

    .line 293
    goto :goto_10

    .line 294
    :goto_11
    invoke-virtual/range {v10 .. v17}, La/vn00;->b(JJ[FII)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-nez v2, :cond_13

    .line 299
    .line 300
    iget-boolean v2, v4, La/oge0;->g:Z

    .line 301
    .line 302
    if-eqz v2, :cond_14

    .line 303
    .line 304
    :cond_13
    move v3, v9

    .line 305
    :cond_14
    iput-boolean v3, v4, La/oge0;->g:Z

    .line 306
    .line 307
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 308
    .line 309
    invoke-virtual {v2, v1}, La/h7k;->e(Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v0}, La/oge0;->a()V

    .line 317
    .line 318
    .line 319
    return-void
.end method

.method public final N(F)V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v1, p1, v0

    .line 9
    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    if-lez v0, :cond_3

    .line 25
    .line 26
    :cond_0
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    cmpg-float v0, p1, v0

    .line 30
    .line 31
    if-gez v0, :cond_3

    .line 32
    .line 33
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 42
    .line 43
    cmpg-float v0, p1, v0

    .line 44
    .line 45
    if-gez v0, :cond_3

    .line 46
    .line 47
    :cond_2
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 48
    .line 49
    :cond_3
    return-void
.end method

.method public final a(La/nqq;La/nqq;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_1e

    .line 2
    .line 3
    move-object p0, p1

    .line 4
    check-cast p0, La/lm40;

    .line 5
    .line 6
    iget-object v0, p0, La/lm40;->a:La/lm40;

    .line 7
    .line 8
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p0, p0, La/lm40;->a:La/lm40;

    .line 18
    .line 19
    invoke-static {p1}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    move-object v2, v0

    .line 25
    :goto_0
    const/16 v3, 0x10

    .line 26
    .line 27
    const/high16 v4, 0x200000

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    if-eqz p1, :cond_c

    .line 32
    .line 33
    iget-object v7, p1, La/e7z;->h1:La/tzi;

    .line 34
    .line 35
    iget-object v7, v7, La/tzi;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, La/lm40;

    .line 38
    .line 39
    iget v7, v7, La/lm40;->d:I

    .line 40
    .line 41
    and-int/2addr v7, v4

    .line 42
    if-eqz v7, :cond_a

    .line 43
    .line 44
    :goto_1
    if-eqz p0, :cond_a

    .line 45
    .line 46
    iget v7, p0, La/lm40;->c:I

    .line 47
    .line 48
    and-int/2addr v7, v4

    .line 49
    if-eqz v7, :cond_9

    .line 50
    .line 51
    move-object v7, p0

    .line 52
    move-object v8, v0

    .line 53
    :goto_2
    if-eqz v7, :cond_9

    .line 54
    .line 55
    instance-of v9, v7, La/h7x;

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move v9, v5

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move v9, v6

    .line 72
    :goto_3
    if-eqz v9, :cond_8

    .line 73
    .line 74
    iget v9, v7, La/lm40;->c:I

    .line 75
    .line 76
    and-int/2addr v9, v4

    .line 77
    if-eqz v9, :cond_8

    .line 78
    .line 79
    instance-of v9, v7, La/f3k;

    .line 80
    .line 81
    if-eqz v9, :cond_8

    .line 82
    .line 83
    move-object v9, v7

    .line 84
    check-cast v9, La/f3k;

    .line 85
    .line 86
    iget-object v9, v9, La/f3k;->p:La/lm40;

    .line 87
    .line 88
    move v10, v5

    .line 89
    :goto_4
    if-eqz v9, :cond_7

    .line 90
    .line 91
    iget v11, v9, La/lm40;->c:I

    .line 92
    .line 93
    and-int/2addr v11, v4

    .line 94
    if-eqz v11, :cond_6

    .line 95
    .line 96
    add-int/lit8 v10, v10, 0x1

    .line 97
    .line 98
    if-ne v10, v6, :cond_3

    .line 99
    .line 100
    move-object v7, v9

    .line 101
    goto :goto_5

    .line 102
    :cond_3
    if-nez v8, :cond_4

    .line 103
    .line 104
    new-instance v8, La/xz40;

    .line 105
    .line 106
    new-array v11, v3, [La/lm40;

    .line 107
    .line 108
    invoke-direct {v8, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    if-eqz v7, :cond_5

    .line 112
    .line 113
    invoke-virtual {v8, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v7, v0

    .line 117
    :cond_5
    invoke-virtual {v8, v9}, La/xz40;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    :goto_5
    iget-object v9, v9, La/lm40;->f:La/lm40;

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    if-ne v10, v6, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    goto :goto_2

    .line 131
    :cond_9
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_a
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_b

    .line 139
    .line 140
    iget-object p0, p1, La/e7z;->h1:La/tzi;

    .line 141
    .line 142
    if-eqz p0, :cond_b

    .line 143
    .line 144
    iget-object p0, p0, La/tzi;->f:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, La/wso0;

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_b
    move-object p0, v0

    .line 150
    goto :goto_0

    .line 151
    :cond_c
    if-nez v2, :cond_d

    .line 152
    .line 153
    goto/16 :goto_e

    .line 154
    .line 155
    :cond_d
    if-eqz p2, :cond_1b

    .line 156
    .line 157
    iget-object p0, p2, La/lm40;->a:La/lm40;

    .line 158
    .line 159
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 160
    .line 161
    if-nez p0, :cond_e

    .line 162
    .line 163
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_e
    iget-object p0, p2, La/lm40;->a:La/lm40;

    .line 167
    .line 168
    invoke-static {p2}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    move-object p2, v0

    .line 173
    :goto_6
    if-eqz p1, :cond_1a

    .line 174
    .line 175
    iget-object v1, p1, La/e7z;->h1:La/tzi;

    .line 176
    .line 177
    iget-object v1, v1, La/tzi;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, La/lm40;

    .line 180
    .line 181
    iget v1, v1, La/lm40;->d:I

    .line 182
    .line 183
    and-int/2addr v1, v4

    .line 184
    if-eqz v1, :cond_18

    .line 185
    .line 186
    :goto_7
    if-eqz p0, :cond_18

    .line 187
    .line 188
    iget v1, p0, La/lm40;->c:I

    .line 189
    .line 190
    and-int/2addr v1, v4

    .line 191
    if-eqz v1, :cond_17

    .line 192
    .line 193
    move-object v1, p0

    .line 194
    move-object v7, v0

    .line 195
    :goto_8
    if-eqz v1, :cond_17

    .line 196
    .line 197
    instance-of v8, v1, La/h7x;

    .line 198
    .line 199
    if-eqz v8, :cond_10

    .line 200
    .line 201
    if-nez p2, :cond_f

    .line 202
    .line 203
    sget-object p2, La/v1h0;->a:La/iz40;

    .line 204
    .line 205
    new-instance p2, La/iz40;

    .line 206
    .line 207
    invoke-direct {p2}, La/iz40;-><init>()V

    .line 208
    .line 209
    .line 210
    :cond_f
    invoke-virtual {p2, v1}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move v8, v5

    .line 214
    goto :goto_9

    .line 215
    :cond_10
    move v8, v6

    .line 216
    :goto_9
    if-eqz v8, :cond_16

    .line 217
    .line 218
    iget v8, v1, La/lm40;->c:I

    .line 219
    .line 220
    and-int/2addr v8, v4

    .line 221
    if-eqz v8, :cond_16

    .line 222
    .line 223
    instance-of v8, v1, La/f3k;

    .line 224
    .line 225
    if-eqz v8, :cond_16

    .line 226
    .line 227
    move-object v8, v1

    .line 228
    check-cast v8, La/f3k;

    .line 229
    .line 230
    iget-object v8, v8, La/f3k;->p:La/lm40;

    .line 231
    .line 232
    move v9, v5

    .line 233
    :goto_a
    if-eqz v8, :cond_15

    .line 234
    .line 235
    iget v10, v8, La/lm40;->c:I

    .line 236
    .line 237
    and-int/2addr v10, v4

    .line 238
    if-eqz v10, :cond_14

    .line 239
    .line 240
    add-int/lit8 v9, v9, 0x1

    .line 241
    .line 242
    if-ne v9, v6, :cond_11

    .line 243
    .line 244
    move-object v1, v8

    .line 245
    goto :goto_b

    .line 246
    :cond_11
    if-nez v7, :cond_12

    .line 247
    .line 248
    new-instance v7, La/xz40;

    .line 249
    .line 250
    new-array v10, v3, [La/lm40;

    .line 251
    .line 252
    invoke-direct {v7, v10}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_12
    if-eqz v1, :cond_13

    .line 256
    .line 257
    invoke-virtual {v7, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    move-object v1, v0

    .line 261
    :cond_13
    invoke-virtual {v7, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_14
    :goto_b
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_15
    if-ne v9, v6, :cond_16

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_16
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    goto :goto_8

    .line 275
    :cond_17
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_18
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_19

    .line 283
    .line 284
    iget-object p0, p1, La/e7z;->h1:La/tzi;

    .line 285
    .line 286
    if-eqz p0, :cond_19

    .line 287
    .line 288
    iget-object p0, p0, La/tzi;->f:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast p0, La/wso0;

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_19
    move-object p0, v0

    .line 294
    goto :goto_6

    .line 295
    :cond_1a
    move-object v0, p2

    .line 296
    :cond_1b
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    move p1, v5

    .line 301
    :goto_c
    if-ge p1, p0, :cond_1e

    .line 302
    .line 303
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    check-cast p2, La/h7x;

    .line 308
    .line 309
    if-eqz v0, :cond_1c

    .line 310
    .line 311
    invoke-virtual {v0, p2}, La/iz40;->c(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    goto :goto_d

    .line 316
    :cond_1c
    move v1, v5

    .line 317
    :goto_d
    if-nez v1, :cond_1d

    .line 318
    .line 319
    invoke-interface {p2}, La/h7x;->z0()V

    .line 320
    .line 321
    .line 322
    :cond_1d
    add-int/lit8 p1, p1, 0x1

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_1e
    :goto_e
    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 12

    .line 1
    sget-boolean v0, La/ebc;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1b

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/ypq;

    .line 10
    .line 11
    iget-object v0, v0, La/ypq;->c:La/nqq;

    .line 12
    .line 13
    iget-boolean v1, v0, La/lm40;->n:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_c

    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, La/lm40;->a:La/lm40;

    .line 20
    .line 21
    iget-boolean v1, v1, La/lm40;->n:Z

    .line 22
    .line 23
    const-string v2, "visitSubtreeIf called on an unattached node"

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v2}, La/xcx;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    new-instance v1, La/xz40;

    .line 31
    .line 32
    const/16 v3, 0x10

    .line 33
    .line 34
    new-array v4, v3, [La/lm40;

    .line 35
    .line 36
    invoke-direct {v1, v4}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, La/lm40;->a:La/lm40;

    .line 40
    .line 41
    iget-object v4, v0, La/lm40;->f:La/lm40;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-static {v1, v0}, La/vcc;->v(La/xz40;La/lm40;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v1, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget v0, v1, La/xz40;->c:I

    .line 53
    .line 54
    if-eqz v0, :cond_1a

    .line 55
    .line 56
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    invoke-virtual {v1, v0}, La/xz40;->k(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/lm40;

    .line 63
    .line 64
    iget v4, v0, La/lm40;->d:I

    .line 65
    .line 66
    and-int/lit16 v4, v4, 0x400

    .line 67
    .line 68
    if-eqz v4, :cond_19

    .line 69
    .line 70
    move-object v4, v0

    .line 71
    :goto_1
    if-eqz v4, :cond_19

    .line 72
    .line 73
    iget-boolean v5, v4, La/lm40;->n:Z

    .line 74
    .line 75
    if-eqz v5, :cond_19

    .line 76
    .line 77
    iget v5, v4, La/lm40;->c:I

    .line 78
    .line 79
    and-int/lit16 v5, v5, 0x400

    .line 80
    .line 81
    if-eqz v5, :cond_18

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    move-object v6, v4

    .line 85
    move-object v7, v5

    .line 86
    :goto_2
    if-eqz v6, :cond_18

    .line 87
    .line 88
    instance-of v8, v6, La/nqq;

    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x1

    .line 92
    if-eqz v8, :cond_11

    .line 93
    .line 94
    check-cast v6, La/nqq;

    .line 95
    .line 96
    iget-boolean v8, v6, La/lm40;->n:Z

    .line 97
    .line 98
    if-eqz v8, :cond_17

    .line 99
    .line 100
    invoke-virtual {v6}, La/nqq;->b1()La/aqq;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    iget-boolean v6, v6, La/aqq;->a:Z

    .line 105
    .line 106
    if-eqz v6, :cond_17

    .line 107
    .line 108
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, La/ypq;

    .line 116
    .line 117
    iget-object p2, p2, La/ypq;->c:La/nqq;

    .line 118
    .line 119
    iget-boolean p3, p2, La/lm40;->n:Z

    .line 120
    .line 121
    if-nez p3, :cond_3

    .line 122
    .line 123
    goto/16 :goto_9

    .line 124
    .line 125
    :cond_3
    iget-object p3, p2, La/lm40;->a:La/lm40;

    .line 126
    .line 127
    iget-boolean p3, p3, La/lm40;->n:Z

    .line 128
    .line 129
    if-nez p3, :cond_4

    .line 130
    .line 131
    invoke-static {v2}, La/xcx;->b(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    new-instance p3, La/xz40;

    .line 135
    .line 136
    new-array v0, v3, [La/lm40;

    .line 137
    .line 138
    invoke-direct {p3, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p2, La/lm40;->a:La/lm40;

    .line 142
    .line 143
    iget-object v0, p2, La/lm40;->f:La/lm40;

    .line 144
    .line 145
    if-nez v0, :cond_5

    .line 146
    .line 147
    invoke-static {p3, p2}, La/vcc;->v(La/xz40;La/lm40;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    invoke-virtual {p3, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_3
    iget p2, p3, La/xz40;->c:I

    .line 155
    .line 156
    if-eqz p2, :cond_10

    .line 157
    .line 158
    add-int/lit8 p2, p2, -0x1

    .line 159
    .line 160
    invoke-virtual {p3, p2}, La/xz40;->k(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    check-cast p2, La/lm40;

    .line 165
    .line 166
    iget v0, p2, La/lm40;->d:I

    .line 167
    .line 168
    and-int/lit16 v0, v0, 0x400

    .line 169
    .line 170
    if-eqz v0, :cond_f

    .line 171
    .line 172
    move-object v0, p2

    .line 173
    :goto_4
    if-eqz v0, :cond_f

    .line 174
    .line 175
    iget-boolean v1, v0, La/lm40;->n:Z

    .line 176
    .line 177
    if-eqz v1, :cond_f

    .line 178
    .line 179
    iget v1, v0, La/lm40;->c:I

    .line 180
    .line 181
    and-int/lit16 v1, v1, 0x400

    .line 182
    .line 183
    if-eqz v1, :cond_e

    .line 184
    .line 185
    move-object v1, v0

    .line 186
    move-object v2, v5

    .line 187
    :goto_5
    if-eqz v1, :cond_e

    .line 188
    .line 189
    instance-of v4, v1, La/nqq;

    .line 190
    .line 191
    if-eqz v4, :cond_7

    .line 192
    .line 193
    check-cast v1, La/nqq;

    .line 194
    .line 195
    iget-boolean v4, v1, La/lm40;->n:Z

    .line 196
    .line 197
    if-nez v4, :cond_6

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_6
    invoke-virtual {v1}, La/nqq;->b1()La/aqq;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    iget-boolean v6, v1, La/lm40;->n:Z

    .line 205
    .line 206
    if-eqz v6, :cond_d

    .line 207
    .line 208
    iget-boolean v1, v1, La/nqq;->o:Z

    .line 209
    .line 210
    if-nez v1, :cond_d

    .line 211
    .line 212
    iget-boolean v1, v4, La/aqq;->a:Z

    .line 213
    .line 214
    if-eqz v1, :cond_d

    .line 215
    .line 216
    goto/16 :goto_c

    .line 217
    .line 218
    :cond_7
    iget v4, v1, La/lm40;->c:I

    .line 219
    .line 220
    and-int/lit16 v4, v4, 0x400

    .line 221
    .line 222
    if-eqz v4, :cond_d

    .line 223
    .line 224
    instance-of v4, v1, La/f3k;

    .line 225
    .line 226
    if-eqz v4, :cond_d

    .line 227
    .line 228
    move-object v4, v1

    .line 229
    check-cast v4, La/f3k;

    .line 230
    .line 231
    iget-object v4, v4, La/f3k;->p:La/lm40;

    .line 232
    .line 233
    move v6, v9

    .line 234
    :goto_6
    if-eqz v4, :cond_c

    .line 235
    .line 236
    iget v7, v4, La/lm40;->c:I

    .line 237
    .line 238
    and-int/lit16 v7, v7, 0x400

    .line 239
    .line 240
    if-eqz v7, :cond_b

    .line 241
    .line 242
    add-int/lit8 v6, v6, 0x1

    .line 243
    .line 244
    if-ne v6, v10, :cond_8

    .line 245
    .line 246
    move-object v1, v4

    .line 247
    goto :goto_7

    .line 248
    :cond_8
    if-nez v2, :cond_9

    .line 249
    .line 250
    new-instance v2, La/xz40;

    .line 251
    .line 252
    new-array v7, v3, [La/lm40;

    .line 253
    .line 254
    invoke-direct {v2, v7}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_9
    if-eqz v1, :cond_a

    .line 258
    .line 259
    invoke-virtual {v2, v1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    move-object v1, v5

    .line 263
    :cond_a
    invoke-virtual {v2, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_b
    :goto_7
    iget-object v4, v4, La/lm40;->f:La/lm40;

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_c
    if-ne v6, v10, :cond_d

    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_d
    :goto_8
    invoke-static {v2}, La/vcc;->V(La/xz40;)La/lm40;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    goto :goto_5

    .line 277
    :cond_e
    iget-object v0, v0, La/lm40;->f:La/lm40;

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_f
    invoke-static {p3, p2}, La/vcc;->v(La/xz40;La/lm40;)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_3

    .line 284
    .line 285
    :cond_10
    :goto_9
    if-eqz p1, :cond_1a

    .line 286
    .line 287
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :cond_11
    iget v8, v6, La/lm40;->c:I

    .line 292
    .line 293
    and-int/lit16 v8, v8, 0x400

    .line 294
    .line 295
    if-eqz v8, :cond_17

    .line 296
    .line 297
    instance-of v8, v6, La/f3k;

    .line 298
    .line 299
    if-eqz v8, :cond_17

    .line 300
    .line 301
    move-object v8, v6

    .line 302
    check-cast v8, La/f3k;

    .line 303
    .line 304
    iget-object v8, v8, La/f3k;->p:La/lm40;

    .line 305
    .line 306
    :goto_a
    if-eqz v8, :cond_16

    .line 307
    .line 308
    iget v11, v8, La/lm40;->c:I

    .line 309
    .line 310
    and-int/lit16 v11, v11, 0x400

    .line 311
    .line 312
    if-eqz v11, :cond_15

    .line 313
    .line 314
    add-int/lit8 v9, v9, 0x1

    .line 315
    .line 316
    if-ne v9, v10, :cond_12

    .line 317
    .line 318
    move-object v6, v8

    .line 319
    goto :goto_b

    .line 320
    :cond_12
    if-nez v7, :cond_13

    .line 321
    .line 322
    new-instance v7, La/xz40;

    .line 323
    .line 324
    new-array v11, v3, [La/lm40;

    .line 325
    .line 326
    invoke-direct {v7, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_13
    if-eqz v6, :cond_14

    .line 330
    .line 331
    invoke-virtual {v7, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-object v6, v5

    .line 335
    :cond_14
    invoke-virtual {v7, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :cond_15
    :goto_b
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_16
    if-ne v9, v10, :cond_17

    .line 342
    .line 343
    goto/16 :goto_2

    .line 344
    .line 345
    :cond_17
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :cond_18
    iget-object v4, v4, La/lm40;->f:La/lm40;

    .line 352
    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :cond_19
    invoke-static {v1, v0}, La/vcc;->v(La/xz40;La/lm40;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_0

    .line 359
    .line 360
    :cond_1a
    :goto_c
    return-void

    .line 361
    :cond_1b
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 362
    .line 363
    .line 364
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 21
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 22
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 p2, 0x1

    const/4 p3, -0x1

    .line 23
    invoke-virtual {p0, p1, p3, v0, p2}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 25
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 10

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_4

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {p1, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v5}, La/y6;->i(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v0, La/jw2;->b:La/wai0;

    .line 34
    .line 35
    iget-object v6, v6, La/wai0;->c:La/gkx;

    .line 36
    .line 37
    invoke-virtual {v6, v4}, La/gkx;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, La/e7z;

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    invoke-virtual {v4}, La/e7z;->x()La/nai0;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    iget-object v4, v4, La/nai0;->a:La/hz40;

    .line 52
    .line 53
    sget-object v6, La/mai0;->g:La/zai0;

    .line 54
    .line 55
    invoke-virtual {v4, v6}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const/4 v7, 0x0

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    move-object v6, v7

    .line 63
    :cond_0
    check-cast v6, La/m6;

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    iget-object v6, v6, La/m6;->b:La/wdr;

    .line 68
    .line 69
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    new-instance v8, La/j83;

    .line 74
    .line 75
    invoke-static {v5}, La/y6;->j(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-direct {v8, v9}, La/j83;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v6, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_1
    sget-object v6, La/mai0;->h:La/zai0;

    .line 93
    .line 94
    invoke-virtual {v4, v6}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-nez v4, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move-object v7, v4

    .line 102
    :goto_1
    check-cast v7, La/m6;

    .line 103
    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    iget-object v4, v7, La/m6;->b:La/wdr;

    .line 107
    .line 108
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 109
    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    new-instance v6, La/ez2;

    .line 113
    .line 114
    invoke-direct {v6, v5}, La/ez2;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Ljava/lang/Boolean;

    .line 122
    .line 123
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofill()La/iw2;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-eqz p0, :cond_b

    .line 131
    .line 132
    iget-object p0, p0, La/iw2;->b:La/w55;

    .line 133
    .line 134
    iget-object v0, p0, La/w55;->a:Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    :goto_2
    if-ge v1, v0, :cond_b

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v3}, La/y6;->i(Ljava/lang/Object;)Landroid/view/autofill/AutofillValue;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v3}, La/y6;->z(Landroid/view/autofill/AutofillValue;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_7

    .line 166
    .line 167
    invoke-static {v3}, La/y6;->j(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    iget-object v3, p0, La/w55;->a:Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    if-nez v2, :cond_6

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    invoke-static {}, La/hny;->b()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_7
    invoke-static {v3}, La/y24;->A(Landroid/view/autofill/AutofillValue;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_a

    .line 196
    .line 197
    invoke-static {v3}, La/y24;->z(Landroid/view/autofill/AutofillValue;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_9

    .line 202
    .line 203
    invoke-static {v3}, La/y24;->w(Landroid/view/autofill/AutofillValue;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_8

    .line 208
    .line 209
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    new-instance p0, La/q660;

    .line 213
    .line 214
    const-string p1, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    .line 215
    .line 216
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p0

    .line 220
    :cond_9
    new-instance p0, La/q660;

    .line 221
    .line 222
    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    .line 223
    .line 224
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p0

    .line 228
    :cond_a
    new-instance p0, La/q660;

    .line 229
    .line 230
    const-string p1, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    .line 231
    .line 232
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p0

    .line 236
    :cond_b
    :goto_4
    return-void
.end method

.method public final b(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->Z:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->B:La/dy40;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/dy40;->d(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eq p0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->f1:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->Y:La/dy40;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/dy40;->d(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eq p0, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    .line 3
    .line 4
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v1, v2, v0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->m(IJZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final canScrollVertically(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b:J

    .line 3
    .line 4
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v1, v2, v0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->m(IJZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A:La/vy40;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->j(La/e7z;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->s(Z)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, La/rfk0;->m()V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f1:Z

    .line 28
    .line 29
    const-string v1, "AndroidOwner:draw"

    .line 30
    .line 31
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCanvasHolder()La/b6a;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, v1, La/b6a;->a:La/uw2;

    .line 39
    .line 40
    iget-object v3, v2, La/uw2;->a:Landroid/graphics/Canvas;

    .line 41
    .line 42
    iput-object p1, v2, La/uw2;->a:Landroid/graphics/Canvas;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v4, v2, v5}, La/e7z;->j(La/x5a;La/dfv;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, La/b6a;->a:La/uw2;

    .line 53
    .line 54
    iput-object v3, v1, La/uw2;->a:Landroid/graphics/Canvas;

    .line 55
    .line 56
    invoke-virtual {v0}, La/vy40;->j()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget v1, v0, La/vy40;->b:I

    .line 64
    .line 65
    move v3, v2

    .line 66
    :goto_0
    if-ge v3, v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0, v3}, La/vy40;->g(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, La/bg80;

    .line 73
    .line 74
    check-cast v4, La/gfv;

    .line 75
    .line 76
    invoke-virtual {v4}, La/gfv;->g()V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    sget v1, La/qhu0;->a:I

    .line 83
    .line 84
    invoke-virtual {v0}, La/vy40;->d()V

    .line 85
    .line 86
    .line 87
    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f1:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B:La/vy40;

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v1}, La/vy40;->b(La/vy40;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, La/vy40;->d()V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->m()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 109
    .line 110
    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U1:F

    .line 111
    .line 112
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 119
    .line 120
    iput v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U1:F

    .line 121
    .line 122
    invoke-static {p0, v0}, La/pa3;->a(Landroid/view/View;F)V

    .line 123
    .line 124
    .line 125
    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l:Landroid/view/View;

    .line 126
    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 130
    .line 131
    iget v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V1:F

    .line 132
    .line 133
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_4

    .line 138
    .line 139
    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 140
    .line 141
    iput v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V1:F

    .line 142
    .line 143
    invoke-static {v0, v1}, La/pa3;->a(Landroid/view/View;F)V

    .line 144
    .line 145
    .line 146
    :cond_4
    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 147
    .line 148
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 162
    .line 163
    .line 164
    :cond_5
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 165
    .line 166
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R1:F

    .line 167
    .line 168
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S1:F

    .line 169
    .line 170
    :cond_6
    return-void

    .line 171
    :catchall_0
    move-exception p0

    .line 172
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 173
    .line 174
    .line 175
    throw p0
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Y1:Z

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->X1:La/gx2;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ne v5, v3, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Y1:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, La/gx2;->run()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->n(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_92

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    goto/16 :goto_59

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-string v5, "visitAncestors called on an unattached node"

    .line 48
    .line 49
    const/4 v6, -0x1

    .line 50
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-ne v2, v3, :cond_35

    .line 54
    .line 55
    const/high16 v2, 0x400000

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_33

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/16 v3, 0x1a

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    if-lt v11, v3, :cond_3

    .line 83
    .line 84
    sget-object v10, La/xgu0;->a:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    invoke-static {v2}, La/ga3;->j(Landroid/view/ViewConfiguration;)F

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {v2, v10}, La/xgu0;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-lt v11, v3, :cond_4

    .line 98
    .line 99
    invoke-static {v2}, La/ga3;->i(Landroid/view/ViewConfiguration;)F

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-static {v2, v10}, La/xgu0;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, La/ypq;

    .line 117
    .line 118
    iget-object v3, v2, La/ypq;->d:La/tpq;

    .line 119
    .line 120
    iget-boolean v3, v3, La/tpq;->e:Z

    .line 121
    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    const-string v0, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 125
    .line 126
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 127
    .line 128
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return v4

    .line 132
    :cond_5
    iget-object v2, v2, La/ypq;->c:La/nqq;

    .line 133
    .line 134
    invoke-static {v2}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_12

    .line 139
    .line 140
    iget-object v3, v2, La/lm40;->a:La/lm40;

    .line 141
    .line 142
    iget-boolean v3, v3, La/lm40;->n:Z

    .line 143
    .line 144
    if-nez v3, :cond_6

    .line 145
    .line 146
    invoke-static {v5}, La/xcx;->b(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v3, v2, La/lm40;->a:La/lm40;

    .line 150
    .line 151
    invoke-static {v2}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :goto_3
    if-eqz v2, :cond_11

    .line 156
    .line 157
    iget-object v10, v2, La/e7z;->h1:La/tzi;

    .line 158
    .line 159
    iget-object v10, v10, La/tzi;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v10, La/lm40;

    .line 162
    .line 163
    iget v10, v10, La/lm40;->d:I

    .line 164
    .line 165
    and-int/lit16 v10, v10, 0x4000

    .line 166
    .line 167
    if-eqz v10, :cond_f

    .line 168
    .line 169
    :goto_4
    if-eqz v3, :cond_f

    .line 170
    .line 171
    iget v10, v3, La/lm40;->c:I

    .line 172
    .line 173
    and-int/lit16 v10, v10, 0x4000

    .line 174
    .line 175
    if-eqz v10, :cond_e

    .line 176
    .line 177
    move-object v10, v3

    .line 178
    const/4 v11, 0x0

    .line 179
    :goto_5
    if-eqz v10, :cond_e

    .line 180
    .line 181
    instance-of v12, v10, La/ix2;

    .line 182
    .line 183
    if-eqz v12, :cond_7

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_7
    iget v12, v10, La/lm40;->c:I

    .line 187
    .line 188
    and-int/lit16 v12, v12, 0x4000

    .line 189
    .line 190
    if-eqz v12, :cond_d

    .line 191
    .line 192
    instance-of v12, v10, La/f3k;

    .line 193
    .line 194
    if-eqz v12, :cond_d

    .line 195
    .line 196
    move-object v12, v10

    .line 197
    check-cast v12, La/f3k;

    .line 198
    .line 199
    iget-object v12, v12, La/f3k;->p:La/lm40;

    .line 200
    .line 201
    move v13, v4

    .line 202
    :goto_6
    if-eqz v12, :cond_c

    .line 203
    .line 204
    iget v14, v12, La/lm40;->c:I

    .line 205
    .line 206
    and-int/lit16 v14, v14, 0x4000

    .line 207
    .line 208
    if-eqz v14, :cond_b

    .line 209
    .line 210
    add-int/lit8 v13, v13, 0x1

    .line 211
    .line 212
    if-ne v13, v9, :cond_8

    .line 213
    .line 214
    move-object v10, v12

    .line 215
    goto :goto_7

    .line 216
    :cond_8
    if-nez v11, :cond_9

    .line 217
    .line 218
    new-instance v11, La/xz40;

    .line 219
    .line 220
    new-array v14, v8, [La/lm40;

    .line 221
    .line 222
    invoke-direct {v11, v14}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    if-eqz v10, :cond_a

    .line 226
    .line 227
    invoke-virtual {v11, v10}, La/xz40;->b(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    :cond_a
    invoke-virtual {v11, v12}, La/xz40;->b(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_b
    :goto_7
    iget-object v12, v12, La/lm40;->f:La/lm40;

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_c
    if-ne v13, v9, :cond_d

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_d
    invoke-static {v11}, La/vcc;->V(La/xz40;)La/lm40;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    goto :goto_5

    .line 245
    :cond_e
    iget-object v3, v3, La/lm40;->e:La/lm40;

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_f
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    if-eqz v2, :cond_10

    .line 253
    .line 254
    iget-object v3, v2, La/e7z;->h1:La/tzi;

    .line 255
    .line 256
    if-eqz v3, :cond_10

    .line 257
    .line 258
    iget-object v3, v3, La/tzi;->f:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v3, La/wso0;

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_10
    const/4 v3, 0x0

    .line 264
    goto :goto_3

    .line 265
    :cond_11
    const/4 v10, 0x0

    .line 266
    :goto_8
    check-cast v10, La/ix2;

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_12
    const/4 v10, 0x0

    .line 270
    :goto_9
    if-eqz v10, :cond_34

    .line 271
    .line 272
    iget-object v2, v10, La/lm40;->a:La/lm40;

    .line 273
    .line 274
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 275
    .line 276
    if-nez v2, :cond_13

    .line 277
    .line 278
    invoke-static {v5}, La/xcx;->b(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_13
    iget-object v2, v10, La/lm40;->a:La/lm40;

    .line 282
    .line 283
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 284
    .line 285
    invoke-static {v10}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    const/4 v5, 0x0

    .line 290
    :goto_a
    if-eqz v3, :cond_1f

    .line 291
    .line 292
    iget-object v11, v3, La/e7z;->h1:La/tzi;

    .line 293
    .line 294
    iget-object v11, v11, La/tzi;->g:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v11, La/lm40;

    .line 297
    .line 298
    iget v11, v11, La/lm40;->d:I

    .line 299
    .line 300
    and-int/lit16 v11, v11, 0x4000

    .line 301
    .line 302
    if-eqz v11, :cond_1d

    .line 303
    .line 304
    :goto_b
    if-eqz v2, :cond_1d

    .line 305
    .line 306
    iget v11, v2, La/lm40;->c:I

    .line 307
    .line 308
    and-int/lit16 v11, v11, 0x4000

    .line 309
    .line 310
    if-eqz v11, :cond_1c

    .line 311
    .line 312
    move-object v11, v2

    .line 313
    const/4 v12, 0x0

    .line 314
    :goto_c
    if-eqz v11, :cond_1c

    .line 315
    .line 316
    instance-of v13, v11, La/ix2;

    .line 317
    .line 318
    if-eqz v13, :cond_15

    .line 319
    .line 320
    if-nez v5, :cond_14

    .line 321
    .line 322
    new-instance v5, Ljava/util/ArrayList;

    .line 323
    .line 324
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 325
    .line 326
    .line 327
    :cond_14
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move v13, v4

    .line 331
    goto :goto_d

    .line 332
    :cond_15
    move v13, v9

    .line 333
    :goto_d
    if-eqz v13, :cond_1b

    .line 334
    .line 335
    iget v13, v11, La/lm40;->c:I

    .line 336
    .line 337
    and-int/lit16 v13, v13, 0x4000

    .line 338
    .line 339
    if-eqz v13, :cond_1b

    .line 340
    .line 341
    instance-of v13, v11, La/f3k;

    .line 342
    .line 343
    if-eqz v13, :cond_1b

    .line 344
    .line 345
    move-object v13, v11

    .line 346
    check-cast v13, La/f3k;

    .line 347
    .line 348
    iget-object v13, v13, La/f3k;->p:La/lm40;

    .line 349
    .line 350
    move v14, v4

    .line 351
    :goto_e
    if-eqz v13, :cond_1a

    .line 352
    .line 353
    iget v15, v13, La/lm40;->c:I

    .line 354
    .line 355
    and-int/lit16 v15, v15, 0x4000

    .line 356
    .line 357
    if-eqz v15, :cond_19

    .line 358
    .line 359
    add-int/lit8 v14, v14, 0x1

    .line 360
    .line 361
    if-ne v14, v9, :cond_16

    .line 362
    .line 363
    move-object v11, v13

    .line 364
    goto :goto_f

    .line 365
    :cond_16
    if-nez v12, :cond_17

    .line 366
    .line 367
    new-instance v12, La/xz40;

    .line 368
    .line 369
    new-array v15, v8, [La/lm40;

    .line 370
    .line 371
    invoke-direct {v12, v15}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    :cond_17
    if-eqz v11, :cond_18

    .line 375
    .line 376
    invoke-virtual {v12, v11}, La/xz40;->b(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    const/4 v11, 0x0

    .line 380
    :cond_18
    invoke-virtual {v12, v13}, La/xz40;->b(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_19
    :goto_f
    iget-object v13, v13, La/lm40;->f:La/lm40;

    .line 384
    .line 385
    goto :goto_e

    .line 386
    :cond_1a
    if-ne v14, v9, :cond_1b

    .line 387
    .line 388
    goto :goto_c

    .line 389
    :cond_1b
    invoke-static {v12}, La/vcc;->V(La/xz40;)La/lm40;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    goto :goto_c

    .line 394
    :cond_1c
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_1d
    invoke-virtual {v3}, La/e7z;->v()La/e7z;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    if-eqz v3, :cond_1e

    .line 402
    .line 403
    iget-object v2, v3, La/e7z;->h1:La/tzi;

    .line 404
    .line 405
    if-eqz v2, :cond_1e

    .line 406
    .line 407
    iget-object v2, v2, La/tzi;->f:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v2, La/wso0;

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_1e
    const/4 v2, 0x0

    .line 413
    goto :goto_a

    .line 414
    :cond_1f
    if-eqz v5, :cond_21

    .line 415
    .line 416
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    add-int/2addr v2, v6

    .line 421
    if-ltz v2, :cond_21

    .line 422
    .line 423
    :goto_10
    add-int/lit8 v3, v2, -0x1

    .line 424
    .line 425
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    check-cast v2, La/ix2;

    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    if-gez v3, :cond_20

    .line 435
    .line 436
    goto :goto_11

    .line 437
    :cond_20
    move v2, v3

    .line 438
    goto :goto_10

    .line 439
    :cond_21
    :goto_11
    iget-object v2, v10, La/lm40;->a:La/lm40;

    .line 440
    .line 441
    const/4 v3, 0x0

    .line 442
    :goto_12
    if-eqz v2, :cond_29

    .line 443
    .line 444
    instance-of v6, v2, La/ix2;

    .line 445
    .line 446
    if-eqz v6, :cond_22

    .line 447
    .line 448
    goto :goto_15

    .line 449
    :cond_22
    iget v6, v2, La/lm40;->c:I

    .line 450
    .line 451
    and-int/lit16 v6, v6, 0x4000

    .line 452
    .line 453
    if-eqz v6, :cond_28

    .line 454
    .line 455
    instance-of v6, v2, La/f3k;

    .line 456
    .line 457
    if-eqz v6, :cond_28

    .line 458
    .line 459
    move-object v6, v2

    .line 460
    check-cast v6, La/f3k;

    .line 461
    .line 462
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 463
    .line 464
    move v11, v4

    .line 465
    :goto_13
    if-eqz v6, :cond_27

    .line 466
    .line 467
    iget v12, v6, La/lm40;->c:I

    .line 468
    .line 469
    and-int/lit16 v12, v12, 0x4000

    .line 470
    .line 471
    if-eqz v12, :cond_26

    .line 472
    .line 473
    add-int/lit8 v11, v11, 0x1

    .line 474
    .line 475
    if-ne v11, v9, :cond_23

    .line 476
    .line 477
    move-object v2, v6

    .line 478
    goto :goto_14

    .line 479
    :cond_23
    if-nez v3, :cond_24

    .line 480
    .line 481
    new-instance v3, La/xz40;

    .line 482
    .line 483
    new-array v12, v8, [La/lm40;

    .line 484
    .line 485
    invoke-direct {v3, v12}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    :cond_24
    if-eqz v2, :cond_25

    .line 489
    .line 490
    invoke-virtual {v3, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    :cond_25
    invoke-virtual {v3, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    :cond_26
    :goto_14
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 498
    .line 499
    goto :goto_13

    .line 500
    :cond_27
    if-ne v11, v9, :cond_28

    .line 501
    .line 502
    goto :goto_12

    .line 503
    :cond_28
    :goto_15
    invoke-static {v3}, La/vcc;->V(La/xz40;)La/lm40;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    goto :goto_12

    .line 508
    :cond_29
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-eqz v0, :cond_2a

    .line 513
    .line 514
    goto/16 :goto_1b

    .line 515
    .line 516
    :cond_2a
    iget-object v0, v10, La/lm40;->a:La/lm40;

    .line 517
    .line 518
    const/4 v1, 0x0

    .line 519
    :goto_16
    if-eqz v0, :cond_32

    .line 520
    .line 521
    instance-of v2, v0, La/ix2;

    .line 522
    .line 523
    if-eqz v2, :cond_2b

    .line 524
    .line 525
    goto :goto_19

    .line 526
    :cond_2b
    iget v2, v0, La/lm40;->c:I

    .line 527
    .line 528
    and-int/lit16 v2, v2, 0x4000

    .line 529
    .line 530
    if-eqz v2, :cond_31

    .line 531
    .line 532
    instance-of v2, v0, La/f3k;

    .line 533
    .line 534
    if-eqz v2, :cond_31

    .line 535
    .line 536
    move-object v2, v0

    .line 537
    check-cast v2, La/f3k;

    .line 538
    .line 539
    iget-object v2, v2, La/f3k;->p:La/lm40;

    .line 540
    .line 541
    move v3, v4

    .line 542
    :goto_17
    if-eqz v2, :cond_30

    .line 543
    .line 544
    iget v6, v2, La/lm40;->c:I

    .line 545
    .line 546
    and-int/lit16 v6, v6, 0x4000

    .line 547
    .line 548
    if-eqz v6, :cond_2f

    .line 549
    .line 550
    add-int/lit8 v3, v3, 0x1

    .line 551
    .line 552
    if-ne v3, v9, :cond_2c

    .line 553
    .line 554
    move-object v0, v2

    .line 555
    goto :goto_18

    .line 556
    :cond_2c
    if-nez v1, :cond_2d

    .line 557
    .line 558
    new-instance v1, La/xz40;

    .line 559
    .line 560
    new-array v6, v8, [La/lm40;

    .line 561
    .line 562
    invoke-direct {v1, v6}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    :cond_2d
    if-eqz v0, :cond_2e

    .line 566
    .line 567
    invoke-virtual {v1, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    const/4 v0, 0x0

    .line 571
    :cond_2e
    invoke-virtual {v1, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    :cond_2f
    :goto_18
    iget-object v2, v2, La/lm40;->f:La/lm40;

    .line 575
    .line 576
    goto :goto_17

    .line 577
    :cond_30
    if-ne v3, v9, :cond_31

    .line 578
    .line 579
    goto :goto_16

    .line 580
    :cond_31
    :goto_19
    invoke-static {v1}, La/vcc;->V(La/xz40;)La/lm40;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    goto :goto_16

    .line 585
    :cond_32
    if-eqz v5, :cond_34

    .line 586
    .line 587
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    move v1, v4

    .line 592
    :goto_1a
    if-ge v1, v0, :cond_34

    .line 593
    .line 594
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    check-cast v2, La/ix2;

    .line 599
    .line 600
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    add-int/lit8 v1, v1, 0x1

    .line 604
    .line 605
    goto :goto_1a

    .line 606
    :cond_33
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->i(Landroid/view/MotionEvent;)I

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    and-int/lit8 v0, v0, 0x4

    .line 611
    .line 612
    if-eqz v0, :cond_34

    .line 613
    .line 614
    :goto_1b
    return v9

    .line 615
    :cond_34
    return v4

    .line 616
    :cond_35
    const/high16 v2, 0x200000

    .line 617
    .line 618
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    if-eqz v3, :cond_91

    .line 623
    .line 624
    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->d:La/v6x;

    .line 625
    .line 626
    iget-object v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->h1:La/ns40;

    .line 627
    .line 628
    iget-object v11, v10, La/ns40;->e:La/u710;

    .line 629
    .line 630
    iget-object v12, v10, La/ns40;->b:Landroid/util/SparseLongArray;

    .line 631
    .line 632
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 633
    .line 634
    .line 635
    move-result v13

    .line 636
    invoke-virtual {v10, v1}, La/ns40;->b(Landroid/view/MotionEvent;)V

    .line 637
    .line 638
    .line 639
    const/4 v14, 0x3

    .line 640
    const/4 v15, 0x2

    .line 641
    if-ne v13, v14, :cond_36

    .line 642
    .line 643
    invoke-virtual {v12}, Landroid/util/SparseLongArray;->clear()V

    .line 644
    .line 645
    .line 646
    iget-object v1, v10, La/ns40;->c:Landroid/util/SparseBooleanArray;

    .line 647
    .line 648
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 649
    .line 650
    .line 651
    move-object/from16 v23, v5

    .line 652
    .line 653
    move/from16 v16, v6

    .line 654
    .line 655
    move/from16 v19, v8

    .line 656
    .line 657
    const/4 v3, 0x0

    .line 658
    const/16 v17, 0x0

    .line 659
    .line 660
    goto/16 :goto_30

    .line 661
    .line 662
    :cond_36
    invoke-virtual {v10, v1}, La/ns40;->a(Landroid/view/MotionEvent;)V

    .line 663
    .line 664
    .line 665
    const/4 v14, 0x6

    .line 666
    if-eq v13, v9, :cond_38

    .line 667
    .line 668
    if-eq v13, v14, :cond_37

    .line 669
    .line 670
    move/from16 v16, v6

    .line 671
    .line 672
    :goto_1c
    const/16 v17, 0x0

    .line 673
    .line 674
    goto :goto_1d

    .line 675
    :cond_37
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 676
    .line 677
    .line 678
    move-result v16

    .line 679
    move/from16 v17, v16

    .line 680
    .line 681
    move/from16 v16, v6

    .line 682
    .line 683
    move/from16 v6, v17

    .line 684
    .line 685
    goto :goto_1c

    .line 686
    :cond_38
    move/from16 v16, v6

    .line 687
    .line 688
    const/16 v17, 0x0

    .line 689
    .line 690
    move v6, v4

    .line 691
    :goto_1d
    const/4 v7, 0x5

    .line 692
    if-eqz v13, :cond_39

    .line 693
    .line 694
    if-eq v13, v15, :cond_39

    .line 695
    .line 696
    if-eq v13, v7, :cond_39

    .line 697
    .line 698
    move/from16 v18, v4

    .line 699
    .line 700
    :goto_1e
    move/from16 v19, v8

    .line 701
    .line 702
    goto :goto_1f

    .line 703
    :cond_39
    move/from16 v18, v9

    .line 704
    .line 705
    goto :goto_1e

    .line 706
    :goto_1f
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 707
    .line 708
    .line 709
    move-result v8

    .line 710
    new-instance v14, Ljava/util/ArrayList;

    .line 711
    .line 712
    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 713
    .line 714
    .line 715
    move v7, v4

    .line 716
    :goto_20
    if-ge v7, v8, :cond_42

    .line 717
    .line 718
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 719
    .line 720
    .line 721
    move-result v15

    .line 722
    move/from16 v20, v9

    .line 723
    .line 724
    invoke-virtual {v12, v15}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 725
    .line 726
    .line 727
    move-result v9

    .line 728
    const-wide/16 v21, 0x1

    .line 729
    .line 730
    if-ltz v9, :cond_3a

    .line 731
    .line 732
    invoke-virtual {v12, v9}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 733
    .line 734
    .line 735
    move-result-wide v23

    .line 736
    move-wide/from16 v41, v23

    .line 737
    .line 738
    move-object/from16 v23, v5

    .line 739
    .line 740
    move-wide/from16 v4, v41

    .line 741
    .line 742
    move-object/from16 v25, v3

    .line 743
    .line 744
    goto :goto_21

    .line 745
    :cond_3a
    move-object/from16 v23, v5

    .line 746
    .line 747
    iget-wide v4, v10, La/ns40;->a:J

    .line 748
    .line 749
    move-object/from16 v25, v3

    .line 750
    .line 751
    add-long v2, v4, v21

    .line 752
    .line 753
    iput-wide v2, v10, La/ns40;->a:J

    .line 754
    .line 755
    invoke-virtual {v12, v15, v4, v5}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 756
    .line 757
    .line 758
    :goto_21
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getX(I)F

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getY(I)F

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    move-object v15, v10

    .line 771
    int-to-long v9, v2

    .line 772
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    int-to-long v2, v2

    .line 777
    const/16 v26, 0x20

    .line 778
    .line 779
    shl-long v9, v9, v26

    .line 780
    .line 781
    const-wide v27, 0xffffffffL

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    and-long v2, v2, v27

    .line 787
    .line 788
    or-long v31, v9, v2

    .line 789
    .line 790
    if-eq v7, v6, :cond_3b

    .line 791
    .line 792
    move/from16 v33, v20

    .line 793
    .line 794
    goto :goto_22

    .line 795
    :cond_3b
    const/16 v33, 0x0

    .line 796
    .line 797
    :goto_22
    invoke-virtual {v11, v4, v5}, La/u710;->b(J)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    check-cast v2, La/ms40;

    .line 802
    .line 803
    const-wide/32 v9, 0x7fffffff

    .line 804
    .line 805
    .line 806
    if-ne v7, v6, :cond_3c

    .line 807
    .line 808
    invoke-virtual {v11, v4, v5}, La/u710;->g(J)V

    .line 809
    .line 810
    .line 811
    move-wide v3, v4

    .line 812
    move-wide/from16 v34, v9

    .line 813
    .line 814
    move/from16 v9, v26

    .line 815
    .line 816
    const v5, 0xffff

    .line 817
    .line 818
    .line 819
    goto :goto_24

    .line 820
    :cond_3c
    if-eqz v18, :cond_3d

    .line 821
    .line 822
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 823
    .line 824
    .line 825
    move-result-wide v29

    .line 826
    and-long v29, v29, v9

    .line 827
    .line 828
    shl-long v29, v29, v20

    .line 829
    .line 830
    or-long v29, v21, v29

    .line 831
    .line 832
    move-wide/from16 v34, v9

    .line 833
    .line 834
    shr-long v9, v31, v26

    .line 835
    .line 836
    long-to-int v9, v9

    .line 837
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 838
    .line 839
    .line 840
    move-result v9

    .line 841
    float-to-int v9, v9

    .line 842
    int-to-short v9, v9

    .line 843
    move-wide/from16 v36, v4

    .line 844
    .line 845
    const v5, 0xffff

    .line 846
    .line 847
    .line 848
    and-long v3, v31, v27

    .line 849
    .line 850
    long-to-int v3, v3

    .line 851
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    float-to-int v3, v3

    .line 856
    int-to-short v3, v3

    .line 857
    shl-int/lit8 v4, v9, 0x10

    .line 858
    .line 859
    and-int/2addr v3, v5

    .line 860
    or-int/2addr v3, v4

    .line 861
    int-to-long v3, v3

    .line 862
    shl-long v3, v3, v26

    .line 863
    .line 864
    or-long v3, v29, v3

    .line 865
    .line 866
    new-instance v9, La/ms40;

    .line 867
    .line 868
    invoke-direct {v9, v3, v4}, La/ms40;-><init>(J)V

    .line 869
    .line 870
    .line 871
    move-wide/from16 v3, v36

    .line 872
    .line 873
    invoke-virtual {v11, v9, v3, v4}, La/u710;->f(Ljava/lang/Object;J)V

    .line 874
    .line 875
    .line 876
    :goto_23
    move/from16 v9, v26

    .line 877
    .line 878
    goto :goto_24

    .line 879
    :cond_3d
    move-wide v3, v4

    .line 880
    move-wide/from16 v34, v9

    .line 881
    .line 882
    const v5, 0xffff

    .line 883
    .line 884
    .line 885
    goto :goto_23

    .line 886
    :goto_24
    new-instance v26, La/x6x;

    .line 887
    .line 888
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 889
    .line 890
    .line 891
    move-result-wide v29

    .line 892
    move-wide/from16 v35, v34

    .line 893
    .line 894
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 895
    .line 896
    .line 897
    move-result v34

    .line 898
    move/from16 v37, v5

    .line 899
    .line 900
    move v10, v6

    .line 901
    if-eqz v2, :cond_3e

    .line 902
    .line 903
    iget-wide v5, v2, La/ms40;->a:J

    .line 904
    .line 905
    shr-long v5, v5, v20

    .line 906
    .line 907
    and-long v5, v5, v35

    .line 908
    .line 909
    :goto_25
    move-wide/from16 v35, v5

    .line 910
    .line 911
    goto :goto_26

    .line 912
    :cond_3e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 913
    .line 914
    .line 915
    move-result-wide v5

    .line 916
    goto :goto_25

    .line 917
    :goto_26
    if-eqz v2, :cond_3f

    .line 918
    .line 919
    iget-wide v5, v2, La/ms40;->a:J

    .line 920
    .line 921
    ushr-long/2addr v5, v9

    .line 922
    long-to-int v5, v5

    .line 923
    ushr-int/lit8 v6, v5, 0x10

    .line 924
    .line 925
    int-to-short v6, v6

    .line 926
    int-to-float v6, v6

    .line 927
    and-int v5, v5, v37

    .line 928
    .line 929
    int-to-short v5, v5

    .line 930
    int-to-float v5, v5

    .line 931
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 932
    .line 933
    .line 934
    move-result v6

    .line 935
    move/from16 v37, v9

    .line 936
    .line 937
    move/from16 v40, v10

    .line 938
    .line 939
    int-to-long v9, v6

    .line 940
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    int-to-long v5, v5

    .line 945
    shl-long v9, v9, v37

    .line 946
    .line 947
    and-long v5, v5, v27

    .line 948
    .line 949
    or-long/2addr v5, v9

    .line 950
    move-wide/from16 v37, v5

    .line 951
    .line 952
    goto :goto_27

    .line 953
    :cond_3f
    move/from16 v40, v10

    .line 954
    .line 955
    move-wide/from16 v37, v31

    .line 956
    .line 957
    :goto_27
    if-eqz v2, :cond_41

    .line 958
    .line 959
    iget-wide v5, v2, La/ms40;->a:J

    .line 960
    .line 961
    and-long v5, v5, v21

    .line 962
    .line 963
    const-wide/16 v9, 0x0

    .line 964
    .line 965
    cmp-long v2, v5, v9

    .line 966
    .line 967
    if-eqz v2, :cond_40

    .line 968
    .line 969
    move/from16 v2, v20

    .line 970
    .line 971
    goto :goto_28

    .line 972
    :cond_40
    const/4 v2, 0x0

    .line 973
    :goto_28
    move/from16 v39, v2

    .line 974
    .line 975
    :goto_29
    move-wide/from16 v27, v3

    .line 976
    .line 977
    goto :goto_2a

    .line 978
    :cond_41
    const/16 v39, 0x0

    .line 979
    .line 980
    goto :goto_29

    .line 981
    :goto_2a
    invoke-direct/range {v26 .. v39}, La/x6x;-><init>(JJJZFJJZ)V

    .line 982
    .line 983
    .line 984
    move-object/from16 v2, v26

    .line 985
    .line 986
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    add-int/lit8 v7, v7, 0x1

    .line 990
    .line 991
    move-object v10, v15

    .line 992
    move/from16 v9, v20

    .line 993
    .line 994
    move-object/from16 v5, v23

    .line 995
    .line 996
    move-object/from16 v3, v25

    .line 997
    .line 998
    move/from16 v6, v40

    .line 999
    .line 1000
    const/high16 v2, 0x200000

    .line 1001
    .line 1002
    const/4 v4, 0x0

    .line 1003
    const/4 v15, 0x2

    .line 1004
    goto/16 :goto_20

    .line 1005
    .line 1006
    :cond_42
    move-object/from16 v25, v3

    .line 1007
    .line 1008
    move-object/from16 v23, v5

    .line 1009
    .line 1010
    move/from16 v20, v9

    .line 1011
    .line 1012
    move-object v15, v10

    .line 1013
    invoke-virtual {v15, v1}, La/ns40;->e(Landroid/view/MotionEvent;)V

    .line 1014
    .line 1015
    .line 1016
    if-eqz v25, :cond_43

    .line 1017
    .line 1018
    move-object/from16 v2, v25

    .line 1019
    .line 1020
    iget v2, v2, La/v6x;->a:I

    .line 1021
    .line 1022
    goto :goto_2f

    .line 1023
    :cond_43
    const/high16 v2, 0x200000

    .line 1024
    .line 1025
    invoke-virtual {v1, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v3

    .line 1029
    if-eqz v3, :cond_90

    .line 1030
    .line 1031
    invoke-virtual {v1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2

    .line 1035
    if-eqz v2, :cond_49

    .line 1036
    .line 1037
    const/4 v9, 0x0

    .line 1038
    invoke-virtual {v2, v9}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    move/from16 v4, v20

    .line 1043
    .line 1044
    invoke-virtual {v2, v4}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    if-eqz v3, :cond_44

    .line 1049
    .line 1050
    if-nez v2, :cond_44

    .line 1051
    .line 1052
    :goto_2b
    const/4 v2, 0x1

    .line 1053
    goto :goto_2f

    .line 1054
    :cond_44
    if-eqz v2, :cond_45

    .line 1055
    .line 1056
    if-nez v3, :cond_45

    .line 1057
    .line 1058
    :goto_2c
    const/4 v2, 0x2

    .line 1059
    goto :goto_2f

    .line 1060
    :cond_45
    if-eqz v3, :cond_49

    .line 1061
    .line 1062
    if-eqz v2, :cond_49

    .line 1063
    .line 1064
    invoke-virtual {v3}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1065
    .line 1066
    .line 1067
    move-result v3

    .line 1068
    invoke-virtual {v2}, Landroid/view/InputDevice$MotionRange;->getRange()F

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    cmpl-float v4, v3, v2

    .line 1073
    .line 1074
    const/high16 v5, 0x40a00000    # 5.0f

    .line 1075
    .line 1076
    const/4 v6, 0x0

    .line 1077
    if-lez v4, :cond_47

    .line 1078
    .line 1079
    cmpg-float v4, v2, v6

    .line 1080
    .line 1081
    if-nez v4, :cond_46

    .line 1082
    .line 1083
    goto :goto_2d

    .line 1084
    :cond_46
    div-float v4, v3, v2

    .line 1085
    .line 1086
    cmpl-float v4, v4, v5

    .line 1087
    .line 1088
    if-ltz v4, :cond_47

    .line 1089
    .line 1090
    :goto_2d
    goto :goto_2b

    .line 1091
    :cond_47
    cmpl-float v4, v2, v3

    .line 1092
    .line 1093
    if-lez v4, :cond_49

    .line 1094
    .line 1095
    cmpg-float v4, v3, v6

    .line 1096
    .line 1097
    if-nez v4, :cond_48

    .line 1098
    .line 1099
    goto :goto_2e

    .line 1100
    :cond_48
    div-float/2addr v2, v3

    .line 1101
    cmpl-float v2, v2, v5

    .line 1102
    .line 1103
    if-ltz v2, :cond_49

    .line 1104
    .line 1105
    :goto_2e
    goto :goto_2c

    .line 1106
    :cond_49
    const/4 v2, 0x0

    .line 1107
    :goto_2f
    new-instance v3, La/zz2;

    .line 1108
    .line 1109
    if-eqz v13, :cond_4a

    .line 1110
    .line 1111
    const/4 v4, 0x1

    .line 1112
    if-eq v13, v4, :cond_4a

    .line 1113
    .line 1114
    const/4 v4, 0x2

    .line 1115
    if-eq v13, v4, :cond_4a

    .line 1116
    .line 1117
    const/4 v4, 0x5

    .line 1118
    if-eq v13, v4, :cond_4a

    .line 1119
    .line 1120
    const/4 v4, 0x6

    .line 1121
    :cond_4a
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1122
    .line 1123
    .line 1124
    iput-object v14, v3, La/zz2;->b:Ljava/lang/Object;

    .line 1125
    .line 1126
    iput v2, v3, La/zz2;->a:I

    .line 1127
    .line 1128
    iput-object v1, v3, La/zz2;->c:Ljava/lang/Object;

    .line 1129
    .line 1130
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v1

    .line 1134
    if-nez v1, :cond_8f

    .line 1135
    .line 1136
    :goto_30
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->a2:La/qo8;

    .line 1137
    .line 1138
    if-eqz v3, :cond_71

    .line 1139
    .line 1140
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    check-cast v0, La/ypq;

    .line 1145
    .line 1146
    iget-object v2, v0, La/ypq;->d:La/tpq;

    .line 1147
    .line 1148
    iget-boolean v2, v2, La/tpq;->e:Z

    .line 1149
    .line 1150
    if-eqz v2, :cond_4c

    .line 1151
    .line 1152
    const-string v0, "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated."

    .line 1153
    .line 1154
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 1155
    .line 1156
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 1157
    .line 1158
    .line 1159
    :cond_4b
    const/4 v0, 0x0

    .line 1160
    goto/16 :goto_46

    .line 1161
    .line 1162
    :cond_4c
    invoke-virtual {v0}, La/ypq;->h()La/nqq;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    if-eqz v0, :cond_59

    .line 1167
    .line 1168
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 1169
    .line 1170
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 1171
    .line 1172
    if-nez v2, :cond_4d

    .line 1173
    .line 1174
    invoke-static/range {v23 .. v23}, La/xcx;->b(Ljava/lang/String;)V

    .line 1175
    .line 1176
    .line 1177
    :cond_4d
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 1178
    .line 1179
    invoke-static {v0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    :goto_31
    if-eqz v0, :cond_58

    .line 1184
    .line 1185
    iget-object v4, v0, La/e7z;->h1:La/tzi;

    .line 1186
    .line 1187
    iget-object v4, v4, La/tzi;->g:Ljava/lang/Object;

    .line 1188
    .line 1189
    check-cast v4, La/lm40;

    .line 1190
    .line 1191
    iget v4, v4, La/lm40;->d:I

    .line 1192
    .line 1193
    const/high16 v24, 0x200000

    .line 1194
    .line 1195
    and-int v4, v4, v24

    .line 1196
    .line 1197
    if-eqz v4, :cond_56

    .line 1198
    .line 1199
    :goto_32
    if-eqz v2, :cond_56

    .line 1200
    .line 1201
    iget v4, v2, La/lm40;->c:I

    .line 1202
    .line 1203
    and-int v4, v4, v24

    .line 1204
    .line 1205
    if-eqz v4, :cond_55

    .line 1206
    .line 1207
    move-object v4, v2

    .line 1208
    move-object/from16 v5, v17

    .line 1209
    .line 1210
    :goto_33
    if-eqz v4, :cond_55

    .line 1211
    .line 1212
    instance-of v6, v4, La/h7x;

    .line 1213
    .line 1214
    if-eqz v6, :cond_4e

    .line 1215
    .line 1216
    goto/16 :goto_38

    .line 1217
    .line 1218
    :cond_4e
    iget v6, v4, La/lm40;->c:I

    .line 1219
    .line 1220
    and-int v6, v6, v24

    .line 1221
    .line 1222
    if-eqz v6, :cond_54

    .line 1223
    .line 1224
    instance-of v6, v4, La/f3k;

    .line 1225
    .line 1226
    if-eqz v6, :cond_54

    .line 1227
    .line 1228
    move-object v6, v4

    .line 1229
    check-cast v6, La/f3k;

    .line 1230
    .line 1231
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 1232
    .line 1233
    const/4 v7, 0x0

    .line 1234
    :goto_34
    if-eqz v6, :cond_53

    .line 1235
    .line 1236
    iget v8, v6, La/lm40;->c:I

    .line 1237
    .line 1238
    and-int v8, v8, v24

    .line 1239
    .line 1240
    if-eqz v8, :cond_52

    .line 1241
    .line 1242
    add-int/lit8 v7, v7, 0x1

    .line 1243
    .line 1244
    const/4 v8, 0x1

    .line 1245
    if-ne v7, v8, :cond_4f

    .line 1246
    .line 1247
    move-object v4, v6

    .line 1248
    goto :goto_35

    .line 1249
    :cond_4f
    if-nez v5, :cond_50

    .line 1250
    .line 1251
    new-instance v5, La/xz40;

    .line 1252
    .line 1253
    move/from16 v8, v19

    .line 1254
    .line 1255
    new-array v10, v8, [La/lm40;

    .line 1256
    .line 1257
    invoke-direct {v5, v10}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 1258
    .line 1259
    .line 1260
    :cond_50
    if-eqz v4, :cond_51

    .line 1261
    .line 1262
    invoke-virtual {v5, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1263
    .line 1264
    .line 1265
    move-object/from16 v4, v17

    .line 1266
    .line 1267
    :cond_51
    invoke-virtual {v5, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1268
    .line 1269
    .line 1270
    :cond_52
    :goto_35
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 1271
    .line 1272
    const/16 v19, 0x10

    .line 1273
    .line 1274
    const/high16 v24, 0x200000

    .line 1275
    .line 1276
    goto :goto_34

    .line 1277
    :cond_53
    const/4 v8, 0x1

    .line 1278
    if-ne v7, v8, :cond_54

    .line 1279
    .line 1280
    :goto_36
    const/16 v19, 0x10

    .line 1281
    .line 1282
    const/high16 v24, 0x200000

    .line 1283
    .line 1284
    goto :goto_33

    .line 1285
    :cond_54
    invoke-static {v5}, La/vcc;->V(La/xz40;)La/lm40;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v4

    .line 1289
    goto :goto_36

    .line 1290
    :cond_55
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 1291
    .line 1292
    const/16 v19, 0x10

    .line 1293
    .line 1294
    const/high16 v24, 0x200000

    .line 1295
    .line 1296
    goto :goto_32

    .line 1297
    :cond_56
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    if-eqz v0, :cond_57

    .line 1302
    .line 1303
    iget-object v2, v0, La/e7z;->h1:La/tzi;

    .line 1304
    .line 1305
    if-eqz v2, :cond_57

    .line 1306
    .line 1307
    iget-object v2, v2, La/tzi;->f:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v2, La/wso0;

    .line 1310
    .line 1311
    goto :goto_37

    .line 1312
    :cond_57
    move-object/from16 v2, v17

    .line 1313
    .line 1314
    :goto_37
    const/16 v19, 0x10

    .line 1315
    .line 1316
    goto/16 :goto_31

    .line 1317
    .line 1318
    :cond_58
    move-object/from16 v4, v17

    .line 1319
    .line 1320
    :goto_38
    check-cast v4, La/h7x;

    .line 1321
    .line 1322
    goto :goto_39

    .line 1323
    :cond_59
    move-object/from16 v4, v17

    .line 1324
    .line 1325
    :goto_39
    if-eqz v4, :cond_6c

    .line 1326
    .line 1327
    move-object v0, v4

    .line 1328
    check-cast v0, La/lm40;

    .line 1329
    .line 1330
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 1331
    .line 1332
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 1333
    .line 1334
    if-nez v2, :cond_5a

    .line 1335
    .line 1336
    invoke-static/range {v23 .. v23}, La/xcx;->b(Ljava/lang/String;)V

    .line 1337
    .line 1338
    .line 1339
    :cond_5a
    iget-object v0, v0, La/lm40;->a:La/lm40;

    .line 1340
    .line 1341
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 1342
    .line 1343
    invoke-static {v4}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    move-object/from16 v5, v17

    .line 1348
    .line 1349
    :goto_3a
    if-eqz v2, :cond_66

    .line 1350
    .line 1351
    iget-object v6, v2, La/e7z;->h1:La/tzi;

    .line 1352
    .line 1353
    iget-object v6, v6, La/tzi;->g:Ljava/lang/Object;

    .line 1354
    .line 1355
    check-cast v6, La/lm40;

    .line 1356
    .line 1357
    iget v6, v6, La/lm40;->d:I

    .line 1358
    .line 1359
    const/high16 v24, 0x200000

    .line 1360
    .line 1361
    and-int v6, v6, v24

    .line 1362
    .line 1363
    if-eqz v6, :cond_64

    .line 1364
    .line 1365
    :goto_3b
    if-eqz v0, :cond_64

    .line 1366
    .line 1367
    iget v6, v0, La/lm40;->c:I

    .line 1368
    .line 1369
    and-int v6, v6, v24

    .line 1370
    .line 1371
    if-eqz v6, :cond_63

    .line 1372
    .line 1373
    move-object v6, v0

    .line 1374
    move-object/from16 v7, v17

    .line 1375
    .line 1376
    :goto_3c
    if-eqz v6, :cond_63

    .line 1377
    .line 1378
    instance-of v8, v6, La/h7x;

    .line 1379
    .line 1380
    if-eqz v8, :cond_5c

    .line 1381
    .line 1382
    if-nez v5, :cond_5b

    .line 1383
    .line 1384
    new-instance v5, Ljava/util/ArrayList;

    .line 1385
    .line 1386
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1387
    .line 1388
    .line 1389
    :cond_5b
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    const/4 v8, 0x0

    .line 1393
    goto :goto_3d

    .line 1394
    :cond_5c
    const/4 v8, 0x1

    .line 1395
    :goto_3d
    if-eqz v8, :cond_62

    .line 1396
    .line 1397
    iget v8, v6, La/lm40;->c:I

    .line 1398
    .line 1399
    const/high16 v24, 0x200000

    .line 1400
    .line 1401
    and-int v8, v8, v24

    .line 1402
    .line 1403
    if-eqz v8, :cond_62

    .line 1404
    .line 1405
    instance-of v8, v6, La/f3k;

    .line 1406
    .line 1407
    if-eqz v8, :cond_62

    .line 1408
    .line 1409
    move-object v8, v6

    .line 1410
    check-cast v8, La/f3k;

    .line 1411
    .line 1412
    iget-object v8, v8, La/f3k;->p:La/lm40;

    .line 1413
    .line 1414
    const/4 v10, 0x0

    .line 1415
    :goto_3e
    if-eqz v8, :cond_61

    .line 1416
    .line 1417
    iget v11, v8, La/lm40;->c:I

    .line 1418
    .line 1419
    and-int v11, v11, v24

    .line 1420
    .line 1421
    if-eqz v11, :cond_60

    .line 1422
    .line 1423
    add-int/lit8 v10, v10, 0x1

    .line 1424
    .line 1425
    const/4 v11, 0x1

    .line 1426
    if-ne v10, v11, :cond_5d

    .line 1427
    .line 1428
    move-object v6, v8

    .line 1429
    goto :goto_3f

    .line 1430
    :cond_5d
    if-nez v7, :cond_5e

    .line 1431
    .line 1432
    new-instance v7, La/xz40;

    .line 1433
    .line 1434
    const/16 v11, 0x10

    .line 1435
    .line 1436
    new-array v12, v11, [La/lm40;

    .line 1437
    .line 1438
    invoke-direct {v7, v12}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 1439
    .line 1440
    .line 1441
    :cond_5e
    if-eqz v6, :cond_5f

    .line 1442
    .line 1443
    invoke-virtual {v7, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1444
    .line 1445
    .line 1446
    move-object/from16 v6, v17

    .line 1447
    .line 1448
    :cond_5f
    invoke-virtual {v7, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1449
    .line 1450
    .line 1451
    :cond_60
    :goto_3f
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 1452
    .line 1453
    const/high16 v24, 0x200000

    .line 1454
    .line 1455
    goto :goto_3e

    .line 1456
    :cond_61
    const/4 v8, 0x1

    .line 1457
    if-ne v10, v8, :cond_62

    .line 1458
    .line 1459
    goto :goto_3c

    .line 1460
    :cond_62
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v6

    .line 1464
    goto :goto_3c

    .line 1465
    :cond_63
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 1466
    .line 1467
    const/high16 v24, 0x200000

    .line 1468
    .line 1469
    goto :goto_3b

    .line 1470
    :cond_64
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v2

    .line 1474
    if-eqz v2, :cond_65

    .line 1475
    .line 1476
    iget-object v0, v2, La/e7z;->h1:La/tzi;

    .line 1477
    .line 1478
    if-eqz v0, :cond_65

    .line 1479
    .line 1480
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 1481
    .line 1482
    check-cast v0, La/wso0;

    .line 1483
    .line 1484
    goto/16 :goto_3a

    .line 1485
    .line 1486
    :cond_65
    move-object/from16 v0, v17

    .line 1487
    .line 1488
    goto/16 :goto_3a

    .line 1489
    .line 1490
    :cond_66
    if-eqz v5, :cond_68

    .line 1491
    .line 1492
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1493
    .line 1494
    .line 1495
    move-result v0

    .line 1496
    add-int/lit8 v0, v0, -0x1

    .line 1497
    .line 1498
    if-ltz v0, :cond_68

    .line 1499
    .line 1500
    :goto_40
    add-int/lit8 v2, v0, -0x1

    .line 1501
    .line 1502
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    check-cast v0, La/h7x;

    .line 1507
    .line 1508
    sget-object v6, La/xoa0;->a:La/xoa0;

    .line 1509
    .line 1510
    invoke-interface {v0, v3, v6}, La/h7x;->Y(La/zz2;La/xoa0;)V

    .line 1511
    .line 1512
    .line 1513
    if-gez v2, :cond_67

    .line 1514
    .line 1515
    goto :goto_41

    .line 1516
    :cond_67
    move v0, v2

    .line 1517
    goto :goto_40

    .line 1518
    :cond_68
    :goto_41
    sget-object v0, La/xoa0;->a:La/xoa0;

    .line 1519
    .line 1520
    invoke-interface {v4, v3, v0}, La/h7x;->Y(La/zz2;La/xoa0;)V

    .line 1521
    .line 1522
    .line 1523
    sget-object v0, La/xoa0;->b:La/xoa0;

    .line 1524
    .line 1525
    invoke-interface {v4, v3, v0}, La/h7x;->Y(La/zz2;La/xoa0;)V

    .line 1526
    .line 1527
    .line 1528
    if-eqz v5, :cond_69

    .line 1529
    .line 1530
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1531
    .line 1532
    .line 1533
    move-result v0

    .line 1534
    const/4 v2, 0x0

    .line 1535
    :goto_42
    if-ge v2, v0, :cond_69

    .line 1536
    .line 1537
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v6

    .line 1541
    check-cast v6, La/h7x;

    .line 1542
    .line 1543
    sget-object v7, La/xoa0;->b:La/xoa0;

    .line 1544
    .line 1545
    invoke-interface {v6, v3, v7}, La/h7x;->Y(La/zz2;La/xoa0;)V

    .line 1546
    .line 1547
    .line 1548
    add-int/lit8 v2, v2, 0x1

    .line 1549
    .line 1550
    goto :goto_42

    .line 1551
    :cond_69
    if-eqz v5, :cond_6b

    .line 1552
    .line 1553
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1554
    .line 1555
    .line 1556
    move-result v0

    .line 1557
    add-int/lit8 v0, v0, -0x1

    .line 1558
    .line 1559
    if-ltz v0, :cond_6b

    .line 1560
    .line 1561
    :goto_43
    add-int/lit8 v2, v0, -0x1

    .line 1562
    .line 1563
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    check-cast v0, La/h7x;

    .line 1568
    .line 1569
    sget-object v6, La/xoa0;->c:La/xoa0;

    .line 1570
    .line 1571
    invoke-interface {v0, v3, v6}, La/h7x;->Y(La/zz2;La/xoa0;)V

    .line 1572
    .line 1573
    .line 1574
    if-gez v2, :cond_6a

    .line 1575
    .line 1576
    goto :goto_44

    .line 1577
    :cond_6a
    move v0, v2

    .line 1578
    goto :goto_43

    .line 1579
    :cond_6b
    :goto_44
    sget-object v0, La/xoa0;->c:La/xoa0;

    .line 1580
    .line 1581
    invoke-interface {v4, v3, v0}, La/h7x;->Y(La/zz2;La/xoa0;)V

    .line 1582
    .line 1583
    .line 1584
    :cond_6c
    iget-object v0, v3, La/zz2;->b:Ljava/lang/Object;

    .line 1585
    .line 1586
    check-cast v0, Ljava/util/ArrayList;

    .line 1587
    .line 1588
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1589
    .line 1590
    .line 1591
    move-result v2

    .line 1592
    const/4 v4, 0x0

    .line 1593
    :goto_45
    if-ge v4, v2, :cond_4b

    .line 1594
    .line 1595
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v5

    .line 1599
    check-cast v5, La/x6x;

    .line 1600
    .line 1601
    iget-boolean v5, v5, La/x6x;->i:Z

    .line 1602
    .line 1603
    if-eqz v5, :cond_6d

    .line 1604
    .line 1605
    const/4 v0, 0x1

    .line 1606
    goto :goto_46

    .line 1607
    :cond_6d
    add-int/lit8 v4, v4, 0x1

    .line 1608
    .line 1609
    goto :goto_45

    .line 1610
    :goto_46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1611
    .line 1612
    .line 1613
    iget-object v2, v3, La/zz2;->c:Ljava/lang/Object;

    .line 1614
    .line 1615
    check-cast v2, Landroid/view/MotionEvent;

    .line 1616
    .line 1617
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I

    .line 1618
    .line 1619
    .line 1620
    move-result v4

    .line 1621
    if-eqz v4, :cond_6f

    .line 1622
    .line 1623
    const/4 v8, 0x1

    .line 1624
    if-eq v4, v8, :cond_6e

    .line 1625
    .line 1626
    const/4 v3, 0x2

    .line 1627
    if-eq v4, v3, :cond_6e

    .line 1628
    .line 1629
    goto :goto_47

    .line 1630
    :cond_6e
    if-eqz v0, :cond_70

    .line 1631
    .line 1632
    const/4 v9, 0x0

    .line 1633
    iput v9, v1, La/qo8;->b:I

    .line 1634
    .line 1635
    iput-boolean v8, v1, La/qo8;->c:Z

    .line 1636
    .line 1637
    goto :goto_47

    .line 1638
    :cond_6f
    const/4 v8, 0x1

    .line 1639
    const/4 v9, 0x0

    .line 1640
    iget v0, v3, La/zz2;->a:I

    .line 1641
    .line 1642
    iput v0, v1, La/qo8;->b:I

    .line 1643
    .line 1644
    iput-boolean v9, v1, La/qo8;->c:Z

    .line 1645
    .line 1646
    :cond_70
    :goto_47
    iget-object v0, v1, La/qo8;->e:Ljava/lang/Object;

    .line 1647
    .line 1648
    check-cast v0, Landroid/view/GestureDetector;

    .line 1649
    .line 1650
    invoke-virtual {v0, v2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1651
    .line 1652
    .line 1653
    return v8

    .line 1654
    :cond_71
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    check-cast v0, La/ypq;

    .line 1659
    .line 1660
    invoke-virtual {v0}, La/ypq;->h()La/nqq;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    if-eqz v0, :cond_7e

    .line 1665
    .line 1666
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 1667
    .line 1668
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 1669
    .line 1670
    if-nez v2, :cond_72

    .line 1671
    .line 1672
    invoke-static/range {v23 .. v23}, La/xcx;->b(Ljava/lang/String;)V

    .line 1673
    .line 1674
    .line 1675
    :cond_72
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 1676
    .line 1677
    invoke-static {v0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    :goto_48
    if-eqz v0, :cond_7d

    .line 1682
    .line 1683
    iget-object v3, v0, La/e7z;->h1:La/tzi;

    .line 1684
    .line 1685
    iget-object v3, v3, La/tzi;->g:Ljava/lang/Object;

    .line 1686
    .line 1687
    check-cast v3, La/lm40;

    .line 1688
    .line 1689
    iget v3, v3, La/lm40;->d:I

    .line 1690
    .line 1691
    const/high16 v24, 0x200000

    .line 1692
    .line 1693
    and-int v3, v3, v24

    .line 1694
    .line 1695
    if-eqz v3, :cond_7b

    .line 1696
    .line 1697
    :goto_49
    if-eqz v2, :cond_7b

    .line 1698
    .line 1699
    iget v3, v2, La/lm40;->c:I

    .line 1700
    .line 1701
    and-int v3, v3, v24

    .line 1702
    .line 1703
    if-eqz v3, :cond_7a

    .line 1704
    .line 1705
    move-object v3, v2

    .line 1706
    move-object/from16 v4, v17

    .line 1707
    .line 1708
    :goto_4a
    if-eqz v3, :cond_7a

    .line 1709
    .line 1710
    instance-of v5, v3, La/h7x;

    .line 1711
    .line 1712
    if-eqz v5, :cond_73

    .line 1713
    .line 1714
    goto :goto_4e

    .line 1715
    :cond_73
    iget v5, v3, La/lm40;->c:I

    .line 1716
    .line 1717
    and-int v5, v5, v24

    .line 1718
    .line 1719
    if-eqz v5, :cond_79

    .line 1720
    .line 1721
    instance-of v5, v3, La/f3k;

    .line 1722
    .line 1723
    if-eqz v5, :cond_79

    .line 1724
    .line 1725
    move-object v5, v3

    .line 1726
    check-cast v5, La/f3k;

    .line 1727
    .line 1728
    iget-object v5, v5, La/f3k;->p:La/lm40;

    .line 1729
    .line 1730
    const/4 v6, 0x0

    .line 1731
    :goto_4b
    if-eqz v5, :cond_78

    .line 1732
    .line 1733
    iget v7, v5, La/lm40;->c:I

    .line 1734
    .line 1735
    and-int v7, v7, v24

    .line 1736
    .line 1737
    if-eqz v7, :cond_77

    .line 1738
    .line 1739
    add-int/lit8 v6, v6, 0x1

    .line 1740
    .line 1741
    const/4 v8, 0x1

    .line 1742
    if-ne v6, v8, :cond_74

    .line 1743
    .line 1744
    move-object v3, v5

    .line 1745
    goto :goto_4c

    .line 1746
    :cond_74
    if-nez v4, :cond_75

    .line 1747
    .line 1748
    new-instance v4, La/xz40;

    .line 1749
    .line 1750
    const/16 v8, 0x10

    .line 1751
    .line 1752
    new-array v7, v8, [La/lm40;

    .line 1753
    .line 1754
    invoke-direct {v4, v7}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 1755
    .line 1756
    .line 1757
    :cond_75
    if-eqz v3, :cond_76

    .line 1758
    .line 1759
    invoke-virtual {v4, v3}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1760
    .line 1761
    .line 1762
    move-object/from16 v3, v17

    .line 1763
    .line 1764
    :cond_76
    invoke-virtual {v4, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1765
    .line 1766
    .line 1767
    :cond_77
    :goto_4c
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 1768
    .line 1769
    const/high16 v24, 0x200000

    .line 1770
    .line 1771
    goto :goto_4b

    .line 1772
    :cond_78
    const/4 v8, 0x1

    .line 1773
    if-ne v6, v8, :cond_79

    .line 1774
    .line 1775
    :goto_4d
    const/high16 v24, 0x200000

    .line 1776
    .line 1777
    goto :goto_4a

    .line 1778
    :cond_79
    invoke-static {v4}, La/vcc;->V(La/xz40;)La/lm40;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v3

    .line 1782
    goto :goto_4d

    .line 1783
    :cond_7a
    iget-object v2, v2, La/lm40;->e:La/lm40;

    .line 1784
    .line 1785
    const/high16 v24, 0x200000

    .line 1786
    .line 1787
    goto :goto_49

    .line 1788
    :cond_7b
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v0

    .line 1792
    if-eqz v0, :cond_7c

    .line 1793
    .line 1794
    iget-object v2, v0, La/e7z;->h1:La/tzi;

    .line 1795
    .line 1796
    if-eqz v2, :cond_7c

    .line 1797
    .line 1798
    iget-object v2, v2, La/tzi;->f:Ljava/lang/Object;

    .line 1799
    .line 1800
    check-cast v2, La/wso0;

    .line 1801
    .line 1802
    goto :goto_48

    .line 1803
    :cond_7c
    move-object/from16 v2, v17

    .line 1804
    .line 1805
    goto :goto_48

    .line 1806
    :cond_7d
    move-object/from16 v3, v17

    .line 1807
    .line 1808
    :goto_4e
    check-cast v3, La/h7x;

    .line 1809
    .line 1810
    goto :goto_4f

    .line 1811
    :cond_7e
    move-object/from16 v3, v17

    .line 1812
    .line 1813
    :goto_4f
    if-eqz v3, :cond_8e

    .line 1814
    .line 1815
    move-object v0, v3

    .line 1816
    check-cast v0, La/lm40;

    .line 1817
    .line 1818
    iget-object v2, v0, La/lm40;->a:La/lm40;

    .line 1819
    .line 1820
    iget-boolean v2, v2, La/lm40;->n:Z

    .line 1821
    .line 1822
    if-nez v2, :cond_7f

    .line 1823
    .line 1824
    invoke-static/range {v23 .. v23}, La/xcx;->b(Ljava/lang/String;)V

    .line 1825
    .line 1826
    .line 1827
    :cond_7f
    iget-object v0, v0, La/lm40;->a:La/lm40;

    .line 1828
    .line 1829
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 1830
    .line 1831
    invoke-static {v3}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v2

    .line 1835
    move-object/from16 v4, v17

    .line 1836
    .line 1837
    :goto_50
    if-eqz v2, :cond_8d

    .line 1838
    .line 1839
    iget-object v5, v2, La/e7z;->h1:La/tzi;

    .line 1840
    .line 1841
    iget-object v5, v5, La/tzi;->g:Ljava/lang/Object;

    .line 1842
    .line 1843
    check-cast v5, La/lm40;

    .line 1844
    .line 1845
    iget v5, v5, La/lm40;->d:I

    .line 1846
    .line 1847
    const/high16 v24, 0x200000

    .line 1848
    .line 1849
    and-int v5, v5, v24

    .line 1850
    .line 1851
    if-eqz v5, :cond_8b

    .line 1852
    .line 1853
    :goto_51
    if-eqz v0, :cond_8b

    .line 1854
    .line 1855
    iget v5, v0, La/lm40;->c:I

    .line 1856
    .line 1857
    and-int v5, v5, v24

    .line 1858
    .line 1859
    if-eqz v5, :cond_8a

    .line 1860
    .line 1861
    move-object v5, v0

    .line 1862
    move-object/from16 v6, v17

    .line 1863
    .line 1864
    :goto_52
    if-eqz v5, :cond_8a

    .line 1865
    .line 1866
    instance-of v7, v5, La/h7x;

    .line 1867
    .line 1868
    if-eqz v7, :cond_81

    .line 1869
    .line 1870
    if-nez v4, :cond_80

    .line 1871
    .line 1872
    new-instance v4, Ljava/util/ArrayList;

    .line 1873
    .line 1874
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1875
    .line 1876
    .line 1877
    :cond_80
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1878
    .line 1879
    .line 1880
    const/4 v7, 0x0

    .line 1881
    goto :goto_53

    .line 1882
    :cond_81
    const/4 v7, 0x1

    .line 1883
    :goto_53
    if-eqz v7, :cond_88

    .line 1884
    .line 1885
    iget v7, v5, La/lm40;->c:I

    .line 1886
    .line 1887
    const/high16 v24, 0x200000

    .line 1888
    .line 1889
    and-int v7, v7, v24

    .line 1890
    .line 1891
    if-eqz v7, :cond_87

    .line 1892
    .line 1893
    instance-of v7, v5, La/f3k;

    .line 1894
    .line 1895
    if-eqz v7, :cond_87

    .line 1896
    .line 1897
    move-object v7, v5

    .line 1898
    check-cast v7, La/f3k;

    .line 1899
    .line 1900
    iget-object v7, v7, La/f3k;->p:La/lm40;

    .line 1901
    .line 1902
    const/4 v8, 0x0

    .line 1903
    :goto_54
    if-eqz v7, :cond_86

    .line 1904
    .line 1905
    iget v10, v7, La/lm40;->c:I

    .line 1906
    .line 1907
    and-int v10, v10, v24

    .line 1908
    .line 1909
    if-eqz v10, :cond_82

    .line 1910
    .line 1911
    add-int/lit8 v8, v8, 0x1

    .line 1912
    .line 1913
    const/4 v11, 0x1

    .line 1914
    if-ne v8, v11, :cond_83

    .line 1915
    .line 1916
    move-object v5, v7

    .line 1917
    :cond_82
    const/16 v11, 0x10

    .line 1918
    .line 1919
    goto :goto_56

    .line 1920
    :cond_83
    if-nez v6, :cond_84

    .line 1921
    .line 1922
    new-instance v6, La/xz40;

    .line 1923
    .line 1924
    const/16 v11, 0x10

    .line 1925
    .line 1926
    new-array v10, v11, [La/lm40;

    .line 1927
    .line 1928
    invoke-direct {v6, v10}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 1929
    .line 1930
    .line 1931
    goto :goto_55

    .line 1932
    :cond_84
    const/16 v11, 0x10

    .line 1933
    .line 1934
    :goto_55
    if-eqz v5, :cond_85

    .line 1935
    .line 1936
    invoke-virtual {v6, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1937
    .line 1938
    .line 1939
    move-object/from16 v5, v17

    .line 1940
    .line 1941
    :cond_85
    invoke-virtual {v6, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 1942
    .line 1943
    .line 1944
    :goto_56
    iget-object v7, v7, La/lm40;->f:La/lm40;

    .line 1945
    .line 1946
    goto :goto_54

    .line 1947
    :cond_86
    const/4 v7, 0x1

    .line 1948
    const/16 v11, 0x10

    .line 1949
    .line 1950
    if-ne v8, v7, :cond_89

    .line 1951
    .line 1952
    goto :goto_52

    .line 1953
    :cond_87
    const/16 v11, 0x10

    .line 1954
    .line 1955
    goto :goto_57

    .line 1956
    :cond_88
    const/16 v11, 0x10

    .line 1957
    .line 1958
    const/high16 v24, 0x200000

    .line 1959
    .line 1960
    :cond_89
    :goto_57
    invoke-static {v6}, La/vcc;->V(La/xz40;)La/lm40;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v5

    .line 1964
    goto :goto_52

    .line 1965
    :cond_8a
    const/16 v11, 0x10

    .line 1966
    .line 1967
    const/high16 v24, 0x200000

    .line 1968
    .line 1969
    iget-object v0, v0, La/lm40;->e:La/lm40;

    .line 1970
    .line 1971
    goto :goto_51

    .line 1972
    :cond_8b
    const/16 v11, 0x10

    .line 1973
    .line 1974
    invoke-virtual {v2}, La/e7z;->v()La/e7z;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v2

    .line 1978
    if-eqz v2, :cond_8c

    .line 1979
    .line 1980
    iget-object v0, v2, La/e7z;->h1:La/tzi;

    .line 1981
    .line 1982
    if-eqz v0, :cond_8c

    .line 1983
    .line 1984
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 1985
    .line 1986
    check-cast v0, La/wso0;

    .line 1987
    .line 1988
    goto/16 :goto_50

    .line 1989
    .line 1990
    :cond_8c
    move-object/from16 v0, v17

    .line 1991
    .line 1992
    goto/16 :goto_50

    .line 1993
    .line 1994
    :cond_8d
    invoke-interface {v3}, La/h7x;->z0()V

    .line 1995
    .line 1996
    .line 1997
    if-eqz v4, :cond_8e

    .line 1998
    .line 1999
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 2000
    .line 2001
    .line 2002
    move-result v0

    .line 2003
    const/4 v2, 0x0

    .line 2004
    :goto_58
    if-ge v2, v0, :cond_8e

    .line 2005
    .line 2006
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v3

    .line 2010
    check-cast v3, La/h7x;

    .line 2011
    .line 2012
    invoke-interface {v3}, La/h7x;->z0()V

    .line 2013
    .line 2014
    .line 2015
    add-int/lit8 v2, v2, 0x1

    .line 2016
    .line 2017
    goto :goto_58

    .line 2018
    :cond_8e
    const/4 v9, 0x0

    .line 2019
    iput v9, v1, La/qo8;->b:I

    .line 2020
    .line 2021
    const/4 v8, 0x1

    .line 2022
    iput-boolean v8, v1, La/qo8;->c:Z

    .line 2023
    .line 2024
    return v8

    .line 2025
    :cond_8f
    const-string v0, "changes cannot be empty"

    .line 2026
    .line 2027
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 2028
    .line 2029
    .line 2030
    throw v17

    .line 2031
    :cond_90
    const/4 v9, 0x0

    .line 2032
    const-string v0, "MotionEvent must be a touch navigation source"

    .line 2033
    .line 2034
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 2035
    .line 2036
    .line 2037
    return v9

    .line 2038
    :cond_91
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2039
    .line 2040
    .line 2041
    move-result v0

    .line 2042
    return v0

    .line 2043
    :cond_92
    :goto_59
    invoke-super/range {p0 .. p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 2044
    .line 2045
    .line 2046
    move-result v0

    .line 2047
    return v0
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Y1:Z

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->X1:La/gx2;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, La/gx2;->run()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->n(Landroid/view/MotionEvent;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v2, :cond_15

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    goto/16 :goto_b

    .line 31
    .line 32
    :cond_1
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 33
    .line 34
    iget-object v5, v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 35
    .line 36
    iget-object v6, v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/16 v8, 0xa

    .line 43
    .line 44
    const/4 v9, 0x7

    .line 45
    const/4 v10, 0x1

    .line 46
    if-eqz v7, :cond_d

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_d

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/16 v7, 0x100

    .line 59
    .line 60
    const/16 v11, 0x80

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/16 v13, 0xc

    .line 64
    .line 65
    const/high16 v14, -0x80000000

    .line 66
    .line 67
    if-eq v6, v9, :cond_5

    .line 68
    .line 69
    const/16 v15, 0x9

    .line 70
    .line 71
    if-eq v6, v15, :cond_5

    .line 72
    .line 73
    if-eq v6, v8, :cond_2

    .line 74
    .line 75
    move v2, v4

    .line 76
    :goto_0
    move/from16 v23, v10

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_2
    iget v6, v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->e:I

    .line 81
    .line 82
    if-eq v6, v14, :cond_4

    .line 83
    .line 84
    if-ne v6, v14, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iput v14, v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->e:I

    .line 88
    .line 89
    invoke-static {v2, v14, v11, v12, v13}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->E(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;IILjava/lang/Integer;I)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2, v6, v7, v12, v13}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->E(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;IILjava/lang/Integer;I)V

    .line 93
    .line 94
    .line 95
    :goto_1
    move v2, v10

    .line 96
    move/from16 v23, v2

    .line 97
    .line 98
    goto/16 :goto_7

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    goto :goto_0

    .line 109
    :cond_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    invoke-virtual {v5, v10}, Landroidx/compose/ui/platform/AndroidComposeView;->s(Z)V

    .line 118
    .line 119
    .line 120
    new-instance v20, La/raw;

    .line 121
    .line 122
    invoke-direct/range {v20 .. v20}, La/raw;-><init>()V

    .line 123
    .line 124
    .line 125
    move/from16 v23, v10

    .line 126
    .line 127
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    int-to-long v8, v6

    .line 136
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    int-to-long v14, v6

    .line 141
    const/16 v6, 0x20

    .line 142
    .line 143
    shl-long/2addr v8, v6

    .line 144
    const-wide v16, 0xffffffffL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    and-long v14, v14, v16

    .line 150
    .line 151
    or-long/2addr v8, v14

    .line 152
    iget-object v6, v10, La/e7z;->h1:La/tzi;

    .line 153
    .line 154
    iget-object v10, v6, La/tzi;->e:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v10, La/s460;

    .line 157
    .line 158
    sget-object v14, La/s460;->w1:La/mb50;

    .line 159
    .line 160
    invoke-virtual {v10, v8, v9}, La/s460;->d1(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v18

    .line 164
    iget-object v6, v6, La/tzi;->e:Ljava/lang/Object;

    .line 165
    .line 166
    move-object/from16 v16, v6

    .line 167
    .line 168
    check-cast v16, La/s460;

    .line 169
    .line 170
    sget-object v17, La/s460;->C1:La/wsz;

    .line 171
    .line 172
    const/16 v21, 0x1

    .line 173
    .line 174
    const/16 v22, 0x1

    .line 175
    .line 176
    invoke-virtual/range {v16 .. v22}, La/s460;->m1(La/r460;JLa/raw;IZ)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v6, v20

    .line 180
    .line 181
    iget-object v6, v6, La/raw;->a:La/vy40;

    .line 182
    .line 183
    iget v8, v6, La/vy40;->b:I

    .line 184
    .line 185
    add-int/lit8 v8, v8, -0x1

    .line 186
    .line 187
    :goto_2
    const/4 v9, -0x1

    .line 188
    if-ge v9, v8, :cond_6

    .line 189
    .line 190
    invoke-virtual {v6, v8}, La/vy40;->g(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    check-cast v9, La/lm40;

    .line 198
    .line 199
    invoke-static {v9}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-virtual {v10}, La/p33;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    check-cast v10, La/k33;

    .line 216
    .line 217
    if-eqz v10, :cond_7

    .line 218
    .line 219
    :cond_6
    const/high16 v10, -0x80000000

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_7
    iget-object v10, v9, La/e7z;->h1:La/tzi;

    .line 223
    .line 224
    const/16 v14, 0x8

    .line 225
    .line 226
    invoke-virtual {v10, v14}, La/tzi;->j(I)Z

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    if-nez v10, :cond_8

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_8
    iget v10, v9, La/e7z;->b:I

    .line 234
    .line 235
    invoke-virtual {v2, v10}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->A(I)I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-static {v9, v4}, La/x0x;->o(La/e7z;Z)La/tai0;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-static {v9}, La/phu0;->S(La/tai0;)Z

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    if-nez v14, :cond_9

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_9
    invoke-static {v9}, La/g1x;->x(La/tai0;)Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-eqz v9, :cond_a

    .line 255
    .line 256
    :goto_3
    add-int/lit8 v8, v8, -0x1

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_a
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    iget v6, v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->e:I

    .line 268
    .line 269
    if-ne v6, v10, :cond_b

    .line 270
    .line 271
    :goto_5
    const/high16 v2, -0x80000000

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_b
    iput v10, v2, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->e:I

    .line 275
    .line 276
    invoke-static {v2, v10, v11, v12, v13}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->E(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;IILjava/lang/Integer;I)V

    .line 277
    .line 278
    .line 279
    invoke-static {v2, v6, v7, v12, v13}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->E(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;IILjava/lang/Integer;I)V

    .line 280
    .line 281
    .line 282
    goto :goto_5

    .line 283
    :goto_6
    if-ne v10, v2, :cond_c

    .line 284
    .line 285
    move v2, v5

    .line 286
    goto :goto_7

    .line 287
    :cond_c
    move/from16 v2, v23

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_d
    move/from16 v23, v10

    .line 291
    .line 292
    move v2, v4

    .line 293
    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    const/4 v6, 0x7

    .line 298
    if-eq v5, v6, :cond_12

    .line 299
    .line 300
    const/16 v6, 0xa

    .line 301
    .line 302
    if-eq v5, v6, :cond_f

    .line 303
    .line 304
    :cond_e
    move/from16 v5, v23

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_f
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->o(Landroid/view/MotionEvent;)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-eqz v5, :cond_e

    .line 312
    .line 313
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    const/4 v5, 0x3

    .line 318
    if-ne v4, v5, :cond_10

    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    if-eqz v4, :cond_10

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_10
    iget-object v4, v0, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 328
    .line 329
    if-eqz v4, :cond_11

    .line 330
    .line 331
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 332
    .line 333
    .line 334
    :cond_11
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    iput-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 339
    .line 340
    move/from16 v5, v23

    .line 341
    .line 342
    iput-boolean v5, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Y1:Z

    .line 343
    .line 344
    const-wide/16 v4, 0x8

    .line 345
    .line 346
    invoke-virtual {v0, v3, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 347
    .line 348
    .line 349
    return v2

    .line 350
    :cond_12
    move/from16 v5, v23

    .line 351
    .line 352
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->p(Landroid/view/MotionEvent;)Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-nez v3, :cond_13

    .line 357
    .line 358
    :goto_8
    return v2

    .line 359
    :cond_13
    :goto_9
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->i(Landroid/view/MotionEvent;)I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    and-int/2addr v0, v5

    .line 364
    if-eqz v0, :cond_14

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_14
    if-eqz v2, :cond_15

    .line 368
    .line 369
    :goto_a
    return v5

    .line 370
    :cond_15
    :goto_b
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, La/skd;->t:La/yez;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget-object v1, La/shv0;->a:La/pz40;

    .line 18
    .line 19
    new-instance v2, La/kpa0;

    .line 20
    .line 21
    invoke-direct {v2, v0}, La/kpa0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    check-cast v1, La/hgk0;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/v9q;

    .line 34
    .line 35
    const/16 v2, 0x11

    .line 36
    .line 37
    invoke-direct {v1, v2}, La/v9q;-><init>(B)V

    .line 38
    .line 39
    .line 40
    check-cast v0, La/ypq;

    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, La/ypq;->f(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, La/mc;

    .line 64
    .line 65
    const/16 v2, 0x16

    .line 66
    .line 67
    invoke-direct {v1, p0, p1, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    check-cast v0, La/ypq;

    .line 71
    .line 72
    invoke-virtual {v0, p1, v1}, La/ypq;->f(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0
.end method

.method public final dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/ypq;

    .line 14
    .line 15
    iget-object v3, v0, La/ypq;->d:La/tpq;

    .line 16
    .line 17
    iget-boolean v3, v3, La/tpq;->e:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const-string v0, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    .line 22
    .line 23
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    iget-object v0, v0, La/ypq;->c:La/nqq;

    .line 31
    .line 32
    invoke-static {v0}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_b

    .line 37
    .line 38
    iget-object v3, v0, La/lm40;->a:La/lm40;

    .line 39
    .line 40
    iget-boolean v3, v3, La/lm40;->n:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    const-string v3, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    invoke-static {v3}, La/xcx;->b(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v3, v0, La/lm40;->a:La/lm40;

    .line 50
    .line 51
    invoke-static {v0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_b

    .line 56
    .line 57
    iget-object v4, v0, La/e7z;->h1:La/tzi;

    .line 58
    .line 59
    iget-object v4, v4, La/tzi;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, La/lm40;

    .line 62
    .line 63
    iget v4, v4, La/lm40;->d:I

    .line 64
    .line 65
    const/high16 v5, 0x20000

    .line 66
    .line 67
    and-int/2addr v4, v5

    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v4, :cond_9

    .line 70
    .line 71
    :goto_1
    if-eqz v3, :cond_9

    .line 72
    .line 73
    iget v4, v3, La/lm40;->c:I

    .line 74
    .line 75
    and-int/2addr v4, v5

    .line 76
    if-eqz v4, :cond_8

    .line 77
    .line 78
    move-object v4, v3

    .line 79
    move-object v7, v6

    .line 80
    :goto_2
    if-eqz v4, :cond_8

    .line 81
    .line 82
    iget v8, v4, La/lm40;->c:I

    .line 83
    .line 84
    and-int/2addr v8, v5

    .line 85
    if-eqz v8, :cond_7

    .line 86
    .line 87
    instance-of v8, v4, La/f3k;

    .line 88
    .line 89
    if-eqz v8, :cond_7

    .line 90
    .line 91
    move-object v8, v4

    .line 92
    check-cast v8, La/f3k;

    .line 93
    .line 94
    iget-object v8, v8, La/f3k;->p:La/lm40;

    .line 95
    .line 96
    move v9, v1

    .line 97
    :goto_3
    if-eqz v8, :cond_6

    .line 98
    .line 99
    iget v10, v8, La/lm40;->c:I

    .line 100
    .line 101
    and-int/2addr v10, v5

    .line 102
    if-eqz v10, :cond_5

    .line 103
    .line 104
    add-int/lit8 v9, v9, 0x1

    .line 105
    .line 106
    if-ne v9, v2, :cond_2

    .line 107
    .line 108
    move-object v4, v8

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    if-nez v7, :cond_3

    .line 111
    .line 112
    new-instance v7, La/xz40;

    .line 113
    .line 114
    const/16 v10, 0x10

    .line 115
    .line 116
    new-array v10, v10, [La/lm40;

    .line 117
    .line 118
    invoke-direct {v7, v10}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    if-eqz v4, :cond_4

    .line 122
    .line 123
    invoke-virtual {v7, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object v4, v6

    .line 127
    :cond_4
    invoke-virtual {v7, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_4
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    if-ne v9, v2, :cond_7

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    goto :goto_2

    .line 141
    :cond_8
    iget-object v3, v3, La/lm40;->e:La/lm40;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    iget-object v3, v0, La/e7z;->h1:La/tzi;

    .line 151
    .line 152
    if-eqz v3, :cond_a

    .line 153
    .line 154
    iget-object v3, v3, La/tzi;->f:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, La/wso0;

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_a
    move-object v3, v6

    .line 160
    goto :goto_0

    .line 161
    :cond_b
    :goto_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_c

    .line 166
    .line 167
    return v2

    .line 168
    :cond_c
    return v1
.end method

.method public final dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f2:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f2:Z

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->A(Landroid/view/ViewStructure;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f2:Z

    .line 23
    .line 24
    throw p1
.end method

.method public final dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, La/vx2;->a:La/vx2;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p1, p0}, La/vx2;->a(Landroid/view/ViewStructure;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Y1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X1:La/gx2;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-ne v3, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eq v2, v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Y1:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, La/gx2;->run()V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->n(Landroid/view/MotionEvent;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_e

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v2, 0x2

    .line 68
    if-ne v0, v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->p(Landroid/view/MotionEvent;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->i(Landroid/view/MotionEvent;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    and-int/lit8 v2, v0, 0x2

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 92
    .line 93
    .line 94
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v4, 0x5

    .line 105
    if-ne v2, v4, :cond_6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move v2, v1

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    :goto_2
    move v2, v3

    .line 111
    :goto_3
    const/16 v4, 0x2002

    .line 112
    .line 113
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_9

    .line 118
    .line 119
    const v4, 0x100008

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v4}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move v4, v1

    .line 130
    goto :goto_5

    .line 131
    :cond_9
    :goto_4
    move v4, v3

    .line 132
    :goto_5
    if-eqz v2, :cond_d

    .line 133
    .line 134
    if-eqz v4, :cond_d

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    instance-of v4, v2, Landroid/view/View;

    .line 141
    .line 142
    if-eqz v4, :cond_a

    .line 143
    .line 144
    check-cast v2, Landroid/view/View;

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    const/4 v2, 0x0

    .line 148
    :goto_6
    if-eqz v2, :cond_b

    .line 149
    .line 150
    const v4, 0x7f0a00dc

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-nez v2, :cond_c

    .line 158
    .line 159
    :cond_b
    new-instance v2, La/gy4;

    .line 160
    .line 161
    invoke-direct {v2, v3}, La/gy4;-><init>(I)V

    .line 162
    .line 163
    .line 164
    :cond_c
    new-instance v4, La/gy4;

    .line 165
    .line 166
    invoke-direct {v4, v3}, La/gy4;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_d

    .line 174
    .line 175
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, La/ypq;

    .line 180
    .line 181
    invoke-virtual {v2}, La/ypq;->h()La/nqq;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-eqz v2, :cond_d

    .line 186
    .line 187
    invoke-static {v2}, La/vcc;->Y(La/yzj;)La/s460;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v2}, La/k7x;->C(La/j6z;)La/j6z;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-interface {v4, v2, v3}, La/j6z;->w(La/j6z;Z)La/jge0;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    int-to-long v4, v4

    .line 212
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    int-to-long v6, p1

    .line 217
    const/16 p1, 0x20

    .line 218
    .line 219
    shl-long/2addr v4, p1

    .line 220
    const-wide v8, 0xffffffffL

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    and-long/2addr v6, v8

    .line 226
    or-long/2addr v4, v6

    .line 227
    invoke-virtual {v2, v4, v5}, La/jge0;->a(J)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-nez p1, :cond_d

    .line 232
    .line 233
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {p0}, La/wpq;->a(La/wpq;)V

    .line 238
    .line 239
    .line 240
    :cond_d
    and-int/lit8 p0, v0, 0x1

    .line 241
    .line 242
    if-eqz p0, :cond_e

    .line 243
    .line 244
    return v3

    .line 245
    :cond_e
    :goto_7
    return v1
.end method

.method public final f(Lkotlin/jvm/functions/Function2;La/p460;La/dfv;)La/bg80;
    .locals 7

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    new-instance v0, La/gfv;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v3, p0

    .line 7
    move-object v4, p1

    .line 8
    move-object v5, p2

    .line 9
    move-object v1, p3

    .line 10
    invoke-direct/range {v0 .. v5}, La/gfv;-><init>(La/dfv;La/afv;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    move-object v3, p0

    .line 15
    move-object v4, p1

    .line 16
    move-object v5, p2

    .line 17
    :cond_1
    iget-object p0, v3, Landroidx/compose/ui/platform/AndroidComposeView;->P1:La/fck0;

    .line 18
    .line 19
    iget-object p1, p0, La/fck0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/ref/ReferenceQueue;

    .line 22
    .line 23
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/xz40;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/xz40;->j(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    if-nez p1, :cond_1

    .line 37
    .line 38
    :cond_3
    iget p1, p0, La/xz40;->c:I

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    if-eqz p1, :cond_4

    .line 42
    .line 43
    add-int/lit8 p1, p1, -0x1

    .line 44
    .line 45
    invoke-virtual {p0, p1}, La/xz40;->k(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/ref/Reference;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    move-object p1, p2

    .line 59
    :goto_0
    check-cast p1, La/bg80;

    .line 60
    .line 61
    if-eqz p1, :cond_8

    .line 62
    .line 63
    move-object p0, p1

    .line 64
    check-cast p0, La/gfv;

    .line 65
    .line 66
    iget-object p3, p0, La/gfv;->b:La/afv;

    .line 67
    .line 68
    if-eqz p3, :cond_7

    .line 69
    .line 70
    iget-object v0, p0, La/gfv;->a:La/dfv;

    .line 71
    .line 72
    iget-boolean v0, v0, La/dfv;->s:Z

    .line 73
    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    const-string v0, "layer should have been released before reuse"

    .line 77
    .line 78
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-interface {p3}, La/afv;->b()La/dfv;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    iput-object p3, p0, La/gfv;->a:La/dfv;

    .line 86
    .line 87
    const/4 p3, 0x0

    .line 88
    iput-boolean p3, p0, La/gfv;->g:Z

    .line 89
    .line 90
    iput-object v4, p0, La/gfv;->d:Lkotlin/jvm/functions/Function2;

    .line 91
    .line 92
    iput-object v5, p0, La/gfv;->e:Lkotlin/jvm/functions/Function0;

    .line 93
    .line 94
    iput-boolean p3, p0, La/gfv;->q:Z

    .line 95
    .line 96
    iput-boolean p3, p0, La/gfv;->r:Z

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, La/gfv;->s:Z

    .line 100
    .line 101
    iget-object v0, p0, La/gfv;->h:[F

    .line 102
    .line 103
    invoke-static {v0}, La/ui30;->d([F)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, La/gfv;->i:[F

    .line 107
    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    invoke-static {v0}, La/ui30;->d([F)V

    .line 111
    .line 112
    .line 113
    :cond_6
    sget-wide v0, La/ils0;->b:J

    .line 114
    .line 115
    iput-wide v0, p0, La/gfv;->o:J

    .line 116
    .line 117
    iput-boolean p3, p0, La/gfv;->t:Z

    .line 118
    .line 119
    const-wide v0, 0x7fffffff7fffffffL

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    iput-wide v0, p0, La/gfv;->f:J

    .line 125
    .line 126
    iput-object p2, p0, La/gfv;->p:La/x1x;

    .line 127
    .line 128
    iput p3, p0, La/gfv;->n:I

    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_7
    const-string p0, "currently reuse is only supported when we manage the layer lifecycle"

    .line 132
    .line 133
    invoke-static {p0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    throw p0

    .line 138
    :cond_8
    new-instance v1, La/gfv;

    .line 139
    .line 140
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()La/afv;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-interface {p0}, La/afv;->b()La/dfv;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move-object v6, v5

    .line 149
    move-object v5, v4

    .line 150
    move-object v4, v3

    .line 151
    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()La/afv;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-direct/range {v1 .. v6}, La/gfv;-><init>(La/dfv;La/afv;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    return-object v1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 6

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    const-string v1, "findViewByAccessibilityIdTraversal"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v3, v2, [Ljava/lang/Class;

    .line 13
    .line 14
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v4, v3, v5

    .line 18
    .line 19
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    new-array v1, v2, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    aput-object p1, v1, v5

    .line 33
    .line 34
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    instance-of p1, p0, Landroid/view/View;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    check-cast p0, Landroid/view/View;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_0
    invoke-static {p0, p1}, La/uc9;->S(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    return-object p0

    .line 50
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 4
    .line 5
    iget-boolean v0, v0, La/h7k;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, v0}, La/cy2;->y(Landroid/view/View;Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v1

    .line 39
    :goto_0
    if-ne p1, p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, La/ypq;

    .line 46
    .line 47
    iget-object v2, v2, La/ypq;->c:La/nqq;

    .line 48
    .line 49
    invoke-static {v2}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-static {v2}, La/uzb;->a0(La/nqq;)La/jge0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_2
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {p1, p0}, La/spq;->a(Landroid/view/View;Landroid/view/View;)La/jge0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1, p0}, La/spq;->a(Landroid/view/View;Landroid/view/View;)La/jge0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_4
    :goto_1
    invoke-static {p2}, La/spq;->d(I)La/jpq;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    iget v2, v2, La/jpq;->a:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    const/4 v2, 0x6

    .line 80
    :goto_2
    new-instance v3, La/mie0;

    .line 81
    .line 82
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    new-instance v5, La/cx2;

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-direct {v5, v3, v6}, La/cx2;-><init>(La/mie0;B)V

    .line 93
    .line 94
    .line 95
    check-cast v4, La/ypq;

    .line 96
    .line 97
    invoke-virtual {v4, v2, v1, v5}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-nez v4, :cond_6

    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_6
    iget-object v3, v3, La/mie0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    if-nez v3, :cond_7

    .line 107
    .line 108
    if-nez v0, :cond_c

    .line 109
    .line 110
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_7
    if-nez v0, :cond_8

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    const/4 v4, 0x1

    .line 119
    if-ne v2, v4, :cond_9

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    const/4 v4, 0x2

    .line 123
    if-ne v2, v4, :cond_b

    .line 124
    .line 125
    :goto_3
    sget-boolean v0, La/ebc;->a:Z

    .line 126
    .line 127
    if-eqz v0, :cond_a

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_a
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_b
    check-cast v3, La/nqq;

    .line 136
    .line 137
    invoke-static {v3}, La/uzb;->a0(La/nqq;)La/jge0;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {v0, p0}, La/spq;->a(Landroid/view/View;Landroid/view/View;)La/jge0;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-static {p1, p2, v1, v2}, La/k7n0;->y(La/jge0;La/jge0;La/jge0;I)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_c

    .line 150
    .line 151
    :goto_4
    return-object p0

    .line 152
    :cond_c
    return-object v0

    .line 153
    :cond_d
    :goto_5
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0
.end method

.method public getAccessibilityManager()La/w6;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->k:La/ew2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getAndroidViewsHandler$ui()La/p33;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/p33;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, La/p33;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public getAutofill()La/iw2;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l1:La/iw2;

    return-object p0
.end method

.method public bridge synthetic getAutofill()La/r55;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofill()La/iw2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getAutofillManager()La/jw2;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->m1:La/jw2;

    return-object p0
.end method

.method public bridge synthetic getAutofillManager()La/v55;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getAutofillTree()La/w55;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z:La/w55;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClipboard()La/iuc;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->n:La/iuc;

    .line 6
    .line 7
    return-object p0
.end method

.method public getClipboardManager()La/kuc;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->m:La/c5k;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getComposeViewContext()La/skd;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->get_composeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getComposeViewContextIncrementedDuringInit$ui()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e2:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getConfiguration()Landroid/content/res/Configuration;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j1:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/content/res/Configuration;

    .line 10
    .line 11
    return-object p0
.end method

.method public final getContentCaptureManager$ui()La/iy2;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCoroutineContext()Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n:Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDensity()La/w6k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/w6k;

    .line 10
    .line 11
    return-object p0
.end method

.method public bridge synthetic getDragAndDropManager()La/ddl;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()La/wy2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDragAndDropManager()La/wy2;
    .locals 0

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o:La/wy2;

    return-object p0
.end method

.method public getEmbeddedViewFocusRect()La/jge0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/ypq;

    .line 13
    .line 14
    iget-object p0, p0, La/ypq;->c:La/nqq;

    .line 15
    .line 16
    invoke-static {p0}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, La/uzb;->a0(La/nqq;)La/jge0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v1

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {v0, p0}, La/spq;->a(Landroid/view/View;Landroid/view/View;)La/jge0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    return-object v1
.end method

.method public getFocusOwner()La/wpq;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->m:La/ypq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()La/jge0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, v0, La/jge0;->a:F

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    iget p0, v0, La/jge0;->b:F

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    iget p0, v0, La/jge0;->c:F

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    iget p0, v0, La/jge0;->d:F

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/xd2;

    .line 45
    .line 46
    const/16 v2, 0x19

    .line 47
    .line 48
    invoke-direct {v1, v2}, La/xd2;-><init>(B)V

    .line 49
    .line 50
    .line 51
    check-cast v0, La/ypq;

    .line 52
    .line 53
    const/4 v2, 0x6

    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v2, v3, v1}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    const/high16 p0, -0x80000000

    .line 68
    .line 69
    invoke-virtual {p1, p0, p0, p0, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public getFontFamilyResolver()La/mrq;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I1:La/pz40;

    .line 2
    .line 3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mrq;

    .line 8
    .line 9
    return-object p0
.end method

.method public getFontLoader()La/hrq;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->o:La/hrq;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getFrameEndScheduler$ui()La/jlz;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:La/jlz;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGraphicsContext()La/afv;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y:La/rz2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHapticFeedBack()La/omv;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->q:La/omv;

    .line 6
    .line 7
    return-object p0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    iget-object v0, v0, La/h7k;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/oif0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/oif0;->E()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i:La/xw3;

    .line 14
    .line 15
    invoke-virtual {p0}, La/xw3;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public getImportantForAutofill()I
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public bridge synthetic getInputModeManager()La/afx;
    .locals 0

    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInputModeManager()La/bfx;

    move-result-object p0

    return-object p0
.end method

.method public getInputModeManager()La/bfx;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K1:La/bfx;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, La/bfx;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    :goto_0
    invoke-direct {v0, v1}, La/bfx;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K1:La/bfx;

    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method public final getInsetsListener()La/xfx;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:La/xfx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLayoutDirection()La/k6z;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/k6z;

    .line 10
    .line 11
    return-object p0
.end method

.method public getLayoutNodes()La/ey40;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/ey40;"
        }
    .end annotation

    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t:La/ey40;

    return-object p0
.end method

.method public bridge synthetic getLayoutNodes()La/gkx;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La/ey40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getLocaleList()La/rs00;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k1:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rs00;

    .line 8
    .line 9
    return-object p0
.end method

.method public getMeasureIteration()J
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    iget-boolean p0, p0, La/h7k;->b:Z

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "measureIteration should be only used during the measure/layout pass"

    .line 8
    .line 9
    invoke-static {p0}, La/xcx;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide/16 v0, 0x1

    .line 13
    .line 14
    return-wide v0
.end method

.method public getModifierLocalManager()La/qm40;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L1:La/qm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getOutOfFrameExecutor()La/nd80;
    .locals 0

    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object p0

    return-object p0
.end method

.method public getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getPlacementScope()La/ou90;
    .locals 2

    .line 1
    sget-object v0, La/qu90;->a:La/er90;

    .line 2
    .line 3
    new-instance v0, La/d810;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p0, v1}, La/d810;-><init>(Ljava/lang/Object;B)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final getPlayNavigationSoundEffect$ui()Lkotlin/jvm/functions/Function2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "La/jpq;",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Z1:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPointerIconService()La/cpa0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i2:La/lx2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui()La/v6x;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d:La/v6x;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRectManager()La/oge0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u:La/oge0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetainedValuesStore()La/v9g0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:La/v9g0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRoot()La/e7z;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s:La/e7z;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRootForTest()La/leg0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getSavedStateRegistry()La/owk;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g:La/owk;

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, La/skd;->g()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, La/skd;->e:La/i0h0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v1, Landroid/view/View;

    .line 25
    .line 26
    const v2, 0x7f0a037f

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    instance-of v3, v2, Ljava/lang/String;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v2, v4

    .line 42
    :goto_0
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :cond_1
    const-string v1, "SaveableStateRegistry:"

    .line 53
    .line 54
    invoke-static {v1, v2}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0}, La/i0h0;->h()La/kd30;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, v1}, La/kd30;->H(Ljava/lang/String;)Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v2, La/vbk;

    .line 107
    .line 108
    const/16 v3, 0x14

    .line 109
    .line 110
    invoke-direct {v2, v3}, La/vbk;-><init>(B)V

    .line 111
    .line 112
    .line 113
    sget-object v3, La/hzg0;->a:La/zfn;

    .line 114
    .line 115
    new-instance v3, La/gzg0;

    .line 116
    .line 117
    invoke-direct {v3, v4, v2}, La/gzg0;-><init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, La/kd30;->L(Ljava/lang/String;)La/g0h0;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/4 v4, 0x0

    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    :try_start_0
    new-instance v2, La/ufd;

    .line 129
    .line 130
    const/4 v5, 0x1

    .line 131
    invoke-direct {v2, v3, v5}, La/ufd;-><init>(Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1, v2}, La/kd30;->S(Ljava/lang/String;La/g0h0;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    .line 137
    move v4, v5

    .line 138
    :catch_0
    :goto_2
    new-instance v2, La/owk;

    .line 139
    .line 140
    new-instance v5, La/lf2;

    .line 141
    .line 142
    const/4 v6, 0x6

    .line 143
    invoke-direct {v5, v4, v0, v1, v6}, La/lf2;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v2, v3, v5}, La/owk;-><init>(La/gzg0;La/lf2;)V

    .line 147
    .line 148
    .line 149
    iput-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g:La/owk;

    .line 150
    .line 151
    return-object v2

    .line 152
    :cond_4
    return-object v0
.end method

.method public final getScrollCaptureInProgress()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g2:La/u9h0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, La/u9h0;->a:La/pz40;

    .line 12
    .line 13
    check-cast v0, La/hgk0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    if-eqz p0, :cond_2

    .line 34
    .line 35
    instance-of v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getScrollCaptureInProgress()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public getSemanticsOwner()La/wai0;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v:La/wai0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSharedDrawScope()La/g7z;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->s:La/g7z;

    .line 6
    .line 7
    return-object p0
.end method

.method public getShowLayoutBounds()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, La/ka3;->a:La/ka3;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, La/ka3;->a(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-boolean p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p1:Z

    .line 15
    .line 16
    return p0
.end method

.method public getSnapshotObserver()La/eg80;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o1:La/eg80;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSoftwareKeyboardController()La/pkk0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H1:La/r3k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/r3k;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getTextInputService()La/o8q0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, La/r3k;-><init>(La/o8q0;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H1:La/r3k;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public getTextInputService()La/o8q0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F1:La/o8q0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/o8q0;

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLegacyTextInputServiceAndroid()La/q8q0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, La/o8q0;-><init>(La/qw90;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F1:La/o8q0;

    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public getTextToolbar()La/aaq0;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M1:La/k23;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/k23;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/w5z;

    .line 11
    .line 12
    new-instance v2, La/a13;

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-direct {v2, v0, v3}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, La/w5z;-><init>(La/a13;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/caq0;->a:[La/caq0;

    .line 22
    .line 23
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M1:La/k23;

    .line 24
    .line 25
    :cond_0
    return-object v0
.end method

.method public final getUncaughtExceptionHandler$ui()La/keg0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getViewConfiguration()La/wgu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->r:La/c33;

    .line 6
    .line 7
    return-object p0
.end method

.method public getWindowInfo()La/rhv0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/skd;->t:La/yez;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h(La/e7z;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/h7k;->k(La/e7z;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(Landroid/view/MotionEvent;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->W1:La/mx2;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->C(Landroid/view/MotionEvent;)V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iput-boolean v8, v1, Landroidx/compose/ui/platform/AndroidComposeView;->B1:Z

    .line 16
    .line 17
    invoke-virtual {v1, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->s(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v9, La/hie0;

    .line 21
    .line 22
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v2, "AndroidOwner:onTouch"

    .line 26
    .line 27
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 28
    .line 29
    .line 30
    :try_start_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 35
    .line 36
    const/4 v11, 0x3

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 40
    .line 41
    .line 42
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    if-ne v3, v11, :cond_0

    .line 44
    .line 45
    move v12, v8

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v12, v7

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    goto/16 :goto_10

    .line 51
    .line 52
    :goto_0
    const/16 v13, 0xa

    .line 53
    .line 54
    iget-object v14, v1, Landroidx/compose/ui/platform/AndroidComposeView;->i1:La/td9;

    .line 55
    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    :try_start_2
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-ne v3, v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eq v3, v4, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move v3, v7

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    :goto_1
    move v3, v8

    .line 82
    :goto_2
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    :cond_3
    move-object v15, v2

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    const/4 v4, 0x2

    .line 99
    if-eq v3, v4, :cond_3

    .line 100
    .line 101
    const/4 v4, 0x6

    .line 102
    if-eq v3, v4, :cond_3

    .line 103
    .line 104
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eq v3, v13, :cond_5

    .line 109
    .line 110
    if-eqz v12, :cond_5

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    const/4 v6, 0x1

    .line 117
    const/16 v3, 0xa

    .line 118
    .line 119
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->J(Landroid/view/MotionEvent;IJZ)V

    .line 120
    .line 121
    .line 122
    move-object v15, v2

    .line 123
    goto :goto_4

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    move-object/from16 v1, p0

    .line 126
    .line 127
    goto/16 :goto_10

    .line 128
    .line 129
    :cond_5
    move-object v15, v2

    .line 130
    goto :goto_4

    .line 131
    :goto_3
    iget-boolean v1, v14, La/td9;->a:Z

    .line 132
    .line 133
    if-nez v1, :cond_6

    .line 134
    .line 135
    iget-object v1, v14, La/td9;->d:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, La/pv00;

    .line 138
    .line 139
    iget-object v1, v1, La/pv00;->a:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, La/u710;

    .line 142
    .line 143
    invoke-virtual {v1}, La/u710;->a()V

    .line 144
    .line 145
    .line 146
    iget-object v1, v14, La/td9;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, La/oaw;

    .line 149
    .line 150
    invoke-virtual {v1}, La/oaw;->c()V

    .line 151
    .line 152
    .line 153
    :cond_6
    :goto_4
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-ne v1, v11, :cond_7

    .line 158
    .line 159
    move v1, v8

    .line 160
    goto :goto_5

    .line 161
    :cond_7
    move v1, v7

    .line 162
    :goto_5
    const/16 v2, 0x9

    .line 163
    .line 164
    if-nez v12, :cond_8

    .line 165
    .line 166
    if-eqz v1, :cond_8

    .line 167
    .line 168
    if-eq v10, v11, :cond_8

    .line 169
    .line 170
    if-eq v10, v2, :cond_8

    .line 171
    .line 172
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->o(Landroid/view/MotionEvent;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_8

    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 179
    .line 180
    .line 181
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 182
    const/4 v6, 0x1

    .line 183
    const/16 v3, 0x9

    .line 184
    .line 185
    move v1, v2

    .line 186
    move-object v2, v0

    .line 187
    move v0, v1

    .line 188
    move-object/from16 v1, p0

    .line 189
    .line 190
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->J(Landroid/view/MotionEvent;IJZ)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    move-object/from16 v1, p0

    .line 195
    .line 196
    move v0, v2

    .line 197
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_9

    .line 202
    .line 203
    move v2, v8

    .line 204
    goto :goto_7

    .line 205
    :cond_9
    move v2, v7

    .line 206
    :goto_7
    const/16 v3, 0x8

    .line 207
    .line 208
    if-ne v10, v3, :cond_a

    .line 209
    .line 210
    if-nez v2, :cond_a

    .line 211
    .line 212
    if-eqz v15, :cond_a

    .line 213
    .line 214
    const/16 v2, 0x1002

    .line 215
    .line 216
    invoke-virtual {v15, v2}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_a

    .line 221
    .line 222
    iput-boolean v8, v9, La/hie0;->a:Z

    .line 223
    .line 224
    :cond_a
    if-eqz v15, :cond_b

    .line 225
    .line 226
    invoke-virtual {v15}, Landroid/view/MotionEvent;->recycle()V

    .line 227
    .line 228
    .line 229
    :cond_b
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 230
    .line 231
    if-eqz v2, :cond_16

    .line 232
    .line 233
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getAction()I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-ne v2, v13, :cond_16

    .line 238
    .line 239
    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 240
    .line 241
    if-eqz v2, :cond_c

    .line 242
    .line 243
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    goto :goto_8

    .line 248
    :cond_c
    const/4 v2, -0x1

    .line 249
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 250
    .line 251
    .line 252
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 253
    iget-object v4, v1, Landroidx/compose/ui/platform/AndroidComposeView;->h1:La/ns40;

    .line 254
    .line 255
    if-ne v3, v0, :cond_d

    .line 256
    .line 257
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_d

    .line 262
    .line 263
    if-ltz v2, :cond_16

    .line 264
    .line 265
    iget-object v0, v4, La/ns40;->c:Landroid/util/SparseBooleanArray;

    .line 266
    .line 267
    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 268
    .line 269
    .line 270
    iget-object v0, v4, La/ns40;->b:Landroid/util/SparseLongArray;

    .line 271
    .line 272
    invoke-virtual {v0, v2}, Landroid/util/SparseLongArray;->delete(I)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_d

    .line 276
    .line 277
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_16

    .line 282
    .line 283
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_16

    .line 288
    .line 289
    iget-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 290
    .line 291
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 292
    .line 293
    if-eqz v0, :cond_e

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    goto :goto_9

    .line 300
    :cond_e
    move v0, v3

    .line 301
    :goto_9
    iget-object v5, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 302
    .line 303
    if-eqz v5, :cond_f

    .line 304
    .line 305
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    :cond_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    cmpg-float v0, v0, v5

    .line 318
    .line 319
    if-nez v0, :cond_10

    .line 320
    .line 321
    cmpg-float v0, v3, v6

    .line 322
    .line 323
    if-nez v0, :cond_10

    .line 324
    .line 325
    move v0, v7

    .line 326
    goto :goto_a

    .line 327
    :cond_10
    move v0, v8

    .line 328
    :goto_a
    iget-object v3, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 329
    .line 330
    if-eqz v3, :cond_11

    .line 331
    .line 332
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    .line 333
    .line 334
    .line 335
    move-result-wide v5

    .line 336
    goto :goto_b

    .line 337
    :cond_11
    const-wide/16 v5, -0x1

    .line 338
    .line 339
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 340
    .line 341
    .line 342
    move-result-wide v10

    .line 343
    cmp-long v3, v5, v10

    .line 344
    .line 345
    if-eqz v3, :cond_12

    .line 346
    .line 347
    move v3, v8

    .line 348
    goto :goto_c

    .line 349
    :cond_12
    move v3, v7

    .line 350
    :goto_c
    if-nez v0, :cond_13

    .line 351
    .line 352
    if-eqz v3, :cond_16

    .line 353
    .line 354
    :cond_13
    if-ltz v2, :cond_14

    .line 355
    .line 356
    iget-object v0, v4, La/ns40;->c:Landroid/util/SparseBooleanArray;

    .line 357
    .line 358
    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 359
    .line 360
    .line 361
    iget-object v0, v4, La/ns40;->b:Landroid/util/SparseLongArray;

    .line 362
    .line 363
    invoke-virtual {v0, v2}, Landroid/util/SparseLongArray;->delete(I)V

    .line 364
    .line 365
    .line 366
    :cond_14
    iget-object v0, v14, La/td9;->c:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, La/oaw;

    .line 369
    .line 370
    iget-boolean v2, v0, La/oaw;->d:Z

    .line 371
    .line 372
    if-eqz v2, :cond_15

    .line 373
    .line 374
    iput-boolean v8, v0, La/oaw;->d:Z

    .line 375
    .line 376
    goto :goto_d

    .line 377
    :cond_15
    iget-object v0, v0, La/oaw;->g:La/x460;

    .line 378
    .line 379
    iget-object v0, v0, La/x460;->a:La/xz40;

    .line 380
    .line 381
    invoke-virtual {v0}, La/xz40;->g()V

    .line 382
    .line 383
    .line 384
    :cond_16
    :goto_d
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iput-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 389
    .line 390
    iget-boolean v0, v9, La/hie0;->a:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 391
    .line 392
    if-eqz v0, :cond_17

    .line 393
    .line 394
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 395
    .line 396
    .line 397
    move-result-wide v4

    .line 398
    const/4 v6, 0x1

    .line 399
    const/16 v3, 0xa

    .line 400
    .line 401
    move-object/from16 v2, p1

    .line 402
    .line 403
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->J(Landroid/view/MotionEvent;IJZ)V

    .line 404
    .line 405
    .line 406
    :cond_17
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->I(Landroid/view/MotionEvent;)I

    .line 407
    .line 408
    .line 409
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 410
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 411
    .line 412
    .line 413
    and-int/lit8 v1, v0, 0x4

    .line 414
    .line 415
    if-eqz v1, :cond_19

    .line 416
    .line 417
    :cond_18
    move-object/from16 v1, p0

    .line 418
    .line 419
    goto :goto_f

    .line 420
    :cond_19
    iget-boolean v1, v9, La/hie0;->a:Z

    .line 421
    .line 422
    if-eqz v1, :cond_18

    .line 423
    .line 424
    iget-object v1, v14, La/td9;->c:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v1, La/oaw;

    .line 427
    .line 428
    iget-boolean v2, v1, La/oaw;->d:Z

    .line 429
    .line 430
    if-eqz v2, :cond_1a

    .line 431
    .line 432
    iput-boolean v8, v1, La/oaw;->d:Z

    .line 433
    .line 434
    goto :goto_e

    .line 435
    :cond_1a
    iget-object v1, v1, La/oaw;->g:La/x460;

    .line 436
    .line 437
    iget-object v1, v1, La/x460;->a:La/xz40;

    .line 438
    .line 439
    invoke-virtual {v1}, La/xz40;->g()V

    .line 440
    .line 441
    .line 442
    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 443
    .line 444
    .line 445
    move-result-wide v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 446
    const/4 v6, 0x1

    .line 447
    const/16 v3, 0x9

    .line 448
    .line 449
    move-object/from16 v1, p0

    .line 450
    .line 451
    move-object/from16 v2, p1

    .line 452
    .line 453
    :try_start_7
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->J(Landroid/view/MotionEvent;IJZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 454
    .line 455
    .line 456
    goto :goto_f

    .line 457
    :catchall_2
    move-exception v0

    .line 458
    goto :goto_11

    .line 459
    :catchall_3
    move-exception v0

    .line 460
    move-object/from16 v1, p0

    .line 461
    .line 462
    goto :goto_11

    .line 463
    :goto_f
    iput-boolean v7, v1, Landroidx/compose/ui/platform/AndroidComposeView;->B1:Z

    .line 464
    .line 465
    return v0

    .line 466
    :goto_10
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 467
    .line 468
    .line 469
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 470
    :goto_11
    iput-boolean v7, v1, Landroidx/compose/ui/platform/AndroidComposeView;->B1:Z

    .line 471
    .line 472
    throw v0
.end method

.method public final k(La/e7z;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, La/h7k;->B(La/e7z;Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, La/e7z;->A()La/xz40;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p1, La/xz40;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    iget p1, p1, La/xz40;->c:I

    .line 14
    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    aget-object v2, v0, v1

    .line 18
    .line 19
    check-cast v2, La/e7z;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->k(La/e7z;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final o(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v2, v1, v0

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    cmpg-float v0, v0, v2

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    cmpg-float v0, v1, p1

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-float p0, p0

    .line 32
    cmpg-float p0, p1, p0

    .line 33
    .line 34
    if-gtz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 8

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, La/e7z;->I()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, La/e7z;->c(La/cg80;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setAttached(Z)V

    .line 23
    .line 24
    .line 25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x1e

    .line 28
    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    invoke-static {}, La/uc9;->W()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:La/xfx;

    .line 39
    .line 40
    invoke-virtual {v1, p0}, La/xfx;->onViewAttachedToWindow(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e2:Z

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, La/skd;->e()V

    .line 52
    .line 53
    .line 54
    :cond_2
    const/4 v1, 0x0

    .line 55
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e2:Z

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->k(La/e7z;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->j(La/e7z;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La/eg80;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v2, v2, La/eg80;->a:La/pgk0;

    .line 76
    .line 77
    invoke-virtual {v2}, La/pgk0;->e()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_f

    .line 85
    .line 86
    new-instance v3, La/bx2;

    .line 87
    .line 88
    invoke-direct {v3, p0, v0}, La/bx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->F(Lkotlin/jvm/functions/Function0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, La/skd;->d()La/clz;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, La/skd;->g()V

    .line 107
    .line 108
    .line 109
    iget-object v3, v3, La/skd;->f:La/riu0;

    .line 110
    .line 111
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:La/jlz;

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    if-eqz v2, :cond_9

    .line 115
    .line 116
    if-eqz v3, :cond_9

    .line 117
    .line 118
    if-nez v4, :cond_3

    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :cond_3
    invoke-interface {v3}, La/riu0;->g()La/piu0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    new-instance v3, La/niu0;

    .line 127
    .line 128
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    sget-object v4, La/vbf;->b:La/vbf;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v6, La/h0q0;

    .line 140
    .line 141
    invoke-direct {v6, v2, v3, v4}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 142
    .line 143
    .line 144
    const-class v2, La/llz;

    .line 145
    .line 146
    sget-object v3, La/sre0;->a:La/tre0;

    .line 147
    .line 148
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-interface {v2}, La/sgy;->v()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-eqz v3, :cond_8

    .line 157
    .line 158
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 159
    .line 160
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v6, v2, v3}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, La/llz;

    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    check-cast v3, Landroid/view/View;

    .line 178
    .line 179
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    iget-object v2, v2, La/llz;->b:La/ey40;

    .line 184
    .line 185
    invoke-virtual {v2, v3}, La/gkx;->b(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-nez v4, :cond_4

    .line 190
    .line 191
    new-instance v4, La/vy40;

    .line 192
    .line 193
    invoke-direct {v4, v0}, La/vy40;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v3, v4}, La/ey40;->j(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_4
    check-cast v4, La/vy40;

    .line 200
    .line 201
    iget-object v2, v4, La/vy40;->a:[Ljava/lang/Object;

    .line 202
    .line 203
    iget v3, v4, La/vy40;->b:I

    .line 204
    .line 205
    :goto_0
    if-ge v1, v3, :cond_6

    .line 206
    .line 207
    aget-object v6, v2, v1

    .line 208
    .line 209
    move-object v7, v6

    .line 210
    check-cast v7, La/klz;

    .line 211
    .line 212
    iget-boolean v7, v7, La/klz;->c:Z

    .line 213
    .line 214
    if-nez v7, :cond_5

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_6
    move-object v6, v5

    .line 221
    :goto_1
    check-cast v6, La/klz;

    .line 222
    .line 223
    if-nez v6, :cond_7

    .line 224
    .line 225
    new-instance v6, La/klz;

    .line 226
    .line 227
    invoke-direct {v6}, La/klz;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v6}, La/vy40;->a(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_7
    iput-boolean v0, v6, La/klz;->c:Z

    .line 234
    .line 235
    iput-object v6, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f:La/klz;

    .line 236
    .line 237
    iget-object v1, v6, La/klz;->b:La/bzu;

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_8
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 241
    .line 242
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_9
    :goto_2
    move-object v1, v5

    .line 247
    :goto_3
    if-nez v1, :cond_a

    .line 248
    .line 249
    sget-object v1, La/rv00;->p:La/rv00;

    .line 250
    .line 251
    :cond_a
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h:La/v9g0;

    .line 252
    .line 253
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D1:Lkotlin/jvm/functions/Function1;

    .line 254
    .line 255
    if-eqz v1, :cond_b

    .line 256
    .line 257
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    iput-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D1:Lkotlin/jvm/functions/Function1;

    .line 265
    .line 266
    :cond_b
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v1}, La/skd;->d()La/clz;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-virtual {v1, p0}, La/glz;->a(La/blz;)V

    .line 279
    .line 280
    .line 281
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 282
    .line 283
    invoke-virtual {v1, v2}, La/glz;->a(La/blz;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInputModeManager()La/bfx;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_c

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_c
    const/4 v0, 0x2

    .line 298
    :goto_4
    iget-object v1, v1, La/bfx;->a:La/pz40;

    .line 299
    .line 300
    new-instance v2, La/zex;

    .line 301
    .line 302
    invoke-direct {v2, v0}, La/zex;-><init>(I)V

    .line 303
    .line 304
    .line 305
    check-cast v1, La/hgk0;

    .line 306
    .line 307
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 329
    .line 330
    .line 331
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 332
    .line 333
    const/16 v1, 0x1f

    .line 334
    .line 335
    if-lt v0, v1, :cond_d

    .line 336
    .line 337
    sget-object v0, La/zx2;->a:La/zx2;

    .line 338
    .line 339
    invoke-virtual {v0, p0}, La/zx2;->b(Landroid/view/View;)V

    .line 340
    .line 341
    .line 342
    :cond_d
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-eqz v0, :cond_e

    .line 347
    .line 348
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, La/ypq;

    .line 353
    .line 354
    iget-object v1, v1, La/ypq;->g:La/vy40;

    .line 355
    .line 356
    invoke-virtual {v1, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()La/wai0;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    iget-object v1, v1, La/wai0;->d:La/vy40;

    .line 364
    .line 365
    invoke-virtual {v1, v0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_e
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, La/ypq;

    .line 373
    .line 374
    iget-object v0, v0, La/ypq;->g:La/vy40;

    .line 375
    .line 376
    invoke-virtual {v0, p0}, La/vy40;->a(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :cond_f
    const-string p0, "Expected the view to be attached to window."

    .line 381
    .line 382
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    return-void
.end method

.method public final onCheckIsTextEditor()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G1:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/bki0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, La/bki0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    check-cast v0, La/c13;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLegacyTextInputServiceAndroid()La/q8q0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-boolean p0, p0, La/q8q0;->d:Z

    .line 25
    .line 26
    return p0

    .line 27
    :cond_1
    iget-object p0, v0, La/c13;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/bki0;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, La/bki0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    :cond_2
    check-cast v1, La/yex;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-boolean p0, v1, La/yex;->e:Z

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    xor-int/2addr p0, v0

    .line 47
    if-ne p0, v0, :cond_3

    .line 48
    .line 49
    return v0

    .line 50
    :cond_3
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->L(Landroid/content/res/Configuration;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->G1:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, La/bki0;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v2, v2, La/bki0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    check-cast v2, La/c13;

    .line 20
    .line 21
    const/16 v4, 0xf

    .line 22
    .line 23
    if-nez v2, :cond_2a

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLegacyTextInputServiceAndroid()La/q8q0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-boolean v2, v0, La/q8q0;->d:Z

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    goto/16 :goto_b

    .line 36
    .line 37
    :cond_1
    iget-object v2, v0, La/q8q0;->h:La/k3x;

    .line 38
    .line 39
    iget-object v6, v0, La/q8q0;->g:La/a8q0;

    .line 40
    .line 41
    iget v7, v2, La/k3x;->e:I

    .line 42
    .line 43
    iget-boolean v8, v2, La/k3x;->a:Z

    .line 44
    .line 45
    const/4 v9, 0x7

    .line 46
    const/4 v10, 0x5

    .line 47
    const/4 v11, 0x4

    .line 48
    const/4 v12, 0x6

    .line 49
    const/4 v13, 0x3

    .line 50
    const/4 v14, 0x2

    .line 51
    const/4 v15, 0x1

    .line 52
    if-ne v7, v15, :cond_3

    .line 53
    .line 54
    if-eqz v8, :cond_2

    .line 55
    .line 56
    :goto_1
    move v3, v12

    .line 57
    :goto_2
    const/16 v16, 0x0

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    const/16 v16, 0x0

    .line 61
    .line 62
    move/from16 v3, v16

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    if-nez v7, :cond_4

    .line 66
    .line 67
    move v3, v15

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    if-ne v7, v14, :cond_5

    .line 70
    .line 71
    move v3, v14

    .line 72
    goto :goto_2

    .line 73
    :cond_5
    if-ne v7, v12, :cond_6

    .line 74
    .line 75
    move v3, v10

    .line 76
    goto :goto_2

    .line 77
    :cond_6
    if-ne v7, v10, :cond_7

    .line 78
    .line 79
    move v3, v9

    .line 80
    goto :goto_2

    .line 81
    :cond_7
    if-ne v7, v13, :cond_8

    .line 82
    .line 83
    move v3, v13

    .line 84
    goto :goto_2

    .line 85
    :cond_8
    if-ne v7, v11, :cond_9

    .line 86
    .line 87
    move v3, v11

    .line 88
    goto :goto_2

    .line 89
    :cond_9
    if-ne v7, v9, :cond_29

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :goto_3
    iput v3, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 93
    .line 94
    iget v5, v2, La/k3x;->d:I

    .line 95
    .line 96
    if-ne v5, v15, :cond_a

    .line 97
    .line 98
    iput v15, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 99
    .line 100
    :goto_4
    move v11, v15

    .line 101
    goto/16 :goto_6

    .line 102
    .line 103
    :cond_a
    if-ne v5, v14, :cond_b

    .line 104
    .line 105
    iput v15, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 106
    .line 107
    const/high16 v4, -0x80000000

    .line 108
    .line 109
    or-int/2addr v3, v4

    .line 110
    iput v3, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_b
    if-ne v5, v13, :cond_c

    .line 114
    .line 115
    iput v14, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 116
    .line 117
    move v11, v14

    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_c
    if-ne v5, v11, :cond_d

    .line 121
    .line 122
    iput v13, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 123
    .line 124
    :goto_5
    move v11, v13

    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :cond_d
    const/16 v13, 0x11

    .line 128
    .line 129
    if-ne v5, v10, :cond_e

    .line 130
    .line 131
    iput v13, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_e
    if-ne v5, v12, :cond_f

    .line 135
    .line 136
    const/16 v11, 0x21

    .line 137
    .line 138
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 139
    .line 140
    goto/16 :goto_6

    .line 141
    .line 142
    :cond_f
    if-ne v5, v9, :cond_10

    .line 143
    .line 144
    const/16 v11, 0x81

    .line 145
    .line 146
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_10
    const/16 v9, 0x8

    .line 151
    .line 152
    const/16 v10, 0x12

    .line 153
    .line 154
    if-ne v5, v9, :cond_11

    .line 155
    .line 156
    iput v10, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 157
    .line 158
    move v11, v10

    .line 159
    goto/16 :goto_6

    .line 160
    .line 161
    :cond_11
    const/16 v9, 0x9

    .line 162
    .line 163
    if-ne v5, v9, :cond_12

    .line 164
    .line 165
    const/16 v11, 0x2002

    .line 166
    .line 167
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_12
    const/16 v9, 0xa

    .line 172
    .line 173
    if-ne v5, v9, :cond_13

    .line 174
    .line 175
    const/16 v11, 0x91

    .line 176
    .line 177
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 178
    .line 179
    goto/16 :goto_6

    .line 180
    .line 181
    :cond_13
    const/16 v9, 0xb

    .line 182
    .line 183
    if-ne v5, v9, :cond_14

    .line 184
    .line 185
    const/16 v11, 0x71

    .line 186
    .line 187
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 188
    .line 189
    goto/16 :goto_6

    .line 190
    .line 191
    :cond_14
    const/16 v9, 0xc

    .line 192
    .line 193
    if-ne v5, v9, :cond_15

    .line 194
    .line 195
    const/16 v11, 0x61

    .line 196
    .line 197
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 198
    .line 199
    goto/16 :goto_6

    .line 200
    .line 201
    :cond_15
    const/16 v9, 0xd

    .line 202
    .line 203
    if-ne v5, v9, :cond_16

    .line 204
    .line 205
    const/16 v11, 0x31

    .line 206
    .line 207
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 208
    .line 209
    goto/16 :goto_6

    .line 210
    .line 211
    :cond_16
    const/16 v9, 0xe

    .line 212
    .line 213
    if-ne v5, v9, :cond_17

    .line 214
    .line 215
    const/16 v11, 0x41

    .line 216
    .line 217
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_17
    if-ne v5, v4, :cond_18

    .line 221
    .line 222
    const/16 v11, 0x51

    .line 223
    .line 224
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_18
    const/16 v4, 0x10

    .line 228
    .line 229
    if-ne v5, v4, :cond_19

    .line 230
    .line 231
    const/16 v11, 0xb1

    .line 232
    .line 233
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_19
    if-ne v5, v13, :cond_1a

    .line 237
    .line 238
    const/16 v11, 0xc1

    .line 239
    .line 240
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_1a
    if-ne v5, v10, :cond_1b

    .line 244
    .line 245
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_1b
    const/16 v4, 0x13

    .line 249
    .line 250
    const/16 v11, 0x14

    .line 251
    .line 252
    if-ne v5, v4, :cond_1c

    .line 253
    .line 254
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_1c
    if-ne v5, v11, :cond_1d

    .line 258
    .line 259
    const/16 v11, 0x24

    .line 260
    .line 261
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_1d
    const/16 v4, 0x15

    .line 265
    .line 266
    if-ne v5, v4, :cond_1e

    .line 267
    .line 268
    const/16 v11, 0x1002

    .line 269
    .line 270
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_1e
    const/16 v4, 0x16

    .line 274
    .line 275
    if-ne v5, v4, :cond_1f

    .line 276
    .line 277
    const/16 v11, 0x3002

    .line 278
    .line 279
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_1f
    const/16 v4, 0x17

    .line 283
    .line 284
    if-ne v5, v4, :cond_20

    .line 285
    .line 286
    const/16 v11, 0x2012

    .line 287
    .line 288
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_20
    const/16 v4, 0x18

    .line 292
    .line 293
    if-ne v5, v4, :cond_21

    .line 294
    .line 295
    const/16 v11, 0x1012

    .line 296
    .line 297
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_21
    const/16 v4, 0x19

    .line 301
    .line 302
    if-ne v5, v4, :cond_28

    .line 303
    .line 304
    const/16 v11, 0x3012

    .line 305
    .line 306
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 307
    .line 308
    :goto_6
    if-nez v8, :cond_22

    .line 309
    .line 310
    and-int/lit8 v4, v11, 0xf

    .line 311
    .line 312
    if-ne v4, v15, :cond_22

    .line 313
    .line 314
    const/high16 v4, 0x20000

    .line 315
    .line 316
    or-int/2addr v11, v4

    .line 317
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 318
    .line 319
    if-ne v7, v15, :cond_22

    .line 320
    .line 321
    const/high16 v4, 0x40000000    # 2.0f

    .line 322
    .line 323
    or-int/2addr v3, v4

    .line 324
    iput v3, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 325
    .line 326
    :cond_22
    and-int/lit8 v3, v11, 0xf

    .line 327
    .line 328
    if-ne v3, v15, :cond_26

    .line 329
    .line 330
    iget v3, v2, La/k3x;->b:I

    .line 331
    .line 332
    if-ne v3, v15, :cond_23

    .line 333
    .line 334
    or-int/lit16 v11, v11, 0x1000

    .line 335
    .line 336
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_23
    if-ne v3, v14, :cond_24

    .line 340
    .line 341
    or-int/lit16 v11, v11, 0x2000

    .line 342
    .line 343
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_24
    const/4 v4, 0x3

    .line 347
    if-ne v3, v4, :cond_25

    .line 348
    .line 349
    or-int/lit16 v11, v11, 0x4000

    .line 350
    .line 351
    iput v11, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 352
    .line 353
    :cond_25
    :goto_7
    iget-boolean v2, v2, La/k3x;->c:Z

    .line 354
    .line 355
    if-eqz v2, :cond_26

    .line 356
    .line 357
    const v2, 0x8000

    .line 358
    .line 359
    .line 360
    or-int/2addr v2, v11

    .line 361
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 362
    .line 363
    :cond_26
    iget-wide v2, v6, La/a8q0;->b:J

    .line 364
    .line 365
    sget v4, La/o9q0;->c:I

    .line 366
    .line 367
    const/16 v4, 0x20

    .line 368
    .line 369
    shr-long v4, v2, v4

    .line 370
    .line 371
    long-to-int v4, v4

    .line 372
    iput v4, v1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 373
    .line 374
    const-wide v4, 0xffffffffL

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    and-long/2addr v2, v4

    .line 380
    long-to-int v2, v2

    .line 381
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 382
    .line 383
    iget-object v2, v6, La/a8q0;->a:La/j83;

    .line 384
    .line 385
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {v1, v2}, La/nnw0;->H(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 388
    .line 389
    .line 390
    iget v2, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 391
    .line 392
    const/high16 v3, 0x2000000

    .line 393
    .line 394
    or-int/2addr v2, v3

    .line 395
    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 396
    .line 397
    invoke-static {}, La/qsn;->d()Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-nez v2, :cond_27

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_27
    invoke-static {}, La/qsn;->a()La/qsn;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v2, v1}, La/qsn;->i(Landroid/view/inputmethod/EditorInfo;)V

    .line 409
    .line 410
    .line 411
    :goto_8
    iget-object v1, v0, La/q8q0;->g:La/a8q0;

    .line 412
    .line 413
    iget-object v2, v0, La/q8q0;->h:La/k3x;

    .line 414
    .line 415
    iget-boolean v2, v2, La/k3x;->c:Z

    .line 416
    .line 417
    new-instance v3, La/ilp0;

    .line 418
    .line 419
    invoke-direct {v3, v0}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    new-instance v4, La/gge0;

    .line 423
    .line 424
    invoke-direct {v4, v1, v3, v2}, La/gge0;-><init>(La/a8q0;La/ilp0;Z)V

    .line 425
    .line 426
    .line 427
    iget-object v0, v0, La/q8q0;->i:Ljava/util/ArrayList;

    .line 428
    .line 429
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 430
    .line 431
    invoke-direct {v1, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    return-object v4

    .line 438
    :cond_28
    const-string v0, "Invalid Keyboard Type"

    .line 439
    .line 440
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-object v16

    .line 444
    :cond_29
    const/16 v16, 0x0

    .line 445
    .line 446
    const-string v0, "invalid ImeAction"

    .line 447
    .line 448
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    return-object v16

    .line 452
    :cond_2a
    const/16 v16, 0x0

    .line 453
    .line 454
    iget-object v0, v2, La/c13;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    check-cast v0, La/bki0;

    .line 461
    .line 462
    if-eqz v0, :cond_2b

    .line 463
    .line 464
    iget-object v0, v0, La/bki0;->b:Ljava/lang/Object;

    .line 465
    .line 466
    goto :goto_9

    .line 467
    :cond_2b
    move-object/from16 v0, v16

    .line 468
    .line 469
    :goto_9
    check-cast v0, La/yex;

    .line 470
    .line 471
    if-eqz v0, :cond_2f

    .line 472
    .line 473
    iget-object v2, v0, La/yex;->c:Ljava/lang/Object;

    .line 474
    .line 475
    monitor-enter v2

    .line 476
    :try_start_0
    iget-boolean v3, v0, La/yex;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 477
    .line 478
    if-eqz v3, :cond_2c

    .line 479
    .line 480
    monitor-exit v2

    .line 481
    return-object v16

    .line 482
    :cond_2c
    :try_start_1
    iget-object v3, v0, La/yex;->a:La/ejz;

    .line 483
    .line 484
    invoke-virtual {v3, v1}, La/ejz;->a(Landroid/view/inputmethod/EditorInfo;)La/hge0;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    new-instance v3, La/adw;

    .line 489
    .line 490
    invoke-direct {v3, v0, v4}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 491
    .line 492
    .line 493
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 494
    .line 495
    const/16 v5, 0x22

    .line 496
    .line 497
    if-lt v4, v5, :cond_2d

    .line 498
    .line 499
    new-instance v4, La/s860;

    .line 500
    .line 501
    invoke-direct {v4, v1, v3}, La/q860;-><init>(La/hge0;La/adw;)V

    .line 502
    .line 503
    .line 504
    goto :goto_a

    .line 505
    :cond_2d
    const/16 v5, 0x19

    .line 506
    .line 507
    if-lt v4, v5, :cond_2e

    .line 508
    .line 509
    new-instance v4, La/r860;

    .line 510
    .line 511
    invoke-direct {v4, v1, v3}, La/q860;-><init>(La/hge0;La/adw;)V

    .line 512
    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_2e
    new-instance v4, La/q860;

    .line 516
    .line 517
    invoke-direct {v4, v1, v3}, La/q860;-><init>(La/hge0;La/adw;)V

    .line 518
    .line 519
    .line 520
    :goto_a
    iget-object v0, v0, La/yex;->d:La/xz40;

    .line 521
    .line 522
    new-instance v1, La/g1v0;

    .line 523
    .line 524
    invoke-direct {v1, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0, v1}, La/xz40;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 528
    .line 529
    .line 530
    monitor-exit v2

    .line 531
    return-object v4

    .line 532
    :catchall_0
    move-exception v0

    .line 533
    monitor-exit v2

    .line 534
    throw v0

    .line 535
    :cond_2f
    :goto_b
    return-object v16
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p3}, La/gy2;->h(La/iy2;[JLjava/util/function/Consumer;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 10

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setAttached(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r:La/xfx;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, La/xfx;->onViewDetachedFromWindow(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->m()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x1c

    .line 29
    .line 30
    if-le v1, v2, :cond_1

    .line 31
    .line 32
    sget-object v2, Landroidx/compose/ui/platform/AndroidComposeView;->m2:La/vy40;

    .line 33
    .line 34
    monitor-enter v2

    .line 35
    :try_start_0
    invoke-virtual {v2, p0}, La/vy40;->k(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v2

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    monitor-exit v2

    .line 43
    throw p0

    .line 44
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, La/skd;->b()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La/eg80;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v2, v2, La/eg80;->a:La/pgk0;

    .line 56
    .line 57
    iget-object v3, v2, La/pgk0;->h:La/jk8;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    invoke-virtual {v3}, La/jk8;->a()V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {v2}, La/pgk0;->a()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, La/skd;->d()La/clz;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, La/glz;->f(La/blz;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p0}, La/glz;->f(La/blz;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f:La/klz;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    iput-boolean v0, v2, La/klz;->c:Z

    .line 113
    .line 114
    :cond_3
    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f:La/klz;

    .line 116
    .line 117
    const/16 v2, 0x1f

    .line 118
    .line 119
    if-lt v1, v2, :cond_4

    .line 120
    .line 121
    sget-object v1, La/zx2;->a:La/zx2;

    .line 122
    .line 123
    invoke-virtual {v1, p0}, La/zx2;->a(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()La/wai0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-object v2, v2, La/wai0;->d:La/vy40;

    .line 137
    .line 138
    invoke-virtual {v2, v1}, La/vy40;->k(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, La/ypq;

    .line 146
    .line 147
    iget-object v2, v2, La/ypq;->g:La/vy40;

    .line 148
    .line 149
    invoke-virtual {v2, v1}, La/vy40;->k(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :cond_5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v2, v1, La/oge0;->d:La/vn00;

    .line 157
    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    const-wide/16 v3, 0x0

    .line 161
    .line 162
    const-wide/16 v5, 0x0

    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    invoke-virtual/range {v2 .. v9}, La/vn00;->b(JJ[FII)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    iput-boolean v2, v1, La/oge0;->g:Z

    .line 170
    .line 171
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1}, La/oge0;->a()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iget-object v2, v1, La/oge0;->i:La/fx2;

    .line 183
    .line 184
    if-eqz v2, :cond_6

    .line 185
    .line 186
    iget-object v3, v1, La/oge0;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 187
    .line 188
    invoke-virtual {v3, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 189
    .line 190
    .line 191
    iput-object v0, v1, La/oge0;->i:La/fx2;

    .line 192
    .line 193
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, La/ypq;

    .line 198
    .line 199
    iget-object v0, v0, La/ypq;->g:La/vy40;

    .line 200
    .line 201
    invoke-virtual {v0, p0}, La/vy40;->k(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/ypq;

    .line 17
    .line 18
    iget-object p1, p0, La/ypq;->c:La/nqq;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-static {p1, p2}, La/qzb;->R0(La/nqq;Z)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p0, p2}, La/ypq;->k(La/nqq;)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    sget-object p0, La/iqq;->a:La/iqq;

    .line 41
    .line 42
    sget-object p2, La/iqq;->c:La/iqq;

    .line 43
    .line 44
    invoke-virtual {p1, p0, p2}, La/nqq;->a1(La/iqq;La/iqq;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->M()V

    .line 6
    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v1, 0x20

    .line 11
    .line 12
    if-gt v1, v0, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x22

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->L(Landroid/content/res/Configuration;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    const-string p1, "AndroidOwner:onLayout"

    .line 2
    .line 3
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :try_start_0
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b2:La/bx2;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, La/h7k;->t(Lkotlin/jvm/functions/Function0;)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r1:La/p4e;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->M()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const-string p1, "AndroidOwner:viewLayout"

    .line 28
    .line 29
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    .line 31
    .line 32
    :try_start_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sub-int/2addr p4, p2

    .line 37
    sub-int/2addr p5, p3

    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:onMeasure"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, La/e7z;->I()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p0}, La/e7z;->c(La/cg80;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->k(La/e7z;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->e(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const/16 p1, 0x20

    .line 43
    .line 44
    ushr-long v3, v1, p1

    .line 45
    .line 46
    sget-object v5, La/h2t0;->b:La/g2t0;

    .line 47
    .line 48
    long-to-int v3, v3

    .line 49
    const-wide v4, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v1, v4

    .line 55
    long-to-int v1, v1

    .line 56
    invoke-static {p2}, Landroidx/compose/ui/platform/AndroidComposeView;->e(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    ushr-long p1, v6, p1

    .line 61
    .line 62
    long-to-int p1, p1

    .line 63
    and-long/2addr v4, v6

    .line 64
    long-to-int p2, v4

    .line 65
    invoke-static {v3, v1, p1, p2}, La/lgb;->N(IIII)J

    .line 66
    .line 67
    .line 68
    move-result-wide p1

    .line 69
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r1:La/p4e;

    .line 70
    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    new-instance v1, La/p4e;

    .line 74
    .line 75
    invoke-direct {v1, p1, p2}, La/p4e;-><init>(J)V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r1:La/p4e;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s1:Z

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    iget-wide v1, v1, La/p4e;->a:J

    .line 85
    .line 86
    invoke-static {v1, v2, p1, p2}, La/p4e;->c(JJ)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->s1:Z

    .line 94
    .line 95
    :cond_3
    :goto_0
    invoke-virtual {v0, p1, p2}, La/h7k;->C(J)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, La/h7k;->v()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, La/e7z;->i1:La/i7z;

    .line 106
    .line 107
    iget-object p1, p1, La/i7z;->p:La/sj30;

    .line 108
    .line 109
    iget p1, p1, La/pu90;->a:I

    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iget-object p2, p2, La/e7z;->i1:La/i7z;

    .line 116
    .line 117
    iget-object p2, p2, La/i7z;->p:La/sj30;

    .line 118
    .line 119
    iget p2, p2, La/pu90;->b:I

    .line 120
    .line 121
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 125
    .line 126
    if-eqz p1, :cond_4

    .line 127
    .line 128
    const-string p1, "AndroidOwner:androidViewMeasure"

    .line 129
    .line 130
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 131
    .line 132
    .line 133
    :try_start_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iget-object p2, p2, La/e7z;->i1:La/i7z;

    .line 142
    .line 143
    iget-object p2, p2, La/i7z;->p:La/sj30;

    .line 144
    .line 145
    iget p2, p2, La/pu90;->a:I

    .line 146
    .line 147
    const/high16 v0, 0x40000000    # 2.0f

    .line 148
    .line 149
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    iget-object p0, p0, La/e7z;->i1:La/i7z;

    .line 158
    .line 159
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 160
    .line 161
    iget p0, p0, La/pu90;->b:I

    .line 162
    .line 163
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    .line 169
    .line 170
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :catchall_0
    move-exception p0

    .line 175
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 176
    .line 177
    .line 178
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 179
    :cond_4
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :catchall_1
    move-exception p0

    .line 184
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 185
    .line 186
    .line 187
    throw p0
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f2:Z

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->A(Landroid/view/ViewStructure;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x2002

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    const/16 v1, 0x4002

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPointerIconService()La/cpa0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/lx2;

    .line 32
    .line 33
    iget-object v0, v0, La/lx2;->a:La/bpa0;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of p1, v0, La/d13;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    check-cast v0, La/d13;

    .line 46
    .line 47
    iget-short p1, v0, La/d13;->b:S

    .line 48
    .line 49
    invoke-static {p0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    const/16 p1, 0x3e8

    .line 55
    .line 56
    invoke-static {p0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public final onResume(La/clz;)V
    .locals 3

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, La/uc9;->W()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f:La/klz;

    .line 15
    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:La/jlz;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, p1, La/klz;->a:La/bzu;

    .line 24
    .line 25
    iget-object v0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/zn20;

    .line 28
    .line 29
    iget-boolean v1, v0, La/zn20;->a:Z

    .line 30
    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    iget-boolean v1, v0, La/zn20;->c:Z

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    :try_start_0
    new-instance v1, La/rcz;

    .line 38
    .line 39
    const/4 v2, 0x7

    .line 40
    invoke-direct {v1, p1, v2}, La/rcz;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    check-cast p0, La/erv0;

    .line 44
    .line 45
    iget-object p0, p0, La/erv0;->a:La/nld;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, La/nld;->v(La/rcz;)La/s5a;

    .line 48
    .line 49
    .line 50
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    goto :goto_1

    .line 52
    :catch_0
    iget-boolean p0, v0, La/zn20;->b:Z

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-boolean p0, v0, La/zn20;->c:Z

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    const-string p0, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 62
    .line 63
    invoke-static {p0}, La/esb0;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {v0}, La/zn20;->a()V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    iput-boolean p0, v0, La/zn20;->c:Z

    .line 71
    .line 72
    :goto_0
    const/4 p0, 0x0

    .line 73
    :goto_1
    iget-object v0, p1, La/klz;->d:La/s5a;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-interface {v0}, La/s5a;->cancel()V

    .line 78
    .line 79
    .line 80
    :cond_3
    iput-object p0, p1, La/klz;->d:La/s5a;

    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    sget-object v0, La/spq;->a:[I

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object p1, La/k6z;->b:La/k6z;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    sget-object p1, La/k6z;->a:La/k6z;

    .line 18
    .line 19
    :goto_0
    if-nez p1, :cond_2

    .line 20
    .line 21
    sget-object p1, La/k6z;->a:La/k6z;

    .line 22
    .line 23
    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setLayoutDirection(La/k6z;)V

    .line 24
    .line 25
    .line 26
    :cond_3
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 1

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p2, 0x1f

    .line 4
    .line 5
    if-lt p1, p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g2:La/u9h0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()La/wai0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, p0, p2, v0, p3}, La/u9h0;->a(Landroidx/compose/ui/platform/AndroidComposeView;La/wai0;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final onScrollChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onStop(La/clz;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f:La/klz;

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    iget-object p1, p0, La/klz;->a:La/bzu;

    .line 6
    .line 7
    iget-object p1, p1, La/bzu;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, La/zn20;

    .line 10
    .line 11
    iget-boolean v0, p1, La/zn20;->a:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p1, La/zn20;->c:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, La/klz;->d:La/s5a;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, La/s5a;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, La/klz;->d:La/s5a;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-boolean p0, p1, La/zn20;->b:Z

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-boolean p0, p1, La/zn20;->c:Z

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    const-string p0, "ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?"

    .line 40
    .line 41
    invoke-static {p0}, La/esb0;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    iget-object p0, p1, La/zn20;->d:La/hz40;

    .line 45
    .line 46
    invoke-virtual {p0}, La/hz40;->i()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_4

    .line 51
    .line 52
    const-string p0, "Attempted to start retaining exited values with pending exited values"

    .line 53
    .line 54
    invoke-static {p0}, La/esb0;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 p0, 0x0

    .line 58
    iput-boolean p0, p1, La/zn20;->c:Z

    .line 59
    .line 60
    :cond_5
    :goto_0
    return-void
.end method

.method public final onTouchModeChanged(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInputModeManager()La/bfx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x2

    .line 10
    :goto_0
    iget-object p0, p0, La/bfx;->a:La/pz40;

    .line 11
    .line 12
    new-instance v0, La/zex;

    .line 13
    .line 14
    invoke-direct {v0, p1}, La/zex;-><init>(I)V

    .line 15
    .line 16
    .line 17
    check-cast p0, La/hgk0;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, p1}, La/gy2;->b(La/iy2;Landroid/util/LongSparseArray;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object v0, p0, La/iy2;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    new-instance v1, La/fy2;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct {v1, p0, p1, v2}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d2:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v0, 0x1e

    .line 12
    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, La/uc9;->W()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getShowLayoutBounds()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eq v0, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->j(La/e7z;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final p(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    cmpg-float v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    cmpg-float p0, p1, p0

    .line 44
    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_1
    :goto_0
    return v1
.end method

.method public final q([F)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 5
    .line 6
    invoke-static {p1, v0}, La/ui30;->f([F[F)V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shr-long/2addr v0, v2

    .line 14
    long-to-int v0, v0

    .line 15
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 20
    .line 21
    const-wide v3, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v1, v3

    .line 27
    long-to-int v1, v1

    .line 28
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w1:[F

    .line 33
    .line 34
    invoke-static {p1, v0, v1, p0}, La/cy2;->G([FFF[F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final r(J)J
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->B()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y1:[F

    .line 5
    .line 6
    invoke-static {p1, p2, v0}, La/ui30;->b(J[F)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long v1, p1, v0

    .line 13
    .line 14
    long-to-int v1, v1

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 20
    .line 21
    shr-long/2addr v2, v0

    .line 22
    long-to-int v2, v2

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-float/2addr v2, v1

    .line 28
    const-wide v3, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr p1, v3

    .line 34
    long-to-int p1, p1

    .line 35
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-wide v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C1:J

    .line 40
    .line 41
    and-long/2addr v5, v3

    .line 42
    long-to-int p0, v5

    .line 43
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    add-float/2addr p0, p1

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    int-to-long p1, p1

    .line 53
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    int-to-long v1, p0

    .line 58
    shl-long p0, p1, v0

    .line 59
    .line 60
    and-long v0, v1, v3

    .line 61
    .line 62
    or-long/2addr p0, v0

    .line 63
    return-wide p0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 6

    .line 1
    sget-boolean v0, La/ebc;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x7

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-static {p1}, La/spq;->d(I)La/jpq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget v2, p1, La/jpq;->a:I

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    invoke-static {p2}, La/e9x;->X(Landroid/graphics/Rect;)La/jge0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move-object p2, v4

    .line 36
    :goto_0
    new-instance v0, La/dx2;

    .line 37
    .line 38
    invoke-direct {v0, v2, v3}, La/dx2;-><init>(IB)V

    .line 39
    .line 40
    .line 41
    check-cast p1, La/ypq;

    .line 42
    .line 43
    invoke-virtual {p1, v2, p2, v0}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, La/dx2;

    .line 61
    .line 62
    const/4 v5, 0x2

    .line 63
    invoke-direct {v0, v2, v5}, La/dx2;-><init>(IB)V

    .line 64
    .line 65
    .line 66
    check-cast p1, La/ypq;

    .line 67
    .line 68
    invoke-virtual {p1, v2, v4, v0}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    if-ne v2, v3, :cond_5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    if-ne v2, v5, :cond_6

    .line 89
    .line 90
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, La/ypq;

    .line 95
    .line 96
    invoke-virtual {p0, v2}, La/ypq;->j(I)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    return p0

    .line 101
    :cond_6
    return v1

    .line 102
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    :goto_2
    return v3

    .line 109
    :cond_8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/ypq;

    .line 114
    .line 115
    iget-object v0, v0, La/ypq;->c:La/nqq;

    .line 116
    .line 117
    invoke-virtual {v0}, La/nqq;->e1()La/iqq;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, La/iqq;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_9

    .line 126
    .line 127
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    return p0

    .line 132
    :cond_9
    invoke-static {p1}, La/spq;->d(I)La/jpq;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz p1, :cond_a

    .line 137
    .line 138
    iget v2, p1, La/jpq;->a:I

    .line 139
    .line 140
    :cond_a
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-eqz p2, :cond_b

    .line 145
    .line 146
    invoke-static {p2}, La/e9x;->X(Landroid/graphics/Rect;)La/jge0;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    :cond_b
    new-instance p1, La/dx2;

    .line 151
    .line 152
    invoke-direct {p1, v2, v1}, La/dx2;-><init>(IB)V

    .line 153
    .line 154
    .line 155
    check-cast p0, La/ypq;

    .line 156
    .line 157
    invoke-virtual {p0, v2, v4, p1}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    return p0
.end method

.method public final s(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    iget-object v1, v0, La/h7k;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/oif0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/oif0;->E()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, La/h7k;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/kd30;

    .line 16
    .line 17
    iget-object v1, v1, La/kd30;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/xz40;

    .line 20
    .line 21
    iget v1, v1, La/xz40;->c:I

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 28
    .line 29
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    :try_start_0
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b2:La/bx2;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c2:La/bx2;

    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, p1}, La/h7k;->t(Lkotlin/jvm/functions/Function0;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 46
    .line 47
    .line 48
    :cond_3
    const/4 p1, 0x0

    .line 49
    invoke-virtual {v0, p1}, La/h7k;->e(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, La/oge0;->a()V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Z

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    .line 68
    .line 69
    .line 70
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 2
    .line 3
    iput-wide p1, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->h:J

    .line 4
    .line 5
    return-void
.end method

.method public final setComposeViewContext(La/skd;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, La/skd;->c()La/nld;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, La/nld;->k()Lkotlin/coroutines/CoroutineContext;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La/e7z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, La/e7z;->o()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/ty40;

    .line 24
    .line 25
    invoke-virtual {v0}, La/ty40;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v0, "Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first."

    .line 33
    .line 34
    invoke-static {v0}, La/xcx;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_1
    invoke-static {v0}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :try_start_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->get_composeViewContext()La/skd;

    .line 54
    .line 55
    .line 56
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    invoke-static {v0, v2, v1}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    if-eq p1, v3, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3}, La/skd;->b()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, La/skd;->e()V

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->set_composeViewContext(La/skd;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, La/skd;->c()La/nld;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, La/nld;->k()Lkotlin/coroutines/CoroutineContext;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setCoroutineContext(Lkotlin/coroutines/CoroutineContext;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return-void

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    invoke-static {v0, v2, v1}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public final setComposeViewContextIncrementedDuringInit$ui(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e2:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setConfiguration(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j1:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setContentCaptureManager$ui(La/iy2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 2
    .line 3
    return-void
.end method

.method public setCoroutineContext(Lkotlin/coroutines/CoroutineContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n:Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    return-void
.end method

.method public final setFrameEndScheduler$ui(La/jlz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e:La/jlz;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A1:J

    .line 2
    .line 3
    return-void
.end method

.method public final setOnReadyForComposition(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/skd;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDerivedIsAttached()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e2:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D1:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getComposeViewContext()La/skd;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setPlayNavigationSoundEffect$ui(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "La/jpq;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Z1:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-void
.end method

.method public final setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui(La/v6x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d:La/v6x;

    .line 2
    .line 3
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setUncaughtExceptionHandler(La/keg0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setUncaughtExceptionHandler$ui(La/keg0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final t(La/e7z;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    const-string v1, "AndroidOwner:measureAndLayout"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, La/h7k;->u(La/e7z;J)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, La/h7k;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, La/oif0;

    .line 14
    .line 15
    invoke-virtual {p1}, La/oif0;->E()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {v0, p1}, La/h7k;->e(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()La/oge0;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, La/oge0;->a()V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c2:La/bx2;

    .line 33
    .line 34
    invoke-virtual {p2}, La/bx2;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Z

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    .line 46
    .line 47
    .line 48
    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public final u(I)Z
    .locals 6

    .line 1
    sget-boolean v0, La/ebc;->a:Z

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const-string v3, "Invalid focus direction"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    if-ne p1, v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_1
    invoke-static {p1}, La/spq;->c(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_6

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/ypq;

    .line 35
    .line 36
    invoke-virtual {v1}, La/ypq;->h()La/nqq;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    invoke-static {p1}, La/spq;->c(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {v1}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v1, v1, La/e7z;->p:La/bhu0;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1}, La/k33;->getInteropView()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v1, v4

    .line 66
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast p0, Landroid/view/ViewGroup;

    .line 82
    .line 83
    invoke-virtual {v3, p0, v2, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz p0, :cond_3

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    invoke-static {v1, p0}, La/cy2;->y(Landroid/view/View;Landroid/view/View;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const/4 v1, 0x1

    .line 96
    if-ne p1, v1, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object p0, v4

    .line 100
    :goto_1
    if-eqz p0, :cond_c

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p0, p1, v4}, La/spq;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :cond_4
    invoke-static {v3}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0

    .line 116
    :cond_5
    const-string p0, "findNextViewInEmbeddedView called when owner does not have anything focused."

    .line 117
    .line 118
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return v5

    .line 122
    :cond_6
    invoke-static {v3}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    throw p0

    .line 127
    :cond_7
    if-ne p1, v2, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    if-ne p1, v1, :cond_9

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    invoke-static {p1}, La/spq;->c(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-eqz p1, :cond_d

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()La/jge0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_a

    .line 148
    .line 149
    invoke-static {v0}, La/e9x;->V(La/jge0;)Landroid/graphics/Rect;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    :cond_a
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-nez v4, :cond_b

    .line 158
    .line 159
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v0, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    goto :goto_2

    .line 168
    :cond_b
    invoke-virtual {v0, p0, v4, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    :goto_2
    if-eqz p0, :cond_c

    .line 173
    .line 174
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p0, p1, v4}, La/spq;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :cond_c
    :goto_3
    return v5

    .line 184
    :cond_d
    invoke-static {v3}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    throw p0
.end method

.method public final v()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n1:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La/eg80;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, La/eg80;->a:La/pgk0;

    .line 12
    .line 13
    new-instance v3, La/r580;

    .line 14
    .line 15
    const/16 v4, 0xa

    .line 16
    .line 17
    invoke-direct {v3, v4}, La/r580;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iget-object v4, v0, La/pgk0;->g:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v4

    .line 23
    :try_start_0
    iget-object v0, v0, La/pgk0;->f:La/xz40;

    .line 24
    .line 25
    iget v5, v0, La/xz40;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    move v6, v2

    .line 28
    move v7, v6

    .line 29
    :goto_0
    iget-object v8, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    if-ge v6, v5, :cond_2

    .line 32
    .line 33
    :try_start_1
    aget-object v8, v8, v6

    .line 34
    .line 35
    check-cast v8, La/ogk0;

    .line 36
    .line 37
    invoke-virtual {v8, v3}, La/ogk0;->d(La/r580;)V

    .line 38
    .line 39
    .line 40
    iget-object v8, v8, La/ogk0;->f:La/hz40;

    .line 41
    .line 42
    invoke-virtual {v8}, La/hz40;->j()Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-nez v8, :cond_0

    .line 47
    .line 48
    add-int/lit8 v7, v7, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    if-lez v7, :cond_1

    .line 52
    .line 53
    iget-object v8, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 54
    .line 55
    sub-int v9, v6, v7

    .line 56
    .line 57
    aget-object v10, v8, v6

    .line 58
    .line 59
    aput-object v10, v8, v9

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    sub-int v3, v5, v7

    .line 68
    .line 69
    invoke-static {v8, v3, v5, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput v3, v0, La/xz40;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    monitor-exit v4

    .line 75
    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n1:Z

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :goto_2
    monitor-exit v4

    .line 79
    throw p0

    .line 80
    :cond_3
    :goto_3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->d(Landroid/view/ViewGroup;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/AndroidComposeView;->c()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillManager()La/jw2;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    iget-object v3, v0, La/jw2;->h:La/fy40;

    .line 100
    .line 101
    iget v4, v3, La/fy40;->d:I

    .line 102
    .line 103
    if-nez v4, :cond_5

    .line 104
    .line 105
    iget-boolean v4, v0, La/jw2;->i:Z

    .line 106
    .line 107
    if-eqz v4, :cond_5

    .line 108
    .line 109
    iget-object v4, v0, La/jw2;->a:La/j910;

    .line 110
    .line 111
    invoke-virtual {v4}, La/j910;->m()Landroid/view/autofill/AutofillManager;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v4}, La/um30;->q(Landroid/view/autofill/AutofillManager;)V

    .line 116
    .line 117
    .line 118
    iput-boolean v2, v0, La/jw2;->i:Z

    .line 119
    .line 120
    :cond_5
    iget v3, v3, La/fy40;->d:I

    .line 121
    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    const/4 v3, 0x1

    .line 125
    iput-boolean v3, v0, La/jw2;->i:Z

    .line 126
    .line 127
    :cond_6
    :goto_4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q1:La/vy40;

    .line 128
    .line 129
    invoke-virtual {v0}, La/vy40;->j()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q1:La/vy40;

    .line 136
    .line 137
    invoke-virtual {v0, v2}, La/vy40;->g(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_9

    .line 142
    .line 143
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q1:La/vy40;

    .line 144
    .line 145
    iget v0, v0, La/vy40;->b:I

    .line 146
    .line 147
    move v3, v2

    .line 148
    :goto_5
    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q1:La/vy40;

    .line 149
    .line 150
    if-ge v3, v0, :cond_8

    .line 151
    .line 152
    invoke-virtual {v4, v3}, La/vy40;->g(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 157
    .line 158
    iget-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q1:La/vy40;

    .line 159
    .line 160
    invoke-virtual {v5, v3, v1}, La/vy40;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    if-eqz v4, :cond_7

    .line 164
    .line 165
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_8
    invoke-virtual {v4, v2, v0}, La/vy40;->m(II)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_9
    return-void
.end method

.method public final w(La/e7z;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->x:Z

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->v()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->w(La/e7z;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 17
    .line 18
    iput-boolean v1, p0, La/iy2;->f:Z

    .line 19
    .line 20
    invoke-virtual {p0}, La/iy2;->d()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, La/iy2;->g:La/q99;

    .line 27
    .line 28
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final x(La/e7z;ZZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 2
    .line 3
    if-eqz p2, :cond_b

    .line 4
    .line 5
    iget-object p2, v0, La/h7k;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, La/oif0;

    .line 8
    .line 9
    iget-object v1, p1, La/e7z;->i:La/e7z;

    .line 10
    .line 11
    iget-object v2, p1, La/e7z;->i1:La/i7z;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v1, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    .line 17
    .line 18
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v1, v2, La/i7z;->d:La/a7z;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v3, 0x1

    .line 28
    if-eqz v1, :cond_a

    .line 29
    .line 30
    if-eq v1, v3, :cond_c

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-eq v1, v4, :cond_a

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    if-eq v1, v4, :cond_a

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    if-ne v1, v4, :cond_9

    .line 40
    .line 41
    iget-boolean v1, v2, La/i7z;->e:Z

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    if-nez p3, :cond_1

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_1
    iput-boolean v3, v2, La/i7z;->e:Z

    .line 50
    .line 51
    iget-object p3, v2, La/i7z;->p:La/sj30;

    .line 52
    .line 53
    iput-boolean v3, p3, La/sj30;->v:Z

    .line 54
    .line 55
    iget-boolean p3, p1, La/e7z;->s1:Z

    .line 56
    .line 57
    if-eqz p3, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p1}, La/e7z;->K()Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-nez p3, :cond_3

    .line 71
    .line 72
    invoke-static {p1}, La/h7k;->m(La/e7z;)Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_4

    .line 77
    .line 78
    :cond_3
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    if-eqz p3, :cond_7

    .line 83
    .line 84
    iget-object p3, p3, La/e7z;->i1:La/i7z;

    .line 85
    .line 86
    iget-boolean p3, p3, La/i7z;->e:Z

    .line 87
    .line 88
    if-ne p3, v3, :cond_7

    .line 89
    .line 90
    :cond_4
    invoke-virtual {p1}, La/e7z;->J()Z

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-nez p3, :cond_5

    .line 95
    .line 96
    invoke-static {p1}, La/h7k;->n(La/e7z;)Z

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    if-eqz p3, :cond_8

    .line 101
    .line 102
    :cond_5
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    if-eqz p3, :cond_6

    .line 107
    .line 108
    invoke-virtual {p3}, La/e7z;->r()Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-ne p3, v3, :cond_6

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    sget-object p3, La/eox;->c:La/eox;

    .line 116
    .line 117
    invoke-virtual {p2, p1, p3}, La/oif0;->a(La/e7z;La/eox;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    sget-object p3, La/eox;->a:La/eox;

    .line 122
    .line 123
    invoke-virtual {p2, p1, p3}, La/oif0;->a(La/e7z;La/eox;)V

    .line 124
    .line 125
    .line 126
    :cond_8
    :goto_1
    iget-boolean p2, v0, La/h7k;->c:Z

    .line 127
    .line 128
    if-nez p2, :cond_c

    .line 129
    .line 130
    if-eqz p4, :cond_c

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->G(La/e7z;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_a
    iget-object p0, v0, La/h7k;->h:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, La/xz40;

    .line 143
    .line 144
    new-instance p2, La/qj30;

    .line 145
    .line 146
    invoke-direct {p2, p1, v3, p3}, La/qj30;-><init>(La/e7z;ZZ)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_b
    invoke-virtual {v0, p1, p3}, La/h7k;->B(La/e7z;Z)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_c

    .line 158
    .line 159
    if-eqz p4, :cond_c

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->G(La/e7z;)V

    .line 162
    .line 163
    .line 164
    :cond_c
    :goto_2
    return-void
.end method

.method public final y(La/e7z;ZZ)V
    .locals 8

    .line 1
    iget-object v0, p1, La/e7z;->i1:La/i7z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    iget-object v6, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t1:La/h7k;

    .line 9
    .line 10
    if-eqz p2, :cond_b

    .line 11
    .line 12
    iget-object p2, v6, La/h7k;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, La/oif0;

    .line 15
    .line 16
    iget-object v7, v0, La/i7z;->d:La/a7z;

    .line 17
    .line 18
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-eq v7, v5, :cond_13

    .line 25
    .line 26
    if-eq v7, v4, :cond_1

    .line 27
    .line 28
    if-eq v7, v3, :cond_13

    .line 29
    .line 30
    if-ne v7, v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :goto_0
    iget-boolean v2, v0, La/i7z;->e:Z

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    iget-boolean v2, v0, La/i7z;->f:Z

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    :cond_2
    if-nez p3, :cond_3

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_3
    iput-boolean v5, v0, La/i7z;->f:Z

    .line 50
    .line 51
    iput-boolean v5, v0, La/i7z;->g:Z

    .line 52
    .line 53
    iget-object p3, v0, La/i7z;->p:La/sj30;

    .line 54
    .line 55
    iput-boolean v5, p3, La/sj30;->w:Z

    .line 56
    .line 57
    iput-boolean v5, p3, La/sj30;->x:Z

    .line 58
    .line 59
    iget-boolean p3, p1, La/e7z;->s1:Z

    .line 60
    .line 61
    if-eqz p3, :cond_4

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p1}, La/e7z;->K()Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    if-eqz p3, :cond_5

    .line 82
    .line 83
    iget-object v0, p3, La/e7z;->i1:La/i7z;

    .line 84
    .line 85
    iget-boolean v0, v0, La/i7z;->e:Z

    .line 86
    .line 87
    if-ne v0, v5, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    if-eqz p3, :cond_6

    .line 91
    .line 92
    iget-object v0, p3, La/e7z;->i1:La/i7z;

    .line 93
    .line 94
    iget-boolean v0, v0, La/i7z;->f:Z

    .line 95
    .line 96
    if-ne v0, v5, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    sget-object p3, La/eox;->b:La/eox;

    .line 100
    .line 101
    invoke-virtual {p2, p1, p3}, La/oif0;->a(La/e7z;La/eox;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    :goto_1
    invoke-virtual {p1}, La/e7z;->J()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    if-eqz p3, :cond_8

    .line 112
    .line 113
    invoke-virtual {p3}, La/e7z;->q()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ne v0, v5, :cond_8

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_8
    if-eqz p3, :cond_9

    .line 121
    .line 122
    invoke-virtual {p3}, La/e7z;->r()Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-ne p3, v5, :cond_9

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_9
    sget-object p3, La/eox;->d:La/eox;

    .line 130
    .line 131
    invoke-virtual {p2, p1, p3}, La/oif0;->a(La/e7z;La/eox;)V

    .line 132
    .line 133
    .line 134
    :cond_a
    :goto_2
    iget-boolean p1, v6, La/h7k;->c:Z

    .line 135
    .line 136
    if-nez p1, :cond_13

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->G(La/e7z;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object p2, v0, La/i7z;->d:La/a7z;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-eqz p2, :cond_13

    .line 152
    .line 153
    if-eq p2, v5, :cond_13

    .line 154
    .line 155
    if-eq p2, v4, :cond_13

    .line 156
    .line 157
    if-eq p2, v3, :cond_13

    .line 158
    .line 159
    if-ne p2, v2, :cond_12

    .line 160
    .line 161
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    if-eqz p2, :cond_d

    .line 166
    .line 167
    invoke-virtual {p2}, La/e7z;->J()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_c

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_c
    const/4 v2, 0x0

    .line 175
    goto :goto_4

    .line 176
    :cond_d
    :goto_3
    move v2, v5

    .line 177
    :goto_4
    if-nez p3, :cond_e

    .line 178
    .line 179
    invoke-virtual {p1}, La/e7z;->r()Z

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    if-nez p3, :cond_13

    .line 184
    .line 185
    invoke-virtual {p1}, La/e7z;->q()Z

    .line 186
    .line 187
    .line 188
    move-result p3

    .line 189
    if-eqz p3, :cond_e

    .line 190
    .line 191
    invoke-virtual {p1}, La/e7z;->J()Z

    .line 192
    .line 193
    .line 194
    move-result p3

    .line 195
    if-ne p3, v2, :cond_e

    .line 196
    .line 197
    invoke-virtual {p1}, La/e7z;->J()Z

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    iget-object v3, v0, La/i7z;->p:La/sj30;

    .line 202
    .line 203
    iget-boolean v3, v3, La/sj30;->u:Z

    .line 204
    .line 205
    if-ne p3, v3, :cond_e

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_e
    iget-object p3, v0, La/i7z;->p:La/sj30;

    .line 209
    .line 210
    iput-boolean v5, p3, La/sj30;->w:Z

    .line 211
    .line 212
    iput-boolean v5, p3, La/sj30;->x:Z

    .line 213
    .line 214
    iget-boolean v0, p1, La/e7z;->s1:Z

    .line 215
    .line 216
    if-eqz v0, :cond_f

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_f
    iget-boolean p3, p3, La/sj30;->u:Z

    .line 220
    .line 221
    if-eqz p3, :cond_13

    .line 222
    .line 223
    if-eqz v2, :cond_13

    .line 224
    .line 225
    if-eqz p2, :cond_10

    .line 226
    .line 227
    invoke-virtual {p2}, La/e7z;->q()Z

    .line 228
    .line 229
    .line 230
    move-result p3

    .line 231
    if-ne p3, v5, :cond_10

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_10
    if-eqz p2, :cond_11

    .line 235
    .line 236
    invoke-virtual {p2}, La/e7z;->r()Z

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    if-ne p2, v5, :cond_11

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_11
    iget-object p2, v6, La/h7k;->e:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p2, La/oif0;

    .line 246
    .line 247
    sget-object p3, La/eox;->d:La/eox;

    .line 248
    .line 249
    invoke-virtual {p2, p1, p3}, La/oif0;->a(La/e7z;La/eox;)V

    .line 250
    .line 251
    .line 252
    :goto_5
    iget-boolean p1, v6, La/h7k;->c:Z

    .line 253
    .line 254
    if-nez p1, :cond_13

    .line 255
    .line 256
    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->G(La/e7z;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 261
    .line 262
    .line 263
    :cond_13
    :goto_6
    return-void
.end method

.method public final z()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->x:Z

    .line 5
    .line 6
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 7
    .line 8
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->v()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-boolean v3, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->j1:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iput-boolean v1, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->j1:Z

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->l1:La/w1;

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:La/iy2;

    .line 32
    .line 33
    iput-boolean v1, p0, La/iy2;->f:Z

    .line 34
    .line 35
    iget-object v0, p0, La/iy2;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, La/iy2;->d()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-boolean v2, p0, La/iy2;->l:Z

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iput-boolean v1, p0, La/iy2;->l:Z

    .line 54
    .line 55
    iget-object p0, p0, La/iy2;->m:La/w1;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method
