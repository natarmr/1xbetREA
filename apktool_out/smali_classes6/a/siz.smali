.class public final La/siz;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/due;


# instance fields
.field public final a:Landroid/view/ContextThemeWrapper;

.field public b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

.field public c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

.field public d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

.field public e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public p:Landroid/text/StaticLayout;

.field public q:Landroid/text/StaticLayout;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:I

.field public u:I

.field public v:I

.field public final w:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 10
    .line 11
    const v2, 0x7f1407da

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/siz;->a:Landroid/view/ContextThemeWrapper;

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    iput-object v0, p0, La/siz;->f:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v0, p0, La/siz;->g:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v0, p0, La/siz;->h:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, p0, La/siz;->i:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const v3, 0x7f070705

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iput v2, p0, La/siz;->j:I

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const v3, 0x7f07072d

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iput v2, p0, La/siz;->k:I

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const v3, 0x7f07067a

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iput v2, p0, La/siz;->l:I

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const v3, 0x7f070712

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iput v2, p0, La/siz;->m:I

    .line 80
    .line 81
    mul-int/lit8 v3, v2, 0x2

    .line 82
    .line 83
    iput v3, p0, La/siz;->n:I

    .line 84
    .line 85
    div-int/lit8 v2, v2, 0x2

    .line 86
    .line 87
    iput v2, p0, La/siz;->o:I

    .line 88
    .line 89
    iput-object v0, p0, La/siz;->r:Ljava/lang/String;

    .line 90
    .line 91
    iput-object v0, p0, La/siz;->s:Ljava/lang/String;

    .line 92
    .line 93
    new-instance v0, La/i7q;

    .line 94
    .line 95
    const/16 v2, 0xe

    .line 96
    .line 97
    invoke-direct {v0, p1, v2}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, La/siz;->w:La/n0o0;

    .line 105
    .line 106
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 107
    .line 108
    .line 109
    const-string p1, "LeftSideTeamsViewTestTag"

    .line 110
    .line 111
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method private final getTextTextPaint()Landroid/text/TextPaint;
    .locals 0

    .line 1
    iget-object p0, p0, La/siz;->w:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/text/TextPaint;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setBottomTeamLogos(La/efp0;)V
    .locals 3

    .line 1
    sget-object v0, La/bfp0;->a:La/bfp0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ""

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iput-object v2, p0, La/siz;->h:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iput-object v1, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 28
    .line 29
    :cond_1
    iput-object v2, p0, La/siz;->i:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 32
    .line 33
    if-eqz p1, :cond_8

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iput-object v1, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    instance-of v0, p1, La/cfp0;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    check-cast p1, La/cfp0;

    .line 52
    .line 53
    iget-object v0, p1, La/cfp0;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, La/siz;->b(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, La/cfp0;->b:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, La/siz;->c()Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 69
    .line 70
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    iget-object p1, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 77
    .line 78
    if-eqz p1, :cond_8

    .line 79
    .line 80
    invoke-direct {p0, p1}, La/siz;->setPlaceholderImageDrawable(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    iget-object v0, p0, La/siz;->i:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    iput-object p1, p0, La/siz;->i:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v0, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    new-instance v1, La/qiz;

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    invoke-direct {v1, p0, v2}, La/qiz;-><init>(La/siz;B)V

    .line 102
    .line 103
    .line 104
    new-instance p0, La/riz;

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-direct {p0, v0, p1, v1, v2}, La/riz;-><init>(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    instance-of v0, p1, La/dfp0;

    .line 115
    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    check-cast p1, La/dfp0;

    .line 119
    .line 120
    iget-object p1, p1, La/dfp0;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, La/siz;->b(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iput-object v2, p0, La/siz;->i:Ljava/lang/String;

    .line 126
    .line 127
    iget-object p1, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 128
    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    iput-object v1, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 141
    .line 142
    :cond_8
    return-void

    .line 143
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method private final setPlaceholderImageDrawable(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f0809af

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final setTopTeamLogos(La/efp0;)V
    .locals 3

    .line 1
    sget-object v0, La/bfp0;->a:La/bfp0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, ""

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iput-object v2, p0, La/siz;->f:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iput-object v1, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 28
    .line 29
    :cond_1
    iput-object v2, p0, La/siz;->g:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 32
    .line 33
    if-eqz p1, :cond_8

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iput-object v1, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    instance-of v0, p1, La/cfp0;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    check-cast p1, La/cfp0;

    .line 52
    .line 53
    iget-object v0, p1, La/cfp0;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, La/siz;->d(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, La/cfp0;->b:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, La/siz;->c()Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 69
    .line 70
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    iget-object p1, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 77
    .line 78
    if-eqz p1, :cond_8

    .line 79
    .line 80
    invoke-direct {p0, p1}, La/siz;->setPlaceholderImageDrawable(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    iget-object v0, p0, La/siz;->g:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    iput-object p1, p0, La/siz;->g:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v0, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    new-instance v1, La/qiz;

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    invoke-direct {v1, p0, v2}, La/qiz;-><init>(La/siz;B)V

    .line 102
    .line 103
    .line 104
    new-instance p0, La/riz;

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-direct {p0, v0, p1, v1, v2}, La/riz;-><init>(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    instance-of v0, p1, La/dfp0;

    .line 115
    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    check-cast p1, La/dfp0;

    .line 119
    .line 120
    iget-object p1, p1, La/dfp0;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, La/siz;->d(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iput-object v2, p0, La/siz;->g:Ljava/lang/String;

    .line 126
    .line 127
    iget-object p1, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 128
    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    iput-object v1, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 141
    .line 142
    :cond_8
    return-void

    .line 143
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 144
    .line 145
    .line 146
    return-void
.end method


# virtual methods
.method public final a(FFLandroid/graphics/Canvas;Landroid/text/StaticLayout;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    invoke-virtual {p4}, Landroid/text/Layout;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    sub-int/2addr p0, v0

    .line 21
    int-to-float p0, p0

    .line 22
    sub-float p1, p0, p1

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 28
    .line 29
    .line 30
    if-eqz p4, :cond_2

    .line 31
    .line 32
    invoke-virtual {p4, p3}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p3}, Landroid/graphics/Canvas;->restore()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/siz;->c()Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-direct {p0, p1}, La/siz;->setPlaceholderImageDrawable(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, La/siz;->h:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    iput-object p1, p0, La/siz;->h:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    new-instance v1, La/qiz;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, p0, v2}, La/qiz;-><init>(La/siz;B)V

    .line 43
    .line 44
    .line 45
    new-instance p0, La/riz;

    .line 46
    .line 47
    invoke-direct {p0, v0, p1, v1, v2}, La/riz;-><init>(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final c()Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2
    .line 3
    iget-object v1, p0, La/siz;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/siz;->c()Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-direct {p0, p1}, La/siz;->setPlaceholderImageDrawable(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, La/siz;->f:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    iput-object p1, p0, La/siz;->f:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v0, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    new-instance v1, La/qiz;

    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    invoke-direct {v1, p0, v2}, La/qiz;-><init>(La/siz;B)V

    .line 43
    .line 44
    .line 45
    new-instance p0, La/riz;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p0, v0, p1, v1, v2}, La/riz;-><init>(Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final e(ILorg/xplatform/uikit/components/team_logo/DsTeamLogo;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V
    .locals 9

    .line 1
    iget v2, p0, La/siz;->l:I

    .line 2
    .line 3
    div-int/lit8 v0, v2, 0x2

    .line 4
    .line 5
    sub-int v1, p1, v0

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    add-int v3, v1, v2

    .line 11
    .line 12
    move-object v5, p0

    .line 13
    move-object v4, p2

    .line 14
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v5, p0

    .line 19
    :goto_0
    if-eqz p3, :cond_1

    .line 20
    .line 21
    iget p0, v5, La/siz;->j:I

    .line 22
    .line 23
    iget p1, v5, La/siz;->l:I

    .line 24
    .line 25
    add-int v3, p1, p0

    .line 26
    .line 27
    move-object v8, v5

    .line 28
    add-int v5, v3, p1

    .line 29
    .line 30
    add-int v6, v1, p1

    .line 31
    .line 32
    move-object v7, p3

    .line 33
    move v4, v1

    .line 34
    invoke-static/range {v3 .. v8}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final getFirstTeamName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/siz;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSecondTeamName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/siz;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/siz;->p:Landroid/text/StaticLayout;

    .line 5
    .line 6
    iget v1, p0, La/siz;->t:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    iget v2, p0, La/siz;->u:I

    .line 10
    .line 11
    int-to-float v2, v2

    .line 12
    invoke-virtual {p0, v1, v2, p1, v0}, La/siz;->a(FFLandroid/graphics/Canvas;Landroid/text/StaticLayout;)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, La/siz;->m:I

    .line 16
    .line 17
    div-int/lit8 v1, v0, 0x2

    .line 18
    .line 19
    add-int/2addr v1, v0

    .line 20
    iget-object v0, p0, La/siz;->q:Landroid/text/StaticLayout;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    div-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    sub-int/2addr v1, v0

    .line 33
    iget-object v0, p0, La/siz;->q:Landroid/text/StaticLayout;

    .line 34
    .line 35
    iget v2, p0, La/siz;->t:I

    .line 36
    .line 37
    int-to-float v2, v2

    .line 38
    int-to-float v1, v1

    .line 39
    invoke-virtual {p0, v2, v1, p1, v0}, La/siz;->a(FFLandroid/graphics/Canvas;Landroid/text/StaticLayout;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2
    .line 3
    iget-object p2, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 4
    .line 5
    iget p3, p0, La/siz;->o:I

    .line 6
    .line 7
    invoke-virtual {p0, p3, p1, p2}, La/siz;->e(ILorg/xplatform/uikit/components/team_logo/DsTeamLogo;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 8
    .line 9
    .line 10
    iget p1, p0, La/siz;->m:I

    .line 11
    .line 12
    div-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    add-int/2addr p2, p1

    .line 15
    iget-object p1, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 16
    .line 17
    iget-object p3, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 18
    .line 19
    invoke-virtual {p0, p2, p1, p3}, La/siz;->e(ILorg/xplatform/uikit/components/team_logo/DsTeamLogo;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    iget p2, p0, La/siz;->l:I

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_1
    iget v3, p0, La/siz;->j:I

    .line 24
    .line 25
    add-int/2addr v3, p2

    .line 26
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object v5, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 31
    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object v4, v2

    .line 36
    :goto_2
    if-eqz v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move v4, v1

    .line 44
    :goto_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget-object v5, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move-object p2, v2

    .line 54
    :goto_4
    if-eqz p2, :cond_5

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    goto :goto_5

    .line 61
    :cond_5
    move p2, v1

    .line 62
    :goto_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-object v5, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 67
    .line 68
    if-eqz v5, :cond_6

    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_6
    move-object v3, v2

    .line 72
    :goto_6
    if-eqz v3, :cond_7

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    goto :goto_7

    .line 79
    :cond_7
    move v3, v1

    .line 80
    :goto_7
    add-int/2addr v0, v4

    .line 81
    add-int/2addr p2, v3

    .line 82
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iget v0, p0, La/siz;->k:I

    .line 87
    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v3, p0, La/siz;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 93
    .line 94
    if-nez v3, :cond_9

    .line 95
    .line 96
    iget-object v3, p0, La/siz;->c:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 97
    .line 98
    if-nez v3, :cond_9

    .line 99
    .line 100
    iget-object v3, p0, La/siz;->d:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 101
    .line 102
    if-nez v3, :cond_9

    .line 103
    .line 104
    iget-object v3, p0, La/siz;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 105
    .line 106
    if-eqz v3, :cond_8

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_8
    move-object v0, v2

    .line 110
    :cond_9
    :goto_8
    if-eqz v0, :cond_a

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    goto :goto_9

    .line 117
    :cond_a
    move v0, v1

    .line 118
    :goto_9
    add-int/2addr p2, v0

    .line 119
    iput p2, p0, La/siz;->v:I

    .line 120
    .line 121
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    iget v0, p0, La/siz;->v:I

    .line 126
    .line 127
    sub-int v5, p2, v0

    .line 128
    .line 129
    iget-object p2, p0, La/siz;->r:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-lez p2, :cond_b

    .line 136
    .line 137
    iget-object p2, p0, La/siz;->r:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {p2}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-direct {p0}, La/siz;->getTextTextPaint()Landroid/text/TextPaint;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    const/16 v10, 0xdf0    # 5.0E-42f

    .line 151
    .line 152
    const/4 v6, 0x2

    .line 153
    const/4 v8, 0x0

    .line 154
    invoke-static/range {v3 .. v10}, La/xdx;->I(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    goto :goto_a

    .line 159
    :cond_b
    move-object p2, v2

    .line 160
    :goto_a
    iput-object p2, p0, La/siz;->p:Landroid/text/StaticLayout;

    .line 161
    .line 162
    iget-object p2, p0, La/siz;->s:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-lez p2, :cond_c

    .line 169
    .line 170
    iget-object p2, p0, La/siz;->s:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {p2}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-direct {p0}, La/siz;->getTextTextPaint()Landroid/text/TextPaint;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 181
    .line 182
    const/4 v9, 0x0

    .line 183
    const/16 v10, 0xdf0    # 5.0E-42f

    .line 184
    .line 185
    const/4 v6, 0x2

    .line 186
    const/4 v8, 0x0

    .line 187
    invoke-static/range {v3 .. v10}, La/xdx;->I(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    :cond_c
    iput-object v2, p0, La/siz;->q:Landroid/text/StaticLayout;

    .line 192
    .line 193
    iget p2, p0, La/siz;->v:I

    .line 194
    .line 195
    iput p2, p0, La/siz;->t:I

    .line 196
    .line 197
    iget p2, p0, La/siz;->m:I

    .line 198
    .line 199
    div-int/lit8 p2, p2, 0x2

    .line 200
    .line 201
    iget-object v0, p0, La/siz;->p:Landroid/text/StaticLayout;

    .line 202
    .line 203
    if-eqz v0, :cond_d

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    :cond_d
    div-int/lit8 v1, v1, 0x2

    .line 210
    .line 211
    sub-int/2addr p2, v1

    .line 212
    iput p2, p0, La/siz;->u:I

    .line 213
    .line 214
    iget p2, p0, La/siz;->n:I

    .line 215
    .line 216
    const/high16 v0, 0x40000000    # 2.0f

    .line 217
    .line 218
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public setTeamsUiModel(La/cue;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/bue;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/bue;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object v0, p1, La/bue;->a:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p0, La/siz;->r:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p1, La/bue;->b:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v0, p0, La/siz;->s:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p1, La/bue;->c:La/efp0;

    .line 24
    .line 25
    invoke-direct {p0, v0}, La/siz;->setTopTeamLogos(La/efp0;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, La/bue;->d:La/efp0;

    .line 29
    .line 30
    invoke-direct {p0, p1}, La/siz;->setBottomTeamLogos(La/efp0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 34
    .line 35
    .line 36
    return-void
.end method
