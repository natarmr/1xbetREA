.class public final synthetic La/ku40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ju40;


# direct methods
.method public synthetic constructor <init>(La/ju40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ku40;->a:B

    iput-object p1, p0, La/ku40;->b:La/ju40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/ku40;->a:B

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, La/ku40;->b:La/ju40;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    check-cast p2, La/fet;

    .line 12
    .line 13
    check-cast p3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    and-int/lit8 v0, p3, 0x6

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    and-int/lit8 v0, p3, 0x8

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :goto_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_1
    or-int/2addr p3, v2

    .line 43
    :cond_2
    and-int/lit8 v0, p3, 0x13

    .line 44
    .line 45
    if-eq v0, v1, :cond_3

    .line 46
    .line 47
    move v0, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    move v0, v5

    .line 50
    :goto_1
    and-int/2addr p3, v4

    .line 51
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_4

    .line 56
    .line 57
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {p2, p0, p3, p1, v5}, La/fet;->F(La/ju40;La/bh90;Ljava/lang/Object;Z)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 66
    .line 67
    .line 68
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    and-int/lit8 v0, p3, 0x6

    .line 72
    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    and-int/lit8 v0, p3, 0x8

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    :goto_3
    if-eqz v0, :cond_6

    .line 89
    .line 90
    move v2, v3

    .line 91
    :cond_6
    or-int/2addr p3, v2

    .line 92
    :cond_7
    and-int/lit8 v0, p3, 0x13

    .line 93
    .line 94
    if-eq v0, v1, :cond_8

    .line 95
    .line 96
    move v0, v4

    .line 97
    goto :goto_4

    .line 98
    :cond_8
    move v0, v5

    .line 99
    :goto_4
    and-int/2addr p3, v4

    .line 100
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-eqz p3, :cond_9

    .line 105
    .line 106
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-virtual {p2, p0, p3, p1, v5}, La/fet;->F(La/ju40;La/bh90;Ljava/lang/Object;Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_9
    invoke-virtual {p2}, La/fet;->X()V

    .line 115
    .line 116
    .line 117
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
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
