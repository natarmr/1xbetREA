.class public final La/i7g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/j7g;Ljava/util/List;La/o4g;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/i7g;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/i7g;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/i7g;->j:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, La/i7g;->n:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/lk40;La/wk40;Ljava/lang/Object;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/i7g;->i:B

    .line 15
    iput-object p1, p0, La/i7g;->k:Ljava/lang/Object;

    iput-object p2, p0, La/i7g;->m:Ljava/lang/Object;

    iput-object p3, p0, La/i7g;->n:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/favorites/impl/presentation/category/f;La/wcb;Ljava/util/List;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/i7g;->i:B

    .line 16
    iput-object p1, p0, La/i7g;->l:Ljava/lang/Object;

    iput-object p2, p0, La/i7g;->m:Ljava/lang/Object;

    iput-object p3, p0, La/i7g;->n:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/i7g;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i7g;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/i7g;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/da10;

    .line 11
    .line 12
    check-cast p2, Ljava/util/List;

    .line 13
    .line 14
    check-cast p3, La/yje;

    .line 15
    .line 16
    new-instance v0, La/i7g;

    .line 17
    .line 18
    iget-object p0, p0, La/i7g;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/lk40;

    .line 21
    .line 22
    check-cast v2, La/wk40;

    .line 23
    .line 24
    invoke-direct {v0, p0, v2, v1, p3}, La/i7g;-><init>(La/lk40;La/wk40;Ljava/lang/Object;La/yje;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, La/i7g;->l:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p2, v0, La/i7g;->j:Ljava/util/List;

    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, La/i7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/String;

    .line 41
    .line 42
    check-cast p3, La/yje;

    .line 43
    .line 44
    new-instance v0, La/i7g;

    .line 45
    .line 46
    iget-object p0, p0, La/i7g;->l:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 49
    .line 50
    check-cast v2, La/wcb;

    .line 51
    .line 52
    check-cast v1, Ljava/util/List;

    .line 53
    .line 54
    invoke-direct {v0, p0, v2, v1, p3}, La/i7g;-><init>(Lorg/xplatform/favorites/impl/presentation/category/f;La/wcb;Ljava/util/List;La/yje;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, v0, La/i7g;->j:Ljava/util/List;

    .line 58
    .line 59
    iput-object p2, v0, La/i7g;->k:Ljava/lang/Object;

    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    invoke-virtual {v0, p0}, La/i7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_1
    check-cast p1, Ljava/util/Set;

    .line 69
    .line 70
    check-cast p2, Ljava/lang/String;

    .line 71
    .line 72
    check-cast p3, La/yje;

    .line 73
    .line 74
    new-instance v0, La/i7g;

    .line 75
    .line 76
    check-cast v2, La/j7g;

    .line 77
    .line 78
    iget-object p0, p0, La/i7g;->j:Ljava/util/List;

    .line 79
    .line 80
    check-cast v1, La/o4g;

    .line 81
    .line 82
    invoke-direct {v0, v2, p0, v1, p3}, La/i7g;-><init>(La/j7g;Ljava/util/List;La/o4g;La/yje;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Ljava/util/Set;

    .line 86
    .line 87
    iput-object p1, v0, La/i7g;->l:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p2, v0, La/i7g;->k:Ljava/lang/Object;

    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    invoke-virtual {v0, p0}, La/i7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i7g;->i:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/i7g;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/i7g;->m:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, La/wk40;

    .line 17
    .line 18
    iget-object v1, v0, La/i7g;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/da10;

    .line 21
    .line 22
    iget-object v14, v0, La/i7g;->j:Ljava/util/List;

    .line 23
    .line 24
    sget-object v2, La/wne;->a:La/wne;

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, La/i7g;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/lk40;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v1, La/nk40;

    .line 36
    .line 37
    iget-object v8, v6, La/wk40;->j:La/ctf0;

    .line 38
    .line 39
    iget-object v2, v6, La/wk40;->v:La/n0o0;

    .line 40
    .line 41
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    iget-object v2, v6, La/wk40;->o:La/r9u;

    .line 52
    .line 53
    sget-object v3, La/ygp;->t:La/ygp;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 64
    .line 65
    invoke-virtual {v2, v3}, La/m1q0;->d(La/ygp;)Z

    .line 66
    .line 67
    .line 68
    move-result v19

    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iget-object v9, v0, La/lk40;->b:La/ypl0;

    .line 80
    .line 81
    iget-object v10, v0, La/lk40;->a:La/ljg;

    .line 82
    .line 83
    sget-object v13, La/iun;->a:La/iun;

    .line 84
    .line 85
    const-string v16, "POST_GAME_HEADER"

    .line 86
    .line 87
    sget-wide v17, La/ijg;->J0:J

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    const/4 v12, 0x0

    .line 91
    invoke-static/range {v7 .. v19}, La/uvw;->p(La/lc00;La/ctf0;La/ypl0;La/ljg;IILjava/util/List;Ljava/util/List;ZLjava/lang/String;JZ)V

    .line 92
    .line 93
    .line 94
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget-object v0, v0, La/lk40;->a:La/ljg;

    .line 103
    .line 104
    iget-object v3, v0, La/ljg;->b:La/f2h;

    .line 105
    .line 106
    iget-object v0, v0, La/ljg;->c:La/f2h;

    .line 107
    .line 108
    filled-new-array {v3, v0}, [La/f2h;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-direct {v1, v2, v0}, La/nk40;-><init>(La/i4;Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 121
    .line 122
    instance-of v0, v5, La/g0g0;

    .line 123
    .line 124
    if-eqz v0, :cond_1

    .line 125
    .line 126
    invoke-virtual {v6, v1}, La/wk40;->w(La/da10;)La/ok40;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    goto :goto_0

    .line 131
    :cond_1
    sget-object v1, La/pk40;->a:La/pk40;

    .line 132
    .line 133
    :goto_0
    iget-object v7, v6, La/wk40;->w:La/p7m0;

    .line 134
    .line 135
    :cond_2
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    move-object v2, v0

    .line 140
    check-cast v2, La/qk40;

    .line 141
    .line 142
    invoke-virtual {v7, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_0
    iget-object v1, v0, La/i7g;->l:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 154
    .line 155
    iget-object v7, v0, La/i7g;->j:Ljava/util/List;

    .line 156
    .line 157
    iget-object v0, v0, La/i7g;->k:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ljava/lang/String;

    .line 160
    .line 161
    sget-object v8, La/wne;->a:La/wne;

    .line 162
    .line 163
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-lez v8, :cond_3

    .line 171
    .line 172
    move v8, v3

    .line 173
    goto :goto_1

    .line 174
    :cond_3
    move v8, v4

    .line 175
    :goto_1
    if-eqz v8, :cond_8

    .line 176
    .line 177
    new-instance v9, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-eqz v10, :cond_7

    .line 191
    .line 192
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    move-object v11, v10

    .line 197
    check-cast v11, La/d0t;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    if-nez v12, :cond_5

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_5
    iget-object v12, v11, La/d0t;->o:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v12, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    if-nez v12, :cond_6

    .line 213
    .line 214
    iget-object v12, v11, La/d0t;->b:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {v12, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    if-nez v12, :cond_6

    .line 221
    .line 222
    invoke-static {v11}, La/qzb;->c0(La/d0t;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    invoke-static {v12, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-nez v12, :cond_6

    .line 231
    .line 232
    invoke-static {v11}, La/qzb;->r0(La/d0t;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-static {v11, v0, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-eqz v11, :cond_4

    .line 241
    .line 242
    :cond_6
    :goto_3
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_7
    move-object v7, v9

    .line 247
    :cond_8
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_9

    .line 252
    .line 253
    iget-object v0, v1, Lorg/xplatform/favorites/impl/presentation/category/f;->f:La/l0s;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iput-object v7, v0, La/l0s;->y:Ljava/util/List;

    .line 259
    .line 260
    :cond_9
    iget-object v10, v1, Lorg/xplatform/favorites/impl/presentation/category/f;->h:La/ctf0;

    .line 261
    .line 262
    iget-object v11, v1, Lorg/xplatform/favorites/impl/presentation/category/f;->g:La/y78;

    .line 263
    .line 264
    iget-object v0, v1, Lorg/xplatform/favorites/impl/presentation/category/f;->i:La/lbu;

    .line 265
    .line 266
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    iget-object v0, v1, Lorg/xplatform/favorites/impl/presentation/category/f;->s:La/n0o0;

    .line 271
    .line 272
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, La/sff0;

    .line 277
    .line 278
    iget-boolean v13, v0, La/sff0;->J:Z

    .line 279
    .line 280
    move-object v14, v6

    .line 281
    check-cast v14, La/wcb;

    .line 282
    .line 283
    move-object v15, v5

    .line 284
    check-cast v15, Ljava/util/List;

    .line 285
    .line 286
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    new-instance v0, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 301
    .line 302
    .line 303
    new-instance v1, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    :cond_a
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_b

    .line 317
    .line 318
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    move-object v6, v5

    .line 323
    check-cast v6, La/d0t;

    .line 324
    .line 325
    iget-boolean v6, v6, La/d0t;->C:Z

    .line 326
    .line 327
    if-eqz v6, :cond_a

    .line 328
    .line 329
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_b
    new-instance v3, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    if-eqz v5, :cond_c

    .line 351
    .line 352
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    move-object v9, v5

    .line 357
    check-cast v9, La/d0t;

    .line 358
    .line 359
    invoke-static/range {v9 .. v15}, La/e0t;->a(La/d0t;La/ctf0;La/y78;ZZLa/wcb;Ljava/util/List;)La/b0s;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 368
    .line 369
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    :cond_d
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    if-eqz v6, :cond_e

    .line 381
    .line 382
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    move-object v7, v6

    .line 387
    check-cast v7, La/d0t;

    .line 388
    .line 389
    iget-boolean v7, v7, La/d0t;->C:Z

    .line 390
    .line 391
    if-nez v7, :cond_d

    .line 392
    .line 393
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_6

    .line 397
    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_f

    .line 415
    .line 416
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    move-object v9, v2

    .line 421
    check-cast v9, La/d0t;

    .line 422
    .line 423
    invoke-static/range {v9 .. v15}, La/e0t;->a(La/d0t;La/ctf0;La/y78;ZZLa/wcb;Ljava/util/List;)La/b0s;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-nez v1, :cond_10

    .line 436
    .line 437
    new-instance v1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;

    .line 438
    .line 439
    new-array v2, v4, [Ljava/lang/Object;

    .line 440
    .line 441
    iget-object v6, v10, La/ctf0;->b:La/lsm0;

    .line 442
    .line 443
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const v7, 0x7f130b3f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    invoke-direct {v1, v2, v6, v4}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LiveCategory;-><init>(Ljava/lang/String;IZ)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 465
    .line 466
    .line 467
    :cond_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    if-nez v1, :cond_11

    .line 472
    .line 473
    new-instance v1, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;

    .line 474
    .line 475
    new-array v2, v4, [Ljava/lang/Object;

    .line 476
    .line 477
    const v3, 0x7f130b2e

    .line 478
    .line 479
    .line 480
    invoke-virtual {v10, v3, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    invoke-direct {v1, v2, v3, v4}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem$LineCategory;-><init>(Ljava/lang/String;IZ)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 495
    .line 496
    .line 497
    :cond_11
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    new-instance v2, Lkotlin/Pair;

    .line 502
    .line 503
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v2

    .line 507
    :pswitch_1
    iget-object v1, v0, La/i7g;->l:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v1, Ljava/util/Set;

    .line 510
    .line 511
    check-cast v1, Ljava/util/Set;

    .line 512
    .line 513
    iget-object v7, v0, La/i7g;->k:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v7, Ljava/lang/String;

    .line 516
    .line 517
    sget-object v8, La/wne;->a:La/wne;

    .line 518
    .line 519
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    check-cast v6, La/j7g;

    .line 523
    .line 524
    iget-object v0, v0, La/i7g;->j:Ljava/util/List;

    .line 525
    .line 526
    new-instance v8, Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    :cond_12
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    if-eqz v9, :cond_13

    .line 540
    .line 541
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v9

    .line 545
    move-object v10, v9

    .line 546
    check-cast v10, La/f3n0;

    .line 547
    .line 548
    iget-object v10, v10, La/f3n0;->b:Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v10, v7, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 551
    .line 552
    .line 553
    move-result v10

    .line 554
    if-eqz v10, :cond_12

    .line 555
    .line 556
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    goto :goto_8

    .line 560
    :cond_13
    check-cast v1, Ljava/lang/Iterable;

    .line 561
    .line 562
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    check-cast v5, La/o4g;

    .line 567
    .line 568
    iget-object v1, v5, La/o4g;->b:Ljava/util/List;

    .line 569
    .line 570
    iget-object v5, v5, La/o4g;->a:Ljava/util/List;

    .line 571
    .line 572
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    if-eqz v1, :cond_14

    .line 577
    .line 578
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    if-eqz v1, :cond_14

    .line 583
    .line 584
    goto/16 :goto_e

    .line 585
    .line 586
    :cond_14
    new-instance v1, Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    :cond_15
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    if-eqz v9, :cond_16

    .line 600
    .line 601
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    move-object v10, v9

    .line 606
    check-cast v10, La/f3n0;

    .line 607
    .line 608
    iget-wide v10, v10, La/f3n0;->a:J

    .line 609
    .line 610
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 611
    .line 612
    .line 613
    move-result-object v10

    .line 614
    invoke-interface {v5, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v10

    .line 618
    if-eqz v10, :cond_15

    .line 619
    .line 620
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    goto :goto_9

    .line 624
    :cond_16
    iget-object v5, v6, La/j7g;->k:La/p7m0;

    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 627
    .line 628
    .line 629
    move-result v8

    .line 630
    if-eqz v8, :cond_17

    .line 631
    .line 632
    new-instance v0, La/mch;

    .line 633
    .line 634
    iget-object v7, v6, La/j7g;->f:La/g2v;

    .line 635
    .line 636
    sget-object v8, La/pb10;->v:La/pb10;

    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    const/16 v14, 0x1de

    .line 640
    .line 641
    const/4 v9, 0x0

    .line 642
    const/4 v10, 0x0

    .line 643
    const v11, 0x7f130e37

    .line 644
    .line 645
    .line 646
    const/4 v12, 0x0

    .line 647
    invoke-static/range {v7 .. v14}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    const-wide/16 v2, 0x0

    .line 652
    .line 653
    invoke-direct {v0, v1, v2, v3}, La/mch;-><init>(La/jkm;J)V

    .line 654
    .line 655
    .line 656
    goto/16 :goto_d

    .line 657
    .line 658
    :cond_17
    new-instance v8, La/lch;

    .line 659
    .line 660
    iget-object v6, v6, La/j7g;->h:La/ctf0;

    .line 661
    .line 662
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 663
    .line 664
    .line 665
    move-result v7

    .line 666
    if-lez v7, :cond_18

    .line 667
    .line 668
    move v7, v3

    .line 669
    goto :goto_a

    .line 670
    :cond_18
    move v7, v4

    .line 671
    :goto_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 678
    .line 679
    .line 680
    move-result-object v9

    .line 681
    if-nez v7, :cond_1c

    .line 682
    .line 683
    new-array v7, v4, [Ljava/lang/Object;

    .line 684
    .line 685
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 686
    .line 687
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v7

    .line 691
    const v10, 0x7f131229

    .line 692
    .line 693
    .line 694
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v15

    .line 698
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 699
    .line 700
    .line 701
    move-result v6

    .line 702
    if-eqz v6, :cond_1a

    .line 703
    .line 704
    :cond_19
    move/from16 v16, v3

    .line 705
    .line 706
    goto :goto_b

    .line 707
    :cond_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    :cond_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 712
    .line 713
    .line 714
    move-result v7

    .line 715
    if-eqz v7, :cond_19

    .line 716
    .line 717
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v7

    .line 721
    check-cast v7, La/f3n0;

    .line 722
    .line 723
    iget-wide v10, v7, La/f3n0;->a:J

    .line 724
    .line 725
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v7

    .line 733
    if-nez v7, :cond_1b

    .line 734
    .line 735
    move/from16 v16, v4

    .line 736
    .line 737
    :goto_b
    new-instance v11, La/a7g;

    .line 738
    .line 739
    const-wide/16 v12, 0x0

    .line 740
    .line 741
    const-string v14, ""

    .line 742
    .line 743
    const/16 v17, 0x0

    .line 744
    .line 745
    invoke-direct/range {v11 .. v17}, La/a7g;-><init>(JLjava/lang/String;Ljava/lang/String;ZZ)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v9, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    :cond_1c
    new-instance v3, Ljava/util/ArrayList;

    .line 752
    .line 753
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 754
    .line 755
    .line 756
    move-result v2

    .line 757
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    if-eqz v2, :cond_1d

    .line 769
    .line 770
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    check-cast v2, La/f3n0;

    .line 775
    .line 776
    new-instance v10, La/a7g;

    .line 777
    .line 778
    iget-wide v11, v2, La/f3n0;->a:J

    .line 779
    .line 780
    iget-object v4, v2, La/f3n0;->c:La/lel0;

    .line 781
    .line 782
    iget-object v13, v4, La/lel0;->a:Ljava/lang/String;

    .line 783
    .line 784
    iget-object v14, v2, La/f3n0;->b:Ljava/lang/String;

    .line 785
    .line 786
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v15

    .line 794
    const/16 v16, 0x1

    .line 795
    .line 796
    invoke-direct/range {v10 .. v16}, La/a7g;-><init>(JLjava/lang/String;Ljava/lang/String;ZZ)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    goto :goto_c

    .line 803
    :cond_1d
    invoke-virtual {v9, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 804
    .line 805
    .line 806
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-direct {v8, v0}, La/lch;-><init>(Ljava/util/List;)V

    .line 811
    .line 812
    .line 813
    move-object v0, v8

    .line 814
    :goto_d
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    const/4 v1, 0x0

    .line 818
    invoke-virtual {v5, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 822
    .line 823
    return-object v0

    .line 824
    nop

    .line 825
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
