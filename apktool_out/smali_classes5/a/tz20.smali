.class public final La/tz20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/uz20;


# direct methods
.method public synthetic constructor <init>(La/uz20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tz20;->i:B

    iput-object p1, p0, La/tz20;->k:La/uz20;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tz20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tz20;->k:La/uz20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tz20;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/tz20;-><init>(La/uz20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/tz20;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/tz20;-><init>(La/uz20;La/yje;B)V

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
    iget-byte v0, p0, La/tz20;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/tz20;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/tz20;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/tz20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/tz20;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/tz20;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/tz20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tz20;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/tz20;->k:La/uz20;

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
    iget-boolean v6, v0, La/tz20;->j:Z

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
    iget-object v3, v2, La/uz20;->I:La/nvu;

    .line 34
    .line 35
    iget-object v2, v2, La/uz20;->q:Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 36
    .line 37
    iget-wide v5, v2, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->a:J

    .line 38
    .line 39
    iput-boolean v4, v0, La/tz20;->j:Z

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v3, v5, v6, v0, v2}, La/nvu;->I(JLa/zje;Z)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    move-object v5, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    :goto_1
    return-object v5

    .line 53
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget-boolean v6, v0, La/tz20;->j:Z

    .line 56
    .line 57
    if-eqz v6, :cond_4

    .line 58
    .line 59
    if-ne v6, v4, :cond_3

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v2, La/uz20;->I:La/nvu;

    .line 73
    .line 74
    iget-object v6, v2, La/uz20;->q:Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 75
    .line 76
    iget-wide v6, v6, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->a:J

    .line 77
    .line 78
    iput-boolean v4, v0, La/tz20;->j:Z

    .line 79
    .line 80
    invoke-virtual {v3, v6, v7, v0, v4}, La/nvu;->I(JLa/zje;Z)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne v0, v1, :cond_5

    .line 85
    .line 86
    move-object v5, v1

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    :goto_2
    sget v0, La/uz20;->R:I

    .line 89
    .line 90
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 91
    .line 92
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 93
    .line 94
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-object v6, v1

    .line 102
    check-cast v6, La/dz20;

    .line 103
    .line 104
    iget-object v2, v6, La/dz20;->k:La/sf6;

    .line 105
    .line 106
    invoke-static {v2, v5, v4}, La/sf6;->a(La/sf6;La/ol6;I)La/sf6;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/16 v18, 0xbf7

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x0

    .line 118
    const/4 v11, 0x0

    .line 119
    const/4 v12, 0x0

    .line 120
    const/4 v13, 0x0

    .line 121
    const/4 v14, 0x0

    .line 122
    const/4 v15, 0x0

    .line 123
    invoke-static/range {v6 .. v18}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    :goto_3
    return-object v5

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
