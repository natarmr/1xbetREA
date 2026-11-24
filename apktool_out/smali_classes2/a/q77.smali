.class public final La/q77;
.super La/i26;
.source "SourceFile"


# instance fields
.field public final synthetic g:B

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;La/y1s0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/q77;->g:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La/ij4;

    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/ij4;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, v0}, La/i26;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, La/q77;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object p3, p0, La/q77;->h:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p4, p0, La/q77;->j:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;La/ur6;La/sys0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/q77;->g:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0, p1, p3}, La/i26;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 28
    iput-object p2, p0, La/q77;->h:Ljava/lang/String;

    .line 29
    iput-object p3, p0, La/q77;->i:Ljava/lang/Object;

    .line 30
    iput-object p4, p0, La/q77;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final A(I)I
    .locals 0

    .line 1
    iget-byte p0, p0, La/q77;->g:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/ss3;

    .line 7
    .line 8
    const/16 p1, 0x1d

    .line 9
    .line 10
    invoke-direct {p0, p1}, La/ss3;-><init>(B)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    const p0, 0x7f0d040e

    .line 15
    .line 16
    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public E(Landroid/view/ViewGroup;I)La/v46;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q77;->g:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, La/i26;->E(Landroid/view/ViewGroup;I)La/v46;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const v0, 0x7f0d00f8

    .line 30
    .line 31
    .line 32
    if-ne p2, v0, :cond_1

    .line 33
    .line 34
    new-instance p2, La/v70;

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-direct {p2, p0, p1, v0}, La/v70;-><init>(La/q77;Landroid/view/View;B)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const v0, 0x7f0d00f7

    .line 42
    .line 43
    .line 44
    if-ne p2, v0, :cond_2

    .line 45
    .line 46
    new-instance p2, La/v70;

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-direct {p2, p0, p1, v0}, La/v70;-><init>(La/q77;Landroid/view/View;B)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance p2, La/gw3;

    .line 54
    .line 55
    invoke-direct {p2, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    return-object p2

    .line 59
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f(I)I
    .locals 1

    .line 1
    iget-byte v0, p0, La/q77;->g:B

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
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/px40;

    .line 20
    .line 21
    invoke-virtual {p0}, La/px40;->a()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/q77;->g:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, La/i26;->p(Landroid/view/ViewGroup;I)La/xhe0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/q77;->E(Landroid/view/ViewGroup;I)La/v46;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Landroid/view/View;)La/v46;
    .locals 3

    .line 1
    iget-byte v0, p0, La/q77;->g:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p0, La/ss3;

    .line 10
    .line 11
    const/16 p1, 0x1d

    .line 12
    .line 13
    invoke-direct {p0, p1}, La/ss3;-><init>(B)V

    .line 14
    .line 15
    .line 16
    throw p0

    .line 17
    :pswitch_0
    new-instance v0, La/p77;

    .line 18
    .line 19
    iget-object v1, p0, La/q77;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/ur6;

    .line 22
    .line 23
    iget-object v2, p0, La/q77;->h:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1, v2, v1}, La/p77;-><init>(La/q77;Landroid/view/View;Ljava/lang/String;La/ur6;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
