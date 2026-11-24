.class public final synthetic La/yb5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ob50;


# direct methods
.method public synthetic constructor <init>(La/ob50;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yb5;->a:B

    iput-object p1, p0, La/yb5;->b:La/ob50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/yb5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/yb5;->b:La/ob50;

    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    move v0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v3

    .line 26
    :goto_0
    and-int/2addr p2, v2

    .line 27
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v3, p1}, La/ob50;->a(ILa/fet;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 38
    .line 39
    .line 40
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 44
    .line 45
    if-eq v0, v1, :cond_2

    .line 46
    .line 47
    move v0, v2

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v0, v3

    .line 50
    :goto_2
    and-int/2addr p2, v2

    .line 51
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0, v3, p1}, La/ob50;->a(ILa/fet;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 62
    .line 63
    .line 64
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 68
    .line 69
    if-eq v0, v1, :cond_4

    .line 70
    .line 71
    move v0, v2

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move v0, v3

    .line 74
    :goto_4
    and-int/2addr p2, v2

    .line 75
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0, v3, p1}, La/ob50;->a(ILa/fet;)V

    .line 82
    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 86
    .line 87
    .line 88
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_2
    and-int/lit8 v0, p2, 0x3

    .line 92
    .line 93
    if-eq v0, v1, :cond_6

    .line 94
    .line 95
    move v0, v2

    .line 96
    goto :goto_6

    .line 97
    :cond_6
    move v0, v3

    .line 98
    :goto_6
    and-int/2addr p2, v2

    .line 99
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_7

    .line 104
    .line 105
    invoke-virtual {p0, v3, p1}, La/ob50;->a(ILa/fet;)V

    .line 106
    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 110
    .line 111
    .line 112
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
