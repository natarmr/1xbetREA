.class public final La/pml;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:F

.field public k:Ljava/util/Iterator;

.field public l:B

.field public final synthetic m:La/w6k;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:La/pz40;

.field public final synthetic p:La/cgk0;

.field public final synthetic q:La/pz40;


# direct methods
.method public constructor <init>(La/w6k;Ljava/util/List;La/pz40;La/cgk0;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pml;->m:La/w6k;

    .line 2
    .line 3
    iput-object p2, p0, La/pml;->n:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, La/pml;->o:La/pz40;

    .line 6
    .line 7
    iput-object p4, p0, La/pml;->p:La/cgk0;

    .line 8
    .line 9
    iput-object p5, p0, La/pml;->q:La/pz40;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/pml;

    .line 2
    .line 3
    iget-object v4, p0, La/pml;->p:La/cgk0;

    .line 4
    .line 5
    iget-object v5, p0, La/pml;->q:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/pml;->m:La/w6k;

    .line 8
    .line 9
    iget-object v2, p0, La/pml;->n:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, p0, La/pml;->o:La/pz40;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/pml;-><init>(La/w6k;Ljava/util/List;La/pz40;La/cgk0;La/pz40;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/pml;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pml;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/pml;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/pml;->l:B

    .line 4
    .line 5
    iget-object v2, p0, La/pml;->n:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, La/pml;->o:La/pz40;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    iget v1, p0, La/pml;->j:F

    .line 18
    .line 19
    iget v2, p0, La/pml;->i:I

    .line 20
    .line 21
    iget-object v5, p0, La/pml;->k:Ljava/util/Iterator;

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

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
    iget v1, p0, La/pml;->j:F

    .line 35
    .line 36
    iget v6, p0, La/pml;->i:I

    .line 37
    .line 38
    iget-object v7, p0, La/pml;->k:Ljava/util/Iterator;

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_7

    .line 58
    .line 59
    iget-object p1, p0, La/pml;->p:La/cgk0;

    .line 60
    .line 61
    invoke-virtual {p1}, La/cgk0;->l()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-lez v1, :cond_7

    .line 66
    .line 67
    sget-object v1, La/qmk;->a:La/zcl;

    .line 68
    .line 69
    const/high16 v1, 0x40c00000    # 6.0f

    .line 70
    .line 71
    iget-object v6, p0, La/pml;->m:La/w6k;

    .line 72
    .line 73
    invoke-interface {v6, v1}, La/w6k;->T(F)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {p1}, La/cgk0;->l()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    add-int/2addr p1, v1

    .line 82
    int-to-float p1, p1

    .line 83
    const/4 v6, 0x0

    .line 84
    cmpl-float v6, p1, v6

    .line 85
    .line 86
    if-lez v6, :cond_6

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    move-object v7, v6

    .line 93
    move v6, v1

    .line 94
    move v1, p1

    .line 95
    :cond_3
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, La/pzh;

    .line 106
    .line 107
    iget-object p1, p1, La/pzh;->b:La/xcz;

    .line 108
    .line 109
    iput-object v7, p0, La/pml;->k:Ljava/util/Iterator;

    .line 110
    .line 111
    iput v6, p0, La/pml;->i:I

    .line 112
    .line 113
    iput v1, p0, La/pml;->j:F

    .line 114
    .line 115
    iput-byte v5, p0, La/pml;->l:B

    .line 116
    .line 117
    invoke-static {p1, v1, p0}, La/hkb;->y(La/xcz;FLa/zje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v0, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    move-object v5, p1

    .line 129
    move v2, v6

    .line 130
    :cond_5
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, La/pzh;

    .line 141
    .line 142
    iput-object v5, p0, La/pml;->k:Ljava/util/Iterator;

    .line 143
    .line 144
    iput v2, p0, La/pml;->i:I

    .line 145
    .line 146
    iput v1, p0, La/pml;->j:F

    .line 147
    .line 148
    iput-byte v4, p0, La/pml;->l:B

    .line 149
    .line 150
    invoke-static {p1, p0}, La/hkb;->L(La/pzh;La/zje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v0, :cond_5

    .line 155
    .line 156
    :goto_2
    return-object v0

    .line 157
    :cond_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 158
    .line 159
    iget-object p0, p0, La/pml;->q:La/pz40;

    .line 160
    .line 161
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v3, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0
.end method
