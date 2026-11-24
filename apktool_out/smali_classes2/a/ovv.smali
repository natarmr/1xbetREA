.class public final synthetic La/ovv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/uvv;

.field public final synthetic d:F


# direct methods
.method public synthetic constructor <init>(La/mm40;La/uvv;FIB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ovv;->a:B

    iput-object p1, p0, La/ovv;->b:La/mm40;

    iput-object p2, p0, La/ovv;->c:La/uvv;

    iput p3, p0, La/ovv;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ovv;->a:B

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
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, La/x8x;->L(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, La/ovv;->b:La/mm40;

    .line 19
    .line 20
    iget-object v1, p0, La/ovv;->c:La/uvv;

    .line 21
    .line 22
    iget p0, p0, La/ovv;->d:F

    .line 23
    .line 24
    invoke-static {v0, v1, p0, p1, p2}, La/hmw0;->D(La/mm40;La/uvv;FLa/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    const/4 p2, 0x1

    .line 31
    invoke-static {p2}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, La/ovv;->b:La/mm40;

    .line 36
    .line 37
    iget-object v1, p0, La/ovv;->c:La/uvv;

    .line 38
    .line 39
    iget p0, p0, La/ovv;->d:F

    .line 40
    .line 41
    invoke-static {v0, v1, p0, p1, p2}, La/hmw0;->E(La/mm40;La/uvv;FLa/fet;I)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
