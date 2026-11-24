.class public final La/vdu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/wdu;

.field public final synthetic l:Z

.field public final synthetic m:B


# direct methods
.method public constructor <init>(La/wdu;ZILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vdu;->k:La/wdu;

    .line 2
    .line 3
    iput-boolean p2, p0, La/vdu;->l:Z

    .line 4
    .line 5
    iput-byte p3, p0, La/vdu;->m:B

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/vdu;

    .line 2
    .line 3
    iget-boolean v1, p0, La/vdu;->l:Z

    .line 4
    .line 5
    iget-byte v2, p0, La/vdu;->m:B

    .line 6
    .line 7
    iget-object p0, p0, La/vdu;->k:La/wdu;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p2}, La/vdu;-><init>(La/wdu;ZILa/yje;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/vdu;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/vdu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vdu;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/vdu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/vdu;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/vdu;->i:B

    .line 8
    .line 9
    iget-object v3, p0, La/vdu;->k:La/wdu;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v6

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v3, La/wdu;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, La/hsj;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    new-array v2, v2, [La/z7b;

    .line 44
    .line 45
    iput-object v0, p0, La/vdu;->j:Ljava/lang/Object;

    .line 46
    .line 47
    iput-byte v5, p0, La/vdu;->i:B

    .line 48
    .line 49
    invoke-virtual {p1, v2, p0}, La/hsj;->r([La/z7b;La/zje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v1, :cond_3

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    :goto_0
    check-cast p1, La/a3b;

    .line 57
    .line 58
    iget-object p1, p1, La/a3b;->a:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v7, v5

    .line 80
    check-cast v7, La/vh0;

    .line 81
    .line 82
    iget-wide v7, v7, La/vh0;->f:J

    .line 83
    .line 84
    const-wide/16 v9, 0x2

    .line 85
    .line 86
    cmp-long v9, v7, v9

    .line 87
    .line 88
    if-eqz v9, :cond_5

    .line 89
    .line 90
    const-wide/16 v9, 0x0

    .line 91
    .line 92
    cmp-long v7, v7, v9

    .line 93
    .line 94
    if-nez v7, :cond_4

    .line 95
    .line 96
    :cond_5
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 101
    .line 102
    const/16 v5, 0xa

    .line 103
    .line 104
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, La/vh0;

    .line 126
    .line 127
    new-instance v7, La/lv;

    .line 128
    .line 129
    iget-byte v8, p0, La/vdu;->m:B

    .line 130
    .line 131
    invoke-direct {v7, v3, v5, v8, v6}, La/lv;-><init>(La/wdu;La/vh0;ILa/yje;)V

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x3

    .line 135
    invoke-static {v0, v6, v7, v5}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    iput-object v6, p0, La/vdu;->j:Ljava/lang/Object;

    .line 144
    .line 145
    iput-byte v4, p0, La/vdu;->i:B

    .line 146
    .line 147
    invoke-static {p1, p0}, La/qjj;->N(Ljava/util/Collection;La/zje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v1, :cond_8

    .line 152
    .line 153
    :goto_3
    return-object v1

    .line 154
    :cond_8
    :goto_4
    check-cast p1, Ljava/util/List;

    .line 155
    .line 156
    iget-boolean p0, p0, La/vdu;->l:Z

    .line 157
    .line 158
    if-eqz p0, :cond_9

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-eqz p0, :cond_9

    .line 165
    .line 166
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 167
    .line 168
    sget-object p0, La/iun;->a:La/iun;

    .line 169
    .line 170
    goto/16 :goto_9

    .line 171
    .line 172
    :cond_9
    if-eqz p1, :cond_a

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_a

    .line 179
    .line 180
    goto :goto_8

    .line 181
    :cond_a
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_11

    .line 190
    .line 191
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, La/j0g0;

    .line 196
    .line 197
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 198
    .line 199
    instance-of v0, v0, La/g0g0;

    .line 200
    .line 201
    if-nez v0, :cond_b

    .line 202
    .line 203
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 204
    .line 205
    new-instance p0, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    :cond_c
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_e

    .line 219
    .line 220
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, La/j0g0;

    .line 225
    .line 226
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 227
    .line 228
    instance-of v1, v0, La/g0g0;

    .line 229
    .line 230
    if-eqz v1, :cond_d

    .line 231
    .line 232
    move-object v0, v6

    .line 233
    :cond_d
    check-cast v0, La/j8b;

    .line 234
    .line 235
    if-eqz v0, :cond_c

    .line 236
    .line 237
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_e
    new-instance p1, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    :cond_f
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_10

    .line 255
    .line 256
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    move-object v1, v0

    .line 261
    check-cast v1, La/j8b;

    .line 262
    .line 263
    iget-object v1, v1, La/j8b;->c:Ljava/util/List;

    .line 264
    .line 265
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-nez v1, :cond_f

    .line 270
    .line 271
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_10
    :goto_7
    move-object p0, p1

    .line 276
    goto :goto_9

    .line 277
    :cond_11
    :goto_8
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 278
    .line 279
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    check-cast p0, La/j0g0;

    .line 284
    .line 285
    if-eqz p0, :cond_12

    .line 286
    .line 287
    iget-object p0, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 288
    .line 289
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    if-nez p0, :cond_13

    .line 294
    .line 295
    :cond_12
    new-instance p0, La/zhi0;

    .line 296
    .line 297
    invoke-direct {p0}, La/zhi0;-><init>()V

    .line 298
    .line 299
    .line 300
    :cond_13
    new-instance p1, La/g0g0;

    .line 301
    .line 302
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 303
    .line 304
    .line 305
    goto :goto_7

    .line 306
    :goto_9
    new-instance p1, La/j0g0;

    .line 307
    .line 308
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    return-object p1
.end method
