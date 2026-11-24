.class public final La/npx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/es;


# direct methods
.method public synthetic constructor <init>(La/es;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/npx;->a:La/es;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/npx;->a:La/es;

    .line 2
    .line 3
    invoke-virtual {p0}, La/es;->i()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/pln;

    .line 31
    .line 32
    iget-wide v0, v0, La/pln;->c:J

    .line 33
    .line 34
    cmp-long v0, p1, v0

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method
