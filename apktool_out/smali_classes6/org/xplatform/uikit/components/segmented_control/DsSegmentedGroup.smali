.class public final Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final synthetic o:I


# instance fields
.field public final a:I

.field public final b:Z

.field public c:I

.field public final d:I

.field public final e:Landroid/graphics/drawable/Drawable;

.field public final f:Landroid/graphics/Rect;

.field public final g:La/hgn;

.field public final h:La/kul0;

.field public i:I

.field public final j:La/lqm;

.field public final k:Ljava/util/ArrayList;

.field public l:Lkotlin/jvm/functions/Function1;

.field public m:Lkotlin/jvm/functions/Function1;

.field public n:La/ymx;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xc

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

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
    const p3, 0x7f040784

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {p0, p1, p2, p3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 15
    .line 16
    .line 17
    const/4 v3, -0x1

    .line 18
    iput v3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->a:I

    .line 19
    .line 20
    iput v3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c:I

    .line 21
    .line 22
    const v4, 0x7f1407b5

    .line 23
    .line 24
    .line 25
    iput v4, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->d:I

    .line 26
    .line 27
    new-instance v5, Landroid/graphics/Rect;

    .line 28
    .line 29
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v5, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f:Landroid/graphics/Rect;

    .line 33
    .line 34
    new-instance v5, La/hgn;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    iput v6, v5, La/hgn;->a:F

    .line 41
    .line 42
    iput-object v5, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->g:La/hgn;

    .line 43
    .line 44
    new-instance v6, La/lqm;

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    invoke-direct {v6, p0, v7}, La/lqm;-><init>(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;B)V

    .line 48
    .line 49
    .line 50
    iput-object v6, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->j:La/lqm;

    .line 51
    .line 52
    new-instance v6, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v6, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 58
    .line 59
    new-instance v6, La/aim;

    .line 60
    .line 61
    const/16 v8, 0xd

    .line 62
    .line 63
    invoke-direct {v6, v8}, La/aim;-><init>(B)V

    .line 64
    .line 65
    .line 66
    iput-object v6, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->m:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    sget-object v6, La/ivb0;->b:La/ymx;

    .line 69
    .line 70
    iput-object v6, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->n:La/ymx;

    .line 71
    .line 72
    sget-object v6, La/bqd0;->i0:[I

    .line 73
    .line 74
    invoke-virtual {p1, p2, v6, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/4 p2, 0x3

    .line 79
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_1

    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-object p2, v1

    .line 91
    :goto_0
    iput-object p2, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->e:Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    const/4 p3, 0x4

    .line 94
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-static {p1, p3}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-eqz p3, :cond_2

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    if-eqz p2, :cond_2

    .line 109
    .line 110
    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    iput p3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->d:I

    .line 118
    .line 119
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    iput p3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->a:I

    .line 124
    .line 125
    iget-boolean p3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->b:Z

    .line 126
    .line 127
    invoke-virtual {p1, v7, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    iput-boolean p3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->b:Z

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 134
    .line 135
    .line 136
    if-eqz p2, :cond_5

    .line 137
    .line 138
    new-instance p1, La/kul0;

    .line 139
    .line 140
    invoke-direct {p1, v5}, La/kul0;-><init>(La/hgn;)V

    .line 141
    .line 142
    .line 143
    new-instance p2, La/lul0;

    .line 144
    .line 145
    invoke-direct {p2}, La/lul0;-><init>()V

    .line 146
    .line 147
    .line 148
    const/high16 p3, 0x3f800000    # 1.0f

    .line 149
    .line 150
    invoke-virtual {p2, p3}, La/lul0;->a(F)V

    .line 151
    .line 152
    .line 153
    const/high16 p3, 0x43c80000    # 400.0f

    .line 154
    .line 155
    invoke-virtual {p2, p3}, La/lul0;->b(F)V

    .line 156
    .line 157
    .line 158
    iput-object p2, p1, La/kul0;->m:La/lul0;

    .line 159
    .line 160
    new-instance p2, La/mqm;

    .line 161
    .line 162
    invoke-direct {p2, p0}, La/mqm;-><init>(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;)V

    .line 163
    .line 164
    .line 165
    iget-boolean p3, p1, La/kul0;->f:Z

    .line 166
    .line 167
    if-nez p3, :cond_4

    .line 168
    .line 169
    iget-object p3, p1, La/kul0;->l:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_3

    .line 176
    .line 177
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_3
    iput-object p1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->h:La/kul0;

    .line 181
    .line 182
    return-void

    .line 183
    :cond_4
    const-string p0, "Error: Update listeners must be added beforethe animation."

    .line 184
    .line 185
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v1

    .line 189
    :cond_5
    return-void
.end method

.method public static a(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;La/vvh0;ZI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    and-int/lit8 p3, p3, 0x4

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->e(La/vvh0;Z)Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p0, p2, v0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->b(Landroid/view/View;ILa/vvh0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic c(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroid/view/View;II)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    const/4 p3, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, p3}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->b(Landroid/view/View;ILa/vvh0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final d(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;)Lkotlin/Unit;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    add-int/lit8 v3, v1, 0x1

    .line 24
    .line 25
    if-ltz v1, :cond_1

    .line 26
    .line 27
    check-cast v2, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 28
    .line 29
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    iget-object v2, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->m:Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_0
    move v1, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    throw p0

    .line 53
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0
.end method

.method public static f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->n:La/ymx;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->n:La/ymx;

    .line 10
    .line 11
    iput-object p1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->l:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    return-void
.end method

.method private final getSegmentedViews()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, La/ihu0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ske;->w:La/ske;

    .line 7
    .line 8
    invoke-static {v0, p0}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final addView(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    .line 14
    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroid/view/View;II)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    .line 13
    invoke-static {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroid/view/View;II)V

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p3, 0x4

    .line 15
    invoke-static {p0, p1, p2, p3}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroid/view/View;II)V

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-static {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroid/view/View;II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Landroid/view/View;ILa/vvh0;)V
    .locals 4

    .line 1
    instance-of v0, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_5

    .line 10
    .line 11
    iget-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-le p2, v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v1, p2

    .line 21
    :goto_1
    const/4 v2, 0x0

    .line 22
    if-gez v1, :cond_2

    .line 23
    .line 24
    move v1, v2

    .line 25
    :cond_2
    if-nez p3, :cond_3

    .line 26
    .line 27
    new-instance p3, La/vvh0;

    .line 28
    .line 29
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p3, v3}, La/vvh0;->a(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p3, La/vvh0;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 40
    .line 41
    iget-object v3, p3, La/vvh0;->a:Ljava/lang/CharSequence;

    .line 42
    .line 43
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    invoke-virtual {v0, v1, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 50
    .line 51
    const/4 v0, -0x2

    .line 52
    invoke-direct {p3, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 53
    .line 54
    .line 55
    const/high16 v0, 0x3f800000    # 1.0f

    .line 56
    .line 57
    iput v0, p3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 58
    .line 59
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->n:La/ymx;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object p2, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->p:La/ymx;

    .line 68
    .line 69
    iget-object p2, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->j:La/lqm;

    .line 70
    .line 71
    iput-object p2, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->n:Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    iget-object p3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->n:La/ymx;

    .line 74
    .line 75
    new-instance v0, La/lqm;

    .line 76
    .line 77
    invoke-direct {v0, p0, v2}, La/lqm;-><init>(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iput-object p3, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->p:La/ymx;

    .line 84
    .line 85
    iput-object v0, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->o:Lkotlin/jvm/functions/Function1;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2, p1}, La/lqm;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_4
    return-void

    .line 97
    :cond_5
    const-string p0, "Only DsSegmentItem instances can be added to DsSegmentedGroup"

    .line 98
    .line 99
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final e(La/vvh0;Z)Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 2
    .line 3
    new-instance v1, La/tje;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget p0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->d:I

    .line 10
    .line 11
    invoke-direct {v1, v2, p0}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-direct {v0, v1, p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p1, La/vvh0;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 19
    .line 20
    iget-object p0, p1, La/vvh0;->a:Ljava/lang/CharSequence;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {v0, p0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->k(ZZ)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object v0
.end method

.method public final g(Z)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v0, v1

    .line 36
    :goto_1
    check-cast v0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 37
    .line 38
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, La/pgi0;->j(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v4, 0x0

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    check-cast v1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v1, v4, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->j(ZZ)V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {v2, v4, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->j(ZZ)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_3
    const/4 v1, 0x1

    .line 85
    if-eq v2, v0, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move v4, v1

    .line 89
    :goto_3
    xor-int/2addr v1, v4

    .line 90
    invoke-virtual {v2, v1, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->j(ZZ)V

    .line 91
    .line 92
    .line 93
    :goto_4
    move-object v1, v2

    .line 94
    goto :goto_2

    .line 95
    :cond_5
    return-void
.end method

.method public final getSegments()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La/vvh0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSegmentsSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getSelectedPosition()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-ltz v0, :cond_1

    .line 21
    .line 22
    check-cast v1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    return v0

    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0

    .line 39
    :cond_2
    const/4 p0, -0x1

    .line 40
    return p0
.end method

.method public final h(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Z)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_3

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    add-int/lit8 v4, v2, 0x1

    .line 22
    .line 23
    if-ltz v2, :cond_2

    .line 24
    .line 25
    check-cast v3, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 26
    .line 27
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v1, p2}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->k(ZZ)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v3, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->l:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    throw p0

    .line 55
    :cond_3
    return-void
.end method

.method public final i(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Z)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    float-to-int v0, v0

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->i:I

    .line 23
    .line 24
    iget-object v1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f:Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object p0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->h:La/kul0;

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    int-to-float p1, v0

    .line 40
    invoke-virtual {p0, p1}, La/kul0;->a(F)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    float-to-int p2, p2

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    float-to-int v3, v3

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    add-int/2addr v4, v3

    .line 67
    invoke-virtual {v1, v0, p2, v2, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 68
    .line 69
    .line 70
    iget-object p2, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->e:Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object p0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->g:La/hgn;

    .line 78
    .line 79
    int-to-float p2, v0

    .line 80
    iput p2, p0, La/hgn;->a:F

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    new-instance v0, La/nqm;

    .line 87
    .line 88
    invoke-direct {v0, p1, p0, p2}, La/nqm;-><init>(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->l:Lkotlin/jvm/functions/Function1;

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->e:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->a:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-le v1, v0, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->b:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 5
    .line 6
    iget-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->n:La/ymx;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object v0, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->p:La/ymx;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p1, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->n:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    move-object v4, v3

    .line 33
    check-cast v4, La/vvh0;

    .line 34
    .line 35
    iget-object v4, v4, La/vvh0;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 36
    .line 37
    if-ne v4, p1, :cond_0

    .line 38
    .line 39
    move-object v0, v3

    .line 40
    :cond_1
    check-cast v0, La/vvh0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-ltz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    add-int/lit8 p1, p1, -0x1

    .line 58
    .line 59
    if-gez p1, :cond_2

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    :cond_2
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-void
.end method

.method public final setOnSegmentClickedAndSelectedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->m:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setSelectedPosition(I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentedViews()Lkotlin/sequences/Sequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v4, v2, 0x1

    .line 28
    .line 29
    if-ne p1, v2, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    move v2, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_1
    const/4 v3, 0x0

    .line 35
    :goto_2
    check-cast v3, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 36
    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    iget v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c:I

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-gez v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v3, v2, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->k(ZZ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->h(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->i(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->g(Z)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;->setSelected(Z)V

    .line 57
    .line 58
    .line 59
    iput p1, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->c:I

    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method public final setSelectionPositionWithAnimation(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, La/vvh0;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, La/vvh0;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->h(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->i(Lorg/xplatform/uikit/components/segmented_control/DsSegmentItem;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final setSelectorColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
