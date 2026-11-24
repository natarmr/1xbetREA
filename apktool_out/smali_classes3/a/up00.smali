.class public final synthetic La/up00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bq00;


# direct methods
.method public synthetic constructor <init>(La/bq00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/up00;->a:B

    iput-object p1, p0, La/up00;->b:La/bq00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/up00;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v0, v0, La/up00;->b:La/bq00;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/bq00;->o:La/vzg0;

    .line 12
    .line 13
    const-class v2, La/veo;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 36
    .line 37
    move-object v4, v2

    .line 38
    check-cast v4, La/cp00;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v3, v4, La/cp00;->j:Ljava/util/Set;

    .line 44
    .line 45
    sget-object v5, La/veo;->a:La/veo;

    .line 46
    .line 47
    invoke-static {v3, v5}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    const/4 v12, 0x0

    .line 52
    const v13, 0x1fdff

    .line 53
    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    invoke-static/range {v4 .. v13}, La/cp00;->a(La/cp00;La/iy3;Ljava/util/ArrayList;La/ne5;La/oc5;Ljava/lang/String;Ljava/util/Set;ZZI)La/cp00;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    sget-object v1, La/to00;->a:La/to00;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    sget-object v1, La/vo00;->a:La/vo00;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_2
    iget-object v1, v0, La/bq00;->W:La/rkt0;

    .line 91
    .line 92
    new-instance v2, La/smi0;

    .line 93
    .line 94
    sget-object v3, La/umi0;->c:La/umi0;

    .line 95
    .line 96
    iget-object v0, v0, La/bq00;->q:La/pru;

    .line 97
    .line 98
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-boolean v0, v0, La/sff0;->P0:Z

    .line 103
    .line 104
    invoke-direct {v2, v3, v0}, La/smi0;-><init>(La/umi0;Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v2}, La/rkt0;->f(La/smi0;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_3
    iget-object v1, v0, La/bq00;->m0:La/jo20;

    .line 114
    .line 115
    sget-object v4, La/kh3;->f:La/kh3;

    .line 116
    .line 117
    invoke-virtual {v1, v4}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, La/g8d;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    if-eqz v4, :cond_5

    .line 125
    .line 126
    sget-object v6, La/kh3;->g:La/kh3;

    .line 127
    .line 128
    invoke-virtual {v1, v6}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    check-cast v6, La/g8d;

    .line 133
    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    sget-object v7, La/kh3;->h:La/kh3;

    .line 137
    .line 138
    invoke-virtual {v1, v7}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, La/g8d;

    .line 143
    .line 144
    if-eqz v7, :cond_3

    .line 145
    .line 146
    sget-object v8, La/kh3;->i:La/kh3;

    .line 147
    .line 148
    invoke-virtual {v1, v8}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    check-cast v8, La/g8d;

    .line 153
    .line 154
    if-eqz v8, :cond_2

    .line 155
    .line 156
    sget-object v9, La/kh3;->k:La/kh3;

    .line 157
    .line 158
    invoke-virtual {v1, v9}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, La/g8d;

    .line 163
    .line 164
    if-eqz v1, :cond_1

    .line 165
    .line 166
    iget-object v9, v0, La/bq00;->l0:Ljava/util/ArrayList;

    .line 167
    .line 168
    iget-object v10, v4, La/g8d;->c:La/gmq;

    .line 169
    .line 170
    iget-object v11, v6, La/g8d;->c:La/gmq;

    .line 171
    .line 172
    iget-object v12, v7, La/g8d;->c:La/gmq;

    .line 173
    .line 174
    iget-object v13, v8, La/g8d;->c:La/gmq;

    .line 175
    .line 176
    iget-object v14, v1, La/g8d;->c:La/gmq;

    .line 177
    .line 178
    const/4 v15, 0x5

    .line 179
    new-array v15, v15, [La/gmq;

    .line 180
    .line 181
    const/16 v16, 0x1

    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    aput-object v10, v15, v3

    .line 185
    .line 186
    aput-object v11, v15, v16

    .line 187
    .line 188
    aput-object v12, v15, v2

    .line 189
    .line 190
    const/4 v2, 0x3

    .line 191
    aput-object v13, v15, v2

    .line 192
    .line 193
    const/4 v10, 0x4

    .line 194
    aput-object v14, v15, v10

    .line 195
    .line 196
    invoke-static {v15}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    new-array v3, v3, [La/gmq;

    .line 205
    .line 206
    invoke-interface {v10, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, [La/gmq;

    .line 211
    .line 212
    new-instance v10, La/ewt;

    .line 213
    .line 214
    const/16 v11, 0x15

    .line 215
    .line 216
    invoke-direct {v10, v3, v0, v11}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0, v10, v5, v5, v2}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v4, v5}, La/bq00;->O(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, La/mbz;

    .line 230
    .line 231
    const/16 v3, 0xc

    .line 232
    .line 233
    invoke-direct {v2, v0, v7, v3}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v6, v2}, La/bq00;->O(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v8, v5}, La/bq00;->O(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1, v5}, La/bq00;->O(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 243
    .line 244
    .line 245
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_1
    invoke-static {}, La/itt0;->a()V

    .line 249
    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_2
    invoke-static {}, La/itt0;->a()V

    .line 253
    .line 254
    .line 255
    goto :goto_0

    .line 256
    :cond_3
    invoke-static {}, La/itt0;->a()V

    .line 257
    .line 258
    .line 259
    goto :goto_0

    .line 260
    :cond_4
    invoke-static {}, La/itt0;->a()V

    .line 261
    .line 262
    .line 263
    goto :goto_0

    .line 264
    :cond_5
    invoke-static {}, La/itt0;->a()V

    .line 265
    .line 266
    .line 267
    :goto_0
    return-object v5

    .line 268
    :pswitch_4
    iget-object v1, v0, La/bq00;->m0:La/jo20;

    .line 269
    .line 270
    sget-object v3, La/kh3;->e:La/kh3;

    .line 271
    .line 272
    invoke-virtual {v1, v3}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, La/g8d;

    .line 277
    .line 278
    if-eqz v1, :cond_6

    .line 279
    .line 280
    new-instance v3, La/up00;

    .line 281
    .line 282
    invoke-direct {v3, v0, v2}, La/up00;-><init>(La/bq00;B)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v1, v3}, La/bq00;->O(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 286
    .line 287
    .line 288
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_5
    const/16 v16, 0x1

    .line 292
    .line 293
    iget-object v1, v0, La/bq00;->m0:La/jo20;

    .line 294
    .line 295
    sget-object v2, La/kh3;->d:La/kh3;

    .line 296
    .line 297
    invoke-virtual {v1, v2}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, La/g8d;

    .line 302
    .line 303
    if-eqz v1, :cond_7

    .line 304
    .line 305
    new-instance v2, La/up00;

    .line 306
    .line 307
    move/from16 v3, v16

    .line 308
    .line 309
    invoke-direct {v2, v0, v3}, La/up00;-><init>(La/bq00;B)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v1, v2}, La/bq00;->O(La/g8d;Lkotlin/jvm/functions/Function0;)V

    .line 313
    .line 314
    .line 315
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
