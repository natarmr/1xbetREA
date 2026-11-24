.class public final La/cs50;
.super La/v46;
.source "SourceFile"


# instance fields
.field public final u:Lkotlin/jvm/functions/Function2;

.field public final v:La/j6j;

.field public w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/view/View;La/ba30;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/cs50;->u:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    const p2, 0x7f0a0122

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const p2, 0x7f0a0123

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/widget/ImageView;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const p2, 0x7f0a0124

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v5, v0

    .line 41
    check-cast v5, Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    new-instance v1, La/j6j;

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    invoke-direct/range {v1 .. v6}, La/j6j;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;B)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, La/cs50;->v:La/j6j;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "Missing required view with ID: "

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 11

    .line 1
    check-cast p1, La/ct5;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, La/cs50;->w:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p1, La/ct5;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object v10, p0, La/cs50;->v:La/j6j;

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v10, La/j6j;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v1, 0x7f0700a5

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 34
    .line 35
    iget-object v1, v10, La/j6j;->e:Landroid/widget/ImageView;

    .line 36
    .line 37
    new-instance v3, La/j2x;

    .line 38
    .line 39
    invoke-direct {v3, v0}, La/j2x;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    new-array v0, v0, [La/k2x;

    .line 44
    .line 45
    sget-object v4, La/g2x;->a:La/g2x;

    .line 46
    .line 47
    aput-object v4, v0, v9

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    aput-object v3, v0, v4

    .line 51
    .line 52
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, La/rw40;

    .line 57
    .line 58
    const/16 v0, 0xe

    .line 59
    .line 60
    invoke-direct {v6, p0, p1, v0}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v7, La/b530;

    .line 64
    .line 65
    const/16 v0, 0x17

    .line 66
    .line 67
    invoke-direct {v7, p0, v0}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    const/16 v8, 0x6c

    .line 71
    .line 72
    const v3, 0x7f080af3

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, v10, La/j6j;->e:Landroid/widget/ImageView;

    .line 81
    .line 82
    const v1, 0x7f080af3

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 86
    .line 87
    .line 88
    :goto_0
    new-instance v0, La/bs50;

    .line 89
    .line 90
    invoke-direct {v0, p0, p1, v9}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, La/xhe0;->a:Landroid/view/View;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, v10, La/j6j;->d:Landroid/widget/TextView;

    .line 99
    .line 100
    iget-object v0, v10, La/j6j;->c:Landroid/widget/TextView;

    .line 101
    .line 102
    iget-object v1, p1, La/ct5;->d:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    iget-object p0, p1, La/ct5;->e:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    invoke-static {}, La/cy7;->c()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    iget-object p1, v10, La/j6j;->d:Landroid/widget/TextView;

    .line 117
    .line 118
    if-eqz p0, :cond_1

    .line 119
    .line 120
    const/4 p0, 0x4

    .line 121
    invoke-virtual {p1, p0}, Landroid/view/View;->setTextDirection(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p0}, Landroid/view/View;->setTextDirection(I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_1
    const/4 p0, 0x3

    .line 129
    invoke-virtual {p1, p0}, Landroid/view/View;->setTextDirection(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p0}, Landroid/view/View;->setTextDirection(I)V

    .line 133
    .line 134
    .line 135
    return-void
.end method
