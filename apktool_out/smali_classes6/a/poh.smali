.class public final synthetic La/poh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:B


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/poh;->a:B

    iput-object p1, p0, La/poh;->b:La/mm40;

    iput-object p2, p0, La/poh;->c:Ljava/lang/String;

    iput-byte p3, p0, La/poh;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;IIB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/poh;->a:B

    iput-object p1, p0, La/poh;->b:La/mm40;

    iput-object p2, p0, La/poh;->c:Ljava/lang/String;

    iput-byte p3, p0, La/poh;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/poh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-byte v3, p0, La/poh;->d:B

    .line 6
    .line 7
    iget-object v4, p0, La/poh;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, La/poh;->b:La/mm40;

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
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    or-int/lit8 p2, v3, 0x1

    .line 22
    .line 23
    invoke-static {p2}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p2, p1, p0, v4}, La/eal0;->a(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    or-int/lit8 p2, v3, 0x1

    .line 34
    .line 35
    invoke-static {p2}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p2, p1, p0, v4}, La/r7x;->c(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    invoke-static {v1}, La/x8x;->L(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-static {v3, p2, p1, p0, v4}, La/dub;->R(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    invoke-static {v1}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-static {v3, p2, p1, p0, v4}, La/f7k;->v(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_3
    invoke-static {v2}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-static {v3, p2, p1, p0, v4}, La/u1c;->r(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
