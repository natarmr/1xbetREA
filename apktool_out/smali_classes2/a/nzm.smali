.class public final synthetic La/nzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/uzm;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/uzm;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/nzm;->a:B

    packed-switch p4, :pswitch_data_0

    :pswitch_0
    sget-object p4, La/uso0;->a:La/uso0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nzm;->b:La/mm40;

    iput-object p2, p0, La/nzm;->c:La/uzm;

    iput p3, p0, La/nzm;->d:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/nzm;->a:B

    .line 2
    .line 3
    iget v1, p0, La/nzm;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/nzm;->c:La/uzm;

    .line 6
    .line 7
    iget-object p0, p0, La/nzm;->b:La/mm40;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/uso0;->a:La/uso0;

    .line 13
    .line 14
    check-cast p1, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p2, v1, 0x1

    .line 22
    .line 23
    invoke-static {p2}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p0, v2, p1, p2}, La/jiq0;->X(La/mm40;La/uzm;La/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    sget-object v0, La/uso0;->a:La/uso0;

    .line 34
    .line 35
    check-cast p1, La/fet;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    or-int/lit8 p2, v1, 0x1

    .line 43
    .line 44
    invoke-static {p2}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-static {p0, v2, p1, p2}, La/jiq0;->B(La/mm40;La/uzm;La/fet;I)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
