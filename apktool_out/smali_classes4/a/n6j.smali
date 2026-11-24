.class public final La/n6j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/o6j;


# direct methods
.method public synthetic constructor <init>(La/o6j;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n6j;->i:B

    iput-object p1, p0, La/n6j;->k:La/o6j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n6j;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/n6j;->k:La/o6j;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/n6j;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/n6j;-><init>(La/o6j;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/n6j;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/n6j;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/n6j;-><init>(La/o6j;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

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
    iget-byte v0, p0, La/n6j;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/n6j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/n6j;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/n6j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/n6j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/n6j;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/n6j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n6j;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/n6j;->k:La/o6j;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean v0, v0, La/n6j;->j:Z

    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v4, La/o6j;->i:La/bby;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v0, v4, La/o6j;->e:La/mne;

    .line 37
    .line 38
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 39
    .line 40
    new-instance v6, La/y6h;

    .line 41
    .line 42
    iget-object v11, v4, La/o6j;->g:La/duj;

    .line 43
    .line 44
    const/4 v15, 0x0

    .line 45
    const/16 v16, 0xe

    .line 46
    .line 47
    const/4 v10, 0x1

    .line 48
    const-class v12, La/duj;

    .line 49
    .line 50
    const-string v13, "handleError"

    .line 51
    .line 52
    const-string v14, "handleError(Ljava/lang/Throwable;)V"

    .line 53
    .line 54
    move-object v9, v6

    .line 55
    invoke-direct/range {v9 .. v16}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 56
    .line 57
    .line 58
    new-instance v9, La/n6j;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {v9, v4, v2, v0}, La/n6j;-><init>(La/o6j;La/yje;B)V

    .line 62
    .line 63
    .line 64
    const/16 v10, 0xa

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, v4, La/o6j;->i:La/bby;

    .line 72
    .line 73
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v5, v0, La/n6j;->j:Z

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    if-ne v5, v3, :cond_2

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v4, La/o6j;->b:La/v4v;

    .line 98
    .line 99
    iput-boolean v3, v0, La/n6j;->j:Z

    .line 100
    .line 101
    invoke-virtual {v2, v0}, La/v4v;->a(La/zje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v0, v1, :cond_4

    .line 106
    .line 107
    move-object v2, v1

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_2
    return-object v2

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
