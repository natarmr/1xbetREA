.class public final Lorg/xplatform/uikit/components/chips/Chip;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/xoe;


# static fields
.field public static j:I = -0x1

.field public static final k:Ljava/util/List;


# instance fields
.field public final a:La/tbc;

.field public final b:La/yoe;

.field public c:Lkotlin/jvm/functions/Function2;

.field public d:Lkotlin/jvm/functions/Function2;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:Z

.field public final h:La/ymx;

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const v0, 0x7f040b5b

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const v0, 0x7f040b33

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const v0, 0x7f040b5e

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const v0, 0x7f040b3b

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const v0, 0x7f040b4c

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const v0, 0x7f040b68

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const v0, 0x7f040b4b

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const v0, 0x7f040b52

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const v0, 0x7f040b40

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    filled-new-array/range {v1 .. v9}, [Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lorg/xplatform/uikit/components/chips/Chip;->k:Ljava/util/List;

    .line 73
    .line 74
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 186
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit/components/chips/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f0d0086

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    const v0, 0x7f0a004d

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v4, v1

    .line 25
    check-cast v4, Landroid/widget/ImageView;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const v0, 0x7f0a02f1

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    move-object v5, v2

    .line 38
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    const v0, 0x7f0a0730

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    move-object v6, v2

    .line 50
    check-cast v6, Landroid/widget/ImageView;

    .line 51
    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    const v0, 0x7f0a0742

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v7, v2

    .line 62
    check-cast v7, Landroidx/cardview/widget/CardView;

    .line 63
    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    const v0, 0x7f0a0934

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    move-object v8, v2

    .line 74
    check-cast v8, Landroidx/cardview/widget/CardView;

    .line 75
    .line 76
    if-eqz v8, :cond_0

    .line 77
    .line 78
    const v0, 0x7f0a0d4e

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    move-object v9, v2

    .line 86
    check-cast v9, Landroid/widget/TextView;

    .line 87
    .line 88
    if-eqz v9, :cond_0

    .line 89
    .line 90
    const v0, 0x7f0a0f1d

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    move-object v10, v2

    .line 98
    check-cast v10, Landroid/widget/TextView;

    .line 99
    .line 100
    if-eqz v10, :cond_0

    .line 101
    .line 102
    const v0, 0x7f0a0f62

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v11, v2

    .line 110
    check-cast v11, Landroid/widget/LinearLayout;

    .line 111
    .line 112
    if-eqz v11, :cond_0

    .line 113
    .line 114
    new-instance v2, La/tbc;

    .line 115
    .line 116
    move-object v3, p0

    .line 117
    invoke-direct/range {v2 .. v11}, La/tbc;-><init>(Lorg/xplatform/uikit/components/chips/Chip;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    .line 118
    .line 119
    .line 120
    iput-object v2, v3, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 121
    .line 122
    new-instance p0, La/yoe;

    .line 123
    .line 124
    invoke-direct {p0, v3, v1}, La/yoe;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 125
    .line 126
    .line 127
    iput-object p0, v3, Lorg/xplatform/uikit/components/chips/Chip;->b:La/yoe;

    .line 128
    .line 129
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 130
    .line 131
    iput-object v0, v3, Lorg/xplatform/uikit/components/chips/Chip;->h:La/ymx;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-virtual {p0, p2, v0}, La/yoe;->b(Landroid/util/AttributeSet;I)V

    .line 135
    .line 136
    .line 137
    const v1, 0x7f040ae1

    .line 138
    .line 139
    .line 140
    invoke-static {v1, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {p0, v1}, La/yoe;->f(I)V

    .line 145
    .line 146
    .line 147
    sget-object p0, La/bqd0;->u:[I

    .line 148
    .line 149
    invoke-virtual {p1, p2, p0, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {v3, p0}, Lorg/xplatform/uikit/components/chips/Chip;->a(Landroid/content/res/TypedArray;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {v5, p0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_0
    move-object v3, p0

    .line 168
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

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

.method private final getRandomColor()I
    .locals 2

    .line 1
    :cond_0
    sget-object p0, La/f1e0;->a:La/e1e0;

    .line 2
    .line 3
    sget-object v0, Lorg/xplatform/uikit/components/chips/Chip;->k:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object p0, La/f1e0;->b:La/k4;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, La/k4;->f(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    sget v1, Lorg/xplatform/uikit/components/chips/Chip;->j:I

    .line 19
    .line 20
    if-eq p0, v1, :cond_0

    .line 21
    .line 22
    sput p0, Lorg/xplatform/uikit/components/chips/Chip;->j:I

    .line 23
    .line 24
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method


# virtual methods
.method public final a(Landroid/content/res/TypedArray;)V
    .locals 7

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v2, 0x13

    .line 9
    .line 10
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v3}, Landroid/text/BidiFormatter;->isRtlContext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-object v4, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 23
    .line 24
    iget-object v5, v4, La/tbc;->f:Landroid/view/View;

    .line 25
    .line 26
    check-cast v5, Lorg/xplatform/uikit/components/chips/Chip;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    move v6, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v6, v0

    .line 33
    :goto_0
    if-eqz v3, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v2

    .line 37
    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v5, v6, v2, v0, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    const/16 v0, 0x3c

    .line 49
    .line 50
    iget-boolean v2, p0, Lorg/xplatform/uikit/components/chips/Chip;->i:Z

    .line 51
    .line 52
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setUnchangeableOnClick(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v4, La/tbc;->b:Landroid/view/View;

    .line 60
    .line 61
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 62
    .line 63
    const/16 v2, 0xb

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/16 v3, 0xc

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    invoke-virtual {p0, p1, v3, v2, v4}, Lorg/xplatform/uikit/components/chips/Chip;->b(Landroid/content/res/TypedArray;ILjava/lang/Integer;Z)Landroid/content/res/ColorStateList;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 77
    .line 78
    .line 79
    const/16 v0, 0x15

    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const/16 v2, 0x18

    .line 86
    .line 87
    invoke-virtual {p0, p1, v2, v0, v1}, Lorg/xplatform/uikit/components/chips/Chip;->b(Landroid/content/res/TypedArray;ILjava/lang/Integer;Z)Landroid/content/res/ColorStateList;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 92
    .line 93
    .line 94
    const/16 v0, 0x14

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    const/16 v0, 0x2f

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const/16 v2, 0x2e

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v0, :cond_2

    .line 116
    .line 117
    if-eqz v2, :cond_5

    .line 118
    .line 119
    :cond_2
    if-nez v0, :cond_3

    .line 120
    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    :cond_3
    iput-boolean v1, p0, Lorg/xplatform/uikit/components/chips/Chip;->g:Z

    .line 124
    .line 125
    :cond_4
    iget-object v3, p0, Lorg/xplatform/uikit/components/chips/Chip;->e:Landroid/content/res/ColorStateList;

    .line 126
    .line 127
    invoke-virtual {p0, v0, v2, v3}, Lorg/xplatform/uikit/components/chips/Chip;->c(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    const/16 v0, 0x9

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const/16 v2, 0x8

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-nez v0, :cond_6

    .line 143
    .line 144
    if-eqz v2, :cond_9

    .line 145
    .line 146
    :cond_6
    if-nez v0, :cond_8

    .line 147
    .line 148
    if-eqz v2, :cond_7

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    move v4, v1

    .line 152
    :cond_8
    :goto_2
    iput-boolean v4, p0, Lorg/xplatform/uikit/components/chips/Chip;->g:Z

    .line 153
    .line 154
    iget-object v3, p0, Lorg/xplatform/uikit/components/chips/Chip;->f:Landroid/content/res/ColorStateList;

    .line 155
    .line 156
    invoke-virtual {p0, v0, v2, v3}, Lorg/xplatform/uikit/components/chips/Chip;->c(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    const/16 v0, 0xa

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setActionTint(Landroid/content/res/ColorStateList;)V

    .line 166
    .line 167
    .line 168
    const/16 v0, 0x2d

    .line 169
    .line 170
    const/4 v2, 0x0

    .line 171
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setLeftIconRadius(F)V

    .line 176
    .line 177
    .line 178
    const/16 v0, 0x30

    .line 179
    .line 180
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setRightIconRadius(F)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const/4 v2, 0x5

    .line 195
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {p1, v0, v2}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    const/16 v0, 0x38

    .line 207
    .line 208
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const/4 v2, 0x2

    .line 213
    invoke-virtual {p0, p1, v2, v0, v1}, Lorg/xplatform/uikit/components/chips/Chip;->b(Landroid/content/res/TypedArray;ILjava/lang/Integer;Z)Landroid/content/res/ColorStateList;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    const/16 v2, 0x32

    .line 228
    .line 229
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-static {p1, v0, v2}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setSecondaryText(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    const/16 v0, 0x33

    .line 241
    .line 242
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const/16 v2, 0x34

    .line 247
    .line 248
    invoke-virtual {p0, p1, v2, v0, v1}, Lorg/xplatform/uikit/components/chips/Chip;->b(Landroid/content/res/TypedArray;ILjava/lang/Integer;Z)Landroid/content/res/ColorStateList;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setSecondaryTextColor(Landroid/content/res/ColorStateList;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/chips/Chip;->isSelected()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/chips/Chip;->setSelectedInternal(Z)V

    .line 260
    .line 261
    .line 262
    const/16 v0, 0x3b

    .line 263
    .line 264
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/chips/Chip;->setSelectedForUnchangeable(Z)V

    .line 269
    .line 270
    .line 271
    return-void
.end method

.method public final b(Landroid/content/res/TypedArray;ILjava/lang/Integer;Z)Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p1, p2}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p1, p3}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    :cond_0
    new-instance p3, Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    const p4, 0x10100a1

    .line 22
    .line 23
    .line 24
    filled-new-array {p4}, [I

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    const/4 v0, 0x0

    .line 29
    new-array v0, v0, [I

    .line 30
    .line 31
    filled-new-array {p4, v0}, [[I

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lorg/xplatform/uikit/components/chips/Chip;->getRandomColor()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    filled-new-array {p0, p1}, [I

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {p3, p4, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 66
    .line 67
    .line 68
    return-object p3

    .line 69
    :cond_2
    if-eqz p2, :cond_3

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_3
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public final c(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object v1, v0, La/tbc;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    new-instance v3, Landroid/graphics/drawable/StateListDrawable;

    .line 13
    .line 14
    invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 15
    .line 16
    .line 17
    const v4, 0x10100a1

    .line 18
    .line 19
    .line 20
    filled-new-array {v4}, [I

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3, v4, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    new-array v4, v2, [I

    .line 28
    .line 29
    invoke-virtual {v3, v4, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v3, Landroid/graphics/drawable/StateListDrawable;

    .line 36
    .line 37
    invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 38
    .line 39
    .line 40
    new-array v4, v2, [I

    .line 41
    .line 42
    invoke-virtual {v3, v4, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v3, 0x0

    .line 47
    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 51
    .line 52
    .line 53
    const/16 p3, 0x8

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v3, p3

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    move v3, v2

    .line 63
    :goto_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    new-instance v3, La/q10;

    .line 67
    .line 68
    invoke-direct {v3, p0, p3}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, v0, La/tbc;->h:Landroid/view/View;

    .line 75
    .line 76
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    if-eqz p2, :cond_5

    .line 81
    .line 82
    :cond_4
    const/4 v2, 0x1

    .line 83
    :cond_5
    invoke-virtual {p0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 6
    .line 7
    iget-object p0, p0, La/tbc;->c:Landroid/view/View;

    .line 8
    .line 9
    check-cast p0, Landroid/widget/ImageView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-super {p0}, Landroid/view/View;->isSelected()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final performClick()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->h:La/ymx;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    sget-wide v3, La/ivb0;->c:J

    .line 16
    .line 17
    sub-long/2addr v1, v3

    .line 18
    iget-short v0, v0, La/ymx;->a:S

    .line 19
    .line 20
    int-to-long v3, v0

    .line 21
    cmp-long v0, v1, v3

    .line 22
    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public final setActionTint(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/Chip;->f:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 4
    .line 5
    iget-object v0, v0, La/tbc;->c:Landroid/view/View;

    .line 6
    .line 7
    check-cast v0, Landroid/widget/ImageView;

    .line 8
    .line 9
    iget-boolean v1, p0, Lorg/xplatform/uikit/components/chips/Chip;->g:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lorg/xplatform/uikit/components/chips/Chip;->e:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setCount(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->b:La/yoe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/yoe;->c(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object v0, p0, La/tbc;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/tbc;->g:Landroid/view/View;

    .line 11
    .line 12
    check-cast v0, Landroid/widget/ImageView;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    move v3, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v1

    .line 22
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/tbc;->i:Landroid/view/View;

    .line 26
    .line 27
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    move v1, v2

    .line 32
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/Chip;->e:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 4
    .line 5
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 6
    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setLeftIconRadius(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->i:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnSelectInternalListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lorg/xplatform/uikit/components/chips/Chip;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/Chip;->d:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnSelectListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lorg/xplatform/uikit/components/chips/Chip;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/chips/Chip;->c:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-void
.end method

.method public final setRightIconRadius(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->h:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/cardview/widget/CardView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setSecondaryText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object v0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    move p1, v1

    .line 25
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, La/tbc;->j:Landroid/view/View;

    .line 29
    .line 30
    check-cast p1, Landroid/widget/LinearLayout;

    .line 31
    .line 32
    iget-object p0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_3

    .line 46
    .line 47
    :goto_2
    move v1, v2

    .line 48
    :cond_3
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final setSecondaryTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object v0, v0, La/tbc;->d:Landroid/widget/TextView;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0x7f040780

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setSelected(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/chips/Chip;->setSelectedInternal(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->c:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, p0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->d:Lkotlin/jvm/functions/Function2;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final setSelectedForUnchangeable(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setSelectedInternal(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->g:Z

    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, v1, La/tbc;->c:Landroid/view/View;

    .line 12
    .line 13
    check-cast p0, Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p0, v1, La/tbc;->b:Landroid/view/View;

    .line 23
    .line 24
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p0, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final setStyle(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/bqd0;->u:[I

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/chips/Chip;->a(Landroid/content/res/TypedArray;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object v0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    move p1, v1

    .line 25
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, La/tbc;->j:Landroid/view/View;

    .line 29
    .line 30
    check-cast p1, Landroid/widget/LinearLayout;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    iget-object p0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_3

    .line 46
    .line 47
    :goto_2
    move v1, v2

    .line 48
    :cond_3
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/chips/Chip;->a:La/tbc;

    .line 2
    .line 3
    iget-object v0, v0, La/tbc;->e:Landroid/widget/TextView;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0x1010098

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setUnchangeableOnClick(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/chips/Chip;->i:Z

    .line 2
    .line 3
    return-void
.end method
