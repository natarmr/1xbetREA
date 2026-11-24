.class public final La/dyb0;
.super La/yge0;
.source "SourceFile"


# instance fields
.field public final d:La/pf10;

.field public final e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/pf10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dyb0;->d:La/pf10;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/dyb0;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final d()I
    .locals 0

    .line 1
    iget-object p0, p0, La/dyb0;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(I)I
    .locals 0

    .line 1
    iget-object p0, p0, La/dyb0;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vxb0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    instance-of p1, p0, La/uxb0;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    instance-of p0, p0, La/txb0;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 1

    .line 1
    check-cast p1, La/cyb0;

    .line 2
    .line 3
    iget-object p0, p0, La/dyb0;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vxb0;

    .line 10
    .line 11
    iget-byte p2, p1, La/cyb0;->v:B

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    packed-switch p2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of p2, p0, La/uxb0;

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    check-cast v0, La/uxb0;

    .line 26
    .line 27
    :cond_0
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object p0, p1, La/cyb0;->w:La/yfu0;

    .line 31
    .line 32
    check-cast p0, La/dtx;

    .line 33
    .line 34
    iget-object p0, p0, La/dtx;->c:Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object p1, v0, La/uxb0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :pswitch_0
    iget-object p1, p1, La/cyb0;->w:La/yfu0;

    .line 43
    .line 44
    check-cast p1, La/ttx;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    instance-of p2, p0, La/txb0;

    .line 50
    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    move-object v0, p0

    .line 54
    check-cast v0, La/txb0;

    .line 55
    .line 56
    :cond_2
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object p0, p1, La/ttx;->d:Landroid/widget/ImageView;

    .line 60
    .line 61
    iget p2, v0, La/txb0;->a:I

    .line 62
    .line 63
    invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p1, La/ttx;->e:Landroid/widget/TextView;

    .line 67
    .line 68
    iget-object p2, v0, La/txb0;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p1, La/ttx;->c:Landroid/widget/ImageView;

    .line 74
    .line 75
    iget-boolean p2, v0, La/txb0;->d:Z

    .line 76
    .line 77
    if-eqz p2, :cond_4

    .line 78
    .line 79
    const/4 p2, 0x0

    .line 80
    goto :goto_0

    .line 81
    :cond_4
    const/16 p2, 0x8

    .line 82
    .line 83
    :goto_0
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p1, La/ttx;->f:Landroid/widget/TextView;

    .line 87
    .line 88
    iget p1, v0, La/txb0;->c:I

    .line 89
    .line 90
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq p2, v3, :cond_2

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-ne p2, v3, :cond_1

    .line 16
    .line 17
    const p2, 0x7f0d03dc

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const p2, 0x7f0a07b3

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v4, v0

    .line 32
    check-cast v4, Landroid/widget/ImageView;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    const p2, 0x7f0a07b5

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v5, v0

    .line 44
    check-cast v5, Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    const p2, 0x7f0a1086

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v6, v0

    .line 56
    check-cast v6, Landroid/widget/TextView;

    .line 57
    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    const p2, 0x7f0a10c3

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v7, v0

    .line 68
    check-cast v7, Landroid/widget/TextView;

    .line 69
    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    new-instance v2, La/ttx;

    .line 73
    .line 74
    move-object v3, p1

    .line 75
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 76
    .line 77
    const/4 v8, 0x2

    .line 78
    invoke-direct/range {v2 .. v8}, La/ttx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 79
    .line 80
    .line 81
    new-instance p1, La/cyb0;

    .line 82
    .line 83
    invoke-direct {p1, p0, v2}, La/cyb0;-><init>(La/dyb0;La/ttx;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const-string p1, "Missing required view with ID: "

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_1
    const-string p0, "Unknown prize list element with itemType="

    .line 106
    .line 107
    invoke-static {p2, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_2
    const p0, 0x7f0d03dd

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-eqz p0, :cond_3

    .line 123
    .line 124
    check-cast p0, Landroid/widget/TextView;

    .line 125
    .line 126
    new-instance p1, La/dtx;

    .line 127
    .line 128
    invoke-direct {p1, p0, p0, v3}, La/dtx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 129
    .line 130
    .line 131
    new-instance p0, La/cyb0;

    .line 132
    .line 133
    invoke-direct {p0, p1}, La/cyb0;-><init>(La/dtx;)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_3
    const-string p0, "rootView"

    .line 138
    .line 139
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v1
.end method
