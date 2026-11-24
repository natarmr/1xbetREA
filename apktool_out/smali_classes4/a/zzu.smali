.class public final La/zzu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pwi;

.field public final synthetic l:I

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kmq;La/pwi;IZZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/zzu;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/zzu;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/zzu;->k:La/pwi;

    .line 7
    .line 8
    iput p3, p0, La/zzu;->l:I

    .line 9
    .line 10
    iput-boolean p4, p0, La/zzu;->m:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/zzu;->n:Z

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(La/pwi;IZZLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/zzu;->i:B

    .line 19
    iput-object p1, p0, La/zzu;->k:La/pwi;

    iput p2, p0, La/zzu;->l:I

    iput-boolean p3, p0, La/zzu;->m:Z

    iput-boolean p4, p0, La/zzu;->n:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/zzu;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/zzu;

    .line 7
    .line 8
    iget-boolean v4, p0, La/zzu;->m:Z

    .line 9
    .line 10
    iget-boolean v5, p0, La/zzu;->n:Z

    .line 11
    .line 12
    iget-object v2, p0, La/zzu;->k:La/pwi;

    .line 13
    .line 14
    iget v3, p0, La/zzu;->l:I

    .line 15
    .line 16
    move-object v6, p2

    .line 17
    invoke-direct/range {v1 .. v6}, La/zzu;-><init>(La/pwi;IZZLa/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v1, La/zzu;->o:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v6, p2

    .line 24
    new-instance v2, La/zzu;

    .line 25
    .line 26
    iget-object p1, p0, La/zzu;->o:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v3, p1

    .line 29
    check-cast v3, La/kmq;

    .line 30
    .line 31
    move-object v8, v6

    .line 32
    iget-boolean v6, p0, La/zzu;->m:Z

    .line 33
    .line 34
    iget-boolean v7, p0, La/zzu;->n:Z

    .line 35
    .line 36
    iget-object v4, p0, La/zzu;->k:La/pwi;

    .line 37
    .line 38
    iget v5, p0, La/zzu;->l:I

    .line 39
    .line 40
    invoke-direct/range {v2 .. v8}, La/zzu;-><init>(La/kmq;La/pwi;IZZLa/yje;)V

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zzu;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/zzu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zzu;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zzu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/zzu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/zzu;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/zzu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    iget-byte v0, v9, La/zzu;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v9, La/zzu;->o:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v11, v0

    .line 15
    check-cast v11, La/kmq;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v4, v9, La/zzu;->j:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    if-ne v4, v2, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v10, La/zzu;

    .line 37
    .line 38
    iget-boolean v15, v9, La/zzu;->n:Z

    .line 39
    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    iget-object v12, v9, La/zzu;->k:La/pwi;

    .line 43
    .line 44
    iget v13, v9, La/zzu;->l:I

    .line 45
    .line 46
    iget-boolean v14, v9, La/zzu;->m:Z

    .line 47
    .line 48
    invoke-direct/range {v10 .. v16}, La/zzu;-><init>(La/kmq;La/pwi;IZZLa/yje;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 v4, 0x3c

    .line 52
    .line 53
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 54
    .line 55
    invoke-static {v4, v5, v1, v10}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v4, La/u5u;

    .line 60
    .line 61
    iget-boolean v5, v9, La/zzu;->m:Z

    .line 62
    .line 63
    invoke-direct {v4, v12, v5, v3}, La/u5u;-><init>(La/pwi;ZLa/yje;)V

    .line 64
    .line 65
    .line 66
    const-wide v5, 0x7fffffffffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v1, v5, v6, v4}, La/kpb;->k0(La/gmq;JLkotlin/jvm/functions/Function2;)La/a1g;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v3, v9, La/zzu;->o:Ljava/lang/Object;

    .line 76
    .line 77
    iput-boolean v2, v9, La/zzu;->j:Z

    .line 78
    .line 79
    invoke-static {v11, v1, v9}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-ne v1, v0, :cond_2

    .line 84
    .line 85
    move-object v3, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_1
    return-object v3

    .line 90
    :pswitch_0
    iget-object v4, v9, La/zzu;->k:La/pwi;

    .line 91
    .line 92
    sget-object v10, La/wne;->a:La/wne;

    .line 93
    .line 94
    iget-boolean v0, v9, La/zzu;->j:Z

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    if-ne v0, v2, :cond_3

    .line 99
    .line 100
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v0, p1

    .line 104
    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v3

    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 117
    .line 118
    iget-object v0, v4, La/pwi;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/x4v;

    .line 121
    .line 122
    invoke-virtual {v0}, La/x4v;->a()La/krt0;

    .line 123
    .line 124
    .line 125
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    goto :goto_2

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 129
    .line 130
    new-instance v1, La/g0g0;

    .line 131
    .line 132
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object v0, v1

    .line 136
    :goto_2
    new-instance v11, La/krt0;

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const-wide/16 v16, 0x0

    .line 140
    .line 141
    const-wide/16 v12, 0x0

    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    invoke-direct/range {v11 .. v17}, La/krt0;-><init>(JZZD)V

    .line 145
    .line 146
    .line 147
    instance-of v1, v0, La/g0g0;

    .line 148
    .line 149
    if-eqz v1, :cond_5

    .line 150
    .line 151
    move-object v0, v11

    .line 152
    :cond_5
    check-cast v0, La/krt0;

    .line 153
    .line 154
    iget-object v1, v4, La/pwi;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, La/zri;

    .line 157
    .line 158
    iget-boolean v5, v9, La/zzu;->m:Z

    .line 159
    .line 160
    if-eqz v5, :cond_6

    .line 161
    .line 162
    iget-boolean v3, v0, La/krt0;->c:Z

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    iget-boolean v3, v0, La/krt0;->b:Z

    .line 166
    .line 167
    :goto_3
    iget-wide v6, v0, La/krt0;->a:J

    .line 168
    .line 169
    iget-object v0, v4, La/pwi;->f:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, La/yiu;

    .line 172
    .line 173
    invoke-virtual {v0}, La/yiu;->a()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_8

    .line 178
    .line 179
    iget-object v0, v4, La/pwi;->j:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, La/pru;

    .line 182
    .line 183
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iget-boolean v0, v0, La/sff0;->O1:Z

    .line 188
    .line 189
    if-eqz v0, :cond_7

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    const/4 v0, 0x0

    .line 193
    move v8, v0

    .line 194
    goto :goto_5

    .line 195
    :cond_8
    :goto_4
    move v8, v2

    .line 196
    :goto_5
    iput-boolean v2, v9, La/zzu;->j:Z

    .line 197
    .line 198
    iget-object v0, v1, La/zri;->b:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, La/uii;

    .line 201
    .line 202
    iget-object v1, v1, La/zri;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, La/j1q0;

    .line 205
    .line 206
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 207
    .line 208
    invoke-virtual {v1}, La/m1q0;->j()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    move v2, v3

    .line 213
    move-wide v3, v6

    .line 214
    move v6, v1

    .line 215
    iget v1, v9, La/zzu;->l:I

    .line 216
    .line 217
    iget-boolean v7, v9, La/zzu;->n:Z

    .line 218
    .line 219
    invoke-virtual/range {v0 .. v9}, La/uii;->l(IZJZZZZLa/zje;)Ljava/io/Serializable;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, v10, :cond_9

    .line 224
    .line 225
    move-object v0, v10

    .line 226
    :cond_9
    :goto_6
    return-object v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
