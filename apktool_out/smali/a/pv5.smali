.class public abstract La/pv5;
.super Landroidx/constraintlayout/motion/widget/MotionLayout;
.source "SourceFile"

# interfaces
.implements La/ub3;


# static fields
.field public static final synthetic c2:[La/iiy;


# instance fields
.field public Z1:Ljava/lang/Boolean;

.field public a2:Lkotlin/jvm/functions/Function1;

.field public final b2:La/ov5;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/pv5;

    .line 4
    .line 5
    const-string v2, "currentProgressState"

    .line 6
    .line 7
    const-string v3, "getCurrentProgressState()F"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/pv5;->c2:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s:Landroid/view/animation/Interpolator;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t:F

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u:I

    .line 16
    .line 17
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 18
    .line 19
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w:I

    .line 20
    .line 21
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x:I

    .line 22
    .line 23
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y:I

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z:Z

    .line 27
    .line 28
    new-instance v2, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B:J

    .line 38
    .line 39
    const/high16 v2, 0x3f800000    # 1.0f

    .line 40
    .line 41
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:F

    .line 42
    .line 43
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:F

    .line 44
    .line 45
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 46
    .line 47
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:F

    .line 48
    .line 49
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 50
    .line 51
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 52
    .line 53
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Z

    .line 54
    .line 55
    new-instance v2, La/tqm0;

    .line 56
    .line 57
    invoke-direct {v2}, La/tqm0;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:La/tqm0;

    .line 61
    .line 62
    new-instance v2, La/vs40;

    .line 63
    .line 64
    invoke-direct {v2, p0}, La/vs40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:La/vs40;

    .line 68
    .line 69
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u1:Z

    .line 70
    .line 71
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z1:Z

    .line 72
    .line 73
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A1:I

    .line 74
    .line 75
    const-wide/16 v2, -0x1

    .line 76
    .line 77
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B1:J

    .line 78
    .line 79
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C1:F

    .line 80
    .line 81
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 82
    .line 83
    new-instance v1, La/vjy;

    .line 84
    .line 85
    invoke-direct {v1, v0}, La/vjy;-><init>(B)V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L1:La/vjy;

    .line 89
    .line 90
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M1:Z

    .line 91
    .line 92
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O1:La/qaq0;

    .line 93
    .line 94
    new-instance v1, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v1, Landroid/graphics/Rect;

    .line 100
    .line 101
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P1:Landroid/graphics/Rect;

    .line 105
    .line 106
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q1:Z

    .line 107
    .line 108
    sget-object v1, La/zs40;->a:La/zs40;

    .line 109
    .line 110
    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R1:La/zs40;

    .line 111
    .line 112
    new-instance v1, La/ws40;

    .line 113
    .line 114
    invoke-direct {v1, p0}, La/ws40;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 115
    .line 116
    .line 117
    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 118
    .line 119
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U1:Z

    .line 120
    .line 121
    new-instance v0, Landroid/graphics/RectF;

    .line 122
    .line 123
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V1:Landroid/graphics/RectF;

    .line 127
    .line 128
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W1:Landroid/view/View;

    .line 129
    .line 130
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X1:Landroid/graphics/Matrix;

    .line 131
    .line 132
    new-instance p1, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->z(Landroid/util/AttributeSet;)V

    .line 138
    .line 139
    .line 140
    new-instance p1, La/ov5;

    .line 141
    .line 142
    move-object p2, p0

    .line 143
    check-cast p2, Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout;

    .line 144
    .line 145
    invoke-direct {p1, p2}, La/ov5;-><init>(Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout;)V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, La/pv5;->b2:La/ov5;

    .line 149
    .line 150
    return-void
.end method

.method private final getCurrentProgressState()F
    .locals 2

    .line 1
    sget-object v0, La/pv5;->c2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, La/pv5;->b2:La/ov5;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/dw5;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method private final setCurrentProgressState(F)V
    .locals 2

    .line 1
    sget-object v0, La/pv5;->c2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, La/pv5;->b2:La/ov5;

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, La/dw5;->h(La/iiy;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 0

    .line 1
    neg-int p2, p2

    .line 2
    int-to-float p2, p2

    .line 3
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    int-to-float p1, p1

    .line 8
    div-float/2addr p2, p1

    .line 9
    invoke-direct {p0, p2}, La/pv5;->setCurrentProgressState(F)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 p2, 0x0

    .line 20
    cmpg-float p1, p1, p2

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, La/pv5;->Z1:Ljava/lang/Boolean;

    .line 25
    .line 26
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    iput-object p2, p0, La/pv5;->Z1:Ljava/lang/Boolean;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/high16 p2, 0x3f800000    # 1.0f

    .line 42
    .line 43
    cmpg-float p1, p1, p2

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, La/pv5;->Z1:Ljava/lang/Boolean;

    .line 48
    .line 49
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    iput-object p2, p0, La/pv5;->Z1:Ljava/lang/Boolean;

    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final getAppBarMotionLayoutCallback()La/bc3;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getOnProgressChangeCallback()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, La/pv5;->a2:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/google/android/material/appbar/AppBarLayout;->f(La/ub3;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final setAppBarMotionLayoutCallback(La/bc3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setOnProgressChangeCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, La/pv5;->a2:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-void
.end method
