.class public final Lorg/xplatform/ui_core/viewcomponents/smart_background/e;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/vd7;

.field public b:La/ulo;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lkotlin/jvm/functions/Function0;

.field public final f:La/jbk0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const v1, 0x7f0d06d5

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    const p1, 0x7f0a0895

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const p1, 0x7f0a13b9

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroidx/media3/ui/PlayerView;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    new-instance p1, La/vd7;

    .line 42
    .line 43
    const/16 v0, 0x1c

    .line 44
    .line 45
    invoke-direct {p1, p0, v1, v2, v0}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a:La/vd7;

    .line 49
    .line 50
    const-string p1, ""

    .line 51
    .line 52
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->d:Ljava/lang/String;

    .line 55
    .line 56
    new-instance p1, La/hwi0;

    .line 57
    .line 58
    const/16 v0, 0x19

    .line 59
    .line 60
    invoke-direct {p1, v0}, La/hwi0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->e:Lkotlin/jvm/functions/Function0;

    .line 64
    .line 65
    new-instance p1, La/jbk0;

    .line 66
    .line 67
    invoke-direct {p1, p0}, La/jbk0;-><init>(Lorg/xplatform/ui_core/viewcomponents/smart_background/e;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->f:La/jbk0;

    .line 71
    .line 72
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "Missing required view with ID: "

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a:La/vd7;

    .line 2
    .line 3
    iget-object v0, v0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroidx/media3/ui/PlayerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setPlayer(La/my90;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->f:La/jbk0;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, La/ulo;->G(La/ky90;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, La/ulo;->F()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 28
    .line 29
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/elo;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, La/elo;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, La/elo;->a()La/ulo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 18
    .line 19
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a:La/vd7;

    .line 20
    .line 21
    iget-object v2, v1, La/vd7;->d:Landroid/view/View;

    .line 22
    .line 23
    check-cast v2, Landroidx/media3/ui/PlayerView;

    .line 24
    .line 25
    iget-object v1, v1, La/vd7;->d:Landroid/view/View;

    .line 26
    .line 27
    check-cast v1, Landroidx/media3/ui/PlayerView;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Landroidx/media3/ui/PlayerView;->setPlayer(La/my90;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->f:La/jbk0;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, La/ulo;->a(La/ky90;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    const/4 v0, 0x0

    .line 42
    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-virtual {p0, v0}, La/ulo;->Q(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 p0, 0x4

    .line 54
    invoke-virtual {v1, p0}, Landroidx/media3/ui/PlayerView;->setResizeMode(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_2
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v1, "window"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast v1, Landroid/view/WindowManager;

    .line 60
    .line 61
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v3, 0x1e

    .line 64
    .line 65
    if-lt v2, v3, :cond_4

    .line 66
    .line 67
    invoke-static {v1}, La/a7;->l(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, La/tmb0;->h(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 89
    .line 90
    :goto_0
    if-lt v2, v3, :cond_5

    .line 91
    .line 92
    invoke-static {v1}, La/a7;->l(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, La/tmb0;->h(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 114
    .line 115
    :goto_1
    const/4 v2, 0x0

    .line 116
    const/4 v3, 0x1

    .line 117
    if-le v4, v1, :cond_6

    .line 118
    .line 119
    move v1, v3

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move v1, v2

    .line 122
    :goto_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const v4, 0x7f05000f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    move v0, v3

    .line 138
    goto :goto_3

    .line 139
    :cond_7
    move v0, v2

    .line 140
    :goto_3
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c:Ljava/lang/String;

    .line 141
    .line 142
    iput-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b()V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a:La/vd7;

    .line 148
    .line 149
    iget-object v1, p1, La/vd7;->c:Landroid/view/View;

    .line 150
    .line 151
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 157
    .line 158
    iget-object p1, p1, La/vd7;->c:Landroid/view/View;

    .line 159
    .line 160
    check-cast p1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 161
    .line 162
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    const v4, 0x7f040b20

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v4, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    if-eqz v0, :cond_8

    .line 191
    .line 192
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_8
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 196
    .line 197
    :goto_4
    if-eqz v0, :cond_9

    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 227
    .line 228
    :goto_5
    new-instance v5, La/ibk0;

    .line 229
    .line 230
    invoke-direct {v5, p0, v2}, La/ibk0;-><init>(Lorg/xplatform/ui_core/viewcomponents/smart_background/e;B)V

    .line 231
    .line 232
    .line 233
    new-instance v2, La/ibk0;

    .line 234
    .line 235
    invoke-direct {v2, p0, v3}, La/ibk0;-><init>(Lorg/xplatform/ui_core/viewcomponents/smart_background/e;B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {p0}, La/sj3;->q0(Landroid/content/Context;)Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-nez p0, :cond_a

    .line 250
    .line 251
    :goto_6
    return-void

    .line 252
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-static {p0}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    new-instance v6, La/k1x;

    .line 261
    .line 262
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    invoke-direct {v6, v7}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 267
    .line 268
    .line 269
    iput-object p2, v6, La/k1x;->c:Ljava/lang/Object;

    .line 270
    .line 271
    invoke-static {v6, p1}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v6, v1}, La/t1x;->f(La/k1x;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v0, v4}, La/k1x;->d(II)V

    .line 278
    .line 279
    .line 280
    new-instance p2, La/phf0;

    .line 281
    .line 282
    invoke-direct {p2, v2, v5, p1}, La/phf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    iput-object p2, v6, La/k1x;->e:La/n1x;

    .line 286
    .line 287
    invoke-static {v6, v3}, La/t1x;->b(La/k1x;Z)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v6}, La/k1x;->a()La/o1x;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-virtual {p0, p1}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 295
    .line 296
    .line 297
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->b:La/ulo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, La/ulo;->P(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a:La/vd7;

    .line 12
    .line 13
    iget-object v0, p0, La/vd7;->c:Landroid/view/View;

    .line 14
    .line 15
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    invoke-static {v0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/vd7;->c:Landroid/view/View;

    .line 21
    .line 22
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 9
    .line 10
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 17
    .line 18
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->d:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;->a:Landroid/os/Parcelable;

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0, v2, p0, v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/SmartBackgroundVideoView$SavedState;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final setOnPlayerReadyListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->e:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
