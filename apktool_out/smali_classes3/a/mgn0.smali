.class public abstract La/mgn0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;
    .locals 14

    .line 1
    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 8
    .line 9
    iget-object v5, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 12
    .line 13
    new-instance v6, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    instance-of v7, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 43
    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    new-instance v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 47
    .line 48
    check-cast v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 49
    .line 50
    iget-object v8, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;->a:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v7, v8, v0}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    instance-of v7, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 59
    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    new-instance v8, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 63
    .line 64
    check-cast v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 65
    .line 66
    iget-object v10, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v11, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->b:Ljava/lang/String;

    .line 69
    .line 70
    iget v9, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->c:I

    .line 71
    .line 72
    iget-object v12, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->d:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v13, v0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;->e:Z

    .line 75
    .line 76
    invoke-direct/range {v8 .. v13}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    move-object v7, v8

    .line 80
    :goto_1
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0

    .line 89
    :cond_2
    new-instance v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    invoke-direct/range {v0 .. v7}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public static final b(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;La/ctf0;)Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;->b:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    new-array v4, v3, [Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 14
    .line 15
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const v5, 0x7f1309c6

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    new-array v5, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const v5, 0x7f1304f9

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v5, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;->c:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v6, p0, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;->d:Ljava/lang/String;

    .line 42
    .line 43
    move-object v3, v4

    .line 44
    move-object v4, p1

    .line 45
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public static final c(La/bu6;La/au6;)Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;
    .locals 5

    .line 1
    new-instance v0, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz p0, :cond_4

    .line 11
    .line 12
    if-eq p0, v3, :cond_3

    .line 13
    .line 14
    if-eq p0, v2, :cond_2

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    if-eq p0, v4, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    if-ne p0, v4, :cond_0

    .line 21
    .line 22
    sget-object p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;->e:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    sget-object p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;->d:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;->c:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    sget-object p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;->b:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    sget-object p0, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;->f:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 39
    .line 40
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_7

    .line 45
    .line 46
    if-eq p1, v3, :cond_6

    .line 47
    .line 48
    if-ne p1, v2, :cond_5

    .line 49
    .line 50
    sget-object p1, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->d:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_6
    sget-object p1, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->c:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_7
    sget-object p1, Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;->b:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 61
    .line 62
    :goto_1
    invoke-direct {v0, p0, p1}, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;-><init>(Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method
