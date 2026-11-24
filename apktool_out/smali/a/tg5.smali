.class public final La/tg5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public b:J

.field public c:J

.field public final d:La/qoj0;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/tg5;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x6

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v2, v3, v0, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/tg5;->d:La/qoj0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    .line 1
    iget-object p0, p0, La/tg5;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v0, La/s7f;

    .line 18
    .line 19
    const/16 v1, 0x19

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/s7f;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    new-instance v0, La/g0g0;

    .line 33
    .line 34
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v0

    .line 38
    :goto_0
    sget-object v0, La/iun;->a:La/iun;

    .line 39
    .line 40
    instance-of v1, p0, La/g0g0;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    move-object p0, v0

    .line 45
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    sget-object p0, La/iun;->a:La/iun;

    .line 49
    .line 50
    return-object p0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, La/tg5;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, La/tg5;->d:La/qoj0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final c(La/ql5;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p1, La/ql5;->a:J

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, La/tg5;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/tg5;->b()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
