.class public final La/el00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/j0g0;

.field public synthetic k:La/j0g0;

.field public final synthetic l:La/ywq0;

.field public final synthetic m:J


# direct methods
.method public constructor <init>(La/ywq0;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/el00;->l:La/ywq0;

    .line 2
    .line 3
    iput-wide p2, p0, La/el00;->m:J

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, La/j0g0;

    .line 2
    .line 3
    check-cast p2, La/j0g0;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance v0, La/el00;

    .line 8
    .line 9
    iget-object v1, p0, La/el00;->l:La/ywq0;

    .line 10
    .line 11
    iget-wide v2, p0, La/el00;->m:J

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p3}, La/el00;-><init>(La/ywq0;JLa/yje;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/el00;->j:La/j0g0;

    .line 17
    .line 18
    iput-object p2, v0, La/el00;->k:La/j0g0;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/el00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/el00;->j:La/j0g0;

    .line 2
    .line 3
    iget-object v1, p0, La/el00;->k:La/j0g0;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v3, p0, La/el00;->i:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-wide v5, p0, La/el00;->m:J

    .line 11
    .line 12
    iget-object v7, p0, La/el00;->l:La/ywq0;

    .line 13
    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x1

    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    if-eq v3, v9, :cond_1

    .line 19
    .line 20
    if-ne v3, v8, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v7, La/ywq0;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/fvt;

    .line 44
    .line 45
    iput-object v0, p0, La/el00;->j:La/j0g0;

    .line 46
    .line 47
    iput-object v1, p0, La/el00;->k:La/j0g0;

    .line 48
    .line 49
    iput-byte v9, p0, La/el00;->i:B

    .line 50
    .line 51
    iget-object p1, p1, La/fvt;->a:La/udg;

    .line 52
    .line 53
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 54
    .line 55
    iget-object p1, p1, La/tcg;->f:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    if-nez v10, :cond_3

    .line 66
    .line 67
    sget-object v10, La/i99;->b:La/i99;

    .line 68
    .line 69
    invoke-static {v9, v4, v10, v8}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-interface {p1, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_3
    check-cast v10, La/mz40;

    .line 77
    .line 78
    invoke-interface {v10, v0, p0}, La/mz40;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v2, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    :goto_0
    if-ne p1, v2, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_1
    if-ne p1, v2, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_2
    if-ne p1, v2, :cond_7

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_7
    :goto_3
    iget-object p1, v7, La/ywq0;->f:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, La/zwt;

    .line 103
    .line 104
    iput-object v0, p0, La/el00;->j:La/j0g0;

    .line 105
    .line 106
    iput-object v1, p0, La/el00;->k:La/j0g0;

    .line 107
    .line 108
    iput-byte v8, p0, La/el00;->i:B

    .line 109
    .line 110
    iget-object p1, p1, La/zwt;->a:La/udg;

    .line 111
    .line 112
    iget-object p1, p1, La/udg;->b:La/tcg;

    .line 113
    .line 114
    iget-object p1, p1, La/tcg;->g:Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-nez v5, :cond_8

    .line 125
    .line 126
    sget-object v5, La/i99;->b:La/i99;

    .line 127
    .line 128
    invoke-static {v9, v4, v5, v8}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-interface {p1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_8
    check-cast v5, La/mz40;

    .line 136
    .line 137
    invoke-interface {v5, v1, p0}, La/mz40;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, v2, :cond_9

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    :goto_4
    if-ne p0, v2, :cond_a

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    :goto_5
    if-ne p0, v2, :cond_b

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    :goto_6
    if-ne p0, v2, :cond_c

    .line 157
    .line 158
    :goto_7
    return-object v2

    .line 159
    :cond_c
    :goto_8
    new-instance p0, La/hcg;

    .line 160
    .line 161
    sget-object p1, La/iun;->a:La/iun;

    .line 162
    .line 163
    invoke-direct {p0, p1, v0, v1}, La/hcg;-><init>(La/iun;La/j0g0;La/j0g0;)V

    .line 164
    .line 165
    .line 166
    return-object p0
.end method
