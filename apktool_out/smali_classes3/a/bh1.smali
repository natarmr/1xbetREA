.class public final synthetic La/bh1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;La/zzn;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/bh1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/bh1;->b:I

    iput-object p2, p0, La/bh1;->c:Ljava/lang/Object;

    iput-object p3, p0, La/bh1;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/bh1;->a:B

    iput-object p1, p0, La/bh1;->c:Ljava/lang/Object;

    iput p2, p0, La/bh1;->b:I

    iput-object p3, p0, La/bh1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/bh1;->a:B

    iput-object p1, p0, La/bh1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/bh1;->d:Ljava/lang/Object;

    iput p3, p0, La/bh1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/bh1;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, La/bh1;->b:I

    .line 6
    .line 7
    iget-object v4, p0, La/bh1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, La/bh1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, La/g2g0;

    .line 15
    .line 16
    check-cast v4, La/kr5;

    .line 17
    .line 18
    iget-object p0, v5, La/g2g0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/jlx;

    .line 21
    .line 22
    iget-object v0, v5, La/g2g0;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/uzc0;

    .line 25
    .line 26
    invoke-virtual {v0, v4, v3, v2}, La/uzc0;->a(La/kr5;IZ)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast v5, La/htg0;

    .line 37
    .line 38
    check-cast v4, La/cym0;

    .line 39
    .line 40
    invoke-static {v5, v3, v4}, La/htg0;->b(La/htg0;ILa/cym0;)Lkotlin/Unit;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast v5, La/omv;

    .line 46
    .line 47
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    invoke-static {v5, v2}, La/ckb;->a0(La/omv;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {v4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_2
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    check-cast v4, Ljava/lang/String;

    .line 65
    .line 66
    new-instance p0, La/qya0;

    .line 67
    .line 68
    invoke-direct {p0, v3, v4}, La/qya0;-><init>(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v5, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast v5, La/f1b0;

    .line 78
    .line 79
    check-cast v4, La/kr5;

    .line 80
    .line 81
    iget-object p0, v5, La/f1b0;->r:La/jlx;

    .line 82
    .line 83
    iget-object v0, v5, La/f1b0;->C:La/uzc0;

    .line 84
    .line 85
    invoke-virtual {v0, v4, v3, v2}, La/uzc0;->a(La/kr5;IZ)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0, v0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_4
    check-cast v5, La/wyu;

    .line 96
    .line 97
    check-cast v4, La/r9u;

    .line 98
    .line 99
    new-instance v12, La/l800;

    .line 100
    .line 101
    sget-object v0, La/iun;->a:La/iun;

    .line 102
    .line 103
    invoke-direct {v12, v2, v0, v0, v0}, La/l800;-><init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, La/wyu;->a()La/uaq0;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    sget-object v0, La/ygp;->t:La/ygp;

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v1, v4, La/r9u;->a:La/j1q0;

    .line 116
    .line 117
    invoke-virtual {v1, v0}, La/j1q0;->a(La/ygp;)Z

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    new-instance v6, La/ma00;

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v11, 0x0

    .line 125
    const/4 v7, 0x1

    .line 126
    const/4 v8, 0x0

    .line 127
    iget v9, p0, La/bh1;->b:I

    .line 128
    .line 129
    invoke-direct/range {v6 .. v14}, La/ma00;-><init>(ZZIIILa/l800;La/uaq0;Z)V

    .line 130
    .line 131
    .line 132
    return-object v6

    .line 133
    :pswitch_5
    check-cast v5, Lokhttp3/internal/http2/Http2Connection;

    .line 134
    .line 135
    check-cast v4, Lokhttp3/internal/http2/ErrorCode;

    .line 136
    .line 137
    sget-object p0, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 138
    .line 139
    :try_start_0
    iget-object p0, v5, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 140
    .line 141
    invoke-virtual {p0, v3, v4}, Lokhttp3/internal/http2/Http2Writer;->n(ILokhttp3/internal/http2/ErrorCode;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    .line 146
    move-object p0, v0

    .line 147
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 148
    .line 149
    invoke-virtual {v5, v0, v0, p0}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 150
    .line 151
    .line 152
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_6
    check-cast v5, Ljava/lang/String;

    .line 156
    .line 157
    check-cast v4, La/zzn;

    .line 158
    .line 159
    new-array p0, v3, [La/ugi0;

    .line 160
    .line 161
    move v0, v2

    .line 162
    :goto_1
    if-ge v0, v3, :cond_0

    .line 163
    .line 164
    new-instance v1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const/16 v6, 0x2e

    .line 173
    .line 174
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget-object v6, v4, La/zna0;->e:[Ljava/lang/String;

    .line 178
    .line 179
    aget-object v6, v6, v0

    .line 180
    .line 181
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    sget-object v6, La/aum0;->e:La/aum0;

    .line 189
    .line 190
    new-array v7, v2, [La/ugi0;

    .line 191
    .line 192
    invoke-static {v1, v6, v7}, La/x2x;->H(Ljava/lang/String;La/c3x;[La/ugi0;)La/wgi0;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    aput-object v1, p0, v0

    .line 197
    .line 198
    add-int/lit8 v0, v0, 0x1

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_0
    return-object p0

    .line 202
    :pswitch_7
    check-cast v5, Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;

    .line 203
    .line 204
    check-cast v4, La/x5g;

    .line 205
    .line 206
    iget-object p0, v5, Lorg/xplatform/cyber/calendar/impl/presentation/content/month/CyberCalendarMonthView;->a:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-static {v3, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, La/ibg;

    .line 213
    .line 214
    if-nez v0, :cond_1

    .line 215
    .line 216
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0, v5}, La/ibg;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/ibg;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iget-object v1, v0, La/ibg;->a:Landroid/widget/LinearLayout;

    .line 229
    .line 230
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    :cond_1
    iget-object p0, v0, La/ibg;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;

    .line 237
    .line 238
    invoke-virtual {p0, v4}, Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweekview/CyberCalendarDaysOfWeekView;->a(La/x5g;)V

    .line 239
    .line 240
    .line 241
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object p0

    .line 244
    :pswitch_8
    check-cast v5, La/yxb;

    .line 245
    .line 246
    move-object v3, v4

    .line 247
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 248
    .line 249
    iget-boolean v0, v5, La/yxb;->C:Z

    .line 250
    .line 251
    if-nez v0, :cond_4

    .line 252
    .line 253
    iget-object v0, v5, La/yxb;->y:La/bby;

    .line 254
    .line 255
    if-eqz v0, :cond_2

    .line 256
    .line 257
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-ne v0, v1, :cond_2

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_2
    iget-object v0, v5, La/yxb;->v:La/bby;

    .line 265
    .line 266
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 267
    .line 268
    .line 269
    iget-object v0, v5, La/yxb;->w:La/bby;

    .line 270
    .line 271
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 272
    .line 273
    .line 274
    iget-object v0, v5, La/yxb;->z:La/bby;

    .line 275
    .line 276
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, v5, La/yxb;->o:La/p7m0;

    .line 280
    .line 281
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    move-object v2, v1

    .line 286
    check-cast v2, Ljava/util/List;

    .line 287
    .line 288
    sget-object v4, La/ixb;->a:La/ixb;

    .line 289
    .line 290
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_3

    .line 303
    .line 304
    iget-object v6, v5, La/yxb;->n:La/sje;

    .line 305
    .line 306
    sget-object v7, La/wxb;->a:La/wxb;

    .line 307
    .line 308
    new-instance v0, La/gc1;

    .line 309
    .line 310
    const/4 v4, 0x0

    .line 311
    move-object v1, v5

    .line 312
    const/4 v5, 0x2

    .line 313
    iget v2, p0, La/bh1;->b:I

    .line 314
    .line 315
    invoke-direct/range {v0 .. v5}, La/gc1;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 316
    .line 317
    .line 318
    const/16 v11, 0xe

    .line 319
    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v9, 0x0

    .line 322
    move-object v10, v0

    .line 323
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    iput-object p0, v1, La/yxb;->y:La/bby;

    .line 328
    .line 329
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_9
    check-cast v5, La/mh1;

    .line 333
    .line 334
    check-cast v4, La/kr5;

    .line 335
    .line 336
    sget-object p0, La/mh1;->E0:Ljava/lang/String;

    .line 337
    .line 338
    iget-object p0, v5, La/mh1;->T:La/jlx;

    .line 339
    .line 340
    iget-object v0, v5, La/mh1;->R:La/uzc0;

    .line 341
    .line 342
    invoke-virtual {v0, v4, v3, v1}, La/uzc0;->a(La/kr5;IZ)Landroid/content/Intent;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {p0, v0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 347
    .line 348
    .line 349
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object p0

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
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
