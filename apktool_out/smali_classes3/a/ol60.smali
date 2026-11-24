.class public final La/ol60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/noj0;


# instance fields
.field public final a:I

.field public final b:La/i99;

.field public final c:Z

.field public final d:Ljava/util/concurrent/LinkedBlockingDeque;

.field public final e:La/n0o0;

.field public final f:La/qoj0;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    sget-object v0, La/i99;->b:La/i99;

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    .line 51
    sget-object v0, La/i99;->a:La/i99;

    :cond_0
    const p1, 0x7fffffff

    .line 52
    invoke-direct {p0, p1, v0}, La/ol60;-><init>(ILa/i99;)V

    return-void
.end method

.method public constructor <init>(ILa/i99;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/ol60;->a:I

    .line 8
    .line 9
    iput-object p2, p0, La/ol60;->b:La/i99;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    const v0, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, p2

    .line 20
    :goto_0
    iput-boolean p1, p0, La/ol60;->c:Z

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/ol60;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 28
    .line 29
    new-instance p1, La/th50;

    .line 30
    .line 31
    const/16 v1, 0x18

    .line 32
    .line 33
    invoke-direct {p1, v1}, La/th50;-><init>(B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/ol60;->e:La/n0o0;

    .line 41
    .line 42
    sget-object p1, La/i99;->a:La/i99;

    .line 43
    .line 44
    invoke-static {p2, v0, p1}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/ol60;->f:La/qoj0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/nl60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/nl60;

    .line 7
    .line 8
    iget v1, v0, La/nl60;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/nl60;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nl60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/nl60;-><init>(La/ol60;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/nl60;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nl60;->m:I

    .line 30
    .line 31
    iget-object v3, p0, La/ol60;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-eq v2, v4, :cond_1

    .line 41
    .line 42
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v6

    .line 48
    :cond_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, La/csj;->b()V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    iget-object p1, v0, La/nl60;->j:Ljava/util/Iterator;

    .line 56
    .line 57
    iget-object v2, v0, La/nl60;->i:La/kmq;

    .line 58
    .line 59
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    move-object v8, p2

    .line 75
    move-object p2, p1

    .line 76
    move-object p1, v8

    .line 77
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v7}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_4

    .line 96
    .line 97
    invoke-virtual {v3, v2}, Ljava/util/concurrent/LinkedBlockingDeque;->remove(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    iput-object p2, v0, La/nl60;->i:La/kmq;

    .line 101
    .line 102
    iput-object p1, v0, La/nl60;->j:Ljava/util/Iterator;

    .line 103
    .line 104
    iput v5, v0, La/nl60;->m:I

    .line 105
    .line 106
    invoke-interface {p2, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-ne v2, v1, :cond_5

    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_5
    move-object v2, p2

    .line 114
    :goto_2
    move-object p2, v2

    .line 115
    goto :goto_1

    .line 116
    :cond_6
    new-instance p1, La/clu;

    .line 117
    .line 118
    invoke-direct {p1, p0, p2}, La/clu;-><init>(La/ol60;La/kmq;)V

    .line 119
    .line 120
    .line 121
    iput-object v6, v0, La/nl60;->i:La/kmq;

    .line 122
    .line 123
    iput-object v6, v0, La/nl60;->j:Ljava/util/Iterator;

    .line 124
    .line 125
    iput v4, v0, La/nl60;->m:I

    .line 126
    .line 127
    iget-object p0, p0, La/ol60;->f:La/qoj0;

    .line 128
    .line 129
    invoke-virtual {p0, p1, v0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    sget-object p0, La/wne;->a:La/wne;

    .line 133
    .line 134
    return-object v1
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ol60;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, La/ol60;->c:Z

    .line 2
    .line 3
    iget-object v1, p0, La/ol60;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->addLast(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingDeque;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v2, p0, La/ol60;->a:I

    .line 16
    .line 17
    if-ge v0, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->addLast(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, La/ol60;->b:La/i99;

    .line 24
    .line 25
    sget-object v2, La/i99;->b:La/i99;

    .line 26
    .line 27
    if-ne v0, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->addLast(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingDeque;->removeFirst()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, La/ol60;->e:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingDeque;->addLast(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object p0, p0, La/ol60;->f:La/qoj0;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method
