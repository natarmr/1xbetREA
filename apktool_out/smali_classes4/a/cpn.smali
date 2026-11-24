.class public final synthetic La/cpn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/ton;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/ton;ZIB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/cpn;->a:B

    iput-object p1, p0, La/cpn;->b:La/mm40;

    iput-object p2, p0, La/cpn;->c:La/ton;

    iput-boolean p3, p0, La/cpn;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/cpn;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/cpn;->d:Z

    .line 4
    .line 5
    iget-object v2, p0, La/cpn;->c:La/ton;

    .line 6
    .line 7
    iget-object p0, p0, La/cpn;->b:La/mm40;

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
    const/4 p2, 0x1

    .line 20
    invoke-static {p2}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, v2, v1, p1, p2}, La/efx;->c(La/mm40;La/ton;ZLa/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    const/4 p2, 0x7

    .line 31
    invoke-static {p2}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p0, v2, v1, p1, p2}, La/vfc;->A(La/mm40;La/ton;ZLa/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
