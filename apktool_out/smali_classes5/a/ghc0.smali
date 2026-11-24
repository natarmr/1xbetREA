.class public final La/ghc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/afc0;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:La/ol60;

.field public m:D

.field public n:Z

.field public final synthetic o:La/jhc0;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/jhc0;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ghc0;->o:La/jhc0;

    .line 2
    .line 3
    iput-object p2, p0, La/ghc0;->p:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/ghc0;

    .line 2
    .line 3
    iget-object v0, p0, La/ghc0;->o:La/jhc0;

    .line 4
    .line 5
    iget-object p0, p0, La/ghc0;->p:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/ghc0;-><init>(La/jhc0;Ljava/lang/String;La/yje;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/ghc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ghc0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ghc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/ghc0;->n:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, La/ghc0;->m:D

    .line 12
    .line 13
    iget-object v2, p0, La/ghc0;->l:La/ol60;

    .line 14
    .line 15
    iget-object v3, p0, La/ghc0;->k:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, La/ghc0;->j:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p0, p0, La/ghc0;->i:La/afc0;

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object v7, v2

    .line 25
    move-object v5, v4

    .line 26
    move-wide v1, v0

    .line 27
    move-object v4, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, La/ghc0;->o:La/jhc0;

    .line 39
    .line 40
    iget-object v1, p1, La/jhc0;->h:La/x4u;

    .line 41
    .line 42
    iget-object v1, v1, La/x4u;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/onv;

    .line 45
    .line 46
    iget-object v1, v1, La/onv;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, La/lgc0;

    .line 49
    .line 50
    iget-object v1, v1, La/lgc0;->b:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    move-object v5, v4

    .line 67
    check-cast v5, La/afc0;

    .line 68
    .line 69
    iget-object v5, v5, La/afc0;->a:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v6, p0, La/ghc0;->p:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    move-object v2, v4

    .line 80
    :cond_3
    move-object v1, v2

    .line 81
    check-cast v1, La/afc0;

    .line 82
    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    iget-object v2, p1, La/jhc0;->o:La/ol60;

    .line 86
    .line 87
    iget-object v4, v1, La/afc0;->a:Ljava/lang/String;

    .line 88
    .line 89
    iget-wide v5, v1, La/afc0;->b:D

    .line 90
    .line 91
    iget-object v7, v1, La/afc0;->i:La/cfc0;

    .line 92
    .line 93
    iget-object v7, v7, La/cfc0;->b:Ljava/lang/String;

    .line 94
    .line 95
    iget-object p1, p1, La/jhc0;->f:La/nou;

    .line 96
    .line 97
    iput-object v1, p0, La/ghc0;->i:La/afc0;

    .line 98
    .line 99
    iput-object v7, p0, La/ghc0;->j:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v4, p0, La/ghc0;->k:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v2, p0, La/ghc0;->l:La/ol60;

    .line 104
    .line 105
    iput-wide v5, p0, La/ghc0;->m:D

    .line 106
    .line 107
    iput-boolean v3, p0, La/ghc0;->n:Z

    .line 108
    .line 109
    invoke-static {p1, p0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v0, :cond_4

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_4
    move-object p0, v1

    .line 117
    move-object v8, v7

    .line 118
    move-object v7, v2

    .line 119
    move-wide v1, v5

    .line 120
    move-object v5, v8

    .line 121
    :goto_0
    check-cast p1, La/ql5;

    .line 122
    .line 123
    iget-object v6, p1, La/ql5;->f:Ljava/lang/String;

    .line 124
    .line 125
    iget v3, p0, La/afc0;->k:I

    .line 126
    .line 127
    new-instance v0, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 128
    .line 129
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;-><init>(DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance p0, La/xgc0;

    .line 133
    .line 134
    invoke-direct {p0, v0}, La/xgc0;-><init>(Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0
.end method
