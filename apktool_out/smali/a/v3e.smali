.class public final La/v3e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s3e;
.implements La/jff0;


# instance fields
.field public final a:La/g3e;

.field public b:Landroid/os/Handler;

.field public final c:La/pgk0;

.field public d:Z

.field public final e:La/u3e;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/g3e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v3e;->a:La/g3e;

    .line 5
    .line 6
    new-instance p1, La/pgk0;

    .line 7
    .line 8
    new-instance v0, La/u3e;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, La/u3e;-><init>(La/v3e;B)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, v0}, La/pgk0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/v3e;->c:La/pgk0;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, La/v3e;->d:Z

    .line 21
    .line 22
    new-instance p1, La/u3e;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, La/u3e;-><init>(La/v3e;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/v3e;->e:La/u3e;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/v3e;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, La/v3e;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, La/v3e;->f:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_3

    .line 25
    .line 26
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, La/pj30;

    .line 31
    .line 32
    invoke-interface {v3}, La/pj30;->n()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    instance-of v4, v3, La/e3e;

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    check-cast v3, La/e3e;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v3, 0x0

    .line 44
    :goto_1
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return v1

    .line 59
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 60
    return p0
.end method

.method public final b(La/f7m0;Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/v3e;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 7
    .line 8
    new-instance v1, La/t3e;

    .line 9
    .line 10
    invoke-direct {v1, p2, p0, p1}, La/t3e;-><init>(Ljava/util/List;La/v3e;La/f7m0;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/v3e;->c:La/pgk0;

    .line 14
    .line 15
    iget-object p2, p0, La/v3e;->e:La/u3e;

    .line 16
    .line 17
    invoke-virtual {p1, v0, p2, v1}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, La/v3e;->d:Z

    .line 22
    .line 23
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, La/v3e;->c:La/pgk0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pgk0;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object p0, p0, La/v3e;->c:La/pgk0;

    .line 2
    .line 3
    iget-object v0, p0, La/pgk0;->h:La/jk8;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, La/jk8;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, La/pgk0;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
