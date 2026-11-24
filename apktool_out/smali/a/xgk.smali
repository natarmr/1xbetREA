.class public final La/xgk;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uii;


# direct methods
.method public synthetic constructor <init>(La/uii;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xgk;->a:B

    iput-object p1, p0, La/xgk;->b:La/uii;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/xgk;->a:B

    .line 2
    .line 3
    const-wide/16 v1, 0x3e8

    .line 4
    .line 5
    const-string v3, ""

    .line 6
    .line 7
    iget-object p0, p0, La/xgk;->b:La/uii;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/zm30;

    .line 13
    .line 14
    iget-object p0, p0, La/uii;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/uuz;

    .line 17
    .line 18
    new-instance v1, La/vut0;

    .line 19
    .line 20
    const/16 v2, 0x17

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/vut0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    const-wide/16 v4, 0xbb8

    .line 26
    .line 27
    invoke-static {v4, v5, v1}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 32
    .line 33
    instance-of v1, p0, La/g0g0;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    if-nez p0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v3, p0

    .line 44
    :goto_0
    invoke-direct {v0, v3}, La/zm30;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    new-instance v0, La/liv;

    .line 49
    .line 50
    iget-object p0, p0, La/uii;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/xsu;

    .line 53
    .line 54
    new-instance v4, La/sz2;

    .line 55
    .line 56
    const/16 v5, 0xb

    .line 57
    .line 58
    invoke-direct {v4, p0, v5}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2, v4}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 66
    .line 67
    instance-of v1, p0, La/g0g0;

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    move-object p0, v3

    .line 72
    :cond_2
    check-cast p0, Ljava/lang/String;

    .line 73
    .line 74
    if-nez p0, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v3, p0

    .line 78
    :goto_1
    invoke-direct {v0, v3}, La/liv;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    new-instance v0, La/tz2;

    .line 83
    .line 84
    iget-object p0, p0, La/uii;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, La/h03;

    .line 87
    .line 88
    new-instance v4, La/sz2;

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-direct {v4, p0, v5}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2, v4}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 99
    .line 100
    instance-of v1, p0, La/g0g0;

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move-object v3, p0

    .line 106
    :goto_2
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    invoke-direct {v0, v3}, La/tz2;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
