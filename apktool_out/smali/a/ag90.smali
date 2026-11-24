.class public final La/ag90;
.super La/v0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 8

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/v0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/ppv0;

    .line 12
    .line 13
    sget-object p1, La/ppv0;->z:Ljava/lang/String;

    .line 14
    .line 15
    const-wide/32 v0, 0xdbba0

    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, La/ppv0;->h:J

    .line 19
    .line 20
    const-wide/32 v2, 0xdbba0

    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v0

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "Flex duration greater than interval duration; Changed to 900000"

    .line 32
    .line 33
    invoke-virtual {v0, p1, v1}, La/wv00;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    const-wide/32 v4, 0x493e0

    .line 37
    .line 38
    .line 39
    iget-wide v6, p0, La/ppv0;->h:J

    .line 40
    .line 41
    invoke-static/range {v2 .. v7}, La/l1e0;->f(JJJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iput-wide v0, p0, La/ppv0;->i:J

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final m()La/lpv0;
    .locals 3

    .line 1
    iget-object v0, p0, La/v0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ppv0;

    .line 4
    .line 5
    iget-boolean v1, v0, La/ppv0;->q:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, La/bg90;

    .line 10
    .line 11
    iget-object v2, p0, La/v0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/UUID;

    .line 14
    .line 15
    iget-object p0, p0, La/v0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/Set;

    .line 18
    .line 19
    invoke-direct {v1, v2, v0, p0}, La/lpv0;-><init>(Ljava/util/UUID;La/ppv0;Ljava/util/Set;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    const-string p0, "PeriodicWorkRequests cannot be expedited"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public final r()La/v0;
    .locals 0

    .line 1
    return-object p0
.end method
