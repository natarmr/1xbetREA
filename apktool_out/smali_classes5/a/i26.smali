.class public abstract La/i26;
.super La/yge0;
.source "SourceFile"


# instance fields
.field public final synthetic d:B

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/i26;->d:B

    .line 23
    new-instance v0, La/dp;

    invoke-direct {v0}, La/dp;-><init>()V

    .line 24
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 25
    iput-object v0, p0, La/i26;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/i26;->d:B

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 26
    sget-object p2, La/iun;->a:La/iun;

    .line 27
    :cond_0
    new-instance p1, La/h26;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, La/h26;-><init>(B)V

    .line 28
    invoke-direct {p0, p2, p1}, La/i26;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/i26;->d:B

    .line 29
    iput-object p1, p0, La/i26;->f:Ljava/lang/Object;

    invoke-direct {p0}, La/yge0;-><init>()V

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/i26;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/i26;->d:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/i26;->e:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/i26;->f:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public A(I)I
    .locals 0

    .line 1
    const p0, 0x7f0d0338

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public B(La/v46;I)V
    .locals 3

    .line 1
    iget-object v0, p0, La/i26;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, La/qo5;

    .line 15
    .line 16
    const/16 v2, 0xb

    .line 17
    .line 18
    invoke-direct {v1, p0, p2, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, La/v46;->t(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public C(La/f1a0;I)V
    .locals 6

    .line 1
    iget-object v0, p0, La/i26;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/i26;->D(La/f1a0;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v1, p0, La/i26;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/List;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    sub-int/2addr p2, v2

    .line 22
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, La/g1a0;

    .line 27
    .line 28
    iget-object v1, p2, La/g1a0;->a:La/qds0;

    .line 29
    .line 30
    iget-object v1, v1, La/qds0;->b:La/ccs0;

    .line 31
    .line 32
    move-object v3, v0

    .line 33
    check-cast v3, La/ulo;

    .line 34
    .line 35
    invoke-virtual {v3}, La/ulo;->v()La/scs0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v3, v3, La/scs0;->w:La/wcf0;

    .line 40
    .line 41
    invoke-virtual {v3, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget-object v3, p2, La/g1a0;->a:La/qds0;

    .line 49
    .line 50
    iget v5, p2, La/g1a0;->b:I

    .line 51
    .line 52
    iget-object v3, v3, La/qds0;->e:[Z

    .line 53
    .line 54
    aget-boolean v3, v3, v5

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move v2, v4

    .line 60
    :goto_0
    iget-object v3, p1, La/f1a0;->u:Landroid/widget/TextView;

    .line 61
    .line 62
    iget-object v5, p2, La/g1a0;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v3, p1, La/f1a0;->v:Landroid/view/View;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 v4, 0x4

    .line 73
    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, La/xhe0;->a:Landroid/view/View;

    .line 77
    .line 78
    new-instance v2, La/h1a0;

    .line 79
    .line 80
    invoke-direct {v2, p0, v0, v1, p2}, La/h1a0;-><init>(La/i26;La/my90;La/ccs0;La/g1a0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public abstract D(La/f1a0;)V
.end method

.method public E(Landroid/view/ViewGroup;I)La/v46;
    .locals 2

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
    invoke-virtual {p0, p2}, La/i26;->A(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/i26;->z(Landroid/view/View;)La/v46;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public abstract F(Ljava/lang/String;)V
.end method

.method public G(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i26;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/yge0;->g()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d()I
    .locals 2

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/i26;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/lit8 v1, p0, 0x1

    .line 27
    .line 28
    :goto_0
    return v1

    .line 29
    :pswitch_0
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    :goto_1
    return v1

    .line 41
    :pswitch_1
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/yge0;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p0, La/i26;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/dp;

    .line 14
    .line 15
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p0}, La/dp;->d(ILjava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public n(La/xhe0;I)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/f1a0;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/i26;->C(La/f1a0;I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, La/i26;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/dp;

    .line 15
    .line 16
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/List;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, p0, p2, p1, v1}, La/dp;->e(Ljava/lang/Object;ILa/xhe0;Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    check-cast p1, La/v46;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/i26;->B(La/v46;I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o(La/xhe0;ILjava/util/List;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, La/yge0;->o(La/xhe0;ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, La/i26;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/dp;

    .line 13
    .line 14
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {v0, p0, p2, p1, p3}, La/dp;->e(Ljava/lang/Object;ILa/xhe0;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const p2, 0x7f0d01be

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, La/f1a0;

    .line 27
    .line 28
    invoke-direct {p1, p0}, La/f1a0;-><init>(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/dp;

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, La/dp;->f(Landroid/view/ViewGroup;I)La/cp;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/i26;->E(Landroid/view/ViewGroup;I)La/v46;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(La/xhe0;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/yge0;->r(La/xhe0;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/dp;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/dp;->g(La/xhe0;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public s(La/xhe0;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/dp;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/dp;->h(La/xhe0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public t(La/xhe0;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/dp;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/dp;->i(La/xhe0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u(La/xhe0;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/i26;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/i26;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/dp;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/dp;->j(La/xhe0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public z(Landroid/view/View;)La/v46;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, La/gif;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, La/gif;-><init>(Landroid/view/View;B)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
