.class public final synthetic La/su;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xu;


# direct methods
.method public synthetic constructor <init>(La/xu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/su;->a:B

    iput-object p1, p0, La/su;->b:La/xu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/su;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/su;->b:La/xu;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p0, La/xu;->Q1:La/gfk0;

    .line 10
    .line 11
    invoke-virtual {v2}, La/xu;->J0()La/pv;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/pv;->o:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, La/jv;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/16 v8, 0x3e

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-static/range {v1 .. v8}, La/jv;->a(La/jv;ZLjava/lang/String;Ljava/lang/String;ZZLa/c6q0;I)La/jv;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    sget-object p0, La/xu;->Q1:La/gfk0;

    .line 46
    .line 47
    invoke-virtual {v2}, La/xu;->J0()La/pv;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object p0, v2, La/xu;->P1:La/phf0;

    .line 52
    .line 53
    sget-object v0, La/xu;->R1:[La/iiy;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    aget-object v0, v0, v3

    .line 57
    .line 58
    invoke-virtual {p0, v2, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v0, v5, La/pv;->o:La/p7m0;

    .line 66
    .line 67
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, La/jv;

    .line 72
    .line 73
    iget-boolean v2, v2, La/jv;->e:Z

    .line 74
    .line 75
    if-nez v2, :cond_1

    .line 76
    .line 77
    iget-object p0, v5, La/pv;->p:La/ol60;

    .line 78
    .line 79
    sget-object v0, La/bv;->a:La/bv;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/jv;

    .line 90
    .line 91
    iget-object v0, v0, La/jv;->c:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v2, v5, La/pv;->q:La/bby;

    .line 94
    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-ne v2, v3, :cond_2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v3, La/t0;

    .line 122
    .line 123
    const/4 v9, 0x0

    .line 124
    const/16 v10, 0x13

    .line 125
    .line 126
    const/4 v4, 0x1

    .line 127
    const-class v6, La/pv;

    .line 128
    .line 129
    const-string v7, "onConfirmCodeError"

    .line 130
    .line 131
    const-string v8, "onConfirmCodeError(Ljava/lang/Throwable;)V"

    .line 132
    .line 133
    invoke-direct/range {v3 .. v10}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 134
    .line 135
    .line 136
    new-instance v4, La/kv;

    .line 137
    .line 138
    invoke-direct {v4, v5, v0, p0, v1}, La/kv;-><init>(La/pv;Ljava/lang/String;Ljava/lang/String;La/yje;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v2, v3, v4}, La/pv;->w(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    iput-object p0, v5, La/pv;->q:La/bby;

    .line 146
    .line 147
    :cond_4
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_1
    sget-object p0, La/xu;->Q1:La/gfk0;

    .line 151
    .line 152
    invoke-virtual {v2}, La/xu;->J0()La/pv;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0}, La/pv;->x()V

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_2
    sget-object v0, La/xu;->Q1:La/gfk0;

    .line 163
    .line 164
    iget-object v3, p0, La/su;->b:La/xu;

    .line 165
    .line 166
    invoke-virtual {v3}, La/xu;->I0()La/b6i;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    iget-object p0, p0, La/b6i;->a:La/ru;

    .line 171
    .line 172
    iget-object p0, p0, La/ru;->j:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v1, p0

    .line 175
    check-cast v1, La/wdk0;

    .line 176
    .line 177
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    new-instance v2, La/xdk0;

    .line 181
    .line 182
    sget-object v5, La/rek0;->b:La/rek0;

    .line 183
    .line 184
    const p0, 0x7f130dca

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const/4 v10, 0x0

    .line 195
    const/16 v11, 0x7c

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x0

    .line 200
    move-object v4, v2

    .line 201
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 202
    .line 203
    .line 204
    const/16 v8, 0x3fc

    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    const/4 v5, 0x0

    .line 208
    const/4 v6, 0x0

    .line 209
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 210
    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_3
    sget-object p0, La/xu;->Q1:La/gfk0;

    .line 216
    .line 217
    invoke-virtual {v2}, La/xu;->I0()La/b6i;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    iget-object p0, p0, La/b6i;->f:La/n5d0;

    .line 222
    .line 223
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    check-cast p0, La/a6i;

    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_4
    sget-object p0, La/xu;->Q1:La/gfk0;

    .line 231
    .line 232
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    instance-of v0, p0, La/af3;

    .line 244
    .line 245
    if-eqz v0, :cond_5

    .line 246
    .line 247
    check-cast p0, La/af3;

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_5
    move-object p0, v1

    .line 251
    :goto_1
    const-class v0, La/yu;

    .line 252
    .line 253
    if-eqz p0, :cond_8

    .line 254
    .line 255
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, La/o5d0;

    .line 264
    .line 265
    if-eqz p0, :cond_6

    .line 266
    .line 267
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    check-cast p0, La/ze3;

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_6
    move-object p0, v1

    .line 275
    :goto_2
    instance-of v3, p0, La/yu;

    .line 276
    .line 277
    if-nez v3, :cond_7

    .line 278
    .line 279
    move-object p0, v1

    .line 280
    :cond_7
    check-cast p0, La/yu;

    .line 281
    .line 282
    if-eqz p0, :cond_8

    .line 283
    .line 284
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    iget-object v5, p0, La/yu;->a:La/lef0;

    .line 292
    .line 293
    iget-object v6, p0, La/yu;->b:La/d1p;

    .line 294
    .line 295
    iget-object v4, p0, La/yu;->d:La/ru;

    .line 296
    .line 297
    iget-object v8, p0, La/yu;->c:La/mi70;

    .line 298
    .line 299
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v3, La/b6i;

    .line 303
    .line 304
    invoke-direct/range {v3 .. v8}, La/b6i;-><init>(La/ru;La/lef0;La/d1p;La/i1w0;La/mi70;)V

    .line 305
    .line 306
    .line 307
    move-object v1, v3

    .line 308
    goto :goto_3

    .line 309
    :cond_8
    const-string p0, "Cannot create dependency "

    .line 310
    .line 311
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :goto_3
    return-object v1

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
