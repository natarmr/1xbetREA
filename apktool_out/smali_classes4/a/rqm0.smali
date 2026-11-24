.class public final La/rqm0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final c:La/hzg;

.field public final d:La/n2u;

.field public final e:La/duj;

.field public final f:La/ih5;

.field public final g:La/zr1;

.field public final h:La/g2v;

.field public final i:La/m1e;

.field public final j:La/mne;

.field public final k:La/lrc;

.field public final l:La/rpt;

.field public final m:La/hvt;

.field public final n:La/poq0;

.field public final o:La/q8u;

.field public final p:La/cyg0;

.field public final q:La/pru;

.field public final r:La/p7m0;

.field public s:La/da10;

.field public t:Ljava/util/ArrayList;

.field public u:La/bby;

.field public v:La/c4m0;

.field public final w:La/ol60;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/hzg;La/n2u;La/duj;La/ih5;La/zr1;La/g2v;La/m1e;La/mne;La/lrc;La/rpt;La/hvt;La/poq0;La/q8u;La/cyg0;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/rqm0;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 8
    .line 9
    iput-object p2, p0, La/rqm0;->c:La/hzg;

    .line 10
    .line 11
    iput-object p3, p0, La/rqm0;->d:La/n2u;

    .line 12
    .line 13
    iput-object p4, p0, La/rqm0;->e:La/duj;

    .line 14
    .line 15
    iput-object p5, p0, La/rqm0;->f:La/ih5;

    .line 16
    .line 17
    iput-object p6, p0, La/rqm0;->g:La/zr1;

    .line 18
    .line 19
    iput-object p7, p0, La/rqm0;->h:La/g2v;

    .line 20
    .line 21
    iput-object p8, p0, La/rqm0;->i:La/m1e;

    .line 22
    .line 23
    iput-object p9, p0, La/rqm0;->j:La/mne;

    .line 24
    .line 25
    iput-object p10, p0, La/rqm0;->k:La/lrc;

    .line 26
    .line 27
    iput-object p11, p0, La/rqm0;->l:La/rpt;

    .line 28
    .line 29
    iput-object p12, p0, La/rqm0;->m:La/hvt;

    .line 30
    .line 31
    iput-object p13, p0, La/rqm0;->n:La/poq0;

    .line 32
    .line 33
    iput-object p14, p0, La/rqm0;->o:La/q8u;

    .line 34
    .line 35
    iput-object p15, p0, La/rqm0;->p:La/cyg0;

    .line 36
    .line 37
    move-object/from16 p1, p16

    .line 38
    .line 39
    iput-object p1, p0, La/rqm0;->q:La/pru;

    .line 40
    .line 41
    sget-object p1, La/kqm0;->a:La/kqm0;

    .line 42
    .line 43
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/rqm0;->r:La/p7m0;

    .line 48
    .line 49
    sget-object p1, La/da10;->c:La/da10;

    .line 50
    .line 51
    iput-object p1, p0, La/rqm0;->s:La/da10;

    .line 52
    .line 53
    new-instance p1, La/ol60;

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    sget-object p3, La/i99;->b:La/i99;

    .line 57
    .line 58
    invoke-direct {p1, p2, p3}, La/ol60;-><init>(ILa/i99;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, La/rqm0;->w:La/ol60;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, La/rqm0;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/iun;->a:La/iun;

    .line 6
    .line 7
    :cond_0
    iget-object p0, p0, La/rqm0;->k:La/lrc;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, La/lrc;->y(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-object v0, p0, La/rqm0;->v:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, La/rqm0;->i:La/m1e;

    .line 10
    .line 11
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v2, La/pqm0;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, p0, v1, v3}, La/pqm0;-><init>(La/rqm0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/fnq;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-direct {v1, v0, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p0, La/rqm0;->j:La/mne;

    .line 32
    .line 33
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 34
    .line 35
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v1, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/rqm0;->v:La/c4m0;

    .line 44
    .line 45
    return-void
.end method

.method public final x()V
    .locals 14

    .line 1
    :cond_0
    iget-object v0, p0, La/rqm0;->r:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/lqm0;

    .line 9
    .line 10
    new-instance v2, La/iqm0;

    .line 11
    .line 12
    const-wide/16 v3, -0x1

    .line 13
    .line 14
    sget-object v5, La/pb10;->v:La/pb10;

    .line 15
    .line 16
    invoke-static {v3, v4, v5}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    const/4 v12, 0x0

    .line 21
    const/16 v13, 0x15e

    .line 22
    .line 23
    iget-object v6, p0, La/rqm0;->h:La/g2v;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    const v10, 0x7f130677

    .line 28
    .line 29
    .line 30
    const v11, 0x7f131690

    .line 31
    .line 32
    .line 33
    invoke-static/range {v6 .. v13}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, p0, La/rqm0;->s:La/da10;

    .line 38
    .line 39
    iget-short v4, v4, La/da10;->a:S

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    invoke-direct {v2, v3, v4, v5}, La/iqm0;-><init>(La/jkm;J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    sget-object v0, La/da10;->b:La/da10;

    .line 52
    .line 53
    iput-object v0, p0, La/rqm0;->s:La/da10;

    .line 54
    .line 55
    iget-object p0, p0, La/rqm0;->u:La/bby;

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final y(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, La/rqm0;->r:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/lqm0;

    .line 9
    .line 10
    new-instance v2, La/jqm0;

    .line 11
    .line 12
    invoke-direct {v2, p1}, La/jqm0;-><init>(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v1, 0xa

    .line 24
    .line 25
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/cqm0;

    .line 47
    .line 48
    iget v1, v1, La/cqm0;->a:I

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iput-object v0, p0, La/rqm0;->t:Ljava/util/ArrayList;

    .line 59
    .line 60
    return-void
.end method

.method public final z(La/da10;)V
    .locals 3

    .line 1
    iput-object p1, p0, La/rqm0;->s:La/da10;

    .line 2
    .line 3
    iget-object p1, p0, La/rqm0;->r:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/iqm0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/iqm0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, La/rqm0;->s:La/da10;

    .line 20
    .line 21
    iget-short p0, p0, La/da10;->a:S

    .line 22
    .line 23
    int-to-long v1, p0

    .line 24
    iget-object p0, v0, La/iqm0;->a:La/jkm;

    .line 25
    .line 26
    new-instance v0, La/iqm0;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1, v2}, La/iqm0;-><init>(La/jkm;J)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    move-object v1, p0

    .line 36
    check-cast v1, La/lqm0;

    .line 37
    .line 38
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    :cond_2
    return-void
.end method
