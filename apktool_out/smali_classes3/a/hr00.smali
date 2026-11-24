.class public final La/hr00;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/z220;

.field public final b:La/hdo0;


# direct methods
.method public constructor <init>(La/z220;La/hdo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hr00;->a:La/z220;

    .line 5
    .line 6
    iput-object p2, p0, La/hr00;->b:La/hdo0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/cb50;Z)La/ejc;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/cb50;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p0, La/hr00;->b:La/hdo0;

    .line 7
    .line 8
    iget-object v2, v1, La/hdo0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, La/ejc;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_0
    iget-object v1, v1, La/hdo0;->a:La/o1w0;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, La/i1w0;

    .line 25
    .line 26
    invoke-direct {v3}, La/i1w0;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v3}, La/o1w0;->a(La/i1w0;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/ejc;

    .line 33
    .line 34
    invoke-direct {v1, v3}, La/ejc;-><init>(La/i1w0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    new-instance p2, La/k0w0;

    .line 43
    .line 44
    iget-object v0, v1, La/ejc;->a:La/i1w0;

    .line 45
    .line 46
    invoke-direct {p2, v0}, La/k0w0;-><init>(La/i1w0;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/hr00;->a:La/z220;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, La/z220;->g(La/cb50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance p1, La/y0w0;

    .line 56
    .line 57
    invoke-direct {p1, p0}, La/y0w0;-><init>(La/m7h0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 61
    .line 62
    .line 63
    iget-object p0, p2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {v0, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_0
    move-object p1, p0

    .line 71
    check-cast p1, La/paw;

    .line 72
    .line 73
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_1

    .line 78
    .line 79
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/oe50;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    return-object v1
.end method
