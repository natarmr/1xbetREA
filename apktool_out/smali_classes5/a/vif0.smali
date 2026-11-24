.class public final La/vif0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vif0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Q1:La/cge0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public final M1:La/cgx0;

.field public final N1:La/s0r;

.field public final O1:La/a8z;

.field public final P1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vif0;

    .line 4
    .line 5
    const-string v2, "form2faAlert"

    .line 6
    .line 7
    const-string v3, "getForm2faAlert()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/security/impl/databinding/FragmentRemoveTwoFactorAuthenticationBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/vif0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cge0;

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/vif0;->Q1:La/cge0;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02bb

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/vif0;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/vif0;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/cgx0;

    .line 22
    .line 23
    const-string v1, "FROM_2FA_ALERT_KEY"

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/vif0;->M1:La/cgx0;

    .line 30
    .line 31
    sget-object v0, La/tif0;->a:La/tif0;

    .line 32
    .line 33
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/vif0;->N1:La/s0r;

    .line 38
    .line 39
    new-instance v0, La/rif0;

    .line 40
    .line 41
    invoke-direct {v0, p0, v2}, La/rif0;-><init>(La/vif0;B)V

    .line 42
    .line 43
    .line 44
    sget-object v1, La/wez;->b:La/wez;

    .line 45
    .line 46
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/vif0;->O1:La/a8z;

    .line 51
    .line 52
    new-instance v0, La/rif0;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {v0, p0, v2}, La/rif0;-><init>(La/vif0;B)V

    .line 56
    .line 57
    .line 58
    new-instance v2, La/lce0;

    .line 59
    .line 60
    const/16 v3, 0xe

    .line 61
    .line 62
    invoke-direct {v2, v0, v3}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    new-instance v0, La/lce0;

    .line 66
    .line 67
    const/16 v3, 0xf

    .line 68
    .line 69
    invoke-direct {v0, p0, v3}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    new-instance v3, La/lce0;

    .line 73
    .line 74
    const/16 v4, 0x10

    .line 75
    .line 76
    invoke-direct {v3, v0, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-class v1, La/gjf0;

    .line 84
    .line 85
    sget-object v3, La/sre0;->a:La/tre0;

    .line 86
    .line 87
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v3, La/wbe0;

    .line 92
    .line 93
    invoke-direct {v3, v0, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 94
    .line 95
    .line 96
    new-instance v4, La/wbe0;

    .line 97
    .line 98
    const/16 v5, 0x11

    .line 99
    .line 100
    invoke-direct {v4, v0, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v1, v3, v4, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, La/vif0;->P1:La/kiu0;

    .line 108
    .line 109
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/d4r;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f080965

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v2, 0x7f0706c6

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    new-instance v2, Landroid/graphics/Rect;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v2, v3, v3, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {p1, v0, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p1, p1, La/d4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 50
    .line 51
    new-instance v0, La/da0;

    .line 52
    .line 53
    new-instance v2, La/sif0;

    .line 54
    .line 55
    invoke-direct {v2, p0, v3}, La/sif0;-><init>(La/vif0;B)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v2}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/d4r;->c:Landroid/widget/TextView;

    .line 69
    .line 70
    const v0, 0x7f131587

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v2, La/sif0;

    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    invoke-direct {v2, p0, v4}, La/sif0;-><init>(La/vif0;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const-string v5, "~"

    .line 94
    .line 95
    filled-new-array {v5}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    const/4 v7, 0x6

    .line 100
    invoke-static {v0, v6, v3, v7}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    new-instance v8, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    move v9, v3

    .line 114
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_3

    .line 119
    .line 120
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    add-int/lit8 v11, v9, 0x1

    .line 125
    .line 126
    if-ltz v9, :cond_2

    .line 127
    .line 128
    move-object v12, v10

    .line 129
    check-cast v12, Ljava/lang/String;

    .line 130
    .line 131
    rem-int/lit8 v9, v9, 0x2

    .line 132
    .line 133
    if-ne v9, v4, :cond_1

    .line 134
    .line 135
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_1
    move v9, v11

    .line 139
    goto :goto_0

    .line 140
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 141
    .line 142
    .line 143
    throw v1

    .line 144
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    .line 145
    .line 146
    const/16 v6, 0xa

    .line 147
    .line 148
    invoke-static {v8, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    move v8, v3

    .line 160
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-eqz v9, :cond_5

    .line 165
    .line 166
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    add-int/lit8 v10, v8, 0x1

    .line 171
    .line 172
    if-ltz v8, :cond_4

    .line 173
    .line 174
    check-cast v9, Ljava/lang/String;

    .line 175
    .line 176
    div-int/lit8 v8, v8, 0x2

    .line 177
    .line 178
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    new-instance v11, Lkotlin/Pair;

    .line 183
    .line 184
    invoke-direct {v11, v9, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move v8, v10

    .line 191
    goto :goto_1

    .line 192
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 193
    .line 194
    .line 195
    throw v1

    .line 196
    :cond_5
    const-string v2, ""

    .line 197
    .line 198
    invoke-static {v0, v5, v2, v3}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Landroid/text/SpannableString;

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_6

    .line 223
    .line 224
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Lkotlin/Pair;

    .line 229
    .line 230
    new-instance v5, La/vhd;

    .line 231
    .line 232
    invoke-direct {v5, v4}, La/vhd;-><init>(Lkotlin/Pair;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    iget-object v8, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v8, Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v6, v8, v3, v3, v7}, Lkotlin/text/StringsKt;->V(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    iget-object v4, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v4, Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    add-int/2addr v4, v6

    .line 260
    const/16 v8, 0x21

    .line 261
    .line 262
    invoke-virtual {v0, v5, v6, v4, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_6
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 271
    .line 272
    .line 273
    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    .line 274
    .line 275
    invoke-virtual {p1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    iget-object p1, p1, La/d4r;->e:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 283
    .line 284
    new-instance v0, La/rif0;

    .line 285
    .line 286
    const/4 v2, 0x4

    .line 287
    invoke-direct {v0, p0, v2}, La/rif0;-><init>(La/vif0;B)V

    .line 288
    .line 289
    .line 290
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    iget-object p1, p1, La/d4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 298
    .line 299
    new-instance v0, La/rif0;

    .line 300
    .line 301
    const/4 v2, 0x5

    .line 302
    invoke-direct {v0, p0, v2}, La/rif0;-><init>(La/vif0;B)V

    .line 303
    .line 304
    .line 305
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iget-object p1, p1, La/d4r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 313
    .line 314
    invoke-static {p1, p0, v1}, La/uvw;->R(Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 315
    .line 316
    .line 317
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/vif0;->H0()La/gjf0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/d4r;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, La/gjf0;->w(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/vif0;->H0()La/gjf0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/gjf0;->i:La/p7m0;

    .line 23
    .line 24
    new-instance v1, La/uif0;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-direct {v1, p0, v7, v2}, La/uif0;-><init>(La/vif0;La/yje;B)V

    .line 29
    .line 30
    .line 31
    sget-object v2, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/w7f0;

    .line 46
    .line 47
    invoke-direct {v4, v0, v2, v1, v7}, La/w7f0;-><init>(La/gmq;La/clz;La/uif0;La/yje;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/vif0;->H0()La/gjf0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v4, v1, La/gjf0;->j:La/ol60;

    .line 59
    .line 60
    new-instance v6, La/uif0;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-direct {v6, p0, v7, v1}, La/uif0;-><init>(La/vif0;La/yje;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v3, La/w7f0;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-direct/range {v3 .. v8}, La/w7f0;-><init>(La/gmq;La/clz;La/uif0;La/yje;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final G0()La/d4r;
    .locals 2

    .line 1
    sget-object v0, La/vif0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/vif0;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/d4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/gjf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vif0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gjf0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/rif0;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, p0, v0}, La/rif0;-><init>(La/vif0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_REQUEST_ERROR_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/rif0;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, v0}, La/rif0;-><init>(La/vif0;B)V

    .line 19
    .line 20
    .line 21
    const-string v0, "REQUEST_CONSULTANT_KEY"

    .line 22
    .line 23
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/d4r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/vif0;->G0()La/d4r;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/d4r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    .line 10
    invoke-static {p0}, La/hxm0;->n(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vif0;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vif0;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
