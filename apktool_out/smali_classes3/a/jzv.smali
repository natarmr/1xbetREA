.class public final La/jzv;
.super La/w3k;
.source "SourceFile"


# instance fields
.field public final c:La/r2w;

.field public final d:La/z4w;

.field public final e:La/q5w;


# direct methods
.method public constructor <init>(La/vzg0;La/r2w;La/z4w;La/q5w;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [La/eiu0;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p2, v0, v1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    aput-object p3, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    aput-object p4, v0, v1

    .line 12
    .line 13
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, p1, v0}, La/w3k;-><init>(La/vzg0;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, La/jzv;->c:La/r2w;

    .line 21
    .line 22
    iput-object p3, p0, La/jzv;->d:La/z4w;

    .line 23
    .line 24
    iput-object p4, p0, La/jzv;->e:La/q5w;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 4

    .line 1
    iget-object p0, p0, La/jzv;->e:La/q5w;

    .line 2
    .line 3
    iget-object p0, p0, La/q5w;->v:La/i1w0;

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/c8d;

    .line 11
    .line 12
    sget-object v2, La/y7d;->a:La/v7d;

    .line 13
    .line 14
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    move-object v1, v0

    .line 25
    check-cast v1, La/paw;

    .line 26
    .line 27
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/oe50;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method
