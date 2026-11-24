.class public final La/x7g0;
.super La/k5;
.source "SourceFile"


# instance fields
.field public l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

.field public final m:La/dvd0;


# direct methods
.method public constructor <init>(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;La/dvd0;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7f07074a

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, v0, v1}, La/k5;-><init>(La/nmo0;ZI)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/x7g0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 9
    .line 10
    iput-object p2, p0, La/x7g0;->m:La/dvd0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(II)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/k5;->a(II)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p0, p0, La/p6g0;

    .line 6
    .line 7
    return p0
.end method

.method public final d(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/k5;->c(I)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p0, p0, La/o6g0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x3

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x2

    .line 12
    return p0
.end method

.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/x7g0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 3

    .line 1
    instance-of p0, p1, La/z7g0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    instance-of p0, p2, La/p6g0;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    check-cast p1, La/z7g0;

    .line 10
    .line 11
    check-cast p2, La/p6g0;

    .line 12
    .line 13
    iget-object p0, p1, La/z7g0;->u:La/bdu0;

    .line 14
    .line 15
    iget-object p1, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object v0, p2, La/p6g0;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget v0, p2, La/p6g0;->e:I

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, v0}, Landroid/content/Context;->getColor(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const v1, 0x7f040b0b

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-static {v0, v1, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/bdu0;->b:Landroid/widget/FrameLayout;

    .line 56
    .line 57
    iget-object p1, p2, La/p6g0;->f:La/t2m0;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, La/n2x;->K(La/t2m0;Landroid/content/Context;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 1

    .line 1
    instance-of p0, p1, La/t6g0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    instance-of p0, p2, La/o6g0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/t6g0;

    .line 10
    .line 11
    check-cast p2, La/o6g0;

    .line 12
    .line 13
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object p0, p1, La/t6g0;->u:La/nq8;

    .line 16
    .line 17
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 18
    .line 19
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 20
    .line 21
    sget-object p1, La/qzw;->a:La/qzw;

    .line 22
    .line 23
    iget-object p2, p2, La/o6g0;->d:Ljava/lang/String;

    .line 24
    .line 25
    const v0, 0x7f080b3c

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1, p2, v0}, La/u0d;->m(Landroid/widget/ImageView;La/qzw;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    instance-of p0, p1, La/u6g0;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    instance-of p0, p2, La/r6g0;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    check-cast p1, La/u6g0;

    .line 41
    .line 42
    check-cast p2, La/r6g0;

    .line 43
    .line 44
    iget-object p0, p1, La/u6g0;->u:La/d5e0;

    .line 45
    .line 46
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 47
    .line 48
    iget-object p1, p2, La/r6g0;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 6

    .line 1
    instance-of p0, p1, La/s7g0;

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    instance-of p0, p2, La/q6g0;

    .line 6
    .line 7
    if-eqz p0, :cond_3

    .line 8
    .line 9
    check-cast p1, La/s7g0;

    .line 10
    .line 11
    check-cast p2, La/q6g0;

    .line 12
    .line 13
    iget-object p0, p2, La/q6g0;->f:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p1, La/s7g0;->u:La/jk3;

    .line 16
    .line 17
    iget-object v1, v0, La/jk3;->e:Landroid/view/View;

    .line 18
    .line 19
    check-cast v1, Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v2, v0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 22
    .line 23
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    iget-object v3, p2, La/q6g0;->d:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v4, p2, La/q6g0;->g:Z

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, La/jk3;->f:Landroid/view/View;

    .line 33
    .line 34
    check-cast v1, Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object v3, p2, La/q6g0;->e:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-lez v1, :cond_0

    .line 46
    .line 47
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 48
    .line 49
    iget-object v1, v0, La/jk3;->d:Landroid/view/View;

    .line 50
    .line 51
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 52
    .line 53
    sget-object v3, La/qzw;->a:La/qzw;

    .line 54
    .line 55
    const v5, 0x7f080b3c

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v3, p0, v5}, La/u0d;->m(Landroid/widget/ImageView;La/qzw;Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object p0, v0, La/jk3;->c:Landroid/view/View;

    .line 62
    .line 63
    check-cast p0, Landroid/widget/ImageView;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/16 v0, 0x8

    .line 70
    .line 71
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance p0, La/dff0;

    .line 80
    .line 81
    const/16 v0, 0xe

    .line 82
    .line 83
    invoke-direct {p0, p1, p2, v0}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2, p0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const/4 p0, 0x0

    .line 91
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object p0, p2, La/q6g0;->i:La/t2m0;

    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {p0, p1}, La/n2x;->K(La/t2m0;Landroid/content/Context;)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-virtual {v2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-ne p2, v0, :cond_1

    .line 12
    .line 13
    new-instance p2, La/z7g0;

    .line 14
    .line 15
    const v0, 0x7f0d066c

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const p1, 0x7f0a1285

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance p1, La/bdu0;

    .line 35
    .line 36
    check-cast p0, Landroid/widget/FrameLayout;

    .line 37
    .line 38
    invoke-direct {p1, p0, v0, v2}, La/bdu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, p1}, La/z7g0;-><init>(La/bdu0;)V

    .line 42
    .line 43
    .line 44
    return-object p2

    .line 45
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "Missing required view with ID: "

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_1
    const-string p0, "Unknown cell view type: "

    .line 64
    .line 65
    invoke-static {p2, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x3

    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "Missing required view with ID: "

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ne p2, v0, :cond_1

    .line 15
    .line 16
    new-instance p2, La/t6g0;

    .line 17
    .line 18
    const v0, 0x7f0d0668

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const p1, 0x7f0a086c

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    new-instance p1, La/nq8;

    .line 37
    .line 38
    check-cast p0, Landroid/widget/FrameLayout;

    .line 39
    .line 40
    const/16 v1, 0x11

    .line 41
    .line 42
    invoke-direct {p1, p0, v0, v1}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, p1}, La/t6g0;-><init>(La/nq8;)V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    new-instance p2, La/u6g0;

    .line 66
    .line 67
    const v0, 0x7f0d0669

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const p1, 0x7f0a1260

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/widget/TextView;

    .line 82
    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    new-instance p1, La/d5e0;

    .line 86
    .line 87
    check-cast p0, Landroid/widget/FrameLayout;

    .line 88
    .line 89
    const/16 v1, 0x1d

    .line 90
    .line 91
    invoke-direct {p1, p0, v0, v1}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p2, p1}, La/u6g0;-><init>(La/d5e0;)V

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-object v1
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const p2, 0x7f0d066a

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 21
    .line 22
    const v1, 0x7f0706ba

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-direct {p2, v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
    .locals 9

    .line 1
    new-instance p2, La/s7g0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f0d066b

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const v0, 0x7f0a00c3

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v4, v1

    .line 27
    check-cast v4, Landroid/widget/ImageView;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const v0, 0x7f0a0747

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v5, v1

    .line 39
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    const v0, 0x7f0a0b73

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    move-object v6, v1

    .line 51
    check-cast v6, Landroid/widget/TextView;

    .line 52
    .line 53
    if-eqz v6, :cond_0

    .line 54
    .line 55
    const v0, 0x7f0a0fce

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v7, v1

    .line 63
    check-cast v7, Landroid/widget/TextView;

    .line 64
    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    new-instance v2, La/jk3;

    .line 68
    .line 69
    move-object v3, p1

    .line 70
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 71
    .line 72
    const/16 v8, 0xf

    .line 73
    .line 74
    invoke-direct/range {v2 .. v8}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, La/x7g0;->m:La/dvd0;

    .line 78
    .line 79
    invoke-direct {p2, v2, p0}, La/s7g0;-><init>(La/jk3;La/dvd0;)V

    .line 80
    .line 81
    .line 82
    return-object p2

    .line 83
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const-string p1, "Missing required view with ID: "

    .line 92
    .line 93
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    return-object p0
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x7g0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-void
.end method
