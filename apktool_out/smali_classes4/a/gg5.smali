.class public final La/gg5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/s1p;


# direct methods
.method public constructor <init>(La/s1p;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/gg5;->a:La/s1p;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/g2p;)V
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    iget-object p1, p1, La/g2p;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 14
    .line 15
    const-wide/16 v0, 0x2b28

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public b(La/agp;Ljava/util/List;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yni0;

    .line 5
    .line 6
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/j1p;

    .line 10
    .line 11
    iget-object p1, p1, La/agp;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    move-object v1, p2

    .line 40
    check-cast v1, La/ofp;

    .line 41
    .line 42
    sget-object v2, La/ofp;->j:La/ofp;

    .line 43
    .line 44
    if-eq v1, v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    new-instance v7, La/e4p;

    .line 57
    .line 58
    const/16 p1, 0xd

    .line 59
    .line 60
    invoke-direct {v7, p1}, La/e4p;-><init>(B)V

    .line 61
    .line 62
    .line 63
    const/16 v8, 0x1f

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-static/range {v3 .. v8}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, La/j1p;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-direct {p2, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 86
    .line 87
    const-wide/16 v0, 0xc75

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public c(ILa/y1p;)V
    .locals 2

    .line 1
    new-instance v0, La/i1p;

    .line 2
    .line 3
    const/4 v1, 0x0

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
    invoke-direct {p1, p2, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    new-array p2, p2, [La/k1p;

    .line 16
    .line 17
    aput-object v0, p2, v1

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
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 27
    .line 28
    const-wide/16 v0, 0xbbc

    .line 29
    .line 30
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 1
    sget-object v0, La/y1p;->b:La/y1p;

    .line 2
    .line 3
    new-instance v0, La/i1p;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-direct {v0, p1, v1}, La/i1p;-><init>(IB)V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/j1p;

    .line 10
    .line 11
    const-string v2, "popular_new_aggregator"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {p1, v2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 15
    .line 16
    .line 17
    new-array v1, v1, [La/k1p;

    .line 18
    .line 19
    aput-object v0, v1, v3

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aput-object p1, v1, v0

    .line 23
    .line 24
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 29
    .line 30
    const-wide/16 v0, 0xbbc

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public e(ILjava/lang/String;ILa/y1p;Ljava/lang/Float;)V
    .locals 3

    .line 1
    new-instance v0, La/yni0;

    .line 2
    .line 3
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/i1p;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, p1, v2}, La/i1p;-><init>(IB)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    new-instance p1, La/i1p;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p1, p3, v1}, La/i1p;-><init>(IB)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    new-instance p1, La/i1p;

    .line 31
    .line 32
    invoke-static {p2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p2, v1

    .line 44
    :goto_0
    const/4 p3, 0x1

    .line 45
    invoke-direct {p1, p2, p3}, La/i1p;-><init>(IB)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance p1, La/j1p;

    .line 52
    .line 53
    iget-object p2, p4, La/y1p;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {p1, p2, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    if-eqz p5, :cond_2

    .line 62
    .line 63
    new-instance p1, La/h1p;

    .line 64
    .line 65
    invoke-virtual {p5}, Ljava/lang/Float;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-direct {p1, p2, v1}, La/h1p;-><init>(FB)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 80
    .line 81
    const-wide/16 p2, 0xbb8

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public f(IILa/y1p;)V
    .locals 3

    .line 1
    new-instance v0, La/yni0;

    .line 2
    .line 3
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/i1p;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, p1, v2}, La/i1p;-><init>(IB)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    new-instance v1, La/i1p;

    .line 19
    .line 20
    invoke-direct {v1, p2, p1}, La/i1p;-><init>(IB)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance p2, La/j1p;

    .line 27
    .line 28
    iget-object p3, p3, La/y1p;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p2, p3, p1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 41
    .line 42
    const-wide/16 p2, 0xc3c

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public g(La/y1p;)V
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    iget-object p1, p1, La/y1p;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 14
    .line 15
    const-wide/16 v0, 0xc32

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public h(Ljava/lang/String;JZ)V
    .locals 3

    .line 1
    new-instance v0, La/i1p;

    .line 2
    .line 3
    long-to-int p2, p2

    .line 4
    const/4 p3, 0x2

    .line 5
    invoke-direct {v0, p2, p3}, La/i1p;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    new-instance p2, La/j1p;

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    const-string p4, "live"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p4, "line"

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x0

    .line 18
    invoke-direct {p2, p4, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 19
    .line 20
    .line 21
    new-instance p4, La/j1p;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {p4, p1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x3

    .line 28
    new-array p1, p1, [La/k1p;

    .line 29
    .line 30
    aput-object v0, p1, v1

    .line 31
    .line 32
    aput-object p2, p1, v2

    .line 33
    .line 34
    aput-object p4, p1, p3

    .line 35
    .line 36
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 41
    .line 42
    const-wide/16 p2, 0x2b5c

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0xc49

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(La/ldp;)V
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    iget-object p1, p1, La/ldp;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 14
    .line 15
    const-wide/16 v0, 0x2bf7

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0x2a1d

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public l(ILjava/lang/String;)V
    .locals 5

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
    const-string v2, "top_champ"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {p1, v2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/j1p;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v2, p2, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x3

    .line 22
    new-array p2, p2, [La/k1p;

    .line 23
    .line 24
    aput-object v0, p2, v3

    .line 25
    .line 26
    aput-object p1, p2, v4

    .line 27
    .line 28
    aput-object v2, p2, v1

    .line 29
    .line 30
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 35
    .line 36
    const-wide/16 v0, 0x2878

    .line 37
    .line 38
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 5
    .line 6
    .line 7
    new-instance p2, La/j1p;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {p2, p1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    new-array p1, p1, [La/k1p;

    .line 15
    .line 16
    aput-object v0, p1, v1

    .line 17
    .line 18
    aput-object p2, p1, v2

    .line 19
    .line 20
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 25
    .line 26
    const-wide/16 v0, 0x2878

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public n(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, La/yni0;

    .line 2
    .line 3
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance v1, La/i1p;

    .line 9
    .line 10
    invoke-direct {v1, p1}, La/i1p;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    new-instance v1, La/i1p;

    .line 20
    .line 21
    invoke-direct {v1, p2, p1}, La/i1p;-><init>(Ljava/io/Serializable;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    new-instance p2, La/j1p;

    .line 28
    .line 29
    invoke-direct {p2, p3, p1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 40
    .line 41
    const-wide/16 p2, 0xbed

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2, p3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public o()V
    .locals 3

    .line 1
    const-wide/16 v0, 0xc08

    .line 2
    .line 3
    const-string v2, "phone"

    .line 4
    .line 5
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 6
    .line 7
    invoke-static {v2, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public p(La/y1p;)V
    .locals 3

    .line 1
    new-instance v0, La/yni0;

    .line 2
    .line 3
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/j1p;

    .line 7
    .line 8
    iget-object p1, p1, La/y1p;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 22
    .line 23
    const-wide/16 v0, 0xc3b

    .line 24
    .line 25
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/j1p;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    new-array p2, p2, [La/k1p;

    .line 15
    .line 16
    aput-object v0, p2, v1

    .line 17
    .line 18
    aput-object p1, p2, v2

    .line 19
    .line 20
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 25
    .line 26
    const-wide/16 v0, 0xbeb

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/j1p;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    new-array p2, v2, [La/k1p;

    .line 14
    .line 15
    aput-object v0, p2, v1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aput-object p1, p2, v0

    .line 19
    .line 20
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 25
    .line 26
    const-wide/16 v0, 0xc72

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public s()V
    .locals 3

    .line 1
    const-wide/16 v0, 0xc08

    .line 2
    .line 3
    const-string v2, "telegram"

    .line 4
    .line 5
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 6
    .line 7
    invoke-static {v2, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public t(La/y1p;)V
    .locals 3

    .line 1
    new-instance v0, La/yni0;

    .line 2
    .line 3
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/j1p;

    .line 7
    .line 8
    iget-object p1, p1, La/y1p;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 22
    .line 23
    const-wide/16 v0, 0x2982

    .line 24
    .line 25
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public u(Ljava/lang/String;La/nfp;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/j1p;

    .line 5
    .line 6
    const-string v1, "sport"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 10
    .line 11
    .line 12
    new-instance v1, La/j1p;

    .line 13
    .line 14
    iget-object p2, p2, La/nfp;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v1, p2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 18
    .line 19
    .line 20
    new-instance p2, La/j1p;

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-direct {p2, p1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x3

    .line 27
    new-array p1, p1, [La/k1p;

    .line 28
    .line 29
    aput-object v0, p1, v2

    .line 30
    .line 31
    aput-object v1, p1, v3

    .line 32
    .line 33
    aput-object p2, p1, v4

    .line 34
    .line 35
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p0, p0, La/gg5;->a:La/s1p;

    .line 40
    .line 41
    const-wide/16 v0, 0xc72

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
