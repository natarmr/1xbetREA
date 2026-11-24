.class public final La/rj5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/dk5;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/dk5;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rj5;->a:B

    iput-object p1, p0, La/rj5;->b:La/kmq;

    iput-object p2, p0, La/rj5;->c:La/dk5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/rj5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    iget-object v2, p0, La/rj5;->c:La/dk5;

    .line 5
    .line 6
    iget-object v3, p0, La/rj5;->b:La/kmq;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

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
    instance-of v0, p2, La/ak5;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move-object v0, p2

    .line 22
    check-cast v0, La/ak5;

    .line 23
    .line 24
    iget v8, v0, La/ak5;->j:I

    .line 25
    .line 26
    and-int v9, v8, v5

    .line 27
    .line 28
    if-eqz v9, :cond_0

    .line 29
    .line 30
    sub-int/2addr v8, v5

    .line 31
    iput v8, v0, La/ak5;->j:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, La/ak5;

    .line 35
    .line 36
    invoke-direct {v0, p0, p2}, La/ak5;-><init>(La/rj5;La/yje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p0, v0, La/ak5;->i:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p2, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v5, v0, La/ak5;->j:I

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    .line 49
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, La/fl80;

    .line 61
    .line 62
    new-instance p0, La/vj5;

    .line 63
    .line 64
    const/4 v4, 0x3

    .line 65
    invoke-direct {p0, v2, v7, v4}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v2, La/fl80;

    .line 72
    .line 73
    iget-object v4, p1, La/fl80;->a:La/gmq;

    .line 74
    .line 75
    new-instance v5, La/fnq;

    .line 76
    .line 77
    invoke-direct {v5, v4, p0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p1, La/fl80;->b:La/w6t0;

    .line 81
    .line 82
    iget-object p1, p1, La/fl80;->c:La/zxv;

    .line 83
    .line 84
    sget-object v1, La/pul;->n:La/pul;

    .line 85
    .line 86
    invoke-direct {v2, v5, p0, p1, v1}, La/fl80;-><init>(La/gmq;La/w6t0;La/zxv;Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    .line 89
    iput v6, v0, La/ak5;->j:I

    .line 90
    .line 91
    invoke-interface {v3, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, p2, :cond_3

    .line 96
    .line 97
    move-object v7, p2

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_2
    return-object v7

    .line 102
    :pswitch_0
    instance-of v0, p2, La/xj5;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    move-object v0, p2

    .line 107
    check-cast v0, La/xj5;

    .line 108
    .line 109
    iget v8, v0, La/xj5;->j:I

    .line 110
    .line 111
    and-int v9, v8, v5

    .line 112
    .line 113
    if-eqz v9, :cond_4

    .line 114
    .line 115
    sub-int/2addr v8, v5

    .line 116
    iput v8, v0, La/xj5;->j:I

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    new-instance v0, La/xj5;

    .line 120
    .line 121
    invoke-direct {v0, p0, p2}, La/xj5;-><init>(La/rj5;La/yje;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    iget-object p0, v0, La/xj5;->i:Ljava/lang/Object;

    .line 125
    .line 126
    sget-object p2, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget v5, v0, La/xj5;->j:I

    .line 129
    .line 130
    if-eqz v5, :cond_6

    .line 131
    .line 132
    if-ne v5, v6, :cond_5

    .line 133
    .line 134
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    check-cast p1, La/fl80;

    .line 146
    .line 147
    new-instance p0, La/vj5;

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-direct {p0, v2, v7, v4}, La/vj5;-><init>(La/dk5;La/yje;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-instance v2, La/fl80;

    .line 157
    .line 158
    iget-object v4, p1, La/fl80;->a:La/gmq;

    .line 159
    .line 160
    new-instance v5, La/fnq;

    .line 161
    .line 162
    invoke-direct {v5, v4, p0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 163
    .line 164
    .line 165
    iget-object p0, p1, La/fl80;->b:La/w6t0;

    .line 166
    .line 167
    iget-object p1, p1, La/fl80;->c:La/zxv;

    .line 168
    .line 169
    sget-object v1, La/pul;->n:La/pul;

    .line 170
    .line 171
    invoke-direct {v2, v5, p0, p1, v1}, La/fl80;-><init>(La/gmq;La/w6t0;La/zxv;Lkotlin/jvm/functions/Function0;)V

    .line 172
    .line 173
    .line 174
    iput v6, v0, La/xj5;->j:I

    .line 175
    .line 176
    invoke-interface {v3, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, p2, :cond_7

    .line 181
    .line 182
    move-object v7, p2

    .line 183
    goto :goto_5

    .line 184
    :cond_7
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_5
    return-object v7

    .line 187
    :pswitch_1
    instance-of v0, p2, La/qj5;

    .line 188
    .line 189
    if-eqz v0, :cond_8

    .line 190
    .line 191
    move-object v0, p2

    .line 192
    check-cast v0, La/qj5;

    .line 193
    .line 194
    iget v1, v0, La/qj5;->j:I

    .line 195
    .line 196
    and-int v8, v1, v5

    .line 197
    .line 198
    if-eqz v8, :cond_8

    .line 199
    .line 200
    sub-int/2addr v1, v5

    .line 201
    iput v1, v0, La/qj5;->j:I

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_8
    new-instance v0, La/qj5;

    .line 205
    .line 206
    invoke-direct {v0, p0, p2}, La/qj5;-><init>(La/rj5;La/yje;)V

    .line 207
    .line 208
    .line 209
    :goto_6
    iget-object p0, v0, La/qj5;->i:Ljava/lang/Object;

    .line 210
    .line 211
    sget-object p2, La/wne;->a:La/wne;

    .line 212
    .line 213
    iget v1, v0, La/qj5;->j:I

    .line 214
    .line 215
    if-eqz v1, :cond_a

    .line 216
    .line 217
    if-ne v1, v6, :cond_9

    .line 218
    .line 219
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_a

    .line 227
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    check-cast p1, Ljava/util/List;

    .line 231
    .line 232
    new-instance p0, Ljava/util/ArrayList;

    .line 233
    .line 234
    const/16 v1, 0xa

    .line 235
    .line 236
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_b

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, La/mjz;

    .line 258
    .line 259
    iget-object v4, v2, La/dk5;->B:La/ctf0;

    .line 260
    .line 261
    invoke-static {v1, v4}, La/j0x;->M(La/mjz;La/ctf0;)La/tjz;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_b
    new-instance p1, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    :cond_c
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_d

    .line 283
    .line 284
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    instance-of v2, v1, La/tjz;

    .line 289
    .line 290
    if-eqz v2, :cond_c

    .line 291
    .line 292
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_d
    iput v6, v0, La/qj5;->j:I

    .line 297
    .line 298
    invoke-interface {v3, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    if-ne p0, p2, :cond_e

    .line 303
    .line 304
    move-object v7, p2

    .line 305
    goto :goto_a

    .line 306
    :cond_e
    :goto_9
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    :goto_a
    return-object v7

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
