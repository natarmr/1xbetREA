.class public final La/nn3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/on3;


# direct methods
.method public synthetic constructor <init>(La/on3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nn3;->i:B

    iput-object p1, p0, La/nn3;->k:La/on3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nn3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nn3;->k:La/on3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/nn3;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/nn3;-><init>(La/on3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/nn3;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/nn3;-><init>(La/on3;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/nn3;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/nn3;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/nn3;-><init>(La/on3;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nn3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nn3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nn3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nn3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/nn3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/nn3;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/nn3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/nn3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/nn3;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/nn3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
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
    iget-byte v1, v0, La/nn3;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/nn3;->k:La/on3;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v4, La/on3;->s:La/p7m0;

    .line 15
    .line 16
    iget-object v6, v4, La/on3;->r:La/p7m0;

    .line 17
    .line 18
    iget-object v7, v4, La/on3;->c:Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 19
    .line 20
    sget-object v8, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v9, v0, La/nn3;->j:Z

    .line 23
    .line 24
    if-eqz v9, :cond_1

    .line 25
    .line 26
    if-ne v9, v3, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v4, La/on3;->j:La/g2v;

    .line 44
    .line 45
    iget-object v9, v7, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v2, v2, La/g2v;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, La/mii0;

    .line 56
    .line 57
    iget-object v2, v2, La/mii0;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, La/hk3;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v10, Ljava/io/File;

    .line 65
    .line 66
    iget-object v2, v2, La/hk3;->a:La/us00;

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v11, ".CWAC-Update"

    .line 73
    .line 74
    invoke-direct {v10, v2, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v10}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    invoke-static {v9}, La/hk3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {v9, v2}, La/tx3;->u(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-ne v2, v3, :cond_2

    .line 95
    .line 96
    new-instance v0, La/tl3;

    .line 97
    .line 98
    iget-object v2, v4, La/on3;->m:La/p4u;

    .line 99
    .line 100
    iget-object v3, v7, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;->c:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v2, v3}, La/p4u;->d(Ljava/lang/String;)Ljava/io/File;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, La/um3;

    .line 111
    .line 112
    iget-object v3, v3, La/um3;->f:Ljava/lang/String;

    .line 113
    .line 114
    invoke-direct {v0, v2, v3}, La/tl3;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    move-object v9, v2

    .line 129
    check-cast v9, La/um3;

    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    const v19, 0x1fdff

    .line 134
    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x1

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    invoke-static/range {v9 .. v19}, La/um3;->a(La/um3;La/iy3;La/an3;La/oc5;Ljava/lang/Integer;ZZZZZI)La/um3;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v6, v2, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_2

    .line 155
    .line 156
    iget-object v2, v4, La/on3;->i:La/ocl;

    .line 157
    .line 158
    iget-object v4, v7, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;->a:Ljava/lang/String;

    .line 159
    .line 160
    iput-boolean v3, v0, La/nn3;->j:Z

    .line 161
    .line 162
    invoke-virtual {v2, v4, v0}, La/ocl;->h(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-ne v0, v8, :cond_3

    .line 167
    .line 168
    move-object v5, v8

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    :goto_0
    check-cast v0, Ljava/lang/String;

    .line 171
    .line 172
    new-instance v2, La/sl3;

    .line 173
    .line 174
    iget-object v3, v7, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;->c:Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {v2, v3, v0}, La/sl3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v5, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    :cond_4
    :goto_1
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v7, v0

    .line 190
    check-cast v7, La/um3;

    .line 191
    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const v17, 0x1bfff

    .line 195
    .line 196
    .line 197
    const/4 v8, 0x0

    .line 198
    const/4 v9, 0x0

    .line 199
    const/4 v10, 0x0

    .line 200
    const/4 v11, 0x0

    .line 201
    const/4 v12, 0x0

    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x0

    .line 204
    const/4 v15, 0x0

    .line 205
    invoke-static/range {v7 .. v17}, La/um3;->a(La/um3;La/iy3;La/an3;La/oc5;Ljava/lang/Integer;ZZZZZI)La/um3;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v6, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    :goto_2
    return-object v5

    .line 218
    :pswitch_0
    iget-boolean v15, v0, La/nn3;->j:Z

    .line 219
    .line 220
    sget-object v0, La/wne;->a:La/wne;

    .line 221
    .line 222
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v4, La/on3;->r:La/p7m0;

    .line 226
    .line 227
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object v6, v0

    .line 232
    check-cast v6, La/um3;

    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const v16, 0x1efff

    .line 236
    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    const/4 v8, 0x0

    .line 240
    const/4 v9, 0x0

    .line 241
    const/4 v10, 0x0

    .line 242
    const/4 v11, 0x0

    .line 243
    const/4 v12, 0x0

    .line 244
    const/4 v13, 0x0

    .line 245
    invoke-static/range {v6 .. v16}, La/um3;->a(La/um3;La/iy3;La/an3;La/oc5;Ljava/lang/Integer;ZZZZZI)La/um3;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_5

    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 259
    .line 260
    iget-boolean v6, v0, La/nn3;->j:Z

    .line 261
    .line 262
    if-eqz v6, :cond_7

    .line 263
    .line 264
    if-ne v6, v3, :cond_6

    .line 265
    .line 266
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    move-object/from16 v0, p1

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 280
    .line 281
    const/16 v6, 0x1d

    .line 282
    .line 283
    if-lt v2, v6, :cond_9

    .line 284
    .line 285
    iget-object v2, v4, La/on3;->g:La/nmo;

    .line 286
    .line 287
    iput-boolean v3, v0, La/nn3;->j:Z

    .line 288
    .line 289
    invoke-virtual {v2, v0}, La/nmo;->g(La/zje;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-ne v0, v1, :cond_8

    .line 294
    .line 295
    move-object v5, v1

    .line 296
    goto :goto_4

    .line 297
    :cond_8
    :goto_3
    check-cast v0, La/ne5;

    .line 298
    .line 299
    iget-object v1, v4, La/on3;->q:La/iy3;

    .line 300
    .line 301
    invoke-static {v0, v1}, La/wb;->M(La/ne5;La/iy3;)La/an3;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    :cond_9
    move-object v8, v5

    .line 306
    iget-object v0, v4, La/on3;->r:La/p7m0;

    .line 307
    .line 308
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    move-object v6, v1

    .line 313
    check-cast v6, La/um3;

    .line 314
    .line 315
    const/4 v15, 0x0

    .line 316
    const v16, 0x17ffb

    .line 317
    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const/4 v9, 0x0

    .line 321
    const/4 v10, 0x0

    .line 322
    const/4 v11, 0x0

    .line 323
    const/4 v12, 0x0

    .line 324
    const/4 v13, 0x0

    .line 325
    const/4 v14, 0x0

    .line 326
    invoke-static/range {v6 .. v16}, La/um3;->a(La/um3;La/iy3;La/an3;La/oc5;Ljava/lang/Integer;ZZZZZI)La/um3;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-eqz v1, :cond_a

    .line 335
    .line 336
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    :goto_4
    return-object v5

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
