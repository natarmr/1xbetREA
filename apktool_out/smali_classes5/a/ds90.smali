.class public final La/ds90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/es90;


# direct methods
.method public constructor <init>(La/es90;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ds90;->j:La/es90;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/ds90;

    .line 2
    .line 3
    iget-object p0, p0, La/ds90;->j:La/es90;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/ds90;-><init>(La/es90;La/yje;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, La/ds90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ds90;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ds90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v1, p0, La/ds90;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/ds90;->j:La/es90;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v5, La/es90;->i:La/g090;

    .line 28
    .line 29
    iget-object p1, p1, La/g090;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La/p7m0;

    .line 32
    .line 33
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, La/cr90;

    .line 38
    .line 39
    iget-object p1, p1, La/cr90;->c:Ljava/lang/String;

    .line 40
    .line 41
    const-string v1, "+"

    .line 42
    .line 43
    const-string v6, ""

    .line 44
    .line 45
    invoke-static {p1, v1, v6, v2}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v1, v5, La/es90;->j:La/cyu;

    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v1, v6}, La/cyu;->x(Ljava/lang/Integer;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    iget-object v1, v5, La/es90;->g:La/wti;

    .line 65
    .line 66
    iget-object v6, v5, La/es90;->e:Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 67
    .line 68
    instance-of v7, v6, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 69
    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    check-cast v6, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    move-object v6, v3

    .line 76
    :goto_0
    if-eqz v6, :cond_3

    .line 77
    .line 78
    iget-boolean v6, v6, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;->b:Z

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v6, v2

    .line 82
    :goto_1
    iput-boolean v4, p0, La/ds90;->i:Z

    .line 83
    .line 84
    invoke-virtual {v1, p0, p1, v6}, La/wti;->k(La/zje;Ljava/lang/String;Z)Ljava/io/Serializable;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_4

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_4
    :goto_2
    check-cast p1, La/qkt;

    .line 92
    .line 93
    iget-object p0, v5, La/es90;->k:La/p7m0;

    .line 94
    .line 95
    iget p1, p1, La/qkt;->a:I

    .line 96
    .line 97
    :try_start_0
    iget-object v0, v5, La/es90;->h:La/fnu;

    .line 98
    .line 99
    invoke-virtual {v0, p1}, La/fnu;->a(I)La/nq90;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    move v2, v4

    .line 103
    :catch_0
    new-instance v0, La/lp90;

    .line 104
    .line 105
    invoke-direct {v0, p1, v2}, La/lp90;-><init>(IZ)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_5
    sget-object p0, La/sp90;->a:La/sp90;

    .line 118
    .line 119
    throw p0
.end method
