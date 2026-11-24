.class public final La/t0e;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/g1e;


# direct methods
.method public synthetic constructor <init>(La/g1e;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t0e;->i:B

    iput-object p1, p0, La/t0e;->j:La/g1e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/t0e;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/t0e;->j:La/g1e;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/t0e;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/t0e;-><init>(La/g1e;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/t0e;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/t0e;-><init>(La/g1e;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t0e;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/t0e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t0e;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t0e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t0e;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t0e;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t0e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/t0e;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/t0e;->j:La/g1e;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/g1e;->d:Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;

    .line 14
    .line 15
    instance-of v0, p1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 20
    .line 21
    iget-object p1, p1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/g1e;->C(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, La/g1e;->D:La/c4m0;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p1, v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object p1, p0, La/g1e;->g:La/m1e;

    .line 39
    .line 40
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, La/e1e;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, v1}, La/e1e;-><init>(La/g1e;La/yje;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, La/fnq;

    .line 51
    .line 52
    const/4 v3, 0x4

    .line 53
    invoke-direct {v2, p1, v0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, p0, La/g1e;->f:La/mne;

    .line 61
    .line 62
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 63
    .line 64
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v0, La/f1e;

    .line 69
    .line 70
    const/4 v3, 0x2

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v0, v3, v1, v4}, La/f1e;-><init>(ILa/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, La/g1e;->D:La/c4m0;

    .line 80
    .line 81
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/g1e;->F()V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
