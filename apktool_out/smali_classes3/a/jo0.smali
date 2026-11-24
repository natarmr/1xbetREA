.class public final La/jo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/qo0;


# direct methods
.method public synthetic constructor <init>(La/qo0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jo0;->i:B

    iput-object p1, p0, La/jo0;->k:La/qo0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jo0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jo0;->k:La/qo0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/jo0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/jo0;-><init>(La/qo0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/jo0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/jo0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/jo0;-><init>(La/qo0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/jo0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/jo0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/jo0;-><init>(La/qo0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/jo0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/jo0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/jo0;-><init>(La/qo0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/jo0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jo0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/jo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jo0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jo0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/jo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/jo0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/jo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/jo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/jo0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/jo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/jo0;->i:B

    .line 2
    .line 3
    sget-object v1, La/qn0;->a:La/qn0;

    .line 4
    .line 5
    iget-object v2, p0, La/jo0;->k:La/qo0;

    .line 6
    .line 7
    iget-object p0, p0, La/jo0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Throwable;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/yk0;->c:La/yk0;

    .line 20
    .line 21
    sget v0, La/qo0;->V:I

    .line 22
    .line 23
    invoke-virtual {v2, p1, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, v2, La/qo0;->u:La/duj;

    .line 27
    .line 28
    new-instance v0, La/g20;

    .line 29
    .line 30
    const/16 v1, 0x16

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/g20;-><init>(B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, La/yk0;->b:La/yk0;

    .line 47
    .line 48
    sget v0, La/qo0;->V:I

    .line 49
    .line 50
    invoke-virtual {v2, p1, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 51
    .line 52
    .line 53
    sget-object p1, La/yk0;->c:La/yk0;

    .line 54
    .line 55
    invoke-virtual {v2, p1, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v2, La/qo0;->u:La/duj;

    .line 59
    .line 60
    new-instance v0, La/g20;

    .line 61
    .line 62
    const/16 v1, 0x15

    .line 63
    .line 64
    invoke-direct {v0, v1}, La/g20;-><init>(B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, La/yk0;->b:La/yk0;

    .line 79
    .line 80
    sget v0, La/qo0;->V:I

    .line 81
    .line 82
    invoke-virtual {v2, p1, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, v2, La/qo0;->u:La/duj;

    .line 86
    .line 87
    new-instance v0, La/g20;

    .line 88
    .line 89
    const/16 v1, 0x14

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/g20;-><init>(B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 101
    .line 102
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object p1, La/yk0;->c:La/yk0;

    .line 106
    .line 107
    sget v0, La/qo0;->V:I

    .line 108
    .line 109
    invoke-virtual {v2, p1, v1}, La/qo0;->X(La/yk0;La/un0;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, v2, La/qo0;->u:La/duj;

    .line 113
    .line 114
    new-instance v0, La/g20;

    .line 115
    .line 116
    const/16 v1, 0x13

    .line 117
    .line 118
    invoke-direct {v0, v1}, La/g20;-><init>(B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
