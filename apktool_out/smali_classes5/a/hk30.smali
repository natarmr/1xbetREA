.class public final synthetic La/hk30;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/hk30;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/hk30;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/special_event/impl/databinding/FragmentMedalStatisticBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/a2r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/hk30;->a:La/hk30;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a072b

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, "Missing required view with ID: "

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const p0, 0x7f0a0806

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroid/widget/ImageView;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const p0, 0x7f0a085c

    .line 30
    .line 31
    .line 32
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    const p0, 0x7f0a0899

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Landroid/widget/ImageView;

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    const p0, 0x7f0a08bb

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Landroid/widget/ImageView;

    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    const p0, 0x7f0a08e5

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Landroid/widget/ImageView;

    .line 70
    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    const p0, 0x7f0a10c6

    .line 74
    .line 75
    .line 76
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v3, :cond_0

    .line 83
    .line 84
    new-instance v6, La/ewe;

    .line 85
    .line 86
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 87
    .line 88
    const/4 p0, 0x7

    .line 89
    invoke-direct {v6, v0, p0}, La/ewe;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;B)V

    .line 90
    .line 91
    .line 92
    const p0, 0x7f0a072c

    .line 93
    .line 94
    .line 95
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    check-cast v0, Landroid/widget/LinearLayout;

    .line 102
    .line 103
    new-instance v7, La/vr9;

    .line 104
    .line 105
    const/4 p0, 0x4

    .line 106
    invoke-direct {v7, v0, p0}, La/vr9;-><init>(Landroid/widget/LinearLayout;B)V

    .line 107
    .line 108
    .line 109
    const p0, 0x7f0a093a

    .line 110
    .line 111
    .line 112
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v8, v0

    .line 117
    check-cast v8, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 118
    .line 119
    if-eqz v8, :cond_1

    .line 120
    .line 121
    const p0, 0x7f0a0c8f

    .line 122
    .line 123
    .line 124
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v9, v0

    .line 129
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 130
    .line 131
    if-eqz v9, :cond_1

    .line 132
    .line 133
    const p0, 0x7f0a0e6b

    .line 134
    .line 135
    .line 136
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    move-object v10, v0

    .line 141
    check-cast v10, Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 142
    .line 143
    if-eqz v10, :cond_1

    .line 144
    .line 145
    const p0, 0x7f0a0ff0

    .line 146
    .line 147
    .line 148
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object v11, v0

    .line 153
    check-cast v11, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 154
    .line 155
    if-eqz v11, :cond_1

    .line 156
    .line 157
    const p0, 0x7f0a1024

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    if-eqz v12, :cond_1

    .line 165
    .line 166
    new-instance v4, La/a2r;

    .line 167
    .line 168
    move-object v5, p1

    .line 169
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 170
    .line 171
    invoke-direct/range {v4 .. v12}, La/a2r;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;La/ewe;La/vr9;Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    return-object v4

    .line 175
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-object v1
.end method
