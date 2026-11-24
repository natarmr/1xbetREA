.class public final La/vdq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/biometric/internal/ui/FingerprintDialogActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/biometric/internal/ui/FingerprintDialogActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vdq;->a:B

    iput-object p1, p0, La/vdq;->b:Landroidx/biometric/internal/ui/FingerprintDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p2, p0, La/vdq;->a:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/vdq;->b:Landroidx/biometric/internal/ui/FingerprintDialogActivity;

    .line 7
    .line 8
    packed-switch p2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lkotlin/Unit;

    .line 12
    .line 13
    const p1, 0x7f1308d0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->u(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/d58;

    .line 27
    .line 28
    iget p2, p1, La/d58;->a:I

    .line 29
    .line 30
    const/16 v3, 0x8

    .line 31
    .line 32
    packed-switch p2, :pswitch_data_1

    .line 33
    .line 34
    .line 35
    :pswitch_1
    move v1, v3

    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    move v1, p2

    .line 38
    :goto_0
    :pswitch_3
    const/4 p2, 0x7

    .line 39
    if-eq v1, p2, :cond_0

    .line 40
    .line 41
    const/16 p2, 0x9

    .line 42
    .line 43
    if-ne v1, p2, :cond_1

    .line 44
    .line 45
    :cond_0
    sget p2, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->s()La/uo4;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget-object p2, p2, La/uo4;->b:La/xzc0;

    .line 52
    .line 53
    check-cast p2, La/yzc0;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object p2, La/iun;->a:La/iun;

    .line 59
    .line 60
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    :cond_1
    const/4 p2, 0x5

    .line 67
    if-ne v1, p2, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    sget p2, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->t()La/deq;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget-boolean p2, p2, La/deq;->c:Z

    .line 77
    .line 78
    if-nez p2, :cond_3

    .line 79
    .line 80
    iget-object p1, p1, La/d58;->b:Ljava/lang/CharSequence;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->u(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/agd;->x()La/glz;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance p2, La/wdq;

    .line 94
    .line 95
    invoke-direct {p2, p0, v2, v3}, La/wdq;-><init>(Landroidx/biometric/internal/ui/FingerprintDialogActivity;La/yje;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v2, v2, p2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 103
    .line 104
    .line 105
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-static {}, La/hny;->b()V

    .line 109
    .line 110
    .line 111
    :goto_3
    return-object v2

    .line 112
    :pswitch_4
    check-cast p1, La/p58;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_5
    check-cast p1, Lkotlin/Unit;

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_6
    check-cast p1, Ljava/lang/CharSequence;

    .line 129
    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    sget p2, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->u(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_7
    check-cast p1, Lkotlin/Pair;

    .line 141
    .line 142
    iget-object p2, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p2, Ljava/lang/CharSequence;

    .line 145
    .line 146
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p1, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget-object v0, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->y:Landroid/widget/TextView;

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :cond_6
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_9

    .line 167
    .line 168
    iget-object v0, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->y:Landroid/widget/TextView;

    .line 169
    .line 170
    if-eqz v0, :cond_7

    .line 171
    .line 172
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    iget-object p2, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->y:Landroid/widget/TextView;

    .line 176
    .line 177
    if-eqz p2, :cond_9

    .line 178
    .line 179
    if-eqz p1, :cond_8

    .line 180
    .line 181
    iget p0, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->z:I

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    iget p0, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->A:I

    .line 185
    .line 186
    :goto_4
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 187
    .line 188
    .line 189
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_b

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget-object p2, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->x:Landroid/widget/ImageView;

    .line 205
    .line 206
    if-eqz p2, :cond_a

    .line 207
    .line 208
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 209
    .line 210
    .line 211
    :cond_a
    invoke-virtual {p0}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->t()La/deq;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    iget-object p0, p0, La/deq;->n:La/p7m0;

    .line 216
    .line 217
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    check-cast p0, Ljava/lang/Boolean;

    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    if-eqz p0, :cond_b

    .line 228
    .line 229
    if-eqz p1, :cond_b

    .line 230
    .line 231
    instance-of p0, p1, Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 232
    .line 233
    if-eqz p0, :cond_b

    .line 234
    .line 235
    check-cast p1, Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 236
    .line 237
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    .line 238
    .line 239
    .line 240
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_9
    check-cast p1, La/aeq;

    .line 244
    .line 245
    sget p2, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 246
    .line 247
    invoke-virtual {p0}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->t()La/deq;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    iget-object p2, p2, La/deq;->f:La/aeq;

    .line 252
    .line 253
    sget-object v3, La/aeq;->a:La/aeq;

    .line 254
    .line 255
    if-ne p2, v3, :cond_c

    .line 256
    .line 257
    sget-object p2, La/aeq;->b:La/aeq;

    .line 258
    .line 259
    if-eq p1, p2, :cond_e

    .line 260
    .line 261
    :cond_c
    iget-object p1, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->w:La/c4m0;

    .line 262
    .line 263
    if-eqz p1, :cond_d

    .line 264
    .line 265
    invoke-virtual {p1, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 266
    .line 267
    .line 268
    :cond_d
    invoke-virtual {p0}, La/agd;->x()La/glz;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    new-instance p2, La/wdq;

    .line 277
    .line 278
    invoke-direct {p2, p0, v2, v1}, La/wdq;-><init>(Landroidx/biometric/internal/ui/FingerprintDialogActivity;La/yje;B)V

    .line 279
    .line 280
    .line 281
    invoke-static {p1, v2, v2, p2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    iput-object p1, p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->w:La/c4m0;

    .line 286
    .line 287
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object p0

    .line 290
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-eqz p1, :cond_f

    .line 297
    .line 298
    sget-object p1, La/l5a;->b:La/l5a;

    .line 299
    .line 300
    sget p2, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 301
    .line 302
    invoke-virtual {p0, p1}, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->r(La/l5a;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 306
    .line 307
    .line 308
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object p0

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
