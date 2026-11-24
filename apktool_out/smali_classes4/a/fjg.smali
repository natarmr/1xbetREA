.class public final synthetic La/fjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/aig;


# direct methods
.method public synthetic constructor <init>(La/aig;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fjg;->a:B

    iput-object p1, p0, La/fjg;->b:La/aig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fjg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/fjg;->b:La/aig;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/jhg;->a:La/jhg;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/aig;->M(La/shg;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object v0, La/ihg;->a:La/ihg;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/aig;->M(La/shg;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
