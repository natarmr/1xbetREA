.class public final La/y1c0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/b2c0;


# direct methods
.method public constructor <init>(La/b2c0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/y1c0;->j:La/b2c0;

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
    new-instance p1, La/y1c0;

    .line 2
    .line 3
    iget-object p0, p0, La/y1c0;->j:La/b2c0;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/y1c0;-><init>(La/b2c0;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/y1c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/y1c0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/y1c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v1, p0, La/y1c0;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/y1c0;->j:La/b2c0;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v5, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v4, La/b2c0;->v:La/w4p0;

    .line 28
    .line 29
    new-instance v1, La/mq90;

    .line 30
    .line 31
    invoke-virtual {v4, v5}, La/b2c0;->O(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-direct {v1, v5, v6}, La/mq90;-><init>(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, La/mq90;

    .line 39
    .line 40
    invoke-virtual {v4, v3}, La/b2c0;->O(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-direct {v6, v3, v7}, La/mq90;-><init>(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    filled-new-array {v1, v6}, [La/mq90;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-boolean v5, p0, La/y1c0;->i:Z

    .line 56
    .line 57
    iget-object p0, p1, La/w4p0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/dq00;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, La/dq00;->k(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    if-ne p0, v0, :cond_2

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    :goto_0
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/p1c0;

    .line 74
    .line 75
    iget-object p0, p0, La/p1c0;->b:Ljava/util/Map;

    .line 76
    .line 77
    sget-object p1, Lorg/xplatform/personal/impl/presentation/edit_tj/models/EditProfileTjItemEnum;->k:Lorg/xplatform/personal/impl/presentation/edit_tj/models/EditProfileTjItemEnum;

    .line 78
    .line 79
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    instance-of p1, p0, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    move-object v2, p0

    .line 88
    check-cast v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;

    .line 89
    .line 90
    :cond_3
    if-eqz v2, :cond_4

    .line 91
    .line 92
    iget v3, v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->c:I

    .line 93
    .line 94
    :cond_4
    new-instance p0, La/i1c0;

    .line 95
    .line 96
    invoke-direct {p0, v3}, La/i1c0;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0
.end method
