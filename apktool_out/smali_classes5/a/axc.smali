.class public final La/axc;
.super La/v46;
.source "SourceFile"


# instance fields
.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Z

.field public final x:Lkotlin/jvm/functions/Function1;

.field public final y:La/uk5;

.field public z:La/siq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLa/lya;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p5}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/axc;->u:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, La/axc;->v:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p3, p0, La/axc;->w:Z

    .line 21
    .line 22
    iput-object p4, p0, La/axc;->x:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    const p1, 0x7f0a00b4

    .line 25
    .line 26
    .line 27
    invoke-static {p5, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    move-object v2, p2

    .line 32
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const p1, 0x7f0a0118

    .line 37
    .line 38
    .line 39
    invoke-static {p5, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    move-object v3, p2

    .line 44
    check-cast v3, Landroid/widget/FrameLayout;

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    const p1, 0x7f0a011c

    .line 49
    .line 50
    .line 51
    invoke-static {p5, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    move-object v4, p2

    .line 56
    check-cast v4, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 57
    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    const p1, 0x7f0a0348

    .line 61
    .line 62
    .line 63
    invoke-static {p5, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-eqz p2, :cond_0

    .line 68
    .line 69
    check-cast p2, Landroid/widget/ProgressBar;

    .line 70
    .line 71
    new-instance v5, La/nq8;

    .line 72
    .line 73
    const/16 p1, 0x14

    .line 74
    .line 75
    invoke-direct {v5, p2, p2, p1}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 76
    .line 77
    .line 78
    const p1, 0x7f0a036d

    .line 79
    .line 80
    .line 81
    invoke-static {p5, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    check-cast p2, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 86
    .line 87
    if-eqz p2, :cond_0

    .line 88
    .line 89
    move-object v1, p5

    .line 90
    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 91
    .line 92
    const p1, 0x7f0a0a8e

    .line 93
    .line 94
    .line 95
    invoke-static {p5, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    move-object v6, p2

    .line 100
    check-cast v6, Landroidx/core/widget/NestedScrollView;

    .line 101
    .line 102
    if-eqz v6, :cond_0

    .line 103
    .line 104
    new-instance v0, La/uk5;

    .line 105
    .line 106
    invoke-direct/range {v0 .. v6}, La/uk5;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;La/nq8;Landroidx/core/widget/NestedScrollView;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, La/axc;->y:La/uk5;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_0
    invoke-virtual {p5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string p1, "Missing required view with ID: "

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/4 p0, 0x0

    .line 130
    throw p0
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 13

    .line 1
    check-cast p1, La/uvc;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/axc;->y:La/uk5;

    .line 7
    .line 8
    iget-object v1, v0, La/uk5;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/nq8;

    .line 11
    .line 12
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 13
    .line 14
    check-cast v1, Landroid/widget/ProgressBar;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, La/uk5;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v4, v0, La/uk5;->e:Landroid/view/View;

    .line 29
    .line 30
    move-object v5, v4

    .line 31
    check-cast v5, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 32
    .line 33
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, La/axc;->z:La/siq;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    new-instance v3, La/siq;

    .line 41
    .line 42
    iget-object v4, p0, La/xhe0;->a:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v4}, La/siq;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, La/axc;->z:La/siq;

    .line 61
    .line 62
    iget-object v4, v0, La/uk5;->d:Landroid/view/View;

    .line 63
    .line 64
    check-cast v4, Landroid/widget/FrameLayout;

    .line 65
    .line 66
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    iget-object v6, p0, La/axc;->z:La/siq;

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/16 v4, 0x64

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v4}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 90
    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-virtual {v6, v3, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/view/View;->setScrollY(I)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, La/uk5;->c:Landroid/view/View;

    .line 101
    .line 102
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    invoke-virtual {v1, v3, v2, v3}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 106
    .line 107
    .line 108
    new-instance v1, La/zwc;

    .line 109
    .line 110
    invoke-direct {v1, v0, p0}, La/zwc;-><init>(La/uk5;La/axc;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v1}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/uvc;->k:Ljava/lang/String;

    .line 117
    .line 118
    const-string v1, "</head>"

    .line 119
    .line 120
    const-string v2, "</html>"

    .line 121
    .line 122
    const-string v3, "<html><head>"

    .line 123
    .line 124
    iget-object v4, p0, La/axc;->v:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v3, v4, v1, v0, v2}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    const-string v10, "utf-8"

    .line 131
    .line 132
    const/4 v11, 0x0

    .line 133
    iget-object v7, p0, La/axc;->u:Ljava/lang/String;

    .line 134
    .line 135
    const-string v9, "text/html"

    .line 136
    .line 137
    invoke-virtual/range {v6 .. v11}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_1
    iget-boolean p0, p0, La/axc;->w:Z

    .line 141
    .line 142
    if-eqz p0, :cond_2

    .line 143
    .line 144
    const p0, 0x7f080dfc

    .line 145
    .line 146
    .line 147
    :goto_0
    move v7, p0

    .line 148
    goto :goto_1

    .line 149
    :cond_2
    const p0, 0x7f080dfd

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :goto_1
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 154
    .line 155
    iget-object v6, p1, La/uvc;->b:Ljava/lang/String;

    .line 156
    .line 157
    const/4 v11, 0x0

    .line 158
    const/16 v12, 0x1f8

    .line 159
    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v10, 0x0

    .line 162
    move v8, v7

    .line 163
    invoke-static/range {v5 .. v12}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 164
    .line 165
    .line 166
    return-void
.end method
