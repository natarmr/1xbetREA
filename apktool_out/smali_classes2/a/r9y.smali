.class public final La/r9y;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/j9y;


# direct methods
.method public synthetic constructor <init>(La/j9y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r9y;->a:B

    iput-object p1, p0, La/r9y;->b:La/j9y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r9y;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/r9y;->b:La/j9y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, La/uvw;->q(La/q9y;Z)La/sv9;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance v0, La/zwj;

    .line 15
    .line 16
    iget-object p0, p0, La/j9y;->e:La/k9y;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/zwj;-><init>(La/ire0;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
