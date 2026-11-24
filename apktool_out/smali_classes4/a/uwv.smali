.class public final La/uwv;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/svu;

.field public final c:La/hnu;

.field public final d:La/i1w0;

.field public final e:La/qoj0;


# direct methods
.method public constructor <init>(La/svu;La/hnu;La/i1w0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uwv;->b:La/svu;

    .line 5
    .line 6
    iput-object p2, p0, La/uwv;->c:La/hnu;

    .line 7
    .line 8
    iput-object p3, p0, La/uwv;->d:La/i1w0;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 p2, 0x5

    .line 12
    const/4 p3, 0x0

    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {p3, v0, p1, p2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/uwv;->e:La/qoj0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final w(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La/uwv;->c:La/hnu;

    .line 4
    .line 5
    iget-object p1, p1, La/hnu;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, La/y3v;

    .line 8
    .line 9
    iget-object p1, p1, La/y3v;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, La/q7d0;

    .line 12
    .line 13
    const-string v0, "HIDDEN_BETTING_NEED_SIMPLE_UPDATE"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    const-string v0, "HIDDEN_BETTING_NEED_HARD_UPDATE"

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/uwv;->d:La/i1w0;

    .line 25
    .line 26
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, La/c8d;

    .line 31
    .line 32
    sget-object v2, La/y7d;->a:La/v7d;

    .line 33
    .line 34
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 35
    .line 36
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    move-object v0, p1

    .line 44
    check-cast v0, La/paw;

    .line 45
    .line 46
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/oe50;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-void
.end method
