.class public final Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;
.super Lorg/xplatform/uikit/components/views/LoadableImageView;
.source "SourceFile"

# interfaces
.implements La/xoe;


# static fields
.field public static final synthetic s:I


# instance fields
.field public final j:La/yoe;

.field public final k:La/if5;

.field public final l:La/if5;

.field public final m:La/a8z;

.field public final n:La/a8z;

.field public o:La/iwk;

.field public p:La/iwk;

.field public final q:Landroid/content/res/ColorStateList;

.field public r:La/phf0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

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
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/yoe;

    .line 14
    .line 15
    new-instance v2, La/hvl;

    .line 16
    .line 17
    invoke-direct {v2, p0, p3}, La/hvl;-><init>(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;B)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p0, v2}, La/yoe;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->j:La/yoe;

    .line 24
    .line 25
    new-instance v2, La/if5;

    .line 26
    .line 27
    new-instance v3, La/hvl;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v3, p0, v4}, La/hvl;-><init>(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;B)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p0, v3}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 37
    .line 38
    new-instance v3, La/if5;

    .line 39
    .line 40
    new-instance v4, La/hvl;

    .line 41
    .line 42
    invoke-direct {v4, p0, v0}, La/hvl;-><init>(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;B)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, p0, v4}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->l:La/if5;

    .line 49
    .line 50
    sget-object v4, La/wez;->b:La/wez;

    .line 51
    .line 52
    new-instance v5, La/yg3;

    .line 53
    .line 54
    const/16 v6, 0x1b

    .line 55
    .line 56
    invoke-direct {v5, p1, v6}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iput-object v5, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->m:La/a8z;

    .line 64
    .line 65
    new-instance v5, La/yg3;

    .line 66
    .line 67
    const/16 v6, 0x1c

    .line 68
    .line 69
    invoke-direct {v5, p1, v6}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iput-object v4, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->n:La/a8z;

    .line 77
    .line 78
    invoke-virtual {v1, p2, p3}, La/yoe;->b(Landroid/util/AttributeSet;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p2, p3}, La/if5;->f(Landroid/util/AttributeSet;I)V

    .line 82
    .line 83
    .line 84
    sget-object v1, La/bqd0;->I:[I

    .line 85
    .line 86
    invoke-virtual {p1, p2, v1, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "DsCellLeftIcon"

    .line 91
    .line 92
    invoke-virtual {p0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const v2, 0x800055

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    iput v2, v3, La/if5;->d:I

    .line 103
    .line 104
    const/4 v2, 0x3

    .line 105
    const/4 v4, 0x6

    .line 106
    invoke-static {v1, v2, v4}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    iput v2, v3, La/if5;->e:I

    .line 111
    .line 112
    const/4 v2, 0x4

    .line 113
    const/4 v4, 0x7

    .line 114
    invoke-static {v1, v2, v4}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iput v2, v3, La/if5;->f:I

    .line 119
    .line 120
    const/4 v2, 0x5

    .line 121
    invoke-virtual {v1, v2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconStrokeColor(Ljava/lang/Integer;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 133
    .line 134
    .line 135
    sget-object v1, La/mqd0;->f:[I

    .line 136
    .line 137
    invoke-virtual {p1, p2, v1, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-static {v0, p1, p2}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iput-object p1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->q:Landroid/content/res/ColorStateList;

    .line 146
    .line 147
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method private final getDefaultBackground()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->m:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDefaultBackgroundTint()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->n:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final n(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    sub-int/2addr v1, v2

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v1, v2

    .line 29
    new-instance v2, La/k1x;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v3}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, v2, La/k1x;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v2, v0, v1}, La/k1x;->d(II)V

    .line 48
    .line 49
    .line 50
    new-instance v3, La/kki;

    .line 51
    .line 52
    const/16 v9, 0x10

    .line 53
    .line 54
    move-object v4, p0

    .line 55
    move-object v5, p3

    .line 56
    move-object v6, p4

    .line 57
    move-object v7, p5

    .line 58
    move-object/from16 v8, p6

    .line 59
    .line 60
    invoke-direct/range {v3 .. v9}, La/kki;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    iput-object v3, v2, La/k1x;->e:La/n1x;

    .line 64
    .line 65
    invoke-virtual {v2}, La/k1x;->a()La/o1x;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 74
    .line 75
    return-void
.end method

.method public static final p(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    sub-int/2addr v1, v2

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v1, v2

    .line 29
    new-instance v2, La/k1x;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {v2, v3}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, v2, La/k1x;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v2, p3}, La/t1x;->f(La/k1x;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0, v1}, La/k1x;->d(II)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/sbx0;

    .line 54
    .line 55
    const/4 v9, 0x6

    .line 56
    move-object v5, p0

    .line 57
    move v6, p3

    .line 58
    move-object v7, p4

    .line 59
    move-object v8, p5

    .line 60
    invoke-direct/range {v4 .. v9}, La/sbx0;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    iput-object v4, v2, La/k1x;->e:La/n1x;

    .line 64
    .line 65
    invoke-virtual {v2}, La/k1x;->a()La/o1x;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iput-object p0, v5, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v0, La/k1x;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/k1x;->c:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p1, La/fjc;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, v1}, La/fjc;-><init>(B)V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    new-array v3, v3, [La/lls0;

    .line 42
    .line 43
    aput-object p1, v3, v1

    .line 44
    .line 45
    sget-object p1, La/q1x;->a:La/kuo;

    .line 46
    .line 47
    invoke-static {v3}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v0, p1}, La/q1x;->b(La/k1x;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, La/pmi;

    .line 55
    .line 56
    const/16 v8, 0xc

    .line 57
    .line 58
    move-object v4, p0

    .line 59
    move-object v5, p4

    .line 60
    move-object v6, p5

    .line 61
    move-object v7, p6

    .line 62
    invoke-direct/range {v3 .. v8}, La/pmi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v0, La/k1x;->e:La/n1x;

    .line 66
    .line 67
    invoke-virtual {v0}, La/k1x;->a()La/o1x;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v2, p1}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o:La/iwk;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move-object v1, p0

    .line 91
    move-object v3, p2

    .line 92
    move-object v7, p3

    .line 93
    move-object v4, p4

    .line 94
    move-object v5, p5

    .line 95
    move-object v6, p6

    .line 96
    invoke-static/range {v1 .. v7}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->n(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-nez p1, :cond_2

    .line 111
    .line 112
    move-object v1, p0

    .line 113
    move-object v3, p2

    .line 114
    move-object v7, p3

    .line 115
    move-object v4, p4

    .line 116
    move-object v5, p5

    .line 117
    move-object v6, p6

    .line 118
    invoke-static/range {v1 .. v7}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->n(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    new-instance v1, La/ivl;

    .line 123
    .line 124
    move-object v4, p2

    .line 125
    move-object v8, p3

    .line 126
    move-object v5, p4

    .line 127
    move-object v6, p5

    .line 128
    move-object v7, p6

    .line 129
    move-object v3, v2

    .line 130
    move-object v2, p0

    .line 131
    invoke-direct/range {v1 .. v8}, La/ivl;-><init>(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 132
    .line 133
    .line 134
    move-object p1, v1

    .line 135
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    :cond_0
    move-object v1, p0

    .line 29
    move v4, p1

    .line 30
    move-object v6, p2

    .line 31
    move-object v5, p3

    .line 32
    move-object v3, p4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, p0

    .line 35
    move v4, p1

    .line 36
    move-object v6, p2

    .line 37
    move-object v5, p3

    .line 38
    move-object v3, p4

    .line 39
    invoke-static/range {v1 .. v6}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    invoke-static/range {v1 .. v6}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    move-object v7, v6

    .line 60
    move-object v6, v5

    .line 61
    move v5, v4

    .line 62
    move-object v4, v3

    .line 63
    move-object v3, v2

    .line 64
    move-object v2, v1

    .line 65
    new-instance v1, La/jvl;

    .line 66
    .line 67
    invoke-direct/range {v1 .. v7}, La/jvl;-><init>(Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;La/gbe0;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 68
    .line 69
    .line 70
    move-object p0, v1

    .line 71
    move-object v1, v2

    .line 72
    invoke-virtual {v1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->r:La/phf0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/phf0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/graphics/Path;

    .line 17
    .line 18
    iget-object p0, p0, La/phf0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->r:La/phf0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, La/phf0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p2, p0, La/phf0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    div-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    int-to-float v0, v0

    .line 27
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    div-int/lit8 p2, p2, 0x2

    .line 32
    .line 33
    int-to-float p2, p2

    .line 34
    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sub-float/2addr v1, p1

    .line 39
    iget-object p0, p0, La/phf0;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 44
    .line 45
    .line 46
    sget-object p1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 47
    .line 48
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public final q(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->getDefaultBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p0, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final setBackgroundDrawableRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 17
    .line 18
    invoke-virtual {p0}, La/if5;->k()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, La/w23;

    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    invoke-direct {p1, p0, v0}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setBackgroundWithDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBadgeBackgroundTint(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/if5;->j(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBadgeVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 2
    .line 3
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 4
    .line 5
    if-eqz p0, :cond_1

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
    :cond_1
    return-void
.end method

.method public final setBottomIcon(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBottomIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBottomIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->l:La/if5;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, La/vf5;->j:La/vf5;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, La/if5;->a(La/vf5;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void

    .line 22
    :cond_2
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setCount(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->j:La/yoe;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/yoe;->c(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->l:La/if5;

    .line 7
    .line 8
    iget-object p1, p1, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Lorg/xplatform/uikit/components/badges/DsBadge;->d:La/k14;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, La/k14;->c(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 22
    .line 23
    iget-object v0, v0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/badges/DsBadge;->setEnabled(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->r:La/phf0;

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    iget-object p0, p0, La/phf0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Landroid/graphics/Paint;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    const/16 p1, 0xff

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/16 p1, 0x7f

    .line 44
    .line 45
    :goto_1
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public final setIconBackgroundTint(I)V
    .locals 1

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
    invoke-static {p1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p0, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setIconResource(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setIconStrokeColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, La/phf0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p0, v0, La/phf0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v1, Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, La/phf0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v1, Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const v2, 0x7f070633

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 52
    .line 53
    .line 54
    iput-object v1, v0, La/phf0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v0, 0x0

    .line 58
    :goto_0
    iput-object v0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->r:La/phf0;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final setIconTint(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
