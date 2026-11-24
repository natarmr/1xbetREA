.class public final La/r51;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/v51;


# direct methods
.method public synthetic constructor <init>(La/v51;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r51;->i:B

    iput-object p1, p0, La/r51;->k:La/v51;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r51;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r51;->k:La/v51;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r51;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r51;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r51;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r51;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/r51;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/r51;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/r51;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/r51;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/r51;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/r51;-><init>(La/v51;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/r51;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r51;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ub0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r51;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r51;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r51;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/f2j;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r51;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r51;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r51;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/axf0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/r51;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/r51;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/r51;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/p91;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/r51;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/r51;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/r51;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/nao0;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/r51;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/r51;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/r51;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r51;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/r51;->k:La/v51;

    .line 7
    .line 8
    iget-object v0, v0, La/r51;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/ub0;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La/sb0;->a:La/sb0;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const-string v4, "actionDialogManager"

    .line 27
    .line 28
    const v5, 0x7f130e5c

    .line 29
    .line 30
    .line 31
    const v6, 0x7f130162

    .line 32
    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object v1, v3, La/v51;->P1:La/ii;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 47
    .line 48
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    const v2, 0x7f1303dc

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v16, La/n12;->b:La/n12;

    .line 67
    .line 68
    const/16 v17, 0x0

    .line 69
    .line 70
    const/16 v18, 0x5d8

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const-string v13, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v2

    .line 93
    :cond_1
    sget-object v1, La/tb0;->a:La/tb0;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    iget-object v1, v3, La/v51;->P1:La/ii;

    .line 108
    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 112
    .line 113
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const v2, 0x7f13123b

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object v16, La/n12;->b:La/n12;

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x5d8

    .line 136
    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const-string v13, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v2

    .line 158
    :cond_3
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 162
    .line 163
    .line 164
    :goto_1
    return-object v2

    .line 165
    :pswitch_0
    check-cast v0, La/f2j;

    .line 166
    .line 167
    sget-object v1, La/wne;->a:La/wne;

    .line 168
    .line 169
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_b

    .line 177
    .line 178
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-static {v4}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_b

    .line 187
    .line 188
    sget-object v4, La/wtq;->c:La/wtq;

    .line 189
    .line 190
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v4, v1}, La/piz;->B(Ljava/util/Set;Landroidx/fragment/app/e;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_b

    .line 203
    .line 204
    if-eqz v0, :cond_a

    .line 205
    .line 206
    instance-of v0, v0, La/f2j;

    .line 207
    .line 208
    if-eqz v0, :cond_a

    .line 209
    .line 210
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 215
    .line 216
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :cond_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_6

    .line 236
    .line 237
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    move-object v4, v1

    .line 242
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 243
    .line 244
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-eqz v4, :cond_5

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_6
    move-object v1, v2

    .line 252
    :goto_2
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 253
    .line 254
    invoke-virtual {v3}, La/v51;->H0()La/b61;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-eqz v1, :cond_7

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    goto :goto_3

    .line 269
    :cond_7
    move-object v1, v2

    .line 270
    :goto_3
    if-nez v1, :cond_8

    .line 271
    .line 272
    const-string v1, ""

    .line 273
    .line 274
    :cond_8
    sget-object v4, La/a4j;->c:La/usd;

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v1}, La/usd;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget-object v4, v0, La/b61;->l:La/je;

    .line 284
    .line 285
    invoke-virtual {v4, v1}, La/je;->k(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    iget-object v0, v0, La/b61;->m:La/b4j;

    .line 289
    .line 290
    invoke-virtual {v0, v1}, La/b4j;->k(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, v3, La/v51;->Z1:La/q5j;

    .line 294
    .line 295
    if-eqz v0, :cond_9

    .line 296
    .line 297
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, La/q5j;->a(Landroidx/fragment/app/e;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3}, La/v51;->H0()La/b61;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iget-object v0, v0, La/b61;->u:La/j2j;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object v0, v0, La/j2j;->o:La/bby;

    .line 317
    .line 318
    if-eqz v0, :cond_b

    .line 319
    .line 320
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_9
    const-string v0, "dailyTasksScreenFactory"

    .line 325
    .line 326
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v2

    .line 330
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 331
    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_b
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    :goto_5
    return-object v2

    .line 337
    :pswitch_1
    check-cast v0, La/axf0;

    .line 338
    .line 339
    sget-object v1, La/wne;->a:La/wne;

    .line 340
    .line 341
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    sget-object v1, La/v51;->a2:La/qek0;

    .line 345
    .line 346
    invoke-virtual {v3}, La/v51;->G0()La/i1r;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iget-object v1, v1, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 351
    .line 352
    iget-object v0, v0, La/axf0;->a:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setSelectedTab(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_2
    check-cast v0, La/p91;

    .line 361
    .line 362
    sget-object v1, La/wne;->a:La/wne;

    .line 363
    .line 364
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    iget-boolean v1, v0, La/p91;->b:Z

    .line 368
    .line 369
    iget-object v0, v0, La/p91;->a:La/lr1;

    .line 370
    .line 371
    const-string v2, "AGGREGATOR_CATEGORIES_TAB_TAG"

    .line 372
    .line 373
    if-eqz v1, :cond_f

    .line 374
    .line 375
    sget-object v1, La/v51;->a2:La/qek0;

    .line 376
    .line 377
    invoke-virtual {v3}, La/v51;->G0()La/i1r;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget-object v1, v1, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 382
    .line 383
    if-nez v0, :cond_c

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_c
    instance-of v3, v0, La/gr1;

    .line 387
    .line 388
    if-eqz v3, :cond_d

    .line 389
    .line 390
    const-string v2, "FAVORITES_TAB_TAG"

    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_d
    instance-of v3, v0, La/hr1;

    .line 394
    .line 395
    if-eqz v3, :cond_e

    .line 396
    .line 397
    const-string v2, "MY_VIRTUAL_TAB_TAG"

    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_e
    instance-of v0, v0, La/fr1;

    .line 401
    .line 402
    if-eqz v0, :cond_16

    .line 403
    .line 404
    :goto_6
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setSelectedTab(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_f
    sget-object v1, La/v51;->a2:La/qek0;

    .line 409
    .line 410
    invoke-virtual {v3}, La/v51;->G0()La/i1r;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    iget-object v1, v1, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 415
    .line 416
    if-nez v0, :cond_10

    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_10
    instance-of v3, v0, La/jr1;

    .line 420
    .line 421
    if-eqz v3, :cond_11

    .line 422
    .line 423
    const-string v2, "PROMO_TAB_TAG"

    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_11
    instance-of v3, v0, La/gr1;

    .line 427
    .line 428
    if-eqz v3, :cond_12

    .line 429
    .line 430
    const-string v2, "FAVORITES_AGGREGATOR_TAB_TAG"

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_12
    instance-of v3, v0, La/hr1;

    .line 434
    .line 435
    if-eqz v3, :cond_13

    .line 436
    .line 437
    const-string v2, "MY_AGGREGATOR_TAB_TAG"

    .line 438
    .line 439
    goto :goto_8

    .line 440
    :cond_13
    instance-of v3, v0, La/kr1;

    .line 441
    .line 442
    if-eqz v3, :cond_14

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_14
    instance-of v3, v0, La/er1;

    .line 446
    .line 447
    if-eqz v3, :cond_15

    .line 448
    .line 449
    :goto_7
    const-string v2, "PROVIDERS_AGGREGATOR_TAB_TAG"

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_15
    instance-of v0, v0, La/fr1;

    .line 453
    .line 454
    if-eqz v0, :cond_16

    .line 455
    .line 456
    :goto_8
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setSelectedTab(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    :cond_16
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_3
    check-cast v0, La/nao0;

    .line 463
    .line 464
    sget-object v1, La/wne;->a:La/wne;

    .line 465
    .line 466
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    sget-object v1, La/v51;->a2:La/qek0;

    .line 470
    .line 471
    invoke-virtual {v3}, La/v51;->G0()La/i1r;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    iget-object v1, v1, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 476
    .line 477
    new-instance v2, La/lao0;

    .line 478
    .line 479
    iget-object v4, v0, La/nao0;->a:Ljava/util/List;

    .line 480
    .line 481
    iget-object v5, v0, La/nao0;->d:La/pao0;

    .line 482
    .line 483
    invoke-direct {v2, v4, v5}, La/lao0;-><init>(Ljava/util/List;La/pao0;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setTabBarDSModel(La/lao0;)V

    .line 487
    .line 488
    .line 489
    iget-boolean v0, v0, La/nao0;->e:Z

    .line 490
    .line 491
    if-eqz v0, :cond_17

    .line 492
    .line 493
    invoke-virtual {v3}, La/v51;->G0()La/i1r;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    iget-object v0, v0, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 498
    .line 499
    new-instance v1, La/o51;

    .line 500
    .line 501
    const/4 v2, 0x2

    .line 502
    invoke-direct {v1, v3, v2}, La/o51;-><init>(La/v51;B)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 506
    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_17
    invoke-virtual {v3}, La/v51;->G0()La/i1r;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iget-object v0, v0, La/i1r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 514
    .line 515
    new-instance v1, La/o51;

    .line 516
    .line 517
    const/4 v2, 0x0

    .line 518
    invoke-direct {v1, v3, v2}, La/o51;-><init>(La/v51;B)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 522
    .line 523
    .line 524
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
