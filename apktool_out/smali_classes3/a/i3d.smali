.class public final La/i3d;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/nyq0;

.field public final synthetic k:La/agk0;


# direct methods
.method public synthetic constructor <init>(La/nyq0;La/agk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/i3d;->i:B

    iput-object p1, p0, La/i3d;->j:La/nyq0;

    iput-object p2, p0, La/i3d;->k:La/agk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/i3d;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/i3d;->k:La/agk0;

    .line 4
    .line 5
    iget-object p0, p0, La/i3d;->j:La/nyq0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/i3d;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/i3d;-><init>(La/nyq0;La/agk0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/i3d;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/i3d;-><init>(La/nyq0;La/agk0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i3d;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/i3d;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i3d;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i3d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/i3d;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/i3d;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/i3d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/i3d;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/i3d;->j:La/nyq0;

    .line 5
    .line 6
    iget-object p0, p0, La/i3d;->k:La/agk0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v2}, La/nyq0;->getState()La/oyq0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget p1, p1, La/oyq0;->a:F

    .line 25
    .line 26
    new-instance v1, Ljava/lang/Float;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Ljava/lang/Float;-><init>(F)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, La/agk0;->l()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->b(FLjava/lang/Float;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, La/nyq0;->getState()La/oyq0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0}, La/agk0;->l()F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput p0, p1, La/oyq0;->a:F

    .line 54
    .line 55
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 59
    .line 60
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-interface {v2}, La/nyq0;->getState()La/oyq0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget p1, p1, La/oyq0;->a:F

    .line 72
    .line 73
    new-instance v1, Ljava/lang/Float;

    .line 74
    .line 75
    invoke-direct {v1, p1}, Ljava/lang/Float;-><init>(F)V

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {p0}, La/agk0;->l()F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->b(FLjava/lang/Float;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-interface {v2}, La/nyq0;->getState()La/oyq0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, La/agk0;->l()F

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    iput p0, p1, La/oyq0;->a:F

    .line 101
    .line 102
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
