.class public final La/vej;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

.field public final synthetic j:Ljava/util/Calendar;

.field public final synthetic k:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

.field public final synthetic l:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

.field public final synthetic m:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

.field public final synthetic n:La/yg40;

.field public final synthetic o:La/ulq0;

.field public final synthetic p:La/pz40;

.field public final synthetic q:La/pz40;


# direct methods
.method public constructor <init>(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;La/yg40;La/ulq0;La/pz40;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vej;->i:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 2
    .line 3
    iput-object p2, p0, La/vej;->j:Ljava/util/Calendar;

    .line 4
    .line 5
    iput-object p3, p0, La/vej;->k:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 6
    .line 7
    iput-object p4, p0, La/vej;->l:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 8
    .line 9
    iput-object p5, p0, La/vej;->m:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 10
    .line 11
    iput-object p6, p0, La/vej;->n:La/yg40;

    .line 12
    .line 13
    iput-object p7, p0, La/vej;->o:La/ulq0;

    .line 14
    .line 15
    iput-object p8, p0, La/vej;->p:La/pz40;

    .line 16
    .line 17
    iput-object p9, p0, La/vej;->q:La/pz40;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/vej;

    .line 2
    .line 3
    iget-object v8, p0, La/vej;->p:La/pz40;

    .line 4
    .line 5
    iget-object v9, p0, La/vej;->q:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/vej;->i:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 8
    .line 9
    iget-object v2, p0, La/vej;->j:Ljava/util/Calendar;

    .line 10
    .line 11
    iget-object v3, p0, La/vej;->k:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 12
    .line 13
    iget-object v4, p0, La/vej;->l:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 14
    .line 15
    iget-object v5, p0, La/vej;->m:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 16
    .line 17
    iget-object v6, p0, La/vej;->n:La/yg40;

    .line 18
    .line 19
    iget-object v7, p0, La/vej;->o:La/ulq0;

    .line 20
    .line 21
    move-object v10, p2

    .line 22
    invoke-direct/range {v0 .. v10}, La/vej;-><init>(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;La/yg40;La/ulq0;La/pz40;La/pz40;La/yje;)V

    .line 23
    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2}, La/vej;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vej;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/vej;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v3, p0, La/vej;->i:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 7
    .line 8
    iget-object p1, p0, La/vej;->j:Ljava/util/Calendar;

    .line 9
    .line 10
    invoke-static {v3, p1}, La/wdx;->e0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v4, p0, La/vej;->k:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 15
    .line 16
    invoke-static {v4, p1}, La/wdx;->e0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long p1, v0, v5

    .line 21
    .line 22
    if-lez p1, :cond_0

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p1, La/ulq0;->a:La/ulq0;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iget-object v7, p0, La/vej;->o:La/ulq0;

    .line 31
    .line 32
    if-ne v7, p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, La/vej;->n:La/yg40;

    .line 35
    .line 36
    move-object v6, p1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v6, v0

    .line 39
    :goto_0
    iget-object v1, p0, La/vej;->l:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 40
    .line 41
    iget-object v2, p0, La/vej;->m:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 42
    .line 43
    iget-object v5, p0, La/vej;->j:Ljava/util/Calendar;

    .line 44
    .line 45
    invoke-static/range {v1 .. v6}, La/rsr0;->a0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;La/yg40;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 52
    .line 53
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v3, 0x1

    .line 62
    const/4 v4, 0x0

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    if-ne v2, v3, :cond_2

    .line 66
    .line 67
    invoke-static {v1, v4, v4}, La/rsr0;->j0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;II)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    if-ne v2, v3, :cond_4

    .line 83
    .line 84
    invoke-static {p1, v4, v4}, La/rsr0;->j0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;II)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_5
    :goto_2
    iget-object v0, p0, La/vej;->l:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 94
    .line 95
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, La/vej;->p:La/pz40;

    .line 102
    .line 103
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    :cond_6
    iget-object v0, p0, La/vej;->m:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 113
    .line 114
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_7

    .line 119
    .line 120
    iget-object p0, p0, La/vej;->q:La/pz40;

    .line 121
    .line 122
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 127
    .line 128
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0
.end method
