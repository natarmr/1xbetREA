.class public final La/jp90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/kp90;


# direct methods
.method public constructor <init>(La/kp90;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jp90;->j:La/kp90;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/jp90;

    .line 2
    .line 3
    iget-object p0, p0, La/jp90;->j:La/kp90;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/jp90;-><init>(La/kp90;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/jp90;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jp90;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/jp90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/jp90;->j:La/kp90;

    .line 2
    .line 3
    iget-object v1, v0, La/kp90;->v:La/i1w0;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-boolean v3, p0, La/jp90;->i:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-ne v3, v5, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v6

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La/br90;

    .line 34
    .line 35
    iget-object p1, p1, La/br90;->b:La/zqp;

    .line 36
    .line 37
    iget-object p1, p1, La/zqp;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, v0, La/kp90;->x:La/cyu;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v3, v7}, La/cyu;->x(Ljava/lang/Integer;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    iget-object v3, v0, La/kp90;->r:Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 55
    .line 56
    iget-object v3, v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams;->a:Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;

    .line 57
    .line 58
    instance-of v7, v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;

    .line 59
    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    check-cast v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v3, v6

    .line 66
    :goto_0
    if-eqz v3, :cond_3

    .line 67
    .line 68
    iget-boolean v3, v3, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;->b:Z

    .line 69
    .line 70
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    :cond_3
    iget-object v3, v0, La/kp90;->t:La/wti;

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    move v6, v4

    .line 84
    :goto_1
    iput-boolean v5, p0, La/jp90;->i:Z

    .line 85
    .line 86
    invoke-virtual {v3, p0, p1, v6}, La/wti;->k(La/zje;Ljava/lang/String;Z)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v2, :cond_5

    .line 91
    .line 92
    return-object v2

    .line 93
    :cond_5
    :goto_2
    check-cast p1, La/qkt;

    .line 94
    .line 95
    iget p0, p1, La/qkt;->a:I

    .line 96
    .line 97
    :try_start_0
    iget-object p1, v0, La/kp90;->u:La/fnu;

    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/fnu;->a(I)La/nq90;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    move v4, v5

    .line 103
    :catch_0
    new-instance p1, La/kl90;

    .line 104
    .line 105
    invoke-direct {p1, p0, v4}, La/kl90;-><init>(IZ)V

    .line 106
    .line 107
    .line 108
    const-string p0, "PICKER_DIALOG_PHONE_CODE_BY_MANUALLY_KEY"

    .line 109
    .line 110
    invoke-virtual {v1, p1, p0}, La/i1w0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, La/gp90;

    .line 114
    .line 115
    const/4 p1, 0x3

    .line 116
    invoke-direct {p0, v0, p1}, La/gp90;-><init>(La/kp90;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_6
    sget-object p0, La/sp90;->a:La/sp90;

    .line 126
    .line 127
    throw p0
.end method
