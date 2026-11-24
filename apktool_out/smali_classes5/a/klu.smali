.class public final La/klu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/nlu;

.field public final synthetic m:La/gmq;

.field public final synthetic n:La/gmq;

.field public final synthetic o:Ljava/util/Map;

.field public final synthetic p:Z

.field public q:La/kmq;

.field public r:La/gmq;

.field public s:I


# direct methods
.method public constructor <init>(La/yje;La/nlu;La/gmq;La/gmq;Ljava/util/Map;Z)V
    .locals 0

    .line 1
    iput-object p2, p0, La/klu;->l:La/nlu;

    .line 2
    .line 3
    iput-object p3, p0, La/klu;->m:La/gmq;

    .line 4
    .line 5
    iput-object p4, p0, La/klu;->n:La/gmq;

    .line 6
    .line 7
    iput-object p5, p0, La/klu;->o:Ljava/util/Map;

    .line 8
    .line 9
    iput-boolean p6, p0, La/klu;->p:Z

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/klu;

    .line 7
    .line 8
    iget-object v5, p0, La/klu;->o:Ljava/util/Map;

    .line 9
    .line 10
    iget-boolean v6, p0, La/klu;->p:Z

    .line 11
    .line 12
    iget-object v2, p0, La/klu;->l:La/nlu;

    .line 13
    .line 14
    iget-object v3, p0, La/klu;->m:La/gmq;

    .line 15
    .line 16
    iget-object v4, p0, La/klu;->n:La/gmq;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, La/klu;-><init>(La/yje;La/nlu;La/gmq;La/gmq;Ljava/util/Map;Z)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/klu;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/klu;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/klu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/klu;->i:B

    .line 4
    .line 5
    iget-object v2, p0, La/klu;->l:La/nlu;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v4, :cond_1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v6

    .line 30
    :cond_1
    iget-object v1, p0, La/klu;->r:La/gmq;

    .line 31
    .line 32
    check-cast v1, La/gmq;

    .line 33
    .line 34
    iget-object v2, p0, La/klu;->q:La/kmq;

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget v1, p0, La/klu;->s:I

    .line 41
    .line 42
    iget-object v5, p0, La/klu;->q:La/kmq;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/klu;->j:La/kmq;

    .line 52
    .line 53
    iget-object v1, p0, La/klu;->k:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v7, v2, La/nlu;->a:La/uau;

    .line 62
    .line 63
    iput-object v6, p0, La/klu;->j:La/kmq;

    .line 64
    .line 65
    iput-object v6, p0, La/klu;->k:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object p1, p0, La/klu;->q:La/kmq;

    .line 68
    .line 69
    iput v1, p0, La/klu;->s:I

    .line 70
    .line 71
    iput-byte v5, p0, La/klu;->i:B

    .line 72
    .line 73
    invoke-virtual {v7, v1, p0}, La/uau;->a(ILa/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    if-ne v5, v0, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move-object v8, v5

    .line 81
    move-object v5, p1

    .line 82
    move-object p1, v8

    .line 83
    :goto_0
    check-cast p1, La/gmq;

    .line 84
    .line 85
    iget-object v2, v2, La/nlu;->b:La/nau;

    .line 86
    .line 87
    iput-object v6, p0, La/klu;->j:La/kmq;

    .line 88
    .line 89
    iput-object v6, p0, La/klu;->k:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v5, p0, La/klu;->q:La/kmq;

    .line 92
    .line 93
    move-object v7, p1

    .line 94
    check-cast v7, La/gmq;

    .line 95
    .line 96
    iput-object v7, p0, La/klu;->r:La/gmq;

    .line 97
    .line 98
    iput v1, p0, La/klu;->s:I

    .line 99
    .line 100
    iput-byte v4, p0, La/klu;->i:B

    .line 101
    .line 102
    invoke-virtual {v2, v1, p0}, La/nau;->a(ILa/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-ne v1, v0, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move-object v2, v1

    .line 110
    move-object v1, p1

    .line 111
    move-object p1, v2

    .line 112
    move-object v2, v5

    .line 113
    :goto_1
    check-cast p1, La/gmq;

    .line 114
    .line 115
    new-instance v4, La/mlu;

    .line 116
    .line 117
    iget-object v5, p0, La/klu;->o:Ljava/util/Map;

    .line 118
    .line 119
    iget-boolean v7, p0, La/klu;->p:Z

    .line 120
    .line 121
    invoke-direct {v4, v5, v7, v6}, La/mlu;-><init>(Ljava/util/Map;ZLa/yje;)V

    .line 122
    .line 123
    .line 124
    iget-object v5, p0, La/klu;->m:La/gmq;

    .line 125
    .line 126
    iget-object v7, p0, La/klu;->n:La/gmq;

    .line 127
    .line 128
    invoke-static {v5, v7, v1, p1, v4}, La/dub;->e0(La/gmq;La/gmq;La/gmq;La/gmq;La/zdr;)La/a1g;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object v6, p0, La/klu;->j:La/kmq;

    .line 133
    .line 134
    iput-object v6, p0, La/klu;->k:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v6, p0, La/klu;->q:La/kmq;

    .line 137
    .line 138
    iput-object v6, p0, La/klu;->r:La/gmq;

    .line 139
    .line 140
    iput-byte v3, p0, La/klu;->i:B

    .line 141
    .line 142
    invoke-static {v2, p1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-ne p0, v0, :cond_6

    .line 147
    .line 148
    :goto_2
    return-object v0

    .line 149
    :cond_6
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0
.end method
