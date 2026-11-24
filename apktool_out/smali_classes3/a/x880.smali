.class public final synthetic La/x880;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z880;


# direct methods
.method public synthetic constructor <init>(La/z880;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x880;->a:B

    iput-object p1, p0, La/x880;->b:La/z880;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x880;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/x880;->b:La/z880;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, Landroid/os/Bundle;

    .line 17
    .line 18
    sget-object v3, La/z880;->U1:La/xi70;

    .line 19
    .line 20
    const-string v3, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 21
    .line 22
    invoke-static {v2, v1, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-string v1, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v1, v5, La/aa80;->z:La/p7m0;

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v8, v0

    .line 43
    check-cast v8, La/d980;

    .line 44
    .line 45
    iget-object v2, v8, La/d980;->c:La/c980;

    .line 46
    .line 47
    const-string v3, ""

    .line 48
    .line 49
    const/4 v4, 0x5

    .line 50
    const/4 v9, 0x0

    .line 51
    invoke-static {v2, v3, v9, v4}, La/c980;->a(La/c980;Ljava/lang/String;Ljava/lang/String;I)La/c980;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x7b

    .line 57
    .line 58
    move-object v2, v9

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    invoke-static/range {v8 .. v16}, La/d980;->a(La/d980;ZLjava/lang/String;La/c980;La/a980;La/b980;ZZI)La/d980;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v1, La/o980;->a:La/o980;

    .line 79
    .line 80
    iget-object v3, v5, La/aa80;->g:La/mne;

    .line 81
    .line 82
    iget-object v11, v3, La/mne;->a:La/rwj;

    .line 83
    .line 84
    new-instance v4, La/a48;

    .line 85
    .line 86
    const/4 v9, 0x2

    .line 87
    move-object v8, v2

    .line 88
    invoke-direct/range {v4 .. v9}, La/a48;-><init>(La/diu0;IZLa/yje;B)V

    .line 89
    .line 90
    .line 91
    const/16 v13, 0xa

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    move-object v8, v0

    .line 95
    move-object v9, v1

    .line 96
    move-object v12, v4

    .line 97
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 98
    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    move-object/from16 v2, p2

    .line 108
    .line 109
    check-cast v2, Landroid/os/Bundle;

    .line 110
    .line 111
    sget-object v3, La/z880;->U1:La/xi70;

    .line 112
    .line 113
    const-string v3, "KEY_PICKER_MODEL_REQUEST"

    .line 114
    .line 115
    invoke-static {v2, v1, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    const-string v1, "PICKER_PARAMS_KEY"

    .line 120
    .line 121
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    instance-of v0, v1, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 134
    .line 135
    const/4 v8, 0x0

    .line 136
    if-eqz v0, :cond_1

    .line 137
    .line 138
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v10, La/o980;->a:La/o980;

    .line 143
    .line 144
    iget-object v1, v5, La/aa80;->g:La/mne;

    .line 145
    .line 146
    iget-object v12, v1, La/mne;->a:La/rwj;

    .line 147
    .line 148
    new-instance v13, La/a48;

    .line 149
    .line 150
    const/4 v9, 0x2

    .line 151
    const/4 v7, 0x1

    .line 152
    move-object v4, v13

    .line 153
    invoke-direct/range {v4 .. v9}, La/a48;-><init>(La/diu0;IZLa/yje;B)V

    .line 154
    .line 155
    .line 156
    const/16 v14, 0xa

    .line 157
    .line 158
    const/4 v11, 0x0

    .line 159
    move-object v9, v0

    .line 160
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_1
    instance-of v0, v1, Lorg/xplatform/picker/api/presentation/PickerParams$Language;

    .line 165
    .line 166
    if-eqz v0, :cond_5

    .line 167
    .line 168
    iget-object v0, v5, La/aa80;->z:La/p7m0;

    .line 169
    .line 170
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, La/d980;

    .line 175
    .line 176
    iget-object v1, v1, La/d980;->e:La/b980;

    .line 177
    .line 178
    iget-object v1, v1, La/b980;->a:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_3

    .line 189
    .line 190
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move-object v3, v2

    .line 195
    check-cast v3, La/bt9;

    .line 196
    .line 197
    iget v3, v3, La/bt9;->a:I

    .line 198
    .line 199
    if-ne v3, v6, :cond_2

    .line 200
    .line 201
    move-object v8, v2

    .line 202
    :cond_3
    check-cast v8, La/bt9;

    .line 203
    .line 204
    if-nez v8, :cond_4

    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    move-object v9, v1

    .line 212
    check-cast v9, La/d980;

    .line 213
    .line 214
    iget-object v2, v9, La/d980;->e:La/b980;

    .line 215
    .line 216
    iget-object v2, v2, La/b980;->a:Ljava/util/List;

    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v14, La/b980;

    .line 222
    .line 223
    invoke-direct {v14, v2, v8}, La/b980;-><init>(Ljava/util/List;La/bt9;)V

    .line 224
    .line 225
    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    const/16 v17, 0x6f

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v11, 0x0

    .line 232
    const/4 v12, 0x0

    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    invoke-static/range {v9 .. v17}, La/d980;->a(La/d980;ZLjava/lang/String;La/c980;La/a980;La/b980;ZZI)La/d980;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_4

    .line 244
    .line 245
    :cond_5
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_1
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, Ljava/lang/String;

    .line 251
    .line 252
    move-object/from16 v2, p2

    .line 253
    .line 254
    check-cast v2, Landroid/os/Bundle;

    .line 255
    .line 256
    sget-object v3, La/z880;->U1:La/xi70;

    .line 257
    .line 258
    const-string v3, "REQUEST_SELECT_THEME_DIALOG_KEY"

    .line 259
    .line 260
    invoke-static {v2, v1, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    iget-object v2, v0, La/aa80;->t:La/chf0;

    .line 269
    .line 270
    invoke-virtual {v2, v1}, La/chf0;->W(I)V

    .line 271
    .line 272
    .line 273
    const/4 v2, 0x1

    .line 274
    invoke-virtual {v0, v2}, La/aa80;->B(Z)V

    .line 275
    .line 276
    .line 277
    iget-object v2, v0, La/aa80;->z:La/p7m0;

    .line 278
    .line 279
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    check-cast v3, La/d980;

    .line 284
    .line 285
    iget-object v3, v3, La/d980;->d:La/a980;

    .line 286
    .line 287
    if-eqz v3, :cond_7

    .line 288
    .line 289
    iget-object v3, v3, La/a980;->c:Ljava/lang/String;

    .line 290
    .line 291
    if-nez v3, :cond_6

    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    check-cast v2, La/d980;

    .line 299
    .line 300
    iget-object v2, v2, La/d980;->c:La/c980;

    .line 301
    .line 302
    iget-object v2, v2, La/c980;->a:Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v0, v1, v3, v2}, La/aa80;->A(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_7
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object v0

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
