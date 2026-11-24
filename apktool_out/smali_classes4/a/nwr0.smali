.class public final synthetic La/nwr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wyg;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/wyg;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nwr0;->a:B

    iput-object p1, p0, La/nwr0;->b:La/wyg;

    iput-object p2, p0, La/nwr0;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nwr0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/nwr0;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/nwr0;->b:La/wyg;

    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La/p6t0;

    .line 20
    .line 21
    invoke-interface {p0, p1}, La/wyg;->e(La/p6t0;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/p6t0;

    .line 35
    .line 36
    invoke-interface {p0, p1}, La/wyg;->e(La/p6t0;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
