.class public final synthetic La/cf4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/mm40;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/mm40;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/cf4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cf4;->b:La/l7m0;

    iput-object p2, p0, La/cf4;->c:La/mm40;

    iput p3, p0, La/cf4;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/l7m0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/cf4;->a:B

    iput-object p1, p0, La/cf4;->c:La/mm40;

    iput-object p2, p0, La/cf4;->b:La/l7m0;

    iput p3, p0, La/cf4;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/cf4;->a:B

    .line 2
    .line 3
    iget v1, p0, La/cf4;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/cf4;->b:La/l7m0;

    .line 6
    .line 7
    iget-object p0, p0, La/cf4;->c:La/mm40;

    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    or-int/lit8 p2, v1, 0x1

    .line 20
    .line 21
    invoke-static {p2}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-static {p2, p1, p0, v2}, La/qem0;->i(ILa/fet;La/mm40;La/l7m0;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    or-int/lit8 p2, v1, 0x1

    .line 32
    .line 33
    invoke-static {p2}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p2, p1, p0, v2}, La/idm0;->g(ILa/fet;La/mm40;La/l7m0;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    or-int/lit8 p2, v1, 0x1

    .line 44
    .line 45
    invoke-static {p2}, La/x8x;->L(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-static {p2, p1, p0, v2}, La/j5n0;->r(ILa/fet;La/mm40;La/l7m0;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    or-int/lit8 p2, v1, 0x1

    .line 56
    .line 57
    invoke-static {p2}, La/x8x;->L(I)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p2, p1, p0, v2}, La/j120;->H(ILa/fet;La/mm40;La/l7m0;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_3
    or-int/lit8 p2, v1, 0x1

    .line 68
    .line 69
    invoke-static {p2}, La/x8x;->L(I)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-static {p2, p1, p0, v2}, La/lv00;->l(ILa/fet;La/mm40;La/l7m0;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
