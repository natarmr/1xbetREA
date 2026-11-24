.class public final La/myu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public final synthetic l:La/nyu;

.field public final synthetic m:I


# direct methods
.method public constructor <init>(La/nyu;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/myu;->l:La/nyu;

    .line 2
    .line 3
    iput p2, p0, La/myu;->m:I

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/util/List;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance v0, La/myu;

    .line 8
    .line 9
    iget-object v1, p0, La/myu;->l:La/nyu;

    .line 10
    .line 11
    iget p0, p0, La/myu;->m:I

    .line 12
    .line 13
    invoke-direct {v0, v1, p0, p3}, La/myu;-><init>(La/nyu;ILa/yje;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/myu;->j:Ljava/util/List;

    .line 17
    .line 18
    iput-object p2, v0, La/myu;->k:Ljava/util/List;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/myu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/myu;->j:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, La/myu;->k:Ljava/util/List;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v3, p0, La/myu;->i:Z

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    if-ne v3, v4, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    const/16 p1, 0xa

    .line 35
    .line 36
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v5, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-static {v3, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, La/rfp0;

    .line 64
    .line 65
    iget v3, v3, La/rfp0;->b:I

    .line 66
    .line 67
    new-instance v6, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-direct {v6, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p1, p0, La/myu;->l:La/nyu;

    .line 77
    .line 78
    iget-object p1, p1, La/nyu;->a:La/iqp0;

    .line 79
    .line 80
    iput-object v0, p0, La/myu;->j:Ljava/util/List;

    .line 81
    .line 82
    iput-object v1, p0, La/myu;->k:Ljava/util/List;

    .line 83
    .line 84
    iput-boolean v4, p0, La/myu;->i:Z

    .line 85
    .line 86
    iget p0, p0, La/myu;->m:I

    .line 87
    .line 88
    invoke-virtual {p1, p0, v5}, La/iqp0;->b(ILjava/util/List;)Lkotlin/Unit;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v2, :cond_3

    .line 93
    .line 94
    return-object v2

    .line 95
    :cond_3
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v2, v1

    .line 115
    check-cast v2, La/rfp0;

    .line 116
    .line 117
    iget v2, v2, La/rfp0;->b:I

    .line 118
    .line 119
    invoke-static {v2, v0}, La/rz4;->C(ILjava/util/List;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    return-object p0
.end method
