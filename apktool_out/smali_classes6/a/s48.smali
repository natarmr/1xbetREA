.class public final synthetic La/s48;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IILa/mm40;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/s48;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/s48;->b:La/mm40;

    iput p1, p0, La/s48;->c:I

    iput p2, p0, La/s48;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;IIIB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/s48;->a:B

    iput-object p1, p0, La/s48;->b:La/mm40;

    iput p2, p0, La/s48;->c:I

    iput p3, p0, La/s48;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/s48;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/s48;->d:I

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
    iget v0, p0, La/s48;->c:I

    .line 22
    .line 23
    iget-object p0, p0, La/s48;->b:La/mm40;

    .line 24
    .line 25
    invoke-static {v0, p2, p1, p0}, La/ucx;->d(IILa/fet;La/mm40;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    const/4 p2, 0x1

    .line 32
    invoke-static {p2}, La/x8x;->L(I)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget-object v0, p0, La/s48;->b:La/mm40;

    .line 37
    .line 38
    iget v1, p0, La/s48;->c:I

    .line 39
    .line 40
    iget p0, p0, La/s48;->d:I

    .line 41
    .line 42
    invoke-static {v0, v1, p0, p1, p2}, La/km10;->j(La/mm40;IILa/fet;I)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    const/4 p2, 0x7

    .line 49
    invoke-static {p2}, La/x8x;->L(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iget-object v0, p0, La/s48;->b:La/mm40;

    .line 54
    .line 55
    iget v1, p0, La/s48;->c:I

    .line 56
    .line 57
    iget p0, p0, La/s48;->d:I

    .line 58
    .line 59
    invoke-static {v0, v1, p0, p1, p2}, La/ibc;->g(La/mm40;IILa/fet;I)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    const/4 p2, 0x1

    .line 66
    invoke-static {p2}, La/x8x;->L(I)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iget-object v0, p0, La/s48;->b:La/mm40;

    .line 71
    .line 72
    iget v1, p0, La/s48;->c:I

    .line 73
    .line 74
    iget p0, p0, La/s48;->d:I

    .line 75
    .line 76
    invoke-static {v0, v1, p0, p1, p2}, La/fre0;->k(La/mm40;IILa/fet;I)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_3
    const/4 p2, 0x1

    .line 83
    invoke-static {p2}, La/x8x;->L(I)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iget-object v0, p0, La/s48;->b:La/mm40;

    .line 88
    .line 89
    iget v1, p0, La/s48;->c:I

    .line 90
    .line 91
    iget p0, p0, La/s48;->d:I

    .line 92
    .line 93
    invoke-static {v0, v1, p0, p1, p2}, La/unh0;->V(La/mm40;IILa/fet;I)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
