.class public final La/w4x0;
.super La/etw0;
.source "SourceFile"


# instance fields
.field public d:La/jaw0;

.field public e:Z

.field public final f:La/ikt0;

.field public final g:La/dr8;

.field public final h:La/afm0;


# direct methods
.method public constructor <init>(La/kxw0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, La/etw0;-><init>(La/kxw0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, La/w4x0;->e:Z

    .line 6
    .line 7
    new-instance p1, La/ikt0;

    .line 8
    .line 9
    invoke-direct {p1, p0}, La/ikt0;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/w4x0;->f:La/ikt0;

    .line 13
    .line 14
    new-instance p1, La/dr8;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p0, p1, La/dr8;->d:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v0, La/q4x0;

    .line 22
    .line 23
    iget-object v1, p0, La/p4;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/kxw0;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p1, v1, v2}, La/q4x0;-><init>(Ljava/lang/Object;La/syw0;B)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p1, La/dr8;->c:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v0, v1, La/kxw0;->k:La/lwf;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p1, La/dr8;->a:J

    .line 43
    .line 44
    iput-wide v0, p1, La/dr8;->b:J

    .line 45
    .line 46
    iput-object p1, p0, La/w4x0;->g:La/dr8;

    .line 47
    .line 48
    new-instance p1, La/afm0;

    .line 49
    .line 50
    invoke-direct {p1, p0}, La/afm0;-><init>(La/w4x0;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, La/w4x0;->h:La/afm0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final o1()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final p1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/w4x0;->d:La/jaw0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, La/jaw0;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v0, v1, v2}, La/jaw0;-><init>(Landroid/os/Looper;B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/w4x0;->d:La/jaw0;

    .line 19
    .line 20
    :cond_0
    return-void
.end method
