.class public final La/m660;
.super La/jlc;
.source "SourceFile"


# instance fields
.field public final g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:La/dmc;


# direct methods
.method public constructor <init>(La/eu00;La/vlc;La/g950;ZI)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/gmk0;->x0:La/gne0;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, La/jlc;-><init>(La/eu00;La/vjj;La/g950;La/gmk0;)V

    .line 10
    .line 11
    .line 12
    iput-boolean p4, p0, La/m660;->g:Z

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {p2, p5}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    new-instance p3, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 p4, 0xa

    .line 22
    .line 23
    invoke-static {p2, p4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :goto_0
    move-object p4, p2

    .line 35
    check-cast p4, La/kkx;

    .line 36
    .line 37
    iget-boolean p4, p4, La/kkx;->c:Z

    .line 38
    .line 39
    if-eqz p4, :cond_0

    .line 40
    .line 41
    move-object p4, p2

    .line 42
    check-cast p4, La/bkx;

    .line 43
    .line 44
    invoke-virtual {p4}, La/bkx;->nextInt()I

    .line 45
    .line 46
    .line 47
    move-result p4

    .line 48
    sget-object p5, La/t3u0;->c:La/t3u0;

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "T"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {p0, p5, v0, p4, p1}, La/izs0;->s1(La/h1;La/t3u0;La/g950;ILa/eu00;)La/izs0;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iput-object p3, p0, La/m660;->h:Ljava/util/ArrayList;

    .line 77
    .line 78
    new-instance p2, La/dmc;

    .line 79
    .line 80
    invoke-static {p0}, La/nsm0;->o(La/goc;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    sget p4, La/rek;->a:I

    .line 85
    .line 86
    invoke-static {p0}, La/oek;->c(La/vjj;)La/ym40;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-interface {p4}, La/ym40;->c()La/ary;

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    invoke-virtual {p4}, La/ary;->e()La/kzj0;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    invoke-static {p4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    check-cast p4, Ljava/util/Collection;

    .line 106
    .line 107
    invoke-direct {p2, p0, p3, p4, p1}, La/dmc;-><init>(La/wm40;Ljava/util/List;Ljava/util/Collection;La/eu00;)V

    .line 108
    .line 109
    .line 110
    iput-object p2, p0, La/m660;->i:La/dmc;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/m660;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final U()La/cr30;
    .locals 0

    .line 1
    sget-object p0, La/br30;->b:La/br30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    sget-object p0, La/ujn;->c:La/f93;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()La/tek;
    .locals 0

    .line 1
    sget-object p0, La/uek;->e:La/tek;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final h()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m660;->i:La/dmc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/m660;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0(La/cty;)La/cr30;
    .locals 0

    .line 1
    sget-object p0, La/br30;->b:La/br30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()La/gm40;
    .locals 0

    .line 1
    sget-object p0, La/gm40;->b:La/gm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m0()La/flc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n0()La/k2u0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final p0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final r()La/slc;
    .locals 0

    .line 1
    sget-object p0, La/slc;->a:La/slc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/h1;->getName()La/g950;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, " (not found)"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
