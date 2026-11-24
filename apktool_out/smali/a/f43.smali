.class public final La/f43;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/u910;

.field public final synthetic k:La/fa10;

.field public final synthetic l:F

.field public final synthetic m:La/pz40;


# direct methods
.method public constructor <init>(La/u910;La/fa10;FLa/pz40;La/yje;)V
    .locals 1

    .line 1
    sget-object v0, La/ea10;->a:La/ea10;

    .line 2
    .line 3
    iput-object p1, p0, La/f43;->j:La/u910;

    .line 4
    .line 5
    iput-object p2, p0, La/f43;->k:La/fa10;

    .line 6
    .line 7
    iput p3, p0, La/f43;->l:F

    .line 8
    .line 9
    iput-object p4, p0, La/f43;->m:La/pz40;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/f43;

    .line 2
    .line 3
    sget-object p1, La/ea10;->a:La/ea10;

    .line 4
    .line 5
    iget-object v4, p0, La/f43;->m:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/f43;->j:La/u910;

    .line 8
    .line 9
    iget-object v2, p0, La/f43;->k:La/fa10;

    .line 10
    .line 11
    iget v3, p0, La/f43;->l:F

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/f43;-><init>(La/u910;La/fa10;FLa/pz40;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/f43;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/f43;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/f43;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/f43;->i:B

    .line 4
    .line 5
    iget-object v2, p0, La/f43;->m:La/pz40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_5

    .line 31
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_9

    .line 45
    .line 46
    iput-byte v4, p0, La/f43;->i:B

    .line 47
    .line 48
    iget-object v6, p0, La/f43;->j:La/u910;

    .line 49
    .line 50
    invoke-virtual {v6}, La/u910;->c()La/fa10;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v6}, La/u910;->b()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6}, La/u910;->g()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/4 v5, 0x0

    .line 62
    cmpg-float v1, v1, v5

    .line 63
    .line 64
    if-gez v1, :cond_3

    .line 65
    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    if-nez p1, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    if-gez v1, :cond_5

    .line 73
    .line 74
    :goto_0
    const/high16 v5, 0x3f800000    # 1.0f

    .line 75
    .line 76
    :cond_5
    :goto_1
    move v8, v5

    .line 77
    invoke-virtual {v6}, La/u910;->c()La/fa10;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-virtual {v6}, La/u910;->f()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    cmpg-float p1, v8, p1

    .line 86
    .line 87
    if-nez p1, :cond_6

    .line 88
    .line 89
    move p1, v4

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    const/4 p1, 0x0

    .line 92
    :goto_2
    xor-int/lit8 v9, p1, 0x1

    .line 93
    .line 94
    iget-object p1, v6, La/u910;->n:La/g050;

    .line 95
    .line 96
    new-instance v5, La/t910;

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    invoke-direct/range {v5 .. v10}, La/t910;-><init>(La/u910;La/fa10;FZLa/yje;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1, v5, p0}, La/g050;->a(La/g050;Lkotlin/jvm/functions/Function1;La/bnn0;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_7

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_3
    if-ne p1, v0, :cond_8

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    :goto_4
    if-ne p1, v0, :cond_9

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_9
    :goto_5
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-interface {v2, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, La/f43;->j:La/u910;

    .line 125
    .line 126
    invoke-virtual {v4}, La/u910;->f()F

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    sget-object p1, La/ea10;->a:La/ea10;

    .line 131
    .line 132
    iput-byte v3, p0, La/f43;->i:B

    .line 133
    .line 134
    iget-object v5, p0, La/f43;->k:La/fa10;

    .line 135
    .line 136
    const v6, 0x7fffffff

    .line 137
    .line 138
    .line 139
    iget v7, p0, La/f43;->l:F

    .line 140
    .line 141
    const/16 v10, 0x202

    .line 142
    .line 143
    move-object v9, p0

    .line 144
    invoke-static/range {v4 .. v10}, La/fww;->s(La/u910;La/fa10;IFFLa/bnn0;I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v0, :cond_a

    .line 149
    .line 150
    :goto_6
    return-object v0

    .line 151
    :cond_a
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0
.end method
