.class public final La/k7q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:La/cgx0;

.field public B:Z

.field public final a:La/q7t0;

.field public b:La/qe60;

.field public c:Lkotlin/jvm/functions/Function1;

.field public d:La/djz;

.field public final e:La/pz40;

.field public f:La/vuu0;

.field public g:Lkotlin/jvm/functions/Function0;

.field public h:La/iuc;

.field public i:La/vne;

.field public j:La/hw90;

.field public k:La/omv;

.field public l:La/cqq;

.field public final m:La/pz40;

.field public final n:La/pz40;

.field public o:J

.field public p:La/o9q0;

.field public q:J

.field public final r:La/pz40;

.field public final s:La/pz40;

.field public t:I

.field public u:La/a8q0;

.field public v:La/cgx0;

.field public w:La/o9q0;

.field public final x:La/pz40;

.field public final y:La/hcp0;

.field public final z:La/i7q0;


# direct methods
.method public constructor <init>(La/q7t0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/k7q0;->a:La/q7t0;

    .line 5
    .line 6
    sget-object p1, La/pwt0;->a:La/cf60;

    .line 7
    .line 8
    iput-object p1, p0, La/k7q0;->b:La/qe60;

    .line 9
    .line 10
    new-instance p1, La/t6q0;

    .line 11
    .line 12
    const/4 v0, 0x7

    .line 13
    invoke-direct {p1, v0}, La/t6q0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/k7q0;->c:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    new-instance p1, La/a8q0;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    invoke-direct {p1, v1, v2, v3, v0}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/k7q0;->e:La/pz40;

    .line 31
    .line 32
    sget-object p1, La/gfk0;->f:La/uuu0;

    .line 33
    .line 34
    iput-object p1, p0, La/k7q0;->f:La/vuu0;

    .line 35
    .line 36
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    iput-object v4, p0, La/k7q0;->m:La/pz40;

    .line 43
    .line 44
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/k7q0;->n:La/pz40;

    .line 49
    .line 50
    iput-wide v2, p0, La/k7q0;->o:J

    .line 51
    .line 52
    iput-wide v2, p0, La/k7q0;->q:J

    .line 53
    .line 54
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/k7q0;->r:La/pz40;

    .line 59
    .line 60
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, La/k7q0;->s:La/pz40;

    .line 65
    .line 66
    const/4 p1, -0x1

    .line 67
    iput p1, p0, La/k7q0;->t:I

    .line 68
    .line 69
    new-instance p1, La/a8q0;

    .line 70
    .line 71
    invoke-direct {p1, v1, v2, v3, v0}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, La/k7q0;->u:La/a8q0;

    .line 75
    .line 76
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, La/k7q0;->x:La/pz40;

    .line 83
    .line 84
    new-instance p1, La/hcp0;

    .line 85
    .line 86
    const/4 v0, 0x2

    .line 87
    invoke-direct {p1, v0}, La/hcp0;-><init>(B)V

    .line 88
    .line 89
    .line 90
    sget-object v0, La/iwq0;->a:La/iwq0;

    .line 91
    .line 92
    iput-object v0, p1, La/hcp0;->c:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p1, p0, La/k7q0;->y:La/hcp0;

    .line 95
    .line 96
    new-instance p1, La/i7q0;

    .line 97
    .line 98
    invoke-direct {p1, p0}, La/i7q0;-><init>(La/k7q0;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, La/k7q0;->z:La/i7q0;

    .line 102
    .line 103
    new-instance p1, La/cgx0;

    .line 104
    .line 105
    invoke-direct {p1, p0}, La/cgx0;-><init>(La/k7q0;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p0, La/k7q0;->A:La/cgx0;

    .line 109
    .line 110
    return-void
.end method

.method public static b(La/j83;J)La/a8q0;
    .locals 2

    .line 1
    new-instance v0, La/a8q0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, La/a8q0;-><init>(La/j83;JLa/o9q0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public final a(Z)La/c4m0;
    .locals 5

    .line 1
    iget-object v0, p0, La/k7q0;->i:La/vne;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v2, La/yne;->d:La/yne;

    .line 7
    .line 8
    new-instance v3, La/din0;

    .line 9
    .line 10
    const/4 v4, 0x4

    .line 11
    invoke-direct {v3, p0, p1, v1, v4}, La/din0;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    invoke-static {v0, v1, v2, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    return-object v1
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, La/k7q0;->i:La/vne;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, La/yne;->d:La/yne;

    .line 6
    .line 7
    new-instance v2, La/z2n0;

    .line 8
    .line 9
    const/16 v3, 0xc

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v2, p0, v4, v3}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    invoke-static {v0, v4, v1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final d(La/ne60;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v0, v0, La/a8q0;->b:J

    .line 6
    .line 7
    invoke-static {v0, v1}, La/o9q0;->c(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, La/k7q0;->d:La/djz;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, La/djz;->d()La/b9q0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, La/k7q0;->b:La/qe60;

    .line 29
    .line 30
    iget-wide v3, p1, La/ne60;->a:J

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    invoke-virtual {v0, v5, v3, v4}, La/b9q0;->b(ZJ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {v2, v0}, La/qe60;->n(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-wide v2, v0, La/a8q0;->b:J

    .line 47
    .line 48
    invoke-static {v2, v3}, La/o9q0;->e(J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    :goto_1
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v0, v0}, La/s7n0;->e(II)J

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    const/4 v0, 0x5

    .line 61
    invoke-static {v2, v1, v3, v4, v0}, La/a8q0;->a(La/a8q0;La/j83;JI)La/a8q0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, La/k7q0;->c:Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    iget-wide v0, v0, La/a8q0;->b:J

    .line 71
    .line 72
    new-instance v2, La/o9q0;

    .line 73
    .line 74
    invoke-direct {v2, v0, v1}, La/o9q0;-><init>(J)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, La/k7q0;->w:La/o9q0;

    .line 78
    .line 79
    :cond_2
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p1, p1, La/a8q0;->a:La/j83;

    .line 86
    .line 87
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-lez p1, :cond_3

    .line 94
    .line 95
    sget-object p1, La/dmv;->c:La/dmv;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    sget-object p1, La/dmv;->a:La/dmv;

    .line 99
    .line 100
    :goto_2
    invoke-virtual {p0, p1}, La/k7q0;->r(La/dmv;)V

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    invoke-virtual {p0, p1}, La/k7q0;->u(Z)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/k7q0;->d:La/djz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/djz;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La/k7q0;->l:La/cqq;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, La/cqq;->a(La/cqq;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/k7q0;->u:La/a8q0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/k7q0;->u(Z)V

    .line 25
    .line 26
    .line 27
    sget-object p1, La/dmv;->b:La/dmv;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/k7q0;->r(La/dmv;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final f()Lkotlin/Pair;
    .locals 6

    .line 1
    invoke-virtual {p0}, La/k7q0;->k()La/j83;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, La/j83;->b:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, La/k7q0;->w:La/o9q0;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-wide v1, v1, La/o9q0;->a:J

    .line 17
    .line 18
    iget-object v3, p0, La/k7q0;->b:La/qe60;

    .line 19
    .line 20
    const/16 v4, 0x20

    .line 21
    .line 22
    shr-long v4, v1, v4

    .line 23
    .line 24
    long-to-int v4, v4

    .line 25
    invoke-interface {v3, v4}, La/qe60;->s(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object p0, p0, La/k7q0;->b:La/qe60;

    .line 30
    .line 31
    const-wide v4, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v1, v4

    .line 37
    long-to-int v1, v1

    .line 38
    invoke-interface {p0, v1}, La/qe60;->s(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {v3, p0}, La/s7n0;->e(II)J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    new-instance p0, Lkotlin/Pair;

    .line 47
    .line 48
    new-instance v3, La/o9q0;

    .line 49
    .line 50
    invoke-direct {v3, v1, v2}, La/o9q0;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public final g()La/ne60;
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->s:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ne60;

    .line 10
    .line 11
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->m:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->n:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final j(Z)J
    .locals 11

    .line 1
    iget-object v0, p0, La/k7q0;->d:La/djz;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-virtual {v0}, La/djz;->d()La/b9q0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_a

    .line 10
    .line 11
    iget-object v0, v0, La/b9q0;->a:La/a9q0;

    .line 12
    .line 13
    iget-object v1, v0, La/a9q0;->b:La/bw40;

    .line 14
    .line 15
    invoke-virtual {p0}, La/k7q0;->k()La/j83;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    iget-object v3, v0, La/a9q0;->a:La/z8q0;

    .line 24
    .line 25
    iget-object v3, v3, La/z8q0;->a:La/j83;

    .line 26
    .line 27
    iget-object v3, v3, La/j83;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    const-wide v2, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-wide v5, v5, La/a8q0;->b:J

    .line 53
    .line 54
    sget v7, La/o9q0;->c:I

    .line 55
    .line 56
    shr-long/2addr v5, v4

    .line 57
    :goto_0
    long-to-int v5, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-wide v5, v5, La/a8q0;->b:J

    .line 60
    .line 61
    sget v7, La/o9q0;->c:I

    .line 62
    .line 63
    and-long/2addr v5, v2

    .line 64
    goto :goto_0

    .line 65
    :goto_1
    iget-object v6, p0, La/k7q0;->b:La/qe60;

    .line 66
    .line 67
    invoke-interface {v6, v5}, La/qe60;->s(I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-virtual {p0}, La/k7q0;->l()La/a8q0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-wide v6, p0, La/a8q0;->b:J

    .line 76
    .line 77
    invoke-static {v6, v7}, La/o9q0;->g(J)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    iget-wide v6, v0, La/a9q0;->c:J

    .line 82
    .line 83
    invoke-virtual {v1, v5}, La/bw40;->d(I)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    iget v9, v1, La/bw40;->f:I

    .line 88
    .line 89
    if-lt v8, v9, :cond_3

    .line 90
    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :cond_3
    const/4 v9, 0x0

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    :cond_4
    if-nez p1, :cond_6

    .line 99
    .line 100
    if-eqz p0, :cond_6

    .line 101
    .line 102
    :cond_5
    move p0, v5

    .line 103
    goto :goto_2

    .line 104
    :cond_6
    add-int/lit8 p0, v5, -0x1

    .line 105
    .line 106
    invoke-static {p0, v9}, Ljava/lang/Math;->max(II)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    :goto_2
    invoke-virtual {v0, p0}, La/a9q0;->a(I)La/xsf0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, v5}, La/a9q0;->j(I)La/xsf0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const/4 v0, 0x1

    .line 119
    if-ne p0, p1, :cond_7

    .line 120
    .line 121
    move p0, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_7
    move p0, v9

    .line 124
    :goto_3
    invoke-virtual {v1, v5}, La/bw40;->k(I)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v1, La/bw40;->a:La/w5z;

    .line 128
    .line 129
    iget-object p1, p1, La/w5z;->a:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p1, La/j83;

    .line 132
    .line 133
    iget-object p1, p1, La/j83;->b:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    iget-object v10, v1, La/bw40;->h:Ljava/util/ArrayList;

    .line 140
    .line 141
    if-ne v5, p1, :cond_8

    .line 142
    .line 143
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    sub-int/2addr p1, v0

    .line 148
    goto :goto_4

    .line 149
    :cond_8
    invoke-static {v5, v10}, La/b8k0;->B(ILjava/util/List;)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    :goto_4
    invoke-virtual {v10, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, La/yn80;

    .line 158
    .line 159
    iget-object v0, p1, La/yn80;->a:La/s03;

    .line 160
    .line 161
    invoke-virtual {p1, v5}, La/yn80;->d(I)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    iget-object v0, v0, La/s03;->d:La/y8q0;

    .line 166
    .line 167
    if-eqz p0, :cond_9

    .line 168
    .line 169
    invoke-virtual {v0, p1, v9}, La/y8q0;->i(IZ)F

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    goto :goto_5

    .line 174
    :cond_9
    invoke-virtual {v0, p1, v9}, La/y8q0;->j(IZ)F

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    :goto_5
    shr-long v9, v6, v4

    .line 179
    .line 180
    long-to-int p1, v9

    .line 181
    int-to-float p1, p1

    .line 182
    const/4 v0, 0x0

    .line 183
    invoke-static {p0, v0, p1}, La/l1e0;->c(FFF)F

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    invoke-virtual {v1, v8}, La/bw40;->b(I)F

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    and-long v5, v6, v2

    .line 192
    .line 193
    long-to-int v1, v5

    .line 194
    int-to-float v1, v1

    .line 195
    invoke-static {p1, v0, v1}, La/l1e0;->c(FFF)F

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    int-to-long v0, p0

    .line 204
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    int-to-long p0, p0

    .line 209
    shl-long/2addr v0, v4

    .line 210
    and-long/2addr p0, v2

    .line 211
    or-long/2addr p0, v0

    .line 212
    return-wide p0

    .line 213
    :cond_a
    :goto_6
    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    return-wide p0
.end method

.method public final k()La/j83;
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->d:La/djz;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/djz;->a:La/hhk;

    .line 6
    .line 7
    iget-object p0, p0, La/hhk;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/j83;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final l()La/a8q0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->e:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/a8q0;

    .line 10
    .line 11
    return-object p0
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object p0, p0, La/k7q0;->y:La/hcp0;

    .line 2
    .line 3
    iget-object p0, p0, La/hcp0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/j5q0;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, La/j5q0;->u:La/c4m0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, La/j5q0;->u:La/c4m0;

    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public final n(La/o9q0;)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-wide v0, p1, La/o9q0;->a:J

    .line 5
    .line 6
    iget-object v3, p0, La/k7q0;->j:La/hw90;

    .line 7
    .line 8
    if-nez v3, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0}, La/k7q0;->k()La/j83;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    iget-object v4, v2, La/j83;->b:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v9, p0, La/k7q0;->b:La/qe60;

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    shr-long v5, v0, v2

    .line 27
    .line 28
    long-to-int v2, v5

    .line 29
    invoke-interface {v9, v2}, La/qe60;->s(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const-wide v5, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v0, v5

    .line 39
    long-to-int v0, v0

    .line 40
    invoke-interface {v9, v0}, La/qe60;->s(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {v2, v0}, La/s7n0;->e(II)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-lez v0, :cond_3

    .line 53
    .line 54
    invoke-static {v5, v6}, La/o9q0;->c(J)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, La/k7q0;->i:La/vne;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    new-instance v2, La/mee;

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    move-object v8, p0

    .line 68
    move-object v7, p1

    .line 69
    invoke-direct/range {v2 .. v10}, La/mee;-><init>(La/hw90;Ljava/lang/String;JLa/o9q0;La/k7q0;La/qe60;La/yje;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x3

    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-static {v0, p1, p1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_0
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    iget-object v0, p0, La/k7q0;->i:La/vne;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, La/yne;->d:La/yne;

    .line 6
    .line 7
    new-instance v2, La/e7q0;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-direct {v2, p0, v3, v4}, La/e7q0;-><init>(La/k7q0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v3, v1, v2, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final p(La/ne60;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->s:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(La/blv;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/k7q0;->r:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(La/dmv;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/k7q0;->d:La/djz;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, La/djz;->a()La/dmv;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, La/djz;->k:La/pz40;

    .line 15
    .line 16
    check-cast p0, La/hgk0;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final s()V
    .locals 7

    .line 1
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v2, v1

    .line 14
    :goto_0
    invoke-static {v0}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :try_start_0
    invoke-virtual {p0}, La/k7q0;->i()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_6

    .line 23
    .line 24
    iget-object v4, p0, La/k7q0;->d:La/djz;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget-object v4, v4, La/djz;->q:La/pz40;

    .line 29
    .line 30
    check-cast v4, La/hgk0;

    .line 31
    .line 32
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-static {v0, v3, v2}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/k7q0;->y:La/hcp0;

    .line 49
    .line 50
    iget-object v0, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/iwq0;

    .line 53
    .line 54
    sget-object v2, La/iwq0;->a:La/iwq0;

    .line 55
    .line 56
    if-eq v0, v2, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const-string v0, "ToolbarRequester is not initialized."

    .line 60
    .line 61
    invoke-static {v0}, La/adx;->c(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object p0, p0, La/hcp0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, La/j5q0;

    .line 67
    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v0, p0, La/j5q0;->u:La/c4m0;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-ne v0, v2, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    sget-object v0, La/e5q0;->b:La/zfn;

    .line 87
    .line 88
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/d5q0;

    .line 93
    .line 94
    if-nez v0, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sget-object v4, La/yne;->d:La/yne;

    .line 102
    .line 103
    new-instance v5, La/kpb0;

    .line 104
    .line 105
    const/16 v6, 0x15

    .line 106
    .line 107
    invoke-direct {v5, p0, v0, v1, v6}, La/kpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v1, v4, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iput-object v0, p0, La/j5q0;->u:La/c4m0;

    .line 115
    .line 116
    :cond_5
    :goto_2
    return-void

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    goto :goto_4

    .line 119
    :cond_6
    :goto_3
    invoke-static {v0, v3, v2}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_4
    invoke-static {v0, v3, v2}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 124
    .line 125
    .line 126
    throw p0
.end method

.method public final t(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/j7q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/j7q0;

    .line 7
    .line 8
    iget v1, v0, La/j7q0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/j7q0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/j7q0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/j7q0;-><init>(La/k7q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/j7q0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/j7q0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/j7q0;->i:La/k7q0;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/k7q0;->h:La/iuc;

    .line 53
    .line 54
    if-eqz p1, :cond_6

    .line 55
    .line 56
    iput-object p0, v0, La/j7q0;->i:La/k7q0;

    .line 57
    .line 58
    iput v4, v0, La/j7q0;->l:I

    .line 59
    .line 60
    instance-of v0, p1, La/zw2;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    check-cast p1, La/zw2;

    .line 65
    .line 66
    iget-object p1, p1, La/zw2;->a:La/c5k;

    .line 67
    .line 68
    invoke-virtual {p1}, La/c5k;->f()Landroid/content/ClipboardManager;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const-string v0, "text/*"

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_4

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/k7q0;->x:La/pz40;

    .line 99
    .line 100
    check-cast p0, La/hgk0;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object p1, La/sre0;->a:La/tre0;

    .line 111
    .line 112
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {p0}, La/sgy;->v()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string p1, "Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received "

    .line 121
    .line 122
    invoke-static {p1, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object v3

    .line 130
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0
.end method

.method public final u(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/k7q0;->d:La/djz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/djz;->l:La/pz40;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v0, La/hgk0;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, La/k7q0;->s()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p0}, La/k7q0;->m()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final v(La/a8q0;JZZLa/w4i0;ZLa/pmv;)J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v4, v0, La/k7q0;->d:La/djz;

    .line 6
    .line 7
    if-eqz v4, :cond_17

    .line 8
    .line 9
    invoke-virtual {v4}, La/djz;->d()La/b9q0;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_e

    .line 16
    .line 17
    :cond_0
    iget-object v5, v0, La/k7q0;->b:La/qe60;

    .line 18
    .line 19
    iget-wide v6, v1, La/a8q0;->b:J

    .line 20
    .line 21
    iget-object v1, v1, La/a8q0;->a:La/j83;

    .line 22
    .line 23
    sget v8, La/o9q0;->c:I

    .line 24
    .line 25
    const/16 v8, 0x20

    .line 26
    .line 27
    shr-long v9, v6, v8

    .line 28
    .line 29
    long-to-int v9, v9

    .line 30
    invoke-interface {v5, v9}, La/qe60;->s(I)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    iget-object v9, v0, La/k7q0;->b:La/qe60;

    .line 35
    .line 36
    const-wide v10, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long v12, v6, v10

    .line 42
    .line 43
    long-to-int v12, v12

    .line 44
    invoke-interface {v9, v12}, La/qe60;->s(I)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-static {v5, v9}, La/s7n0;->e(II)J

    .line 49
    .line 50
    .line 51
    move-result-wide v12

    .line 52
    const/4 v5, 0x0

    .line 53
    move-wide/from16 v14, p2

    .line 54
    .line 55
    invoke-virtual {v4, v5, v14, v15}, La/b9q0;->b(ZJ)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-nez p5, :cond_2

    .line 60
    .line 61
    if-eqz p4, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    shr-long v14, v12, v8

    .line 65
    .line 66
    long-to-int v14, v14

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    :goto_0
    move v14, v9

    .line 69
    :goto_1
    if-eqz p5, :cond_3

    .line 70
    .line 71
    if-eqz p4, :cond_4

    .line 72
    .line 73
    :cond_3
    move-wide v15, v10

    .line 74
    goto :goto_2

    .line 75
    :cond_4
    move-wide v15, v10

    .line 76
    and-long v10, v12, v15

    .line 77
    .line 78
    long-to-int v10, v10

    .line 79
    goto :goto_3

    .line 80
    :goto_2
    move v10, v9

    .line 81
    :goto_3
    iget-object v11, v0, La/k7q0;->v:La/cgx0;

    .line 82
    .line 83
    move/from16 p1, v8

    .line 84
    .line 85
    const/4 v8, -0x1

    .line 86
    if-nez p4, :cond_6

    .line 87
    .line 88
    if-eqz v11, :cond_6

    .line 89
    .line 90
    move-wide/from16 p2, v15

    .line 91
    .line 92
    iget v15, v0, La/k7q0;->t:I

    .line 93
    .line 94
    if-ne v15, v8, :cond_5

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_5
    move v8, v15

    .line 98
    goto :goto_4

    .line 99
    :cond_6
    move-wide/from16 p2, v15

    .line 100
    .line 101
    :goto_4
    iget-object v4, v4, La/b9q0;->a:La/a9q0;

    .line 102
    .line 103
    new-instance v15, La/cgx0;

    .line 104
    .line 105
    if-eqz p4, :cond_7

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    move-object v13, v1

    .line 109
    move-wide/from16 v19, v6

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    new-instance v5, La/u4i0;

    .line 113
    .line 114
    move-wide/from16 v17, v12

    .line 115
    .line 116
    new-instance v12, La/t4i0;

    .line 117
    .line 118
    move-wide/from16 v19, v6

    .line 119
    .line 120
    shr-long v6, v17, p1

    .line 121
    .line 122
    long-to-int v6, v6

    .line 123
    invoke-static {v4, v6}, La/pzw;->J(La/a9q0;I)La/xsf0;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    move-object v13, v1

    .line 128
    const-wide/16 v0, 0x1

    .line 129
    .line 130
    invoke-direct {v12, v7, v6, v0, v1}, La/t4i0;-><init>(La/xsf0;IJ)V

    .line 131
    .line 132
    .line 133
    new-instance v6, La/t4i0;

    .line 134
    .line 135
    and-long v0, v17, p2

    .line 136
    .line 137
    long-to-int v0, v0

    .line 138
    invoke-static {v4, v0}, La/pzw;->J(La/a9q0;I)La/xsf0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-wide/16 v2, 0x1

    .line 143
    .line 144
    invoke-direct {v6, v1, v0, v2, v3}, La/t4i0;-><init>(La/xsf0;IJ)V

    .line 145
    .line 146
    .line 147
    invoke-static/range {v17 .. v18}, La/o9q0;->g(J)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-direct {v5, v12, v6, v0}, La/u4i0;-><init>(La/t4i0;La/t4i0;Z)V

    .line 152
    .line 153
    .line 154
    move-object v12, v5

    .line 155
    :goto_5
    new-instance v0, La/hu5;

    .line 156
    .line 157
    invoke-direct {v0, v14, v10, v8, v4}, La/hu5;-><init>(IIILa/a9q0;)V

    .line 158
    .line 159
    .line 160
    const/16 v1, 0xd

    .line 161
    .line 162
    move/from16 v2, p5

    .line 163
    .line 164
    invoke-direct {v15, v2, v12, v0, v1}, La/cgx0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    if-eqz v12, :cond_9

    .line 168
    .line 169
    if-eqz v11, :cond_9

    .line 170
    .line 171
    iget-boolean v0, v11, La/cgx0;->b:Z

    .line 172
    .line 173
    if-ne v2, v0, :cond_9

    .line 174
    .line 175
    iget-object v0, v11, La/cgx0;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, La/hu5;

    .line 178
    .line 179
    iget v1, v0, La/hu5;->b:I

    .line 180
    .line 181
    if-ne v14, v1, :cond_9

    .line 182
    .line 183
    iget v0, v0, La/hu5;->c:I

    .line 184
    .line 185
    if-eq v10, v0, :cond_8

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_8
    move-wide/from16 v3, v19

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    :goto_6
    move-object/from16 v0, p0

    .line 192
    .line 193
    iput-object v15, v0, La/k7q0;->v:La/cgx0;

    .line 194
    .line 195
    iput v9, v0, La/k7q0;->t:I

    .line 196
    .line 197
    move-object/from16 v1, p6

    .line 198
    .line 199
    invoke-interface {v1, v15}, La/w4i0;->a(La/cgx0;)La/u4i0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-object v2, v0, La/k7q0;->b:La/qe60;

    .line 204
    .line 205
    iget-object v3, v1, La/u4i0;->a:La/t4i0;

    .line 206
    .line 207
    iget v3, v3, La/t4i0;->b:I

    .line 208
    .line 209
    invoke-interface {v2, v3}, La/qe60;->n(I)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    iget-object v3, v0, La/k7q0;->b:La/qe60;

    .line 214
    .line 215
    iget-object v1, v1, La/u4i0;->b:La/t4i0;

    .line 216
    .line 217
    iget v1, v1, La/t4i0;->b:I

    .line 218
    .line 219
    invoke-interface {v3, v1}, La/qe60;->n(I)I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-static {v2, v1}, La/s7n0;->e(II)J

    .line 224
    .line 225
    .line 226
    move-result-wide v1

    .line 227
    move-wide/from16 v3, v19

    .line 228
    .line 229
    invoke-static {v1, v2, v3, v4}, La/o9q0;->b(JJ)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_a

    .line 234
    .line 235
    :goto_7
    return-wide v3

    .line 236
    :cond_a
    invoke-static {v1, v2}, La/o9q0;->g(J)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    invoke-static {v3, v4}, La/o9q0;->g(J)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    const/4 v7, 0x1

    .line 245
    if-eq v5, v6, :cond_b

    .line 246
    .line 247
    and-long v5, v1, p2

    .line 248
    .line 249
    long-to-int v5, v5

    .line 250
    shr-long v8, v1, p1

    .line 251
    .line 252
    long-to-int v6, v8

    .line 253
    invoke-static {v5, v6}, La/s7n0;->e(II)J

    .line 254
    .line 255
    .line 256
    move-result-wide v5

    .line 257
    invoke-static {v5, v6, v3, v4}, La/o9q0;->b(JJ)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_b

    .line 262
    .line 263
    move v5, v7

    .line 264
    goto :goto_8

    .line 265
    :cond_b
    const/4 v5, 0x0

    .line 266
    :goto_8
    invoke-static {v1, v2}, La/o9q0;->c(J)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    if-eqz v6, :cond_c

    .line 271
    .line 272
    invoke-static {v3, v4}, La/o9q0;->c(J)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_c

    .line 277
    .line 278
    move v3, v7

    .line 279
    goto :goto_9

    .line 280
    :cond_c
    const/4 v3, 0x0

    .line 281
    :goto_9
    if-eqz p7, :cond_d

    .line 282
    .line 283
    iget-object v4, v13, La/j83;->b:Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-lez v4, :cond_d

    .line 290
    .line 291
    if-nez v5, :cond_d

    .line 292
    .line 293
    if-nez v3, :cond_d

    .line 294
    .line 295
    if-eqz p8, :cond_d

    .line 296
    .line 297
    iget-object v3, v0, La/k7q0;->k:La/omv;

    .line 298
    .line 299
    if-eqz v3, :cond_d

    .line 300
    .line 301
    move-object/from16 v4, p8

    .line 302
    .line 303
    iget-byte v4, v4, La/pmv;->a:B

    .line 304
    .line 305
    check-cast v3, La/tv90;

    .line 306
    .line 307
    invoke-virtual {v3, v4}, La/tv90;->a(I)V

    .line 308
    .line 309
    .line 310
    :cond_d
    invoke-static {v13, v1, v2}, La/k7q0;->b(La/j83;J)La/a8q0;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    iget-object v4, v0, La/k7q0;->c:Lkotlin/jvm/functions/Function1;

    .line 315
    .line 316
    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    new-instance v3, La/o9q0;

    .line 320
    .line 321
    invoke-direct {v3, v1, v2}, La/o9q0;-><init>(J)V

    .line 322
    .line 323
    .line 324
    iput-object v3, v0, La/k7q0;->w:La/o9q0;

    .line 325
    .line 326
    if-nez p7, :cond_e

    .line 327
    .line 328
    invoke-static {v1, v2}, La/o9q0;->c(J)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    xor-int/2addr v3, v7

    .line 333
    invoke-virtual {v0, v3}, La/k7q0;->u(Z)V

    .line 334
    .line 335
    .line 336
    :cond_e
    iget-object v3, v0, La/k7q0;->d:La/djz;

    .line 337
    .line 338
    if-eqz v3, :cond_f

    .line 339
    .line 340
    iget-object v3, v3, La/djz;->q:La/pz40;

    .line 341
    .line 342
    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    check-cast v3, La/hgk0;

    .line 347
    .line 348
    invoke-virtual {v3, v4}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_f
    iget-object v3, v0, La/k7q0;->d:La/djz;

    .line 352
    .line 353
    if-eqz v3, :cond_11

    .line 354
    .line 355
    invoke-static {v1, v2}, La/o9q0;->c(J)Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-nez v4, :cond_10

    .line 360
    .line 361
    invoke-static {v0, v7}, La/cvm0;->k(La/k7q0;Z)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-eqz v4, :cond_10

    .line 366
    .line 367
    move v4, v7

    .line 368
    goto :goto_a

    .line 369
    :cond_10
    const/4 v4, 0x0

    .line 370
    :goto_a
    iget-object v3, v3, La/djz;->m:La/pz40;

    .line 371
    .line 372
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    check-cast v3, La/hgk0;

    .line 377
    .line 378
    invoke-virtual {v3, v4}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_11
    iget-object v3, v0, La/k7q0;->d:La/djz;

    .line 382
    .line 383
    if-eqz v3, :cond_14

    .line 384
    .line 385
    invoke-static {v1, v2}, La/o9q0;->c(J)Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-nez v4, :cond_12

    .line 390
    .line 391
    const/4 v4, 0x0

    .line 392
    invoke-static {v0, v4}, La/cvm0;->k(La/k7q0;Z)Z

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    if-eqz v5, :cond_13

    .line 397
    .line 398
    move v5, v7

    .line 399
    goto :goto_b

    .line 400
    :cond_12
    const/4 v4, 0x0

    .line 401
    :cond_13
    move v5, v4

    .line 402
    :goto_b
    iget-object v3, v3, La/djz;->n:La/pz40;

    .line 403
    .line 404
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    check-cast v3, La/hgk0;

    .line 409
    .line 410
    invoke-virtual {v3, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    goto :goto_c

    .line 414
    :cond_14
    const/4 v4, 0x0

    .line 415
    :goto_c
    iget-object v3, v0, La/k7q0;->d:La/djz;

    .line 416
    .line 417
    if-eqz v3, :cond_16

    .line 418
    .line 419
    invoke-static {v1, v2}, La/o9q0;->c(J)Z

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    if-eqz v5, :cond_15

    .line 424
    .line 425
    invoke-static {v0, v7}, La/cvm0;->k(La/k7q0;Z)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_15

    .line 430
    .line 431
    move v5, v7

    .line 432
    goto :goto_d

    .line 433
    :cond_15
    move v5, v4

    .line 434
    :goto_d
    iget-object v0, v3, La/djz;->o:La/pz40;

    .line 435
    .line 436
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    check-cast v0, La/hgk0;

    .line 441
    .line 442
    invoke-virtual {v0, v3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_16
    return-wide v1

    .line 446
    :cond_17
    :goto_e
    sget-wide v0, La/o9q0;->b:J

    .line 447
    .line 448
    return-wide v0
.end method
