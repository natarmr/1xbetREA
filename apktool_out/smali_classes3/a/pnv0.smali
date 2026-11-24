.class public final La/pnv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/n2w0;La/ghk0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/pnv0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/pnv0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0, v0, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/pnv0;->i:B

    iput-object p1, p0, La/pnv0;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pnv0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pnv0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/pnv0;

    .line 9
    .line 10
    iget-object p0, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/n2w0;

    .line 13
    .line 14
    check-cast v1, La/ghk0;

    .line 15
    .line 16
    invoke-direct {p1, p0, v1, p2}, La/pnv0;-><init>(La/n2w0;La/ghk0;La/yje;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    new-instance p0, La/pnv0;

    .line 21
    .line 22
    check-cast v1, La/buv0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p0, v1, p2, v0}, La/pnv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    new-instance p0, La/pnv0;

    .line 32
    .line 33
    check-cast v1, La/qnv0;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, v1, p2, v0}, La/pnv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 40
    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pnv0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/pnv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pnv0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pnv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/pnv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/pnv0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/pnv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/pnv0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/pnv0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/pnv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/pnv0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pnv0;->k:Ljava/lang/Object;

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
    iget-object p0, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/n2w0;

    .line 16
    .line 17
    check-cast v1, La/ghk0;

    .line 18
    .line 19
    sget-object p1, La/n2w0;->h2:La/bzs0;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lkotlin/Pair;

    .line 26
    .line 27
    const-string v2, "SUCCESS_SOCIAL"

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/sik;->y0()V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    iget-object p0, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, La/vne;

    .line 52
    .line 53
    sget-object v0, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, La/ztv0;

    .line 59
    .line 60
    check-cast v1, La/buv0;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {p1, v1, v2, v0}, La/ztv0;-><init>(La/buv0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x3

    .line 68
    invoke-static {p0, v2, v2, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 69
    .line 70
    .line 71
    new-instance p1, La/ztv0;

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-direct {p1, v1, v2, v3}, La/ztv0;-><init>(La/buv0;La/yje;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0, v2, v2, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    iget-object p0, p0, La/pnv0;->j:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Ljava/lang/Throwable;

    .line 86
    .line 87
    sget-object v0, La/wne;->a:La/wne;

    .line 88
    .line 89
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    check-cast v1, La/qnv0;

    .line 93
    .line 94
    iget-object p1, v1, La/qnv0;->r:La/duj;

    .line 95
    .line 96
    new-instance v0, La/i9v0;

    .line 97
    .line 98
    const/16 v1, 0xd

    .line 99
    .line 100
    invoke-direct {v0, v1}, La/i9v0;-><init>(B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
