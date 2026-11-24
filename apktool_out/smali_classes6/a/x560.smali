.class public final synthetic La/x560;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y560;


# direct methods
.method public synthetic constructor <init>(La/y560;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x560;->a:B

    iput-object p1, p0, La/x560;->b:La/y560;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/x560;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x560;->b:La/y560;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/y560;->s:La/ilp0;

    .line 14
    .line 15
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/es;

    .line 18
    .line 19
    invoke-virtual {p0}, La/es;->k()La/drm0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v0, La/z0w0;

    .line 28
    .line 29
    invoke-direct {v0, p0}, La/z0w0;-><init>(Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, La/y560;->q:La/duj;

    .line 44
    .line 45
    new-instance v1, La/pi40;

    .line 46
    .line 47
    const/16 v2, 0x18

    .line 48
    .line 49
    invoke-direct {v1, p0, v2}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

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
