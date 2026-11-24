.class public final synthetic La/omc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wmc0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/wmc0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/omc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/omc0;->b:La/wmc0;

    iput-object p2, p0, La/omc0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/wmc0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/omc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/omc0;->b:La/wmc0;

    iput-object p2, p0, La/omc0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/omc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/omc0;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object p0, p0, La/omc0;->b:La/wmc0;

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
    invoke-static {p0, v2, p1, p2}, La/i4w0;->o(La/wmc0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v9, p1

    .line 29
    check-cast v9, La/fet;

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
    invoke-virtual {v9, p1, p2}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 53
    .line 54
    invoke-static {p1}, La/o050;->W(La/mm40;)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "PROMO_LIST_WITH_GAMES_LAZY_COLUMN"

    .line 59
    .line 60
    invoke-static {p1, p2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object p1, La/qmk;->a:La/zcl;

    .line 65
    .line 66
    const/high16 p1, 0x41c00000    # 24.0f

    .line 67
    .line 68
    const/4 p2, 0x7

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {v1, v1, v1, p1, p2}, La/s5x0;->u(FFFFI)La/lh80;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1, v9}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v9, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    or-int/2addr p2, v1

    .line 87
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-nez p2, :cond_1

    .line 92
    .line 93
    sget-object p2, La/ukd;->a:La/cl5;

    .line 94
    .line 95
    if-ne v1, p2, :cond_2

    .line 96
    .line 97
    :cond_1
    new-instance v1, La/oac0;

    .line 98
    .line 99
    const/4 p2, 0x6

    .line 100
    invoke-direct {v1, p0, v2, p2}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    move-object v8, v1

    .line 107
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/16 v11, 0x1fa

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    const/4 v3, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    move-object v2, p1

    .line 119
    invoke-static/range {v0 .. v11}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
