.class public final La/nlq0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/dnt0;

.field public final c:La/pyu;

.field public final d:La/usd;

.field public final e:La/wyu;

.field public final f:La/xyu;

.field public final g:La/yyu;

.field public final h:La/xyu;

.field public final i:Z

.field public final j:La/p7m0;

.field public final k:La/p7m0;

.field public final l:La/p7m0;

.field public final m:La/p7m0;

.field public final n:La/p7m0;

.field public final o:La/p7m0;

.field public final p:La/p7m0;

.field public final q:La/ol60;

.field public r:Z


# direct methods
.method public constructor <init>(La/dnt0;La/pyu;La/usd;La/wyu;La/xyu;La/yyu;La/xyu;Z)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nlq0;->b:La/dnt0;

    .line 8
    .line 9
    iput-object p2, p0, La/nlq0;->c:La/pyu;

    .line 10
    .line 11
    iput-object p3, p0, La/nlq0;->d:La/usd;

    .line 12
    .line 13
    iput-object p4, p0, La/nlq0;->e:La/wyu;

    .line 14
    .line 15
    iput-object p5, p0, La/nlq0;->f:La/xyu;

    .line 16
    .line 17
    iput-object p6, p0, La/nlq0;->g:La/yyu;

    .line 18
    .line 19
    iput-object p7, p0, La/nlq0;->h:La/xyu;

    .line 20
    .line 21
    iput-boolean p8, p0, La/nlq0;->i:Z

    .line 22
    .line 23
    new-instance p1, La/z860;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    sget-object p4, La/iun;->a:La/iun;

    .line 31
    .line 32
    invoke-direct {p1, p2, p2, p4}, La/z860;-><init>(IILjava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, La/nlq0;->j:La/p7m0;

    .line 40
    .line 41
    move p1, p2

    .line 42
    :goto_0
    const/16 p5, 0x3c

    .line 43
    .line 44
    if-ge p1, p5, :cond_0

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    invoke-static {p4, p5}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {p4}, La/nlq0;->w(Ljava/util/List;)La/z860;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    new-instance p1, La/z860;

    .line 64
    .line 65
    sget-object p4, La/iun;->a:La/iun;

    .line 66
    .line 67
    invoke-direct {p1, p2, p2, p4}, La/z860;-><init>(IILjava/util/List;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, La/nlq0;->k:La/p7m0;

    .line 75
    .line 76
    new-instance p1, La/z860;

    .line 77
    .line 78
    sget-object p4, La/iun;->a:La/iun;

    .line 79
    .line 80
    invoke-direct {p1, p2, p2, p4}, La/z860;-><init>(IILjava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, La/nlq0;->l:La/p7m0;

    .line 88
    .line 89
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, La/nlq0;->m:La/p7m0;

    .line 94
    .line 95
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, La/nlq0;->n:La/p7m0;

    .line 100
    .line 101
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, La/nlq0;->o:La/p7m0;

    .line 106
    .line 107
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, p0, La/nlq0;->p:La/p7m0;

    .line 114
    .line 115
    new-instance p1, La/ol60;

    .line 116
    .line 117
    const/4 p2, 0x3

    .line 118
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 119
    .line 120
    .line 121
    iput-object p1, p0, La/nlq0;->q:La/ol60;

    .line 122
    .line 123
    const/4 p1, 0x1

    .line 124
    iput-boolean p1, p0, La/nlq0;->r:Z

    .line 125
    .line 126
    return-void
.end method

.method public static w(Ljava/util/List;)La/z860;
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    invoke-static {p0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const/4 v4, 0x2

    .line 65
    invoke-static {v4, v3}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    new-instance p0, La/z860;

    .line 74
    .line 75
    invoke-direct {p0, v0, v1, v2}, La/z860;-><init>(IILjava/util/List;)V

    .line 76
    .line 77
    .line 78
    return-object p0
.end method
