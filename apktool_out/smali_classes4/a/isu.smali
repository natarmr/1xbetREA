.class public final La/isu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:La/kmq;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/isu;->i:B

    iput-object p1, p0, La/isu;->m:Ljava/lang/Object;

    iput-boolean p2, p0, La/isu;->l:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/isu;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/isu;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/isu;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, La/kmq;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Throwable;

    .line 10
    .line 11
    check-cast p3, La/yje;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p2, La/isu;

    .line 17
    .line 18
    check-cast p0, La/tzi;

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    invoke-direct {p2, p0, v1, p3, v0}, La/isu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p2, La/isu;->k:La/kmq;

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {p2, p0}, La/isu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    new-instance p2, La/isu;

    .line 34
    .line 35
    check-cast p0, La/pwi;

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    invoke-direct {p2, p0, v1, p3, v0}, La/isu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p2, La/isu;->k:La/kmq;

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    invoke-virtual {p2, p0}, La/isu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_1
    new-instance p2, La/isu;

    .line 51
    .line 52
    check-cast p0, La/pzu;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-direct {p2, p0, v1, p3, v0}, La/isu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p2, La/isu;->k:La/kmq;

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    invoke-virtual {p2, p0}, La/isu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_2
    new-instance p2, La/isu;

    .line 68
    .line 69
    check-cast p0, La/wdu;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p2, p0, v1, p3, v0}, La/isu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p2, La/isu;->k:La/kmq;

    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    invoke-virtual {p2, p0}, La/isu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/isu;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/isu;->l:Z

    .line 4
    .line 5
    iget-object v2, p0, La/isu;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/isu;->k:La/kmq;

    .line 16
    .line 17
    sget-object v7, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v8, p0, La/isu;->j:B

    .line 20
    .line 21
    if-eqz v8, :cond_2

    .line 22
    .line 23
    if-eq v8, v4, :cond_1

    .line 24
    .line 25
    if-ne v8, v5, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v2, La/tzi;

    .line 43
    .line 44
    iget-object p1, v2, La/tzi;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/e1u;

    .line 47
    .line 48
    iput-object v0, p0, La/isu;->k:La/kmq;

    .line 49
    .line 50
    iput-byte v4, p0, La/isu;->j:B

    .line 51
    .line 52
    invoke-virtual {p1, v1}, La/e1u;->e(Z)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v7, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    sget-object p1, La/iun;->a:La/iun;

    .line 68
    .line 69
    iput-object v6, p0, La/isu;->k:La/kmq;

    .line 70
    .line 71
    iput-byte v5, p0, La/isu;->j:B

    .line 72
    .line 73
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v7, :cond_4

    .line 78
    .line 79
    :goto_1
    move-object v6, v7

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_3
    return-object v6

    .line 84
    :pswitch_0
    iget-object v0, p0, La/isu;->k:La/kmq;

    .line 85
    .line 86
    sget-object v7, La/wne;->a:La/wne;

    .line 87
    .line 88
    iget-byte v8, p0, La/isu;->j:B

    .line 89
    .line 90
    if-eqz v8, :cond_7

    .line 91
    .line 92
    if-eq v8, v4, :cond_6

    .line 93
    .line 94
    if-ne v8, v5, :cond_5

    .line 95
    .line 96
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    check-cast v2, La/pwi;

    .line 112
    .line 113
    iget-object p1, v2, La/pwi;->g:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, La/e1u;

    .line 116
    .line 117
    iput-object v0, p0, La/isu;->k:La/kmq;

    .line 118
    .line 119
    iput-byte v4, p0, La/isu;->j:B

    .line 120
    .line 121
    invoke-virtual {p1, v1}, La/e1u;->e(Z)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v7, :cond_8

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    :goto_4
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_9

    .line 135
    .line 136
    sget-object p1, La/iun;->a:La/iun;

    .line 137
    .line 138
    iput-object v6, p0, La/isu;->k:La/kmq;

    .line 139
    .line 140
    iput-byte v5, p0, La/isu;->j:B

    .line 141
    .line 142
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-ne p0, v7, :cond_9

    .line 147
    .line 148
    :goto_5
    move-object v6, v7

    .line 149
    goto :goto_7

    .line 150
    :cond_9
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_7
    return-object v6

    .line 153
    :pswitch_1
    iget-object v0, p0, La/isu;->k:La/kmq;

    .line 154
    .line 155
    sget-object v7, La/wne;->a:La/wne;

    .line 156
    .line 157
    iget-byte v8, p0, La/isu;->j:B

    .line 158
    .line 159
    if-eqz v8, :cond_c

    .line 160
    .line 161
    if-eq v8, v4, :cond_b

    .line 162
    .line 163
    if-ne v8, v5, :cond_a

    .line 164
    .line 165
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_a

    .line 169
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_b

    .line 173
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    check-cast v2, La/pzu;

    .line 181
    .line 182
    iget-object p1, v2, La/pzu;->d:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p1, La/hnu;

    .line 185
    .line 186
    iput-object v0, p0, La/isu;->k:La/kmq;

    .line 187
    .line 188
    iput-byte v4, p0, La/isu;->j:B

    .line 189
    .line 190
    invoke-virtual {p1, v1, p0}, La/hnu;->f(ZLa/zje;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-ne p1, v7, :cond_d

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_d
    :goto_8
    check-cast p1, Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_e

    .line 204
    .line 205
    sget-object p1, La/iun;->a:La/iun;

    .line 206
    .line 207
    iput-object v6, p0, La/isu;->k:La/kmq;

    .line 208
    .line 209
    iput-byte v5, p0, La/isu;->j:B

    .line 210
    .line 211
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-ne p0, v7, :cond_e

    .line 216
    .line 217
    :goto_9
    move-object v6, v7

    .line 218
    goto :goto_b

    .line 219
    :cond_e
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    :goto_b
    return-object v6

    .line 222
    :pswitch_2
    iget-object v0, p0, La/isu;->k:La/kmq;

    .line 223
    .line 224
    sget-object v7, La/wne;->a:La/wne;

    .line 225
    .line 226
    iget-byte v8, p0, La/isu;->j:B

    .line 227
    .line 228
    if-eqz v8, :cond_11

    .line 229
    .line 230
    if-eq v8, v4, :cond_10

    .line 231
    .line 232
    if-ne v8, v5, :cond_f

    .line 233
    .line 234
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_e

    .line 238
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_f

    .line 242
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    check-cast v2, La/wdu;

    .line 250
    .line 251
    iget-object p1, v2, La/wdu;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p1, La/ocl;

    .line 254
    .line 255
    invoke-virtual {p1, v1}, La/ocl;->f(Z)La/p6d;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    iput-object v0, p0, La/isu;->k:La/kmq;

    .line 260
    .line 261
    iput-byte v4, p0, La/isu;->j:B

    .line 262
    .line 263
    invoke-static {p1, p0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    if-ne p1, v7, :cond_12

    .line 268
    .line 269
    goto :goto_d

    .line 270
    :cond_12
    :goto_c
    check-cast p1, Ljava/util/Collection;

    .line 271
    .line 272
    if-eqz p1, :cond_13

    .line 273
    .line 274
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_14

    .line 279
    .line 280
    :cond_13
    sget-object p1, La/iun;->a:La/iun;

    .line 281
    .line 282
    iput-object v6, p0, La/isu;->k:La/kmq;

    .line 283
    .line 284
    iput-byte v5, p0, La/isu;->j:B

    .line 285
    .line 286
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    if-ne p0, v7, :cond_14

    .line 291
    .line 292
    :goto_d
    move-object v6, v7

    .line 293
    goto :goto_f

    .line 294
    :cond_14
    :goto_e
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    :goto_f
    return-object v6

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
