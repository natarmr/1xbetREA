.class public final La/aqm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jot0;


# instance fields
.field public final a:La/vjq;

.field public final b:La/tpt0;

.field public final c:La/k050;

.field public d:La/pot0;

.field public final e:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(La/vjq;La/tpt0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/aqm0;->a:La/vjq;

    .line 11
    .line 12
    iput-object p2, p0, La/aqm0;->b:La/tpt0;

    .line 13
    .line 14
    new-instance p1, La/k050;

    .line 15
    .line 16
    invoke-direct {p1}, La/k050;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/aqm0;->c:La/k050;

    .line 20
    .line 21
    new-instance p1, Ljava/util/LinkedList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/aqm0;->e:Ljava/util/LinkedList;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(La/xpm0;La/pot0;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, La/zpm0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/zpm0;

    .line 7
    .line 8
    iget v1, v0, La/zpm0;->m:I

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
    iput v1, v0, La/zpm0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zpm0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/zpm0;-><init>(La/aqm0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/zpm0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zpm0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    const-string v5, "CXCP"

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p2, v0, La/zpm0;->j:La/pot0;

    .line 40
    .line 41
    iget-object p1, v0, La/zpm0;->i:La/xpm0;

    .line 42
    .line 43
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eqz p3, :cond_3

    .line 61
    .line 62
    new-instance p3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "StillCaptureRequestControl: submitting "

    .line 65
    .line 66
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v2, " at "

    .line 73
    .line 74
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-static {v5, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_3
    iput-object p1, v0, La/zpm0;->i:La/xpm0;

    .line 88
    .line 89
    iput-object p2, v0, La/zpm0;->j:La/pot0;

    .line 90
    .line 91
    iput v4, v0, La/zpm0;->m:I

    .line 92
    .line 93
    iget-object p3, p0, La/aqm0;->a:La/vjq;

    .line 94
    .line 95
    invoke-virtual {p3, v0}, La/vjq;->c(La/zje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    if-ne p3, v1, :cond_4

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    invoke-static {v5}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    const-string v0, "StillCaptureRequestControl: Issuing single capture"

    .line 115
    .line 116
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_5
    iget-object v0, p1, La/xpm0;->a:Ljava/util/ArrayList;

    .line 120
    .line 121
    iget v1, p1, La/xpm0;->b:I

    .line 122
    .line 123
    iget v2, p1, La/xpm0;->c:I

    .line 124
    .line 125
    invoke-interface {p2, v1, v2, p3, v0}, La/pot0;->a(IIILjava/util/ArrayList;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    iget-object p0, p0, La/aqm0;->b:La/tpt0;

    .line 130
    .line 131
    iget-object p0, p0, La/tpt0;->f:La/sje;

    .line 132
    .line 133
    new-instance p3, La/lcl0;

    .line 134
    .line 135
    const/4 v0, 0x7

    .line 136
    invoke-direct {p3, p2, p1, v3, v0}, La/lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x3

    .line 140
    invoke-static {p0, v3, p3, p1}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method

.method public final b(La/pot0;)V
    .locals 2

    .line 1
    iput-object p1, p0, La/aqm0;->d:La/pot0;

    .line 2
    .line 3
    iget-object p1, p0, La/aqm0;->b:La/tpt0;

    .line 4
    .line 5
    iget-object p1, p1, La/tpt0;->f:La/sje;

    .line 6
    .line 7
    new-instance v0, La/lpp;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/lpp;-><init>(La/aqm0;La/yje;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {p1, v1, v1, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final reset()V
    .locals 3

    .line 1
    iget-object v0, p0, La/aqm0;->b:La/tpt0;

    .line 2
    .line 3
    iget-object v0, v0, La/tpt0;->f:La/sje;

    .line 4
    .line 5
    new-instance v1, La/zol0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, La/zol0;-><init>(La/aqm0;La/yje;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 13
    .line 14
    .line 15
    return-void
.end method
