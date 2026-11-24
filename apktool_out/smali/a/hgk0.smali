.class public abstract La/hgk0;
.super La/c8m0;
.source "SourceFile"

# interfaces
.implements La/fgk0;


# instance fields
.field public final b:La/igk0;

.field public c:La/ggk0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;La/igk0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, La/c8m0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/hgk0;->b:La/igk0;

    .line 5
    .line 6
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, La/ggk0;

    .line 11
    .line 12
    invoke-virtual {p2}, La/rfk0;->g()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-direct {v0, p1, v1, v2}, La/ggk0;-><init>(Ljava/lang/Object;J)V

    .line 17
    .line 18
    .line 19
    instance-of p2, p2, La/x8v;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    new-instance p2, La/ggk0;

    .line 24
    .line 25
    const-wide/16 v1, 0x1

    .line 26
    .line 27
    invoke-direct {p2, p1, v1, v2}, La/ggk0;-><init>(Ljava/lang/Object;J)V

    .line 28
    .line 29
    .line 30
    iput-object p2, v0, La/e8m0;->b:La/e8m0;

    .line 31
    .line 32
    :cond_0
    iput-object v0, p0, La/hgk0;->c:La/ggk0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final b(La/e8m0;La/e8m0;La/e8m0;)La/e8m0;
    .locals 0

    .line 1
    check-cast p1, La/ggk0;

    .line 2
    .line 3
    move-object p1, p2

    .line 4
    check-cast p1, La/ggk0;

    .line 5
    .line 6
    check-cast p3, La/ggk0;

    .line 7
    .line 8
    iget-object p1, p1, La/ggk0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p3, p3, La/ggk0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, La/hgk0;->b:La/igk0;

    .line 13
    .line 14
    invoke-interface {p0, p1, p3}, La/igk0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    return-object p2

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final d()La/igk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hgk0;->b:La/igk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()La/e8m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hgk0;->c:La/ggk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/hgk0;->c:La/ggk0;

    .line 2
    .line 3
    invoke-static {v0, p0}, La/xfk0;->s(La/e8m0;La/b8m0;)La/e8m0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ggk0;

    .line 8
    .line 9
    iget-object p0, p0, La/ggk0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-object p0
.end method

.method public final h(La/e8m0;)V
    .locals 0

    .line 1
    check-cast p1, La/ggk0;

    .line 2
    .line 3
    iput-object p1, p0, La/hgk0;->c:La/ggk0;

    .line 4
    .line 5
    return-void
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/hgk0;->c:La/ggk0;

    .line 2
    .line 3
    invoke-static {v0}, La/xfk0;->f(La/e8m0;)La/e8m0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ggk0;

    .line 8
    .line 9
    iget-object v1, p0, La/hgk0;->b:La/igk0;

    .line 10
    .line 11
    iget-object v2, v0, La/ggk0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {v1, v2, p1}, La/igk0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, La/hgk0;->c:La/ggk0;

    .line 20
    .line 21
    sget-object v2, La/xfk0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v2

    .line 24
    :try_start_0
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v1, p0, v3, v0}, La/xfk0;->n(La/e8m0;La/c8m0;La/rfk0;La/e8m0;)La/e8m0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/ggk0;

    .line 33
    .line 34
    iput-object p1, v0, La/ggk0;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v2

    .line 37
    invoke-static {v3, p0}, La/xfk0;->l(La/rfk0;La/b8m0;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    monitor-exit v2

    .line 43
    throw p0

    .line 44
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, La/hgk0;->c:La/ggk0;

    .line 2
    .line 3
    invoke-static {v0}, La/xfk0;->f(La/e8m0;)La/e8m0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ggk0;

    .line 8
    .line 9
    iget-object v0, v0, La/ggk0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "MutableState(value="

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ")@"

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
