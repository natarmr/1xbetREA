.class public final La/xc60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xc60;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/xc60;->i:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    check-cast p1, La/j0g0;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, La/j0g0;

    .line 12
    .line 13
    iget-object p1, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, La/yje;

    .line 16
    .line 17
    new-instance p2, La/xc60;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p2, v0, p3, v1}, La/xc60;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p0, p2, La/xc60;->j:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p1, p2, La/xc60;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p2, p0}, La/xc60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, La/j0g0;

    .line 37
    .line 38
    iget-object p1, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p3, La/yje;

    .line 41
    .line 42
    new-instance p2, La/xc60;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {p2, v0, p3, v1}, La/xc60;-><init>(ILa/yje;B)V

    .line 46
    .line 47
    .line 48
    iput-object p0, p2, La/xc60;->j:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object p1, p2, La/xc60;->k:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    invoke-virtual {p2, p0}, La/xc60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/xc60;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/xc60;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, La/xc60;->k:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, La/iun;->a:La/iun;

    .line 16
    .line 17
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 18
    .line 19
    instance-of v1, v0, La/g0g0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v1, p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v0

    .line 26
    :goto_0
    check-cast v1, Ljava/util/Collection;

    .line 27
    .line 28
    instance-of v2, p0, La/g0g0;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object p1, p0

    .line 34
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 35
    .line 36
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    :goto_2
    return-object p1

    .line 60
    :cond_3
    throw p0

    .line 61
    :pswitch_0
    iget-object v0, p0, La/xc60;->j:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object p0, p0, La/xc60;->k:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object v1, La/wne;->a:La/wne;

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 71
    .line 72
    instance-of p1, p0, La/g0g0;

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    instance-of v1, v0, La/g0g0;

    .line 77
    .line 78
    if-eqz v1, :cond_5

    .line 79
    .line 80
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    if-nez p0, :cond_4

    .line 85
    .line 86
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-nez p0, :cond_4

    .line 91
    .line 92
    new-instance p0, La/c44;

    .line 93
    .line 94
    const/16 p1, 0xb

    .line 95
    .line 96
    invoke-direct {p0, p1}, La/c44;-><init>(B)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_4
    throw p0

    .line 101
    :cond_5
    sget-object v1, La/iun;->a:La/iun;

    .line 102
    .line 103
    instance-of v2, v0, La/g0g0;

    .line 104
    .line 105
    if-eqz v2, :cond_6

    .line 106
    .line 107
    move-object v0, v1

    .line 108
    :cond_6
    check-cast v0, Ljava/util/Collection;

    .line 109
    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    move-object p0, v1

    .line 113
    :cond_7
    check-cast p0, Ljava/lang/Iterable;

    .line 114
    .line 115
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
