.class public final synthetic La/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(ILa/ugd;I)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    iput-byte p3, p0, La/b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/b0;->c:I

    iput-object p2, p0, La/b0;->b:La/ugd;

    return-void
.end method

.method public synthetic constructor <init>(La/ugd;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b0;->b:La/ugd;

    iput p2, p0, La/b0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/b0;->c:I

    .line 4
    .line 5
    iget-object p0, p0, La/b0;->b:La/ugd;

    .line 6
    .line 7
    check-cast p1, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    or-int/lit8 p2, v1, 0x1

    .line 18
    .line 19
    invoke-static {p2}, La/x8x;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p0, p1, p2}, La/xf0;->y(La/ugd;La/fet;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    or-int/lit8 p2, v1, 0x1

    .line 30
    .line 31
    invoke-static {p2}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p0, p1, p2}, La/rcb;->i(La/ugd;La/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_1
    or-int/lit8 p2, v1, 0x1

    .line 42
    .line 43
    invoke-static {p2}, La/x8x;->L(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p0, p1, p2}, La/saj;->L(La/ugd;La/fet;I)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_2
    const/16 p2, 0x31

    .line 54
    .line 55
    invoke-static {p2}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-static {v1, p0, p1, p2}, La/ay3;->u(ILa/ugd;La/fet;I)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
