.class public final synthetic La/u6w;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/u6w;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/u6w;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/HistoryFilterDialogBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/c1w;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/u6w;->a:La/u6w;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Landroid/view/LayoutInflater;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0d0330

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, p0, v1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const p1, 0x7f0a01b9

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 23
    .line 24
    const-string v2, "Missing required view with ID: "

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    const p1, 0x7f0a055a

    .line 29
    .line 30
    .line 31
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    const p1, 0x7f0a02e1

    .line 38
    .line 39
    .line 40
    invoke-static {v3, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v7, v4

    .line 45
    check-cast v7, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 46
    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    const p1, 0x7f0a02e2

    .line 50
    .line 51
    .line 52
    invoke-static {v3, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    move-object v8, v4

    .line 57
    check-cast v8, Landroid/widget/TextView;

    .line 58
    .line 59
    if-eqz v8, :cond_1

    .line 60
    .line 61
    const p1, 0x7f0a045c

    .line 62
    .line 63
    .line 64
    invoke-static {v3, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    if-eqz v9, :cond_1

    .line 69
    .line 70
    move-object v6, v3

    .line 71
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 72
    .line 73
    new-instance v5, La/jk3;

    .line 74
    .line 75
    const/4 v11, 0x7

    .line 76
    move-object v10, v6

    .line 77
    invoke-direct/range {v5 .. v11}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 78
    .line 79
    .line 80
    move-object p1, p0

    .line 81
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 82
    .line 83
    const v3, 0x7f0a0bf2

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    if-eqz v4, :cond_0

    .line 93
    .line 94
    new-instance p0, La/c1w;

    .line 95
    .line 96
    invoke-direct {p0, p1, v0, v5, v4}, La/c1w;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/button/MaterialButton;La/jk3;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_0
    move p1, v3

    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v1
.end method
