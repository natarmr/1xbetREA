.class public final La/oi00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qi00;


# direct methods
.method public synthetic constructor <init>(La/qi00;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oi00;->i:B

    iput-object p1, p0, La/oi00;->k:La/qi00;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/oi00;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oi00;->k:La/qi00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/oi00;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/oi00;-><init>(La/qi00;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/oi00;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/oi00;-><init>(La/qi00;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/oi00;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/oi00;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/oi00;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/oi00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/oi00;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/oi00;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/oi00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oi00;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/oi00;->k:La/qi00;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/oi00;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v2, La/qi00;->B:La/spc;

    .line 34
    .line 35
    iput-boolean v4, v0, La/oi00;->j:Z

    .line 36
    .line 37
    invoke-virtual {v2, v0}, La/spc;->a(La/bnn0;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    move-object v5, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    :goto_1
    return-object v5

    .line 48
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 49
    .line 50
    iget-boolean v6, v0, La/oi00;->j:Z

    .line 51
    .line 52
    if-eqz v6, :cond_4

    .line 53
    .line 54
    if-ne v6, v4, :cond_3

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v8, v2, La/qi00;->r:La/xzp;

    .line 68
    .line 69
    iget-object v3, v2, La/qi00;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;

    .line 70
    .line 71
    iget-wide v9, v3, Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;->a:J

    .line 72
    .line 73
    iget-object v11, v3, Lorg/xplatform/feed/linelive/presentation/feeds/child/liveexpress/models/LiveExpressItemsScreenParams;->b:La/aj00;

    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v7, La/giu;

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    invoke-direct/range {v7 .. v12}, La/giu;-><init>(La/xzp;JLa/aj00;La/yje;)V

    .line 85
    .line 86
    .line 87
    const-wide/16 v9, 0x8

    .line 88
    .line 89
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 90
    .line 91
    invoke-static {v9, v10, v3, v7}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    new-instance v3, La/t3t;

    .line 96
    .line 97
    const/4 v6, 0x5

    .line 98
    invoke-direct {v3, v8, v6}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    const/16 v19, 0x1c

    .line 102
    .line 103
    const-string v12, "GetLiveExpressTabGamesScenario.invoke()"

    .line 104
    .line 105
    const/4 v13, 0x3

    .line 106
    const-wide/16 v14, 0x0

    .line 107
    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    move-object/from16 v18, v3

    .line 113
    .line 114
    invoke-static/range {v11 .. v19}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v6, La/sot;

    .line 119
    .line 120
    const/16 v7, 0x8

    .line 121
    .line 122
    invoke-direct {v6, v5, v8, v7}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    new-instance v5, La/jz6;

    .line 130
    .line 131
    const/4 v6, 0x4

    .line 132
    invoke-direct {v5, v2, v6}, La/jz6;-><init>(Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    iput-boolean v4, v0, La/oi00;->j:Z

    .line 136
    .line 137
    invoke-virtual {v3, v5, v0}, La/qtb;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-ne v0, v1, :cond_5

    .line 142
    .line 143
    move-object v5, v1

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_3
    return-object v5

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
