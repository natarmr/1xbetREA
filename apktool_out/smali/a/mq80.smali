.class public final La/mq80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kq00;


# instance fields
.field public final a:J

.field public final b:La/mbj;

.field public final c:B

.field public final d:La/enm0;

.field public final e:La/lq80;

.field public volatile f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/jbj;La/mbj;ILa/lq80;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, La/enm0;

    invoke-direct {v0, p1}, La/enm0;-><init>(La/jbj;)V

    iput-object v0, p0, La/mq80;->d:La/enm0;

    .line 41
    iput-object p2, p0, La/mq80;->b:La/mbj;

    .line 42
    iput-byte p3, p0, La/mq80;->c:B

    .line 43
    iput-object p4, p0, La/mq80;->e:La/lq80;

    .line 44
    sget-object p1, La/wn00;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p1

    .line 45
    iput-wide p1, p0, La/mq80;->a:J

    return-void
.end method

.method public constructor <init>(La/z220;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/enm0;

    .line 5
    .line 6
    iget-object v1, p1, La/z220;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, La/jbj;

    .line 9
    .line 10
    invoke-direct {v0, v1}, La/enm0;-><init>(La/jbj;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/mq80;->d:La/enm0;

    .line 14
    .line 15
    iget-object v0, p1, La/z220;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/mbj;

    .line 18
    .line 19
    iput-object v0, p0, La/mq80;->b:La/mbj;

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    iput-byte v0, p0, La/mq80;->c:B

    .line 23
    .line 24
    iget-object p1, p1, La/z220;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, La/lq80;

    .line 27
    .line 28
    iput-object p1, p0, La/mq80;->e:La/lq80;

    .line 29
    .line 30
    sget-object p1, La/wn00;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, La/mq80;->a:J

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/mq80;->d:La/enm0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iput-wide v1, v0, La/enm0;->b:J

    .line 6
    .line 7
    new-instance v0, La/lbj;

    .line 8
    .line 9
    iget-object v1, p0, La/mq80;->d:La/enm0;

    .line 10
    .line 11
    iget-object v2, p0, La/mq80;->b:La/mbj;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, La/lbj;-><init>(La/jbj;La/mbj;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, v0, La/lbj;->a:La/jbj;

    .line 17
    .line 18
    iget-object v2, v0, La/lbj;->b:La/mbj;

    .line 19
    .line 20
    invoke-interface {v1, v2}, La/jbj;->d(La/mbj;)J

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, v0, La/lbj;->d:Z

    .line 25
    .line 26
    iget-object v1, p0, La/mq80;->d:La/enm0;

    .line 27
    .line 28
    iget-object v1, v1, La/enm0;->a:La/jbj;

    .line 29
    .line 30
    invoke-interface {v1}, La/jbj;->getUri()Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, La/mq80;->e:La/lq80;

    .line 38
    .line 39
    invoke-interface {v2, v1, v0}, La/lq80;->a(Landroid/net/Uri;La/lbj;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, La/mq80;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    sget-object p0, La/vtt0;->a:Ljava/lang/String;

    .line 46
    .line 47
    :try_start_1
    invoke-virtual {v0}, La/lbj;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 53
    .line 54
    :try_start_2
    invoke-virtual {v0}, La/lbj;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 55
    .line 56
    .line 57
    :catch_1
    throw p0
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method
