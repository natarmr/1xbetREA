.class public final La/xen0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zv00;


# instance fields
.field public final a:Ljava/lang/String;

.field public volatile b:La/zv00;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/reflect/Method;

.field public e:La/sfo;

.field public final f:Ljava/util/concurrent/LinkedBlockingQueue;

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xen0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, La/xen0;->f:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 7
    .line 8
    iput-boolean p3, p0, La/xen0;->g:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/zv00;->a()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/zv00;->b()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final c()La/zv00;
    .locals 2

    .line 1
    iget-object v0, p0, La/xen0;->b:La/zv00;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/xen0;->b:La/zv00;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-boolean v0, p0, La/xen0;->g:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object p0, La/u850;->b:La/u850;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    iget-object v0, p0, La/xen0;->e:La/sfo;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    new-instance v0, La/sfo;

    .line 20
    .line 21
    iget-object v1, p0, La/xen0;->f:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p0, v0, La/sfo;->a:La/xen0;

    .line 27
    .line 28
    iput-object v1, v0, La/sfo;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 29
    .line 30
    iput-object v0, p0, La/xen0;->e:La/sfo;

    .line 31
    .line 32
    :cond_2
    return-object v0
.end method

.method public final e()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/zv00;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, La/xen0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, La/xen0;

    .line 18
    .line 19
    iget-object p0, p0, La/xen0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p1, p1, La/xen0;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    :goto_0
    return v1
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/zv00;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final g(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, La/zv00;->g(La/p96;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final h(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, La/zv00;->h(La/p96;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/xen0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/zv00;->i()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final k(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, La/zv00;->k(La/p96;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, La/zv00;->o(La/p96;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final p()Z
    .locals 3

    .line 1
    iget-object v0, p0, La/xen0;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, La/xen0;->b:La/zv00;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "log"

    .line 17
    .line 18
    const-class v2, La/yen0;

    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/xen0;->d:Ljava/lang/reflect/Method;

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    iput-object v0, p0, La/xen0;->c:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    iput-object v0, p0, La/xen0;->c:Ljava/lang/Boolean;

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public final q(La/p96;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/xen0;->c()La/zv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, La/zv00;->q(La/p96;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
