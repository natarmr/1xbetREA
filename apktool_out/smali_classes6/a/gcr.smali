.class public final synthetic La/gcr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ss10;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/ss10;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gcr;->a:B

    iput-object p1, p0, La/gcr;->b:La/ss10;

    iput-object p2, p0, La/gcr;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/gcr;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/gcr;->b:La/ss10;

    .line 8
    .line 9
    check-cast p1, La/ir8;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v9, p2

    .line 15
    check-cast v9, La/fet;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    and-int/lit8 p1, p2, 0x11

    .line 27
    .line 28
    if-eq p1, v2, :cond_0

    .line 29
    .line 30
    move v1, v3

    .line 31
    :cond_0
    and-int/lit8 p1, p2, 0x1

    .line 32
    .line 33
    invoke-virtual {v9, p1, v1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    new-instance v6, La/nxe;

    .line 40
    .line 41
    check-cast v4, La/rs10;

    .line 42
    .line 43
    iget-object p1, v4, La/rs10;->a:La/os10;

    .line 44
    .line 45
    iget-object p1, p1, La/os10;->a:La/j43;

    .line 46
    .line 47
    invoke-direct {v6, p1}, La/nxe;-><init>(La/j43;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v4, La/rs10;->b:La/qs10;

    .line 51
    .line 52
    iget-object v7, p1, La/qs10;->b:La/bye;

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    iget-object v8, p0, La/gcr;->c:Lkotlin/jvm/functions/Function0;

    .line 57
    .line 58
    invoke-static/range {v5 .. v10}, La/acb;->E(La/mm40;La/nxe;La/bye;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v9}, La/fet;->X()V

    .line 63
    .line 64
    .line 65
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    check-cast p2, La/fet;

    .line 69
    .line 70
    check-cast p3, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    and-int/lit8 p1, p3, 0x11

    .line 80
    .line 81
    if-eq p1, v2, :cond_2

    .line 82
    .line 83
    move p1, v3

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move p1, v1

    .line 86
    :goto_1
    and-int/2addr p3, v3

    .line 87
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    const p1, 0x7f131478

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v1, p2}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast v4, La/qs10;

    .line 101
    .line 102
    iget-object p3, v4, La/qs10;->b:La/bye;

    .line 103
    .line 104
    iget-object p0, p0, La/gcr;->c:Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    invoke-static {p1, p3, p0, p2, v1}, La/acb;->F(Ljava/lang/String;La/bye;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 111
    .line 112
    .line 113
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
