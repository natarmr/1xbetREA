.class public final synthetic La/bx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bx2;->a:B

    iput-object p1, p0, La/bx2;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/bx2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, La/bx2;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x9

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v4, 0x7

    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    filled-new-array {v1, v4, v5}, [Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N1:Landroid/view/MotionEvent;

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_0

    .line 61
    .line 62
    move v2, v3

    .line 63
    :cond_0
    if-eqz v0, :cond_1

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->O1:J

    .line 72
    .line 73
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W1:La/mx2;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c2:La/bx2;

    .line 79
    .line 80
    invoke-virtual {p0}, La/bx2;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getConfiguration()Landroid/content/res/Configuration;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, La/ss00;->c(Landroid/os/LocaleList;)La/ss00;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, La/ss00;->b()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La/ss00;->c(Landroid/os/LocaleList;)La/ss00;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :cond_2
    iget-object p0, p0, La/ss00;->a:La/ts00;

    .line 115
    .line 116
    iget-object v0, p0, La/ts00;->a:Landroid/os/LocaleList;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    new-instance v1, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    :goto_0
    if-ge v2, v0, :cond_3

    .line 128
    .line 129
    new-instance v3, La/qs00;

    .line 130
    .line 131
    iget-object v4, p0, La/ts00;->a:Landroid/os/LocaleList;

    .line 132
    .line 133
    invoke-virtual {v4, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-direct {v3, v4}, La/qs00;-><init>(Ljava/util/Locale;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    add-int/lit8 v2, v2, 0x1

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_3
    new-instance p0, La/rs00;

    .line 150
    .line 151
    invoke-direct {p0, v1}, La/rs00;-><init>(Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_1
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 156
    .line 157
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p:La/pz40;

    .line 158
    .line 159
    check-cast p0, La/hgk0;

    .line 160
    .line 161
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    check-cast p0, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_2
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 172
    .line 173
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 174
    .line 175
    const/16 v4, 0x1c

    .line 176
    .line 177
    if-le v0, v4, :cond_a

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_4

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_4
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->n2:La/d12;

    .line 187
    .line 188
    if-nez v0, :cond_9

    .line 189
    .line 190
    new-instance v0, La/d12;

    .line 191
    .line 192
    invoke-direct {v0, v3}, La/d12;-><init>(B)V

    .line 193
    .line 194
    .line 195
    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->n2:La/d12;

    .line 196
    .line 197
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    :try_start_0
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 202
    .line 203
    if-nez v5, :cond_5

    .line 204
    .line 205
    const-string v5, "android.os.SystemProperties"

    .line 206
    .line 207
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    sput-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 212
    .line 213
    :cond_5
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->l2:Ljava/lang/reflect/Method;

    .line 214
    .line 215
    if-nez v5, :cond_7

    .line 216
    .line 217
    sget-object v5, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    .line 218
    .line 219
    invoke-static {v5}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 220
    .line 221
    .line 222
    sget-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 223
    .line 224
    if-eqz v5, :cond_6

    .line 225
    .line 226
    const-string v6, "addChangeCallback"

    .line 227
    .line 228
    new-array v7, v3, [Ljava/lang/Class;

    .line 229
    .line 230
    const-class v8, Ljava/lang/Runnable;

    .line 231
    .line 232
    aput-object v8, v7, v2

    .line 233
    .line 234
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    goto :goto_1

    .line 239
    :cond_6
    move-object v5, v1

    .line 240
    :goto_1
    sput-object v5, Landroidx/compose/ui/platform/AndroidComposeView;->l2:Ljava/lang/reflect/Method;

    .line 241
    .line 242
    :cond_7
    if-eqz v5, :cond_8

    .line 243
    .line 244
    new-array v3, v3, [Ljava/lang/Object;

    .line 245
    .line 246
    aput-object v0, v3, v2

    .line 247
    .line 248
    invoke-virtual {v5, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    .line 251
    :catchall_0
    :cond_8
    invoke-static {v4}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 252
    .line 253
    .line 254
    :cond_9
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->m2:La/vy40;

    .line 255
    .line 256
    monitor-enter v0

    .line 257
    :try_start_1
    invoke-virtual {v0, p0}, La/vy40;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 258
    .line 259
    .line 260
    monitor-exit v0

    .line 261
    goto :goto_2

    .line 262
    :catchall_1
    move-exception p0

    .line 263
    monitor-exit v0

    .line 264
    throw p0

    .line 265
    :cond_a
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_3
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q1:La/p33;

    .line 269
    .line 270
    if-eqz p0, :cond_e

    .line 271
    .line 272
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    :goto_3
    if-ge v2, v0, :cond_e

    .line 277
    .line 278
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    instance-of v4, v3, La/k33;

    .line 283
    .line 284
    if-eqz v4, :cond_b

    .line 285
    .line 286
    check-cast v3, La/k33;

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_b
    move-object v3, v1

    .line 290
    :goto_4
    if-nez v3, :cond_c

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_c
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-eqz v4, :cond_d

    .line 298
    .line 299
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 316
    .line 317
    .line 318
    :cond_d
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object p0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
