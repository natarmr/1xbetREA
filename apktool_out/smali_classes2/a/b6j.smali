.class public final La/b6j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/e6j;


# direct methods
.method public synthetic constructor <init>(La/e6j;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/b6j;->i:B

    iput-object p1, p0, La/b6j;->k:La/e6j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b6j;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/b6j;->k:La/e6j;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/b6j;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/b6j;-><init>(La/e6j;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/b6j;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/b6j;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/b6j;-><init>(La/e6j;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/b6j;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/b6j;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/b6j;-><init>(La/e6j;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/b6j;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/b6j;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/b6j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/b6j;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/b6j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vmt0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/b6j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/b6j;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/b6j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/b6j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/b6j;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/b6j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/b6j;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/b6j;->k:La/e6j;

    .line 6
    .line 7
    iget-object p0, p0, La/b6j;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/sw00;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p0, p0, La/sw00;->a:Z

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    sget p0, La/e6j;->L:I

    .line 24
    .line 25
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, La/y5j;

    .line 30
    .line 31
    const/4 p0, 0x2

    .line 32
    invoke-direct {v5, v3, p0}, La/y5j;-><init>(La/e6j;B)V

    .line 33
    .line 34
    .line 35
    iget-object p0, v3, La/e6j;->q:La/mne;

    .line 36
    .line 37
    iget-object v7, p0, La/mne;->b:La/dvj;

    .line 38
    .line 39
    new-instance v8, La/u88;

    .line 40
    .line 41
    const/16 p0, 0xb

    .line 42
    .line 43
    invoke-direct {v8, v3, v2, v1, p0}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 44
    .line 45
    .line 46
    const/16 v9, 0xa

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 50
    .line 51
    .line 52
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast p0, La/vmt0;

    .line 56
    .line 57
    sget-object v0, La/wne;->a:La/wne;

    .line 58
    .line 59
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    instance-of p1, p0, La/smt0;

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    iget-object p1, v3, La/e6j;->K:La/c4m0;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    check-cast p0, La/smt0;

    .line 74
    .line 75
    iget-object p0, p0, La/smt0;->a:Ljava/lang/Throwable;

    .line 76
    .line 77
    iget-object p1, v3, La/e6j;->p:La/duj;

    .line 78
    .line 79
    new-instance v0, La/igm;

    .line 80
    .line 81
    invoke-direct {v0, v2, v3, p0}, La/igm;-><init>(ZLa/e6j;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1
    check-cast p0, Ljava/lang/Throwable;

    .line 91
    .line 92
    sget-object v0, La/wne;->a:La/wne;

    .line 93
    .line 94
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v3, p0}, La/e6j;->P(La/e6j;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
