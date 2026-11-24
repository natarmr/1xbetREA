.class public final La/o720;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/ctf0;

.field public final c:La/p7m0;


# direct methods
.method public constructor <init>(La/yfu;La/ctf0;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/o720;->b:La/ctf0;

    .line 8
    .line 9
    sget-object p2, La/k720;->a:La/k720;

    .line 10
    .line 11
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iput-object p2, p0, La/o720;->c:La/p7m0;

    .line 16
    .line 17
    new-instance p2, La/hie0;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p2, La/hie0;->a:Z

    .line 24
    .line 25
    invoke-virtual {p1}, La/yfu;->d()La/vae0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, La/ewt;

    .line 30
    .line 31
    const/16 v1, 0x1a

    .line 32
    .line 33
    invoke-direct {v0, p1, p2, v1}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/xr10;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    const/4 v1, 0x5

    .line 40
    invoke-direct {p1, p0, p2, v1}, La/xr10;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    new-instance v2, La/fnq;

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    invoke-direct {v2, v0, p1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, La/z210;

    .line 54
    .line 55
    invoke-direct {v0, p0, p2, v1}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final w(DLjava/lang/String;La/jg7;)La/l720;
    .locals 3

    .line 1
    iget-boolean v0, p4, La/jg7;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, La/f720;

    .line 6
    .line 7
    invoke-direct {p0, p4}, La/f720;-><init>(La/jg7;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-wide v0, p4, La/jg7;->a:D

    .line 12
    .line 13
    cmpg-double v2, p1, v0

    .line 14
    .line 15
    if-gez v2, :cond_1

    .line 16
    .line 17
    new-instance p0, La/h720;

    .line 18
    .line 19
    invoke-direct {p0, p3, p4}, La/h720;-><init>(Ljava/lang/String;La/jg7;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    cmpl-double p1, p1, v0

    .line 24
    .line 25
    if-lez p1, :cond_2

    .line 26
    .line 27
    new-instance p0, La/g720;

    .line 28
    .line 29
    invoke-direct {p0, p3, p4}, La/g720;-><init>(Ljava/lang/String;La/jg7;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    if-nez v2, :cond_3

    .line 34
    .line 35
    new-instance p0, La/i720;

    .line 36
    .line 37
    invoke-direct {p0, p4}, La/i720;-><init>(La/jg7;)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    new-instance p1, La/j720;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    new-array p2, p2, [Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p0, p0, La/o720;->b:La/ctf0;

    .line 47
    .line 48
    const p3, 0x7f1307d0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p3, p2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-direct {p1, p0}, La/j720;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method
