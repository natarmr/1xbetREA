.class public final synthetic La/gc30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/fqj0;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/fqj0;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gc30;->a:B

    iput-object p1, p0, La/gc30;->b:La/mm40;

    iput-object p2, p0, La/gc30;->c:La/fqj0;

    iput p3, p0, La/gc30;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gc30;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/gc30;->d:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, La/gc30;->b:La/mm40;

    .line 22
    .line 23
    iget-object p0, p0, La/gc30;->c:La/fqj0;

    .line 24
    .line 25
    invoke-static {v0, p0, p1, p2}, La/a8k0;->i(La/mm40;La/fqj0;La/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p2, p0, La/gc30;->d:I

    .line 35
    .line 36
    or-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    invoke-static {p2}, La/x8x;->L(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget-object v0, p0, La/gc30;->b:La/mm40;

    .line 43
    .line 44
    iget-object p0, p0, La/gc30;->c:La/fqj0;

    .line 45
    .line 46
    invoke-static {v0, p0, p1, p2}, La/r7x;->h(La/mm40;La/fqj0;La/fet;I)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    iget p2, p0, La/gc30;->d:I

    .line 56
    .line 57
    or-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    invoke-static {p2}, La/x8x;->L(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iget-object v0, p0, La/gc30;->b:La/mm40;

    .line 64
    .line 65
    iget-object p0, p0, La/gc30;->c:La/fqj0;

    .line 66
    .line 67
    invoke-static {v0, p0, p1, p2}, La/pzw;->s(La/mm40;La/fqj0;La/fet;I)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    iget p2, p0, La/gc30;->d:I

    .line 77
    .line 78
    or-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    invoke-static {p2}, La/x8x;->L(I)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iget-object v0, p0, La/gc30;->b:La/mm40;

    .line 85
    .line 86
    iget-object p0, p0, La/gc30;->c:La/fqj0;

    .line 87
    .line 88
    invoke-static {v0, p0, p1, p2}, La/pzw;->a(La/mm40;La/fqj0;La/fet;I)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    iget p2, p0, La/gc30;->d:I

    .line 98
    .line 99
    or-int/lit8 p2, p2, 0x1

    .line 100
    .line 101
    invoke-static {p2}, La/x8x;->L(I)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget-object v0, p0, La/gc30;->b:La/mm40;

    .line 106
    .line 107
    iget-object p0, p0, La/gc30;->c:La/fqj0;

    .line 108
    .line 109
    invoke-static {v0, p0, p1, p2}, La/yyw;->b(La/mm40;La/fqj0;La/fet;I)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
