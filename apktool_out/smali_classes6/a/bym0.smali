.class public final synthetic La/bym0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/bym0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/bym0;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/sportgame/subgames/impl/databinding/FragmentSubGamesBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/l5r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/bym0;->a:La/bym0;

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
    const p0, 0x7f0a1402

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
    if-eqz v0, :cond_3

    .line 17
    .line 18
    const p0, 0x7f0a03ee

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroidx/compose/ui/platform/ComposeView;

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    move-object p0, v0

    .line 30
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 31
    .line 32
    const v4, 0x7f0a0f2a

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    new-instance v0, La/vd7;

    .line 44
    .line 45
    const/16 v4, 0x1b

    .line 46
    .line 47
    invoke-direct {v0, p0, v3, v5, v4}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 48
    .line 49
    .line 50
    const p0, 0x7f0a1405

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    const p0, 0x7f0a0229

    .line 60
    .line 61
    .line 62
    invoke-static {v3, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    move-object v7, v4

    .line 67
    check-cast v7, Landroid/widget/ImageView;

    .line 68
    .line 69
    if-eqz v7, :cond_0

    .line 70
    .line 71
    const p0, 0x7f0a055c

    .line 72
    .line 73
    .line 74
    invoke-static {v3, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    if-eqz v8, :cond_0

    .line 79
    .line 80
    const p0, 0x7f0a0807

    .line 81
    .line 82
    .line 83
    invoke-static {v3, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    move-object v9, v4

    .line 88
    check-cast v9, Landroid/widget/ImageView;

    .line 89
    .line 90
    if-eqz v9, :cond_0

    .line 91
    .line 92
    const p0, 0x7f0a0ed2

    .line 93
    .line 94
    .line 95
    invoke-static {v3, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    move-object v10, v4

    .line 100
    check-cast v10, Lorg/xplatform/ui_core/viewcomponents/tabs/TabLayoutChips;

    .line 101
    .line 102
    if-eqz v10, :cond_0

    .line 103
    .line 104
    const p0, 0x7f0a1404

    .line 105
    .line 106
    .line 107
    invoke-static {v3, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    move-object v11, v4

    .line 112
    check-cast v11, Landroidx/viewpager2/widget/ViewPager2;

    .line 113
    .line 114
    if-eqz v11, :cond_0

    .line 115
    .line 116
    new-instance v5, La/uk5;

    .line 117
    .line 118
    move-object v6, v3

    .line 119
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 120
    .line 121
    const/16 v12, 0xa

    .line 122
    .line 123
    invoke-direct/range {v5 .. v12}, La/uk5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 124
    .line 125
    .line 126
    new-instance p0, La/l5r;

    .line 127
    .line 128
    check-cast p1, Landroid/widget/FrameLayout;

    .line 129
    .line 130
    invoke-direct {p0, p1, v0, v5}, La/l5r;-><init>(Landroid/widget/FrameLayout;La/vd7;La/uk5;)V

    .line 131
    .line 132
    .line 133
    return-object p0

    .line 134
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-object v1

    .line 150
    :cond_1
    move p0, v4

    .line 151
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-object v1
.end method
