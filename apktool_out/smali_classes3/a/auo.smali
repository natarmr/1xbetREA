.class public final synthetic La/auo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wul;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/wul;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/auo;->a:B

    iput-object p1, p0, La/auo;->b:La/wul;

    iput-object p2, p0, La/auo;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/wul;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    iput-byte p3, p0, La/auo;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/auo;->b:La/wul;

    iput-object p2, p0, La/auo;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/auo;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v5}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object v0, p0, La/auo;->b:La/wul;

    .line 25
    .line 26
    iget-object p0, p0, La/auo;->c:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    invoke-static {v0, p0, p1, p2}, La/km10;->d(La/wul;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    and-int/lit8 v0, p2, 0x3

    .line 39
    .line 40
    if-eq v0, v4, :cond_0

    .line 41
    .line 42
    move v3, v5

    .line 43
    :cond_0
    and-int/2addr p2, v5

    .line 44
    invoke-virtual {p1, p2, v3}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const/4 v4, 0x6

    .line 55
    const/4 v5, 0x0

    .line 56
    iget-object v1, p0, La/auo;->b:La/wul;

    .line 57
    .line 58
    iget-object v2, p0, La/auo;->c:Lkotlin/jvm/functions/Function0;

    .line 59
    .line 60
    move-object v3, p1

    .line 61
    invoke-static/range {v0 .. v5}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object v3, p1

    .line 66
    invoke-virtual {v3}, La/fet;->X()V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    and-int/lit8 v0, p2, 0x3

    .line 77
    .line 78
    if-eq v0, v4, :cond_2

    .line 79
    .line 80
    move v3, v5

    .line 81
    :cond_2
    and-int/2addr p2, v5

    .line 82
    invoke-virtual {p1, p2, v3}, La/fet;->U(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_3

    .line 87
    .line 88
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const/4 v4, 0x6

    .line 93
    const/4 v5, 0x0

    .line 94
    iget-object v1, p0, La/auo;->b:La/wul;

    .line 95
    .line 96
    iget-object v2, p0, La/auo;->c:Lkotlin/jvm/functions/Function0;

    .line 97
    .line 98
    move-object v3, p1

    .line 99
    invoke-static/range {v0 .. v5}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    move-object v3, p1

    .line 104
    invoke-virtual {v3}, La/fet;->X()V

    .line 105
    .line 106
    .line 107
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
