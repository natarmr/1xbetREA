.class public final La/a8f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/qaj;

.field public final b:La/es;


# direct methods
.method public constructor <init>(La/qaj;La/xzp;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a8f;->a:La/qaj;

    .line 5
    .line 6
    new-instance p1, La/es;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p1, La/es;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p1, La/es;->c:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p2, p1, La/es;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p0, La/a8f;->b:La/es;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/a8f;->b:La/es;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, La/es;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, La/es;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/xzp;

    .line 17
    .line 18
    iget-object v1, p0, La/es;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, p1, v1}, La/es;->z(La/xzp;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/es;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method
