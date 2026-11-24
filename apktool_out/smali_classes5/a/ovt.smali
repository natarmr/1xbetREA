.class public final La/ovt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j400;


# direct methods
.method public constructor <init>(La/j400;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ovt;->a:La/j400;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/xrz;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 5
    .line 6
    iget-object p0, p0, La/ovt;->a:La/j400;

    .line 7
    .line 8
    iget-object p0, p0, La/j400;->c:La/e400;

    .line 9
    .line 10
    iget-object p0, p0, La/e400;->a:La/fzz;

    .line 11
    .line 12
    iget-object p0, p0, La/fzz;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, La/niq0;

    .line 30
    .line 31
    iget-object v1, v1, La/niq0;->b:La/xrz;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_0
    check-cast v0, La/niq0;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 54
    .line 55
    new-instance p1, La/g0g0;

    .line 56
    .line 57
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method
