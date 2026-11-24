.class public final La/u7n;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Z

.field public final synthetic l:I

.field public m:J

.field public final synthetic n:J

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;La/dgu;ZIJJLjava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/u7n;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/u7n;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/u7n;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/u7n;->k:Z

    .line 9
    .line 10
    iput p4, p0, La/u7n;->l:I

    .line 11
    .line 12
    iput-wide p5, p0, La/u7n;->m:J

    .line 13
    .line 14
    iput-wide p7, p0, La/u7n;->n:J

    .line 15
    .line 16
    iput-object p9, p0, La/u7n;->q:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(ZILa/egk0;Ljava/lang/Long;JLa/pz40;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/u7n;->i:B

    .line 23
    iput-boolean p1, p0, La/u7n;->k:Z

    iput p2, p0, La/u7n;->l:I

    iput-object p3, p0, La/u7n;->o:Ljava/lang/Object;

    iput-object p4, p0, La/u7n;->p:Ljava/lang/Object;

    iput-wide p5, p0, La/u7n;->n:J

    iput-object p7, p0, La/u7n;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u7n;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/u7n;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/u7n;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/u7n;->o:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v5, La/u7n;

    .line 15
    .line 16
    move-object v6, v4

    .line 17
    check-cast v6, Ljava/util/List;

    .line 18
    .line 19
    move-object v7, v3

    .line 20
    check-cast v7, La/dgu;

    .line 21
    .line 22
    iget-wide v10, v0, La/u7n;->m:J

    .line 23
    .line 24
    iget-wide v12, v0, La/u7n;->n:J

    .line 25
    .line 26
    move-object v14, v2

    .line 27
    check-cast v14, Ljava/lang/String;

    .line 28
    .line 29
    iget-boolean v8, v0, La/u7n;->k:Z

    .line 30
    .line 31
    iget v9, v0, La/u7n;->l:I

    .line 32
    .line 33
    move-object/from16 v15, p2

    .line 34
    .line 35
    invoke-direct/range {v5 .. v15}, La/u7n;-><init>(Ljava/util/List;La/dgu;ZIJJLjava/lang/String;La/yje;)V

    .line 36
    .line 37
    .line 38
    return-object v5

    .line 39
    :pswitch_0
    new-instance v6, La/u7n;

    .line 40
    .line 41
    move-object v9, v4

    .line 42
    check-cast v9, La/egk0;

    .line 43
    .line 44
    move-object v10, v3

    .line 45
    check-cast v10, Ljava/lang/Long;

    .line 46
    .line 47
    iget-wide v11, v0, La/u7n;->n:J

    .line 48
    .line 49
    move-object v13, v2

    .line 50
    check-cast v13, La/pz40;

    .line 51
    .line 52
    iget-boolean v7, v0, La/u7n;->k:Z

    .line 53
    .line 54
    iget v8, v0, La/u7n;->l:I

    .line 55
    .line 56
    move-object/from16 v14, p2

    .line 57
    .line 58
    invoke-direct/range {v6 .. v14}, La/u7n;-><init>(ZILa/egk0;Ljava/lang/Long;JLa/pz40;La/yje;)V

    .line 59
    .line 60
    .line 61
    return-object v6

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u7n;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u7n;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u7n;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u7n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u7n;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u7n;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u7n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-byte v0, v11, La/u7n;->i:B

    .line 4
    .line 5
    iget-object v1, v11, La/u7n;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, v11, La/u7n;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    iget-object v6, v11, La/u7n;->o:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v12, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v0, v11, La/u7n;->j:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v5, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v6

    .line 40
    check-cast v0, Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget-object v3, La/iun;->a:La/iun;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    check-cast v2, La/dgu;

    .line 52
    .line 53
    iget-object v0, v2, La/dgu;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, La/wdu;

    .line 56
    .line 57
    check-cast v6, Ljava/util/List;

    .line 58
    .line 59
    iget-wide v2, v11, La/u7n;->m:J

    .line 60
    .line 61
    move-object v10, v1

    .line 62
    check-cast v10, Ljava/lang/String;

    .line 63
    .line 64
    iput-boolean v5, v11, La/u7n;->j:Z

    .line 65
    .line 66
    sget-object v8, La/j8p;->c:La/j8p;

    .line 67
    .line 68
    move-wide v4, v2

    .line 69
    iget-boolean v2, v11, La/u7n;->k:Z

    .line 70
    .line 71
    iget v3, v11, La/u7n;->l:I

    .line 72
    .line 73
    move-object v1, v6

    .line 74
    iget-wide v6, v11, La/u7n;->n:J

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-virtual/range {v0 .. v11}, La/wdu;->h(Ljava/util/List;ZIJJLa/j8p;ZLjava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v12, :cond_3

    .line 82
    .line 83
    move-object v3, v12

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    :goto_0
    move-object v3, v0

    .line 86
    check-cast v3, Ljava/util/List;

    .line 87
    .line 88
    :goto_1
    return-object v3

    .line 89
    :pswitch_0
    check-cast v6, La/egk0;

    .line 90
    .line 91
    check-cast v1, La/pz40;

    .line 92
    .line 93
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    iget-boolean v7, v11, La/u7n;->j:Z

    .line 96
    .line 97
    const-wide/16 v8, 0x0

    .line 98
    .line 99
    const-wide/16 v12, 0x3e8

    .line 100
    .line 101
    if-eqz v7, :cond_5

    .line 102
    .line 103
    if-ne v7, v5, :cond_4

    .line 104
    .line 105
    iget-wide v3, v11, La/u7n;->m:J

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-boolean v3, v11, La/u7n;->k:Z

    .line 119
    .line 120
    if-nez v3, :cond_6

    .line 121
    .line 122
    sget-object v0, La/v7n;->a:La/ugg0;

    .line 123
    .line 124
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 129
    .line 130
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_6
    iget v3, v11, La/u7n;->l:I

    .line 137
    .line 138
    int-to-long v3, v3

    .line 139
    mul-long/2addr v3, v12

    .line 140
    :goto_2
    invoke-virtual {v6}, La/egk0;->l()J

    .line 141
    .line 142
    .line 143
    move-result-wide v14

    .line 144
    cmp-long v7, v14, v8

    .line 145
    .line 146
    if-lez v7, :cond_a

    .line 147
    .line 148
    iput-wide v3, v11, La/u7n;->m:J

    .line 149
    .line 150
    iput-boolean v5, v11, La/u7n;->j:Z

    .line 151
    .line 152
    invoke-static {v12, v13, v11}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    if-ne v7, v0, :cond_7

    .line 157
    .line 158
    move-object v3, v0

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    :goto_3
    move-object v7, v2

    .line 161
    check-cast v7, Ljava/lang/Long;

    .line 162
    .line 163
    if-eqz v7, :cond_8

    .line 164
    .line 165
    iget-wide v14, v11, La/u7n;->n:J

    .line 166
    .line 167
    invoke-static {v7, v14, v15}, La/v7n;->f(Ljava/lang/Long;J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v14

    .line 171
    goto :goto_4

    .line 172
    :cond_8
    invoke-virtual {v6}, La/egk0;->l()J

    .line 173
    .line 174
    .line 175
    move-result-wide v14

    .line 176
    sub-long/2addr v14, v3

    .line 177
    cmp-long v7, v14, v8

    .line 178
    .line 179
    if-gez v7, :cond_9

    .line 180
    .line 181
    move-wide v14, v8

    .line 182
    :cond_9
    :goto_4
    invoke-virtual {v6, v14, v15}, La/egk0;->m(J)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_a
    sget-object v0, La/v7n;->a:La/ugg0;

    .line 187
    .line 188
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 193
    .line 194
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_5
    return-object v3

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
