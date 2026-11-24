.class public final synthetic La/iqh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/a4x;

.field public final synthetic d:B


# direct methods
.method public synthetic constructor <init>(ILa/a4x;La/mm40;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/iqh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/iqh;->b:La/mm40;

    iput-object p2, p0, La/iqh;->c:La/a4x;

    iput-byte p1, p0, La/iqh;->d:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;IIB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/iqh;->a:B

    iput-object p1, p0, La/iqh;->b:La/mm40;

    iput-object p2, p0, La/iqh;->c:La/a4x;

    iput-byte p3, p0, La/iqh;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/iqh;->a:B

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
    iget-byte p2, p0, La/iqh;->d:B

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
    iget-object v0, p0, La/iqh;->c:La/a4x;

    .line 22
    .line 23
    iget-object p0, p0, La/iqh;->b:La/mm40;

    .line 24
    .line 25
    invoke-static {p2, p1, v0, p0}, La/v2n0;->h(ILa/fet;La/a4x;La/mm40;)V

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
    iget-byte v0, p0, La/iqh;->d:B

    .line 37
    .line 38
    iget-object v1, p0, La/iqh;->c:La/a4x;

    .line 39
    .line 40
    iget-object p0, p0, La/iqh;->b:La/mm40;

    .line 41
    .line 42
    invoke-static {v0, p2, p1, v1, p0}, La/v3c;->y(IILa/fet;La/a4x;La/mm40;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    const/4 p2, 0x1

    .line 49
    invoke-static {p2}, La/x8x;->L(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iget-byte v0, p0, La/iqh;->d:B

    .line 54
    .line 55
    iget-object v1, p0, La/iqh;->c:La/a4x;

    .line 56
    .line 57
    iget-object p0, p0, La/iqh;->b:La/mm40;

    .line 58
    .line 59
    invoke-static {v0, p2, p1, v1, p0}, La/obb;->h(IILa/fet;La/a4x;La/mm40;)V

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
