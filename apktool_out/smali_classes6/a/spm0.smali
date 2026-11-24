.class public final La/spm0;
.super La/k5;
.source "SourceFile"


# instance fields
.field public final synthetic l:B

.field public m:La/nmo0;


# direct methods
.method public synthetic constructor <init>(La/nmo0;ZIB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/spm0;->l:B

    invoke-direct {p0, p1, p2, p3}, La/k5;-><init>(La/nmo0;ZI)V

    return-void
.end method

.method private final s(La/w5;La/y8b;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final t(La/w5;La/y8b;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final g()La/nmo0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/spm0;->m:La/nmo0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, La/spm0;->m:La/nmo0;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of p0, p1, La/lpq0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p1, La/lpq0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    check-cast p2, La/qur0;

    .line 17
    .line 18
    iget-object p0, p2, La/qur0;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, La/lpq0;->u:La/d5e0;

    .line 24
    .line 25
    iget-object p1, p1, La/d5e0;->c:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :pswitch_0
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 1

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/lpq0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, La/lpq0;

    .line 13
    .line 14
    :cond_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p2, La/qur0;

    .line 17
    .line 18
    iget-object p0, p2, La/qur0;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, La/lpq0;->u:La/d5e0;

    .line 24
    .line 25
    iget-object p1, p1, La/d5e0;->c:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :pswitch_0
    instance-of p0, p1, La/yzr0;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    move-object v0, p1

    .line 36
    check-cast v0, La/yzr0;

    .line 37
    .line 38
    :cond_2
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p2, La/xzr0;

    .line 41
    .line 42
    iget-object p0, v0, La/yzr0;->u:La/d5e0;

    .line 43
    .line 44
    iget-object p1, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object p2, p2, La/xzr0;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/d5e0;->b:Landroid/widget/FrameLayout;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 p1, -0x2

    .line 58
    iput p1, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 59
    .line 60
    :cond_3
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of p0, p1, La/lpq0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p1, La/lpq0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    check-cast p2, La/qur0;

    .line 17
    .line 18
    iget-object p0, p2, La/qur0;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, La/lpq0;->u:La/d5e0;

    .line 24
    .line 25
    iget-object p1, p1, La/d5e0;->c:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :pswitch_0
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 0

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p2, La/lpq0;

    .line 15
    .line 16
    invoke-static {p0, p1}, La/d5e0;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {p2, p0}, La/lpq0;-><init>(La/d5e0;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p2, La/uzr0;

    .line 33
    .line 34
    invoke-static {p0, p1}, La/iab;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/iab;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p2, p0}, La/uzr0;-><init>(La/iab;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p2, La/xhe0;->a:Landroid/view/View;

    .line 42
    .line 43
    const/16 p1, 0x8

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
    .locals 0

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p2, La/lpq0;

    .line 15
    .line 16
    invoke-static {p0, p1}, La/d5e0;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {p2, p0}, La/lpq0;-><init>(La/d5e0;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p2, La/yzr0;

    .line 33
    .line 34
    invoke-static {p0, p1}, La/d5e0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p2, p0}, La/yzr0;-><init>(La/d5e0;)V

    .line 39
    .line 40
    .line 41
    return-object p2

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 2

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p2, La/lpq0;

    .line 18
    .line 19
    invoke-static {p0, p1}, La/d5e0;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {p2, p0}, La/lpq0;-><init>(La/d5e0;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 27
    .line 28
    const v0, 0x7f07071a

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, -0x2

    .line 36
    invoke-direct {p0, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p2, La/xhe0;->a:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const p1, 0x7f130ac0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object p1, p2, La/lpq0;->u:La/d5e0;

    .line 63
    .line 64
    iget-object p1, p1, La/d5e0;->c:Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const p2, 0x7f0d0617

    .line 79
    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
    .locals 0

    .line 1
    iget-byte p0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p2, La/lpq0;

    .line 15
    .line 16
    invoke-static {p0, p1}, La/d5e0;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {p2, p0}, La/lpq0;-><init>(La/d5e0;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p2, La/m5s0;

    .line 33
    .line 34
    invoke-static {p0, p1}, La/dc3;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/dc3;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p2, p0}, La/m5s0;-><init>(La/dc3;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p2, La/xhe0;->a:Landroid/view/View;

    .line 42
    .line 43
    const/16 p1, 0x8

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/spm0;->l:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/spm0;->m:La/nmo0;

    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    iput-object p1, p0, La/spm0;->m:La/nmo0;

    .line 10
    .line 11
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
