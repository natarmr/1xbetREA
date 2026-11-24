.class public final La/qml;
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

.field public final synthetic o:La/cgk0;


# direct methods
.method public constructor <init>(La/w6k;Ljava/util/List;La/cgk0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qml;->m:La/w6k;

    .line 2
    .line 3
    iput-object p2, p0, La/qml;->n:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, La/qml;->o:La/cgk0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, La/qml;

    .line 2
    .line 3
    iget-object v0, p0, La/qml;->n:Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, La/qml;->o:La/cgk0;

    .line 6
    .line 7
    iget-object p0, p0, La/qml;->m:La/w6k;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/qml;-><init>(La/w6k;Ljava/util/List;La/cgk0;La/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/qml;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qml;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qml;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/qml;->l:B

    .line 4
    .line 5
    iget-object v2, p0, La/qml;->n:Ljava/util/List;

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
    iget v1, p0, La/qml;->j:F

    .line 16
    .line 17
    iget v2, p0, La/qml;->i:I

    .line 18
    .line 19
    iget-object v4, p0, La/qml;->k:Ljava/util/Iterator;

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    iget v1, p0, La/qml;->j:F

    .line 33
    .line 34
    iget v5, p0, La/qml;->i:I

    .line 35
    .line 36
    iget-object v6, p0, La/qml;->k:Ljava/util/Iterator;

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/qml;->o:La/cgk0;

    .line 46
    .line 47
    invoke-virtual {p1}, La/cgk0;->l()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-lez v1, :cond_6

    .line 52
    .line 53
    sget-object v1, La/qmk;->a:La/zcl;

    .line 54
    .line 55
    const/high16 v1, 0x40c00000    # 6.0f

    .line 56
    .line 57
    iget-object v5, p0, La/qml;->m:La/w6k;

    .line 58
    .line 59
    invoke-interface {v5, v1}, La/w6k;->T(F)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p1}, La/cgk0;->l()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    add-int/2addr p1, v1

    .line 68
    int-to-float p1, p1

    .line 69
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    move-object v6, v5

    .line 74
    move v5, v1

    .line 75
    move v1, p1

    .line 76
    :cond_3
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/pzh;

    .line 87
    .line 88
    iget-object p1, p1, La/pzh;->b:La/xcz;

    .line 89
    .line 90
    iput-object v6, p0, La/qml;->k:Ljava/util/Iterator;

    .line 91
    .line 92
    iput v5, p0, La/qml;->i:I

    .line 93
    .line 94
    iput v1, p0, La/qml;->j:F

    .line 95
    .line 96
    iput-byte v4, p0, La/qml;->l:B

    .line 97
    .line 98
    invoke-static {p1, v1, p0}, La/hkb;->y(La/xcz;FLa/zje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v0, :cond_3

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    move-object v4, p1

    .line 110
    move v2, v5

    .line 111
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, La/pzh;

    .line 122
    .line 123
    iput-object v4, p0, La/qml;->k:Ljava/util/Iterator;

    .line 124
    .line 125
    iput v2, p0, La/qml;->i:I

    .line 126
    .line 127
    iput v1, p0, La/qml;->j:F

    .line 128
    .line 129
    iput-byte v3, p0, La/qml;->l:B

    .line 130
    .line 131
    invoke-static {p1, p0}, La/hkb;->L(La/pzh;La/zje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v0, :cond_5

    .line 136
    .line 137
    :goto_2
    return-object v0

    .line 138
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0
.end method
