.class public final La/c0x;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:La/uk5;


# direct methods
.method public constructor <init>(ILandroid/content/Context;Ljava/util/List;)V
    .locals 8

    .line 1
    const v0, 0x1030009

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, La/c0x;->a:Ljava/util/List;

    .line 8
    .line 9
    iput p1, p0, La/c0x;->b:I

    .line 10
    .line 11
    const p1, 0x7f080a0e

    .line 12
    .line 13
    .line 14
    iput p1, p0, La/c0x;->c:I

    .line 15
    .line 16
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const p2, 0x7f0d030c

    .line 21
    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const p2, 0x7f0a0623

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v3, v0

    .line 37
    check-cast v3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const p2, 0x7f0a0624

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v4, v0

    .line 49
    check-cast v4, Landroidx/viewpager/widget/ViewPager;

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    const p2, 0x7f0a080c

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v5, v0

    .line 61
    check-cast v5, Landroid/widget/ImageView;

    .line 62
    .line 63
    if-eqz v5, :cond_0

    .line 64
    .line 65
    move-object v2, p1

    .line 66
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 67
    .line 68
    const p2, 0x7f0a0ec0

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v7, v0

    .line 76
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 77
    .line 78
    if-eqz v7, :cond_0

    .line 79
    .line 80
    new-instance v1, La/uk5;

    .line 81
    .line 82
    move-object v6, v2

    .line 83
    invoke-direct/range {v1 .. v7}, La/uk5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/circleindicator/CircleIndicator;Landroidx/viewpager/widget/ViewPager;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, La/c0x;->d:La/uk5;

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const-string p1, "Missing required view with ID: "

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p3
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/c0x;->d:La/uk5;

    .line 30
    .line 31
    iget-object v0, p1, La/uk5;->b:Landroid/view/ViewGroup;

    .line 32
    .line 33
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    iget-object v1, p1, La/uk5;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 38
    .line 39
    iget-object v2, p1, La/uk5;->d:Landroid/view/View;

    .line 40
    .line 41
    check-cast v2, Landroidx/viewpager/widget/ViewPager;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p1, La/uk5;->b:Landroid/view/ViewGroup;

    .line 47
    .line 48
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v3, La/bzu;

    .line 54
    .line 55
    const/16 v4, 0xe

    .line 56
    .line 57
    invoke-direct {v3, p0, v4}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    sget-object v4, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-static {v0, v3}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, La/cy7;->c()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    const/high16 v0, 0x43340000    # 180.0f

    .line 72
    .line 73
    invoke-virtual {v2, v0}, Landroid/view/View;->setRotationY(F)V

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-object v0, p1, La/uk5;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Landroid/widget/ImageView;

    .line 79
    .line 80
    new-instance v3, La/q10;

    .line 81
    .line 82
    const/16 v4, 0x1a

    .line 83
    .line 84
    invoke-direct {v3, p0, v4}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, La/bdv;

    .line 91
    .line 92
    const/16 v3, 0x1c

    .line 93
    .line 94
    invoke-direct {v0, p0, v3}, La/bdv;-><init>(Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->setDoOnFinish(Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, La/xxv;

    .line 101
    .line 102
    const/16 v3, 0xf

    .line 103
    .line 104
    invoke-direct {v0, p0, v3}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->setDoOnSwipeBack(Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p1, La/uk5;->e:Landroid/view/View;

    .line 111
    .line 112
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 113
    .line 114
    new-instance v1, La/jw5;

    .line 115
    .line 116
    const/16 v3, 0x8

    .line 117
    .line 118
    invoke-direct {v1, p0, v3}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 122
    .line 123
    .line 124
    new-instance v0, La/b0x;

    .line 125
    .line 126
    iget-object v1, p0, La/c0x;->a:Ljava/util/List;

    .line 127
    .line 128
    invoke-direct {v0, p0, v1}, La/b0x;-><init>(La/c0x;Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(La/pj80;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/4 v3, 0x1

    .line 139
    if-gt v0, v3, :cond_2

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_2
    iget-object p1, p1, La/uk5;->c:Landroid/view/View;

    .line 143
    .line 144
    check-cast p1, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 145
    .line 146
    invoke-virtual {p1, v2}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 147
    .line 148
    .line 149
    :goto_0
    iget p0, p0, La/c0x;->b:I

    .line 150
    .line 151
    if-lez p0, :cond_3

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-ge p0, p1, :cond_3

    .line 158
    .line 159
    invoke-virtual {v2, p0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 160
    .line 161
    .line 162
    :cond_3
    :goto_1
    return-void
.end method
