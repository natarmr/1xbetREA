.class public final La/snf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/o55;

.field public final b:La/ito0;

.field public final c:La/wu9;

.field public final d:La/wu9;

.field public final e:La/tu9;

.field public final f:La/tu9;

.field public g:Z

.field public h:Z

.field public i:La/qbb;


# direct methods
.method public constructor <init>(La/o55;La/ito0;)V
    .locals 3

    .line 1
    const-string v0, "RequestCompleteFuture"

    .line 2
    .line 3
    const-string v1, "CaptureCompleteFuture"

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-boolean v2, p0, La/snf0;->g:Z

    .line 10
    .line 11
    iput-boolean v2, p0, La/snf0;->h:Z

    .line 12
    .line 13
    iput-object p1, p0, La/snf0;->a:La/o55;

    .line 14
    .line 15
    iput-object p2, p0, La/snf0;->b:La/ito0;

    .line 16
    .line 17
    new-instance p1, La/tu9;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/msf0;

    .line 23
    .line 24
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p2, p1, La/tu9;->c:La/msf0;

    .line 28
    .line 29
    new-instance p2, La/wu9;

    .line 30
    .line 31
    invoke-direct {p2, p1}, La/wu9;-><init>(La/tu9;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p1, La/tu9;->b:La/wu9;

    .line 35
    .line 36
    :try_start_0
    iput-object p1, p0, La/snf0;->e:La/tu9;

    .line 37
    .line 38
    iput-object v1, p1, La/tu9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    invoke-virtual {p2, p1}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 43
    .line 44
    .line 45
    :goto_0
    iput-object p2, p0, La/snf0;->c:La/wu9;

    .line 46
    .line 47
    new-instance p1, La/tu9;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance p2, La/msf0;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p2, p1, La/tu9;->c:La/msf0;

    .line 58
    .line 59
    new-instance p2, La/wu9;

    .line 60
    .line 61
    invoke-direct {p2, p1}, La/wu9;-><init>(La/tu9;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p1, La/tu9;->b:La/wu9;

    .line 65
    .line 66
    :try_start_1
    iput-object p1, p0, La/snf0;->f:La/tu9;

    .line 67
    .line 68
    iput-object v0, p1, La/tu9;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception p1

    .line 72
    invoke-virtual {p2, p1}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 73
    .line 74
    .line 75
    :goto_1
    iput-object p2, p0, La/snf0;->d:La/wu9;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/snf0;->a:La/o55;

    .line 2
    .line 3
    iget-boolean v1, v0, La/o55;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, La/o55;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, La/snf0;->d:La/wu9;

    .line 17
    .line 18
    iget-object v0, v0, La/wu9;->b:La/vu9;

    .line 19
    .line 20
    invoke-virtual {v0}, La/y4;->isDone()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    xor-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    const-string v1, "The callback can only complete once."

    .line 27
    .line 28
    invoke-static {v1, v0}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object p0, p0, La/snf0;->f:La/tu9;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, v0}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method
