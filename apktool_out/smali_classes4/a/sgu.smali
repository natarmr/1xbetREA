.class public final La/sgu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sgu;->i:B

    iput-object p1, p0, La/sgu;->l:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sgu;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sgu;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/qjn0;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    check-cast p3, La/yje;

    .line 17
    .line 18
    new-instance v0, La/sgu;

    .line 19
    .line 20
    check-cast p0, La/mkn0;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, p3, v1}, La/sgu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, La/sgu;->k:Ljava/lang/Object;

    .line 27
    .line 28
    iput p2, v0, La/sgu;->j:I

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/sgu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    check-cast p2, Ljava/util/List;

    .line 44
    .line 45
    check-cast p3, La/yje;

    .line 46
    .line 47
    new-instance v0, La/sgu;

    .line 48
    .line 49
    check-cast p0, La/tgu;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p0, p3, v1}, La/sgu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    iput p1, v0, La/sgu;->j:I

    .line 56
    .line 57
    iput-object p2, v0, La/sgu;->k:Ljava/lang/Object;

    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    invoke-virtual {v0, p0}, La/sgu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/sgu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/sgu;->l:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/sgu;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/qjn0;

    .line 12
    .line 13
    iget v8, p0, La/sgu;->j:I

    .line 14
    .line 15
    sget-object p0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, v0, La/qjn0;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    move v0, v2

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, La/yjn0;

    .line 42
    .line 43
    iget v3, v3, La/yjn0;->a:I

    .line 44
    .line 45
    sget-object v4, La/cln0;->b:La/s2m0;

    .line 46
    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v0, -0x1

    .line 54
    :goto_1
    if-ltz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, La/yjn0;

    .line 61
    .line 62
    iget v4, p1, La/yjn0;->a:I

    .line 63
    .line 64
    iget v5, p1, La/yjn0;->b:I

    .line 65
    .line 66
    iget v6, p1, La/yjn0;->c:I

    .line 67
    .line 68
    iget v7, p1, La/yjn0;->d:I

    .line 69
    .line 70
    iget-object v9, p1, La/yjn0;->f:La/rjn0;

    .line 71
    .line 72
    new-instance v3, La/yjn0;

    .line 73
    .line 74
    invoke-direct/range {v3 .. v9}, La/yjn0;-><init>(IIIIILa/rjn0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    check-cast v1, La/mkn0;

    .line 81
    .line 82
    iget-object p1, v1, La/mkn0;->w:La/p7m0;

    .line 83
    .line 84
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v1, v0

    .line 89
    check-cast v1, La/qjn0;

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    invoke-static {v1, p0, v2, v3}, La/qjn0;->a(La/qjn0;Ljava/util/List;ZI)La/qjn0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_0
    check-cast v1, La/tgu;

    .line 106
    .line 107
    iget-object v0, v1, La/tgu;->a:La/nr70;

    .line 108
    .line 109
    iget v1, p0, La/sgu;->j:I

    .line 110
    .line 111
    iget-object p0, p0, La/sgu;->k:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Ljava/util/List;

    .line 114
    .line 115
    sget-object v3, La/wne;->a:La/wne;

    .line 116
    .line 117
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    if-nez v1, :cond_b

    .line 122
    .line 123
    iget-object v1, v0, La/nr70;->d:La/knf0;

    .line 124
    .line 125
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move-object v5, v4

    .line 144
    check-cast v5, La/mr70;

    .line 145
    .line 146
    iget-object v5, v5, La/mr70;->d:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_4

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    move-object v4, p1

    .line 156
    :goto_2
    check-cast v4, La/mr70;

    .line 157
    .line 158
    if-nez v4, :cond_9

    .line 159
    .line 160
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_7

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    move-object v4, v3

    .line 175
    check-cast v4, La/mr70;

    .line 176
    .line 177
    iget-object v4, v4, La/mr70;->d:Ljava/lang/String;

    .line 178
    .line 179
    const-string v5, "en_GB"

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_6

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    move-object v3, p1

    .line 189
    :goto_3
    check-cast v3, La/mr70;

    .line 190
    .line 191
    if-nez v3, :cond_8

    .line 192
    .line 193
    new-instance v4, La/mr70;

    .line 194
    .line 195
    const-string v8, "en_GB"

    .line 196
    .line 197
    const/4 v9, 0x1

    .line 198
    const/4 v5, 0x0

    .line 199
    const-string v6, "English"

    .line 200
    .line 201
    const-string v7, "EN"

    .line 202
    .line 203
    invoke-direct/range {v4 .. v9}, La/mr70;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    move-object v4, v3

    .line 208
    :cond_9
    :goto_4
    iget v3, v4, La/mr70;->a:I

    .line 209
    .line 210
    iget-object v1, v0, La/nr70;->b:La/huy;

    .line 211
    .line 212
    iget-object v1, v1, La/huy;->a:La/vwb0;

    .line 213
    .line 214
    const-string v4, "CURRENT_LANGUAGE_ID_KEY"

    .line 215
    .line 216
    invoke-virtual {v1, v3, v4}, La/vwb0;->f(ILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget-object v1, v0, La/nr70;->a:La/yuy;

    .line 220
    .line 221
    iget-object v4, v1, La/yuy;->b:La/p7m0;

    .line 222
    .line 223
    :cond_a
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    move-object v5, v1

    .line 228
    check-cast v5, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v4, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_a

    .line 239
    .line 240
    move v1, v3

    .line 241
    :cond_b
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_d

    .line 250
    .line 251
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    move-object v5, v4

    .line 256
    check-cast v5, La/mr70;

    .line 257
    .line 258
    iget v5, v5, La/mr70;->a:I

    .line 259
    .line 260
    if-ne v5, v1, :cond_c

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_d
    move-object v4, p1

    .line 264
    :goto_5
    check-cast v4, La/mr70;

    .line 265
    .line 266
    if-eqz v4, :cond_e

    .line 267
    .line 268
    iget-object p1, v4, La/mr70;->c:Ljava/lang/String;

    .line 269
    .line 270
    :cond_e
    if-eqz p1, :cond_f

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object v0, v0, La/nr70;->b:La/huy;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget-object v0, v0, La/huy;->a:La/vwb0;

    .line 281
    .line 282
    const-string v3, "CURRENT_LANGUAGE_WEB_NAME_KEY"

    .line 283
    .line 284
    invoke-virtual {v0, v3, p1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_f
    new-instance p1, Ljava/util/ArrayList;

    .line 288
    .line 289
    const/16 v0, 0xa

    .line 290
    .line 291
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 296
    .line 297
    .line 298
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_11

    .line 307
    .line 308
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, La/mr70;

    .line 313
    .line 314
    iget v4, v0, La/mr70;->a:I

    .line 315
    .line 316
    if-ne v4, v1, :cond_10

    .line 317
    .line 318
    const/4 v3, 0x1

    .line 319
    move v8, v3

    .line 320
    goto :goto_7

    .line 321
    :cond_10
    move v8, v2

    .line 322
    :goto_7
    iget-object v5, v0, La/mr70;->b:Ljava/lang/String;

    .line 323
    .line 324
    iget-object v6, v0, La/mr70;->c:Ljava/lang/String;

    .line 325
    .line 326
    iget-object v7, v0, La/mr70;->d:Ljava/lang/String;

    .line 327
    .line 328
    new-instance v3, La/mr70;

    .line 329
    .line 330
    invoke-direct/range {v3 .. v8}, La/mr70;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_11
    return-object p1

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
