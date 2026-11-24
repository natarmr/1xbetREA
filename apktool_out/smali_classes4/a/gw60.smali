.class public final La/gw60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/s1p;


# direct methods
.method public constructor <init>(La/s1p;)V
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
    iput-object p1, p0, La/gw60;->a:La/s1p;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(IILjava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, La/i1p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, La/i1p;-><init>(IB)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/j1p;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, p3, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    new-instance p3, La/j1p;

    .line 14
    .line 15
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {p3, p2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 21
    .line 22
    .line 23
    const/4 p2, 0x3

    .line 24
    new-array p2, p2, [La/k1p;

    .line 25
    .line 26
    aput-object v0, p2, v2

    .line 27
    .line 28
    aput-object p1, p2, v3

    .line 29
    .line 30
    aput-object p3, p2, v1

    .line 31
    .line 32
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p0, p0, La/gw60;->a:La/s1p;

    .line 37
    .line 38
    const-wide/16 p2, 0xc13

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final b(ILa/y1p;)V
    .locals 3

    .line 1
    new-instance v0, La/i1p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, La/i1p;-><init>(IB)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/j1p;

    .line 8
    .line 9
    iget-object p2, p2, La/y1p;->a:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 13
    .line 14
    .line 15
    new-array p2, v1, [La/k1p;

    .line 16
    .line 17
    aput-object v0, p2, v2

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object p1, p2, v0

    .line 21
    .line 22
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p0, p0, La/gw60;->a:La/s1p;

    .line 27
    .line 28
    const-wide/16 v0, 0xc05

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const-wide/16 v0, 0xbc3

    .line 2
    .line 3
    sget-object v2, La/xun;->a:La/xun;

    .line 4
    .line 5
    iget-object p0, p0, La/gw60;->a:La/s1p;

    .line 6
    .line 7
    invoke-virtual {p0, v2, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d(ILa/y1p;Ljava/lang/String;La/lz60;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/yni0;

    .line 8
    .line 9
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, La/i1p;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v1, p1, v2}, La/i1p;-><init>(IB)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    new-instance p1, La/j1p;

    .line 22
    .line 23
    iget-object p2, p2, La/y1p;->a:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p1, p2, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-lez p1, :cond_0

    .line 37
    .line 38
    new-instance p1, La/j1p;

    .line 39
    .line 40
    invoke-direct {p1, p3, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    new-instance p1, La/i1p;

    .line 47
    .line 48
    sget-object p2, La/lz60;->Companion:La/iz60;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {p4}, La/iz60;->b(La/lz60;)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    const/4 p3, 0x1

    .line 58
    invoke-direct {p1, p2, p3}, La/i1p;-><init>(IB)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p0, p0, La/gw60;->a:La/s1p;

    .line 69
    .line 70
    const-wide/16 p2, 0xbbb

    .line 71
    .line 72
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final e(IILjava/lang/String;La/lz60;)V
    .locals 4

    .line 1
    sget-object v0, La/y1p;->b:La/y1p;

    .line 2
    .line 3
    new-instance v0, La/yni0;

    .line 4
    .line 5
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/i1p;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v1, p1, v2}, La/i1p;-><init>(IB)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance p1, La/j1p;

    .line 18
    .line 19
    const-string v1, "popular_new_games"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {p1, v1, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    new-instance p1, La/i1p;

    .line 29
    .line 30
    invoke-direct {p1, p2, v3}, La/i1p;-><init>(IB)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-lez p1, :cond_0

    .line 41
    .line 42
    new-instance p1, La/j1p;

    .line 43
    .line 44
    invoke-direct {p1, p3, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_0
    new-instance p1, La/i1p;

    .line 51
    .line 52
    sget-object p2, La/lz60;->Companion:La/iz60;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {p4}, La/iz60;->b(La/lz60;)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/4 p3, 0x1

    .line 62
    invoke-direct {p1, p2, p3}, La/i1p;-><init>(IB)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p0, p0, La/gw60;->a:La/s1p;

    .line 73
    .line 74
    const-wide/16 p2, 0xbbb

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
