.class public final synthetic La/lmq0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/lmq0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/lmq0;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentTimeoutBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/y5r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/lmq0;->a:La/lmq0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a0225

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Landroid/widget/Button;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    const p0, 0x7f0a0388

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroidx/core/widget/NestedScrollView;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const p0, 0x7f0a0395

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    const p0, 0x7f0a0409

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-static {v0}, La/cxx;->a(Landroid/view/View;)La/cxx;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const p0, 0x7f0a05e9

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Landroid/widget/FrameLayout;

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    const p0, 0x7f0a0a49

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    invoke-static {v0}, La/cxx;->a(Landroid/view/View;)La/cxx;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const p0, 0x7f0a0b98

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_0

    .line 85
    .line 86
    check-cast v0, Landroid/widget/FrameLayout;

    .line 87
    .line 88
    new-instance v6, La/nq8;

    .line 89
    .line 90
    const/16 p0, 0xc

    .line 91
    .line 92
    invoke-direct {v6, v0, v0, p0}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 93
    .line 94
    .line 95
    const p0, 0x7f0a0ff0

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    move-object v7, v0

    .line 103
    check-cast v7, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 104
    .line 105
    if-eqz v7, :cond_0

    .line 106
    .line 107
    const p0, 0x7f0a1441

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_0

    .line 115
    .line 116
    invoke-static {v0}, La/cxx;->a(Landroid/view/View;)La/cxx;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    new-instance v1, La/y5r;

    .line 121
    .line 122
    move-object v2, p1

    .line 123
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 124
    .line 125
    invoke-direct/range {v1 .. v8}, La/y5r;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Button;La/cxx;La/cxx;La/nq8;Lcom/google/android/material/appbar/MaterialToolbar;La/cxx;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    const-string p1, "Missing required view with ID: "

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const/4 p0, 0x0

    .line 147
    return-object p0
.end method
