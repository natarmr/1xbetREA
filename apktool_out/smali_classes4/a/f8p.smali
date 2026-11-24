.class public final La/f8p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:La/ir30;


# direct methods
.method public constructor <init>(La/mne;)V
    .locals 6

    .line 1
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, La/j8p;->f:La/c0o;

    .line 7
    .line 8
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v2}, La/wp20;->a(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x10

    .line 21
    .line 22
    if-ge v2, v3, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    :cond_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/y2;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, v0, v3}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {v2}, La/y2;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-wide/32 v3, 0x1d4c0

    .line 39
    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, La/y2;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move-object v5, v0

    .line 48
    check-cast v5, La/j8p;

    .line 49
    .line 50
    new-instance v5, La/ir30;

    .line 51
    .line 52
    invoke-direct {v5, p1, v3, v4}, La/ir30;-><init>(La/lne;J)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iput-object v1, p0, La/f8p;->a:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    new-instance v0, La/ir30;

    .line 62
    .line 63
    invoke-direct {v0, p1, v3, v4}, La/ir30;-><init>(La/lne;J)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, La/f8p;->b:La/ir30;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;La/j8p;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/f8p;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/ir30;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/ir30;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
