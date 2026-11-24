.class public final Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final q:La/uk5;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

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
    const p2, 0x7f0d01c2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p1, 0x7f0a04c5

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroidx/constraintlayout/widget/Guideline;

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    const p1, 0x7f0a06e8

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, Landroidx/constraintlayout/helper/widget/Flow;

    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    const p1, 0x7f0a090f

    .line 47
    .line 48
    .line 49
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    move-object v3, p2

    .line 54
    check-cast v3, Landroid/widget/ImageView;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    const p1, 0x7f0a09ee

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    move-object v4, p2

    .line 66
    check-cast v4, Landroidx/compose/ui/platform/ComposeView;

    .line 67
    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    const p1, 0x7f0a0d78

    .line 71
    .line 72
    .line 73
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 78
    .line 79
    if-eqz p2, :cond_1

    .line 80
    .line 81
    const p1, 0x7f0a0e79

    .line 82
    .line 83
    .line 84
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Landroidx/constraintlayout/widget/Guideline;

    .line 89
    .line 90
    if-eqz p2, :cond_1

    .line 91
    .line 92
    const p1, 0x7f0a12c5

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    move-object v5, p2

    .line 100
    check-cast v5, Landroid/widget/TextView;

    .line 101
    .line 102
    if-eqz v5, :cond_1

    .line 103
    .line 104
    const p1, 0x7f0a12e3

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    move-object v6, p2

    .line 112
    check-cast v6, Landroid/widget/TextView;

    .line 113
    .line 114
    if-eqz v6, :cond_1

    .line 115
    .line 116
    const p1, 0x7f0a12e9

    .line 117
    .line 118
    .line 119
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    move-object v7, p2

    .line 124
    check-cast v7, Landroid/widget/TextView;

    .line 125
    .line 126
    if-eqz v7, :cond_1

    .line 127
    .line 128
    new-instance v1, La/uk5;

    .line 129
    .line 130
    move-object v2, p0

    .line 131
    invoke-direct/range {v1 .. v7}, La/uk5;-><init>(Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;Landroid/widget/ImageView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 132
    .line 133
    .line 134
    iput-object v1, v2, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 135
    .line 136
    return-void

    .line 137
    :cond_1
    move-object v2, p0

    .line 138
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const-string p1, "Missing required view with ID: "

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0
.end method


# virtual methods
.method public final setChampName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->e:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setMatchName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOnViewClicked(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 2
    .line 3
    iget-object p0, p0, La/uk5;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setScoreInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 5
    .line 6
    iget-object p0, p0, La/uk5;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSportIcon(J)V
    .locals 3

    .line 1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 4
    .line 5
    iget-object p0, p0, La/uk5;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "svg"

    .line 16
    .line 17
    const-string v1, "sports_v2"

    .line 18
    .line 19
    const-string v2, "static"

    .line 20
    .line 21
    invoke-static {v2, v0, v1}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, ".svg"

    .line 26
    .line 27
    invoke-static {p1, p2, v1, v0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, La/bzu;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p1, ""

    .line 40
    .line 41
    :goto_0
    invoke-static {p0, p1}, La/u0d;->k(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
