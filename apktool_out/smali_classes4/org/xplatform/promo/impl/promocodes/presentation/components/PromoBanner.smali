.class public final Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:La/vd7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const v3, 0x7f0d0537

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const v2, 0x7f0a130a

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v6, v3

    .line 32
    check-cast v6, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 33
    .line 34
    if-eqz v6, :cond_5

    .line 35
    .line 36
    const v2, 0x7f0a130b

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 44
    .line 45
    if-eqz v3, :cond_5

    .line 46
    .line 47
    const v2, 0x7f0a130c

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Landroid/widget/LinearLayout;

    .line 55
    .line 56
    if-eqz v3, :cond_5

    .line 57
    .line 58
    const v2, 0x7f0a130d

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    move-object v7, v3

    .line 66
    check-cast v7, Landroidx/appcompat/widget/AppCompatTextView;

    .line 67
    .line 68
    if-eqz v7, :cond_5

    .line 69
    .line 70
    const v2, 0x7f0a130e

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    move-object v8, v3

    .line 78
    check-cast v8, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;

    .line 79
    .line 80
    if-eqz v8, :cond_5

    .line 81
    .line 82
    new-instance v4, La/vd7;

    .line 83
    .line 84
    const/16 v9, 0x15

    .line 85
    .line 86
    move-object v5, p0

    .line 87
    invoke-direct/range {v4 .. v9}, La/vd7;-><init>(Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 88
    .line 89
    .line 90
    iput-object v4, v5, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a:La/vd7;

    .line 91
    .line 92
    sget-object p0, La/bqd0;->f0:[I

    .line 93
    .line 94
    invoke-virtual {p1, p2, p0, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string p2, ""

    .line 103
    .line 104
    if-nez p1, :cond_1

    .line 105
    .line 106
    move-object p1, p2

    .line 107
    :cond_1
    invoke-virtual {v5, p1}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->setLabel(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_2

    .line 115
    .line 116
    move-object p1, p2

    .line 117
    :cond_2
    const/4 p3, 0x1

    .line 118
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    move-object p2, v0

    .line 126
    :goto_0
    invoke-virtual {v5, p1, p2}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/4 p1, 0x3

    .line 130
    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    invoke-virtual {v5, p1}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->setValueVisibility(Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-ne p0, p3, :cond_4

    .line 157
    .line 158
    const/high16 p0, -0x40800000    # -1.0f

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    const/high16 p0, 0x3f800000    # 1.0f

    .line 162
    .line 163
    :goto_1
    invoke-virtual {v6, p0}, Landroid/view/View;->setScaleX(F)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_5
    move-object v5, p0

    .line 168
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    const-string p1, "Missing required view with ID: "

    .line 177
    .line 178
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a:La/vd7;

    .line 5
    .line 6
    iget-object v0, p0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v1, "%s %s"

    .line 20
    .line 21
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 29
    .line 30
    check-cast p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;

    .line 31
    .line 32
    const-string p1, "... "

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->setEllipsisValue(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOnClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
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
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->b:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 9
    .line 10
    new-instance v0, La/c0;

    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setValueVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
