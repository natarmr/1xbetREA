.class public final synthetic La/mi60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/mi60;->a:B

    iput-object p3, p0, La/mi60;->b:Ljava/util/List;

    iput-object p2, p0, La/mi60;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mi60;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v3, v0, La/mi60;->b:Ljava/util/List;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/oyg0;

    .line 16
    .line 17
    move-object/from16 v5, p2

    .line 18
    .line 19
    check-cast v5, La/iac0;

    .line 20
    .line 21
    new-instance v10, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v4}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v14, 0x0

    .line 65
    const/16 v15, 0x1fcd

    .line 66
    .line 67
    sget-object v6, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$DetailsPromo;->a:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$DetailsPromo;

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    iget-object v9, v0, La/mi60;->c:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    const/4 v13, 0x0

    .line 76
    invoke-static/range {v5 .. v15}, La/iac0;->a(La/iac0;Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;ZLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZZI)La/iac0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_0
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, La/oyg0;

    .line 84
    .line 85
    move-object/from16 v1, p2

    .line 86
    .line 87
    check-cast v1, La/ui60;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v5, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_5

    .line 110
    .line 111
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, La/yoq0;

    .line 116
    .line 117
    new-instance v8, La/n0x;

    .line 118
    .line 119
    new-instance v9, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 122
    .line 123
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object v7, v7, La/yoq0;->c:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    if-nez v10, :cond_1

    .line 136
    .line 137
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_1
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v7, v10, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-nez v10, :cond_4

    .line 148
    .line 149
    const-string v10, "https://"

    .line 150
    .line 151
    invoke-static {v7, v10, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-eqz v10, :cond_2

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_2
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    const/16 v11, 0x2f

    .line 163
    .line 164
    if-lez v10, :cond_3

    .line 165
    .line 166
    const-string v10, "/"

    .line 167
    .line 168
    invoke-static {v9, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-nez v10, :cond_3

    .line 173
    .line 174
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    :cond_3
    const/4 v10, 0x1

    .line 178
    new-array v10, v10, [C

    .line 179
    .line 180
    aput-char v11, v10, v4

    .line 181
    .line 182
    invoke-static {v7, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_4
    :goto_2
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    :goto_3
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-direct {v8, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_5
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    new-instance v4, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_6

    .line 229
    .line 230
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    check-cast v6, La/yoq0;

    .line 235
    .line 236
    iget v6, v6, La/yoq0;->a:I

    .line 237
    .line 238
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_6
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    new-instance v4, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-eqz v3, :cond_7

    .line 268
    .line 269
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, La/yoq0;

    .line 274
    .line 275
    iget v3, v3, La/yoq0;->b:I

    .line 276
    .line 277
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_7
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    iget v13, v1, La/ui60;->d:I

    .line 290
    .line 291
    iget v14, v1, La/ui60;->e:I

    .line 292
    .line 293
    iget-object v2, v1, La/ui60;->g:Ljava/lang/String;

    .line 294
    .line 295
    iget-object v3, v1, La/ui60;->h:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v1, v1, La/ui60;->i:La/uaq0;

    .line 298
    .line 299
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iget-object v15, v0, La/mi60;->c:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance v9, La/ui60;

    .line 320
    .line 321
    move-object/from16 v18, v1

    .line 322
    .line 323
    move-object/from16 v16, v2

    .line 324
    .line 325
    move-object/from16 v17, v3

    .line 326
    .line 327
    invoke-direct/range {v9 .. v18}, La/ui60;-><init>(La/a4x;La/a4x;La/a4x;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/uaq0;)V

    .line 328
    .line 329
    .line 330
    return-object v9

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
