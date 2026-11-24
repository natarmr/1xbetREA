.class public final La/o4s;
.super La/q4;
.source "SourceFile"


# static fields
.field public static final i:La/ek5;


# instance fields
.field public final f:La/g5s;

.field public final g:La/o0x;

.field public h:La/xdr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/o4s;->i:La/ek5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/g5s;La/o0x;La/xdr;)V
    .locals 1

    .line 1
    sget-object v0, La/o4s;->i:La/ek5;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/o4s;->f:La/g5s;

    .line 7
    .line 8
    iput-object p2, p0, La/o4s;->g:La/o0x;

    .line 9
    .line 10
    iput-object p3, p0, La/o4s;->h:La/xdr;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final n(La/xhe0;I)V
    .locals 7

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/n4s;

    .line 3
    .line 4
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    move-object v2, p1

    .line 9
    check-cast v2, La/u4s;

    .line 10
    .line 11
    iget-object p1, v4, La/n4s;->u:La/s4s;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2}, La/s4s;->setModel(La/u4s;)V

    .line 17
    .line 18
    .line 19
    sget-object v6, La/ymx;->i:La/ymx;

    .line 20
    .line 21
    new-instance v0, La/ec3;

    .line 22
    .line 23
    const/4 v5, 0x7

    .line 24
    move-object v1, p0

    .line 25
    move v3, p2

    .line 26
    invoke-direct/range {v0 .. v5}, La/ec3;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v6, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 8

    .line 1
    check-cast p1, La/n4s;

    .line 2
    .line 3
    iget-object v0, p1, La/n4s;->u:La/s4s;

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
    if-nez v1, :cond_5

    .line 13
    .line 14
    new-instance p0, La/sx3;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-direct {p0, p3, p1}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/dcr;

    .line 21
    .line 22
    const/16 p2, 0xe

    .line 23
    .line 24
    invoke-direct {p1, p2}, La/dcr;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, La/eoh0;

    .line 32
    .line 33
    const/16 p2, 0x17

    .line 34
    .line 35
    invoke-direct {p1, p2}, La/eoh0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, p1}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p1, La/bkq;

    .line 43
    .line 44
    invoke-direct {p1, p0}, La/bkq;-><init>(La/ckq;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    :goto_0
    invoke-virtual {p1}, La/bkq;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, La/bkq;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-nez p0, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of p2, p0, La/y4s;

    .line 61
    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    check-cast p0, La/y4s;

    .line 65
    .line 66
    iget-object p0, p0, La/y4s;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, La/s4s;->setLabel(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    instance-of p2, p0, La/z4s;

    .line 73
    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    check-cast p0, La/z4s;

    .line 77
    .line 78
    iget-object v3, p0, La/z4s;->c:La/o0x;

    .line 79
    .line 80
    iget-object v4, p0, La/z4s;->d:La/o0x;

    .line 81
    .line 82
    iget-object v1, p0, La/z4s;->a:La/o0x;

    .line 83
    .line 84
    iget-object v2, p0, La/z4s;->b:La/o0x;

    .line 85
    .line 86
    iget-object v5, p0, La/z4s;->e:La/v4s;

    .line 87
    .line 88
    iget-object v6, p0, La/z4s;->f:Lkotlin/jvm/functions/Function2;

    .line 89
    .line 90
    iget-object v7, p0, La/z4s;->g:La/ljc0;

    .line 91
    .line 92
    invoke-virtual/range {v0 .. v7}, La/s4s;->a(La/o0x;La/o0x;La/o0x;La/o0x;La/v4s;Lkotlin/jvm/functions/Function2;La/ljc0;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    instance-of p2, p0, La/x4s;

    .line 97
    .line 98
    if-eqz p2, :cond_0

    .line 99
    .line 100
    check-cast p0, La/x4s;

    .line 101
    .line 102
    iget-object p0, p0, La/x4s;->a:La/v4s;

    .line 103
    .line 104
    invoke-virtual {v0, p0}, La/s4s;->setType(La/v4s;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    return-void

    .line 109
    :cond_5
    invoke-virtual {p0, p1, p2}, La/o4s;->n(La/xhe0;I)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    new-instance p2, La/n4s;

    .line 2
    .line 3
    new-instance v0, La/s4s;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, La/o4s;->f:La/g5s;

    .line 13
    .line 14
    iget-object p0, p0, La/o4s;->g:La/o0x;

    .line 15
    .line 16
    invoke-direct {v0, p1, v1, p0}, La/s4s;-><init>(Landroid/content/Context;La/g5s;La/o0x;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p2, v0}, La/n4s;-><init>(La/s4s;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
