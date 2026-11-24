.class public final La/dm4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i3t0;Lkotlin/jvm/functions/Function2;La/yje;B)V
    .locals 0

    .line 20
    iput-byte p4, p0, La/dm4;->i:B

    iput-object p1, p0, La/dm4;->n:Ljava/lang/Object;

    iput-object p2, p0, La/dm4;->o:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/im4;La/uu4;Ljava/lang/String;La/df2;Ljava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/dm4;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/dm4;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/dm4;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/dm4;->m:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/dm4;->o:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/dm4;->n:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(La/mii0;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;Ljava/util/List;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/dm4;->i:B

    .line 19
    iput-object p1, p0, La/dm4;->k:Ljava/lang/Object;

    iput-object p2, p0, La/dm4;->l:Ljava/lang/Object;

    iput-object p3, p0, La/dm4;->m:Ljava/lang/Object;

    iput-object p4, p0, La/dm4;->n:Ljava/lang/Object;

    iput-object p5, p0, La/dm4;->o:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/dm4;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/dm4;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/dm4;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, La/dm4;

    .line 11
    .line 12
    check-cast v2, La/on20;

    .line 13
    .line 14
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    const/4 v0, 0x5

    .line 17
    invoke-direct {p0, v2, v1, p1, v0}, La/dm4;-><init>(La/i3t0;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance p0, La/dm4;

    .line 22
    .line 23
    check-cast v2, La/nn20;

    .line 24
    .line 25
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    invoke-direct {p0, v2, v1, p1, v0}, La/dm4;-><init>(La/i3t0;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    new-instance p0, La/dm4;

    .line 33
    .line 34
    check-cast v2, La/ln20;

    .line 35
    .line 36
    check-cast v1, La/tk20;

    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    invoke-direct {p0, v2, v1, p1, v0}, La/dm4;-><init>(La/i3t0;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_2
    new-instance v3, La/dm4;

    .line 44
    .line 45
    iget-object v0, p0, La/dm4;->k:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v4, v0

    .line 48
    check-cast v4, La/mii0;

    .line 49
    .line 50
    iget-object v0, p0, La/dm4;->l:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v5, v0

    .line 53
    check-cast v5, La/sip;

    .line 54
    .line 55
    iget-object p0, p0, La/dm4;->m:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v6, p0

    .line 58
    check-cast v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 59
    .line 60
    move-object v7, v2

    .line 61
    check-cast v7, La/jo20;

    .line 62
    .line 63
    move-object v8, v1

    .line 64
    check-cast v8, Ljava/util/List;

    .line 65
    .line 66
    move-object v9, p1

    .line 67
    invoke-direct/range {v3 .. v9}, La/dm4;-><init>(La/mii0;La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;Ljava/util/List;La/yje;)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_3
    move-object v9, p1

    .line 72
    new-instance p0, La/dm4;

    .line 73
    .line 74
    check-cast v2, La/dt6;

    .line 75
    .line 76
    check-cast v1, La/ts6;

    .line 77
    .line 78
    const/4 p1, 0x1

    .line 79
    invoke-direct {p0, v2, v1, v9, p1}, La/dm4;-><init>(La/i3t0;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_4
    move-object v9, p1

    .line 84
    new-instance v4, La/dm4;

    .line 85
    .line 86
    iget-object p1, p0, La/dm4;->k:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v5, p1

    .line 89
    check-cast v5, La/im4;

    .line 90
    .line 91
    iget-object p1, p0, La/dm4;->l:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v6, p1

    .line 94
    check-cast v6, La/uu4;

    .line 95
    .line 96
    iget-object p0, p0, La/dm4;->m:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v7, p0

    .line 99
    check-cast v7, Ljava/lang/String;

    .line 100
    .line 101
    move-object v8, v1

    .line 102
    check-cast v8, La/df2;

    .line 103
    .line 104
    check-cast v2, Ljava/lang/String;

    .line 105
    .line 106
    move-object v10, v9

    .line 107
    move-object v9, v2

    .line 108
    invoke-direct/range {v4 .. v10}, La/dm4;-><init>(La/im4;La/uu4;Ljava/lang/String;La/df2;Ljava/lang/String;La/yje;)V

    .line 109
    .line 110
    .line 111
    return-object v4

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dm4;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/dm4;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/dm4;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/dm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/dm4;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/dm4;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/dm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/dm4;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/dm4;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/dm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/dm4;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/dm4;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/dm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/dm4;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/dm4;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/dm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/dm4;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/dm4;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/dm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/dm4;->i:B

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    iget-object v2, v5, La/dm4;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v3, v5, La/dm4;->n:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v8, v5, La/dm4;->j:Z

    .line 20
    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-ne v8, v6, :cond_0

    .line 24
    .line 25
    iget-object v0, v5, La/dm4;->m:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/bnn0;

    .line 28
    .line 29
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 30
    .line 31
    iget-object v2, v5, La/dm4;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, La/on20;

    .line 34
    .line 35
    iget-object v3, v5, La/dm4;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, La/k050;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v14, v0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    check-cast v3, La/on20;

    .line 52
    .line 53
    iget-object v4, v3, La/on20;->i1:La/k050;

    .line 54
    .line 55
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 56
    .line 57
    iput-object v4, v5, La/dm4;->k:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v3, v5, La/dm4;->l:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v8, v2

    .line 62
    check-cast v8, La/bnn0;

    .line 63
    .line 64
    iput-object v8, v5, La/dm4;->m:Ljava/lang/Object;

    .line 65
    .line 66
    iput-boolean v6, v5, La/dm4;->j:Z

    .line 67
    .line 68
    invoke-virtual {v4, v5}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-ne v5, v0, :cond_2

    .line 73
    .line 74
    move-object v7, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    move-object v14, v2

    .line 77
    move-object v2, v3

    .line 78
    move-object v3, v4

    .line 79
    :goto_0
    :try_start_0
    iget-object v0, v2, La/on20;->h1:La/bby;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    :goto_1
    iget-object v0, v2, La/on20;->j1:La/bby;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 101
    .line 102
    iget-object v0, v2, La/on20;->E:La/mne;

    .line 103
    .line 104
    iget-object v12, v0, La/mne;->b:La/dvj;

    .line 105
    .line 106
    new-instance v13, La/ih20;

    .line 107
    .line 108
    invoke-direct {v13, v2, v1}, La/ih20;-><init>(La/on20;B)V

    .line 109
    .line 110
    .line 111
    const/16 v15, 0x20

    .line 112
    .line 113
    const-wide/16 v9, 0x1f4

    .line 114
    .line 115
    invoke-static/range {v8 .. v15}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, v2, La/on20;->h1:La/bby;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    invoke-interface {v3, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_2
    return-object v7

    .line 127
    :goto_3
    invoke-interface {v3, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 132
    .line 133
    iget-boolean v8, v5, La/dm4;->j:Z

    .line 134
    .line 135
    if-eqz v8, :cond_6

    .line 136
    .line 137
    if-ne v8, v6, :cond_5

    .line 138
    .line 139
    iget-object v0, v5, La/dm4;->m:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, La/bnn0;

    .line 142
    .line 143
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 144
    .line 145
    iget-object v2, v5, La/dm4;->l:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, La/nn20;

    .line 148
    .line 149
    iget-object v3, v5, La/dm4;->k:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, La/k050;

    .line 152
    .line 153
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    move-object v14, v0

    .line 157
    goto :goto_4

    .line 158
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    check-cast v3, La/nn20;

    .line 166
    .line 167
    iget-object v4, v3, La/nn20;->X0:La/k050;

    .line 168
    .line 169
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 170
    .line 171
    iput-object v4, v5, La/dm4;->k:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v3, v5, La/dm4;->l:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v8, v2

    .line 176
    check-cast v8, La/bnn0;

    .line 177
    .line 178
    iput-object v8, v5, La/dm4;->m:Ljava/lang/Object;

    .line 179
    .line 180
    iput-boolean v6, v5, La/dm4;->j:Z

    .line 181
    .line 182
    invoke-virtual {v4, v5}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-ne v5, v0, :cond_7

    .line 187
    .line 188
    move-object v7, v0

    .line 189
    goto :goto_6

    .line 190
    :cond_7
    move-object v14, v2

    .line 191
    move-object v2, v3

    .line 192
    move-object v3, v4

    .line 193
    :goto_4
    :try_start_1
    iget-object v0, v2, La/nn20;->W0:La/bby;

    .line 194
    .line 195
    if-eqz v0, :cond_8

    .line 196
    .line 197
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :catchall_1
    move-exception v0

    .line 202
    goto :goto_7

    .line 203
    :cond_8
    :goto_5
    iget-object v0, v2, La/nn20;->Y0:La/bby;

    .line 204
    .line 205
    if-eqz v0, :cond_9

    .line 206
    .line 207
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 208
    .line 209
    .line 210
    :cond_9
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 215
    .line 216
    iget-object v0, v2, La/nn20;->T:La/mne;

    .line 217
    .line 218
    iget-object v12, v0, La/mne;->b:La/dvj;

    .line 219
    .line 220
    new-instance v13, La/rh20;

    .line 221
    .line 222
    invoke-direct {v13, v2, v1}, La/rh20;-><init>(La/nn20;B)V

    .line 223
    .line 224
    .line 225
    const/16 v15, 0x20

    .line 226
    .line 227
    const-wide/16 v9, 0x1f4

    .line 228
    .line 229
    invoke-static/range {v8 .. v15}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iput-object v0, v2, La/nn20;->W0:La/bby;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    .line 235
    invoke-interface {v3, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    :goto_6
    return-object v7

    .line 241
    :goto_7
    invoke-interface {v3, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    throw v0

    .line 245
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 246
    .line 247
    iget-boolean v1, v5, La/dm4;->j:Z

    .line 248
    .line 249
    if-eqz v1, :cond_b

    .line 250
    .line 251
    if-ne v1, v6, :cond_a

    .line 252
    .line 253
    iget-object v0, v5, La/dm4;->m:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, La/tk20;

    .line 256
    .line 257
    iget-object v1, v5, La/dm4;->l:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v1, La/ln20;

    .line 260
    .line 261
    iget-object v2, v5, La/dm4;->k:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v2, La/k050;

    .line 264
    .line 265
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    move-object v14, v0

    .line 269
    goto :goto_8

    .line 270
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    move-object v1, v3

    .line 278
    check-cast v1, La/ln20;

    .line 279
    .line 280
    iget-object v3, v1, La/ln20;->l0:La/k050;

    .line 281
    .line 282
    check-cast v2, La/tk20;

    .line 283
    .line 284
    iput-object v3, v5, La/dm4;->k:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v1, v5, La/dm4;->l:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v2, v5, La/dm4;->m:Ljava/lang/Object;

    .line 289
    .line 290
    iput-boolean v6, v5, La/dm4;->j:Z

    .line 291
    .line 292
    invoke-virtual {v3, v5}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    if-ne v4, v0, :cond_c

    .line 297
    .line 298
    move-object v7, v0

    .line 299
    goto :goto_a

    .line 300
    :cond_c
    move-object v14, v2

    .line 301
    move-object v2, v3

    .line 302
    :goto_8
    :try_start_2
    iget-object v0, v1, La/ln20;->k0:La/bby;

    .line 303
    .line 304
    if-eqz v0, :cond_d

    .line 305
    .line 306
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 307
    .line 308
    .line 309
    goto :goto_9

    .line 310
    :catchall_2
    move-exception v0

    .line 311
    goto :goto_b

    .line 312
    :cond_d
    :goto_9
    iget-object v0, v1, La/ln20;->m0:La/bby;

    .line 313
    .line 314
    if-eqz v0, :cond_e

    .line 315
    .line 316
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 317
    .line 318
    .line 319
    :cond_e
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 324
    .line 325
    iget-object v0, v1, La/ln20;->E:La/mne;

    .line 326
    .line 327
    iget-object v12, v0, La/mne;->b:La/dvj;

    .line 328
    .line 329
    new-instance v13, La/mh20;

    .line 330
    .line 331
    const/4 v0, 0x5

    .line 332
    invoke-direct {v13, v1, v0}, La/mh20;-><init>(La/ln20;B)V

    .line 333
    .line 334
    .line 335
    const/16 v15, 0x20

    .line 336
    .line 337
    const-wide/16 v9, 0x1f4

    .line 338
    .line 339
    invoke-static/range {v8 .. v15}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iput-object v0, v1, La/ln20;->k0:La/bby;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 344
    .line 345
    invoke-interface {v2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    :goto_a
    return-object v7

    .line 351
    :goto_b
    invoke-interface {v2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 356
    .line 357
    iget-boolean v1, v5, La/dm4;->j:Z

    .line 358
    .line 359
    if-eqz v1, :cond_10

    .line 360
    .line 361
    if-ne v1, v6, :cond_f

    .line 362
    .line 363
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    move-object/from16 v1, p1

    .line 367
    .line 368
    goto :goto_c

    .line 369
    :cond_f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_11

    .line 373
    .line 374
    :cond_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    iget-object v1, v5, La/dm4;->k:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v1, La/mii0;

    .line 380
    .line 381
    iget-object v1, v1, La/mii0;->c:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v1, La/bbw0;

    .line 384
    .line 385
    iget-object v4, v5, La/dm4;->l:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v4, La/sip;

    .line 388
    .line 389
    iget-object v8, v5, La/dm4;->m:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v8, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 392
    .line 393
    check-cast v3, La/jo20;

    .line 394
    .line 395
    iput-boolean v6, v5, La/dm4;->j:Z

    .line 396
    .line 397
    invoke-virtual {v1, v4, v8, v3, v5}, La/bbw0;->i(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    if-ne v1, v0, :cond_11

    .line 402
    .line 403
    move-object v7, v0

    .line 404
    goto :goto_11

    .line 405
    :cond_11
    :goto_c
    check-cast v1, Ljava/lang/Iterable;

    .line 406
    .line 407
    check-cast v2, Ljava/util/List;

    .line 408
    .line 409
    new-instance v0, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    :cond_12
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    if-eqz v3, :cond_16

    .line 423
    .line 424
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    move-object v4, v3

    .line 429
    check-cast v4, La/web;

    .line 430
    .line 431
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-nez v5, :cond_15

    .line 436
    .line 437
    iget-object v5, v4, La/web;->a:La/l26;

    .line 438
    .line 439
    if-eqz v5, :cond_13

    .line 440
    .line 441
    iget-object v5, v5, La/l26;->a:Ljava/lang/Long;

    .line 442
    .line 443
    goto :goto_e

    .line 444
    :cond_13
    move-object v5, v7

    .line 445
    :goto_e
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    if-nez v5, :cond_15

    .line 450
    .line 451
    iget-object v4, v4, La/web;->b:La/l26;

    .line 452
    .line 453
    if-eqz v4, :cond_14

    .line 454
    .line 455
    iget-object v4, v4, La/l26;->a:Ljava/lang/Long;

    .line 456
    .line 457
    goto :goto_f

    .line 458
    :cond_14
    move-object v4, v7

    .line 459
    :goto_f
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    if-eqz v4, :cond_12

    .line 464
    .line 465
    :cond_15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    goto :goto_d

    .line 469
    :cond_16
    new-instance v7, Ljava/util/ArrayList;

    .line 470
    .line 471
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-eqz v1, :cond_17

    .line 483
    .line 484
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    check-cast v1, La/web;

    .line 489
    .line 490
    invoke-static {v1}, La/feb;->h0(La/web;)Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-static {v7, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 495
    .line 496
    .line 497
    goto :goto_10

    .line 498
    :cond_17
    :goto_11
    return-object v7

    .line 499
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 500
    .line 501
    iget-boolean v1, v5, La/dm4;->j:Z

    .line 502
    .line 503
    if-eqz v1, :cond_19

    .line 504
    .line 505
    if-ne v1, v6, :cond_18

    .line 506
    .line 507
    iget-object v0, v5, La/dm4;->m:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v0, La/ts6;

    .line 510
    .line 511
    iget-object v1, v5, La/dm4;->l:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v1, La/dt6;

    .line 514
    .line 515
    iget-object v2, v5, La/dm4;->k:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v2, La/k050;

    .line 518
    .line 519
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    move-object v14, v0

    .line 523
    goto :goto_12

    .line 524
    :cond_18
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    goto :goto_14

    .line 528
    :cond_19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    move-object v1, v3

    .line 532
    check-cast v1, La/dt6;

    .line 533
    .line 534
    iget-object v3, v1, La/dt6;->c0:La/k050;

    .line 535
    .line 536
    check-cast v2, La/ts6;

    .line 537
    .line 538
    iput-object v3, v5, La/dm4;->k:Ljava/lang/Object;

    .line 539
    .line 540
    iput-object v1, v5, La/dm4;->l:Ljava/lang/Object;

    .line 541
    .line 542
    iput-object v2, v5, La/dm4;->m:Ljava/lang/Object;

    .line 543
    .line 544
    iput-boolean v6, v5, La/dm4;->j:Z

    .line 545
    .line 546
    invoke-virtual {v3, v5}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    if-ne v4, v0, :cond_1a

    .line 551
    .line 552
    move-object v7, v0

    .line 553
    goto :goto_14

    .line 554
    :cond_1a
    move-object v14, v2

    .line 555
    move-object v2, v3

    .line 556
    :goto_12
    :try_start_3
    iget-object v0, v1, La/dt6;->b0:La/bby;

    .line 557
    .line 558
    if-eqz v0, :cond_1b

    .line 559
    .line 560
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 561
    .line 562
    .line 563
    goto :goto_13

    .line 564
    :catchall_3
    move-exception v0

    .line 565
    goto :goto_15

    .line 566
    :cond_1b
    :goto_13
    iget-object v0, v1, La/dt6;->d0:La/bby;

    .line 567
    .line 568
    if-eqz v0, :cond_1c

    .line 569
    .line 570
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 571
    .line 572
    .line 573
    :cond_1c
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 578
    .line 579
    iget-object v0, v1, La/dt6;->V:La/mne;

    .line 580
    .line 581
    iget-object v12, v0, La/mne;->b:La/dvj;

    .line 582
    .line 583
    new-instance v13, La/ms6;

    .line 584
    .line 585
    const/4 v0, 0x2

    .line 586
    invoke-direct {v13, v1, v0}, La/ms6;-><init>(La/dt6;B)V

    .line 587
    .line 588
    .line 589
    const/16 v15, 0x20

    .line 590
    .line 591
    const-wide/16 v9, 0x1f4

    .line 592
    .line 593
    invoke-static/range {v8 .. v15}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    iput-object v0, v1, La/dt6;->b0:La/bby;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 598
    .line 599
    invoke-interface {v2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    :goto_14
    return-object v7

    .line 605
    :goto_15
    invoke-interface {v2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    throw v0

    .line 609
    :pswitch_4
    sget-object v8, La/wne;->a:La/wne;

    .line 610
    .line 611
    iget-boolean v0, v5, La/dm4;->j:Z

    .line 612
    .line 613
    if-eqz v0, :cond_1e

    .line 614
    .line 615
    if-ne v0, v6, :cond_1d

    .line 616
    .line 617
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    goto :goto_16

    .line 621
    :cond_1d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    goto :goto_17

    .line 625
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    iget-object v0, v5, La/dm4;->k:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v0, La/im4;

    .line 631
    .line 632
    iget-object v1, v5, La/dm4;->l:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v1, La/uu4;

    .line 635
    .line 636
    iget-object v4, v5, La/dm4;->m:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v4, Ljava/lang/String;

    .line 639
    .line 640
    check-cast v2, La/df2;

    .line 641
    .line 642
    check-cast v3, Ljava/lang/String;

    .line 643
    .line 644
    iput-boolean v6, v5, La/dm4;->j:Z

    .line 645
    .line 646
    sget v6, La/im4;->u:I

    .line 647
    .line 648
    move-object/from16 v16, v3

    .line 649
    .line 650
    move-object v3, v2

    .line 651
    move-object v2, v4

    .line 652
    move-object/from16 v4, v16

    .line 653
    .line 654
    invoke-virtual/range {v0 .. v5}, La/im4;->i(La/uu4;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    if-ne v0, v8, :cond_1f

    .line 659
    .line 660
    move-object v7, v8

    .line 661
    goto :goto_17

    .line 662
    :cond_1f
    :goto_16
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 663
    .line 664
    :goto_17
    return-object v7

    .line 665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
