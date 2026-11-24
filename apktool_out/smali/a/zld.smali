.class public final synthetic La/zld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cg80;


# direct methods
.method public synthetic constructor <init>(La/cg80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zld;->a:B

    iput-object p1, p0, La/zld;->b:La/cg80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zld;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zld;->b:La/cg80;

    .line 4
    .line 5
    check-cast p1, La/bh90;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, La/cg80;->getPointerIconService()La/cpa0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-interface {p0}, La/cg80;->getTextToolbar()La/aaq0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    invoke-interface {p0}, La/cg80;->getSoftwareKeyboardController()La/pkk0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_2
    invoke-interface {p0}, La/cg80;->getTextInputService()La/o8q0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_3
    invoke-interface {p0}, La/cg80;->getInputModeManager()La/afx;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
