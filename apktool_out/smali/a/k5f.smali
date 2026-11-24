.class public final La/k5f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:J

.field public final synthetic m:I

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(La/r7f;JIZLa/yje;B)V
    .locals 0

    .line 17
    iput-byte p7, p0, La/k5f;->i:B

    iput-object p1, p0, La/k5f;->k:Ljava/lang/Object;

    iput-wide p2, p0, La/k5f;->l:J

    iput p4, p0, La/k5f;->m:I

    iput-boolean p5, p0, La/k5f;->n:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/wti;IJZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/k5f;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/k5f;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/k5f;->m:I

    .line 7
    .line 8
    iput-wide p3, p0, La/k5f;->l:J

    .line 9
    .line 10
    iput-boolean p5, p0, La/k5f;->n:Z

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte p1, p0, La/k5f;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/k5f;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/k5f;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/wti;

    .line 12
    .line 13
    iget-wide v4, p0, La/k5f;->l:J

    .line 14
    .line 15
    iget-boolean v6, p0, La/k5f;->n:Z

    .line 16
    .line 17
    iget v3, p0, La/k5f;->m:I

    .line 18
    .line 19
    move-object v7, p2

    .line 20
    invoke-direct/range {v1 .. v7}, La/k5f;-><init>(La/wti;IJZLa/yje;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    move-object v8, p2

    .line 25
    new-instance v2, La/k5f;

    .line 26
    .line 27
    move-object v3, v0

    .line 28
    check-cast v3, La/r7f;

    .line 29
    .line 30
    iget-boolean v7, p0, La/k5f;->n:Z

    .line 31
    .line 32
    const/4 v9, 0x1

    .line 33
    iget-wide v4, p0, La/k5f;->l:J

    .line 34
    .line 35
    iget v6, p0, La/k5f;->m:I

    .line 36
    .line 37
    invoke-direct/range {v2 .. v9}, La/k5f;-><init>(La/r7f;JIZLa/yje;B)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :pswitch_1
    move-object v8, p2

    .line 42
    new-instance v2, La/k5f;

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    check-cast v3, La/r7f;

    .line 46
    .line 47
    iget-boolean v7, p0, La/k5f;->n:Z

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    iget-wide v4, p0, La/k5f;->l:J

    .line 51
    .line 52
    iget v6, p0, La/k5f;->m:I

    .line 53
    .line 54
    invoke-direct/range {v2 .. v9}, La/k5f;-><init>(La/r7f;JIZLa/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k5f;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/k5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/k5f;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/k5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/vne;

    .line 32
    .line 33
    check-cast p2, La/yje;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, La/k5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/k5f;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/k5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/vne;

    .line 49
    .line 50
    check-cast p2, La/yje;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, La/k5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/k5f;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/k5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget-byte v0, v4, La/k5f;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v3, v4, La/k5f;->k:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, La/wti;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v0, v4, La/k5f;->j:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v5, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, v4, La/k5f;->n:Z

    .line 36
    .line 37
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 38
    .line 39
    iget-object v1, v3, La/wti;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/gst0;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, La/gst0;->d(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 54
    .line 55
    new-instance v1, La/g0g0;

    .line 56
    .line 57
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v1

    .line 61
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    instance-of v2, v0, La/g0g0;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :cond_2
    check-cast v0, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    iget-object v0, v3, La/wti;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/gst0;

    .line 77
    .line 78
    invoke-virtual {v0}, La/gst0;->e()J

    .line 79
    .line 80
    .line 81
    move-result-wide v13

    .line 82
    iget-object v0, v3, La/wti;->b:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v8, v0

    .line 85
    check-cast v8, La/eu7;

    .line 86
    .line 87
    iput-boolean v5, v4, La/k5f;->j:Z

    .line 88
    .line 89
    iget-object v0, v8, La/eu7;->g:La/mne;

    .line 90
    .line 91
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 92
    .line 93
    new-instance v7, La/du7;

    .line 94
    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    iget v9, v4, La/k5f;->m:I

    .line 98
    .line 99
    iget-wide v10, v4, La/k5f;->l:J

    .line 100
    .line 101
    iget-boolean v15, v4, La/k5f;->n:Z

    .line 102
    .line 103
    invoke-direct/range {v7 .. v16}, La/du7;-><init>(La/eu7;IJZJZLa/yje;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v7, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sget-object v1, La/wne;->a:La/wne;

    .line 111
    .line 112
    if-ne v0, v1, :cond_3

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_1
    if-ne v0, v6, :cond_4

    .line 118
    .line 119
    move-object v1, v6

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_3
    return-object v1

    .line 124
    :pswitch_0
    check-cast v3, La/r7f;

    .line 125
    .line 126
    sget-object v0, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget-boolean v6, v4, La/k5f;->j:Z

    .line 129
    .line 130
    iget-wide v7, v4, La/k5f;->l:J

    .line 131
    .line 132
    if-eqz v6, :cond_6

    .line 133
    .line 134
    if-ne v6, v5, :cond_5

    .line 135
    .line 136
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object v1, La/p0f;->c:La/p0f;

    .line 148
    .line 149
    iput-boolean v5, v4, La/k5f;->j:Z

    .line 150
    .line 151
    invoke-virtual {v3, v1, v7, v8, v4}, La/r7f;->U(La/p0f;JLa/zje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-ne v1, v0, :cond_7

    .line 156
    .line 157
    move-object v1, v0

    .line 158
    goto :goto_5

    .line 159
    :cond_7
    :goto_4
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v1, v3, La/r7f;->Y0:La/mne;

    .line 164
    .line 165
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 166
    .line 167
    sget-object v10, La/j5f;->a:La/j5f;

    .line 168
    .line 169
    new-instance v2, La/k5f;

    .line 170
    .line 171
    move-wide v5, v7

    .line 172
    const/4 v8, 0x0

    .line 173
    const/4 v9, 0x0

    .line 174
    move-wide v13, v5

    .line 175
    iget v6, v4, La/k5f;->m:I

    .line 176
    .line 177
    iget-boolean v7, v4, La/k5f;->n:Z

    .line 178
    .line 179
    move-wide v4, v13

    .line 180
    invoke-direct/range {v2 .. v9}, La/k5f;-><init>(La/r7f;JIZLa/yje;B)V

    .line 181
    .line 182
    .line 183
    const/16 v14, 0xa

    .line 184
    .line 185
    const/4 v11, 0x0

    .line 186
    move-object v9, v0

    .line 187
    move-object v13, v2

    .line 188
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 189
    .line 190
    .line 191
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    :goto_5
    return-object v1

    .line 194
    :pswitch_1
    move-object v6, v3

    .line 195
    check-cast v6, La/r7f;

    .line 196
    .line 197
    sget-object v7, La/wne;->a:La/wne;

    .line 198
    .line 199
    iget-boolean v0, v4, La/k5f;->j:Z

    .line 200
    .line 201
    if-eqz v0, :cond_9

    .line 202
    .line 203
    if-ne v0, v5, :cond_8

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, La/r7f;->g0()V

    .line 217
    .line 218
    .line 219
    iget-object v0, v6, La/r7f;->M:La/wdu;

    .line 220
    .line 221
    iput-boolean v5, v4, La/k5f;->j:Z

    .line 222
    .line 223
    iget v1, v4, La/k5f;->m:I

    .line 224
    .line 225
    iget-wide v2, v4, La/k5f;->l:J

    .line 226
    .line 227
    iget-boolean v5, v4, La/k5f;->n:Z

    .line 228
    .line 229
    invoke-virtual/range {v0 .. v5}, La/wdu;->u(IJLa/zje;Z)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v7, :cond_a

    .line 234
    .line 235
    move-object v1, v7

    .line 236
    goto :goto_7

    .line 237
    :cond_a
    :goto_6
    iget-object v0, v6, La/r7f;->b0:La/ni9;

    .line 238
    .line 239
    invoke-virtual {v0}, La/ni9;->b()V

    .line 240
    .line 241
    .line 242
    new-instance v0, La/s4f;

    .line 243
    .line 244
    const/16 v1, 0x9

    .line 245
    .line 246
    invoke-direct {v0, v6, v1}, La/s4f;-><init>(La/r7f;B)V

    .line 247
    .line 248
    .line 249
    const/4 v1, 0x0

    .line 250
    invoke-virtual {v6, v1, v1, v0}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 251
    .line 252
    .line 253
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    :goto_7
    return-object v1

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
