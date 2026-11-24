.class public final La/ekg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:F

.field public final synthetic m:La/xk80;

.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/xcz;FLa/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/ekg;->i:B

    iput-object p1, p0, La/ekg;->k:Ljava/lang/Object;

    iput p2, p0, La/ekg;->l:F

    iput-object p3, p0, La/ekg;->m:La/xk80;

    iput p4, p0, La/ekg;->n:I

    iput-object p5, p0, La/ekg;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/xk80;IFLa/j73;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/ekg;->i:B

    .line 2
    iput-object p1, p0, La/ekg;->m:La/xk80;

    iput p2, p0, La/ekg;->n:I

    iput p3, p0, La/ekg;->l:F

    iput-object p4, p0, La/ekg;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ekg;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/ekg;

    .line 7
    .line 8
    iget-object v0, p0, La/ekg;->o:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v5, v0

    .line 11
    check-cast v5, La/j73;

    .line 12
    .line 13
    iget-object v2, p0, La/ekg;->m:La/xk80;

    .line 14
    .line 15
    iget v3, p0, La/ekg;->n:I

    .line 16
    .line 17
    iget v4, p0, La/ekg;->l:F

    .line 18
    .line 19
    move-object v6, p2

    .line 20
    invoke-direct/range {v1 .. v6}, La/ekg;-><init>(La/xk80;IFLa/j73;La/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v1, La/ekg;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    move-object v8, p2

    .line 27
    new-instance v2, La/ekg;

    .line 28
    .line 29
    iget-object p1, p0, La/ekg;->k:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    check-cast v3, La/xcz;

    .line 33
    .line 34
    iget-object p1, p0, La/ekg;->o:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v7, p1

    .line 37
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    const/4 v9, 0x1

    .line 40
    iget v4, p0, La/ekg;->l:F

    .line 41
    .line 42
    iget-object v5, p0, La/ekg;->m:La/xk80;

    .line 43
    .line 44
    iget v6, p0, La/ekg;->n:I

    .line 45
    .line 46
    invoke-direct/range {v2 .. v9}, La/ekg;-><init>(La/xcz;FLa/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_1
    move-object v8, p2

    .line 51
    new-instance v2, La/ekg;

    .line 52
    .line 53
    iget-object p1, p0, La/ekg;->k:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v3, p1

    .line 56
    check-cast v3, La/xcz;

    .line 57
    .line 58
    iget-object p1, p0, La/ekg;->o:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v7, p1

    .line 61
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    iget v4, p0, La/ekg;->l:F

    .line 65
    .line 66
    iget-object v5, p0, La/ekg;->m:La/xk80;

    .line 67
    .line 68
    iget v6, p0, La/ekg;->n:I

    .line 69
    .line 70
    invoke-direct/range {v2 .. v9}, La/ekg;-><init>(La/xcz;FLa/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ekg;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qah0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ekg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ekg;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ekg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ekg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ekg;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ekg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ekg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ekg;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ekg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/ekg;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/ekg;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, La/ekg;->l:F

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v8, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v0, p0, La/ekg;->j:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-ne v0, v7, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, La/ekg;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/qah0;

    .line 39
    .line 40
    new-instance v5, La/u8z;

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    iget-object v9, p0, La/ekg;->m:La/xk80;

    .line 44
    .line 45
    invoke-direct {v5, v0, v9, v6}, La/u8z;-><init>(La/qah0;La/bch0;B)V

    .line 46
    .line 47
    .line 48
    check-cast v2, La/j73;

    .line 49
    .line 50
    iput-boolean v7, p0, La/ekg;->j:Z

    .line 51
    .line 52
    sget-object v0, La/zk80;->a:La/yk80;

    .line 53
    .line 54
    new-instance v0, Ljava/lang/Integer;

    .line 55
    .line 56
    iget v6, p0, La/ekg;->n:I

    .line 57
    .line 58
    invoke-direct {v0, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {v9, v0}, La/xk80;->j(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object v10, v9, La/xk80;->q:La/cgk0;

    .line 70
    .line 71
    invoke-virtual {v10, v0}, La/cgk0;->m(I)V

    .line 72
    .line 73
    .line 74
    iget v0, v9, La/xk80;->e:I

    .line 75
    .line 76
    if-le v6, v0, :cond_2

    .line 77
    .line 78
    move v0, v7

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v0, v1

    .line 81
    :goto_0
    invoke-virtual {v5}, La/u8z;->e()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    iget v11, v9, La/xk80;->e:I

    .line 86
    .line 87
    sub-int/2addr v10, v11

    .line 88
    add-int/2addr v10, v7

    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {v5}, La/u8z;->e()I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-gt v6, v11, :cond_4

    .line 96
    .line 97
    :cond_3
    if-nez v0, :cond_8

    .line 98
    .line 99
    iget v11, v9, La/xk80;->e:I

    .line 100
    .line 101
    if-ge v6, v11, :cond_8

    .line 102
    .line 103
    :cond_4
    iget v11, v9, La/xk80;->e:I

    .line 104
    .line 105
    sub-int v11, v6, v11

    .line 106
    .line 107
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    const/4 v12, 0x3

    .line 112
    if-lt v11, v12, :cond_8

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    sub-int v0, v6, v10

    .line 117
    .line 118
    iget v9, v9, La/xk80;->e:I

    .line 119
    .line 120
    if-ge v0, v9, :cond_7

    .line 121
    .line 122
    move v0, v9

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    add-int/2addr v10, v6

    .line 125
    iget v0, v9, La/xk80;->e:I

    .line 126
    .line 127
    if-le v10, v0, :cond_6

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    move v0, v10

    .line 131
    :cond_7
    :goto_1
    invoke-virtual {v5, v0, v1}, La/u8z;->f(II)V

    .line 132
    .line 133
    .line 134
    :cond_8
    invoke-virtual {v5, v6}, La/u8z;->b(I)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    int-to-float v0, v0

    .line 139
    add-float v1, v0, v3

    .line 140
    .line 141
    new-instance v0, La/jie0;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    new-instance v3, La/xd80;

    .line 147
    .line 148
    invoke-direct {v3, v0, v5, v7}, La/xd80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    const/4 v5, 0x4

    .line 152
    const/4 v0, 0x0

    .line 153
    move-object v4, p0

    .line 154
    invoke-static/range {v0 .. v5}, La/hhm0;->n(FFLa/j73;Lkotlin/jvm/functions/Function2;La/bnn0;I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-ne v0, v8, :cond_9

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    :goto_2
    if-ne v0, v8, :cond_a

    .line 164
    .line 165
    move-object v5, v8

    .line 166
    goto :goto_4

    .line 167
    :cond_a
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    :goto_4
    return-object v5

    .line 170
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 171
    .line 172
    iget-boolean v1, p0, La/ekg;->j:Z

    .line 173
    .line 174
    if-eqz v1, :cond_c

    .line 175
    .line 176
    if-ne v1, v7, :cond_b

    .line 177
    .line 178
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_b
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v1, p0, La/ekg;->k:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v1, La/xcz;

    .line 192
    .line 193
    new-instance v5, La/ckg;

    .line 194
    .line 195
    invoke-direct {v5, v1, v3, v7}, La/ckg;-><init>(La/xcz;FB)V

    .line 196
    .line 197
    .line 198
    const/4 v12, 0x0

    .line 199
    invoke-static {v12, v5}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    new-instance v8, La/dkg;

    .line 204
    .line 205
    move-object v11, v2

    .line 206
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 207
    .line 208
    const/4 v13, 0x1

    .line 209
    iget-object v9, p0, La/ekg;->m:La/xk80;

    .line 210
    .line 211
    iget v10, p0, La/ekg;->n:I

    .line 212
    .line 213
    invoke-direct/range {v8 .. v13}, La/dkg;-><init>(La/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V

    .line 214
    .line 215
    .line 216
    iput-boolean v7, p0, La/ekg;->j:Z

    .line 217
    .line 218
    invoke-static {v1, v8, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-ne v1, v0, :cond_d

    .line 223
    .line 224
    move-object v5, v0

    .line 225
    goto :goto_6

    .line 226
    :cond_d
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    :goto_6
    return-object v5

    .line 229
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 230
    .line 231
    iget-boolean v8, p0, La/ekg;->j:Z

    .line 232
    .line 233
    if-eqz v8, :cond_f

    .line 234
    .line 235
    if-ne v8, v7, :cond_e

    .line 236
    .line 237
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_e
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    iget-object v5, p0, La/ekg;->k:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v5, La/xcz;

    .line 251
    .line 252
    new-instance v6, La/ckg;

    .line 253
    .line 254
    invoke-direct {v6, v5, v3, v1}, La/ckg;-><init>(La/xcz;FB)V

    .line 255
    .line 256
    .line 257
    const/4 v12, 0x0

    .line 258
    invoke-static {v12, v6}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    new-instance v8, La/dkg;

    .line 263
    .line 264
    move-object v11, v2

    .line 265
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 266
    .line 267
    const/4 v13, 0x0

    .line 268
    iget-object v9, p0, La/ekg;->m:La/xk80;

    .line 269
    .line 270
    iget v10, p0, La/ekg;->n:I

    .line 271
    .line 272
    invoke-direct/range {v8 .. v13}, La/dkg;-><init>(La/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V

    .line 273
    .line 274
    .line 275
    iput-boolean v7, p0, La/ekg;->j:Z

    .line 276
    .line 277
    invoke-static {v1, v8, p0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    if-ne v1, v0, :cond_10

    .line 282
    .line 283
    move-object v5, v0

    .line 284
    goto :goto_8

    .line 285
    :cond_10
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    :goto_8
    return-object v5

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
