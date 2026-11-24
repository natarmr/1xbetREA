.class public final La/g9y;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ihy;


# direct methods
.method public synthetic constructor <init>(La/ihy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g9y;->a:B

    iput-object p1, p0, La/g9y;->b:La/ihy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g9y;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/g9y;->b:La/ihy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p0, La/xgy;

    .line 12
    .line 13
    invoke-static {p0}, La/n2x;->v(La/sgy;)La/v2;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    invoke-interface {p0}, La/elc;->j()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/xm40;->a(Ljava/lang/Class;)La/pog0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p0, La/xgy;

    .line 31
    .line 32
    invoke-static {p0}, La/n2x;->v(La/sgy;)La/v2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
