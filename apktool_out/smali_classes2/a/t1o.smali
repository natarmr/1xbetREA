.class public La/t1o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cr30;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(La/u1o;[Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/u1o;->a:Ljava/lang/String;

    .line 5
    .line 6
    array-length v0, p2

    .line 7
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    array-length v0, p2

    .line 12
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/t1o;->b:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public bridge synthetic a(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/t1o;->h(La/g950;La/ux50;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Collection;

    .line 6
    .line 7
    return-object p0
.end method

.method public b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/iun;->a:La/iun;

    .line 5
    .line 6
    return-object p0
.end method

.method public c()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(La/g950;La/ux50;)La/foc;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, La/s0o;

    .line 8
    .line 9
    sget-object p2, La/b1o;->a:[La/b1o;

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "<Error class: %s>"

    .line 21
    .line 22
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, La/g950;->i(Ljava/lang/String;)La/g950;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, La/s0o;-><init>(La/g950;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public e()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic f(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/t1o;->i(La/g950;La/ux50;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Collection;

    .line 6
    .line 7
    return-object p0
.end method

.method public g()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, La/xun;->a:La/xun;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(La/g950;La/ux50;)Ljava/util/Set;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/j1o;

    .line 5
    .line 6
    sget-object v1, La/f2o;->c:La/s0o;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v3, La/ujn;->c:La/f93;

    .line 12
    .line 13
    sget-object p0, La/b1o;->a:[La/b1o;

    .line 14
    .line 15
    const-string p0, "<Error function>"

    .line 16
    .line 17
    invoke-static {p0}, La/g950;->i(Ljava/lang/String;)La/g950;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v5, 0x1

    .line 22
    sget-object v6, La/gmk0;->x0:La/gne0;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct/range {v0 .. v6}, La/fyj0;-><init>(La/vjj;La/fyj0;La/g93;La/g950;ILa/gmk0;)V

    .line 26
    .line 27
    .line 28
    sget-object v3, La/iun;->a:La/iun;

    .line 29
    .line 30
    sget-object p0, La/c2o;->e:La/c2o;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    new-array p1, p1, [Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0, p1}, La/f2o;->c(La/c2o;[Ljava/lang/String;)La/a2o;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    sget-object v7, La/gm40;->d:La/gm40;

    .line 40
    .line 41
    sget-object v8, La/uek;->e:La/tek;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    move-object v4, v3

    .line 45
    move-object v5, v3

    .line 46
    invoke-virtual/range {v0 .. v8}, La/fyj0;->B1(La/c8z;La/c8z;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wsy;La/gm40;La/tek;)La/fyj0;

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public i(La/g950;La/ux50;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/f2o;->f:Ljava/util/Set;

    .line 5
    .line 6
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ErrorScope{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/t1o;->b:Ljava/lang/String;

    .line 9
    .line 10
    const/16 v1, 0x7d

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
