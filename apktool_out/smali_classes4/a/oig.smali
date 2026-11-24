.class public final La/oig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pkk0;


# direct methods
.method public synthetic constructor <init>(La/pkk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oig;->a:B

    iput-object p1, p0, La/oig;->b:La/pkk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p2, p0, La/oig;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/oig;->b:La/pkk0;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    check-cast p0, La/r3k;

    .line 19
    .line 20
    invoke-virtual {p0}, La/r3k;->a()V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    check-cast p0, La/r3k;

    .line 37
    .line 38
    invoke-virtual {p0}, La/r3k;->a()V

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p1, La/nlx;

    .line 45
    .line 46
    instance-of p1, p1, La/nel;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    check-cast p0, La/r3k;

    .line 53
    .line 54
    invoke-virtual {p0}, La/r3k;->a()V

    .line 55
    .line 56
    .line 57
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    check-cast p0, La/r3k;

    .line 71
    .line 72
    invoke-virtual {p0}, La/r3k;->a()V

    .line 73
    .line 74
    .line 75
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    check-cast p0, La/r3k;

    .line 89
    .line 90
    invoke-virtual {p0}, La/r3k;->a()V

    .line 91
    .line 92
    .line 93
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    check-cast p0, La/r3k;

    .line 107
    .line 108
    invoke-virtual {p0}, La/r3k;->a()V

    .line 109
    .line 110
    .line 111
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
