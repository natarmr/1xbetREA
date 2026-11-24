.class public final Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic k:I


# instance fields
.field public final a:Landroid/util/AttributeSet;

.field public final b:I

.field public final c:La/n0o0;

.field public d:La/sse;

.field public e:Lkotlin/jvm/functions/Function1;

.field public f:Lkotlin/jvm/functions/Function1;

.field public g:Lkotlin/jvm/functions/Function1;

.field public h:Lkotlin/jvm/functions/Function1;

.field public i:Lkotlin/jvm/functions/Function1;

.field public j:La/pse;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p3, 0x7f04085b

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->a:Landroid/util/AttributeSet;

    .line 16
    .line 17
    iput p3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->b:I

    .line 18
    .line 19
    new-instance p1, La/ntl;

    .line 20
    .line 21
    const/16 v0, 0xa

    .line 22
    .line 23
    invoke-direct {p1, p0, v0}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->c:La/n0o0;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const v0, 0x7f0705c6

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    sget-object v0, La/sse;->a:La/sse;

    .line 44
    .line 45
    iput-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->d:La/sse;

    .line 46
    .line 47
    invoke-static {p0, p1}, La/jmu0;->i(Landroid/view/View;I)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->getBackgroundTintHelper()La/od5;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0, p2, p3}, La/od5;->a(Landroid/util/AttributeSet;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final getBackgroundTintHelper()La/od5;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/od5;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    const-string v0, "coefWithBgAccentTeam"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p1, La/sse;->a:La/sse;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :sswitch_1
    const-string v0, "smallTeamLogoAccentCoef"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    sget-object p1, La/sse;->d:La/sse;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :sswitch_2
    const-string v0, "bigTeamLogoAccentTeam"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    sget-object p1, La/sse;->e:La/sse;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :sswitch_3
    const-string v0, "compactAccentMarket"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    sget-object p1, La/sse;->b:La/sse;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_4
    const-string v0, "champNameAccentCoef"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    :goto_0
    sget-object p1, La/sse;->a:La/sse;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    sget-object p1, La/sse;->c:La/sse;

    .line 74
    .line 75
    :goto_1
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->d:La/sse;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->d:La/sse;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/4 v0, 0x6

    .line 87
    const/4 v1, 0x0

    .line 88
    if-eqz p1, :cond_a

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    if-eq p1, v2, :cond_9

    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    if-eq p1, v2, :cond_8

    .line 95
    .line 96
    const/4 v2, 0x3

    .line 97
    if-eq p1, v2, :cond_7

    .line 98
    .line 99
    const/4 v2, 0x4

    .line 100
    if-ne p1, v2, :cond_6

    .line 101
    .line 102
    new-instance p1, La/f4l0;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, v2}, La/f4l0;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    new-instance p1, La/l4l0;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v2}, La/l4l0;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_8
    new-instance p1, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-direct {p1, v2, v1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_9
    new-instance p1, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-direct {p1, v2, v1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_a
    new-instance p1, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCoefWithBg;

    .line 159
    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-direct {p1, v2, v1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCoefWithBg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 168
    .line 169
    .line 170
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v3, La/cqd0;->i:[I

    .line 178
    .line 179
    iget v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->b:I

    .line 180
    .line 181
    iget-object v5, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->a:Landroid/util/AttributeSet;

    .line 182
    .line 183
    const/4 v6, 0x0

    .line 184
    invoke-virtual {v2, v5, v3, v4, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_b

    .line 193
    .line 194
    invoke-interface {p1}, La/lue;->a()V

    .line 195
    .line 196
    .line 197
    :cond_b
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 201
    .line 202
    .line 203
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 204
    .line 205
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->f:Lkotlin/jvm/functions/Function1;

    .line 206
    .line 207
    invoke-interface {p1, v0}, La/pse;->setCancelButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 211
    .line 212
    if-eqz p1, :cond_c

    .line 213
    .line 214
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->e:Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    invoke-interface {p1, v0}, La/pse;->setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    :cond_c
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 220
    .line 221
    if-eqz p1, :cond_d

    .line 222
    .line 223
    move-object v1, p1

    .line 224
    check-cast v1, La/gue;

    .line 225
    .line 226
    :cond_d
    if-eqz v1, :cond_e

    .line 227
    .line 228
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->g:Lkotlin/jvm/functions/Function1;

    .line 229
    .line 230
    invoke-interface {v1, p1}, La/gue;->setAutoSubClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 231
    .line 232
    .line 233
    :cond_e
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 234
    .line 235
    if-eqz p1, :cond_f

    .line 236
    .line 237
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->h:Lkotlin/jvm/functions/Function1;

    .line 238
    .line 239
    invoke-interface {p1, v0}, La/pse;->setOptionBetClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 240
    .line 241
    .line 242
    :cond_f
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 243
    .line 244
    if-eqz p1, :cond_10

    .line 245
    .line 246
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->i:Lkotlin/jvm/functions/Function1;

    .line 247
    .line 248
    invoke-interface {p1, v0}, La/pse;->setEachWayClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 249
    .line 250
    .line 251
    :cond_10
    const-string p1, "DsCouponCard"

    .line 252
    .line 253
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :sswitch_data_0
    .sparse-switch
        -0x500c2fff -> :sswitch_4
        -0x17771797 -> :sswitch_3
        -0x145f20d1 -> :sswitch_2
        0x35720f26 -> :sswitch_1
        0x4114507f -> :sswitch_0
    .end sparse-switch
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->getBackgroundTintHelper()La/od5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/od5;->b:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getCurrentStyledView()La/pse;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAutoSub(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    check-cast p0, La/gue;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, p1}, La/gue;->setAutoSub(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final setAutoSubClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->g:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    check-cast p1, La/gue;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->g:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    invoke-interface {p1, p0}, La/gue;->setAutoSubClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final setCancelButtonClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->f:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/pse;->setCancelButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setCaption(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, La/hue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/hue;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, p1}, La/hue;->setCaption(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setCouponBonusTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/pse;->setCouponBonusTitle(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setCouponBonusTitleStyle(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setCouponBonusTitleStyle(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setEachWay(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/pse;->setEachWay(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setEachWayClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->i:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/pse;->setEachWayClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setError(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/pse;->setError(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setMarketDescription(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/pse;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setMarketDescriptionStyle(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, La/l4l0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/l4l0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/l4l0;->setCouponMarketDescriptionStyle(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setMarketHeader(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, La/jue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/jue;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, p1}, La/jue;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setMarketStyle(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1}, La/pse;->setMarketStyle(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setModel(La/fue;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/pse;->setModel(La/fue;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->e:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/pse;->setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setOptionBet(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, La/pse;->setOptionBet(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOptionBetClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->h:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/pse;->setOptionBetClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setRtlSupportEnabled(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, La/f4l0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/f4l0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/f4l0;->setRtlSupportEnabled(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setScoreUiModel(La/yse;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    instance-of v0, p0, La/kue;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, La/kue;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, p1}, La/kue;->setScoreUiModel(La/yse;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final setSportImage(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, La/mue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/mue;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, p1}, La/mue;->setSportImage(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setSubTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/pse;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setTagColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/pse;->setTagColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setTagText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/pse;->setTagText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setTeamsUiModel(La/cue;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 5
    .line 6
    instance-of v0, p0, La/kue;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, La/kue;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, p1}, La/kue;->setTeamsUiModel(La/cue;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 2
    .line 3
    instance-of v0, p0, La/nue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/nue;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, p1}, La/nue;->setTitle(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
