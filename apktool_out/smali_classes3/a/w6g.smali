.class public final La/w6g;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/m1e;

.field public final c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

.field public final d:Z

.field public final e:La/fhj;

.field public final f:La/b3u;

.field public final g:La/y1u;

.field public final h:La/y1u;

.field public final i:La/g2v;

.field public final j:La/mne;

.field public final k:La/duj;

.field public final l:La/j3c;

.field public final m:La/p7m0;

.field public final n:La/p7m0;

.field public final o:La/p7m0;

.field public p:La/da10;

.field public q:La/c5g;

.field public r:La/c4m0;

.field public s:La/bby;

.field public t:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;La/m1e;Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;ZLa/fhj;La/b3u;La/y1u;La/y1u;La/g2v;La/mne;La/duj;La/j3c;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/w6g;->b:La/m1e;

    .line 8
    .line 9
    iput-object p3, p0, La/w6g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;

    .line 10
    .line 11
    iput-boolean p4, p0, La/w6g;->d:Z

    .line 12
    .line 13
    iput-object p5, p0, La/w6g;->e:La/fhj;

    .line 14
    .line 15
    iput-object p6, p0, La/w6g;->f:La/b3u;

    .line 16
    .line 17
    iput-object p7, p0, La/w6g;->g:La/y1u;

    .line 18
    .line 19
    iput-object p8, p0, La/w6g;->h:La/y1u;

    .line 20
    .line 21
    iput-object p9, p0, La/w6g;->i:La/g2v;

    .line 22
    .line 23
    iput-object p10, p0, La/w6g;->j:La/mne;

    .line 24
    .line 25
    iput-object p11, p0, La/w6g;->k:La/duj;

    .line 26
    .line 27
    iput-object p12, p0, La/w6g;->l:La/j3c;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/w6g;->m:La/p7m0;

    .line 36
    .line 37
    sget-object p1, La/o6g;->a:La/o6g;

    .line 38
    .line 39
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/w6g;->n:La/p7m0;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/w6g;->o:La/p7m0;

    .line 51
    .line 52
    sget-object p1, La/da10;->c:La/da10;

    .line 53
    .line 54
    iput-object p1, p0, La/w6g;->p:La/da10;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 10

    .line 1
    new-instance v0, La/n6g;

    .line 2
    .line 3
    iget-boolean v1, p0, La/w6g;->d:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, La/pb10;->r:La/pb10;

    .line 8
    .line 9
    :goto_0
    move-object v3, v1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-wide/16 v1, -0x1

    .line 12
    .line 13
    sget-object v3, La/pb10;->v:La/pb10;

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0x15e

    .line 22
    .line 23
    iget-object v2, p0, La/w6g;->i:La/g2v;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const v6, 0x7f130677

    .line 28
    .line 29
    .line 30
    const v7, 0x7f131690

    .line 31
    .line 32
    .line 33
    invoke-static/range {v2 .. v9}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, La/w6g;->p:La/da10;

    .line 38
    .line 39
    iget-short v2, v2, La/da10;->a:S

    .line 40
    .line 41
    int-to-long v2, v2

    .line 42
    invoke-direct {v0, v1, v2, v3}, La/n6g;-><init>(La/jkm;J)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/w6g;->n:La/p7m0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v1, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    sget-object v0, La/da10;->b:La/da10;

    .line 55
    .line 56
    iput-object v0, p0, La/w6g;->p:La/da10;

    .line 57
    .line 58
    return-void
.end method

.method public final x()V
    .locals 6

    .line 1
    iget-object v0, p0, La/w6g;->r:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/w6g;->b:La/m1e;

    .line 14
    .line 15
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, La/u6g;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, p0, v3, v1}, La/u6g;-><init>(La/w6g;La/yje;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/fnq;

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    invoke-direct {v1, v0, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v2, p0, La/w6g;->j:La/mne;

    .line 36
    .line 37
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 38
    .line 39
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, La/f1e;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    const/16 v5, 0xa

    .line 47
    .line 48
    invoke-direct {v2, v4, v3, v5}, La/f1e;-><init>(ILa/yje;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/w6g;->r:La/c4m0;

    .line 56
    .line 57
    return-void
.end method

.method public final y(La/da10;)V
    .locals 3

    .line 1
    iput-object p1, p0, La/w6g;->p:La/da10;

    .line 2
    .line 3
    iget-object p1, p0, La/w6g;->n:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/n6g;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/n6g;

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
    iget-object p0, p0, La/w6g;->p:La/da10;

    .line 20
    .line 21
    iget-short p0, p0, La/da10;->a:S

    .line 22
    .line 23
    int-to-long v1, p0

    .line 24
    iget-object p0, v0, La/n6g;->a:La/jkm;

    .line 25
    .line 26
    new-instance v0, La/n6g;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1, v2}, La/n6g;-><init>(La/jkm;J)V

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
    check-cast v1, La/q6g;

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
