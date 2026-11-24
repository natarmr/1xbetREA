.class public final synthetic La/xhn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fin0;


# direct methods
.method public synthetic constructor <init>(La/fin0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xhn0;->a:B

    iput-object p1, p0, La/xhn0;->b:La/fin0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/xhn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xhn0;->b:La/fin0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/fin0;->c:La/duj;

    .line 14
    .line 15
    new-instance v1, La/abn0;

    .line 16
    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, La/abn0;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/fin0;->e:La/ilp0;

    .line 34
    .line 35
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, La/es;

    .line 38
    .line 39
    invoke-virtual {p0}, La/es;->k()La/drm0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance v0, La/z0w0;

    .line 48
    .line 49
    invoke-direct {v0, p0}, La/z0w0;-><init>(Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
