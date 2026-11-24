.class public final La/lkn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/mkn0;


# direct methods
.method public synthetic constructor <init>(La/mkn0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lkn0;->i:B

    iput-object p1, p0, La/lkn0;->k:La/mkn0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lkn0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lkn0;->k:La/mkn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/lkn0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/lkn0;-><init>(La/mkn0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/lkn0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/lkn0;-><init>(La/mkn0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/lkn0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lkn0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lkn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lkn0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lkn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/lkn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/lkn0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/lkn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/lkn0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/lkn0;->k:La/mkn0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/lkn0;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, La/mkn0;->g:La/dgu;

    .line 32
    .line 33
    iput-boolean v3, p0, La/lkn0;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/dgu;->u(La/zje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v2, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    :goto_1
    return-object v2

    .line 46
    :pswitch_0
    iget-boolean p0, p0, La/lkn0;->j:Z

    .line 47
    .line 48
    sget-object v0, La/wne;->a:La/wne;

    .line 49
    .line 50
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-boolean p0, v1, La/mkn0;->F:Z

    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    iget-object p0, v1, La/mkn0;->B:La/bby;

    .line 58
    .line 59
    if-eqz p0, :cond_3

    .line 60
    .line 61
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-ne p0, v3, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object p0, v1, La/mkn0;->c:La/mne;

    .line 73
    .line 74
    iget-object v7, p0, La/mne;->a:La/rwj;

    .line 75
    .line 76
    new-instance v5, La/rgn0;

    .line 77
    .line 78
    invoke-direct {v5, v3}, La/rgn0;-><init>(B)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/lkn0;

    .line 82
    .line 83
    invoke-direct {v8, v1, v2, v3}, La/lkn0;-><init>(La/mkn0;La/yje;B)V

    .line 84
    .line 85
    .line 86
    const/16 v9, 0xa

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iput-object p0, v1, La/mkn0;->B:La/bby;

    .line 94
    .line 95
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
