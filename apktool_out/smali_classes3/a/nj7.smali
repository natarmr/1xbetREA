.class public final La/nj7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/b4j;

.field public final b:La/au0;


# direct methods
.method public constructor <init>(La/b4j;La/au0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nj7;->a:La/b4j;

    .line 5
    .line 6
    iput-object p2, p0, La/nj7;->b:La/au0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/b4j;La/au0;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, La/nj7;->a:La/b4j;

    .line 11
    iput-object p2, p0, La/nj7;->b:La/au0;

    return-void
.end method


# virtual methods
.method public a(La/r6w;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/a1w;->k:La/a1w;

    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    sget-object v2, La/a1w;->d:La/a1w;

    .line 18
    .line 19
    invoke-virtual {v2}, La/a1w;->a()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    sget-object v2, La/a1w;->e:La/a1w;

    .line 33
    .line 34
    invoke-virtual {v2}, La/a1w;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v1, v2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v2, p0, La/nj7;->a:La/b4j;

    .line 42
    .line 43
    invoke-virtual {v2, v0, p1, v1}, La/b4j;->g(La/a1w;La/r6w;Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, La/r6w;->k:La/r6w;

    .line 47
    .line 48
    invoke-virtual {p1}, La/r6w;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p0, p0, La/nj7;->b:La/au0;

    .line 53
    .line 54
    invoke-virtual {p0, p1, p2, p3}, La/au0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public b(I)V
    .locals 3

    .line 1
    sget-object v0, La/a1w;->a:La/a1w;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, La/r6w;->k:La/r6w;

    .line 8
    .line 9
    iget-object v2, p0, La/nj7;->a:La/b4j;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, La/b4j;->c(Ljava/lang/String;La/r6w;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, La/r6w;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object p0, p0, La/nj7;->b:La/au0;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, La/au0;->f(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    sget-object v0, La/a1w;->m:La/a1w;

    .line 2
    .line 3
    sget-object v1, La/r6w;->j:La/r6w;

    .line 4
    .line 5
    iget-object v2, p0, La/nj7;->a:La/b4j;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, La/b4j;->h(La/b4j;La/a1w;La/r6w;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, La/r6w;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, La/nj7;->b:La/au0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/au0;->e(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    sget-object v0, La/a1w;->l:La/a1w;

    .line 2
    .line 3
    sget-object v1, La/r6w;->k:La/r6w;

    .line 4
    .line 5
    iget-object v2, p0, La/nj7;->a:La/b4j;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, La/b4j;->h(La/b4j;La/a1w;La/r6w;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, La/r6w;->a()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, La/nj7;->b:La/au0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/au0;->j(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
