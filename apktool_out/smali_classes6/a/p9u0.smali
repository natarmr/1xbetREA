.class public final synthetic La/p9u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q9u0;

.field public final synthetic c:La/mbu0;


# direct methods
.method public synthetic constructor <init>(La/q9u0;La/mbu0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p9u0;->a:B

    iput-object p1, p0, La/p9u0;->b:La/q9u0;

    iput-object p2, p0, La/p9u0;->c:La/mbu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p9u0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/p9u0;->c:La/mbu0;

    .line 4
    .line 5
    iget-object p0, p0, La/p9u0;->b:La/q9u0;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/q9u0;->r:La/ilp0;

    .line 16
    .line 17
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/es;

    .line 20
    .line 21
    invoke-virtual {p0}, La/es;->k()La/drm0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

    .line 26
    .line 27
    iget v1, v1, La/mbu0;->a:I

    .line 28
    .line 29
    iget-object p0, p0, La/drm0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/r9u;

    .line 32
    .line 33
    invoke-direct {v0, v1, p0}, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;-><init>(ILa/r9u;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, La/q9u0;->r:La/ilp0;

    .line 46
    .line 47
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/es;

    .line 50
    .line 51
    invoke-virtual {p0}, La/es;->k()La/drm0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

    .line 56
    .line 57
    iget v1, v1, La/mbu0;->a:I

    .line 58
    .line 59
    iget-object p0, p0, La/drm0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/r9u;

    .line 62
    .line 63
    invoke-direct {v0, v1, p0}, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;-><init>(ILa/r9u;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
