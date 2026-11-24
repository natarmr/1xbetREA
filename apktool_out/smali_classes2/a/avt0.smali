.class public final La/avt0;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vkr0;


# direct methods
.method public synthetic constructor <init>(La/vkr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/avt0;->a:B

    iput-object p1, p0, La/avt0;->b:La/vkr0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/avt0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/avt0;->b:La/vkr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/kvq0;

    .line 9
    .line 10
    new-instance v2, La/eio;

    .line 11
    .line 12
    iget-object p0, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/wut0;

    .line 15
    .line 16
    iget-object v0, p0, La/wut0;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-direct {v2, v0}, La/eio;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iget v0, p0, La/wut0;->s:I

    .line 22
    .line 23
    int-to-long v3, v0

    .line 24
    iget p0, p0, La/wut0;->r:I

    .line 25
    .line 26
    int-to-long v5, p0

    .line 27
    invoke-direct/range {v1 .. v6}, La/kvq0;-><init>(La/eio;JJ)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    new-instance v0, La/kf60;

    .line 32
    .line 33
    new-instance v1, La/jw20;

    .line 34
    .line 35
    iget-object p0, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, La/wut0;

    .line 38
    .line 39
    invoke-direct {v1, p0}, La/jw20;-><init>(La/wut0;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1}, La/kf60;-><init>(La/jw20;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
