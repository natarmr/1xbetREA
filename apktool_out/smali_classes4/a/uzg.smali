.class public final La/uzg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hzg;


# instance fields
.field public final a:La/oeg0;

.field public final b:La/vqc;

.field public final c:La/ih5;

.field public final d:La/vqc;

.field public final e:La/yfm0;

.field public final f:La/gr00;

.field public final g:La/nv20;

.field public final h:La/y3v;

.field public final i:La/grj;

.field public final j:La/y9g;


# direct methods
.method public constructor <init>(La/oeg0;La/vqc;La/ih5;La/vqc;La/r9u;La/gle0;La/yfm0;La/gr00;La/nv20;La/y3v;La/uzc0;La/grj;La/y9g;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/uzg;->a:La/oeg0;

    .line 14
    .line 15
    iput-object p2, p0, La/uzg;->b:La/vqc;

    .line 16
    .line 17
    iput-object p3, p0, La/uzg;->c:La/ih5;

    .line 18
    .line 19
    iput-object p4, p0, La/uzg;->d:La/vqc;

    .line 20
    .line 21
    iput-object p7, p0, La/uzg;->e:La/yfm0;

    .line 22
    .line 23
    iput-object p8, p0, La/uzg;->f:La/gr00;

    .line 24
    .line 25
    iput-object p9, p0, La/uzg;->g:La/nv20;

    .line 26
    .line 27
    iput-object p10, p0, La/uzg;->h:La/y3v;

    .line 28
    .line 29
    iput-object p12, p0, La/uzg;->i:La/grj;

    .line 30
    .line 31
    iput-object p13, p0, La/uzg;->j:La/y9g;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object p0, p0, La/uzg;->a:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/c8d;

    .line 12
    .line 13
    sget-object v2, La/y7d;->a:La/v7d;

    .line 14
    .line 15
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v1, v0

    .line 26
    check-cast v1, La/paw;

    .line 27
    .line 28
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/oe50;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public final b(Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, La/uzg;->j:La/y9g;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, Lorg/xplatform/cyber/calendar/impl/navigation/CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lorg/xplatform/cyber/calendar/impl/navigation/CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1;-><init>(Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;)V

    .line 19
    .line 20
    .line 21
    instance-of p1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    new-instance p1, La/e1w0;

    .line 26
    .line 27
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 28
    .line 29
    invoke-direct {p1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/c8d;

    .line 33
    .line 34
    sget-object v2, La/y7d;->a:La/v7d;

    .line 35
    .line 36
    invoke-direct {p0, v2, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, La/w0w0;

    .line 44
    .line 45
    invoke-direct {p1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, La/c8d;

    .line 49
    .line 50
    sget-object v2, La/y7d;->a:La/v7d;

    .line 51
    .line 52
    invoke-direct {p0, v2, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :goto_0
    const/4 p0, 0x0

    .line 59
    invoke-static {v0, v1, p0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :goto_1
    move-object p1, p0

    .line 64
    check-cast p1, La/paw;

    .line 65
    .line 66
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, La/oe50;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    return-void
.end method

.method public final c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/mz0;

    .line 11
    .line 12
    const/16 v6, 0xd

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-wide v3, p1

    .line 16
    move-object v5, p3

    .line 17
    invoke-direct/range {v1 .. v6}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, La/mz0;

    .line 24
    .line 25
    invoke-direct {p0, v3, v4, v5, p4}, La/mz0;-><init>(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p1, v2, La/uzg;->d:La/vqc;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, La/vqc;->k(La/m1g;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final d(ILjava/util/List;Z)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/gc0;

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    move-object v2, p0

    .line 14
    move v5, p1

    .line 15
    move-object v3, p2

    .line 16
    move v4, p3

    .line 17
    invoke-direct/range {v1 .. v6}, La/gc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIB)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final e(IJJZ)V
    .locals 9

    .line 1
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/tzg;

    .line 8
    .line 9
    move-object v2, p0

    .line 10
    move v8, p1

    .line 11
    move-wide v3, p2

    .line 12
    move-wide v5, p4

    .line 13
    move v7, p6

    .line 14
    invoke-direct/range {v1 .. v8}, La/tzg;-><init>(La/uzg;JJZI)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final f(Ljava/lang/String;JJI)V
    .locals 9

    .line 1
    sget-object v0, La/k1g;->b:La/k1g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/qzg;

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-object v5, p1

    .line 16
    move-wide v6, p2

    .line 17
    move-wide v3, p4

    .line 18
    move v8, p6

    .line 19
    invoke-direct/range {v1 .. v8}, La/qzg;-><init>(La/uzg;JLjava/lang/String;JI)V

    .line 20
    .line 21
    .line 22
    move p1, v8

    .line 23
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/rzg;

    .line 27
    .line 28
    invoke-direct/range {p0 .. p5}, La/rzg;-><init>(IJJ)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object p1, v2, La/uzg;->d:La/vqc;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/vqc;->k(La/m1g;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    new-instance v0, La/vlf;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/vlf;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, La/uzg;->d:La/vqc;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/vqc;->k(La/m1g;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$hltvAwardsScreen$1;

    .line 28
    .line 29
    iget-object p0, p0, La/uzg;->b:La/vqc;

    .line 30
    .line 31
    invoke-direct {v2, p0}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$hltvAwardsScreen$1;-><init>(La/vqc;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 35
    .line 36
    .line 37
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {v0, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    move-object v1, p0

    .line 45
    check-cast v1, La/paw;

    .line 46
    .line 47
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, La/oe50;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
.end method

.method public final h(Ljava/lang/String;IJ)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/zz0;

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    move-object v2, p0

    .line 28
    move-object v3, p1

    .line 29
    move v6, p2

    .line 30
    move-wide v4, p3

    .line 31
    invoke-direct/range {v1 .. v7}, La/zz0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;JIB)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/vlf;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/vlf;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/uzg;->d:La/vqc;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/vqc;->k(La/m1g;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/szg;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, p0, p1, v2}, La/szg;-><init>(La/uzg;Ljava/lang/String;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final j(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/g18;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, p2, p1, v2}, La/g18;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final k(IJLjava/util/List;Z)V
    .locals 8

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/mzg;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move v3, p1

    .line 14
    move-wide v4, p2

    .line 15
    move-object v7, p4

    .line 16
    move v6, p5

    .line 17
    invoke-direct/range {v1 .. v7}, La/mzg;-><init>(La/uzg;IJZLjava/util/List;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final l(JJLjava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/jzg;

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    move-object v2, p0

    .line 14
    move-wide v4, p1

    .line 15
    move-wide v6, p3

    .line 16
    move-object v3, p5

    .line 17
    invoke-direct/range {v1 .. v8}, La/jzg;-><init>(La/uzg;Ljava/lang/String;JJB)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/szg;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, p1, v2}, La/szg;-><init>(La/uzg;Ljava/lang/String;B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final n(JJLjava/lang/String;La/k1g;)V
    .locals 8

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/jzg;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move-wide v3, p1

    .line 14
    move-wide v5, p3

    .line 15
    move-object v7, p5

    .line 16
    invoke-direct/range {v1 .. v7}, La/jzg;-><init>(La/uzg;JJLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, La/qi4;

    .line 23
    .line 24
    const/4 p1, 0x5

    .line 25
    invoke-direct {p0, v3, v4, p6, p1}, La/qi4;-><init>(JLjava/io/Serializable;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p1, v2, La/uzg;->d:La/vqc;

    .line 33
    .line 34
    invoke-virtual {p1, p0}, La/vqc;->k(La/m1g;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final o(JLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object p0, p0, La/uzg;->h:La/y3v;

    .line 15
    .line 16
    long-to-int p1, p1

    .line 17
    invoke-virtual {p0, p1, p3}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 22
    .line 23
    .line 24
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {v0, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    move-object p1, p0

    .line 32
    check-cast p1, La/paw;

    .line 33
    .line 34
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/oe50;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method public final p(JJJJLjava/lang/String;Z)V
    .locals 13

    .line 1
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uzg;->a:La/oeg0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, La/rp7;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move-wide v3, p1

    .line 14
    move-wide/from16 v6, p3

    .line 15
    .line 16
    move-wide/from16 v8, p5

    .line 17
    .line 18
    move-wide/from16 v11, p7

    .line 19
    .line 20
    move-object/from16 v5, p9

    .line 21
    .line 22
    move/from16 v10, p10

    .line 23
    .line 24
    invoke-direct/range {v1 .. v12}, La/rp7;-><init>(La/uzg;JLjava/lang/String;JJZJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final q(IJJ)V
    .locals 9

    .line 1
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, La/uzg;->a:La/oeg0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/kzg;

    .line 22
    .line 23
    move-object v2, p0

    .line 24
    move v7, p1

    .line 25
    move-wide v3, p2

    .line 26
    move-wide v5, p4

    .line 27
    invoke-direct/range {v1 .. v7}, La/kzg;-><init>(La/uzg;JJI)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    move-object v2, p0

    .line 35
    move-wide v3, p2

    .line 36
    move-wide v5, p4

    .line 37
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    move-wide v6, v5

    .line 42
    move-wide v4, v3

    .line 43
    move-object v3, v2

    .line 44
    new-instance v2, La/qp7;

    .line 45
    .line 46
    const/4 v8, 0x1

    .line 47
    invoke-direct/range {v2 .. v8}, La/qp7;-><init>(Ljava/lang/Object;JJB)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
