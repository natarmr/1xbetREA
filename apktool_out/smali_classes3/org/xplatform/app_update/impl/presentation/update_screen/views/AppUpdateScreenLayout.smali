.class public final Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;
    }
.end annotation


# static fields
.field public static final synthetic A:I


# instance fields
.field public final q:La/jk3;

.field public r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;

.field public s:La/hbk0;

.field public t:La/ok3;

.field public u:I

.field public v:Z

.field public w:Z

.field public final x:La/a8z;

.field public y:Lkotlin/jvm/functions/Function0;

.field public final z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const p2, 0x7f0d0039

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p1, 0x7f0a00f3

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    move-object v3, p2

    .line 32
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const p1, 0x7f0a0130

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    move-object v4, p2

    .line 44
    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    const p1, 0x7f0a01a6

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    move-object v5, p2

    .line 56
    check-cast v5, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    const p1, 0x7f0a0472

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    move-object v6, p2

    .line 68
    check-cast v6, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 69
    .line 70
    if-eqz v6, :cond_1

    .line 71
    .line 72
    new-instance v1, La/jk3;

    .line 73
    .line 74
    move-object v2, p0

    .line 75
    invoke-direct/range {v1 .. v6}, La/jk3;-><init>(Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/constraintlayout/widget/Barrier;Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;)V

    .line 76
    .line 77
    .line 78
    iput-object v1, v2, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 79
    .line 80
    const/4 p0, -0x1

    .line 81
    iput p0, v2, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u:I

    .line 82
    .line 83
    new-instance p0, La/a13;

    .line 84
    .line 85
    const/16 p1, 0xb

    .line 86
    .line 87
    invoke-direct {p0, v2, p1}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    sget-object p1, La/wez;->b:La/wez;

    .line 91
    .line 92
    invoke-static {p1, p0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iput-object p0, v2, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->x:La/a8z;

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const p1, 0x7f07012f

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    iput p0, v2, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->z:F

    .line 110
    .line 111
    new-instance p0, La/b33;

    .line 112
    .line 113
    const/4 p1, 0x5

    .line 114
    invoke-direct {p0, v2, p1}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v3, p0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v5, p3}, La/knm0;->h(Landroid/view/View;Z)V

    .line 121
    .line 122
    .line 123
    invoke-static {v6, p3}, La/knm0;->h(Landroid/view/View;Z)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_1
    move-object v2, p0

    .line 128
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string p1, "Missing required view with ID: "

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0
.end method

.method private final getSmartBackgroundInflater()La/abk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->x:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/abk0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setDownloadViewVisibility(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    if-ne v0, p1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    .line 21
    .line 22
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const/16 v1, 0x8

    .line 28
    .line 29
    :goto_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getBottomViewHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->w:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->w:Z

    .line 12
    .line 13
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-boolean v2, v1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->c:Z

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iput-boolean v0, v1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->c:Z

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v:Z

    .line 5
    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    iget-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;

    .line 9
    .line 10
    if-nez p1, :cond_2

    .line 11
    .line 12
    const p1, 0x7f0a0482

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;

    .line 20
    .line 21
    iput-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;

    .line 22
    .line 23
    iget-boolean p2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v:Z

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    iget-boolean p2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->w:Z

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p2, 0x1

    .line 33
    iput-boolean p2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->w:Z

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-boolean p0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->c:Z

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iput-boolean p2, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->c:Z

    .line 47
    .line 48
    invoke-virtual {p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->a()V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;

    .line 6
    .line 7
    iget v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;->b:I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setProgress(I)V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;->c:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v:Z

    .line 15
    .line 16
    iget-object p1, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;->a:Landroid/os/Parcelable;

    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u:I

    .line 8
    .line 9
    iget-boolean p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v:Z

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout$SavedState;-><init>(Landroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final setBackBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V
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
    iput-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->y:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public final setProgress(I)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u:I

    .line 2
    .line 3
    if-le v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u:I

    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 9
    .line 10
    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->v(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setUpdateBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V
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
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 5
    .line 6
    iget-object p0, p0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setUpdateBtnEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnEnabled(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setWhatsNewBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V
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
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 5
    .line 6
    iget-object p0, p0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnClickedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final u(Ljava/util/List;La/pn3;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->setContainerLayoutParams(La/pn3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/dropdowncards/b;->setContent(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    instance-of p1, p1, La/lk3;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->z:F

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v:Z

    .line 37
    .line 38
    return-void
.end method

.method public final v(Z)V
    .locals 5

    .line 1
    const v0, 0x7f0a019e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, -0x1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/a3e;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const v4, 0x7f070683

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v0, v2, v3}, La/a3e;-><init>(II)V

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    iput v3, v0, La/a3e;->i:I

    .line 45
    .line 46
    iput v3, v0, La/a3e;->t:I

    .line 47
    .line 48
    iput v3, v0, La/a3e;->v:I

    .line 49
    .line 50
    iput v3, v0, La/a3e;->l:I

    .line 51
    .line 52
    const/high16 v3, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput v3, v0, La/a3e;->F:F

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const v3, 0x7f08021a

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    if-nez p1, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const p1, 0x7f0a1009

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    new-instance v0, Landroid/view/View;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    .line 98
    .line 99
    .line 100
    new-instance p1, La/a3e;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const v3, 0x7f07067e

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {p1, v2, v1}, La/a3e;-><init>(II)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const v1, 0x7f08021e

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    :goto_0
    return-void
.end method

.method public final w(La/vm3;La/xl3;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/vm3;->a:La/hbk0;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->s:La/hbk0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->getSmartBackgroundInflater()La/abk0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0, p2}, La/abk0;->a(La/hbk0;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->s:La/hbk0;

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_b

    .line 27
    .line 28
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->s:La/hbk0;

    .line 29
    .line 30
    instance-of v1, v0, La/gbk0;

    .line 31
    .line 32
    const v3, 0x7f0a0e27

    .line 33
    .line 34
    .line 35
    const v4, 0x7f0a0e2a

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v1, :cond_6

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    instance-of v4, v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v1, v5

    .line 55
    :goto_0
    if-eqz v1, :cond_2

    .line 56
    .line 57
    move-object v4, v0

    .line 58
    check-cast v4, La/gbk0;

    .line 59
    .line 60
    iget-object v6, v4, La/gbk0;->b:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v4, v4, La/gbk0;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1, v6, v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->e()V

    .line 70
    .line 71
    .line 72
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    :cond_3
    if-nez v5, :cond_b

    .line 75
    .line 76
    :cond_4
    new-instance v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, v4}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    check-cast v0, La/gbk0;

    .line 101
    .line 102
    iget-object v3, v0, La/gbk0;->b:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v0, v0, La/gbk0;->c:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, v3, v0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->e()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p2}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->setOnPlayerReadyListener(Lkotlin/jvm/functions/Function0;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    instance-of p2, v0, La/bbk0;

    .line 120
    .line 121
    if-eqz p2, :cond_b

    .line 122
    .line 123
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-eqz p2, :cond_9

    .line 128
    .line 129
    instance-of v1, p2, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 130
    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    check-cast p2, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    move-object p2, v5

    .line 137
    :goto_1
    if-eqz p2, :cond_8

    .line 138
    .line 139
    move-object v1, v0

    .line 140
    check-cast v1, La/bbk0;

    .line 141
    .line 142
    iget-object v1, v1, La/bbk0;->b:La/y0x;

    .line 143
    .line 144
    invoke-virtual {p2, v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->setImageParams(La/y0x;)V

    .line 145
    .line 146
    .line 147
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :cond_8
    if-nez v5, :cond_b

    .line 150
    .line 151
    :cond_9
    new-instance p2, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-direct {p2, v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 164
    .line 165
    .line 166
    check-cast v0, La/bbk0;

    .line 167
    .line 168
    iget-object v0, v0, La/bbk0;->b:La/y0x;

    .line 169
    .line 170
    invoke-virtual {p2, v0}, Lorg/xplatform/ui_core/viewcomponents/smart_background/b;->setImageParams(La/y0x;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->m(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    if-eqz p2, :cond_a

    .line 178
    .line 179
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 180
    .line 181
    .line 182
    :cond_a
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 183
    .line 184
    .line 185
    :cond_b
    :goto_2
    iget-object p2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 186
    .line 187
    iget-object p1, p1, La/vm3;->b:La/ok3;

    .line 188
    .line 189
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-nez p2, :cond_16

    .line 194
    .line 195
    instance-of p2, p1, La/lk3;

    .line 196
    .line 197
    const v0, 0x7f0606d0

    .line 198
    .line 199
    .line 200
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 201
    .line 202
    if-eqz p2, :cond_c

    .line 203
    .line 204
    move-object p2, p1

    .line 205
    check-cast p2, La/lk3;

    .line 206
    .line 207
    iget-object v3, v1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 208
    .line 209
    check-cast v3, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 210
    .line 211
    const v4, 0x7f080298

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v5, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 223
    .line 224
    .line 225
    iget-object v3, v1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 226
    .line 227
    check-cast v3, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 228
    .line 229
    const v4, 0x7f14048f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v4}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionStyle(I)V

    .line 233
    .line 234
    .line 235
    sget-object v4, La/j5d;->a:Landroid/util/TypedValue;

    .line 236
    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    const v5, 0x7f040b0b

    .line 245
    .line 246
    .line 247
    invoke-static {v4, v5, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    invoke-virtual {v3, v4}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionColor(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v4, v0}, Landroid/content/Context;->getColor(I)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-virtual {v3, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionErrorColor(I)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p2, La/lk3;->b:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v3, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionText(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    sget-object v0, La/ful;->f:La/ful;

    .line 271
    .line 272
    invoke-virtual {v3, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnStyle(La/ful;)V

    .line 273
    .line 274
    .line 275
    iget-object v0, p2, La/lk3;->a:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v3, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitle(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, v1, La/jk3;->f:Landroid/view/View;

    .line 281
    .line 282
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 283
    .line 284
    iget-object v4, p2, La/lk3;->d:La/nl3;

    .line 285
    .line 286
    invoke-virtual {v0, v4}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u(La/ql3;)V

    .line 287
    .line 288
    .line 289
    iget-object p2, p2, La/lk3;->c:Ljava/util/List;

    .line 290
    .line 291
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_14

    .line 296
    .line 297
    new-instance v0, La/qn3;

    .line 298
    .line 299
    invoke-direct {v0}, La/qn3;-><init>()V

    .line 300
    .line 301
    .line 302
    iput v2, v0, La/qn3;->a:I

    .line 303
    .line 304
    iput v2, v0, La/qn3;->b:I

    .line 305
    .line 306
    iget-object v2, v1, La/jk3;->d:Landroid/view/View;

    .line 307
    .line 308
    check-cast v2, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 309
    .line 310
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    iput v2, v0, La/qn3;->d:I

    .line 315
    .line 316
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    iput v2, v0, La/qn3;->e:I

    .line 321
    .line 322
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    iput v2, v0, La/qn3;->h:I

    .line 327
    .line 328
    iget-object v1, v1, La/jk3;->e:Landroid/view/View;

    .line 329
    .line 330
    check-cast v1, Landroidx/constraintlayout/widget/Barrier;

    .line 331
    .line 332
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    iput v1, v0, La/qn3;->g:I

    .line 337
    .line 338
    invoke-virtual {v0}, La/qn3;->a()La/pn3;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {p0, p2, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u(Ljava/util/List;La/pn3;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_6

    .line 346
    .line 347
    :cond_c
    instance-of p2, p1, La/mk3;

    .line 348
    .line 349
    const v3, 0x7f0606e2

    .line 350
    .line 351
    .line 352
    const v4, 0x7f14048d

    .line 353
    .line 354
    .line 355
    if-eqz p2, :cond_13

    .line 356
    .line 357
    move-object p2, p1

    .line 358
    check-cast p2, La/mk3;

    .line 359
    .line 360
    const/4 v5, 0x1

    .line 361
    invoke-virtual {p0, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v(Z)V

    .line 362
    .line 363
    .line 364
    iget-object v6, v1, La/jk3;->d:Landroid/view/View;

    .line 365
    .line 366
    check-cast v6, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 367
    .line 368
    iget-object v7, v1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 369
    .line 370
    check-cast v7, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 371
    .line 372
    iget v8, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->z:F

    .line 373
    .line 374
    invoke-virtual {v6, v8}, Landroid/view/View;->setElevation(F)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7, v8}, Landroid/view/View;->setElevation(F)V

    .line 378
    .line 379
    .line 380
    const v9, 0x7f08021a

    .line 381
    .line 382
    .line 383
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-virtual {v10, v9}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 388
    .line 389
    .line 390
    move-result-object v9

    .line 391
    invoke-virtual {v7, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v7, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7, v4}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionStyle(I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    invoke-virtual {v4, v3}, Landroid/content/Context;->getColor(I)I

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    invoke-virtual {v7, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionColor(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v3, v0}, Landroid/content/Context;->getColor(I)I

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    invoke-virtual {v7, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionErrorColor(I)V

    .line 420
    .line 421
    .line 422
    iget-object v0, p2, La/mk3;->c:Ljava/lang/String;

    .line 423
    .line 424
    iget-object v3, p2, La/mk3;->d:Ljava/util/List;

    .line 425
    .line 426
    invoke-virtual {v7, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionText(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    sget-object v0, La/ful;->k:La/ful;

    .line 430
    .line 431
    invoke-virtual {v7, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnStyle(La/ful;)V

    .line 432
    .line 433
    .line 434
    iget-object v0, v1, La/jk3;->f:Landroid/view/View;

    .line 435
    .line 436
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 437
    .line 438
    invoke-virtual {v0, v8}, Landroid/view/View;->setElevation(F)V

    .line 439
    .line 440
    .line 441
    iget-object v4, p2, La/mk3;->e:La/ol3;

    .line 442
    .line 443
    invoke-virtual {v0, v4}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u(La/ql3;)V

    .line 444
    .line 445
    .line 446
    iget-object v0, p2, La/mk3;->a:Ljava/lang/String;

    .line 447
    .line 448
    iget-object p2, p2, La/mk3;->b:Ljava/lang/String;

    .line 449
    .line 450
    new-instance v4, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;

    .line 451
    .line 452
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-direct {v4, v9}, Lcom/google/android/material/textview/MaterialTextView;-><init>(Landroid/content/Context;)V

    .line 463
    .line 464
    .line 465
    const-string v10, ""

    .line 466
    .line 467
    iput-object v10, v4, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->i:Ljava/lang/String;

    .line 468
    .line 469
    iput-object v10, v4, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->j:Ljava/lang/String;

    .line 470
    .line 471
    const v10, 0x7f0a131c

    .line 472
    .line 473
    .line 474
    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 478
    .line 479
    .line 480
    const/16 v11, 0x11

    .line 481
    .line 482
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    .line 483
    .line 484
    .line 485
    const/4 v11, 0x5

    .line 486
    invoke-virtual {v4, v11}, Landroid/view/View;->setTextDirection(I)V

    .line 487
    .line 488
    .line 489
    sget-object v11, La/j5d;->a:Landroid/util/TypedValue;

    .line 490
    .line 491
    const v11, 0x7f0606da

    .line 492
    .line 493
    .line 494
    invoke-virtual {v9, v11}, Landroid/content/Context;->getColor(I)I

    .line 495
    .line 496
    .line 497
    move-result v11

    .line 498
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 499
    .line 500
    .line 501
    const v11, 0x7f1404cb

    .line 502
    .line 503
    .line 504
    invoke-virtual {v4, v9, v11}, Lcom/google/android/material/textview/MaterialTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 505
    .line 506
    .line 507
    const/high16 v9, 0x42000000    # 32.0f

    .line 508
    .line 509
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 510
    .line 511
    .line 512
    new-instance v9, La/qn3;

    .line 513
    .line 514
    invoke-direct {v9}, La/qn3;-><init>()V

    .line 515
    .line 516
    .line 517
    const/4 v11, -0x1

    .line 518
    iput v11, v9, La/qn3;->a:I

    .line 519
    .line 520
    const/4 v11, -0x2

    .line 521
    iput v11, v9, La/qn3;->b:I

    .line 522
    .line 523
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 524
    .line 525
    .line 526
    move-result v11

    .line 527
    iput v11, v9, La/qn3;->d:I

    .line 528
    .line 529
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 530
    .line 531
    .line 532
    move-result v7

    .line 533
    iput v7, v9, La/qn3;->g:I

    .line 534
    .line 535
    iput v2, v9, La/qn3;->e:I

    .line 536
    .line 537
    iput v2, v9, La/qn3;->h:I

    .line 538
    .line 539
    const v7, 0x7f070718

    .line 540
    .line 541
    .line 542
    iput v7, v9, La/qn3;->m:I

    .line 543
    .line 544
    iput v7, v9, La/qn3;->k:I

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    iput v7, v9, La/qn3;->i:F

    .line 548
    .line 549
    invoke-virtual {v9}, La/qn3;->a()La/pn3;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    invoke-virtual {v4, v7}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->setViewLayoutParams(La/pn3;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-nez v7, :cond_d

    .line 567
    .line 568
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 569
    .line 570
    .line 571
    move-result v7

    .line 572
    if-nez v7, :cond_d

    .line 573
    .line 574
    goto :goto_3

    .line 575
    :cond_d
    iput-object v0, v4, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->j:Ljava/lang/String;

    .line 576
    .line 577
    iput-object p2, v4, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->i:Ljava/lang/String;

    .line 578
    .line 579
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 580
    .line 581
    .line 582
    :goto_3
    iget-object p2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 583
    .line 584
    if-eqz p2, :cond_e

    .line 585
    .line 586
    instance-of p2, p2, La/mk3;

    .line 587
    .line 588
    if-eqz p2, :cond_e

    .line 589
    .line 590
    invoke-virtual {v4, v8}, Landroid/view/View;->setElevation(F)V

    .line 591
    .line 592
    .line 593
    :cond_e
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 594
    .line 595
    .line 596
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 597
    .line 598
    .line 599
    move-result p2

    .line 600
    if-nez p2, :cond_14

    .line 601
    .line 602
    invoke-static {p0}, La/hxm0;->q(Landroid/view/ViewGroup;)Ljava/util/ArrayList;

    .line 603
    .line 604
    .line 605
    move-result-object p2

    .line 606
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_10

    .line 611
    .line 612
    :cond_f
    move v5, v2

    .line 613
    goto :goto_4

    .line 614
    :cond_10
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object p2

    .line 618
    :cond_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-eqz v0, :cond_f

    .line 623
    .line 624
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, Landroid/view/View;

    .line 629
    .line 630
    instance-of v0, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;

    .line 631
    .line 632
    if-eqz v0, :cond_11

    .line 633
    .line 634
    :goto_4
    new-instance p2, La/qn3;

    .line 635
    .line 636
    invoke-direct {p2}, La/qn3;-><init>()V

    .line 637
    .line 638
    .line 639
    iput v2, p2, La/qn3;->a:I

    .line 640
    .line 641
    iput v2, p2, La/qn3;->b:I

    .line 642
    .line 643
    if-eqz v5, :cond_12

    .line 644
    .line 645
    goto :goto_5

    .line 646
    :cond_12
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 647
    .line 648
    .line 649
    move-result v10

    .line 650
    :goto_5
    iput v10, p2, La/qn3;->d:I

    .line 651
    .line 652
    iput v2, p2, La/qn3;->e:I

    .line 653
    .line 654
    iput v2, p2, La/qn3;->h:I

    .line 655
    .line 656
    iget-object v0, v1, La/jk3;->e:Landroid/view/View;

    .line 657
    .line 658
    check-cast v0, Landroidx/constraintlayout/widget/Barrier;

    .line 659
    .line 660
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    iput v0, p2, La/qn3;->g:I

    .line 665
    .line 666
    invoke-virtual {p2}, La/qn3;->a()La/pn3;

    .line 667
    .line 668
    .line 669
    move-result-object p2

    .line 670
    invoke-virtual {p0, v3, p2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u(Ljava/util/List;La/pn3;)V

    .line 671
    .line 672
    .line 673
    goto/16 :goto_6

    .line 674
    .line 675
    :cond_13
    instance-of p2, p1, La/nk3;

    .line 676
    .line 677
    if-eqz p2, :cond_15

    .line 678
    .line 679
    move-object p2, p1

    .line 680
    check-cast p2, La/nk3;

    .line 681
    .line 682
    invoke-virtual {p0, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->v(Z)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 686
    .line 687
    .line 688
    move-result-object v5

    .line 689
    const v6, 0x7f07012f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    iget-object v6, v1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 697
    .line 698
    check-cast v6, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 699
    .line 700
    invoke-virtual {v6, v5}, Landroid/view/View;->setElevation(F)V

    .line 701
    .line 702
    .line 703
    iget-object v6, v1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 704
    .line 705
    check-cast v6, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 706
    .line 707
    invoke-virtual {v6, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v6, v4}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionStyle(I)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    invoke-virtual {v4, v3}, Landroid/content/Context;->getColor(I)I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    invoke-virtual {v6, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionColor(I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    invoke-virtual {v3, v0}, Landroid/content/Context;->getColor(I)I

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    invoke-virtual {v6, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionErrorColor(I)V

    .line 733
    .line 734
    .line 735
    iget-object v0, p2, La/nk3;->a:Ljava/lang/String;

    .line 736
    .line 737
    invoke-virtual {v6, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionText(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    sget-object v0, La/ful;->k:La/ful;

    .line 741
    .line 742
    invoke-virtual {v6, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnStyle(La/ful;)V

    .line 743
    .line 744
    .line 745
    iget-object v0, v1, La/jk3;->f:Landroid/view/View;

    .line 746
    .line 747
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 748
    .line 749
    invoke-virtual {v0, v5}, Landroid/view/View;->setElevation(F)V

    .line 750
    .line 751
    .line 752
    iget-object v3, p2, La/nk3;->c:La/pl3;

    .line 753
    .line 754
    invoke-virtual {v0, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u(La/ql3;)V

    .line 755
    .line 756
    .line 757
    iget-object p2, p2, La/nk3;->b:Ljava/util/List;

    .line 758
    .line 759
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    if-nez v0, :cond_14

    .line 764
    .line 765
    new-instance v0, La/qn3;

    .line 766
    .line 767
    invoke-direct {v0}, La/qn3;-><init>()V

    .line 768
    .line 769
    .line 770
    iput v2, v0, La/qn3;->a:I

    .line 771
    .line 772
    iput v2, v0, La/qn3;->b:I

    .line 773
    .line 774
    iget-object v3, v1, La/jk3;->d:Landroid/view/View;

    .line 775
    .line 776
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 777
    .line 778
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    iput v3, v0, La/qn3;->d:I

    .line 783
    .line 784
    iput v2, v0, La/qn3;->e:I

    .line 785
    .line 786
    iput v2, v0, La/qn3;->h:I

    .line 787
    .line 788
    iget-object v1, v1, La/jk3;->e:Landroid/view/View;

    .line 789
    .line 790
    check-cast v1, Landroidx/constraintlayout/widget/Barrier;

    .line 791
    .line 792
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    iput v1, v0, La/qn3;->g:I

    .line 797
    .line 798
    invoke-virtual {v0}, La/qn3;->a()La/pn3;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {p0, p2, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->u(Ljava/util/List;La/pn3;)V

    .line 803
    .line 804
    .line 805
    :cond_14
    :goto_6
    iput-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 806
    .line 807
    return-void

    .line 808
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 809
    .line 810
    .line 811
    :cond_16
    return-void
.end method

.method public final x(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 2
    .line 3
    iget-object v0, v0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 6
    .line 7
    iget-object v1, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->a:La/jk3;

    .line 8
    .line 9
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v3, v1, La/jk3;->e:Landroid/view/View;

    .line 19
    .line 20
    check-cast v3, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 21
    .line 22
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->getButtonLabel()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v3, v1, La/jk3;->e:Landroid/view/View;

    .line 34
    .line 35
    check-cast v3, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->h:I

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v3, v1, La/jk3;->c:Landroid/view/View;

    .line 46
    .line 47
    check-cast v3, Lcom/google/android/material/textview/MaterialTextView;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->c:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget-object v2, v1, La/jk3;->c:Landroid/view/View;

    .line 62
    .line 63
    check-cast v2, Lcom/google/android/material/textview/MaterialTextView;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v3, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->c:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    iget-object v1, v1, La/jk3;->c:Landroid/view/View;

    .line 79
    .line 80
    check-cast v1, Lcom/google/android/material/textview/MaterialTextView;

    .line 81
    .line 82
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->c:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    const/4 v1, 0x0

    .line 88
    invoke-direct {p0, v1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setDownloadViewVisibility(Z)V

    .line 89
    .line 90
    .line 91
    iget-object v2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    if-eqz v2, :cond_9

    .line 95
    .line 96
    instance-of v4, v2, La/lk3;

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    instance-of v4, v2, La/mk3;

    .line 105
    .line 106
    if-eqz v4, :cond_7

    .line 107
    .line 108
    const v2, 0x7f0a131c

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;

    .line 116
    .line 117
    if-eqz p0, :cond_6

    .line 118
    .line 119
    iget-object v2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->j:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    invoke-virtual {v0, v1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    instance-of p0, v2, La/nk3;

    .line 129
    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_9
    :goto_3
    invoke-virtual {v0, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionVisibility(Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnVisibility(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnVisibility(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnLoading(Z)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 5
    .line 6
    iget-object v0, v0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 9
    .line 10
    iget-object v1, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->a:La/jk3;

    .line 11
    .line 12
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->g:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v3, v1, La/jk3;->e:Landroid/view/View;

    .line 22
    .line 23
    check-cast v3, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 24
    .line 25
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->getButtonLabel()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v3, v1, La/jk3;->e:Landroid/view/View;

    .line 37
    .line 38
    check-cast v3, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->i:I

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v3, v1, La/jk3;->c:Landroid/view/View;

    .line 49
    .line 50
    check-cast v3, Lcom/google/android/material/textview/MaterialTextView;

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionErrorText(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->d:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iget-object p1, v1, La/jk3;->c:Landroid/view/View;

    .line 68
    .line 69
    check-cast p1, Lcom/google/android/material/textview/MaterialTextView;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->d:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    iget-object p1, v1, La/jk3;->c:Landroid/view/View;

    .line 85
    .line 86
    check-cast p1, Lcom/google/android/material/textview/MaterialTextView;

    .line 87
    .line 88
    iget-object v1, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    const/4 p1, 0x0

    .line 94
    invoke-direct {p0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setDownloadViewVisibility(Z)V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    if-eqz v1, :cond_9

    .line 101
    .line 102
    instance-of v3, v1, La/lk3;

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    instance-of v3, v1, La/mk3;

    .line 111
    .line 112
    if-eqz v3, :cond_7

    .line 113
    .line 114
    const v1, 0x7f0a131c

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;

    .line 122
    .line 123
    if-eqz p0, :cond_6

    .line 124
    .line 125
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->j:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    instance-of p0, v1, La/nk3;

    .line 135
    .line 136
    if-eqz p0, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_9
    :goto_3
    invoke-virtual {v0, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionVisibility(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnVisibility(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnVisibility(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnLoading(Z)V

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->q:La/jk3;

    .line 2
    .line 3
    iget-object v1, v0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast v1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;

    .line 6
    .line 7
    iget-object v0, v0, La/jk3;->f:Landroid/view/View;

    .line 8
    .line 9
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->t:La/ok3;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    instance-of v0, v0, La/mk3;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const v0, 0x7f0a131c

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/updateavailable/b;->i:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v0, 0x1

    .line 43
    invoke-direct {p0, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->setDownloadViewVisibility(Z)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    invoke-virtual {v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setTitleVisibility(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setDescriptionVisibility(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setWhatsNewBtnVisibility(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnVisibility(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/bottom/AppUpdateBottomView;->setUpdateBtnLoading(Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
