.class public final synthetic La/apn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wxn0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/wxn0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/apn0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/apn0;->b:La/wxn0;

    iput-object p2, p0, La/apn0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/wxn0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/apn0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/apn0;->b:La/wxn0;

    iput-object p2, p0, La/apn0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/apn0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/apn0;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object p0, p0, La/apn0;->b:La/wxn0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, v2, p1, p2}, La/ihm0;->a(La/wxn0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v6, p1

    .line 29
    check-cast v6, La/fet;

    .line 30
    .line 31
    check-cast p2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    and-int/lit8 p2, p1, 0x3

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq p2, v0, :cond_0

    .line 41
    .line 42
    move p2, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p2, 0x0

    .line 45
    :goto_0
    and-int/2addr p1, v1

    .line 46
    invoke-virtual {v6, p1, p2}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    sget-object p1, La/qmk;->a:La/zcl;

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    const/16 v12, 0xb

    .line 56
    .line 57
    sget-object v7, La/jm40;->b:La/jm40;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v9, 0x0

    .line 61
    const/high16 v10, 0x41800000    # 16.0f

    .line 62
    .line 63
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, La/wxn0;->j:La/ee;

    .line 68
    .line 69
    move-object p1, v2

    .line 70
    new-instance v2, La/sd;

    .line 71
    .line 72
    iget-object p2, p0, La/wxn0;->m:La/ksn0;

    .line 73
    .line 74
    iget-object v3, p2, La/ksn0;->b:Ljava/lang/String;

    .line 75
    .line 76
    iget-object p2, p2, La/ksn0;->c:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v4, p0, La/wxn0;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct {v2, v3, p2, v4}, La/sd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, La/wxn0;->k:La/rd;

    .line 84
    .line 85
    invoke-virtual {v6, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-nez p0, :cond_1

    .line 94
    .line 95
    sget-object p0, La/ukd;->a:La/cl5;

    .line 96
    .line 97
    if-ne p2, p0, :cond_2

    .line 98
    .line 99
    :cond_1
    new-instance p2, La/opm0;

    .line 100
    .line 101
    const/16 p0, 0x12

    .line 102
    .line 103
    invoke-direct {p2, p1, p0}, La/opm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    move-object v5, p2

    .line 110
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 111
    .line 112
    const/16 v7, 0xc00

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v3, 0x0

    .line 116
    invoke-static/range {v0 .. v8}, La/jcb;->f(La/mm40;La/ee;La/sd;ZLa/rd;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {v6}, La/fet;->X()V

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
