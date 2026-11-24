.class public final La/l7k;
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
    iput-object p1, p0, La/l7k;->a:La/s1p;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;)V
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
    const/4 v2, 0x0

    .line 10
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    new-instance p2, La/j1p;

    .line 14
    .line 15
    invoke-direct {p2, p3, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x3

    .line 19
    new-array p3, p3, [La/k1p;

    .line 20
    .line 21
    aput-object v0, p3, v2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    aput-object p1, p3, v0

    .line 25
    .line 26
    aput-object p2, p3, v1

    .line 27
    .line 28
    invoke-static {p3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p0, p0, La/l7k;->a:La/s1p;

    .line 33
    .line 34
    const-wide/16 p2, 0xbe3

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/j1p;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/j1p;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 14
    .line 15
    .line 16
    new-array p2, v2, [La/k1p;

    .line 17
    .line 18
    aput-object v0, p2, v1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aput-object p1, p2, v0

    .line 22
    .line 23
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p0, p0, La/l7k;->a:La/s1p;

    .line 28
    .line 29
    const-wide/16 v0, 0xbe3

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/l7k;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0xbe6

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
