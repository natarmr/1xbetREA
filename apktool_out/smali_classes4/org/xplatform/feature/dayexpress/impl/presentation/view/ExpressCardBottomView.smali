.class public final Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final q:La/iab;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

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
    const p2, 0x7f0d01c1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p1, 0x7f0a019f

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
    const p1, 0x7f0a020c

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    move-object v3, p2

    .line 43
    check-cast v3, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    const p1, 0x7f0a020f

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    move-object v4, p2

    .line 55
    check-cast v4, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 56
    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    const p1, 0x7f0a022e

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    move-object v5, p2

    .line 67
    check-cast v5, Landroidx/constraintlayout/helper/widget/Flow;

    .line 68
    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    const p1, 0x7f0a04c5

    .line 72
    .line 73
    .line 74
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Landroidx/constraintlayout/widget/Guideline;

    .line 79
    .line 80
    if-eqz p2, :cond_1

    .line 81
    .line 82
    const p1, 0x7f0a06e8

    .line 83
    .line 84
    .line 85
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Landroidx/constraintlayout/helper/widget/Flow;

    .line 90
    .line 91
    if-eqz p2, :cond_1

    .line 92
    .line 93
    const p1, 0x7f0a090f

    .line 94
    .line 95
    .line 96
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    move-object v6, p2

    .line 101
    check-cast v6, Landroid/widget/ImageView;

    .line 102
    .line 103
    if-eqz v6, :cond_1

    .line 104
    .line 105
    const p1, 0x7f0a09ee

    .line 106
    .line 107
    .line 108
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    move-object v7, p2

    .line 113
    check-cast v7, Landroidx/compose/ui/platform/ComposeView;

    .line 114
    .line 115
    if-eqz v7, :cond_1

    .line 116
    .line 117
    const p1, 0x7f0a0e79

    .line 118
    .line 119
    .line 120
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Landroidx/constraintlayout/widget/Guideline;

    .line 125
    .line 126
    if-eqz p2, :cond_1

    .line 127
    .line 128
    const p1, 0x7f0a12e9

    .line 129
    .line 130
    .line 131
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    move-object v8, p2

    .line 136
    check-cast v8, Landroid/widget/TextView;

    .line 137
    .line 138
    if-eqz v8, :cond_1

    .line 139
    .line 140
    new-instance v1, La/iab;

    .line 141
    .line 142
    move-object v2, p0

    .line 143
    invoke-direct/range {v1 .. v8}, La/iab;-><init>(Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;Lorg/xplatform/uikit/components/buttons/DsButton;Lorg/xplatform/uikit/components/buttons/DsButton;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/ImageView;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/TextView;)V

    .line 144
    .line 145
    .line 146
    iput-object v1, v2, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 147
    .line 148
    return-void

    .line 149
    :cond_1
    move-object v2, p0

    .line 150
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const-string p1, "Missing required view with ID: "

    .line 159
    .line 160
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v0
.end method


# virtual methods
.method public final setBonusIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 5
    .line 6
    iget-object p0, p0, La/iab;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setButtonsVisibile(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

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
    invoke-virtual {p0, p1}, La/yru0;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setMarket(La/chl0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 5
    .line 6
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/compose/ui/platform/ComposeView;

    .line 9
    .line 10
    new-instance v0, La/f5o;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-direct {v0, p1, v1}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/ugd;

    .line 17
    .line 18
    const v1, 0xe57a4cc

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {p1, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p0, v0, p1}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setOnAddToCouponClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 5
    .line 6
    iget-object p0, p0, La/iab;->b:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 9
    .line 10
    new-instance v0, La/xp3;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, p1, v1}, La/xp3;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setOnMakeBetClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 5
    .line 6
    iget-object p0, p0, La/iab;->e:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->q:La/iab;

    .line 5
    .line 6
    iget-object p0, p0, La/iab;->h:Landroid/view/View;

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
