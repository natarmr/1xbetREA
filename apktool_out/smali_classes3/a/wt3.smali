.class public final La/wt3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/zu3;


# direct methods
.method public synthetic constructor <init>(La/zu3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wt3;->i:B

    iput-object p1, p0, La/wt3;->j:La/zu3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wt3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wt3;->j:La/zu3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wt3;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wt3;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/wt3;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/wt3;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/wt3;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wt3;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wt3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wt3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wt3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wt3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wt3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wt3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wt3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wt3;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wt3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/wt3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/wt3;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/wt3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/wt3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/wt3;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/wt3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wt3;->i:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    iget-object v0, v0, La/wt3;->j:La/zu3;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, La/zu3;->J:La/z7z;

    .line 18
    .line 19
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/pru;

    .line 24
    .line 25
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/zu3;->l:La/z7z;

    .line 36
    .line 37
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/flt;

    .line 42
    .line 43
    iget-object v1, v0, La/flt;->d:La/bby;

    .line 44
    .line 45
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, v0, La/flt;->c:La/sje;

    .line 49
    .line 50
    iget-wide v5, v0, La/flt;->e:J

    .line 51
    .line 52
    cmp-long v1, v5, v2

    .line 53
    .line 54
    const-wide/16 v5, 0x258

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    :cond_0
    move-wide v8, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v1, v0, La/flt;->b:La/viu;

    .line 61
    .line 62
    invoke-virtual {v1}, La/viu;->a()J

    .line 63
    .line 64
    .line 65
    move-result-wide v7

    .line 66
    iget-wide v9, v0, La/flt;->e:J

    .line 67
    .line 68
    sub-long/2addr v7, v9

    .line 69
    const-wide/16 v9, 0x3e8

    .line 70
    .line 71
    div-long/2addr v7, v9

    .line 72
    sub-long/2addr v5, v7

    .line 73
    cmp-long v1, v5, v2

    .line 74
    .line 75
    if-gez v1, :cond_0

    .line 76
    .line 77
    move-wide v8, v2

    .line 78
    :goto_0
    new-instance v15, La/gkr;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    const/16 v2, 0xb

    .line 82
    .line 83
    invoke-direct {v15, v0, v1, v2}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 84
    .line 85
    .line 86
    const/16 v16, 0xe8

    .line 87
    .line 88
    const-string v5, "GeoUpdateExecutorImpl.start"

    .line 89
    .line 90
    const-wide/16 v6, 0x258

    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    const-wide/16 v11, 0x0

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    const/4 v14, 0x0

    .line 97
    invoke-static/range {v4 .. v16}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v1, v0, La/flt;->d:La/bby;

    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 107
    .line 108
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v0, La/zu3;->l:La/z7z;

    .line 112
    .line 113
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/flt;

    .line 118
    .line 119
    iget-object v0, v0, La/flt;->d:La/bby;

    .line 120
    .line 121
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 122
    .line 123
    .line 124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 128
    .line 129
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, La/zu3;->i:La/z7z;

    .line 133
    .line 134
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, La/zgk;

    .line 139
    .line 140
    iget-object v1, v0, La/zgk;->a:La/kt2;

    .line 141
    .line 142
    iget-object v0, v0, La/zgk;->b:La/tgk;

    .line 143
    .line 144
    invoke-virtual {v0}, La/tgk;->g()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    const-string v0, "1"

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    const-string v0, "0"

    .line 154
    .line 155
    :goto_1
    const-string v2, "root_user"

    .line 156
    .line 157
    invoke-interface {v1, v2, v0}, La/kt2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 164
    .line 165
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    sget v1, La/zu3;->s0:I

    .line 169
    .line 170
    invoke-virtual {v0, v2, v3}, La/zu3;->A(J)V

    .line 171
    .line 172
    .line 173
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object v0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
