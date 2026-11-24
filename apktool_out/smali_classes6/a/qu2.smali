.class public final La/qu2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:F

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FLa/yje;B)V
    .locals 0

    .line 15
    iput-byte p4, p0, La/qu2;->i:B

    iput-object p1, p0, La/qu2;->l:Ljava/lang/Object;

    iput p2, p0, La/qu2;->k:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/bzl;FLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/qu2;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/qu2;->j:Z

    .line 5
    .line 6
    iput-object p2, p0, La/qu2;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/qu2;->k:F

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/qu2;->i:B

    .line 2
    .line 3
    iget v0, p0, La/qu2;->k:F

    .line 4
    .line 5
    iget-object v1, p0, La/qu2;->l:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, La/qu2;

    .line 11
    .line 12
    check-cast v1, La/bo10;

    .line 13
    .line 14
    const/4 p1, 0x5

    .line 15
    invoke-direct {p0, v1, v0, p2, p1}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    new-instance p0, La/qu2;

    .line 20
    .line 21
    check-cast v1, La/o2s;

    .line 22
    .line 23
    const/4 p1, 0x4

    .line 24
    invoke-direct {p0, v1, v0, p2, p1}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    new-instance p0, La/qu2;

    .line 29
    .line 30
    check-cast v1, La/rah0;

    .line 31
    .line 32
    const/4 p1, 0x3

    .line 33
    invoke-direct {p0, v1, v0, p2, p1}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_2
    new-instance p1, La/qu2;

    .line 38
    .line 39
    iget-boolean p0, p0, La/qu2;->j:Z

    .line 40
    .line 41
    check-cast v1, La/bzl;

    .line 42
    .line 43
    invoke-direct {p1, p0, v1, v0, p2}, La/qu2;-><init>(ZLa/bzl;FLa/yje;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_3
    new-instance p0, La/qu2;

    .line 48
    .line 49
    check-cast v1, La/et8;

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    invoke-direct {p0, v1, v0, p2, p1}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_4
    new-instance p0, La/qu2;

    .line 57
    .line 58
    check-cast v1, La/qv2;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-direct {p0, v1, v0, p2, p1}, La/qu2;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
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
    iget-byte v0, p0, La/qu2;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qu2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qu2;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qu2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qu2;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qu2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qu2;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/qu2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/qu2;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/qu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/qu2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/qu2;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/qu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/qu2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/qu2;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/qu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
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
    .locals 14

    .line 1
    iget-byte v0, p0, La/qu2;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget v3, p0, La/qu2;->k:F

    .line 7
    .line 8
    iget-object v4, p0, La/qu2;->l:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v1, p0, La/qu2;->j:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v6, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    check-cast v4, La/bo10;

    .line 35
    .line 36
    iget-object v1, v4, La/bo10;->B:La/p7m0;

    .line 37
    .line 38
    new-instance v2, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    .line 41
    .line 42
    .line 43
    iput-boolean v6, p0, La/qu2;->j:Z

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    if-ne v1, v0, :cond_2

    .line 54
    .line 55
    move-object v7, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    :goto_1
    return-object v7

    .line 60
    :pswitch_0
    check-cast v4, La/o2s;

    .line 61
    .line 62
    sget-object v8, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget-boolean v0, p0, La/qu2;->j:Z

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v6, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v4, La/o2s;->c:La/t33;

    .line 84
    .line 85
    iget-object v2, v4, La/o2s;->f:La/pz40;

    .line 86
    .line 87
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    check-cast v9, La/eah0;

    .line 92
    .line 93
    const/high16 v10, 0x3f800000    # 1.0f

    .line 94
    .line 95
    const/4 v11, 0x0

    .line 96
    if-nez v9, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    instance-of v12, v9, La/y9h0;

    .line 100
    .line 101
    if-eqz v12, :cond_6

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    instance-of v9, v9, La/bah0;

    .line 105
    .line 106
    if-eqz v9, :cond_b

    .line 107
    .line 108
    move v11, v10

    .line 109
    :goto_2
    new-instance v9, Ljava/lang/Float;

    .line 110
    .line 111
    invoke-direct {v9, v11}, Ljava/lang/Float;-><init>(F)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, La/eah0;

    .line 119
    .line 120
    const/4 v11, 0x6

    .line 121
    const/high16 v12, 0x43960000    # 300.0f

    .line 122
    .line 123
    if-nez v2, :cond_7

    .line 124
    .line 125
    mul-float/2addr v12, v3

    .line 126
    float-to-int v2, v12

    .line 127
    invoke-static {v2, v1, v7, v11}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :goto_3
    move-object v2, v1

    .line 132
    goto :goto_4

    .line 133
    :cond_7
    instance-of v13, v2, La/y9h0;

    .line 134
    .line 135
    if-eqz v13, :cond_8

    .line 136
    .line 137
    mul-float/2addr v12, v3

    .line 138
    float-to-int v2, v12

    .line 139
    invoke-static {v2, v1, v7, v11}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    goto :goto_3

    .line 144
    :cond_8
    instance-of v2, v2, La/bah0;

    .line 145
    .line 146
    if-eqz v2, :cond_a

    .line 147
    .line 148
    sub-float/2addr v10, v3

    .line 149
    mul-float/2addr v10, v12

    .line 150
    float-to-int v2, v10

    .line 151
    invoke-static {v2, v1, v7, v11}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    goto :goto_3

    .line 156
    :goto_4
    new-instance v1, La/l2s;

    .line 157
    .line 158
    invoke-direct {v1, v4, v6}, La/l2s;-><init>(La/o2s;B)V

    .line 159
    .line 160
    .line 161
    iput-boolean v6, p0, La/qu2;->j:Z

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    const/4 v6, 0x4

    .line 165
    move-object v5, p0

    .line 166
    move-object v4, v1

    .line 167
    move-object v1, v9

    .line 168
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v8, :cond_9

    .line 173
    .line 174
    move-object v7, v8

    .line 175
    goto :goto_6

    .line 176
    :cond_9
    :goto_5
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 184
    .line 185
    .line 186
    :goto_6
    return-object v7

    .line 187
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 188
    .line 189
    iget-boolean v8, p0, La/qu2;->j:Z

    .line 190
    .line 191
    if-eqz v8, :cond_d

    .line 192
    .line 193
    if-ne v8, v6, :cond_c

    .line 194
    .line 195
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_c
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    check-cast v4, La/rah0;

    .line 207
    .line 208
    invoke-static {v3}, La/si30;->b(F)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    sget-object v3, La/ihn;->a:La/zsf;

    .line 213
    .line 214
    const/4 v7, 0x2

    .line 215
    const/16 v8, 0x12c

    .line 216
    .line 217
    invoke-static {v8, v1, v3, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iput-boolean v6, p0, La/qu2;->j:Z

    .line 222
    .line 223
    invoke-virtual {v4, v2, v1, p0}, La/rah0;->f(ILa/cfq;La/bnn0;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-ne v1, v0, :cond_e

    .line 228
    .line 229
    move-object v7, v0

    .line 230
    goto :goto_8

    .line 231
    :cond_e
    :goto_7
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    :goto_8
    return-object v7

    .line 234
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 235
    .line 236
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-boolean v0, p0, La/qu2;->j:Z

    .line 240
    .line 241
    if-eqz v0, :cond_10

    .line 242
    .line 243
    check-cast v4, La/bzl;

    .line 244
    .line 245
    iget-object v0, v4, La/bzl;->a:La/oyq0;

    .line 246
    .line 247
    iget v1, v0, La/oyq0;->a:F

    .line 248
    .line 249
    neg-float v2, v3

    .line 250
    cmpg-float v1, v1, v2

    .line 251
    .line 252
    if-nez v1, :cond_f

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_f
    neg-float v1, v3

    .line 256
    iput v1, v0, La/oyq0;->a:F

    .line 257
    .line 258
    :cond_10
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 262
    .line 263
    iget-boolean v1, p0, La/qu2;->j:Z

    .line 264
    .line 265
    if-eqz v1, :cond_12

    .line 266
    .line 267
    if-ne v1, v6, :cond_11

    .line 268
    .line 269
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_11
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto :goto_b

    .line 277
    :cond_12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    check-cast v4, La/et8;

    .line 281
    .line 282
    iget-object v1, v4, La/et8;->a:La/t33;

    .line 283
    .line 284
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    check-cast v2, Ljava/lang/Number;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    add-float/2addr v2, v3

    .line 295
    new-instance v3, Ljava/lang/Float;

    .line 296
    .line 297
    invoke-direct {v3, v2}, Ljava/lang/Float;-><init>(F)V

    .line 298
    .line 299
    .line 300
    iput-boolean v6, p0, La/qu2;->j:Z

    .line 301
    .line 302
    invoke-virtual {v1, p0, v3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    if-ne v1, v0, :cond_13

    .line 307
    .line 308
    move-object v7, v0

    .line 309
    goto :goto_b

    .line 310
    :cond_13
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_b
    return-object v7

    .line 313
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 314
    .line 315
    iget-boolean v1, p0, La/qu2;->j:Z

    .line 316
    .line 317
    if-eqz v1, :cond_15

    .line 318
    .line 319
    if-ne v1, v6, :cond_14

    .line 320
    .line 321
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_14
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    check-cast v4, La/qv2;

    .line 333
    .line 334
    iput-boolean v6, p0, La/qu2;->j:Z

    .line 335
    .line 336
    invoke-virtual {v4, v3, p0}, La/qv2;->y(FLa/bnn0;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    if-ne v1, v0, :cond_16

    .line 341
    .line 342
    move-object v7, v0

    .line 343
    goto :goto_d

    .line 344
    :cond_16
    :goto_c
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_d
    return-object v7

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
