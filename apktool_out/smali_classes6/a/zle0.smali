.class public final La/zle0;
.super La/k5;
.source "SourceFile"


# instance fields
.field public l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;


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
    instance-of p0, p0, La/yke0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x2

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x1

    .line 12
    return p0
.end method

.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zle0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p1, La/bme0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    instance-of p0, p2, La/yke0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/bme0;

    .line 10
    .line 11
    check-cast p2, La/yke0;

    .line 12
    .line 13
    iget-object p0, p1, La/bme0;->u:La/d5e0;

    .line 14
    .line 15
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object p1, p2, La/yke0;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 3

    .line 1
    instance-of p0, p2, La/zke0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    instance-of p0, p1, La/cme0;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    check-cast v2, La/cme0;

    .line 15
    .line 16
    :cond_0
    if-eqz v2, :cond_3

    .line 17
    .line 18
    check-cast p2, La/zke0;

    .line 19
    .line 20
    iget-object p0, p2, La/zke0;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p1, v2, La/cme0;->u:La/adu0;

    .line 26
    .line 27
    iget-object p2, p1, La/adu0;->d:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    const/16 p0, 0x11

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, La/adu0;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    instance-of p0, p2, La/wke0;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    instance-of p0, p1, La/cme0;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    move-object v2, p1

    .line 55
    check-cast v2, La/cme0;

    .line 56
    .line 57
    :cond_2
    if-eqz v2, :cond_3

    .line 58
    .line 59
    check-cast p2, La/wke0;

    .line 60
    .line 61
    iget p0, p2, La/wke0;->d:I

    .line 62
    .line 63
    iget-object p1, v2, La/cme0;->u:La/adu0;

    .line 64
    .line 65
    iget-object p2, p1, La/adu0;->d:Landroid/widget/TextView;

    .line 66
    .line 67
    iget-object p1, p1, La/adu0;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 68
    .line 69
    const-string v2, ""

    .line 70
    .line 71
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p2, La/xke0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    instance-of p0, p1, La/wle0;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/wle0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    check-cast p2, La/xke0;

    .line 16
    .line 17
    iget-object p0, p1, La/wle0;->u:La/d5e0;

    .line 18
    .line 19
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object p1, p2, La/xke0;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 2

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
    const/4 v0, 0x2

    .line 10
    if-ne p2, v0, :cond_1

    .line 11
    .line 12
    new-instance p2, La/bme0;

    .line 13
    .line 14
    const v0, 0x7f0d0665

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const p1, 0x7f0a124d

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance p1, La/d5e0;

    .line 34
    .line 35
    check-cast p0, Landroid/widget/FrameLayout;

    .line 36
    .line 37
    const/16 v1, 0x1b

    .line 38
    .line 39
    invoke-direct {p1, p0, v0, v1}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p2, p1}, La/bme0;-><init>(La/d5e0;)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "Missing required view with ID: "

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0

    .line 65
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 66
    .line 67
    const-string p1, ""

    .line 68
    .line 69
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
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
    new-instance p2, La/cme0;

    .line 10
    .line 11
    const v0, 0x7f0d0666

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const p1, 0x7f0a0816

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const p1, 0x7f0a10b2

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/widget/TextView;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    new-instance p1, La/adu0;

    .line 42
    .line 43
    check-cast p0, Landroid/widget/FrameLayout;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {p1, p0, v0, v1, v2}, La/adu0;-><init>(Landroid/widget/FrameLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/TextView;B)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p2, p1}, La/cme0;-><init>(La/adu0;)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "Missing required view with ID: "

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0
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
    const v0, 0x7f0d0664

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    const v1, 0x7f0706ba

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-direct {v0, v1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    instance-of p1, p2, La/w8b;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    const p1, 0x7f0a10c0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroid/widget/TextView;

    .line 51
    .line 52
    check-cast p2, La/w8b;

    .line 53
    .line 54
    iget-object p2, p2, La/w8b;->a:La/h9b;

    .line 55
    .line 56
    iget-object p2, p2, La/h9b;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-object p0
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
    .locals 2

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
    new-instance p2, La/wle0;

    .line 10
    .line 11
    const v0, 0x7f0d0667

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const p1, 0x7f0a124d

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    new-instance p1, La/d5e0;

    .line 31
    .line 32
    check-cast p0, Landroid/widget/FrameLayout;

    .line 33
    .line 34
    const/16 v1, 0x1c

    .line 35
    .line 36
    invoke-direct {p1, p0, v0, v1}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p2, p1}, La/wle0;-><init>(La/d5e0;)V

    .line 40
    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "Missing required view with ID: "

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/zle0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-void
.end method
