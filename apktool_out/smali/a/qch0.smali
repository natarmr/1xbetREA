.class public final La/qch0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/sch0;

.field public j:La/lie0;

.field public k:J

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/sch0;

.field public final synthetic o:La/lie0;

.field public final synthetic p:J


# direct methods
.method public constructor <init>(La/sch0;La/lie0;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qch0;->n:La/sch0;

    .line 2
    .line 3
    iput-object p2, p0, La/qch0;->o:La/lie0;

    .line 4
    .line 5
    iput-wide p3, p0, La/qch0;->p:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/qch0;

    .line 2
    .line 3
    iget-object v2, p0, La/qch0;->o:La/lie0;

    .line 4
    .line 5
    iget-wide v3, p0, La/qch0;->p:J

    .line 6
    .line 7
    iget-object v1, p0, La/qch0;->n:La/sch0;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/qch0;-><init>(La/sch0;La/lie0;JLa/yje;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/qch0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/rch0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/qch0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qch0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qch0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/qch0;->l:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, La/qch0;->k:J

    .line 12
    .line 13
    iget-object v4, p0, La/qch0;->j:La/lie0;

    .line 14
    .line 15
    iget-object v5, p0, La/qch0;->i:La/sch0;

    .line 16
    .line 17
    iget-object p0, p0, La/qch0;->m:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/sch0;

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, La/qch0;->m:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/rch0;

    .line 38
    .line 39
    new-instance v1, La/fv2;

    .line 40
    .line 41
    iget-object v5, p0, La/qch0;->n:La/sch0;

    .line 42
    .line 43
    invoke-direct {v1, v5, p1, v2}, La/fv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v5, La/sch0;->c:La/qkq;

    .line 47
    .line 48
    iget-object v4, p0, La/qch0;->o:La/lie0;

    .line 49
    .line 50
    iget-wide v6, v4, La/lie0;->a:J

    .line 51
    .line 52
    iget-object v8, v5, La/sch0;->d:La/ma80;

    .line 53
    .line 54
    sget-object v9, La/ma80;->b:La/ma80;

    .line 55
    .line 56
    iget-wide v10, p0, La/qch0;->p:J

    .line 57
    .line 58
    if-ne v8, v9, :cond_2

    .line 59
    .line 60
    invoke-static {v10, v11}, La/g6u0;->b(J)F

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {v10, v11}, La/g6u0;->c(J)F

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    :goto_0
    invoke-virtual {v5, v8}, La/sch0;->e(F)F

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    iput-object v5, p0, La/qch0;->m:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v5, p0, La/qch0;->i:La/sch0;

    .line 76
    .line 77
    iput-object v4, p0, La/qch0;->j:La/lie0;

    .line 78
    .line 79
    iput-wide v6, p0, La/qch0;->k:J

    .line 80
    .line 81
    iput-boolean v3, p0, La/qch0;->l:Z

    .line 82
    .line 83
    invoke-interface {p1, v1, v8, p0}, La/qkq;->a(La/qah0;FLa/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_3

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    move-object p0, v5

    .line 91
    move-wide v0, v6

    .line 92
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-virtual {p0, p1}, La/sch0;->e(F)F

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    iget-object p1, v5, La/sch0;->d:La/ma80;

    .line 103
    .line 104
    sget-object v5, La/ma80;->b:La/ma80;

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    if-ne p1, v5, :cond_4

    .line 108
    .line 109
    invoke-static {v0, v1, p0, v6, v2}, La/g6u0;->a(JFFI)J

    .line 110
    .line 111
    .line 112
    move-result-wide p0

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-static {v0, v1, v6, p0, v3}, La/g6u0;->a(JFFI)J

    .line 115
    .line 116
    .line 117
    move-result-wide p0

    .line 118
    :goto_2
    iput-wide p0, v4, La/lie0;->a:J

    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method
