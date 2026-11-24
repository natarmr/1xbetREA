.class public final La/xtc0;
.super La/q4;
.source "SourceFile"


# instance fields
.field public final f:I

.field public final g:La/m0x;

.field public final h:Ljava/lang/Integer;

.field public i:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(ILa/m0x;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    sget-object v0, La/ek5;->g:La/ek5;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, La/xtc0;->f:I

    .line 7
    .line 8
    iput-object p2, p0, La/xtc0;->g:La/m0x;

    .line 9
    .line 10
    iput-object p3, p0, La/xtc0;->h:Ljava/lang/Integer;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, La/xtc0;->i:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final n(La/xhe0;I)V
    .locals 3

    .line 1
    check-cast p1, La/wtc0;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/euc0;

    .line 8
    .line 9
    iget-object p1, p1, La/wtc0;->u:La/n0o0;

    .line 10
    .line 11
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/kuc0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/xtc0;->g:La/m0x;

    .line 21
    .line 22
    invoke-interface {v1, v0, v2}, La/kuc0;->a(La/euc0;La/m0x;)V

    .line 23
    .line 24
    .line 25
    instance-of v1, v0, La/euc0;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La/kuc0;

    .line 34
    .line 35
    new-instance v1, La/h4c0;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v0, p2, v2}, La/h4c0;-><init>(La/q4;Ljava/lang/Object;IB)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v1}, La/kuc0;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 4

    .line 1
    check-cast p1, La/wtc0;

    .line 2
    .line 3
    iget-object v0, p1, La/wtc0;->u:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_4

    .line 13
    .line 14
    new-instance p1, La/sx3;

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-direct {p1, p3, p2}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance p2, La/ljc0;

    .line 21
    .line 22
    const/16 p3, 0xb

    .line 23
    .line 24
    invoke-direct {p2, p3}, La/ljc0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, La/eoh0;

    .line 32
    .line 33
    const/16 p3, 0x17

    .line 34
    .line 35
    invoke-direct {p2, p3}, La/eoh0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p2, La/bkq;

    .line 43
    .line 44
    invoke-direct {p2, p1}, La/bkq;-><init>(La/ckq;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    :goto_0
    invoke-virtual {p2}, La/bkq;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p2}, La/bkq;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of p3, p1, La/huc0;

    .line 61
    .line 62
    if-eqz p3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    check-cast p3, La/kuc0;

    .line 69
    .line 70
    check-cast p1, La/huc0;

    .line 71
    .line 72
    iget-object p1, p1, La/huc0;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {p3, p1}, La/kuc0;->setLabel(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    instance-of p3, p1, La/iuc0;

    .line 79
    .line 80
    if-eqz p3, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    check-cast p3, La/kuc0;

    .line 87
    .line 88
    check-cast p1, La/iuc0;

    .line 89
    .line 90
    iget-object v1, p1, La/iuc0;->a:La/n0x;

    .line 91
    .line 92
    iget-object v2, p1, La/iuc0;->c:Lkotlin/jvm/functions/Function2;

    .line 93
    .line 94
    iget-object p1, p1, La/iuc0;->d:Lkotlin/jvm/functions/Function1;

    .line 95
    .line 96
    iget-object v3, p0, La/xtc0;->g:La/m0x;

    .line 97
    .line 98
    invoke-interface {p3, v1, v3, v2, p1}, La/kuc0;->b(La/n0x;La/o0x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    return-void

    .line 103
    :cond_4
    invoke-virtual {p0, p1, p2}, La/xtc0;->n(La/xhe0;I)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    iget-object p2, p0, La/xtc0;->h:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const p2, 0x7f140a66

    .line 11
    .line 12
    .line 13
    :goto_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/wtc0;

    .line 23
    .line 24
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget p0, p0, La/xtc0;->f:I

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    const p0, 0x7f0d053d

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const p0, 0x7f0d053e

    .line 37
    .line 38
    .line 39
    :goto_1
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-direct {p2, p0}, La/wtc0;-><init>(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    return-object p2
.end method
