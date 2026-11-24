.class public final La/x0b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/f1b0;


# direct methods
.method public synthetic constructor <init>(La/f1b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x0b0;->i:B

    iput-object p1, p0, La/x0b0;->k:La/f1b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x0b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/x0b0;->k:La/f1b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/x0b0;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/x0b0;-><init>(La/f1b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/x0b0;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/x0b0;-><init>(La/f1b0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/x0b0;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/x0b0;-><init>(La/f1b0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/x0b0;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/x0b0;-><init>(La/f1b0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/x0b0;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/x0b0;-><init>(La/f1b0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/x0b0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/x0b0;-><init>(La/f1b0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x0b0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/x0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x0b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/x0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/x0b0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/x0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/x1j;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/x0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/x0b0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/x0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/sw00;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/x0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/x0b0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/x0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/x0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/x0b0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/x0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/x0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/x0b0;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/x0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x0b0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/x0b0;->k:La/f1b0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, La/uaq0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v0, La/f1b0;->w0:I

    .line 22
    .line 23
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v3, v0

    .line 35
    check-cast v3, La/d0b0;

    .line 36
    .line 37
    sget-object v4, La/uaq0;->a:La/s9m0;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, La/s9m0;->l(La/uaq0;)Z

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    const/4 v14, 0x0

    .line 47
    const/16 v15, 0xdff

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    invoke-static/range {v3 .. v15}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    iget-object v0, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/util/List;

    .line 74
    .line 75
    sget-object v1, La/wne;->a:La/wne;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 v2, 0xa

    .line 83
    .line 84
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_1

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, La/mlr;

    .line 106
    .line 107
    iget-wide v4, v2, La/mlr;->a:J

    .line 108
    .line 109
    invoke-static {v4, v5, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    sget v0, La/f1b0;->w0:I

    .line 118
    .line 119
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 120
    .line 121
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 122
    .line 123
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-object v6, v0

    .line 131
    check-cast v6, La/d0b0;

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0xfef

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v9, 0x0

    .line 140
    const/4 v10, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    const/4 v14, 0x0

    .line 144
    const/4 v15, 0x0

    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    invoke-static/range {v6 .. v18}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_2

    .line 156
    .line 157
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_1
    iget-object v0, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, La/x1j;

    .line 163
    .line 164
    sget-object v1, La/wne;->a:La/wne;

    .line 165
    .line 166
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    instance-of v1, v0, La/v1j;

    .line 170
    .line 171
    if-eqz v1, :cond_3

    .line 172
    .line 173
    move-object v2, v0

    .line 174
    check-cast v2, La/v1j;

    .line 175
    .line 176
    :cond_3
    if-eqz v2, :cond_4

    .line 177
    .line 178
    iget-boolean v0, v2, La/v1j;->a:Z

    .line 179
    .line 180
    if-eqz v0, :cond_4

    .line 181
    .line 182
    sget v0, La/f1b0;->w0:I

    .line 183
    .line 184
    sget-object v0, La/sza0;->a:La/sza0;

    .line 185
    .line 186
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v0, v3, La/f1b0;->w:La/b4j;

    .line 190
    .line 191
    sget-object v1, La/a4j;->c:La/usd;

    .line 192
    .line 193
    const-string v1, "popular_new_aggregator"

    .line 194
    .line 195
    invoke-virtual {v0, v1}, La/b4j;->k(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, v3, La/f1b0;->E:La/je;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, La/je;->k(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_2
    iget-object v1, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, La/sw00;

    .line 209
    .line 210
    sget-object v3, La/wne;->a:La/wne;

    .line 211
    .line 212
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-boolean v3, v1, La/sw00;->b:Z

    .line 216
    .line 217
    if-nez v3, :cond_8

    .line 218
    .line 219
    iget-boolean v1, v1, La/sw00;->a:Z

    .line 220
    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    sget v1, La/f1b0;->w0:I

    .line 224
    .line 225
    iget-object v5, v0, La/x0b0;->k:La/f1b0;

    .line 226
    .line 227
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 228
    .line 229
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 230
    .line 231
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-object v6, v1

    .line 239
    check-cast v6, La/d0b0;

    .line 240
    .line 241
    const/16 v17, 0x1

    .line 242
    .line 243
    const/16 v18, 0x7ff

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    const/4 v8, 0x0

    .line 247
    const/4 v9, 0x0

    .line 248
    const/4 v10, 0x0

    .line 249
    const/4 v11, 0x0

    .line 250
    const/4 v12, 0x0

    .line 251
    const/4 v13, 0x0

    .line 252
    const/4 v14, 0x0

    .line 253
    const/4 v15, 0x0

    .line 254
    const/16 v16, 0x0

    .line 255
    .line 256
    invoke-static/range {v6 .. v18}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_5

    .line 265
    .line 266
    iget-object v0, v5, La/f1b0;->o0:La/bby;

    .line 267
    .line 268
    if-eqz v0, :cond_6

    .line 269
    .line 270
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 271
    .line 272
    .line 273
    :cond_6
    iget-object v0, v5, La/f1b0;->t0:La/bby;

    .line 274
    .line 275
    if-eqz v0, :cond_7

    .line 276
    .line 277
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 278
    .line 279
    .line 280
    :cond_7
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iget-object v1, v5, La/f1b0;->x:La/mne;

    .line 285
    .line 286
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 287
    .line 288
    new-instance v3, La/wma0;

    .line 289
    .line 290
    const/4 v9, 0x0

    .line 291
    const/4 v10, 0x6

    .line 292
    const/4 v4, 0x1

    .line 293
    const-class v6, La/f1b0;

    .line 294
    .line 295
    const-string v7, "handleBasicThrowable"

    .line 296
    .line 297
    const-string v8, "handleBasicThrowable(Ljava/lang/Throwable;)V"

    .line 298
    .line 299
    invoke-direct/range {v3 .. v10}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 300
    .line 301
    .line 302
    new-instance v12, La/w0b0;

    .line 303
    .line 304
    invoke-direct {v12, v5, v2, v4}, La/w0b0;-><init>(La/f1b0;La/yje;B)V

    .line 305
    .line 306
    .line 307
    const/16 v13, 0x20

    .line 308
    .line 309
    const-wide/16 v7, 0xa

    .line 310
    .line 311
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 312
    .line 313
    move-object v6, v0

    .line 314
    move-object v10, v1

    .line 315
    move-object v11, v3

    .line 316
    invoke-static/range {v6 .. v13}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iput-object v0, v5, La/f1b0;->t0:La/bby;

    .line 321
    .line 322
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_3
    iget-object v0, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Ljava/lang/Throwable;

    .line 328
    .line 329
    sget-object v1, La/wne;->a:La/wne;

    .line 330
    .line 331
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    new-instance v1, La/jfa0;

    .line 335
    .line 336
    const/16 v2, 0x14

    .line 337
    .line 338
    invoke-direct {v1, v2}, La/jfa0;-><init>(B)V

    .line 339
    .line 340
    .line 341
    sget v2, La/f1b0;->w0:I

    .line 342
    .line 343
    invoke-virtual {v3, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3, v0}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_4
    iget-object v0, v0, La/x0b0;->j:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Ljava/util/List;

    .line 355
    .line 356
    sget-object v1, La/wne;->a:La/wne;

    .line 357
    .line 358
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    sget v1, La/f1b0;->w0:I

    .line 362
    .line 363
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 364
    .line 365
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 366
    .line 367
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-object v3, v2

    .line 375
    check-cast v3, La/d0b0;

    .line 376
    .line 377
    const/4 v4, 0x0

    .line 378
    invoke-static {v3, v4, v4, v0}, La/h8x;->y(La/d0b0;ZZLjava/util/List;)La/d0b0;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_9

    .line 387
    .line 388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
