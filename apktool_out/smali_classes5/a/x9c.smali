.class public final synthetic La/x9c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput-byte v0, p0, La/x9c;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/x9c;->b:I

    iput-object p2, p0, La/x9c;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/x9c;->a:B

    iput-object p1, p0, La/x9c;->c:Ljava/lang/Object;

    iput p2, p0, La/x9c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/x9c;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, La/x9c;->b:I

    .line 6
    .line 7
    iget-object p0, p0, La/x9c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/xk80;

    .line 13
    .line 14
    invoke-virtual {p0}, La/xk80;->k()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    rem-int/2addr p0, v3

    .line 19
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p0, La/k3t0;

    .line 25
    .line 26
    new-instance v0, La/feo0;

    .line 27
    .line 28
    invoke-direct {v0, v3}, La/feo0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    check-cast p0, La/hu5;

    .line 38
    .line 39
    iget-object p0, p0, La/hu5;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/a9q0;

    .line 42
    .line 43
    iget-object p0, p0, La/a9q0;->b:La/bw40;

    .line 44
    .line 45
    invoke-virtual {p0, v3}, La/bw40;->d(I)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_2
    check-cast p0, La/slh0;

    .line 55
    .line 56
    sget-object v0, La/slh0;->O1:La/cge0;

    .line 57
    .line 58
    sget-object v0, La/xkh0;->n2:La/gne0;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v2, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;

    .line 68
    .line 69
    const-string v4, "CHOOSE_QUESTION_DIALOG_KEY"

    .line 70
    .line 71
    invoke-direct {v2, v4, v3}, Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;-><init>(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object v0, La/xkh0;->p2:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    new-instance v3, La/xkh0;

    .line 87
    .line 88
    invoke-direct {v3}, La/xkh0;-><init>()V

    .line 89
    .line 90
    .line 91
    sget-object v4, La/xkh0;->o2:[La/iiy;

    .line 92
    .line 93
    aget-object v1, v4, v1

    .line 94
    .line 95
    iget-object v4, v3, La/xkh0;->m2:La/khf0;

    .line 96
    .line 97
    invoke-virtual {v4, v3, v1, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_3
    move-object v6, p0

    .line 107
    check-cast v6, La/kw50;

    .line 108
    .line 109
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object v0, v6, La/kw50;->B:La/mne;

    .line 114
    .line 115
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 116
    .line 117
    new-instance v4, La/r750;

    .line 118
    .line 119
    const/4 v10, 0x0

    .line 120
    const/16 v11, 0x1b

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    const-class v7, La/kw50;

    .line 124
    .line 125
    const-string v8, "handleError"

    .line 126
    .line 127
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 128
    .line 129
    invoke-direct/range {v4 .. v11}, La/r750;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 130
    .line 131
    .line 132
    new-instance v11, La/u52;

    .line 133
    .line 134
    const/16 v1, 0x10

    .line 135
    .line 136
    invoke-direct {v11, v6, v3, v2, v1}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 137
    .line 138
    .line 139
    const/16 v12, 0xa

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    move-object v7, p0

    .line 143
    move-object v10, v0

    .line 144
    move-object v8, v4

    .line 145
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 146
    .line 147
    .line 148
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_4
    check-cast p0, La/l7m0;

    .line 152
    .line 153
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-nez v3, :cond_1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_1
    rem-int/2addr p0, v3

    .line 167
    add-int/2addr p0, v3

    .line 168
    rem-int v1, p0, v3

    .line 169
    .line 170
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_5
    check-cast p0, La/h5m;

    .line 176
    .line 177
    iget-object p0, p0, La/h5m;->a:La/cgk0;

    .line 178
    .line 179
    invoke-virtual {p0, v3}, La/cgk0;->m(I)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_6
    check-cast p0, La/xcz;

    .line 186
    .line 187
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_3

    .line 202
    .line 203
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    move-object v1, v0

    .line 208
    check-cast v1, La/ncz;

    .line 209
    .line 210
    iget v1, v1, La/ncz;->a:I

    .line 211
    .line 212
    if-ne v1, v3, :cond_2

    .line 213
    .line 214
    move-object v2, v0

    .line 215
    :cond_3
    check-cast v2, La/ncz;

    .line 216
    .line 217
    return-object v2

    .line 218
    :pswitch_7
    check-cast p0, La/r7f;

    .line 219
    .line 220
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    iget-object v0, p0, La/r7f;->Y0:La/mne;

    .line 225
    .line 226
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 227
    .line 228
    sget-object v5, La/h6f;->a:La/h6f;

    .line 229
    .line 230
    new-instance v8, La/m5f;

    .line 231
    .line 232
    const/4 v0, 0x2

    .line 233
    invoke-direct {v8, p0, v3, v2, v0}, La/m5f;-><init>(La/r7f;ILa/yje;B)V

    .line 234
    .line 235
    .line 236
    const/16 v9, 0xa

    .line 237
    .line 238
    const/4 v6, 0x0

    .line 239
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 240
    .line 241
    .line 242
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_8
    check-cast p0, La/eue;

    .line 246
    .line 247
    new-instance v0, Landroid/text/TextPaint;

    .line 248
    .line 249
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 250
    .line 251
    .line 252
    const/4 v1, 0x1

    .line 253
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 254
    .line 255
    .line 256
    iget-object p0, p0, La/eue;->a:Landroid/view/View;

    .line 257
    .line 258
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-static {v0, p0, v3}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 266
    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_9
    check-cast p0, La/fae;

    .line 270
    .line 271
    invoke-virtual {p0, v3}, La/fae;->B(I)Z

    .line 272
    .line 273
    .line 274
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_a
    check-cast p0, Landroid/database/Cursor;

    .line 278
    .line 279
    sget-object v0, La/i5e;->q2:La/kud;

    .line 280
    .line 281
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    return-object p0

    .line 286
    :pswitch_b
    check-cast p0, La/z9c;

    .line 287
    .line 288
    iget-object p0, p0, La/z9c;->a:La/nq8;

    .line 289
    .line 290
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 291
    .line 292
    check-cast p0, Landroid/widget/ImageView;

    .line 293
    .line 294
    if-lez v3, :cond_4

    .line 295
    .line 296
    const v0, 0x7f0806fd

    .line 297
    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_4
    const v0, 0x7f0806fc

    .line 301
    .line 302
    .line 303
    :goto_2
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 304
    .line 305
    .line 306
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
