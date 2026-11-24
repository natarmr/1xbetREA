.class public final La/shu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j400;


# direct methods
.method public constructor <init>(La/j400;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/shu;->a:La/j400;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/ucq;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/rhu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/rhu;

    .line 7
    .line 8
    iget v1, v0, La/rhu;->l:I

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
    iput v1, v0, La/rhu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/rhu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/rhu;-><init>(La/shu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/rhu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/rhu;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p2, v0, La/rhu;->i:La/ucq;

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, v0, La/rhu;->i:La/ucq;

    .line 53
    .line 54
    iput v3, v0, La/rhu;->l:I

    .line 55
    .line 56
    iget-object p0, p0, La/shu;->a:La/j400;

    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, La/j400;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    if-ne p3, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p3, La/fzz;

    .line 66
    .line 67
    iget-object p0, p3, La/fzz;->a:Ljava/util/List;

    .line 68
    .line 69
    new-instance p1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v1, v0

    .line 89
    check-cast v1, La/pcq;

    .line 90
    .line 91
    iget-object v1, v1, La/pcq;->b:La/xrz;

    .line 92
    .line 93
    invoke-static {v1, p2}, La/ulb;->T(La/xrz;La/ucq;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    iget-object p0, p3, La/fzz;->b:Ljava/util/List;

    .line 104
    .line 105
    new-instance p3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :cond_6
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move-object v1, v0

    .line 125
    check-cast v1, La/niq0;

    .line 126
    .line 127
    iget-object v1, v1, La/niq0;->b:La/xrz;

    .line 128
    .line 129
    invoke-static {v1, p2}, La/ulb;->T(La/xrz;La/ucq;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    new-instance p0, La/fzz;

    .line 140
    .line 141
    invoke-direct {p0, p1, p3}, La/fzz;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    return-object p0
.end method
