.class public final synthetic La/dk60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i3t0;

.field public final synthetic c:La/xkb0;


# direct methods
.method public synthetic constructor <init>(La/i3t0;La/xkb0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dk60;->a:B

    iput-object p1, p0, La/dk60;->b:La/i3t0;

    iput-object p2, p0, La/dk60;->c:La/xkb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/dk60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/dk60;->c:La/xkb0;

    .line 4
    .line 5
    iget-object p0, p0, La/dk60;->b:La/i3t0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/uh60;

    .line 11
    .line 12
    new-instance v2, La/xu9;

    .line 13
    .line 14
    invoke-interface {v1}, La/xkb0;->a()La/sh60;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v2, v1}, La/xu9;-><init>(La/sh60;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2}, La/uh60;-><init>(La/av9;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    new-instance v0, La/uh60;

    .line 31
    .line 32
    new-instance v2, La/xu9;

    .line 33
    .line 34
    invoke-interface {v1}, La/xkb0;->a()La/sh60;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v2, v1}, La/xu9;-><init>(La/sh60;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v2}, La/uh60;-><init>(La/av9;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
