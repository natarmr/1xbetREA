.class public final synthetic La/vfw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pa00;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/pa00;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vfw;->a:B

    iput-object p1, p0, La/vfw;->b:La/pa00;

    iput-object p2, p0, La/vfw;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/vfw;->a:B

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
    iget-object v6, p0, La/vfw;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object p0, p0, La/vfw;->b:La/pa00;

    .line 14
    .line 15
    check-cast p1, La/rk80;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    check-cast p3, La/fet;

    .line 24
    .line 25
    check-cast p4, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 p1, p4, 0x30

    .line 35
    .line 36
    packed-switch v0, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    move v2, v3

    .line 48
    :cond_0
    or-int/2addr p4, v2

    .line 49
    :cond_1
    and-int/lit16 p1, p4, 0x91

    .line 50
    .line 51
    if-eq p1, v1, :cond_2

    .line 52
    .line 53
    move p1, v4

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move p1, v5

    .line 56
    :goto_0
    and-int/2addr p4, v4

    .line 57
    invoke-virtual {p3, p4, p1}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p0, p0, La/pa00;->c:La/a4x;

    .line 64
    .line 65
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, La/p6m0;

    .line 70
    .line 71
    iget-object p0, p0, La/p6m0;->b:La/a4x;

    .line 72
    .line 73
    invoke-static {p0, v6, p3, v5}, La/kcx;->f(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {p3}, La/fet;->X()V

    .line 78
    .line 79
    .line 80
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_0
    if-nez p1, :cond_5

    .line 84
    .line 85
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    move v2, v3

    .line 92
    :cond_4
    or-int/2addr p4, v2

    .line 93
    :cond_5
    and-int/lit16 p1, p4, 0x91

    .line 94
    .line 95
    if-eq p1, v1, :cond_6

    .line 96
    .line 97
    move v5, v4

    .line 98
    :cond_6
    and-int/lit8 p1, p4, 0x1

    .line 99
    .line 100
    invoke-virtual {p3, p1, v5}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_7

    .line 105
    .line 106
    sget-object p1, La/bmd;->n:La/zfn;

    .line 107
    .line 108
    sget-object p4, La/k6z;->a:La/k6z;

    .line 109
    .line 110
    invoke-virtual {p1, p4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance p4, La/n0n;

    .line 115
    .line 116
    invoke-direct {p4, p0, p2, v6}, La/n0n;-><init>(La/pa00;ILkotlin/jvm/functions/Function1;)V

    .line 117
    .line 118
    .line 119
    const p0, 0x55555940

    .line 120
    .line 121
    .line 122
    invoke-static {p0, p4, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    const/16 p2, 0x38

    .line 127
    .line 128
    invoke-static {p1, p0, p3, p2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    invoke-virtual {p3}, La/fet;->X()V

    .line 133
    .line 134
    .line 135
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
