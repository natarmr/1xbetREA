.class public final synthetic La/y6b0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/y6b0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/y6b0;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicGamesBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/x2r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/y6b0;->a:La/y6b0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a09d5

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const p0, 0x7f0a0be9

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const p0, 0x7f0a0da8

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const p0, 0x7f0a0dca

    .line 38
    .line 39
    .line 40
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 45
    .line 46
    const p0, 0x7f0a0dcb

    .line 47
    .line 48
    .line 49
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 54
    .line 55
    const p0, 0x7f0a0dcc

    .line 56
    .line 57
    .line 58
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 63
    .line 64
    const p0, 0x7f0a0dcd

    .line 65
    .line 66
    .line 67
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 72
    .line 73
    const p0, 0x7f0a0dce

    .line 74
    .line 75
    .line 76
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 81
    .line 82
    const p0, 0x7f0a0dcf

    .line 83
    .line 84
    .line 85
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 90
    .line 91
    const p0, 0x7f0a0dd0

    .line 92
    .line 93
    .line 94
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 99
    .line 100
    const p0, 0x7f0a0dd1

    .line 101
    .line 102
    .line 103
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 108
    .line 109
    const p0, 0x7f0a0dd2

    .line 110
    .line 111
    .line 112
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 117
    .line 118
    const p0, 0x7f0a0dd3

    .line 119
    .line 120
    .line 121
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 126
    .line 127
    const p0, 0x7f0a0df4

    .line 128
    .line 129
    .line 130
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 135
    .line 136
    const p0, 0x7f0a0df6

    .line 137
    .line 138
    .line 139
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 144
    .line 145
    const p0, 0x7f0a0df7

    .line 146
    .line 147
    .line 148
    invoke-static {v2, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 153
    .line 154
    new-instance p0, La/ewe;

    .line 155
    .line 156
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 157
    .line 158
    const/4 v3, 0x4

    .line 159
    invoke-direct {p0, v2, v3}, La/ewe;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;B)V

    .line 160
    .line 161
    .line 162
    new-instance v2, La/x2r;

    .line 163
    .line 164
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 165
    .line 166
    invoke-direct {v2, p1, v0, v1, p0}, La/x2r;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;Landroidx/recyclerview/widget/RecyclerView;La/ewe;)V

    .line 167
    .line 168
    .line 169
    return-object v2

    .line 170
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const-string p1, "Missing required view with ID: "

    .line 179
    .line 180
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const/4 p0, 0x0

    .line 188
    return-object p0
.end method
