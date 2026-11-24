.class public final synthetic La/oka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vka;


# direct methods
.method public synthetic constructor <init>(La/vka;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oka;->a:B

    iput-object p1, p0, La/oka;->b:La/vka;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/oka;->a:B

    .line 2
    .line 3
    const/16 v1, 0x90

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object p0, p0, La/oka;->b:La/vka;

    .line 12
    .line 13
    check-cast p1, La/y5d;

    .line 14
    .line 15
    check-cast p2, La/mm40;

    .line 16
    .line 17
    check-cast p3, La/fet;

    .line 18
    .line 19
    check-cast p4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    and-int/lit8 p4, p1, 0x30

    .line 29
    .line 30
    if-nez p4, :cond_1

    .line 31
    .line 32
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    :cond_0
    or-int/2addr p1, v2

    .line 40
    :cond_1
    and-int/lit16 p4, p1, 0x91

    .line 41
    .line 42
    if-eq p4, v1, :cond_2

    .line 43
    .line 44
    move v5, v4

    .line 45
    :cond_2
    and-int/2addr p1, v4

    .line 46
    invoke-virtual {p3, p1, v5}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object p0, p0, La/vka;->h:La/ao8;

    .line 53
    .line 54
    invoke-static {p2, p0, p3}, La/unh0;->i(La/mm40;La/ao8;La/fet;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {p3}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    and-int/lit8 p4, p1, 0x30

    .line 65
    .line 66
    if-nez p4, :cond_5

    .line 67
    .line 68
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    if-eqz p4, :cond_4

    .line 73
    .line 74
    move v2, v3

    .line 75
    :cond_4
    or-int/2addr p1, v2

    .line 76
    :cond_5
    and-int/lit16 p4, p1, 0x91

    .line 77
    .line 78
    if-eq p4, v1, :cond_6

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_6
    move v4, v5

    .line 82
    :goto_1
    and-int/lit8 p4, p1, 0x1

    .line 83
    .line 84
    invoke-virtual {p3, p4, v4}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    if-eqz p4, :cond_7

    .line 89
    .line 90
    iget-object p0, p0, La/vka;->a:La/j83;

    .line 91
    .line 92
    shr-int/lit8 p1, p1, 0x3

    .line 93
    .line 94
    and-int/lit8 p1, p1, 0xe

    .line 95
    .line 96
    invoke-static {p2, p0, p3, p1}, La/knx;->m(La/mm40;La/j83;La/fet;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    invoke-virtual {p3}, La/fet;->X()V

    .line 101
    .line 102
    .line 103
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
