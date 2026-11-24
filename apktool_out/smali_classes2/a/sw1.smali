.class public final synthetic La/sw1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m0x;


# direct methods
.method public synthetic constructor <init>(La/m0x;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/sw1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sw1;->b:La/m0x;

    return-void
.end method

.method public synthetic constructor <init>(La/m0x;I)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput-byte p2, p0, La/sw1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sw1;->b:La/m0x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/sw1;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/sw1;->b:La/m0x;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v7, p1

    .line 10
    check-cast v7, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    and-int/lit8 p2, p1, 0x3

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    const/4 v10, 0x0

    .line 22
    if-eq p2, v0, :cond_0

    .line 23
    .line 24
    move p2, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p2, v10

    .line 27
    :goto_0
    and-int/2addr p1, v1

    .line 28
    invoke-virtual {v7, p1, p2}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const p1, 0x7f08080a

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v10, v7}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 38
    .line 39
    .line 40
    const p1, 0x6dfcc4f8

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7, p1}, La/fet;->e0(I)V

    .line 44
    .line 45
    .line 46
    sget-object p1, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    sget-object p1, La/jm40;->b:La/jm40;

    .line 49
    .line 50
    const/high16 p2, 0x41c00000    # 24.0f

    .line 51
    .line 52
    invoke-static {p1, p2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget p0, p0, La/m0x;->a:I

    .line 57
    .line 58
    invoke-static {p0, v10, v7}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    sget-object p0, La/zaq0;->b:La/zfn;

    .line 63
    .line 64
    invoke-virtual {v7, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 69
    .line 70
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    const/16 v8, 0x38

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-static/range {v2 .. v9}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v7}, La/fet;->X()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_0
    check-cast p1, La/fet;

    .line 92
    .line 93
    check-cast p2, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, La/x8x;->L(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-static {p0, p1, p2}, La/lv00;->h(La/m0x;La/fet;I)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
