.class public final Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;
.super La/mlz;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final b:La/n0o0;

.field public c:La/x1t;

.field public final d:La/a8z;

.field public final e:La/a8z;

.field public final f:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/mlz;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y1t;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/y1t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->b:La/n0o0;

    .line 15
    .line 16
    new-instance v0, La/y1t;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La/y1t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wez;->b:La/wez;

    .line 23
    .line 24
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->d:La/a8z;

    .line 29
    .line 30
    new-instance v0, La/y1t;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-direct {v0, p0, v2}, La/y1t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->e:La/a8z;

    .line 41
    .line 42
    new-instance v0, La/y1t;

    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    invoke-direct {v0, p0, v2}, La/y1t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->f:La/a8z;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 8
    .line 9
    return-object p0
.end method

.method public final onCreate()V
    .locals 4

    .line 1
    invoke-super {p0}, La/mlz;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zn00;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->b:La/n0o0;

    .line 7
    .line 8
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, La/vai;

    .line 13
    .line 14
    new-instance v2, La/fiu0;

    .line 15
    .line 16
    iget-object v1, v1, La/vai;->t:La/r5i;

    .line 17
    .line 18
    const-class v3, La/x1t;

    .line 19
    .line 20
    invoke-static {v3, v1}, La/wcf0;->h(Ljava/lang/Class;Ljava/lang/Object;)La/wcf0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v2, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0, v2}, La/zn00;-><init>(La/mlz;La/miu0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3}, La/zn00;->h0(Ljava/lang/Class;)La/diu0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/x1t;

    .line 35
    .line 36
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 37
    .line 38
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->e:La/a8z;

    .line 11
    .line 12
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/view/WindowManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 27
    .line 28
    :goto_0
    invoke-super {p0}, La/mlz;->onDestroy()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 26

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v8

    .line 12
    :goto_0
    const/4 v1, 0x0

    .line 13
    const-string v9, "viewModel"

    .line 14
    .line 15
    if-eqz v0, :cond_8

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const v4, -0x1f83c795

    .line 22
    .line 23
    .line 24
    if-eq v3, v4, :cond_5

    .line 25
    .line 26
    const v4, 0x2ed8028d

    .line 27
    .line 28
    .line 29
    if-eq v3, v4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const-string v3, "ACTION_PAUSE"

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v0, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {v0}, La/x1t;->x()V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, La/x1t;->m:La/p7m0;

    .line 49
    .line 50
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v3, v1

    .line 55
    check-cast v3, La/j1t;

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    const/16 v18, 0x5fff

    .line 60
    .line 61
    const-wide/16 v4, 0x0

    .line 62
    .line 63
    const-wide/16 v6, 0x0

    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    const-wide/16 v9, 0x0

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x0

    .line 70
    const/4 v13, 0x0

    .line 71
    const/4 v14, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    invoke-static/range {v3 .. v18}, La/j1t;->a(La/j1t;JJIJLjava/lang/String;ZZZLa/w3w0;ZLjava/lang/String;I)La/j1t;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/app/Service;->stopSelf()V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_2

    .line 89
    .line 90
    :cond_4
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v8

    .line 94
    :cond_5
    const-string v3, "ACTION_STOP"

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    iget-object v0, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    iget-object v3, v0, La/x1t;->h:La/sdi0;

    .line 108
    .line 109
    invoke-virtual {v3, v1}, La/sdi0;->b(Z)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v0, La/x1t;->c:La/yqc;

    .line 113
    .line 114
    invoke-virtual {v0}, La/yqc;->v()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/app/Service;->stopSelf()V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :cond_7
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v8

    .line 126
    :cond_8
    :goto_1
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 131
    .line 132
    const/4 v4, -0x1

    .line 133
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const v4, 0x7f0706ea

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    invoke-static {v0, v3}, La/hxm0;->x(Landroid/view/View;I)V

    .line 151
    .line 152
    .line 153
    iget-object v3, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->f:La/a8z;

    .line 154
    .line 155
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Landroid/view/WindowManager$LayoutParams;

    .line 160
    .line 161
    const/16 v5, 0x11

    .line 162
    .line 163
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 164
    .line 165
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 166
    .line 167
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 168
    .line 169
    iget-object v1, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->e:La/a8z;

    .line 170
    .line 171
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Landroid/view/WindowManager;

    .line 176
    .line 177
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Landroid/view/WindowManager$LayoutParams;

    .line 182
    .line 183
    invoke-interface {v1, v0, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBroadcastingContainerView()Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    new-instance v3, La/z1t;

    .line 191
    .line 192
    invoke-direct {v3, v2, v0}, La/z1t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iget-object v1, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 203
    .line 204
    if-eqz v1, :cond_f

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setJavascriptInterface(La/r0t;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iget-object v1, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 214
    .line 215
    if-eqz v1, :cond_e

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBroadcastingControlPanelView()Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->u(La/dke;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v10, La/o0t;

    .line 232
    .line 233
    iget-object v12, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 234
    .line 235
    if-eqz v12, :cond_d

    .line 236
    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const/16 v17, 0x2

    .line 240
    .line 241
    const/4 v11, 0x0

    .line 242
    const-class v21, La/x1t;

    .line 243
    .line 244
    const-string v14, "onMediaFileReddy"

    .line 245
    .line 246
    const-string v15, "onMediaFileReddy()V"

    .line 247
    .line 248
    move-object/from16 v13, v21

    .line 249
    .line 250
    invoke-direct/range {v10 .. v17}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v10}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnMediaFileReddyListener(Lkotlin/jvm/functions/Function0;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v18, La/o0t;

    .line 261
    .line 262
    iget-object v1, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 263
    .line 264
    if-eqz v1, :cond_c

    .line 265
    .line 266
    const/16 v24, 0x0

    .line 267
    .line 268
    const/16 v25, 0x3

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    const-string v22, "onBroadcastingError"

    .line 273
    .line 274
    const-string v23, "onBroadcastingError()V"

    .line 275
    .line 276
    move-object/from16 v20, v1

    .line 277
    .line 278
    invoke-direct/range {v18 .. v25}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v1, v18

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnErrorListener(Lkotlin/jvm/functions/Function0;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    new-instance v18, La/o0t;

    .line 291
    .line 292
    iget-object v1, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 293
    .line 294
    if-eqz v1, :cond_b

    .line 295
    .line 296
    const/16 v24, 0x0

    .line 297
    .line 298
    const/16 v25, 0x4

    .line 299
    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    const-string v22, "onVideoContainerClick"

    .line 303
    .line 304
    const-string v23, "onVideoContainerClick()V"

    .line 305
    .line 306
    move-object/from16 v20, v1

    .line 307
    .line 308
    invoke-direct/range {v18 .. v25}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v1, v18

    .line 312
    .line 313
    invoke-virtual {v0, v1}, La/ctr;->setOnContainerClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 317
    .line 318
    if-eqz v0, :cond_a

    .line 319
    .line 320
    iget-object v1, v0, La/x1t;->m:La/p7m0;

    .line 321
    .line 322
    new-instance v3, La/j0s;

    .line 323
    .line 324
    const/16 v4, 0x8

    .line 325
    .line 326
    invoke-direct {v3, v0, v8, v4}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 327
    .line 328
    .line 329
    new-instance v0, La/fnq;

    .line 330
    .line 331
    invoke-direct {v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 332
    .line 333
    .line 334
    new-instance v10, La/yop;

    .line 335
    .line 336
    const/4 v1, 0x2

    .line 337
    invoke-direct {v10, v0, v1}, La/yop;-><init>(La/fnq;B)V

    .line 338
    .line 339
    .line 340
    sget-object v0, La/lkz;->a:La/lkz;

    .line 341
    .line 342
    new-instance v0, La/pfl;

    .line 343
    .line 344
    const/4 v6, 0x4

    .line 345
    const/16 v7, 0x13

    .line 346
    .line 347
    const-class v3, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;

    .line 348
    .line 349
    const-string v4, "handleUiState"

    .line 350
    .line 351
    const-string v5, "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowScreenUiState;)V"

    .line 352
    .line 353
    invoke-direct/range {v0 .. v7}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 354
    .line 355
    .line 356
    iget-object v1, v2, La/mlz;->a:La/cyu;

    .line 357
    .line 358
    iget-object v3, v1, La/cyu;->a:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v3, La/glz;

    .line 361
    .line 362
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    new-instance v4, La/fns;

    .line 367
    .line 368
    invoke-direct {v4, v10, v2, v0, v8}, La/fns;-><init>(La/yop;Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;La/pfl;La/yje;)V

    .line 369
    .line 370
    .line 371
    const/4 v0, 0x3

    .line 372
    invoke-static {v3, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 373
    .line 374
    .line 375
    iget-object v3, v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->c:La/x1t;

    .line 376
    .line 377
    if-eqz v3, :cond_9

    .line 378
    .line 379
    iget-object v3, v3, La/x1t;->n:La/p7m0;

    .line 380
    .line 381
    new-instance v4, La/j0s;

    .line 382
    .line 383
    const/16 v5, 0x9

    .line 384
    .line 385
    invoke-direct {v4, v2, v8, v5}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 386
    .line 387
    .line 388
    iget-object v1, v1, La/cyu;->a:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v1, La/glz;

    .line 391
    .line 392
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    new-instance v5, La/fns;

    .line 397
    .line 398
    invoke-direct {v5, v3, v2, v4, v8}, La/fns;-><init>(La/gmq;Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;La/j0s;La/yje;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v1, v8, v8, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 402
    .line 403
    .line 404
    :goto_2
    invoke-super/range {p0 .. p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    return v0

    .line 409
    :cond_9
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw v8

    .line 413
    :cond_a
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v8

    .line 417
    :cond_b
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw v8

    .line 421
    :cond_c
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw v8

    .line 425
    :cond_d
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v8

    .line 429
    :cond_e
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v8

    .line 433
    :cond_f
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    throw v8
.end method
